package com.p2082ss.ugc.effectplatform.p4452i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.C86687a;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.util.Map;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.i.b */
public final class C86802b {
    static {
        Covode.recordClassIndex(102501);
    }

    /* renamed from: a */
    public static final void m150355a(AbstractC86801a aVar, boolean z, C86687a aVar2, Map<String, ? extends Object> map, String str) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(map, "");
        C89378p[] pVarArr = new C89378p[3];
        String str2 = aVar2.f195455k;
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[0] = C89387v.m154943a("app_id", str2);
        String str3 = aVar2.f195446b;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[1] = C89387v.m154943a("access_key", str3);
        pVarArr[2] = C89387v.m154943a("effect_platform_type", 1);
        Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
        b.putAll(map);
        if (!z) {
            if (str == null) {
                str = "";
            }
            b.put("error_msg", str);
        }
        aVar.monitorStatusRate("hot_list_success_rate", !z ? 1 : 0, b);
    }

    /* renamed from: a */
    public static final void m150350a(AbstractC86801a aVar, boolean z, C86687a aVar2, Effect effect, String str) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(effect, "");
        C89378p[] pVarArr = new C89378p[5];
        pVarArr[0] = C89387v.m154943a("effect_id", effect.getEffect_id());
        pVarArr[1] = C89387v.m154943a("effect_name", effect.getName());
        pVarArr[2] = C89387v.m154943a("effect_platform_type", 1);
        String str2 = aVar2.f195455k;
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[3] = C89387v.m154943a("app_id", str2);
        String str3 = aVar2.f195446b;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[4] = C89387v.m154943a("access_key", str3);
        Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
        if (!z) {
            if (str == null) {
                str = "";
            }
            b.put("error_msg", str);
        }
        aVar.monitorStatusRate("effect_resource_unzip_success_rate", !z ? 1 : 0, b);
    }

    /* renamed from: a */
    public static final void m150351a(AbstractC86801a aVar, boolean z, C86687a aVar2, String str, String str2) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(str, "");
        C89378p[] pVarArr = new C89378p[4];
        String str3 = aVar2.f195455k;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[0] = C89387v.m154943a("app_id", str3);
        String str4 = aVar2.f195446b;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[1] = C89387v.m154943a("access_key", str4);
        pVarArr[2] = C89387v.m154943a("effect_platform_type", 1);
        pVarArr[3] = C89387v.m154943a("model_name", str);
        Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            b.put("error_msg", str2);
        }
        aVar.monitorStatusRate("find_resource_uri_success_rate", !z ? 1 : 0, b);
    }

    /* renamed from: b */
    public static final void m150357b(AbstractC86801a aVar, boolean z, C86687a aVar2, String str, Map<String, ? extends Object> map, String str2) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        C89378p[] pVarArr = new C89378p[4];
        String str3 = aVar2.f195455k;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[0] = C89387v.m154943a("app_id", str3);
        String str4 = aVar2.f195446b;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[1] = C89387v.m154943a("access_key", str4);
        pVarArr[2] = C89387v.m154943a("effect_platform_type", 1);
        pVarArr[3] = C89387v.m154943a("panel", str);
        Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
        b.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            b.put("error_msg", str2);
        }
        aVar.monitorStatusRate("effect_list_success_rate", !z ? 1 : 0, b);
    }

    /* renamed from: c */
    public static final void m150358c(AbstractC86801a aVar, boolean z, C86687a aVar2, String str, Map<String, ? extends Object> map, String str2) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        C89378p[] pVarArr = new C89378p[5];
        String str3 = aVar2.f195455k;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[0] = C89387v.m154943a("app_id", str3);
        String str4 = aVar2.f195446b;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[1] = C89387v.m154943a("access_key", str4);
        pVarArr[2] = C89387v.m154943a("effect_platform_type", 1);
        pVarArr[3] = C89387v.m154943a("effect_id", str);
        pVarArr[4] = C89387v.m154943a("lru_max_size", String.valueOf(aVar2.f195441I));
        Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
        b.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            b.put("error_msg", str2);
        }
        aVar.monitorStatusRate("effect_download_success_rate", !z ? 1 : 0, b);
    }

    /* renamed from: a */
    public static final void m150354a(AbstractC86801a aVar, boolean z, C86687a aVar2, String str, Map<String, ? extends Object> map, String str2) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(map, "");
        C89378p[] pVarArr = new C89378p[4];
        String str3 = aVar2.f195455k;
        if (str3 == null) {
            str3 = "";
        }
        pVarArr[0] = C89387v.m154943a("app_id", str3);
        String str4 = aVar2.f195446b;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[1] = C89387v.m154943a("access_key", str4);
        pVarArr[2] = C89387v.m154943a("effect_platform_type", 1);
        pVarArr[3] = C89387v.m154943a("panel", str);
        Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
        b.putAll(map);
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            b.put("error_msg", str2);
        }
        aVar.monitorStatusRate("panel_info_success_rate", !z ? 1 : 0, b);
    }

    /* renamed from: a */
    public static final void m150353a(AbstractC86801a aVar, boolean z, C86687a aVar2, String str, String str2, Map<String, ? extends Object> map, String str3) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(map, "");
        C89378p[] pVarArr = new C89378p[5];
        String str4 = aVar2.f195455k;
        if (str4 == null) {
            str4 = "";
        }
        pVarArr[0] = C89387v.m154943a("app_id", str4);
        String str5 = aVar2.f195446b;
        if (str5 == null) {
            str5 = "";
        }
        pVarArr[1] = C89387v.m154943a("access_key", str5);
        pVarArr[2] = C89387v.m154943a("effect_platform_type", 1);
        pVarArr[3] = C89387v.m154943a("panel", str);
        pVarArr[4] = C89387v.m154943a("category", str2);
        Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
        b.putAll(map);
        if (!z) {
            if (str3 == null) {
                str3 = "";
            }
            b.put("error_msg", str3);
        }
        aVar.monitorStatusRate("category_list_success_rate", !z ? 1 : 0, b);
    }

    /* renamed from: a */
    public static final void m150352a(AbstractC86801a aVar, boolean z, C86687a aVar2, String str, String str2, String str3, Map<String, ? extends Object> map, String str4) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(map, "");
        C89378p[] pVarArr = new C89378p[6];
        String str5 = aVar2.f195455k;
        if (str5 == null) {
            str5 = "";
        }
        pVarArr[0] = C89387v.m154943a("app_id", str5);
        String str6 = aVar2.f195446b;
        if (str6 == null) {
            str6 = "";
        }
        pVarArr[1] = C89387v.m154943a("access_key", str6);
        pVarArr[2] = C89387v.m154943a("effect_platform_type", 1);
        pVarArr[3] = C89387v.m154943a("resource_name", str);
        pVarArr[4] = C89387v.m154943a("resource_type", str3);
        if (str2 == null) {
            str2 = "";
        }
        pVarArr[5] = C89387v.m154943a("resource_version", str2);
        Map<String, ? extends Object> b = C89041ag.m154427b(pVarArr);
        b.putAll(map);
        if (!z) {
            if (str4 == null) {
                str4 = "";
            }
            b.put("error_msg", str4);
        }
        aVar.monitorStatusRate("resource_download_success_rate", !z ? 1 : 0, b);
    }
}
