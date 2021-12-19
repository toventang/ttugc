package com.p2082ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.e */
public final class C61289e implements Serializable {
    public static final C61290a Companion = new C61290a((byte) 0);
    public static final String VIDEO = "video";
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: a */
    private String f139193a = "";
    @AbstractC27891c(mo46611a = "origin_file_path")

    /* renamed from: b */
    private String f139194b = "";
    @AbstractC27891c(mo46611a = StringSet.type)

    /* renamed from: c */
    private String f139195c = "";
    @AbstractC27891c(mo46611a = "sourceStartTime")

    /* renamed from: d */
    private long f139196d;
    @AbstractC27891c(mo46611a = "duration")

    /* renamed from: e */
    private long f139197e;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: f */
    private int f139198f;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: g */
    private int f139199g;
    @AbstractC27891c(mo46611a = "mvItemCrop")

    /* renamed from: h */
    private MvItemCrop f139200h;
    @AbstractC27891c(mo46611a = "photo_path")

    /* renamed from: i */
    private final String f139201i;

    static {
        Covode.recordClassIndex(71908);
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtheme.e$a */
    public static final class C61290a {
        static {
            Covode.recordClassIndex(71909);
        }

        private C61290a() {
        }

        public /* synthetic */ C61290a(byte b) {
            this();
        }
    }

    public final long getDuration() {
        return this.f139197e;
    }

    public final int getHeight() {
        return this.f139199g;
    }

    public final MvItemCrop getMvItemCrop() {
        return this.f139200h;
    }

    public final String getOriginFilePath() {
        return this.f139194b;
    }

    public final String getPhotoPath() {
        return this.f139201i;
    }

    public final String getSource() {
        return this.f139193a;
    }

    public final long getSourceStartTime() {
        return this.f139196d;
    }

    public final String getType() {
        return this.f139195c;
    }

    public final int getWidth() {
        return this.f139198f;
    }

    public final void setDuration(long j) {
        this.f139197e = j;
    }

    public final void setHeight(int i) {
        this.f139199g = i;
    }

    public final void setMvItemCrop(MvItemCrop mvItemCrop) {
        this.f139200h = mvItemCrop;
    }

    public final void setSourceStartTime(long j) {
        this.f139196d = j;
    }

    public final void setWidth(int i) {
        this.f139198f = i;
    }

    public final void setOriginFilePath(String str) {
        C89219l.m154721d(str, "");
        this.f139194b = str;
    }

    public final void setSource(String str) {
        C89219l.m154721d(str, "");
        this.f139193a = str;
    }

    public final void setType(String str) {
        C89219l.m154721d(str, "");
        this.f139195c = str;
    }

    public C61289e(String str) {
        C89219l.m154721d(str, "");
        this.f139201i = str;
    }
}
