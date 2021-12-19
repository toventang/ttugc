package com.facebook.common.p1834f;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24086f;
import java.util.Map;

/* renamed from: com.facebook.common.f.a */
public final class C24102a {

    /* renamed from: a */
    public static final Map<String, String> f57029a = C24086f.m45604of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    static {
        Covode.recordClassIndex(28230);
    }

    /* renamed from: a */
    public static boolean m45683a(String str) {
        if (str == null || !str.startsWith("video/")) {
            return false;
        }
        return true;
    }
}
