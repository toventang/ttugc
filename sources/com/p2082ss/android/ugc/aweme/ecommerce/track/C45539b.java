package com.p2082ss.android.ugc.aweme.ecommerce.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import java.net.URL;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.track.b */
public final class C45539b {
    static {
        Covode.recordClassIndex(54030);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.b$a */
    static final class C45540a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f106055a;

        /* renamed from: b */
        final /* synthetic */ C89378p[] f106056b;

        static {
            Covode.recordClassIndex(54031);
        }

        C45540a(String str, C89378p[] pVarArr) {
            this.f106055a = str;
            this.f106056b = pVarArr;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C22099u uVar = (C22099u) obj;
            try {
                C45544c.m88081a("rd_tiktokec_network", new AbstractC89172b<C45544c.C45545a, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.track.C45539b.C45540a.C455411 */

                    /* renamed from: a */
                    final /* synthetic */ C45540a f106057a;

                    static {
                        Covode.recordClassIndex(54032);
                    }

                    {
                        this.f106057a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
                        long j;
                        C45544c.C45545a aVar2 = aVar;
                        C89219l.m154721d(aVar2, "");
                        C22028c cVar = uVar.f52261a;
                        C89219l.m154716b(cVar, "");
                        Object obj = cVar.f52044f;
                        if (!(obj instanceof C14612a)) {
                            obj = null;
                        }
                        C14612a aVar3 = (C14612a) obj;
                        aVar2.mo76753c("error_code", Integer.valueOf(uVar.f52262b.code));
                        C22028c cVar2 = uVar.f52261a;
                        C89219l.m154716b(cVar2, "");
                        aVar2.mo76753c("path", new URL(cVar2.f52039a).getPath());
                        C22099u uVar = uVar;
                        C89219l.m154716b(uVar, "");
                        aVar2.mo76753c("log_id", C45539b.m88079a(uVar));
                        aVar2.mo76753c("page_name", this.f106057a.f106055a);
                        if (aVar3 != null) {
                            j = aVar3.f35375r;
                        } else {
                            j = 0;
                        }
                        aVar2.mo76752b("duration", Long.valueOf(j));
                        int i = 1;
                        if (aVar3 == null || !aVar3.f35373p) {
                            i = 0;
                        }
                        aVar2.mo76752b("is_socket_reused", Integer.valueOf(i));
                        C89378p[] pVarArr = this.f106057a.f106056b;
                        for (C89378p pVar : pVarArr) {
                            aVar2.mo76753c((String) pVar.getFirst(), pVar.getSecond());
                        }
                        return C89391z.f203057a;
                    }
                });
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.track.b$b */
    static final class C45542b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f106059a;

        /* renamed from: b */
        final /* synthetic */ C89378p[] f106060b;

        static {
            Covode.recordClassIndex(54033);
        }

        C45542b(String str, C89378p[] pVarArr) {
            this.f106059a = str;
            this.f106060b = pVarArr;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Object obj2;
            C28022o f;
            AbstractC28019l c;
            String c2;
            final Throwable th = (Throwable) obj;
            if (th instanceof C14652c) {
                try {
                    final String str = null;
                    try {
                        obj2 = C45264j.m87844a().mo46670a(((C14652c) th).getRequestLog(), (Class) C28022o.class);
                    } catch (Exception unused) {
                        obj2 = null;
                    }
                    C28022o oVar = (C28022o) obj2;
                    if (!(oVar == null || (f = oVar.mo46807f("base")) == null || (c = f.mo46803c("origin_url")) == null || (c2 = c.mo46689c()) == null)) {
                        str = new URL(c2).getPath();
                    }
                    C45544c.m88081a("rd_tiktokec_network", new AbstractC89172b<C45544c.C45545a, C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.track.C45539b.C45542b.C455431 */

                        /* renamed from: a */
                        final /* synthetic */ C45542b f106061a;

                        static {
                            Covode.recordClassIndex(54034);
                        }

                        {
                            this.f106061a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89172b
                        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
                            long j;
                            C45544c.C45545a aVar2 = aVar;
                            String str = "";
                            C89219l.m154721d(aVar2, str);
                            C14612a requestInfo = ((C14652c) th).getRequestInfo();
                            aVar2.mo76753c("error_code", Integer.valueOf(((C14652c) th).getStatusCode()));
                            String str2 = str;
                            if (str2 != null) {
                                str = str2;
                            }
                            aVar2.mo76752b("path", str);
                            aVar2.mo76753c("log_id", ((C14652c) th).getTraceCode());
                            aVar2.mo76753c("page_name", this.f106061a.f106059a);
                            if (requestInfo != null) {
                                j = requestInfo.f35375r;
                            } else {
                                j = 0;
                            }
                            aVar2.mo76752b("duration", Long.valueOf(j));
                            int i = 1;
                            if (requestInfo == null || !requestInfo.f35373p) {
                                i = 0;
                            }
                            aVar2.mo76752b("is_socket_reused", Integer.valueOf(i));
                            C89378p[] pVarArr = this.f106061a.f106060b;
                            for (C89378p pVar : pVarArr) {
                                aVar2.mo76753c((String) pVar.getFirst(), pVar.getSecond());
                            }
                            return C89391z.f203057a;
                        }
                    });
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public static final String m88079a(C22099u<?> uVar) {
        List<C22027b> b = uVar.f52261a.mo35846b("X-Tt-Logid");
        if (b == null || b.size() <= 0) {
            return "";
        }
        C22027b bVar = b.get(0);
        C89219l.m154716b(bVar, "");
        String str = bVar.f52038b;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public static final <T> AbstractC88979t<C22099u<C43612a<T>>> m88078a(AbstractC88979t<C22099u<C43612a<T>>> tVar, String str, C89378p<String, ? extends Object>... pVarArr) {
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(pVarArr, "");
        AbstractC88979t<C22099u<C43612a<T>>> a = tVar.mo143280b(new C45540a(str, pVarArr)).mo143264a(new C45542b(str, pVarArr));
        C89219l.m154716b(a, "");
        return a;
    }
}
