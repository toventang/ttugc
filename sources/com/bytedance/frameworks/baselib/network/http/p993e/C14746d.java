package com.bytedance.frameworks.baselib.network.http.p993e;

import android.content.SharedPreferences;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.AbstractC14747f;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.p995g.C14752b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.C22096s;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.d */
public class C14746d {

    /* renamed from: a */
    public static volatile int f35933a = 0;

    /* renamed from: b */
    public static volatile int f35934b = 0;

    /* renamed from: c */
    private static final String f35935c = C14746d.class.getSimpleName();

    /* renamed from: a */
    private static boolean m27020a(int i) {
        return i >= 4096 && i <= 5242880;
    }

    /* renamed from: a */
    public static byte[] m27025a(boolean z, Map<String, List<String>> map, InputStream inputStream, int[] iArr, AbstractC14747f fVar) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] a = m27024a(z, map, -1, inputStream, iArr, null);
            if (a == null || iArr[0] <= 0) {
                return null;
            }
            return a;
        } catch (Exception e) {
            fVar.mo23758a();
        } catch (Throwable unused) {
        }
        throw e;
    }

    static {
        Covode.recordClassIndex(16843);
    }

    /* renamed from: a */
    public static void m27018a(Closeable closeable) {
        m27026b(closeable);
    }

    /* renamed from: b */
    public static void m27026b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
                Logger.debug();
            }
        }
    }

    /* renamed from: a */
    public static void m27017a(SharedPreferences sharedPreferences) {
        f35933a = sharedPreferences.getInt("read_response_buff_init_size", 0);
        f35934b = sharedPreferences.getInt("read_response_buff_increase_size", 0);
    }

    /* renamed from: a */
    private static boolean m27021a(File file) {
        MethodCollector.m26663i(10843);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(10843);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(10843);
        return delete;
    }

    /* renamed from: a */
    public static boolean m27023a(String str) {
        int indexOf;
        if (str != null && (indexOf = str.indexOf("application/octet-stream")) >= 0 && str.indexOf("ssmix=", indexOf + 24) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m27019a(byte[] bArr, int i) {
        if (bArr != null && i > 0) {
            byte[] bArr2 = {-99, -114, Byte.MAX_VALUE, 90};
            int i2 = 0;
            do {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
                i2++;
            } while (i2 < i);
        }
    }

    /* renamed from: a */
    public static InputStream m27016a(InputStream inputStream, Map<String, List<String>> map, boolean z, C22096s sVar) {
        MethodCollector.m26663i(11128);
        if (z) {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream);
            MethodCollector.m26664o(11128);
            return gZIPInputStream;
        }
        C14731e.AbstractC14741j jVar = C14731e.f35914c;
        if (jVar == null) {
            MethodCollector.m26664o(11128);
            return inputStream;
        }
        InputStream a = jVar.mo23742a(inputStream, map, sVar);
        MethodCollector.m26664o(11128);
        return a;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x00d7 */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00eb A[SYNTHETIC, Splitter:B:74:0x00eb] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m27022a(java.io.InputStream r15, long r16, com.bytedance.frameworks.baselib.network.http.AbstractC14747f r18, java.lang.String r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p993e.C14746d.m27022a(java.io.InputStream, long, com.bytedance.frameworks.baselib.network.http.f, java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static byte[] m27024a(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, int[] iArr, C22096s sVar) {
        int length;
        MethodCollector.m26663i(10988);
        if (i <= 0) {
            i = 5242880;
        }
        if (i < 1048576) {
            i = 1048576;
        }
        if (inputStream == null) {
            MethodCollector.m26664o(10988);
            return null;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            inputStream = m27016a(inputStream, map, z, sVar);
            int i2 = 32768;
            if (m27020a(f35933a)) {
                i2 = f35933a;
            }
            int i3 = 102400;
            if (m27020a(f35934b)) {
                i3 = f35934b;
            }
            byte[] bArr = new byte[i2];
            int i4 = 0;
            while (true) {
                try {
                    if (i4 + 4096 > bArr.length) {
                        if (bArr.length < i3) {
                            length = bArr.length + i3;
                        } else {
                            length = bArr.length * 2;
                        }
                        byte[] bArr2 = new byte[length];
                        System.arraycopy(bArr, 0, bArr2, 0, i4);
                        bArr = bArr2;
                    }
                    int read = inputStream.read(bArr, i4, bArr.length - i4);
                    if (read <= 0) {
                        break;
                    }
                    i4 += read;
                    if (i4 > i) {
                        C14752b bVar = new C14752b(i, (long) i4);
                        MethodCollector.m26664o(10988);
                        throw bVar;
                    }
                } catch (EOFException e) {
                    if (!z || i4 <= 0) {
                        MethodCollector.m26664o(10988);
                        throw e;
                    }
                } catch (IOException e2) {
                    String message = e2.getMessage();
                    if (!z || i4 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                        MethodCollector.m26664o(10988);
                        throw e2;
                    }
                } catch (OutOfMemoryError unused) {
                    m27026b(inputStream);
                    MethodCollector.m26664o(10988);
                    return null;
                }
            }
            if (i4 > 0) {
                if (sVar != null) {
                    sVar.f52170M.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    sVar.f52170M.put("streamReadByteCount", Long.valueOf((long) i4));
                }
                iArr[0] = i4;
                return bArr;
            }
            m27026b(inputStream);
            MethodCollector.m26664o(10988);
            return null;
        } finally {
            m27026b(inputStream);
            MethodCollector.m26664o(10988);
        }
    }
}
