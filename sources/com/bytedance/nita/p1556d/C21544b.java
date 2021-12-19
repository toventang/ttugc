package com.bytedance.nita.p1556d;

import android.content.Context;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.AbstractC21525c;
import com.bytedance.nita.p1557e.C21554a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.d.b */
public final class C21544b extends AbstractC21539a {
    static {
        Covode.recordClassIndex(25185);
    }

    public final boolean handleMessage(Message message) {
        C89219l.m154719c(message, "");
        return true;
    }

    /* renamed from: com.bytedance.nita.d.b$a */
    static final class RunnableC21545a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21544b f51138a;

        /* renamed from: b */
        final /* synthetic */ AbstractC21525c f51139b;

        /* renamed from: c */
        final /* synthetic */ int f51140c;

        /* renamed from: d */
        final /* synthetic */ Context f51141d;

        static {
            Covode.recordClassIndex(25186);
        }

        RunnableC21545a(C21544b bVar, AbstractC21525c cVar, int i, Context context) {
            this.f51138a = bVar;
            this.f51139b = cVar;
            this.f51140c = i;
            this.f51141d = context;
        }

        public final void run() {
            C21544b.m40478a(this.f51139b, this.f51140c, this.f51141d).invoke();
        }
    }

    @Override // com.bytedance.nita.p1556d.AbstractC21551d, com.bytedance.nita.p1556d.AbstractC21539a
    /* renamed from: a */
    public final void mo35216a(AbstractC21525c cVar, Context context, int i) {
        C89219l.m154719c(cVar, "");
        C89219l.m154719c(context, "");
        C21554a.m40486a(C21554a.f51150b).postDelayed(new RunnableC21545a(this, cVar, i, context), 5);
    }
}
