package p4600h;

import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.io.StringWriter;
import p4600h.p4607d.C89140b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.b */
public class C89089b {
    static {
        Covode.recordClassIndex(105173);
    }

    /* renamed from: a */
    public static final String m154602a(Throwable th) {
        C89219l.m154721d(th, "");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C89219l.m154716b(stringWriter2, "");
        return stringWriter2;
    }

    /* renamed from: a */
    public static final void m154603a(Throwable th, Throwable th2) {
        C89219l.m154721d(th, "");
        C89219l.m154721d(th2, "");
        if (th != th2) {
            C89140b.f202850a.mo143580a(th, th2);
        }
    }
}
