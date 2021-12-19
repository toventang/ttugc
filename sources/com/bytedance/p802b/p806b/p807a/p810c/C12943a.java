package com.bytedance.p802b.p806b.p807a.p810c;

import com.bytedance.covode.number.Covode;
import com.bytedance.p802b.p806b.p807a.C12927a;
import com.bytedance.p802b.p841k.C13120c;
import com.bytedance.p802b.p841k.p843b.C13118b;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.b.b.a.c.a */
public final class C12943a {

    /* renamed from: a */
    public long f31518a;

    /* renamed from: b */
    public int f31519b;

    /* renamed from: c */
    public int f31520c;

    /* renamed from: d */
    public File f31521d;

    /* renamed from: e */
    public List<C12944b> f31522e;

    static {
        Covode.recordClassIndex(14779);
    }

    public final String toString() {
        return "LogFile{startID=" + this.f31518a + ", totalCount=" + this.f31519b + ", totalBytes=" + this.f31520c + ", source=" + this.f31521d + ", logList=" + this.f31522e + '}';
    }

    /* renamed from: a */
    public static C12943a m23226a(File file) {
        try {
            byte[] a = C13120c.m23591a(file);
            if (a != null) {
                C12943a a2 = m23227a(ByteBuffer.wrap(a));
                if (a2 != null) {
                    a2.f31521d = file;
                } else {
                    C13118b.m23586a(C12927a.f31456a, "fromMemory bytes is null");
                }
                return a2;
            }
            C13118b.m23586a(C12927a.f31456a, "fromFile bytes is null");
            return null;
        } catch (Throwable th) {
            C13118b.m23587a(C12927a.f31456a, "fromFile", th);
            return null;
        }
    }

    /* renamed from: a */
    public static C12943a m23227a(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getShort() != 2082) {
                return null;
            }
            long j = byteBuffer.getLong();
            int i = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = byteBuffer.getInt();
                i3 += i5;
                if (i3 > i2) {
                    return null;
                }
                byte[] bArr = new byte[i5];
                byteBuffer.get(bArr);
                arrayList.add(new C12944b(bArr));
            }
            return new C12943a(j, i, i2, arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    private C12943a(long j, int i, int i2, List<C12944b> list) {
        this.f31518a = j;
        this.f31519b = i;
        this.f31520c = i2;
        this.f31522e = list;
    }
}
