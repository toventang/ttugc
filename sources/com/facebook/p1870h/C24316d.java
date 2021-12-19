package com.facebook.p1870h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24082a;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1832d.C24098m;
import com.facebook.p1870h.C24314c;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.facebook.h.d */
public final class C24316d {

    /* renamed from: b */
    private static C24316d f57666b;

    /* renamed from: a */
    public List<C24314c.AbstractC24315a> f57667a;

    /* renamed from: c */
    private int f57668c;

    /* renamed from: d */
    private final C24314c.AbstractC24315a f57669d = new C24312a();

    static {
        Covode.recordClassIndex(28457);
    }

    private C24316d() {
        mo40110a();
    }

    /* renamed from: b */
    public static synchronized C24316d m46271b() {
        C24316d dVar;
        synchronized (C24316d.class) {
            MethodCollector.m26663i(3623);
            if (f57666b == null) {
                f57666b = new C24316d();
            }
            dVar = f57666b;
            MethodCollector.m26664o(3623);
        }
        return dVar;
    }

    /* renamed from: a */
    public final void mo40110a() {
        this.f57668c = this.f57669d.mo34188a();
        List<C24314c.AbstractC24315a> list = this.f57667a;
        if (list != null) {
            for (C24314c.AbstractC24315a aVar : list) {
                this.f57668c = Math.max(this.f57668c, aVar.mo34188a());
            }
        }
    }

    /* renamed from: a */
    public static C24314c m46270a(InputStream inputStream) {
        try {
            C24316d b = m46271b();
            C24091i.m45617a(inputStream);
            int i = b.f57668c;
            byte[] bArr = new byte[i];
            int a = m46269a(i, inputStream, bArr);
            List<C24314c.AbstractC24315a> list = b.f57667a;
            if (list != null) {
                for (C24314c.AbstractC24315a aVar : list) {
                    C24314c a2 = aVar.mo34189a(bArr, a);
                    if (!(a2 == null || a2 == C24314c.f57663a)) {
                        return a2;
                    }
                }
            }
            C24314c a3 = b.f57669d.mo34189a(bArr, a);
            if (a3 == null || a3 == C24314c.f57663a) {
                return C24314c.f57663a;
            }
            return a3;
        } catch (IOException e) {
            throw C24098m.m45632b(e);
        }
    }

    /* renamed from: a */
    private static int m46269a(int i, InputStream inputStream, byte[] bArr) {
        boolean z;
        C24091i.m45617a(inputStream);
        C24091i.m45617a(bArr);
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45620a(z);
        if (!inputStream.markSupported()) {
            return C24082a.m45597a(inputStream, bArr, i);
        }
        try {
            inputStream.mark(i);
            return C24082a.m45597a(inputStream, bArr, i);
        } finally {
            inputStream.reset();
        }
    }
}
