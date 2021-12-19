package com.bytedance.android.live.effect.model;

import com.bytedance.covode.number.Covode;

public class LocalFilterModel {
    private int coverResId;
    private String filterFilePath;

    /* renamed from: id */
    private String f11845id;
    private String name;

    static {
        Covode.recordClassIndex(4880);
    }

    public LocalFilterModel() {
    }

    public int getCoverResId() {
        return this.coverResId;
    }

    public String getFilterFilePath() {
        return this.filterFilePath;
    }

    public String getId() {
        return this.f11845id;
    }

    public String getName() {
        return this.name;
    }

    public void setCoverResId(int i) {
        this.coverResId = i;
    }

    public void setFilterFilePath(String str) {
        this.filterFilePath = str;
    }

    public void setId(String str) {
        this.f11845id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public LocalFilterModel(String str, int i, String str2, String str3) {
        this.f11845id = str;
        this.coverResId = i;
        this.name = str2;
        this.filterFilePath = str3;
    }
}
