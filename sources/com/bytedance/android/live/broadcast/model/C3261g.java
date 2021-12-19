package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.model.g */
public final class C3261g implements Serializable {
    @AbstractC27891c(mo46611a = "category_id")

    /* renamed from: a */
    private Long f9332a;
    @AbstractC27891c(mo46611a = "title")

    /* renamed from: b */
    private String f9333b;
    @AbstractC27891c(mo46611a = "sub_categorys")

    /* renamed from: c */
    private List<C3261g> f9334c;
    @AbstractC27891c(mo46611a = "is_removed")

    /* renamed from: d */
    private boolean f9335d;
    @AbstractC27891c(mo46611a = "category_app_android")

    /* renamed from: e */
    private List<String> f9336e;
    @AbstractC27891c(mo46611a = "orientation")

    /* renamed from: f */
    private int f9337f;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: g */
    private ImageModel f9338g;

    static {
        Covode.recordClassIndex(3743);
    }

    public final List<String> getCategoryAppAndroid() {
        return this.f9336e;
    }

    public final Long getCategoryId() {
        return this.f9332a;
    }

    public final ImageModel getIcon() {
        return this.f9338g;
    }

    public final int getOrientation() {
        return this.f9337f;
    }

    public final List<C3261g> getSubCategories() {
        return this.f9334c;
    }

    public final String getTitle() {
        return this.f9333b;
    }

    public final boolean isRemoved() {
        return this.f9335d;
    }

    public final void setCategoryAppAndroid(List<String> list) {
        this.f9336e = list;
    }

    public final void setCategoryId(Long l) {
        this.f9332a = l;
    }

    public final void setIcon(ImageModel imageModel) {
        this.f9338g = imageModel;
    }

    public final void setOrientation(int i) {
        this.f9337f = i;
    }

    public final void setRemoved(boolean z) {
        this.f9335d = z;
    }

    public final void setSubCategories(List<C3261g> list) {
        this.f9334c = list;
    }

    public final void setTitle(String str) {
        this.f9333b = str;
    }
}
