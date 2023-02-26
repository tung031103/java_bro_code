package form_login;

import java.util.HashMap;
import java.awt.*;
import javax.swing.*;

public class ID_Password {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    ID_Password() { // constructor(hàm tạo)
        loginInfo.put("Tung", "bread");
        loginInfo.put("Tungbs", "Password");
        loginInfo.put("Tungls", "xyz123");
    }

    protected HashMap getLoginInfo() {
        return loginInfo;
    }
}
