package com.example;

import com.example.antlr.JsonLexer;
import com.example.antlr.JsonParser;
import org.antlr.v4.runtime.*;

import java.util.HashMap;

public class JsonDecoder {
    public HashMap<String, Object> decode(String json) {
        JsonLexer lexer = new JsonLexer(new ANTLRInputStream(json));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JsonParser parser = new JsonParser(tokens);

        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
            }
        });

        return decodeJsonFormat(parser.json());
    }

    private HashMap<String, Object> decodeJsonFormat(JsonParser.JsonContext ctx) {
        if (ctx.getChildCount() < 1) return new HashMap<String, Object>();

        if (ctx.object() != null) {

            return decodeJsonObject(ctx.object());
        } else {
            // Array found
            return decodeJsonArray(ctx.array());
        }
    }

    private HashMap<String, Object> decodeJsonObject(JsonParser.ObjectContext ctx) {
        HashMap<String, Object> result = new HashMap<String, Object>();

        for (JsonParser.KeyvalueContext kvctx : ctx.keyvalue()) {
            result.put(kvctx.STRING().getText(), decodeJsonValue(kvctx.value()));
        }

        return result;
    }

    private HashMap<String, Object> decodeJsonArray(JsonParser.ArrayContext ctx) {
        HashMap<String, Object> result = new HashMap<String, Object>();

        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (ctx.value(i) != null) {
                result.put(Integer.toString(i), decodeJsonValue(ctx.value(i)));
            }
        }

        return result;
    }

    private Object decodeJsonValue(JsonParser.ValueContext ctx) {
        if (ctx.STRING() != null) {
            return ctx.STRING().getText();
        } else if (ctx.NUMBER() != null) {
            return Integer.valueOf(ctx.NUMBER().getText());
        } else if (ctx.object() != null) {
            return decodeJsonObject(ctx.object());
        } else if (ctx.array() != null) {
            return decodeJsonArray(ctx.array());
        } else if (ctx.getText().equals("null")) {
            return "null";
        } else {
            return Boolean.valueOf(ctx.getText());
        }
    }
}
