package com.p2082ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel */
public class RelationDynamicLabel implements Serializable {
    @AbstractC27891c(mo46611a = "count")
    int count;
    @AbstractC27891c(mo46611a = "label_info")
    String labelInfo;
    @AbstractC27891c(mo46611a = "nickname")
    String nickname;
    @AbstractC27891c(mo46611a = "show_type")
    int showType;
    @AbstractC27891c(mo46611a = "tab_label_info")
    String tabText;
    @AbstractC27891c(mo46611a = StringSet.type)
    int type;
    @AbstractC27891c(mo46611a = "user_id")
    String userId;

    static {
        Covode.recordClassIndex(58749);
    }

    public int getCount() {
        return this.count;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getShowType() {
        return this.showType;
    }

    public String getTabText() {
        return this.tabText;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isValid() {
        if (!TextUtils.isEmpty(this.labelInfo)) {
            return true;
        }
        return false;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public void setShowType(int i) {
        this.showType = i;
    }

    public void setTabText(String str) {
        this.tabText = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public RelationDynamicLabel setUserId(String str) {
        this.userId = str;
        return this;
    }
}
