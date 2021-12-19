package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;

/* renamed from: kotlinx.coroutines.co */
final class C89593co<T> extends AbstractC89583ce<JobSupport> {

    /* renamed from: a */
    private final C89672n<T> f203324a;

    static {
        Covode.recordClassIndex(105684);
    }

    @Override // kotlinx.coroutines.internal.C89646l
    public final String toString() {
        return "ResumeAwaitOnCompletion[" + this.f203324a + ']';
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
        Object p = ((JobSupport) this.f203312c).mo144012p();
        if (C89527ar.f203243a && !(!(p instanceof AbstractC89563bu))) {
            throw new AssertionError();
        } else if (p instanceof CompletedExceptionally) {
            this.f203324a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(((CompletedExceptionally) p).cause)));
        } else {
            this.f203324a.resumeWith(C89379q.m157068constructorimpl(C89584cf.m155519b(p)));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.n<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C89593co(JobSupport jobSupport, C89672n<? super T> nVar) {
        super(jobSupport);
        this.f203324a = nVar;
    }
}
