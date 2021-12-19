package p4640l.p4641a.p4643b;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okhttp3.AbstractC90031ad;
import p4640l.AbstractC89744e;

/* renamed from: l.a.b.c */
final class C89715c<T extends Message<T, ?>> implements AbstractC89744e<AbstractC90031ad, T> {

    /* renamed from: a */
    private final ProtoAdapter<T> f203491a;

    static {
        Covode.recordClassIndex(105809);
    }

    C89715c(ProtoAdapter<T> protoAdapter) {
        this.f203491a = protoAdapter;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo144266a(AbstractC90031ad adVar) {
        try {
            return this.f203491a.decode(adVar.source());
        } finally {
            adVar.close();
        }
    }
}
