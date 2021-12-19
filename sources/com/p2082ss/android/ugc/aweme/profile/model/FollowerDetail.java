package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.FollowerDetail */
public class FollowerDetail implements Serializable {
    @AbstractC27891c(mo46611a = "app_name")
    public String appName;
    @AbstractC27891c(mo46611a = "apple_id")
    public String appleId;
    @AbstractC27891c(mo46611a = "download_url")
    public String downloadUrl;
    @AbstractC27891c(mo46611a = "fans_count")
    public int fansCount;
    @AbstractC27891c(mo46611a = "icon")
    public String icon;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27891c(mo46611a = "open_url")
    public String openUrl;
    @AbstractC27891c(mo46611a = "package_name")
    public String packageName;

    static {
        Covode.recordClassIndex(75172);
    }

    public String getAppName() {
        return this.appName;
    }

    public String getAppleId() {
        return this.appleId;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppleId(String str) {
        this.appleId = str;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setFansCount(int i) {
        this.fansCount = i;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
