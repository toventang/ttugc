package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.x */
public class C9916x {
    @AbstractC27891c(mo46611a = "level_str")

    /* renamed from: a */
    public String f24038a;
    @AbstractC27891c(mo46611a = "icon_diamond")

    /* renamed from: b */
    public int f24039b;
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: c */
    public ImageModel f24040c;
    @AbstractC27891c(mo46611a = "level")

    /* renamed from: d */
    public int f24041d;

    static {
        Covode.recordClassIndex(11464);
    }

    public int hashCode() {
        int i;
        String str = this.f24038a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.f24039b) * 31;
        ImageModel imageModel = this.f24040c;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        }
        return ((i3 + i2) * 31) + this.f24041d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C9916x xVar = (C9916x) obj;
            if (this.f24039b != xVar.f24039b || this.f24041d != xVar.f24041d) {
                return false;
            }
            String str = this.f24038a;
            if (str == null ? xVar.f24038a != null : !str.equals(xVar.f24038a)) {
                return false;
            }
            ImageModel imageModel = this.f24040c;
            ImageModel imageModel2 = xVar.f24040c;
            if (imageModel != null) {
                return imageModel.equals(imageModel2);
            }
            if (imageModel2 == null) {
                return true;
            }
        }
        return false;
    }
}
