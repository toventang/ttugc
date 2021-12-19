package com.linecorp.linesdk.p2028a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.linecorp.p2025a.p2026a.p2027a.C28135b;

/* renamed from: com.linecorp.linesdk.a.a */
public final class C28142a {

    /* renamed from: a */
    public final Context f65860a;

    /* renamed from: b */
    public final String f65861b;

    /* renamed from: c */
    private final C28135b f65862c;

    static {
        Covode.recordClassIndex(34083);
    }

    /* renamed from: a */
    public final String mo48129a(long j) {
        return this.f65862c.mo48094a(this.f65860a, String.valueOf(j));
    }

    /* renamed from: a */
    public final String mo48130a(String str) {
        return this.f65862c.mo48094a(this.f65860a, str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28142a(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x000e
        L_0x0008:
            com.linecorp.a.a.a.b r0 = com.linecorp.linesdk.p2028a.C28158c.f65888a
            r2.<init>(r1, r4, r0)
            return
        L_0x000e:
            if (r1 == 0) goto L_0x0011
            goto L_0x0008
        L_0x0011:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: com.linecorp.linesdk.p2028a.C28142a.<init>(android.content.Context, java.lang.String):void");
    }

    private C28142a(Context context, String str, C28135b bVar) {
        this.f65860a = context;
        this.f65861b = "com.linecorp.linesdk.accesstoken.".concat(String.valueOf(str));
        this.f65862c = bVar;
    }
}
