package com.p2082ss.android.ugc.aweme.emoji.sysemoji;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46642d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.sysemoji.n */
public final class C46611n {

    /* renamed from: a */
    public static final C46611n f108682a = new C46611n();

    /* renamed from: b */
    private static final C46612o f108683b = new C46612o("0");

    private C46611n() {
    }

    /* renamed from: c */
    public static boolean m89948c() {
        if (m89946a().f108684a == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m89949d() {
        if (m89946a().f108684a == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m89950e() {
        if (m89946a().f108686c == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(55201);
    }

    /* renamed from: a */
    public static C46612o m89946a() {
        try {
            C46612o oVar = (C46612o) SettingsManager.m29616a().mo25396a("sys_emoji_config", C46612o.class);
            if (oVar == null) {
                return f108683b;
            }
            return oVar;
        } catch (Throwable unused) {
            return f108683b;
        }
    }

    /* renamed from: b */
    public static boolean m89947b() {
        try {
            C46642d a = C46642d.m90028a();
            C89219l.m154716b(a, "");
            if (a.mo79255f() < Integer.parseInt(m89946a().f108685b)) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            C51423a.m95791b(3, null, "SystemEmojiFetchSetting update fail " + m89946a().f108685b);
            return false;
        }
    }
}
