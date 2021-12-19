package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import okhttp3.internal.C90084c;
import p4632k.C89427i;

/* renamed from: okhttp3.internal.e.e */
public final class C90115e {

    /* renamed from: a */
    static final C89427i f204553a = C89427i.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b */
    static final String[] f204554b = new String[64];

    /* renamed from: c */
    static final String[] f204555c = new String[256];

    /* renamed from: d */
    private static final String[] f204556d = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    private C90115e() {
    }

    static {
        Covode.recordClassIndex(106287);
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f204555c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C90084c.m156407a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f204554b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            String[] strArr3 = f204554b;
            strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
        }
        String[] strArr4 = f204554b;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i5 = 0;
        do {
            int i6 = iArr2[i5];
            int i7 = 0;
            do {
                int i8 = iArr[i7];
                String[] strArr5 = f204554b;
                int i9 = i8 | i6;
                strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
                i7++;
            } while (i7 <= 0);
            i5++;
        } while (i5 < 3);
        while (true) {
            String[] strArr6 = f204554b;
            if (i < strArr6.length) {
                if (strArr6[i] == null) {
                    strArr6[i] = f204555c[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    static IllegalArgumentException m156502a(String str, Object... objArr) {
        throw new IllegalArgumentException(C90084c.m156407a(str, objArr));
    }

    /* renamed from: b */
    static IOException m156504b(String str, Object... objArr) {
        throw new IOException(C90084c.m156407a(str, objArr));
    }

    /* renamed from: a */
    static String m156503a(boolean z, int i, int i2, byte b, byte b2) {
        String a;
        String str;
        String str2;
        String[] strArr = f204556d;
        if (b < strArr.length) {
            a = strArr[b];
        } else {
            a = C90084c.m156407a("0x%02x", Byte.valueOf(b));
        }
        if (b2 == 0) {
            str = "";
        } else {
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    if (b2 == 1) {
                        str = "ACK";
                    } else {
                        str = f204555c[b2];
                    }
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr2 = f204554b;
                    if (b2 < strArr2.length) {
                        str = strArr2[b2];
                    } else {
                        str = f204555c[b2];
                    }
                    if (b == 5) {
                        if ((b2 & 4) != 0) {
                            str = str.replace("HEADERS", "PUSH_PROMISE");
                        }
                    } else if (b == 0 && (b2 & 32) != 0) {
                        str = str.replace("PRIORITY", "COMPRESSED");
                    }
                }
            }
            str = f204555c[b2];
        }
        Object[] objArr = new Object[5];
        if (z) {
            str2 = "<<";
        } else {
            str2 = ">>";
        }
        objArr[0] = str2;
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = a;
        objArr[4] = str;
        return C90084c.m156407a("%s 0x%08x %5d %-13s %s", objArr);
    }
}
