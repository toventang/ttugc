package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ak */
abstract class AbstractActivityC63979ak extends ActivityC17312a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f145094a;

    /* renamed from: b */
    private final Object f145095b = new Object();

    static {
        Covode.recordClassIndex(75423);
    }

    AbstractActivityC63979ak() {
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m115695a().generatedComponent();
    }

    /* renamed from: a */
    private C88107a m115695a() {
        if (this.f145094a == null) {
            synchronized (this.f145095b) {
                if (this.f145094a == null) {
                    this.f145094a = new C88107a(this);
                }
            }
        }
        return this.f145094a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
