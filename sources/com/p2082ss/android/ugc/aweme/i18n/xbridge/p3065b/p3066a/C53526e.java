package com.p2082ss.android.ugc.aweme.i18n.xbridge.p3065b.p3066a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.lynx.p717c.p718a.C11986c;
import com.bytedance.android.monitor.p706d.C11919c;
import com.bytedance.android.monitor.p706d.C11921d;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.android.monitor.webview.C12043h;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.service.base.p1168e.AbstractC16640d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback;
import com.bytedance.ies.xbridge.base.runtime.p1292a.C18426f;
import com.bytedance.ies.xbridge.model.p1341b.C18742c;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1349o.C18809c;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.common.applog.C29803q;
import com.p2082ss.android.ugc.aweme.bullet.p2410ab.C34961c;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37838g;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38654au;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38751k;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.i18n.xbridge.p3068d.C53582d;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.e */
public final class C53526e implements IHostLogDepend {
    static {
        Covode.recordClassIndex(63102);
    }

    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.e$a */
    static final class CallableC53527a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C18742c f122883a;

        /* renamed from: b */
        final /* synthetic */ Map f122884b;

        static {
            Covode.recordClassIndex(63103);
        }

        CallableC53527a(C18742c cVar, Map map) {
            this.f122883a = cVar;
            this.f122884b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C89379q<? extends C89391z> call() {
            Object obj;
            String str;
            try {
                AbstractC16640d dVar = (AbstractC16640d) C53582d.m98794a(this.f122883a, AbstractC16640d.class);
                C11919c.C11920a aVar = new C11919c.C11920a("bdx_monitor_xbridge_error");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", this.f122884b.get("code"));
                jSONObject.put("error_message", this.f122884b.get("error_message"));
                jSONObject.put("method_name", this.f122884b.get("method_name"));
                aVar.f28482c = jSONObject;
                aVar.f28487h = true;
                if (dVar != null) {
                    str = dVar.mo26400a();
                } else {
                    str = null;
                }
                aVar.f28480a = str;
                aVar.f28488i = new C12043h();
                HybridMonitor.getInstance().customReport(aVar.mo19133a());
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            return C89379q.m157067boximpl(obj);
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void onEventV3Map(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C39162r.m79460a(str, map);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void putCommonParams(Map<String, String> map, boolean z) {
        C89219l.m154721d(map, "");
        C29803q.m60034a(map, z);
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final C89391z reportJSBError(C18742c cVar, Map<String, ? extends Object> map) {
        C89219l.m154721d(map, "");
        C1731i.m5640b(new CallableC53527a(cVar, map), C1731i.f5562a);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.i18n.xbridge.b.a.e$b */
    public static final class C53528b extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ C38751k f122885a;

        static {
            Covode.recordClassIndex(63104);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53528b(C38751k kVar) {
            super(2);
            this.f122885a = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C38182f.C38184b invoke(C38182f.C38184b bVar, Boolean bool) {
            C38182f.C38184b a;
            C38182f.C38184b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar2, "");
            if (booleanValue) {
                a = bVar2.mo66497b(this.f122885a.f91522m);
            } else {
                a = bVar2.mo66488a(this.f122885a.f91522m);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final C89391z reportJSBFetchError(C18742c cVar, Map<String, ? extends Object> map) {
        WebView webView;
        Object obj;
        Object obj2;
        C89219l.m154721d(map, "");
        Object obj3 = map.get("platform");
        int i = 0;
        int i2 = -99;
        if (C89219l.m154714a(obj3, (Object) EnumC18483e.LYNX.name())) {
            LynxView lynxView = (LynxView) C53582d.m98794a(cVar, LynxView.class);
            if (lynxView != null) {
                try {
                    C11969b bVar = C11969b.f28620f;
                    C11986c cVar2 = new C11986c();
                    Object obj4 = map.get("url");
                    if (!(obj4 instanceof String)) {
                        obj4 = null;
                    }
                    cVar2.f28702c = (String) obj4;
                    Object obj5 = map.get("requestErrorCode");
                    if (!(obj5 instanceof Integer)) {
                        obj5 = null;
                    }
                    Integer num = (Integer) obj5;
                    if (num != null) {
                        i2 = num.intValue();
                    }
                    cVar2.f28704e = i2;
                    Object obj6 = map.get("requestErrorMsg");
                    if (!(obj6 instanceof String)) {
                        obj6 = null;
                    }
                    cVar2.f28705f = (String) obj6;
                    Object obj7 = map.get("method");
                    if (!(obj7 instanceof String)) {
                        obj7 = null;
                    }
                    cVar2.f28701b = (String) obj7;
                    Object obj8 = map.get("statusCode");
                    if (!(obj8 instanceof Integer)) {
                        obj8 = null;
                    }
                    Integer num2 = (Integer) obj8;
                    if (num2 != null) {
                        i = num2.intValue();
                    }
                    cVar2.f28703d = i;
                    bVar.mo19180a(lynxView, cVar2);
                    obj2 = C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    obj2 = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
                C89379q.m157067boximpl(obj2);
            }
        } else if (C89219l.m154714a(obj3, (Object) EnumC18483e.WEB.name()) && (webView = (WebView) C53582d.m98794a(cVar, WebView.class)) != null) {
            try {
                AbstractC12021c cVar3 = C12044i.f28862a;
                C11921d dVar = new C11921d();
                Object obj9 = map.get("url");
                if (!(obj9 instanceof String)) {
                    obj9 = null;
                }
                dVar.f28492b = (String) obj9;
                Object obj10 = map.get("requestErrorCode");
                if (!(obj10 instanceof Integer)) {
                    obj10 = null;
                }
                Integer num3 = (Integer) obj10;
                if (num3 != null) {
                    i2 = num3.intValue();
                }
                dVar.f28494d = i2;
                Object obj11 = map.get("requestErrorMsg");
                if (!(obj11 instanceof String)) {
                    obj11 = null;
                }
                dVar.f28495e = (String) obj11;
                Object obj12 = map.get("method");
                if (!(obj12 instanceof String)) {
                    obj12 = null;
                }
                dVar.f28491a = (String) obj12;
                Object obj13 = map.get("statusCode");
                if (!(obj13 instanceof Integer)) {
                    obj13 = null;
                }
                Integer num4 = (Integer) obj13;
                if (num4 != null) {
                    i = num4.intValue();
                }
                dVar.f28493c = i;
                cVar3.mo19241a(webView, dVar);
                obj = C89379q.m157068constructorimpl(C89391z.f203057a);
            } catch (Throwable th2) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th2));
            }
            C89379q.m157067boximpl(obj);
        }
        return null;
    }

    /* renamed from: a */
    private static void m98745a(C18742c cVar, JSONObject jSONObject, C38751k kVar, IReportADLogResultCallback iReportADLogResultCallback) {
        boolean z;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        try {
            String optString = jSONObject.optString("tag");
            String optString2 = jSONObject.optString("label");
            JSONObject optJSONObject = jSONObject.optJSONObject("extParams");
            if (optJSONObject != null) {
                z = optJSONObject.optBoolean("has_ad_info", false);
            } else {
                z = false;
            }
            C53582d.m98794a(cVar, AbstractC16208i.class);
            C34961c.f82470b = false;
            C34961c.m71391a("");
            String optString3 = jSONObject.optString("creative_id");
            if (optString3 == null) {
                optString3 = "0";
            }
            C34961c.m71392b(optString3);
            jSONObject.optString("creative_id");
            C89219l.m154721d("ad_lynx_download_sendAdLog", "");
            if (z) {
                String optString4 = jSONObject.optString("creative_id");
                String optString5 = jSONObject.optString("log_extra");
                String optString6 = jSONObject.optString("group_id");
                if (TextUtils.isEmpty(optString4)) {
                    jSONObject.optString("creative_id");
                    C89219l.m154721d("ad_lynx_download_sendAdLog", "");
                    iReportADLogResultCallback.onFailure(0, "empty creativeId");
                    return;
                }
                C38182f.C38184b a = C38182f.m77418a();
                a.f90211a = optString;
                a.f90212b = optString2;
                a.f90213c = optString4;
                C38182f.C38184b e = a.mo66506e(optString5);
                e.f90214d = optString6;
                e.mo66501b(optJSONObject).mo66495a((Context) C53582d.m98794a(cVar, Context.class));
                C89219l.m154716b(optString, "");
                C89219l.m154716b(optString2, "");
                C89219l.m154716b(optString4, "");
                C18129a.C18130a a2 = C18129a.m33747a(optString, optString2, optString4, optString5, optString6);
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    C89219l.m154716b(keys, "");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        a2.mo28900b(next, optJSONObject.opt(next));
                    }
                }
                a2.mo28902c();
                jSONObject.optString("creative_id");
                C89219l.m154721d("ad_lynx_download_sendAdLog", "");
                iReportADLogResultCallback.onSuccess(new C18745b(), "");
                return;
            }
            C89219l.m154716b(optString, "");
            if (optString.length() > 0) {
                C89219l.m154716b(optString2, "");
                if (optString2.length() > 0 && kVar != null) {
                    C38182f.C38184b a3 = C38182f.m77418a();
                    a3.f90211a = optString;
                    a3.f90212b = optString2;
                    a3.mo66490a(Long.valueOf(kVar.f91510a)).mo66506e(kVar.f91511b).mo66499b(Long.valueOf(kVar.f91512c)).mo66501b(optJSONObject).mo66495a((Context) C53582d.m98794a(cVar, Context.class));
                    C18129a.C18130a a4 = C18129a.m33747a(optString, optString2, String.valueOf(kVar.f91510a), kVar.f91511b, String.valueOf(kVar.f91512c));
                    if (optJSONObject != null) {
                        Iterator<String> keys2 = optJSONObject.keys();
                        C89219l.m154716b(keys2, "");
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            a4.mo28900b(next2, optJSONObject.opt(next2));
                        }
                    }
                    a4.mo28902c();
                    if (C89219l.m154714a((Object) optString, (Object) "draw_ad") && C89219l.m154714a((Object) optString2, (Object) "click") && (aweme = kVar.f91522m) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                        C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C53528b(kVar));
                    }
                    jSONObject.optString("creative_id");
                    C89219l.m154721d("ad_lynx_download_sendAdLog", "");
                    iReportADLogResultCallback.onSuccess(new C18745b(), "");
                    return;
                }
            }
            jSONObject.optString("creative_id");
            C89219l.m154721d("ad_lynx_download_sendAdLog", "");
            iReportADLogResultCallback.onFailure(0, "empty_tag_or_label_or_adinfo");
        } catch (Exception e2) {
            C51423a.m95788a("", e2);
            jSONObject.optString("creative_id");
            C89219l.m154721d("ad_lynx_download_sendAdLog", "");
            iReportADLogResultCallback.onFailure(0, "unknown error");
        }
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend
    public final void handleReportADLog(C18742c cVar, String str, C18426f fVar, IReportADLogResultCallback iReportADLogResultCallback, EnumC18483e eVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(iReportADLogResultCallback, "");
        C89219l.m154721d(eVar, "");
        C38751k a = C38654au.m78417a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", fVar.f44032a);
        jSONObject.put("tag", fVar.f44033b);
        String str2 = fVar.f44034c;
        if (str2 != null) {
            jSONObject.put("refer", str2);
        }
        String str3 = fVar.f44035d;
        if (str3 != null) {
            jSONObject.put("group_id", str3);
        }
        String str4 = fVar.f44036e;
        if (str4 != null) {
            jSONObject.put("creative_id", str4);
        }
        String str5 = fVar.f44037f;
        if (str5 != null) {
            jSONObject.put("log_extra", str5);
        }
        AbstractC18754n nVar = fVar.f44038g;
        if (nVar != null) {
            jSONObject.put("extParams", C18809c.m34905a(nVar));
        }
        m98745a(cVar, jSONObject, a, iReportADLogResultCallback);
        AbstractC81915c.m141874a(new C37838g(str, jSONObject));
    }
}
