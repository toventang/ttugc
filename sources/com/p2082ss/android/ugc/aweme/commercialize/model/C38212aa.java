package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.aa */
public final class C38212aa implements Serializable {
    @AbstractC27891c(mo46611a = "description")

    /* renamed from: a */
    private String f90260a;
    @AbstractC27891c(mo46611a = "button_text")

    /* renamed from: b */
    private String f90261b;
    @AbstractC27891c(mo46611a = "fake_author_version")

    /* renamed from: c */
    private Integer f90262c = 0;
    @AbstractC27891c(mo46611a = "auto_show_webview")

    /* renamed from: d */
    private Boolean f90263d = false;
    @AbstractC27891c(mo46611a = "rating")

    /* renamed from: e */
    private Float f90264e;
    @AbstractC27891c(mo46611a = "total_ratings_reviews")

    /* renamed from: f */
    private String f90265f;
    @AbstractC27891c(mo46611a = "category_label")

    /* renamed from: g */
    private String f90266g;
    @AbstractC27891c(mo46611a = "rank_label")

    /* renamed from: h */
    private String f90267h;
    @AbstractC27891c(mo46611a = "show_banner")

    /* renamed from: i */
    private boolean f90268i;
    @AbstractC27891c(mo46611a = "jump_data")

    /* renamed from: j */
    private C38213ab f90269j;

    static {
        Covode.recordClassIndex(45696);
    }

    public final Boolean getAutoShowWebview() {
        return this.f90263d;
    }

    public final String getButtonText() {
        return this.f90261b;
    }

    public final String getCategoryLabel() {
        return this.f90266g;
    }

    public final String getDescription() {
        return this.f90260a;
    }

    public final Integer getFakeAuthorVersion() {
        return this.f90262c;
    }

    public final C38213ab getJumpData() {
        return this.f90269j;
    }

    public final String getRankLabel() {
        return this.f90267h;
    }

    public final Float getRating() {
        return this.f90264e;
    }

    public final boolean getShouldShowBanner() {
        return this.f90268i;
    }

    public final String getTotalRatingsReviews() {
        return this.f90265f;
    }

    public final void setAutoShowWebview(Boolean bool) {
        this.f90263d = bool;
    }

    public final void setButtonText(String str) {
        this.f90261b = str;
    }

    public final void setCategoryLabel(String str) {
        this.f90266g = str;
    }

    public final void setDescription(String str) {
        this.f90260a = str;
    }

    public final void setFakeAuthorVersion(Integer num) {
        this.f90262c = num;
    }

    public final void setJumpData(C38213ab abVar) {
        this.f90269j = abVar;
    }

    public final void setRankLabel(String str) {
        this.f90267h = str;
    }

    public final void setRating(Float f) {
        this.f90264e = f;
    }

    public final void setShouldShowBanner(boolean z) {
        this.f90268i = z;
    }

    public final void setTotalRatingsReviews(String str) {
        this.f90265f = str;
    }
}
