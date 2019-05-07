# Clean Architecture

SOLID examples

## explore project with jshell

```
export JAVA_HOME=`/usr/libexec/java_home -v 11`
jshell --class-path ./target/clean-code-1.0-SNAPSHOT.jar
import srp.model.*
EmployeeData data = new EmployeeData(100, 20, 10);
Employee e = new Employee("Nick", "Van Hoof")
e.setEmployeeData(data);
e.toString()
import srp.facade.*
EmployeeFacade facade = new EmployeeFacade();
facade.calculatePay(e);
```