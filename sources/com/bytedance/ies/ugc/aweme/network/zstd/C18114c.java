package com.bytedance.ies.ugc.aweme.network.zstd;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.C89032a;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.ugc.aweme.network.zstd.c */
public final class C18114c {

    /* renamed from: a */
    public static final C18114c f43110a = new C18114c();

    /* renamed from: b */
    private static final Keva f43111b = Keva.getRepo("zstd_dict_file_repo");

    /* renamed from: c */
    private static final Map<String, byte[]> f43112c = new LinkedHashMap();

    /* renamed from: d */
    private static Map<String, String> f43113d;

    private C18114c() {
    }

    static {
        Covode.recordClassIndex(20754);
    }

    /* renamed from: a */
    public final synchronized void mo28871a(Map<String, String> map) {
        MethodCollector.m26663i(10325);
        f43113d = map;
        MethodCollector.m26664o(10325);
    }

    /* renamed from: a */
    public final synchronized byte[] mo28872a(String str) {
        byte[] bArr;
        MethodCollector.m26663i(10009);
        C89219l.m154721d(str, "");
        Map<String, byte[]> map = f43112c;
        bArr = map.get(str);
        if (bArr == null) {
            File file = new File(f43111b.getString(str, ""));
            if (file.exists()) {
                bArr = m33717a(new FileInputStream(file));
                map.put(str, bArr);
            }
        }
        MethodCollector.m26664o(10009);
        return bArr;
    }

    /* renamed from: a */
    private static byte[] m33717a(InputStream inputStream) {
        MethodCollector.m26663i(10329);
        C89219l.m154721d(inputStream, "");
        byte[] bArr = new byte[4096];
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                while (true) {
                    int read = inputStream.read(bArr, 0, 4096);
                    if (read != -1) {
                        byteArrayOutputStream2.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        C89219l.m154716b(byteArray, "");
                        C89146c.m154636a(byteArrayOutputStream, null);
                        inputStream.close();
                        MethodCollector.m26664o(10329);
                        return byteArray;
                    }
                }
            } catch (Throwable th) {
                C89146c.m154636a(byteArrayOutputStream, th);
                MethodCollector.m26664o(10329);
                throw th;
            }
        } catch (IOException e) {
            MethodCollector.m26664o(10329);
            throw e;
        } catch (Throwable th2) {
            if (e == null) {
                inputStream.close();
            } else {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    C89032a.m154603a(e, e2);
                }
            }
            MethodCollector.m26664o(10329);
            throw th2;
        }
    }

    /* renamed from: b */
    public final synchronized String mo28873b(String str) {
        String str2;
        MethodCollector.m26663i(10160);
        C89219l.m154721d(str, "");
        Map<String, String> map = f43113d;
        if (map != null) {
            str2 = map.get(str);
        } else {
            str2 = null;
        }
        if (str2 instanceof String) {
            Integer e = C89361p.m154863e(str2);
            if (e != null) {
                e.intValue();
                String string = f43111b.getString(str2, null);
                if (string == null || !new File(string).exists()) {
                    MethodCollector.m26664o(10160);
                    return "";
                }
                MethodCollector.m26664o(10160);
                return str2;
            }
            MethodCollector.m26664o(10160);
            return "";
        }
        MethodCollector.m26664o(10160);
        return str2;
    }

    /* renamed from: a */
    public final synchronized void mo28870a(String str, String str2) {
        MethodCollector.m26663i(10327);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        f43111b.storeString(str, str2);
        MethodCollector.m26664o(10327);
    }
}
