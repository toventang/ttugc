package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: kotlinx.coroutines.ca */
public final class C89579ca extends CancellationException implements AbstractC89505af<C89579ca> {
    public final AbstractC89568bz job;

    static {
        Covode.recordClassIndex(105670);
    }

    public final Throwable fillInStackTrace() {
        if (C89527ar.f203244b) {
            return super.fillInStackTrace();
        }
        return this;
    }

    @Override // kotlinx.coroutines.AbstractC89505af
    public final C89579ca createCopy() {
        if (!C89527ar.f203244b) {
            return null;
        }
        String message = getMessage();
        if (message == null) {
            C89219l.m154707a();
        }
        return new C89579ca(message, this, this.job);
    }

    public final String toString() {
        return super.toString() + "; job=" + this.job;
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        if (message == null) {
            C89219l.m154707a();
        }
        int hashCode = ((message.hashCode() * 31) + this.job.hashCode()) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C89579ca)) {
            return false;
        }
        C89579ca caVar = (C89579ca) obj;
        if (!C89219l.m154714a((Object) caVar.getMessage(), (Object) getMessage()) || !C89219l.m154714a(caVar.job, this.job) || !C89219l.m154714a(caVar.getCause(), getCause())) {
            return false;
        }
        return true;
    }

    public C89579ca(String str, Throwable th, AbstractC89568bz bzVar) {
        super(str);
        this.job = bzVar;
        if (th != null) {
            initCause(th);
        }
    }
}
