package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1966e.C27001ag;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.b.x */
public final class C26964x implements AbstractC26957q {
    static {
        Covode.recordClassIndex(32439);
    }

    /* renamed from: a */
    static AbstractC26963w m53570a() {
        return new C26959s();
    }

    /* renamed from: a */
    static Object m53571a(ClassLoader classLoader) {
        return C26896an.m53408a(classLoader, "pathList", Object.class).mo44569a();
    }

    /* renamed from: a */
    static boolean m53572a(ClassLoader classLoader, File file, File file2, boolean z, AbstractC26963w wVar, String str, AbstractC26961u uVar) {
        ArrayList<IOException> arrayList = new ArrayList<>();
        Object a = m53571a(classLoader);
        C26895am b = C26896an.m53423b(a, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) b.mo44569a());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : asList) {
            arrayList2.add(C26896an.m53408a(obj, str, File.class).mo44569a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || uVar.mo44568a(a, file2, file)) {
            b.mo44571a((Collection) Arrays.asList(wVar.mo44658a(a, new ArrayList<>(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            C26894al alVar = new C26894al("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C26915bf.m53466a(alVar, arrayList.get(i));
            }
            C26896an.m53423b(a, "dexElementsSuppressedExceptions", IOException.class).mo44571a((Collection) arrayList);
            throw alVar;
        }
        String valueOf = String.valueOf(file2.getPath());
        if (valueOf.length() != 0) {
            "Should be optimized ".concat(valueOf);
        } else {
            new String("Should be optimized ");
        }
        return false;
    }

    /* renamed from: b */
    static AbstractC26961u m53573b() {
        return new C26960t();
    }

    /* renamed from: b */
    static void m53574b(ClassLoader classLoader, Set<File> set) {
        MethodCollector.m26663i(11164);
        if (set.isEmpty()) {
            MethodCollector.m26664o(11164);
            return;
        }
        HashSet hashSet = new HashSet();
        for (File file : set) {
            String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
            if (valueOf.length() != 0) {
                "Adding native library parent directory: ".concat(valueOf);
            } else {
                new String("Adding native library parent directory: ");
            }
            hashSet.add(file.getParentFile());
        }
        C26895am b = C26896an.m53423b(m53571a(classLoader), "nativeLibraryDirectories", File.class);
        hashSet.removeAll(Arrays.asList((Object[]) b.mo44569a()));
        synchronized (C27001ag.class) {
            try {
                hashSet.size();
                b.mo44572b(hashSet);
            } finally {
                MethodCollector.m26664o(11164);
            }
        }
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26957q
    /* renamed from: a */
    public final void mo44566a(ClassLoader classLoader, Set<File> set) {
        m53574b(classLoader, set);
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26957q
    /* renamed from: a */
    public final boolean mo44567a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m53572a(classLoader, file, file2, z, m53570a(), "zip", m53573b());
    }
}
