package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.al */
public final class C89514al extends AbstractC89097a {

    /* renamed from: b */
    public static final C89515a f203227b = new C89515a((byte) 0);

    /* renamed from: a */
    public final String f203228a;

    static {
        Covode.recordClassIndex(105603);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C89514al) && C89219l.m154714a(this.f203228a, ((C89514al) obj).f203228a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f203228a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    /* renamed from: kotlinx.coroutines.al$a */
    public static final class C89515a implements AbstractC89127f.AbstractC89132c<C89514al> {
        static {
            Covode.recordClassIndex(105604);
        }

        private C89515a() {
        }

        public /* synthetic */ C89515a(byte b) {
            this();
        }
    }

    public final String toString() {
        return "CoroutineName(" + this.f203228a + ')';
    }
}
