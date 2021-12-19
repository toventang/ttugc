package com.bytedance.common.jato.fdio;

import android.content.Context;
import com.bytedance.common.jato.Jato;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.util.concurrent.ExecutorService;

public class FDIOPreloader implements AbstractC13574b {

    /* renamed from: a */
    private ExecutorService f33000a = Jato.getWorkExecutorService();

    /* renamed from: b */
    private Context f33001b = Jato.getContext();

    static {
        Covode.recordClassIndex(15578);
    }

    private static native void nativeStartPreload(String str, boolean z);

    @Override // com.bytedance.common.jato.fdio.AbstractC13574b
    /* renamed from: a */
    public final void mo21833a(boolean z) {
    }

    @Override // com.bytedance.common.jato.fdio.AbstractC13574b
    /* renamed from: a */
    public final void mo21832a(String str, boolean z) {
        MethodCollector.m26663i(10824);
        if (str.isEmpty() || this.f33001b == null || this.f33000a == null) {
            MethodCollector.m26664o(10824);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Context context = this.f33001b;
        if (C58016d.f132221b == null || !C58016d.f132224e) {
            C58016d.f132221b = context.getCacheDir();
        }
        File file = new File(sb.append(C58016d.f132221b.getAbsolutePath()).append(File.separator).append("jato_fdio").append(File.separator).append(str).toString());
        if (file.exists()) {
            nativeStartPreload(file.getAbsolutePath(), z);
        }
        MethodCollector.m26664o(10824);
    }
}
