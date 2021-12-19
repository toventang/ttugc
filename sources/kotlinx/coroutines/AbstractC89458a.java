package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: kotlinx.coroutines.a */
public abstract class AbstractC89458a<T> extends JobSupport implements AbstractC89124d<T>, AbstractC89516am {

    /* renamed from: a */
    protected final AbstractC89127f f203163a;

    /* renamed from: b */
    private final AbstractC89127f f203164b;

    static {
        Covode.recordClassIndex(105547);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo144032a(Throwable th, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo144036d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo144037f() {
    }

    @Override // kotlinx.coroutines.AbstractC89516am
    /* renamed from: a */
    public final AbstractC89127f mo20678a() {
        return this.f203164b;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: e */
    public final void mo144002e() {
        mo144036d();
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final AbstractC89127f getContext() {
        return this.f203164b;
    }

    @Override // kotlinx.coroutines.AbstractC89568bz, kotlinx.coroutines.JobSupport
    /* renamed from: b */
    public boolean mo143993b() {
        return super.mo143993b();
    }

    public final void cS_() {
        mo143987a((AbstractC89568bz) this.f203163a.get(AbstractC89568bz.f203287c));
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: g */
    public final String mo144004g() {
        return getClass().getSimpleName() + " was cancelled";
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: h */
    public String mo144005h() {
        C89512ak akVar;
        String str;
        AbstractC89127f fVar = this.f203164b;
        if (C89527ar.f203244b && (akVar = (C89512ak) fVar.get(C89512ak.f203225b)) != null) {
            C89514al alVar = (C89514al) fVar.get(C89514al.f203227b);
            if (alVar == null || (str = alVar.f203228a) == null) {
                str = "coroutine";
            }
            String str2 = str + '#' + akVar.f203226a;
            if (str2 != null) {
                return "\"" + str2 + "\":" + super.mo144005h();
            }
        }
        return super.mo144005h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo144034b(Object obj) {
        mo143995c(obj);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: a_ */
    public final void mo143990a_(Throwable th) {
        C89511aj.m155443a(this.f203164b, th);
    }

    /* access modifiers changed from: protected */
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: a_ */
    public final void mo143989a_(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            mo144032a(completedExceptionally.cause, completedExceptionally.getHandled());
            return;
        }
        mo144037f();
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final void resumeWith(Object obj) {
        Object e = mo144001e(C89500aa.m155437a(obj));
        if (e != C89584cf.f203314b) {
            mo144034b(e);
        }
    }

    public AbstractC89458a(AbstractC89127f fVar, boolean z) {
        super(z);
        this.f203163a = fVar;
        this.f203164b = fVar.plus(this);
    }

    /* renamed from: a */
    public final <R> void mo144033a(EnumC89524ao aoVar, R r, AbstractC89183m<? super R, ? super AbstractC89124d<? super T>, ? extends Object> mVar) {
        cS_();
        aoVar.invoke(mVar, r, this);
    }
}
