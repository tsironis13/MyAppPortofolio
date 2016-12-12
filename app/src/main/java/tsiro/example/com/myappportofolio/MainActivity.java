package tsiro.example.com.myappportofolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.popular_movies_button:
                createToast(getString(R.string.toast_msg, "Popular movies"));
                break;
            case R.id.stock_hawk_button:
                createToast(getString(R.string.toast_msg, "Stock hawk"));
                break;
            case R.id.build_it_bigger_button:
                createToast(getString(R.string.toast_msg, "Build it bigger"));
                break;
            case R.id.make_your_app_material_button:
                createToast(getString(R.string.toast_msg, "Make your app material"));
                break;
            case R.id.go_ubiquitous_button:
                createToast(getString(R.string.toast_msg, "Go ubiquitous"));
                break;
            case R.id.capstone_button:
                createToast(getString(R.string.toast_msg, "Capstone"));
                break;
        }
    }

    private void createToast(String msg) {
        if (msg != null) {
            /*  check if toast is not null (is showing)
                and cancel it accordingly to show the new toast
            */
            if (toast != null) toast.cancel();
            toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
            toast.show();

        }
    }

}
