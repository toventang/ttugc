package p4640l.p4641a.p4643b;

import com.bytedance.covode.number.Covode;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import p4640l.AbstractC89744e;

/* renamed from: l.a.b.a */
public final class C89713a extends AbstractC89744e.AbstractC89745a {
    static {
        Covode.recordClassIndex(105807);
    }

    @Override // p4640l.AbstractC89744e.AbstractC89745a
    /* renamed from: a */
    public final AbstractC89744e<?, AbstractC90025ab> mo144264a(Type type) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C89714b(ProtoAdapter.get(cls));
    }

    @Override // p4640l.AbstractC89744e.AbstractC89745a
    /* renamed from: a */
    public final AbstractC89744e<AbstractC90031ad, ?> mo144265a(Type type, Annotation[] annotationArr) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C89715c(ProtoAdapter.get(cls));
    }
}
