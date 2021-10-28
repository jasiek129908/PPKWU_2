# PPKWU_2
API used to count character types in given text.
To use API, u need to sent GET method and pass parameter text.

## Syntax
```
/string/?text=
```
## Example
```
http://localhost:8080/string/?text=has  */123AX
```
## Result
Returns as json object
```json
{
    "textToProcess": "has  */123AX",
    "upperCaseCounter": 2,
    "lowerCaseCounter": 3,
    "digitCounter": 3,
    "whiteSpaceCounter": 2,
    "specialCharacterCounter": 2
}
```
