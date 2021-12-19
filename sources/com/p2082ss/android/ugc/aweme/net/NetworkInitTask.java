package com.p2082ss.android.ugc.aweme.net;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14731e;
import com.bytedance.frameworks.baselib.network.http.p995g.C14756f;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ttnet.p1700a.C22898a;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.experiment.C46691ah;
import com.p2082ss.android.ugc.aweme.feed.cache.C49301e;
import com.p2082ss.android.ugc.aweme.launcher.service.account.C58078a;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.net.p3489b.C61308a;
import com.p2082ss.android.ugc.aweme.network.AbstractC61491c;
import com.p2082ss.android.ugc.aweme.network.C61464a;
import com.p2082ss.android.ugc.aweme.network.INetwork;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.AbstractC67839b;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.InterceptorHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import okhttp3.AbstractC90202u;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.net.NetworkInitTask */
public final class NetworkInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(71927);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1048575;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.MAIN;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    /* renamed from: com.ss.android.ugc.aweme.net.NetworkInitTask$b */
    static final class C61300b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C61300b f139213a = new C61300b();

        static {
            Covode.recordClassIndex(71929);
        }

        C61300b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return m110966a();
        }

        /* renamed from: a */
        private static String m110966a() {
            try {
                String h = SettingServiceImpl.m120782v().mo108872h();
                Locale locale = Locale.getDefault();
                C89219l.m154716b(locale, "");
                if (h != null) {
                    String lowerCase = h.toLowerCase(locale);
                    C89219l.m154716b(lowerCase, "");
                    return lowerCase;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (Exception unused) {
                return "en";
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.NetworkInitTask$a */
    public static final class C61299a implements AbstractC67839b {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f139212a;

        static {
            Covode.recordClassIndex(71928);
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.AbstractC67839b
        /* renamed from: a */
        public final String mo98926a() {
            try {
                return C58078a.f132318a.mo95580c();
            } catch (Throwable unused) {
                return "";
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.AbstractC67839b
        /* renamed from: b */
        public final String mo98927b() {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            return g.getCurUserId();
        }

        @Override // com.p2082ss.android.ugc.aweme.secapi.AbstractC67839b
        /* renamed from: c */
        public final String mo98928c() {
            return (String) this.f139212a.invoke();
        }

        C61299a(AbstractC89171a aVar) {
            this.f139212a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.net.NetworkInitTask$c */
    public static final class C61301c implements AbstractC61491c {

        /* renamed from: a */
        final /* synthetic */ NetworkInitTask f139214a;

        static {
            Covode.recordClassIndex(71930);
        }

        @Override // com.p2082ss.android.ugc.aweme.network.AbstractC61491c
        /* renamed from: a */
        public final void mo98929a() {
            C58945a.C58947b.f134185a.mo96425a("feed_network_init_to_init_ttnet", false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61301c(NetworkInitTask networkInitTask) {
            this.f139214a = networkInitTask;
        }

        @Override // com.p2082ss.android.ugc.aweme.network.AbstractC61491c
        /* renamed from: a */
        public final void mo98930a(C61464a aVar) {
            C89219l.m154721d(aVar, "");
            C58945a.C58947b.f134185a.mo96429b("feed_network_init_to_init_ttnet", false);
            C58945a.C58947b.f134185a.mo96425a("feed_network_init_ttnet_duration", false);
            C58945a.C58947b.f134185a.mo96429b("feed_boot_to_init_ttnet", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.network.AbstractC61491c
        /* renamed from: b */
        public final void mo98931b(C61464a aVar) {
            C89219l.m154721d(aVar, "");
            C58945a.C58947b.f134185a.mo96429b("feed_network_init_ttnet_duration", false);
            C58945a.C58947b.f134185a.mo96429b("feed_boot_to_init_ttnet_end", false);
            C58945a.C58947b.f134185a.mo96425a("feed_init_ttnet_end_to_network", false);
            C58945a.C58947b.f134185a.mo96425a("feed_network_init_sec_duration", false);
            Context a = C17867d.m33078a();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C61300b bVar = C61300b.f139213a;
            if (C29843f.m60129a(a)) {
                String str = aVar.f139532e;
                if (str == null) {
                    str = "";
                }
                String str2 = aVar.f139533f;
                if (str2 == null) {
                    str2 = "";
                }
                SecApiImpl.m119993a().initSec(a, (String) bVar.invoke(), aVar.f139531d, str, str2, true, new C61299a(bVar));
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("sec_init_time", elapsedRealtime2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C34611o.m70671b("sec_init_time", "", jSONObject);
            C58945a.C58947b.f134185a.mo96429b("feed_network_init_sec_duration", false);
            InterceptorHolder.m138948e().mo98925d();
        }

        @Override // com.p2082ss.android.ugc.aweme.network.AbstractC61491c
        /* renamed from: c */
        public final void mo98932c(C61464a aVar) {
            C89219l.m154721d(aVar, "");
            C22898a a = C22898a.m43150a(C17867d.m33078a());
            String[] strArr = C61308a.f139239d;
            int i = C61308a.f139237b;
            if (i == 1180) {
                strArr = C61308a.f139240e;
            } else if (i == 1233 || i == 1340) {
                strArr = C61308a.f139239d;
            }
            a.mo37236a(new ArrayList<>(Arrays.asList(strArr)));
            InterceptorProvider e = InterceptorHolder.m138948e();
            C89219l.m154716b(e, "");
            List<AbstractC90202u> c = e.mo98924c();
            if (!C13603b.m24435a((Collection) c)) {
                for (AbstractC90202u uVar : c) {
                    C61414l lVar = C61414l.f139442a;
                    if (lVar.f139443b == null) {
                        lVar.mo98983a();
                    }
                    lVar.f139443b = lVar.f139443b.mo145086b().mo145100b(uVar).mo145103d();
                }
            }
            if (!C14756f.m27057b(C17867d.m33078a())) {
                C14731e.f35918g = aVar.f139538k;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        ExecutorService a;
        INetwork a2 = C61402j.m111178a();
        C61301c cVar = new C61301c(this);
        if (!C49301e.m92383n() || !((Boolean) C46691ah.f108849b.getValue()).booleanValue()) {
            a = C40780g.m82241a();
        } else {
            a = C40780g.m82245b();
        }
        C89219l.m154716b(a, "");
        a2.mo28820a(cVar, a);
    }
}
