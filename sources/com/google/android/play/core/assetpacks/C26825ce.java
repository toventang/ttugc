package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.android.play.core.p1963b.AbstractC26916bg;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ce */
public final class C26825ce {

    /* renamed from: a */
    final C26769ac f63625a;

    /* renamed from: b */
    final AbstractC26916bg<AbstractC26857dj> f63626b;

    /* renamed from: c */
    final C26806bm f63627c;

    /* renamed from: d */
    final AbstractC26916bg<Executor> f63628d;

    /* renamed from: e */
    final C26791ay f63629e;

    static {
        Covode.recordClassIndex(32300);
    }

    C26825ce(C26769ac acVar, AbstractC26916bg<AbstractC26857dj> bgVar, C26806bm bmVar, AbstractC26916bg<Executor> bgVar2, C26791ay ayVar) {
        this.f63625a = acVar;
        this.f63626b = bgVar;
        this.f63627c = bmVar;
        this.f63628d = bgVar2;
        this.f63629e = ayVar;
    }

    /* renamed from: a */
    static boolean m53280a(File file) {
        MethodCollector.m26663i(13744);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13744);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13744);
        return delete;
    }
}
