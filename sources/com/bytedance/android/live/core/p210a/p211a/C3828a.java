package com.bytedance.android.live.core.p210a.p211a;

import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.android.live.core.a.a.a */
public final class C3828a implements Closeable {

    /* renamed from: a */
    static final Pattern f10572a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: g */
    public static final OutputStream f10573g = new OutputStream() {
        /* class com.bytedance.android.live.core.p210a.p211a.C3828a.C38302 */

        static {
            Covode.recordClassIndex(4359);
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
        }

        {
            MethodCollector.m26663i(12674);
            MethodCollector.m26664o(12674);
        }
    };

    /* renamed from: b */
    public final File f10574b;

    /* renamed from: c */
    public final int f10575c;

    /* renamed from: d */
    public Writer f10576d;

    /* renamed from: e */
    public int f10577e;

    /* renamed from: f */
    final ExecutorService f10578f;

    /* renamed from: h */
    private final File f10579h;

    /* renamed from: i */
    private final File f10580i;

    /* renamed from: j */
    private final File f10581j;

    /* renamed from: k */
    private final int f10582k;

    /* renamed from: l */
    private long f10583l;

    /* renamed from: m */
    private long f10584m;

    /* renamed from: n */
    private final LinkedHashMap<String, C3833b> f10585n = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o */
    private long f10586o = 0;

    /* renamed from: p */
    private final Callable<Void> f10587p;

    /* renamed from: com.bytedance.android.live.core.a.a.a$a */
    public final class C3831a {

        /* renamed from: a */
        public final C3833b f10589a;

        /* renamed from: b */
        public final boolean[] f10590b;

        /* renamed from: c */
        public boolean f10591c;

        /* renamed from: d */
        public boolean f10592d;

        static {
            Covode.recordClassIndex(4360);
        }

        /* renamed from: b */
        public final void mo9187b() {
            C3828a.this.mo9178a(this, false);
        }

        /* renamed from: com.bytedance.android.live.core.a.a.a$a$a */
        class C3832a extends FilterOutputStream {
            static {
                Covode.recordClassIndex(4361);
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.io.FilterOutputStream, java.lang.AutoCloseable
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C3831a.this.f10591c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream, java.io.Flushable
            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C3831a.this.f10591c = true;
                }
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public final void write(int i) {
                MethodCollector.m26663i(11704);
                try {
                    this.out.write(i);
                    MethodCollector.m26664o(11704);
                } catch (IOException unused) {
                    C3831a.this.f10591c = true;
                    MethodCollector.m26664o(11704);
                }
            }

            private C3832a(OutputStream outputStream) {
                super(outputStream);
                MethodCollector.m26663i(11703);
                MethodCollector.m26664o(11703);
            }

            /* synthetic */ C3832a(C3831a aVar, OutputStream outputStream, byte b) {
                this(outputStream);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public final void write(byte[] bArr, int i, int i2) {
                MethodCollector.m26663i(11872);
                try {
                    this.out.write(bArr, i, i2);
                    MethodCollector.m26664o(11872);
                } catch (IOException unused) {
                    C3831a.this.f10591c = true;
                    MethodCollector.m26664o(11872);
                }
            }
        }

        /* renamed from: a */
        public final OutputStream mo9186a() {
            FileOutputStream fileOutputStream;
            C3832a aVar;
            MethodCollector.m26663i(11550);
            if (C3828a.this.f10575c > 0) {
                synchronized (C3828a.this) {
                    try {
                        if (this.f10589a.f10598d == this) {
                            if (!this.f10589a.f10597c) {
                                this.f10590b[0] = true;
                            }
                            File b = this.f10589a.mo9195b(0);
                            try {
                                fileOutputStream = new FileOutputStream(b);
                            } catch (FileNotFoundException unused) {
                                C3828a.this.f10574b.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(b);
                                } catch (FileNotFoundException unused2) {
                                    OutputStream outputStream = C3828a.f10573g;
                                    MethodCollector.m26664o(11550);
                                    return outputStream;
                                }
                            }
                            aVar = new C3832a(this, fileOutputStream, (byte) 0);
                        } else {
                            IllegalStateException illegalStateException = new IllegalStateException();
                            MethodCollector.m26664o(11550);
                            throw illegalStateException;
                        }
                    } finally {
                        MethodCollector.m26664o(11550);
                    }
                }
                return aVar;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + C3828a.this.f10575c);
            MethodCollector.m26664o(11550);
            throw illegalArgumentException;
        }

