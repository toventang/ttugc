package com.p2082ss.android.ugc.aweme.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14719l;
import com.bytedance.ies.p1121b.p1124c.C16108b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.net.interceptor.C61400b;
import com.p2082ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor;
import com.p2082ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor;
import com.p2082ss.android.ugc.aweme.sec.C67835h;
import com.p2082ss.android.ugc.aweme.utils.C80516gv;
import java.net.CookieHandler;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import okhttp3.AbstractC90202u;
import okhttp3.C90188n;
import okhttp3.C90208y;
import okhttp3.EnumC90211z;

/* renamed from: com.ss.android.ugc.aweme.net.l */
public final class C61414l {

    /* renamed from: a */
    static final C61414l f139442a = new C61414l();

    /* renamed from: b */
    C90208y f139443b;

    /* renamed from: c */
    private C90208y f139444c = new C90208y();

    /* renamed from: com.ss.android.ugc.aweme.net.l$a */
    public static abstract class AbstractC61415a {

        /* renamed from: a */
        public static AbstractC61415a f139445a;

        static {
            Covode.recordClassIndex(72065);
        }

        /* renamed from: a */
        public abstract void mo95744a();
    }

    static {
        Covode.recordClassIndex(72064);
    }

    private C61414l() {
    }

    /* renamed from: a */
    public final C90208y mo98983a() {
        C90208y yVar = this.f139443b;
        if (yVar != null) {
            return yVar;
        }
        AbstractC61415a.f139445a.mo95744a();
        C90208y.C90210a b = this.f139444c.mo145086b();
        b.mo145088a(60000, TimeUnit.MILLISECONDS);
        b.mo145098b(60000, TimeUnit.MILLISECONDS);
        b.f204953w = true;
        if (C61411k.f139438a != null) {
            b.f204931a = new C90188n(C61411k.f139438a);
        }
        if (C29843f.m60129a(C17867d.m33078a())) {
            b.mo145093a(new C16108b(CookieHandler.getDefault()));
        }
        AbstractC90202u a = C67835h.m120029a();
        if (a != null) {
            b.mo145096a(a);
        }
        b.mo145100b(new NetWorkSpeedInterceptor());
        b.mo145100b(new C14719l());
        b.mo145100b(new C61400b());
        b.mo145096a(new DevicesNullInterceptor());
        b.mo145096a(new C80516gv());
        b.mo145096a(C61418m.f139456a);
        b.mo145089a(Collections.singletonList(EnumC90211z.HTTP_1_1));
        C90208y d = b.mo145103d();
        this.f139443b = d;
        return d;
    }
}
