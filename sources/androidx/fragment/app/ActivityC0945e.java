package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.core.app.AbstractC0618p;
import androidx.core.app.ActivityC0580d;
import androidx.core.app.C0569a;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1182af;
import androidx.loader.app.AbstractC1247a;
import androidx.p025c.C0498h;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.e */
public class ActivityC0945e extends ActivityC0580d implements C0569a.AbstractC0571a, C0569a.AbstractC0573c, AbstractC1183ag {
    boolean mCreated;
    final C0950g mFragments = new C0950g(new C0947a());
    final Handler mHandler = new Handler() {
        /* class androidx.fragment.app.ActivityC0945e.HandlerC09461 */

        static {
            Covode.recordClassIndex(1039);
        }

        public final void handleMessage(Message message) {
            if (message.what != 2) {
                super.handleMessage(message);
                return;
            }
            ActivityC0945e.this.onResumeFragments();
            ActivityC0945e.this.mFragments.mo3547b();
        }
    };
    int mNextCandidateRequestIndex;
    C0498h<String> mPendingFragmentActivityResults;
    boolean mRequestedPermissionsFromFragment;
    boolean mResumed;
    boolean mStartedActivityFromFragment;
    boolean mStartedIntentSenderFromFragment;
    boolean mStopped = true;
    private C1182af mViewModelStore;

    static {
        Covode.recordClassIndex(1038);
    }

