package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams */
public final class VideoCaptionUpdateParams {
    public String awemeId;
    public String captionText;
    public int code;
    public int pts;

    static {
        Covode.recordClassIndex(58770);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.VideoCaptionUpdateParams$Builder */
    public static final class Builder {
        public final VideoCaptionUpdateParams mParams = new VideoCaptionUpdateParams();

        static {
            Covode.recordClassIndex(58771);
        }

        public final Builder setAwemeId(String str) {
            this.mParams.awemeId = str;
            return this;
        }

        public final Builder setCaptionText(String str) {
            this.mParams.captionText = str;
            return this;
        }

        public final Builder setCode(int i) {
            this.mParams.code = i;
            return this;
        }

        public final Builder setTimestamp(int i) {
            this.mParams.pts = i;
            return this;
        }
    }
}
