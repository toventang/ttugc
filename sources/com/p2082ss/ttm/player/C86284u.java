package com.p2082ss.ttm.player;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import java.util.List;

/* renamed from: com.ss.ttm.player.u */
public class C86284u {

    /* renamed from: a */
    public static final String f192738a = C86284u.class.getSimpleName();

    /* renamed from: b */
    public static String f192739b = null;

    /* renamed from: c */
    private static AbstractC86247g f192740c = new C86285a((byte) 0);

    /* renamed from: d */
    private static boolean f192741d = false;

    /* renamed from: e */
    private static boolean f192742e = false;

    /* renamed from: f */
    private static int f192743f = 0;

    /* renamed from: com.ss.ttm.player.u$a */
    static class C86285a implements AbstractC86247g {
        static {
            Covode.recordClassIndex(101462);
        }

        private C86285a() {
        }

        /* synthetic */ C86285a(byte b) {
            this();
        }

        @Override // com.p2082ss.ttm.player.AbstractC86247g
        /* renamed from: a */
        public final boolean mo136716a(List<String> list) {
            for (String str : list) {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    Librarian.m38962a(str);
                    C58032m.m104852a(uptimeMillis, str);
                } catch (Throwable th) {
                    C86284u.f192739b = th.getMessage();
                    return false;
                }
            }
            return true;
        }
    }

    static {
        Covode.recordClassIndex(101461);
    }
}
