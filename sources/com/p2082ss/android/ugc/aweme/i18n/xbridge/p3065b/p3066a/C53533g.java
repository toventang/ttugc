package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.AbstractC18099f;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit;
import com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47807c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.g */
public final class C53533g implements IHostNetworkDepend {
    static {
        Covode.recordClassIndex(63109);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final Map<String, Object> getAPIParams() {
        Map<String, String> a = C47807c.m90823a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.g$a */
    final class C53534a implements XIRetrofit {

        /* renamed from: a */
        final /* synthetic */ C53533g f122893a;

        /* renamed from: b */
        private final AbstractC18099f f122894b;

        static {
            Covode.recordClassIndex(63110);
        }

        @Override // com.bytedance.ies.xbridge.base.runtime.depend.XIRetrofit
        public final <T> T create(Class<T> cls) {
            C89219l.m154721d(cls, "");
            return (T) this.f122894b.mo28858a(cls);
        }

        public C53534a(C53533g gVar, AbstractC18099f fVar) {
            C89219l.m154721d(fVar, "");
            this.f122893a = gVar;
            this.f122894b = fVar;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend
    public final XIRetrofit createRetrofit(String str, boolean z) {
        AbstractC18099f a;
        C89219l.m154721d(str, "");
        IRetrofitFactory a2 = RetrofitFactory.m33635a();
        if (a2 == null || (a = a2.mo28816a(str)) == null) {
            return null;
        }
        return new C53534a(this, a);
    }
}
