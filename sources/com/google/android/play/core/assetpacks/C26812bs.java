package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.bs */
public final /* synthetic */ class C26812bs implements FilenameFilter {

    /* renamed from: a */
    private final String f63586a;

    static {
        Covode.recordClassIndex(32287);
    }

    C26812bs(String str) {
        this.f63586a = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(String.valueOf(this.f63586a).concat("-")) && str.endsWith(".apk");
    }
}
