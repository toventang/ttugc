package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.a */
public abstract class AbstractActivityC54312a extends ActivityC54429b implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f124411a;

    /* renamed from: b */
    private final Object f124412b = new Object();

    static {
        Covode.recordClassIndex(64009);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m99605b().generatedComponent();
    }

    /* renamed from: b */
    private C88107a m99605b() {
        if (this.f124411a == null) {
            synchronized (this.f124412b) {
                if (this.f124411a == null) {
                    this.f124411a = new C88107a(this);
                }
            }
        }
        return this.f124411a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
