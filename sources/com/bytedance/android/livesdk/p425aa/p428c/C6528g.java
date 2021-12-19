package com.bytedance.android.livesdk.p425aa.p428c;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.aa.c.g */
public class C6528g {

    /* renamed from: a */
    public long f16298a;

    /* renamed from: b */
    public long f16299b;

    /* renamed from: c */
    public String f16300c;

    /* renamed from: d */
    public String f16301d;

    /* renamed from: e */
    public String f16302e;

    /* renamed from: f */
    public String f16303f;

    /* renamed from: g */
    public long f16304g;

    /* renamed from: h */
    public String f16305h;

    /* renamed from: i */
    public String f16306i;

    /* renamed from: j */
    public int f16307j;

    /* renamed from: k */
    public String f16308k;

    static {
        Covode.recordClassIndex(7264);
    }

    /* renamed from: a */
    public final C6528g mo12675a(int i) {
        String str;
        String[] strArr = {"mutual_follow", "recommend", "recent", "other_follow"};
        int i2 = i - 1;
        if (i2 >= 4 || i2 < 0) {
            str = "";
        } else {
            str = strArr[i2];
        }
        this.f16302e = str;
        return this;
    }
}
