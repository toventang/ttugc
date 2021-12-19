package p4519d.p4520a.p4530d.p4531a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Writer;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.d.a.m */
public class C88056m implements AbstractC88054k {

    /* renamed from: a */
    public final Writer f199970a;

    static {
        Covode.recordClassIndex(104082);
    }

    @Override // p4519d.p4520a.p4530d.p4531a.AbstractC88054k
    /* renamed from: a */
    public final void mo139996a() {
        this.f199970a.close();
    }

    public C88056m(Writer writer) {
        C89219l.m154719c(writer, "");
        this.f199970a = writer;
    }

    /* renamed from: a */
    public final void mo142618a(CharSequence charSequence) {
        C89219l.m154719c(charSequence, "");
        this.f199970a.append(charSequence);
    }

    /* renamed from: a */
    public final void mo142619a(String str) {
        MethodCollector.m26663i(8022);
        C89219l.m154719c(str, "");
        this.f199970a.write(str);
        MethodCollector.m26664o(8022);
    }
}
