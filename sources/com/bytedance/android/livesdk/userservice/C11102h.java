package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.android.livesdkapi.depend.p684f.AbstractC11670a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.userservice.h */
final /* synthetic */ class C11102h implements AbstractC11670a {

    /* renamed from: a */
    private final C11092c f26701a;

    static {
        Covode.recordClassIndex(12725);
    }

    C11102h(C11092c cVar) {
        this.f26701a = cVar;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p684f.AbstractC11670a
    /* renamed from: a */
    public final void mo17914a(C11688a aVar) {
        this.f26701a.f26674e.onNext(aVar);
        C6779a.m14563a().mo13053a(new C11625a(aVar));
    }
}
