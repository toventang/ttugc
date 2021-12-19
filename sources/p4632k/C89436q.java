package p4632k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: k.q */
public final class C89436q {
    static {
        Covode.recordClassIndex(105520);
    }

    /* renamed from: a */
    public static final AbstractC89447y m155161a() {
        return new C89419e();
    }

    /* renamed from: a */
    public static final AbstractC89408aa m155158a(InputStream inputStream) {
        C89219l.m154719c(inputStream, "");
        return new C89435p(inputStream, new C89409ab());
    }

    /* renamed from: a */
    public static final AbstractC89425g m155159a(AbstractC89447y yVar) {
        C89219l.m154719c(yVar, "");
        return new C89439t(yVar);
    }

    /* renamed from: b */
    public static final AbstractC89408aa m155166b(Socket socket) {
        C89219l.m154719c(socket, "");
        C89448z zVar = new C89448z(socket);
        InputStream inputStream = socket.getInputStream();
        C89219l.m154709a((Object) inputStream, "");
        return zVar.mo143787a(new C89435p(inputStream, zVar));
    }

    /* renamed from: c */
    public static final AbstractC89408aa m155168c(File file) {
        MethodCollector.m26663i(3395);
        C89219l.m154719c(file, "");
        AbstractC89408aa a = m155158a(new FileInputStream(file));
        MethodCollector.m26664o(3395);
        return a;
    }

    /* renamed from: a */
    public static final AbstractC89426h m155160a(AbstractC89408aa aaVar) {
        C89219l.m154719c(aaVar, "");
        return new C89441u(aaVar);
    }

    /* renamed from: b */
    public static final AbstractC89447y m155167b(File file) {
        MethodCollector.m26663i(3394);
        C89219l.m154719c(file, "");
        AbstractC89447y a = m155163a(new FileOutputStream(file, true));
        MethodCollector.m26664o(3394);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC89447y m155162a(File file) {
        MethodCollector.m26663i(3392);
        C89219l.m154719c(file, "");
        AbstractC89447y a = m155163a(new FileOutputStream(file, false));
        MethodCollector.m26664o(3392);
        return a;
    }

    /* renamed from: a */
    public static final AbstractC89447y m155163a(OutputStream outputStream) {
        C89219l.m154719c(outputStream, "");
        return new C89437r(outputStream, new C89409ab());
    }

    /* renamed from: a */
    public static final AbstractC89447y m155164a(Socket socket) {
        C89219l.m154719c(socket, "");
        C89448z zVar = new C89448z(socket);
        OutputStream outputStream = socket.getOutputStream();
        C89219l.m154709a((Object) outputStream, "");
        return zVar.mo143788a(new C89437r(outputStream, zVar));
    }

    /* renamed from: a */
    public static final boolean m155165a(AssertionError assertionError) {
        String message;
        C89219l.m154719c(assertionError, "");
        if (assertionError.getCause() == null || (message = assertionError.getMessage()) == null || !C89361p.m154908a((CharSequence) message, (CharSequence) "getsockname failed", false)) {
            return false;
        }
        return true;
    }
}
