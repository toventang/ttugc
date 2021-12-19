package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.ecommerce.p2819ab.C43326i;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44704b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44762c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api.C44842a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api.C44843b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44889a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44890b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88678au;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c */
public final class C44854c extends AbstractC20287b implements AbstractC44834a {

    /* renamed from: b */
    static final HashMap<String, C44867d> f104597b = new HashMap<>();

    /* renamed from: c */
    public static final C44854c f104598c = new C44854c();

    /* renamed from: d */
    private static final C44892e f104599d = new C44892e();

    /* renamed from: e */
    private static final AbstractC89244h f104600e = C89250i.m154773a((AbstractC89171a) C44866k.f104622a);

    /* renamed from: f */
    private static final AbstractC89244h f104601f = C89250i.m154773a((AbstractC89171a) C44865j.f104621a);

    /* renamed from: g */
    private static long f104602g;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$b */
    static final class C44857b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44857b f104606a = new C44857b();

        static {
            Covode.recordClassIndex(53244);
        }

        C44857b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$h */
    static final class C44863h<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44863h f104619a = new C44863h();

        static {
            Covode.recordClassIndex(53250);
        }

        C44863h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$i */
    static final class C44864i<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44864i f104620a = new C44864i();

        static {
            Covode.recordClassIndex(53251);
        }

        C44864i() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C44854c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$j */
    static final class C44865j extends AbstractC89220m implements AbstractC89171a<C44842a> {

        /* renamed from: a */
        public static final C44865j f104621a = new C44865j();

        static {
            Covode.recordClassIndex(53252);
        }

