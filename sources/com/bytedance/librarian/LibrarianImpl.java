package com.bytedance.librarian;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.elf.ElfParser;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import dalvik.system.BaseDexClassLoader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* access modifiers changed from: package-private */
public class LibrarianImpl {

    /* renamed from: a */
    static final LibrarianImpl f48895a;

    /* renamed from: o */
    private static final String[] f48896o = {"log", "m", "stdc++", "dl", "c", "z", "android", "jnigraphics", "EGL", "GLESv1_CM", "GLESv2", "GLESv3", "OpenSLES", "OpenMAXAL"};

    /* renamed from: b */
    public final LibrarianMonitor f48897b;

    /* renamed from: c */
    final String[] f48898c = {"/system/lib64", "/vendor/lib64"};

    /* renamed from: d */
    private final File f48899d;

    /* renamed from: e */
    private final Map<String, LibRecorder> f48900e;

    /* renamed from: f */
    private final File f48901f;

    /* renamed from: g */
    private File f48902g;

    /* renamed from: h */
    private volatile boolean f48903h;

    /* renamed from: i */
    private ZipFile[] f48904i;

    /* renamed from: j */
    private String f48905j;

    /* renamed from: k */
    private ApplicationInfo f48906k;

    /* renamed from: l */
    private Map<String, String> f48907l;

    /* renamed from: m */
    private String[] f48908m;

    /* renamed from: n */
    private String f48909n;

    /* access modifiers changed from: package-private */
    public static class LibRecorder {

        /* renamed from: a */
        boolean f48910a;

        LibRecorder() {
        }

        public String toString() {
            return Boolean.toString(this.f48910a);
        }
    }

    /* access modifiers changed from: package-private */
    public class Locker {

        /* renamed from: b */
        private RandomAccessFile f48912b;

        /* renamed from: c */
        private FileLock f48913c;

        /* renamed from: d */
        private FileChannel f48914d;

        /* renamed from: e */
        private File f48915e;

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo34115b() {
            FileLock fileLock = this.f48913c;
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            this.f48915e.getPath();
            LibrarianImpl.m38969a(this.f48914d);
            LibrarianImpl.m38969a(this.f48912b);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo34114a() {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.f48915e, "rw");
            this.f48912b = randomAccessFile;
            try {
                this.f48914d = randomAccessFile.getChannel();
                try {
                    this.f48915e.getPath();
                    this.f48913c = this.f48914d.lock();
                    this.f48915e.getPath();
                } catch (IOException e) {
                    LibrarianImpl.m38969a(this.f48914d);
                    throw e;
                }
            } catch (IOException e2) {
                LibrarianImpl.m38969a(this.f48912b);
                throw e2;
            }
        }

        Locker(File file) {
            this.f48915e = file;
        }
    }

