package p4519d.p4520a.p4530d.p4531a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.d.a.c */
public class C88044c implements AbstractC88054k {

    /* renamed from: a */
    public InputStream f199950a;

    static {
        Covode.recordClassIndex(104070);
    }

    @Override // p4519d.p4520a.p4530d.p4531a.AbstractC88054k
    /* renamed from: a */
    public void mo139996a() {
        InputStream inputStream = this.f199950a;
        if (inputStream == null) {
            C89219l.m154710a("inputStream");
        }
        inputStream.close();
    }

    /* renamed from: a */
    public final void mo142610a(InputStream inputStream) {
        C89219l.m154719c(inputStream, "");
        this.f199950a = inputStream;
    }

    /* renamed from: a */
    public int mo140022a(byte[] bArr, int i) {
        MethodCollector.m26663i(8464);
        C89219l.m154719c(bArr, "");
        InputStream inputStream = this.f199950a;
        if (inputStream == null) {
            C89219l.m154710a("inputStream");
        }
        int read = inputStream.read(bArr, 0, i);
        MethodCollector.m26664o(8464);
        return read;
    }
}
