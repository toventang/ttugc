package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.android.monitor.lynx.C11969b;
import com.bytedance.android.monitor.webview.AbstractC12021c;
import com.bytedance.android.monitor.webview.C12044i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1191d.p1192a.AbstractC17117i;
import com.bytedance.ies.p1191d.p1192a.AbstractC17124l;
import com.bytedance.ies.p1191d.p1192a.AbstractC17126n;
import com.bytedance.ies.p1191d.p1192a.C17143x;
import com.bytedance.ies.p1191d.p1192a.p1193a.C17076a;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.lynx.tasm.LynxView;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ai */
public final class C7085ai extends AbstractC18334e<JSONObject, JSONObject> {

    /* renamed from: a */
    public static final C7086a f17696a = new C7086a((byte) 0);

    /* renamed from: b */
    private final C7087b f17697b;

    /* renamed from: c */
    private final AbstractC17124l f17698c;

    static {
        Covode.recordClassIndex(7831);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ai$a */
    public static final class C7086a {
        static {
            Covode.recordClassIndex(7832);
        }

        private C7086a() {
        }

        public /* synthetic */ C7086a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        this.f17698c.mo27038a();
    }

    public C7085ai() {
        C7087b bVar = new C7087b(this);
        this.f17697b = bVar;
        C89219l.m154719c(bVar, "");
        C17076a aVar = C17076a.f40646f;
        if (aVar == null) {
            C89219l.m154707a();
        }
        C89219l.m154719c(bVar, "");
        this.f17698c = new C17143x(aVar, bVar);
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ai$b */
    public static final class C7087b extends AbstractC17126n.C17127a {

        /* renamed from: a */
        final /* synthetic */ C7085ai f17699a;

        static {
            Covode.recordClassIndex(7833);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7087b(C7085ai aiVar) {
            this.f17699a = aiVar;
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17126n.C17127a, com.bytedance.ies.p1191d.p1192a.AbstractC17126n
        /* renamed from: a */
        public final void mo13353a(Throwable th) {
            C89219l.m154721d(th, "");
            super.mo13353a(th);
            this.f17699a.mo13351a(-1);
            this.f17699a.finishWithFailure(th);
        }

        @Override // com.bytedance.ies.p1191d.p1192a.AbstractC17126n.C17127a
        /* renamed from: a */
        public final void mo13352a(AbstractC17117i.C17120c cVar) {
            C89219l.m154721d(cVar, "");
            super.mo13352a(cVar);
            JSONObject b = cVar.mo27031b();
            if (b.has("status_code")) {
                b.remove("status_code");
            }
            this.f17699a.mo13351a(cVar.f40735f);
            this.f17699a.finishWithResult(b);
        }
    }

    /* renamed from: c */
    private static JSONObject m15038c(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else if (i != 1) {
            i2 = -1;
        } else {
            i2 = 3;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", i2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    private final JSONObject m15037b(int i) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cached", i);
            C18338g gVar = this.callContext;
            C89219l.m154716b(gVar, "");
            View view = gVar.f43862d;
            if (view instanceof WebView) {
                str = "webview";
            } else if (view instanceof LynxView) {
                str = "lynx";
            } else {
                str = "unknown";
            }
            jSONObject.put("live_container_type", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo13351a(int i) {
        int i2;
        C18338g gVar = this.callContext;
        C89219l.m154716b(gVar, "");
        View view = gVar.f43862d;
        if (view instanceof WebView) {
            i2 = 0;
        } else if (view instanceof LynxView) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        JSONObject b = m15037b(i);
        JSONObject c = m15038c(i2);
        if (i2 == 0) {
            AbstractC12021c cVar = C12044i.f28862a;
            C18338g gVar2 = this.callContext;
            C89219l.m154716b(gVar2, "");
            C18338g gVar3 = this.callContext;
            C89219l.m154716b(gVar3, "");
            cVar.mo19232a((WebView) gVar2.f43862d, gVar3.f43860b, "prefetch_cached", b, null, null, c, false);
        } else if (i2 == 1) {
            C11969b bVar = C11969b.f28620f;
            C18338g gVar4 = this.callContext;
            C89219l.m154716b(gVar4, "");
            C18338g gVar5 = this.callContext;
            C89219l.m154716b(gVar5, "");
            bVar.mo19184a((LynxView) gVar4.f43862d, "prefetch_cached", gVar5.f43860b, b, null, null, c, false);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final /* synthetic */ void invoke(JSONObject jSONObject, C18338g gVar) {
        JSONObject jSONObject2 = jSONObject;
        C89219l.m154721d(jSONObject2, "");
        C89219l.m154721d(gVar, "");
        this.f17698c.mo27039a(jSONObject2);
    }
}
