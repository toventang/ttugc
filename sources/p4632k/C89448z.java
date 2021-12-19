package p4632k;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: k.z */
public final class C89448z extends C89414d {

    /* renamed from: a */
    private final Logger f203143a = Logger.getLogger("okio.Okio");

    /* renamed from: j */
    private final Socket f203144j;

    static {
        Covode.recordClassIndex(105532);
    }

    /* access modifiers changed from: protected */
    @Override // p4632k.C89414d
    /* renamed from: a */
    public final void mo50807a() {
        try {
            this.f203144j.close();
        } catch (Exception e) {
            this.f203143a.log(Level.WARNING, "Failed to close timed out socket " + this.f203144j, (Throwable) e);
        } catch (AssertionError e2) {
            if (C89436q.m155165a(e2)) {
                this.f203143a.log(Level.WARNING, "Failed to close timed out socket " + this.f203144j, (Throwable) e2);
                return;
            }
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // p4632k.C89414d
    /* renamed from: a */
    public final IOException mo50806a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public C89448z(Socket socket) {
        C89219l.m154719c(socket, "");
        this.f203144j = socket;
    }
}
