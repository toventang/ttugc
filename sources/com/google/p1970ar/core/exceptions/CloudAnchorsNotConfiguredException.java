package com.google.p1970ar.core.exceptions;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.ar.core.exceptions.CloudAnchorsNotConfiguredException */
public class CloudAnchorsNotConfiguredException extends IllegalStateException {
    static {
        Covode.recordClassIndex(32651);
    }

    public CloudAnchorsNotConfiguredException() {
    }

    public CloudAnchorsNotConfiguredException(String str) {
        super(str);
    }
}
