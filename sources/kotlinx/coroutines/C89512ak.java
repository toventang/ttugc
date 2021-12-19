package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.C89388w;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: kotlinx.coroutines.ak */
public final class C89512ak extends AbstractC89097a implements AbstractC89600cv<String> {

    /* renamed from: b */
    public static final C89513a f203225b = new C89513a((byte) 0);

    /* renamed from: a */
    public final long f203226a;

    static {
        Covode.recordClassIndex(105601);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C89512ak) && this.f203226a == ((C89512ak) obj).f203226a;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f203226a;
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: kotlinx.coroutines.ak$a */
    public static final class C89513a implements AbstractC89127f.AbstractC89132c<C89512ak> {
        static {
            Covode.recordClassIndex(105602);
        }

        private C89513a() {
        }

        public /* synthetic */ C89513a(byte b) {
            this();
        }
    }

    public final String toString() {
        return "CoroutineId(" + this.f203226a + ')';
    }

    public C89512ak(long j) {
        super(f203225b);
        this.f203226a = j;
    }

    @Override // p4600h.p4603c.AbstractC89127f.AbstractC89130b, p4600h.p4603c.AbstractC89127f, p4600h.p4603c.AbstractC89097a
    public final <E extends AbstractC89127f.AbstractC89130b> E get(AbstractC89127f.AbstractC89132c<E> cVar) {
        return (E) AbstractC89127f.AbstractC89130b.C89131a.m154622a(this, cVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f, p4600h.p4603c.AbstractC89097a
    public final AbstractC89127f minusKey(AbstractC89127f.AbstractC89132c<?> cVar) {
        return AbstractC89127f.AbstractC89130b.C89131a.m154625b(this, cVar);
    }

    @Override // p4600h.p4603c.AbstractC89127f, p4600h.p4603c.AbstractC89097a
    public final AbstractC89127f plus(AbstractC89127f fVar) {
        return AbstractC89127f.AbstractC89130b.C89131a.m154623a(this, fVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlinx.coroutines.AbstractC89600cv
    /* renamed from: a */
    public final /* synthetic */ void mo144088a(String str) {
        Thread.currentThread().setName(str);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlinx.coroutines.AbstractC89600cv
    /* renamed from: a */
    public final /* synthetic */ String mo144087a(AbstractC89127f fVar) {
        String str;
        C89514al alVar = (C89514al) fVar.get(C89514al.f203227b);
        if (alVar == null || (str = alVar.f203228a) == null) {
            str = "coroutine";
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        int a = C89361p.m154885a((CharSequence) name, " @");
        if (a < 0) {
            a = name.length();
        }
        StringBuilder sb = new StringBuilder(str.length() + a + 10);
        if (name != null) {
            String substring = name.substring(0, a);
            C89219l.m154709a((Object) substring, "");
            sb.append(substring);
            sb.append(" @");
            sb.append(str);
            sb.append('#');
            sb.append(this.f203226a);
            String sb2 = sb.toString();
            C89219l.m154709a((Object) sb2, "");
            currentThread.setName(sb2);
            return name;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // p4600h.p4603c.AbstractC89127f, p4600h.p4603c.AbstractC89097a
    public final <R> R fold(R r, AbstractC89183m<? super R, ? super AbstractC89127f.AbstractC89130b, ? extends R> mVar) {
        return (R) AbstractC89127f.AbstractC89130b.C89131a.m154624a(this, r, mVar);
    }
}
