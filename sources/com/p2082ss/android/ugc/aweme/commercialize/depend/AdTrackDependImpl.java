package com.p2082ss.android.ugc.aweme.commercialize.depend;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.p986b.C14652c;
import com.p2082ss.android.p2123b.C29736b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.commercialize.C37698e;
import com.p2082ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p4173ug.C79631g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdTrackDependImpl */
public final class AdTrackDependImpl implements IAdTrackDepend {
    static {
        Covode.recordClassIndex(45087);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: a */
    public final String mo65632a() {
        String str = C29736b.f70924e;
        C89219l.m154716b(str, "");
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: e */
    public final String mo65638e() {
        String a = RawURLGetter.m77316a("other");
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: b */
    public final SharedPreferences mo65635b() {
        SharePrefCache inst = SharePrefCache.inst();
        C89219l.m154716b(inst, "");
        SharedPreferences sharePref = inst.getSharePref();
        C89219l.m154716b(sharePref, "");
        return sharePref;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: c */
    public final boolean mo65636c() {
        Boolean a = C49907s.m93685a();
        C89219l.m154716b(a, "");
        if (!a.booleanValue() || !C79631g.m138444a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: d */
    public final String mo65637d() {
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        String adTrackerConfig = iESSettingsProxy.getAdTrackerConfig();
        C89219l.m154716b(adTrackerConfig, "");
        return adTrackerConfig;
    }

    /* renamed from: f */
    public static IAdTrackDepend m75959f() {
        MethodCollector.m26663i(4705);
        Object a = C81908b.m141854a(IAdTrackDepend.class, false);
        if (a != null) {
            IAdTrackDepend iAdTrackDepend = (IAdTrackDepend) a;
            MethodCollector.m26664o(4705);
            return iAdTrackDepend;
        }
        if (C81908b.f183182al == null) {
            synchronized (IAdTrackDepend.class) {
                try {
                    if (C81908b.f183182al == null) {
                        C81908b.f183182al = new AdTrackDependImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4705);
                    throw th;
                }
            }
        }
        AdTrackDependImpl adTrackDependImpl = (AdTrackDependImpl) C81908b.f183182al;
        MethodCollector.m26664o(4705);
        return adTrackDependImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.depend.AdTrackDependImpl$a */
    static final class C37656a implements AbstractC52909a {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f89026a;

        static {
            Covode.recordClassIndex(45088);
        }

        C37656a(AbstractC89171a aVar) {
            this.f89026a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a
        /* renamed from: a */
        public final void mo61665a(IESSettingsProxy iESSettingsProxy) {
            C89219l.m154721d(iESSettingsProxy, "");
            this.f89026a.invoke();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: a */
    public final int mo65631a(Exception exc) {
        C89219l.m154721d(exc, "");
        if (exc instanceof C14652c) {
            return ((C14652c) exc).getStatusCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: a */
    public final String mo65633a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        String a = C37698e.m76197a(str, str2);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.track.IAdTrackDepend
    /* renamed from: a */
    public final void mo65634a(boolean z, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        SettingsManagerProxy.inst().registerSettingsWatcher(new C37656a(aVar), z);
    }
}
