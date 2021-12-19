package com.p2082ss.android.ugc.aweme.music.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.ProgressDialogC61165e;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.music.service.h */
final /* synthetic */ class C61075h implements ProgressDialogC61165e.AbstractC61168c {

    /* renamed from: a */
    private final C61068e f138574a;

    /* renamed from: b */
    private final MusicModel f138575b;

    static {
        Covode.recordClassIndex(71673);
    }

    C61075h(C61068e eVar, MusicModel musicModel) {
        this.f138574a = eVar;
        this.f138575b = musicModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.ProgressDialogC61165e.AbstractC61168c
    /* renamed from: a */
    public final void mo98605a() {
        this.f138574a.f138548e.mo98757a(this.f138575b.getMusicId());
    }
}
