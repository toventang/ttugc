package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.e */
public final class C62517e implements AbstractC12644a<AbstractC62519f> {

    /* renamed from: a */
    public final AbstractC62519f f141798a = new C62518a();

    static {
        Covode.recordClassIndex(73313);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.e$a */
    public static final class C62518a implements AbstractC62519f {
        static {
            Covode.recordClassIndex(73314);
        }

        C62518a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.notificationlive.AbstractC62519f
        /* renamed from: a */
        public final AbstractC88979t<C62521h> mo100480a(boolean z, String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            Object a = RetrofitFactory.m33635a().mo28816a(Api.f79771d).mo28858a(NotificationGameApi.class);
            C89219l.m154716b(a, "");
            return ((NotificationGameApi) a).changeOptions(z, str, str2);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC62519f mo20458a() {
        return this.f141798a;
    }
}
