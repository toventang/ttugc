package com.bytedance.als;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1205n;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.als.j */
public abstract class AbstractC2562j<T extends AbstractC2547b> implements AbstractC1204m {
    private final C1205n lifecycle = new C1205n(this);

    static {
        Covode.recordClassIndex(2947);
    }

    public abstract T getApiComponent();

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        return this.lifecycle;
    }

    public void onCreate() {
        this.lifecycle.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
    }

    public void onDestroy() {
        this.lifecycle.mo4016a(AbstractC1196i.EnumC1198a.ON_DESTROY);
    }

    public void onPause() {
        this.lifecycle.mo4016a(AbstractC1196i.EnumC1198a.ON_PAUSE);
    }

    public void onResume() {
        this.lifecycle.mo4016a(AbstractC1196i.EnumC1198a.ON_RESUME);
    }

    public void onStart() {
        this.lifecycle.mo4016a(AbstractC1196i.EnumC1198a.ON_START);
    }

    public void onStop() {
        this.lifecycle.mo4016a(AbstractC1196i.EnumC1198a.ON_STOP);
    }
}
