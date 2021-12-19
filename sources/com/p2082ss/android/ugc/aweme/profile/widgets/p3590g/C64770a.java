package com.p2082ss.android.ugc.aweme.profile.widgets.p3590g;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3565a.C63354d;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63828ae;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3598k.AbstractC64907d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a */
public final class C64770a extends AbstractC12769a implements AbstractC63860x, AbstractC64868e, AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public static final C64771a f146533j = new C64771a((byte) 0);

    /* renamed from: k */
    private C63828ae f146534k;

    /* renamed from: l */
    private TextView f146535l;

    /* renamed from: m */
    private TextView f146536m;

    /* renamed from: n */
    private ProfileViewModel f146537n;

    static {
        Covode.recordClassIndex(76237);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61025a(String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61026a(boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(164, new RunnableC90250g(C64770a.class, "onClickGuideCardEvent", C63354d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a$a */
    public static final class C64771a {
        static {
            Covode.recordClassIndex(76238);
        }

        private C64771a() {
        }

        public /* synthetic */ C64771a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C64867d mo20658e() {
        return new C64867d();
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: x */
    private final C63828ae m116610x() {
        if (this.f146534k == null) {
            C63828ae aeVar = new C63828ae();
            this.f146534k = aeVar;
            aeVar.f144692c = this;
        }
        C63828ae aeVar2 = this.f146534k;
        if (aeVar2 == null) {
            C89219l.m154715b();
        }
        return aeVar2;
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a != null) {
            this.f146537n = ProfileViewModel.C64397a.m116300a(a);
        }
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: v */
    public final void mo104217v() {
        if (C63786o.m115356f()) {
            TextView textView = this.f146535l;
            if (textView != null) {
                textView.setText(R.string.bjt);
                return;
            }
            return;
        }
        TextView textView2 = this.f146535l;
        if (textView2 != null) {
            textView2.setText(R.string.bju);
        }
    }

    /* renamed from: w */
    public final void mo104218w() {
        C63786o.m115357g();
        AbstractC64616j.C64617a.m116533a((AbstractC64616j) C12801d.m23018a(this, C89204ab.m154669a(AbstractC64616j.class)), null, 3);
        ProfileViewModel profileViewModel = this.f146537n;
        if (profileViewModel != null) {
            profileViewModel.mo104032b(C63786o.m115355e());
        }
        mo104217v();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.AbstractC64868e
    /* renamed from: b */
    public final void mo104215b(String str) {
        m116610x().mo103297d(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a$e */
    static final class C64775e extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64770a f146542a;

        static {
            Covode.recordClassIndex(76242);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64775e(C64770a aVar) {
            super(1);
            this.f146542a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            if (aVar != null) {
                this.f146542a.mo104217v();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a$b */
    static final class C64772b extends AbstractC89220m implements AbstractC89172b<C64867d, C64867d> {

        /* renamed from: a */
        final /* synthetic */ Exception f146538a;

        /* renamed from: b */
        final /* synthetic */ int f146539b;

        static {
            Covode.recordClassIndex(76239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64772b(Exception exc, int i) {
            super(1);
            this.f146538a = exc;
            this.f146539b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64867d invoke(C64867d dVar) {
            if (dVar != null) {
                return new C64867d(new C12776a(C89387v.m154943a(this.f146538a, Integer.valueOf(this.f146539b))));
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a$d */
    static final class C64774d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends C89386u<? extends Integer, ? extends Integer, ? extends Intent>>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64770a f146541a;

        static {
            Covode.recordClassIndex(76241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64774d(C64770a aVar) {
            super(1);
            this.f146541a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends C89386u<? extends Integer, ? extends Integer, ? extends Intent>> aVar) {
            C12776a<? extends C89386u<? extends Integer, ? extends Integer, ? extends Intent>> aVar2 = aVar;
            if (aVar2 != null) {
                T t = aVar2.f31085a;
                int intValue = ((Number) t.component1()).intValue();
                ((Number) t.component2()).intValue();
                Object component3 = t.component3();
                if (intValue == 10002 && component3 != null) {
                    this.f146541a.mo104218w();
                }
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r
    public final void onClickGuideCardEvent(C63354d dVar) {
        if (dVar == null) {
            return;
        }
        if (dVar.f143850a == 2) {
            String str = dVar.f143851b;
            C89219l.m154721d(str, "");
            m116610x().mo103295b(str);
        } else if (dVar.f143850a == 3) {
            mo104214a(dVar.f143851b);
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        TextView textView;
        C89219l.m154721d(view, "");
        this.f146535l = (TextView) view.findViewById(R.id.cpd);
        this.f146536m = (TextView) view.findViewById(R.id.fa9);
        TextView textView2 = this.f146535l;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC64773c(this));
        }
        if (C80580in.m139687c() && (textView = this.f146535l) != null) {
            textView.setVisibility(8);
        }
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64863b.f146650a, new C64774d(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64865c.f146654a, new C64775e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.g.a$c */
    static final class View$OnClickListenerC64773c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64770a f146540a;

        static {
            Covode.recordClassIndex(76240);
        }

        View$OnClickListenerC64773c(C64770a aVar) {
            this.f146540a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String str = "click_edit_profile";
            C39162r.m79460a("enter_profile_edit", new C33744d().mo59983a("enter_method", str).f79943a);
            C33744d a = new C33744d().mo59980a("is_child_mode", C80580in.m139687c() ? 1 : 0);
            if (C63786o.m115356f()) {
                str = "click_set_up_profile";
            }
            C39162r.m79460a("edit_profile", a.mo59983a("enter_method", str).mo59980a("fans_1K", C63786o.m115354d() ? 1 : 0).f79943a);
            ActivityC0945e b = C12777b.m23004b(this.f146540a);
            if (b != null) {
                if (C80580in.m139687c()) {
                    new C79459a(b).mo123052a(b.getString(R.string.acx)).mo123053a();
                    return;
                }
                SmartRoute buildRoute = SmartRouter.buildRoute(b, "aweme://profile_edit");
                C89219l.m154716b(buildRoute, "");
                buildRoute.open();
                SharePrefCache inst = SharePrefCache.inst();
                C89219l.m154716b(inst, "");
                C33594aj<Boolean> isProfileBubbleShown = inst.getIsProfileBubbleShown();
                C89219l.m154716b(isProfileBubbleShown, "");
                isProfileBubbleShown.mo59940b(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.AbstractC64868e
    /* renamed from: a */
    public final boolean mo104214a(String str) {
        String str2;
        User curUser;
        C89219l.m154721d(str, "");
        IAccountUserService g = C31575b.m65865g();
        if (g == null || (curUser = g.getCurUser()) == null) {
            str2 = null;
        } else {
            str2 = curUser.getSignature();
        }
        if (!TextUtils.equals(str, str2)) {
            String replace = new C89350l("\n+").replace(str, "\n");
            if (replace == null) {
                C89219l.m154715b();
            }
            int length = replace.length() - 1;
            if (length >= 0 && replace.charAt(length) == '\n') {
                replace = replace.substring(0, length);
                C89219l.m154716b(replace, "");
            }
            m116610x().mo103296c(replace);
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61023a(User user, int i) {
        String str;
        if (i == 0) {
            mo104218w();
        } else if (i == 2) {
            AbstractC64907d dVar = (AbstractC64907d) C12801d.m23028e(this, C89204ab.m154669a(AbstractC64907d.class));
            if (dVar != null) {
                if (user != null) {
                    str = user.getSignature();
                } else {
                    str = null;
                }
                dVar.mo104258a(str);
            }
            mo104218w();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63860x
    /* renamed from: a */
    public final void mo61024a(Exception exc, int i) {
        if (i == 4) {
            C64772b bVar = new C64772b(exc, i);
            Class<C64770a> cls = C64770a.class;
            Class<?>[] interfaces = cls.getInterfaces();
            C89219l.m154709a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (AbstractC12799b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C89219l.m154709a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (AbstractC12799b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    C12753e eVar = bD_().f30985g;
                    Object f = C89070n.m154579f((List) arrayList2);
                    if (f != null) {
                        eVar.mo20613a((Class) f, bVar);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
