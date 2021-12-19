package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.p3155a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.recommend.p3154a.C54914a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55056h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55057i;
import com.p2082ss.android.ugc.aweme.utils.C80257bo;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a */
public final class C54916a {

    /* renamed from: c */
    public static boolean f125722c = true;

    /* renamed from: d */
    public static final C54917a f125723d = new C54917a((byte) 0);

    /* renamed from: a */
    public boolean f125724a = true;

    /* renamed from: b */
    public boolean f125725b = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommend.a.a.a$a */
    public static final class C54917a {
        static {
            Covode.recordClassIndex(64639);
        }

        private C54917a() {
        }

        public /* synthetic */ C54917a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(64638);
    }

    /* renamed from: b */
    public static void m100541b() {
        C54914a.C54915a.m100539a().mo91918a(0);
        C54914a.C54915a.m100539a().mo91919a(0L);
        C54914a.C54915a.m100539a().mo91920b(0);
    }

    /* renamed from: a */
    public static void m100540a() {
        int i;
        if (f125722c) {
            f125722c = false;
            C55057i a = C55056h.m100680a();
            int i2 = 3;
            if (a != null) {
                i = a.f126004c;
                i2 = a.f126005d;
            } else {
                i = 3;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = C54914a.C54915a.m100539a().f125718a.getLong("last_session_time_ms", -1);
            int i3 = C54914a.C54915a.m100539a().f125718a.getInt("session_count", 0);
            if (C80257bo.m139107a(j)) {
                int i4 = i3 + 1;
                C54914a.C54915a.m100539a().mo91918a(i4);
                if (i4 >= i) {
                    C54914a.C54915a.m100539a().mo91920b(currentTimeMillis + (((long) i2) * 86400000));
                    return;
                }
                return;
            }
            C54914a.C54915a.m100539a().mo91919a(currentTimeMillis);
            C54914a.C54915a.m100539a().mo91918a(1);
        }
    }
}
