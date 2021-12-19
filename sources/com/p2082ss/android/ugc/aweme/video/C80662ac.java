package com.p2082ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.bytedance.aweme.p800b.C12895a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.experiment.C46825dd;
import com.p2082ss.android.ugc.aweme.feed.model.Audio;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.p2082ss.android.ugc.aweme.feed.model.CaptionModel;
import com.p2082ss.android.ugc.aweme.feed.model.TtsInfos;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.setting.C68124l;
import com.p2082ss.android.ugc.aweme.utils.C80446fr;
import com.p2082ss.android.ugc.aweme.video.config.C80716a;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80667a;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80675b;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80872d;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80915g;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80918i;
import com.p2082ss.android.ugc.aweme.video.preload.AbstractC80929n;
import com.p2082ss.android.ugc.aweme.video.preload.C80933o;
import com.p2082ss.android.ugc.aweme.video.preload.C80937s;
import com.p2082ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p2082ss.android.ugc.aweme.video.preload.p4213a.AbstractC80807a;
import com.p2082ss.android.ugc.aweme.video.simcommon.C80942a;
import com.p2082ss.android.ugc.playerkit.model.C84199c;
import com.p2082ss.android.ugc.playerkit.simapicommon.C84231a;
import com.p2082ss.android.ugc.playerkit.simapicommon.p4325a.C84241i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.ac */
public final class C80662ac {
    static {
        Covode.recordClassIndex(93941);
    }

    /* renamed from: a */
    public static boolean m139889a(VideoUrlModel videoUrlModel) {
        return C80937s.m140453b().mo124069a(C80942a.m140478a(videoUrlModel));
    }

    /* renamed from: c */
    public static int m139893c(VideoUrlModel videoUrlModel) {
        return m139890b(videoUrlModel);
    }

    /* renamed from: b */
    public static int m139890b(VideoUrlModel videoUrlModel) {
        return C80937s.m140453b().mo124077c(C80942a.m140478a(videoUrlModel));
    }

    /* renamed from: d */
    public static long m139896d(VideoUrlModel videoUrlModel) {
        return C80937s.m140453b().mo124081e(C80942a.m140478a(videoUrlModel));
    }

    /* renamed from: e */
    public static void m139898e(VideoUrlModel videoUrlModel) {
        C80937s.m140453b().mo124088h(C80942a.m140478a(videoUrlModel));
    }

    /* renamed from: a */
    public static VideoUrlModel m139881a(Video video) {
        return C80942a.m140472a(C80716a.C80717a.f180462a.mo123864a().getVideoPlayAddr(C80942a.m140477a(video), C84199c.f187979a.getPlayerType()));
    }

    /* renamed from: a */
    public static void m139885a(List<Aweme> list) {
        if (list != null && list.size() != 0 && list.size() > 0) {
            m139882a(list.get(0), 0);
        }
    }

    /* renamed from: b */
    public static C84241i m139891b(Aweme aweme) {
        C84241i a;
        if (AbstractC80807a.f180735a) {
            a = C80780p.m140117a(C80942a.m140477a(aweme.getVideo()), C84199c.f187979a.getPlayerType());
        } else {
            a = C80942a.m140478a(aweme.getVideo().getProperPlayAddr());
        }
        if (a == null) {
            return null;
        }
        a.setSourceId(aweme.getAid());
        a.setRatio(aweme.getVideo().getRatio());
        if (!TextUtils.isEmpty(aweme.getVideo().getVideoModelStr())) {
            a.setDashVideoModelStr(aweme.getVideo().getVideoModelStr());
        }
        return a;
    }

