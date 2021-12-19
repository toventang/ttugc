package com.google.android.play.core.p1963b;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1965d.C26975a;
import com.google.android.play.core.p1965d.C26991q;
import com.google.android.play.core.p1966e.AbstractC27054z;
import java.util.List;

/* renamed from: com.google.android.play.core.b.n */
final class RunnableC26954n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f63838a;

    /* renamed from: b */
    final /* synthetic */ AbstractC27054z f63839b;

    /* renamed from: c */
    final /* synthetic */ C26955o f63840c;

    static {
        Covode.recordClassIndex(32429);
    }

    RunnableC26954n(C26955o oVar, List list, AbstractC27054z zVar) {
        this.f63840c = oVar;
        this.f63838a = list;
        this.f63839b = zVar;
    }

    public final void run() {
        try {
            C26956p pVar = this.f63840c.f63842b;
            for (Intent intent : this.f63838a) {
                if (!pVar.f63846a.mo44677a(C26956p.m53556a(intent, "split_id")).exists()) {
                    C26955o oVar = this.f63840c;
                    List<Intent> list = this.f63838a;
                    AbstractC27054z zVar = this.f63839b;
                    Integer a = oVar.mo44655a(list);
                    if (a == null) {
                        return;
                    }
                    if (a.intValue() == 0) {
                        zVar.mo44718b();
                        return;
                    } else {
                        zVar.mo44717a(a.intValue());
                        return;
                    }
                }
            }
            C26955o oVar2 = this.f63840c;
            AbstractC27054z zVar2 = this.f63839b;
            try {
                if (!C26975a.m53596a(C26991q.m53630a(oVar2.f63841a), true)) {
                    zVar2.mo44717a(-12);
                } else {
                    zVar2.mo44716a();
                }
            } catch (Exception unused) {
                zVar2.mo44717a(-12);
            }
        } catch (Exception unused2) {
            this.f63839b.mo44717a(-11);
        }
    }
}
