package com.p2082ss.android.ugc.aweme.notification.p3531i;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.notification.service.C62239a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56198e;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.i.c */
public final class C62180c extends C62208i.C62209a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private final AbstractC89244h f141180a = C89250i.m154773a((AbstractC89171a) C62181a.f141182a);

    /* renamed from: b */
    private View f141181b;

    static {
        Covode.recordClassIndex(72934);
    }

    /* renamed from: b */
    public final DmNoticeProxy mo100185b() {
        return (DmNoticeProxy) this.f141180a.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(82, new RunnableC90250g(C62180c.class, "onUnder16RefreshEvent", C56198e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: c */
    public final void mo100176c() {
        C80298cg.m139204a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: f */
    public final void mo100179f() {
        C80298cg.m139205b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.c$a */
    static final class C62181a extends AbstractC89220m implements AbstractC89171a<DmNoticeProxy> {

        /* renamed from: a */
        public static final C62181a f141182a = new C62181a();

        static {
            Covode.recordClassIndex(72935);
        }

        C62181a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DmNoticeProxy invoke() {
            return DmNoticeProxyImpl.m111428e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100172a() {
        mo100185b().mo99180b("notification_page");
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    public final void cg_() {
        mo100185b().mo99179a("notification_page");
    }

    /* renamed from: h */
    private final void m112458h() {
        if (C61542b.m111467b().isChatFunOfflineUnder16()) {
            View view = this.f141181b;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f141181b;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onUnder16RefreshEvent(C56198e eVar) {
        C89219l.m154721d(eVar, "");
        m112458h();
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.c$b */
    static final class View$OnClickListenerC62182b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62180c f141183a;

        static {
            Covode.recordClassIndex(72936);
        }

        View$OnClickListenerC62182b(C62180c cVar) {
            this.f141183a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C61542b.m111467b().shouldRedictToTipsPage()) {
                C61542b.m111467b().goToTipsPage();
                return;
            }
            IIMService a = C62239a.C62240a.m112592a();
            Context requireContext = this.f141183a.mo100206j().requireContext();
            C89219l.m154716b(requireContext, "");
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "notification_page");
            bundle.putString("enter_method", "button");
            bundle.putString("notice_type", this.f141183a.mo100185b().mo99182c());
            bundle.putInt("message_cnt", this.f141183a.mo100185b().mo99183d());
            a.openSessionListActivity(requireContext, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100174a(View view, Bundle bundle) {
        MethodCollector.m26663i(1076);
        C89219l.m154721d(view, "");
        if (!C62269l.m112652a() && !C56318b.m102311b()) {
            View dmEntranceView = IMService.createIIMServicebyMonsterPlugin(false).getDmEntranceView(mo100206j().getContext(), "notification_page");
            this.f141181b = dmEntranceView;
            if (dmEntranceView != null) {
                dmEntranceView.setOnClickListener(new View$OnClickListenerC62182b(this));
                ((ViewGroup) mo100205c(R.id.dm7)).addView(dmEntranceView);
            }
        }
        m112458h();
        MethodCollector.m26664o(1076);
    }
}
