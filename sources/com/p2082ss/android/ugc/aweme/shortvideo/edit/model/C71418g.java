package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.g */
public final class C71418g implements Serializable {

    /* renamed from: a */
    private String f160023a = "";

    /* renamed from: b */
    private String f160024b = "";

    /* renamed from: c */
    private String f160025c = "";

    /* renamed from: d */
    private String f160026d = "";

    static {
        Covode.recordClassIndex(83952);
    }

    public final String getAid() {
        return this.f160023a;
    }

    public final String getCover() {
        return this.f160025c;
    }

    public final String getMid() {
        return this.f160026d;
    }

    public final String getVid() {
        return this.f160024b;
    }

    public final void setAid(String str) {
        C89219l.m154721d(str, "");
        this.f160023a = str;
    }

    public final void setCover(String str) {
        C89219l.m154721d(str, "");
        this.f160025c = str;
    }

    public final void setMid(String str) {
        C89219l.m154721d(str, "");
        this.f160026d = str;
    }

    public final void setVid(String str) {
        C89219l.m154721d(str, "");
        this.f160024b = str;
    }
}
