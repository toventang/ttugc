package com.google.android.play.core.p1965d;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.play.core.p1963b.C26896an;
import java.io.File;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.d.b */
public final class C26976b {

    /* renamed from: a */
    private final C26978d f63864a;

    static {
        Covode.recordClassIndex(32452);
    }

    C26976b(C26978d dVar) {
        this.f63864a = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo44675a(Context context, Set<File> set) {
        MethodCollector.m26663i(12458);
        AssetManager assets = context.getAssets();
        for (File file : set) {
            ((Integer) C26896an.m53411a(assets, "addAssetPath", Integer.class, String.class, file.getPath())).intValue();
        }
        MethodCollector.m26664o(12458);
    }
}
