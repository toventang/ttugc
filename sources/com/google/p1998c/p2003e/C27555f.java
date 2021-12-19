package com.google.p1998c.p2003e;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.C27245k;
import com.google.p1998c.p2001c.AbstractC27381ai;
import com.google.p1998c.p2001c.AbstractC27478bq;
import com.google.p1998c.p2002d.AbstractC27546a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.c.e.f */
public final class C27555f {

    /* renamed from: a */
    private static final AbstractC27478bq<File> f64924a = new AbstractC27478bq<File>() {
        /* class com.google.p1998c.p2003e.C27555f.C275561 */

        static {
            Covode.recordClassIndex(33136);
        }

        public final String toString() {
            return "Files.fileTreeTraverser()";
        }
    };

    /* renamed from: b */
    private static final AbstractC27546a<File> f64925b = new AbstractC27546a<File>() {
        /* class com.google.p1998c.p2003e.C27555f.C275572 */

        static {
            Covode.recordClassIndex(33137);
        }
    };

    /* renamed from: com.google.c.e.f$b */
    public static final class C27559b extends AbstractC27548b {

        /* renamed from: a */
        private final File f64928a;

        static {
            Covode.recordClassIndex(33139);
        }

        @Override // com.google.p1998c.p2003e.AbstractC27548b
        /* renamed from: a */
        public final /* synthetic */ InputStream mo46112a() {
            MethodCollector.m26663i(1893);
            FileInputStream fileInputStream = new FileInputStream(this.f64928a);
            MethodCollector.m26664o(1893);
            return fileInputStream;
        }

        public final String toString() {
            return "Files.asByteSource(" + this.f64928a + ")";
        }

        private C27559b(File file) {
            this.f64928a = (File) C27245k.m54229a(file);
        }

        public /* synthetic */ C27559b(File file, byte b) {
            this(file);
        }
    }

    /* renamed from: com.google.c.e.f$a */
    public static final class C27558a extends AbstractC27547a {

        /* renamed from: a */
        private final File f64926a;

        /* renamed from: b */
        private final AbstractC27381ai<EnumC27554e> f64927b;

        static {
            Covode.recordClassIndex(33138);
        }

        @Override // com.google.p1998c.p2003e.AbstractC27547a
        /* renamed from: a */
        public final /* synthetic */ OutputStream mo46110a() {
            MethodCollector.m26663i(3034);
            FileOutputStream fileOutputStream = new FileOutputStream(this.f64926a, this.f64927b.contains(EnumC27554e.APPEND));
            MethodCollector.m26664o(3034);
            return fileOutputStream;
        }

        public final String toString() {
            return "Files.asByteSink(" + this.f64926a + ", " + this.f64927b + ")";
        }

        private C27558a(File file, EnumC27554e... eVarArr) {
            this.f64926a = (File) C27245k.m54229a(file);
            this.f64927b = AbstractC27381ai.copyOf(eVarArr);
        }

        public /* synthetic */ C27558a(File file, EnumC27554e[] eVarArr, byte b) {
            this(file, eVarArr);
        }
    }

    static {
        Covode.recordClassIndex(33135);
    }
}