    /* renamed from: b */
    private String m38974b() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ZipFile[] zipFileArr = this.f48904i;
        for (ZipFile zipFile : zipFileArr) {
            if (zipFile != null) {
                String name = zipFile.getName();
                sb.append(name).append("#").append(zipFile.size()).append(":").append(new File(name).length()).append("|");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    static {
        String str;
        LibrarianMonitor librarianMonitor;
        Context context = Librarian.f48891a;
        Librarian.f48891a = null;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            File dir = context.getDir("librarian", 0);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            if (Librarian.f48892b != null) {
                str = Librarian.f48892b;
            } else {
                str = "default.version";
            }
            File file = new File(dir, str + "." + (new File(applicationInfo.sourceDir).lastModified() >> 8));
            File[] listFiles = dir.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (!file.getName().equals(file2.getName())) {
                        File[] listFiles2 = file2.listFiles();
                        if (listFiles2 != null) {
                            for (File file3 : listFiles2) {
                                m38984e(file3);
                            }
                        }
                        m38984e(file2);
                    }
                }
            }
            file.mkdirs();
            if (file.exists()) {
                if (Librarian.f48893c != null) {
                    librarianMonitor = Librarian.f48893c;
                } else {
                    librarianMonitor = new LibrarianMonitor();
                }
                f48895a = new LibrarianImpl(applicationInfo, file, librarianMonitor);
                return;
            }
            f48895a = null;
            return;
        }
        throw new LibrarianUnsatisfiedLinkError("you should call init first or use loadLibraryForModule.");
    }

    /* renamed from: a */
    private void m38968a() {
        String[] strArr;
        MethodCollector.m26663i(5168);
        if (this.f48903h) {
            MethodCollector.m26664o(5168);
            return;
        }
        synchronized (this) {
            try {
                if (!this.f48903h) {
                    File file = new File(this.f48906k.sourceDir);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(file);
                    if (!(Build.VERSION.SDK_INT < 21 || (strArr = this.f48906k.splitSourceDirs) == null || strArr.length == 0)) {
                        for (String str : strArr) {
                            arrayList.add(new File(str));
                        }
                    }
                    ZipFile[] zipFileArr = new ZipFile[arrayList.size()];
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        File file2 = (File) it.next();
                        int i2 = i + 1;
                        try {
                            zipFileArr[i] = new ZipFile(file2);
                        } catch (IOException e) {
                            new LibrarianUnsatisfiedLinkError("fail to get zip file " + file2.getName() + ", size " + file2.length() + ", exists " + file2.exists(), e).printStackTrace();
                        }
                        i = i2;
                    }
                    this.f48904i = zipFileArr;
                    this.f48902g = new File(this.f48906k.nativeLibraryDir);
                    HashMap hashMap = new HashMap();
                    this.f48907l = hashMap;
                    hashMap.put("arm64-v8a", "arm64");
                    this.f48907l.put("armeabi-v7a", "arm");
                    this.f48907l.put("armeabi", "arm");
                    String str2 = null;
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
                            str2 = (String) cls.getDeclaredMethod("vmInstructionSet", new Class[0]).invoke(cls.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]), new Object[0]);
                        } catch (Exception e2) {
                            new LibrarianUnsatisfiedLinkError("reflect err", e2);
                        }
                    }
                    this.f48905j = str2;
                    this.f48908m = Build.VERSION.SDK_INT < 21 ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : Build.SUPPORTED_ABIS;
                    this.f48903h = true;
                    MethodCollector.m26664o(5168);
                }
            } finally {
                MethodCollector.m26664o(5168);
            }
        }
    }

    /* renamed from: a */
    public static void m38969a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    private static List<String> m38975b(File file) {
        Throwable th;
        ElfParser elfParser = null;
        try {
            ElfParser elfParser2 = new ElfParser(file);
            try {
                List<String> a = elfParser2.mo34121a();
                Collections.sort(a);
                m38969a(elfParser2);
                return a;
            } catch (Throwable th2) {
                th = th2;
                elfParser = elfParser2;
                m38969a(elfParser);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            m38969a(elfParser);
            throw th;
        }
    }

    /* renamed from: c */
    private boolean m38981c(String str) {
        for (String str2 : this.f48898c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m38985e(String str) {
        if (this.f48905j == null) {
            return true;
        }
        String str2 = this.f48907l.get(str);
        String str3 = this.f48905j;
        if (str2 != null) {
            str = str2;
        }
        return str3.equals(str);
    }

    /* renamed from: f */
    private static String m38986f(String str) {
        return "lib" + str + ".so";
    }

    /* renamed from: a */
    private boolean m38973a(String str) {
        try {
            this.f48897b.mo34116a(str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            return false;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m38979c(java.io.File r6) {
        /*
            r5 = 5211(0x145b, float:7.302E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r0]
            r3 = 0
            java.util.zip.CheckedInputStream r2 = new java.util.zip.CheckedInputStream     // Catch:{ IOException -> 0x0032 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0032 }
            r1.<init>(r6)     // Catch:{ IOException -> 0x0032 }
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32     // Catch:{ IOException -> 0x0032 }
            r0.<init>()     // Catch:{ IOException -> 0x0032 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0032 }
        L_0x0019:
            int r0 = r2.read(r4)     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            if (r0 >= 0) goto L_0x0019
            java.util.zip.Checksum r0 = r2.getChecksum()     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            long r0 = r0.getValue()     // Catch:{ IOException -> 0x0031, all -> 0x002e }
            m38969a(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r0
        L_0x002e:
            r0 = move-exception
            r3 = r2
            goto L_0x003f
        L_0x0031:
            r3 = r2
        L_0x0032:
            r6.getPath()     // Catch:{ all -> 0x003e }
            m38969a(r3)
            r0 = 0
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r0
        L_0x003e:
            r0 = move-exception
        L_0x003f:
            m38969a(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.m38979c(java.io.File):long");
    }

    /* renamed from: d */
    private void m38982d(String str) {
        if (this.f48909n == null) {
            String[] strArr = this.f48908m;
            for (String str2 : strArr) {
                if (m38985e(str2)) {
                    String str3 = "lib/" + str2 + "/" + str;
                    ZipFile[] zipFileArr = this.f48904i;
                    for (ZipFile zipFile : zipFileArr) {
                        if (zipFile != null && zipFile.getEntry(str3) != null) {
                            this.f48909n = str2;
                            return;
                        }
                    }
                    continue;
                }
            }
            throw new LibrarianUnsatisfiedLinkError("can not ensure abi for " + str + ", check " + this.f48905j + ", apks " + m38974b());
        }
    }

    /* renamed from: e */
    private static boolean m38984e(File file) {
        MethodCollector.m26663i(5506);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(5506);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(5506);
        return delete;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private boolean m38983d(File file) {
        MethodCollector.m26663i(5275);
        m38982d(file.getName());
        String str = "lib/" + this.f48909n + "/" + file.getName();
        ZipFile[] zipFileArr = this.f48904i;
        for (ZipFile zipFile : zipFileArr) {
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    m38966a(inputStream, file);
                    file.getPath();
                    zipFile.getName();
                    m38969a(inputStream);
                    MethodCollector.m26664o(5275);
                    return true;
                } catch (Throwable th) {
                    m38969a(inputStream);
                    MethodCollector.m26664o(5275);
                    throw th;
                }
            }
        }
        MethodCollector.m26664o(5275);
        return false;
    }

    /* renamed from: b */
    private boolean m38978b(String str) {
        String str2;
        File[] fileArr;
        int i;
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= 23 || (str2 = this.f48905j) == null || !str2.contains("64")) {
            return false;
        }
        try {
            Field declaredField = BaseDexClassLoader.class.getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get((BaseDexClassLoader) getClass().getClassLoader());
            Field declaredField2 = obj.getClass().getDeclaredField("nativeLibraryDirectories");
            declaredField2.setAccessible(true);
            File[] fileArr2 = (File[]) declaredField2.get(obj);
            int length = fileArr2.length;
            File[] fileArr3 = new File[length];
            System.arraycopy(fileArr2, 0, fileArr3, 0, length);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            for (int i5 = 0; i5 < length; i5++) {
                File file = fileArr3[i5];
                if (this.f48899d.equals(file)) {
                    i2 = i5;
                } else if (this.f48902g.equals(file)) {
                    i4 = i5;
                } else if (new File(file, m38986f(str)).exists()) {
                    i3 = i5;
                }
            }
            if (i2 != -1) {
                fileArr = new File[length];
                m38971a(fileArr3, 0, i2);
                i = 1;
            } else {
                fileArr = new File[(length + 1)];
                fileArr[0] = this.f48899d;
                i = 0;
            }
            if (i3 != -1) {
                m38971a(fileArr3, i, i3);
                i++;
            }
            if (i4 != -1) {
                m38971a(fileArr3, i, i4);
                i++;
            }
            for (int length2 = length - this.f48898c.length; length2 < length; length2++) {
                if (!m38981c(fileArr3[length2].getAbsolutePath())) {
                    for (int i6 = i; i6 < length - 2; i6++) {
                        if (m38981c(fileArr3[i6].getAbsolutePath())) {
                            m38971a(fileArr3, length2, i6);
                        }
                    }
                }
            }
            if (i2 != -1) {
                System.arraycopy(fileArr3, 0, fileArr, 0, length);
            } else {
                System.arraycopy(fileArr3, 0, fileArr, 1, length);
            }
            declaredField2.set(obj, fileArr);
            return true;
        } catch (Exception e) {
            new LibrarianUnsatisfiedLinkError("opt lib dir err", e);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m38972a(File file) {
        if (!file.exists()) {
            file.getPath();
            return false;
        }
        m38982d(file.getName());
        long j = 0;
        String str = "lib/" + this.f48909n + "/" + file.getName();
        ZipFile[] zipFileArr = this.f48904i;
        int length = zipFileArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            ZipEntry entry = zipFileArr[i].getEntry(str);
            if (entry != null) {
                j = entry.getCrc();
                break;
            }
            i++;
        }
        if (j == m38979c(file)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m38977b(File file, boolean z) {
        MethodCollector.m26663i(5149);
        try {
            System.load(file.getPath());
            MethodCollector.m26664o(5149);
            return true;
        } catch (UnsatisfiedLinkError e) {
            if (!z) {
                file.getName();
                MethodCollector.m26664o(5149);
                return false;
            }
            LibrarianUnsatisfiedLinkError librarianUnsatisfiedLinkError = new LibrarianUnsatisfiedLinkError("finally fail to load " + file.getPath(), e);
            MethodCollector.m26664o(5149);
            throw librarianUnsatisfiedLinkError;
        }
    }

    /* renamed from: c */
    private void m38980c(File file, boolean z) {
        try {
            for (String str : m38975b(file)) {
                String substring = str.substring(3, str.length() - 3);
                String[] strArr = f48896o;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        mo34112a(substring, z);
                        break;
                    } else if (strArr[i].equals(substring)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } catch (IOException e) {
            throw new LibrarianUnsatisfiedLinkError("fail to load depended lib", e);
        }
    }

    /* renamed from: a */
    private void m38970a(File file, boolean z) {
        MethodCollector.m26663i(5139);
        String name = file.getName();
        synchronized (this) {
            try {
                Locker locker = new Locker(this.f48901f);
                try {
                    locker.mo34114a();
                    if (!m38983d(file)) {
                        if (!z) {
                            LibrarianUnsatisfiedLinkError librarianUnsatisfiedLinkError = new LibrarianUnsatisfiedLinkError("fail to extract ".concat(String.valueOf(name)));
                            MethodCollector.m26664o(5139);
                            throw librarianUnsatisfiedLinkError;
                        }
                    }
                    locker.mo34115b();
                } catch (IOException e) {
                    LibrarianUnsatisfiedLinkError librarianUnsatisfiedLinkError2 = new LibrarianUnsatisfiedLinkError("fail to extract ".concat(String.valueOf(name)), e);
                    MethodCollector.m26664o(5139);
                    throw librarianUnsatisfiedLinkError2;
                } catch (Throwable th) {
                    locker.mo34115b();
                    MethodCollector.m26664o(5139);
                    throw th;
                }
            } finally {
                MethodCollector.m26664o(5139);
            }
        }
    }

    /* renamed from: a */
    private static File m38966a(InputStream inputStream, File file) {
        MethodCollector.m26663i(5388);
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        createTempFile.getPath();
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[8192];
            int read = inputStream.read(bArr);
            while (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            if (createTempFile.setReadOnly()) {
                file.getPath();
                if (createTempFile.renameTo(file)) {
                    return file;
                }
                IOException iOException = new IOException("failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                MethodCollector.m26664o(5388);
                throw iOException;
            }
            IOException iOException2 = new IOException("failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            MethodCollector.m26664o(5388);
            throw iOException2;
        } finally {
            m38969a(fileOutputStream);
            m38984e(createTempFile);
            MethodCollector.m26664o(5388);
        }
    }

    /* renamed from: b */
    private void m38976b(String str, boolean z) {
        int i = Build.VERSION.SDK_INT;
        File file = new File(this.f48899d, m38986f(str));
        if (!m38973a(str)) {
            if (!file.exists() || !m38977b(file, false)) {
                m38968a();
                if (!m38978b(str) || !m38973a(str)) {
                    File a = m38967a(str, file, z);
                    m38980c(a, z);
                    if (a != file) {
                        if (!m38973a(str)) {
                            m38970a(file, z);
                        } else {
                            return;
                        }
                    }
                    m38977b(file, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1.f48910a == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        m38976b(r5, r6);
        r1.f48910a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(5100);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34112a(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            r3 = 5100(0x13ec, float:7.147E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r3)
            java.util.Map<java.lang.String, com.bytedance.librarian.LibrarianImpl$LibRecorder> r2 = r4.f48900e
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.bytedance.librarian.LibrarianImpl$LibRecorder> r0 = r4.f48900e     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r0.get(r5)     // Catch:{ all -> 0x0041 }
            com.bytedance.librarian.LibrarianImpl$LibRecorder r1 = (com.bytedance.librarian.LibrarianImpl.LibRecorder) r1     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x001b
            boolean r0 = r1.f48910a     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0025
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x001b:
            com.bytedance.librarian.LibrarianImpl$LibRecorder r1 = new com.bytedance.librarian.LibrarianImpl$LibRecorder
            r1.<init>()
            java.util.Map<java.lang.String, com.bytedance.librarian.LibrarianImpl$LibRecorder> r0 = r4.f48900e
            r0.put(r5, r1)
        L_0x0025:
            monitor-exit(r2)
            monitor-enter(r1)
            boolean r0 = r1.f48910a     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0030
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x0030:
            r4.m38976b(r5, r6)
            r0 = 1
            r1.f48910a = r0
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            return
        L_0x003b:
            r0 = move-exception
            monitor-exit(r1)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        L_0x0041:
            r0 = move-exception
            monitor-exit(r2)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.mo34112a(java.lang.String, boolean):void");
    }

    /* renamed from: a */
    private static void m38971a(File[] fileArr, int i, int i2) {
        if (i != i2) {
            File file = fileArr[i];
            fileArr[i] = fileArr[i2];
            fileArr[i2] = file;
        }
    }

    /* renamed from: a */
    private File m38967a(String str, File file, boolean z) {
        File file2 = new File(this.f48902g, m38986f(str));
        if (m38972a(file2)) {
            return file2;
        }
        m38970a(file, z);
        return file;
    }

    private LibrarianImpl(ApplicationInfo applicationInfo, File file, LibrarianMonitor librarianMonitor) {
        this.f48899d = file;
        this.f48897b = librarianMonitor;
        this.f48906k = applicationInfo;
        this.f48901f = new File(file, "process.lock");
        this.f48900e = new HashMap();
    }
}
