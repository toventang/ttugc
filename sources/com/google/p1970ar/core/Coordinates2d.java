package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Coordinates2d */
public enum Coordinates2d {
    TEXTURE_TEXELS(0),
    TEXTURE_NORMALIZED(1),
    IMAGE_PIXELS(2),
    IMAGE_NORMALIZED(3),
    OPENGL_NORMALIZED_DEVICE_COORDINATES(6),
    VIEW(7),
    VIEW_NORMALIZED(8);
    
    final int nativeCode;

    static {
        Covode.recordClassIndex(32591);
    }

    static Coordinates2d forNumber(int i) {
        Coordinates2d[] values = values();
        for (Coordinates2d coordinates2d : values) {
            if (coordinates2d.nativeCode == i) {
                return coordinates2d;
            }
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Unexpected value for native Coordinates2d, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }

    private Coordinates2d(int i) {
        this.nativeCode = i;
    }
}
