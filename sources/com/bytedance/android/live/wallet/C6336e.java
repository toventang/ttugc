package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.wallet.p416c.C6331c;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.wallet.e */
public final class C6336e {

    /* renamed from: g */
    public static final C6336e f15839g = C6338b.f15847a;

    /* renamed from: h */
    public static final C6337a f15840h = new C6337a((byte) 0);

    /* renamed from: a */
    public String f15841a;

    /* renamed from: b */
    public List<C11314c> f15842b;

    /* renamed from: c */
    public List<C11314c> f15843c;

    /* renamed from: d */
    public C11314c f15844d;

    /* renamed from: e */
    public DiamondPackageExtra f15845e;

    /* renamed from: f */
    public long f15846f;

    /* renamed from: com.bytedance.android.live.wallet.e$a */
    public static final class C6337a {
        static {
            Covode.recordClassIndex(7059);
        }

        private C6337a() {
        }

        /* renamed from: b */
        public static String m13683b() {
            if (m13682a()) {
                return "amazon";
            }
            return "google_pay";
        }

        /* renamed from: a */
        public static boolean m13682a() {
            String str;
            IHostContext iHostContext = (IHostContext) C6193a.m13435a(IHostContext.class);
            if (iHostContext != null) {
                str = iHostContext.getChannel();
            } else {
                str = null;
            }
            return C13627m.m24499a("amazon_int", str);
        }

        public /* synthetic */ C6337a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.e$b */
    static final class C6338b {

        /* renamed from: a */
        static final C6336e f15847a = new C6336e((byte) 0);

        /* renamed from: b */
        public static final C6338b f15848b = new C6338b();

        private C6338b() {
        }

        static {
            Covode.recordClassIndex(7060);
        }
    }

    static {
        Covode.recordClassIndex(7058);
    }

    private C6336e() {
        this.f15841a = "";
        this.f15842b = new ArrayList();
        this.f15843c = new ArrayList();
        this.f15844d = new C11314c();
    }

    /* renamed from: a */
    public final List<C11314c> mo12388a() {
        long j = this.f15846f;
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        if (j != b.mo13161c()) {
            this.f15842b.clear();
        }
        return this.f15842b;
    }

    public /* synthetic */ C6336e(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo12389a(String str) {
        C89219l.m154721d(str, "");
        this.f15841a = str;
    }

    /* renamed from: com.bytedance.android.live.wallet.e$d */
    public static final class C6340d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C6340d f15850a = new C6340d();

        static {
            Covode.recordClassIndex(7062);
        }

        C6340d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            String str;
            Throwable th = (Throwable) obj;
            if (th instanceof C2908a) {
                i = ((C2908a) th).getErrorCode();
            } else {
                i = -1;
            }
            if (th == null || (str = th.getMessage()) == null) {
                str = "api exception";
            }
            C6331c.m13650a("ttlive_query_wallet_purchase", i, -1, str);
        }
    }

    /* renamed from: a */
    public final void mo12390a(List<? extends C11314c> list) {
        C89219l.m154721d(list, "");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        this.f15846f = b.mo13161c();
        this.f15842b.clear();
        this.f15842b.addAll(list);
    }

    /* renamed from: com.bytedance.android.live.wallet.e$c */
    public static final class C6339c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C6336e f15849a;

        static {
            Covode.recordClassIndex(7061);
        }

        public C6339c(C6336e eVar) {
            this.f15849a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5827a aVar = (C5827a) obj;
            C6336e eVar = this.f15849a;
            List<T> list = aVar.f14684b;
            C89219l.m154716b(list, "");
            C89219l.m154721d(list, "");
            eVar.f15843c = list;
            this.f15849a.f15845e = (DiamondPackageExtra) aVar.f14685c;
            ArrayList arrayList = new ArrayList();
            for (C11314c cVar : this.f15849a.f15843c) {
                String str = cVar.f27056b;
                C89219l.m154716b(str, "");
                arrayList.add(str);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("iapKey", Integer.valueOf(arrayList.size()));
            C6331c.m13652a("ttlive_query_wallet_purchase", hashMap);
            ((IWalletService) C6193a.m13435a(IWalletService.class)).walletCenter().mo12372a(arrayList);
        }
    }
}
