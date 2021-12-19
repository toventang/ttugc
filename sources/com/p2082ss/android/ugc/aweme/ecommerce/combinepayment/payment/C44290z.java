package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17879g;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.z */
public final class C44290z {

    /* renamed from: a */
    static final HashMap<String, String> f103284a = C89041ag.m154428c(C89387v.m154943a("ui0024", m87015a((int) R.string.beq)), C89387v.m154943a("ui0002", m87015a((int) R.string.ber)), C89387v.m154943a("ui0012", m87015a((int) R.string.beq)), C89387v.m154943a("ui0028", m87015a((int) R.string.bes)), C89387v.m154943a("ui0017", m87015a((int) R.string.bep)), C89387v.m154943a("ui0018", m87015a((int) R.string.bes)), C89387v.m154943a("ui0019", m87015a((int) R.string.bes)), C89387v.m154943a("ui0020", m87015a((int) R.string.bet)), C89387v.m154943a("ui0031", m87015a((int) R.string.bey)), C89387v.m154943a("ui0034", m87015a((int) R.string.beu)), C89387v.m154943a("tp0002", m87015a((int) R.string.bev)), C89387v.m154943a("tp0005", m87015a((int) R.string.bex)), C89387v.m154943a("tp0006", m87015a((int) R.string.bf1)), C89387v.m154943a("tp0007", m87015a((int) R.string.bev)), C89387v.m154943a("tp0009", m87015a((int) R.string.bev)), C89387v.m154943a("tp0014", m87015a((int) R.string.bev)), C89387v.m154943a("tp0018", m87015a((int) R.string.bev)), C89387v.m154943a("tp0019", m87015a((int) R.string.bev)), C89387v.m154943a("tp0023", m87015a((int) R.string.bew)), C89387v.m154943a("tp0024", m87015a((int) R.string.bf2)), C89387v.m154943a("tp0027", m87015a((int) R.string.bev)), C89387v.m154943a("tp0030", m87015a((int) R.string.bev)), C89387v.m154943a("tp0031", m87015a((int) R.string.bev)), C89387v.m154943a("tp0033", m87015a((int) R.string.bev)), C89387v.m154943a("tp0034", m87015a((int) R.string.bev)), C89387v.m154943a("tp0035", m87015a((int) R.string.bev)), C89387v.m154943a("tp0040", m87015a((int) R.string.beo)), C89387v.m154943a("sy0001", m87015a((int) R.string.bf0)), C89387v.m154943a("sy0002", m87015a((int) R.string.bf0)), C89387v.m154943a("ot0001", m87015a((int) R.string.bf0)), C89387v.m154943a("ot0002", m87015a((int) R.string.bez)));

    /* renamed from: b */
    public static final C44290z f103285b = new C44290z();

    private C44290z() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.z$a */
    public static final class RunnableC44291a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f103286a;

        static {
            Covode.recordClassIndex(52603);
        }

        RunnableC44291a(String str) {
            this.f103286a = str;
        }

        public final void run() {
            String str = C44290z.f103284a.get(this.f103286a);
            if (str != null) {
                new C79459a(C17867d.m33078a()).mo123052a(str).mo123053a();
            } else {
                new C79459a(C17867d.m33078a()).mo123052a(C44290z.m87015a((int) R.string.bf0)).mo123053a();
            }
        }
    }

    static {
        Covode.recordClassIndex(52602);
    }

    /* renamed from: a */
    public static String m87015a(int i) {
        String string = C17879g.m33104a().getString(i);
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: a */
    public static void m87016a(String str) {
        ExecutorC34605m.f81660a.execute(new RunnableC44291a(str));
    }
}
