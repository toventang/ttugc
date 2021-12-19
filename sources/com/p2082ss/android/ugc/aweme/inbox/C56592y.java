package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.y */
public final class C56592y {
    static {
        Covode.recordClassIndex(66415);
    }

    /* renamed from: a */
    public static final void m102559a(String str, EnumC56508r rVar) {
        String str2;
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("is_auth", "0");
        linkedHashMap.put("platform", "contact");
        String str4 = "on";
        if (C51648a.f118980a.mo87322d().mo86983b()) {
            str2 = str4;
        } else {
            str2 = "unknown";
        }
        linkedHashMap.put("did_status", str2);
        if (!C51648a.f118980a.mo87322d().mo86982a()) {
            str4 = "off";
        }
        linkedHashMap.put("uid_status", str4);
        if (rVar == EnumC56508r.TOP) {
            str3 = "top";
        } else {
            str3 = "bottom";
        }
        linkedHashMap.put("position", str3);
        C39162r.m79460a(str, linkedHashMap);
    }
}
