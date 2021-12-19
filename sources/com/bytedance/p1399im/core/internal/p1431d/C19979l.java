package com.bytedance.p1399im.core.internal.p1431d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1407c.C19512f;
import com.bytedance.p1399im.core.proto.Response;
import net.jpountz.lz4.LZ4Exception;
import net.jpountz.lz4.LZ4Factory;

/* renamed from: com.bytedance.im.core.internal.d.l */
public final class C19979l {
    static {
        Covode.recordClassIndex(22823);
    }

    /* renamed from: a */
    private static byte[] m37705a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, bArr.length * 3);
        } catch (LZ4Exception e) {
            e.printStackTrace();
            C19512f.m36457b("imsdk", "SSEncodeAndDecode lz4Decompress", e);
            return LZ4Factory.fastestInstance().safeDecompressor().decompress(bArr, 51200);
        }
    }

    /* renamed from: a */
    public static Response m37704a(String str, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            if ("__lz4".equals(str)) {
                bArr = m37705a(bArr);
            }
            return Response.ADAPTER.decode(bArr);
        } catch (Exception e) {
            e.printStackTrace();
            C19512f.m36457b("imsdk", "SSEncodeAndDecode decode", e);
            C19955b bVar = new C19955b(-2003);
            bVar.setStackTrace(e.getStackTrace());
            throw bVar;
        }
    }
}
