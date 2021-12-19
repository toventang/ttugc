package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1966e.C27001ag;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.b.ac */
public final class C26885ac implements AbstractC26957q {
    static {
        Covode.recordClassIndex(32360);
    }

    /* renamed from: a */
    static AbstractC26963w m53382a() {
        return new C26966z();
    }

    /* renamed from: a */
    public static void m53383a(ClassLoader classLoader, Set<File> set, AbstractC26884ab abVar) {
        MethodCollector.m26663i(10870);
        if (set.isEmpty()) {
            MethodCollector.m26664o(10870);
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            hashSet.add(file.getParentFile());
        }
        Object a = C26964x.m53571a(classLoader);
        C26895am a2 = C26896an.m53408a(a, "nativeLibraryDirectories", List.class);
        synchronized (C27001ag.class) {
            try {
                ArrayList arrayList = new ArrayList((Collection) a2.mo44569a());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                a2.mo44570a((Object) arrayList);
            } finally {
                MethodCollector.m26664o(10870);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] a3 = abVar.mo44565a(a, new ArrayList(hashSet), arrayList2);
        if (!arrayList2.isEmpty()) {
            C26894al alVar = new C26894al("Error in makePathElements");
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                C26915bf.m53466a(alVar, arrayList2.get(i));
            }
            throw alVar;
        }
        synchronized (C27001ag.class) {
            try {
                C26896an.m53423b(a, "nativeLibraryPathElements", Object.class).mo44572b(Arrays.asList(a3));
            } finally {
                MethodCollector.m26664o(10870);
            }
        }
    }

    /* renamed from: b */
    static AbstractC26884ab m53384b() {
        return new C26883aa();
    }

    /* renamed from: b */
    public static boolean m53385b(ClassLoader classLoader, File file, File file2, boolean z) {
        return C26964x.m53572a(classLoader, file, file2, z, m53382a(), "zip", C26964x.m53573b());
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26957q
    /* renamed from: a */
    public final void mo44566a(ClassLoader classLoader, Set<File> set) {
        m53383a(classLoader, set, m53384b());
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26957q
    /* renamed from: a */
    public final boolean mo44567a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m53385b(classLoader, file, file2, z);
    }
}
