package com.bytedance.android.p149d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.d.a */
public final class C2716a {

    /* renamed from: a */
    public int f8111a;

    /* renamed from: b */
    public String f8112b;

    /* renamed from: c */
    public String f8113c;

    /* renamed from: d */
    public String f8114d;

    /* renamed from: e */
    public String f8115e;

    /* renamed from: f */
    public int f8116f;

    /* renamed from: g */
    public long f8117g;

    /* renamed from: h */
    public long f8118h = -1;

    /* renamed from: i */
    public long f8119i;

    /* renamed from: j */
    public long f8120j;

    static {
        Covode.recordClassIndex(3106);
    }

    private C2716a() {
    }

    /* renamed from: a */
    public static C2716a m7846a(long j) {
        C2716a aVar = new C2716a();
        aVar.f8117g = j;
        return aVar;
    }

    /* renamed from: a */
    public static String m7847a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "other";
        }
        return str;
    }
}
