package com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1453f.AbstractC20179a;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44704b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api.C44842a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.api.C44843b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44889a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44890b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.List;
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
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b */
public final class C44844b extends AbstractC20287b implements AbstractC44834a {

    /* renamed from: b */
    public static final C44844b f104578b = new C44844b();

    /* renamed from: c */
    private static final C44892e f104579c = new C44892e();

    /* renamed from: d */
    private static final AbstractC89244h f104580d = C89250i.m154773a((AbstractC89171a) C44853i.f104596a);

    /* renamed from: e */
    private static final AbstractC89244h f104581e = C89250i.m154773a((AbstractC89171a) C44852h.f104595a);

    /* renamed from: f */
    private static final HashMap<String, C44867d> f104582f = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$f */
    static final class C44850f<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44850f f104593a = new C44850f();

        static {
            Covode.recordClassIndex(53237);
        }

        C44850f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$g */
    static final class C44851g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C44851g f104594a = new C44851g();

        static {
            Covode.recordClassIndex(53238);
        }

        C44851g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a
    /* renamed from: a */
    public final void mo75951a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a
    /* renamed from: b */
    public final void mo75952b(IPdpStarter.PdpEnterParam pdpEnterParam) {
        C89219l.m154721d(pdpEnterParam, "");
    }

    private C44844b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$h */
    static final class C44852h extends AbstractC89220m implements AbstractC89171a<C44842a> {

        /* renamed from: a */
        public static final C44852h f104595a = new C44852h();

        static {
            Covode.recordClassIndex(53239);
        }

