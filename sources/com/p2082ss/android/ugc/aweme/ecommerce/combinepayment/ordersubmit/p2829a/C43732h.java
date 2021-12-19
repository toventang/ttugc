package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.BillInfoResponse;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.HashMap;
import java.util.LinkedHashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h */
public final class C43732h {

    /* renamed from: a */
    public static final LinkedHashMap<String, Object> f101921a = new LinkedHashMap<>();

    /* renamed from: b */
    public static long f101922b = -1;

    /* renamed from: c */
    public static long f101923c = -1;

    /* renamed from: d */
    public static long f101924d = -1;

    /* renamed from: e */
    public static long f101925e = -1;

    /* renamed from: f */
    public static long f101926f = -1;

    /* renamed from: g */
    public static long f101927g = -1;

    /* renamed from: h */
    public static long f101928h = -1;

    /* renamed from: i */
    public static int f101929i;

    /* renamed from: j */
    public static long f101930j = -1;

    /* renamed from: k */
    public static final C43732h f101931k = new C43732h();

    private C43732h() {
    }

    /* renamed from: a */
    public static void m86728a(HashMap<String, Object> hashMap) {
        LinkedHashMap<String, Object> linkedHashMap = f101921a;
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m86732a(boolean z, String str, Boolean bool, Boolean bool2, HashMap hashMap, Long l, String str2, String str3, int i) {
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        Long l2 = l;
        String str4 = str2;
        String str5 = null;
        if ((i & 4) != 0) {
            bool3 = null;
        }
        if ((i & 8) != 0) {
            bool4 = null;
        }
        if ((i & 32) != 0) {
            l2 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) == 0) {
            str5 = str3;
        }
        m86733a(z, str, bool3, bool4, hashMap, l2, str4, str5, (Boolean) null);
    }

