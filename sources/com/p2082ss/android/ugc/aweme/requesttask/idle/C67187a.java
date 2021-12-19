package com.p2082ss.android.ugc.aweme.requesttask.idle;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.a */
public final class C67187a {

    /* renamed from: a */
    public static final C67187a f150609a = new C67187a();

    /* renamed from: b */
    private static boolean f150610b;

    private C67187a() {
    }

    static {
        Covode.recordClassIndex(78804);
    }

    /* renamed from: a */
    public static final void m119053a() {
        AbstractC58264w initTask = AVExternalServiceImpl.m113114a().initService().initTask(4);
        if (!f150610b) {
            f150610b = true;
            C58221f.C58224c cVar = new C58221f.C58224c();
            if (initTask == null) {
                C89219l.m154715b();
            }
            cVar.mo95703b(initTask).mo95706a();
        }
    }
}
