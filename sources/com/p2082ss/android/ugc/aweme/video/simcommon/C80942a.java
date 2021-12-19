package com.p2082ss.android.ugc.aweme.video.simcommon;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.BitRate;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.TtsInfos;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84232a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84233b;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84234c;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84235d;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84237e;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84238f;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84239g;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84240h;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.video.simcommon.a */
public final class C80942a {
    static {
        Covode.recordClassIndex(94248);
    }

    /* renamed from: a */
    public static VideoUrlModel m140472a(C84241i iVar) {
        if (iVar == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = (VideoUrlModel) iVar.origin;
        ArrayList arrayList = new ArrayList();
        if (iVar.getBitRate() != null) {
            for (C84237e eVar : new ArrayList(iVar.getBitRate())) {
                arrayList.add(m140467a(eVar));
            }
        }
        videoUrlModel.setBitRate(arrayList);
        videoUrlModel.setDashVideoId(iVar.getDashVideoId());
        videoUrlModel.setDashVideoModelStr(iVar.getDashVideoModelStr());
        videoUrlModel.setDashVideoId(iVar.getDashVideoId());
        videoUrlModel.setFileCheckSum(iVar.getFileCheckSum());
        videoUrlModel.setBytevc1(iVar.isBytevc1());
        videoUrlModel.setHitBitrate(iVar.getHitBitrate());
        videoUrlModel.setRatio(iVar.getRatio());
        videoUrlModel.setVr(iVar.isVr());
        videoUrlModel.setSourceId(iVar.getSourceId());
        videoUrlModel.setDuration(iVar.getDuration());
        videoUrlModel.setFileHash(iVar.getFileHash());
        videoUrlModel.setHeight(iVar.getHeight());
        videoUrlModel.setWidth(iVar.getWidth());
        videoUrlModel.setSize(iVar.getSize());
        videoUrlModel.setUri(iVar.getOriginUri());
        videoUrlModel.setUrlKey(iVar.getUrlKey());
        videoUrlModel.setUrlList(iVar.getUrlList());
        return videoUrlModel;
    }

    /* renamed from: a */
    public static C84241i m140478a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return null;
        }
        C84241i iVar = new C84241i();
        iVar.origin = videoUrlModel;
        ArrayList arrayList = new ArrayList();
        if (videoUrlModel.getBitRate() != null) {
            for (BitRate bitRate : new ArrayList(videoUrlModel.getBitRate())) {
                arrayList.add(m140474a(bitRate));
            }
        }
        iVar.setBitRate(arrayList);
        iVar.setDashVideoId(videoUrlModel.getDashVideoId());
        iVar.setDashVideoModelStr(videoUrlModel.getDashVideoModelStr());
        iVar.setDashVideoId(videoUrlModel.getDashVideoId());
        iVar.setFileCheckSum(videoUrlModel.getFileCheckSum());
        iVar.setBytevc1(videoUrlModel.isBytevc1());
        iVar.setHitBitrate(videoUrlModel.getHitBitrate());
        iVar.setRatio(videoUrlModel.getRatio());
        iVar.setVr(videoUrlModel.isVr());
        iVar.setSourceId(videoUrlModel.getSourceId());
        iVar.setDuration(videoUrlModel.getDuration());
        iVar.setFileHash(videoUrlModel.getFileHash());
        iVar.setHeight(videoUrlModel.getHeight());
        iVar.setWidth(videoUrlModel.getWidth());
        iVar.setSize(videoUrlModel.getSize());
        iVar.setUri(videoUrlModel.getOriginUri());
        iVar.setUrlKey(videoUrlModel.getUrlKey());
        iVar.setUrlList(videoUrlModel.getUrlList());
        return iVar;
    }

    /* renamed from: a */
    public static C84239g m140476a(UrlModel urlModel) {
        if (urlModel == null) {
            return null;
        }
        C84239g gVar = new C84239g();
        gVar.origin = urlModel;
        gVar.setFileHash(urlModel.getFileHash());
        gVar.setHeight(urlModel.getHeight());
        gVar.setWidth(urlModel.getWidth());
        gVar.setSize(urlModel.getSize());
        gVar.setUri(urlModel instanceof VideoUrlModel ? ((VideoUrlModel) urlModel).getOriginUri() : urlModel.getUri());
        gVar.setUrlKey(urlModel.getUrlKey());
        gVar.setUrlList(urlModel.getUrlList());
        return gVar;
    }

    /* renamed from: a */
    private static C84237e m140474a(BitRate bitRate) {
        if (bitRate == null) {
            return null;
        }
        C84237e eVar = new C84237e();
        eVar.origin = bitRate;
        eVar.setBytevc1(bitRate.isBytevc1());
        eVar.setPlayAddr(m140476a(bitRate.getPlayAddr()));
        eVar.setBitRate(bitRate.getBitRate());
        eVar.setGearName(bitRate.getGearName());
        eVar.setQualityType(bitRate.getQualityType());
        return eVar;
    }

    /* renamed from: a */
    public static C84240h m140477a(Video video) {
        if (video == null) {
            return null;
        }
        C84240h hVar = new C84240h();
        hVar.origin = video;
        ArrayList arrayList = new ArrayList();
        if (video.getBitRate() != null) {
            for (BitRate bitRate : new ArrayList(video.getBitRate())) {
                arrayList.add(m140474a(bitRate));
            }
        }
        hVar.setBitRate(arrayList);
        hVar.setDrmTokenAuth(m140475a(video.getDrmTokenAuth()));
        hVar.setDuration((double) video.getDuration());
        hVar.setHeight(video.getHeight());
        hVar.setNeedSetCookie(video.isNeedSetCookie());
        hVar.setPlayAddr(m140478a(video.getPlayAddr()));
        hVar.setPlayAddrBytevc1(m140478a(video.getPlayAddrBytevc1()));
        hVar.setRatio(video.getRatio());
        hVar.setEnableIntertrustDrm(video.enableIntertrustDrm());
        hVar.setMeta(video.getMeta());
        hVar.setVideoLength(video.getVideoLength());
        hVar.setVideoModelStr(video.getVideoModelStr());
        hVar.setWidth(video.getWidth());
        hVar.setClaInfo(m140473a(video.getCaptionModel()));
        return hVar;
    }

    /* renamed from: a */
    private static C84238f m140475a(PlayTokenAuth playTokenAuth) {
        if (playTokenAuth == null) {
            return null;
        }
        C84238f fVar = new C84238f();
        fVar.origin = playTokenAuth;
        fVar.setAuth(playTokenAuth.getAuth());
        fVar.setVersion(playTokenAuth.getVersionN());
        fVar.setHostIndex(playTokenAuth.getHostIndex());
        fVar.setHosts(playTokenAuth.getHosts());
        fVar.setVid(playTokenAuth.getVid());
        fVar.setToken(playTokenAuth.getToken());
        return fVar;
    }

    /* renamed from: a */
    private static C84233b m140473a(CaptionModel captionModel) {
        if (captionModel == null || captionModel.getCaptionList() == null || captionModel.getOriginalCaptionLanguage() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (CaptionItemModel captionItemModel : captionModel.getCaptionList()) {
            arrayList.add(new C84232a(captionItemModel.getExpire(), captionItemModel.getFormat(), captionItemModel.getLanguageName(), captionItemModel.getSubId(), captionItemModel.getVersionType(), captionItemModel.getUrl(), captionItemModel.getLanguageId(), captionItemModel.isAutoGenerated(), captionItemModel.getComplaintId(), SystemClock.elapsedRealtime(), i, ""));
            i++;
        }
        boolean z = true;
        boolean z2 = captionModel.getEnableAutoCaption() != 0;
        if (captionModel.getHasOriginalAudio() == 0) {
            z = false;
        }
        return new C84233b(z2, z, new C84234c(captionModel.getOriginalCaptionLanguage().getLanguageName(), (long) ((int) captionModel.getOriginalCaptionLanguage().getLanguageId())), arrayList);
    }

    /* renamed from: a */
    private static BitRate m140467a(C84237e eVar) {
        if (eVar == null) {
            return null;
        }
        BitRate bitRate = (BitRate) eVar.origin;
        bitRate.setBytevc1(eVar.getIsBytevc1());
        bitRate.setPlayAddr(m140466a(eVar.playAddrBytevc1));
        bitRate.setPlayAddr(m140466a(eVar.getPlayAddr()));
        bitRate.setBitRate(eVar.getBitRate());
        bitRate.setGearName(eVar.getGearName());
        bitRate.setQualityType(eVar.getQualityType());
        return bitRate;
    }

    /* renamed from: a */
    private static UrlModel m140466a(C84239g gVar) {
        String uri;
        if (gVar == null) {
            return null;
        }
        UrlModel urlModel = (UrlModel) gVar.origin;
        urlModel.setFileHash(gVar.getFileHash());
        urlModel.setHeight(gVar.getHeight());
        urlModel.setWidth(gVar.getWidth());
        urlModel.setSize(gVar.getSize());
        if (gVar instanceof C84241i) {
            uri = ((C84241i) gVar).getOriginUri();
        } else {
            uri = gVar.getUri();
        }
        urlModel.setUri(uri);
        urlModel.setUrlKey(gVar.getUrlKey());
        urlModel.setUrlList(gVar.getUrlList());
        return urlModel;
    }

    /* renamed from: a */
    public static VideoUrlModel m140468a(CaptionItemModel captionItemModel) {
        if (captionItemModel == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setSourceId(String.valueOf(captionItemModel.getSubId()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(captionItemModel.getUrl());
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUri(String.valueOf(captionItemModel.getSubId()));
        videoUrlModel.setUrlKey(String.valueOf(captionItemModel.getSubId()));
        return videoUrlModel;
    }

    /* renamed from: a */
    public static VideoUrlModel m140469a(TtsInfos ttsInfos) {
        long j;
        if (ttsInfos == null || ttsInfos.getPlayAddress() == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        if (ttsInfos.getPlayAddress() != null) {
            if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                videoUrlModel.setSourceId(ttsInfos.getPlayAddress().getUrlKey());
            }
            if (ttsInfos.getPlayAddress().getFileHash() != null) {
                videoUrlModel.setFileHash(ttsInfos.getPlayAddress().getFileHash());
            }
            if (ttsInfos.getPlayAddress().getHeight() != null) {
                videoUrlModel.setHeight(ttsInfos.getPlayAddress().getHeight().intValue());
            }
            if (ttsInfos.getPlayAddress().getWidth() != null) {
                videoUrlModel.setWidth(ttsInfos.getPlayAddress().getWidth().intValue());
            }
            if (ttsInfos.getPlayAddress().getDataSize() != null) {
                j = ttsInfos.getPlayAddress().getDataSize().longValue();
            } else {
                j = 0;
            }
            videoUrlModel.setSize(j);
            if (ttsInfos.getPlayAddress().getUri() != null) {
                videoUrlModel.setUri(ttsInfos.getPlayAddress().getUri());
            }
            if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                videoUrlModel.setUrlKey(ttsInfos.getPlayAddress().getUrlKey());
            }
            if (ttsInfos.getPlayAddress().getUrlList() != null) {
                videoUrlModel.setUrlList(ttsInfos.getPlayAddress().getUrlList());
            }
            if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                videoUrlModel.setUri(ttsInfos.getPlayAddress().getUrlKey());
            }
        }
        return videoUrlModel;
    }

    /* renamed from: a */
    public static VideoUrlModel m140470a(C84232a aVar) {
        if (aVar == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setSourceId(String.valueOf(aVar.getSubId()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar.getUrl());
        videoUrlModel.setUrlList(arrayList);
        return videoUrlModel;
    }

    /* renamed from: a */
    public static VideoUrlModel m140471a(C84235d dVar) {
        if (dVar == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        if (dVar.getUrlKey() != null) {
            videoUrlModel.setSourceId(dVar.getUrlKey());
        }
        if (dVar.getFileHash() != null) {
            videoUrlModel.setFileHash(dVar.getFileHash());
        }
        videoUrlModel.setHeight(dVar.getHeight());
        videoUrlModel.setWidth(dVar.getWidth());
        videoUrlModel.setSize(dVar.getSize());
        if (dVar.getUri() != null) {
            videoUrlModel.setUri(dVar.getUri());
        }
        if (dVar.getUrlKey() != null) {
            videoUrlModel.setUrlKey(dVar.getUrlKey());
        }
        if (dVar.getUrlList() != null) {
            videoUrlModel.setUrlList(dVar.getUrlList());
        }
        return videoUrlModel;
    }
}
