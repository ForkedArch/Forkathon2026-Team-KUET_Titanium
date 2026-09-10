package team.kuet_titanium.kuet_kinship.consolidated;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.ComponentCaller;
import android.app.Dialog;
import android.app.DirectAction;
import android.app.HandoffActivityData;
import android.app.HandoffActivityDataRequestInfo;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.app.VoiceInteractor;
import android.app.assist.AssistContent;
import android.content.AttributionSource;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextParams;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.OutcomeReceiver;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.Display;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.window.OnBackInvokedDispatcher;

import androidx.activity.EdgeToEdge;
import com.google.android.material.snackbar.Snackbar;

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
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigationevent.NavigationEventDispatcher;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

import team.kuet_titanium.kuet_kinship.R;
//import team.kuet_titanium.kuet_kinship.databinding.ActivityExamsBinding;

public class ExamsActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        /*
     ActivityExamsBinding binding = ActivityExamsBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(binding.main, (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        setSupportActionBar(binding.toolbar);

        /*
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_content_main);

        if (navHostFragment != null) {
            NavController navController = navHostFragment.getNavController();

            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
            NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        }



        binding.fab.setOnClickListener(
                view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show()
        ); */
    }

    @Override
    public boolean onSupportNavigateUp() {
        /*
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_content_main);
        boolean handled = false;
        if (navHostFragment != null) {
            NavController navController = navHostFragment.getNavController();
            handled = NavigationUI.navigateUp(navController, appBarConfiguration);
        }


         */
        //return handled || super.onSupportNavigateUp();
        return true;
    }

    public ExamsActivity() {
        super();
    }

    public ExamsActivity(int contentLayoutId) {
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
    public void startActivityFromFragment(@androidx.annotation.NonNull Fragment fragment, @androidx.annotation.NonNull Intent intent, int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(@androidx.annotation.NonNull Fragment fragment, @androidx.annotation.NonNull Intent intent, int requestCode, @androidx.annotation.Nullable Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public void startIntentSenderFromFragment(@androidx.annotation.NonNull Fragment fragment, @androidx.annotation.NonNull IntentSender intent, int requestCode, @androidx.annotation.Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @androidx.annotation.Nullable Bundle options) throws IntentSender.SendIntentException {
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
    public void onBackPressed() {
        super.onBackPressed();
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
/*
    @Override
    public void putExtraData(@androidx.annotation.NonNull ExtraData extraData) {
        super.putExtraData(extraData);
    }

    @androidx.annotation.Nullable
    @Override
    public <T extends ExtraData> T getExtraData(@androidx.annotation.NonNull Class<T> extraDataClass) {
        return super.getExtraData(extraDataClass);
    }

    @Override
    public boolean superDispatchKeyEvent(@androidx.annotation.NonNull KeyEvent event) {
        return super.superDispatchKeyEvent(event);
    }

    @Override
    public boolean dispatchKeyShortcutEvent(@androidx.annotation.NonNull KeyEvent event) {
        return super.dispatchKeyShortcutEvent(event);
    }


 */
    @Override
    public void clearOverrideActivityTransition(int overrideType) {
        super.clearOverrideActivityTransition(overrideType);
    }

    @Override
    public void closeContextMenu() {
        super.closeContextMenu();
    }

    @Override
    public PendingIntent createPendingResult(int requestCode, @androidx.annotation.NonNull Intent data, int flags) {
        return super.createPendingResult(requestCode, data, flags);
    }

    @Override
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        return super.dispatchPopulateAccessibilityEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean dispatchTrackballEvent(MotionEvent ev) {
        return super.dispatchTrackballEvent(ev);
    }

    @Override
    public void enterPictureInPictureMode() {
        super.enterPictureInPictureMode();
    }

    @Override
    public boolean enterPictureInPictureMode(@androidx.annotation.NonNull PictureInPictureParams params) {
        return super.enterPictureInPictureMode(params);
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
    }

    @Override
    public void finishActivityFromChild(@androidx.annotation.NonNull Activity child, int requestCode) {
        super.finishActivityFromChild(child, requestCode);
    }

    @Override
    public void finishAffinity() {
        super.finishAffinity();
    }

    @Override
    public void finishAfterTransition() {
        super.finishAfterTransition();
    }

    @Override
    public void finishAndRemoveTask() {
        super.finishAndRemoveTask();
    }

    @Override
    public void finishFromChild(Activity child) {
        super.finishFromChild(child);
    }

    @androidx.annotation.Nullable
    @Override
    public android.app.ActionBar getActionBar() {
        return super.getActionBar();
    }

    @androidx.annotation.Nullable
    @Override
    public ComponentCaller getCaller() {
        return super.getCaller();
    }

    @androidx.annotation.Nullable
    @Override
    public ComponentName getCallingActivity() {
        return super.getCallingActivity();
    }

    @androidx.annotation.Nullable
    @Override
    public String getCallingPackage() {
        return super.getCallingPackage();
    }

    @Override
    public int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override
    public ComponentName getComponentName() {
        return super.getComponentName();
    }

    @Override
    public Scene getContentScene() {
        return super.getContentScene();
    }

    @Override
    public TransitionManager getContentTransitionManager() {
        return super.getContentTransitionManager();
    }

    @androidx.annotation.NonNull
    @Override
    public ComponentCaller getCurrentCaller() {
        return super.getCurrentCaller();
    }

    @androidx.annotation.Nullable
    @Override
    public View getCurrentFocus() {
        return super.getCurrentFocus();
    }

    @Override
    public android.app.FragmentManager getFragmentManager() {
        return super.getFragmentManager();
    }

    @androidx.annotation.NonNull
    @Override
    public ComponentCaller getInitialCaller() {
        return super.getInitialCaller();
    }

    @Override
    public Intent getIntent() {
        return super.getIntent();
    }

    @androidx.annotation.Nullable
    @Override
    public Object getLastNonConfigurationInstance() {
        return super.getLastNonConfigurationInstance();
    }

    @androidx.annotation.Nullable
    @Override
    public String getLaunchedFromPackage() {
        return super.getLaunchedFromPackage();
    }

    @Override
    public int getLaunchedFromUid() {
        return super.getLaunchedFromUid();
    }

    @androidx.annotation.NonNull
    @Override
    public LayoutInflater getLayoutInflater() {
        return super.getLayoutInflater();
    }

    @Override
    public android.app.LoaderManager getLoaderManager() {
        return super.getLoaderManager();
    }

    @androidx.annotation.NonNull
    @Override
    public String getLocalClassName() {
        return super.getLocalClassName();
    }

    @Override
    public int getMaxNumPictureInPictureActions() {
        return super.getMaxNumPictureInPictureActions();
    }

    @androidx.annotation.NonNull
    @Override
    public OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        return super.getOnBackInvokedDispatcher();
    }

    @androidx.annotation.Nullable
    @Override
    public Intent getParentActivityIntent() {
        return super.getParentActivityIntent();
    }

    @Override
    public SharedPreferences getPreferences(int mode) {
        return super.getPreferences(mode);
    }

    @androidx.annotation.Nullable
    @Override
    public Uri getReferrer() {
        return super.getReferrer();
    }

    @Override
    public int getRequestedOrientation() {
        return super.getRequestedOrientation();
    }

    @Override
    public Object getSystemService(@androidx.annotation.NonNull String name) {
        return super.getSystemService(name);
    }

    @Override
    public int getTaskId() {
        return super.getTaskId();
    }

    @Override
    public VoiceInteractor getVoiceInteractor() {
        return super.getVoiceInteractor();
    }

    @Override
    public Window getWindow() {
        return super.getWindow();
    }

    @Override
    public WindowManager getWindowManager() {
        return super.getWindowManager();
    }

    @Override
    public boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    @Override
    public boolean isActivityTransitionRunning() {
        return super.isActivityTransitionRunning();
    }

    @Override
    public boolean isChangingConfigurations() {
        return super.isChangingConfigurations();
    }

    @Override
    public boolean isDestroyed() {
        return super.isDestroyed();
    }

    @Override
    public boolean isFinishing() {
        return super.isFinishing();
    }

    @Override
    public boolean isImmersive() {
        return super.isImmersive();
    }

    @Override
    public boolean isInMultiWindowMode() {
        return super.isInMultiWindowMode();
    }

    @Override
    public boolean isInPictureInPictureMode() {
        return super.isInPictureInPictureMode();
    }

    @Override
    public boolean isLaunchedFromBubble() {
        return super.isLaunchedFromBubble();
    }

    @Override
    public boolean isLocalVoiceInteractionSupported() {
        return super.isLocalVoiceInteractionSupported();
    }

    @Override
    public boolean isTaskRoot() {
        return super.isTaskRoot();
    }

    @Override
    public boolean isVoiceInteraction() {
        return super.isVoiceInteraction();
    }

    @Override
    public boolean isVoiceInteractionRoot() {
        return super.isVoiceInteractionRoot();
    }

    @Override
    public boolean moveTaskToBack(boolean nonRoot) {
        return super.moveTaskToBack(nonRoot);
    }

    @Override
    public boolean navigateUpTo(Intent upIntent) {
        return super.navigateUpTo(upIntent);
    }

    @Override
    public boolean navigateUpToFromChild(Activity child, Intent upIntent) {
        return super.navigateUpToFromChild(child, upIntent);
    }

    @Override
    public void onActionModeFinished(android.view.ActionMode mode) {
        super.onActionModeFinished(mode);
    }

    @Override
    public void onActionModeStarted(android.view.ActionMode mode) {
        super.onActionModeStarted(mode);
    }

    @Override
    public void onActivityReenter(int resultCode, Intent data) {
        super.onActivityReenter(resultCode, data);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @androidx.annotation.Nullable Intent data, @androidx.annotation.NonNull ComponentCaller caller) {
        super.onActivityResult(requestCode, resultCode, data, caller);
    }

    @Override
    protected void onApplyThemeResource(Resources.Theme theme, int resid, boolean first) {
        super.onApplyThemeResource(theme, resid, first);
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
    }

    @Override
    public boolean onContextItemSelected(@androidx.annotation.NonNull MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(@androidx.annotation.NonNull Menu menu) {
        super.onContextMenuClosed(menu);
    }

    @Override
    public void onCreate(@androidx.annotation.Nullable Bundle savedInstanceState, @androidx.annotation.Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @androidx.annotation.Nullable
    @Override
    public CharSequence onCreateDescription() {
        return super.onCreateDescription();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        return super.onCreateDialog(id);
    }

    @androidx.annotation.Nullable
    @Override
    protected Dialog onCreateDialog(int id, Bundle args) {
        return super.onCreateDialog(id, args);
    }

    @Override
    public void onCreateNavigateUpTaskStack(android.app.TaskStackBuilder builder) {
        super.onCreateNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @androidx.annotation.Nullable
    @Override
    public View onCreatePanelView(int featureId) {
        return super.onCreatePanelView(featureId);
    }

    @Override
    public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
        return super.onCreateThumbnail(outBitmap, canvas);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
    }

    @Override
    public boolean onGenericMotionEvent(MotionEvent event) {
        return super.onGenericMotionEvent(event);
    }

    @Override
    public void onGetDirectActions(@androidx.annotation.NonNull CancellationSignal cancellationSignal, @androidx.annotation.NonNull Consumer<List<DirectAction>> callback) {
        super.onGetDirectActions(cancellationSignal, callback);
    }

    @androidx.annotation.Nullable
    @Override
    public HandoffActivityData onHandoffActivityDataRequested(@androidx.annotation.NonNull HandoffActivityDataRequestInfo requestInfo) {
        return super.onHandoffActivityDataRequested(requestInfo);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyShortcut(int keyCode, KeyEvent event) {
        return super.onKeyShortcut(keyCode, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        return super.onKeyUp(keyCode, event);
    }

    @Override
    public void onLocalVoiceInteractionStarted() {
        super.onLocalVoiceInteractionStarted();
    }

    @Override
    public void onLocalVoiceInteractionStopped() {
        super.onLocalVoiceInteractionStopped();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public boolean onNavigateUp() {
        return super.onNavigateUp();
    }

    @Override
    public boolean onNavigateUpFromChild(Activity child) {
        return super.onNavigateUpFromChild(child);
    }

    @Override
    public void onNewIntent(@androidx.annotation.NonNull Intent intent, @androidx.annotation.NonNull ComponentCaller caller) {
        super.onNewIntent(intent, caller);
    }

    @Override
    public boolean onOptionsItemSelected(@androidx.annotation.NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
        super.onOptionsMenuClosed(menu);
    }

    @Override
    public void onPerformDirectAction(@androidx.annotation.NonNull String actionId, @androidx.annotation.NonNull Bundle arguments, @androidx.annotation.NonNull CancellationSignal cancellationSignal, @androidx.annotation.NonNull Consumer<Bundle> resultListener) {
        super.onPerformDirectAction(actionId, arguments, cancellationSignal, resultListener);
    }

    @Override
    public boolean onPictureInPictureRequested() {
        return super.onPictureInPictureRequested();
    }

    @Override
    public void onPostCreate(@androidx.annotation.Nullable Bundle savedInstanceState, @androidx.annotation.Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
    }

    @Override
    protected void onPrepareDialog(int id, Dialog dialog, Bundle args) {
        super.onPrepareDialog(id, dialog, args);
    }

    @Override
    public void onPrepareNavigateUpTaskStack(android.app.TaskStackBuilder builder) {
        super.onPrepareNavigateUpTaskStack(builder);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onProvideAssistContent(AssistContent outContent) {
        super.onProvideAssistContent(outContent);
    }

    @Override
    public void onProvideAssistData(Bundle data) {
        super.onProvideAssistData(data);
    }

    @Override
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
        super.onProvideKeyboardShortcuts(data, menu, deviceId);
    }

    @Override
    public Uri onProvideReferrer() {
        return super.onProvideReferrer();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @androidx.annotation.NonNull String[] permissions, @androidx.annotation.NonNull int[] grantResults, int deviceId) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults, deviceId);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onRestoreInstanceState(@androidx.annotation.NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(@androidx.annotation.Nullable Bundle savedInstanceState, @androidx.annotation.Nullable PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }

    @Override
    public void onSaveInstanceState(@androidx.annotation.NonNull Bundle outState, @androidx.annotation.NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public boolean onSearchRequested() {
        return super.onSearchRequested();
    }

    @Override
    public boolean onSearchRequested(@androidx.annotation.Nullable SearchEvent searchEvent) {
        return super.onSearchRequested(searchEvent);
    }

    @Override
    public void onTopResumedActivityChanged(boolean isTopResumedActivity) {
        super.onTopResumedActivityChanged(isTopResumedActivity);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onTrackballEvent(MotionEvent event) {
        return super.onTrackballEvent(event);
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
    }

    @Override
    public void onVisibleBehindCanceled() {
        super.onVisibleBehindCanceled();
    }

    @Override
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        super.onWindowAttributesChanged(params);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
    }

    @androidx.annotation.Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return super.onWindowStartingActionMode(callback);
    }

    @androidx.annotation.Nullable
    @Override
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int type) {
        return super.onWindowStartingActionMode(callback, type);
    }

    @Override
    public void openContextMenu(View view) {
        super.openContextMenu(view);
    }

    @Override
    public void overrideActivityTransition(int overrideType, int enterAnim, int exitAnim) {
        super.overrideActivityTransition(overrideType, enterAnim, exitAnim);
    }

    @Override
    public void overrideActivityTransition(int overrideType, int enterAnim, int exitAnim, int backgroundColor) {
        super.overrideActivityTransition(overrideType, enterAnim, exitAnim, backgroundColor);
    }

    @Override
    public void overridePendingTransition(int enterAnim, int exitAnim) {
        super.overridePendingTransition(enterAnim, exitAnim);
    }

    @Override
    public void overridePendingTransition(int enterAnim, int exitAnim, int backgroundColor) {
        super.overridePendingTransition(enterAnim, exitAnim, backgroundColor);
    }

    @Override
    public void postponeEnterTransition() {
        super.postponeEnterTransition();
    }

    @Override
    public void recreate() {
        super.recreate();
    }

    @Override
    public void registerActivityLifecycleCallbacks(@androidx.annotation.NonNull Application.ActivityLifecycleCallbacks callback) {
        super.registerActivityLifecycleCallbacks(callback);
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    public void registerForContextMenu(View view) {
        super.registerForContextMenu(view);
    }
    /*
    @Override
    public void registerScreenCaptureCallback(@androidx.annotation.NonNull Executor executor, @androidx.annotation.NonNull ScreenCaptureCallback callback) {
        super.registerScreenCaptureCallback(executor, callback);
    }

     */

    @Override
    public boolean releaseInstance() {
        return super.releaseInstance();
    }

    @Override
    public DragAndDropPermissions requestDragAndDropPermissions(DragEvent event) {
        return super.requestDragAndDropPermissions(event);
    }

    @Override
    public void requestFullscreenMode(int request, @androidx.annotation.Nullable OutcomeReceiver<Void, Throwable> approvalCallback) {
        super.requestFullscreenMode(request, approvalCallback);
    }

    @Override
    public boolean requestVisibleBehind(boolean visible) {
        return super.requestVisibleBehind(visible);
    }

    @Override
    public void setActionBar(@androidx.annotation.Nullable android.widget.Toolbar toolbar) {
        super.setActionBar(toolbar);
    }

    @Override
    public void setAllowCrossUidActivitySwitchFromBelow(boolean allowed) {
        super.setAllowCrossUidActivitySwitchFromBelow(allowed);
    }

    @Override
    public void setContentTransitionManager(TransitionManager tm) {
        super.setContentTransitionManager(tm);
    }

    @Override
    public void setEnterSharedElementCallback(android.app.SharedElementCallback callback) {
        super.setEnterSharedElementCallback(callback);
    }

    @Override
    public void setExitSharedElementCallback(android.app.SharedElementCallback callback) {
        super.setExitSharedElementCallback(callback);
    }

    @Override
    public void setFinishOnTouchOutside(boolean finish) {
        super.setFinishOnTouchOutside(finish);
    }

    @Override
    public void setImmersive(boolean i) {
        super.setImmersive(i);
    }

    @Override
    public void setInheritShowWhenLocked(boolean inheritShowWhenLocked) {
        super.setInheritShowWhenLocked(inheritShowWhenLocked);
    }

    @Override
    public void setIntent(Intent newIntent) {
        super.setIntent(newIntent);
    }

    @Override
    public void setIntent(@androidx.annotation.Nullable Intent newIntent, @androidx.annotation.Nullable ComponentCaller newCaller) {
        super.setIntent(newIntent, newCaller);
    }

    @Override
    public void setLocusContext(@androidx.annotation.Nullable LocusId locusId, @androidx.annotation.Nullable Bundle bundle) {
        super.setLocusContext(locusId, bundle);
    }

    @Override
    public void setPictureInPictureParams(@androidx.annotation.NonNull PictureInPictureParams params) {
        super.setPictureInPictureParams(params);
    }

    @Override
    public void setRecentsScreenshotEnabled(boolean enabled) {
        super.setRecentsScreenshotEnabled(enabled);
    }

    @Override
    public void setRequestedOrientation(int requestedOrientation) {
        super.setRequestedOrientation(requestedOrientation);
    }

    @Override
    public void setShouldDockBigOverlays(boolean shouldDockBigOverlays) {
        super.setShouldDockBigOverlays(shouldDockBigOverlays);
    }

    @Override
    public void setShowWhenLocked(boolean showWhenLocked) {
        super.setShowWhenLocked(showWhenLocked);
    }

    @Override
    public void setTaskDescription(ActivityManager.TaskDescription taskDescription) {
        super.setTaskDescription(taskDescription);
    }

    @Override
    public void setTitle(int titleId) {
        super.setTitle(titleId);
    }

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    public void setTitleColor(int textColor) {
        super.setTitleColor(textColor);
    }

    @Override
    public boolean setTranslucent(boolean translucent) {
        return super.setTranslucent(translucent);
    }

    @Override
    public void setTurnScreenOn(boolean turnScreenOn) {
        super.setTurnScreenOn(turnScreenOn);
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }

    @Override
    public void setVrModeEnabled(boolean enabled, @androidx.annotation.NonNull ComponentName requestedComponent) throws PackageManager.NameNotFoundException {
        super.setVrModeEnabled(enabled, requestedComponent);
    }

    @Override
    public boolean shouldDockBigOverlays() {
        return super.shouldDockBigOverlays();
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(@androidx.annotation.NonNull String permission) {
        return super.shouldShowRequestPermissionRationale(permission);
    }

    @Override
    public boolean shouldShowRequestPermissionRationale(@androidx.annotation.NonNull String permission, int deviceId) {
        return super.shouldShowRequestPermissionRationale(permission, deviceId);
    }

    @Override
    public boolean shouldUpRecreateTask(Intent targetIntent) {
        return super.shouldUpRecreateTask(targetIntent);
    }

    @Override
    public boolean showAssist(Bundle args) {
        return super.showAssist(args);
    }

    @Override
    public void showLockTaskEscapeMessage() {
        super.showLockTaskEscapeMessage();
    }

    @androidx.annotation.Nullable
    @Override
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback) {
        return super.startActionMode(callback);
    }

    @androidx.annotation.Nullable
    @Override
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback, int type) {
        return super.startActionMode(callback, type);
    }

    @Override
    public void startActivities(Intent[] intents) {
        super.startActivities(intents);
    }

    @Override
    public void startActivities(Intent[] intents, @androidx.annotation.Nullable Bundle options) {
        super.startActivities(intents, options);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
    }

    @Override
    public void startActivity(Intent intent, @androidx.annotation.Nullable Bundle options) {
        super.startActivity(intent, options);
    }

    @Override
    public void startActivityFromChild(@androidx.annotation.NonNull Activity child, Intent intent, int requestCode) {
        super.startActivityFromChild(child, intent, requestCode);
    }

    @Override
    public void startActivityFromChild(@androidx.annotation.NonNull Activity child, Intent intent, int requestCode, @androidx.annotation.Nullable Bundle options) {
        super.startActivityFromChild(child, intent, requestCode, options);
    }

    @Override
    public void startActivityFromFragment(@androidx.annotation.NonNull android.app.Fragment fragment, Intent intent, int requestCode) {
        super.startActivityFromFragment(fragment, intent, requestCode);
    }

    @Override
    public void startActivityFromFragment(@androidx.annotation.NonNull android.app.Fragment fragment, Intent intent, int requestCode, @androidx.annotation.Nullable Bundle options) {
        super.startActivityFromFragment(fragment, intent, requestCode, options);
    }

    @Override
    public boolean startActivityIfNeeded(@androidx.annotation.NonNull Intent intent, int requestCode) {
        return super.startActivityIfNeeded(intent, requestCode);
    }

    @Override
    public boolean startActivityIfNeeded(@androidx.annotation.NonNull Intent intent, int requestCode, @androidx.annotation.Nullable Bundle options) {
        return super.startActivityIfNeeded(intent, requestCode, options);
    }

    @Override
    public void startIntentSender(IntentSender intent, @androidx.annotation.Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override
    public void startIntentSender(IntentSender intent, @androidx.annotation.Nullable Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @androidx.annotation.Nullable Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSender(intent, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override
    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override
    public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, @androidx.annotation.Nullable Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderFromChild(child, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override
    public void startLocalVoiceInteraction(Bundle privateOptions) {
        super.startLocalVoiceInteraction(privateOptions);
    }

    @Override
    public void startLockTask() {
        super.startLockTask();
    }

    @Override
    public void startManagingCursor(Cursor c) {
        super.startManagingCursor(c);
    }

    @Override
    public boolean startNextMatchingActivity(@androidx.annotation.NonNull Intent intent) {
        return super.startNextMatchingActivity(intent);
    }

    @Override
    public boolean startNextMatchingActivity(@androidx.annotation.NonNull Intent intent, @androidx.annotation.Nullable Bundle options) {
        return super.startNextMatchingActivity(intent, options);
    }

    @Override
    public void startPostponedEnterTransition() {
        super.startPostponedEnterTransition();
    }

    @Override
    public void startSearch(@androidx.annotation.Nullable String initialQuery, boolean selectInitialQuery, @androidx.annotation.Nullable Bundle appSearchData, boolean globalSearch) {
        super.startSearch(initialQuery, selectInitialQuery, appSearchData, globalSearch);
    }

    @Override
    public void stopLocalVoiceInteraction() {
        super.stopLocalVoiceInteraction();
    }

    @Override
    public void stopLockTask() {
        super.stopLockTask();
    }

    @Override
    public void stopManagingCursor(Cursor c) {
        super.stopManagingCursor(c);
    }

    @Override
    public void takeKeyEvents(boolean get) {
        super.takeKeyEvents(get);
    }

    @Override
    public void triggerSearch(String query, @androidx.annotation.Nullable Bundle appSearchData) {
        super.triggerSearch(query, appSearchData);
    }

    @Override
    public void unregisterActivityLifecycleCallbacks(@androidx.annotation.NonNull Application.ActivityLifecycleCallbacks callback) {
        super.unregisterActivityLifecycleCallbacks(callback);
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void unregisterForContextMenu(View view) {
        super.unregisterForContextMenu(view);
    }
    /*
    @Override
    public void unregisterScreenCaptureCallback(@androidx.annotation.NonNull ScreenCaptureCallback callback) {
        super.unregisterScreenCaptureCallback(callback);
    }

     */

    @Override
    public void applyOverrideConfiguration(Configuration overrideConfiguration) {
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override
    public AssetManager getAssets() {
        return super.getAssets();
    }

    @Override
    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override
    public void setTheme(@androidx.annotation.Nullable Resources.Theme theme) {
        super.setTheme(theme);
    }

    @Override
    public boolean bindIsolatedService(Intent service, int flags, String instanceName, Executor executor, ServiceConnection conn) {
        return super.bindIsolatedService(service, flags, instanceName, executor, conn);
    }

    @Override
    public boolean bindService(@androidx.annotation.NonNull Intent service, @androidx.annotation.NonNull BindServiceFlags flags, @androidx.annotation.NonNull Executor executor, @androidx.annotation.NonNull ServiceConnection conn) {
        return super.bindService(service, flags, executor, conn);
    }

    @Override
    public boolean bindService(@androidx.annotation.NonNull Intent service, @androidx.annotation.NonNull ServiceConnection conn, @androidx.annotation.NonNull BindServiceFlags flags) {
        return super.bindService(service, conn, flags);
    }

    @Override
    public boolean bindService(Intent service, ServiceConnection conn, int flags) {
        return super.bindService(service, conn, flags);
    }

    @Override
    public boolean bindService(Intent service, int flags, Executor executor, ServiceConnection conn) {
        return super.bindService(service, flags, executor, conn);
    }

    @Override
    public boolean bindServiceAsUser(Intent service, ServiceConnection conn, @androidx.annotation.NonNull BindServiceFlags flags, UserHandle user) {
        return super.bindServiceAsUser(service, conn, flags, user);
    }

    @Override
    public boolean bindServiceAsUser(Intent service, ServiceConnection conn, int flags, UserHandle user) {
        return super.bindServiceAsUser(service, conn, flags, user);
    }

    @Override
    public int checkCallingOrSelfPermission(String permission) {
        return super.checkCallingOrSelfPermission(permission);
    }

    @Override
    public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) {
        return super.checkCallingOrSelfUriPermission(uri, modeFlags);
    }

    @androidx.annotation.NonNull
    @Override
    public int[] checkCallingOrSelfUriPermissions(@androidx.annotation.NonNull List<Uri> uris, int modeFlags) {
        return super.checkCallingOrSelfUriPermissions(uris, modeFlags);
    }

    @Override
    public int checkCallingPermission(String permission) {
        return super.checkCallingPermission(permission);
    }

    @Override
    public int checkCallingUriPermission(Uri uri, int modeFlags) {
        return super.checkCallingUriPermission(uri, modeFlags);
    }

    @androidx.annotation.NonNull
    @Override
    public int[] checkCallingUriPermissions(@androidx.annotation.NonNull List<Uri> uris, int modeFlags) {
        return super.checkCallingUriPermissions(uris, modeFlags);
    }

    @Override
    public int checkContentUriPermissionFull(@androidx.annotation.NonNull Uri uri, int pid, int uid, int modeFlags) {
        return super.checkContentUriPermissionFull(uri, pid, uid, modeFlags);
    }

    @Override
    public int checkPermission(String permission, int pid, int uid) {
        return super.checkPermission(permission, pid, uid);
    }

    @Override
    public int checkSelfPermission(String permission) {
        return super.checkSelfPermission(permission);
    }

    @Override
    public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) {
        return super.checkUriPermission(uri, pid, uid, modeFlags);
    }

    @Override
    public int checkUriPermission(@androidx.annotation.Nullable Uri uri, @androidx.annotation.Nullable String readPermission, @androidx.annotation.Nullable String writePermission, int pid, int uid, int modeFlags) {
        return super.checkUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags);
    }

    @androidx.annotation.NonNull
    @Override
    public int[] checkUriPermissions(@androidx.annotation.NonNull List<Uri> uris, int pid, int uid, int modeFlags) {
        return super.checkUriPermissions(uris, pid, uid, modeFlags);
    }

    @Override
    public void clearWallpaper() throws IOException {
        super.clearWallpaper();
    }

    @androidx.annotation.NonNull
    @Override
    public Context createAttributionContext(@androidx.annotation.Nullable String attributionTag) {
        return super.createAttributionContext(attributionTag);
    }

    @Override
    public Context createConfigurationContext(Configuration overrideConfiguration) {
        return super.createConfigurationContext(overrideConfiguration);
    }

    @androidx.annotation.NonNull
    @Override
    public Context createContext(@androidx.annotation.NonNull ContextParams contextParams) {
        return super.createContext(contextParams);
    }

    @Override
    public Context createContextForSplit(String splitName) throws PackageManager.NameNotFoundException {
        return super.createContextForSplit(splitName);
    }

    @androidx.annotation.NonNull
    @Override
    public Context createDeviceContext(int deviceId) {
        return super.createDeviceContext(deviceId);
    }

    @Override
    public Context createDeviceProtectedStorageContext() {
        return super.createDeviceProtectedStorageContext();
    }

    @Override
    public Context createDisplayContext(Display display) {
        return super.createDisplayContext(display);
    }

    @Override
    public Context createPackageContext(String packageName, int flags) throws PackageManager.NameNotFoundException {
        return super.createPackageContext(packageName, flags);
    }

    @androidx.annotation.NonNull
    @Override
    public Context createWindowContext(@androidx.annotation.NonNull Display display, int type, @androidx.annotation.Nullable Bundle options) {
        return super.createWindowContext(display, type, options);
    }

    @androidx.annotation.NonNull
    @Override
    public Context createWindowContext(int type, @androidx.annotation.Nullable Bundle options) {
        return super.createWindowContext(type, options);
    }

    @Override
    public String[] databaseList() {
        return super.databaseList();
    }

    @Override
    public boolean deleteDatabase(String name) {
        return super.deleteDatabase(name);
    }

    @Override
    public boolean deleteFile(String name) {
        return super.deleteFile(name);
    }

    @Override
    public boolean deleteSharedPreferences(String name) {
        return super.deleteSharedPreferences(name);
    }

    @Override
    public void enforceCallingOrSelfPermission(String permission, @androidx.annotation.Nullable String message) {
        super.enforceCallingOrSelfPermission(permission, message);
    }

    @Override
    public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) {
        super.enforceCallingOrSelfUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforceCallingPermission(String permission, @androidx.annotation.Nullable String message) {
        super.enforceCallingPermission(permission, message);
    }

    @Override
    public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) {
        super.enforceCallingUriPermission(uri, modeFlags, message);
    }

    @Override
    public void enforcePermission(String permission, int pid, int uid, @androidx.annotation.Nullable String message) {
        super.enforcePermission(permission, pid, uid, message);
    }

    @Override
    public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) {
        super.enforceUriPermission(uri, pid, uid, modeFlags, message);
    }

    @Override
    public void enforceUriPermission(@androidx.annotation.Nullable Uri uri, @androidx.annotation.Nullable String readPermission, @androidx.annotation.Nullable String writePermission, int pid, int uid, int modeFlags, @androidx.annotation.Nullable String message) {
        super.enforceUriPermission(uri, readPermission, writePermission, pid, uid, modeFlags, message);
    }

    @Override
    public String[] fileList() {
        return super.fileList();
    }

    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override
    public ApplicationInfo getApplicationInfo() {
        return super.getApplicationInfo();
    }

    @androidx.annotation.NonNull
    @Override
    public AttributionSource getAttributionSource() {
        return super.getAttributionSource();
    }

    @androidx.annotation.Nullable
    @Override
    public String getAttributionTag() {
        return super.getAttributionTag();
    }

    @Override
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override
    public File getCacheDir() {
        return super.getCacheDir();
    }

    @Override
    public ClassLoader getClassLoader() {
        return super.getClassLoader();
    }

    @Override
    public File getCodeCacheDir() {
        return super.getCodeCacheDir();
    }

    @Override
    public ContentResolver getContentResolver() {
        return super.getContentResolver();
    }

    @Override
    public File getDataDir() {
        return super.getDataDir();
    }

    @Override
    public File getDatabasePath(String name) {
        return super.getDatabasePath(name);
    }

    @Override
    public int getDeviceId() {
        return super.getDeviceId();
    }

    @Override
    public File getDir(String name, int mode) {
        return super.getDir(name, mode);
    }

    @androidx.annotation.Nullable
    @Override
    public Display getDisplay() {
        return super.getDisplay();
    }

    @androidx.annotation.Nullable
    @Override
    public File getExternalCacheDir() {
        return super.getExternalCacheDir();
    }

    @Override
    public File[] getExternalCacheDirs() {
        return super.getExternalCacheDirs();
    }

    @androidx.annotation.Nullable
    @Override
    public File getExternalFilesDir(@androidx.annotation.Nullable String type) {
        return super.getExternalFilesDir(type);
    }

    @Override
    public File[] getExternalFilesDirs(String type) {
        return super.getExternalFilesDirs(type);
    }

    @Override
    public File[] getExternalMediaDirs() {
        return super.getExternalMediaDirs();
    }

    @Override
    public File getFileStreamPath(String name) {
        return super.getFileStreamPath(name);
    }

    @Override
    public File getFilesDir() {
        return super.getFilesDir();
    }

    @Override
    public Executor getMainExecutor() {
        return super.getMainExecutor();
    }

    @Override
    public Looper getMainLooper() {
        return super.getMainLooper();
    }

    @Override
    public File getNoBackupFilesDir() {
        return super.getNoBackupFilesDir();
    }

    @Override
    public File getObbDir() {
        return super.getObbDir();
    }

    @Override
    public File[] getObbDirs() {
        return super.getObbDirs();
    }

    @Override
    public String getOpPackageName() {
        return super.getOpPackageName();
    }

    @Override
    public String getPackageCodePath() {
        return super.getPackageCodePath();
    }

    @Override
    public PackageManager getPackageManager() {
        return super.getPackageManager();
    }

    @Override
    public String getPackageName() {
        return super.getPackageName();
    }

    @Override
    public String getPackageResourcePath() {
        return super.getPackageResourcePath();
    }

    @androidx.annotation.Nullable
    @Override
    public ContextParams getParams() {
        return super.getParams();
    }

    @Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return super.getSharedPreferences(name, mode);
    }

    @Override
    public String getSystemServiceName(Class<?> serviceClass) {
        return super.getSystemServiceName(serviceClass);
    }

    @Override
    public Drawable getWallpaper() {
        return super.getWallpaper();
    }

    @Override
    public int getWallpaperDesiredMinimumHeight() {
        return super.getWallpaperDesiredMinimumHeight();
    }

    @Override
    public int getWallpaperDesiredMinimumWidth() {
        return super.getWallpaperDesiredMinimumWidth();
    }

    @Override
    public void grantUriPermission(String toPackage, Uri uri, int modeFlags) {
        super.grantUriPermission(toPackage, uri, modeFlags);
    }

    @Override
    public boolean isDeviceProtectedStorage() {
        return super.isDeviceProtectedStorage();
    }

    @Override
    public boolean isRestricted() {
        return super.isRestricted();
    }

    @Override
    public boolean isUiContext() {
        return super.isUiContext();
    }

    @Override
    public boolean moveDatabaseFrom(Context sourceContext, String name) {
        return super.moveDatabaseFrom(sourceContext, name);
    }

    @Override
    public boolean moveSharedPreferencesFrom(Context sourceContext, String name) {
        return super.moveSharedPreferencesFrom(sourceContext, name);
    }

    @Override
    public FileInputStream openFileInput(String name) throws FileNotFoundException {
        return super.openFileInput(name);
    }

    @Override
    public FileOutputStream openFileOutput(String name, int mode) throws FileNotFoundException {
        return super.openFileOutput(name, mode);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory) {
        return super.openOrCreateDatabase(name, mode, factory);
    }

    @Override
    public SQLiteDatabase openOrCreateDatabase(String name, int mode, SQLiteDatabase.CursorFactory factory, @androidx.annotation.Nullable DatabaseErrorHandler errorHandler) {
        return super.openOrCreateDatabase(name, mode, factory, errorHandler);
    }

    @Override
    public Drawable peekWallpaper() {
        return super.peekWallpaper();
    }

    @Override
    public void rebindService(@androidx.annotation.NonNull ServiceConnection conn, @androidx.annotation.NonNull BindServiceFlags flags) {
        super.rebindService(conn, flags);
    }

    @Override
    public void registerDeviceIdChangeListener(@androidx.annotation.NonNull Executor executor, @androidx.annotation.NonNull IntConsumer listener) {
        super.registerDeviceIdChangeListener(executor, listener);
    }

    @Override
    public Intent registerReceiver(@androidx.annotation.Nullable BroadcastReceiver receiver, IntentFilter filter) {
        return super.registerReceiver(receiver, filter);
    }

    @Override
    public Intent registerReceiver(@androidx.annotation.Nullable BroadcastReceiver receiver, IntentFilter filter, int flags) {
        return super.registerReceiver(receiver, filter, flags);
    }

    @Override
    public Intent registerReceiver(@androidx.annotation.Nullable BroadcastReceiver receiver, IntentFilter filter, @androidx.annotation.Nullable String broadcastPermission, @androidx.annotation.Nullable Handler scheduler) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler);
    }

    @Override
    public Intent registerReceiver(@androidx.annotation.Nullable BroadcastReceiver receiver, IntentFilter filter, @androidx.annotation.Nullable String broadcastPermission, @androidx.annotation.Nullable Handler scheduler, int flags) {
        return super.registerReceiver(receiver, filter, broadcastPermission, scheduler, flags);
    }
    /*
    @Override
    public void removeStickyBroadcast(Intent intent) {
        super.removeStickyBroadcast(intent);
    }

    @Override
    public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) {
        super.removeStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void revokeSelfPermissionsOnKill(@androidx.annotation.NonNull Collection<String> permissions) {
        super.revokeSelfPermissionsOnKill(permissions);
    }

    @Override
    public void revokeUriPermission(Uri uri, int modeFlags) {
        super.revokeUriPermission(uri, modeFlags);
    }

    @Override
    public void revokeUriPermission(String targetPackage, Uri uri, int modeFlags) {
        super.revokeUriPermission(targetPackage, uri, modeFlags);
    }

    @Override
    public void sendBroadcast(Intent intent) {
        super.sendBroadcast(intent);
    }

    @Override
    public void sendBroadcast(Intent intent, @androidx.annotation.Nullable String receiverPermission) {
        super.sendBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendBroadcast(@androidx.annotation.NonNull Intent intent, @androidx.annotation.Nullable String receiverPermission, @androidx.annotation.Nullable Bundle options) {
        super.sendBroadcast(intent, receiverPermission, options);
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user) {
        super.sendBroadcastAsUser(intent, user);
    }

    @Override
    public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission) {
        super.sendBroadcastAsUser(intent, user, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(@androidx.annotation.NonNull Intent intent, int initialCode, @androidx.annotation.Nullable String receiverPermission, @androidx.annotation.Nullable String receiverAppOp, @androidx.annotation.Nullable BroadcastReceiver resultReceiver, @androidx.annotation.Nullable Handler scheduler, @androidx.annotation.Nullable String initialData, @androidx.annotation.Nullable Bundle initialExtras, @androidx.annotation.Nullable Bundle options) {
        super.sendOrderedBroadcast(intent, initialCode, receiverPermission, receiverAppOp, resultReceiver, scheduler, initialData, initialExtras, options);
    }

    @Override
    public void sendOrderedBroadcast(Intent intent, @androidx.annotation.Nullable String receiverPermission) {
        super.sendOrderedBroadcast(intent, receiverPermission);
    }

    @Override
    public void sendOrderedBroadcast(Intent intent, @androidx.annotation.Nullable String receiverPermission, @androidx.annotation.Nullable BroadcastReceiver resultReceiver, @androidx.annotation.Nullable Handler scheduler, int initialCode, @androidx.annotation.Nullable String initialData, @androidx.annotation.Nullable Bundle initialExtras) {
        super.sendOrderedBroadcast(intent, receiverPermission, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    @Override
    public void sendOrderedBroadcast(@androidx.annotation.NonNull Intent intent, @androidx.annotation.Nullable String receiverPermission, @androidx.annotation.Nullable Bundle options) {
        super.sendOrderedBroadcast(intent, receiverPermission, options);
    }

    @Override
    public void sendOrderedBroadcast(@androidx.annotation.NonNull Intent intent, @androidx.annotation.Nullable String receiverPermission, @androidx.annotation.Nullable Bundle options, @androidx.annotation.Nullable BroadcastReceiver resultReceiver, @androidx.annotation.Nullable Handler scheduler, int initialCode, @androidx.annotation.Nullable String initialData, @androidx.annotation.Nullable Bundle initialExtras) {
        super.sendOrderedBroadcast(intent, receiverPermission, options, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    @Override
    public void sendOrderedBroadcast(@androidx.annotation.NonNull Intent intent, @androidx.annotation.Nullable String receiverPermission, @androidx.annotation.Nullable String receiverAppOp, @androidx.annotation.Nullable BroadcastReceiver resultReceiver, @androidx.annotation.Nullable Handler scheduler, int initialCode, @androidx.annotation.Nullable String initialData, @androidx.annotation.Nullable Bundle initialExtras) {
        super.sendOrderedBroadcast(intent, receiverPermission, receiverAppOp, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    @Override
    public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, @androidx.annotation.Nullable String receiverPermission, @androidx.annotation.Nullable BroadcastReceiver resultReceiver, @androidx.annotation.Nullable Handler scheduler, int initialCode, @androidx.annotation.Nullable String initialData, @androidx.annotation.Nullable Bundle initialExtras) {
        super.sendOrderedBroadcastAsUser(intent, user, receiverPermission, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }

    @Override
    public void sendStickyBroadcast(Intent intent) {
        super.sendStickyBroadcast(intent);
    }

    @Override
    public void sendStickyBroadcast(@androidx.annotation.NonNull Intent intent, @androidx.annotation.Nullable Bundle options) {
        super.sendStickyBroadcast(intent, options);
    }

    @Override
    public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) {
        super.sendStickyBroadcastAsUser(intent, user);
    }

    @Override
    public void sendStickyOrderedBroadcast(Intent intent, @androidx.annotation.Nullable BroadcastReceiver resultReceiver, @Nullable Handler scheduler, int initialCode, @Nullable String initialData, @Nullable Bundle initialExtras) {
        super.sendStickyOrderedBroadcast(intent, resultReceiver, scheduler, initialCode, initialData, initialExtras);
    }
    */
}