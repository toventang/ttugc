package com.p2082ss.android.ugc.aweme.share.improve.p3755a.p3756a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68993ai;
import com.p2082ss.android.ugc.aweme.share.qrcode.DialogC69376a;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.a.b */
public final class C68969b extends C68993ai {

    /* renamed from: b */
    private final Music f154295b;

    static {
        Covode.recordClassIndex(81283);
    }

    public C68969b(Music music) {
        C89219l.m154721d(music, "");
        this.f154295b = music;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h, com.p2082ss.android.ugc.aweme.share.improve.p3755a.C68993ai
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        String musicName;
        int userCount;
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        Music music = this.f154295b;
        if (music == null) {
            musicName = "";
        } else {
            musicName = music.getMusicName();
        }
        Music music2 = this.f154295b;
        if (music2 == null) {
            userCount = 0;
        } else {
            userCount = music2.getUserCount();
        }
        String mid = this.f154295b.getMid();
        C89219l.m154716b(mid, "");
        new DialogC69376a(context, musicName, (long) userCount, "music", 3, mid, (byte) 0).show();
        C39162r.m79460a("click_qr_code", new C33744d().mo59981a("music_id", this.f154295b.getId()).mo59983a("platform", "scan").mo59983a("qr_code_type", "shaped").mo59983a("enter_from", "single_song").f79943a);
    }
}
