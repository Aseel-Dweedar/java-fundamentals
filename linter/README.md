## Linter method

Contain a method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.

## Exceptions:

- Don’t show an error if the line is empty.
- Don’t show an error if the line ends with an opening .curly brace {.
- Don’t show an error if the line ends with an closing curly brace }.
- Don’t show an error if the line contains if or else.

## Error message example

`"Line 3: Missing semicolon."`
