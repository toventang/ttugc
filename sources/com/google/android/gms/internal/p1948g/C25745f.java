package com.google.android.gms.internal.p1948g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import p4519d.p4520a.p4530d.p4531a.C88041a;

/* renamed from: com.google.android.gms.internal.g.f */
public final class C25745f {

    /* renamed from: a */
    private static final OutputStream f60864a = new C25744e();

    static {
        Covode.recordClassIndex(31160);
    }

    /* renamed from: a */
    public static byte[] m49693a(InputStream inputStream) {
        MethodCollector.m26663i(11105);
        C25743d.m49692a(inputStream);
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int i = 8192;
        int i2 = 0;
        while (i2 < 2147483639) {
            int min = Math.min(i, C88041a.f199945c - i2);
            byte[] bArr = new byte[min];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min) {
                int read = inputStream.read(bArr, i3, min - i3);
                if (read == -1) {
                    byte[] a = m49694a(arrayDeque, i2);
                    MethodCollector.m26664o(11105);
                    return a;
                }
                i3 += read;
                i2 += read;
            }
            long j = ((long) i) << 1;
            if (j > 2147483647L) {
                i = Integer.MAX_VALUE;
            } else if (j < -2147483648L) {
                i = Integer.MIN_VALUE;
            } else {
                i = (int) j;
            }
        }
        if (inputStream.read() == -1) {
            byte[] a2 = m49694a(arrayDeque, C88041a.f199945c);
            MethodCollector.m26664o(11105);
            return a2;
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("input is too large to fit in a byte array");
        MethodCollector.m26664o(11105);
        throw outOfMemoryError;
    }

    /* renamed from: a */
    private static byte[] m49694a(Deque<byte[]> deque, int i) {
        byte[] bArr = new byte[i];
        int i2 = i;
        while (i2 > 0) {
            byte[] removeFirst = deque.removeFirst();
            int min = Math.min(i2, removeFirst.length);
            System.arraycopy(removeFirst, 0, bArr, i - i2, min);
            i2 -= min;
        }
        return bArr;
    }
}
