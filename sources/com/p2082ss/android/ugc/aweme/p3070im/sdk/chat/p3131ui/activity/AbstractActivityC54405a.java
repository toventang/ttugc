package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.a */
public abstract class AbstractActivityC54405a extends ActivityC54429b implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f124629a;

    /* renamed from: b */
    private final Object f124630b = new Object();

    static {
        Covode.recordClassIndex(64109);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return mo69457b().generatedComponent();
    }

    /* renamed from: b */
    private C88107a mo69457b() {
        if (this.f124629a == null) {
            synchronized (this.f124630b) {
                if (this.f124629a == null) {
                    this.f124629a = new C88107a(this);
                }
            }
        }
        return this.f124629a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
