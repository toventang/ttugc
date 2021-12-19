package com.p2082ss.ugc.effectplatform.algorithm;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.algorithm.g */
public interface AbstractC86713g {
    static {
        Covode.recordClassIndex(102412);
    }

    void loadLibrary(String str);

    /* renamed from: com.ss.ugc.effectplatform.algorithm.g$a */
    public static final class C86714a implements AbstractC86713g {

        /* renamed from: a */
        public static final C86714a f195545a = new C86714a();

        private C86714a() {
        }

        static {
            Covode.recordClassIndex(102413);
        }

        @Override // com.p2082ss.ugc.effectplatform.algorithm.AbstractC86713g
        public final void loadLibrary(String str) {
            C89219l.m154719c(str, "");
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.m38962a(str);
            C58032m.m104852a(uptimeMillis, str);
        }
    }
}
