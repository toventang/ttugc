package com.bytedance.geckox.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.p1022i.C14957a;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.bytedance.geckox.utils.c */
public final class C15050c {
    static {
        Covode.recordClassIndex(17218);
    }

    /* renamed from: a */
    public static boolean m27709a(Closeable closeable) {
        if (closeable == null) {
            return true;
        }
        try {
            closeable.close();
            return true;
        } catch (IOException unused) {
            C14957a.m27545c();
            return false;
        }
    }
}
