package com.p2082ss.android.ugc.aweme.music.service;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.music.api.MusicApi;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.service.f */
final /* synthetic */ class CallableC61073f implements Callable {

    /* renamed from: a */
    private final MusicModel f138567a;

    static {
        Covode.recordClassIndex(71671);
    }

    CallableC61073f(MusicModel musicModel) {
        this.f138567a = musicModel;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return MusicApi.m110045a(this.f138567a.getMusicId(), 0).music;
    }
}
