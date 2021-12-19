package com.p2082ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel */
public class AwemeTextLabelModel implements Serializable {
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    public String bgColor;
    @AbstractC27891c(mo46611a = "by_source")
    public String bySource;
    @AbstractC27891c(mo46611a = "by_text")
    public String byText;
    @AbstractC27891c(mo46611a = "by_uid")
    public long byUid;
    @AbstractC27891c(mo46611a = "text")
    public String labelName;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int labelType;
    @AbstractC27891c(mo46611a = "show_seconds")
    public float showSeconds;
    @AbstractC27891c(mo46611a = "color_text")
    public String textColor;
    @AbstractC27891c(mo46611a = "white_color")
    public String whiteBgColor;
    @AbstractC27891c(mo46611a = "white_color_text")
    public String whiteTextColor;

    static {
        Covode.recordClassIndex(58646);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public String getLabelName() {
        return this.labelName;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public float getShowSeconds() {
        return this.showSeconds;
    }

    public String getTextColor() {
        return this.textColor;
    }

    public String getWhiteBgColor() {
        return this.whiteBgColor;
    }

    public String getWhiteTextColor() {
        return this.whiteTextColor;
    }

    public boolean isAdHollowText() {
        if (TextUtils.isEmpty(this.textColor) || !this.textColor.endsWith("00000000")) {
            return false;
        }
        return true;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setLabelName(String str) {
        this.labelName = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setShowSeconds(float f) {
        this.showSeconds = f;
    }

    public void setTextColor(String str) {
        this.textColor = str;
    }
}
