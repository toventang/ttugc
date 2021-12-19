package com.p2082ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.utils.bw */
public final class C80276bw implements Closeable {

    /* renamed from: a */
    public static final Charset f179773a = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final String f179774g = C80276bw.class.getSimpleName();

    /* renamed from: b */
    public final File f179775b;

    /* renamed from: c */
    public final long f179776c;

    /* renamed from: d */
    public final int f179777d;

    /* renamed from: e */
    public Writer f179778e;

    /* renamed from: f */
    public int f179779f;

    /* renamed from: h */
    private final File f179780h;

    /* renamed from: i */
    private final File f179781i;

    /* renamed from: j */
    private final int f179782j;

    /* renamed from: k */
    private long f179783k;

    /* renamed from: l */
    private final LinkedHashMap<String, C80280b> f179784l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    private long f179785m = 0;

    /* renamed from: n */
    private final ExecutorService f179786n;

    /* renamed from: o */
    private final Callable<Void> f179787o;

    /* renamed from: com.ss.android.ugc.aweme.utils.bw$a */
    public final class C80278a {

        /* renamed from: a */
        public final C80280b f179789a;

        /* renamed from: b */
        public boolean f179790b;

        static {
            Covode.recordClassIndex(93546);
        }

        /* renamed from: b */
        public final void mo123682b() {
            C80276bw.this.mo123671a(this, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.utils.bw$a$a */
        public class C80279a extends FilterOutputStream {
            static {
                Covode.recordClassIndex(93547);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C80278a.this.f179790b = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C80278a.this.f179790b = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public final void write(int i) {
                MethodCollector.m26663i(12634);
                try {
                    this.out.write(i);
                    MethodCollector.m26664o(12634);
                } catch (IOException unused) {
                    C80278a.this.f179790b = true;
                    MethodCollector.m26664o(12634);
                }
            }

            private C80279a(OutputStream outputStream) {
                super(outputStream);
                MethodCollector.m26663i(12633);
                MethodCollector.m26664o(12633);
            }

            /* synthetic */ C80279a(C80278a aVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public final void write(byte[] bArr, int i, int i2) {
                MethodCollector.m26663i(12635);
                try {
                    this.out.write(bArr, i, i2);
                    MethodCollector.m26664o(12635);
                } catch (IOException unused) {
                    C80278a.this.f179790b = true;
                    MethodCollector.m26664o(12635);
                }
            }
        }

        /* renamed from: a */
        public final void mo123681a() {
            if (this.f179790b) {
                C80276bw.this.mo123671a(this, false);
                C80276bw.this.mo123675c(this.f179789a.f179793a);
                return;
            }
            C80276bw.this.mo123671a(this, true);
        }

        /* renamed from: a */
        public final OutputStream mo123680a(int i) {
            C80279a aVar;
            MethodCollector.m26663i(12005);
            synchronized (C80276bw.this) {
                try {
                    if (this.f179789a.f179796d == this) {
                        aVar = new C80279a(this, new FileOutputStream(this.f179789a.mo123690b(i)), (byte) 0);
                    } else {
                        IllegalStateException illegalStateException = new IllegalStateException();
                        MethodCollector.m26664o(12005);
                        throw illegalStateException;
                    }
                } finally {
                    MethodCollector.m26664o(12005);
                }
            }
            return aVar;
        }

        private C80278a(C80280b bVar) {
            this.f179789a = bVar;
        }

        /* synthetic */ C80278a(C80276bw bwVar, C80280b bVar, byte b) {
            this(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo123674c() {
        if (this.f179778e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.bw$c */
    public final class C80281c implements Closeable {

        /* renamed from: a */
        public final InputStream[] f179799a;

        /* renamed from: c */
        private final String f179801c;

        /* renamed from: d */
        private final long f179802d;

        static {
            Covode.recordClassIndex(93549);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f179799a) {
                C80276bw.m139155a((Closeable) inputStream);
            }
        }

        private C80281c(String str, long j, InputStream[] inputStreamArr) {
            this.f179801c = str;
            this.f179802d = j;
            this.f179799a = inputStreamArr;
        }

        /* synthetic */ C80281c(C80276bw bwVar, String str, long j, InputStream[] inputStreamArr, byte b) {
            this(str, j, inputStreamArr);
        }
    }

    /* renamed from: h */
    private void m139162h() {
        if (this.f179778e == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: e */
    public final void mo123678e() {
        close();
        m139156a(this.f179775b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.bw$b */
    public final class C80280b {

        /* renamed from: a */
        public final String f179793a;

        /* renamed from: b */
        public final long[] f179794b;

        /* renamed from: c */
        public boolean f179795c;

        /* renamed from: d */
        public C80278a f179796d;

        /* renamed from: e */
        public long f179797e;

        static {
            Covode.recordClassIndex(93548);
        }

        /* renamed from: a */
        public final String mo123688a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f179794b) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private static IOException m139176b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public final File mo123687a(int i) {
            return new File(C80276bw.this.f179775b, this.f179793a + "." + i);
        }

        /* renamed from: b */
        public final File mo123690b(int i) {
            return new File(C80276bw.this.f179775b, this.f179793a + "." + i + ".tmp");
        }

        /* renamed from: a */
        public final void mo123689a(String[] strArr) {
            if (strArr.length == C80276bw.this.f179777d) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f179794b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m139176b(strArr);
                    }
                }
                return;
            }
            throw m139176b(strArr);
        }

        private C80280b(String str) {
            this.f179793a = str;
            this.f179794b = new long[C80276bw.this.f179777d];
        }

        /* synthetic */ C80280b(C80276bw bwVar, String str, byte b) {
            this(str);
        }
    }

    static {
        Covode.recordClassIndex(93544);
    }

    /* renamed from: b */
    public final boolean mo123673b() {
        int i = this.f179779f;
        if (i < 2000 || i < this.f179784l.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m139161g() {
        m139158c(this.f179781i);
        Iterator<C80280b> it = this.f179784l.values().iterator();
        while (it.hasNext()) {
            C80280b next = it.next();
            int i = 0;
            if (next.f179796d == null) {
                while (i < this.f179777d) {
                    this.f179783k += next.f179794b[i];
                    i++;
                }
            } else {
                next.f179796d = null;
                while (i < this.f179777d) {
                    m139158c(next.mo123687a(i));
                    m139158c(next.mo123690b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.m26663i(10614);
        if (this.f179778e == null) {
            MethodCollector.m26664o(10614);
            return;
        }
        Iterator it = new ArrayList(this.f179784l.values()).iterator();
        while (it.hasNext()) {
            C80280b bVar = (C80280b) it.next();
            if (bVar.f179796d != null) {
                bVar.f179796d.mo123682b();
            }
        }
        mo123677d();
        this.f179778e.close();
        this.f179778e = null;
        MethodCollector.m26664o(10614);
    }

    /* renamed from: d */
    public final void mo123677d() {
        while (this.f179783k > this.f179776c) {
            mo123675c(this.f179784l.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: f */
    private void m139160f() {
        String a;
        MethodCollector.m26663i(14347);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f179780h), 8192);
        try {
            String a2 = m139154a((InputStream) bufferedInputStream);
            String a3 = m139154a((InputStream) bufferedInputStream);
            String a4 = m139154a((InputStream) bufferedInputStream);
            String a5 = m139154a((InputStream) bufferedInputStream);
            String a6 = m139154a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.f179782j).equals(a4) || !Integer.toString(this.f179777d).equals(a5) || !"".equals(a6)) {
                IOException iOException = new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
                MethodCollector.m26664o(14347);
                throw iOException;
            }
            while (true) {
                try {
                    a = m139154a((InputStream) bufferedInputStream);
                    String[] split = a.split(" ");
                    if (split.length >= 2) {
                        String str = split[1];
                        if (!split[0].equals("REMOVE") || split.length != 2) {
                            C80280b bVar = this.f179784l.get(str);
                            if (bVar == null) {
                                bVar = new C80280b(this, str, (byte) 0);
                                this.f179784l.put(str, bVar);
                            }
                            if (split[0].equals("CLEAN") && split.length == this.f179777d + 2) {
                                bVar.f179795c = true;
                                bVar.f179796d = null;
                                int length = split.length;
                                int length2 = split.length;
                                if (2 > length) {
                                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                                    MethodCollector.m26664o(14347);
                                    throw illegalArgumentException;
                                } else if (2 <= length2) {
                                    int i = length - 2;
                                    int min = Math.min(i, length2 - 2);
                                    Object[] objArr = (Object[]) Array.newInstance(split.getClass().getComponentType(), i);
                                    System.arraycopy(split, 2, objArr, 0, min);
                                    bVar.mo123689a((String[]) objArr);
                                } else {
                                    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
                                    MethodCollector.m26664o(14347);
                                    throw arrayIndexOutOfBoundsException;
                                }
                            } else if (split[0].equals("DIRTY") && split.length == 2) {
                                bVar.f179796d = new C80278a(this, bVar, (byte) 0);
                            } else if (!split[0].equals("READ") || split.length != 2) {
                                IOException iOException2 = new IOException("unexpected journal line: ".concat(String.valueOf(a)));
                                MethodCollector.m26664o(14347);
                            }
                        } else {
                            this.f179784l.remove(str);
                        }
                    } else {
                        IOException iOException3 = new IOException("unexpected journal line: ".concat(String.valueOf(a)));
                        MethodCollector.m26664o(14347);
                        throw iOException3;
                    }
                } catch (EOFException unused) {
                    return;
                }
            }
            IOException iOException22 = new IOException("unexpected journal line: ".concat(String.valueOf(a)));
            MethodCollector.m26664o(14347);
            throw iOException22;
        } finally {
            m139155a((Closeable) bufferedInputStream);
            MethodCollector.m26664o(14347);
        }
    }

    /* renamed from: a */
    public final synchronized void mo123670a() {
        MethodCollector.m26663i(14350);
        Writer writer = this.f179778e;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f179781i), 8192);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f179782j));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f179777d));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C80280b bVar : this.f179784l.values()) {
            if (bVar.f179796d != null) {
                bufferedWriter.write("DIRTY " + bVar.f179793a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + bVar.f179793a + bVar.mo123688a() + '\n');
            }
        }
        bufferedWriter.close();
        this.f179781i.renameTo(this.f179780h);
        this.f179778e = new BufferedWriter(new FileWriter(this.f179780h, true), 8192);
        MethodCollector.m26664o(14350);
    }

    /* renamed from: a */
    public static void m139155a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static void m139158c(File file) {
        if (file.exists() && !m139157b(file)) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    private static void m139159d(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    /* renamed from: a */
    private static String m139154a(InputStream inputStream) {
        MethodCollector.m26663i(14339);
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                EOFException eOFException = new EOFException();
                MethodCollector.m26664o(14339);
                throw eOFException;
            } else if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == '\r') {
                        sb.setLength(i);
                    }
                }
                String sb2 = sb.toString();
                MethodCollector.m26664o(14339);
                return sb2;
            }
        }
    }

    /* renamed from: b */
    private static boolean m139157b(File file) {
        MethodCollector.m26663i(14344);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(14344);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(14344);
        return delete;
    }

    /* renamed from: a */
    private static void m139156a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m139156a(file2);
                }
                if (!m139157b(file2)) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IllegalArgumentException("not a directory: ".concat(String.valueOf(file)));
    }

