package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.bytedance.android.livesdk.model.j */
public class C9591j {
    @AbstractC27891c(mo46611a = "icon")

    /* renamed from: a */
    public ImageModel f23265a;
    @AbstractC27891c(mo46611a = "level")

    /* renamed from: b */
    public long f23266b;
    @AbstractC27891c(mo46611a = "source")

    /* renamed from: c */
    public String f23267c;
    @AbstractC27891c(mo46611a = "profile_decoration_ribbon")

    /* renamed from: d */
    public ImageModel f23268d;

    static {
        Covode.recordClassIndex(11130);
    }

    public int hashCode() {
        int i;
        ImageModel imageModel = this.f23265a;
        if (imageModel != null) {
            i = imageModel.hashCode();
        } else {
            i = 0;
        }
        long j = this.f23266b;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C9591j jVar = (C9591j) obj;
            if (this.f23266b != jVar.f23266b) {
                return false;
            }
            ImageModel imageModel = this.f23265a;
            ImageModel imageModel2 = jVar.f23265a;
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
