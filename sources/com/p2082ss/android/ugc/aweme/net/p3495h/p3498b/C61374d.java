package com.p2082ss.android.ugc.aweme.net.p3495h.p3498b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14711g;
import com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14719l;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.C61450o;
import com.p2082ss.android.ugc.aweme.net.p3495h.C61363a;
import com.p2082ss.android.ugc.aweme.net.p3495h.C61378d;
import com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61364a;
import com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61365b;
import com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61366c;
import com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61368e;
import com.p2082ss.android.ugc.aweme.net.p3495h.p3496a.p3497a.C61369f;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.AbstractC90202u;
import okhttp3.C90208y;
import okhttp3.internal.p4659g.C90160f;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.net.h.b.d */
public final /* synthetic */ class C61374d implements C14711g.AbstractC14713a {

    /* renamed from: a */
    static final C14711g.AbstractC14713a f139365a = new C61374d();

    static {
        Covode.recordClassIndex(72007);
    }

    private C61374d() {
    }

    @Override // com.bytedance.frameworks.baselib.network.http.p988d.p989a.C14711g.AbstractC14713a
    /* renamed from: a */
    public final void mo23716a(C90208y.C90210a aVar) {
        if (C46807cw.m90144a()) {
            aVar.mo145096a(new C61365b()).mo145096a(new C61364a()).mo145096a(new C61366c());
        }
        aVar.mo145095a(new C61378d());
        List<AbstractC90202u> list = aVar.f204935e;
        if (list != null) {
            Iterator<AbstractC90202u> it = list.iterator();
            AbstractC90202u uVar = null;
            while (it.hasNext()) {
                AbstractC90202u next = it.next();
                if (next != null && (next instanceof C14719l)) {
                    it.remove();
                    uVar = next;
                }
            }
            if (uVar != null) {
                list.add(new C61369f(uVar));
                list.add(new C61368e());
            }
        }
        aVar.mo145096a(new C61363a());
        C58945a.C58947b.f134185a.mo96425a("feed_ok_init_keystore", false);
        if (Keva.getRepo("network_keva").getBoolean("opaque_data_enabled", true)) {
            C89219l.m154721d(aVar, "");
            KeyStore a = C61450o.m111298a(C61450o.m111299a());
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(a);
            SSLContext instance2 = SSLContext.getInstance("TLS");
            C89219l.m154716b(instance, "");
            instance2.init(null, instance.getTrustManagers(), new SecureRandom());
            C89219l.m154716b(instance2, "");
            SSLSocketFactory socketFactory = instance2.getSocketFactory();
            TrustManager[] trustManagers = instance.getTrustManagers();
            C89219l.m154716b(trustManagers, "");
            ArrayList arrayList = new ArrayList();
            for (TrustManager trustManager : trustManagers) {
                if (trustManager instanceof X509TrustManager) {
                    arrayList.add(trustManager);
                }
            }
            X509TrustManager x509TrustManager = (X509TrustManager) arrayList.get(0);
            Objects.requireNonNull(socketFactory, "sslSocketFactory == null");
            Objects.requireNonNull(x509TrustManager, "trustManager == null");
            aVar.f204943m = socketFactory;
            aVar.f204944n = C90160f.f204720c.mo144945a(x509TrustManager);
        }
        C58945a.C58947b.f134185a.mo96429b("feed_ok_init_keystore", false);
    }
}
