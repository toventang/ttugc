package com.p2082ss.android.ugc.aweme.kids.discovery.p3349b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.b.a */
public final class C57557a {

    /* renamed from: a */
    public static WeakReference<List<Aweme>> f131393a;

    /* renamed from: b */
    public static final C57558a f131394b = new C57558a((byte) 0);

    static {
        Covode.recordClassIndex(67511);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.b.a$a */
    public static final class C57558a {
        static {
            Covode.recordClassIndex(67512);
        }

        private C57558a() {
        }

        /* renamed from: a */
        public static List<Aweme> m104274a() {
            WeakReference<List<Aweme>> weakReference = C57557a.f131393a;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public /* synthetic */ C57558a(byte b) {
            this();
        }
    }
}
