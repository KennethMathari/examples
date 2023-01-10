package com.example.bazel;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
//import androidx.lifecycle.ViewModelProvider;

/**
 * Main class for the Bazel Android "Hello, World" app.
 */
public class MainActivity extends Activity {

//    private GreeterViewModel greeterViewModel;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickMeButton = findViewById(R.id.clickMeButton);
        TextView helloBazelTextView = findViewById(R.id.helloBazelTextView);

//        greeterViewModel = ViewModelProviders.of(this).get(GreeterViewModel.class);

//        initObservers();

    Greeter greeter = new Greeter();

        // Bazel supports Java 8 language features like lambdas!
    clickMeButton.setOnClickListener(v ->
            helloBazelTextView.setText(greeter.sayHello()));
    }

//    private void initObservers() {
//        final Observer<String> greetingObserver = new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable final String newGreeting) {
//                // Update the UI, in this case, a TextView.
//                helloBazelTextView.setText(newGreeting);
//            }
//        };
//
//        greeterViewModel.getGreeting().observe(this, greetingObserver);
//    }


}
