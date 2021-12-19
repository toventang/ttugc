package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2911b.p2912a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.b.a.c */
public final class C46560c implements Serializable {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: a */
    private long f108556a;
    @AbstractC27891c(mo46611a = "display_name")

    /* renamed from: b */
    private String f108557b = "";
    @AbstractC27891c(mo46611a = "version")

    /* renamed from: c */
    private long f108558c;
    @AbstractC27891c(mo46611a = "mini_cover")

    /* renamed from: d */
    private String f108559d = "";
    @AbstractC27891c(mo46611a = "stickers")

    /* renamed from: e */
    private List<C46558a> f108560e;

    /* renamed from: f */
    private String f108561f = "";

    /* renamed from: g */
    private String f108562g = "";

    /* renamed from: h */
    private String f108563h = "";

    static {
        Covode.recordClassIndex(55147);
    }

    public final String getDisplayName() {
        return this.f108557b;
    }

    public final long getId() {
        return this.f108556a;
    }

    public final String getMd5() {
        return this.f108561f;
    }

    public final String getMiniCover() {
        return this.f108559d;
    }

    public final String getPicFileDirPath() {
        return this.f108563h;
    }

    public final String getResDirPath() {
        return this.f108562g;
    }

    public final List<C46558a> getStickers() {
        return this.f108560e;
    }

    public final long getVersion() {
        return this.f108558c;
    }

    public final boolean isValid() {
        List<C46558a> list = this.f108560e;
        if (list == null || list.isEmpty() || this.f108561f.length() <= 0 || this.f108562g.length() <= 0 || this.f108563h.length() <= 0) {
            return false;
        }
        return true;
    }

    public final String toString() {
        Integer num;
        StringBuilder append = new StringBuilder("OnlineSmallEmojiResInfo{md5=").append(this.f108561f).append(", resDirPath=").append(this.f108562g).append(", picFilePath=").append(this.f108563h).append(", stickers=");
        List<C46558a> list = this.f108560e;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        return append.append(num).append('}').toString();
    }

    public final void setDisplayName(String str) {
        this.f108557b = str;
    }

    public final void setId(long j) {
        this.f108556a = j;
    }

    public final void setMiniCover(String str) {
        this.f108559d = str;
    }

    public final void setStickers(List<C46558a> list) {
        this.f108560e = list;
    }

    public final void setVersion(long j) {
        this.f108558c = j;
    }

    public final void setMd5(String str) {
        C89219l.m154721d(str, "");
        this.f108561f = str;
    }

    public final void setPicFileDirPath(String str) {
        C89219l.m154721d(str, "");
        this.f108563h = str;
    }

    public final void setResDirPath(String str) {
        C89219l.m154721d(str, "");
        this.f108562g = str;
    }
}
