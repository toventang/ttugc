package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.ui.ak */
public abstract class AbstractActivityC41359ak extends ActivityC17312a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f96523a;

    /* renamed from: b */
    private final Object f96524b = new Object();

    static {
        Covode.recordClassIndex(49254);
    }

    AbstractActivityC41359ak() {
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo70603a().generatedComponent();
    }

    /* renamed from: a */
    private C88107a mo70603a() {
        if (this.f96523a == null) {
            synchronized (this.f96524b) {
                if (this.f96523a == null) {
                    this.f96523a = new C88107a(this);
                }
            }
        }
        return this.f96523a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
