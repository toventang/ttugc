package com.p2082ss.android.ugc.aweme.music.p3481ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.p3481ui.ProgressDialogC61165e;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ar */
final /* synthetic */ class C61124ar implements ProgressDialogC61165e.AbstractC61168c {

    /* renamed from: a */
    private final C61100ah f138801a;

    /* renamed from: b */
    private final MusicModel f138802b;

    static {
        Covode.recordClassIndex(71729);
    }

    C61124ar(C61100ah ahVar, MusicModel musicModel) {
        this.f138801a = ahVar;
        this.f138802b = musicModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.music.p3481ui.ProgressDialogC61165e.AbstractC61168c
    /* renamed from: a */
    public final void mo98605a() {
        this.f138801a.f138722am.mo98757a(this.f138802b.getMusicId());
    }
}
