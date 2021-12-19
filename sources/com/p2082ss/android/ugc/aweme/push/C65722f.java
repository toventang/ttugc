package com.p2082ss.android.ugc.aweme.push;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.utils.C80411ew;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.push.f */
public final class C65722f {

    /* renamed from: a */
    public static final C65723a f148108a = new C65723a((byte) 0);

    static {
        Covode.recordClassIndex(77221);
    }

    /* renamed from: a */
    public static final void m117656a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map) {
        C65723a.m117658a(str, str2, str3, str4, str5, str6, str7, str8, map);
    }

    /* renamed from: a */
    public static final void m117657a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        C65723a.m117660a(z, str, str2, str3, str4, str5, str6);
    }

    /* renamed from: com.ss.android.ugc.aweme.push.f$a */
    public static final class C65723a {
        static {
            Covode.recordClassIndex(77222);
        }

        private C65723a() {
        }

        public /* synthetic */ C65723a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m117659a(String str, String str2, String str3, boolean z) {
            C89219l.m154721d(str3, "");
            C33744d a = new C33744d().mo59983a("enter_from", str3).mo59983a("action_type", str2).mo59980a("is_free_event", !z ? 1 : 0);
            C89219l.m154716b(a, "");
            C80411ew.m139395a(str, a);
            C39162r.m79460a("livesdk_live_event_go_live", a.f79943a);
        }

        /* renamed from: a */
        public static void m117660a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
            if (z) {
                C33744d a = new C33744d().mo59983a("room_id", str).mo59983a("inner_push_type", str4).mo59983a("enter_method", "inner_push").mo59983a("enter_from_merge", "inner_push").mo59983a(StringSet.type, str3).mo59983a("anchor_id", str2).mo59983a("gd_label", str5);
                C89219l.m154716b(a, "");
                C80411ew.m139395a(str6, a);
                C39162r.m79460a("livesdk_inner_push_disappear", a.f79943a);
            }
        }

        /* renamed from: a */
        public static void m117658a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map) {
            C39162r.m79460a("inner_push_disappear", new C33744d().mo59983a("rule_id", str6).mo59983a("push_label", str3).mo59983a("push_channel", str4).mo59983a("room_id", str).mo59983a("anchor_id", str2).mo59983a("o_url", str5).mo59983a("user_id", str7).mo59983a("duration", str8).mo59986a(map).f79943a);
        }
    }
}
