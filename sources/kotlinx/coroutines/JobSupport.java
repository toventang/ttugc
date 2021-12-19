package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.internal.AbstractC89655r;
import kotlinx.coroutines.internal.C89645k;
import kotlinx.coroutines.internal.C89646l;
import kotlinx.coroutines.internal.C89658u;
import p4600h.C89032a;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89111e;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

public class JobSupport implements AbstractC89591cm, AbstractC89695u {

    /* renamed from: d */
    static final AtomicReferenceFieldUpdater f203154d = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");
    public volatile Object _parentHandle;
    private volatile Object _state;

    static {
        Covode.recordClassIndex(105542);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a_ */
    public void mo143989a_(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo143995c(Object obj) {
    }

    public boolean cO_() {
        return false;
    }

    public boolean cP_() {
        return true;
    }

    /* renamed from: e */
    public void mo144002e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo144003e(Throwable th) {
        return false;
    }

    /* renamed from: g */
    public String mo144004g() {
        return "Job was cancelled";
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo144006i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public static final class Finishing implements AbstractC89563bu {
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;
        private final C89588cj list;

        static {
            Covode.recordClassIndex(105543);
        }

        private final Object getExceptionsHolder() {
            return this._exceptionsHolder;
        }

        @Override // kotlinx.coroutines.AbstractC89563bu
        public final C89588cj getList() {
            return this.list;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean isCompleting() {
            /*
                r1 = this;
                int r0 = r1._isCompleting
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.Finishing.isCompleting():boolean");
        }

        private final ArrayList<Throwable> allocateList() {
            return new ArrayList<>(4);
        }

        public final Throwable getRootCause() {
            return (Throwable) this._rootCause;
        }

        @Override // kotlinx.coroutines.AbstractC89563bu
        public final boolean isActive() {
            if (getRootCause() == null) {
                return true;
            }
            return false;
        }

        public final boolean isCancelling() {
            if (getRootCause() != null) {
                return true;
            }
            return false;
        }

        public final boolean isSealed() {
            if (getExceptionsHolder() == C89584cf.f203317e) {
                return true;
            }
            return false;
        }

        public final String toString() {
            return "Finishing[cancelling=" + isCancelling() + ", completing=" + isCompleting() + ", rootCause=" + getRootCause() + ", exceptions=" + getExceptionsHolder() + ", list=" + getList() + ']';
        }

        private final void setExceptionsHolder(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void setCompleting(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void setRootCause(Throwable th) {
            this._rootCause = th;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.ArrayList<java.lang.Throwable> */
        /* JADX WARN: Multi-variable type inference failed */
        public final void addExceptionLocked(Throwable th) {
            Throwable rootCause = getRootCause();
            if (rootCause == null) {
                setRootCause(th);
            } else if (th != rootCause) {
                Object exceptionsHolder = getExceptionsHolder();
                if (exceptionsHolder == null) {
                    setExceptionsHolder(th);
                } else if (exceptionsHolder instanceof Throwable) {
                    if (th != exceptionsHolder) {
                        ArrayList<Throwable> allocateList = allocateList();
                        allocateList.add(exceptionsHolder);
                        allocateList.add(th);
                        setExceptionsHolder(allocateList);
                    }
                } else if (exceptionsHolder instanceof ArrayList) {
                    ((ArrayList) exceptionsHolder).add(th);
                } else {
                    throw new IllegalStateException("State is ".concat(String.valueOf(exceptionsHolder)).toString());
                }
            }
        }

        public final List<Throwable> sealLocked(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object exceptionsHolder = getExceptionsHolder();
            if (exceptionsHolder == null) {
                arrayList = allocateList();
            } else if (exceptionsHolder instanceof Throwable) {
                arrayList = allocateList();
                arrayList.add(exceptionsHolder);
            } else if (exceptionsHolder instanceof ArrayList) {
                arrayList = (ArrayList) exceptionsHolder;
            } else {
                throw new IllegalStateException("State is ".concat(String.valueOf(exceptionsHolder)).toString());
            }
            Throwable rootCause = getRootCause();
            if (rootCause != null) {
                arrayList.add(0, rootCause);
            }
            if (th != null && (!C89219l.m154714a(th, rootCause))) {
                arrayList.add(th);
            }
            setExceptionsHolder(C89584cf.f203317e);
            return arrayList;
        }

        public Finishing(C89588cj cjVar, boolean z, Throwable th) {
            this.list = cjVar;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }
    }

    @Override // p4600h.p4603c.AbstractC89127f.AbstractC89130b
    public final AbstractC89127f.AbstractC89132c<?> getKey() {
        return AbstractC89568bz.f203287c;
    }

    /* renamed from: a */
    private static void m155243a(Throwable th, List<? extends Throwable> list) {
        Throwable a;
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            if (!C89527ar.f203245c) {
                a = th;
            } else {
                a = C89658u.m155627a(th);
            }
            for (Throwable th2 : list) {
                if (C89527ar.f203245c) {
                    th2 = C89658u.m155627a(th2);
                }
                if (th2 != th && th2 != a && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C89032a.m154603a(th, th2);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m155244a(AbstractC89583ce<?> ceVar) {
        ceVar.mo144187a(new C89588cj());
        f203154d.compareAndSet(this, ceVar, C89645k.m155583a(ceVar.mo144190g()));
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: a */
    public void mo143985a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C89579ca(mo144004g(), null, this);
        }
        mo143992b((Throwable) cancellationException);
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: a */
    public final AbstractC89677s mo143984a(AbstractC89695u uVar) {
        AbstractC89548bh a = AbstractC89568bz.C89569a.m155510a(this, true, false, new C89694t(this, uVar), 2);
        if (a != null) {
            return (AbstractC89677s) a;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: a */
    private final void m155245a(C89588cj cjVar, Throwable th) {
        Object g = cjVar.mo144190g();
        if (g != null) {
            C89504ae aeVar = null;
            for (C89646l lVar = (C89646l) g; !C89219l.m154714a(lVar, cjVar); lVar = lVar.mo144191h()) {
                if (lVar instanceof AbstractC89580cb) {
                    AbstractC89503ad adVar = (AbstractC89503ad) lVar;
                    try {
                        adVar.mo144029a(th);
                    } catch (Throwable th2) {
                        if (aeVar != null) {
                            C89032a.m154603a(aeVar, th2);
                        } else {
                            aeVar = new C89504ae("Exception in completion handler " + adVar + " for " + this, th2);
                        }
                    }
                }
            }
            if (aeVar != null) {
                mo143990a_((Throwable) aeVar);
            }
            m155254f(th);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [kotlinx.coroutines.bt] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.AbstractC89548bh mo143983a(boolean r8, boolean r9, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Throwable, p4600h.C89391z> r10) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo143983a(boolean, boolean, h.f.a.b):kotlinx.coroutines.bh");
    }

    /* renamed from: a */
    private final boolean m155246a(Object obj, C89588cj cjVar, AbstractC89583ce<?> ceVar) {
        int a;
        C89457c cVar = new C89457c(ceVar, ceVar, this, obj);
        do {
            a = cjVar.mo144192i().mo144186a(ceVar, cjVar, cVar);
            if (a == 1) {
                return true;
            }
        } while (a != 2);
        return false;
    }

    /* renamed from: a */
    public final void mo143987a(AbstractC89568bz bzVar) {
        if (C89527ar.f203243a && this._parentHandle != null) {
            throw new AssertionError();
        } else if (bzVar == null) {
            this._parentHandle = C89589ck.f203322a;
        } else {
            bzVar.mo144010n();
            AbstractC89677s a = bzVar.mo143984a(this);
            this._parentHandle = a;
            if (mo144007k()) {
                a.cQ_();
                this._parentHandle = C89589ck.f203322a;
            }
        }
    }

    /* renamed from: a */
    private final boolean m155247a(AbstractC89563bu buVar, Object obj) {
        if (C89527ar.f203243a && !(buVar instanceof C89551bk) && !(buVar instanceof AbstractC89583ce)) {
            throw new AssertionError();
        } else if (C89527ar.f203243a && !(!(obj instanceof CompletedExceptionally))) {
            throw new AssertionError();
        } else if (!f203154d.compareAndSet(this, buVar, C89584cf.m155518a(obj))) {
            return false;
        } else {
            mo143989a_(obj);
            m155249b(buVar, obj);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo143986a(Finishing finishing, C89694t tVar, Object obj) {
        if (!C89527ar.f203243a || mo144012p() == finishing) {
            C89694t a = m155242a((C89646l) tVar);
            if (a == null || !m155251b(finishing, a, obj)) {
                mo143995c(m155236a(finishing, obj));
                return;
            }
            return;
        }
        throw new AssertionError();
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: o */
    public /* synthetic */ void mo144011o() {
        mo143985a((CancellationException) null);
    }

    /* renamed from: kotlinx.coroutines.JobSupport$c */
    public static final class C89457c extends C89646l.AbstractC89647a {

        /* renamed from: a */
        final /* synthetic */ C89646l f203160a;

        /* renamed from: b */
        final /* synthetic */ JobSupport f203161b;

        /* renamed from: c */
        final /* synthetic */ Object f203162c;

        static {
            Covode.recordClassIndex(105546);
        }

        @Override // kotlinx.coroutines.internal.AbstractC89630c
        /* renamed from: a */
        public final /* synthetic */ Object mo144031a() {
            if (this.f203161b.mo144012p() == this.f203162c) {
                return null;
            }
            return C89645k.f203382a;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89457c(C89646l lVar, C89646l lVar2, JobSupport jobSupport, Object obj) {
            super(lVar2);
            this.f203160a = lVar;
            this.f203161b = jobSupport;
            this.f203162c = obj;
        }
    }

    /* renamed from: h */
    public String mo144005h() {
        return getClass().getSimpleName();
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: k */
    public final boolean mo144007k() {
        if (!(mo144012p() instanceof AbstractC89563bu)) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final Object mo144012p() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC89655r)) {
                return obj;
            }
            ((AbstractC89655r) obj).mo144173a(this);
        }
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: l */
    public final boolean mo144008l() {
        Object p = mo144012p();
        if (p instanceof CompletedExceptionally) {
            return true;
        }
        if (!(p instanceof Finishing) || !((Finishing) p).isCancelling()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: n */
    public final boolean mo144010n() {
        int b;
        do {
            b = mo144034b(mo144012p());
            if (b == 0) {
                return false;
            }
        } while (b != 1);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.JobSupport$b */
    public static final class C89456b extends AbstractC89583ce<AbstractC89568bz> {

        /* renamed from: a */
        private final JobSupport f203156a;

        /* renamed from: b */
        private final Finishing f203157b;

        /* renamed from: f */
        private final C89694t f203158f;

        /* renamed from: g */
        private final Object f203159g;

        static {
            Covode.recordClassIndex(105545);
        }

        @Override // kotlinx.coroutines.internal.C89646l
        public final String toString() {
            return "ChildCompletion[" + this.f203158f + ", " + this.f203159g + ']';
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            mo144029a(th);
            return C89391z.f203057a;
        }

        @Override // kotlinx.coroutines.AbstractC89503ad
        /* renamed from: a */
        public final void mo144029a(Throwable th) {
            this.f203156a.mo143986a(this.f203157b, this.f203158f, this.f203159g);
        }

        public C89456b(JobSupport jobSupport, Finishing finishing, C89694t tVar, Object obj) {
            super(tVar.f203467a);
            this.f203156a = jobSupport;
            this.f203157b = finishing;
            this.f203158f = tVar;
            this.f203159g = obj;
        }
    }

    /* renamed from: r */
    public final Object mo144014r() {
        Object p = mo144012p();
        if (!(!(p instanceof AbstractC89563bu))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(p instanceof CompletedExceptionally)) {
            return C89584cf.m155519b(p);
        } else {
            throw ((CompletedExceptionally) p).cause;
        }
    }

    @Override // kotlinx.coroutines.AbstractC89591cm
    /* renamed from: q */
    public final CancellationException mo144013q() {
        Throwable th;
        Object p = mo144012p();
        CancellationException cancellationException = null;
        if (p instanceof Finishing) {
            th = ((Finishing) p).getRootCause();
        } else if (p instanceof CompletedExceptionally) {
            th = ((CompletedExceptionally) p).cause;
        } else if (!(p instanceof AbstractC89563bu)) {
            th = null;
        } else {
            throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(p)).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 == null) {
            return new C89579ca("Parent job is " + m155258j(p), th, this);
        }
        return cancellationException2;
    }

    public String toString() {
        return (mo144005h() + '{' + m155258j(mo144012p()) + '}') + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: m */
    public final CancellationException mo144009m() {
        CancellationException a;
        Object p = mo144012p();
        if (p instanceof Finishing) {
            Throwable rootCause = ((Finishing) p).getRootCause();
            if (rootCause != null && (a = m155238a(rootCause, getClass().getSimpleName() + " is cancelling")) != null) {
                return a;
            }
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        } else if (p instanceof AbstractC89563bu) {
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        } else if (p instanceof CompletedExceptionally) {
            return m155238a(((CompletedExceptionally) p).cause, (String) null);
        } else {
            return new C89579ca(getClass().getSimpleName() + " has completed normally", null, this);
        }
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: b */
    public boolean mo143993b() {
        Object p = mo144012p();
        if (!(p instanceof AbstractC89563bu) || !((AbstractC89563bu) p).isActive()) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC89695u
    /* renamed from: a */
    public final void mo143988a(AbstractC89591cm cmVar) {
        m155253f(cmVar);
    }

    /* renamed from: b */
    public void mo143992b(Throwable th) {
        m155253f((Object) th);
    }

    /* renamed from: d */
    public final boolean mo144000d(Throwable th) {
        return m155253f((Object) th);
    }

    @Override // p4600h.p4603c.AbstractC89127f.AbstractC89130b, p4600h.p4603c.AbstractC89127f
    public <E extends AbstractC89127f.AbstractC89130b> E get(AbstractC89127f.AbstractC89132c<E> cVar) {
        return (E) AbstractC89127f.AbstractC89130b.C89131a.m154622a(this, cVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public AbstractC89127f minusKey(AbstractC89127f.AbstractC89132c<?> cVar) {
        return AbstractC89127f.AbstractC89130b.C89131a.m154625b(this, cVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public AbstractC89127f plus(AbstractC89127f fVar) {
        return AbstractC89127f.AbstractC89130b.C89131a.m154623a(this, fVar);
    }

    /* renamed from: a_ */
    public void mo143990a_(Throwable th) {
        throw th;
    }

    public JobSupport(boolean z) {
        C89551bk bkVar;
        if (z) {
            bkVar = C89584cf.f203319g;
        } else {
            bkVar = C89584cf.f203318f;
        }
        this._state = bkVar;
        this._parentHandle = null;
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: a */
    public final AbstractC89548bh mo143982a(AbstractC89172b<? super Throwable, C89391z> bVar) {
        return mo143983a(false, true, bVar);
    }

    /* renamed from: f */
    private final boolean m155254f(Throwable th) {
        if (mo144006i()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        AbstractC89677s sVar = (AbstractC89677s) this._parentHandle;
        if (sVar == null || sVar == C89589ck.f203322a) {
            return z;
        }
        if (sVar.mo144147b(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo143996c(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!m155253f((Object) th) || !cP_()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo143999d(Object obj) {
        Object a;
        do {
            a = m155235a(mo144012p(), obj);
            if (a == C89584cf.f203313a) {
                return false;
            }
            if (a == C89584cf.f203314b) {
                return true;
            }
        } while (a == C89584cf.f203315c);
        mo143995c(a);
        return true;
    }

    /* renamed from: kotlinx.coroutines.JobSupport$a */
    static final class C89455a<T> extends C89672n<T> {

        /* renamed from: b */
        private final JobSupport f203155b;

        static {
            Covode.recordClassIndex(105544);
        }

        /* access modifiers changed from: protected */
        @Override // kotlinx.coroutines.C89672n
        /* renamed from: h */
        public final String mo144028h() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.C89672n
        /* renamed from: a */
        public final Throwable mo144027a(AbstractC89568bz bzVar) {
            Throwable rootCause;
            Object p = this.f203155b.mo144012p();
            if ((p instanceof Finishing) && (rootCause = ((Finishing) p).getRootCause()) != null) {
                return rootCause;
            }
            if (p instanceof CompletedExceptionally) {
                return ((CompletedExceptionally) p).cause;
            }
            return bzVar.mo144009m();
        }

        public C89455a(AbstractC89124d<? super T> dVar, JobSupport jobSupport) {
            super(dVar, 1);
            this.f203155b = jobSupport;
        }
    }

    /* renamed from: b */
    private final int mo144034b(Object obj) {
        if (obj instanceof C89551bk) {
            if (((C89551bk) obj).isActive()) {
                return 0;
            }
            if (!f203154d.compareAndSet(this, obj, C89584cf.f203319g)) {
                return -1;
            }
            mo144002e();
            return 1;
        } else if (!(obj instanceof C89562bt)) {
            return 0;
        } else {
            if (!f203154d.compareAndSet(this, obj, ((C89562bt) obj).getList())) {
                return -1;
            }
            mo144002e();
            return 1;
        }
    }

    /* renamed from: f */
    private boolean m155253f(Object obj) {
        Object obj2 = C89584cf.f203313a;
        if (cO_() && (obj2 = m155255g(obj)) == C89584cf.f203314b) {
            return true;
        }
        if (obj2 == C89584cf.f203313a) {
            obj2 = m155257i(obj);
        }
        if (obj2 == C89584cf.f203313a || obj2 == C89584cf.f203314b) {
            return true;
        }
        if (obj2 == C89584cf.f203316d) {
            return false;
        }
        mo143995c(obj2);
        return true;
    }

    /* renamed from: g */
    private final Object m155255g(Object obj) {
        Object a;
        do {
            Object p = mo144012p();
            if (!(p instanceof AbstractC89563bu) || ((p instanceof Finishing) && ((Finishing) p).isCompleting())) {
                return C89584cf.f203313a;
            }
            a = m155235a(p, new CompletedExceptionally(m155256h(obj), false, 2, null));
        } while (a == C89584cf.f203315c);
        return a;
    }

    /* renamed from: h */
    private final Throwable m155256h(Object obj) {
        if (obj != null) {
            if (obj instanceof Throwable) {
                if (obj != null) {
                    return (Throwable) obj;
                }
            } else if (obj != null) {
                return ((AbstractC89591cm) obj).mo144013q();
            } else {
                throw new C89388w("null cannot be cast to non-null type");
            }
        }
        return new C89579ca(mo144004g(), null, this);
    }

    /* renamed from: j */
    private static String m155258j(Object obj) {
        if (obj instanceof Finishing) {
            Finishing finishing = (Finishing) obj;
            if (finishing.isCancelling()) {
                return "Cancelling";
            }
            if (finishing.isCompleting()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof AbstractC89563bu) {
            if (((AbstractC89563bu) obj).isActive()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof CompletedExceptionally) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: e */
    public final Object mo144001e(Object obj) {
        Object a;
        do {
            a = m155235a(mo144012p(), obj);
            if (a == C89584cf.f203313a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (!(obj instanceof CompletedExceptionally)) {
                    obj = null;
                }
                CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                if (completedExceptionally != null) {
                    th = completedExceptionally.cause;
                }
                throw new IllegalStateException(str, th);
            }
        } while (a == C89584cf.f203315c);
        return a;
    }

    /* renamed from: c */
    public final Object mo143994c(AbstractC89124d<Object> dVar) {
        Object p;
        do {
            p = mo144012p();
            if (!(p instanceof AbstractC89563bu)) {
                if (!(p instanceof CompletedExceptionally)) {
                    return C89584cf.m155519b(p);
                }
                Throwable th = ((CompletedExceptionally) p).cause;
                if (!C89527ar.f203245c) {
                    throw th;
                } else if (!(dVar instanceof AbstractC89111e)) {
                    throw th;
                } else {
                    throw C89658u.m155628a(th, (AbstractC89111e) dVar);
                }
            }
        } while (mo144034b(p) < 0);
        C89455a aVar = new C89455a(C89099b.m154605a(dVar), this);
        C89674p.m155682a(aVar, mo143983a(false, true, (AbstractC89172b<? super Throwable, C89391z>) new C89593co(this, aVar)));
        Object e = aVar.mo144218e();
        if (e == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0096, code lost:
        if (r4 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        m155245a(((kotlinx.coroutines.JobSupport.Finishing) r3).getList(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a3, code lost:
        return kotlinx.coroutines.C89584cf.f203313a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x003d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0002 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m155257i(java.lang.Object r10) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.m155257i(java.lang.Object):java.lang.Object");
    }

    @Override // kotlinx.coroutines.AbstractC89568bz
    /* renamed from: b */
    public final Object mo143991b(AbstractC89124d<? super C89391z> dVar) {
        Object p;
        do {
            p = mo144012p();
            if (!(p instanceof AbstractC89563bu)) {
                C89612de.m155541a(dVar.getContext());
                return C89391z.f203057a;
            }
        } while (mo144034b(p) < 0);
        C89672n nVar = new C89672n(C89099b.m154605a(dVar), 1);
        C89674p.m155682a(nVar, mo143983a(false, true, (AbstractC89172b<? super Throwable, C89391z>) new C89594cp(this, nVar)));
        Object e = nVar.mo144218e();
        if (e == EnumC89098a.COROUTINE_SUSPENDED) {
            C89219l.m154721d(dVar, "");
        }
        if (e == EnumC89098a.COROUTINE_SUSPENDED) {
            return e;
        }
        return C89391z.f203057a;
    }

    /* renamed from: a */
    private final C89588cj m155241a(AbstractC89563bu buVar) {
        C89588cj list = buVar.getList();
        if (list != null) {
            return list;
        }
        if (buVar instanceof C89551bk) {
            return new C89588cj();
        }
        if (buVar instanceof AbstractC89583ce) {
            m155244a((AbstractC89583ce) buVar);
            return null;
        }
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(buVar)).toString());
    }

    /* renamed from: a */
    private static C89694t m155242a(C89646l lVar) {
        while (lVar.cT_()) {
            lVar = lVar.mo144192i();
        }
        while (true) {
            lVar = C89645k.m155583a(lVar.mo144190g());
            if (!lVar.cT_()) {
                if (lVar instanceof C89694t) {
                    return (C89694t) lVar;
                }
                if (lVar instanceof C89588cj) {
                    return null;
                }
            }
        }
    }

    @Override // p4600h.p4603c.AbstractC89127f
    public <R> R fold(R r, AbstractC89183m<? super R, ? super AbstractC89127f.AbstractC89130b, ? extends R> mVar) {
        return (R) AbstractC89127f.AbstractC89130b.C89131a.m154624a(this, r, mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public CancellationException m155238a(Throwable th, String str) {
        Throwable th2;
        if (!(th instanceof CancellationException)) {
            th2 = null;
        } else {
            th2 = th;
        }
        CancellationException cancellationException = (CancellationException) th2;
        if (cancellationException == null) {
            if (str == null) {
                str = mo144004g();
            }
            cancellationException = new C89579ca(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: a */
    private final Object m155235a(Object obj, Object obj2) {
        if (!(obj instanceof AbstractC89563bu)) {
            return C89584cf.f203313a;
        }
        if ((!(obj instanceof C89551bk) && !(obj instanceof AbstractC89583ce)) || (obj instanceof C89694t) || (obj2 instanceof CompletedExceptionally)) {
            return m155252c((AbstractC89563bu) obj, obj2);
        }
        if (m155247a((AbstractC89563bu) obj, obj2)) {
            return obj2;
        }
        return C89584cf.f203315c;
    }

    /* renamed from: a */
    private final Throwable m155237a(Finishing finishing, List<? extends Throwable> list) {
        T t;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(t instanceof CancellationException)) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                return t3;
            }
            Throwable th = (Throwable) list.get(0);
            if (th instanceof C89604cz) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        T next = it2.next();
                        if (next != th && (next instanceof C89604cz)) {
                            t2 = next;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                T t4 = t2;
                if (t4 != null) {
                    return t4;
                }
            }
            return th;
        } else if (finishing.isCancelling()) {
            return new C89579ca(mo144004g(), null, this);
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private final void m155249b(AbstractC89563bu buVar, Object obj) {
        AbstractC89677s sVar = (AbstractC89677s) this._parentHandle;
        if (sVar != null) {
            sVar.cQ_();
            this._parentHandle = C89589ck.f203322a;
        }
        Throwable th = null;
        if (!(obj instanceof CompletedExceptionally)) {
            obj = null;
        }
        CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
        if (completedExceptionally != null) {
            th = completedExceptionally.cause;
        }
        if (buVar instanceof AbstractC89583ce) {
            try {
                ((AbstractC89583ce) buVar).mo144029a(th);
            } catch (Throwable th2) {
                mo143990a_((Throwable) new C89504ae("Exception in completion handler " + buVar + " for " + this, th2));
            }
        } else {
            C89588cj list = buVar.getList();
            if (list != null) {
                m155250b(list, th);
            }
        }
    }

    /* renamed from: a */
    private final Object m155236a(Finishing finishing, Object obj) {
        Object obj2;
        Throwable th;
        Throwable a;
        if (C89527ar.f203243a && mo144012p() != finishing) {
            throw new AssertionError();
        } else if (C89527ar.f203243a && !(!finishing.isSealed())) {
            throw new AssertionError();
        } else if (!C89527ar.f203243a || finishing.isCompleting()) {
            if (!(obj instanceof CompletedExceptionally)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
            if (completedExceptionally != null) {
                th = completedExceptionally.cause;
            } else {
                th = null;
            }
            synchronized (finishing) {
                finishing.isCancelling();
                List<Throwable> sealLocked = finishing.sealLocked(th);
                a = m155237a(finishing, (List<? extends Throwable>) sealLocked);
                if (a != null) {
                    m155243a(a, (List<? extends Throwable>) sealLocked);
                }
            }
            if (a != null) {
                if (a != th) {
                    obj = new CompletedExceptionally(a, false, 2, null);
                }
                if (m155254f(a) || mo144003e(a)) {
                    if (obj != null) {
                        ((CompletedExceptionally) obj).makeHandled();
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
            }
            mo143989a_(obj);
            boolean compareAndSet = f203154d.compareAndSet(this, finishing, C89584cf.m155518a(obj));
            if (!C89527ar.f203243a || compareAndSet) {
                m155249b(finishing, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private final void m155250b(C89588cj cjVar, Throwable th) {
        Object g = cjVar.mo144190g();
        if (g != null) {
            C89504ae aeVar = null;
            for (C89646l lVar = (C89646l) g; !C89219l.m154714a(lVar, cjVar); lVar = lVar.mo144191h()) {
                if (lVar instanceof AbstractC89583ce) {
                    AbstractC89503ad adVar = (AbstractC89503ad) lVar;
                    try {
                        adVar.mo144029a(th);
                    } catch (Throwable th2) {
                        if (aeVar != null) {
                            C89032a.m154603a(aeVar, th2);
                        } else {
                            aeVar = new C89504ae("Exception in completion handler " + adVar + " for " + this, th2);
                        }
                    }
                }
            }
            if (aeVar != null) {
                mo143990a_((Throwable) aeVar);
                return;
            }
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0062, code lost:
        if (r0 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        m155245a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0069, code lost:
        if ((r7 instanceof kotlinx.coroutines.C89694t) != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006c, code lost:
        r0 = (kotlinx.coroutines.C89694t) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006e, code lost:
        if (r0 != null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0070, code lost:
        r0 = r7.getList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0074, code lost:
        if (r0 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0076, code lost:
        r3 = m155242a((kotlinx.coroutines.internal.C89646l) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007a, code lost:
        if (r3 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0080, code lost:
        if (m155251b(r2, r3, r8) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0084, code lost:
        return kotlinx.coroutines.C89584cf.f203314b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0085, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0087, code lost:
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x008d, code lost:
        return m155236a(r2, r8);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m155252c(kotlinx.coroutines.AbstractC89563bu r7, java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.m155252c(kotlinx.coroutines.bu, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    private final AbstractC89583ce<?> m155240a(AbstractC89172b<? super Throwable, C89391z> bVar, boolean z) {
        AbstractC89580cb cbVar = null;
        if (z) {
            if (bVar instanceof AbstractC89580cb) {
                cbVar = bVar;
            }
            AbstractC89580cb cbVar2 = cbVar;
            if (cbVar2 == null) {
                return new C89566bx(this, bVar);
            }
            if (!C89527ar.f203243a || cbVar2.f203312c == this) {
                return cbVar2;
            }
            throw new AssertionError();
        }
        if (bVar instanceof AbstractC89583ce) {
            cbVar = bVar;
        }
        AbstractC89583ce<?> ceVar = cbVar;
        if (ceVar == null) {
            return new C89567by(this, bVar);
        }
        if (!C89527ar.f203243a) {
            return ceVar;
        }
        if (ceVar.f203312c == this && !(ceVar instanceof AbstractC89580cb)) {
            return ceVar;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    private final boolean m155251b(Finishing finishing, C89694t tVar, Object obj) {
        while (AbstractC89568bz.C89569a.m155510a(tVar.f203467a, false, false, new C89456b(this, finishing, tVar, obj), 1) == C89589ck.f203322a) {
            tVar = m155242a((C89646l) tVar);
            if (tVar == null) {
                return false;
            }
        }
        return true;
    }
}
