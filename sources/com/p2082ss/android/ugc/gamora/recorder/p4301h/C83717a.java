package com.p2082ss.android.ugc.gamora.recorder.p4301h;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.recorder.h.a */
public final class C83717a {

    /* renamed from: a */
    public static final C83718a f186864a = new C83718a((byte) 0);

    /* renamed from: b */
    private final Keva f186865b;

    static {
        Covode.recordClassIndex(97607);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.h.a$a */
    public static final class C83718a {
        static {
            Covode.recordClassIndex(97608);
        }

        private C83718a() {
        }

        public /* synthetic */ C83718a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo128692a() {
        return this.f186865b.getBoolean("has_enable_switch_duration_after_shooting_tip_shown", false);
    }

    /* renamed from: b */
    public final void mo128693b() {
        this.f186865b.storeBoolean("has_enable_switch_duration_after_shooting_tip_shown", true);
    }

    public C83717a() {
        Keva repo = Keva.getRepo("enable_switch_duration_after_shooting_tip");
        C89219l.m154716b(repo, "");
        this.f186865b = repo;
    }
}
