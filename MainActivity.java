package android.practice.g0ku.databindingexample;

import android.databinding.DataBindingUtil;
import android.practice.g0ku.databindingexample.databinding.ActivityMainBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        User user = new User();
        user.setUsername("John");
        user.setPassword("123456");

        mBinding.setUser(user);

        mBinding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mBinding.getUser() != null)
                Toast.makeText(MainActivity.this, "Username : " +mBinding.getUser().getUsername()
                        +"\n Password : " +mBinding.getUser().getPassword(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
