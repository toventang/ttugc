package com.p2082ss.android.ugc.aweme.commercialize.track;

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
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.bytedance.ies.ugc.appcontext.C17867d;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.track.h */
public final class C38534h {

    /* renamed from: a */
    static String f91054a;

    /* renamed from: b */
    public static final C38534h f91055b = new C38534h();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.h$b */
    public static final class C38536b extends AbstractC2632f {
        static {
            Covode.recordClassIndex(46066);
        }

        C38536b() {
        }

        @Override // com.bytedance.android.p126a.p127a.AbstractC2632f
        /* renamed from: a */
        public final String mo7152a() {
            return RawURLGetter.m78123c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.h$c */
    public static final class C38537c extends AbstractC2653a {
        static {
            Covode.recordClassIndex(46067);
        }

        C38537c() {
        }
    }

    private C38534h() {
    }

    static {
        Covode.recordClassIndex(46064);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.h$e */
    public static final class C38539e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC2623d f91058a;

        static {
            Covode.recordClassIndex(46069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38539e(AbstractC2623d dVar) {
            super(0);
            this.f91058a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (C89361p.m154872a(C38534h.f91054a, C38525a.f91037a.mo65637d(), false)) {
                this.f91058a.mo7133a(C38534h.m78153b());
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static C2633a m78153b() {
        JSONObject c = m78154c();
        C2633a.C2634a aVar = new C2633a.C2634a();
        aVar.f7927b = false;
        aVar.f7928c = true;
        aVar.f7930e = c;
        C2633a a = aVar.mo7154a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: c */
    private static JSONObject m78154c() {
        f91054a = C38525a.f91037a.mo65637d();
        try {
            return new JSONObject(f91054a);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final AbstractC2623d mo67058a() {
        MethodCollector.m26663i(7446);
        C2628e d = C2628e.m7607d();
        C89219l.m154716b(d, "");
        if (!d.mo7137a()) {
            synchronized (getClass()) {
                try {
                    if (!d.mo7137a()) {
                        AbstractC2623d.C2624a a = AbstractC2623d.m7590a(C17867d.m33078a());
                        a.f7872a = m78153b();
                        a.f7873b = C38535a.f91056a;
                        a.f7874c = new C38536b();
                        C2651a.C2652a aVar = new C2651a.C2652a();
                        aVar.f7945a = true;
                        aVar.f7946b = new C38537c();
                        C2651a.C2652a a2 = aVar.mo7170a(C38538d.f91057a);
                        C89219l.m154716b(a2, "");
                        if (C38528d.m78146a()) {
                            a2 = a2.mo7170a(new C38540i());
                            C89219l.m154716b(a2, "");
                        }
                        a.mo7140a(a2.mo7171a()).mo7141a();
                        C38525a.f91037a.mo65634a(false, (AbstractC89171a<C89391z>) new C38539e(C2628e.m7607d()));
                    }
                } finally {
                    MethodCollector.m26664o(7446);
                }
            }
        }
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.h$d */
    public static final class C38538d implements AbstractC2661e {

        /* renamed from: a */
        public static final C38538d f91057a = new C38538d();

        static {
            Covode.recordClassIndex(46068);
        }

        C38538d() {
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
                    } catch (JSONException unused) {
                    }
                    Throwable th = a.f7970f;
                    if (th != null) {
                        try {
                            jSONObject.put("error_message", th.getMessage());
                        } catch (JSONException unused2) {
                            Integer.valueOf(0);
                        }
                    }
                    try {
                        jSONObject.put("status_code", a.f7965a);
                    } catch (JSONException unused3) {
                    }
                    IMonitorDepend iMonitorDepend = C16091a.f38742b;
                    if (iMonitorDepend != null) {
                        iMonitorDepend.monitorStatusRate("aweme_third_party_track_url_succeed_rate", a.mo7183a() ? 1 : 0, jSONObject);
                    }
                }
            }
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.track.h$a */
    public static final class C38535a implements AbstractC2612a {

        /* renamed from: a */
        public static final C38535a f91056a = new C38535a();

        static {
            Covode.recordClassIndex(46065);
        }

        C38535a() {
        }

        @Override // com.bytedance.android.p126a.p127a.p128a.AbstractC2612a
        /* renamed from: a */
        public final void mo7117a(String str, JSONObject jSONObject) {
            IAppLogDepend iAppLogDepend = C16091a.f38741a;
            if (iAppLogDepend != null) {
                C89219l.m154716b(str, "");
                iAppLogDepend.onEventV3Json(str, jSONObject);
            }
        }
    }
}
