package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1893r.AbstractC24655a;

/* renamed from: com.facebook.imagepipeline.common.b */
public class C24361b {

    /* renamed from: a */
    public static final C24361b f57766a = new ImageDecodeOptionsBuilder().mo40154a();

    /* renamed from: b */
    public final int f57767b;

    /* renamed from: c */
    public final boolean f57768c;

    /* renamed from: d */
    public final int f57769d;

    /* renamed from: e */
    public final boolean f57770e;

    /* renamed from: f */
    public final boolean f57771f;

    /* renamed from: g */
    public final boolean f57772g;

    /* renamed from: h */
    public final boolean f57773h;

    /* renamed from: i */
    public Bitmap.Config f57774i;

    /* renamed from: j */
    public final AbstractC24442c f57775j;

    /* renamed from: k */
    public final AbstractC24655a f57776k;

    /* renamed from: l */
    public final Object f57777l;

    static {
        Covode.recordClassIndex(28504);
    }

    public int hashCode() {
        int i;
        int ordinal = ((((((((((((this.f57767b * 31) + (this.f57768c ? 1 : 0)) * 31) + (this.f57770e ? 1 : 0)) * 31) + (this.f57771f ? 1 : 0)) * 31) + (this.f57772g ? 1 : 0)) * 31) + (this.f57773h ? 1 : 0)) * 31) + this.f57774i.ordinal()) * 31;
        AbstractC24442c cVar = this.f57775j;
        int i2 = 0;
        if (cVar != null) {
            i = cVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = (ordinal + i) * 31;
        AbstractC24655a aVar = this.f57776k;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return C1764a.m5929a(null, "%d-%b-%b-%b-%b-%b-%s-%s-%s", new Object[]{Integer.valueOf(this.f57767b), Boolean.valueOf(this.f57768c), Boolean.valueOf(this.f57770e), Boolean.valueOf(this.f57771f), Boolean.valueOf(this.f57772g), Boolean.valueOf(this.f57773h), this.f57774i.name(), this.f57775j, this.f57776k});
    }

    public C24361b(ImageDecodeOptionsBuilder imageDecodeOptionsBuilder) {
        this.f57767b = imageDecodeOptionsBuilder.f57752a;
        this.f57768c = imageDecodeOptionsBuilder.f57753b;
        this.f57769d = imageDecodeOptionsBuilder.f57754c;
        this.f57770e = imageDecodeOptionsBuilder.f57755d;
        this.f57771f = imageDecodeOptionsBuilder.f57756e;
        this.f57772g = imageDecodeOptionsBuilder.f57757f;
        this.f57774i = imageDecodeOptionsBuilder.f57759h;
        this.f57775j = imageDecodeOptionsBuilder.f57760i;
        this.f57773h = imageDecodeOptionsBuilder.f57758g;
        this.f57776k = imageDecodeOptionsBuilder.f57761j;
        this.f57777l = imageDecodeOptionsBuilder.f57762k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C24361b bVar = (C24361b) obj;
        if (this.f57768c == bVar.f57768c && this.f57770e == bVar.f57770e && this.f57771f == bVar.f57771f && this.f57772g == bVar.f57772g && this.f57773h == bVar.f57773h && this.f57774i == bVar.f57774i && this.f57775j == bVar.f57775j && this.f57776k == bVar.f57776k) {
            return true;
        }
        return false;
    }
}
