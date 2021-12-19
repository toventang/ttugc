package com.bytedance.crash.p927e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.runtime.p933a.C13989e;
import com.bytedance.crash.util.C14042ab;
import com.bytedance.crash.util.C14056j;
import com.bytedance.crash.util.C14069r;
import com.bytedance.crash.util.NativeTools;
import java.io.File;

/* renamed from: com.bytedance.crash.e.d */
public final class C13859d implements AbstractC13858c {

    /* renamed from: a */
    private final Context f33737a;

    /* renamed from: b */
    private final boolean f33738b;

    static {
        Covode.recordClassIndex(15916);
    }

    public C13859d(Context context, boolean z) {
        this.f33737a = context;
        this.f33738b = z;
    }

    @Override // com.bytedance.crash.p927e.AbstractC13858c
    /* renamed from: a */
    public final void mo22309a(long j, Thread thread, Throwable th, String str, String str2, boolean z) {
        File file = new File(C14069r.m25619a(this.f33737a), str);
        file.mkdirs();
        int d = C14056j.m25581d(file);
        C13989e.m25320a().mo22511a(CrashType.JAVA, null, new C13860e(C14042ab.m25503c(th), th, j, str2, z, thread, str, file, this.f33738b), true);
        if (d > 0) {
            NativeTools.m25458a().mo22564b(d);
        }
    }
}