    /* renamed from: d */
    public static List<C84241i> m139897d(Aweme aweme) {
        CaptionModel captionModel;
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Video video = aweme.getVideo();
        if (!(video == null || video.getCaptionModel() == null || (captionModel = video.getCaptionModel()) == null || captionModel.getCaptionList() == null || captionModel.getCaptionList().isEmpty())) {
            for (CaptionItemModel captionItemModel : captionModel.getCaptionList()) {
                C84241i iVar = new C84241i();
                iVar.setSourceId(String.valueOf(captionItemModel.getSubId()));
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(captionItemModel.getUrl());
                iVar.setUrlList(arrayList2);
                iVar.setUri(String.valueOf(captionItemModel.getSubId()));
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static List<C84241i> m139894c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Audio audio = aweme.getAudio();
        if (!(audio == null || audio.getTtsInfos() == null || audio.getTtsInfos().isEmpty())) {
            for (TtsInfos ttsInfos : audio.getTtsInfos()) {
                if (ttsInfos.getPlayAddress() != null) {
                    C84241i iVar = new C84241i();
                    if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                        iVar.setSourceId(ttsInfos.getPlayAddress().getUrlKey());
                    }
                    if (ttsInfos.getPlayAddress().getFileHash() != null) {
                        iVar.setFileHash(ttsInfos.getPlayAddress().getFileHash());
                    }
                    if (ttsInfos.getPlayAddress().getHeight() != null) {
                        iVar.setHeight(ttsInfos.getPlayAddress().getHeight().intValue());
                    }
                    if (ttsInfos.getPlayAddress().getWidth() != null) {
                        iVar.setWidth(ttsInfos.getPlayAddress().getWidth().intValue());
                    }
                    if (ttsInfos.getPlayAddress().getDataSize() != null) {
                        iVar.setSize(ttsInfos.getPlayAddress().getDataSize().longValue());
                    }
                    if (ttsInfos.getPlayAddress().getUri() != null) {
                        iVar.setUri(ttsInfos.getPlayAddress().getUri());
                    }
                    if (ttsInfos.getPlayAddress().getUrlKey() != null) {
                        iVar.setUrlKey(ttsInfos.getPlayAddress().getUrlKey());
                    }
                    if (ttsInfos.getPlayAddress().getUrlList() != null) {
                        iVar.setUrlList(ttsInfos.getPlayAddress().getUrlList());
                    }
                    if (ttsInfos.getPlayAddress().getPlayerAccessKey() != null) {
                        iVar.setaK(ttsInfos.getPlayAddress().getPlayerAccessKey());
                    }
                    arrayList.add(iVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m139888a(Aweme aweme) {
        return C80937s.m140453b().mo124075b(m139891b(aweme));
    }

    /* renamed from: a */
    public static void m139882a(Aweme aweme, int i) {
        int i2;
        if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C80937s.m140453b() != null && C80933o.m140451a() != null) {
            C84241i b = m139891b(aweme);
            if (i > 0) {
                i2 = 102400;
            } else {
                i2 = 0;
            }
            List<C84241i> c = m139894c(aweme);
            C80654ab.m139876a(b, C80937s.m140453b().mo124072a(b, i, m139897d(aweme), c, i2), i);
        }
    }

    /* renamed from: c */
    private static void m139895c(Aweme aweme, int i) {
        List<Video> videoList;
        m139882a(aweme, i);
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (videoList = awemeRawAd.getVideoList()) != null && !videoList.isEmpty()) {
            int i2 = 0;
            while (i2 < videoList.size()) {
                Aweme clone = aweme.clone();
                int i3 = i2 + 1;
                clone.setAid(aweme.getAid() + i3);
                clone.setVideo(videoList.get(i2));
                m139882a(clone, i);
                i2 = i3;
            }
        }
    }

    /* renamed from: b */
    public static void m139892b(Aweme aweme, int i) {
        if (C37699a.m76277aw(aweme)) {
            m139895c(aweme, i);
        } else if (aweme == null || !aweme.isAd() || (!C80675b.m139904a() && C80667a.m139902a() == 1.0d)) {
            m139882a(aweme, i);
        } else {
            AbstractC80915g.C80916a aVar = new AbstractC80915g.C80916a();
            if (C80675b.m139904a()) {
                aVar.f180913a = 2;
            }
            double a = C80667a.m139902a();
            double d = (double) i;
            Double.isNaN(d);
            m139883a(aweme, (int) (d * a), aVar);
        }
    }

    /* renamed from: a */
    public static void m139887a(Aweme[] awemeArr, final int i) {
        if (awemeArr != null && awemeArr.length > 0) {
            for (final Aweme aweme : awemeArr) {
                if (!C46825dd.f109093f || !C80446fr.f180030d) {
                    m139892b(aweme, i);
                } else {
                    C12895a.f31387b.f31389a.postDelayed(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.video.C80662ac.RunnableC806642 */

                        static {
                            Covode.recordClassIndex(93943);
                        }

                        public final void run() {
                            C80662ac.m139892b(aweme, i);
                        }
                    }, 500);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m139884a(Aweme aweme, String str, AbstractC80872d dVar) {
        C84241i b = m139891b(aweme);
        AbstractC80918i b2 = C80937s.m140453b();
        if (b2 != null) {
            b2.mo124066a(b, str, dVar);
        }
    }

    /* renamed from: a */
    private static void m139883a(Aweme aweme, int i, AbstractC80915g.C80916a aVar) {
        int i2;
        if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C80937s.m140453b() != null && C80933o.m140451a() != null) {
            C84241i b = m139891b(aweme);
            if (i > 0) {
                i2 = 102400;
            } else {
                i2 = 0;
            }
            List<C84241i> c = m139894c(aweme);
            C80937s.m140453b().mo124071a(b, i, AbstractC80929n.C80931b.f180958b, aVar, m139897d(aweme), c, i2);
        }
    }

    /* renamed from: a */
    public static void m139886a(boolean z, int i, List<Aweme> list, List<PreloadTask> list2) {
        int i2;
        for (final PreloadTask preloadTask : list2) {
            if (preloadTask.count > 0 && preloadTask.offset >= 0) {
                if (C68124l.m120412b() == 2) {
                    i2 = 1;
                } else {
                    i2 = preloadTask.count;
                }
                preloadTask.count = i2;
                int i3 = preloadTask.count;
                int i4 = preloadTask.offset;
                final Aweme[] awemeArr = new Aweme[i3];
                if (z) {
                    for (int i5 = 0; i5 < i3; i5++) {
                        int i6 = i + 1 + i5 + i4;
                        if (i6 < list.size()) {
                            awemeArr[i5] = list.get(i6);
                        }
                    }
                } else {
                    for (int i7 = 0; i7 < i3; i7++) {
                        int i8 = ((i - 1) - i7) - i4;
                        if (i8 >= 0 && i8 < list.size()) {
                            awemeArr[i7] = list.get(i8);
                        }
                    }
                }
                if (C84231a.m144834a().isDebug()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i9 = 0; i9 < i3; i9++) {
                        Aweme aweme = awemeArr[i9];
                        if (aweme != null) {
                            arrayList.add(aweme.getDesc() + "\n");
                        }
                    }
                    if (!C46825dd.f109093f) {
                        arrayList.size();
                    }
                }
                if (!C46825dd.f109093f || !C80446fr.f180030d) {
                    m139887a(awemeArr, preloadTask.getVideoPreloadSize());
                } else {
                    C12895a.f31387b.f31389a.post(new Runnable() {
                        /* class com.p2082ss.android.ugc.aweme.video.C80662ac.RunnableC806631 */

                        static {
                            Covode.recordClassIndex(93942);
                        }

                        public final void run() {
                            C80662ac.m139887a(awemeArr, preloadTask.getVideoPreloadSize());
                        }
                    });
                }
            }
        }
    }
}
