package com.p2082ss.android.ugc.aweme.commerce.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.model.e */
public final class C37516e extends C37514c implements Serializable {
    @AbstractC27891c(mo46611a = "promotion_id")

    /* renamed from: a */
    private String f88550a = "";
    @AbstractC27891c(mo46611a = "product_id")

    /* renamed from: b */
    private String f88551b = "";
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: c */
    private String f88552c = "";
    @AbstractC27891c(mo46611a = "elastic_title")

    /* renamed from: d */
    private String f88553d = "";
    @AbstractC27891c(mo46611a = "card_url")

    /* renamed from: e */
    private String f88554e = "";
    @AbstractC27891c(mo46611a = "price")

    /* renamed from: f */
    private int f88555f;
    @AbstractC27891c(mo46611a = "sales")

    /* renamed from: g */
    private int f88556g;
    @AbstractC27891c(mo46611a = "promotion_source")

    /* renamed from: h */
    private int f88557h;
    @AbstractC27891c(mo46611a = "elastic_images")

    /* renamed from: i */
    private List<? extends UrlModel> f88558i = C89086z.INSTANCE;
    @AbstractC27891c(mo46611a = "label")

    /* renamed from: j */
    private List<String> f88559j = C89086z.INSTANCE;
    @AbstractC27891c(mo46611a = "visitor")

    /* renamed from: k */
    private PromotionVisitor f88560k;
    @AbstractC27891c(mo46611a = "jump_to_url")

    /* renamed from: l */
    private boolean f88561l;
    @AbstractC27891c(mo46611a = "comment_area")

    /* renamed from: m */
    private String f88562m;
    @AbstractC27891c(mo46611a = "meta_param")

    /* renamed from: n */
    private String f88563n;

    static {
        Covode.recordClassIndex(44904);
    }

    public final String getCardUrl() {
        return this.f88554e;
    }

    public final String getCommentArea() {
        return this.f88562m;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel>, java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> */
    public final List<UrlModel> getElasticImages() {
        return this.f88558i;
    }

    public final String getElasticTitle() {
        return this.f88553d;
    }

    public final boolean getJumpToUrl() {
        return this.f88561l;
    }

    public final List<String> getLabels() {
        return this.f88559j;
    }

    public final String getMetaParam() {
        return this.f88563n;
    }

    public final int getPrice() {
        return this.f88555f;
    }

    public final String getProductId() {
        return this.f88551b;
    }

    public final String getPromotionId() {
        return this.f88550a;
    }

    public final int getPromotionSource() {
        return this.f88557h;
    }

    public final int getSales() {
        return this.f88556g;
    }

    public final String getTitle() {
        return this.f88552c;
    }

    public final PromotionVisitor getVisitor() {
        return this.f88560k;
    }

    public final String getLongTitle() {
        if (!TextUtils.isEmpty(this.f88552c)) {
            return this.f88552c;
        }
        return this.f88553d;
    }

    public final String getShortTitle() {
        if (TextUtils.isEmpty(this.f88553d)) {
            return this.f88552c;
        }
        return this.f88553d;
    }

    public final void setCardUrl(String str) {
        this.f88554e = str;
    }

    public final void setCommentArea(String str) {
        this.f88562m = str;
    }

    public final void setElasticImages(List<? extends UrlModel> list) {
        this.f88558i = list;
    }

    public final void setElasticTitle(String str) {
        this.f88553d = str;
    }

    public final void setJumpToUrl(boolean z) {
        this.f88561l = z;
    }

    public final void setMetaParam(String str) {
        this.f88563n = str;
    }

    public final void setPrice(int i) {
        this.f88555f = i;
    }

    public final void setProductId(String str) {
        this.f88551b = str;
    }

    public final void setPromotionId(String str) {
        this.f88550a = str;
    }

    public final void setPromotionSource(int i) {
        this.f88557h = i;
    }

    public final void setSales(int i) {
        this.f88556g = i;
    }

    public final void setTitle(String str) {
        this.f88552c = str;
    }

    public final void setVisitor(PromotionVisitor promotionVisitor) {
        this.f88560k = promotionVisitor;
    }

    public final void setLabels(List<String> list) {
        C89219l.m154721d(list, "");
        this.f88559j = list;
    }
}
