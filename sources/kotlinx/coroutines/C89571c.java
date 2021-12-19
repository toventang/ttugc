package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p4600h.C89379q;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.c */
public final class C89571c<T> {

    /* renamed from: a */
    static final AtomicIntegerFieldUpdater f203289a = AtomicIntegerFieldUpdater.newUpdater(C89571c.class, "notCompletedCount");

    /* renamed from: b */
    public final AbstractC89531av<T>[] f203290b;
    volatile int notCompletedCount;

    static {
        Covode.recordClassIndex(105662);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.c$a */
    public final class C89572a extends AbstractC89583ce<AbstractC89568bz> {
        public volatile Object _disposer;

        /* renamed from: a */
        public AbstractC89548bh f203291a;

        /* renamed from: f */
        private final AbstractC89671m<List<? extends T>> f203293f;

        static {
            Covode.recordClassIndex(105663);
        }

        /* renamed from: a */
        public final AbstractC89548bh mo144138a() {
            AbstractC89548bh bhVar = this.f203291a;
            if (bhVar == null) {
                C89219l.m154710a("handle");
            }
            return bhVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            mo144029a(th);
            return C89391z.f203057a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.concurrent.atomic.AtomicIntegerFieldUpdater */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.AbstractC89503ad
        /* renamed from: a */
        public final void mo144029a(Throwable th) {
            if (th != null) {
                Object a = this.f203293f.mo144210a(th);
                if (a != null) {
                    this.f203293f.mo144214b(a);
                    C89573b bVar = (C89573b) this._disposer;
                    if (bVar != null) {
                        bVar.mo144139a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C89571c.f203289a.decrementAndGet(C89571c.this) == 0) {
                AbstractC89671m<List<? extends T>> mVar = this.f203293f;
                AbstractC89531av<T>[] avVarArr = C89571c.this.f203290b;
                ArrayList arrayList = new ArrayList(avVarArr.length);
                for (AbstractC89531av<T> avVar : avVarArr) {
                    arrayList.add(avVar.mo144107c());
                }
                mVar.resumeWith(C89379q.m157068constructorimpl(arrayList));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.m<? super java.util.List<? extends T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C89572a(AbstractC89671m<? super List<? extends T>> mVar, AbstractC89568bz bzVar) {
            super(bzVar);
            this.f203293f = mVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.c$b */
    public final class C89573b extends AbstractC89669k {

        /* renamed from: b */
        private final C89571c<T>.C89572a[] f203295b;

        static {
            Covode.recordClassIndex(105664);
        }

        /* renamed from: a */
        public final void mo144139a() {
            for (C89571c<T>.C89572a aVar : this.f203295b) {
                aVar.mo144138a().cQ_();
            }
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f203295b + ']';
        }

        @Override // kotlinx.coroutines.AbstractC89670l
        /* renamed from: a */
        public final void mo144051a(Throwable th) {
            mo144139a();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            mo144139a();
            return C89391z.f203057a;
        }

        public C89573b(C89571c<T>.C89572a[] aVarArr) {
            this.f203295b = aVarArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.av<? extends T>[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C89571c(AbstractC89531av<? extends T>[] avVarArr) {
        this.f203290b = avVarArr;
        this.notCompletedCount = avVarArr.length;
    }
}
