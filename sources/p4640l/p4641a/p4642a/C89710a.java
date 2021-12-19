package p4640l.p4641a.p4642a;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;
import okhttp3.AbstractC90025ab;
import okhttp3.AbstractC90031ad;
import p4640l.AbstractC89744e;

/* renamed from: l.a.a.a */
public final class C89710a extends AbstractC89744e.AbstractC89745a {

    /* renamed from: a */
    private final C27910f f203482a;

    static {
        Covode.recordClassIndex(105804);
    }

    /* renamed from: a */
    public static C89710a m155746a() {
        return m155747a(new C27910f());
    }

    private C89710a(C27910f fVar) {
        this.f203482a = fVar;
    }

    /* renamed from: a */
    public static C89710a m155747a(C27910f fVar) {
        Objects.requireNonNull(fVar, "gson == null");
        return new C89710a(fVar);
    }

    @Override // p4640l.AbstractC89744e.AbstractC89745a
    /* renamed from: a */
    public final AbstractC89744e<?, AbstractC90025ab> mo144264a(Type type) {
        return new C89711b(this.f203482a, this.f203482a.mo46663a((C27895a) C27895a.get(type)));
    }

    @Override // p4640l.AbstractC89744e.AbstractC89745a
    /* renamed from: a */
    public final AbstractC89744e<AbstractC90031ad, ?> mo144265a(Type type, Annotation[] annotationArr) {
        return new C89712c(this.f203482a, this.f203482a.mo46663a((C27895a) C27895a.get(type)));
    }
}