    /* renamed from: b */
    public final synchronized C80278a mo123672b(String str) {
        MethodCollector.m26663i(14356);
        m139162h();
        m139159d(str);
        C80280b bVar = this.f179784l.get(str);
        if (bVar == null) {
            bVar = new C80280b(this, str, (byte) 0);
            this.f179784l.put(str, bVar);
        } else if (bVar.f179796d != null) {
            MethodCollector.m26664o(14356);
            return null;
        }
        C80278a aVar = new C80278a(this, bVar, (byte) 0);
        bVar.f179796d = aVar;
        this.f179778e.write("DIRTY " + str + '\n');
        this.f179778e.flush();
        MethodCollector.m26664o(14356);
        return aVar;
    }

    /* renamed from: c */
    public final synchronized boolean mo123675c(String str) {
        MethodCollector.m26663i(14361);
        m139162h();
        m139159d(str);
        C80280b bVar = this.f179784l.get(str);
        if (bVar == null || bVar.f179796d != null) {
            MethodCollector.m26664o(14361);
            return false;
        }
        for (int i = 0; i < this.f179777d; i++) {
            File a = bVar.mo123687a(i);
            if (m139157b(a)) {
                this.f179783k -= bVar.f179794b[i];
                bVar.f179794b[i] = 0;
            } else {
                IOException iOException = new IOException("failed to delete ".concat(String.valueOf(a)));
                MethodCollector.m26664o(14361);
                throw iOException;
            }
        }
        this.f179779f++;
        this.f179778e.append((CharSequence) ("REMOVE " + str + '\n'));
        this.f179784l.remove(str);
        if (mo123673b()) {
            this.f179786n.submit(this.f179787o);
        }
        MethodCollector.m26664o(14361);
        return true;
    }

