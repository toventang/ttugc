package com.p2082ss.android.ugc.aweme.setting.page.privacy;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.setting.p3732ui.C68570bv;
import com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.a */
public final class C68311a {

    /* renamed from: a */
    public static final AbstractC68342a f152895a = new C68312a();

    /* renamed from: b */
    public static final C68311a f152896b = new C68311a();

    /* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.a$a */
    public static final class C68312a implements AbstractC68342a {
        static {
            Covode.recordClassIndex(80527);
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
        /* renamed from: a */
        public final void mo60119a(Exception exc) {
            C89219l.m154721d(exc, "");
        }

        C68312a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.AbstractC68342a
        /* renamed from: a */
        public final void mo60118a(C68348f fVar) {
            C89219l.m154721d(fVar, "");
            C33842s sVar = C33842s.C33843a.f80132a;
            C89219l.m154716b(sVar, "");
            C33594aj<Integer> c = sVar.mo60059c();
            C89219l.m154716b(c, "");
            c.mo59940b(Integer.valueOf(fVar.f152947J));
            AbstractC81915c.m141874a(new C68570bv());
        }
    }

    private C68311a() {
    }

    static {
        Covode.recordClassIndex(80526);
    }
}
