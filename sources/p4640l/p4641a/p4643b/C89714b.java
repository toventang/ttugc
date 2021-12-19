package p4640l.p4641a.p4643b;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import okhttp3.AbstractC90025ab;
import okhttp3.C90204w;
import p4632k.AbstractC89425g;
import p4632k.C89420f;
import p4640l.AbstractC89744e;

/* renamed from: l.a.b.b */
final class C89714b<T extends Message<T, ?>> implements AbstractC89744e<T, AbstractC90025ab> {

    /* renamed from: a */
    private static final C90204w f203489a = C90204w.m156843b("application/x-protobuf");

    /* renamed from: b */
    private final ProtoAdapter<T> f203490b;

    static {
        Covode.recordClassIndex(105808);
    }

    C89714b(ProtoAdapter<T> protoAdapter) {
        this.f203490b = protoAdapter;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // p4640l.AbstractC89744e
    /* renamed from: a */
    public final /* synthetic */ AbstractC90025ab mo144266a(Object obj) {
        C89420f fVar = new C89420f();
        this.f203490b.encode((AbstractC89425g) fVar, (T) obj);
        return AbstractC90025ab.create(f203489a, fVar.mo143857x());
    }
}
