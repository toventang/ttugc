package kotlinx.coroutines.flow.p4639a;

import com.bytedance.covode.number.Covode;
import kotlinx.coroutines.AbstractC89458a;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.C89506ag;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89527ar;
import kotlinx.coroutines.EnumC89524ao;
import kotlinx.coroutines.flow.AbstractC89615a;
import kotlinx.coroutines.flow.C89620b;
import kotlinx.coroutines.p4636a.AbstractC89473f;
import kotlinx.coroutines.p4636a.AbstractC89475h;
import kotlinx.coroutines.p4636a.AbstractC89492s;
import kotlinx.coroutines.p4636a.AbstractC89494u;
import kotlinx.coroutines.p4636a.C89470d;
import kotlinx.coroutines.p4636a.C89472e;
import kotlinx.coroutines.p4636a.C89474g;
import kotlinx.coroutines.p4636a.C89482n;
import kotlinx.coroutines.p4636a.C89487o;
import kotlinx.coroutines.p4636a.C89489p;
import kotlinx.coroutines.p4636a.C89490q;
import kotlinx.coroutines.p4636a.C89491r;
import kotlinx.coroutines.p4636a.C89496w;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.C89133g;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.flow.a.a */
public abstract class AbstractC89616a<T> {
    public final int capacity;
    public final AbstractC89127f context;

    static {
        Covode.recordClassIndex(105708);
    }

    public String additionalToStringProps() {
        return "";
    }

    public Object collect(AbstractC89615a<? super T> aVar, AbstractC89124d<? super C89391z> dVar) {
        return collect$suspendImpl(this, aVar, dVar);
    }

    /* access modifiers changed from: protected */
    public abstract Object collectTo(AbstractC89492s<? super T> sVar, AbstractC89124d<? super C89391z> dVar);

    /* access modifiers changed from: protected */
    public abstract AbstractC89616a<T> create(AbstractC89127f fVar, int i);

