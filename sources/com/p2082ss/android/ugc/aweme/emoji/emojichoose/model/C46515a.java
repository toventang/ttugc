package com.p2082ss.android.ugc.aweme.emoji.emojichoose.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojichoose.model.a */
public final class C46515a extends C46516b {
    @AbstractC27891c(mo46611a = "resource_type")

    /* renamed from: a */
    private int f108439a;
    @AbstractC27891c(mo46611a = "package_type")

    /* renamed from: b */
    private int f108440b;
    @AbstractC27891c(mo46611a = "stickers")

    /* renamed from: c */
    private List<C46534a> f108441c;

    static {
        Covode.recordClassIndex(55102);
    }

    public final int getPackageType() {
        return this.f108440b;
    }

    public final int getResourceType() {
        return this.f108439a;
    }

    public final List<C46534a> getStickers() {
        return this.f108441c;
    }

    public final void setPackageType(int i) {
        this.f108440b = i;
    }

    public final void setResourceType(int i) {
        this.f108439a = i;
    }

    public final void setStickers(List<C46534a> list) {
        this.f108441c = list;
    }
}
