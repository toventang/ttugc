package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;

/* access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.aw */
public class C89532aw<T> extends AbstractC89458a<T> implements AbstractC89531av<T> {

    /* access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.aw$a */
    public static final class C89533a extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f203250a;

        /* renamed from: b */
        int f203251b;

        /* renamed from: c */
        final /* synthetic */ C89532aw f203252c;

        /* renamed from: d */
        Object f203253d;

        static {
            Covode.recordClassIndex(105624);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C89533a(C89532aw awVar, AbstractC89124d dVar) {
            super(dVar);
            this.f203252c = awVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f203250a = obj;
            this.f203251b |= Integer.MIN_VALUE;
            return C89532aw.m155460a(this.f203252c, (AbstractC89124d) this);
        }
    }

    static {
        Covode.recordClassIndex(105623);
    }

    @Override // kotlinx.coroutines.AbstractC89531av
    /* renamed from: a */
    public final Object mo144106a(AbstractC89124d<? super T> dVar) {
        return m155460a((C89532aw) this, (AbstractC89124d) dVar);
    }

    @Override // kotlinx.coroutines.AbstractC89531av
    /* renamed from: c */
    public final T mo144107c() {
        return (T) mo144014r();
    }

    public C89532aw(AbstractC89127f fVar, boolean z) {
        super(fVar, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object m155460a(kotlinx.coroutines.C89532aw r5, p4600h.p4603c.AbstractC89124d r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.C89532aw.C89533a
            if (r0 == 0) goto L_0x0030
            r4 = r6
            kotlinx.coroutines.aw$a r4 = (kotlinx.coroutines.C89532aw.C89533a) r4
            int r0 = r4.f203251b
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0030
            int r0 = r4.f203251b
            int r0 = r0 - r1
            r4.f203251b = r0
        L_0x0013:
            java.lang.Object r3 = r4.f203250a
            h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
            int r1 = r4.f203251b
            r0 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 != r0) goto L_0x0036
            p4600h.C89382r.m154942a(r3)
        L_0x0021:
            return r3
        L_0x0022:
            p4600h.C89382r.m154942a(r3)
            r4.f203253d = r5
            r4.f203251b = r0
            java.lang.Object r3 = r5.mo143994c(r4)
            if (r3 != r2) goto L_0x0021
            return r2
        L_0x0030:
            kotlinx.coroutines.aw$a r4 = new kotlinx.coroutines.aw$a
            r4.<init>(r5, r6)
            goto L_0x0013
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C89532aw.m155460a(kotlinx.coroutines.aw, h.c.d):java.lang.Object");
    }
}
