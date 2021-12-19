package com.p2082ss.android.ugc.aweme.kids.p3302a.p3310h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.kids.a.h.f */
final /* synthetic */ class CallableC57143f implements Callable {

    /* renamed from: a */
    private final MusicModel f130101a;

    static {
        Covode.recordClassIndex(67037);
    }

    CallableC57143f(MusicModel musicModel) {
        this.f130101a = musicModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MusicModel musicModel = this.f130101a;
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            return musicModel;
        }
        musicModel.setMusic(ChooseMusicApi.m103647a(musicModel.getMusicId()).f130038a);
        musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        return musicModel;
    }
}
