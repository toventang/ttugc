package com.bytedance.p1399im.core.internal.utils;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.im.core.internal.utils.s */
public class C20041s {

    /* renamed from: a */
    public static AbstractC20003k f47627a;

    /* renamed from: b */
    public static AbstractC20003k f47628b;

    /* renamed from: c */
    private static volatile long f47629c;

    /* renamed from: d */
    private static C20041s f47630d;

    static {
        Covode.recordClassIndex(22886);
    }

    /* renamed from: a */
    public static void m37881a(long j) {
        long d = m37890d();
        if (j <= d) {
            C19512f.m36457b("imsdk", "SPUtils try to set invalid indexV2:" + j + ", local:" + d, (Throwable) null);
            return;
        }
        C19512f.m36457b("imsdk", "SPUtils update indexV2:" + j + ", local:" + d, (Throwable) null);
        f47627a.mo27991a(m37878a("base_msg_index_v2"), Long.valueOf(j));
    }

    /* renamed from: com.bytedance.im.core.internal.utils.s$a */
    static class C20042a implements AbstractC20003k {

        /* renamed from: a */
        private SharedPreferences f47631a;

        static {
            Covode.recordClassIndex(22887);
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: a */
        public final void mo27988a() {
            this.f47631a.edit().clear().commit();
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: a */
        public final int mo27987a(String str) {
            return this.f47631a.getInt(str, 0);
        }

        public C20042a(String str) {
            this.f47631a = C34822d.m71158a(C19483d.m36365a().f46156a, str, 0);
            C19512f.m36457b("imsdk", "DefaultSP constructor, spName:".concat(String.valueOf(str)), (Throwable) null);
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: b */
        public final boolean mo27997b(String str) {
            return this.f47631a.getBoolean(str, false);
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: b */
        public final String mo27996b(String str, String str2) {
            return this.f47631a.getString(str, str2);
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: b */
        public final long mo27994b(String str, Long l) {
            return this.f47631a.getLong(str, l.longValue());
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: a */
        public final void mo27989a(String str, int i) {
            this.f47631a.edit().putInt(str, i).commit();
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: b */
        public final Float mo27995b(String str, Float f) {
            return Float.valueOf(this.f47631a.getFloat(str, f.floatValue()));
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: a */
        public final void mo27990a(String str, Float f) {
            this.f47631a.edit().putFloat(str, f.floatValue()).commit();
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: a */
        public final void mo27991a(String str, Long l) {
            this.f47631a.edit().putLong(str, l.longValue()).commit();
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: a */
        public final void mo27992a(String str, String str2) {
            this.f47631a.edit().putString(str, str2).commit();
        }

        @Override // com.bytedance.p1399im.core.internal.utils.AbstractC20003k
        /* renamed from: a */
        public final void mo27993a(String str, boolean z) {
            this.f47631a.edit().putBoolean(str, z).commit();
        }
    }

    /* renamed from: b */
    static int m37882b() {
        return f47627a.mo27987a(m37878a("current_link_mode"));
    }

    /* renamed from: f */
    public static int m37896f() {
        return f47627a.mo27987a(m37878a("im_reset_count"));
    }

    /* renamed from: g */
    public static long m37898g() {
        return f47627a.mo27994b("conversation_check_time", (Long) 0L);
    }

    /* renamed from: h */
    public static void m37900h() {
        f47627a.mo27993a(m37878a("allow_conversation_pagination"), true);
    }

    /* renamed from: i */
    public static boolean m37902i() {
        return f47627a.mo27997b(m37878a("allow_conversation_pagination"));
    }

    /* renamed from: l */
    public static boolean m37905l() {
        return f47627a.mo27997b(m37878a("msg_flag_bits_updated"));
    }

    /* renamed from: m */
    public static void m37906m() {
        f47627a.mo27993a(m37878a("msg_flag_bits_updated"), true);
    }

    /* renamed from: n */
    public static void m37907n() {
        C19512f.m36457b("imsdk", "SPUtils clear all", (Throwable) null);
        f47627a.mo27988a();
    }

    /* renamed from: c */
    public static boolean m37889c() {
        return f47627a.mo27997b(m37878a("ever_use_recent_link"));
    }

    /* renamed from: e */
    public static long m37893e() {
        return f47627a.mo27994b(m37878a("im_reset_time"), (Long) 0L);
    }

    /* renamed from: j */
    public static long m37903j() {
        return f47627a.mo27994b(m37878a("conversation_box_delete_time"), (Long) 0L);
    }

    /* renamed from: k */
    public static void m37904k() {
        f47627a.mo27991a(m37878a("conversation_box_delete_time"), (Long) 0L);
    }

    /* renamed from: a */
    public static synchronized C20041s m37876a() {
        C20041s sVar;
        synchronized (C20041s.class) {
            MethodCollector.m26663i(8968);
            long a = C19483d.m36365a().f46157b.mo27953a();
            if (f47630d == null || a != f47629c) {
                synchronized (C20041s.class) {
                    try {
                        if (f47630d == null || a != f47629c) {
                            f47630d = new C20041s();
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(8968);
                        throw th;
                    }
                }
            }
            sVar = f47630d;
            MethodCollector.m26664o(8968);
        }
        return sVar;
    }

    /* renamed from: d */
    public static long m37890d() {
        long b = f47627a.mo27994b(m37878a("base_msg_index_v2"), (Long) -1L);
        C19512f.m36457b("imsdk", "SPUtils getBaseMsgIndexV2, result:".concat(String.valueOf(b)), (Throwable) null);
        return b;
    }

    private C20041s() {
        String str;
        f47629c = C19483d.m36365a().f46157b.mo27953a();
        if (C19483d.m36365a().f46157b.mo27966g()) {
            str = "imsdk_" + f47629c;
        } else {
            str = "imsdk_sub_" + f47629c;
        }
        AbstractC20003k a = C19483d.m36365a().f46157b.mo27954a(str);
        if (a != null) {
            f47627a = a;
        } else {
            f47627a = new C20042a(str);
        }
        AbstractC20003k a2 = C19483d.m36365a().f46157b.mo27954a("imsdk_0");
        if (a2 != null) {
            f47628b = a2;
        } else {
            f47628b = new C20042a("imsdk_0");
        }
        m37908o();
    }

    /* renamed from: o */
    private static void m37908o() {
        if (C19483d.m36365a().f46157b.mo27953a() > 0 && !f47627a.mo27997b(m37878a(m37878a("key_has_process_error")))) {
            int[] iArr = C19483d.m36365a().mo31141b().f46279s;
            for (int i : iArr) {
                long b = f47628b.mo27994b(m37877a(i, "msg_by_user_cursor"), (Long) -1L);
                long b2 = f47627a.mo27994b(m37877a(i, "msg_by_user_cursor"), (Long) -1L);
                C19512f.m36457b("imsdk", "processHistoryError imsdk0Curosr = " + b + " normalCurosr = " + b2, (Throwable) null);
                if (b2 == -1 && b > 0) {
                    f47627a.mo27993a(m37877a(i, "im_init"), f47628b.mo27997b(m37877a(i, "im_init")));
                    f47627a.mo27993a(m37877a(i, "msg_flag_bits_updated"), f47628b.mo27997b(m37877a(i, "msg_flag_bits_updated")));
                }
                if (b > b2) {
                    f47627a.mo27991a(m37877a(i, "msg_by_user_cursor"), Long.valueOf(b));
                }
                long b3 = f47628b.mo27994b(m37877a(i, "im_init_page_cursor"), (Long) 0L);
                long b4 = f47627a.mo27994b(m37877a(i, "im_init_page_cursor"), (Long) 0L);
                C19512f.m36457b("imsdk", "processHistoryError imsdk0InitCurosr = " + b3 + " normalInitCurosr = " + b4, (Throwable) null);
                if (b3 > b4) {
                    f47627a.mo27991a(m37877a(i, "im_init_page_cursor"), Long.valueOf(b3));
                }
            }
            f47627a.mo27993a(m37878a(m37878a("key_has_process_error")), true);
        }
    }

    /* renamed from: c */
    public static void m37888c(String str) {
        f47628b.mo27992a(m37878a("key_imsdk_settings"), str);
    }

    /* renamed from: b */
    public static void m37885b(long j) {
        f47627a.mo27991a("conversation_check_time", Long.valueOf(j));
    }

    /* renamed from: f */
    public static void m37897f(int i) {
        f47627a.mo27989a(m37878a("recover_version"), i);
    }

    /* renamed from: g */
    public static boolean m37899g(int i) {
        return f47627a.mo27997b(m37877a(i, "im_init"));
    }

    /* renamed from: h */
    public static void m37901h(int i) {
        f47627a.mo27993a(m37877a(i, "im_init"), true);
    }

    /* renamed from: b */
    public static long m37883b(int i) {
        String a = m37877a(i, "recent_conv_version");
        long b = f47627a.mo27994b(a, (Long) -1L);
        C19512f.m36457b("imsdk", "SPUtils getRecentVersion, key:" + a + ", version:" + b, (Throwable) null);
        return b;
    }

    /* renamed from: c */
    public static long m37886c(int i) {
        String a = m37877a(i, "cmd_index");
        long b = f47627a.mo27994b(a, (Long) -1L);
        C19512f.m36457b("imsdk", "SPUtils getCmdIndex, key:" + a + ", index:" + b, (Throwable) null);
        return b;
    }

    /* renamed from: a */
    public static long m37875a(int i) {
        String a = m37877a(i, "msg_by_user_cursor");
        long b = f47627a.mo27994b(a, (Long) -1L);
        C19512f.m36457b("imsdk", "SPUtils getCursor, key:" + a + ", cursor:" + b + ", inbox:" + i + ", uid:" + f47629c, (Throwable) null);
        return b;
    }

    /* renamed from: d */
    public static long m37891d(int i) {
        String a = m37877a(i, "msg_by_user_cursor_in_recent");
        long b = f47627a.mo27994b(a, (Long) -1L);
        C19512f.m36457b("imsdk", "SPUtils getMixCursorInRecentMode, key:" + a + ", cursor:" + b, (Throwable) null);
        return b;
    }

    /* renamed from: e */
    public static boolean m37895e(int i) {
        String a = m37877a(i, "error_conv_version");
        int a2 = f47627a.mo27987a(a) + 1;
        if (a2 <= 2) {
            C19512f.m36457b("imsdk", "SPUtils shouldIgnoreError, key:" + a + ", errorCount:" + a2 + ", return forbid", (Throwable) null);
            f47627a.mo27989a(a, a2);
            return false;
        }
        C19512f.m36457b("imsdk", "SPUtils shouldIgnoreError, key:" + a + ", errorCount:" + a2 + ", return ignore", (Throwable) null);
        f47627a.mo27989a(a, 0);
        return true;
    }

    /* renamed from: b */
    public final synchronized void mo31915b(String str) {
        MethodCollector.m26663i(9124);
        f47627a.mo27992a(m37877a(0, "last_conversation_apply"), str);
        MethodCollector.m26664o(9124);
    }

    /* renamed from: a */
    public static String m37878a(String str) {
        return C19483d.m36365a().f46157b.mo27953a() + "_" + str;
    }

    /* renamed from: e */
    public static void m37894e(int i, long j) {
        f47627a.mo27991a(m37877a(i, "im_init_page_cursor"), Long.valueOf(j));
    }

    /* renamed from: b */
    public static void m37884b(int i, long j) {
        String a = m37877a(i, "recent_conv_version");
        f47627a.mo27991a(a, Long.valueOf(j));
        C19512f.m36457b("imsdk", "SPUtils setRecentVersion, key:" + a + ", version:" + j, (Throwable) null);
        if (j < 0) {
            C19512f.m36457b("imsdk", "SPUtils setRecentVersion=".concat(String.valueOf(j)), new Throwable());
        }
    }

    /* renamed from: c */
    public static void m37887c(int i, long j) {
        String a = m37877a(i, "cmd_index");
        f47627a.mo27991a(a, Long.valueOf(j));
        C19512f.m36457b("imsdk", "SPUtils setCmdIndex, key:" + a + ", index:" + j, (Throwable) null);
        if (j < 0) {
            C19512f.m36457b("imsdk", "SPUtils, setCmdIndex=".concat(String.valueOf(j)), new Throwable());
        }
    }

    /* renamed from: a */
    public static String m37877a(int i, String str) {
        if (i == 0) {
            return C19483d.m36365a().f46157b.mo27953a() + "_" + str;
        }
        return C19483d.m36365a().f46157b.mo27953a() + "_" + str + "_" + i;
    }

    /* renamed from: d */
    public static void m37892d(int i, long j) {
        String a = m37877a(i, "msg_by_user_cursor_in_recent");
        f47627a.mo27991a(a, Long.valueOf(j));
        C19512f.m36457b("imsdk", "SPUtils setMixCursorInRecentMode, key:" + a + ", cursor:" + j, (Throwable) null);
        if (j < 0) {
            C19512f.m36457b("imsdk", "SPUtils, setMixCursorInRecentMode=".concat(String.valueOf(j)), new Throwable());
        }
    }

    /* renamed from: a */
    public static void m37879a(int i, long j) {
        String a = m37877a(i, "msg_by_user_cursor");
        f47627a.mo27991a(a, Long.valueOf(j));
        C19512f.m36457b("imsdk", "SPUtils setCursor, key:" + a + ", cursor:" + j + ", inbox:" + i + ", uid:" + f47629c, (Throwable) null);
        if (j < 0) {
            C19512f.m36457b("imsdk", "SPUtils setCursor=".concat(String.valueOf(j)), new Throwable());
        }
    }

    /* renamed from: a */
    public static void m37880a(int i, long j, int i2) {
        String a = m37877a(i, "error_cursor");
        f47627a.mo27992a(a, j + ":" + i2);
        C19512f.m36457b("imsdk", "SPUtils setErrorCursor, key:" + a + ", cursor:" + j + ", count:" + i2, (Throwable) null);
    }
}
