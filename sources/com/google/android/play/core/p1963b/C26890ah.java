package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Set;

/* renamed from: com.google.android.play.core.b.ah */
public final class C26890ah implements AbstractC26957q {
    static {
        Covode.recordClassIndex(32365);
    }

    /* renamed from: b */
    static void m53394b(ClassLoader classLoader, Set<File> set) {
        C26885ac.m53383a(classLoader, set, new C26888af());
    }

    /* renamed from: b */
    static boolean m53395b(ClassLoader classLoader, File file, File file2, boolean z) {
        return C26964x.m53572a(classLoader, file, file2, z, C26885ac.m53382a(), "path", new C26889ag());
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26957q
    /* renamed from: a */
    public final void mo44566a(ClassLoader classLoader, Set<File> set) {
        m53394b(classLoader, set);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26957q
    /* renamed from: a */
    public final boolean mo44567a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m53395b(classLoader, file, file2, z);
    }
}
