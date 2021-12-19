package p078c.p080b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import p078c.p079a.C1749a;

/* renamed from: c.b.c */
public final class C1755c extends FileOutputStream {

    /* renamed from: a */
    private static final C1749a f5624a = C1749a.C1750a.f5617a;

    static {
        Covode.recordClassIndex(1925);
    }

    public C1755c(String str) {
        this(new C1752a(str));
    }

    private C1755c(File file) {
        super((File) C1749a.m5881a(file), false);
        MethodCollector.m26663i(7475);
        MethodCollector.m26664o(7475);
    }
}
