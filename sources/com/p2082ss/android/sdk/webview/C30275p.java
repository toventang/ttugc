package com.p2082ss.android.sdk.webview;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C18364w;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34340m;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34346s;
import com.p2082ss.android.ugc.aweme.p2355ax.p2356a.C34337k;
import java.util.HashMap;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.sdk.webview.p */
public final class C30275p {

    /* renamed from: d */
    public static final HashMap<String, HashMap<String, String>> f72221d = new HashMap<>();

    /* renamed from: e */
    public static final C30276a f72222e = new C30276a((byte) 0);

    /* renamed from: a */
    public AbstractC30268l f72223a;

    /* renamed from: b */
    public final C18364w f72224b;

    /* renamed from: c */
    public final C30245c f72225c;

    /* renamed from: com.ss.android.sdk.webview.p$a */
    public static final class C30276a {
        static {
            Covode.recordClassIndex(36788);
        }

        private C30276a() {
        }

        public /* synthetic */ C30276a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(36787);
    }

    public C30275p(C18364w wVar, C30245c cVar) {
        this.f72224b = wVar;
        this.f72225c = cVar;
    }

    /* renamed from: com.ss.android.sdk.webview.p$b */
    public static final class C30277b extends AbstractC89220m implements AbstractC89187q<HashMap<String, String>, Boolean, JSONObject, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C30275p f72226a;

        /* renamed from: b */
        final /* synthetic */ C34337k f72227b;

        /* renamed from: c */
        final /* synthetic */ Uri f72228c;

        static {
            Covode.recordClassIndex(36789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30277b(C30275p pVar, C34337k kVar, Uri uri) {
            super(3);
            this.f72226a = pVar;
            this.f72227b = kVar;
            this.f72228c = uri;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(HashMap<String, String> hashMap, Boolean bool, JSONObject jSONObject) {
            String str;
            AbstractC34346s a;
            HashMap<String, String> hashMap2 = hashMap;
            boolean booleanValue = bool.booleanValue();
            C30275p pVar = this.f72226a;
            if (hashMap2 != null) {
                C34337k kVar = this.f72227b;
                if (!(kVar == null || (a = kVar.mo60793a(AbstractC34340m.class)) == null)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(StringSet.type, "jsb");
                    jSONObject2.put("bridge_name", "openConfig");
                    jSONObject2.put("bridge_access", "true");
                    jSONObject2.put("bridge_list", hashMap2.toString());
                    jSONObject2.put("stage", "open_jsb_auth");
                    AbstractC34346s.C34347a.m70288a(a, "open_jsb_monitor", "open_jsb_list", jSONObject2);
                }
                Uri uri = this.f72228c;
                C89219l.m154709a((Object) uri, "");
                String host = uri.getHost();
                if (host != null) {
                    HashMap<String, HashMap<String, String>> hashMap3 = C30275p.f72221d;
                    C89219l.m154709a((Object) host, "");
                    hashMap3.put(host, hashMap2);
                }
            }
            C18364w wVar = pVar.f72224b;
            if (wVar != null && !wVar.f43935e) {
                if (booleanValue) {
                    str = "openConfigSuccess";
                } else {
                    str = "openConfigError";
                }
                wVar.mo29404a(str, jSONObject);
            }
            return C89391z.f203057a;
        }
    }
}
