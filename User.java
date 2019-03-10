package android.practice.g0ku.databindingexample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.TextUtils;

public class User extends BaseObservable {

    private String username;
    private String password;

    private boolean valid;


    public String getUsername() {
        return username;

    }

    public void setUsername(String username) {
        this.username = username;
        check();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        check();
    }


    public void check(){

        setValid(!(TextUtils.isEmpty(username) || TextUtils.isEmpty(password) || password.length() <4));

    }

    @Bindable
    public boolean getValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        if(valid != this.valid)
        this.valid= valid;
        notifyPropertyChanged(BR.valid);
    }
}
