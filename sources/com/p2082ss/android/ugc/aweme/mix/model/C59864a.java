package com.p2082ss.android.ugc.aweme.mix.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.mix.model.a */
public final class C59864a extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "mix_list")

    /* renamed from: a */
    private List<? extends C59867d> f136358a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    private boolean f136359b;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: c */
    private long f136360c;

    /* renamed from: d */
    private String f136361d = "";

    /* renamed from: e */
    private String f136362e = "";

    /* renamed from: f */
    private String f136363f = "";

    /* renamed from: g */
    private String f136364g = "";

    static {
        Covode.recordClassIndex(70271);
    }

    public final long getCursor() {
        return this.f136360c;
    }

    public final boolean getHasMore() {
        return this.f136359b;
    }

    public final String getKeyWord() {
        return this.f136361d;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.mix.model.d>, java.util.List<com.ss.android.ugc.aweme.mix.model.d> */
    public final List<C59867d> getMixList() {
        return this.f136358a;
    }

    public final String getSearchId() {
        return this.f136362e;
    }

    public final String getSearchResultId() {
        return this.f136363f;
    }

    public final String getSearchType() {
        return this.f136364g;
    }

    public final void setCursor(long j) {
        this.f136360c = j;
    }

    public final void setHasMore(boolean z) {
        this.f136359b = z;
    }

    public final void setKeyWord(String str) {
        this.f136361d = str;
    }

    public final void setMixList(List<? extends C59867d> list) {
        this.f136358a = list;
    }

    public final void setSearchId(String str) {
        this.f136362e = str;
    }

    public final void setSearchResultId(String str) {
        this.f136363f = str;
    }

    public final void setSearchType(String str) {
        this.f136364g = str;
    }
}
