package com.p2082ss.android.ugc.aweme.tools.music.p4128e;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.google.p1998c.p2001c.C27404ap;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.common.LogPbBean;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.e.b */
public final class C78821b implements AbstractC27235f<MusicModel, C69905c> {

    /* renamed from: a */
    public static final C78822a f177138a = new C78822a((byte) 0);

    static {
        Covode.recordClassIndex(91964);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.b$a */
    public static final class C78822a {
        static {
            Covode.recordClassIndex(91965);
        }

        private C78822a() {
        }

        public /* synthetic */ C78822a(byte b) {
            this();
        }

        /* renamed from: a */
        public static ArrayList<C69905c> m137589a(List<? extends MusicModel> list) {
            if (list == null || list.isEmpty()) {
                return new ArrayList<>();
            }
            ArrayList<C69905c> a = C27404ap.m54807a((Iterable) C27404ap.m54811a(list, new C78821b()));
            C89219l.m154716b(a, "");
            return a;
        }

        /* renamed from: a */
        public static MusicModel m137588a(C69905c cVar) {
            MusicModel.CollectionType collectionType;
            C89219l.m154721d(cVar, "");
            MusicModel musicModel = new MusicModel();
            musicModel.setMusicId(cVar.getMusicId());
            musicModel.setId(cVar.getId());
            musicModel.setAlbum(cVar.getAlbum());
            musicModel.setName(cVar.getMusicName());
            musicModel.setAlbum(cVar.getAlbum());
            if (cVar.getCoverMedium() != null) {
                UrlModel coverMedium = cVar.getCoverMedium();
                C89219l.m154716b(coverMedium, "");
                if (!C13603b.m24435a((Collection) coverMedium.getUrlList())) {
                    UrlModel coverMedium2 = cVar.getCoverMedium();
                    C89219l.m154716b(coverMedium2, "");
                    musicModel.setPicPremium(coverMedium2.getUrlList().get(0));
                }
            }
            if (cVar.getCoverThumb() != null) {
                UrlModel coverThumb = cVar.getCoverThumb();
                C89219l.m154716b(coverThumb, "");
                if (!C13603b.m24435a((Collection) coverThumb.getUrlList())) {
                    UrlModel coverThumb2 = cVar.getCoverThumb();
                    C89219l.m154716b(coverThumb2, "");
                    musicModel.setPicSmall(coverThumb2.getUrlList().get(0));
                }
            }
            musicModel.setLocalPath(cVar.getPath());
            musicModel.setSinger(cVar.getSinger());
            if (cVar.getMusicType() == MusicModel.MusicType.ONLINE.ordinal()) {
                musicModel.setUrl(cVar.getPlayUrl());
            }
            musicModel.setDuration(cVar.duration);
            musicModel.setShootDuration(Integer.valueOf(cVar.shootDuration));
            musicModel.setAuditionDuration(Integer.valueOf(cVar.auditionDuration));
            if (cVar.getMusicType() == MusicModel.MusicType.LOCAL.ordinal()) {
                musicModel.setMusicType(MusicModel.MusicType.LOCAL);
            }
            if (cVar.getMusicType() == MusicModel.MusicType.ONLINE.ordinal()) {
                musicModel.setMusicType(MusicModel.MusicType.ONLINE);
            }
            musicModel.setOfflineDesc(cVar.getOfflineDesc());
            musicModel.setMusicStatus(cVar.getMusicStatus());
            musicModel.setStrongBeatUrl(cVar.getStrongBeatUrl());
            musicModel.setLrcUrl(cVar.getLrcUrl());
            musicModel.setLrcType(cVar.getLrcType());
            musicModel.setPreviewStartTime(cVar.getPreviewStartTime());
            musicModel.setExtra(cVar.extra);
            if (cVar.isCollected()) {
                collectionType = MusicModel.CollectionType.COLLECTED;
            } else {
                collectionType = MusicModel.CollectionType.NOT_COLLECTED;
            }
            musicModel.setCollectionType(collectionType);
            musicModel.setNeedSetCookie(cVar.isNeedSetCookie());
            musicModel.setVideoDuration(cVar.getVideoDuration());
            musicModel.setPgc(cVar.isPgc());
            musicModel.setBeatInfo(cVar.getMusicBeat());
            musicModel.setLocalMusicDuration(cVar.getLocalMusicDuration());
            musicModel.setLocalMusicId(cVar.getLocalMusicId());
            musicModel.setMuteShare(cVar.isMuteShare());
            return musicModel;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.p1998c.p1999a.AbstractC27235f
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C69905c mo45319a(MusicModel musicModel) {
        return m137586a(musicModel);
    }

    /* renamed from: a */
    public static C69905c m137586a(MusicModel musicModel) {
        String str;
        String str2 = null;
        if (musicModel == null) {
            return null;
        }
        C69905c cVar = new C69905c();
        Music convertToMusic = musicModel.convertToMusic();
        C89219l.m154716b(convertToMusic, "");
        cVar.f156195id = convertToMusic.getId();
        cVar.setCommerceMusic(convertToMusic.isCommercialMusic());
        cVar.setOriginalSound(convertToMusic.isOriginalSound());
        cVar.musicName = convertToMusic.getMusicName();
        cVar.album = convertToMusic.getAlbum();
        boolean z = false;
        if (!TextUtils.isEmpty(musicModel.getLocalPath())) {
            cVar.path = musicModel.getLocalPath();
        } else if (musicModel.isPlayUrlValid()) {
            UrlModel url = musicModel.getUrl();
            C89219l.m154716b(url, "");
            cVar.path = url.getUrlList().get(0);
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
        if (convertToMusic.getChallenge() != null) {
            cVar.challenge = C78819a.m137583a(convertToMusic.getChallenge());
        }
        cVar.strongBeatUrl = convertToMusic.getStrongBeatUrl();
        cVar.setLrcUrl(convertToMusic.getLrcUrl());
        cVar.setLrcType(convertToMusic.getLrcType());
        cVar.setPreviewStartTime(convertToMusic.getPreviewStartTime());
        cVar.setPreventDownload(musicModel.isPreventDownload());
        if (musicModel.getMusicWaveBean() != null) {
            cVar.setMusicWaveData(musicModel.getMusicWaveBean().getMusicWavePointArray());
        }
        cVar.setMvThemeMusic(musicModel.isMvThemeMusic());
        LogPbBean logPbBean = new LogPbBean();
        com.p2082ss.android.ugc.aweme.feed.model.LogPbBean logPb = musicModel.getLogPb();
        if (logPb != null) {
            str = logPb.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        cVar.setLogPb(logPbBean);
        cVar.setComeFromForMod(musicModel.getComeFromForMod());
        cVar.setCategoryID(musicModel.getCategoryID());
        cVar.setSearchKeyWords(musicModel.getSearchKeyWords());
        cVar.setSongId(musicModel.getSongId());
        cVar.extra = musicModel.getExtra();
        cVar.setDmvAutoShow(musicModel.getDmvAutoShow());
        if (musicModel.getCollectionType() == MusicModel.CollectionType.COLLECTED) {
            z = true;
        }
        cVar.setCollected(z);
        if (TextUtils.isEmpty(cVar.extra)) {
            Music music = musicModel.getMusic();
            if (music != null) {
                str2 = music.getExtra();
            }
            cVar.extra = str2;
        }
        cVar.setNeedSetCookie(musicModel.isNeedSetCookie());
        cVar.setVideoDuration(musicModel.getVideoDuration());
        cVar.setPgc(musicModel.isPgc());
        cVar.setMusicBeat(musicModel.getBeatInfo());
        cVar.setLocalMusicDuration(musicModel.getLocalMusicDuration());
        cVar.setLocalMusicId(musicModel.getLocalMusicId());
        cVar.setMuteShare(musicModel.isMuteShare());
        return cVar;
    }
}
