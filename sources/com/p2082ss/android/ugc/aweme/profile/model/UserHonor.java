package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserHonor */
public class UserHonor implements Serializable {
    @AbstractC27891c(mo46611a = "now_diamond")
    private long currentDiamond;
    @AbstractC27891c(mo46611a = "icon")
    private UrlModel currentHonorIcon;
    @AbstractC27891c(mo46611a = StringSet.name)
    private String currentHonorName;
    @AbstractC27891c(mo46611a = "diamond_icon")
    private UrlModel diamondIcon;
    @AbstractC27891c(mo46611a = "im_icon")
    private UrlModel imIcon;
    @AbstractC27891c(mo46611a = "level")
    private int level;
    @AbstractC27891c(mo46611a = "live_icon")
    private UrlModel liveIcon;
    @AbstractC27891c(mo46611a = "next_diamond")
    private long nextDiamond;
    @AbstractC27891c(mo46611a = "next_icon")
    private UrlModel nextHonorIcon;
    @AbstractC27891c(mo46611a = "next_name")
    private String nextHonorName;
    @AbstractC27891c(mo46611a = "total_diamond_count")
    private long totalDiamond;

    static {
        Covode.recordClassIndex(75231);
    }

    public long getCurrentDiamond() {
        return this.currentDiamond;
    }

    public UrlModel getCurrentHonorIcon() {
        return this.currentHonorIcon;
    }

    public String getCurrentHonorName() {
        return this.currentHonorName;
    }

    public UrlModel getDiamondIcon() {
        return this.diamondIcon;
    }

    public UrlModel getImIcon() {
        return this.imIcon;
    }

    public int getLevel() {
        return this.level;
    }

    public UrlModel getLiveIcon() {
        return this.liveIcon;
    }

    public long getNextDiamond() {
        return this.nextDiamond;
    }

    public UrlModel getNextHonorIcon() {
        return this.nextHonorIcon;
    }

    public String getNextHonorName() {
        return this.nextHonorName;
    }

    public long getTotalDiamond() {
        return this.totalDiamond;
    }

    public void setCurrentDiamond(long j) {
        this.currentDiamond = j;
    }

    public void setCurrentHonorIcon(UrlModel urlModel) {
        this.currentHonorIcon = urlModel;
    }

    public void setCurrentHonorName(String str) {
        this.currentHonorName = str;
    }

    public void setDiamondIcon(UrlModel urlModel) {
        this.diamondIcon = urlModel;
    }

    public void setImIcon(UrlModel urlModel) {
        this.imIcon = urlModel;
    }

    public void setLevel(int i) {
        this.level = i;
    }

    public void setLiveIcon(UrlModel urlModel) {
        this.liveIcon = urlModel;
    }

    public void setNextDiamond(long j) {
        this.nextDiamond = j;
    }

    public void setNextHonorIcon(UrlModel urlModel) {
        this.nextHonorIcon = urlModel;
    }

    public void setNextHonorName(String str) {
        this.nextHonorName = str;
    }

    public void setTotalDiamond(long j) {
        this.totalDiamond = j;
    }
}
