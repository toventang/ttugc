package com.google.android.gms.common.p1936a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25549j;
import java.util.Locale;

/* renamed from: com.google.android.gms.common.a.a */
public final class C25334a {

    /* renamed from: a */
    public final String f60093a;

    /* renamed from: b */
    private final String f60094b;

    /* renamed from: c */
    private final C25549j f60095c;

    /* renamed from: d */
    private final int f60096d;

    static {
        Covode.recordClassIndex(30727);
    }

    public C25334a(String str) {
        this(str, "");
    }

    /* renamed from: a */
    public final void mo41461a(String str, Object... objArr) {
        if (this.f60096d <= 3) {
            mo41462b(str, objArr);
        }
    }

    /* renamed from: b */
    public final String mo41462b(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = C1764a.m5929a(Locale.US, str, objArr);
        }
        return this.f60094b.concat(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C25334a(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            r2.<init>()
            r2.f60094b = r4
            r2.f60093a = r3
            com.google.android.gms.common.internal.j r1 = new com.google.android.gms.common.internal.j
            r0 = 0
            r1.<init>(r3, r0)
            r2.f60095c = r1
            r1 = 2
        L_0x0010:
            java.lang.String r0 = r2.f60093a
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x001e
            int r1 = r1 + 1
            r0 = 7
            if (r0 < r1) goto L_0x001e
            goto L_0x0010
        L_0x001e:
            r2.f60096d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p1936a.C25334a.<init>(java.lang.String, java.lang.String):void");
    }
}
