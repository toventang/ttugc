package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;

/* access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.x */
public final class C89700x<T> extends JobSupport implements AbstractC89699w<T> {

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.x$a */
    public static final class C89701a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f203473a;

        /* renamed from: b */
        int f203474b;

        /* renamed from: c */
        final /* synthetic */ C89700x f203475c;

        /* renamed from: d */
        Object f203476d;

        static {
            Covode.recordClassIndex(105795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89701a(C89700x xVar, AbstractC89124d dVar) {
            super(dVar);
            this.f203475c = xVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f203473a = obj;
            this.f203474b |= Integer.MIN_VALUE;
            return this.f203475c.mo144106a((AbstractC89124d) this);
        }
    }

    static {
        Covode.recordClassIndex(105794);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean cO_() {
        return true;
    }

    @Override // kotlinx.coroutines.AbstractC89531av
    /* renamed from: c */
    public final T mo144107c() {
        return (T) mo144014r();
    }

    @Override // kotlinx.coroutines.AbstractC89699w
    /* renamed from: a */
    public final boolean mo144262a(T t) {
        return mo143999d((Object) t);
    }

    public C89700x(AbstractC89568bz bzVar) {
        super(true);
        mo143987a((AbstractC89568bz) null);
    }

    @Override // kotlinx.coroutines.AbstractC89699w
    /* renamed from: a */
    public final boolean mo144263a(Throwable th) {
        return mo143999d(new CompletedExceptionally(th, false, 2, null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    @Override // kotlinx.coroutines.AbstractC89531av
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo144106a(p4600h.p4603c.AbstractC89124d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.C89700x.C89701a
            if (r0 == 0) goto L_0x0030
            r4 = r6
            kotlinx.coroutines.x$a r4 = (kotlinx.coroutines.C89700x.C89701a) r4
            int r0 = r4.f203474b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0030
            int r0 = r4.f203474b
            int r0 = r0 - r1
            r4.f203474b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f203473a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r1 = r4.f203474b
            r0 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 != r0) goto L_0x0036
            p4600h.C89382r.m154942a(r3)
        L_0x0021:
            return r3
        L_0x0022:
            p4600h.C89382r.m154942a(r3)
            r4.f203476d = r5
            r4.f203474b = r0
            java.lang.Object r3 = r5.mo143994c(r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x0030:
            kotlinx.coroutines.x$a r4 = new kotlinx.coroutines.x$a
            r4.<init>(r5, r6)
            goto L_0x0013
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C89700x.mo144106a(h.c.d):java.lang.Object");
    }
}
