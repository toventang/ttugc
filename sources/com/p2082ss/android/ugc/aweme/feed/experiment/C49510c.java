package com.p2082ss.android.ugc.aweme.feed.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.keva.Keva;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.c */
public final class C49510c {

    /* renamed from: a */
    public static final C49510c f113878a = new C49510c();

    private C49510c() {
    }

    static {
        Covode.recordClassIndex(58324);
    }

    /* renamed from: a */
    public static Keva m92747a() {
        Keva repo = Keva.getRepo("TTSettingData");
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: b */
    public static boolean m92748b() {
        return m92747a().getBoolean("IsBackgroundAudioEnabled", false);
    }

    /* renamed from: c */
    public static boolean m92749c() {
        if (!m92748b() || !C49509b.m92743a()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private static EnumC49511a m92752f() {
        if (C49509b.m92745c()) {
            return EnumC49511a.PLAY_IN_ORDER;
        }
        return EnumC49511a.REPEAT;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.experiment.c$a */
    public enum EnumC49511a {
        PLAY_IN_ORDER,
        REPEAT;

        static {
            Covode.recordClassIndex(58325);
        }

        public final String toMobString() {
            int i = C49512d.f113880a[ordinal()];
            if (i == 1) {
                return "order";
            }
            if (i == 2) {
                return "repeat";
            }
            throw new C89376n();
        }
    }

    /* renamed from: d */
    public static boolean m92750d() {
        if (!m92748b() || !C49509b.m92743a() || !C17873f.f42636l) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static EnumC49511a m92751e() {
        return EnumC49511a.values()[m92747a().getInt("BackgroundAudioPlayOrder", m92752f().ordinal())];
    }
}
