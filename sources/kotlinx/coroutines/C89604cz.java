package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;

/* renamed from: kotlinx.coroutines.cz */
public final class C89604cz extends CancellationException implements AbstractC89505af<C89604cz> {
    public final AbstractC89568bz coroutine;

    static {
        Covode.recordClassIndex(105695);
    }

    @Override // kotlinx.coroutines.AbstractC89505af
    public final C89604cz createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        C89604cz czVar = new C89604cz(message, this.coroutine);
        czVar.initCause(this);
        return czVar;
    }

    public C89604cz(String str) {
        this(str, null);
    }

    public C89604cz(String str, AbstractC89568bz bzVar) {
        super(str);
        this.coroutine = bzVar;
    }
}
