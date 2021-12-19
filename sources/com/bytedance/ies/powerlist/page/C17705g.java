package com.bytedance.ies.powerlist.page;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.AbstractC1485u;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p4560f.p4561a.p4591l.C88958b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerlist.page.g */
public final class C17705g {

    /* renamed from: a */
    public volatile int f42340a;

    /* renamed from: b */
    public List<? extends AbstractC17641a> f42341b = C89086z.INSTANCE;

    /* renamed from: c */
    public ArrayList<Integer> f42342c = new ArrayList<>();

    /* renamed from: d */
    final AbstractC89244h f42343d = C89250i.m154773a((AbstractC89171a) new C17708c(this));

    /* renamed from: e */
    public final AbstractC89244h f42344e = C89250i.m154773a((AbstractC89171a) new C17707b(this));

    /* renamed from: f */
    public final AbstractC1485u f42345f;

    /* renamed from: g */
    public final C88958b<C17693c> f42346g;

    static {
        Covode.recordClassIndex(20265);
    }

    /* renamed from: com.bytedance.ies.powerlist.page.g$e */
    public static final class C17711e extends C1445j.AbstractC1447a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f42357a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f42358b;

        /* renamed from: c */
        final /* synthetic */ ArrayList f42359c;

        static {
            Covode.recordClassIndex(20271);
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: a */
        public final int mo3768a() {
            return this.f42357a.size();
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: b */
        public final int mo3770b() {
            return this.f42358b.size();
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: a */
        public final Object mo3769a(int i, int i2) {
            AbstractC17641a aVar = (AbstractC17641a) this.f42357a.get(i);
            AbstractC17641a aVar2 = (AbstractC17641a) this.f42358b.get(i2);
            if (aVar == null || aVar2 == null) {
                return null;
            }
            return aVar.mo28111c(aVar2);
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: b */
        public final boolean mo3771b(int i, int i2) {
            Object obj = this.f42357a.get(i);
            C89219l.m154709a(obj, "");
            AbstractC17641a aVar = (AbstractC17641a) obj;
            Object obj2 = this.f42358b.get(i2);
            C89219l.m154709a(obj2, "");
            AbstractC17641a aVar2 = (AbstractC17641a) obj2;
            if (aVar != null) {
                if (aVar2 != null) {
                    return aVar.mo28110b(aVar2);
                }
                return false;
            } else if (aVar2 == null) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
        /* renamed from: c */
        public final boolean mo3772c(int i, int i2) {
            Object obj = this.f42357a.get(i);
            C89219l.m154709a(obj, "");
            AbstractC17641a aVar = (AbstractC17641a) obj;
            Object obj2 = this.f42358b.get(i2);
            C89219l.m154709a(obj2, "");
            AbstractC17641a aVar2 = (AbstractC17641a) obj2;
            if (aVar != null) {
                if (aVar2 != null) {
                    Integer num = (Integer) this.f42359c.get(i);
                    int hashCode = aVar2.hashCode();
                    if (num != null && num.intValue() == hashCode) {
                        return aVar.mo28109a(aVar2);
                    }
                    return false;
                }
            } else if (aVar2 == null) {
                return true;
            }
            return false;
        }

        public C17711e(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            this.f42357a = arrayList;
            this.f42358b = arrayList2;
            this.f42359c = arrayList3;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.g$c */
    static final class C17708c extends AbstractC89220m implements AbstractC89171a<Executor> {

        /* renamed from: a */
        final /* synthetic */ C17705g f42350a;

        static {
            Covode.recordClassIndex(20268);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17708c(C17705g gVar) {
            super(0);
            this.f42350a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Executor invoke() {
            Executor executor;
            C17693c i = this.f42350a.f42346g.mo143221i();
            if (i == null || (executor = i.f42325g) == null) {
                return new ExecutorC17706a();
            }
            return executor;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.g$d */
    public static final class RunnableC17709d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C17705g f42351a;

        /* renamed from: b */
        final /* synthetic */ C1445j.AbstractC1447a f42352b;

        /* renamed from: c */
        final /* synthetic */ int f42353c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f42354d;

        static {
            Covode.recordClassIndex(20269);
        }

        public RunnableC17709d(C17705g gVar, C1445j.AbstractC1447a aVar, int i, ArrayList arrayList) {
            this.f42351a = gVar;
            this.f42352b = aVar;
            this.f42353c = i;
            this.f42354d = arrayList;
        }

        public final void run() {
            final C1445j.C1450d a = C1445j.m4921a(this.f42352b);
            C89219l.m154709a((Object) a, "");
            ((Executor) this.f42351a.f42343d.getValue()).execute(new Runnable(this) {
                /* class com.bytedance.ies.powerlist.page.C17705g.RunnableC17709d.RunnableC177101 */

                /* renamed from: a */
                final /* synthetic */ RunnableC17709d f42355a;

                static {
                    Covode.recordClassIndex(20270);
                }

                {
                    this.f42355a = r1;
                }

                public final void run() {
                    if (this.f42355a.f42351a.f42340a == this.f42355a.f42353c) {
                        C17705g gVar = this.f42355a.f42351a;
                        ArrayList arrayList = this.f42355a.f42354d;
                        C89219l.m154719c(arrayList, "");
                        gVar.f42341b = arrayList;
                        C17705g gVar2 = this.f42355a.f42351a;
                        List<? extends AbstractC17641a> list = this.f42355a.f42351a.f42341b;
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(Integer.valueOf(it.next().hashCode()));
                        }
                        C89219l.m154719c(arrayList2, "");
                        gVar2.f42342c = arrayList2;
                        a.mo4952a(this.f42355a.f42351a.f42345f);
                    }
                }
            });
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.g$b */
    static final class C17707b extends AbstractC89220m implements AbstractC89171a<Executor> {

        /* renamed from: a */
        final /* synthetic */ C17705g f42349a;

        static {
            Covode.recordClassIndex(20267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17707b(C17705g gVar) {
            super(0);
            this.f42349a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Executor invoke() {
            Executor executor;
            C17693c i = this.f42349a.f42346g.mo143221i();
            if (i == null || (executor = i.f42324f) == null) {
                return C40780g.m82242a(C40787l.m82269a(EnumC40793o.FIXED).mo70025a(2).mo70028a());
            }
            return executor;
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.g$a */
    final class ExecutorC17706a implements Executor {

        /* renamed from: a */
        public final Handler f42347a = new Handler(Looper.getMainLooper());

        static {
            Covode.recordClassIndex(20266);
        }

        public final void execute(Runnable runnable) {
            C89219l.m154719c(runnable, "");
            this.f42347a.post(runnable);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ExecutorC17706a() {
        }
    }

    public C17705g(AbstractC1485u uVar, C88958b<C17693c> bVar) {
        C89219l.m154719c(uVar, "");
        C89219l.m154719c(bVar, "");
        this.f42345f = uVar;
        this.f42346g = bVar;
    }
}
