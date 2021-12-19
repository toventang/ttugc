package com.bytedance.disk.p966h;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.parcel.MigrationItem;
import com.bytedance.disk.parcel.MigrationOpt;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.p1746v.p1747a.C23535b;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.bytedance.disk.h.e */
public final class C14476e {

    /* renamed from: com.bytedance.disk.h.e$b */
    public interface AbstractC14478b {
        static {
            Covode.recordClassIndex(16557);
        }

        /* renamed from: a */
        void mo23290a(MigrationItem migrationItem);
    }

    static {
        Covode.recordClassIndex(16555);
    }

    /* renamed from: com.bytedance.disk.h.e$a */
    public static class C14477a extends IOException {
        static {
            Covode.recordClassIndex(16556);
        }

        public C14477a(String str) {
            super(str);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|(1:3)|4|5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m26457a(java.io.File r1) {
        /*
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x0009 }
            if (r0 == 0) goto L_0x0009
            m26465d(r1)     // Catch:{ Exception -> 0x0009 }
        L_0x0009:
            boolean r0 = m26462b(r1)     // Catch:{ Exception -> 0x000e }
            return r0
        L_0x000e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.disk.p966h.C14476e.m26457a(java.io.File):boolean");
    }

    /* renamed from: b */
    private static boolean m26462b(File file) {
        MethodCollector.m26663i(2617);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(2617);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(2617);
        return delete;
    }

    /* renamed from: c */
    private static void m26464c(File file) {
        if (!file.isDirectory()) {
            boolean exists = file.exists();
            if (m26462b(file)) {
                return;
            }
            if (!exists) {
                throw new FileNotFoundException("file does not exist: ".concat(String.valueOf(file)));
            }
            throw new IOException("unable to delete file: ".concat(String.valueOf(file)));
        } else if (file.exists()) {
            m26465d(file);
            if (!m26462b(file)) {
                throw new IOException("unable to delete directory " + file + ".");
            }
        }
    }

    /* renamed from: d */
    private static void m26465d(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e = null;
                for (File file2 : listFiles) {
                    try {
                        m26464c(file2);
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (e != null) {
                    throw e;
                }
                return;
            }
            throw new IOException("Failed to list contents of ".concat(String.valueOf(file)));
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    /* renamed from: a */
    private static boolean m26456a(MigrationItem migrationItem) {
        String b;
        Iterator<String> it = C23535b.m44236b(null).iterator();
        while (true) {
            if (!it.hasNext()) {
                b = C23535b.m44235b();
                break;
            }
            if (migrationItem.f35012c.f35022d.startsWith(it.next())) {
                b = C23535b.m44237c();
                break;
            }
        }
        long d = C14473c.m26449d(b) - 104857600;
        if (d > 0 && d > C14473c.m26447b(migrationItem.f35012c.f35021c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m26458a(String str) {
        Objects.requireNonNull(str, "Source must not be null");
        File file = new File(str);
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + str + "' does not exist");
        } else if (file.canRead()) {
            return true;
        } else {
            throw new IOException("Source `" + str + "' can't read");
        }
    }

    /* renamed from: a */
    private static int m26453a(MigrationItem migrationItem, File file, File file2) {
        int i;
        MethodCollector.m26663i(2036);
        if (file == null) {
            NullPointerException nullPointerException = new NullPointerException("Source must not be null");
            MethodCollector.m26664o(2036);
            throw nullPointerException;
        } else if (file2 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("Destination must not be null");
            MethodCollector.m26664o(2036);
            throw nullPointerException2;
        } else if (!file.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Source '" + file + "' does not exist");
            MethodCollector.m26664o(2036);
            throw fileNotFoundException;
        } else if (!file.isDirectory()) {
            IOException iOException = new IOException("Source '" + file + "' is not a directory");
            MethodCollector.m26664o(2036);
            throw iOException;
        } else if (migrationItem.mo23314d()) {
            MethodCollector.m26664o(2036);
            return 4;
        } else if (migrationItem.mo23312c()) {
            MethodCollector.m26664o(2036);
            return 3;
        } else {
            try {
                migrationItem.f35017h.close();
                if (file.renameTo(file2)) {
                    i = 5;
                } else {
                    i = 6;
                }
                migrationItem.f35017h.open();
                MethodCollector.m26664o(2036);
                return i;
            } catch (Exception e) {
                MethodCollector.m26664o(2036);
                throw e;
            } catch (Throwable th) {
                migrationItem.f35017h.open();
                MethodCollector.m26664o(2036);
                throw th;
            }
        }
    }

    /* renamed from: b */
    private static int m26459b(MigrationItem migrationItem, File file, File file2) {
        int i;
        MethodCollector.m26663i(2149);
        if (file == null) {
            NullPointerException nullPointerException = new NullPointerException("Source must not be null");
            MethodCollector.m26664o(2149);
            throw nullPointerException;
        } else if (file2 == null) {
            NullPointerException nullPointerException2 = new NullPointerException("Destination must not be null");
            MethodCollector.m26664o(2149);
            throw nullPointerException2;
        } else if (!file.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Source '" + file + "' does not exist");
            MethodCollector.m26664o(2149);
            throw fileNotFoundException;
        } else if (file.isDirectory()) {
            IOException iOException = new IOException("Source '" + file + "' is a directory");
            MethodCollector.m26664o(2149);
            throw iOException;
        } else if (migrationItem.mo23314d()) {
            MethodCollector.m26664o(2149);
            return 4;
        } else if (migrationItem.mo23312c()) {
            MethodCollector.m26664o(2149);
            return 3;
        } else {
            try {
                migrationItem.f35017h.close();
                if (file.renameTo(file2)) {
                    i = 5;
                } else {
                    i = 6;
                }
                migrationItem.f35017h.open();
                MethodCollector.m26664o(2149);
                return i;
            } catch (Exception e) {
                MethodCollector.m26664o(2149);
                throw e;
            } catch (Throwable th) {
                migrationItem.f35017h.open();
                MethodCollector.m26664o(2149);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public static int m26454a(MigrationItem migrationItem, File file, File file2, AbstractC14478b bVar) {
        int b = m26459b(migrationItem, file, file2);
        if (b == 5) {
            if (bVar != null && migrationItem.f35012c.f35024f == 1) {
                MigrationItem a = MigrationItem.m26472a(migrationItem, true);
                a.f35012c.f35021c = file.getPath();
                a.f35012c.f35022d = file2.getPath();
                a.f35012c.f35024f = 1;
                a.f35015f = 5;
                a.f35014e = System.currentTimeMillis() - a.f35013d;
                bVar.mo23290a(a);
                MigrationItem.C14482a.m26483a(a);
            }
            return 5;
        } else if (b != 6) {
            return b;
        } else {
            if (m26456a(migrationItem)) {
                return m26460b(migrationItem, file, file2, bVar);
            }
            return 6;
        }
    }

    /* renamed from: b */
    private static int m26460b(MigrationItem migrationItem, File file, File file2, AbstractC14478b bVar) {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        MethodCollector.m26663i(2456);
        int i = 4;
        if (migrationItem.mo23314d()) {
            MethodCollector.m26664o(2456);
            return 4;
        }
        int i2 = 3;
        if (migrationItem.mo23312c()) {
            MethodCollector.m26664o(2456);
            return 3;
        } else if (!file.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Failed to copy from->" + file + " to->" + file2 + " because of srcFile not exist");
            MethodCollector.m26664o(2456);
            throw fileNotFoundException;
        } else if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            IOException iOException = new IOException("Failed to copy same path from->" + file + " to->" + file2);
            MethodCollector.m26664o(2456);
            throw iOException;
        } else if (file2.getParentFile() != null && !file2.getParentFile().exists() && !file2.getParentFile().mkdirs()) {
            IOException iOException2 = new IOException("Failed to copy from->" + file + " to->" + file2 + " because of dest parent mkdir failed");
            MethodCollector.m26664o(2456);
            throw iOException2;
        } else if (!file2.exists() || file2.canWrite()) {
            long length = file.length();
            if (length != -1) {
                if (migrationItem.f35012c.f35024f == 1) {
                    migrationItem.f35012c.f35025g = length;
                }
                long lastModified = file.lastModified();
                try {
                    byte[] bArr = new byte[4096];
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(file2);
                        while (!migrationItem.mo23314d()) {
                            try {
                                if (migrationItem.mo23312c()) {
                                    C14473c.m26444a(fileInputStream);
                                    C14473c.m26444a(fileOutputStream);
                                    MethodCollector.m26664o(2456);
                                    return i2;
                                }
                                int read = fileInputStream.read(bArr);
                                if (read >= 0) {
                                    fileOutputStream.write(bArr, 0, read);
                                    i = 4;
                                    i2 = 3;
                                } else {
                                    fileOutputStream.flush();
                                    fileOutputStream.getFD().sync();
                                    C14473c.m26444a(fileInputStream);
                                    C14473c.m26444a(fileOutputStream);
                                    long lastModified2 = file.lastModified();
                                    if (file.length() == file2.length() && lastModified == lastModified2) {
                                        file2.setLastModified(file.lastModified());
                                        if (bVar != null) {
                                            MigrationItem a = MigrationItem.C14482a.m26482a();
                                            a.f35012c = MigrationOpt.m26484a(migrationItem.f35012c);
                                            a.f35011b = -1;
                                            a.f35015f = -1;
                                            a.f35013d = System.currentTimeMillis();
                                            a.f35014e = -1;
                                            a.f35010a = migrationItem.f35010a;
                                            a.f35017h = migrationItem.f35017h;
                                            a.f35016g = migrationItem.f35016g;
                                            a.f35012c.f35021c = file.getPath();
                                            a.f35012c.f35022d = file2.getPath();
                                            a.f35012c.f35024f = 1;
                                            a.f35015f = 5;
                                            a.f35014e = System.currentTimeMillis() - a.f35013d;
                                            bVar.mo23290a(a);
                                            MigrationItem.C14482a.m26483a(a);
                                        }
                                        MethodCollector.m26664o(2456);
                                        return 5;
                                    }
                                    C14477a aVar = new C14477a("Failed to copy full contents from->" + file + " to->" + file2);
                                    MethodCollector.m26664o(2456);
                                    throw aVar;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                C14473c.m26444a(fileInputStream);
                                C14473c.m26444a(fileOutputStream);
                                MethodCollector.m26664o(2456);
                                throw th;
                            }
                        }
                        C14473c.m26444a(fileInputStream);
                        C14473c.m26444a(fileOutputStream);
                        MethodCollector.m26664o(2456);
                        return i;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = null;
                        C14473c.m26444a(fileInputStream);
                        C14473c.m26444a(fileOutputStream);
                        MethodCollector.m26664o(2456);
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = null;
                    fileOutputStream = null;
                    C14473c.m26444a(fileInputStream);
                    C14473c.m26444a(fileOutputStream);
                    MethodCollector.m26664o(2456);
                    throw th;
                }
            } else {
                IOException iOException3 = new IOException("Failed to copy from->" + file + " to->" + file2 + " fileLen=-1");
                MethodCollector.m26664o(2456);
                throw iOException3;
            }
        } else {
            IOException iOException4 = new IOException("Failed to copy from->" + file + " to->" + file2 + " because of destFile cant write!");
            MethodCollector.m26664o(2456);
            throw iOException4;
        }
    }

    /* renamed from: c */
    private static int m26463c(MigrationItem migrationItem, File file, File file2, FileFilter fileFilter, List<String> list, AbstractC14478b bVar) {
        File[] listFiles;
        int a;
        if (file2.exists()) {
            if (!file2.isDirectory()) {
                throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " destDir is not dir");
            }
        } else if (file2.mkdirs()) {
            file2.setLastModified(file.lastModified());
        } else {
            throw new IOException("Failed to copyDir from->" + file + " to->" + file2 + " destDir mkdirs failed");
        }
        if (file2.canWrite()) {
            if (fileFilter == null) {
                listFiles = file.listFiles();
            } else {
                listFiles = file.listFiles(fileFilter);
            }
            if (listFiles != null) {
                for (int i = 0; i < listFiles.length; i++) {
                    File file3 = new File(file2, listFiles[i].getName());
                    if (list == null || !list.contains(listFiles[i].getPath())) {
                        if (listFiles[i].isDirectory()) {
                            a = m26455a(migrationItem, listFiles[i], file3, fileFilter, list, bVar);
                        } else {
                            a = m26454a(migrationItem, listFiles[i], file3, bVar);
                        }
                        if (a != 5) {
                            return a;
                        }
                    }
                }
                return 5;
            }
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " srcDir listFiles failed");
        }
        throw new IOException("Failed to copyDir from->" + file + " to->" + file2 + " dest cant write");
    }

    /* renamed from: a */
    public static int m26455a(MigrationItem migrationItem, File file, File file2, FileFilter fileFilter, List<String> list, AbstractC14478b bVar) {
        int a = m26453a(migrationItem, file, file2);
        if (a == 5) {
            if (bVar != null && !TextUtils.equals(file.getPath(), migrationItem.f35012c.f35019a)) {
                MigrationItem a2 = MigrationItem.m26472a(migrationItem, true);
                a2.f35012c.f35021c = file.getPath();
                a2.f35012c.f35022d = file2.getPath();
                a2.f35012c.f35024f = 2;
                a2.f35015f = 5;
                a2.f35014e = System.currentTimeMillis() - a2.f35013d;
                bVar.mo23290a(a2);
                MigrationItem.C14482a.m26483a(a2);
            }
            return 5;
        } else if (a != 6) {
            return a;
        } else {
            if (m26456a(migrationItem)) {
                return m26461b(migrationItem, file, file2, fileFilter, list, bVar);
            }
            return 6;
        }
    }

    /* renamed from: b */
    private static int m26461b(MigrationItem migrationItem, File file, File file2, FileFilter fileFilter, List<String> list, AbstractC14478b bVar) {
        File[] listFiles;
        if (file == null) {
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " srcDir not exist");
        } else if (file.exists() && !file.isDirectory()) {
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " srcDir is not dir");
        } else if (file2 == null) {
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " destDir is null");
        } else if (!file2.exists() || file2.isDirectory()) {
            ArrayList arrayList = new ArrayList();
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                if (fileFilter == null) {
                    listFiles = file.listFiles();
                } else {
                    listFiles = file.listFiles(fileFilter);
                }
                if (listFiles != null && listFiles.length > 0) {
                    arrayList = new ArrayList(listFiles.length);
                    for (File file3 : listFiles) {
                        arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                    }
                }
            }
            if (list != null) {
                arrayList.addAll(list);
            }
            if (arrayList.size() <= 0) {
                arrayList = null;
            }
            return m26463c(migrationItem, file, file2, fileFilter, arrayList, bVar);
        } else {
            throw new FileNotFoundException("Failed to copyDir from->" + file + " to->" + file2 + " destDir is not dir");
        }
    }
}