        C44865j() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C44842a invoke() {
            return new C44842a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$k */
    static final class C44866k extends AbstractC89220m implements AbstractC89171a<C44843b> {

        /* renamed from: a */
        public static final C44866k f104622a = new C44866k();

        static {
            Covode.recordClassIndex(53253);
        }

        C44866k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C44843b invoke() {
            return new C44843b();
        }
    }

    static {
        Covode.recordClassIndex(53241);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$a */
    static final class C44855a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C44867d f104603a;

        /* renamed from: b */
        final /* synthetic */ String f104604b;

        static {
            Covode.recordClassIndex(53242);
        }

        C44855a(C44867d dVar, String str) {
            this.f104603a = dVar;
            this.f104604b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f104603a.f104627d = (ProductPackStruct) obj;
            if (C43326i.m86444a() > 0) {
                ExecutorC34605m.f81660a.mo61064a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44854c.C44855a.RunnableC448561 */

                    /* renamed from: a */
                    final /* synthetic */ C44855a f104605a;

                    static {
                        Covode.recordClassIndex(53243);
                    }

                    {
                        this.f104605a = r1;
                    }

                    public final void run() {
                        C44854c.f104597b.remove(this.f104605a.f104604b);
                    }
                }, (long) C43326i.m86444a());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a
    /* renamed from: a */
    public final void mo75951a(String str) {
        C89219l.m154721d(str, "");
        f104597b.remove(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a
    /* renamed from: b */
    public final void mo75952b(IPdpStarter.PdpEnterParam pdpEnterParam) {
        C89219l.m154721d(pdpEnterParam, "");
        if (SystemClock.elapsedRealtime() - f104602g > 300000) {
            C44867d unused = mo75949a(pdpEnterParam, false, 1, false, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$c */
    static final class C44858c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f104607a;

        /* renamed from: b */
        final /* synthetic */ C44890b f104608b;

        /* renamed from: c */
        final /* synthetic */ String f104609c;

        static {
            Covode.recordClassIndex(53245);
        }

        C44858c(String str, C44890b bVar, String str2) {
            this.f104607a = str;
            this.f104608b = bVar;
            this.f104609c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C44890b bVar;
            C44890b bVar2 = (C44890b) obj;
            C89219l.m154721d(bVar2, "");
            if (!C89219l.m154714a((Object) this.f104607a, (Object) "tt_pdp_dynamic") || (bVar = this.f104608b) == null) {
                String str = this.f104609c;
                C89219l.m154716b(str, "");
                C44854c.m87562a(str, bVar2);
                return bVar2;
            }
            C44890b a = bVar.mo76078a(bVar2);
            String str2 = this.f104609c;
            C89219l.m154716b(str2, "");
            C44854c.m87562a(str2, a);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$f */
    static final class C44861f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104615a;

        /* renamed from: b */
        final /* synthetic */ boolean f104616b;

        /* renamed from: c */
        final /* synthetic */ int f104617c;

        static {
            Covode.recordClassIndex(53248);
        }

        C44861f(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i) {
            this.f104615a = pdpEnterParam;
            this.f104616b = z;
            this.f104617c = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C45546d.f106066a = System.currentTimeMillis();
            C45546d.m88095a(this.f104615a.getTrackParams(), C44704b.m87426a(this.f104615a.getTrackParams()), this.f104616b, "/api/v1/shop/product_info/get", this.f104617c, "product_detail");
            C45546d.m88091a(this.f104615a, this.f104616b, this.f104617c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$g */
    static final class C44862g<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C44862g f104618a = new C44862g();

        static {
            Covode.recordClassIndex(53249);
        }

        C44862g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List<ProductPackStruct> list;
            C44890b bVar = (C44890b) obj;
            C89219l.m154721d(bVar, "");
            T t = bVar.data;
            if (t != null) {
                list = t.f104725a;
            } else {
                list = null;
            }
            C44854c.m87561a((C44889a) bVar.data);
            if (bVar.isCodeOK() && list != null && !list.isEmpty()) {
                return bVar;
            }
            throw new IPdpStarter.C44633b(bVar.code, bVar.message, bVar);
        }
    }

    /* renamed from: a */
    public static void m87561a(C44889a aVar) {
        if (!(aVar == null || aVar.f104725a == null || aVar.f104725a.isEmpty())) {
            for (ProductPackStruct productPackStruct : aVar.f104725a) {
                productPackStruct.f104690r = aVar.f104726b;
            }
        }
    }

    /* renamed from: c */
    private static Map<String, Object> m87563c(IPdpStarter.PdpEnterParam pdpEnterParam) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> trackParams = pdpEnterParam.getTrackParams();
        if (!(trackParams == null || (obj = trackParams.get("author_id")) == null)) {
            C89219l.m154716b(obj, "");
            linkedHashMap.put("kol_id", obj);
        }
        linkedHashMap.put("promotion_response_style", 1);
        return linkedHashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$d */
    static final class C44859d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104610a;

        /* renamed from: b */
        final /* synthetic */ int f104611b;

        static {
            Covode.recordClassIndex(53246);
        }

        C44859d(IPdpStarter.PdpEnterParam pdpEnterParam, int i) {
            this.f104610a = pdpEnterParam;
            this.f104611b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            List<ProductPackStruct> list;
            C44890b bVar = (C44890b) obj;
            C89219l.m154721d(bVar, "");
            T t = bVar.data;
            if (t != null) {
                list = t.f104725a;
            } else {
                list = null;
            }
            C44854c.m87561a((C44889a) bVar.data);
            if (!bVar.isCodeOK() || list == null || list.isEmpty() || !C89064i.m154489a(ProductPackStruct.f104671y, ((ProductPackStruct) C89070n.m154579f((List) list)).f104675c)) {
                throw new IPdpStarter.C44633b(bVar.code, bVar.message, bVar);
            }
            C45546d.f106069d.mo76754a(this.f104610a, this.f104611b);
            ProductPackStruct productPackStruct = (ProductPackStruct) C89070n.m154579f((List) list);
            if (!(productPackStruct.f104687o == null || productPackStruct.f104674b == null)) {
                C44762c a = C44762c.C44764a.m87491a(productPackStruct.f104674b);
                FlashSale flashSale = productPackStruct.f104687o;
                C89219l.m154721d(flashSale, "");
                a.f104434e.post(new C44762c.RunnableC44765b(a, flashSale));
            }
            if (bVar.data.f104727c != null) {
                productPackStruct.f104693u = bVar.data.f104727c;
            }
            return productPackStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.c$e */
    static final class C44860e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104612a;

        /* renamed from: b */
        final /* synthetic */ int f104613b;

        /* renamed from: c */
        final /* synthetic */ String f104614c;

        static {
            Covode.recordClassIndex(53247);
        }

        C44860e(IPdpStarter.PdpEnterParam pdpEnterParam, int i, String str) {
            this.f104612a = pdpEnterParam;
            this.f104613b = i;
            this.f104614c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Integer] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                boolean r0 = r6 instanceof com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.C44633b
                if (r0 == 0) goto L_0x0029
                com.ss.android.ugc.aweme.ecommerce.track.d r4 = com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d.f106069d
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam r3 = r5.f104612a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$b r6 = (com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.C44633b) r6
                int r0 = r6.getCode()
                java.lang.String r1 = java.lang.String.valueOf(r0)
                int r0 = r5.f104613b
                r4.mo76755a(r3, r2, r1, r0)
            L_0x0021:
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.ecommerce.pdp.repository.d> r1 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44854c.f104597b
                java.lang.String r0 = r5.f104614c
                r1.remove(r0)
                return
            L_0x0029:
                java.lang.String r1 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r6, r1)
                java.lang.Integer r0 = com.p2082ss.android.ugc.aweme.ecommerce.util.C45570k.m88114a(r6)
                if (r0 != 0) goto L_0x004a
            L_0x0034:
                com.ss.android.ugc.aweme.ecommerce.track.d r4 = com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d.f106069d
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam r3 = r5.f104612a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                java.lang.String r1 = r1.toString()
                int r0 = r5.f104613b
                r4.mo76755a(r3, r2, r1, r0)
                goto L_0x0021
            L_0x004a:
                r1 = r0
                goto L_0x0034
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44854c.C44860e.accept(java.lang.Object):void");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a
    /* renamed from: a */
    public final AbstractC88979t<C44890b> mo75950a(IPdpStarter.PdpEnterParam pdpEnterParam) {
        C89219l.m154721d(pdpEnterParam, "");
        Object clone = pdpEnterParam.getRequestParams().clone();
        Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, 0.0f, null, false, false, false, null, 2046, null);
        copy$default.getRequestParams().put("template", "tt_sku_selection");
        Object obj = copy$default.getRequestParams().get("product_id");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            for (Object obj2 : list) {
                copy$default.getRequestParams().put("product_source_info", C89041ag.m154428c(C89387v.m154943a(obj2, Integer.valueOf(IPdpStarter.C44631a.m87368a(pdpEnterParam.getTrackParams())))));
                arrayList.add(C89391z.f203057a);
            }
        }
        copy$default.getRequestParams().putAll(m87563c(pdpEnterParam));
        AbstractC88979t<C44890b> a = C88678au.m153890a(((AbstractC20179a) f104601f.getValue()).mo33487c(copy$default).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143258a(1).mo143292d(C44862g.f104618a).mo143264a(C44863h.f104619a).mo143285c(C44864i.f104620a), C88678au.f201220e).mo143188f(C88446a.f200698d).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static void m87562a(String str, C44890b bVar) {
        if (bVar.mo76079a()) {
            f104599d.mo33457a(str, bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a
    /* renamed from: a */
    public final C44867d mo75949a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i, boolean z2, Boolean bool) {
        String str;
        int i2;
        Object obj;
        int a;
        long longValue;
        C89219l.m154721d(pdpEnterParam, "");
        Object clone = pdpEnterParam.getRequestParams().clone();
        Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, 0.0f, null, false, false, false, null, 2046, null);
        String b = C80342dg.m139300a().mo46674b(copy$default.getRequestParams());
        C44892e eVar = f104599d;
        C89219l.m154716b(b, "");
        C44890b a2 = eVar.mo33459b(b);
        if (!C89219l.m154714a((Object) bool, (Object) true) ? a2 == null || !a2.mo76079a() || a2.mo76080b() : a2 == null) {
            str = "tt_pdp_full";
        } else {
            str = "tt_pdp_dynamic";
        }
        copy$default.getRequestParams().put("template", str);
        Object obj2 = copy$default.getRequestParams().get("product_id");
        List list = null;
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (!(list2 == null || (obj = list2.get(0)) == null)) {
            if (copy$default.getProductEnterContext() != null) {
                Object obj3 = copy$default.getProductEnterContext().get(obj);
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                if (((Map) obj3).get("enter_source_type") != null) {
                    Object obj4 = copy$default.getProductEnterContext().get(obj);
                    Objects.requireNonNull(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    Object obj5 = ((Map) obj4).get("enter_source_type");
                    if (obj5 == null) {
                        C89219l.m154715b();
                    }
                    Class<?> cls = obj5.getClass();
                    if (C89219l.m154714a(cls, Integer.class)) {
                        a = ((Integer) obj5).intValue();
                    } else if (C89219l.m154714a(cls, Short.class)) {
                        a = ((Short) obj5).shortValue();
                    } else {
                        if (C89219l.m154714a(cls, Long.class)) {
                            longValue = ((Long) obj5).longValue();
                        } else if (C89219l.m154714a(cls, Integer.TYPE)) {
                            a = ((Integer) obj5).intValue();
                        } else if (C89219l.m154714a(cls, Short.TYPE)) {
                            a = ((Short) obj5).shortValue();
                        } else if (C89219l.m154714a(cls, Long.TYPE)) {
                            longValue = ((Long) obj5).longValue();
                        } else {
                            a = 0;
                        }
                        a = (int) longValue;
                    }
                    copy$default.getRequestParams().put("product_source_info", C89041ag.m154428c(C89387v.m154943a(obj, Integer.valueOf(a))));
                }
            }
            a = IPdpStarter.C44631a.m87368a(pdpEnterParam.getTrackParams());
            copy$default.getRequestParams().put("product_source_info", C89041ag.m154428c(C89387v.m154943a(obj, Integer.valueOf(a))));
        }
        HashMap<String, Object> requestParams = copy$default.getRequestParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj6 = copy$default.getRequestParams().get("product_id");
        if (obj6 instanceof List) {
            list = obj6;
        }
        List list3 = list;
        if (list3 != null) {
            for (Object obj7 : list3) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (i != 0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                linkedHashMap2.put("req_type", Integer.valueOf(i2));
                if (!(copy$default.getProductEnterContext() == null || copy$default.getProductEnterContext().get(obj7) == null)) {
                    Object obj8 = copy$default.getProductEnterContext().get(obj7);
                    Objects.requireNonNull(obj8, "null cannot be cast to non-null type kotlin.collections.Map<out kotlin.String, kotlin.Any>");
                    linkedHashMap2.putAll((Map) obj8);
                }
                linkedHashMap.put(obj7, linkedHashMap2);
            }
        }
        requestParams.put("product_enter_context", linkedHashMap);
        copy$default.getRequestParams().putAll(m87563c(pdpEnterParam));
        HashMap<String, C44867d> hashMap = f104597b;
        C44867d dVar = hashMap.get(b);
        if (dVar != null) {
            if (z2) {
                hashMap.remove(b);
            }
            return dVar;
        }
        AbstractC88979t a3 = C88678au.m153890a(((AbstractC20179a) f104600e.getValue()).mo33487c(copy$default).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143258a(1).mo143292d(new C44858c(str, a2, b)).mo143292d(new C44859d(copy$default, i)).mo143264a(new C44860e(copy$default, i, b)).mo143285c(new C44861f(copy$default, z, i)), C88678au.f201220e).mo143188f(C88446a.f200698d).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a3, "");
        C44867d dVar2 = new C44867d(b, i, a3, (byte) 0);
        a3.mo143254a(new C44855a(dVar2, b), C44857b.f104606a);
        f104602g = SystemClock.elapsedRealtime();
        if (!z && !z2) {
            hashMap.put(b, dVar2);
        }
        return dVar2;
    }
}
