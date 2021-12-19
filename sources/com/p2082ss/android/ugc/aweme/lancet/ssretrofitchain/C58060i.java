package com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.util.Log;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32837b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34574e;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34575f;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c;
import com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.C58057g;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.i */
public final class C58060i extends AbstractC58051c {
    static {
        Covode.recordClassIndex(68100);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58060i(AbstractC58051c cVar) {
        super(cVar);
        C89219l.m154721d(cVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.i$a */
    static final class C58061a extends AbstractC89220m implements AbstractC89172b<C22027b, Boolean> {

        /* renamed from: a */
        public static final C58061a f132299a = new C58061a();

        static {
            Covode.recordClassIndex(68101);
        }

        C58061a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C22027b bVar) {
            C22027b bVar2 = bVar;
            C89219l.m154716b(bVar2, "");
            return Boolean.valueOf(C89219l.m154714a((Object) bVar2.f52037a, (Object) "x-tt-logid"));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.lancet.ssretrofitchain.AbstractC58051c
    /* renamed from: a */
    public final AbstractC58051c.C58052a mo95554a(C58057g gVar, Request request, C22099u<?> uVar) {
        C58057g.C58058a aVar;
        String str;
        C58057g.C58058a aVar2;
        C22027b bVar;
        String path;
        String str2 = "";
        if (gVar != null && (aVar2 = gVar.f132293a) != null && aVar2.f132295a == 9) {
            AbstractC81915c.m141874a(new C34574e());
            if (request != null) {
                try {
                    List<C22027b> headers = request.getHeaders();
                    if (headers != null) {
                        bVar = (C22027b) C89309k.m154806c(C89309k.m154799a(C89070n.m154598r(headers), (AbstractC89172b) C58061a.f132299a));
                        C33743c cVar = new C33743c();
                        if (request == null || (r0 = request.getPath()) == null) {
                            String str3 = str2;
                        }
                        C33743c a = cVar.mo59976a("URL", str3).mo59974a("errorCode", (Integer) 8);
                        if (bVar == null || (r0 = bVar.f52038b) == null) {
                            String str4 = str2;
                        }
                        JSONObject a2 = a.mo59976a("x-tt-logid", str4).mo59977a();
                        C89219l.m154716b(a2, str2);
                        C32837b.m67403a("request_force_logout_log", 0, a2);
                        return new AbstractC58051c.C58052a(true, false);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    C33743c cVar2 = new C33743c();
                    if (!(request == null || (path = request.getPath()) == null)) {
                        str2 = path;
                    }
                    C12290b.m22060a("request_force_logout_log", 0, cVar2.mo59976a("URL", str2).mo59974a("errorCode", (Integer) 9).mo59976a("error_desc", Log.getStackTraceString(e)).mo59977a());
                }
            }
            bVar = null;
            C33743c cVar3 = new C33743c();
            String str32 = str2;
            C33743c a3 = cVar3.mo59976a("URL", str32).mo59974a("errorCode", (Integer) 8);
            String str42 = str2;
            JSONObject a22 = a3.mo59976a("x-tt-logid", str42).mo59977a();
            C89219l.m154716b(a22, str2);
            C32837b.m67403a("request_force_logout_log", 0, a22);
            return new AbstractC58051c.C58052a(true, false);
        } else if (gVar == null || (aVar = gVar.f132293a) == null || aVar.f132295a != 14) {
            AbstractC58051c.C58052a aVar3 = C58050b.f132285a;
            C89219l.m154716b(aVar3, str2);
            return aVar3;
        } else {
            C58057g.C58058a aVar4 = gVar.f132293a;
            if (!(aVar4 == null || (str = aVar4.f132296b) == null)) {
                str2 = str;
            }
            AbstractC81915c.m141874a(new C34575f(str2));
            return new AbstractC58051c.C58052a(true, false);
        }
    }
}
