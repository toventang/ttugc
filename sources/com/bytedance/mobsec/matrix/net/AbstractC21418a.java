package com.bytedance.mobsec.matrix.net;

import android.content.Context;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p4646ms.p4647bd.p4648o.C89865a;
import p4646ms.p4647bd.p4648o.C89868b;
import p4646ms.p4647bd.p4648o.C89889h;

/* renamed from: com.bytedance.mobsec.matrix.net.a */
public abstract class AbstractC21418a extends C89868b.AbstractC89869a {
    static {
        Covode.recordClassIndex(25041);
    }

    /* renamed from: a */
    protected static void m40207a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
                C89889h.m155966a(16777217, 0, 0, "685339", new byte[]{42, 57, 121, 68, 5});
            }
        }
    }

    /* renamed from: a */
    protected static void m40208a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                C89889h.m155966a(16777217, 0, 0, "dd5cf3", new byte[]{120, 101, 121, 20, 86});
            }
        }
    }

    /* renamed from: a */
    public abstract Object[] mo35018a(String str, String str2);

    /* renamed from: a */
    public abstract Object[] mo35019a(String str, byte[] bArr, String str2);

    /* renamed from: b */
    public abstract Object[] mo35020b(String str, String str2);

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.String[] */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.String */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p4646ms.p4647bd.p4648o.C89868b.AbstractC89869a
    /* renamed from: a */
    public final Object mo35023a(int i, int i2, long j, String str, Object obj) {
        boolean z;
        String[] strArr = {C89889h.m155966a(16777217, 0, 0, "4576bb", new byte[]{36, 57, 64, 80, 82, 124, 51, 90, 118, 99, 55, 58, 77, 81, 78, 124, 56, 26, 40, 79, 11, 3, 97, 112, 115, 80, 3})};
        try {
            Context context = C89865a.f203764a.f203765b;
            int i3 = 0;
            while (true) {
                if (i3 <= 0) {
                    if (context.checkPermission(strArr[0], Process.myPid(), Process.myUid()) != 0) {
                        break;
                    }
                    i3++;
                } else {
                    z = true;
                    break;
                }
            }
        } catch (Throwable unused) {
        }
        z = false;
        if (!z) {
            return null;
        }
        switch (i) {
            case 196609:
                Object[] objArr = (Object[]) obj;
                return mo35019a(str, (byte[]) objArr[0], (String) objArr[1]);
            case 196610:
                return mo35018a(str, (String) obj);
            case 196611:
                return mo35020b(str, (String) obj);
            default:
                return super.mo35023a(i, i2, j, str, obj);
        }
    }
}
