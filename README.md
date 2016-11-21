# Java ANTLR JSON parser

A demo written in Java using ANTLR to parse JSON. I took the specification from [json.org](http://www.json.org). I've added a little twist by adding support for comments. It basically gets ignored by the parser.

**Sample input:**
```
// Taken and modified from https://en.wikipedia.org/wiki/JSON
{ // Added comments
  "firstName": "John",
  "lastName": "Smith",
  "age": 25,
  "address": {
    "streetAddress": "21 2nd Street",
    "postalCode": "10021-3100"
  },
  "phoneNumbers": /* several numbers!*/ [
    {
      "type": "home", // Home sweet home
      "number": "212 555-1234"
    },
    {
      "type": "mobile",
      "number": "123 456-7890"
    } /* seeems to work! */
  ]
}

```

**Sample output:**

```
0 = 
{
    "phoneNumbers" = 
    {
        0 = 
        {
            "type" = "home" java.lang.String
            "number" = "212 555-1234" java.lang.String
        } java.util.HashMap
        1 = 
        {
            "type" = "mobile" java.lang.String
            "number" = "123 456-7890" java.lang.String
        } java.util.HashMap
    } java.util.HashMap
    "address" = 
    {
        "postalCode" = "10021-3100" java.lang.String
        "streetAddress" = "21 2nd Street" java.lang.String
    } java.util.HashMap
    "lastName" = "Smith" java.lang.String
    "firstName" = "John" java.lang.String
    "age" = 25 java.lang.Integer
} java.util.HashMap
```
