package com.p2082ss.android.ugc.aweme.music.presenter;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.w */
final /* synthetic */ class C60871w implements AbstractC89172b {

    /* renamed from: a */
    private final Music f138341a;

    /* renamed from: b */
    private final MusicModel f138342b;

    static {
        Covode.recordClassIndex(71459);
    }

    C60871w(Music music, MusicModel musicModel) {
        this.f138341a = music;
        this.f138342b = musicModel;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        Music music = this.f138341a;
        MusicModel musicModel = this.f138342b;
        music.getExtraParamFromPretreatment().put("rank", obj);
        musicModel.getExtraParamFromPretreatment().put("rank", obj);
        return 1;
    }
}
