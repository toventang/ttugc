package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.BitSet;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.t */
public final class C39164t {

    /* renamed from: a */
    public int f92376a = 30;

    /* renamed from: b */
    public final int f92377b;

    /* renamed from: c */
    public final FileOutputStream f92378c;

    /* renamed from: d */
    public final int f92379d;

    /* renamed from: e */
    public final int f92380e;

    static {
        Covode.recordClassIndex(46787);
    }

    /* renamed from: a */
    public final void mo67943a(int i) {
        byte[] array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array();
        C89219l.m154716b(array, "");
        mo67945a(array, 3);
    }

    /* renamed from: b */
    public final void mo67946b(int i) {
        byte[] array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array();
        C89219l.m154716b(array, "");
        mo67945a(array, 4);
    }

    /* renamed from: a */
    public final void mo67944a(byte[] bArr) {
        MethodCollector.m26663i(368);
        C89219l.m154721d(bArr, "");
        int i = 12;
        if (m79466a(bArr, 12, new byte[]{86, 80, 56, 88})) {
            i = 30;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i2 = i + 4;
            if (i2 < bArr.length) {
                boolean a = m79466a(bArr, i, new byte[]{65, 76, 80, 72});
                boolean a2 = m79466a(bArr, i, new byte[]{86, 80, 56, 76});
                boolean a3 = m79466a(bArr, i, new byte[]{86, 80, 56, 32});
                ByteBuffer order = ByteBuffer.wrap(bArr, i2, 4).order(ByteOrder.LITTLE_ENDIAN);
                C89219l.m154716b(order, "");
                int i3 = order.getInt();
                int i4 = i3 + (i3 & 1);
                if (a || a2 || a3) {
                    byteArrayOutputStream.write(bArr, i, i4 + 8);
                }
                i += i4 + 8;
            } else {
                mo67945a(new byte[]{65, 78, 77, 70}, 4);
                mo67946b(byteArrayOutputStream.size() + 16);
                mo67943a(0);
                mo67943a(0);
                mo67943a(this.f92379d - 1);
                mo67943a(this.f92380e - 1);
                mo67943a(1000 / this.f92376a);
                BitSet bitSet = new BitSet(8);
                bitSet.set(1, true);
                bitSet.set(0, false);
                byte[] byteArray = bitSet.toByteArray();
                C89219l.m154716b(byteArray, "");
                mo67945a(byteArray, byteArray.length);
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                C89219l.m154716b(byteArray2, "");
                mo67945a(byteArray2, byteArray2.length);
                MethodCollector.m26664o(368);
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo67945a(byte[] bArr, int i) {
        MethodCollector.m26663i(376);
        if (i > 0 && i <= bArr.length) {
            this.f92378c.write(bArr, 0, i);
        }
        MethodCollector.m26664o(376);
    }

    public C39164t(FileOutputStream fileOutputStream, int i, int i2) {
        C89219l.m154721d(fileOutputStream, "");
        this.f92378c = fileOutputStream;
        this.f92379d = i;
        this.f92380e = i2;
    }

    /* renamed from: a */
    private static boolean m79466a(byte[] bArr, int i, byte[] bArr2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (bArr[i] == bArr2[0]) {
            z = true;
        } else {
            z = false;
        }
        if (bArr[i + 1] == bArr2[1]) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bArr[i + 2] == bArr2[2]) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bArr[i + 3] == bArr2[3]) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z || !z2 || !z3 || !z4) {
            return false;
        }
        return true;
    }
}
