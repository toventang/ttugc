package com.bytedance.crash.runtime.p933a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.C14077x;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.crash.runtime.a.g */
public final class C13993g extends AbstractC13983b {
    static {
        Covode.recordClassIndex(16058);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.crash.runtime.p933a.AbstractC13983b
    /* renamed from: a */
    public final boolean mo22507a() {
        return false;
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
        }
        return a;
    }

    C13993g(Context context, C13978a aVar, C13986d dVar) {
        super(CrashType.NATIVE, context, aVar, dVar);
    }
}
