package com.bytedance.boost_multidex;

import android.app.ActivityManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class Utility {
    static {
        Covode.recordClassIndex(15332);
    }

    static void clearDirFiles(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                Monitor.get().logWarning("Failed to list secondary dex dir content (" + file.getPath() + ").");
                return;
            }
            for (File file2 : listFiles) {
                Monitor.get().logInfo("Trying to delete old file " + file2.getPath() + " of size " + file2.length());
                if (!m24021x7135d7c0(file2)) {
                    Monitor.get().logWarning("Failed to delete old file " + file2.getPath());
                } else {
                    Monitor.get().logInfo("Deleted old file " + file2.getPath());
                }
            }
        }
    }

    static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Monitor.get().logWarning("Failed to close resource", e);
            }
        }
    }

    static long doFileCheckSum(File file) {
        long j;
        Throwable th;
        MethodCollector.m26663i(8551);
        if (!file.exists()) {
            Monitor.get().logInfo("File is not exist: " + file.getPath());
            MethodCollector.m26664o(8551);
            return 0;
        }
        if (Monitor.get().isEnableNativeCheckSum()) {
            try {
                j = BoostNative.obtainCheckSum(file.getPath());
                if (j == 0) {
                }
            } catch (Throwable th2) {
                Monitor.get().logWarning("Failed to native obtainCheckSum in " + file.getPath(), th2);
            }
            MethodCollector.m26664o(8551);
            return j;
        }
        Monitor.get().logWarning("Fall back to java impl");
        CheckedInputStream checkedInputStream = null;
        byte[] bArr = new byte[8192];
        try {
            CheckedInputStream checkedInputStream2 = new CheckedInputStream(new FileInputStream(file), new Adler32());
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    checkedInputStream = checkedInputStream2;
                    closeQuietly(checkedInputStream);
                    MethodCollector.m26664o(8551);
                    throw th;
                }
            } while (checkedInputStream2.read(bArr) >= 0);
            j = checkedInputStream2.getChecksum().getValue();
            closeQuietly(checkedInputStream2);
            MethodCollector.m26664o(8551);
            return j;
        } catch (Throwable th4) {
            th = th4;
            closeQuietly(checkedInputStream);
            MethodCollector.m26664o(8551);
            throw th;
        }
    }

    static long doZipCheckSum(File file) {
        Throwable th;
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                long length = randomAccessFile2.length() - 22;
                if (length >= 0) {
                    long j = length - 65536;
                    if (j < 0) {
                        j = 0;
                    }
                    int reverseBytes = Integer.reverseBytes(101010256);
                    while (true) {
                        randomAccessFile2.seek(length);
                        if (randomAccessFile2.readInt() != reverseBytes) {
                            length--;
                            if (length < j) {
                                throw new ZipException("End Of Central Directory signature not found");
                            }
                        } else {
                            randomAccessFile2.skipBytes(2);
                            randomAccessFile2.skipBytes(2);
                            randomAccessFile2.skipBytes(2);
                            randomAccessFile2.skipBytes(2);
                            long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile2.readInt())) & 4294967295L;
                            CRC32 crc32 = new CRC32();
                            randomAccessFile2.seek(4294967295L & ((long) Integer.reverseBytes(randomAccessFile2.readInt())));
                            byte[] bArr = new byte[8192];
                            int read = randomAccessFile2.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                            while (read != -1) {
                                crc32.update(bArr, 0, read);
                                reverseBytes2 -= (long) read;
                                if (reverseBytes2 == 0) {
                                    break;
                                }
                                read = randomAccessFile2.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                            }
                            long value = crc32.getValue();
                            closeQuietly(randomAccessFile2);
                            return value;
                        }
                    }
                } else {
                    throw new ZipException("File too short to be a zip file: " + randomAccessFile2.length());
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                closeQuietly(randomAccessFile);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            closeQuietly(randomAccessFile);
            throw th;
        }
    }

    static File ensureDirCreated(File file, String str) {
        File file2 = new File(file, str);
        mkdirChecked(file2);
        return file2;
    }

    static void expandFieldArray(Object obj, String str, Object[] objArr) {
        Field findField = findField(obj.getClass(), str);
        Object[] objArr2 = (Object[]) findField.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        findField.set(obj, objArr3);
    }

    static Constructor findConstructor(Class<?> cls, Class<?>... clsArr) {
        Constructor<?> declaredConstructor = cls.getDeclaredConstructor(clsArr);
        if (!declaredConstructor.isAccessible()) {
            declaredConstructor.setAccessible(true);
        }
        return declaredConstructor;
    }

    static Field findField(Class<?> cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        if (!declaredField.isAccessible()) {
            declaredField.setAccessible(true);
        }
        return declaredField;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:2:0x0003 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r0v10 */
    static Field findFieldRecursively(Class<?> cls, String str) {
        Class cls2 = cls;
        while (cls2 != 0) {
            try {
                cls2 = findField(cls2, str);
                return cls2;
            } catch (NoSuchFieldException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + cls);
    }

    static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:2:0x0003 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v12 */
    static Method findMethodRecursively(Class<?> cls, String str, Class<?>... clsArr) {
        Class cls2 = cls;
        while (cls2 != 0) {
            try {
                cls2 = findMethod(cls2, str, clsArr);
                return cls2;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + cls);
    }

    static String getCurProcessName(Context context) {
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) m24020x93a0de31(context, "activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    static boolean isBetterUseApkBuf() {
        Runtime runtime = Runtime.getRuntime();
        long freeSpace = Environment.getDataDirectory().getFreeSpace();
        long maxMemory = runtime.maxMemory() - runtime.totalMemory();
        Monitor.get().logInfo("Memory remains " + maxMemory + ", free space " + freeSpace);
        return maxMemory > 128000000 || freeSpace < 20000000;
    }

    static boolean isOptimizeProcess(String str) {
        return str != null && str.endsWith(":boost_multidex");
    }

    static void mkdirChecked(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                Monitor.get().logError("Failed to create dir " + file.getPath() + ". Parent file is null.");
            } else {
                Monitor.get().logError("Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite());
            }
            throw new IOException("Failed to create directory " + file.getPath());
        }
    }

    static byte[] obtainBytesFromInputStream(InputStream inputStream) {
        MethodCollector.m26663i(9320);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            closeQuietly(byteArrayOutputStream);
            MethodCollector.m26664o(9320);
        }
    }

    static byte[] obtainBytesInFile(File file) {
        Throwable th;
        RandomAccessFile randomAccessFile;
        IOException e;
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file.getPath(), "r");
            try {
                byte[] bArr = new byte[((int) randomAccessFile.length())];
                randomAccessFile.readFully(bArr);
                closeQuietly(randomAccessFile);
                return bArr;
            } catch (IOException e2) {
                e = e2;
                try {
                    Monitor.get().logWarning("Fail to get bytes of file", e);
                    closeQuietly(randomAccessFile);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile2 = randomAccessFile;
                    closeQuietly(randomAccessFile2);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = null;
            Monitor.get().logWarning("Fail to get bytes of file", e);
            closeQuietly(randomAccessFile);
            return null;
        } catch (Throwable th3) {
            th = th3;
            closeQuietly(randomAccessFile2);
            throw th;
        }
    }

    static byte[] obtainEntryBytesInZip(ZipFile zipFile, ZipEntry zipEntry) {
        Throwable th;
        InputStream inputStream;
        MethodCollector.m26663i(9175);
        InputStream inputStream2 = null;
        IOException e = null;
        for (int i = 3; i > 0; i--) {
            try {
                inputStream = zipFile.getInputStream(zipEntry);
                try {
                    byte[] obtainBytesFromInputStream = obtainBytesFromInputStream(inputStream);
                    closeQuietly(inputStream);
                    MethodCollector.m26664o(9175);
                    return obtainBytesFromInputStream;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    closeQuietly(inputStream2);
                    MethodCollector.m26664o(9175);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                inputStream = null;
                closeQuietly(inputStream);
            } catch (Throwable th3) {
                th = th3;
                closeQuietly(inputStream2);
                MethodCollector.m26664o(9175);
                throw th;
            }
        }
        MethodCollector.m26664o(9175);
        throw e;
    }

    static File obtainEntryFileFromInputStream(InputStream inputStream, File file) {
        MethodCollector.m26663i(9025);
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        Monitor.get().logInfo("Extracting " + createTempFile.getPath());
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            if (createTempFile.setReadOnly()) {
                Monitor.get().logInfo("Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return file;
                }
                IOException iOException = new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
                MethodCollector.m26664o(9025);
                throw iOException;
            }
            IOException iOException2 = new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            MethodCollector.m26664o(9025);
            throw iOException2;
        } finally {
            closeQuietly(fileOutputStream);
            m24021x7135d7c0(createTempFile);
            MethodCollector.m26664o(9025);
        }
    }

    static File obtainEntryFileInZip(ZipFile zipFile, ZipEntry zipEntry, File file) {
        MethodCollector.m26663i(9023);
        IOException e = null;
        for (int i = 3; i > 0; i--) {
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            try {
                File obtainEntryFileFromInputStream = obtainEntryFileFromInputStream(inputStream, file);
                closeQuietly(inputStream);
                MethodCollector.m26664o(9023);
                return obtainEntryFileFromInputStream;
            } catch (IOException e2) {
                e = e2;
                closeQuietly(inputStream);
            } catch (Throwable th) {
                closeQuietly(inputStream);
                MethodCollector.m26664o(9023);
                throw th;
            }
        }
        MethodCollector.m26664o(9023);
        throw e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void obtainZipForEntryFileInZip(java.util.zip.ZipFile r8, java.util.zip.ZipEntry r9, java.io.File r10) {
        /*
        // Method dump skipped, instructions count: 261
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.boost_multidex.Utility.obtainZipForEntryFileInZip(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):void");
    }

    static boolean storeBytesToFile(byte[] bArr, File file) {
        Throwable th;
        boolean z;
        IOException e;
        MethodCollector.m26663i(9480);
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                closeQuietly(fileOutputStream2);
                z = true;
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    Monitor.get().logError("fail to store bytes to file", e);
                    closeQuietly(fileOutputStream);
                    z = false;
                    MethodCollector.m26664o(9480);
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    closeQuietly(fileOutputStream);
                    MethodCollector.m26664o(9480);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = fileOutputStream2;
                closeQuietly(fileOutputStream);
                MethodCollector.m26664o(9480);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            Monitor.get().logError("fail to store bytes to file", e);
            closeQuietly(fileOutputStream);
            z = false;
            MethodCollector.m26664o(9480);
            return z;
        }
        MethodCollector.m26664o(9480);
        return z;
    }

    /* renamed from: com_bytedance_boost_multidex_Utility_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m24021x7135d7c0(File file) {
        MethodCollector.m26663i(8401);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(8401);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(8401);
        return delete;
    }

    /* renamed from: com_bytedance_boost_multidex_Utility_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService */
    public static Object m24020x93a0de31(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(9483);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(9483);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
