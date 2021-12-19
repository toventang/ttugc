package com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b;

import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.utils.C11199a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import com.p2082ss.ugc.effectplatform.util.C87007u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.common.b.b */
public final class C45790b {

    /* renamed from: a */
    public static final C45790b f106685a = new C45790b();

    /* renamed from: b */
    private static final HashSet<String> f106686b = new HashSet<>();

    /* renamed from: c */
    private static final HashSet<String> f106687c = new HashSet<>();

    /* renamed from: d */
    private static final HashSet<String> f106688d = new HashSet<>();

    private C45790b() {
    }

    static {
        Covode.recordClassIndex(54308);
    }

    /* renamed from: a */
    public static void m88389a(C33744d dVar) {
        if (!C87007u.m150697a(C6544e.m14001o())) {
            dVar.mo59983a("rec_content_id", C6544e.m14001o());
            dVar.mo59983a("rec_content_type", C6544e.m14002p());
        }
    }

    /* renamed from: a */
    public static C33744d m88388a(C45806a aVar) {
        C89219l.m154721d(aVar, "");
        C33744d dVar = new C33744d();
        String b = aVar.mo77118b("author_id");
        if (b == null) {
            b = "";
        }
        C33744d a = dVar.mo59983a("author_id", b).mo59983a("EVENT_ORIGIN_FEATURE", "TEMAI");
        String b2 = aVar.mo77118b("product_id");
        if (b2 == null) {
            b2 = "";
        }
        C33744d a2 = a.mo59983a("product_id", b2);
        String b3 = aVar.mo77118b("product_source");
        if (b3 == null) {
            b3 = "";
        }
        C33744d a3 = a2.mo59983a("product_source", b3);
        String b4 = aVar.mo77118b("source_from");
        if (b4 == null) {
            b4 = "";
        }
        C33744d a4 = a3.mo59983a("source_from", b4);
        String b5 = aVar.mo77118b("source");
        if (b5 == null) {
            b5 = "";
        }
        C33744d a5 = a4.mo59983a("source", b5);
        String b6 = aVar.mo77118b("room_id");
        if (b6 == null) {
            b6 = "";
        }
        C33744d a6 = a5.mo59983a("room_id", b6);
        String b7 = aVar.mo77118b("enter_from_merge");
        if (b7 == null) {
            b7 = "";
        }
        C33744d a7 = a6.mo59983a("enter_from_merge", b7);
        String b8 = aVar.mo77118b("enter_method");
        if (b8 == null) {
            b8 = "";
        }
        C33744d a8 = a7.mo59983a("enter_method", b8);
        String b9 = aVar.mo77118b("action_type");
        if (b9 == null) {
            b9 = "";
        }
        C33744d a9 = a8.mo59983a("action_type", b9);
        String b10 = aVar.mo77118b("carrier_type");
        if (b10 == null) {
            b10 = "";
        }
        C33744d a10 = a9.mo59983a("carrier_type", b10);
        String b11 = aVar.mo77118b("page_type");
        if (b11 == null) {
            b11 = "";
        }
        C33744d a11 = a10.mo59983a("page_type", b11);
        String b12 = aVar.mo77118b("anchor_show_type");
        if (b12 == null) {
            b12 = "";
        }
        C33744d a12 = a11.mo59983a("anchor_show_type", b12);
        String b13 = aVar.mo77118b("follow_status");
        if (b13 == null) {
            b13 = "-1";
        }
        C33744d a13 = a12.mo59983a("follow_status", b13);
        String b14 = aVar.mo77118b("entrance_form");
        if (b14 == null) {
            b14 = "";
        }
        C33744d a14 = a13.mo59983a("entrance_form", b14);
        String b15 = aVar.mo77118b("page_name");
        if (b15 == null) {
            b15 = "";
        }
        C33744d a15 = a14.mo59983a("page_name", b15);
        String b16 = aVar.mo77118b("is_ad");
        if (b16 == null) {
            b16 = "";
        }
        C33744d a16 = a15.mo59983a("is_ad", b16);
        String b17 = aVar.mo77118b("request_id");
        if (b17 == null) {
            b17 = "";
        }
        C33744d a17 = a16.mo59983a("request_id", b17);
        String b18 = aVar.mo77118b("search_id");
        if (b18 == null) {
            b18 = "";
        }
        C33744d a18 = a17.mo59983a("search_id", b18);
        String b19 = aVar.mo77118b("search_result_id");
        if (b19 == null) {
            b19 = "";
        }
        C33744d a19 = a18.mo59983a("search_result_id", b19);
        C89219l.m154716b(a19, "");
        return a19;
    }

