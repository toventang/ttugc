package com.bytedance.covode.p922a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: com.bytedance.covode.a.b */
public final class C13802b {

    /* renamed from: a */
    private static File f33567a;

    /* renamed from: com.bytedance.covode.a.b$a */
    public interface AbstractC13803a {
        static {
            Covode.recordClassIndex(15851);
        }

        /* renamed from: a */
        void mo22208a();
    }

    static {
        Covode.recordClassIndex(15850);
    }

    /* renamed from: a */
    public static File m24913a(AbstractC13803a aVar) {
        File file;
        File file2 = f33567a;
        if (file2 == null) {
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                file = listFiles[i];
                if ("record".equals(file.getName())) {
                    break;
                }
                i++;
            }
        }
        file = null;
        if (file == null) {
            return null;
        }
        File file3 = new File(f33567a, "record.dat");
        try {
            m24914a(file, file3, aVar);
            return file3;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static File m24912a(C13801a aVar) {
        File file;
        File file2 = f33567a;
        if (file2 != null) {
            return file2;
        }
        ApplicationInfo applicationInfo = aVar.f33565b.getApplicationInfo();
        if (aVar.f33564a == null) {
            file = new File(applicationInfo.dataDir, "covode");
        }
        try {
            String str = aVar.f33565b.getPackageManager().getPackageInfo(aVar.f33565b.getPackageName(), 0).versionName;
            File file3 = new File(file, str + "-" + m24911a(new File(applicationInfo.sourceDir)));
            f33567a = file3;
            file3.mkdirs();
            if (!f33567a.exists()) {
                return null;
            }
            f33567a.getAbsolutePath();
            return f33567a;
        } catch (PackageManager.NameNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private static long m24911a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            if (length >= 0) {
                long j = length - 65536;
                if (j < 0) {
                    j = 0;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                while (true) {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() != reverseBytes) {
                        length--;
                        if (length < j) {
                            throw new ZipException("End Of Central Directory signature not found");
                        }
                    } else {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        randomAccessFile.seek(4294967295L & ((long) Integer.reverseBytes(randomAccessFile.readInt())));
                        byte[] bArr = new byte[8192];
                        int read = randomAccessFile.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                        while (read != -1) {
                            crc32.update(bArr, 0, read);
                            reverseBytes2 -= (long) read;
                            if (reverseBytes2 == 0) {
                                break;
                            }
                            read = randomAccessFile.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                        }
                        return crc32.getValue();
                    }
                }
            } else {
                throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
            }
        } finally {
            randomAccessFile.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012e, code lost:
        if (r3 == null) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m24914a(java.io.File r14, java.io.File r15, com.bytedance.covode.p922a.C13802b.AbstractC13803a r16) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.covode.p922a.C13802b.m24914a(java.io.File, java.io.File, com.bytedance.covode.a.b$a):void");
    }
}
