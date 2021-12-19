package com.p2082ss.android.ugc.aweme.choosemusic.utils;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1712a.C23017a;
import com.bytedance.tux.dialog.p1712a.C23020d;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.dialog.p1716e.C23056g;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.choosemusic.model.C35895ao;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.AbstractC35717k;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35719m;
import com.p2082ss.android.ugc.aweme.choosemusic.p2467g.C35839a;
import com.p2082ss.android.ugc.aweme.choosemusic.p2467g.C35841c;
import com.p2082ss.android.ugc.aweme.choosemusic.view.C35963ad;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.d */
public final class C35938d implements AbstractC35717k {

    /* renamed from: g */
    public static final C35939a f84818g = new C35939a((byte) 0);

    /* renamed from: a */
    public final ImageView f84819a;

    /* renamed from: b */
    public final RelativeLayout f84820b;

    /* renamed from: c */
    C35963ad f84821c;

    /* renamed from: d */
    List<C35895ao> f84822d = new ArrayList();

    /* renamed from: e */
    public final Context f84823e;

    /* renamed from: f */
    public final View f84824f;

    /* renamed from: h */
    private final LinearLayout f84825h;

    /* renamed from: i */
    private final TuxTextView f84826i;

    /* renamed from: j */
    private final ImageView f84827j;

    /* renamed from: k */
    private AbstractC89171a<C89391z> f84828k;

    /* renamed from: l */
    private Keva f84829l = Keva.getRepo("commercial_music_dialog_repo");

