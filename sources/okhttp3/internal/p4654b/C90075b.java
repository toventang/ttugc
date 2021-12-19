package okhttp3.internal.p4654b;

import com.bytedance.covode.number.Covode;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.C90182k;
import okhttp3.internal.AbstractC90058a;

/* renamed from: okhttp3.internal.b.b */
public final class C90075b {

    /* renamed from: a */
    boolean f204397a;

    /* renamed from: b */
    boolean f204398b;

    /* renamed from: c */
    private final List<C90182k> f204399c;

    /* renamed from: d */
    private int f204400d;

    static {
        Covode.recordClassIndex(106247);
    }

    public C90075b(List<C90182k> list) {
        this.f204399c = list;
    }

    /* renamed from: b */
    private boolean m156362b(SSLSocket sSLSocket) {
        for (int i = this.f204400d; i < this.f204399c.size(); i++) {
            if (this.f204399c.get(i).mo144998a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C90182k mo144815a(SSLSocket sSLSocket) {
        int size = this.f204399c.size();
        for (int i = this.f204400d; i < size; i++) {
            C90182k kVar = this.f204399c.get(i);
            if (kVar.mo144998a(sSLSocket)) {
                this.f204400d = i + 1;
                this.f204397a = m156362b(sSLSocket);
                AbstractC90058a.f204330a.mo144788a(kVar, sSLSocket, this.f204398b);
                return kVar;
            }
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f204398b + ", modes=" + this.f204399c + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }
}
