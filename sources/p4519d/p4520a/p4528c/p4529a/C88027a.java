package p4519d.p4520a.p4528c.p4529a;

import com.bytedance.covode.number.Covode;

/* renamed from: d.a.c.a.a */
public final class C88027a {

    /* renamed from: a */
    public static final int[] f199920a;

    /* renamed from: b */
    public static final C88027a f199921b = new C88027a();

    /* renamed from: c */
    private static final String f199922c = f199922c;

    private C88027a() {
    }

    static {
        Covode.recordClassIndex(104053);
        int[] iArr = new int[256];
        int i = 0;
        do {
            iArr[i] = -1;
            i++;
        } while (i <= 255);
        int length = f199922c.length();
        for (int i2 = 0; i2 < length; i2++) {
            iArr[f199922c.charAt(i2)] = i2;
        }
        f199920a = iArr;
    }
}
