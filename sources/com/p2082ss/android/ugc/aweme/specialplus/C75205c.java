package com.p2082ss.android.ugc.aweme.specialplus;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.specialplus.c */
public final class C75205c {

    /* renamed from: b */
    public static final C75206a f169108b = new C75206a((byte) 0);

    /* renamed from: a */
    final Keva f169109a;

    static {
        Covode.recordClassIndex(88088);
    }

    /* renamed from: com.ss.android.ugc.aweme.specialplus.c$a */
    public static final class C75206a {
        static {
            Covode.recordClassIndex(88089);
        }

        private C75206a() {
        }

        public /* synthetic */ C75206a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo118389b() {
        return this.f169109a.getInt("special_plus_effect_version", 0);
    }

    /* renamed from: c */
    public final long mo118390c() {
        return this.f169109a.getLong("quick_promo_plus_shown_time", 0);
    }

    public C75205c() {
        Keva repo = Keva.getRepo("special_plus_keva");
        C89219l.m154716b(repo, "");
        this.f169109a = repo;
    }

    /* renamed from: a */
    public final Effect mo118387a() {
        String string = this.f169109a.getString("special_plus_effect", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (Effect) C63238c.f143575b.mo46670a(string, Effect.class);
    }

    /* renamed from: a */
    public final void mo118388a(long j) {
        this.f169109a.storeLong("quick_promo_plus_shown_time", j);
    }
}
