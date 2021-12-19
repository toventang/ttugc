package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.p3559c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.playerkit.exp.PlayerSettingService;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a */
public final class C63120a {

    /* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.c.a$a */
    public interface AbstractC63121a<T> {
        static {
            Covode.recordClassIndex(73963);
        }

        /* renamed from: a */
        T mo101335a();
    }

    static {
        Covode.recordClassIndex(73962);
    }

    /* renamed from: a */
    private static boolean m114062a() {
        if (PlayerSettingService.isDebug()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> T m114060a(AbstractC63121a<T> aVar) {
        System.currentTimeMillis();
        T a = aVar.mo101335a();
        System.currentTimeMillis();
        return a;
    }

    /* renamed from: a */
    public static void m114061a(String str) {
        if (m114062a()) {
            throw new RuntimeException(str);
        }
    }
}
