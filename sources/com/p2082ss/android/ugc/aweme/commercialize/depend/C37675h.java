package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.newmedia.C30128d;
import com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.p2619a.AbstractC38555a;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.h */
public class C37675h extends AbstractC38555a {
    static {
        Covode.recordClassIndex(45108);
    }

    /* renamed from: e */
    private final String m76106e() {
        return mo67076d().f91094b.f91133a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: a */
    public final boolean mo65690a() {
        if (m76106e().length() != 0 && mo67076d().f91094b.f91151s == 1) {
            return C30128d.m60946a(m76106e());
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.util.adrouter.AbstractC38578e
    /* renamed from: b */
    public final boolean mo65691b() {
        Context c = mo67075c();
        if (!(c instanceof ActivityC0945e)) {
            c = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) c;
        if (eVar == null) {
            return false;
        }
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33115c a = C33113b.m67826a();
        if (a == null) {
            return true;
        }
        a.mo58918a(eVar, m76106e(), mo67076d().f91094b.f91134b);
        return true;
    }
}
