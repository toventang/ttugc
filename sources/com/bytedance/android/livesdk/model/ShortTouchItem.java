package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

public class ShortTouchItem implements Serializable {
    @AbstractC27891c(mo46611a = "fc_second")
    public long fcSecond;
    @AbstractC27891c(mo46611a = "height")
    public long height;
    @AbstractC27891c(mo46611a = "left_margin")
    public long leftMargin;
    @AbstractC27891c(mo46611a = StringSet.name)
    public String name;
    @AbstractC27891c(mo46611a = "preview_setting")
    public C9538av previewSetting;
    @AbstractC27891c(mo46611a = "schema")
    public String schema;
    @AbstractC27891c(mo46611a = "top_margin")
    public long topMargin;
    @AbstractC27891c(mo46611a = "width")
    public long width;

    static {
        Covode.recordClassIndex(11050);
    }

    public long getFcSecond() {
        return this.fcSecond;
    }

    public long getHeight() {
        return this.height;
    }

    public long getLeftMargin() {
        return this.leftMargin;
    }

    public String getName() {
        return this.name;
    }

    public C9538av getPreviewSetting() {
        return this.previewSetting;
    }

    public String getSchema() {
        return this.schema;
    }

    public long getTopMargin() {
        return this.topMargin;
    }

    public long getWidth() {
        return this.width;
    }

    public void setFcSecond(long j) {
        this.fcSecond = j;
    }

    public void setHeight(long j) {
        this.height = j;
    }

    public void setLeftMargin(long j) {
        this.leftMargin = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPreviewSetting(C9538av avVar) {
        this.previewSetting = avVar;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTopMargin(long j) {
        this.topMargin = j;
    }

    public void setWidth(long j) {
        this.width = j;
    }
}
