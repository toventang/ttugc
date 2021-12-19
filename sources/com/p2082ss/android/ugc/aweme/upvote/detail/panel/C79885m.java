package com.p2082ss.android.ugc.aweme.upvote.detail.panel;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.m */
public final class C79885m extends AbstractC79808a {

    /* renamed from: j */
    public TuxStatusView f179122j;

    static {
        Covode.recordClassIndex(93110);
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxStatusView m138656a(C79885m mVar) {
        TuxStatusView tuxStatusView = mVar.f179122j;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        return tuxStatusView;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.m$a */
    static final class C79886a extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, EnumC79894q, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79885m f179123a;

        static {
            Covode.recordClassIndex(93111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79886a(C79885m mVar) {
            super(2);
            this.f179123a = mVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.m$a$a */
        static final class C79887a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

            /* renamed from: a */
            public static final C79887a f179124a = new C79887a();

            static {
                Covode.recordClassIndex(93112);
            }

            C79887a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C22999a aVar) {
                C22999a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                aVar2.f54431a = R.raw.icon_large_wifi_slash;
                aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.m$a$b */
        static final class C79888b extends AbstractC89220m implements AbstractC89172b<TuxButton, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C79886a f179125a;

            /* renamed from: b */
            final /* synthetic */ AbstractC12766p f179126b;

            static {
                Covode.recordClassIndex(93113);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C79888b(C79886a aVar, AbstractC12766p pVar) {
                super(1);
                this.f179125a = aVar;
                this.f179126b = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(TuxButton tuxButton) {
                String str;
                TuxButton tuxButton2 = tuxButton;
                C89219l.m154721d(tuxButton2, "");
                Context az_ = this.f179126b.az_();
                if (az_ != null) {
                    str = az_.getString(R.string.cj0);
                } else {
                    str = null;
                }
                tuxButton2.setText(str);
                tuxButton2.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_tab_arrow_counter_clockwise_fill));
                tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.upvote.detail.panel.C79885m.C79886a.C79888b.View$OnClickListenerC798891 */

                    /* renamed from: a */
                    final /* synthetic */ C79888b f179127a;

                    static {
                        Covode.recordClassIndex(93114);
                    }

                    {
                        this.f179127a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        this.f179127a.f179125a.f179123a.mo123383x().mo20662a(UpvoteDetailPanelViewModel.C79803h.f179030a);
                    }
                });
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, EnumC79894q qVar) {
            AbstractC12766p pVar2 = pVar;
            EnumC79894q qVar2 = qVar;
            C89219l.m154721d(pVar2, "");
            C89219l.m154721d(qVar2, "");
            int i = C79891n.f179130a[qVar2.ordinal()];
            if (i == 1) {
                C79885m.m138656a(this.f179123a).mo37867a();
            } else if (i == 2) {
                C79885m.m138656a(this.f179123a).setVisibility(8);
            } else if (i == 3) {
                TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                String b = C34722h.m70923b(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f6n), Integer.valueOf((int) R.string.fax))).intValue());
                C89219l.m154716b(b, "");
                C79885m.m138656a(this.f179123a).setStatus(cVar.mo37878a((CharSequence) b));
                C79885m.m138656a(this.f179123a).setVisibility(0);
            } else if (i == 4) {
                TuxStatusView.C23263c cVar2 = new TuxStatusView.C23263c();
                String b2 = C34722h.m70923b(R.string.azb);
                C89219l.m154716b(b2, "");
                TuxStatusView.C23263c a = cVar2.mo37879a(b2);
                String b3 = C34722h.m70923b(R.string.acq);
                C89219l.m154716b(b3, "");
                TuxStatusView.C23263c a2 = a.mo37878a((CharSequence) b3).mo37877a(C23005c.m43393a(C79887a.f179124a));
                a2.f55132j = new C79888b(this, pVar2);
                C79885m.m138656a(this.f179123a).setStatus(a2);
                C79885m.m138656a(this.f179123a).setVisibility(0);
                Fragment a3 = C12777b.m22999a((AbstractC1204m) pVar2);
                if (a3 != null) {
                    new C23144b(a3).mo37635a(a3.getString(R.string.acq)).mo37637b();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo123401a(double d) {
        TuxStatusView tuxStatusView = this.f179122j;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        TuxStatusView tuxStatusView2 = this.f179122j;
        if (tuxStatusView2 == null) {
            C89219l.m154710a("statusView");
        }
        ViewGroup.LayoutParams layoutParams = tuxStatusView2.getLayoutParams();
        layoutParams.height = (int) d;
        tuxStatusView.setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        int i;
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.f_1);
        C89219l.m154716b(findViewById, "");
        TuxStatusView tuxStatusView = (TuxStatusView) findViewById;
        this.f179122j = tuxStatusView;
        if (tuxStatusView == null) {
            C89219l.m154710a("statusView");
        }
        Context context = tuxStatusView.getContext();
        C89219l.m154716b(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            i = displayMetrics.heightPixels;
        } else {
            i = 0;
        }
        AbstractC12818f.C12819a.m23063a(this, mo123383x(), C79892o.f179131a, (C12854k) null, new C79886a(this), 6);
        AbstractC12818f.C12819a.m23063a(this, mo123383x(), C79893p.f179132a, (C12854k) null, new C79890b(this, i), 6);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.panel.m$b */
    static final class C79890b extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Float, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79885m f179128a;

        /* renamed from: b */
        final /* synthetic */ int f179129b;

        static {
            Covode.recordClassIndex(93115);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79890b(C79885m mVar, int i) {
            super(2);
            this.f179128a = mVar;
            this.f179129b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Float f) {
            float floatValue = f.floatValue();
            C89219l.m154721d(pVar, "");
            if (floatValue == 0.0f) {
                C79885m mVar = this.f179128a;
                double d = (double) this.f179129b;
                Double.isNaN(d);
                mVar.mo123401a(d * 0.5d);
            } else if (floatValue == 1.0f) {
                C79885m mVar2 = this.f179128a;
                double d2 = (double) this.f179129b;
                Double.isNaN(d2);
                mVar2.mo123401a(d2 * 0.73d);
            } else if (floatValue > 0.0f) {
                C79885m mVar3 = this.f179128a;
                double d3 = (double) this.f179129b;
                double d4 = (double) floatValue;
                Double.isNaN(d4);
                Double.isNaN(d3);
                mVar3.mo123401a(d3 * ((d4 * 0.22999999999999998d) + 0.5d));
            }
            return C89391z.f203057a;
        }
    }
}
