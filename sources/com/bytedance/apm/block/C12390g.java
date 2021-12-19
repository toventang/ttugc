package com.bytedance.apm.block;

import com.bytedance.apm.p789q.C12585h;
import com.bytedance.covode.number.Covode;
import java.util.ConcurrentModificationException;
import java.util.HashSet;

/* renamed from: com.bytedance.apm.block.g */
public final class C12390g {

    /* renamed from: a */
    private static HashSet<String> f29898a = new HashSet<>();

    /* renamed from: b */
    private static String f29899b = "";

    /* renamed from: c */
    private static boolean f29900c = true;

    static {
        Covode.recordClassIndex(14197);
    }

    /* renamed from: a */
    public static String m22258a() {
        if (f29900c) {
            try {
                f29899b = C12585h.m22679a(f29898a, ",");
                f29900c = false;
            } catch (ConcurrentModificationException unused) {
            }
        }
        return f29899b;
    }

    /* renamed from: a */
    public static void m22259a(String str) {
        f29900c = true;
        f29898a.add(str);
    }

    /* renamed from: b */
    public static void m22260b(String str) {
        f29900c = true;
        f29898a.remove(str);
    }
}
