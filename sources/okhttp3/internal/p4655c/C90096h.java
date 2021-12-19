package okhttp3.internal.p4655c;

import com.bytedance.covode.number.Covode;
import okhttp3.AbstractC90031ad;
import okhttp3.C90204w;
import p4632k.AbstractC89426h;

/* renamed from: okhttp3.internal.c.h */
public final class C90096h extends AbstractC90031ad {

    /* renamed from: a */
    private final String f204487a;

    /* renamed from: b */
    private final long f204488b;

    /* renamed from: c */
    private final AbstractC89426h f204489c;

    static {
        Covode.recordClassIndex(106268);
    }

    @Override // okhttp3.AbstractC90031ad
    public final long contentLength() {
        return this.f204488b;
    }

    @Override // okhttp3.AbstractC90031ad
    public final AbstractC89426h source() {
        return this.f204489c;
    }

    @Override // okhttp3.AbstractC90031ad
    public final C90204w contentType() {
        String str = this.f204487a;
        if (str != null) {
            return C90204w.m156843b(str);
        }
        return null;
    }

    public C90096h(String str, long j, AbstractC89426h hVar) {
        this.f204487a = str;
        this.f204488b = j;
        this.f204489c = hVar;
    }
}
