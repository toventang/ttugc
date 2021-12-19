package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.base.model.user.d */
public final class C2997d {

    /* renamed from: a */
    public static final C2998a f8819a = new C2998a((byte) 0);

    static {
        Covode.recordClassIndex(3459);
    }

    /* renamed from: com.bytedance.android.live.base.model.user.d$a */
    public static final class C2998a {
        static {
            Covode.recordClassIndex(3460);
        }

        private C2998a() {
        }

        /* renamed from: a */
        public static User m8305a() {
            if (C6204h.m13480b()) {
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                return b.mo13159b();
            }
            AbstractC6872f b2 = C11115u.m19743a().mo17915b();
            C89219l.m154716b(b2, "");
            return User.from(b2.mo13147a());
        }

        public /* synthetic */ C2998a(byte b) {
            this();
        }
    }
}
