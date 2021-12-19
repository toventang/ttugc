package com.p2082ss.android.ugc.aweme.music.p3481ui;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.api.MusicApi;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.music.ui.bc */
public final /* synthetic */ class CallableC61141bc implements Callable {

    /* renamed from: a */
    private final MusicModel f138824a;

    static {
        Covode.recordClassIndex(71746);
    }

    CallableC61141bc(MusicModel musicModel) {
        this.f138824a = musicModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MusicModel musicModel = this.f138824a;
        if (TextUtils.isEmpty(musicModel.getMusicId())) {
            return musicModel;
        }
        musicModel.setMusic(MusicApi.m110045a(musicModel.getMusicId(), 0).music);
        musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        return musicModel;
    }
}
