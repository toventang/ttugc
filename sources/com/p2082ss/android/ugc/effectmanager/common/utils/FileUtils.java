package com.p2082ss.android.ugc.effectmanager.common.utils;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.effectmanager.common.download.DownloadListener;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import p4600h.p4610e.C89146c;
import p4600h.p4610e.C89159j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.effectmanager.common.utils.FileUtils */
public final class FileUtils {
    private static final int BUFFER_SIZE = BUFFER_SIZE;
    public static final FileUtils INSTANCE = new FileUtils();
    private static final Charset US_ASCII = Charset.forName("US-ASCII");
    private static final Charset UTF_8 = Charset.forName("UTF-8");

    private FileUtils() {
    }

    public final int getBUFFER_SIZE() {
        return BUFFER_SIZE;
    }

    public final Charset getUS_ASCII() {
        return US_ASCII;
    }

    public final Charset getUTF_8() {
        return UTF_8;
    }

    public final boolean isSdcardWritable() {
        try {
            return C89219l.m154714a((Object) "mounted", (Object) Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean isSdcardAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        if (C89219l.m154714a((Object) "mounted", (Object) externalStorageState) || C89219l.m154714a((Object) "mounted_ro", (Object) externalStorageState)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(95515);
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final boolean deleteDir(File file) {
        try {
            deleteContents(file);
            if (file != null) {
                return m141908x9008fd84(file);
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public final boolean checkFileExists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    public final boolean ensureDirExists(File file) {
        C89219l.m154719c(file, "");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    public final synchronized void removeDir(String str) {
        MethodCollector.m26663i(8312);
        if (str == null) {
            MethodCollector.m26664o(8312);
            return;
        }
        removeDir(new File(str));
        MethodCollector.m26664o(8312);
    }

    public final boolean removeFile(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canWrite() || !m141908x9008fd84(file)) {
            return false;
        }
        return true;
    }

    public final OutputStream getFileOutputStream(String str) {
        MethodCollector.m26663i(8463);
        FileOutputStream fileOutputStream = null;
        if (str == null) {
            MethodCollector.m26664o(8463);
            return null;
        }
        File parentFile = new File(str).getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(8463);
        return fileOutputStream;
    }

    public final InputStream getFileStream(String str) {
        MethodCollector.m26663i(8167);
        FileInputStream fileInputStream = null;
        if (str == null) {
            MethodCollector.m26664o(8167);
            return null;
        }
        File file = new File(str);
        if (checkFileExists(file.getPath())) {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
            MethodCollector.m26664o(8167);
            return fileInputStream;
        }
        MethodCollector.m26664o(8167);
        return null;
    }

    public final long getFolderSize(File file) {
        File[] listFiles;
        long folderSize;
        long j = 0;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return 0;
        }
        int length = listFiles.length;
        for (int i = 0; i < length; i++) {
            File file2 = listFiles[i];
            C89219l.m154709a((Object) file2, "");
            if (file2.isFile()) {
                folderSize = listFiles[i].length();
            } else {
                folderSize = getFolderSize(listFiles[i]);
            }
            j += folderSize;
        }
        return j;
    }

    public final String joinSeparator(String str) {
        C89219l.m154719c(str, "");
        String str2 = File.separator;
        C89219l.m154709a((Object) str2, "");
        if (C89361p.m154876c(str, str2, false)) {
            return str;
        }
        return str + File.separator;
    }

    public final void removeDir(File file) {
        File[] listFiles;
        if (file != null && file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            if (listFiles.length == 0) {
                m141908x9008fd84(file);
                return;
            }
            for (File file2 : listFiles) {
                C89219l.m154709a((Object) file2, "");
                if (file2.isDirectory()) {
                    removeDir(file2);
                } else {
                    m141908x9008fd84(file2);
                }
            }
            m141908x9008fd84(file);
        }
    }

    /* renamed from: com_ss_android_ugc_effectmanager_common_utils_FileUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m141908x9008fd84(File file) {
        MethodCollector.m26663i(7871);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(7871);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(7871);
        return delete;
    }

    public final void deleteContents(File file) {
        if (file != null) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    C89219l.m154709a((Object) file2, "");
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!m141908x9008fd84(file2)) {
                        throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
        }
    }

    public final String readFully(Reader reader) {
        MethodCollector.m26663i(8313);
        C89219l.m154719c(reader, "");
        try {
            Reader reader2 = reader;
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            for (int read = reader2.read(cArr); read != -1; read = reader2.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            C89219l.m154709a((Object) stringWriter2, "");
            C89146c.m154636a(reader, null);
            MethodCollector.m26664o(8313);
            return stringWriter2;
        } catch (Throwable th) {
            C89146c.m154636a(reader, th);
            MethodCollector.m26664o(8313);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062 A[SYNTHETIC, Splitter:B:30:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006c A[SYNTHETIC, Splitter:B:35:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a A[SYNTHETIC, Splitter:B:42:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getFileContent(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils.getFileContent(java.lang.String):java.lang.String");
    }

    public final long copyStream(InputStream inputStream, OutputStream outputStream) {
        C89219l.m154719c(inputStream, "");
        C89219l.m154719c(outputStream, "");
        return copyStream(inputStream, outputStream, 0, null);
    }

    public final String combineFilePath(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        StringBuilder append = sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return append.append(str2).toString();
    }

    public final File createFile(String str, boolean z) {
        File file = null;
        if (str == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            file = new File(str);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                } else {
                    try {
                        File parentFile = file.getParentFile();
                        if (parentFile == null) {
                            C89219l.m154707a();
                        }
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return file;
    }

    public final String addPathSuffix(String str, String str2) {
        C89219l.m154719c(str2, "");
        if (str == null) {
            return null;
        }
        String str3 = File.separator;
        C89219l.m154709a((Object) str3, "");
        if (C89361p.m154876c(str, str3, false)) {
            return C89361p.m154823b(str, 1) + str2 + File.separator;
        }
        return str + str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r3 == null) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066 A[SYNTHETIC, Splitter:B:34:0x0066] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long writeToExternal(java.io.InputStream r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils.writeToExternal(java.io.InputStream, java.lang.String):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r4 == null) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077 A[SYNTHETIC, Splitter:B:43:0x0077] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long writeToExternal(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils.writeToExternal(java.lang.String, java.lang.String):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x014a A[Catch:{ all -> 0x014c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void unZip(java.lang.String r12, java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 340
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.common.utils.FileUtils.unZip(java.lang.String, java.lang.String):void");
    }

    public final synchronized void rename(String str, String str2, boolean z) {
        MethodCollector.m26663i(8616);
        if (str == null) {
            MethodCollector.m26664o(8616);
        } else if (str2 == null) {
            MethodCollector.m26664o(8616);
        } else {
            rename$default(this, new File(str), new File(str2), false, 4, (Object) null);
            MethodCollector.m26664o(8616);
        }
    }

    public final synchronized void rename(File file, File file2, boolean z) {
        MethodCollector.m26663i(8770);
        if (file == null) {
            MethodCollector.m26664o(8770);
        } else if (file2 == null) {
            MethodCollector.m26664o(8770);
        } else {
            if (z && file2.exists()) {
                C89159j.m154656g(file2);
            }
            if (file.renameTo(file2)) {
                MethodCollector.m26664o(8770);
                return;
            }
            EPLog.m141899e("FileUtils", "rename " + file.getName() + " to " + file2.getName() + " failed!");
            IOException iOException = new IOException();
            MethodCollector.m26664o(8770);
            throw iOException;
        }
    }

    public final long copyStream(InputStream inputStream, OutputStream outputStream, long j, DownloadListener downloadListener) {
        MethodCollector.m26663i(8615);
        C89219l.m154719c(inputStream, "");
        C89219l.m154719c(outputStream, "");
        byte[] bArr = new byte[BUFFER_SIZE];
        int read = inputStream.read(bArr);
        long j2 = 0;
        while (read > 0) {
            if (outputStream != null) {
                outputStream.write(bArr, 0, read);
            }
            j2 += (long) read;
            if (j2 < j && j > 0 && downloadListener != null) {
                downloadListener.onProgress((int) ((((float) j2) / ((float) j)) * 100.0f), j);
            }
            read = inputStream.read(bArr);
        }
        if (downloadListener != null) {
            downloadListener.onProgress(100, j);
        }
        MethodCollector.m26664o(8615);
        return j2;
    }

    public final synchronized void rename(File file, File file2, boolean z, boolean z2) {
        MethodCollector.m26663i(8772);
        if (file == null) {
            MethodCollector.m26664o(8772);
        } else if (file2 == null) {
            MethodCollector.m26664o(8772);
        } else {
            if (z && !z2 && file2.exists()) {
                C89159j.m154656g(file2);
            }
            if (!file.renameTo(file2)) {
                if (!z2 || !z) {
                    EPLog.m141899e("FileUtils", "rename " + file.getName() + " to " + file2.getName() + " failed!");
                    IOException iOException = new IOException();
                    MethodCollector.m26664o(8772);
                    throw iOException;
                }
                C89159j.m154656g(file2);
                if (!file.renameTo(file2)) {
                    EPLog.m141899e("FileUtils", "rename " + file.getName() + " to " + file2.getName() + " failed!");
                    IOException iOException2 = new IOException();
                    MethodCollector.m26664o(8772);
                    throw iOException2;
                }
            }
            MethodCollector.m26664o(8772);
        }
    }

    public final synchronized void rename(String str, String str2, boolean z, boolean z2) {
        MethodCollector.m26663i(8617);
        if (str == null) {
            MethodCollector.m26664o(8617);
        } else if (str2 == null) {
            MethodCollector.m26664o(8617);
        } else {
            rename(new File(str), new File(str2), z, z2);
            MethodCollector.m26664o(8617);
        }
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, File file, File file2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        fileUtils.rename(file, file2, z);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        fileUtils.rename(str, str2, z);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, File file, File file2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        fileUtils.rename(file, file2, z, z2);
    }

    public static /* synthetic */ void rename$default(FileUtils fileUtils, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        fileUtils.rename(str, str2, z, z2);
    }
}
