package smaikap.test.com.twointentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    public void onButtonPress(View view) {
        EditText message = (EditText) findViewById( R.id.message);
        String received = message.getText().toString();
        Log.d("testApp", "Message fetched " + received);


//        Intent sendMessageIntet = new Intent(this, ReceieveMessageActivity.class);
//        sendMessageIntet.putExtra(ReceieveMessageActivity.KEY_MESSAGE_PASSED, received);
//        startActivity(sendMessageIntet);

        Intent implicitIntent = new Intent(Intent.ACTION_SEND);
        implicitIntent.setType("text/plain");
        implicitIntent.putExtra(Intent.EXTRA_TEXT, received);
        startActivity(implicitIntent);

    }
}
