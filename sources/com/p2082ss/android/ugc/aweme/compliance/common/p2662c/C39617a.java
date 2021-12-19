package com.p2082ss.android.ugc.aweme.compliance.common.p2662c;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.c.a */
public final class C39617a {

    /* renamed from: a */
    public static final C39617a f93401a = new C39617a();

    private C39617a() {
    }

    static {
        Covode.recordClassIndex(47331);
    }

    /* renamed from: a */
    public static void m80456a(String str, int i) {
        C89219l.m154721d(str, "");
        C33830n.m69192a("compliance_api_status", "", new C33743c().mo59976a(StringSet.type, str).mo59974a("status", Integer.valueOf(i)).mo59977a());
    }

    /* renamed from: a */
    public static void m80455a(Integer num, C1213t<Integer> tVar, C1213t<Integer> tVar2) {
        Integer value;
        C89219l.m154721d(tVar, "");
        C89219l.m154721d(tVar2, "");
        if (num != null && num.intValue() == 0) {
            Integer value2 = tVar.getValue();
            if ((value2 != null && value2.intValue() == 1) || ((value = tVar2.getValue()) != null && value.intValue() == 1)) {
                C33830n.m69192a("unexpectable_personalize_ad_settings", "", new C33743c().mo59974a("pers_ad_third_party_networks_mode", tVar.getValue()).mo59974a("pers_ad_third_party_networks_mode", tVar2.getValue()).mo59977a());
            }
        }
    }

    /* renamed from: a */
    public static void m80457a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C33830n.m69192a("compliance_api_status", "", new C33743c().mo59976a(StringSet.type, str).mo59974a("status", (Integer) 1).mo59976a("error_message", str3).mo59976a("tns_logId", str2).mo59977a());
    }

    /* renamed from: a */
    public static void m80458a(String str, boolean z, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        if (!z) {
            C33743c a = new C33743c().mo59976a(StringSet.type, str);
            if (map != null) {
                a.mo59976a("error_message", map.toString());
            }
            C33830n.m69192a("compliance_assert", "", a.mo59977a());
        }
    }
}
