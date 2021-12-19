package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse */
public class ActivityLinkResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "link_info")
    public LinkInfo linkInfo;

    static {
        Covode.recordClassIndex(75146);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse$LinkInfo */
    public class LinkInfo {
        @AbstractC27891c(mo46611a = "background_style")
        public String backgroundUrl;
        @AbstractC27891c(mo46611a = "close_after")
        public int closeAfter;
        @AbstractC27891c(mo46611a = "days_no_show")
        public int daysNotShow;
        @AbstractC27891c(mo46611a = "days_window")
        public int daysWindow;
        @AbstractC27891c(mo46611a = "click_disappear")
        public boolean disappearAfterClicked;
        @AbstractC27891c(mo46611a = "font_color")
        public String fontColor;
        @AbstractC27891c(mo46611a = "max_close")
        public int maxClose;
        @AbstractC27891c(mo46611a = "teenager_mode_enable")
        public boolean teenagerModeEnable;
        @AbstractC27891c(mo46611a = "text")
        public String text;
        @AbstractC27891c(mo46611a = "h5_url")
        public String url;

        static {
            Covode.recordClassIndex(75147);
        }

        public LinkInfo() {
        }
    }
}
