package p078c.p080b;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p078c.p079a.C1749a;
import p078c.p083d.C1762a;
import p078c.p083d.C1763b;

/* renamed from: c.b.d */
public final class C1756d {

    /* renamed from: a */
    private static final C1749a f5625a = C1749a.C1750a.f5617a;

    static {
        Covode.recordClassIndex(1926);
    }

    /* renamed from: a */
    public static C1752a m5890a(String str) {
        return new C1752a(str);
    }

    /* renamed from: b */
    public static long m5895b(Context context) {
        if (Environment.getDataDirectory() != null) {
            return m5896b(m5899d(context).getParent());
        }
        return -1;
    }

    /* renamed from: c */
    public static long m5897c(Context context) {
        if (Environment.getDataDirectory() != null) {
            return m5898c(m5899d(context).getParent());
        }
        return -1;
    }

    /* renamed from: d */
    private static File m5899d(Context context) {
        if (C58016d.f132222c != null && C58016d.f132224e) {
            return C58016d.f132222c;
        }
        File filesDir = context.getFilesDir();
        C58016d.f132222c = filesDir;
        return filesDir;
    }

    /* renamed from: a */
    public static String m5892a(Context context) {
        if (C58016d.f132220a == null || !C58016d.f132224e) {
            C58016d.f132220a = context.getExternalCacheDir();
        }
        return C58016d.f132220a.getParent();
    }

    /* renamed from: b */
    private static long m5896b(String str) {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(str);
            if (C1763b.m5924a()) {
                j = statFs.getBlockSizeLong();
                j2 = statFs.getAvailableBlocksLong();
            } else {
                j = (long) statFs.getBlockSize();
                j2 = (long) statFs.getAvailableBlocks();
            }
            return j * j2;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    private static long m5898c(String str) {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(str);
            if (C1763b.m5924a()) {
                j = statFs.getBlockSizeLong();
                j2 = statFs.getBlockCountLong();
            } else {
                j = (long) statFs.getBlockSize();
                j2 = (long) statFs.getBlockCount();
            }
            return j * j2;
        } catch (IllegalArgumentException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static Uri m5888a(Context context, String str) {
        return C1757e.m5902a(context, str, "image/jpeg");
    }

    /* renamed from: a */
    public static void m5894a(InputStream inputStream, OutputStream outputStream) {
        MethodCollector.m26663i(7956);
        try {
            byte[] bArr = new byte[4096];
            if (outputStream != null) {
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                    } else {
                        outputStream.flush();
                        return;
                    }
                }
            } else {
                IOException iOException = new IOException("Failed to copy input:" + inputStream + "output:" + outputStream);
                MethodCollector.m26664o(7956);
                throw iOException;
            }
        } finally {
            C1763b.m5922a(inputStream);
            C1763b.m5923a(outputStream);
            MethodCollector.m26664o(7956);
        }
    }

    /* renamed from: a */
    public static InputStream m5891a(Context context, Uri uri) {
        Uri uri2;
        MethodCollector.m26663i(8247);
        if (uri == null) {
            MethodCollector.m26664o(8247);
            return null;
        }
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || "file".equals(scheme)) {
            FileInputStream fileInputStream = new FileInputStream(uri.getPath());
            MethodCollector.m26664o(8247);
            return fileInputStream;
        }
        int i = Build.VERSION.SDK_INT;
        if (DocumentsContract.isDocumentUri(context, uri) && TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            String str = split[0];
            if (TextUtils.equals("image", str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                if (C1763b.m5925b()) {
                    uri2 = MediaStore.Images.Media.getContentUri("external_primary");
                }
            } else if (TextUtils.equals("video", str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                if (C1763b.m5925b()) {
                    uri2 = MediaStore.Video.Media.getContentUri("external_primary");
                }
            } else if (TextUtils.equals(DataType.AUDIO, str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                if (C1763b.m5925b()) {
                    uri2 = MediaStore.Audio.Media.getContentUri("external_primary");
                }
            } else {
                uri2 = null;
            }
            if (TextUtils.isEmpty(split[1])) {
                MethodCollector.m26664o(8247);
                return null;
            }
            InputStream openInputStream = context.getContentResolver().openInputStream(ContentUris.withAppendedId(uri2, Long.parseLong(split[1])));
            MethodCollector.m26664o(8247);
            return openInputStream;
        } else if (!"content".equals(scheme) || !"media".equals(uri.getAuthority())) {
            String a = C1762a.m5918a(context, uri);
            if (TextUtils.isEmpty(a) || !new File(a).exists()) {
                MethodCollector.m26664o(8247);
                return null;
            }
            FileInputStream fileInputStream2 = new FileInputStream(new File(a));
            MethodCollector.m26664o(8247);
            return fileInputStream2;
        } else {
            InputStream openInputStream2 = context.getContentResolver().openInputStream(uri);
            MethodCollector.m26664o(8247);
            return openInputStream2;
        }
    }

    /* renamed from: a */
    public static void m5893a(File file, FileOutputStream fileOutputStream) {
        Throwable th;
        MethodCollector.m26663i(7822);
        C1752a a = C1749a.m5881a(file);
        if (!a.exists()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Failed to copy from->" + a + "to->" + fileOutputStream.getFD() + "because of srcFile not exist");
            MethodCollector.m26664o(7822);
            throw fileNotFoundException;
        } else if (a.length() != -1) {
            fileOutputStream.getFD();
            FileInputStream fileInputStream = null;
            try {
                byte[] bArr = new byte[4096];
                FileInputStream fileInputStream2 = new FileInputStream(a);
                while (true) {
                    try {
                        int read = fileInputStream2.read(bArr);
                        if (read >= 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.flush();
                            fileOutputStream.getFD().sync();
                            C1763b.m5922a(fileInputStream2);
                            C1763b.m5923a(fileOutputStream);
                            MethodCollector.m26664o(7822);
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        C1763b.m5922a(fileInputStream);
                        C1763b.m5923a(fileOutputStream);
                        MethodCollector.m26664o(7822);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                C1763b.m5922a(fileInputStream);
                C1763b.m5923a(fileOutputStream);
                MethodCollector.m26664o(7822);
                throw th;
            }
        } else {
            IOException iOException = new IOException("Failed to copy from->" + a + " to->" + fileOutputStream.getFD() + " fileLen=-1");
            MethodCollector.m26664o(7822);
            throw iOException;
        }
    }

    /* renamed from: a */
    public static ParcelFileDescriptor m5889a(Context context, Uri uri, String str) {
        MethodCollector.m26663i(8112);
        ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, str);
        MethodCollector.m26664o(8112);
        return openFileDescriptor;
    }
}
