package com.bytedance.crash.runtime.p933a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C13864b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.util.C14044b;
import com.bytedance.crash.util.C14077x;

/* renamed from: com.bytedance.crash.runtime.a.c */
public final class C13985c extends AbstractC13983b {
    static {
        Covode.recordClassIndex(16050);
    }

    @Override // com.bytedance.crash.runtime.p933a.AbstractC13983b
    /* renamed from: a */
    public final C13864b mo22505a(C13864b bVar) {
        C13864b a = super.mo22505a(bVar);
        Header a2 = Header.m25037a(this.f34101b);
        Header.addRuntimeHeader(a2.f33753a);
        Header.m25039a(a2);
        a2.mo22332c();
        a2.mo22333d();
        a2.mo22334e();
        a.mo22338a(a2);
        a.mo22346a("process_name", (Object) C14044b.m25520c(this.f34101b));
        C14077x.m25670a(a, a2, this.f34100a);
        return a;
    }

    C13985c(CrashType crashType, Context context, C13978a aVar, C13986d dVar) {
        super(crashType, context, aVar, dVar);
    }
}
