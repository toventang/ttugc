package androidx.core.p036g;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;

/* renamed from: androidx.core.g.h */
public final class C0698h {

    /* renamed from: a */
    private static final Object f2755a = new Object();

    /* renamed from: b */
    private static char[] f2756b = new char[24];

    static {
        Covode.recordClassIndex(777);
    }

    /* renamed from: a */
    public static void m2457a(long j, PrintWriter printWriter) {
        char c;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (f2755a) {
            int length = f2756b.length;
            char[] cArr = f2756b;
            int i4 = 1;
            if (j == 0) {
                cArr[0] = '0';
            } else {
                if (j > 0) {
                    c = '+';
                } else {
                    c = '-';
                    j = -j;
                }
                int i5 = (int) (j % 1000);
                int floor = (int) Math.floor((double) (j / 1000));
                if (floor > 86400) {
                    i = floor / 86400;
                    floor -= 86400 * i;
                } else {
                    i = 0;
                }
                if (floor > 3600) {
                    i2 = floor / 3600;
                    floor -= i2 * 3600;
                } else {
                    i2 = 0;
                }
                if (floor > 60) {
                    i3 = floor / 60;
                    floor -= i3 * 60;
                } else {
                    i3 = 0;
                }
                cArr[0] = c;
                int a = m2456a(cArr, i, 'd', 1, false);
                if (a != 1) {
                    z = true;
                } else {
                    z = false;
                }
                int a2 = m2456a(cArr, i2, 'h', a, z);
                if (a2 != 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int a3 = m2456a(cArr, i3, 'm', a2, z2);
                if (a3 != 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int a4 = m2456a(cArr, i5, 'm', m2456a(cArr, floor, 's', a3, z3), true);
                cArr[a4] = 's';
                i4 = 1 + a4;
            }
            printWriter.print(new String(f2756b, 0, i4));
        }
    }

    /* renamed from: a */
    private static int m2456a(char[] cArr, int i, char c, int i2, boolean z) {
        int i3;
        if (!z && i <= 0) {
            return i2;
        }
        if (i > 99) {
            int i4 = i / 100;
            cArr[i2] = (char) (i4 + 48);
            i3 = i2 + 1;
            i -= i4 * 100;
        } else {
            i3 = i2;
        }
        if (i > 9 || i2 != i3) {
            int i5 = i / 10;
            cArr[i3] = (char) (i5 + 48);
            i3++;
            i -= i5 * 10;
        }
        cArr[i3] = (char) (i + 48);
        int i6 = i3 + 1;
        cArr[i6] = c;
        return i6 + 1;
    }
}
