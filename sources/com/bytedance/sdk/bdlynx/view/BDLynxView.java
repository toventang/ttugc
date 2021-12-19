package com.bytedance.sdk.bdlynx.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bdlynx.p1677a.C22605b;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22591b;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22603f;
import com.bytedance.sdk.bdlynx.p1677a.p1680c.C22607a;
import com.bytedance.sdk.bdlynx.p1677a.p1681d.C22608a;
import com.bytedance.sdk.bdlynx.p1677a.p1682e.AbstractC22609a;
import com.bytedance.sdk.bdlynx.p1677a.p1683f.C22613a;
import com.bytedance.sdk.bdlynx.p1685c.AbstractC22620b;
import com.bytedance.sdk.bdlynx.p1685c.C22618a;
import com.bytedance.sdk.bdlynx.p1686d.AbstractC22631a;
import com.bytedance.sdk.bdlynx.p1686d.C22633c;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22638a;
import com.bytedance.sdk.bdlynx.p1692f.C22660a;
import com.bytedance.sdk.bdlynx.p1692f.C22662b;
import com.lynx.tasm.C28818l;
import com.lynx.tasm.C28820n;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import java.io.File;
import java.util.LinkedList;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public class BDLynxView extends FrameLayout implements AbstractC22680e {

    /* renamed from: e */
    public static final C22669a f53540e = new C22669a((byte) 0);

    /* renamed from: a */
    public LynxView f53541a;

    /* renamed from: b */
    public final String f53542b;

    /* renamed from: c */
    public final LinkedList<TemplateData> f53543c;

    /* renamed from: d */
    public boolean f53544d;

    /* renamed from: g */
    private final C22605b f53545g;

    /* renamed from: h */
    private C22607a f53546h;

    /* renamed from: i */
    private final C28820n f53547i;

    /* renamed from: j */
    private C28818l f53548j;

    /* renamed from: k */
    private final JSONObject f53549k;

    /* renamed from: l */
    private AbstractC22620b f53550l;

    /* renamed from: m */
    private boolean f53551m;

    /* renamed from: n */
    private final boolean f53552n;

    /* renamed from: o */
    private final AbstractC22631a f53553o;

    /* renamed from: p */
    private final C22678d f53554p;

    static {
        Covode.recordClassIndex(26487);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.view.BDLynxView$a */
    public static final class C22669a {
        static {
            Covode.recordClassIndex(26488);
        }

        private C22669a() {
        }

        public /* synthetic */ C22669a(byte b) {
            this();
        }
    }

    public final C22605b getBDLynxContext() {
        return this.f53545g;
    }

    public final C22678d getDefaultLynxViewClient() {
        return this.f53554p;
    }

    /* renamed from: com.bytedance.sdk.bdlynx.view.BDLynxView$d */
    static final class RunnableC22672d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BDLynxView f53557a;

        /* renamed from: b */
        final /* synthetic */ TemplateData f53558b;

        static {
            Covode.recordClassIndex(26491);
        }

        RunnableC22672d(BDLynxView bDLynxView, TemplateData templateData) {
            this.f53557a = bDLynxView;
            this.f53558b = templateData;
        }

        public final void run() {
            this.f53557a.getLynxView().updateData(this.f53558b);
        }
    }

    public final LynxView getLynxView() {
        LynxView lynxView = this.f53541a;
        if (lynxView == null) {
            C89219l.m154710a("lynxView");
        }
        return lynxView;
    }

    /* renamed from: a */
    private final void m42737a() {
        LynxView lynxView = this.f53541a;
        if (lynxView == null) {
            C89219l.m154710a("lynxView");
        }
        lynxView.setGlobalProps(C22662b.f53531a.mo36934a(m42739c()));
    }

    /* renamed from: b */
    private final void m42738b() {
        MethodCollector.m26663i(6612);
        synchronized (this.f53543c) {
            try {
                this.f53544d = false;
                this.f53543c.clear();
            } finally {
                MethodCollector.m26664o(6612);
            }
        }
    }

    /* renamed from: c */
    private final JSONObject m42739c() {
        JSONObject a = C22660a.m42730a();
        C22613a.m42644a(a, this.f53549k);
        a.put("groupId", this.f53546h.f53415b);
        a.put("cardId", this.f53546h.f53416c);
        return a;
    }

    /* renamed from: com.bytedance.sdk.bdlynx.view.BDLynxView$b */
    public static final class C22670b extends C22678d {

        /* renamed from: a */
        final /* synthetic */ BDLynxView f53555a;

        static {
            Covode.recordClassIndex(26489);
        }

        @Override // com.lynx.tasm.AbstractC28838o, com.bytedance.sdk.bdlynx.view.C22678d
        /* renamed from: d */
        public final void mo19152d() {
            MethodCollector.m26663i(6900);
            super.mo19152d();
            synchronized (this.f53555a.f53543c) {
                try {
                    this.f53555a.f53544d = true;
                    while (!this.f53555a.f53543c.isEmpty()) {
                        TemplateData removeFirst = this.f53555a.f53543c.removeFirst();
                        BDLynxView bDLynxView = this.f53555a;
                        C89219l.m154709a((Object) removeFirst, "");
                        C89219l.m154719c(removeFirst, "");
                        synchronized (bDLynxView.f53543c) {
                            try {
                                if (!bDLynxView.f53544d) {
                                    bDLynxView.f53543c.add(removeFirst);
                                } else {
                                    C22603f.m42637a(new RunnableC22672d(bDLynxView, removeFirst));
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } finally {
                    MethodCollector.m26664o(6900);
                }
            }
            MethodCollector.m26664o(6900);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C22670b(BDLynxView bDLynxView) {
            this.f53555a = bDLynxView;
        }
    }

    public final void setLynxView(LynxView lynxView) {
        C89219l.m154719c(lynxView, "");
        this.f53541a = lynxView;
    }

    public final void setCurActivity(Activity activity) {
        C89219l.m154719c(activity, "");
        C22605b bVar = this.f53545g;
        C89219l.m154719c(activity, "");
        bVar.f53410b = activity;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        LynxView lynxView = this.f53541a;
        if (lynxView == null) {
            C89219l.m154710a("lynxView");
        }
        lynxView.setOnClickListener(onClickListener);
    }

    /* renamed from: com.bytedance.sdk.bdlynx.view.BDLynxView$c */
    static final class C22671c extends AbstractC89220m implements AbstractC89172b<C22607a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C22638a f53556a;

        static {
            Covode.recordClassIndex(26490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22671c(C22638a aVar) {
            super(1);
            this.f53556a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22607a aVar) {
            C22607a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            String str = this.f53556a.f53465f;
            C89219l.m154719c(str, "");
            aVar2.f53415b = str;
            String str2 = this.f53556a.f53466g;
            C89219l.m154719c(str2, "");
            aVar2.f53416c = str2;
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BDLynxView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new C22677c());
        C89219l.m154719c(context, "");
    }

    @Override // com.bytedance.sdk.bdlynx.view.AbstractC22680e
    /* renamed from: a */
    public final void mo36939a(String str, String str2) {
        C89219l.m154719c(str, "");
        m42738b();
        m42737a();
        LynxView lynxView = this.f53541a;
        if (lynxView == null) {
            C89219l.m154710a("lynxView");
        }
        lynxView.renderTemplateUrl(str, str2);
    }

    @Override // com.bytedance.sdk.bdlynx.view.AbstractC22680e
    /* renamed from: a */
    public final void mo36938a(C22638a aVar, String str) {
        C89219l.m154719c(aVar, "");
        C22671c cVar = new C22671c(aVar);
        C89219l.m154719c(cVar, "");
        cVar.invoke(this.f53546h);
        C22605b bVar = this.f53545g;
        C22607a aVar2 = this.f53546h;
        C89219l.m154719c(aVar2, "");
        bVar.f53409a = aVar2;
        this.f53550l.mo36879a(this.f53546h);
        C22678d dVar = this.f53554p;
        C89219l.m154719c(aVar, "");
        C22633c cVar2 = dVar.f53577b;
        cVar2.f53454a = aVar.mo36919a().f53472f;
        cVar2.f53455b = aVar.f53463d;
        cVar2.f53456c = aVar.f53462c;
        dVar.mo36950a(aVar.f53460a);
        dVar.f53578c = aVar.f53465f;
        dVar.f53579d = aVar.f53466g;
        m42737a();
        byte[] bArr = aVar.f53464e;
        String str2 = "bdlynx" + File.separator + aVar.mo36919a().f53468b;
        C89219l.m154719c(bArr, "");
        new C22591b("bdlynx_tpl_render_start", (byte) 0).mo36869a("group_id", this.f53546h.f53415b).mo36869a("card_id", this.f53546h.f53416c).mo36869a("cli_version", this.f53546h.f53414a).mo36871a();
        m42738b();
        m42737a();
        LynxView lynxView = this.f53541a;
        if (lynxView == null) {
            C89219l.m154710a("lynxView");
        }
        lynxView.renderTemplateWithBaseUrl(bArr, str, str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BDLynxView(Context context, AttributeSet attributeSet, C22677c cVar) {
        super(context, attributeSet);
        AbstractC22609a aVar;
        C89378p a;
        C89219l.m154719c(context, "");
        C89219l.m154719c(cVar, "");
        MethodCollector.m26663i(6754);
        C22605b bVar = new C22605b(context);
        this.f53545g = bVar;
        this.f53546h = cVar.f53571e;
        C28820n nVar = cVar.f53570d;
        this.f53547i = nVar;
        this.f53548j = cVar.f53567a;
        this.f53542b = cVar.f53568b;
        this.f53549k = cVar.f53574h;
        this.f53543c = new LinkedList<>();
        this.f53550l = C22618a.C22619a.m42666a(this.f53546h, null);
        this.f53551m = cVar.f53569c;
        boolean z = cVar.f53573g;
        this.f53552n = z;
        AbstractC22631a aVar2 = cVar.f53572f;
        this.f53553o = aVar2;
        C22670b bVar2 = new C22670b(this);
        if (aVar2 != null) {
            bVar2.mo36951a(new C22675b(aVar2));
        } else {
            bVar2.mo36951a(new C22673a());
        }
        this.f53554p = bVar2;
        if (!(!this.f53551m || (aVar = (AbstractC22609a) C22608a.f53417a.mo36876a(AbstractC22609a.class)) == null || (a = aVar.mo36877a()) == null)) {
            nVar.mo49939a((String) a.getFirst(), (Class) a.getSecond(), bVar);
        }
        C28818l lVar = this.f53548j;
        nVar.mo49935a(lVar == null ? C28818l.m57690a("default", new String[]{"assets://bdlynx_core.js"}) : lVar);
        LynxView a2 = nVar.mo49940a(getContext());
        C89219l.m154709a((Object) a2, "");
        this.f53541a = a2;
        bVar2.mo36950a(this.f53550l);
        this.f53550l.mo36884b();
        if (z) {
            LynxView lynxView = this.f53541a;
            if (lynxView == null) {
                C89219l.m154710a("lynxView");
            }
            lynxView.addLynxViewClient(bVar2);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        LynxView lynxView2 = this.f53541a;
        if (lynxView2 == null) {
            C89219l.m154710a("lynxView");
        }
        addView(lynxView2, layoutParams);
        MethodCollector.m26664o(6754);
    }
}
