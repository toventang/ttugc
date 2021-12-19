package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackOptions */
public class SearchPullFeedbackOptions {
    @AbstractC27891c(mo46611a = "hashtag_tab")
    private List<String> hashtagTab = new ArrayList();
    @AbstractC27891c(mo46611a = "sound_tab")
    private List<String> soundTab = new ArrayList();
    @AbstractC27891c(mo46611a = "top_tab")
    private List<String> topTab = new ArrayList();
    @AbstractC27891c(mo46611a = "user_tab")
    private List<String> userTab = new ArrayList();
    @AbstractC27891c(mo46611a = "video_tab")
    private List<String> videoTab = new ArrayList();

    static {
        Covode.recordClassIndex(62387);
    }

    public List<String> getHashtagTab() {
        return this.hashtagTab;
    }

    public List<String> getSoundTab() {
        return this.soundTab;
    }

    public List<String> getTopTab() {
        return this.topTab;
    }

    public List<String> getUserTab() {
        return this.userTab;
    }

    public List<String> getVideoTab() {
        return this.videoTab;
    }
}
