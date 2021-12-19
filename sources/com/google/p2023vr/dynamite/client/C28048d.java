package com.google.p2023vr.dynamite.client;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.vr.dynamite.client.d */
public final class C28048d extends Exception {

    /* renamed from: a */
    private final int f65814a = 1;

    static {
        Covode.recordClassIndex(33708);
    }

    public final String getMessage() {
        String str;
        if (this.f65814a != 1) {
            str = "Unknown error";
        } else {
            str = "Package not available";
        }
        StringBuilder sb = new StringBuilder(str.length() + 17);
        sb.append("LoaderException{");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
