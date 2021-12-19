package com.p2082ss.android.ugc.aweme.qrcode.p3654c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import com.p2082ss.android.ugc.aweme.qrcode.C66375c;
import com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66376a;
import com.p2082ss.android.ugc.aweme.qrcode.p3656e.C66398a;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.g */
public final class C66384g extends AbstractC66376a {
    static {
        Covode.recordClassIndex(77916);
    }

    public C66384g(AbstractC66376a.AbstractC66377a aVar) {
        super(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.p3654c.AbstractC66380d
    /* renamed from: a */
    public final boolean mo90116a(String str, int i) {
        String b = C36132v.m73608b(str, "schema_type");
        String b2 = C36132v.m73608b(str, "object_id");
        int i2 = 0;
        if (TextUtils.isEmpty(b) || TextUtils.isEmpty(b2)) {
            return false;
        }
        try {
            i2 = Integer.parseInt(b);
        } catch (NumberFormatException unused) {
        }
        this.f149283a = C66375c.m118065b(i2, b2);
        return this.f149284b.mo105308a(i2, b2, str, C66398a.m118091a(str));
    }
}
