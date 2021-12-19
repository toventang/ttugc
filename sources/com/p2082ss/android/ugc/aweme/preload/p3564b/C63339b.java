package com.p2082ss.android.ugc.aweme.preload.p3564b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.language.C58073f;
import com.p2082ss.android.ugc.aweme.p3452ml.api.MLDataCenterService;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadCommentV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.api.SmartPreloadProfileV2Service;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadCommentV2Experiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.SmartPreloadProfileV2Experiment;
import com.p2082ss.android.ugc.aweme.p3452ml.p3455b.C60016c;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.preload.b.b */
public final class C63339b {

    /* renamed from: d */
    public static final AbstractC89244h f143767d = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C63341b.f143772a);

    /* renamed from: e */
    public static final C63340a f143768e = new C63340a((byte) 0);

    /* renamed from: a */
    public int f143769a;

    /* renamed from: b */
    public boolean f143770b;

    /* renamed from: c */
    public boolean f143771c;

    /* renamed from: com.ss.android.ugc.aweme.preload.b.b$a */
    public static final class C63340a {
        static {
            Covode.recordClassIndex(74623);
        }

        /* renamed from: a */
        public static C63339b m114834a() {
            return (C63339b) C63339b.f143767d.getValue();
        }

        private C63340a() {
        }

        public /* synthetic */ C63340a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.preload.b.b$b */
    static final class C63341b extends AbstractC89220m implements AbstractC89171a<C63339b> {

        /* renamed from: a */
        public static final C63341b f143772a = new C63341b();

        static {
            Covode.recordClassIndex(74624);
        }

        C63341b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63339b invoke() {
            return new C63339b();
        }
    }

    static {
        Covode.recordClassIndex(74622);
    }

    /* renamed from: a */
    public final boolean mo101928a(Aweme aweme, boolean z, boolean z2) {
        int i;
        if (aweme == null) {
            return false;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C60016c feedTrackRangeInfo = MLDataCenterService.C59999b.f136655a.getFeedTrackRangeInfo(aweme.getAid(), 5, true);
        if (feedTrackRangeInfo != null) {
            int i2 = 0;
            int i3 = 0;
            do {
                if (i3 < 0 || i3 >= feedTrackRangeInfo.f136701e.size()) {
                    hashMap.put("play_time_".concat(String.valueOf(i2)), 0);
                } else {
                    String concat = "play_time_".concat(String.valueOf(i2));
                    Long l = feedTrackRangeInfo.f136701e.get(i3);
                    C89219l.m154716b(l, "");
                    hashMap.put(concat, l);
                    i3++;
                }
                i2++;
            } while (i2 < 5);
            hashMap.put("finish_cnt", Integer.valueOf(feedTrackRangeInfo.f136699c));
            hashMap.put("like_cnt", Integer.valueOf(feedTrackRangeInfo.f136697a));
            hashMap.put("head_cnt", Integer.valueOf(feedTrackRangeInfo.f136700d));
            hashMap.put("follow_cnt", Integer.valueOf(this.f143769a));
            hashMap.put("comment_cnt", Integer.valueOf(feedTrackRangeInfo.f136698b));
        }
        Video video = aweme.getVideo();
        if (video != null) {
            hashMap.put("v_duration", Integer.valueOf(video.getVideoLength()));
        }
        hashMap.put("is_ad", Integer.valueOf(aweme.isAd() ? 1 : 0));
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            hashMap.put("v_comments", Long.valueOf(statistics.getCommentCount()));
            hashMap.put("v_likes", Long.valueOf(statistics.getDiggCount()));
            hashMap.put("v_vvs", Long.valueOf(statistics.getPlayCount()));
            hashMap.put("v_shares", Long.valueOf(statistics.getShareCount()));
            hashMap.put("v_downloads", Long.valueOf(statistics.getDownloadCount()));
        }
        hashMap.put("follow_status", Integer.valueOf(aweme.getFollowStatus()));
        hashMap.put("cur_finish", Integer.valueOf(z ? 1 : 0));
        hashMap.put("cur_like", Integer.valueOf(aweme.isLike() ? 1 : 0));
        if (aweme.getFollowStatus() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        hashMap.put("cur_follow", Integer.valueOf(i));
        hashMap.put("cur_favorite", Integer.valueOf(aweme.isCollected() ? 1 : 0));
        if (z2) {
            hashMap.put("cur_comment", Integer.valueOf(this.f143770b ? 1 : 0));
        }
        String a = C58073f.m104920a();
        C89219l.m154716b(a, "");
        hashMap.put("country", a);
        if (z2) {
            float smartJudge = SmartPreloadProfileV2Service.C60011b.f136667a.smartJudge(aweme, hashMap, hashMap2);
            SmartPreloadProfileV2Experiment.PreloadProfileMLModel a2 = SmartPreloadProfileV2Experiment.C59985a.m109506a();
            if (a2 == null || smartJudge < a2.clientAIThreshold) {
                return false;
            }
            return true;
        }
        float smartJudge2 = SmartPreloadCommentV2Service.C60009b.f136665a.smartJudge(aweme, hashMap, hashMap2);
        SmartPreloadCommentV2Experiment.PreloadCommentMLModel a3 = SmartPreloadCommentV2Experiment.C59983a.m109503a();
        if (a3 == null || smartJudge2 < a3.clientAIThreshold) {
            return false;
        }
        return true;
        return false;
    }
}
