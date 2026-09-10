package team.kuet_titanium.kuet_kinship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RoomsAndLabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rooms_and_labs);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn1 = findViewById(R.id.nav_1);
        Button btn2 = findViewById(R.id.nav_2);
        Button btn3 = findViewById(R.id.nav_3);

        btn1.setOnClickListener(view -> intentNav());
        btn2.setOnClickListener(view -> intentNav());
        btn3.setOnClickListener(view -> intentNav());
    }

    private void intentNav(){
        Intent intent = new Intent(RoomsAndLabsActivity.this, RoomNavigateActivity.class);
        startActivity(intent);
    }
}