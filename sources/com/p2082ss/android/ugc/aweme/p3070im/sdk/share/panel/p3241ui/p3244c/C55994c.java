package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.c */
public final class C55994c extends LinearLayout {

    /* renamed from: a */
    public IMContact f127677a;

    /* renamed from: b */
    public final SharePanelViewModel f127678b;

    /* renamed from: c */
    private final TextView f127679c;

    /* renamed from: d */
    private final AvatarImageView f127680d;

    /* renamed from: e */
    private final LinearLayout f127681e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.c$b */
    final /* synthetic */ class View$OnClickListenerC55996b implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f127683a;

        static {
            Covode.recordClassIndex(65790);
        }

        View$OnClickListenerC55996b(AbstractC89172b bVar) {
            this.f127683a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f127683a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(65788);
    }

    /* renamed from: a */
    public final void mo92856a(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        this.f127677a = iMContact;
        this.f127680d.setImageDrawable(C17867d.m33078a().getResources().getDrawable(2131232831));
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.c$a */
    static final class C55995a extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C55994c f127682a;

        static {
            Covode.recordClassIndex(65789);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55995a(C55994c cVar) {
            super(1);
            this.f127682a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            if (!(C55076b.m100723b() == null || C55076b.m100723b().getUnder16Proxy() == null)) {
                IIMunder16Proxy under16Proxy = C55076b.m100723b().getUnder16Proxy();
                if (under16Proxy.mo93021c() && under16Proxy != null) {
                    under16Proxy.mo93026h();
                }
            }
            SharePanelViewModel sharePanelViewModel = this.f127682a.f127678b;
            if (sharePanelViewModel != null) {
                IMContact iMContact = this.f127682a.f127677a;
                if (iMContact == null) {
                    C89219l.m154715b();
                }
                sharePanelViewModel.mo92937a(iMContact, true);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55994c(Context context, SharePanelViewModel sharePanelViewModel) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4051);
        this.f127678b = sharePanelViewModel;
        View.inflate(context, R.layout.a8e, this);
        View findViewById = findViewById(R.id.brg);
        C89219l.m154716b(findViewById, "");
        this.f127681e = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.cpq);
        C89219l.m154716b(findViewById2, "");
        this.f127679c = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.on);
        C89219l.m154716b(findViewById3, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById3;
        this.f127680d = avatarImageView;
        avatarImageView.setOnClickListener(new View$OnClickListenerC55996b(new C55995a(this)));
        MethodCollector.m26664o(4051);
    }
}
