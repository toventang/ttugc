package com.p2082ss.android.ugc.aweme.shoutouts.player;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.player.c */
final /* synthetic */ class C74484c extends C89232y {

    /* renamed from: a */
    public static final AbstractC89290k f167486a = new C74484c();

    static {
        Covode.recordClassIndex(87285);
    }

    C74484c() {
        super(ShoutoutsPlayState.class, "status", "getStatus()Lcom/ss/android/ugc/aweme/shoutouts/player/DownloadStatus;", 0);
    }

    @Override // p4600h.p4620k.AbstractC89290k, p4600h.p4611f.p4613b.C89232y
    public final Object get(Object obj) {
        return ((ShoutoutsPlayState) obj).getStatus();
    }
}