    /* renamed from: a */
    public final synchronized C80281c mo123669a(String str) {
        MethodCollector.m26663i(14354);
        m139162h();
        m139159d(str);
        C80280b bVar = this.f179784l.get(str);
        if (bVar == null) {
            MethodCollector.m26664o(14354);
            return null;
        } else if (!bVar.f179795c) {
            MethodCollector.m26664o(14354);
            return null;
        } else {
            InputStream[] inputStreamArr = new InputStream[this.f179777d];
            for (int i = 0; i < this.f179777d; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(bVar.mo123687a(i));
                } catch (FileNotFoundException unused) {
                    MethodCollector.m26664o(14354);
                    return null;
                }
            }
            this.f179779f++;
            this.f179778e.append((CharSequence) ("READ " + str + '\n'));
            if (mo123673b()) {
                this.f179786n.submit(this.f179787o);
            }
            C80281c cVar = new C80281c(this, str, bVar.f179797e, inputStreamArr, (byte) 0);
            MethodCollector.m26664o(14354);
            return cVar;
        }
    }

    /* renamed from: a */
    public static C80276bw m139153a(File file, int i) {
        C80276bw bwVar = new C80276bw(file, i, 1, 52428800);
        if (bwVar.f179780h.exists()) {
            try {
                bwVar.m139160f();
                bwVar.m139161g();
                bwVar.f179778e = new BufferedWriter(new FileWriter(bwVar.f179780h, true), 8192);
                return bwVar;
            } catch (IOException unused) {
                bwVar.mo123678e();
            }
        }
        file.mkdirs();
        C80276bw bwVar2 = new C80276bw(file, i, 1, 52428800);
        bwVar2.mo123670a();
        return bwVar2;
    }

