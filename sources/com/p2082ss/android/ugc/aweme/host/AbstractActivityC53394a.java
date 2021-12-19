package com.p2082ss.android.ugc.aweme.host;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.host.a */
public abstract class AbstractActivityC53394a extends ActivityC17312a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f122602a;

    /* renamed from: b */
    private final Object f122603b = new Object();

    static {
        Covode.recordClassIndex(62958);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m98505a().generatedComponent();
    }

    /* renamed from: a */
    private C88107a m98505a() {
        if (this.f122602a == null) {
            synchronized (this.f122603b) {
                if (this.f122602a == null) {
                    this.f122602a = new C88107a(this);
                }
            }
        }
        return this.f122602a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
