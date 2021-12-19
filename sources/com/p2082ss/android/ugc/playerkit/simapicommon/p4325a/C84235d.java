package com.p2082ss.android.ugc.playerkit.simapicommon.p4325a;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.d */
public final class C84235d extends C84239g {

    /* renamed from: i */
    private String f188334i;

    /* renamed from: j */
    private Integer f188335j;

    /* renamed from: k */
    private String f188336k;

    /* renamed from: l */
    private Float f188337l;

    /* renamed from: m */
    private Float f188338m;

    /* renamed from: n */
    private Integer f188339n;

    /* renamed from: o */
    private String f188340o;

    /* renamed from: p */
    private Long f188341p;

    /* renamed from: q */
    private long f188342q;

    static {
        Covode.recordClassIndex(98144);
    }

    public final Integer getBitRate() {
        return this.f188335j;
    }

    public final Long getCdnUrlExpired() {
        return this.f188341p;
    }

    public final long getCreateTime() {
        return this.f188342q;
    }

    public final String getFileKey() {
        return this.f188340o;
    }

    public final Integer getInfoId() {
        return this.f188339n;
    }

    public final String getLang() {
        return this.f188336k;
    }

    public final Float getLoudness() {
        return this.f188337l;
    }

    public final Float getPeak() {
        return this.f188338m;
    }

    public final String getVoiceType() {
        return this.f188334i;
    }

    public final void setBitRate(Integer num) {
        this.f188335j = num;
    }

    public final void setCdnUrlExpired(Long l) {
        this.f188341p = l;
    }

    public final void setCreateTime(long j) {
        this.f188342q = j;
    }

    public final void setFileKey(String str) {
        this.f188340o = str;
    }

    public final void setInfoId(Integer num) {
        this.f188339n = num;
    }

    public final void setLang(String str) {
        this.f188336k = str;
    }

    public final void setLoudness(Float f) {
        this.f188337l = f;
    }

    public final void setPeak(Float f) {
        this.f188338m = f;
    }

    public final void setVoiceType(String str) {
        this.f188334i = str;
    }

    /* renamed from: com.ss.android.ugc.playerkit.simapicommon.a.d$a */
    public static final class C84236a {

        /* renamed from: a */
        public final C84235d f188343a = new C84235d();

        static {
            Covode.recordClassIndex(98145);
        }

        /* renamed from: a */
        public final C84236a mo129117a(String str) {
            this.f188343a.f188362h = str;
            return this;
        }

        /* renamed from: a */
        public final C84236a mo129118a(List<String> list) {
            this.f188343a.f188355a = list;
            return this;
        }
    }
}
