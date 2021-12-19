package com.bytedance.ies.xbridge.p1322j.p1323a;

import com.bytedance.common.utility.p907b.C13590c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18400b;
import com.bytedance.ies.xbridge.AbstractC18659k;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.C18465b;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.bytedance.ies.xbridge.p1296c.AbstractC18468a;
import com.bytedance.ies.xbridge.p1322j.p1325c.C18655b;
import com.bytedance.ies.xbridge.p1322j.p1325c.C18657c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.j.a.b */
public abstract class AbstractC18634b extends AbstractC18468a {

    /* renamed from: a */
    private final String f44375a = "x.request";

    /* renamed from: b */
    private final AbstractC18400b.EnumC18401a f44376b = AbstractC18400b.EnumC18401a.PROTECT;

    /* renamed from: com.bytedance.ies.xbridge.j.a.b$a */
    public interface AbstractC18635a {

        /* renamed from: com.bytedance.ies.xbridge.j.a.b$a$a */
        public static final class C18636a {
            static {
                Covode.recordClassIndex(21330);
            }
        }

        static {
            Covode.recordClassIndex(21329);
        }

        /* renamed from: a */
        void mo29693a(int i, String str, C18657c cVar);

        /* renamed from: a */
        void mo29694a(C18657c cVar, String str);
    }

    static {
        Covode.recordClassIndex(21328);
    }

