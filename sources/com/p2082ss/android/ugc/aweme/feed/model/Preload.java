package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Preload */
public class Preload implements Serializable {
    @AbstractC27891c(mo46611a = "comment_median_time")
    public long commentMedianTime;
    @AbstractC27891c(mo46611a = UGCMonitor.EVENT_COMMENT)
    public int commentPreload = -1;
    @AbstractC27891c(mo46611a = "comment_pro")
    public double commentPro;
    @AbstractC27891c(mo46611a = "comment_thres")
    public double commentThres;
    @AbstractC27891c(mo46611a = "model_v2")
    public int modelV2;
    @AbstractC27891c(mo46611a = "predict_config")
    public String predictConfig;
    @AbstractC27891c(mo46611a = "profile_median_time")
    public long profileMedianTime;
    @AbstractC27891c(mo46611a = "profile")
    public int profilePreload = -1;
    @AbstractC27891c(mo46611a = "profile_pro")
    public double profilePro;
    @AbstractC27891c(mo46611a = "profile_thres")
    public double profileThres;

    static {
        Covode.recordClassIndex(58746);
    }
}
