package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.p2082ss.android.ugc.aweme.music.p3465b.C60719e;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.al */
public final /* synthetic */ class C61117al implements C60719e.AbstractC60720a {

    /* renamed from: a */
    private final C61100ah f138789a;

    /* renamed from: b */
    private final List f138790b;

    static {
        Covode.recordClassIndex(71720);
    }

    C61117al(C61100ah ahVar, List list) {
        this.f138789a = ahVar;
        this.f138790b = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3465b.C60719e.AbstractC60720a
    /* renamed from: a */
    public final void mo98145a(int i) {
        C61100ah ahVar = this.f138789a;
        List list = this.f138790b;
        if (i >= 0 && i < list.size()) {
            MusicOwnerInfo musicOwnerInfo = (MusicOwnerInfo) list.get(i);
            if (musicOwnerInfo.getEnterType() == 1) {
                C39162r.m79460a("click_musician_profile", new C33744d().mo59983a("author_id", musicOwnerInfo.getUid()).mo59983a("enter_from", "single_song").mo59983a(StringSet.type, ahVar.f138728as).mo59983a("music_id", ahVar.f138717ah).f79943a);
            } else {
                C39162r.m79460a("click_musician_profile", new C33744d().mo59983a("author_id", musicOwnerInfo.getUid()).mo59983a("music_id", ahVar.f138717ah).mo59983a(StringSet.type, ahVar.f138727ar).mo59983a("enter_from", "single_song").f79943a);
            }
            ahVar.mo98652a(musicOwnerInfo);
        }
    }
}
