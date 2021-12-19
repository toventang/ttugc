package com.p2082ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p3426m.C58975a;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.a */
final /* synthetic */ class C58413a implements AbstractC1729g {

    /* renamed from: a */
    static final AbstractC1729g f132994a = new C58413a();

    static {
        Covode.recordClassIndex(68654);
    }

    private C58413a() {
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        Context a = C17867d.m33078a();
        float a2 = (float) C58975a.m108342a(a);
        int b = C58975a.m108346b(a);
        if (a2 == -1.0f || b == -1 || ((float) b) / a2 <= 0.2f) {
            return null;
        }
        C58975a.m108345a(a, (int) (((float) C58975a.m108342a(a)) * 0.2f));
        return null;
    }
}
