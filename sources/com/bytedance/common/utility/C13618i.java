package com.bytedance.common.utility;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.common.utility.i */
public final class C13618i {

    /* renamed from: a */
    public static int f33090a = 5;

    /* renamed from: b */
    public static AbstractC13619a f33091b;

    /* renamed from: c */
    private static C13620b f33092c;

    /* renamed from: d */
    private static boolean f33093d;

    /* renamed from: e */
    private static Printer f33094e;

    /* renamed from: com.bytedance.common.utility.i$a */
    public interface AbstractC13619a {
        static {
            Covode.recordClassIndex(15646);
        }
    }

    static {
        Covode.recordClassIndex(15645);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.common.utility.i$b */
    public static class C13620b implements Printer {

        /* renamed from: a */
        List<Printer> f33095a = new ArrayList();

        /* renamed from: b */
        List<Printer> f33096b = new ArrayList();

        /* renamed from: c */
        List<Printer> f33097c = new ArrayList();

        /* renamed from: d */
        boolean f33098d = false;

        /* renamed from: e */
        boolean f33099e = false;

        static {
            Covode.recordClassIndex(15647);
        }

        C13620b() {
        }

        public final void println(String str) {
            long j;
            if (!TextUtils.isEmpty(str)) {
                if (C13618i.f33091b != null) {
                    j = System.currentTimeMillis();
                } else {
                    j = 0;
                }
                if (str.charAt(0) == '>' && this.f33099e) {
                    for (Printer printer : this.f33097c) {
                        if (!this.f33095a.contains(printer)) {
                            this.f33095a.add(printer);
                        }
                    }
                    this.f33097c.clear();
                    this.f33099e = false;
                }
                this.f33095a.size();
                for (Printer printer2 : this.f33095a) {
                    if (printer2 != null) {
                        printer2.println(str);
                    }
                }
                if (str.charAt(0) == '<' && this.f33098d) {
                    for (Printer printer3 : this.f33096b) {
                        this.f33095a.remove(printer3);
                        this.f33097c.remove(printer3);
                    }
                    this.f33096b.clear();
                    this.f33098d = false;
                }
                if (C13618i.f33091b != null && j > 0) {
                    System.currentTimeMillis();
                }
            }
        }
    }

    /* renamed from: b */
    private static Printer m24469b() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m24467a() {
        if (!f33093d) {
            f33093d = true;
            f33092c = new C13620b();
            Printer b = m24469b();
            f33094e = b;
            if (b != null) {
                f33092c.f33095a.add(f33094e);
            }
            Looper.getMainLooper().setMessageLogging(f33092c);
        }
    }

    /* renamed from: a */
    public static void m24468a(Printer printer) {
        if (printer != null && !f33092c.f33097c.contains(printer)) {
            f33092c.f33097c.add(printer);
            f33092c.f33099e = true;
        }
    }
}
