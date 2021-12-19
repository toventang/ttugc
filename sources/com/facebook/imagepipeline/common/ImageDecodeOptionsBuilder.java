package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.p1871a.p1873b.C24328b;
import com.facebook.imagepipeline.p1882g.AbstractC24442c;
import com.facebook.imagepipeline.p1893r.AbstractC24655a;

public class ImageDecodeOptionsBuilder {

    /* renamed from: a */
    public int f57752a = 100;

    /* renamed from: b */
    public boolean f57753b;

    /* renamed from: c */
    public int f57754c = C24328b.f57690b;

    /* renamed from: d */
    public boolean f57755d;

    /* renamed from: e */
    public boolean f57756e;

    /* renamed from: f */
    public boolean f57757f;

    /* renamed from: g */
    public boolean f57758g;

    /* renamed from: h */
    public Bitmap.Config f57759h = Bitmap.Config.ARGB_8888;

    /* renamed from: i */
    public AbstractC24442c f57760i;

    /* renamed from: j */
    public AbstractC24655a f57761j;

    /* renamed from: k */
    public Object f57762k;

    static {
        Covode.recordClassIndex(28502);
    }

    /* renamed from: a */
    public final C24361b mo40154a() {
        return new C24361b(this);
    }

    /* renamed from: a */
    public ImageDecodeOptionsBuilder mo40153a(int i) {
        this.f57754c = i;
        return this;
    }

    public ImageDecodeOptionsBuilder setBitmapConfig(Bitmap.Config config) {
        this.f57759h = config;
        return this;
    }
}
