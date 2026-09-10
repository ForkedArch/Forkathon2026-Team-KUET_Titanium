package team.kuet_titanium.kuet_kinship;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.SharedElementCallback;
import androidx.core.app.TaskStackBuilder;
import androidx.core.graphics.Insets;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

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

    //Do not touch below codes:

    public LectureNotesActivity() {
        super();
    }

    public LectureNotesActivity(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(newBase);
    }

    @Override
    public void setTheme(int resId) {
        super.setTheme(resId);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    public @Nullable ActionBar getSupportActionBar() {
        return super.getSupportActionBar();
    }

    @Override
    public void setSupportActionBar(@Nullable Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
    }

    @Override
    public @NonNull MenuInflater getMenuInflater() {
        return super.getMenuInflater();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
    }

    @Override
    public boolean supportRequestWindowFeature(int featureId) {
        return super.supportRequestWindowFeature(featureId);
    }

    @Override
    public void supportInvalidateOptionsMenu() {
        super.supportInvalidateOptionsMenu();
    }

    @Override
    public void invalidateOptionsMenu() {
        super.invalidateOptionsMenu();
    }

    @Override
    public void onSupportActionModeStarted(@NonNull ActionMode mode) {
        super.onSupportActionModeStarted(mode);
    }

    @Override
    public void onSupportActionModeFinished(@NonNull ActionMode mode) {
        super.onSupportActionModeFinished(mode);
    }

    @Override
    public @Nullable ActionMode onWindowStartingSupportActionMode(ActionMode.@NonNull Callback callback) {
        return super.onWindowStartingSupportActionMode(callback);
    }

    @Override
    public @Nullable ActionMode startSupportActionMode(ActionMode.@NonNull Callback callback) {
        return super.startSupportActionMode(callback);
    }

    @Override
    public void onCreateSupportNavigateUpTaskStack(@NonNull TaskStackBuilder builder) {
        super.onCreateSupportNavigateUpTaskStack(builder);
    }

    @Override
    public void onPrepareSupportNavigateUpTaskStack(@NonNull TaskStackBuilder builder) {
        super.onPrepareSupportNavigateUpTaskStack(builder);
    }

    @Override
    public @Nullable Intent getSupportParentActivityIntent() {
        return super.getSupportParentActivityIntent();
    }

    @Override
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    @Override
    public boolean supportShouldUpRecreateTask(@NonNull Intent targetIntent) {
        return super.supportShouldUpRecreateTask(targetIntent);
    }

    @Override
    public void supportNavigateUpTo(@NonNull Intent upIntent) {
        super.supportNavigateUpTo(upIntent);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
    }

    @Override
    public ActionBarDrawerToggle.@Nullable Delegate getDrawerToggleDelegate() {
        return super.getDrawerToggleDelegate();
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }

    @Override
    public @NonNull AppCompatDelegate getDelegate() {
        return super.getDelegate();
    }

    @Override
    public void onPanelClosed(int featureId, @NonNull Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public Resources getResources() {
        return super.getResources();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void openOptionsMenu() {
        super.openOptionsMenu();
    }

    @Override
    public void closeOptionsMenu() {
        super.closeOptionsMenu();
    }

    @Override
    protected void onNightModeChanged(int mode) {
        super.onNightModeChanged(mode);
    }

    @Override
    protected void onLocalesChanged(@NonNull LocaleListCompat locales) {
        super.onLocalesChanged(locales);
    }

    @Override
    public void setEnterSharedElementCallback(@androidx.annotation.Nullable SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void setExitSharedElementCallback(@androidx.annotation.Nullable SharedElementCallback listener) {
        super.setExitSharedElementCallback(listener);
    }

    @Override
    public void supportPostponeEnterTransition() {
        super.supportPostponeEnterTransition();
    }

    @Override
    public void supportStartPostponedEnterTransition() {
        super.supportStartPostponedEnterTransition();
    }

    @androidx.annotation.Nullable
    @Override
    public View onCreateView(@androidx.annotation.Nullable View parent, @androidx.annotation.NonNull String name, @androidx.annotation.NonNull Context context, @androidx.annotation.NonNull AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }
}