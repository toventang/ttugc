package com.p2082ss.android.ugc.gamora.recorder.p4301h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.h.d */
public final class C83723d {

    /* renamed from: b */
    public static final C83724a f186870b = new C83724a((byte) 0);

    /* renamed from: a */
    public final Keva f186871a;

    static {
        Covode.recordClassIndex(97613);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.h.d$a */
    public static final class C83724a {
        static {
            Covode.recordClassIndex(97614);
        }

        private C83724a() {
        }

        public /* synthetic */ C83724a(byte b) {
            this();
        }
    }

    public C83723d() {
        Keva repo = Keva.getRepo("live_tab_pop_up_in_record");
        C89219l.m154716b(repo, "");
        this.f186871a = repo;
    }

    /* renamed from: b */
    public final boolean mo128697b() {
        return this.f186871a.getBoolean("never_live_flag_when_first_entrance".concat(String.valueOf(C63238c.f143594u.mo93904c())), false);
    }

    /* renamed from: a */
    public final boolean mo128696a() {
        return this.f186871a.getBoolean("has_live_tab_pop_up_show".concat(String.valueOf(C63238c.f143594u.mo93904c())), false);
    }

    /* renamed from: a */
    public final void mo128695a(boolean z) {
        this.f186871a.storeBoolean("never_live_flag_when_first_entrance".concat(String.valueOf(C63238c.f143594u.mo93904c())), z);
    }
}
