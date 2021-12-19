package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Objects;

/* renamed from: com.bytedance.android.livesdk.model.g */
public class C9587g {
    @AbstractC27891c(mo46611a = "custom_verify")

    /* renamed from: a */
    public String f23238a;
    @AbstractC27891c(mo46611a = "enterprise_verify_reason")

    /* renamed from: b */
    public String f23239b;
    @AbstractC27891c(mo46611a = "authentication_badge")

    /* renamed from: c */
    public ImageModel f23240c;

    static {
        Covode.recordClassIndex(11126);
    }

    public int hashCode() {
        return Objects.hash(this.f23238a, this.f23239b, this.f23240c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9587g)) {
            return false;
        }
        C9587g gVar = (C9587g) obj;
        if (!Objects.equals(this.f23238a, gVar.f23238a) || !Objects.equals(this.f23239b, gVar.f23239b) || !Objects.equals(this.f23240c, gVar.f23240c)) {
            return false;
        }
        return true;
    }
}