    static {
        Covode.recordClassIndex(43180);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.d$a */
    public static final class C35939a {
        static {
            Covode.recordClassIndex(43181);
        }

        private C35939a() {
        }

        public /* synthetic */ C35939a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo63057a() {
        if (this.f84827j.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.d$f */
    static final class C35945f implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ C35938d f84835a;

        static {
            Covode.recordClassIndex(43187);
        }

        C35945f(C35938d dVar) {
            this.f84835a = dVar;
        }

        public final void onDismiss() {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f84835a.f84819a, "rotation", 180.0f, 0.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    /* renamed from: b */
    private final void m73329b() {
        String str;
        int i;
        String str2;
        User b = C80580in.m139683b();
        if (b != null) {
            str = b.getUid();
        } else {
            str = null;
        }
        if (CommerceMediaServiceImpl.m77578f().mo66511a() && C35839a.m73233a() && m73328a(str)) {
            C23023b bVar = (C23023b) new C23023b(this.f84823e).mo37409a(new C23056g(this.f84823e)).mo37483b(R.string.gfh).mo37479a(R.string.gfq);
            C23020d dVar = new C23020d(this.f84823e);
            dVar.mo37404b();
            Resources resources = this.f84823e.getResources();
            if (resources == null || (str2 = resources.getString(R.string.gfr)) == null) {
                str2 = "";
            }
            dVar.mo37403a(str2);
            dVar.mo37402a(new C35940b(this));
            C23028c.m43435a(bVar.mo37406a(dVar), C35941c.f84831a).mo37405a().mo37396b().show();
            this.f84829l.storeLong(str, System.currentTimeMillis());
        }
        ImageView imageView = this.f84827j;
        if (CommerceMediaServiceImpl.m77578f().mo66513b() || CommerceMediaServiceImpl.m77578f().mo66517e()) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        this.f84827j.setOnClickListener(new View$OnClickListenerC35943d(this));
    }

    /* renamed from: a */
    public final void mo63056a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f84828k = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.d$c */
    public static final class C35941c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C35941c f84831a = new C35941c();

        static {
            Covode.recordClassIndex(43183);
        }

        C35941c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.gfp, C359421.f84832a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.d$b */
    public static final class C35940b extends AbstractC89220m implements AbstractC89172b<C23017a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C35938d f84830a;

        static {
            Covode.recordClassIndex(43182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35940b(C35938d dVar) {
            super(1);
            this.f84830a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23017a aVar) {
            C23017a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C39162r.m79460a("ttelite_BA_open_music_faq_learn_more_click", new C33744d().mo59980a("is_commercial", 1).f79943a);
            SmartRouter.buildRoute(this.f84830a.f84823e, C35841c.m73234a()).open();
            aVar2.mo37399a().dismiss();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.d$d */
    public static final class View$OnClickListenerC35943d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35938d f84833a;

        static {
            Covode.recordClassIndex(43185);
        }

        View$OnClickListenerC35943d(C35938d dVar) {
            this.f84833a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                C39162r.m79460a("ttelite_BA_open_music_faq_button_click", new C33744d().mo59980a("is_commercial", 1).f79943a);
                SmartRouter.buildRoute(this.f84833a.f84823e, C35841c.m73234a()).open();
            }
        }
    }

    /* renamed from: a */
    private final boolean m73328a(String str) {
        if (str == null) {
            return false;
        }
        long j = this.f84829l.getLong(str, -1);
        if (j == -1) {
            return true;
        }
        if (j == -1 || System.currentTimeMillis() - j <= 2592000000L) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.utils.d$e */
    static final class View$OnClickListenerC35944e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35938d f84834a;

        static {
            Covode.recordClassIndex(43186);
        }

        View$OnClickListenerC35944e(C35938d dVar) {
            this.f84834a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C35938d dVar = this.f84834a;
            RelativeLayout relativeLayout = dVar.f84820b;
            if (dVar.f84821c == null) {
                C35963ad adVar = new C35963ad(dVar.f84823e, dVar);
                adVar.setWidth(C34723i.m70930c(dVar.f84823e));
                dVar.f84822d.add(new C35895ao(false, R.string.ad6));
                dVar.f84822d.add(new C35895ao(true, R.string.d_n));
                List<C35895ao> list = dVar.f84822d;
                C89219l.m154721d(list, "");
                C35719m mVar = adVar.f84890a;
                if (mVar == null) {
                    C89219l.m154710a("mAdapter");
                }
                mVar.mo62377b_(list);
                adVar.setOnDismissListener(new C35945f(dVar));
                dVar.f84821c = adVar;
            }
            C35963ad adVar2 = dVar.f84821c;
            if (adVar2 != null) {
                adVar2.showAsDropDown(relativeLayout);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dVar.f84819a, "rotation", 0.0f, 180.0f);
            C89219l.m154716b(ofFloat, "");
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    }

    /* renamed from: a */
    public final void mo63055a(float f) {
        if (Float.isNaN(f)) {
            if (!this.f84825h.isClickable()) {
                this.f84825h.setEnabled(true);
                this.f84825h.setClickable(true);
            }
        } else if (this.f84825h.isClickable()) {
            this.f84825h.setEnabled(false);
            this.f84825h.setClickable(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.choosemusic.p2461a.AbstractC35717k
    /* renamed from: a */
    public final void mo62761a(C35895ao aoVar) {
        boolean z;
        C89219l.m154721d(aoVar, "");
        if (!aoVar.f84720a) {
            this.f84826i.setText(R.string.ad6);
        } else {
            this.f84826i.setText(R.string.d_n);
        }
        C35963ad adVar = this.f84821c;
        if (adVar != null) {
            adVar.dismiss();
        }
        if (CommerceMediaServiceImpl.m77578f().mo66517e() != aoVar.f84720a) {
            z = true;
        } else {
            z = false;
        }
        CommerceMediaServiceImpl.m77578f().mo66510a(aoVar.f84720a);
        if (z) {
            m73329b();
            AbstractC89171a<C89391z> aVar = this.f84828k;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public C35938d(Context context, View view) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        this.f84823e = context;
        this.f84824f = view;
        View findViewById = view.findViewById(R.id.ces);
        C89219l.m154716b(findViewById, "");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        this.f84825h = linearLayout;
        View findViewById2 = view.findViewById(R.id.f63);
        C89219l.m154716b(findViewById2, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.f84826i = tuxTextView;
        View findViewById3 = view.findViewById(R.id.c0h);
        C89219l.m154716b(findViewById3, "");
        ImageView imageView = (ImageView) findViewById3;
        this.f84819a = imageView;
        View findViewById4 = view.findViewById(R.id.ej1);
        C89219l.m154716b(findViewById4, "");
        this.f84820b = (RelativeLayout) findViewById4;
        View findViewById5 = view.findViewById(R.id.buf);
        C89219l.m154716b(findViewById5, "");
        this.f84827j = (ImageView) findViewById5;
        if (CommerceMediaServiceImpl.m77578f().mo66516d()) {
            imageView.setVisibility(0);
            if (CommerceMediaServiceImpl.m77578f().mo66517e()) {
                tuxTextView.setText(R.string.d_n);
            } else {
                tuxTextView.setText(R.string.ad6);
            }
            C62023a.m112168a(linearLayout);
            linearLayout.setOnClickListener(new View$OnClickListenerC35944e(this));
        }
        m73329b();
    }
}
