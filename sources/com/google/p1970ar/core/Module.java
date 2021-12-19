package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.Module */
public enum Module {
    AUGMENTED_FACE_IMPROVED_LIP_EYE(0),
    NORMAL_NET(1),
    DEPTH_NET(2);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(32603);
    }

    static Module forNumber(int i) {
        Module[] values = values();
        for (Module module : values) {
            if (module.nativeCode == i) {
                return module;
            }
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Unexpected value for native Module, value=");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    private Module(int i) {
        this.nativeCode = i;
    }
}