    private final int getProduceCapacity() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public final AbstractC89183m<AbstractC89492s<? super T>, AbstractC89124d<? super C89391z>, Object> getCollectToFun$kotlinx_coroutines_core() {
        return new C89618b(this, null);
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + additionalToStringProps() + "context=" + this.context + ", capacity=" + this.capacity + ']';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.a.a$a */
    public static final class C89617a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f203341a;

        /* renamed from: b */
        int f203342b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89616a f203343c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89615a f203344d;

        /* renamed from: e */
        private AbstractC89516am f203345e;

        static {
            Covode.recordClassIndex(105709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89617a(AbstractC89616a aVar, AbstractC89615a aVar2, AbstractC89124d dVar) {
            super(2, dVar);
            this.f203343c = aVar;
            this.f203344d = aVar2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89617a aVar = new C89617a(this.f203343c, this.f203344d, dVar);
            aVar.f203345e = (AbstractC89516am) obj;
            return aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C89617a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f203342b;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89516am amVar = this.f203345e;
                AbstractC89615a aVar = this.f203344d;
                AbstractC89494u<T> produceImpl = this.f203343c.produceImpl(amVar);
                this.f203341a = amVar;
                this.f203342b = 1;
                Object a = C89620b.m155547a(aVar, produceImpl, true, this);
                if (a != EnumC89098a.COROUTINE_SUSPENDED) {
                    a = C89391z.f203057a;
                }
                if (a == obj2) {
                    return obj2;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.a.a$b */
    public static final class C89618b extends AbstractC89118k implements AbstractC89183m<AbstractC89492s<? super T>, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f203346a;

        /* renamed from: b */
        int f203347b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89616a f203348c;

        /* renamed from: d */
        private AbstractC89492s f203349d;

        static {
            Covode.recordClassIndex(105710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89618b(AbstractC89616a aVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f203348c = aVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89618b bVar = new C89618b(this.f203348c, dVar);
            bVar.f203349d = (AbstractC89492s) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(Object obj, AbstractC89124d<? super C89391z> dVar) {
            return ((C89618b) create(obj, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f203347b;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89492s<? super T> sVar = this.f203349d;
                AbstractC89616a aVar2 = this.f203348c;
                this.f203346a = sVar;
                this.f203347b = 1;
                if (aVar2.collectTo(sVar, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C89391z.f203057a;
        }
    }

    public AbstractC89494u<T> produceImpl(AbstractC89516am amVar) {
        AbstractC89475h eVar;
        AbstractC89127f fVar = this.context;
        int produceCapacity = getProduceCapacity();
        EnumC89524ao aoVar = EnumC89524ao.ATOMIC;
        AbstractC89183m<AbstractC89492s<? super T>, AbstractC89124d<? super C89391z>, Object> collectToFun$kotlinx_coroutines_core = getCollectToFun$kotlinx_coroutines_core();
        if (produceCapacity == -2) {
            eVar = new C89472e(AbstractC89475h.C89476a.f203196a);
        } else if (produceCapacity == -1) {
            eVar = new C89487o();
        } else if (produceCapacity == 0) {
            eVar = new C89496w();
        } else if (produceCapacity != Integer.MAX_VALUE) {
            eVar = new C89472e(produceCapacity);
        } else {
            eVar = new C89490q();
        }
        C89491r rVar = new C89491r(C89506ag.m155440a(amVar, fVar), eVar);
        rVar.mo144033a(aoVar, rVar, collectToFun$kotlinx_coroutines_core);
        return rVar;
    }

    public AbstractC89616a(AbstractC89127f fVar, int i) {
        this.context = fVar;
        this.capacity = i;
    }

    public AbstractC89473f<T> broadcastImpl(AbstractC89516am amVar, EnumC89524ao aoVar) {
        AbstractC89473f dVar;
        C89474g gVar;
        AbstractC89127f fVar = this.context;
        int produceCapacity = getProduceCapacity();
        AbstractC89183m<AbstractC89492s<? super T>, AbstractC89124d<? super C89391z>, Object> collectToFun$kotlinx_coroutines_core = getCollectToFun$kotlinx_coroutines_core();
        AbstractC89127f a = C89506ag.m155440a(amVar, fVar);
        if (produceCapacity == -2) {
            dVar = new C89470d(AbstractC89475h.C89476a.f203196a);
        } else if (produceCapacity == -1) {
            dVar = new C89482n();
        } else if (produceCapacity == 0) {
            throw new IllegalArgumentException("Unsupported 0 capacity for BroadcastChannel");
        } else if (produceCapacity != Integer.MAX_VALUE) {
            dVar = new C89470d(produceCapacity);
        } else {
            throw new IllegalArgumentException("Unsupported UNLIMITED capacity for BroadcastChannel");
        }
        if (aoVar.isLazy()) {
            gVar = new C89489p(a, dVar, collectToFun$kotlinx_coroutines_core);
        } else {
            gVar = new C89474g(a, dVar, true);
        }
        ((AbstractC89458a) gVar).mo144033a(aoVar, gVar, collectToFun$kotlinx_coroutines_core);
        return gVar;
    }

    public final AbstractC89616a<T> update(AbstractC89127f fVar, int i) {
        AbstractC89127f plus = fVar.plus(this.context);
        int i2 = this.capacity;
        if (i2 != -3) {
            if (i != -3) {
                if (i2 != -2) {
                    if (i != -2) {
                        if (i2 == -1 || i == -1) {
                            i = -1;
                        } else if (C89527ar.f203243a && this.capacity < 0) {
                            throw new AssertionError();
                        } else if (!C89527ar.f203243a || i >= 0) {
                            i += this.capacity;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
            }
            i = i2;
        }
        if (!C89219l.m154714a(plus, this.context) || i != this.capacity) {
            return create(plus, i);
        }
        return this;
    }

    static /* synthetic */ Object collect$suspendImpl(AbstractC89616a aVar, AbstractC89615a aVar2, AbstractC89124d dVar) {
        Object a = C89517an.m155447a(new C89617a(aVar, aVar2, null), dVar);
        if (a == EnumC89098a.COROUTINE_SUSPENDED) {
            return a;
        }
        return C89391z.f203057a;
    }

    public static /* synthetic */ AbstractC89616a update$default(AbstractC89616a aVar, AbstractC89127f fVar, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                fVar = C89133g.INSTANCE;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            return aVar.update(fVar, i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
    }
}
