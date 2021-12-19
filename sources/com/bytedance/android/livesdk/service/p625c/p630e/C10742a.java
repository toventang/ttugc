package com.bytedance.android.livesdk.service.p625c.p630e;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.e.a */
public final class C10742a {

    /* renamed from: a */
    public static final C10742a f25880a = new C10742a();

    private C10742a() {
    }

    static {
        Covode.recordClassIndex(12339);
    }

    /* renamed from: a */
    public static void m19332a(String str) {
        String str2;
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        hashMap.put(StringSet.type, "gifting");
        if (C89219l.m154714a((Object) str, (Object) "reject")) {
            str2 = "dark_pattern_group";
        } else {
            str2 = "frequency";
        }
        hashMap.put("risk_control_scenario", str2);
        C6501b.C6502a.m13948a("livesdk_hit_risk_control_popup_show").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
    }

    /* renamed from: a */
    public static void m19333a(String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put(StringSet.type, "gifting");
        if (C89219l.m154714a((Object) str, (Object) "reject")) {
            str3 = "dark_pattern_group";
        } else {
            str3 = "frequency";
        }
        hashMap.put("risk_control_scenario", str3);
        hashMap.put("click_type", str2);
        C6501b.C6502a.m13948a("livesdk_hit_risk_control_popup_click").mo12639a().mo12652a((Map<String, String>) hashMap).mo12655b();
    }
}
