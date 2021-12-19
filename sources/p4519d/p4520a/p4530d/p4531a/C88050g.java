package p4519d.p4520a.p4530d.p4531a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileOutputStream;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: d.a.d.a.g */
public class C88050g implements AbstractC88054k {

    /* renamed from: a */
    public FileOutputStream f199966a;

    static {
        Covode.recordClassIndex(104076);
    }

    @Override // p4519d.p4520a.p4530d.p4531a.AbstractC88054k
    /* renamed from: a */
    public void mo139996a() {
        FileOutputStream fileOutputStream = this.f199966a;
        if (fileOutputStream == null) {
            C89219l.m154710a("outputStream");
        } else {
            fileOutputStream.close();
        }
    }

    /* renamed from: b */
    public final FileOutputStream mo142615b() {
        FileOutputStream fileOutputStream = this.f199966a;
        if (fileOutputStream == null) {
            C89219l.m154710a("outputStream");
        }
        return fileOutputStream;
    }

    /* renamed from: c */
    public void mo139999c() {
        FileOutputStream fileOutputStream = this.f199966a;
        if (fileOutputStream == null) {
            C89219l.m154710a("outputStream");
        } else {
            fileOutputStream.close();
        }
    }

    /* renamed from: a */
    public final void mo142614a(FileOutputStream fileOutputStream) {
        C89219l.m154719c(fileOutputStream, "");
        this.f199966a = fileOutputStream;
    }

    /* renamed from: a */
    public void mo139998a(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(4525);
        C89219l.m154719c(bArr, "");
        FileOutputStream fileOutputStream = this.f199966a;
        if (fileOutputStream == null) {
            C89219l.m154710a("outputStream");
            MethodCollector.m26664o(4525);
            return;
        }
        fileOutputStream.write(bArr, i, i2);
        MethodCollector.m26664o(4525);
    }
}
