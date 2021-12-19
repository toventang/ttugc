package com.bytedance.sdk.bdlynx.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22599d;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22603f;
import com.bytedance.sdk.bdlynx.p1677a.p1681d.C22608a;
import com.bytedance.sdk.bdlynx.p1677a.p1682e.AbstractC22610b;
import com.bytedance.sdk.bdlynx.p1685c.AbstractC22620b;
import com.bytedance.sdk.bdlynx.p1686d.AbstractC22632b;
import com.bytedance.sdk.bdlynx.p1686d.C22633c;
import com.bytedance.sdk.bdlynx.report.C22665a;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxPerfMetric;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.view.d */
public class C22678d extends AbstractC28838o {

    /* renamed from: e */
    public static final C22679a f53575e = new C22679a((byte) 0);

    /* renamed from: a */
    private AbstractC22632b f53576a;

    /* renamed from: b */
    C22633c f53577b = new C22633c((byte) 0);

    /* renamed from: c */
    String f53578c = "not_set";

    /* renamed from: d */
    String f53579d = "not_set";

    /* renamed from: f */
    private AbstractC22620b f53580f;

    static {
        Covode.recordClassIndex(26497);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.view.d$a */
    public static final class C22679a {
        static {
            Covode.recordClassIndex(26498);
        }

        private C22679a() {
        }

        public /* synthetic */ C22679a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14467a() {
        super.mo14467a();
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        bVar.mo36889d();
        C22599d.m42633a("BDLynxViewClient", "onLoadSuccess");
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14470b() {
        super.mo14470b();
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        bVar.mo36890e();
        C22599d.m42633a("BDLynxViewClient", "onFirstScreen");
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo16280c() {
        super.mo16280c();
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        bVar.mo36891f();
        C22599d.m42634b("BDLynxViewClient", "onPageUpdate");
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public void mo19152d() {
        super.mo19152d();
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        bVar.mo36887c();
        C22599d.m42633a("BDLynxViewClient", "onRuntimeReady");
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo14473c(String str) {
        super.mo14473c(str);
    }

    /* renamed from: a */
    public final void mo36951a(AbstractC22632b bVar) {
        C89219l.m154719c(bVar, "");
        this.f53576a = bVar;
    }

    @Override // com.lynx.tasm.behavior.AbstractC28510f, com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final String mo14474d(String str) {
        AbstractC22632b bVar = this.f53576a;
        if (bVar == null) {
            C89219l.m154710a("imageUrlReWriter");
        }
        return bVar.mo36911a(this.f53577b, str);
    }

    /* renamed from: a */
    public final void mo36950a(AbstractC22620b bVar) {
        if (bVar != null) {
            this.f53580f = bVar;
            AbstractC22632b bVar2 = this.f53576a;
            if (bVar2 == null) {
                C89219l.m154710a("imageUrlReWriter");
            }
            bVar2.mo36912a(bVar);
        }
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14471b(LynxPerfMetric lynxPerfMetric) {
        JSONObject jSONObject;
        super.mo14471b(lynxPerfMetric);
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        if (lynxPerfMetric != null) {
            jSONObject = lynxPerfMetric.toJSONObject();
        } else {
            jSONObject = null;
        }
        bVar.mo36886b(jSONObject);
        C22599d.m42633a("BDLynxViewClient", "onUpdatePerfReady: metric=".concat(String.valueOf(lynxPerfMetric)));
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: c */
    public final void mo36953c(C28816j jVar) {
        String str;
        super.mo36953c(jVar);
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        String str2 = null;
        if (jVar != null) {
            str = jVar.mo49932a();
        } else {
            str = null;
        }
        bVar.mo36888c(str);
        C22608a.f53417a.mo36876a(AbstractC22610b.class);
        StringBuilder sb = new StringBuilder("onReceivedError: info=");
        if (jVar != null) {
            str2 = jVar.mo49932a();
        }
        C22599d.m42635c("BDLynxViewClient", sb.append(str2).toString());
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: d */
    public final void mo36954d(C28816j jVar) {
        String str;
        super.mo19151a(jVar);
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        String str2 = null;
        if (jVar != null) {
            str = jVar.mo49932a();
        } else {
            str = null;
        }
        bVar.mo36888c(str);
        C22608a.f53417a.mo36876a(AbstractC22610b.class);
        StringBuilder sb = new StringBuilder("onReceivedNativeError: info=");
        if (jVar != null) {
            str2 = jVar.mo49932a();
        }
        C22599d.m42635c("BDLynxViewClient", sb.append(str2).toString());
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14468a(LynxPerfMetric lynxPerfMetric) {
        JSONObject jSONObject;
        super.mo14468a(lynxPerfMetric);
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        if (lynxPerfMetric != null) {
            jSONObject = lynxPerfMetric.toJSONObject();
        } else {
            jSONObject = null;
        }
        bVar.mo36883a(jSONObject);
        C22599d.m42633a("BDLynxViewClient", "onFirstLoadPerfReady: metric=".concat(String.valueOf(lynxPerfMetric)));
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo36952b(C28816j jVar) {
        String str;
        String str2;
        super.mo36952b(jVar);
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        String str3 = null;
        if (jVar != null) {
            str = jVar.mo49932a();
        } else {
            str = null;
        }
        bVar.mo36888c(str);
        if (jVar != null) {
            str2 = jVar.mo49932a();
        } else {
            str2 = null;
        }
        String str4 = this.f53578c;
        String str5 = this.f53579d;
        C89219l.m154719c(str4, "");
        C89219l.m154719c(str5, "");
        C22603f.m42638b(new C22665a.RunnableC22667b(str2, str4, str5));
        StringBuilder sb = new StringBuilder("onReceivedJSError: info=");
        if (jVar != null) {
            str3 = jVar.mo49932a();
        }
        C22599d.m42635c("BDLynxViewClient", sb.append(str3).toString());
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: a */
    public final void mo14469a(String str) {
        super.mo14469a(str);
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        bVar.mo36882a(str);
        C22599d.m42633a("BDLynxViewClient", "onPageStart: url=".concat(String.valueOf(str)));
    }

    @Override // com.lynx.tasm.AbstractC28838o
    /* renamed from: b */
    public final void mo14472b(String str) {
        super.mo14472b(str);
        AbstractC22620b bVar = this.f53580f;
        if (bVar == null) {
            C89219l.m154710a("monitorSession");
        }
        bVar.mo36885b(str);
        C22599d.m42635c("BDLynxViewClient", "onLoadFailed: msg=".concat(String.valueOf(str)));
    }
}
