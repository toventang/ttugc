package com.p2082ss.android.ugc.aweme.ecommerce.router;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.api.PaymentApi;
import com.p2082ss.android.ugc.aweme.ecommerce.payment.p2848a.C44628c;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f */
public final class C45247f implements IInterceptor, IEventCenter.AbstractC45375b {

    /* renamed from: c */
    public static final C45249b f105477c = new C45249b((byte) 0);

    /* renamed from: a */
    public int f105478a;

    /* renamed from: b */
    public boolean f105479b;

    /* renamed from: d */
    private final AbstractC89244h f105480d = C89250i.m154773a((AbstractC89171a) new C45250c(this));

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$a */
    public static final class C45248a {
        @AbstractC27891c(mo46611a = "cashier_id")

        /* renamed from: a */
        public final String f105481a;

        static {
            Covode.recordClassIndex(53700);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C45248a) && C89219l.m154714a(this.f105481a, ((C45248a) obj).f105481a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f105481a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "CashierParams(cashierId=" + this.f105481a + ")";
        }
    }

    static {
        Covode.recordClassIndex(53699);
    }

    /* renamed from: a */
    public final Map<String, C28022o> mo76341a() {
        return (Map) this.f105480d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$b */
    public static final class C45249b {
        static {
            Covode.recordClassIndex(53701);
        }

        private C45249b() {
        }

        public /* synthetic */ C45249b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$d */
    public static final class C45251d implements AbstractC88986z<C43612a<C44628c>> {
        static {
            Covode.recordClassIndex(53703);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C45251d() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            EventCenter.m87158a().mo75479a("ec_send_caisher", "{}");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C43612a<C44628c> aVar) {
            C28022o oVar;
            String str;
            C43612a<C44628c> aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            T t = aVar2.data;
            if (t != null) {
                oVar = t.f104119a;
            } else {
                oVar = null;
            }
            IEventCenter a = EventCenter.m87158a();
            if (oVar == null || (str = oVar.toString()) == null) {
                str = "{}";
            }
            C89219l.m154716b(str, "");
            a.mo75479a("ec_send_caisher", str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$c */
    static final class C45250c extends AbstractC89220m implements AbstractC89171a<Map<String, C28022o>> {

        /* renamed from: a */
        final /* synthetic */ C45247f f105482a;

        static {
            Covode.recordClassIndex(53702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45250c(C45247f fVar) {
            super(0);
            this.f105482a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, C28022o> invoke() {
            EventCenter.m87158a().mo75480a("ec_fetch_caisher", this.f105482a);
            return new LinkedHashMap();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return C89219l.m154714a((Object) str, (Object) "ec");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$f */
    static final class C45253f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C45247f f105485a;

        static {
            Covode.recordClassIndex(53705);
        }

        C45253f(C45247f fVar) {
            this.f105485a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f105485a.f105478a = 2;
            if (this.f105485a.f105479b) {
                this.f105485a.mo76342a(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$h */
    static final class C45255h<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C45247f f105488a;

        static {
            Covode.recordClassIndex(53707);
        }

        C45255h(C45247f fVar) {
            this.f105488a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f105488a.f105478a = 2;
            if (this.f105488a.f105479b) {
                this.f105488a.mo76342a(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$i */
    static final class C45256i extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C45256i f105489a = new C45256i();

        static {
            Covode.recordClassIndex(53708);
        }

        C45256i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.bi9, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$e */
    static final class C45252e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C45247f f105483a;

        /* renamed from: b */
        final /* synthetic */ String f105484b;

        static {
            Covode.recordClassIndex(53704);
        }

        C45252e(C45247f fVar, String str) {
            this.f105483a = fVar;
            this.f105484b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((C43612a) obj).data;
            this.f105483a.f105478a = 2;
            C28022o oVar = null;
            if (this.f105483a.f105479b) {
                C45247f fVar = this.f105483a;
                if (t != null) {
                    oVar = t.f104119a;
                }
                fVar.mo76342a(oVar);
                return;
            }
            Map<String, C28022o> a = this.f105483a.mo76341a();
            String str = this.f105484b;
            if (t != null) {
                oVar = t.f104119a;
            }
            a.put(str, oVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$g */
    static final class C45254g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C45247f f105486a;

        /* renamed from: b */
        final /* synthetic */ String f105487b;

        static {
            Covode.recordClassIndex(53706);
        }

        C45254g(C45247f fVar, String str) {
            this.f105486a = fVar;
            this.f105487b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((C43612a) obj).data;
            this.f105486a.f105478a = 2;
            C28022o oVar = null;
            if (this.f105486a.f105479b) {
                C45247f fVar = this.f105486a;
                if (t != null) {
                    oVar = t.f104119a;
                }
                fVar.mo76342a(oVar);
                return;
            }
            Map<String, C28022o> a = this.f105486a.mo76341a();
            String str = this.f105487b;
            if (t != null) {
                oVar = t.f104119a;
            }
            a.put(str, oVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo76342a(C28022o oVar) {
        String str;
        MethodCollector.m26663i(7442);
        if (this.f105478a == 2) {
            IEventCenter a = EventCenter.m87158a();
            if (oVar == null || (str = oVar.toString()) == null) {
                str = "{}";
            }
            C89219l.m154716b(str, "");
            a.mo75479a("ec_send_caisher", str);
            this.f105479b = false;
            this.f105478a = 0;
        }
        MethodCollector.m26664o(7442);
    }

    /* renamed from: a */
    private static String m87830a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (str.hashCode() != 2045788583 || !str.equals("ec_fetch_caisher")) {
            return;
        }
        if (this.f105478a == 0) {
            PaymentApi.C44630a.m87364a().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C45251d());
            return;
        }
        this.f105479b = true;
        mo76342a(mo76341a().get(((C45248a) C80342dg.m139301a(str2, C45248a.class)).f105481a));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x032b, code lost:
        if (r0 == null) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (r5.equals("orderdetail") != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013b, code lost:
        if (r5.equals("viewcode") != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0144, code lost:
        if (r5.equals("orderlist") != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0146, code lost:
        r5 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        r0 = r23.getExtra();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0152, code lost:
        if (r0 == null) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0154, code lost:
        r0 = m87830a(r0, "url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0158, code lost:
        r9 = android.net.Uri.parse(r0).buildUpon().appendQueryParameter("cashier_id", r5);
        r0 = r23.getExtra();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0168, code lost:
        if (r0 == null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016a, code lost:
        r0 = m87830a(r0, "source");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016e, code lost:
        r7 = r9.appendQueryParameter("source", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0172, code lost:
        if (r8 == null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0179, code lost:
        if ((!p4600h.p4622m.C89361p.m154870a((java.lang.CharSequence) r8)) == false) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017b, code lost:
        r7.appendQueryParameter("trackParams", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017e, code lost:
        if (r22 == null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0180, code lost:
        r2 = com.p2082ss.android.ugc.aweme.bullet.impl.BulletService.m71938f();
        r0 = r7.build().toString();
        p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4);
        r2.mo61852a(r22, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0192, code lost:
        r2 = r23.getExtra();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0196, code lost:
        if (r2 == null) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0198, code lost:
        r7 = m87830a(r2, "requestParams");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019f, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a3, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r2 = com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j.m87844a().mo46670a(r7, java.util.HashMap.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01af, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r22, com.bytedance.router.RouteIntent r23) {
        /*
        // Method dump skipped, instructions count: 986
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.router.C45247f.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
