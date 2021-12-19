package com.p2082ss.android.ugc.aweme.main;

import android.os.Bundle;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.android.internal.p4539b.C88098a;
import dagger.hilt.p4536a.AbstractC88084b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.main.h */
public abstract class AbstractActivityC59100h extends ActivityC17312a implements AbstractC88084b<Object> {
    private volatile C88107a componentManager;
    private final Object componentManagerLock = new Object();

    static {
        Covode.recordClassIndex(69450);
    }

    /* access modifiers changed from: protected */
    public void inject() {
        generatedComponent();
    }

    /* access modifiers changed from: protected */
    public C88107a createComponentManager() {
        return new C88107a(this);
    }

    AbstractActivityC59100h() {
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    public C1175ad.AbstractC1177b getDefaultViewModelProviderFactory() {
        C1175ad.AbstractC1177b a = C88098a.m153168a(this);
        if (a != null) {
            return a;
        }
        return new C1175ad.C1179d();
    }

    /* access modifiers changed from: protected */
    public final C88107a componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                if (this.componentManager == null) {
                    this.componentManager = createComponentManager();
                }
            }
        }
        return this.componentManager;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        inject();
        super.onCreate(bundle);
    }
}
