package com.p2082ss.android.ugc.aweme.commercialize.log;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.AbstractC2623d;
import com.bytedance.android.p126a.p127a.AbstractC2632f;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.android.p126a.p127a.p128a.AbstractC2612a;
import com.bytedance.android.p126a.p127a.p133f.C2633a;
import com.bytedance.android.p126a.p136b.C2651a;
import com.bytedance.android.p126a.p136b.p137a.AbstractC2653a;
import com.bytedance.android.p126a.p136b.p138b.C2665b;
import com.bytedance.android.p126a.p136b.p138b.C2667c;
import com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.commercialize.track.C38528d;
import com.p2082ss.android.ugc.aweme.commercialize.track.C38540i;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.am */
public final class C38168am {

    /* renamed from: a */
    static String f90151a;

    /* renamed from: b */
    public static final C38168am f90152b = new C38168am();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.am$b */
    public static final class C38170b extends AbstractC2632f {
        static {
            Covode.recordClassIndex(45649);
        }

        C38170b() {
        }

        @Override // com.bytedance.android.p126a.p127a.AbstractC2632f
        /* renamed from: a */
        public final String mo7152a() {
            return RawURLGetter.m77316a("other");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.am$c */
    public static final class C38171c extends AbstractC2653a {
        static {
            Covode.recordClassIndex(45650);
        }

        C38171c() {
        }
    }

    private C38168am() {
    }

    static {
        Covode.recordClassIndex(45647);
    }

    /* renamed from: b */
    public static C2633a m77383b() {
        JSONObject c = m77384c();
        C2633a.C2634a aVar = new C2633a.C2634a();
        aVar.f7927b = false;
        aVar.f7928c = true;
        aVar.f7930e = c;
        C2633a a = aVar.mo7154a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: c */
    private static JSONObject m77384c() {
        IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
        C89219l.m154716b(iESSettingsProxy, "");
        f90151a = iESSettingsProxy.getAdTrackerConfig();
        try {
            IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy2, "");
            return new JSONObject(iESSettingsProxy2.getAdTrackerConfig());
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final AbstractC2623d mo66468a() {
        MethodCollector.m26663i(4533);
        C2628e d = C2628e.m7607d();
        C89219l.m154716b(d, "");
        if (!d.mo7137a()) {
            synchronized (getClass()) {
                try {
                    if (!d.mo7137a()) {
                        AbstractC2623d.C2624a a = AbstractC2623d.m7590a(C17867d.m33078a());
                        a.f7872a = m77383b();
                        a.f7873b = C38169a.f90153a;
                        a.f7874c = new C38170b();
                        C2651a.C2652a aVar = new C2651a.C2652a();
                        aVar.f7945a = true;
                        aVar.f7946b = new C38171c();
                        C2651a.C2652a a2 = aVar.mo7170a(C38172d.f90154a);
                        C89219l.m154716b(a2, "");
                        if (C38528d.m78146a()) {
                            a2 = a2.mo7170a(new C38540i());
                            C89219l.m154716b(a2, "");
                        }
                        a.mo7140a(a2.mo7171a()).mo7141a();
                        SettingsManagerProxy.inst().registerSettingsWatcher(new C38173e(C2628e.m7607d()), false);
                    }
                } finally {
                    MethodCollector.m26664o(4533);
                }
            }
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.am$e */
    public static final class C38173e implements AbstractC52909a {

        /* renamed from: a */
        final /* synthetic */ AbstractC2623d f90155a;

        static {
            Covode.recordClassIndex(45652);
        }

        C38173e(AbstractC2623d dVar) {
            this.f90155a = dVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.global.config.settings.AbstractC52909a
        /* renamed from: a */
        public final void mo61665a(IESSettingsProxy iESSettingsProxy) {
            C89219l.m154721d(iESSettingsProxy, "");
            String str = C38168am.f90151a;
            IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy2, "");
            if (C89361p.m154872a(str, iESSettingsProxy2.getAdTrackerConfig(), false)) {
                this.f90155a.mo7133a(C38168am.m77383b());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.am$d */
    public static final class C38172d implements AbstractC2661e {

        /* renamed from: a */
        public static final C38172d f90154a = new C38172d();

        static {
            Covode.recordClassIndex(45651);
        }

        C38172d() {
        }

        @Override // com.bytedance.android.p126a.p136b.p138b.p139a.AbstractC2661e
        /* renamed from: a */
        public final C2667c mo7176a(AbstractC2661e.AbstractC2662a aVar) {
            String str;
            String str2;
            C89219l.m154721d(aVar, "");
            C2667c a = aVar.mo7179a(aVar.mo7178a());
            if (a != null) {
                C2665b bVar = a.f7969e;
                if (bVar != null) {
                    str = bVar.f7957b;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    C2665b bVar2 = a.f7969e;
                    C89219l.m154716b(bVar2, "");
                    Uri parse = Uri.parse(bVar2.f7957b);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("track_url", parse.toString());
                        C89219l.m154716b(parse, "");
                        jSONObject.put("scheme", parse.getScheme());
                        jSONObject.put("host", parse.getHost());
                        jSONObject.put("path", parse.getPath());
                        jSONObject.put("ref", "track_sdk");
                        if (C38528d.m78146a()) {
                            str2 = "1";
                        } else {
                            str2 = "0";
                        }
                        jSONObject.put("use_ttnet", str2);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    Throwable th = a.f7970f;
                    if (th != null) {
                        try {
                            jSONObject.put("error_message", th.getMessage());
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                    }
                    try {
                        jSONObject.put("status_code", a.f7965a);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                    C12290b.m22060a("aweme_third_party_track_url_succeed_rate", a.mo7183a() ? 1 : 0, jSONObject);
                }
            }
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.am$a */
    public static final class C38169a implements AbstractC2612a {

        /* renamed from: a */
        public static final C38169a f90153a = new C38169a();

        static {
            Covode.recordClassIndex(45648);
        }

        C38169a() {
        }

        @Override // com.bytedance.android.p126a.p127a.p128a.AbstractC2612a
        /* renamed from: a */
        public final void mo7117a(String str, JSONObject jSONObject) {
            C39162r.m79461a(str, jSONObject);
        }
    }
}
