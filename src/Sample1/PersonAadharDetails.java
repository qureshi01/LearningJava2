package Sample1;

import java.io.Serial;
import java.io.Serializable;

public class PersonAadharDetails implements Serializable {

    //serialVersionUID requires to deserialize in another system.it will check the uid and implements
    @Serial
    private static final long serialVersionUID = 123456L;

    String username;
    transient String password; //transient used not to serialise certain variables.for security purpose.
    String aadharNo;
    String aadharAddress;

}
