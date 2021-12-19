package androidx.core.app;

import android.app.Activity;
import android.app.Fragment;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.p037h.C0775f;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1205n;
import androidx.lifecycle.FragmentC1220x;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.turbo.api.C79340b;
import java.lang.reflect.Field;

/* renamed from: androidx.core.app.d */
public class ActivityC0580d extends Activity implements C0775f.AbstractC0776a, AbstractC1204m {
    private C0497g<Class<? extends C0581a>, C0581a> mExtraDataMap = new C0497g<>();
    private C1205n mLifecycleRegistry = new C1205n(this);

    /* renamed from: androidx.core.app.d$a */
    public static class C0581a {
        static {
            Covode.recordClassIndex(659);
        }
    }

    static {
        Covode.recordClassIndex(658);
    }

    public void ComponentActivity__setRequestedOrientation$___twin___(int i) {
        super.setRequestedOrientation(i);
    }

    public void onCreate(Bundle bundle) {
        m2200xd430f068(this, bundle);
    }

    public void setRequestedOrientation(int i) {
        m2201x4bd18b7(this, i);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public AbstractC1196i getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public void ComponentActivity__onCreate$___twin___(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC1220x.m3926a(this);
    }

    @Override // androidx.core.p037h.C0775f.AbstractC0776a
    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends C0581a> T getExtraData(Class<T> cls) {
        return (T) this.mExtraDataMap.get(cls);
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.mLifecycleRegistry.mo4017a(AbstractC1196i.EnumC1199b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.c.g<java.lang.Class<? extends androidx.core.app.d$a>, androidx.core.app.d$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public void putExtraData(C0581a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0792v.m2755a(decorView, keyEvent)) {
            return C0775f.m2699a(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0792v.m2755a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* renamed from: androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation */
    public static void m2201x4bd18b7(ActivityC0580d dVar, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            dVar.ComponentActivity__setRequestedOrientation$___twin___(i);
            return;
        }
        TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(new int[]{16842840});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!z) {
            dVar.ComponentActivity__setRequestedOrientation$___twin___(i);
        }
    }

    /* renamed from: androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate */
    public static void m2200xd430f068(ActivityC0580d dVar, Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && SettingsManager.m29616a().mo25394a("fix_androidx_fragment", 0) == 1 && (parcelable = bundle.getParcelable("android:fragments")) != null) {
            Parcel obtain = Parcel.obtain();
            try {
                parcelable.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                FragmentManagerState createFromParcel = FragmentManagerState.CREATOR.createFromParcel(obtain);
                if (createFromParcel != null && createFromParcel.f3330a != null && createFromParcel.f3330a.length != 0) {
                    try {
                        FragmentState[] fragmentStateArr = createFromParcel.f3330a;
                        int length = fragmentStateArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                FragmentState fragmentState = fragmentStateArr[i];
                                if (fragmentState != null && !Fragment.class.isAssignableFrom(Class.forName(fragmentState.f3335a))) {
                                    bundle.putParcelable("android:fragments", null);
                                    break;
                                }
                                i++;
                            } else {
                                break;
                            }
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
            } finally {
                obtain.recycle();
            }
        }
        if (Build.VERSION.SDK_INT == 26) {
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(new int[]{16842840});
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            int requestedOrientation = dVar.getRequestedOrientation();
            obtainStyledAttributes.recycle();
            if (z && requestedOrientation != -1) {
                try {
                    Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                    declaredField.setAccessible(true);
                    ((ActivityInfo) declaredField.get(dVar)).screenOrientation = -1;
                    declaredField.setAccessible(false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        C79340b.m138147a().startNewPage(dVar.getClass().getName());
        dVar.ComponentActivity__onCreate$___twin___(bundle);
    }
}
