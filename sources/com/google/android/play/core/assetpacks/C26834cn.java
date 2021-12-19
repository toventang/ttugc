package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.cn */
public final /* synthetic */ class C26834cn implements FilenameFilter {

    /* renamed from: a */
    static final FilenameFilter f63665a = new C26834cn();

    static {
        Covode.recordClassIndex(32309);
    }

    private C26834cn() {
    }

    public final boolean accept(File file, String str) {
        return C26835co.f63666a.matcher(str).matches();
    }
}
