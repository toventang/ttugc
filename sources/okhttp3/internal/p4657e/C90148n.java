package okhttp3.internal.p4657e;

import com.bytedance.covode.number.Covode;
import java.io.IOException;

/* renamed from: okhttp3.internal.e.n */
public final class C90148n extends IOException {
    public final EnumC90109b errorCode;

    static {
        Covode.recordClassIndex(106320);
    }

    public C90148n(EnumC90109b bVar) {
        super("stream was reset: ".concat(String.valueOf(bVar)));
        this.errorCode = bVar;
    }
}
