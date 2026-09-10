package team.kuet_titanium.kuet_kinship;

import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.EdgeToEdge;
import androidx.activity.FullyDrawnReporter;
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
import androidx.core.view.MenuProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.navigationevent.NavigationEventDispatcher;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.io.FileDescriptor;
import java.io.PrintWriter;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_settings);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public SettingsActivity() {
        super();
    }

    public SettingsActivity(int contentLayoutId) {
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
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
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
    public void setSupportProgressBarVisibility(boolean visible) {
        super.setSupportProgressBarVisibility(visible);
    }

    @Override
    public void setSupportProgressBarIndeterminateVisibility(boolean visible) {
        super.setSupportProgressBarIndeterminateVisibility(visible);
    }

    @Override
    public void setSupportProgressBarIndeterminate(boolean indeterminate) {
        super.setSupportProgressBarIndeterminate(indeterminate);
    }

    @Override
    public void setSupportProgress(int progress) {
        super.setSupportProgress(progress);
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
    public boolean onSupportNavigateUp() {
        return super.onSupportNavigateUp();
    }

    @Override
    public @Nullable Intent getSupportParentActivityIntent() {
        return super.getSupportParentActivityIntent();
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
    public void onSupportContentChanged() {
        super.onSupportContentChanged();
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
    public void onPanelClosed(int featureId, @NonNull Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override
    public @NonNull AppCompatDelegate getDelegate() {
        return super.getDelegate();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public Resources getResources() {
        return super.getResources();
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
    protected void onActivityResult(int requestCode, int resultCode, @androidx.annotation.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void supportFinishAfterTransition() {
        super.supportFinishAfterTransition();
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

    @androidx.annotation.Nullable
    @Override
    public View onCreateView(@androidx.annotation.NonNull String name, @androidx.annotation.NonNull Context context, @androidx.annotation.NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onStateNotSaved() {
        super.onStateNotSaved();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override
    public void dump(@androidx.annotation.NonNull String prefix, @androidx.annotation.Nullable FileDescriptor fd, @androidx.annotation.NonNull PrintWriter writer, @androidx.annotation.Nullable String[] args) {
        super.dump(prefix, fd, writer, args);
    }

    @Override
    public void onAttachFragment(@androidx.annotation.NonNull Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @androidx.annotation.NonNull
    @Override
    public FragmentManager getSupportFragmentManager() {
        return super.getSupportFragmentManager();
    }

    @androidx.annotation.NonNull
    @Override
    public LoaderManager getSupportLoaderManager() {
        return super.getSupportLoaderManager();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @androidx.annotation.NonNull String[] permissions, @androidx.annotation.NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    public void startActivityFromFragment(@androidx.annotation.NonNull Fragment fragment, Intent intent, int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(@androidx.annotation.NonNull Fragment fragment, Intent intent, int requestCode, @androidx.annotation.Nullable Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public void startIntentSenderFromFragment(@androidx.annotation.NonNull Fragment fragment, IntentSender intent, int requestCode, @androidx.annotation.Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @androidx.annotation.Nullable Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderFromFragment(fragment, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @androidx.annotation.NonNull
    @Override
    public FullyDrawnReporter getFullyDrawnReporter() {
        return super.getFullyDrawnReporter();
    }

    @androidx.annotation.Nullable
    @Override
    public Object getLastCustomNonConfigurationInstance() {
        return super.getLastCustomNonConfigurationInstance();
    }

    @androidx.annotation.NonNull
    @Override
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @androidx.annotation.NonNull
    @Override
    public ViewModelStore getViewModelStore() {
        return super.getViewModelStore();
    }

    @androidx.annotation.NonNull
    @Override
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return super.getDefaultViewModelProviderFactory();
    }

    @androidx.annotation.NonNull
    @Override
    public CreationExtras getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @androidx.annotation.NonNull
    @Override
    public NavigationEventDispatcher getNavigationEventDispatcher() {
        return super.getNavigationEventDispatcher();
    }

    @Override
    protected void onSaveInstanceState(@androidx.annotation.NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @androidx.annotation.Nullable
    @Override
    public Object onRetainCustomNonConfigurationInstance() {
        return super.onRetainCustomNonConfigurationInstance();
    }

    @Override
    public void initializeViewTreeOwners() {
        super.initializeViewTreeOwners();
    }

    @androidx.annotation.Nullable
    @Override
    public Context peekAvailableContext() {
        return super.peekAvailableContext();
    }

    @Override
    public boolean onPreparePanel(int featureId, @androidx.annotation.Nullable View view, @androidx.annotation.NonNull Menu menu) {
        return super.onPreparePanel(featureId, view, menu);
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @androidx.annotation.NonNull Menu menu) {
        return super.onCreatePanelMenu(featureId, menu);
    }

    @Override
    public void addMenuProvider(@androidx.annotation.NonNull MenuProvider provider) {
        super.addMenuProvider(provider);
    }

    @Override
    public void addMenuProvider(@androidx.annotation.NonNull MenuProvider provider, @androidx.annotation.NonNull LifecycleOwner owner) {
        super.addMenuProvider(provider, owner);
    }

    @Override
    public void addMenuProvider(@androidx.annotation.NonNull MenuProvider provider, @androidx.annotation.NonNull LifecycleOwner owner, @androidx.annotation.NonNull Lifecycle.State state) {
        super.addMenuProvider(provider, owner, state);
    }

    @Override
    public void removeMenuProvider(@androidx.annotation.NonNull MenuProvider provider) {
        super.removeMenuProvider(provider);
    }

    @Override
    public void invalidateMenu() {
        super.invalidateMenu();
    }


    @Override
    public void startActivityForResult(@androidx.annotation.NonNull Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override
    public void startActivityForResult(@androidx.annotation.NonNull Intent intent, int requestCode, @androidx.annotation.Nullable Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void startIntentSenderForResult(@androidx.annotation.NonNull IntentSender intent, int requestCode, @androidx.annotation.Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override
    public void startIntentSenderForResult(@androidx.annotation.NonNull IntentSender intent, int requestCode, @androidx.annotation.Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @androidx.annotation.Nullable Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    protected void onNewIntent(@androidx.annotation.NonNull Intent intent) {
        super.onNewIntent(intent);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);
    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, @androidx.annotation.NonNull Configuration newConfig) {
        super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @androidx.annotation.NonNull Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
    }

    @Override
    public void onPictureInPictureUiStateChanged(@androidx.annotation.NonNull PictureInPictureUiState pipState) {
        super.onPictureInPictureUiStateChanged(pipState);
    }

    @Override
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
    }

    @Override
    public void reportFullyDrawn() {
        super.reportFullyDrawn();
    }

}