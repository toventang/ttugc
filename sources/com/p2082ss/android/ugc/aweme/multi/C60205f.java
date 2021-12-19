package com.p2082ss.android.ugc.aweme.multi;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.f */
public final class C60205f implements AbstractC60203e {

    /* renamed from: b */
    private final String f137240b;

    static {
        Covode.recordClassIndex(70734);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
    /* renamed from: a */
    public final String mo97899a() {
        return m109752a(this.f137240b, "anchor_id");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
    /* renamed from: b */
    public final String mo97901b() {
        return m109752a(this.f137240b, "anchor_type");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
    /* renamed from: c */
    public final String mo97902c() {
        return m109752a(this.f137240b, "anchor_name");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
    /* renamed from: d */
    public final String mo97903d() {
        return m109752a(this.f137240b, "anchor_id");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
    /* renamed from: e */
    public final String mo97904e() {
        return m109752a(this.f137240b, "anchor_type");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
    /* renamed from: f */
    public final String mo97905f() {
        return m109752a(this.f137240b, "anchor_name");
    }

    public C60205f(String str) {
        this.f137240b = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
    /* renamed from: a */
    public final String mo97900a(String str) {
        C89219l.m154721d(str, "");
        return m109752a(this.f137240b, str);
    }

    /* renamed from: a */
    private static String m109752a(String str, String str2) {
        boolean z;
        C89219l.m154721d(str2, "");
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String optString = new JSONObject(str).optString(str2, "");
            C89219l.m154716b(optString, "");
            return optString;
        } catch (Exception unused) {
            return "";
        }
    }
}
