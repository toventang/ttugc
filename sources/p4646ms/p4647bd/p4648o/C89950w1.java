package p4646ms.p4647bd.p4648o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* renamed from: ms.bd.o.w1 */
public class C89950w1 {

    /* renamed from: a */
    private static final String f203835a = ((String) C89889h.m155966a(16777217, 0, 0, "93d4b2", new byte[]{38, 53}));

    static {
        MethodCollector.m26663i(1179);
        Covode.recordClassIndex(106047);
        C89889h.m155966a(16777217, 0, 0, "3cc882", new byte[]{25, 61, 81, 18, 58});
        MethodCollector.m26664o(1179);
    }

    /* renamed from: a */
    private static String m156068a(BufferedInputStream bufferedInputStream) {
        int read;
        MethodCollector.m26663i(1109);
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
                C89889h.m155966a(16777217, 0, 0, "50f0b0", new byte[]{33, 59, 22});
            }
        } while (read >= 4096);
        String sb2 = sb.toString();
        MethodCollector.m26664o(1109);
        return sb2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:47:0x00ed */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf A[SYNTHETIC, Splitter:B:38:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d7 A[SYNTHETIC, Splitter:B:43:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0100 A[SYNTHETIC, Splitter:B:57:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0118 A[SYNTHETIC, Splitter:B:62:0x0118] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0130  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m156069a(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 359
        */
        throw new UnsupportedOperationException("Method not decompiled: p4646ms.p4647bd.p4648o.C89950w1.m156069a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static synchronized String m156067a(Context context) {
        String str;
        String a;
        synchronized (C89950w1.class) {
            MethodCollector.m26663i(1176);
            try {
                StringBuilder sb = new StringBuilder();
                if (C58016d.f132222c == null || !C58016d.f132224e) {
                    C58016d.f132222c = context.getFilesDir();
                }
                StringBuilder append = sb.append(C58016d.f132222c.getAbsolutePath()).append((String) C89889h.m155966a(16777217, 0, 0, "9d7614", new byte[]{103}));
                String str2 = f203835a;
                String sb2 = append.append(str2).toString();
                if (!new File(sb2).exists() || (a = m156069a(sb2)) == null || a.length() <= 0) {
                    InputStream open = context.getResources().getAssets().open(str2);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = open.read(bArr, 0, 4096);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(sb2);
                    fileOutputStream.write(byteArrayOutputStream.toByteArray());
                    fileOutputStream.close();
                    m156069a(((String) C89889h.m155966a(16777217, 0, 0, "6a9c34", new byte[]{36, 107, 71, 24, 8, 99, 98, 23, 63, 115})) + sb2);
                    str = m156069a(sb2);
                    if (str == null || str.length() == 0) {
                        RandomAccessFile randomAccessFile = new RandomAccessFile(sb2, (String) C89889h.m155966a(16777217, 0, 0, "3cfe12", new byte[]{48, 118}));
                        randomAccessFile.seek(16);
                        randomAccessFile.write(new byte[]{2});
                        randomAccessFile.close();
                        str = m156069a(sb2);
                    }
                    if (str == null || str.length() == 0) {
                        str = (String) C89889h.m155966a(16777217, 0, 0, "c274b7", new byte[]{34, 11, 24, 1, 3, 29, 69, 33, 84, 75, 64, 11, 24, 1, 3, 29});
                    }
                    MethodCollector.m26664o(1176);
                    return str;
                }
                MethodCollector.m26664o(1176);
                return a;
            } catch (Throwable unused) {
                str = (String) C89889h.m155966a(16777217, 0, 0, "3055d6", new byte[]{114, 9, 26, 0, 5, 28, 21, 41, 71, 64, 18, 6, 111, 110, 117, 26, 108, 80, 58, 88});
            }
        }
    }
}
