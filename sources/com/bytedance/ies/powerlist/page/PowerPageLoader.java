package com.bytedance.ies.powerlist.page;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.p1232c.C17646b;
import com.bytedance.ies.powerlist.page.AbstractC17700f;
import com.bytedance.ies.powerlist.page.config.AbstractC17691a;
import com.bytedance.ies.powerlist.page.config.AbstractC17694d;
import com.bytedance.ies.powerlist.page.config.C17693c;
import com.bytedance.ies.powerlist.page.p1234a.C17687a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89671m;
import kotlinx.coroutines.C89582cd;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.C89672n;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PowerPageLoader<T> implements AbstractC1202k, AbstractC17691a<T>, AbstractC89516am {

    /* renamed from: a */
    public C17693c f42266a;

    /* renamed from: b */
    public C89378p<? extends T, ? extends T> f42267b;

    /* renamed from: c */
    public AbstractC89671m<? super AbstractC17700f<T>> f42268c;

    /* renamed from: d */
    public AbstractC89671m<? super AbstractC17700f<T>> f42269d;

    /* renamed from: e */
    public final AbstractC17694d<T> f42270e;

    /* renamed from: f */
    public final C17656f<AbstractC17641a> f42271f;

    /* renamed from: g */
    public final AbstractC89172b<C17712h, C89391z> f42272g;

    /* renamed from: h */
    private final AbstractC89568bz f42273h = C89582cd.m155517a(null);

    /* renamed from: i */
    private AbstractC88412b f42274i;

    /* renamed from: j */
    private final AbstractC89244h f42275j;

    /* renamed from: k */
    private final AbstractC89244h f42276k;

    /* renamed from: l */
    private final AbstractC1204m f42277l;

    static {
        Covode.recordClassIndex(20230);
    }

    /* renamed from: b */
    public final Handler mo28157b() {
        return (Handler) this.f42275j.getValue();
    }

    /* renamed from: c */
    public final C17721k mo28159c() {
        return (C17721k) this.f42276k.getValue();
    }

    @Override // com.bytedance.ies.powerlist.page.config.AbstractC17691a
    /* renamed from: e */
    public final void mo28163e() {
        m32811g();
    }

    /* renamed from: com.bytedance.ies.powerlist.page.PowerPageLoader$b */
    static final class C17674b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C17674b f42279a = new C17674b();

        static {
            Covode.recordClassIndex(20232);
        }

        C17674b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.bytedance.ies.powerlist.page.PowerPageLoader$e */
    static final class C17677e extends AbstractC89220m implements AbstractC89171a<C17721k> {

        /* renamed from: a */
        final /* synthetic */ PowerPageLoader f42294a;

        static {
            Covode.recordClassIndex(20235);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17677e(PowerPageLoader powerPageLoader) {
            super(0);
            this.f42294a = powerPageLoader;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C17721k invoke() {
            return new C17721k(this.f42294a.f42272g);
        }
    }

    /* renamed from: d */
    public final void mo28161d() {
        C17693c cVar = this.f42266a;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        if (cVar.f42320b) {
            m32811g();
        }
    }

    /* renamed from: f */
    public final void mo28164f() {
        this.f42273h.mo144011o();
        this.f42274i.dispose();
        this.f42277l.getLifecycle().mo4013b(this);
    }

    /* renamed from: g */
    private final void m32811g() {
        AbstractC89671m<? super AbstractC17700f<T>> mVar = this.f42268c;
        if (mVar != null) {
            mVar.mo144216b((Throwable) null);
        }
        AbstractC89671m<? super AbstractC17700f<T>> mVar2 = this.f42269d;
        if (mVar2 != null) {
            mVar2.mo144216b((Throwable) null);
        }
        EnumC17699e eVar = EnumC17699e.Refresh;
        mo28159c().mo28190a(EnumC17698d.Loading, eVar, null);
        AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C17679g(this, eVar, null), 3);
    }

    @Override // kotlinx.coroutines.AbstractC89516am
    /* renamed from: a */
    public final AbstractC89127f mo20678a() {
        return C17646b.f42199a.plus(this.f42273h);
    }

    /* renamed from: com.bytedance.ies.powerlist.page.PowerPageLoader$f */
    public static final class RunnableC17678f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PowerPageLoader f42295a;

        /* renamed from: b */
        final /* synthetic */ int f42296b;

        /* renamed from: c */
        final /* synthetic */ int f42297c;

        static {
            Covode.recordClassIndex(20236);
        }

        public RunnableC17678f(PowerPageLoader powerPageLoader, int i, int i2) {
            this.f42295a = powerPageLoader;
            this.f42296b = i;
            this.f42297c = i2;
        }

        public final void run() {
            if (this.f42296b <= PowerPageLoader.m32809a(this.f42295a).f42319a && PowerPageLoader.m32810a((AbstractC89671m<?>) this.f42295a.f42268c) && this.f42295a.mo28159c().f42379a.f42363b.f42307a.f42366c == PowerPageState.Loaded) {
                this.f42295a.mo28160c(null);
            }
            if (this.f42297c - this.f42296b <= PowerPageLoader.m32809a(this.f42295a).f42319a + 1 && PowerPageLoader.m32810a((AbstractC89671m<?>) this.f42295a.f42269d) && this.f42295a.mo28159c().f42379a.f42363b.f42308b.f42366c == PowerPageState.Loaded) {
                this.f42295a.mo28162d(null);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.page.config.AbstractC17691a
    /* renamed from: a */
    public final void mo28156a(T t) {
        mo28160c(t);
    }

    @Override // com.bytedance.ies.powerlist.page.config.AbstractC17691a
    /* renamed from: b */
    public final void mo28158b(T t) {
        mo28162d(t);
    }

    /* renamed from: com.bytedance.ies.powerlist.page.PowerPageLoader$a */
    static final class C17673a<T> implements AbstractC88433f<C17693c> {

        /* renamed from: a */
        final /* synthetic */ PowerPageLoader f42278a;

        static {
            Covode.recordClassIndex(20231);
        }

        C17673a(PowerPageLoader powerPageLoader) {
            this.f42278a = powerPageLoader;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C17693c cVar) {
            C17693c cVar2 = cVar;
            PowerPageLoader powerPageLoader = this.f42278a;
            C89219l.m154709a((Object) cVar2, "");
            powerPageLoader.f42266a = cVar2;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C17693c m32809a(PowerPageLoader powerPageLoader) {
        C17693c cVar = powerPageLoader.f42266a;
        if (cVar == null) {
            C89219l.m154710a("config");
        }
        return cVar;
    }

    /* renamed from: a */
    public static boolean m32810a(AbstractC89671m<?> mVar) {
        if (mVar == null || mVar.mo144217c() || mVar.mo144215b()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo28160c(T t) {
        AbstractC89671m<? super AbstractC17700f<T>> mVar = this.f42268c;
        if (mVar != null) {
            mVar.mo144216b((Throwable) null);
        }
        EnumC17699e eVar = EnumC17699e.Prev;
        mo28159c().mo28190a(EnumC17698d.Loading, eVar, null);
        AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C17675c(this, t, eVar, null), 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo28162d(T t) {
        AbstractC89671m<? super AbstractC17700f<T>> mVar = this.f42269d;
        if (mVar != null) {
            mVar.mo144216b((Throwable) null);
        }
        EnumC17699e eVar = EnumC17699e.Next;
        mo28159c().mo28190a(EnumC17698d.Loading, eVar, null);
        AbstractC89568bz unused = C89624i.m155555a(this, null, null, new C17676d(this, t, eVar, null), 3);
    }

    @Override // com.bytedance.ies.powerlist.page.config.AbstractC17691a
    /* renamed from: a */
    public final void mo28155a(EnumC17699e eVar) {
        C89219l.m154719c(eVar, "");
        int i = C17720j.f42378a[eVar.ordinal()];
        if (i == 1) {
            mo28162d(null);
        } else if (i == 2) {
            mo28160c(null);
        } else if (i == 3) {
            m32811g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerlist.page.PowerPageLoader$c */
    public static final class C17675c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f42280a;

        /* renamed from: b */
        Object f42281b;

        /* renamed from: c */
        int f42282c;

        /* renamed from: d */
        final /* synthetic */ PowerPageLoader f42283d;

        /* renamed from: e */
        final /* synthetic */ Object f42284e;

        /* renamed from: f */
        final /* synthetic */ EnumC17699e f42285f;

        /* renamed from: g */
        private AbstractC89516am f42286g;

        static {
            Covode.recordClassIndex(20233);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17675c(PowerPageLoader powerPageLoader, Object obj, EnumC17699e eVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f42283d = powerPageLoader;
            this.f42284e = obj;
            this.f42285f = eVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C17675c cVar = new C17675c(this.f42283d, this.f42284e, this.f42285f, dVar);
            cVar.f42286g = (AbstractC89516am) obj;
            return cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17675c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: com.bytedance.ies.powerlist.page.config.d<T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f42282c;
            boolean z = true;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    this.f42280a = this.f42286g;
                    this.f42281b = this;
                    this.f42282c = 1;
                    C89672n nVar = new C89672n(C89099b.m154605a(this), 1);
                    this.f42283d.f42268c = nVar;
                    Object obj2 = this.f42284e;
                    if (obj2 == null) {
                        obj2 = this.f42283d.f42267b.getFirst();
                    }
                    if (obj2 != null) {
                        this.f42283d.f42270e.mo23346a(nVar, obj2);
                    }
                    obj = nVar.mo144218e();
                    if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                        C89219l.m154721d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (CancellationException e) {
                    e.printStackTrace();
                    return C89391z.f203057a;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC17700f fVar = (AbstractC17700f) obj;
            if (fVar instanceof AbstractC17700f.C17704d) {
                List<AbstractC17641a> list = ((AbstractC17700f.C17704d) fVar).f42339d;
                if (list.isEmpty()) {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    list = null;
                }
                if (list != null) {
                    this.f42283d.f42271f.mo28131a(0, list);
                }
                PowerPageLoader powerPageLoader = this.f42283d;
                powerPageLoader.f42267b = C89378p.copy$default(powerPageLoader.f42267b, ((AbstractC17700f.C17704d) fVar).f42337b, null, 2, null);
                this.f42283d.mo28159c().mo28190a(EnumC17698d.Loaded, this.f42285f, null);
            } else if (fVar instanceof AbstractC17700f.C17703c) {
                this.f42283d.mo28159c().mo28190a(EnumC17698d.Error, this.f42285f, ((AbstractC17700f.C17703c) fVar).f42336b);
            } else if (fVar instanceof AbstractC17700f.C17702b) {
                List<AbstractC17641a> list2 = ((AbstractC17700f.C17702b) fVar).f42335b;
                if (list2.isEmpty()) {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    list2 = null;
                }
                if (list2 != null) {
                    this.f42283d.f42271f.mo28131a(0, list2);
                }
                this.f42283d.mo28159c().mo28190a(EnumC17698d.End, this.f42285f, null);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerlist.page.PowerPageLoader$d */
    public static final class C17676d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f42287a;

        /* renamed from: b */
        Object f42288b;

        /* renamed from: c */
        int f42289c;

        /* renamed from: d */
        final /* synthetic */ PowerPageLoader f42290d;

        /* renamed from: e */
        final /* synthetic */ Object f42291e;

        /* renamed from: f */
        final /* synthetic */ EnumC17699e f42292f;

        /* renamed from: g */
        private AbstractC89516am f42293g;

        static {
            Covode.recordClassIndex(20234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17676d(PowerPageLoader powerPageLoader, Object obj, EnumC17699e eVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f42290d = powerPageLoader;
            this.f42291e = obj;
            this.f42292f = eVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C17676d dVar2 = new C17676d(this.f42290d, this.f42291e, this.f42292f, dVar);
            dVar2.f42293g = (AbstractC89516am) obj;
            return dVar2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17676d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: com.bytedance.ies.powerlist.page.config.d<T> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f42289c;
            boolean z = true;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    this.f42287a = this.f42293g;
                    this.f42288b = this;
                    this.f42289c = 1;
                    C89672n nVar = new C89672n(C89099b.m154605a(this), 1);
                    this.f42290d.f42269d = nVar;
                    Object obj2 = this.f42291e;
                    if (obj2 == null) {
                        obj2 = this.f42290d.f42267b.getSecond();
                    }
                    if (obj2 != null) {
                        this.f42290d.f42270e.mo23347b(nVar, obj2);
                    }
                    obj = nVar.mo144218e();
                    if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                        C89219l.m154721d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (CancellationException e) {
                    e.printStackTrace();
                    return C89391z.f203057a;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC17700f fVar = (AbstractC17700f) obj;
            boolean z2 = false;
            if (fVar instanceof AbstractC17700f.C17704d) {
                List<AbstractC17641a> list = ((AbstractC17700f.C17704d) fVar).f42339d;
                if (!list.isEmpty()) {
                    z2 = true;
                }
                if (!Boolean.valueOf(z2).booleanValue()) {
                    list = null;
                }
                if (list != null) {
                    this.f42290d.f42271f.mo28133a(list);
                }
                PowerPageLoader powerPageLoader = this.f42290d;
                powerPageLoader.f42267b = C89378p.copy$default(powerPageLoader.f42267b, null, ((AbstractC17700f.C17704d) fVar).f42338c, 1, null);
                this.f42290d.mo28159c().mo28190a(EnumC17698d.Loaded, this.f42292f, null);
            } else if (fVar instanceof AbstractC17700f.C17703c) {
                this.f42290d.mo28159c().mo28190a(EnumC17698d.Error, this.f42292f, ((AbstractC17700f.C17703c) fVar).f42336b);
            } else if (fVar instanceof AbstractC17700f.C17702b) {
                List<AbstractC17641a> list2 = ((AbstractC17700f.C17702b) fVar).f42335b;
                if (list2.isEmpty()) {
                    z = false;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    list2 = null;
                }
                if (list2 != null) {
                    this.f42290d.f42271f.mo28133a(list2);
                }
                this.f42290d.mo28159c().mo28190a(EnumC17698d.End, this.f42292f, null);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.powerlist.page.PowerPageLoader$g */
    public static final class C17679g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f42298a;

        /* renamed from: b */
        Object f42299b;

        /* renamed from: c */
        int f42300c;

        /* renamed from: d */
        final /* synthetic */ PowerPageLoader f42301d;

        /* renamed from: e */
        final /* synthetic */ EnumC17699e f42302e;

        /* renamed from: f */
        private AbstractC89516am f42303f;

        static {
            Covode.recordClassIndex(20237);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17679g(PowerPageLoader powerPageLoader, EnumC17699e eVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f42301d = powerPageLoader;
            this.f42302e = eVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154719c(dVar, "");
            C17679g gVar = new C17679g(this.f42301d, this.f42302e, dVar);
            gVar.f42303f = (AbstractC89516am) obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17679g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f42300c;
            if (i == 0) {
                C89382r.m154942a(obj);
                try {
                    this.f42298a = this.f42303f;
                    this.f42299b = this;
                    this.f42300c = 1;
                    C89672n nVar = new C89672n(C89099b.m154605a(this), 1);
                    this.f42301d.f42269d = nVar;
                    this.f42301d.f42270e.mo23345a(nVar);
                    obj = nVar.mo144218e();
                    if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                        C89219l.m154721d(this, "");
                    }
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (CancellationException e) {
                    e.printStackTrace();
                    return C89391z.f203057a;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC17700f fVar = (AbstractC17700f) obj;
            if (fVar instanceof AbstractC17700f.C17704d) {
                this.f42301d.f42271f.mo28138b(((AbstractC17700f.C17704d) fVar).f42339d);
                this.f42301d.f42267b = new C89378p<>(((AbstractC17700f.C17704d) fVar).f42337b, ((AbstractC17700f.C17704d) fVar).f42338c);
                this.f42301d.mo28159c().mo28190a(EnumC17698d.Loaded, this.f42302e, new C17687a(((AbstractC17700f.C17704d) fVar).f42337b, ((AbstractC17700f.C17704d) fVar).f42338c));
            } else if (fVar instanceof AbstractC17700f.C17703c) {
                this.f42301d.mo28159c().mo28190a(EnumC17698d.Error, this.f42302e, ((AbstractC17700f.C17703c) fVar).f42336b);
            } else if (fVar instanceof AbstractC17700f.C17702b) {
                this.f42301d.f42271f.mo28138b(((AbstractC17700f.C17702b) fVar).f42335b);
                this.f42301d.mo28157b().post(new Runnable(this) {
                    /* class com.bytedance.ies.powerlist.page.PowerPageLoader.C17679g.RunnableC176801 */

                    /* renamed from: a */
                    final /* synthetic */ C17679g f42304a;

                    static {
                        Covode.recordClassIndex(20238);
                    }

                    {
                        this.f42304a = r1;
                    }

                    public final void run() {
                        this.f42304a.f42301d.mo28159c().mo28190a(EnumC17698d.End, this.f42304a.f42302e, null);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            mo28164f();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super com.bytedance.ies.powerlist.page.h, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public PowerPageLoader(AbstractC17694d<T> dVar, AbstractC88979t<C17693c> tVar, AbstractC1204m mVar, C17656f<AbstractC17641a> fVar, AbstractC89172b<? super C17712h, C89391z> bVar) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(tVar, "");
        C89219l.m154719c(mVar, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(bVar, "");
        this.f42270e = dVar;
        this.f42277l = mVar;
        this.f42271f = fVar;
        this.f42272g = bVar;
        AbstractC88412b d = tVar.mo143289d(new C17673a(this));
        C89219l.m154709a((Object) d, "");
        this.f42274i = d;
        this.f42267b = new C89378p<>(null, null);
        this.f42275j = C89250i.m154773a((AbstractC89171a) C17674b.f42279a);
        this.f42276k = C89250i.m154773a((AbstractC89171a) new C17677e(this));
        C89219l.m154719c(this, "");
        dVar.f42330c = this;
        mVar.getLifecycle().mo4012a(this);
    }
}
