package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40913e;
import com.p2082ss.android.ugc.aweme.p2725d.C40909a;
import com.p2082ss.android.ugc.aweme.p2725d.C40916g;
import com.p2082ss.android.ugc.aweme.p2725d.C40920i;
import java.util.LinkedList;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.c */
public final class C67611c extends C40916g {

    /* renamed from: com.ss.android.ugc.aweme.search.l.c$b */
    final /* synthetic */ class RunnableC67613b implements Runnable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f151491a;

        static {
            Covode.recordClassIndex(79252);
        }

        RunnableC67613b(AbstractC89171a aVar) {
            this.f151491a = aVar;
        }

        public final /* synthetic */ void run() {
            C89219l.m154716b(this.f151491a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(79250);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.l.c$a */
    static final class C67612a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C67611c f151489a;

        /* renamed from: b */
        final /* synthetic */ AbstractC40913e.C40914a f151490b;

        static {
            Covode.recordClassIndex(79251);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C67612a(C67611c cVar, AbstractC40913e.C40914a aVar) {
            super(0);
            this.f151489a = cVar;
            this.f151490b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MethodCollector.m26663i(8034);
            if (!this.f151489a.f95725a.isFinishing()) {
                try {
                    for (C89378p<Integer, Integer> pVar : this.f151490b.f95726a) {
                        Integer first = pVar.getFirst();
                        int intValue = pVar.getSecond().intValue();
                        int intValue2 = first.intValue();
                        LinkedList<View> linkedList = this.f151489a.f95731b.get(Integer.valueOf(intValue2));
                        if (linkedList == null) {
                            linkedList = new LinkedList<>();
                            this.f151489a.f95731b.put(Integer.valueOf(intValue2), linkedList);
                        }
                        for (int i = 0; i < intValue; i++) {
                            View a = C1862a.m6032a(this.f151489a.f95725a, intValue2, new FrameLayout(this.f151489a.f95725a), false);
                            synchronized (linkedList) {
                                try {
                                    linkedList.offer(a);
                                } catch (Throwable th) {
                                    MethodCollector.m26664o(8034);
                                    throw th;
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(8034);
            return zVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67611c(Activity activity) {
        super(activity);
        C89219l.m154721d(activity, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2725d.C40916g, com.p2082ss.android.ugc.aweme.p2725d.AbstractC40913e
    /* renamed from: a */
    public final void mo70116a(AbstractC40913e.C40914a aVar) {
        C89219l.m154721d(aVar, "");
        if (C40920i.m82408b()) {
            C40909a.f95720a.post(new RunnableC67613b(new C67612a(this, aVar)));
        }
    }
}
