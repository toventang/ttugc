package com.bytedance.p802b.p813c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p841k.C13130f;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.b.c.a */
public class C12978a {

    /* renamed from: b */
    private static volatile C12978a f31606b;

    /* renamed from: a */
    public CopyOnWriteArraySet<String> f31607a = new CopyOnWriteArraySet<>();

    /* renamed from: com.bytedance.b.c.a$a */
    public interface AbstractC12979a {
        static {
            Covode.recordClassIndex(14815);
        }
    }

    /* renamed from: com.bytedance.b.c.a$b */
    public interface AbstractC12980b {
        static {
            Covode.recordClassIndex(14816);
        }

        /* renamed from: a */
        boolean mo20833a();
    }

    static {
        Covode.recordClassIndex(14814);
    }

    private C12978a() {
    }

    /* renamed from: a */
    public static C12978a m23302a() {
        if (f31606b == null) {
            synchronized (C12978a.class) {
                if (f31606b == null) {
                    f31606b = new C12978a();
                }
            }
        }
        return f31606b;
    }

    /* renamed from: b */
    public final String mo20832b() {
        String a = C13130f.m23607a(this.f31607a.toArray(), "#");
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return "";
    }
}
