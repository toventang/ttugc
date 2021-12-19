package com.p2082ss.android.ugc.aweme.feed.p2965s;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49438k;
import com.p2082ss.android.ugc.aweme.p3452ml.p3453a.AbstractC59976b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.s.a */
public final class C49909a {

    /* renamed from: a */
    public static WeakReference<AbstractC49438k> f115055a;

    /* renamed from: b */
    public static AbstractC59976b f115056b = new AbstractC59976b() {
        /* class com.p2082ss.android.ugc.aweme.feed.p2965s.C49909a.C499101 */

        static {
            Covode.recordClassIndex(59017);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3452ml.p3453a.AbstractC59976b
        /* renamed from: a */
        public final int mo84945a() {
            AbstractC49438k a = C49909a.m93692a();
            if (a != null) {
                return a.mo81110aE();
            }
            return -1;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3452ml.p3453a.AbstractC59976b
        /* renamed from: b */
        public final Aweme mo84948b() {
            AbstractC49438k a = C49909a.m93692a();
            if (a != null) {
                return a.mo81109aD();
            }
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3452ml.p3453a.AbstractC59976b
        /* renamed from: a */
        public final Aweme mo84946a(int i) {
            AbstractC49438k a = C49909a.m93692a();
            if (a == null) {
                return null;
            }
            try {
                return a.mo81112f(i);
            } catch (Throwable unused) {
                return null;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.p3452ml.p3453a.AbstractC59976b
        /* renamed from: a */
        public final Aweme mo84947a(String str) {
            AbstractC48149ai k;
            try {
                AbstractC49438k a = C49909a.m93692a();
                if (a == null || (k = a.mo81114k(str)) == null) {
                    return AwemeService.m70060b().mo60684b(str);
                }
                return k.mo80206b();
            } catch (Throwable unused) {
                return null;
            }
        }
    };

    static {
        Covode.recordClassIndex(59016);
    }

    /* renamed from: a */
    public static AbstractC49438k m93692a() {
        WeakReference<AbstractC49438k> weakReference = f115055a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
