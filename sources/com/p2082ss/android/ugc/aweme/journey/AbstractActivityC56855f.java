package com.p2082ss.android.ugc.aweme.journey;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ActivityC36140cm;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.journey.f */
public abstract class AbstractActivityC56855f extends ActivityC36140cm implements AbstractC88084b<Object> {

    /* renamed from: f */
    private volatile C88107a f129464f;

    /* renamed from: g */
    private final Object f129465g = new Object();

    static {
        Covode.recordClassIndex(66740);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo93991b().generatedComponent();
    }

    /* renamed from: b */
    private C88107a mo93991b() {
        if (this.f129464f == null) {
            synchronized (this.f129465g) {
                if (this.f129464f == null) {
                    this.f129464f = new C88107a(this);
                }
            }
        }
        return this.f129464f;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.ActivityC36140cm, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
