package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.p3241ui.p3244c;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxRadio;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.C56083c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56204e;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f */
public final class C56010f extends RecyclerView.ViewHolder {

    /* renamed from: g */
    public static final C56011a f127714g = new C56011a((byte) 0);

    /* renamed from: a */
    public final TextView f127715a;

    /* renamed from: b */
    public final AvatarImageView f127716b;

    /* renamed from: c */
    public IMContact f127717c;

    /* renamed from: d */
    public boolean f127718d;

    /* renamed from: e */
    public final C56083c f127719e;

    /* renamed from: f */
    public final SharePanelViewModel f127720f;

    /* renamed from: h */
    private final TuxRadio f127721h;

    /* renamed from: i */
    private final TuxButton f127722i;

    /* renamed from: j */
    private final ConstraintLayout f127723j;

    /* renamed from: k */
    private final AbstractC56264b f127724k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f$c */
    final /* synthetic */ class View$OnClickListenerC56013c implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f127726a;

        static {
            Covode.recordClassIndex(65807);
        }

        View$OnClickListenerC56013c(AbstractC89172b bVar) {
            this.f127726a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f127726a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(65804);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f$a */
    public static final class C56011a {
        static {
            Covode.recordClassIndex(65805);
        }

        private C56011a() {
        }

        public /* synthetic */ C56011a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo92863a(boolean z) {
        this.f127721h.setChecked(z);
    }

    /* renamed from: b */
    public final void mo92864b(boolean z) {
        int i;
        TuxButton tuxButton = this.f127722i;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        if (z) {
            i = R.string.fit;
        } else {
            i = R.string.fid;
        }
        tuxButton.setText(context.getText(i));
        this.f127722i.setEnabled(!z);
        this.f127722i.setClickable(!z);
        this.f127723j.setClickable(!z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.f$b */
    static final class C56012b extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C56010f f127725a;

        static {
            Covode.recordClassIndex(65806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56012b(C56010f fVar) {
            super(1);
            this.f127725a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(View view) {
            C89219l.m154721d(view, "");
            if (C55076b.m100723b().getUnder16Proxy() != null) {
                IIMunder16Proxy under16Proxy = C55076b.m100723b().getUnder16Proxy();
                if (under16Proxy.mo93021c()) {
                    if (under16Proxy != null) {
                        under16Proxy.mo93026h();
                    }
                    return C89391z.f203057a;
                }
            }
            IMContact iMContact = this.f127725a.f127717c;
            if (iMContact != null) {
                if (!C56204e.m102119c()) {
                    this.f127725a.f127719e.mo92946a(iMContact);
                } else if (!this.f127725a.f127718d) {
                    SharePanelViewModel sharePanelViewModel = this.f127725a.f127720f;
                    C89219l.m154721d(iMContact, "");
                    if (!sharePanelViewModel.f127872c) {
                        sharePanelViewModel.mo92937a(iMContact, !sharePanelViewModel.mo92938b().contains(iMContact));
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56010f(View view, SharePanelViewModel sharePanelViewModel, AbstractC56264b bVar) {
        super(view);
        int i;
        C89219l.m154721d(view, "");
        C89219l.m154721d(sharePanelViewModel, "");
        this.f127720f = sharePanelViewModel;
        this.f127724k = bVar;
        this.f127719e = new C56083c(sharePanelViewModel, bVar);
        View findViewById = view.findViewById(R.id.ddr);
        C89219l.m154716b(findViewById, "");
        TuxRadio tuxRadio = (TuxRadio) findViewById;
        this.f127721h = tuxRadio;
        View findViewById2 = view.findViewById(R.id.yt);
        C89219l.m154716b(findViewById2, "");
        TuxButton tuxButton = (TuxButton) findViewById2;
        this.f127722i = tuxButton;
        View findViewById3 = view.findViewById(R.id.cpq);
        C89219l.m154716b(findViewById3, "");
        this.f127715a = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.on);
        C89219l.m154716b(findViewById4, "");
        this.f127716b = (AvatarImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.brg);
        C89219l.m154716b(findViewById5, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById5;
        this.f127723j = constraintLayout;
        int i2 = 8;
        if (C56204e.m102117a()) {
            i = 0;
        } else {
            i = 8;
        }
        tuxButton.setVisibility(i);
        tuxRadio.setVisibility(C56204e.m102119c() ? 0 : i2);
        C56012b bVar2 = new C56012b(this);
        tuxRadio.setClickable(false);
        tuxButton.setOnClickListener(new View$OnClickListenerC56013c(bVar2));
        constraintLayout.setOnClickListener(new View$OnClickListenerC56013c(bVar2));
    }
}