    /* renamed from: a */
    public final synchronized void mo123671a(C80278a aVar, boolean z) {
        MethodCollector.m26663i(14359);
        C80280b bVar = aVar.f179789a;
        if (bVar.f179796d == aVar) {
            if (z && !bVar.f179795c) {
                for (int i = 0; i < this.f179777d; i++) {
                    if (!bVar.mo123690b(i).exists()) {
                        aVar.mo123682b();
                        IllegalStateException illegalStateException = new IllegalStateException("edit didn't create file ".concat(String.valueOf(i)));
                        MethodCollector.m26664o(14359);
                        throw illegalStateException;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f179777d; i2++) {
                File b = bVar.mo123690b(i2);
                if (!z) {
                    m139158c(b);
                } else if (b.exists()) {
                    File a = bVar.mo123687a(i2);
                    b.renameTo(a);
                    long j = bVar.f179794b[i2];
                    long length = a.length();
                    bVar.f179794b[i2] = length;
                    this.f179783k = (this.f179783k - j) + length;
                }
            }
            this.f179779f++;
            bVar.f179796d = null;
            if (bVar.f179795c || z) {
                bVar.f179795c = true;
                this.f179778e.write("CLEAN " + bVar.f179793a + bVar.mo123688a() + '\n');
                if (z) {
                    long j2 = this.f179785m;
                    this.f179785m = 1 + j2;
                    bVar.f179797e = j2;
                }
            } else {
                this.f179784l.remove(bVar.f179793a);
                this.f179778e.write("REMOVE " + bVar.f179793a + '\n');
            }
            if (this.f179783k > this.f179776c || mo123673b()) {
                this.f179786n.submit(this.f179787o);
            }
            MethodCollector.m26664o(14359);
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException();
            MethodCollector.m26664o(14359);
            throw illegalStateException2;
        }
    }

    private C80276bw(File file, int i, int i2, long j) {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        this.f179786n = C40780g.m82242a(a.mo70028a());
        this.f179787o = new Callable<Void>() {
            /* class com.p2082ss.android.ugc.aweme.utils.C80276bw.CallableC802771 */

            static {
                Covode.recordClassIndex(93545);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                MethodCollector.m26663i(12003);
                synchronized (C80276bw.this) {
                    try {
                        if (C80276bw.this.f179778e == null) {
                            return null;
                        }
                        C80276bw.this.mo123677d();
                        if (C80276bw.this.mo123673b()) {
                            C80276bw.this.mo123670a();
                            C80276bw.this.f179779f = 0;
                        }
                        MethodCollector.m26664o(12003);
                        return null;
                    } finally {
                        MethodCollector.m26664o(12003);
                    }
                }
            }
        };
        this.f179775b = file;
        this.f179782j = i;
        this.f179780h = new File(file, "journal");
        this.f179781i = new File(file, "journal.tmp");
        this.f179777d = 1;
        this.f179776c = 52428800;
    }
}
