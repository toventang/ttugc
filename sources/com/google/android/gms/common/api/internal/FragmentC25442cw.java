package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1946e.HandlerC25734g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cw */
public final class FragmentC25442cw extends Fragment implements AbstractC25458j {

    /* renamed from: c */
    private static WeakHashMap<Activity, WeakReference<FragmentC25442cw>> f60387c = new WeakHashMap<>();

    /* renamed from: a */
    int f60388a = 0;

    /* renamed from: b */
    Bundle f60389b;

    /* renamed from: d */
    private Map<String, LifecycleCallback> f60390d = new C0484a();

    @Override // com.google.android.gms.common.api.internal.AbstractC25458j
    /* renamed from: a */
    public final Activity mo41669a() {
        return getActivity();
    }

    static {
        Covode.recordClassIndex(30841);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f60388a = 5;
        Iterator<LifecycleCallback> it = this.f60390d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f60388a = 3;
        for (LifecycleCallback lifecycleCallback : this.f60390d.values()) {
            lifecycleCallback.mo41558c();
        }
    }

    public final void onStart() {
        super.onStart();
        this.f60388a = 2;
        for (LifecycleCallback lifecycleCallback : this.f60390d.values()) {
            lifecycleCallback.mo41556b();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f60388a = 4;
        for (LifecycleCallback lifecycleCallback : this.f60390d.values()) {
            lifecycleCallback.mo41559d();
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f60388a = 1;
        this.f60389b = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f60390d.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.mo41554a(bundle2);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f60390d.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().mo41557b(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    /* renamed from: a */
    public static FragmentC25442cw m49061a(Activity activity) {
        FragmentC25442cw cwVar;
        WeakReference<FragmentC25442cw> weakReference = f60387c.get(activity);
        if (weakReference != null && (cwVar = weakReference.get()) != null) {
            return cwVar;
        }
        try {
            FragmentC25442cw cwVar2 = (FragmentC25442cw) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (cwVar2 == null || cwVar2.isRemoving()) {
                cwVar2 = new FragmentC25442cw();
                activity.getFragmentManager().beginTransaction().add(cwVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f60387c.put(activity, new WeakReference<>(cwVar2));
            return cwVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25458j
    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo41670a(String str, Class<T> cls) {
        return cls.cast(this.f60390d.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25458j
    /* renamed from: a */
    public final void mo41671a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f60390d.containsKey(str)) {
            this.f60390d.put(str, lifecycleCallback);
            if (this.f60388a > 0) {
                new HandlerC25734g(Looper.getMainLooper()).post(new RunnableC25443cx(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f60390d.values()) {
            lifecycleCallback.mo41553a(i, i2, intent);
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f60390d.values()) {
            lifecycleCallback.mo41555a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
