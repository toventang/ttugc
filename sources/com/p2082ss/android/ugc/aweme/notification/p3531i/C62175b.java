package com.p2082ss.android.ugc.aweme.notification.p3531i;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61631f;
import com.p2082ss.android.ugc.aweme.notification.C61892c;
import com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61850i;
import com.p2082ss.android.ugc.aweme.notification.p3520b.C61862a;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62258d;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import com.p2082ss.android.ugc.aweme.notification.view.C62287c;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.i.b */
public final class C62175b extends C62208i.C62209a implements AbstractC61850i, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static final C62176a f141173a = new C62176a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f141174b = C61862a.m111996a(new C62179d(this));

    /* renamed from: d */
    private C62287c f141175d;

    /* renamed from: e */
    private final List<C61631f> f141176e = C62258d.m112609a();

    static {
        Covode.recordClassIndex(72929);
    }

    /* renamed from: b */
    public final NotificationVM mo100175b() {
        return (NotificationVM) this.f141174b.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(137, new RunnableC90250g(C62175b.class, "onNotificationIndicatorEvent", C61561m.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.b$a */
    public static final class C62176a {
        static {
            Covode.recordClassIndex(72930);
        }

        private C62176a() {
        }

        public /* synthetic */ C62176a(byte b) {
            this();
        }
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

    /* renamed from: com.ss.android.ugc.aweme.notification.i.b$d */
    static final class C62179d extends AbstractC89220m implements AbstractC89171a<NotificationVM> {

        /* renamed from: a */
        final /* synthetic */ C62175b f141179a;

        static {
            Covode.recordClassIndex(72933);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62179d(C62175b bVar) {
            super(0);
            this.f141179a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.C62378a.m112820a(this.f141179a.mo100206j());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: d */
    public final void mo100177d() {
        if (mo100206j().af_()) {
            mo100180g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: e */
    public final void mo100178e() {
        if (mo100206j().af_()) {
            mo100180g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.i.b$c */
    public static final class C62178c implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C62175b f141178a;

        static {
            Covode.recordClassIndex(72932);
        }

        C62178c(C62175b bVar) {
            this.f141178a = bVar;
        }

        public final void onDismiss() {
            C62208i j = this.f141178a.mo100206j();
            Objects.requireNonNull(j, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.NotificationFragment");
            ((C61892c) j).mo99994m();
            this.f141178a.mo100180g();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f141178a.mo100205c(R.id.bvn), "rotation", 180.0f, 0.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100172a() {
        Intent intent;
        ActivityC0945e activity = mo100206j().getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && intent.getBooleanExtra("is_from_push", false) && mo100175b().mo100337a() != C61530a.C61532b.m111445a()) {
            C62287c cVar = this.f141175d;
            if (cVar != null) {
                cVar.mo100277a();
            }
            mo99818a(this.f141176e.get(0));
        }
    }

    /* renamed from: g */
    public final void mo100180g() {
        View c = mo100205c(R.id.c0i);
        if (C56297a.m102302d()) {
            c.setVisibility(8);
            return;
        }
        if (mo100175b().mo100337a() != C61530a.C61532b.m111445a()) {
            int a = C61542b.m111458a(C61530a.C61532b.m111445a());
            int a2 = C61542b.m111458a(mo100175b().mo100337a());
            if (a > 0 && a > a2) {
                c.setVisibility(0);
                return;
            }
        }
        c.setVisibility(8);
    }

    /* renamed from: h */
    public final void mo100181h() {
        if (mo100206j().af_()) {
            C62287c cVar = this.f141175d;
            if (cVar == null) {
                Context context = mo100206j().getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                cVar = new C62287c(context, this);
                if (MSAdaptionService.m97895c().mo89377c((Context) mo100206j().getActivity())) {
                    cVar.setWidth(C34723i.m70930c(mo100206j().getActivity()));
                }
                cVar.mo100278a(this.f141176e);
                cVar.setOnDismissListener(new C62178c(this));
                this.f141175d = cVar;
            }
            cVar.showAsDropDown(mo100205c(R.id.dm7));
            mo100205c(R.id.fb2).setVisibility(0);
            mo100205c(R.id.c0i).setVisibility(8);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo100205c(R.id.bvn), "rotation", 0.0f, 180.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.b$b */
    static final class View$OnClickListenerC62177b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C62175b f141177a;

        static {
            Covode.recordClassIndex(72931);
        }

        View$OnClickListenerC62177b(C62175b bVar) {
            this.f141177a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f141177a.mo100181h();
            C62259e.m112625b(this.f141177a.mo100175b().mo100343b());
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onNotificationIndicatorEvent(C61561m mVar) {
        C62287c cVar;
        C89219l.m154721d(mVar, "");
        if (mo100206j().af_() && (cVar = this.f141175d) != null) {
            cVar.mo100279b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61850i
    /* renamed from: a */
    public final void mo99818a(C61631f fVar) {
        int i;
        C89219l.m154721d(fVar, "");
        mo100175b().mo100339a(fVar);
        TuxTextView tuxTextView = (TuxTextView) mo100205c(R.id.ewu);
        Context context = mo100206j().getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        if (fVar.f139899a == C61530a.C61532b.m111445a()) {
            i = R.string.dia;
        } else {
            i = fVar.f139900b;
        }
        tuxTextView.setText(context.getString(i));
        C62287c cVar = this.f141175d;
        if (cVar != null) {
            cVar.dismiss();
        }
        C62259e.m112618a(mo100175b().mo100343b());
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3531i.C62208i.C62209a
    /* renamed from: a */
    public final void mo100174a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        if (!C62269l.m112652a()) {
            View c = mo100205c(R.id.c7d);
            C62023a.m112168a(c);
            c.setOnClickListener(new View$OnClickListenerC62177b(this));
            mo100205c(R.id.bvn).setVisibility(0);
        }
    }
}
