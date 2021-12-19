package p4600h.p4603c.p4605b.p4606a;

import com.bytedance.covode.number.Covode;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;

/* renamed from: h.c.b.a.c */
public final class C89109c implements AbstractC89124d<Object> {

    /* renamed from: a */
    public static final C89109c f202825a = new C89109c();

    public final String toString() {
        return "This continuation is already complete";
    }

    private C89109c() {
    }

    static {
        Covode.recordClassIndex(105193);
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final AbstractC89127f getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // p4600h.p4603c.AbstractC89124d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}
