package okhttp3;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* renamed from: okhttp3.p */
public abstract class AbstractC90191p {
    public static final AbstractC90191p NONE = new AbstractC90191p() {
        /* class okhttp3.AbstractC90191p.C901921 */

        static {
            Covode.recordClassIndex(106365);
        }
    };

    /* renamed from: okhttp3.p$a */
    public interface AbstractC90194a {
        static {
            Covode.recordClassIndex(106367);
        }

        AbstractC90191p create(AbstractC90049e eVar);
    }

    public void callEnd(AbstractC90049e eVar) {
    }

    public void callFailed(AbstractC90049e eVar, IOException iOException) {
    }

    public void callStart(AbstractC90049e eVar) {
    }

    public void connectEnd(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar) {
    }

    public void connectFailed(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC90211z zVar, IOException iOException) {
    }

    public void connectStart(AbstractC90049e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(AbstractC90049e eVar, AbstractC90057i iVar) {
    }

    public void connectionReleased(AbstractC90049e eVar, AbstractC90057i iVar) {
    }

    public void dnsEnd(AbstractC90049e eVar, String str, List<InetAddress> list) {
    }

    public void dnsStart(AbstractC90049e eVar, String str) {
    }

    public void requestBodyEnd(AbstractC90049e eVar, long j) {
    }

    public void requestBodyStart(AbstractC90049e eVar) {
    }

    public void requestHeadersEnd(AbstractC90049e eVar, Request request) {
    }

    public void requestHeadersStart(AbstractC90049e eVar) {
    }

    public void responseBodyEnd(AbstractC90049e eVar, long j) {
    }

    public void responseBodyStart(AbstractC90049e eVar) {
    }

    public void responseHeadersEnd(AbstractC90049e eVar, C90029ac acVar) {
    }

    public void responseHeadersStart(AbstractC90049e eVar) {
    }

    public void secureConnectEnd(AbstractC90049e eVar, C90197r rVar) {
    }

    public void secureConnectStart(AbstractC90049e eVar) {
    }

    static {
        Covode.recordClassIndex(106364);
    }

    static AbstractC90194a factory(AbstractC90191p pVar) {
        return new AbstractC90194a(pVar) {
            /* class okhttp3.AbstractC90191p.C901932 */

            /* renamed from: a */
            final /* synthetic */ AbstractC90191p f204844a;

            static {
                Covode.recordClassIndex(106366);
            }

            @Override // okhttp3.AbstractC90191p.AbstractC90194a
            public final AbstractC90191p create(AbstractC90049e eVar) {
                return this.f204844a;
            }

            {
                this.f204844a = r1;
            }
        };
    }
}