    /* renamed from: a */
    public abstract void mo29691a(C18655b bVar, AbstractC18635a aVar, EnumC18483e eVar);

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: b */
    public final String mo7341b() {
        return this.f44375a;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: c */
    public final AbstractC18400b.EnumC18401a mo7346c() {
        return this.f44376b;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: d */
    public final Class<C18655b> mo29415d() {
        return C18655b.class;
    }

    @Override // com.bytedance.ies.xbridge.p1296c.AbstractC18468a, com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: e */
    public final Class<C18657c> mo29416e() {
        return C18657c.class;
    }

    /* renamed from: a */
    private final ExecutorService mo29696a() {
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        ExecutorService normalThreadExecutor;
        C18465b bVar;
        C18465b bVar2 = (C18465b) mo29616a(C18465b.class);
        if (((bVar2 != null && (iHostThreadPoolExecutorDepend = bVar2.f44108k) != null) || ((bVar = C18465b.f44096l) != null && (iHostThreadPoolExecutorDepend = bVar.f44108k) != null)) && (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) != null) {
            return normalThreadExecutor;
        }
        ExecutorService a = C13590c.m24421a();
        C89219l.m154709a((Object) a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xbridge.j.a.b$c */
    public static final class RunnableC18638c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC18634b f44381a;

        /* renamed from: b */
        final /* synthetic */ String f44382b;

        /* renamed from: c */
        final /* synthetic */ String f44383c;

        /* renamed from: d */
        final /* synthetic */ Integer f44384d;

        /* renamed from: e */
        final /* synthetic */ int f44385e;

        /* renamed from: f */
        final /* synthetic */ String f44386f;

        /* renamed from: g */
        final /* synthetic */ String f44387g;

        static {
            Covode.recordClassIndex(21332);
        }

        RunnableC18638c(AbstractC18634b bVar, String str, String str2, Integer num, int i, String str3, String str4) {
            this.f44381a = bVar;
            this.f44382b = str;
            this.f44383c = str2;
            this.f44384d = num;
            this.f44385e = i;
            this.f44386f = str3;
            this.f44387g = str4;
        }

        public final void run() {
            int i;
            IHostLogDepend iHostLogDepend;
            C18465b bVar;
            try {
                C89378p[] pVarArr = new C89378p[6];
                pVarArr[0] = C89387v.m154943a("method", this.f44382b);
                pVarArr[1] = C89387v.m154943a("url", this.f44383c);
                Integer num = this.f44384d;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -1;
                }
                pVarArr[2] = C89387v.m154943a("statusCode", Integer.valueOf(i));
                pVarArr[3] = C89387v.m154943a("requestErrorCode", Integer.valueOf(this.f44385e));
                pVarArr[4] = C89387v.m154943a("requestErrorMsg", this.f44386f);
                pVarArr[5] = C89387v.m154943a("platform", this.f44387g);
                Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
                C18465b bVar2 = (C18465b) this.f44381a.mo29616a(C18465b.class);
                C89391z zVar = null;
                if (!((bVar2 == null || (iHostLogDepend = bVar2.f44099b) == null) && ((bVar = C18465b.f44096l) == null || (iHostLogDepend = bVar.f44099b) == null))) {
                    zVar = iHostLogDepend.reportJSBFetchError(this.f44381a.f44109d, b);
                }
                C89379q.m157068constructorimpl(zVar);
            } catch (Throwable th) {
                C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
        }
    }

    /* renamed from: com.bytedance.ies.xbridge.j.a.b$b */
    public static final class C18637b implements AbstractC18635a {

        /* renamed from: a */
        final /* synthetic */ AbstractC18634b f44377a;

        /* renamed from: b */
        final /* synthetic */ C18655b f44378b;

        /* renamed from: c */
        final /* synthetic */ EnumC18483e f44379c;

        /* renamed from: d */
        final /* synthetic */ AbstractC18400b.AbstractC18402b f44380d;

        static {
            Covode.recordClassIndex(21331);
        }

        @Override // com.bytedance.ies.xbridge.p1322j.p1323a.AbstractC18634b.AbstractC18635a
        /* renamed from: a */
        public final void mo29694a(C18657c cVar, String str) {
            C89219l.m154719c(cVar, "");
            C89219l.m154719c(str, "");
            Map<String, Object> a = C18657c.C18658a.m34636a(cVar);
            if (a == null) {
                this.f44377a.mo29692a(this.f44378b.mo29706b(), this.f44378b.mo29705a(), -1, -5, "Invalid results", this.f44379c.name());
                AbstractC18468a.m34357a(this.f44380d, -5, null, null, 12);
                return;
            }
            AbstractC18634b.m34358a(this.f44380d, a, str);
        }

        @Override // com.bytedance.ies.xbridge.p1322j.p1323a.AbstractC18634b.AbstractC18635a
        /* renamed from: a */
        public final void mo29693a(int i, String str, C18657c cVar) {
            Map map;
            C89219l.m154719c(str, "");
            if (cVar != null) {
                map = C18657c.C18658a.m34636a(cVar);
                if (map == null) {
                    AbstractC18468a.m34357a(this.f44380d, i, str, null, 8);
                    return;
                }
            } else {
                map = new LinkedHashMap();
            }
            AbstractC18634b.m34356a(this.f44380d, i, str, map);
        }

        C18637b(AbstractC18634b bVar, C18655b bVar2, EnumC18483e eVar, AbstractC18400b.AbstractC18402b bVar3) {
            this.f44377a = bVar;
            this.f44378b = bVar2;
            this.f44379c = eVar;
            this.f44380d = bVar3;
        }
    }

    @Override // com.bytedance.ies.xbridge.AbstractC18400b
    /* renamed from: a */
    public final void mo7340a(AbstractC18754n nVar, AbstractC18400b.AbstractC18402b bVar, EnumC18483e eVar) {
        boolean z;
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(eVar, "");
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "url", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = C18586i.m34539a(nVar, "method", "");
            if (str2.length() != 0) {
                AbstractC18659k i = nVar.mo29766i("body");
                AbstractC18754n b = C18586i.m34543b(nVar, "params");
                AbstractC18754n b2 = C18586i.m34543b(nVar, "header");
                String str3 = C18586i.m34539a(nVar, "bodyType", "");
                C18655b bVar2 = new C18655b();
                C89219l.m154719c(str, "");
                bVar2.f44425a = str;
                C89219l.m154719c(str2, "");
                bVar2.f44426b = str2;
                bVar2.f44427c = i;
                bVar2.f44429e = b;
                bVar2.f44430f = b2;
                bVar2.f44428d = str3;
                mo29691a(bVar2, new C18637b(this, bVar2, eVar, bVar), eVar);
                return;
            }
        }
        mo29692a(C18586i.m34539a(nVar, "method", ""), C18586i.m34539a(nVar, "url", ""), -1, -3, "Invalid params", eVar.name());
        AbstractC18468a.m34357a(bVar, -3, null, null, 12);
    }

    /* renamed from: a */
    public final void mo29692a(String str, String str2, Integer num, int i, String str3, String str4) {
        mo29696a().execute(new RunnableC18638c(this, str, str2, num, i, str3, str4));
    }
}
