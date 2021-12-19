package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import dagger.hilt.android.internal.managers.C88107a;
import dagger.hilt.p4536a.AbstractC88084b;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.h */
abstract class AbstractActivityC47711h extends ActivityC17312a implements AbstractC88084b<Object> {

    /* renamed from: a */
    private volatile C88107a f110601a;

    /* renamed from: b */
    private final Object f110602b = new Object();

    static {
        Covode.recordClassIndex(56333);
    }

    AbstractActivityC47711h() {
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return m90708a().generatedComponent();
    }

    /* renamed from: a */
    private C88107a m90708a() {
        if (this.f110601a == null) {
            synchronized (this.f110602b) {
                if (this.f110601a == null) {
                    this.f110601a = new C88107a(this);
                }
            }
        }
        return this.f110601a;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        ((AbstractC47740w) generatedComponent()).mo60006a((UserFavoritesActivity) this);
        super.onCreate(bundle);
    }
}
