package com.bytedance.android.live.base.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.b */
public final class C2962b {
    @AbstractC27891c(mo46611a = "uri")

    /* renamed from: a */
    public String f8711a;
    @AbstractC27891c(mo46611a = "url_list")

    /* renamed from: b */
    public List<String> f8712b;

    static {
        Covode.recordClassIndex(3407);
    }

    /* renamed from: a */
    public final ImageModel mo7782a() {
        return new ImageModel(this.f8711a, this.f8712b);
    }

    public final String toString() {
        return "UrlStruct{uri='" + this.f8711a + '\'' + ", urlList=" + this.f8712b + '}';
    }
}
