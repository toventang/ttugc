package com.p2082ss.android.ugc.aweme.shortvideo.p3792ae;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ae.b */
public final class C69800b implements AbstractC27235f<MusicModel, C69905c> {
    static {
        Covode.recordClassIndex(82206);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C69905c mo45319a(MusicModel musicModel) {
        return m123327a(musicModel);
    }

    /* renamed from: a */
    public static C69905c m123327a(MusicModel musicModel) {
        C69905c cVar = new C69905c();
        Music convertToMusic = musicModel.convertToMusic();
        cVar.setCommerceMusic(musicModel.isCommerceMusic());
        cVar.setOriginalSound(musicModel.isOriginalSound());
        cVar.f156195id = convertToMusic.getId();
        cVar.musicName = convertToMusic.getMusicName();
        cVar.album = convertToMusic.getAlbum();
        cVar.path = musicModel.getLocalPath();
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            cVar.path = musicModel.getLocalPath();
        } else if (musicModel.isPlayUrlValid()) {
            cVar.path = musicModel.getUrl().getUrlList().get(0);
        }
        cVar.authorName = convertToMusic.getAuthorName();
        cVar.playUrl = convertToMusic.getPlayUrl();
        cVar.coverThumb = convertToMusic.getCoverThumb();
        cVar.coverMedium = convertToMusic.getCoverMedium();
        cVar.coverLarge = convertToMusic.getCoverLarge();
        cVar.duration = convertToMusic.getDuration();
        cVar.shootDuration = convertToMusic.getShootDuration();
        cVar.auditionDuration = convertToMusic.getAuditionDuration();
        cVar.musicType = musicModel.getMusicType().ordinal();
        cVar.offlineDesc = musicModel.getOfflineDesc();
        cVar.musicStatus = convertToMusic.getMusicStatus();
        cVar.userCount = musicModel.getUserCount();
        if (convertToMusic.getChallenge() != null) {
            cVar.challenge = C69799a.m123324a(convertToMusic.getChallenge());
        }
        cVar.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        cVar.setLrcUrl(convertToMusic.getLrcUrl());
        cVar.setLrcType(convertToMusic.getLrcType());
        cVar.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        cVar.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            cVar.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        cVar.setNeedSetCookie(musicModel.isNeedSetCookie());
        cVar.setVideoDuration(musicModel.getVideoDuration());
        cVar.setMusicBeat(musicModel.getBeatInfo());
        cVar.setLocalMusicDuration(musicModel.getLocalMusicDuration());
        cVar.setLocalMusicId(musicModel.getLocalMusicId());
        cVar.setMuteShare(musicModel.isMuteShare());
        return cVar;
    }
}
