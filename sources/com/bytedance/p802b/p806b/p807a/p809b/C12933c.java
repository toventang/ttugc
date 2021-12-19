package com.bytedance.p802b.p806b.p807a.p809b;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.C12930b;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.io.File;

/* renamed from: com.bytedance.b.b.a.b.c */
public final class C12933c {

    /* renamed from: a */
    public File f31503a;

    /* renamed from: b */
    private volatile boolean f31504b;

    static {
        Covode.recordClassIndex(14769);
    }

    /* renamed from: com.bytedance.b.b.a.b.c$a */
    public static class C12935a {

        /* renamed from: a */
        public static final C12933c f31506a = new C12933c();

        static {
            Covode.recordClassIndex(14771);
        }
    }

    /* renamed from: a */
    public final synchronized void mo20781a() {
        if (!this.f31504b) {
            try {
                File file = new File(C12930b.m23206a(), "header");
                this.f31503a = file;
                if (!file.exists()) {
                    this.f31503a.mkdirs();
                }
            } catch (Throwable th) {
                C13118b.m23586a("APM", "header store init error " + th.toString());
            }
            this.f31504b = true;
        }
    }

    /* renamed from: a */
    public static String m23212a(String str) {
        return str + ".bin";
    }
}
