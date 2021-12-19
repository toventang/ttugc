package com.p2082ss.android.vesdk;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.vesdk.v */
public final class C85579v {

    /* renamed from: a */
    public String f191750a;

    /* renamed from: b */
    public String f191751b;

    /* renamed from: c */
    public float f191752c;

    /* renamed from: d */
    public float f191753d;

    /* renamed from: e */
    public float f191754e;

    /* renamed from: f */
    public boolean f191755f;

    /* renamed from: g */
    public boolean f191756g;

    /* renamed from: h */
    public EnumC85580a f191757h = EnumC85580a.ATTACH;

    static {
        Covode.recordClassIndex(99763);
    }

    /* renamed from: com.ss.android.vesdk.v$a */
    public enum EnumC85580a {
        ATTACH,
        DETACH;

        static {
            Covode.recordClassIndex(99764);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        sb.append("\"mDuetVideoPath\":\"").append(this.f191750a).append('\"');
        sb.append(",\"mDuetAudioPath\":\"").append(this.f191751b).append('\"');
        sb.append(",\"mXInPercent\":").append(this.f191752c);
        sb.append(",\"mYInPercent\":").append(this.f191753d);
        sb.append(",\"mAlpha\":").append(this.f191754e);
        sb.append(",\"mIsFitMode\":").append(this.f191755f);
        sb.append(",\"enableV2\":").append(this.f191756g);
        sb.append('}');
        return sb.toString();
    }

    public C85579v(String str, String str2, boolean z) {
        this.f191750a = str;
        this.f191751b = str2;
        this.f191752c = 0.0f;
        this.f191753d = 0.16f;
        this.f191754e = 0.6f;
        this.f191755f = z;
    }
}
