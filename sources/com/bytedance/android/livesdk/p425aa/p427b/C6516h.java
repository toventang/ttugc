package com.bytedance.android.livesdk.p425aa.p427b;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;

/* renamed from: com.bytedance.android.livesdk.aa.b.h */
public final class C6516h {

    /* renamed from: a */
    public static final List<String> f16174a = C89070n.m154516a("livesdk_send_gift");

    /* renamed from: b */
    public static final List<String> f16175b = C89070n.m154516a("livesdk_recharge_success");

    /* renamed from: c */
    public static final C6517a f16176c = new C6517a((byte) 0);

    /* renamed from: d */
    private static Map<String, List<String>> f16177d = C89041ag.m154427b(C89387v.m154943a("livesdk_send_gift", C89070n.m154522b("money", "gift_info", "gift_cnt")), C89387v.m154943a("livesdk_recharge_success", Collections.singletonList("money")));

    /* renamed from: com.bytedance.android.livesdk.aa.b.h$a */
    public static final class C6517a {
        static {
            Covode.recordClassIndex(7253);
        }

        private C6517a() {
        }

        public /* synthetic */ C6517a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(7252);
    }

    /* renamed from: a */
    public static void m13963a(Map<String, String> map, String str) {
        List<String> list = f16177d.get(str);
        if (!(list == null || list.isEmpty())) {
            for (String str2 : list) {
                map.remove(str2);
            }
        }
    }
}
