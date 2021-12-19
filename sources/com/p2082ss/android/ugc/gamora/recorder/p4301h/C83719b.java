package com.p2082ss.android.ugc.gamora.recorder.p4301h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.h.b */
public final class C83719b {

    /* renamed from: b */
    public static final C83720a f186866b = new C83720a((byte) 0);

    /* renamed from: a */
    public final Keva f186867a;

    static {
        Covode.recordClassIndex(97609);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.h.b$a */
    public static final class C83720a {
        static {
            Covode.recordClassIndex(97610);
        }

        private C83720a() {
        }

        public /* synthetic */ C83720a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private int m144059b() {
        return this.f186867a.getInt("story_lightening_tab_when_leave", -1);
    }

    public C83719b() {
        Keva repo = Keva.getRepo("story_lightening_landing_strategy");
        C89219l.m154716b(repo, "");
        this.f186867a = repo;
    }

    /* renamed from: a */
    public final boolean mo128694a() {
        if (m144059b() == 0 || m144059b() == -1) {
            return true;
        }
        return false;
    }
}
