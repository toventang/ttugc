package p4640l.p4641a.p4642a;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.p2020c.C27900c;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import okhttp3.AbstractC90025ab;
import okhttp3.C90204w;
import p4632k.C89420f;
import p4640l.AbstractC89744e;

/* renamed from: l.a.a.b */
final class C89711b<T> implements AbstractC89744e<T, AbstractC90025ab> {

    /* renamed from: a */
    private static final C90204w f203483a = C90204w.m156843b("application/json; charset=UTF-8");

    /* renamed from: b */
    private static final Charset f203484b = Charset.forName("UTF-8");

    /* renamed from: c */
    private final C27910f f203485c;

    /* renamed from: d */
    private final AbstractC28031v<T> f203486d;

    static {
        Covode.recordClassIndex(105805);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // p4640l.AbstractC89744e
    /* renamed from: a */
    public final /* synthetic */ AbstractC90025ab mo144266a(Object obj) {
        C89420f fVar = new C89420f();
        C27900c a = this.f203485c.mo46660a((Writer) new OutputStreamWriter(fVar.mo68859d(), f203484b));
        this.f203486d.write(a, obj);
        a.close();
        return AbstractC90025ab.create(f203483a, fVar.mo143847q());
    }

    C89711b(C27910f fVar, AbstractC28031v<T> vVar) {
        this.f203485c = fVar;
        this.f203486d = vVar;
    }
}
