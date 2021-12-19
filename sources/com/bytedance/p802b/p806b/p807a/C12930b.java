package com.bytedance.p802b.p806b.p807a;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p821e.p822a.C13037a;
import com.bytedance.p802b.p841k.C13113a;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.io.File;

/* renamed from: com.bytedance.b.b.a.b */
public final class C12930b {

    /* renamed from: a */
    private static File f31467a;

    /* renamed from: b */
    private static File f31468b;

    /* renamed from: c */
    private static File f31469c;

    /* renamed from: d */
    private static File f31470d;

    static {
        Covode.recordClassIndex(14766);
    }

    /* renamed from: a */
    public static synchronized File m23206a() {
        File file;
        synchronized (C12930b.class) {
            if (f31470d == null) {
                File file2 = new File(C13113a.f31955g.getFilesDir(), "apm6");
                f31470d = file2;
                if (!file2.exists()) {
                    f31470d.mkdirs();
                }
            }
            file = f31470d;
        }
        return file;
    }

    /* renamed from: c */
    public static synchronized File m23208c() {
        File file;
        synchronized (C12930b.class) {
            if (f31468b == null) {
                File file2 = new File(m23206a(), "flush");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                f31468b = file2;
            }
            file = f31468b;
        }
        return file;
    }

    /* renamed from: d */
    private static synchronized File m23209d() {
        File file;
        File file2;
        synchronized (C12930b.class) {
            if (f31469c == null) {
                if (C13037a.m23435c()) {
                    file2 = new File(m23206a(), "persistent");
                } else {
                    file2 = new File(m23206a(), "child_process_persistent");
                }
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                f31469c = file2;
            }
            file = f31469c;
        }
        return file;
    }

    /* renamed from: b */
    public static synchronized File m23207b() {
        File file;
        synchronized (C12930b.class) {
            if (f31467a == null) {
                try {
                    String str = C13037a.m23436d().replace(".", "_").replace(":", "-") + ".bin";
                    if (!C13037a.m23435c()) {
                        str = C13037a.m23434b() + "_" + str;
                    }
                    File file2 = new File(m23209d(), str);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    f31467a = file2;
                } catch (Exception e) {
                    C13118b.m23587a(C12927a.f31456a, "prepare PersistentFile fail.", e);
                }
            }
            file = f31467a;
        }
        return file;
    }
}
