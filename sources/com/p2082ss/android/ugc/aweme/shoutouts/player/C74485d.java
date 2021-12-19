package com.p2082ss.android.ugc.aweme.shoutouts.player;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.player.d */
final /* synthetic */ class C74485d extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f167487a = new C74485d();

    static {
        Covode.recordClassIndex(87286);
    }

    C74485d() {
        super(ShoutoutsPlayState.class, "progress", "getProgress()I", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return Integer.valueOf(((ShoutoutsPlayState) obj).getProgress());
    }
}