        private C3831a(C3833b bVar) {
            boolean[] zArr;
            this.f10589a = bVar;
            if (bVar.f10597c) {
                zArr = null;
            } else {
                zArr = new boolean[C3828a.this.f10575c];
            }
            this.f10590b = zArr;
        }

        /* synthetic */ C3831a(C3828a aVar, C3833b bVar, byte b) {
            this(bVar);
        }
    }

    /* renamed from: com.bytedance.android.live.core.a.a.a$c */
    public final class C3834c implements Closeable {

        /* renamed from: a */
        public final InputStream[] f10601a;

        /* renamed from: c */
        private final String f10603c;

        /* renamed from: d */
        private final long f10604d;

        /* renamed from: e */
        private final long[] f10605e;

        static {
            Covode.recordClassIndex(4363);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.f10601a) {
                C3835b.m9411a(inputStream);
            }
        }

        private C3834c(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f10603c = str;
            this.f10604d = j;
            this.f10601a = inputStreamArr;
            this.f10605e = jArr;
        }

        /* synthetic */ C3834c(C3828a aVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, byte b) {
            this(str, j, inputStreamArr, jArr);
        }
    }

    /* renamed from: f */
    private void m9395f() {
        if (this.f10576d == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: com.bytedance.android.live.core.a.a.a$b */
    public final class C3833b {

        /* renamed from: a */
        public final String f10595a;

        /* renamed from: b */
        public final long[] f10596b;

        /* renamed from: c */
        public boolean f10597c;

        /* renamed from: d */
        public C3831a f10598d;

        /* renamed from: e */
        public long f10599e;

        static {
            Covode.recordClassIndex(4362);
        }

        /* renamed from: a */
        public final String mo9193a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f10596b) {
                sb.append(' ').append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private static IOException m9406b(String[] strArr) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public final File mo9192a(int i) {
            return new File(C3828a.this.f10574b, this.f10595a + "." + i);
        }

        /* renamed from: b */
        public final File mo9195b(int i) {
            return new File(C3828a.this.f10574b, this.f10595a + "." + i + ".tmp");
        }

        /* renamed from: a */
        public final void mo9194a(String[] strArr) {
            if (strArr.length == C3828a.this.f10575c) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f10596b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m9406b(strArr);
                    }
                }
                return;
            }
            throw m9406b(strArr);
        }

        private C3833b(String str) {
            this.f10595a = str;
            this.f10596b = new long[C3828a.this.f10575c];
        }

        /* synthetic */ C3833b(C3828a aVar, String str, byte b) {
            this(str);
        }
    }

    static {
        Covode.recordClassIndex(4357);
    }

    /* renamed from: b */
    public final boolean mo9180b() {
        int i = this.f10577e;
        if (i < 2000 || i < this.f10585n.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo9181c() {
        while (this.f10584m > this.f10583l) {
            mo9182c(this.f10585n.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: e */
    private void m9394e() {
        m9391c(this.f10580i);
        Iterator<C3833b> it = this.f10585n.values().iterator();
        while (it.hasNext()) {
            C3833b next = it.next();
            int i = 0;
            if (next.f10598d == null) {
                while (i < this.f10575c) {
                    this.f10584m += next.f10596b[i];
                    i++;
                }
            } else {
                next.f10598d = null;
                while (i < this.f10575c) {
                    m9391c(next.mo9192a(i));
                    m9391c(next.mo9195b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.m26663i(11160);
        if (this.f10576d == null) {
            MethodCollector.m26664o(11160);
            return;
        }
        Iterator it = new ArrayList(this.f10585n.values()).iterator();
        while (it.hasNext()) {
            C3833b bVar = (C3833b) it.next();
            if (bVar.f10598d != null) {
                bVar.f10598d.mo9187b();
            }
        }
        mo9181c();
        this.f10576d.close();
        this.f10576d = null;
        MethodCollector.m26664o(11160);
    }

    /* renamed from: d */
    private void m9392d() {
        String a;
        String str;
        MethodCollector.m26663i(13420);
        C3836c cVar = new C3836c(new FileInputStream(this.f10579h), C3835b.f10606a);
        try {
            String a2 = cVar.mo9197a();
            String a3 = cVar.mo9197a();
            String a4 = cVar.mo9197a();
            String a5 = cVar.mo9197a();
            String a6 = cVar.mo9197a();
            if (!"libcore.io.DiskLruCache".equals(a2) || !"1".equals(a3) || !Integer.toString(this.f10582k).equals(a4) || !Integer.toString(this.f10575c).equals(a5) || !"".equals(a6)) {
                IOException iOException = new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + "]");
                MethodCollector.m26664o(13420);
                throw iOException;
            }
            int i = 0;
            while (true) {
                try {
                    a = cVar.mo9197a();
                    int indexOf = a.indexOf(32);
                    if (indexOf != -1) {
                        int i2 = indexOf + 1;
                        int indexOf2 = a.indexOf(32, i2);
                        if (indexOf2 == -1) {
                            str = a.substring(i2);
                            if (indexOf == 6 && a.startsWith("REMOVE")) {
                                this.f10585n.remove(str);
                                i++;
                            }
                        } else {
                            str = a.substring(i2, indexOf2);
                        }
                        C3833b bVar = this.f10585n.get(str);
                        if (bVar == null) {
                            bVar = new C3833b(this, str, (byte) 0);
                            this.f10585n.put(str, bVar);
                        }
                        if (indexOf2 != -1) {
                            if (indexOf != 5 || !a.startsWith("CLEAN")) {
                                if (indexOf2 != -1) {
                                    if (indexOf2 != -1) {
                                        break;
                                    }
                                    if (indexOf != 4 || !a.startsWith("READ")) {
                                        break;
                                    }
                                    i++;
                                }
                            } else {
                                String[] split = a.substring(indexOf2 + 1).split(" ");
                                bVar.f10597c = true;
                                bVar.f10598d = null;
                                bVar.mo9194a(split);
                                i++;
                            }
                        }
                        if (indexOf == 5) {
                            if (!a.startsWith("DIRTY")) {
                                break;
                            }
                            bVar.f10598d = new C3831a(this, bVar, (byte) 0);
                            i++;
                        }
                        i++;
                    } else {
                        IOException iOException2 = new IOException("unexpected journal line: ".concat(String.valueOf(a)));
                        MethodCollector.m26664o(13420);
                        throw iOException2;
                    }
                } catch (EOFException unused) {
                    this.f10577e = i - this.f10585n.size();
                    if (cVar.f10609b == -1) {
                        mo9177a();
                    } else {
                        this.f10576d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10579h, true), C3835b.f10606a));
                    }
                    return;
                }
            }
            IOException iOException3 = new IOException("unexpected journal line: ".concat(String.valueOf(a)));
            MethodCollector.m26664o(13420);
            throw iOException3;
        } finally {
            C3835b.m9411a(cVar);
            MethodCollector.m26664o(13420);
        }
    }

    /* renamed from: a */
    public final synchronized void mo9177a() {
        MethodCollector.m26663i(13422);
        Writer writer = this.f10576d;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10580i), C3835b.f10606a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10582k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f10575c));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C3833b bVar : this.f10585n.values()) {
                if (bVar.f10598d != null) {
                    bufferedWriter.write("DIRTY " + bVar.f10595a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + bVar.f10595a + bVar.mo9193a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f10579h.exists()) {
                m9389a(this.f10579h, this.f10581j, true);
            }
            m9389a(this.f10580i, this.f10579h, false);
            m9390b(this.f10581j);
            this.f10576d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f10579h, true), C3835b.f10606a));
            MethodCollector.m26664o(13422);
        } catch (Throwable th) {
            bufferedWriter.close();
            MethodCollector.m26664o(13422);
            throw th;
        }
    }

    /* renamed from: c */
    private static void m9391c(File file) {
        if (file.exists() && !m9390b(file)) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    private static void m9393d(String str) {
        if (!f10572a.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
    }

    private C3828a(File file) {
        ExecutorService threadPoolExecutor;
        if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
            threadPoolExecutor = C40780g.m82241a();
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        this.f10578f = threadPoolExecutor;
        this.f10587p = new Callable<Void>() {
            /* class com.bytedance.android.live.core.p210a.p211a.C3828a.CallableC38291 */

            static {
                Covode.recordClassIndex(4358);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                MethodCollector.m26663i(12257);
                synchronized (C3828a.this) {
                    try {
                        if (C3828a.this.f10576d == null) {
                            return null;
                        }
                        C3828a.this.mo9181c();
                        if (C3828a.this.mo9180b()) {
                            C3828a.this.mo9177a();
                            C3828a.this.f10577e = 0;
                        }
                        MethodCollector.m26664o(12257);
                        return null;
                    } finally {
                        MethodCollector.m26664o(12257);
                    }
                }
            }
        };
        this.f10574b = file;
        this.f10582k = 100;
        this.f10579h = new File(file, "journal");
        this.f10580i = new File(file, "journal.tmp");
        this.f10581j = new File(file, "journal.bkp");
        this.f10575c = 1;
        this.f10583l = 400;
    }

    /* renamed from: a */
    public static C3828a m9388a(File file) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                m9390b(file2);
            } else {
                m9389a(file2, file3, false);
            }
        }
        C3828a aVar = new C3828a(file);
        if (aVar.f10579h.exists()) {
            try {
                aVar.m9392d();
                aVar.m9394e();
                return aVar;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                aVar.close();
                C3835b.m9412a(aVar.f10574b);
            }
        }
        file.mkdirs();
        C3828a aVar2 = new C3828a(file);
        aVar2.mo9177a();
        return aVar2;
    }

    /* renamed from: b */
    private static boolean m9390b(File file) {
        MethodCollector.m26663i(13341);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(13341);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(13341);
        return delete;
    }

    /* renamed from: a */
    public final synchronized C3834c mo9176a(String str) {
        MethodCollector.m26663i(13544);
        m9395f();
        m9393d(str);
        C3833b bVar = this.f10585n.get(str);
        if (bVar == null) {
            MethodCollector.m26664o(13544);
            return null;
        } else if (!bVar.f10597c) {
            MethodCollector.m26664o(13544);
            return null;
        } else {
            InputStream[] inputStreamArr = new InputStream[this.f10575c];
            int i = 0;
            for (int i2 = 0; i2 < this.f10575c; i2++) {
                try {
                    inputStreamArr[i2] = new FileInputStream(bVar.mo9192a(i2));
                } catch (FileNotFoundException unused) {
                    while (i < this.f10575c && inputStreamArr[i] != null) {
                        C3835b.m9411a(inputStreamArr[i]);
                        i++;
                    }
                    MethodCollector.m26664o(13544);
                    return null;
                }
            }
            this.f10577e++;
            this.f10576d.append((CharSequence) ("READ " + str + '\n'));
            if (mo9180b()) {
                this.f10578f.submit(this.f10587p);
            }
            C3834c cVar = new C3834c(this, str, bVar.f10599e, inputStreamArr, bVar.f10596b, (byte) 0);
            MethodCollector.m26664o(13544);
            return cVar;
        }
    }

    /* renamed from: b */
    public final synchronized C3831a mo9179b(String str) {
        MethodCollector.m26663i(13597);
        m9395f();
        m9393d(str);
        C3833b bVar = this.f10585n.get(str);
        if (bVar == null) {
            bVar = new C3833b(this, str, (byte) 0);
            this.f10585n.put(str, bVar);
        } else if (bVar.f10598d != null) {
            MethodCollector.m26664o(13597);
            return null;
        }
        C3831a aVar = new C3831a(this, bVar, (byte) 0);
        bVar.f10598d = aVar;
        this.f10576d.write("DIRTY " + str + '\n');
        this.f10576d.flush();
        MethodCollector.m26664o(13597);
        return aVar;
    }

    /* renamed from: c */
    public final synchronized boolean mo9182c(String str) {
        MethodCollector.m26663i(11010);
        m9395f();
        m9393d(str);
        C3833b bVar = this.f10585n.get(str);
        if (bVar == null || bVar.f10598d != null) {
            MethodCollector.m26664o(11010);
            return false;
        }
        for (int i = 0; i < this.f10575c; i++) {
            File a = bVar.mo9192a(i);
            if (!a.exists() || m9390b(a)) {
                this.f10584m -= bVar.f10596b[i];
                bVar.f10596b[i] = 0;
            } else {
                IOException iOException = new IOException("failed to delete ".concat(String.valueOf(a)));
                MethodCollector.m26664o(11010);
                throw iOException;
            }
        }
        this.f10577e++;
        this.f10576d.append((CharSequence) ("REMOVE " + str + '\n'));
        this.f10585n.remove(str);
        if (mo9180b()) {
            this.f10578f.submit(this.f10587p);
        }
        MethodCollector.m26664o(11010);
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo9178a(C3831a aVar, boolean z) {
        MethodCollector.m26663i(13648);
        C3833b bVar = aVar.f10589a;
        if (bVar.f10598d == aVar) {
            if (z && !bVar.f10597c) {
                for (int i = 0; i < this.f10575c; i++) {
                    if (!aVar.f10590b[i]) {
                        aVar.mo9187b();
                        IllegalStateException illegalStateException = new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                        MethodCollector.m26664o(13648);
                        throw illegalStateException;
                    } else if (!bVar.mo9195b(i).exists()) {
                        aVar.mo9187b();
                        MethodCollector.m26664o(13648);
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < this.f10575c; i2++) {
                File b = bVar.mo9195b(i2);
                if (!z) {
                    m9391c(b);
                } else if (b.exists()) {
                    File a = bVar.mo9192a(i2);
                    b.renameTo(a);
                    long j = bVar.f10596b[i2];
                    long length = a.length();
                    bVar.f10596b[i2] = length;
                    this.f10584m = (this.f10584m - j) + length;
                }
            }
            this.f10577e++;
            bVar.f10598d = null;
            if (bVar.f10597c || z) {
                bVar.f10597c = true;
                this.f10576d.write("CLEAN " + bVar.f10595a + bVar.mo9193a() + '\n');
                if (z) {
                    long j2 = this.f10586o;
                    this.f10586o = 1 + j2;
                    bVar.f10599e = j2;
                }
            } else {
                this.f10585n.remove(bVar.f10595a);
                this.f10576d.write("REMOVE " + bVar.f10595a + '\n');
            }
            this.f10576d.flush();
            if (this.f10584m > this.f10583l || mo9180b()) {
                this.f10578f.submit(this.f10587p);
            }
            MethodCollector.m26664o(13648);
            return;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException();
        MethodCollector.m26664o(13648);
        throw illegalStateException2;
    }

    /* renamed from: a */
    private static void m9389a(File file, File file2, boolean z) {
        MethodCollector.m26663i(13485);
        if (z) {
            m9391c(file2);
        }
        if (file.renameTo(file2)) {
            MethodCollector.m26664o(13485);
            return;
        }
        IOException iOException = new IOException();
        MethodCollector.m26664o(13485);
        throw iOException;
    }
}