    /* renamed from: a */
    public static void m86733a(boolean z, String str, Boolean bool, Boolean bool2, HashMap<String, Object> hashMap, Long l, String str2, String str3, Boolean bool3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        if (f101922b > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - f101922b;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(f101921a);
            linkedHashMap.put("is_load_data", Integer.valueOf(z ? 1 : 0));
            linkedHashMap.put("quit_type", str);
            linkedHashMap.put("stay_time", Long.valueOf(elapsedRealtime));
            if (l != null) {
                l.longValue();
                linkedHashMap.put("stay_time", l);
            }
            if (bool != null) {
                linkedHashMap.put("is_edit_address", Integer.valueOf(bool.booleanValue() ? 1 : 0));
            }
            if (bool2 != null) {
                linkedHashMap.put("is_edit_quantity", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
            }
            if (str2 != null) {
                linkedHashMap.put("page_name", str2);
            }
            if (str3 != null) {
                linkedHashMap.put("previous_page", str3);
            }
            if (bool3 != null) {
                bool3.booleanValue();
                linkedHashMap.put("is_fullscreen", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
            }
            linkedHashMap.putAll(hashMap);
            C45544c.m88082a("tiktokec_stay_page", linkedHashMap);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m86727a(String str, HashMap hashMap, String str2, String str3, String str4, Boolean bool, Boolean bool2, String str5, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            str5 = null;
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f101921a);
        linkedHashMap.put("module_name", str);
        linkedHashMap.putAll(hashMap);
        if (str2 != null) {
            linkedHashMap.put("module_type", str2);
        }
        if (C89219l.m154714a((Object) str, (Object) "logistics") && str3 != null) {
            linkedHashMap.put("free_shipping_condition", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("pay_type", str4);
        }
        if (bool != null) {
            linkedHashMap.put("is_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_balance_shown", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (!(str5 == null || str5.length() == 0)) {
            linkedHashMap.put("pay_type_unavailable_code", str5);
        }
        C45544c.m88082a("tiktokec_module_show", linkedHashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m86726a(String str, HashMap hashMap, String str2, Float f, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            f = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        if ((i & 512) != 0) {
            str6 = null;
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(hashMap, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f101921a);
        linkedHashMap.put("module_name", str);
        linkedHashMap.putAll(hashMap);
        if (str2 != null) {
            linkedHashMap.put("module_type", str2);
        }
        if (C89219l.m154714a((Object) str, (Object) "logistics")) {
            if (f != null) {
                linkedHashMap.put("shipping_price", f);
            }
            if (str3 != null) {
                linkedHashMap.put("shipping_currency", str3);
            }
            if (str4 != null) {
                linkedHashMap.put("free_shipping_condition", str4);
            }
        }
        if (str5 != null) {
            linkedHashMap.put("pay_type", str5);
        }
        if (bool != null) {
            linkedHashMap.put("is_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (bool2 != null) {
            linkedHashMap.put("is_balance_shown", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (!(str6 == null || str6.length() == 0)) {
            linkedHashMap.put("pay_type_unavailable_code", str6);
        }
        C45544c.m88082a("tiktokec_module_click", linkedHashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m86725a(String str, String str2, HashMap hashMap, String str3, String str4, Boolean bool, String str5, Boolean bool2, int i) {
        if ((i & 4) != 0) {
            hashMap = null;
        }
        if ((i & 16) != 0) {
            str4 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            bool2 = null;
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f101921a);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("button_type", str2);
        if (str3 != null) {
            linkedHashMap.put("page_name", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("option_name", str4);
        }
        if (bool != null) {
            linkedHashMap.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str5 != null) {
            linkedHashMap.put("payment_option", str5);
        }
        if (bool2 != null) {
            linkedHashMap.put("is_option_discounted", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        C45544c.m88082a("tiktokec_button_click", linkedHashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m86724a(String str, String str2, HashMap hashMap, String str3, String str4, Boolean bool, int i) {
        if ((i & 4) != 0) {
            hashMap = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            bool = null;
        }
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f101921a);
        linkedHashMap.put("button_name", str);
        linkedHashMap.put("button_type", str2);
        if (str3 != null) {
            linkedHashMap.put("page_name", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("payment_option", str4);
        }
        if (bool != null) {
            linkedHashMap.put("is_option_discounted", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (hashMap != null) {
            linkedHashMap.putAll(hashMap);
        }
        C45544c.m88082a("tiktokec_button_show", linkedHashMap);
    }

    /* renamed from: a */
    public static void m86735a(boolean z, boolean z2, String str, boolean z3, String str2, HashMap<String, Object> hashMap, String str3, long j, String str4, Boolean bool) {
        Object obj;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(str4, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(f101921a);
        if (!C89219l.m154714a((Object) str, (Object) "")) {
            linkedHashMap.remove("product_id");
            linkedHashMap.remove("author_id");
            Object obj2 = linkedHashMap.get("entrance_info");
            HashMap hashMap2 = null;
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            try {
                obj = C45264j.m87844a().mo46670a((String) obj2, HashMap.class);
            } catch (Exception unused) {
                obj = null;
            }
            HashMap hashMap3 = (HashMap) obj;
            if (hashMap3 != null) {
                hashMap3.remove("product_id");
                hashMap3.remove("author_id");
                hashMap2 = hashMap3;
            }
            linkedHashMap.put("entrance_info", C80342dg.m139300a().mo46674b(hashMap2));
        }
        linkedHashMap.put("order_id", str);
        linkedHashMap.put("is_edit_address", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("is_edit_quantity", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("is_success", Integer.valueOf(z3 ? 1 : 0));
        linkedHashMap.put("fail_reason", str2);
        if (z3) {
            linkedHashMap.put("total_time", Long.valueOf((SystemClock.elapsedRealtime() - f101923c) - f101925e));
        }
        linkedHashMap.putAll(hashMap);
        if (!(str3 == null || str3.length() == 0)) {
            linkedHashMap.put("pay_type", str3);
        }
        linkedHashMap.put("api_duration", String.valueOf(j));
        linkedHashMap.put("cart_item_id", str4);
        if (bool != null) {
            linkedHashMap.put("is_pay_saved", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        C45544c.m88082a("tiktokec_submit_order_result", linkedHashMap);
    }

    /* renamed from: a */
    public static void m86721a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("popup_name", str);
        if (str2 != null) {
            linkedHashMap.put("error_code", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("pay_type", str3);
        }
        C45544c.m88082a("tiktokec_popup_show", linkedHashMap);
    }

    /* renamed from: a */
    public static /* synthetic */ void m86722a(String str, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        m86723a(str, str2, str3, (String) null);
    }

    /* renamed from: a */
    public static void m86723a(String str, String str2, String str3, String str4) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "order_submit");
        linkedHashMap.put("popup_name", str);
        linkedHashMap.put("action_type", str2);
        if (str3 != null) {
            linkedHashMap.put("error_code", str3);
        }
        if (str4 != null) {
            linkedHashMap.put("pay_type", str4);
        }
        C45544c.m88082a("tiktokec_popup_click", linkedHashMap);
    }

    /* renamed from: a */
    private static /* synthetic */ void m86734a(boolean z, String str, boolean z2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        m86731a(z, (Boolean) null, str, z2);
    }

    /* renamed from: a */
    private static void m86731a(boolean z, Boolean bool, String str, boolean z2) {
        boolean z3 = true;
        if (!z) {
            new C43730g(str, f101929i > 0, z2).mo76747d();
        }
        if (z2) {
            if (f101929i <= 0) {
                z3 = false;
            }
            new C43723c(z3, z, bool, str).mo76747d();
        }
    }

    /* renamed from: a */
    public static void m86730a(HashMap<String, Object> hashMap, boolean z, boolean z2, String str, String str2, Integer num) {
        C89219l.m154721d(hashMap, "");
        long j = f101921a.get("click_buynow_start_time");
        if (j == null) {
            j = -1L;
        }
        C89219l.m154716b(j, "");
        C45544c.m88081a("tiktokec_get_order_summary_result", new C43736d(hashMap, str, str2, z, j, num, z2));
    }

    /* renamed from: a */
    public static void m86729a(HashMap<String, Object> hashMap, int i) {
        C89219l.m154721d(hashMap, "");
        long j = f101921a.get("click_buynow_start_time");
        if (j == null) {
            j = -1L;
        }
        C89219l.m154716b(j, "");
        C45544c.m88081a("rd_tiktokec_enter_order_submit_duration", new C43733a(hashMap, i, j));
    }

    /* renamed from: a */
    public static void m86712a() {
        f101929i++;
    }

    /* renamed from: b */
    public static void m86737b() {
        f101928h = SystemClock.elapsedRealtime() - f101927g;
    }

    /* renamed from: c */
    public static void m86738c() {
        new C43728f(SystemClock.elapsedRealtime() - f101923c, f101928h, f101929i).mo76747d();
    }

    static {
        Covode.recordClassIndex(51997);
    }

    /* renamed from: a */
    public static void m86717a(String str) {
        C89219l.m154721d(str, "");
        new C43721b(str).mo76747d();
    }

    /* renamed from: c */
    public static void m86739c(String str) {
        C89219l.m154721d(str, "");
        C45544c.m88081a("tiktokec_banner_show", new C43735c(str));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h$b */
    public static final class C43734b extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f101935a;

        /* renamed from: b */
        final /* synthetic */ String f101936b;

        static {
            Covode.recordClassIndex(51999);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43734b(String str, String str2) {
            super(1);
            this.f101935a = str;
            this.f101936b = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, C43732h.f101921a);
            aVar2.mo76752b("banner_id", this.f101935a);
            aVar2.mo76752b("action_type", this.f101936b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h$c */
    static final class C43735c extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f101937a;

        static {
            Covode.recordClassIndex(52000);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43735c(String str) {
            super(1);
            this.f101937a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, C43732h.f101921a);
            aVar2.mo76752b("banner_id", this.f101937a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h$a */
    static final class C43733a extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ HashMap f101932a;

        /* renamed from: b */
        final /* synthetic */ int f101933b;

        /* renamed from: c */
        final /* synthetic */ Object f101934c;

        static {
            Covode.recordClassIndex(51998);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43733a(HashMap hashMap, int i, Object obj) {
            super(1);
            this.f101932a = hashMap;
            this.f101933b = i;
            this.f101934c = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C45544c.C45545a.m88084a(aVar2, this.f101932a);
            aVar2.mo76752b("load_success", Integer.valueOf(this.f101933b));
            aVar2.mo76752b("page_name", "order_submit");
            Object obj = this.f101934c;
            if ((obj instanceof Long) && (!C89219l.m154714a(obj, (Object) -1L))) {
                aVar2.mo76750a("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.f101934c).longValue()));
            }
            aVar2.mo76752b("image_load_duration", Long.valueOf(SystemClock.elapsedRealtime() - C43732h.f101930j));
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[Catch:{ Exception -> 0x0058 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[Catch:{ Exception -> 0x0058 }, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m86736b(java.lang.String r7) {
        /*
            java.lang.String r6 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r6)
            h.m.l r0 = com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d.f106067b     // Catch:{ Exception -> 0x0058 }
            r5 = 2
            r4 = 0
            r3 = 0
            h.m.j r0 = p4600h.p4622m.C89350l.find$default(r0, r7, r3, r5, r4)     // Catch:{ Exception -> 0x0058 }
            r2 = 1
            if (r0 == 0) goto L_0x0038
            java.lang.String r1 = r0.mo143720b()     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x0038
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0058 }
            java.util.List r0 = p4600h.p4622m.C89361p.m154915b(r1, r0)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x0038
            java.lang.Object r2 = p4600h.p4601a.C89070n.m154561b(r0, r2)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0058 }
        L_0x0029:
            h.m.l r0 = com.p2082ss.android.ugc.aweme.ecommerce.track.C45546d.f106068c     // Catch:{ Exception -> 0x0058 }
            h.m.j r0 = p4600h.p4622m.C89350l.find$default(r0, r7, r3, r5, r4)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = r0.mo143720b()     // Catch:{ Exception -> 0x0058 }
            if (r1 != 0) goto L_0x003b
            goto L_0x003a
        L_0x0038:
            r2 = r4
            goto L_0x0029
        L_0x003a:
            r1 = r6
        L_0x003b:
            if (r2 == 0) goto L_0x0043
            boolean r0 = p4600h.p4622m.C89361p.m154870a(r2)     // Catch:{ Exception -> 0x0058 }
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r3 = 1
        L_0x0044:
            if (r3 != 0) goto L_0x0057
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058 }
            r0.<init>()     // Catch:{ Exception -> 0x0058 }
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch:{ Exception -> 0x0058 }
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch:{ Exception -> 0x0058 }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x0058 }
        L_0x0057:
            return r6
        L_0x0058:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h.m86736b(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h$d */
    public static final class C43736d extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ HashMap f101938a;

        /* renamed from: b */
        final /* synthetic */ String f101939b;

        /* renamed from: c */
        final /* synthetic */ String f101940c;

        /* renamed from: d */
        final /* synthetic */ boolean f101941d;

        /* renamed from: e */
        final /* synthetic */ Object f101942e;

        /* renamed from: f */
        final /* synthetic */ Integer f101943f;

        /* renamed from: g */
        final /* synthetic */ boolean f101944g;

        static {
            Covode.recordClassIndex(52001);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43736d(HashMap hashMap, String str, String str2, boolean z, Object obj, Integer num, boolean z2) {
            super(1);
            this.f101938a = hashMap;
            this.f101939b = str;
            this.f101940c = str2;
            this.f101941d = z;
            this.f101942e = obj;
            this.f101943f = num;
            this.f101944g = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            int i;
            C45544c.C45545a aVar2 = aVar;
            String str = "";
            C89219l.m154721d(aVar2, str);
            aVar2.mo76752b("EVENT_ORIGIN_FEATURE", "TEMAI");
            C45544c.C45545a.m88084a(aVar2, this.f101938a);
            Object obj = this.f101939b;
            if (obj == null) {
                obj = str;
            }
            aVar2.mo76752b("is_success", obj);
            String str2 = this.f101940c;
            if (str2 != null) {
                str = str2;
            }
            aVar2.mo76752b("fail_reason", str);
            aVar2.mo76752b("is_retry", Integer.valueOf(this.f101941d ? 1 : 0));
            aVar2.mo76752b("page_name", "order_submit");
            if (C43732h.f101928h != -1) {
                aVar2.mo76753c("api_duration", Long.valueOf(C43732h.f101928h));
            }
            Object obj2 = this.f101942e;
            int i2 = 1;
            if ((obj2 instanceof Long) && (!C89219l.m154714a(obj2, (Object) -1L))) {
                aVar2.mo76750a("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) this.f101942e).longValue()));
            }
            Integer num = this.f101943f;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            aVar2.mo76752b("is_delivery_info_complete", Integer.valueOf(i));
            if (C43732h.f101929i > 0) {
                i2 = 2;
            } else if (this.f101944g) {
                i2 = 0;
            }
            aVar2.mo76750a("request_type", String.valueOf(i2));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.a.h$e */
    public static final class C43737e extends AbstractC89220m implements AbstractC89172b<C45544c.C45545a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f101945a;

        /* renamed from: b */
        final /* synthetic */ String f101946b;

        /* renamed from: c */
        final /* synthetic */ boolean f101947c;

        /* renamed from: d */
        final /* synthetic */ HashMap f101948d;

        static {
            Covode.recordClassIndex(52002);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43737e(int i, String str, boolean z, HashMap hashMap) {
            super(1);
            this.f101945a = i;
            this.f101946b = str;
            this.f101947c = z;
            this.f101948d = hashMap;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C45544c.C45545a aVar) {
            String str;
            C45544c.C45545a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo76752b("page_name", "order_submit");
            aVar2.mo76752b("is_check_passed", Integer.valueOf(this.f101945a));
            aVar2.mo76753c("api_path", this.f101946b);
            if (this.f101947c) {
                str = "yes";
            } else {
                str = "no";
            }
            aVar2.mo76752b("is_retry", str);
            HashMap hashMap = this.f101948d;
            if (hashMap != null) {
                aVar2.mo76753c("anchor_show_type", hashMap.get("anchor_show_type"));
                aVar2.mo76753c("author_id", this.f101948d.get("author_id"));
                aVar2.mo76753c("enter_from_info", this.f101948d.get("enter_from_info"));
                aVar2.mo76753c("entrance_form", this.f101948d.get("entrance_form"));
                aVar2.mo76753c("entrance_info", this.f101948d.get("entrance_info"));
                aVar2.mo76753c("follow_status", this.f101948d.get("follow_status"));
                aVar2.mo76753c("product_id", this.f101948d.get("product_id"));
                aVar2.mo76753c("product_source", this.f101948d.get("product_source"));
                aVar2.mo76753c("source", this.f101948d.get("source"));
                aVar2.mo76753c("source_from", this.f101948d.get("source_from"));
                aVar2.mo76753c("source_page_type", this.f101948d.get("source_page_type"));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m86716a(Integer num) {
        String str;
        LinkedHashMap<String, Object> linkedHashMap = f101921a;
        Object obj = linkedHashMap.get("click_buynow_start_time");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        linkedHashMap2.put("page_name", "order_submit");
        if ((obj instanceof Long) && (!C89219l.m154714a(obj, (Object) -1L))) {
            linkedHashMap2.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (f101929i > 0) {
            str = "yes";
        } else {
            str = "no";
        }
        linkedHashMap2.put("is_retry", str);
        if (f101929i > 0) {
            num = 2;
        }
        linkedHashMap2.put("request_type", String.valueOf(num));
        C45544c.m88082a("rd_tiktokec_first_bill_info_request_send", linkedHashMap2);
    }

    /* renamed from: a */
    private static void m86718a(String str, Boolean bool) {
        C89219l.m154721d(str, "");
        new C43725d(str, bool, null).mo76747d();
    }

    /* renamed from: a */
    public static void m86713a(BillInfoResponse billInfoResponse, Boolean bool, String str) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (str != null) {
            m86734a(false, m86736b(str), z, 2);
        } else if (billInfoResponse == null) {
            m86734a(false, "-1", z, 2);
        } else if (!billInfoResponse.isCodeOK()) {
            m86734a(false, String.valueOf(billInfoResponse.code), z, 2);
        } else if (billInfoResponse.data == null || billInfoResponse.data.isEmpty()) {
            String str2 = billInfoResponse.message;
            if (str2 == null) {
                str2 = "-2";
            }
            m86731a(false, (Boolean) true, str2, z);
        } else {
            m86734a(true, (String) null, z, 6);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m86719a(String str, Boolean bool, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        m86718a(str, bool);
    }

    /* renamed from: a */
    public static /* synthetic */ void m86720a(String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        m86721a(str, str2, (String) null);
    }

    /* renamed from: a */
    private static void m86714a(Boolean bool, HashMap<String, Object> hashMap, String str, String str2, String str3, String str4, Integer num) {
        C89219l.m154721d(hashMap, "");
        LinkedHashMap<String, Object> linkedHashMap = f101921a;
        Object obj = linkedHashMap.get("click_buynow_start_time");
        if (obj == null) {
            obj = -1L;
        }
        C89219l.m154716b(obj, "");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(linkedHashMap);
        linkedHashMap2.putAll(hashMap);
        if ((obj instanceof Long) && (!C89219l.m154714a(obj, (Object) -1L))) {
            linkedHashMap2.put("start_click_to_now", Long.valueOf(SystemClock.elapsedRealtime() - ((Number) obj).longValue()));
        }
        if (str != null) {
            linkedHashMap2.put("page_name", str);
        }
        if (str2 != null) {
            linkedHashMap2.put("previous_page", str2);
        }
        if (bool != null) {
            bool.booleanValue();
            linkedHashMap2.put("is_fullscreen", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str3 != null) {
            linkedHashMap2.put("option_list", str3);
        }
        if (str4 != null) {
            linkedHashMap2.put("cart_item_id", str4);
        }
        if (num != null) {
            linkedHashMap2.put("osp_reload_tag", num);
        }
        C45544c.m88082a("tiktokec_enter_page", linkedHashMap2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m86715a(Boolean bool, HashMap hashMap, String str, String str2, String str3, String str4, Integer num, int i) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Integer num2 = null;
        if ((i & 4) != 0) {
            str5 = null;
        }
        if ((i & 8) != 0) {
            str6 = null;
        }
        if ((i & 16) != 0) {
            str7 = null;
        }
        if ((i & 32) != 0) {
            str8 = null;
        }
        if ((i & 64) == 0) {
            num2 = num;
        }
        m86714a(bool, hashMap, str5, str6, str7, str8, num2);
    }
}
