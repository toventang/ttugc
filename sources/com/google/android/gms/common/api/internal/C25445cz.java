package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.p1946e.HandlerC25734g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cz */
public final class C25445cz extends Fragment implements AbstractC25458j {

    /* renamed from: c */
    private static WeakHashMap<ActivityC0945e, WeakReference<C25445cz>> f60397c = new WeakHashMap<>();

    /* renamed from: a */
    int f60398a = 0;

    /* renamed from: b */
    Bundle f60399b;

    /* renamed from: d */
    private Map<String, LifecycleCallback> f60400d = new C0484a();

    @Override // com.google.android.gms.common.api.internal.AbstractC25458j
    /* renamed from: a */
    public final /* synthetic */ Activity mo41669a() {
        return getActivity();
    }

    static {
        Covode.recordClassIndex(30844);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f60398a = 5;
        Iterator<LifecycleCallback> it = this.f60400d.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f60398a = 3;
        for (LifecycleCallback lifecycleCallback : this.f60400d.values()) {
            lifecycleCallback.mo41558c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f60398a = 2;
        for (LifecycleCallback lifecycleCallback : this.f60400d.values()) {
            lifecycleCallback.mo41556b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f60398a = 4;
        for (LifecycleCallback lifecycleCallback : this.f60400d.values()) {
            lifecycleCallback.mo41559d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f60398a = 1;
        this.f60399b = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f60400d.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.mo41554a(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry<String, LifecycleCallback> entry : this.f60400d.entrySet()) {
                Bundle bundle2 = new Bundle();
                entry.getValue().mo41557b(bundle2);
                bundle.putBundle(entry.getKey(), bundle2);
            }
        }
    }

    /* renamed from: a */
    public static C25445cz m49065a(ActivityC0945e eVar) {
        C25445cz czVar;
        WeakReference<C25445cz> weakReference = f60397c.get(eVar);
        if (weakReference != null && (czVar = weakReference.get()) != null) {
            return czVar;
        }
        try {
            C25445cz czVar2 = (C25445cz) eVar.getSupportFragmentManager().mo3551a("SupportLifecycleFragmentImpl");
            if (czVar2 == null || czVar2.isRemoving()) {
                czVar2 = new C25445cz();
                eVar.getSupportFragmentManager().mo3552a().mo3456a(czVar2, "SupportLifecycleFragmentImpl").mo3473c();
            }
            f60397c.put(eVar, new WeakReference<>(czVar2));
            return czVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25458j
    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo41670a(String str, Class<T> cls) {
        return cls.cast(this.f60400d.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC25458j
    /* renamed from: a */
    public final void mo41671a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f60400d.containsKey(str)) {
            this.f60400d.put(str, lifecycleCallback);
            if (this.f60398a > 0) {
                new HandlerC25734g(Looper.getMainLooper()).post(new RunnableC25444cy(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f60400d.values()) {
            lifecycleCallback.mo41553a(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f60400d.values()) {
            lifecycleCallback.mo41555a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