        C44852h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C44842a invoke() {
            return new C44842a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$i */
    static final class C44853i extends AbstractC89220m implements AbstractC89171a<C44843b> {

        /* renamed from: a */
        public static final C44853i f104596a = new C44853i();

        static {
            Covode.recordClassIndex(53240);
        }

        C44853i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C44843b invoke() {
            return new C44843b();
        }
    }

    static {
        Covode.recordClassIndex(53231);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$a */
    static final class C44845a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ String f104583a;

        /* renamed from: b */
        final /* synthetic */ C44890b f104584b;

        /* renamed from: c */
        final /* synthetic */ String f104585c;

        static {
            Covode.recordClassIndex(53232);
        }

        C44845a(String str, C44890b bVar, String str2) {
            this.f104583a = str;
            this.f104584b = bVar;
            this.f104585c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C44890b bVar;
            C44890b bVar2 = (C44890b) obj;
            C89219l.m154721d(bVar2, "");
            if (!C89219l.m154714a((Object) this.f104583a, (Object) "tt_pdp_dynamic") || (bVar = this.f104584b) == null) {
                String str = this.f104585c;
                C89219l.m154716b(str, "");
                C44844b.m87556a(str, bVar2);
                return bVar2;
            }
            C44890b a = bVar.mo76078a(bVar2);
            String str2 = this.f104585c;
            C89219l.m154716b(str2, "");
            C44844b.m87556a(str2, a);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$d */
    static final class C44848d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104590a;

        /* renamed from: b */
        final /* synthetic */ boolean f104591b;

        static {
            Covode.recordClassIndex(53235);
        }

        C44848d(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z) {
            this.f104590a = pdpEnterParam;
            this.f104591b = z;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C45546d.f106066a = System.currentTimeMillis();
            C45546d.m88095a(this.f104590a.getTrackParams(), C44704b.m87426a(this.f104590a.getTrackParams()), this.f104591b, "/api/v1/shop/product_info/get", 0, "product_detail");
            C45546d.m88091a(this.f104590a, this.f104591b, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$e */
    static final class C44849e<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C44849e f104592a = new C44849e();

        static {
            Covode.recordClassIndex(53236);
        }

        C44849e() {
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
            C44844b.m87555a((C44889a) bVar.data);
            if (bVar.isCodeOK() && list != null && !list.isEmpty()) {
                return bVar;
            }
            throw new IPdpStarter.C44633b(bVar.code, bVar.message, bVar);
        }
    }

    /* renamed from: a */
    public static void m87555a(C44889a aVar) {
        if (!(aVar == null || aVar.f104725a == null || aVar.f104725a.isEmpty())) {
            for (ProductPackStruct productPackStruct : aVar.f104725a) {
                productPackStruct.f104690r = aVar.f104726b;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$b */
    static final class C44846b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104586a;

        /* renamed from: b */
        final /* synthetic */ int f104587b;

        static {
            Covode.recordClassIndex(53233);
        }

        C44846b(IPdpStarter.PdpEnterParam pdpEnterParam, int i) {
            this.f104586a = pdpEnterParam;
            this.f104587b = i;
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
            C44844b.m87555a((C44889a) bVar.data);
            if (!bVar.isCodeOK() || list == null || list.isEmpty() || !C89064i.m154489a(ProductPackStruct.f104671y, ((ProductPackStruct) C89070n.m154579f((List) list)).f104675c)) {
                throw new IPdpStarter.C44633b(bVar.code, bVar.message, bVar);
            }
            C45546d.f106069d.mo76754a(this.f104586a, this.f104587b);
            ProductPackStruct productPackStruct = (ProductPackStruct) C89070n.m154579f((List) list);
            if (bVar.data.f104727c != null) {
                productPackStruct.f104693u = bVar.data.f104727c;
            }
            return productPackStruct;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.repository.b$c */
    static final class C44847c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ IPdpStarter.PdpEnterParam f104588a;

        /* renamed from: b */
        final /* synthetic */ int f104589b;

        static {
            Covode.recordClassIndex(53234);
        }

        C44847c(IPdpStarter.PdpEnterParam pdpEnterParam, int i) {
            this.f104588a = pdpEnterParam;
            this.f104589b = i;
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
                if (r0 == 0) goto L_0x0022
                com.ss.android.ugc.aweme.ecommerce.track.d r4 = com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d.f106069d
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam r3 = r5.f104588a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$b r6 = (com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.C44633b) r6
                int r0 = r6.getCode()
                java.lang.String r1 = java.lang.String.valueOf(r0)
                int r0 = r5.f104589b
                r4.mo76755a(r3, r2, r1, r0)
                return
            L_0x0022:
                java.lang.String r1 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r6, r1)
                java.lang.Integer r0 = com.p2082ss.android.ugc.aweme.ecommerce.util.C45570k.m88114a(r6)
                if (r0 != 0) goto L_0x0043
            L_0x002d:
                com.ss.android.ugc.aweme.ecommerce.track.d r4 = com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d.f106069d
                com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter$PdpEnterParam r3 = r5.f104588a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r2 = java.lang.String.valueOf(r0)
                java.lang.String r1 = r1.toString()
                int r0 = r5.f104589b
                r4.mo76755a(r3, r2, r1, r0)
                return
            L_0x0043:
                r1 = r0
                goto L_0x002d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.C44844b.C44847c.accept(java.lang.Object):void");
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
        AbstractC88979t<C44890b> a = C88678au.m153890a(((AbstractC20179a) f104581e.getValue()).mo33487c(copy$default).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143258a(1).mo143292d(C44849e.f104592a).mo143264a(C44850f.f104593a).mo143285c(C44851g.f104594a), C88678au.f201220e).mo143188f(C88446a.f200698d).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    public static void m87556a(String str, C44890b bVar) {
        if (bVar.mo76079a()) {
            f104579c.mo33457a(str, bVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.AbstractC44834a
    /* renamed from: a */
    public final C44867d mo75949a(IPdpStarter.PdpEnterParam pdpEnterParam, boolean z, int i, boolean z2, Boolean bool) {
        String str;
        C89219l.m154721d(pdpEnterParam, "");
        Object clone = pdpEnterParam.getRequestParams().clone();
        Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.Any> /* = java.util.HashMap<kotlin.String, kotlin.Any> */");
        IPdpStarter.PdpEnterParam copy$default = IPdpStarter.PdpEnterParam.copy$default(pdpEnterParam, (HashMap) clone, null, null, null, false, 0.0f, null, false, false, false, null, 2046, null);
        String b = C80342dg.m139300a().mo46674b(copy$default.getRequestParams());
        C44892e eVar = f104579c;
        C89219l.m154716b(b, "");
        C44890b a = eVar.mo33459b(b);
        if (C89219l.m154714a((Object) bool, (Object) true) || (a != null && a.mo76079a() && !a.mo76080b())) {
            str = "tt_pdp_dynamic";
        } else {
            str = "tt_pdp_full";
        }
        copy$default.getRequestParams().put("template", str);
        String b2 = C80342dg.m139300a().mo46674b(copy$default.getRequestParams());
        HashMap<String, C44867d> hashMap = f104582f;
        C44867d dVar = hashMap.get(b2);
        if (dVar != null) {
            hashMap.remove(b2);
            return dVar;
        }
        AbstractC88979t a2 = C88678au.m153890a(((AbstractC20179a) f104580d.getValue()).mo33487c(copy$default).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(new C44845a(str, a, b)).mo143292d(new C44846b(copy$default, i)).mo143264a(new C44847c(copy$default, i)).mo143285c(new C44848d(copy$default, z)), C88678au.f201220e).mo143188f(C88446a.f200698d).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a2, "");
        C44867d dVar2 = new C44867d(b, 0, a2, (byte) 0);
        if (!z) {
            C89219l.m154716b(b2, "");
            hashMap.put(b2, dVar2);
        }
        return dVar2;
    }
}
