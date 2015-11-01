package smaikap.test.com.twointentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ReceieveMessageActivity extends AppCompatActivity {

    public static final String KEY_MESSAGE_PASSED = "messagePassed";

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receieve_message);

        Intent intent = getIntent();
        final String msg = intent.getStringExtra(KEY_MESSAGE_PASSED);
        Log.d("testApp","Message passed : " + msg);

        TextView showMessage = (TextView)findViewById(R.id.displayMSG);
        showMessage.setText(msg);
    }

}
