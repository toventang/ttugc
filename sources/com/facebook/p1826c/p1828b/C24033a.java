package com.facebook.p1826c.p1828b;

import android.os.Environment;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.common.p1831c.AbstractC24076b;
import com.facebook.common.p1831c.C24075a;
import com.facebook.common.p1831c.C24077c;
import com.facebook.common.p1832d.C24084c;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.time.AbstractC24139a;
import com.facebook.common.time.C24141c;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1825b.C24019b;
import com.facebook.p1826c.p1827a.AbstractC24022b;
import com.facebook.p1826c.p1827a.AbstractC24032k;
import com.facebook.p1826c.p1828b.AbstractC24045d;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.c.b.a */
public class C24033a implements AbstractC24045d {

    /* renamed from: a */
    public static final Class<?> f56893a = C24033a.class;

    /* renamed from: b */
    static final long f56894b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    public final File f56895c;

    /* renamed from: d */
    public final File f56896d;

    /* renamed from: e */
    public final AbstractC24022b f56897e;

    /* renamed from: f */
    public final AbstractC24139a f56898f;

    /* renamed from: g */
    private final boolean f56899g;

    /* renamed from: com.facebook.c.b.a$b */
    static class C24035b implements AbstractC24045d.AbstractC24046a {

        /* renamed from: a */
        public final C24019b f56902a;

        /* renamed from: b */
        private final String f56903b;

        /* renamed from: c */
        private long f56904c;

        /* renamed from: d */
        private long f56905d;

        static {
            Covode.recordClassIndex(28161);
        }

        @Override // com.facebook.p1826c.p1828b.AbstractC24045d.AbstractC24046a
        /* renamed from: a */
        public final String mo39563a() {
            return this.f56903b;
        }

        @Override // com.facebook.p1826c.p1828b.AbstractC24045d.AbstractC24046a
        /* renamed from: b */
        public final long mo39564b() {
            if (this.f56905d < 0) {
                this.f56905d = this.f56902a.f56886a.lastModified();
            }
            return this.f56905d;
        }

        @Override // com.facebook.p1826c.p1828b.AbstractC24045d.AbstractC24046a
        /* renamed from: c */
        public final long mo39565c() {
            if (this.f56904c < 0) {
                this.f56904c = this.f56902a.f56886a.length();
            }
            return this.f56904c;
        }

        private C24035b(String str, File file) {
            C24091i.m45617a(file);
            this.f56903b = (String) C24091i.m45617a(str);
            this.f56902a = C24019b.m45450a(file);
            this.f56904c = -1;
            this.f56905d = -1;
        }

        /* synthetic */ C24035b(String str, File file, byte b) {
            this(str, file);
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: a */
    public final boolean mo39553a() {
        return this.f56899g;
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: c */
    public final void mo39557c() {
        C24075a.m45589a(this.f56895c);
    }

    /* renamed from: com.facebook.c.b.a$e */
    class C24038e implements AbstractC24045d.AbstractC24047b {

        /* renamed from: a */
        final File f56910a;

        /* renamed from: c */
        private final String f56912c;

        static {
            Covode.recordClassIndex(28164);
        }

        @Override // com.facebook.p1826c.p1828b.AbstractC24045d.AbstractC24047b
        /* renamed from: b */
        public final boolean mo39569b() {
            if (!this.f56910a.exists() || m45491a(this.f56910a)) {
                return true;
            }
            return false;
        }

        @Override // com.facebook.p1826c.p1828b.AbstractC24045d.AbstractC24047b
        /* renamed from: a */
        public final AbstractC24018a mo39567a() {
            MethodCollector.m26663i(3279);
            File a = C24033a.this.mo39552a(this.f56912c);
            try {
                File file = this.f56910a;
                C24091i.m45617a(file);
                C24091i.m45617a(a);
                C24077c.m45596b(a);
                if (!file.renameTo(a)) {
                    Throwable th = null;
                    if (a.exists()) {
                        th = new C24077c.C24079b(a.getAbsolutePath());
                    } else if (!file.getParentFile().exists()) {
                        th = new C24077c.C24080c(file.getAbsolutePath());
                    } else if (!file.exists()) {
                        th = new FileNotFoundException(file.getAbsolutePath());
                    }
                    C24077c.C24081d dVar = new C24077c.C24081d("Unknown error renaming " + file.getAbsolutePath() + " to " + a.getAbsolutePath(), th);
                    MethodCollector.m26664o(3279);
                    throw dVar;
                }
                if (a.exists()) {
                    a.setLastModified(C24033a.this.f56898f.mo39730a());
                }
                C24019b a2 = C24019b.m45450a(a);
                MethodCollector.m26664o(3279);
                return a2;
            } catch (C24077c.C24081d e) {
                e.getCause();
                MethodCollector.m26664o(3279);
                throw e;
            }
        }

        /* renamed from: a */
        private static boolean m45491a(File file) {
            MethodCollector.m26663i(3285);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(3285);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(3285);
            return delete;
        }

        @Override // com.facebook.p1826c.p1828b.AbstractC24045d.AbstractC24047b
        /* renamed from: a */
        public final void mo39568a(AbstractC24032k kVar) {
            MethodCollector.m26663i(3210);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.f56910a);
                try {
                    C24084c cVar = new C24084c(fileOutputStream);
                    kVar.mo39548a(cVar);
                    cVar.flush();
                    long j = cVar.f57014a;
                    fileOutputStream.close();
                    if (this.f56910a.length() == j) {
                        MethodCollector.m26664o(3210);
                        return;
                    }
                    C24037d dVar = new C24037d(j, this.f56910a.length());
                    MethodCollector.m26664o(3210);
                    throw dVar;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    MethodCollector.m26664o(3210);
                    throw th;
                }
            } catch (FileNotFoundException e) {
                MethodCollector.m26664o(3210);
                throw e;
            }
        }

        public C24038e(String str, File file) {
            this.f56912c = str;
            this.f56910a = file;
        }
    }

