package com.bytedance.lottie.p1503d;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.C21044e;

/* renamed from: com.bytedance.lottie.d.a */
public enum EnumC21038a {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    public final String toString() {
        return this.extension;
    }

    public final String tempExtension() {
        return ".temp" + this.extension;
    }

    static {
        Covode.recordClassIndex(24654);
    }

    public static EnumC21038a forFile(String str) {
        EnumC21038a[] values = values();
        for (EnumC21038a aVar : values) {
            if (str.endsWith(aVar.extension)) {
                return aVar;
            }
        }
        C21044e.m39620a("Unable to find correct extension for ".concat(String.valueOf(str)));
        return Json;
    }

    private EnumC21038a(String str) {
        this.extension = str;
    }
}
