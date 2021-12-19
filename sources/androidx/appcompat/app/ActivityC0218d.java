package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0214b;
import androidx.appcompat.view.AbstractC0274b;
import androidx.appcompat.widget.C0414aq;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0593g;
import androidx.core.app.C0620q;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.net.p3492e.C61339b;
import com.p2082ss.android.ugc.aweme.setting.TiktokSkinHelper;

/* renamed from: androidx.appcompat.app.d */
public class ActivityC0218d extends ActivityC0945e implements AbstractC0219e, C0620q.AbstractC0621a {
    private AbstractC0220f mDelegate;
    private Resources mResources;
    private int mThemeId;

    static {
        Covode.recordClassIndex(252);
    }

    public void AppCompatActivity__recreate$___twin___() {
        super.recreate();
    }

    public Resources getResources() {
        return m679x1675fa7a(this);
    }

    public void onPrepareSupportNavigateUpTaskStack(C0620q qVar) {
    }

    @Override // androidx.appcompat.app.AbstractC0219e
    public void onSupportActionModeFinished(AbstractC0274b bVar) {
    }

    @Override // androidx.appcompat.app.AbstractC0219e
    public void onSupportActionModeStarted(AbstractC0274b bVar) {
    }

    public void onSupportContentChanged() {
    }

    @Override // androidx.appcompat.app.AbstractC0219e
    public AbstractC0274b onWindowStartingSupportActionMode(AbstractC0274b.AbstractC0275a aVar) {
        return null;
    }

    public void recreate() {
        m680x39da057a(this);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m681x9a9e940a(this, i);
    }

    public void setSupportProgress(int i) {
    }

    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    public void setSupportProgressBarVisibility(boolean z) {
    }

    public void onContentChanged() {
        onSupportContentChanged();
    }

    @Override // androidx.core.app.C0620q.AbstractC0621a
    public Intent getSupportParentActivityIntent() {
        return C0593g.m2225a(this);
    }

    public void invalidateOptionsMenu() {
        getDelegate().mo528g();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo528g();
    }

    public C0214b.AbstractC0215a getDrawerToggleDelegate() {
        return getDelegate().mo530i();
    }

    public MenuInflater getMenuInflater() {
        return getDelegate().mo519b();
    }

    public AbstractC0211a getSupportActionBar() {
        return getDelegate().mo511a();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo529h();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo527f();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStart() {
        super.onStart();
        getDelegate().mo525d();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onStop() {
        super.onStop();
        getDelegate().mo526e();
    }

    public Resources AppCompatActivity__getResources$___twin___() {
        if (this.mResources == null && C0414aq.m1537a()) {
            this.mResources = new C0414aq(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public void closeOptionsMenu() {
        AbstractC0211a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo427g()) {
            super.closeOptionsMenu();
        }
    }

    public AbstractC0220f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = new LayoutInflater$Factory2C0221g(this, getWindow(), this);
        }
        return this.mDelegate;
    }

    public void openOptionsMenu() {
        AbstractC0211a supportActionBar = getSupportActionBar();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (supportActionBar == null || !supportActionBar.mo426f()) {
            super.openOptionsMenu();
        }
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
            C0620q qVar = new C0620q(this);
            onCreateSupportNavigateUpTaskStack(qVar);
            onPrepareSupportNavigateUpTaskStack(qVar);
            if (!qVar.f2618a.isEmpty()) {
                Intent[] intentArr = (Intent[]) qVar.f2618a.toArray(new Intent[qVar.f2618a.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                C0643b.m2373a(qVar.f2619b, intentArr, (Bundle) null);
                try {
                    int i = Build.VERSION.SDK_INT;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources */
    public static Resources m679x1675fa7a(ActivityC0218d dVar) {
        Resources AppCompatActivity__getResources$___twin___ = dVar.AppCompatActivity__getResources$___twin___();
        TiktokSkinHelper.m120292a(AppCompatActivity__getResources$___twin___);
        return AppCompatActivity__getResources$___twin___;
    }

    public void AppCompatActivity__setContentView$___twin___(int i) {
        getDelegate().mo520b(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        getDelegate().mo515a(view);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo517a(toolbar);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        this.mThemeId = i;
    }

    public void supportNavigateUpTo(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        navigateUpTo(intent);
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate */
    public static void m680x39da057a(ActivityC0218d dVar) {
        dVar.AppCompatActivity__recreate$___twin___();
        try {
            throw new RuntimeException("Activity recreated!");
        } catch (Exception e) {
            C13468b.m24210a(e);
        }
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().mo510a(i);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo523c();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getDelegate().mo521b(bundle);
    }

    public AbstractC0274b startSupportActionMode(AbstractC0274b.AbstractC0275a aVar) {
        return getDelegate().mo512a(aVar);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo524c(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        return shouldUpRecreateTask(intent);
    }

    @Override // androidx.core.app.ActivityC0580d
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0211a supportActionBar = getSupportActionBar();
        if (keyCode != 82 || supportActionBar == null || !supportActionBar.mo418a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo513a(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e
    public void onCreate(Bundle bundle) {
        AbstractC0220f delegate = getDelegate();
        delegate.mo531j();
        delegate.mo514a(bundle);
        if (delegate.mo532k() && this.mThemeId != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.mThemeId, false);
            } else {
                setTheme(this.mThemeId);
            }
        }
        super.onCreate(bundle);
    }

    public void onCreateSupportNavigateUpTaskStack(C0620q qVar) {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null || (supportParentActivityIntent = C0593g.m2225a(this)) != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(qVar.f2619b.getPackageManager());
            }
            qVar.mo2650a(component);
            qVar.f2618a.add(supportParentActivityIntent);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo522b(view, layoutParams);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo518a(charSequence);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().mo516a(view, layoutParams);
    }

    /* renamed from: androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_net_lancet_ViewInflateLancet_setContentView */
    public static void m681x9a9e940a(ActivityC0218d dVar, int i) {
        if (!C61339b.m111037a()) {
            dVar.AppCompatActivity__setContentView$___twin___(i);
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dVar.AppCompatActivity__setContentView$___twin___(i);
        C61339b.m111036a("set", i, SystemClock.elapsedRealtime() - elapsedRealtime, dVar);
    }

    private boolean performMenuItemShortcut(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0211a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.mo419b() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }
}
