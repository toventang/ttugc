package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55194d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55956g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b */
public final class C55989b extends LinearLayout {

    /* renamed from: d */
    public static final C55990a f127664d = new C55990a((byte) 0);

    /* renamed from: a */
    public IMContact f127665a;

    /* renamed from: b */
    final SharePanelViewModel f127666b;

    /* renamed from: c */
    public final AbstractC56264b f127667c;

    /* renamed from: e */
    private final TextView f127668e;

    /* renamed from: f */
    private final SmartAvatarImageView f127669f;

    /* renamed from: g */
    private final LinearLayout f127670g;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b$d */
    final /* synthetic */ class View$OnClickListenerC55993d implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f127676a;

        static {
            Covode.recordClassIndex(65787);
        }

        View$OnClickListenerC55993d(AbstractC89172b bVar) {
            this.f127676a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f127676a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(65783);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b$a */
    public static final class C55990a {
        static {
            Covode.recordClassIndex(65784);
        }

        private C55990a() {
        }

        public /* synthetic */ C55990a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b$b */
    static final class C55991b implements AbstractC55947a {

        /* renamed from: a */
        final /* synthetic */ C55989b f127671a;

        /* renamed from: b */
        final /* synthetic */ String f127672b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f127673c;

        /* renamed from: d */
        final /* synthetic */ List f127674d;

        static {
            Covode.recordClassIndex(65785);
        }

        C55991b(C55989b bVar, String str, SharePackage sharePackage, List list) {
            this.f127671a = bVar;
            this.f127672b = str;
            this.f127673c = sharePackage;
            this.f127674d = list;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a
        /* renamed from: a */
        public final void mo92815a() {
            C55956g.m101813a(this.f127672b, this.f127673c, this.f127674d);
            AbstractC56264b bVar = this.f127671a.f127667c;
            if (bVar != null) {
                SharePackage sharePackage = this.f127673c;
                this.f127674d.size();
                bVar.mo90151c(sharePackage);
            }
            C55712b.m101459a(this.f127673c, "", C89070n.m154585g((Collection) this.f127674d));
        }
    }

    private final void setName(IMContact iMContact) {
        TextView textView = this.f127668e;
        String displayName = iMContact.getDisplayName();
        if (displayName == null) {
            displayName = C55194d.m100908a("");
        }
        textView.setText(displayName);
    }

    /* renamed from: a */
    public final void mo92854a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        this.f127665a = iMContact;
        setName(iMContact);
        C20766v a = C20761r.m39060a(C34735v.m70965a(iMContact.getDisplayAvatar()));
        a.f49098K = true;
        a.f49115l = R.color.f;
        a.f49092E = this.f127669f;
        a.mo34186c();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b$c */
    static final class C55992c extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55989b f127675a;

        static {
            Covode.recordClassIndex(65786);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55992c(C55989b bVar) {
            super(1);
            this.f127675a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
            if (r1 == null) goto L_0x0042;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
            if (r8 == null) goto L_0x005d;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(android.view.View r18) {
            /*
            // Method dump skipped, instructions count: 233
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c.C55989b.C55992c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55989b(Context context, SharePanelViewModel sharePanelViewModel, AbstractC56264b bVar) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1840);
        this.f127666b = sharePanelViewModel;
        this.f127667c = bVar;
        View.inflate(context, R.layout.a8d, this);
        View findViewById = findViewById(R.id.brg);
        C89219l.m154716b(findViewById, "");
        this.f127670g = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.cpq);
        C89219l.m154716b(findViewById2, "");
        this.f127668e = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.on);
        C89219l.m154716b(findViewById3, "");
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById3;
        this.f127669f = smartAvatarImageView;
        smartAvatarImageView.setOnClickListener(new View$OnClickListenerC55993d(new C55992c(this)));
        MethodCollector.m26664o(1840);
    }
}
