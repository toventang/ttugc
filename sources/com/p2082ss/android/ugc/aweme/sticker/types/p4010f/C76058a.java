package com.p2082ss.android.ugc.aweme.sticker.types.p4010f;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3981q.C75671f;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.f.a */
public final class C76058a {

    /* renamed from: c */
    public static final C76059a f170885c = new C76059a((byte) 0);

    /* renamed from: a */
    public boolean f170886a;

    /* renamed from: b */
    public final C75671f f170887b;

    static {
        Covode.recordClassIndex(89002);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.f.a$a */
    public static final class C76059a {
        static {
            Covode.recordClassIndex(89003);
        }

        private C76059a() {
        }

        public /* synthetic */ C76059a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m133344a(String str) {
            if (str == null) {
                return false;
            }
            return C89070n.m154522b(C80573ig.m139668a(R.string.f7z), C80573ig.m139668a(R.string.f80), C80573ig.m139668a(R.string.f7q), "record_mode_mv").contains(str);
        }
    }

    public C76058a(C75671f fVar) {
        C89219l.m154721d(fVar, "");
        this.f170887b = fVar;
    }
}
