package com.p2082ss.android.ugc.aweme.ecommerce.semipdp.repository;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22028c;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.C44704b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.C44889a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.repository.SemiPdpApi;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45539b;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88678au;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b */
public final class C45362b {

    /* renamed from: a */
    static final HashMap<String, C45361a> f105699a = new HashMap<>();

    /* renamed from: b */
    public static final C45362b f105700b = new C45362b();

    private C45362b() {
    }

    static {
        Covode.recordClassIndex(53822);
    }

    /* renamed from: a */
    public static void m87934a(HashMap<String, Object> hashMap) {
        C89219l.m154721d(hashMap, "");
        f105699a.remove(C80342dg.m139300a().mo46674b(hashMap));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b$a */
    public static final class C45363a<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f105701a;

        /* renamed from: b */
        final /* synthetic */ int f105702b;

        /* renamed from: c */
        final /* synthetic */ String f105703c;

        static {
            Covode.recordClassIndex(53823);
        }

        C45363a(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i, String str) {
            this.f105701a = semiPdpEnterParams;
            this.f105702b = i;
            this.f105703c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Integer] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                java.lang.String r1 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r6, r1)
                java.lang.Integer r0 = com.p2082ss.android.ugc.aweme.ecommerce.util.C45570k.m88114a(r6)
                if (r0 != 0) goto L_0x002a
            L_0x000d:
                com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter$SemiPdpEnterParams r4 = r5.f105701a
                java.lang.String r0 = r6.getMessage()
                java.lang.String r3 = java.lang.String.valueOf(r0)
                java.lang.String r2 = r1.toString()
                int r1 = r5.f105702b
                r0 = 8
                com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d.m88093a(r4, r3, r2, r1, r0)
                java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.ecommerce.semipdp.repository.a> r1 = com.p2082ss.android.ugc.aweme.ecommerce.semipdp.repository.C45362b.f105699a
                java.lang.String r0 = r5.f105703c
                r1.remove(r0)
                return
            L_0x002a:
                r1 = r0
                goto L_0x000d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.semipdp.repository.C45362b.C45363a.accept(java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b$b */
    public static final class C45364b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f105704a;

        /* renamed from: b */
        final /* synthetic */ int f105705b;

        static {
            Covode.recordClassIndex(53824);
        }

        C45364b(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i) {
            this.f105704a = semiPdpEnterParams;
            this.f105705b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            T t;
            C22099u uVar = (C22099u) obj;
            C89219l.m154716b(uVar, "");
            String str = null;
            if (uVar.f52261a.mo35845a()) {
                C45546d.m88093a(this.f105704a, (String) null, (String) null, this.f105705b, 14);
            } else {
                SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f105704a;
                C22028c cVar = uVar.f52261a;
                if (cVar != null) {
                    str = cVar.f52041c;
                }
                C45546d.m88093a(semiPdpEnterParams, str, String.valueOf(uVar.f52261a.f52040b), this.f105705b, 8);
            }
            T t2 = uVar.f52262b;
            if (!(t2 == null || (t = t2.data) == null || t.f104725a == null || t.f104725a.isEmpty())) {
                for (ProductPackStruct productPackStruct : t.f104725a) {
                    productPackStruct.f104690r = t.f104726b;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.repository.b$c */
    public static final class C45365c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ SemiPdpStarter.SemiPdpEnterParams f105706a;

        /* renamed from: b */
        final /* synthetic */ int f105707b;

        static {
            Covode.recordClassIndex(53825);
        }

        C45365c(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i) {
            this.f105706a = semiPdpEnterParams;
            this.f105707b = i;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Object obj2;
            C45546d.m88095a(this.f105706a.getTrackParams(), C44704b.m87426a(this.f105706a.getTrackParams()), false, "/api/v1/shop/product_info/get", this.f105707b, "semi_product_detail");
            SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams = this.f105706a;
            int i = this.f105707b;
            C89219l.m154721d(semiPdpEnterParams, "");
            HashMap<String, Object> trackParams = semiPdpEnterParams.getTrackParams();
            if (trackParams == null || (obj2 = trackParams.get("click_product_start_time")) == null) {
                obj2 = -1L;
            }
            C89219l.m154716b(obj2, "");
            HashMap hashMap = new HashMap();
            hashMap.putAll(semiPdpEnterParams.getRequestParams());
            HashMap<String, Object> trackParams2 = semiPdpEnterParams.getTrackParams();
            if (trackParams2 == null) {
                trackParams2 = new HashMap<>();
            }
            hashMap.putAll(trackParams2);
            if ((obj2 instanceof Long) && (!C89219l.m154714a(obj2, (Object) -1L))) {
                hashMap.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj2).longValue()));
            }
            hashMap.put("is_retry", "no");
            hashMap.put("preload_type", Integer.valueOf(i));
            hashMap.put("api_path", "/api/v1/shop/third_party_product_info/get");
            if (!hashMap.containsKey("page_name")) {
                hashMap.put("page_name", "semi_product_detail");
            }
            C45546d.m88094a("rd_tiktokec_product_detail_request_send", hashMap);
        }
    }

    /* renamed from: a */
    public static C45361a m87933a(SemiPdpStarter.SemiPdpEnterParams semiPdpEnterParams, int i) {
        int i2;
        C89219l.m154721d(semiPdpEnterParams, "");
        String b = C80342dg.m139300a().mo46674b(semiPdpEnterParams.getRequestParams());
        C45361a aVar = f105699a.get(b);
        HashMap<String, Object> requestParams = semiPdpEnterParams.getRequestParams();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = semiPdpEnterParams.getRequestParams().get("product_id");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            for (Object obj2 : list) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (i != 0) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                linkedHashMap2.put("req_type", Integer.valueOf(i2));
                linkedHashMap.put(obj2, linkedHashMap2);
            }
        }
        requestParams.put("product_enter_context", linkedHashMap);
        if (aVar != null) {
            return aVar;
        }
        AbstractC88979t<C22099u<C43612a<C44889a>>> b2 = SemiPdpApi.C45360a.m87932a(semiPdpEnterParams.getRequestParams()).mo143278b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b2, "");
        AbstractC88979t a = C88678au.m153890a(C45539b.m88078a(b2, "semi_product_detail", new C89378p[0]).mo143264a(new C45363a(semiPdpEnterParams, i, b)).mo143280b((AbstractC88433f) new C45364b(semiPdpEnterParams, i)).mo143285c(new C45365c(semiPdpEnterParams, i)), C88678au.f201220e).mo143188f(C88446a.f200698d).mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        C45361a aVar2 = new C45361a(a);
        HashMap<String, C45361a> hashMap = f105699a;
        C89219l.m154716b(b, "");
        hashMap.put(b, aVar2);
        return aVar2;
    }
}
