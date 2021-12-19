package com.bytedance.p122a;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.a.c */
final class C2542c {

    /* renamed from: a */
    String f7683a;

    /* renamed from: b */
    String f7684b;

    /* renamed from: c */
    int f7685c;

    /* renamed from: d */
    int f7686d = -1;

    /* renamed from: e */
    long f7687e;

    /* renamed from: f */
    int f7688f = -1;

    /* renamed from: g */
    long f7689g;

    /* renamed from: h */
    int f7690h = -1;

    /* renamed from: i */
    int f7691i = -1;

    /* renamed from: j */
    JSONObject f7692j;

    static {
        Covode.recordClassIndex(2921);
    }

    C2542c() {
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        StringBuilder append = new StringBuilder("Record{scene='").append(this.f7683a).append('\'').append(", subScene='").append(this.f7684b).append('\'').append(", isFirst=").append(this.f7685c);
        String str4 = "";
        if (this.f7686d >= 0) {
            str = ", type=" + this.f7686d;
        } else {
            str = str4;
        }
        StringBuilder append2 = append.append(str);
        if (this.f7688f >= 0) {
            str2 = ", status=" + this.f7688f;
        } else {
            str2 = str4;
        }
        StringBuilder append3 = append2.append(str2).append(", duration=").append(this.f7689g);
        if (this.f7690h >= 0) {
            str3 = ", reason=" + this.f7690h;
        } else {
            str3 = str4;
        }
        StringBuilder append4 = append3.append(str3);
        if (this.f7691i >= 0) {
            str4 = ", code=" + this.f7691i;
        }
        return append4.append(str4).append('}').toString();
    }
}
