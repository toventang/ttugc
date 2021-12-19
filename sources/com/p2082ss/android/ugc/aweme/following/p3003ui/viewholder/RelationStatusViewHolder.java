package com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51106e;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder */
public final class RelationStatusViewHolder extends JediSimpleViewHolder<C51106e> implements AbstractC33974au {

    /* renamed from: g */
    public static final C51351a f118373g = new C51351a((byte) 0);

    /* renamed from: f */
    public final Context f118374f;

    /* renamed from: j */
    private final TuxStatusView f118375j = ((TuxStatusView) this.itemView.findViewById(R.id.e7i));

    /* renamed from: k */
    private final DmtStatusView.C17269a f118376k;

    /* renamed from: l */
    private boolean f118377l;

    static {
        Covode.recordClassIndex(60559);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$a */
    public static final class C51351a {
        static {
            Covode.recordClassIndex(60560);
        }

        private C51351a() {
        }

        public /* synthetic */ C51351a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$c */
    static final class View$OnClickListenerC51353c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RelationStatusViewHolder f118379a;

        /* renamed from: b */
        final /* synthetic */ C51106e f118380b;

        static {
            Covode.recordClassIndex(60562);
        }

        View$OnClickListenerC51353c(RelationStatusViewHolder relationStatusViewHolder, C51106e eVar) {
            this.f118379a = relationStatusViewHolder;
            this.f118380b = eVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (this.f118380b.f117928a == 9) {
                str = "following";
            } else {
                str = "fans";
            }
            SmartRouter.buildRoute(this.f118379a.f118374f, "//friends/find").withParam("previous_page", str).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder$b */
    static final class C51352b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C51352b f118378a = new C51352b();

        static {
            Covode.recordClassIndex(60561);
        }

        C51352b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 70.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 70.0f, system2.getDisplayMetrics()));
            aVar2.f54431a = R.raw.icon_large_person;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RelationStatusViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131560324(0x7f0d0784, float:1.8746017E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            android.content.Context r0 = r5.getContext()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.f118374f = r0
            android.view.View r1 = r4.itemView
            r0 = 2131368540(0x7f0a1a5c, float:1.8357033E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bytedance.tux.status.TuxStatusView r0 = (com.bytedance.tux.status.TuxStatusView) r0
            r4.f118375j = r0
            android.content.Context r0 = r5.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView.C17269a.m31905a(r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.f118376k = r0
            r0 = 1
            r4.f118377l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.viewholder.RelationStatusViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C51106e eVar) {
        int a;
        int i;
        int i2;
        C51106e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        switch (eVar2.f117928a) {
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                if (this.f118377l) {
                    TuxStatusView tuxStatusView = this.f118375j;
                    TuxStatusView.C23263c a2 = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C51352b.f118378a));
                    Context context = this.f118374f;
                    int i3 = ((C51106e) aQ_()).f117928a;
                    if (i3 != 7) {
                        if (i3 != 8) {
                            i = R.string.gzv;
                        } else if (((C51106e) aQ_()).f117929b) {
                            i = R.string.gzt;
                        } else {
                            i = R.string.h09;
                        }
                    } else if (((C51106e) aQ_()).f117929b) {
                        i = R.string.bxu;
                    } else {
                        i = R.string.h07;
                    }
                    String string = context.getString(i);
                    C89219l.m154716b(string, "");
                    TuxStatusView.C23263c a3 = a2.mo37879a(string);
                    Context context2 = this.f118374f;
                    int i4 = ((C51106e) aQ_()).f117928a;
                    if (i4 != 7) {
                        if (i4 != 8) {
                            i2 = R.string.gzw;
                        } else if (((C51106e) aQ_()).f117929b) {
                            i2 = R.string.gzu;
                        } else {
                            i2 = R.string.h0_;
                        }
                    } else if (((C51106e) aQ_()).f117929b) {
                        i2 = R.string.bzj;
                    } else {
                        i2 = R.string.h08;
                    }
                    String string2 = context2.getString(i2);
                    C89219l.m154716b(string2, "");
                    tuxStatusView.setStatus(a3.mo37878a((CharSequence) string2));
                    this.f118377l = false;
                }
                TuxStatusView tuxStatusView2 = this.f118375j;
                C89219l.m154716b(tuxStatusView2, "");
                ViewGroup.LayoutParams layoutParams = tuxStatusView2.getLayoutParams();
                if (TextUtils.isEmpty(eVar2.f117930c)) {
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    a = C89241a.m154730a(TypedValue.applyDimension(1, 320.0f, system.getDisplayMetrics()));
                } else {
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    a = C89241a.m154730a(TypedValue.applyDimension(1, 400.0f, system2.getDisplayMetrics()));
                }
                layoutParams.height = a;
                TuxStatusView tuxStatusView3 = this.f118375j;
                C89219l.m154716b(tuxStatusView3, "");
                tuxStatusView3.setLayoutParams(layoutParams);
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                View a4 = C1764a.m5927a(LayoutInflater.from(this.f118374f), R.layout.apu, null, false);
                this.f118376k.mo27406b(a4);
                ((TextView) a4.findViewById(R.id.gr)).setOnClickListener(new View$OnClickListenerC51353c(this, eVar2));
                TuxStatusView tuxStatusView4 = this.f118375j;
                C89219l.m154716b(tuxStatusView4, "");
                ViewGroup.LayoutParams layoutParams2 = tuxStatusView4.getLayoutParams();
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                layoutParams2.height = C89241a.m154730a(TypedValue.applyDimension(1, 155.0f, system3.getDisplayMetrics()));
                TuxStatusView tuxStatusView5 = this.f118375j;
                C89219l.m154716b(tuxStatusView5, "");
                tuxStatusView5.setLayoutParams(layoutParams2);
                return;
            default:
                return;
        }
    }
}
