package com.p2082ss.android.ugc.playerkit.model;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.playerkit.model.g */
public class C84203g {

    /* renamed from: a */
    public int f188012a;

    /* renamed from: b */
    public int f188013b;

    /* renamed from: c */
    public List<Float> f188014c;

    /* renamed from: d */
    public List<Bitmap> f188015d;

    /* renamed from: e */
    public boolean f188016e;

    /* renamed from: f */
    public int f188017f;

    static {
        Covode.recordClassIndex(98110);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f188012a), Integer.valueOf(this.f188013b), this.f188014c, this.f188015d, Boolean.valueOf(this.f188016e), Integer.valueOf(this.f188017f));
    }

    public String toString() {
        return "EffectInfo{action=" + this.f188012a + ", effectType=" + this.f188013b + ", effectValue=" + this.f188014c + ", lutBitmap=" + this.f188015d + ", isUseEffect=" + this.f188016e + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C84203g gVar = (C84203g) obj;
            if (this.f188012a == gVar.f188012a && this.f188013b == gVar.f188013b && this.f188016e == gVar.f188016e && this.f188017f == gVar.f188017f && Objects.equals(this.f188014c, gVar.f188014c) && Objects.equals(this.f188015d, gVar.f188015d)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
