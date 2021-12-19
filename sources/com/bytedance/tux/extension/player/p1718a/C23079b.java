package com.bytedance.tux.extension.player.p1718a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.extension.player.a.b */
public final class C23079b {

    /* renamed from: a */
    public static final C23079b f54634a = new C23079b();

    private C23079b() {
    }

    static {
        Covode.recordClassIndex(27003);
    }

    /* renamed from: a */
    public static String m43522a(int i) {
        int i2 = i % 60;
        int i3 = i / 60;
        int i4 = i3 / 60;
        int i5 = i3 % 60;
        if (i4 == 0) {
            if (i5 >= 10) {
                Locale locale = Locale.ENGLISH;
                C89219l.m154709a((Object) locale, "");
                String a = C1764a.m5929a(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
                C89219l.m154709a((Object) a, "");
                return a;
            } else if (i5 < 10) {
                Locale locale2 = Locale.ENGLISH;
                C89219l.m154709a((Object) locale2, "");
                String a2 = C1764a.m5929a(locale2, "%1d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i2)}, 2));
                C89219l.m154709a((Object) a2, "");
                return a2;
            }
        }
        Locale locale3 = Locale.ENGLISH;
        C89219l.m154709a((Object) locale3, "");
        String a3 = C1764a.m5929a(locale3, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2)}, 3));
        C89219l.m154709a((Object) a3, "");
        return a3;
    }

    /* renamed from: a */
    public static String m43523a(int i, int i2) {
        return m43522a((int) ((((float) i2) / 100.0f) * ((float) i)));
    }
}
