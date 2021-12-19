package com.bytedance.p1399im.core.p1408d.p1410b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.im.core.d.b.a */
public final class C19603a {

    /* renamed from: a */
    public String f46571a;

    /* renamed from: b */
    public int f46572b;

    /* renamed from: c */
    public String f46573c;

    /* renamed from: d */
    public String f46574d;

    /* renamed from: e */
    public String f46575e;

    /* renamed from: f */
    public String f46576f;

    /* renamed from: g */
    public String f46577g;

    /* renamed from: h */
    public String f46578h;

    static {
        Covode.recordClassIndex(22447);
    }

    /* renamed from: a */
    public final String mo31384a() {
        if (TextUtils.isEmpty(this.f46571a)) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f46573c)) {
                sb.append(this.f46573c).append("|");
            }
            if (!TextUtils.isEmpty(this.f46574d)) {
                sb.append(this.f46574d).append("|");
            }
            if (!TextUtils.isEmpty(this.f46575e)) {
                sb.append(this.f46575e).append("|");
            }
            if (!TextUtils.isEmpty(this.f46576f)) {
                sb.append(this.f46576f).append("|");
            }
            sb.append(this.f46572b);
            this.f46571a = sb.toString();
        }
        return this.f46571a;
    }

    public final String toString() {
        return "FTSEntity {combinedKey is " + this.f46571a + " , type is " + this.f46572b + " , conversationId is " + this.f46573c + " , messageUuid is " + this.f46574d + " , userId is " + this.f46575e + " , entityId is " + this.f46576f + " , searchContent is " + this.f46577g + " , extra is " + this.f46578h + "}";
    }
}
