package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.commercialize.coupon.model.C37637a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse */
public final class CreateAwemeResponse extends C69831ai implements AbstractC33623d, Serializable {
    @AbstractC27891c(mo46611a = "aweme")
    public Aweme aweme;
    @AbstractC27891c(mo46611a = "coupon_info")
    public C37637a couponInfo;
    @AbstractC27891c(mo46611a = "has_sticker_red_packet")
    public boolean hasStickerRedPacket;
    @AbstractC27891c(mo46611a = "is_review_video")
    public int isReviewVideo;
    @AbstractC27891c(mo46611a = "log_pb")
    public LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "notify")
    public String[] notify;
    @AbstractC27891c(mo46611a = "notify_extra")
    public C69724a notifyExtra;
    public String requestId;
    @AbstractC27891c(mo46611a = "response_marker")
    public C69725b responseMarker;
    @AbstractC27891c(mo46611a = "share_tip_duration")
    public int shareTipDuration;
    @AbstractC27891c(mo46611a = "token")
    public String stickerToken;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$a */
    public static final class C69724a implements Serializable {
        @AbstractC27891c(mo46611a = "button_text")
        public String btnText;
        @AbstractC27891c(mo46611a = "text")
        public String text;
        @AbstractC27891c(mo46611a = StringSet.type)
        public int type;

        static {
            Covode.recordClassIndex(82108);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse$b */
    public static final class C69725b implements Serializable {
        @AbstractC27891c(mo46611a = "add_to_playlist_fail")
        public Boolean addToPlaylistFail;

        static {
            Covode.recordClassIndex(82109);
        }
    }

    static {
        Covode.recordClassIndex(82107);
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final String getRequestId() {
        return this.requestId;
    }

    public final void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public final void setRequestId(String str) {
        this.requestId = str;
    }
}
