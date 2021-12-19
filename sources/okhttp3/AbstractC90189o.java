package okhttp3;

import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: okhttp3.o */
public interface AbstractC90189o {

    /* renamed from: d */
    public static final AbstractC90189o f204843d = new AbstractC90189o() {
        /* class okhttp3.AbstractC90189o.C901901 */

        static {
            Covode.recordClassIndex(106363);
        }

        @Override // okhttp3.AbstractC90189o
        /* renamed from: a */
        public final List<InetAddress> mo23717a(String str) {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(String.valueOf(str)));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    };

    /* renamed from: a */
    List<InetAddress> mo23717a(String str);

    static {
        Covode.recordClassIndex(106362);
    }
}
