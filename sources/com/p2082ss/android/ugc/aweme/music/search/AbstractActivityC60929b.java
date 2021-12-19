package com.p2082ss.android.ugc.aweme.music.search;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.music.search.b */
public abstract class AbstractActivityC60929b extends ActivityC17312a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f138417a;

    /* renamed from: b */
    private final Object f138418b = new Object();

    static {
        Covode.recordClassIndex(71520);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m110524a().generatedComponent();
    }

    /* renamed from: a */
    private C88107a m110524a() {
        if (this.f138417a == null) {
            synchronized (this.f138418b) {
                if (this.f138417a == null) {
                    this.f138417a = new C88107a(this);
                }
            }
        }
        return this.f138417a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        generatedComponent();
        super.onCreate(bundle);
    }
}
