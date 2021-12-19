package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1183ag;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.C1182af;
import androidx.lifecycle.C1205n;
import androidx.lifecycle.FragmentC1220x;
import androidx.p012a.p013a.p015b.C0182b;
import androidx.savedstate.AbstractC1549c;
import androidx.savedstate.C1545a;
import androidx.savedstate.C1548b;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.activity.b */
public final class ActivityC0192b extends ActivityC0580d implements AbstractC0195d, AbstractC1183ag, AbstractC1549c {

    /* renamed from: a */
    private final C1205n f505a;

    /* renamed from: b */
    private final C1548b f506b;

    /* renamed from: c */
    private C1182af f507c;

    /* renamed from: d */
    private final OnBackPressedDispatcher f508d;

    /* renamed from: e */
    private int f509e;

    static {
        Covode.recordClassIndex(221);
    }

    /* renamed from: androidx.activity.b$a */
    static final class C0193a {

        /* renamed from: a */
        Object f510a;

        /* renamed from: b */
        C1182af f511b;

        static {
            Covode.recordClassIndex(222);
        }

        C0193a() {
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.f505a;
    }

    @Override // androidx.savedstate.AbstractC1549c
    /* renamed from: a */
    public final C1545a mo368a() {
        return this.f506b.f5091b;
    }

    public final Object onRetainNonConfigurationInstance() {
        C0193a aVar;
        C1182af afVar = this.f507c;
        if (afVar == null && (aVar = (C0193a) getLastNonConfigurationInstance()) != null) {
            afVar = aVar.f511b;
        }
        if (afVar == null) {
            return null;
        }
        C0193a aVar2 = new C0193a();
        aVar2.f510a = null;
        aVar2.f511b = afVar;
        return aVar2;
    }

    @Override // androidx.lifecycle.AbstractC1183ag
    public final C1182af getViewModelStore() {
        if (getApplication() != null) {
            if (this.f507c == null) {
                C0193a aVar = (C0193a) getLastNonConfigurationInstance();
                if (aVar != null) {
                    this.f507c = aVar.f511b;
                }
                if (this.f507c == null) {
                    this.f507c = new C1182af();
                }
            }
            return this.f507c;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void onBackPressed() {
        OnBackPressedDispatcher onBackPressedDispatcher = this.f508d;
        Iterator<AbstractC0194c> descendingIterator = onBackPressedDispatcher.f498b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().f512a) {
                return;
            }
        }
        if (onBackPressedDispatcher.f497a != null) {
            onBackPressedDispatcher.f497a.run();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1548b bVar = this.f506b;
        AbstractC1196i lifecycle = bVar.f5090a.getLifecycle();
        if (lifecycle.mo4011a() == AbstractC1196i.EnumC1199b.INITIALIZED) {
            lifecycle.mo4012a(new Recreator(bVar.f5090a));
            C1545a aVar = bVar.f5091b;
            if (!aVar.f5088c) {
                if (bundle != null) {
                    aVar.f5087b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                lifecycle.mo4012a(new SavedStateRegistry$1(aVar));
                aVar.f5088c = true;
                FragmentC1220x.m3926a(this);
                int i = this.f509e;
                if (i != 0) {
                    setContentView(i);
                    return;
                }
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    @Override // androidx.core.app.ActivityC0580d
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC1196i lifecycle = getLifecycle();
        if (lifecycle instanceof C1205n) {
            ((C1205n) lifecycle).mo4018b(AbstractC1196i.EnumC1199b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        C1545a aVar = this.f506b.f5091b;
        Bundle bundle2 = new Bundle();
        if (aVar.f5087b != null) {
            bundle2.putAll(aVar.f5087b);
        }
        C0182b<K, V>.C0186d a = aVar.f5086a.mo346a();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            bundle2.putBundle((String) entry.getKey(), ((C1545a.AbstractC1547b) entry.getValue()).mo5113a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
