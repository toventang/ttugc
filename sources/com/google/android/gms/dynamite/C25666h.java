package com.google.android.gms.dynamite;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import dalvik.system.PathClassLoader;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.dynamite.h */
public final class C25666h extends PathClassLoader {
    static {
        Covode.recordClassIndex(31080);
    }

    C25666h(String str, ClassLoader classLoader) {
        super(str, classLoader);
        MethodCollector.m26663i(7420);
        MethodCollector.m26664o(7420);
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z);
    }
}
