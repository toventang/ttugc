package com.bytedance.common.utility;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.common.utility.j */
public abstract class AbstractC13621j {

    /* renamed from: a */
    public static AbstractC13621j f33100a = new C13610e();

    /* renamed from: com.bytedance.common.utility.j$a */
    public static class C13622a {

        /* renamed from: a */
        public boolean f33101a;

        /* renamed from: b */
        public Map<String, String> f33102b;

        static {
            Covode.recordClassIndex(15649);
        }
    }

    /* renamed from: a */
    public abstract String mo21869a(String str, List<Pair<String, String>> list, Map<String, String> map);

    /* renamed from: a */
    public abstract String mo21870a(String str, Map<String, String> map);

    /* renamed from: a */
    public abstract String mo21871a(String str, byte[] bArr, Map<String, String> map);

    /* renamed from: b */
    public byte[] mo21877b(String str, byte[] bArr, Map<String, String> map) {
        return null;
    }

    static {
        Covode.recordClassIndex(15648);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m24470a(byte[] r4) {
        /*
            r3 = 0
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x001b }
            r0 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0)     // Catch:{ all -> 0x001b }
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x001b }
            r1.<init>(r2)     // Catch:{ all -> 0x001b }
            r1.write(r4)     // Catch:{ all -> 0x0018 }
            r1.close()     // Catch:{ all -> 0x0018 }
            byte[] r0 = r2.toByteArray()
            return r0
        L_0x0018:
            r0 = move-exception
            r3 = r1
            goto L_0x001c
        L_0x001b:
            r0 = move-exception
        L_0x001c:
            if (r3 == 0) goto L_0x0021
            r3.close()
        L_0x0021:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.AbstractC13621j.m24470a(byte[]):byte[]");
    }

    /* renamed from: a */
    public final String mo21876a(String str, byte[] bArr, boolean z, String str2) {
        HashMap hashMap = new HashMap();
        if (z) {
            try {
                bArr = m24470a(bArr);
                hashMap.put("Content-Encoding", "gzip");
            } catch (Exception e) {
                throw new C13585b(0, e.getMessage());
            }
        }
        if (!C13627m.m24498a(str2)) {
            hashMap.put("Content-Type", str2);
        }
        return mo21871a(str, bArr, hashMap);
    }
}
