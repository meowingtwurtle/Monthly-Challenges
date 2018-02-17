# Feb 2018
Create a function that takes in a string and returns whether or not the brackets, braces and parentheses are balanced.

Example input and output

| Input | Output |
| ----- | ------ |
| `[]`  | `true` |
| `[{}]` | `true` |
| `[{]}` | `false` |
| `[[` | `false` |
| `]]` | `false` |
| `}{` | `false` |
| `[{()}]` | `true` |


# Bonus
- Make your function work with input that includes invalid characters. Example: `{wow, [neat, cool], ([])}` returns `true`
- Make it without regex or using a stack