    static {
        Covode.recordClassIndex(28159);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: d */
    public final /* synthetic */ Collection mo39559d() {
        C24034a aVar = new C24034a(this, (byte) 0);
        C24075a.m45588a(this.f56896d, aVar);
        return Collections.unmodifiableList(aVar.f56900a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.c.b.a$c */
    public static class C24036c {

        /* renamed from: a */
        public final String f56906a;

        /* renamed from: b */
        public final String f56907b;

        static {
            Covode.recordClassIndex(28162);
        }

        public final String toString() {
            return this.f56906a + "(" + this.f56907b + ")";
        }

        C24036c(String str, String str2) {
            this.f56906a = str;
            this.f56907b = str2;
        }

        /* synthetic */ C24036c(String str, String str2, byte b) {
            this(str, str2);
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: b */
    public final void mo39556b() {
        C24075a.m45588a(this.f56895c, new C24039f(this, (byte) 0));
    }

    /* renamed from: com.facebook.c.b.a$f */
    class C24039f implements AbstractC24076b {

        /* renamed from: b */
        private boolean f56914b;

        static {
            Covode.recordClassIndex(28165);
        }

        private C24039f() {
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: a */
        public final void mo39560a(File file) {
            if (!this.f56914b && file.equals(C24033a.this.f56896d)) {
                this.f56914b = true;
            }
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: b */
        public final void mo39561b(File file) {
            if (this.f56914b) {
                C24036c a = C24033a.this.mo39550a(file);
                boolean z = false;
                if (a != null) {
                    if (a.f56906a != ".tmp") {
                        if (a.f56906a == ".cnt") {
                            z = true;
                        }
                        C24091i.m45622b(z);
                        return;
                    } else if (file.lastModified() > C24033a.this.f56898f.mo39730a() - C24033a.f56894b) {
                        return;
                    }
                }
            }
            m45495d(file);
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: c */
        public final void mo39562c(File file) {
            if (!C24033a.this.f56895c.equals(file) && !this.f56914b) {
                m45495d(file);
            }
            if (this.f56914b && file.equals(C24033a.this.f56896d)) {
                this.f56914b = false;
            }
        }

        /* renamed from: d */
        private static boolean m45495d(File file) {
            MethodCollector.m26663i(4343);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(4343);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(4343);
            return delete;
        }

        /* synthetic */ C24039f(C24033a aVar, byte b) {
            this();
        }
    }

    /* renamed from: com.facebook.c.b.a$a */
    class C24034a implements AbstractC24076b {

        /* renamed from: a */
        final List<AbstractC24045d.AbstractC24046a> f56900a;

        static {
            Covode.recordClassIndex(28160);
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: a */
        public final void mo39560a(File file) {
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: c */
        public final void mo39562c(File file) {
        }

        private C24034a() {
            this.f56900a = new ArrayList();
        }

        @Override // com.facebook.common.p1831c.AbstractC24076b
        /* renamed from: b */
        public final void mo39561b(File file) {
            C24036c a = C24033a.this.mo39550a(file);
            if (a != null && a.f56906a == ".cnt") {
                this.f56900a.add(new C24035b(a.f56907b, file, (byte) 0));
            }
        }

        /* synthetic */ C24034a(C24033a aVar, byte b) {
            this();
        }
    }

    /* renamed from: d */
    private File m45472d(String str) {
        return new File(m45471c(str));
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: a */
    public final long mo39549a(AbstractC24045d.AbstractC24046a aVar) {
        return m45470c(((C24035b) aVar).f56902a.f56886a);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: b */
    public final long mo39554b(String str) {
        return m45470c(mo39552a(str));
    }

    /* renamed from: b */
    private static boolean m45469b(File file) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            try {
                return file.getCanonicalPath().contains(externalStorageDirectory.toString());
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    private static long m45470c(File file) {
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        if (m45473d(file)) {
            return length;
        }
        return -1;
    }

    /* renamed from: c */
    private String m45471c(String str) {
        return this.f56896d + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    /* renamed from: d */
    private static boolean m45473d(File file) {
        MethodCollector.m26663i(4820);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(4820);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(4820);
        return delete;
    }

    /* renamed from: a */
    public final C24036c mo39550a(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            String str = ".cnt";
            if (!str.equals(substring)) {
                if (".tmp".equals(substring)) {
                    str = ".tmp";
                }
            }
            String substring2 = name.substring(0, lastIndexOf);
            if (str.equals(".tmp")) {
                int lastIndexOf2 = substring2.lastIndexOf(46);
                if (lastIndexOf2 > 0) {
                    substring2 = substring2.substring(0, lastIndexOf2);
                }
            }
            C24036c cVar = new C24036c(str, substring2);
            if (m45472d(cVar.f56907b).equals(file.getParentFile())) {
                return cVar;
            }
            return null;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final File mo39552a(String str) {
        C24036c cVar = new C24036c(".cnt", str, (byte) 0);
        return new File(m45471c(cVar.f56907b) + File.separator + cVar.f56907b + cVar.f56906a);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: c */
    public final boolean mo39558c(String str, Object obj) {
        return mo39552a(str).exists();
    }

    /* renamed from: com.facebook.c.b.a$d */
    static class C24037d extends IOException {

        /* renamed from: a */
        public final long f56908a;

        /* renamed from: b */
        public final long f56909b;

        static {
            Covode.recordClassIndex(28163);
        }

        public C24037d(long j, long j2) {
            super("File was not written completely. Expected: " + j + ", found: " + j2);
            this.f56908a = j;
            this.f56909b = j2;
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: a */
    public final AbstractC24045d.AbstractC24047b mo39551a(String str, Object obj) {
        C24036c cVar = new C24036c(".tmp", str, (byte) 0);
        File d = m45472d(cVar.f56907b);
        if (!d.exists()) {
            try {
                C24077c.m45595a(d);
            } catch (C24077c.C24078a e) {
                throw e;
            }
        }
        try {
            return new C24038e(str, File.createTempFile(cVar.f56907b + ".", ".tmp", d));
        } catch (IOException e2) {
            throw e2;
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: b */
    public final AbstractC24018a mo39555b(String str, Object obj) {
        File a = mo39552a(str);
        if (!a.exists()) {
            return null;
        }
        a.setLastModified(this.f56898f.mo39730a());
        return C24019b.m45450a(a);
    }

    public C24033a(File file, int i, AbstractC24022b bVar) {
        C24091i.m45617a(file);
        this.f56895c = file;
        this.f56899g = m45469b(file);
        File file2 = new File(file, C1764a.m5929a(null, "%s.ols%d.%d", new Object[]{"v2", 100, Integer.valueOf(i)}));
        this.f56896d = file2;
        this.f56897e = bVar;
        if (file.exists()) {
            if (!file2.exists()) {
                C24075a.m45590b(file);
            }
            this.f56898f = C24141c.f57092a;
        }
        try {
            C24077c.m45595a(file2);
        } catch (C24077c.C24078a unused) {
        }
        this.f56898f = C24141c.f57092a;
    }
}