    /* renamed from: a */
    public static void m88391a(C45806a aVar, String str, Boolean bool, Map<String, String> map, Map<String, String> map2, String str2, String str3, String str4) {
        C89219l.m154721d(aVar, "");
        C33744d a = m88388a(aVar);
        if (str3 != null) {
            a.mo59983a("flashsale_status", str3);
        }
        if (str4 != null) {
            a.mo59983a("countdown_type", str4);
        }
        m88389a(a);
        a.mo59986a(map);
        a.mo59986a(map2);
        C39162r.m79460a("livesdk_tiktokec_product_entrance_show", a.f79943a);
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            if (str2 != null) {
                hashMap.put("refer", str2);
            }
            HashMap hashMap2 = new HashMap();
            if (str != null) {
                hashMap2.put("room_id", str);
            }
            C11199a.m19849a("live_ad", "othershow", hashMap, hashMap2);
        }
    }

    /* renamed from: b */
    public static void m88393b(C45806a aVar, String str, Boolean bool, Map<String, String> map, Map<String, String> map2, String str2, String str3, String str4) {
        C89219l.m154721d(aVar, "");
        C33744d a = m88388a(aVar);
        if (str3 != null) {
            a.mo59983a("flashsale_status", str3);
        }
        if (str4 != null) {
            a.mo59983a("countdown_type", str4);
        }
        m88389a(a);
        a.mo59986a(map);
        a.mo59986a(map2);
        C39162r.m79460a("livesdk_tiktokec_product_entrance_click", a.f79943a);
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("refer", str2);
            HashMap hashMap2 = new HashMap();
            if (str != null) {
                hashMap2.put("room_id", str);
            }
            C11199a.m19849a("live_ad", "otherclick", hashMap, hashMap2);
        }
    }

    /* renamed from: a */
    public static void m88392a(C45806a aVar, String str, Boolean bool, Map<String, String> map, Map<String, String> map2, String str2, String str3, String str4, String str5) {
        C89219l.m154721d(aVar, "");
        C33744d a = m88388a(aVar).mo59983a("item_order", aVar.mo77118b("item_order"));
        String b = aVar.mo77118b("list_skin_type");
        if (b == null) {
            b = "";
        }
        C33744d a2 = a.mo59983a("list_skin_type", b);
        String b2 = aVar.mo77118b("product_skin_type");
        if (b2 == null) {
            b2 = "";
        }
        C33744d a3 = a2.mo59983a("product_skin_type", b2);
        if (str3 != null) {
            a3.mo59983a("flashsale_status", str3);
        }
        if (str4 != null) {
            a3.mo59983a("countdown_type", str4);
        }
        if (str5 != null) {
            a3.mo59983a("is_sold_out", str5);
        }
        C89219l.m154716b(a3, "");
        m88389a(a3);
        a3.mo59986a(map);
        a3.mo59986a(map2);
        C39162r.m79460a("livesdk_tiktokec_product_show", a3.f79943a);
        if (C89219l.m154714a((Object) bool, (Object) true)) {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("refer", str2);
            HashMap hashMap2 = new HashMap();
            if (str != null) {
                hashMap2.put("room_id", str);
            }
            C11199a.m19849a("live_ad", "othershow", hashMap, hashMap2);
        }
    }
}
