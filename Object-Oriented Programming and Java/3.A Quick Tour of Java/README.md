```markdown
# 1. Valid and Invalid Java Variable Names

### **Which of the following are valid variable names in Java?**

| Variable Name       | Valid/Invalid  | Reason                                                                                 |
| ------------------- | -------------- | -------------------------------------------------------------------------------------- |
| **\_object**        | ✅ **Valid**   | Starts with `_`, allowed.                                                              |
| **object–oriented** | ❌ **Invalid** | Contains a **dash (`–`)**, which is not allowed.                                       |
| **object_oriented** | ✅ **Valid**   | Uses an **underscore (`_`)**, which is allowed.                                        |
| **object.oriented** | ❌ **Invalid** | Contains a **dot (`.`)**, which is not allowed.                                        |
| **$java**           | ✅ **Valid**   | Starts with **`$`**, which is allowed.                                                 |
| **java**            | ✅ **Valid**   | Starts with a **letter**, allowed.                                                     |
| **integer**         | ✅ **Valid**   | **Not a Java keyword**, so it's allowed (but discouraged as it's a common class name). |
| **string**          | ✅ **Valid**   | **Not a Java keyword** (Java uses `String` with an uppercase `S`), so this is allowed. |
| **Int**             | ✅ **Valid**   | Starts with a **letter**, allowed.                                                     |
| **933**             | ❌ **Invalid** | Starts with a **digit**, not allowed.                                                  |
| **fm90.5**          | ❌ **Invalid** | Contains a **dot (`.`)**, which is not allowed.                                        |
| **1fm**             | ❌ **Invalid** | Starts with a **digit**, not allowed.                                                  |
```
