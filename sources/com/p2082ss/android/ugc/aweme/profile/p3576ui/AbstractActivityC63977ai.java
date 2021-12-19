package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ai */
abstract class AbstractActivityC63977ai extends ActivityC17312a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f145089a;

    /* renamed from: b */
    private final Object f145090b = new Object();

    static {
        Covode.recordClassIndex(75421);
    }

    AbstractActivityC63977ai() {
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m115691a().generatedComponent();
    }

    /* renamed from: a */
    private C88107a m115691a() {
        if (this.f145089a == null) {
            synchronized (this.f145090b) {
                if (this.f145089a == null) {
                    this.f145089a = new C88107a(this);
                }
            }
        }
        return this.f145089a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        ((AbstractC64023bi) generatedComponent()).mo60007a((ProfileEditActivity) this);
        super.onCreate(bundle);
    }
}
