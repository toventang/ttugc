package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bm */
public final class C50130bm {

    /* renamed from: a */
    public static final C50130bm f115719a = new C50130bm();

    /* renamed from: b */
    private static HashMap<String, Boolean> f115720b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, Boolean> f115721c = new HashMap<>();

    private C50130bm() {
    }

    static {
        Covode.recordClassIndex(59256);
    }

    /* renamed from: a */
    public static void m94077a(String str) {
        if (str != null) {
            f115720b.put(str, true);
        }
    }

    /* renamed from: b */
    public static boolean m94079b(String str) {
        Boolean bool;
        if (str == null || (bool = f115720b.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: c */
    public static boolean m94080c(String str) {
        Boolean bool;
        if (str == null || (bool = f115721c.get(str)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: a */
    public static void m94078a(String str, boolean z) {
        if (str != null) {
            f115721c.put(str, Boolean.valueOf(z));
        }
    }
}
