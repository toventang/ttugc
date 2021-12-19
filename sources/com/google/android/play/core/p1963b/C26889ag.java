package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.google.android.play.core.b.ag */
final class C26889ag implements AbstractC26961u {
    static {
        Covode.recordClassIndex(32364);
    }

    C26889ag() {
    }

    @Override // com.google.android.play.core.p1963b.AbstractC26961u
    /* renamed from: a */
    public final boolean mo44568a(Object obj, File file, File file2) {
        try {
            return !((Boolean) C26896an.m53409a(Class.forName("dalvik.system.DexFile"), Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
