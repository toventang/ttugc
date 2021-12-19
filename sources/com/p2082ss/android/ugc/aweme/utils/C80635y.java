package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1780c.C23697c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.C38000g;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.IShortVideoConfig;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.y */
public final class C80635y {

    /* renamed from: a */
    public static final C80635y f180288a = new C80635y();

    private C80635y() {
    }

    static {
        Covode.recordClassIndex(93909);
    }

    /* renamed from: e */
    public static final boolean m139810e(Aweme aweme) {
        if (aweme == null || !aweme.downloadWithoutWatermark || !C50545m.m94762a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m139806a(Aweme aweme) {
        if (aweme == null || aweme.getMusic() == null) {
            return false;
        }
        Music music = aweme.getMusic();
        C89219l.m154716b(music, "");
        if (music.getMusicStatus() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static final boolean m139815j(Aweme aweme) {
        if (aweme == null || aweme.getMusic() == null || aweme.getMusic().getMusicStatus() != 0 || C38000g.m77057h().mo67249a(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m139807b(Aweme aweme) {
        AwemeStatus status;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        if (aweme == null) {
            return false;
        }
        Music music = aweme.getMusic();
        if ((music == null || music.getMusicStatus() != 0) && ((status = aweme.getStatus()) == null || (videoMuteInfo = status.getVideoMuteInfo()) == null || !videoMuteInfo.isMute())) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m139812g(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getReportMaskInfo() == null || (showMask = aweme.getReportMaskInfo().getShowMask()) == null || !showMask.booleanValue() || C23697c.m44781a(aweme.getReportMaskInfo().getTitle()) || C23697c.m44781a(aweme.getReportMaskInfo().getCancelMaskLabel())) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m139813h(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getGeneralMaskInfo() == null || m139812g(aweme) || (showMask = aweme.getGeneralMaskInfo().getShowMask()) == null || !showMask.booleanValue() || C23697c.m44781a(aweme.getGeneralMaskInfo().getTitle()) || C23697c.m44781a(aweme.getGeneralMaskInfo().getContent())) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m139814i(Aweme aweme) {
        Boolean showMask;
        if (aweme == null || aweme.getPhotosensitiveMaskInfo() == null || C39223a.m79590d().mo68624i() <= 0 || C39223a.m79590d().mo68623h() == 2 || m139812g(aweme) || m139813h(aweme) || (showMask = aweme.getPhotosensitiveMaskInfo().getShowMask()) == null || !showMask.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m139808c(Aweme aweme) {
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.m113114a().configService().shortVideoConfig();
        if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getVideoLength() <= 0) {
            return false;
        }
        if ((((long) aweme.getVideo().getVideoLength()) > shortVideoConfig.maxDuetVideoTime() && !aweme.isSupportGameChallenge()) || !aweme.canDuetVideoType() || aweme.isVr() || aweme.getDuetSetting() == 2) {
            return false;
        }
        if ((aweme.getDuetSetting() != 1 || C50545m.m94762a(aweme)) && !m139815j(aweme) && aweme.getMusic() != null && aweme.getMusic().getPlayUrl() != null && aweme.getMusic().getPlayUrl().getUrlList() != null && !aweme.getMusic().getPlayUrl().getUrlList().isEmpty() && !aweme.isWithPromotionalMusic()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m139809d(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        IShortVideoConfig shortVideoConfig = AVExternalServiceImpl.m113114a().configService().shortVideoConfig();
        if (aweme.getVideo() == null) {
            return false;
        }
        Video video = aweme.getVideo();
        C89219l.m154716b(video, "");
        if (video.getVideoLength() <= 0) {
            return false;
        }
        Video video2 = aweme.getVideo();
        C89219l.m154716b(video2, "");
        if (((long) video2.getVideoLength()) > shortVideoConfig.maxStitchVideoTime() || !aweme.canStitchVideoType() || aweme.isVr() || aweme.getStitchSetting() == 2) {
            return false;
        }
        if ((aweme.getStitchSetting() == 1 && !C50545m.m94762a(aweme)) || m139815j(aweme) || aweme.getMusic() == null) {
            return false;
        }
        Music music = aweme.getMusic();
        C89219l.m154716b(music, "");
        if (music.getPlayUrl() == null) {
            return false;
        }
        Music music2 = aweme.getMusic();
        C89219l.m154716b(music2, "");
        UrlModel playUrl = music2.getPlayUrl();
        C89219l.m154716b(playUrl, "");
        if (playUrl.getUrlList() == null) {
            return false;
        }
        Music music3 = aweme.getMusic();
        C89219l.m154716b(music3, "");
        UrlModel playUrl2 = music3.getPlayUrl();
        C89219l.m154716b(playUrl2, "");
        List<String> urlList = playUrl2.getUrlList();
        C89219l.m154716b(urlList, "");
        if (!(!urlList.isEmpty()) || aweme.isWithPromotionalMusic()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m139811f(Aweme aweme) {
        if (!(aweme == null || aweme.getReportMaskInfo() == null || aweme.getGeneralMaskInfo() == null || aweme.getPhotosensitiveMaskInfo() == null)) {
            Boolean showMask = aweme.getReportMaskInfo().getShowMask();
            if (showMask != null && showMask.booleanValue() && !C23697c.m44781a(aweme.getReportMaskInfo().getTitle()) && !C23697c.m44781a(aweme.getReportMaskInfo().getCancelMaskLabel())) {
                return true;
            }
            Boolean showMask2 = aweme.getGeneralMaskInfo().getShowMask();
            if (showMask2 != null && showMask2.booleanValue() && !C23697c.m44781a(aweme.getGeneralMaskInfo().getTitle()) && !C23697c.m44781a(aweme.getGeneralMaskInfo().getContent())) {
                return true;
            }
            Boolean showMask3 = aweme.getPhotosensitiveMaskInfo().getShowMask();
            if (showMask3 == null || !showMask3.booleanValue() || C39223a.m79590d().mo68624i() <= 0 || C39223a.m79590d().mo68623h() == 2) {
                return false;
            }
            return true;
        }
        return false;
    }
}
