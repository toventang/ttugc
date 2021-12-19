package com.airbnb.lottie.p103f;

import com.airbnb.lottie.C2041d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.airbnb.lottie.f.a */
public enum EnumC2118a {
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
        Covode.recordClassIndex(2313);
    }

    public static EnumC2118a forFile(String str) {
        EnumC2118a[] values = values();
        for (EnumC2118a aVar : values) {
            if (str.endsWith(aVar.extension)) {
                return aVar;
            }
        }
        C2041d.m6461a("Unable to find correct extension for ".concat(String.valueOf(str)));
        return Json;
    }

    private EnumC2118a(String str) {
        this.extension = str;
    }
}
