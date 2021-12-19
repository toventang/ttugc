package com.p2082ss.android.ugc.aweme.bullet.bridge.p2413ad;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p2082ss.android.ugc.aweme.bullet.p2410ab.C34961c;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37838g;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38164aj;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38654au;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38751k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import java.util.Iterator;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod */
public final class SendAdLogMethod extends BaseBridgeMethod implements AbstractC33974au {

    /* renamed from: b */
    public static final C34990a f82547b = new C34990a((byte) 0);

    /* renamed from: c */
    private final String f82548c = "sendAdLog";

    static {
        Covode.recordClassIndex(42054);
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod$a */
    public static final class C34990a {
        static {
            Covode.recordClassIndex(42055);
        }

        private C34990a() {
        }

        public /* synthetic */ C34990a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16192q
    /* renamed from: d */
    public final String mo25752d() {
        return this.f82548c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendAdLogMethod(C16248b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod$b */
    static final class C34991b extends AbstractC89220m implements AbstractC89183m<C38182f.C38184b, Boolean, C38182f.C38184b> {

        /* renamed from: a */
        final /* synthetic */ C38751k f82549a;

        static {
            Covode.recordClassIndex(42056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34991b(C38751k kVar) {
            super(2);
            this.f82549a = kVar;
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
                a = bVar2.mo66497b(this.f82549a.f91522m);
            } else {
                a = bVar2.mo66488a(this.f82549a.f91522m);
            }
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* renamed from: a */
    public final void mo61866a(JSONObject jSONObject, BaseBridgeMethod.AbstractC34965a aVar) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(aVar, "");
        String optString = jSONObject.optString("func");
        C38751k a = C38654au.m78417a();
        try {
            String optString2 = jSONObject.optString("tag");
            String optString3 = jSONObject.optString("label");
            JSONObject optJSONObject = jSONObject.optJSONObject("extParam");
            boolean optBoolean = jSONObject.optBoolean("has_ad_info", false);
            mo61867h();
            C34961c.f82470b = false;
            C34961c.m71391a("");
            String optString4 = jSONObject.optString("creative_id");
            if (optString4 == null) {
                optString4 = "0";
            }
            C34961c.m71392b(optString4);
            jSONObject.optString("creative_id");
            C89219l.m154721d("ad_lynx_download_sendAdLog", "");
            if (optBoolean) {
                String optString5 = jSONObject.optString("creative_id");
                String optString6 = jSONObject.optString("log_extra");
                String optString7 = jSONObject.optString("group_id");
                if (TextUtils.isEmpty(optString5)) {
                    jSONObject.optString("creative_id");
                    C89219l.m154721d("ad_lynx_download_sendAdLog", "");
                    if (aVar != null) {
                        aVar.mo61871a(-1, "empty creativeId");
                    }
                } else {
                    C38182f.C38184b a2 = C38182f.m77418a();
                    a2.f90211a = optString2;
                    a2.f90212b = optString3;
                    a2.f90213c = optString5;
                    C38182f.C38184b e = a2.mo66506e(optString6);
                    e.f90214d = optString7;
                    e.mo66501b(optJSONObject).mo66495a(mo26893e());
                    C89219l.m154716b(optString2, "");
                    C89219l.m154716b(optString3, "");
                    C89219l.m154716b(optString5, "");
                    C18129a.C18130a a3 = C18129a.m33747a(optString2, optString3, optString5, optString6, optString7);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        C89219l.m154716b(keys, "");
                        while (keys.hasNext()) {
                            String next = keys.next();
                            a3.mo28900b(next, optJSONObject.opt(next));
                        }
                    }
                    a3.mo28902c();
                    jSONObject.optString("creative_id");
                    C89219l.m154721d("ad_lynx_download_sendAdLog", "");
                    if (aVar != null) {
                        aVar.mo61872a((Object) null);
                    }
                }
            } else {
                C89219l.m154716b(optString2, "");
                if (optString2.length() > 0) {
                    C89219l.m154716b(optString3, "");
                    if (optString3.length() > 0 && a != null) {
                        C38182f.C38184b a4 = C38182f.m77418a();
                        a4.f90211a = optString2;
                        a4.f90212b = optString3;
                        a4.mo66490a(Long.valueOf(a.f91510a)).mo66506e(a.f91511b).mo66499b(Long.valueOf(a.f91512c)).mo66501b(optJSONObject).mo66495a(mo26893e());
                        C18129a.C18130a a5 = C18129a.m33747a(optString2, optString3, String.valueOf(a.f91510a), a.f91511b, String.valueOf(a.f91512c));
                        if (optJSONObject != null) {
                            Iterator<String> keys2 = optJSONObject.keys();
                            C89219l.m154716b(keys2, "");
                            while (keys2.hasNext()) {
                                String next2 = keys2.next();
                                a5.mo28900b(next2, optJSONObject.opt(next2));
                            }
                        }
                        a5.mo28902c();
                        if (C89219l.m154714a((Object) optString2, (Object) "draw_ad") && C89219l.m154714a((Object) optString3, (Object) "click") && (aweme = a.f91522m) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                            C38164aj.m77369a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new C34991b(a));
                        }
                        jSONObject.optString("creative_id");
                        C89219l.m154721d("ad_lynx_download_sendAdLog", "");
                        if (aVar != null) {
                            aVar.mo61872a((Object) null);
                        }
                    }
                }
                jSONObject.optString("creative_id");
                C89219l.m154721d("ad_lynx_download_sendAdLog", "");
                if (aVar != null) {
                    aVar.mo61871a(-1, "empty tag or label");
                }
            }
        } catch (Exception e2) {
            C51423a.m95788a("", e2);
            jSONObject.optString("creative_id");
            C89219l.m154721d("ad_lynx_download_sendAdLog", "");
            if (aVar != null) {
                aVar.mo61871a(-1, "unknown error");
            }
        }
        C89219l.m154716b(optString, "");
        AbstractC81915c.m141874a(new C37838g(optString, jSONObject));
    }
}
