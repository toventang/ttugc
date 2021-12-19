package com.p2082ss.android.medialib.photomovie;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.medialib.photomovie.a */
public class C30021a {

    /* renamed from: a */
    public int f71658a;

    /* renamed from: b */
    public int f71659b;

    /* renamed from: c */
    public int f71660c;

    static {
        Covode.recordClassIndex(36504);
    }

    public C30021a() {
        this.f71658a = 1;
        this.f71659b = 2500;
        this.f71660c = 500;
        this.f71658a = 1;
        this.f71659b = 2500;
        this.f71660c = 500;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":").append(this.f71658a);
        sb.append(",\"photoTime\":").append(this.f71659b);
        sb.append(",\"transitionTime\":").append(this.f71660c);
        sb.append('}');
        return sb.toString();
    }
}