    /* renamed from: androidx_fragment_app_FragmentActivity_com_ss_android_ugc_aweme_lancet_LogLancet_w */
    public static int m3192x1579905d(String str, String str2) {
        return 0;
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* renamed from: androidx.fragment.app.e$a */
    class C0947a extends AbstractC0951h<ActivityC0945e> {
        static {
            Covode.recordClassIndex(1040);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: g */
        public final /* bridge */ /* synthetic */ ActivityC0945e mo3544g() {
            return ActivityC0945e.this;
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: d */
        public final void mo3541d() {
            ActivityC0945e.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: b */
        public final boolean mo3539b() {
            if (!ActivityC0945e.this.isFinishing()) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: c */
        public final LayoutInflater mo3540c() {
            return ActivityC0945e.this.getLayoutInflater().cloneInContext(ActivityC0945e.this);
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: e */
        public final boolean mo3542e() {
            if (ActivityC0945e.this.getWindow() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: f */
        public final int mo3543f() {
            Window window = ActivityC0945e.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.AbstractC0951h, androidx.fragment.app.AbstractC0949f
        /* renamed from: a */
        public final boolean mo3432a() {
            Window window = ActivityC0945e.this.getWindow();
            if (window == null || window.peekDecorView() == null) {
                return false;
            }
            return true;
        }

        public C0947a() {
            super(ActivityC0945e.this);
        }

        @Override // androidx.fragment.app.AbstractC0951h, androidx.fragment.app.AbstractC0949f
        /* renamed from: a */
        public final View mo3430a(int i) {
            return ActivityC0945e.this.findViewById(i);
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: a */
        public final void mo3533a(Fragment fragment) {
            ActivityC0945e.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: a */
        public final boolean mo3538a(String str) {
            return C0569a.m2183a((Activity) ActivityC0945e.this, str);
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: a */
        public final void mo3536a(Fragment fragment, String[] strArr, int i) {
            ActivityC0945e.this.requestPermissionsFromFragment(fragment, strArr, i);
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: a */
        public final void mo3537a(String str, PrintWriter printWriter, String[] strArr) {
            ActivityC0945e.this.dump(str, null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: a */
        public final void mo3534a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            ActivityC0945e.this.startActivityFromFragment(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.AbstractC0951h
        /* renamed from: a */
        public final void mo3535a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
            ActivityC0945e.this.startIntentSenderFromFragment(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    /* renamed from: androidx.fragment.app.e$b */
    static final class C0948b {

        /* renamed from: a */
        Object f3377a;

        /* renamed from: b */
        C1182af f3378b;

        /* renamed from: c */
        C0973k f3379c;

        static {
            Covode.recordClassIndex(1041);
        }

        C0948b() {
        }
    }

    public void supportFinishAfterTransition() {
        C0569a.m2179a((Activity) this);
    }

    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0569a.m2184b((Activity) this);
    }

    public void supportStartPostponedEnterTransition() {
        C0569a.m2185c(this);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return super.getLifecycle();
    }

    public AbstractC0952i getSupportFragmentManager() {
        return this.mFragments.f3380a.f3385e;
    }

    public AbstractC1247a getSupportLoaderManager() {
        return AbstractC1247a.m3990a(this);
    }

    public void onStateNotSaved() {
        this.mFragments.mo3546a();
    }

    private void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), AbstractC1196i.EnumC1199b.CREATED));
    }

    public Object getLastCustomNonConfigurationInstance() {
        C0948b bVar = (C0948b) getLastNonConfigurationInstance();
        if (bVar != null) {
            return bVar.f3377a;
        }
        return null;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.f3380a.f3385e.mo3622s();
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        this.mFragments.f3380a.f3385e.mo3619p();
    }

    public void onBackPressed() {
        LayoutInflater$Factory2C0956j jVar = this.mFragments.f3380a.f3385e;
        if (jVar.mo3567h()) {
            if (Build.VERSION.SDK_INT <= 25) {
                return;
            }
        } else if (jVar.mo3563d()) {
            return;
        }
        super.onBackPressed();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.mViewModelStore != null && !isChangingConfigurations()) {
            this.mViewModelStore.mo3997a();
        }
        this.mFragments.f3380a.f3385e.mo3621r();
    }

    public void onPostResume() {
        super.onPostResume();
        this.mHandler.removeMessages(2);
        onResumeFragments();
        this.mFragments.mo3547b();
    }

    public void onResume() {
        super.onResume();
        this.mHandler.sendEmptyMessage(2);
        this.mResumed = true;
        this.mFragments.mo3547b();
    }

    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.f3380a.f3385e.mo3620q();
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public C1182af getViewModelStore() {
        if (getApplication() != null) {
            if (this.mViewModelStore == null) {
                C0948b bVar = (C0948b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.mViewModelStore = bVar.f3378b;
                }
                if (this.mViewModelStore == null) {
                    this.mViewModelStore = new C1182af();
                }
            }
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onPause() {
        super.onPause();
        this.mResumed = false;
        if (this.mHandler.hasMessages(2)) {
            this.mHandler.removeMessages(2);
            onResumeFragments();
        }
        this.mFragments.f3380a.f3385e.mo3604d(3);
    }

    public final Object onRetainNonConfigurationInstance() {
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        LayoutInflater$Factory2C0956j jVar = this.mFragments.f3380a.f3385e;
        LayoutInflater$Factory2C0956j.m3265a(jVar.f3395D);
        C0973k kVar = jVar.f3395D;
        if (kVar == null && this.mViewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0948b bVar = new C0948b();
        bVar.f3377a = onRetainCustomNonConfigurationInstance;
        bVar.f3378b = this.mViewModelStore;
        bVar.f3379c = kVar;
        return bVar;
    }

    public void onStart() {
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.f3380a.f3385e.mo3615n();
        }
        this.mFragments.mo3546a();
        this.mFragments.mo3547b();
        this.mFragments.f3380a.f3385e.mo3616o();
    }

    static void checkForValidRequestCode(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.f3380a.f3385e.mo3592a(z);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.mFragments.mo3546a();
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.f3380a.f3385e.mo3601b(z);
    }

    @Override // androidx.core.app.C0569a.AbstractC0573c
    public final void validateRequestPermissionsRequestCode(int i) {
        if (!this.mRequestedPermissionsFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mFragments.mo3546a();
        this.mFragments.f3380a.f3385e.mo3585a(configuration);
    }

    public void setEnterSharedElementCallback(AbstractC0618p pVar) {
        C0569a.SharedElementCallbackC0574d dVar;
        if (Build.VERSION.SDK_INT >= 21) {
            if (pVar != null) {
                dVar = new C0569a.SharedElementCallbackC0574d(pVar);
            } else {
                dVar = null;
            }
            setEnterSharedElementCallback(dVar);
        }
    }

    public void setExitSharedElementCallback(AbstractC0618p pVar) {
        C0569a.SharedElementCallbackC0574d dVar;
        if (Build.VERSION.SDK_INT >= 21) {
            if (pVar != null) {
                dVar = new C0569a.SharedElementCallbackC0574d(pVar);
            } else {
                dVar = null;
            }
            setExitSharedElementCallback(dVar);
        }
    }

    private int allocateRequestIndex(Fragment fragment) {
        if (this.mPendingFragmentActivityResults.mo2184b() < 65534) {
            while (this.mPendingFragmentActivityResults.mo2191e(this.mNextCandidateRequestIndex) >= 0) {
                this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            }
            int i = this.mNextCandidateRequestIndex;
            this.mPendingFragmentActivityResults.mo2186b(i, fragment.mWho);
            this.mNextCandidateRequestIndex = (this.mNextCandidateRequestIndex + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    @Override // androidx.core.app.ActivityC0580d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        markFragmentsCreated();
        Parcelable k = this.mFragments.f3380a.f3385e.mo3612k();
        if (k != null) {
            bundle.putParcelable("android:support:fragments", k);
        }
        if (this.mPendingFragmentActivityResults.mo2184b() > 0) {
            bundle.putInt("android:support:next_request_index", this.mNextCandidateRequestIndex);
            int[] iArr = new int[this.mPendingFragmentActivityResults.mo2184b()];
            String[] strArr = new String[this.mPendingFragmentActivityResults.mo2184b()];
            for (int i = 0; i < this.mPendingFragmentActivityResults.mo2184b(); i++) {
                iArr[i] = this.mPendingFragmentActivityResults.mo2187c(i);
                strArr[i] = this.mPendingFragmentActivityResults.mo2190d(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    @Override // androidx.core.app.ActivityC0580d
    public void onCreate(Bundle bundle) {
        C0950g gVar = this.mFragments;
        LayoutInflater$Factory2C0956j jVar = gVar.f3380a.f3385e;
        AbstractC0951h<?> hVar = gVar.f3380a;
        AbstractC0951h<?> hVar2 = gVar.f3380a;
        C0973k kVar = null;
        jVar.mo3590a(hVar, hVar2, (Fragment) null);
        super.onCreate(bundle);
        C0948b bVar = (C0948b) getLastNonConfigurationInstance();
        if (!(bVar == null || bVar.f3378b == null || this.mViewModelStore != null)) {
            this.mViewModelStore = bVar.f3378b;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            C0950g gVar2 = this.mFragments;
            if (bVar != null) {
                kVar = bVar.f3379c;
            }
            gVar2.f3380a.f3385e.mo3586a(parcelable, kVar);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.mNextCandidateRequestIndex = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    m3192x1579905d("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.mPendingFragmentActivityResults = new C0498h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.mPendingFragmentActivityResults.mo2186b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.mPendingFragmentActivityResults == null) {
            this.mPendingFragmentActivityResults = new C0498h<>();
            this.mNextCandidateRequestIndex = 0;
        }
        this.mFragments.f3380a.f3385e.mo3614m();
    }

    /* access modifiers changed from: protected */
    public boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.f3380a.f3385e.mo3598b(menu);
        }
        super.onPanelClosed(i, menu);
    }

    public void startActivityForResult(Intent intent, int i) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i);
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        C0950g gVar = this.mFragments;
        return onCreatePanelMenu | gVar.f3380a.f3385e.mo3594a(menu, getMenuInflater());
    }

    private static boolean markState(AbstractC0952i iVar, AbstractC1196i.EnumC1199b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.mo3565f()) {
            if (fragment != null) {
                if (fragment.getLifecycle().mo4011a().isAtLeast(AbstractC1196i.EnumC1199b.STARTED)) {
                    fragment.mLifecycleRegistry.mo4017a(bVar);
                    z = true;
                }
                AbstractC0952i peekChildFragmentManager = fragment.peekChildFragmentManager();
                if (peekChildFragmentManager != null) {
                    z |= markState(peekChildFragmentManager, bVar);
                }
            }
        }
        return z;
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mFragments.f3380a.f3385e.mo3595a(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.mFragments.f3380a.f3385e.mo3602b(menuItem);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, null);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        return onPrepareOptionsPanel(view, menu) | this.mFragments.f3380a.f3385e.mo3593a(menu);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.mStartedActivityFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void requestPermissionsFromFragment(Fragment fragment, String[] strArr, int i) {
        if (i == -1) {
            C0569a.m2182a(this, strArr, i);
            return;
        }
        checkForValidRequestCode(i);
        try {
            this.mRequestedPermissionsFromFragment = true;
            C0569a.m2182a(this, strArr, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535));
            this.mRequestedPermissionsFromFragment = false;
        } catch (Throwable th) {
            this.mRequestedPermissionsFromFragment = false;
            throw th;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.mo3546a();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String a = this.mPendingFragmentActivityResults.mo2183a(i4, null);
            this.mPendingFragmentActivityResults.mo2185b(i4);
            if (a == null) {
                m3192x1579905d("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.mFragments.mo3545a(a);
            if (a2 == null) {
                m3192x1579905d("FragmentActivity", "Activity result no fragment exists for who: ".concat(String.valueOf(a)));
            } else {
                a2.onActivityResult(i & 65535, i2, intent);
            }
        } else {
            C0569a.AbstractC0572b bVar = C0569a.f2447a;
            if (bVar == null || !bVar.mo2554b()) {
                super.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // androidx.core.app.C0569a.AbstractC0571a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.mo3546a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String a = this.mPendingFragmentActivityResults.mo2183a(i3, null);
            this.mPendingFragmentActivityResults.mo2185b(i3);
            if (a == null) {
                m3192x1579905d("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment a2 = this.mFragments.mo3545a(a);
            if (a2 == null) {
                m3192x1579905d("FragmentActivity", "Activity result no fragment exists for who: ".concat(String.valueOf(a)));
            } else {
                a2.onRequestPermissionsResult(i & 65535, strArr, iArr);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f3380a.f3385e.onCreateView(view, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        return dispatchFragmentsOnCreateView;
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.mStartedActivityFromFragment = true;
        if (i == -1) {
            try {
                C0569a.m2180a(this, intent, -1, bundle);
            } finally {
                this.mStartedActivityFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0569a.m2180a(this, intent, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), bundle);
            this.mStartedActivityFromFragment = false;
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC1247a.m3990a(this).mo4100a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.f3380a.f3385e.mo3557a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (!this.mStartedIntentSenderFromFragment && i != -1) {
            checkForValidRequestCode(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.mStartedIntentSenderFromFragment = true;
        if (i == -1) {
            try {
                C0569a.m2181a(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.mStartedIntentSenderFromFragment = false;
            }
        } else {
            checkForValidRequestCode(i);
            C0569a.m2181a(this, intentSender, ((allocateRequestIndex(fragment) + 1) << 16) + (i & 65535), intent, i2, i3, i4, bundle);
            this.mStartedIntentSenderFromFragment = false;
        }
    }
}
