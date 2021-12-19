package com.bytedance.helios.nativeaudio;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.helios.nativeaudio.a */
public final class C15335a {
    static {
        Covode.recordClassIndex(17584);
    }

    /* renamed from: a */
    public static String m28236a(String str) {
        String[] split = str.split("\n");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (!str2.contains("libart.so")) {
                sb.append(str2).append("\n");
            }
        }
        return sb.toString();
    }
}
