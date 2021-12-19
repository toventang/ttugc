package com.p2082ss.android.ugc.aweme.p2725d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40913e;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.d.g */
public class C40916g extends AbstractC40913e {

    /* renamed from: d */
    public static final C40917a f95730d = new C40917a((byte) 0);

    /* renamed from: b */
    public final ConcurrentHashMap<Integer, LinkedList<View>> f95731b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public long f95732c = 10000;

    static {
        Covode.recordClassIndex(48768);
    }

    /* renamed from: com.ss.android.ugc.aweme.d.g$a */
    public static final class C40917a {
        static {
            Covode.recordClassIndex(48769);
        }

        private C40917a() {
        }

        public /* synthetic */ C40917a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.d.g$b */
    static final class C40918b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C40916g f95733a;

        /* renamed from: b */
        final /* synthetic */ AbstractC40913e.C40914a f95734b;

        static {
            Covode.recordClassIndex(48770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40918b(C40916g gVar, AbstractC40913e.C40914a aVar) {
            super(0);
            this.f95733a = gVar;
            this.f95734b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            MethodCollector.m26663i(12380);
            if (!this.f95733a.f95725a.isFinishing()) {
                try {
                    for (C89378p<Integer, Integer> pVar : this.f95734b.f95726a) {
                        Integer first = pVar.getFirst();
                        int intValue = pVar.getSecond().intValue();
                        int intValue2 = first.intValue();
                        LinkedList<View> linkedList = this.f95733a.f95731b.get(Integer.valueOf(intValue2));
                        if (linkedList == null) {
                            linkedList = new LinkedList<>();
                            this.f95733a.f95731b.put(Integer.valueOf(intValue2), linkedList);
                        }
                        for (int i = 0; i < intValue; i++) {
                            View a = C1862a.m6032a(this.f95733a.f95725a, intValue2, new FrameLayout(this.f95733a.f95725a), false);
                            synchronized (linkedList) {
                                try {
                                    linkedList.offer(a);
                                } catch (Throwable th) {
                                    MethodCollector.m26664o(12380);
                                    throw th;
                                }
                            }
                        }
                    }
                    AbstractC40913e.C40914a aVar = this.f95734b;
                    ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap = this.f95733a.f95731b;
                    long j = this.f95733a.f95732c;
                    C89219l.m154719c(aVar, "");
                    C89219l.m154719c(concurrentHashMap, "");
                    C40909a.f95720a.postDelayed(new RunnableC40915f(aVar, concurrentHashMap), j);
                    C40909a.f95721b.mo70754a(this.f95733a.f95725a);
                } catch (Exception unused) {
                }
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(12380);
            return zVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40916g(Activity activity) {
        super(activity);
        C89219l.m154719c(activity, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.p2725d.AbstractC40913e
    /* renamed from: a */
    public void mo70116a(AbstractC40913e.C40914a aVar) {
        C89219l.m154719c(aVar, "");
        if (C40920i.m82408b()) {
            C40909a.f95720a.post(new RunnableC40919h(new C40918b(this, aVar)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2725d.AbstractC40911c
    /* renamed from: a */
    public final View mo70113a(int i) {
        MethodCollector.m26663i(12038);
        if (C40920i.m82408b()) {
            LinkedList<View> linkedList = this.f95731b.get(Integer.valueOf(i));
            if (linkedList != null) {
                synchronized (linkedList) {
                    try {
                        View poll = linkedList.poll();
                        if (poll != null) {
                            return poll;
                        }
                        this.f95731b.remove(Integer.valueOf(i));
                    } finally {
                        MethodCollector.m26664o(12038);
                    }
                }
            }
            View a = C1862a.m6032a(this.f95725a, i, new FrameLayout(this.f95725a), false);
            C89219l.m154709a((Object) a, "");
            MethodCollector.m26664o(12038);
            return a;
        } else if (((Boolean) C40920i.f95736a.getValue()).booleanValue()) {
            View a2 = C1862a.m6032a(this.f95725a, i, new FrameLayout(this.f95725a), false);
            C89219l.m154709a((Object) a2, "");
            MethodCollector.m26664o(12038);
            return a2;
        } else {
            View a3 = C1764a.m5927a(LayoutInflater.from(this.f95725a), i, new FrameLayout(this.f95725a), false);
            C89219l.m154709a((Object) a3, "");
            MethodCollector.m26664o(12038);
            return a3;
        }
    }
}
