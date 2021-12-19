package com.bytedance.crash.runtime.p933a;

import com.bytedance.covode.number.Covode;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.C14077x;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.runtime.a.f */
public final class C13992f extends AbstractC13983b {
    static {
        Covode.recordClassIndex(16057);
    }

    @Override // com.bytedance.crash.runtime.p933a.AbstractC13983b
    /* renamed from: a */
    public final C13864b mo22504a(int i, C13864b bVar) {
        C13864b a = super.mo22504a(i, bVar);
        if (i == 0) {
            Header a2 = Header.m25037a(this.f34101b);
            a2.mo22332c();
            a.mo22338a(a2);
            C14077x.m25670a(a, a2, this.f34100a);
        } else if (i == 1) {
            Header a3 = a.mo22335a();
            a3.mo22333d();
            a3.mo22334e();
        } else if (i == 2) {
            Header.addRuntimeHeader(a.mo22335a().f33753a);
        } else if (i == 5) {
            Header.m25039a(a.mo22335a());
        }
        return a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C13992f(android.content.Context r2, com.bytedance.crash.runtime.p933a.C13978a r3, com.bytedance.crash.runtime.p933a.C13986d r4, boolean r5) {
        /*
            r1 = this;
            if (r5 == 0) goto L_0x0008
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.LAUNCH
        L_0x0004:
            r1.<init>(r0, r2, r3, r4)
            return
        L_0x0008:
            com.bytedance.crash.CrashType r0 = com.bytedance.crash.CrashType.JAVA
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.p933a.C13992f.<init>(android.content.Context, com.bytedance.crash.runtime.a.a, com.bytedance.crash.runtime.a.d, boolean):void");
    }
}
