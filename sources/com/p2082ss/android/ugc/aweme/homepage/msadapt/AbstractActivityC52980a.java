package com.p2082ss.android.ugc.aweme.homepage.msadapt;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.homepage.msadapt.a */
public abstract class AbstractActivityC52980a extends ActivityC17312a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f121829a;

    /* renamed from: b */
    private final Object f121830b = new Object();

    static {
        Covode.recordClassIndex(62515);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo89412a().generatedComponent();
    }

    /* renamed from: a */
    private C88107a mo89412a() {
        if (this.f121829a == null) {
            synchronized (this.f121830b) {
                if (this.f121829a == null) {
                    this.f121829a = new C88107a(this);
                }
            }
        }
        return this.f121829a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
