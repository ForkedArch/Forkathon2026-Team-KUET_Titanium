package team.kuet_titanium.kuet_kinship;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import team.kuet_titanium.kuet_kinship.fragments.CourseSelectionFragment;
import team.kuet_titanium.kuet_kinship.fragments.TermSelectionFragment;
import team.kuet_titanium.kuet_kinship.fragments.YearSelectionFragment;

public class LectureNotesActivity extends AppCompatActivity {

    private String selectedYear = "";
    private String selectedTerm = "";
    private String selectedCourse = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lecture_notes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        if (savedInstanceState == null) {
            loadFragment(new YearSelectionFragment());
        }
    }

    public void onYearSelected(String year) {
        this.selectedYear = year;
        loadFragment(new TermSelectionFragment(), true);
    }

    public void onTermSelected(String term) {
        this.selectedTerm = term;
        loadFragment(new CourseSelectionFragment(), true);
    }

    public void onCourseSelected(String course) {
        this.selectedCourse = course;
        openCourseLink();
    }

    private void loadFragment(Fragment fragment, boolean addToBackStack) {
        var transaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment);

        if (addToBackStack) {
            transaction.addToBackStack(null);
        }
        transaction.commit();
    }

    private void openCourseLink() {
        String targetUrl = "https://github.com/ForkedArch/Forkathon2026-Team-KUET_Titanium"; // Default fallback

        //Todo: Replace with real drive links
        //Dummy data implemented here
        if ("1st yr".equals(selectedYear)){
            if ("odd pre".equals(selectedTerm) || "odd post".equals(selectedTerm) || "even pre".equals(selectedTerm) || "even post".equals(selectedTerm)){
                if ("PHY 1107".equals(selectedCourse)){
                    Toast.makeText(LectureNotesActivity.this, "We will redirect you to our repo link as a dummy implementation", Toast.LENGTH_SHORT).show();
                } else if ("CSE 1107".equals(selectedCourse)){
                    Toast.makeText(LectureNotesActivity.this, "We will redirect you to our repo link as a dummy implementation", Toast.LENGTH_SHORT).show();
                } else if("CSE 1101".equals(selectedCourse)){
                    Toast.makeText(LectureNotesActivity.this, "We will redirect you to our repo link as a dummy implementation", Toast.LENGTH_SHORT).show();
                } else if("MATH 1107".equals(selectedCourse)){
                    Toast.makeText(LectureNotesActivity.this, "We will redirect you to our repo link as a dummy implementation", Toast.LENGTH_SHORT).show();
                } else if ("HUM 1107".equals(selectedCourse)){
                    Toast.makeText(LectureNotesActivity.this, "We will redirect you to our repo link as a dummy implementation", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LectureNotesActivity.this, "Unexpected token detected", Toast.LENGTH_SHORT).show();
                }

            } else{
                Toast.makeText(LectureNotesActivity.this, "Unexpected token detected", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(LectureNotesActivity.this, "Unfortunately, the section flow or other years were not implemented. Please try choosing 1st year.", Toast.LENGTH_SHORT).show();
        }

        /* Todo: This is the original logic to be implemented
        if ("1st yr".equals(selectedYear) && "1-1 post mid".equals(selectedTerm) && "CSE 1107".equals(selectedCourse)) {
            targetUrl = "https://www.google.com";
        } else if ("1st yr".equals(selectedYear) && "1-1 pre mid".equals(selectedTerm) && "PHY 1101".equals(selectedCourse)) {
            targetUrl = "https://www.google.com";
        }

         */

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(targetUrl));
        startActivity(browserIntent);
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}