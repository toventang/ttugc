package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19672u;
import java.util.Map;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.ad */
final /* synthetic */ class C53740ad {
    static {
        Covode.recordClassIndex(63320);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.ad$a */
    public static final class C53741a<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ AbstractC17427b f123273a;

        /* renamed from: b */
        final /* synthetic */ Map f123274b;

        static {
            Covode.recordClassIndex(63321);
        }

        public C53741a(AbstractC17427b bVar, Map map) {
            this.f123273a = bVar;
            this.f123274b = map;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(final AbstractC88974o<C19638h> oVar) {
            C89219l.m154721d(oVar, "");
            this.f123273a.mo27747b(this.f123274b, new AbstractC19479b<C19638h>() {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53740ad.C53741a.C537421 */

                static {
                    Covode.recordClassIndex(63322);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo27861a(C19638h hVar) {
                    if (hVar == null) {
                        oVar.mo143048a();
                    } else {
                        oVar.mo143049a(hVar);
                    }
                }

                @Override // com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b
                /* renamed from: a */
                public final void mo27860a(C19672u uVar) {
                    Throwable th;
                    AbstractC88974o oVar = oVar;
                    if (uVar == null || (th = uVar.f46735h) == null) {
                        th = new RuntimeException("updateLocalExt() failed with no errors");
                    }
                    oVar.mo143051b(th);
                }
            });
        }
    }
}
