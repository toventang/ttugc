package p4560f.p4561a.p4568e.p4573e.p4574a;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicReference;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88416c;
import p4560f.p4561a.AbstractC88427d;
import p4560f.p4561a.AbstractC88439e;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4566c.C88422b;
import p4560f.p4561a.p4568e.p4569a.EnumC88441b;
import p4560f.p4561a.p4587h.C88925a;

/* renamed from: f.a.e.e.a.a */
public final class C88497a extends AbstractC88410b {

    /* renamed from: a */
    final AbstractC88439e f200757a;

    static {
        Covode.recordClassIndex(104539);
    }

    /* renamed from: f.a.e.e.a.a$a */
    static final class C88498a extends AtomicReference<AbstractC88412b> implements AbstractC88412b, AbstractC88416c {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a */
        final AbstractC88427d f200758a;

        static {
            Covode.recordClassIndex(104540);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final void dispose() {
            EnumC88441b.dispose(this);
        }

        @Override // p4560f.p4561a.p4565b.AbstractC88412b
        public final boolean isDisposed() {
            return EnumC88441b.isDisposed((AbstractC88412b) get());
        }

        public final String toString() {
            return C1764a.m5928a("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }

        @Override // p4560f.p4561a.AbstractC88416c
        /* renamed from: a */
        public final void mo142950a() {
            AbstractC88412b bVar;
            if (get() != EnumC88441b.DISPOSED && (bVar = (AbstractC88412b) getAndSet(EnumC88441b.DISPOSED)) != EnumC88441b.DISPOSED) {
                try {
                    this.f200758a.onComplete();
                } finally {
                    if (bVar != null) {
                        bVar.dispose();
                    }
                }
            }
        }

        C88498a(AbstractC88427d dVar) {
            this.f200758a = dVar;
        }

        @Override // p4560f.p4561a.AbstractC88416c
        /* renamed from: a */
        public final void mo142951a(Throwable th) {
            if (!m153720b(th)) {
                C88925a.m154178a(th);
            }
        }

        /* renamed from: b */
        private boolean m153720b(Throwable th) {
            AbstractC88412b bVar;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == EnumC88441b.DISPOSED || (bVar = (AbstractC88412b) getAndSet(EnumC88441b.DISPOSED)) == EnumC88441b.DISPOSED) {
                return false;
            }
            try {
                this.f200758a.onError(th);
            } finally {
                if (bVar != null) {
                    bVar.dispose();
                }
            }
        }
    }

    public C88497a(AbstractC88439e eVar) {
        this.f200757a = eVar;
    }

    @Override // p4560f.p4561a.AbstractC88410b
    /* renamed from: b */
    public final void mo142942b(AbstractC88427d dVar) {
        C88498a aVar = new C88498a(dVar);
        dVar.onSubscribe(aVar);
        try {
            this.f200757a.mo123083a(aVar);
        } catch (Throwable th) {
            C88422b.m153670a(th);
            aVar.mo142951a(th);
        }
    }
}
