package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.ugc.effectplatform.model.CheckUpdateVersionModel */
public class CheckUpdateVersionModel {
    private String cursor;
    private String sorting_position;
    private String version;

    static {
        Covode.recordClassIndex(102528);
    }

    public CheckUpdateVersionModel() {
        this(null, null, null, 7, null);
    }

    public String getCursor() {
        return this.cursor;
    }

    public String getSorting_position() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCursor(String str) {
        this.cursor = str;
    }

    public void setSorting_position(String str) {
        this.sorting_position = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public CheckUpdateVersionModel(String str, String str2, String str3) {
        this.version = str;
        this.cursor = str2;
        this.sorting_position = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckUpdateVersionModel(String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
