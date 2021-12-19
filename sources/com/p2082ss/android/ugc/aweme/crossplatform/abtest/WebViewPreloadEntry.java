package com.p2082ss.android.ugc.aweme.crossplatform.abtest;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.abtest.WebViewPreloadEntry */
public class WebViewPreloadEntry {
    @AbstractC27891c(mo46611a = "delay")
    private long delay = 3000;
    @AbstractC27891c(mo46611a = "preType")
    private String preType = "render";
    @AbstractC27891c(mo46611a = StringSet.type)
    private String type = "BootFinished";
    @AbstractC27891c(mo46611a = "url")
    private String url = "https://s16-ies.tiktok.com/ies-cdn-alisg/tiktok_activities/covid19/pages/coronavirus/index.html?hide_nav_bar=1&enter_from=topic_entrance";
    @AbstractC27891c(mo46611a = "usePool")
    private boolean usePool = true;

    static {
        Covode.recordClassIndex(48340);
    }

    public long getDelay() {
        return this.delay;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isUsePool() {
        return this.usePool;
    }

    public boolean isBackground() {
        return TextUtils.equals("Background", this.type);
    }

    public boolean isNeedRender() {
        return TextUtils.equals("render", this.preType);
    }
}
