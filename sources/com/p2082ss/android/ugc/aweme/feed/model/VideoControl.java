package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.VideoControl */
public class VideoControl implements Serializable {
    @AbstractC27891c(mo46611a = "allow_download")
    public Boolean allowDownload;
    @AbstractC27891c(mo46611a = "draft_progress_bar")
    public int draftProgressBar;
    @AbstractC27891c(mo46611a = "allow_duet")
    public boolean isAllowDuet;
    @AbstractC27891c(mo46611a = "allow_dynamic_wallpaper")
    public boolean isAllowDynamicWallpaper;
    @AbstractC27891c(mo46611a = "allow_music")
    public boolean isAllowMusic = true;
    @AbstractC27891c(mo46611a = "allow_react")
    public boolean isAllowReact;
    @AbstractC27891c(mo46611a = "prevent_download_type")
    public int preventDownloadType;
    @AbstractC27891c(mo46611a = "share_type")
    public int shareType;
    @AbstractC27891c(mo46611a = "show_progress_bar")
    public int showProgressBar;
    @AbstractC27891c(mo46611a = "timer_status")
    public int timerStatus = 1;

    static {
        Covode.recordClassIndex(58772);
    }
}
