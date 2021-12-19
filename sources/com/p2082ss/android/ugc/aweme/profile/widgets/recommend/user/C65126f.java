package com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.AbstractC12766p;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c;
import com.p2082ss.android.ugc.aweme.following.p3003ui.FollowRelationTabActivity;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56196c;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63748i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.View$OnClickListenerC64123cs;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64363i;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f */
public final class C65126f extends AbstractC65120a implements AbstractC65121b, AbstractC90252i, AbstractC90253j {

    /* renamed from: o */
    public static final C65135i f147006o = new C65135i((byte) 0);

    /* renamed from: j */
    public RecommendCommonUserViewMus f147007j;

    /* renamed from: k */
    public View f147008k;

    /* renamed from: l */
    public TuxIconView f147009l;

    /* renamed from: m */
    public float f147010m;

    /* renamed from: n */
    public View f147011n;

    /* renamed from: p */
    private final C12814b f147012p;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$b */
    public static final class C65128b extends AbstractC89220m implements AbstractC89172b<C65125e, C65125e> {
        public static final C65128b INSTANCE = new C65128b();

        static {
            Covode.recordClassIndex(76597);
        }

        public C65128b() {
            super(1);
        }

        public final C65125e invoke(C65125e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(76595);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(63, new RunnableC90250g(C65126f.class, "onRefreshMessageButton", C56196c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: v */
    public final UserProfileRecommendUserVM mo104335v() {
        return (UserProfileRecommendUserVM) this.f147012p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$d */
    public static final class C65130d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147014a;

        static {
            Covode.recordClassIndex(76599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65130d(AbstractC12748a aVar) {
            super(0);
            this.f147014a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f147014a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$i */
    public static final class C65135i {
        static {
            Covode.recordClassIndex(76604);
        }

        private C65135i() {
        }

        public /* synthetic */ C65135i(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$c */
    public static final class C65129c extends AbstractC89220m implements AbstractC89171a<C12874b<C65125e>> {
        public static final C65129c INSTANCE = new C65129c();

        static {
            Covode.recordClassIndex(76598);
        }

        public C65129c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C65125e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$e */
    public static final class C65131e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147015a;

        static {
            Covode.recordClassIndex(76600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65131e(AbstractC12748a aVar) {
            super(0);
            this.f147015a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f147015a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$f */
    public static final class C65132f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147016a;

        static {
            Covode.recordClassIndex(76601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65132f(AbstractC12748a aVar) {
            super(0);
            this.f147016a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f147016a.mo20598q();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.AbstractC65121b
    /* renamed from: a */
    public final void mo104326a() {
        mo104335v().mo104323k();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.AbstractC65121b
    /* renamed from: b */
    public final void mo104328b() {
        mo104335v().f146941l = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$g */
    public static final class C65133g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147017a;

        static {
            Covode.recordClassIndex(76602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65133g(AbstractC12748a aVar) {
            super(0);
            this.f147017a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f147017a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$h */
    public static final class C65134h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f147018a;

        static {
            Covode.recordClassIndex(76603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65134h(AbstractC12748a aVar) {
            super(0);
            this.f147018a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f147018a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$j */
    static final class RunnableC65136j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C65126f f147019a;

        static {
            Covode.recordClassIndex(76605);
        }

        RunnableC65136j(C65126f fVar) {
            this.f147019a = fVar;
        }

        public final void run() {
            float f;
            C65126f fVar = this.f147019a;
            View view = fVar.f147011n;
            if (view != null) {
                f = (float) view.getHeight();
            } else {
                f = 0.0f;
            }
            fVar.f147010m = f;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.AbstractC65120a, com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: p */
    public final void mo20527p() {
        super.mo20527p();
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$a */
    public static final class C65127a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f147013a;

        static {
            Covode.recordClassIndex(76596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65127a(AbstractC89277c cVar) {
            super(0);
            this.f147013a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f147013a).getName();
        }
    }

    /* renamed from: w */
    public final void mo104336w() {
        RecommendCommonUserViewMus recommendCommonUserViewMus = this.f147007j;
        if (recommendCommonUserViewMus != null) {
            recommendCommonUserViewMus.getAdapter().mo67810f();
        }
        mo104335v().mo104325m();
        mo104335v().mo20662a(UserProfileRecommendUserVM.C65088b.f146944a);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$q */
    public static final class C65145q implements RecommendCommonUserViewMus.AbstractC63956b {

        /* renamed from: a */
        final /* synthetic */ C65126f f147030a;

        static {
            Covode.recordClassIndex(76614);
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.RecommendCommonUserViewMus.AbstractC63956b
        /* renamed from: a */
        public final void mo103534a() {
            User user;
            Context az_ = this.f147030a.az_();
            if (az_ != null) {
                C64615i iVar = (C64615i) C12801d.m23029f(this.f147030a, C89204ab.m154669a(AbstractC64616j.class));
                if (iVar != null) {
                    user = iVar.f146329a;
                } else {
                    user = null;
                }
                FollowRelationTabActivity.C51138c.m95552a(az_, user, "suggest_user");
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65145q(C65126f fVar) {
            this.f147030a = fVar;
        }
    }

    public C65126f() {
        AbstractC89277c a = C89204ab.m154669a(UserProfileRecommendUserVM.class);
        this.f147012p = new C12814b(a, new C65127a(a), C65129c.INSTANCE, new C65130d(this), new C65131e(this), new C65132f(this), C65128b.INSTANCE, new C65133g(this), new C65134h(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$s */
    public static final class C65147s implements C64363i.AbstractC64365b {

        /* renamed from: a */
        final /* synthetic */ C65126f f147032a;

        static {
            Covode.recordClassIndex(76616);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65147s(C65126f fVar) {
            this.f147032a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64363i.AbstractC64365b
        /* renamed from: b */
        public final void mo103924b(User user) {
            C89219l.m154721d(user, "");
            this.f147032a.mo104335v().mo104325m();
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64363i.AbstractC64365b
        /* renamed from: c */
        public final void mo103925c(User user) {
            C89219l.m154721d(user, "");
            UserProfileRecommendUserVM v = this.f147032a.mo104335v();
            int followStatus = user.getFollowStatus();
            C89219l.m154721d(user, "");
            v.mo20667b(new UserProfileRecommendUserVM.C65098g(v, followStatus, user));
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64363i.AbstractC64365b
        /* renamed from: d */
        public final void mo103926d(User user) {
            C89219l.m154721d(user, "");
            UserProfileRecommendUserVM v = this.f147032a.mo104335v();
            C89219l.m154721d(user, "");
            v.mo20667b(new UserProfileRecommendUserVM.C65097f(v, user));
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64363i.AbstractC64365b
        /* renamed from: a */
        public final void mo103923a(User user) {
            String str;
            C89219l.m154721d(user, "");
            UserProfileRecommendUserVM v = this.f147032a.mo104335v();
            if (user != null) {
                C64207ac acVar = (C64207ac) C12801d.m23016a(v, C89204ab.m154669a(AbstractC64206ab.class));
                if (acVar != null) {
                    str = acVar.f145626a;
                } else {
                    str = null;
                }
                C66652b bVar = C66652b.f149825a;
                String uid = user.getUid();
                C89219l.m154716b(uid, "");
                bVar.mo105655a(uid, user.getSecUid());
                v.mo20662a(new UserProfileRecommendUserVM.C65114m(user, str));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$l */
    static final class View$OnClickListenerC65139l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65126f f147022a;

        static {
            Covode.recordClassIndex(76608);
        }

        View$OnClickListenerC65139l(C65126f fVar) {
            this.f147022a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147022a.mo104335v().mo104323k();
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C56196c cVar) {
        C89219l.m154721d(cVar, "");
        RecommendCommonUserViewMus recommendCommonUserViewMus = this.f147007j;
        if (recommendCommonUserViewMus != null) {
            recommendCommonUserViewMus.f145023e.notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$m */
    static final class C65140m extends AbstractC89220m implements AbstractC89172b<RecommendList, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65126f f147023a;

        static {
            Covode.recordClassIndex(76609);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65140m(C65126f fVar) {
            super(1);
            this.f147023a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(RecommendList recommendList) {
            final String str;
            final RecommendList recommendList2 = recommendList;
            if (this.f147023a.f147007j != null) {
                C64207ac acVar = (C64207ac) C12801d.m23029f(this.f147023a, C89204ab.m154669a(AbstractC64206ab.class));
                if (acVar != null) {
                    str = acVar.f145626a;
                } else {
                    str = null;
                }
                C65126f.m22977a(this.f147023a.mo104335v(), new AbstractC89172b<C65125e, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65126f.C65140m.C651411 */

                    /* renamed from: a */
                    final /* synthetic */ C65140m f147024a;

                    static {
                        Covode.recordClassIndex(76610);
                    }

                    {
                        this.f147024a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(C65125e eVar) {
                        List<User> list;
                        C65125e eVar2 = eVar;
                        C89219l.m154721d(eVar2, "");
                        boolean z = !eVar2.f147003e;
                        RecommendCommonUserViewMus recommendCommonUserViewMus = this.f147024a.f147023a.f147007j;
                        if (recommendCommonUserViewMus != null) {
                            RecommendList recommendList = recommendList2;
                            String str = null;
                            if (recommendList != null) {
                                list = recommendList.getUserList();
                            } else {
                                list = null;
                            }
                            RecommendList recommendList2 = recommendList2;
                            if (recommendList2 != null) {
                                str = recommendList2.getRid();
                            }
                            recommendCommonUserViewMus.mo103516a(list, str, str, z);
                        }
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$r */
    static final class C65146r<T extends RecyclerView.ViewHolder> implements AbstractC39097c {

        /* renamed from: a */
        final /* synthetic */ C65126f f147031a;

        static {
            Covode.recordClassIndex(76615);
        }

        C65146r(C65126f fVar) {
            this.f147031a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2632d.AbstractC39097c
        /* renamed from: a */
        public final /* synthetic */ void mo67855a(RecyclerView.ViewHolder viewHolder) {
            View$OnClickListenerC64123cs csVar = (View$OnClickListenerC64123cs) viewHolder;
            if (csVar != null) {
                User user = csVar.f145469e;
                if (user == null) {
                    C89219l.m154710a("mUser");
                    return;
                }
                UserProfileRecommendUserVM v = this.f147031a.mo104335v();
                C89219l.m154721d(user, "");
                v.mo20667b(new UserProfileRecommendUserVM.C65102j(v, user));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$k */
    static final class C65137k extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65126f f147020a;

        static {
            Covode.recordClassIndex(76606);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65137k(C65126f fVar) {
            super(1);
            this.f147020a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C65125e eVar) {
            ViewGroup.LayoutParams layoutParams;
            C65125e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            if (eVar2.f147004f != 2) {
                this.f147020a.mo104335v();
                if (UserProfileRecommendUserVM.m116813j() && this.f147020a.f147011n != null) {
                    View view = this.f147020a.f147011n;
                    if (view != null) {
                        view.post(new Runnable(this) {
                            /* class com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65126f.C65137k.RunnableC651381 */

                            /* renamed from: a */
                            final /* synthetic */ C65137k f147021a;

                            static {
                                Covode.recordClassIndex(76607);
                            }

                            {
                                this.f147021a = r1;
                            }

                            public final void run() {
                                float f;
                                if (this.f147021a.f147020a.f147011n != null) {
                                    C65126f fVar = this.f147021a.f147020a;
                                    View view = this.f147021a.f147020a.f147011n;
                                    if (view != null) {
                                        f = (float) view.getHeight();
                                    } else {
                                        f = 0.0f;
                                    }
                                    fVar.f147010m = f;
                                }
                            }
                        });
                    }
                    View view2 = this.f147020a.f147011n;
                    if (view2 != null) {
                        layoutParams = view2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.height = -2;
                    View view3 = this.f147020a.f147011n;
                    if (view3 != null) {
                        view3.setLayoutParams(layoutParams2);
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$u */
    static final class C65149u extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65126f f147034a;

        static {
            Covode.recordClassIndex(76618);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65149u(C65126f fVar) {
            super(1);
            this.f147034a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            User user;
            if (aVar != null) {
                UserProfileRecommendUserVM v = this.f147034a.mo104335v();
                C64615i iVar = (C64615i) C12801d.m23029f(this.f147034a, C89204ab.m154669a(AbstractC64616j.class));
                if (iVar != null) {
                    user = iVar.f146329a;
                } else {
                    user = null;
                }
                v.f146940k = user;
                this.f147034a.mo104335v();
                if (UserProfileRecommendUserVM.m116813j()) {
                    TuxIconView tuxIconView = this.f147034a.f147009l;
                    if (tuxIconView != null) {
                        tuxIconView.setVisibility(0);
                    }
                    C65126f fVar = this.f147034a;
                    C65126f.m22977a(fVar.mo104335v(), new C65137k(fVar));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$w */
    public static final class C65151w implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C65126f f147038a;

        /* renamed from: b */
        final /* synthetic */ View f147039b;

        /* renamed from: c */
        final /* synthetic */ View f147040c;

        /* renamed from: d */
        final /* synthetic */ float f147041d;

        /* renamed from: e */
        final /* synthetic */ C89233z.C89235b f147042e;

        static {
            Covode.recordClassIndex(76620);
        }

        C65151w(C65126f fVar, View view, View view2, float f, C89233z.C89235b bVar) {
            this.f147038a = fVar;
            this.f147039b = view;
            this.f147040c = view2;
            this.f147041d = f;
            this.f147042e = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f147039b;
            View view2 = this.f147040c;
            float f = this.f147041d;
            float f2 = this.f147042e.element;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            layoutParams.height = (int) (((float) C89241a.m154730a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics()))) * floatValue);
            view.setLayoutParams(layoutParams);
            float f3 = 1.0f - floatValue;
            view2.setAlpha(f3);
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.height = (int) (f3 * f);
            view2.setLayoutParams(layoutParams3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.AbstractC65121b
    /* renamed from: a */
    public final void mo104327a(int i) {
        User user;
        UserProfileRecommendUserVM v = mo104335v();
        C64615i iVar = (C64615i) C12801d.m23016a(v, C89204ab.m154669a(AbstractC64616j.class));
        C64207ac acVar = (C64207ac) C12801d.m23016a(v, C89204ab.m154669a(AbstractC64206ab.class));
        String str = null;
        if (iVar != null) {
            user = iVar.f146329a;
        } else {
            user = null;
        }
        if ((!C80580in.m139685b(user, false) || C63748i.m115281b()) && UserProfileRecommendUserVM.m116813j()) {
            if (acVar != null) {
                str = acVar.f145627b;
            }
            if (TextUtils.isEmpty(str) || C63748i.m115282c()) {
                return;
            }
            if (UserProfileRecommendUserVM.m116813j() && i != 0) {
                v.mo104321a(false);
            } else if (UserProfileRecommendUserVM.m116813j() && i == 0) {
                v.mo104325m();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$n */
    static final class C65142n extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C65126f f147027a;

        static {
            Covode.recordClassIndex(76611);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65142n(C65126f fVar) {
            super(1);
            this.f147027a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            if (th2 instanceof Exception) {
                Context az_ = this.f147027a.az_();
                Exception exc = (Exception) th2;
                if (exc instanceof C34485a) {
                    C34485a aVar = (C34485a) exc;
                    if (aVar.getErrorCode() != 2155) {
                        int errorCode = aVar.getErrorCode();
                        if (errorCode == 1001) {
                            try {
                                new DialogC18267b.C18268a(az_).mo29156b(aVar.getErrorMsg()).mo29152a(R.string.dkh, 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0045: INVOKE  
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x0041: INVOKE  (r0v30 com.bytedance.ies.uikit.dialog.b$a) = 
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x0035: INVOKE  (r2v1 com.bytedance.ies.uikit.dialog.b$a) = 
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x002e: CONSTRUCTOR  (r1v7 com.bytedance.ies.uikit.dialog.b$a) = (r2v0 'az_' android.content.Context) call: com.bytedance.ies.uikit.dialog.b.a.<init>(android.content.Context):void type: CONSTRUCTOR)
                                      (wrap: java.lang.String : 0x0031: INVOKE  (r0v28 java.lang.String) = (r5v3 'aVar' com.ss.android.ugc.aweme.base.api.a.b.a) type: VIRTUAL call: com.ss.android.ugc.aweme.base.api.a.b.a.getErrorMsg():java.lang.String)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.b(java.lang.CharSequence):com.bytedance.ies.uikit.dialog.b$a)
                                      (wrap: int : ?: SGET   com.ss.android.ugc.trill.R.string.dkh int)
                                      (wrap: com.ss.android.ugc.aweme.account.api.a$1 : 0x003e: CONSTRUCTOR  (r0v29 com.ss.android.ugc.aweme.account.api.a$1) =  call: com.ss.android.ugc.aweme.account.api.a.1.<init>():void type: CONSTRUCTOR)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.a(int, android.content.DialogInterface$OnClickListener):com.bytedance.ies.uikit.dialog.b$a)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.c():com.bytedance.ies.uikit.dialog.b in method: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.n.invoke(java.lang.Throwable):h.z, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0041: INVOKE  (r0v30 com.bytedance.ies.uikit.dialog.b$a) = 
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x0035: INVOKE  (r2v1 com.bytedance.ies.uikit.dialog.b$a) = 
                                      (wrap: com.bytedance.ies.uikit.dialog.b$a : 0x002e: CONSTRUCTOR  (r1v7 com.bytedance.ies.uikit.dialog.b$a) = (r2v0 'az_' android.content.Context) call: com.bytedance.ies.uikit.dialog.b.a.<init>(android.content.Context):void type: CONSTRUCTOR)
                                      (wrap: java.lang.String : 0x0031: INVOKE  (r0v28 java.lang.String) = (r5v3 'aVar' com.ss.android.ugc.aweme.base.api.a.b.a) type: VIRTUAL call: com.ss.android.ugc.aweme.base.api.a.b.a.getErrorMsg():java.lang.String)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.b(java.lang.CharSequence):com.bytedance.ies.uikit.dialog.b$a)
                                      (wrap: int : ?: SGET   com.ss.android.ugc.trill.R.string.dkh int)
                                      (wrap: com.ss.android.ugc.aweme.account.api.a$1 : 0x003e: CONSTRUCTOR  (r0v29 com.ss.android.ugc.aweme.account.api.a$1) =  call: com.ss.android.ugc.aweme.account.api.a.1.<init>():void type: CONSTRUCTOR)
                                     type: VIRTUAL call: com.bytedance.ies.uikit.dialog.b.a.a(int, android.content.DialogInterface$OnClickListener):com.bytedance.ies.uikit.dialog.b$a in method: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.n.invoke(java.lang.Throwable):h.z, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                    	... 39 more
                                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x003e: CONSTRUCTOR  (r0v29 com.ss.android.ugc.aweme.account.api.a$1) =  call: com.ss.android.ugc.aweme.account.api.a.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f.n.invoke(java.lang.Throwable):h.z, file: classes2.dex
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 45 more
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.account.api.a, state: GENERATED_AND_UNLOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                    	... 51 more
                                    */
                                /*
                                // Method dump skipped, instructions count: 222
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65126f.C65142n.invoke(java.lang.Object):java.lang.Object");
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$v */
                        static final class C65150v extends AbstractC89220m implements AbstractC89172b<C65125e, C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ TuxIconView f147035a;

                            /* renamed from: b */
                            final /* synthetic */ C65126f f147036b;

                            /* renamed from: c */
                            final /* synthetic */ int f147037c;

                            static {
                                Covode.recordClassIndex(76619);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C65150v(TuxIconView tuxIconView, C65126f fVar, int i) {
                                super(1);
                                this.f147035a = tuxIconView;
                                this.f147036b = fVar;
                                this.f147037c = i;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
                            @Override // p4600h.p4611f.p4612a.AbstractC89172b
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final /* synthetic */ p4600h.C89391z invoke(com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65125e r8) {
                                /*
                                // Method dump skipped, instructions count: 215
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65126f.C65150v.invoke(java.lang.Object):java.lang.Object");
                            }
                        }

                        @Override // com.bytedance.assem.arch.core.AbstractC12766p
                        /* renamed from: b */
                        public final void mo20630b(View view) {
                            UserProfileRecommendUserVM userProfileRecommendUserVM;
                            int i;
                            C89219l.m154721d(view, "");
                            this.f147011n = view.findViewById(R.id.f_s);
                            this.f147008k = view.findViewById(R.id.ce6);
                            TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.dfq);
                            this.f147009l = tuxIconView;
                            if (tuxIconView != null) {
                                mo104335v();
                                if (UserProfileRecommendUserVM.m116813j()) {
                                    i = 0;
                                } else {
                                    i = 8;
                                }
                                tuxIconView.setVisibility(i);
                                tuxIconView.setOnClickListener(new View$OnClickListenerC65139l(this));
                            }
                            RecommendCommonUserViewMus recommendCommonUserViewMus = (RecommendCommonUserViewMus) view.findViewById(R.id.dfg);
                            this.f147007j = recommendCommonUserViewMus;
                            if (recommendCommonUserViewMus != null) {
                                recommendCommonUserViewMus.setSeeAllListener(new C65145q(this));
                            }
                            RecommendCommonUserViewMus recommendCommonUserViewMus2 = this.f147007j;
                            if (recommendCommonUserViewMus2 != null) {
                                recommendCommonUserViewMus2.setOnViewAttachedToWindowListener(new C65146r(this));
                            }
                            RecommendCommonUserViewMus recommendCommonUserViewMus3 = this.f147007j;
                            if (recommendCommonUserViewMus3 != null) {
                                recommendCommonUserViewMus3.setOnItemOperationListener(new C65147s(this));
                            }
                            C12801d.m23021a(this, C89204ab.m154669a(AbstractC64206ab.class), C65155j.f147046a, C65156k.f147047a, new C65148t(this));
                            C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C65157l.f147048a, new C65149u(this));
                            AssemViewModel.m23030a(mo104335v(), C65152g.f147043a, null, new C65142n(this), null, new C65140m(this), 10);
                            AbstractC12818f.C12819a.m23063a(this, mo104335v(), C65153h.f147044a, (C12854k) null, new C65143o(this), 6);
                            AbstractC12818f.C12819a.m23063a(this, mo104335v(), C65154i.f147045a, (C12854k) null, new C65144p(this), 6);
                            RecommendCommonUserViewMus recommendCommonUserViewMus4 = this.f147007j;
                            if (recommendCommonUserViewMus4 != null) {
                                recommendCommonUserViewMus4.setViewModel(mo104335v());
                            }
                            RecommendCommonUserViewMus recommendCommonUserViewMus5 = this.f147007j;
                            if (recommendCommonUserViewMus5 != null && (userProfileRecommendUserVM = recommendCommonUserViewMus5.f145027i) != null) {
                                C64363i iVar = recommendCommonUserViewMus5.f145023e;
                                C88411a aVar = userProfileRecommendUserVM.f146939j;
                                C89219l.m154721d(aVar, "");
                                iVar.f145934i = aVar;
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$p */
                        static final class C65144p extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ C65126f f147029a;

                            static {
                                Covode.recordClassIndex(76613);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C65144p(C65126f fVar) {
                                super(2);
                                this.f147029a = fVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
                                RecommendCommonUserViewMus recommendCommonUserViewMus;
                                int intValue = num.intValue();
                                C89219l.m154721d(pVar, "");
                                if (intValue > 0 && (recommendCommonUserViewMus = this.f147029a.f147007j) != null) {
                                    recommendCommonUserViewMus.mo103515a();
                                }
                                return C89391z.f203057a;
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$t */
                        static final class C65148t extends AbstractC89220m implements AbstractC89183m<C12776a<? extends C89391z>, C12776a<? extends C89391z>, C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ C65126f f147033a;

                            static {
                                Covode.recordClassIndex(76617);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C65148t(C65126f fVar) {
                                super(2);
                                this.f147033a = fVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final /* synthetic */ C89391z invoke(C12776a<? extends C89391z> aVar, C12776a<? extends C89391z> aVar2) {
                                ViewGroup.LayoutParams layoutParams;
                                if (aVar != null) {
                                    C65126f fVar = this.f147033a;
                                    fVar.f147010m = C13628n.m24520b(fVar.az_(), 20.0f);
                                    View view = fVar.f147011n;
                                    if (view != null) {
                                        view.post(new RunnableC65136j(fVar));
                                    }
                                    View view2 = fVar.f147011n;
                                    if (view2 != null) {
                                        layoutParams = view2.getLayoutParams();
                                    } else {
                                        layoutParams = null;
                                    }
                                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                    layoutParams2.height = -2;
                                    View view3 = fVar.f147011n;
                                    if (view3 != null) {
                                        view3.setLayoutParams(layoutParams2);
                                    }
                                    fVar.mo104336w();
                                }
                                if (aVar2 != null) {
                                    this.f147033a.mo104336w();
                                }
                                return C89391z.f203057a;
                            }
                        }

                        /* renamed from: com.ss.android.ugc.aweme.profile.widgets.recommend.user.f$o */
                        static final class C65143o extends AbstractC89220m implements AbstractC89183m<AbstractC12766p, Integer, C89391z> {

                            /* renamed from: a */
                            final /* synthetic */ C65126f f147028a;

                            static {
                                Covode.recordClassIndex(76612);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C65143o(C65126f fVar) {
                                super(2);
                                this.f147028a = fVar;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final /* synthetic */ C89391z invoke(AbstractC12766p pVar, Integer num) {
                                TuxIconView tuxIconView;
                                int intValue = num.intValue();
                                C89219l.m154721d(pVar, "");
                                C65126f fVar = this.f147028a;
                                fVar.mo104335v();
                                if (UserProfileRecommendUserVM.m116813j() && (tuxIconView = fVar.f147009l) != null) {
                                    if (intValue == 0) {
                                        tuxIconView.clearAnimation();
                                        tuxIconView.setIconRes(R.raw.icon_arrow_triangle_down_fill);
                                        tuxIconView.animate().rotation(360.0f).start();
                                        View view = fVar.f147008k;
                                        if (view != null) {
                                            view.setBackgroundResource(R.drawable.b7x);
                                        }
                                        fVar.mo104333a(false, (View) fVar.f147007j, fVar.f147011n, fVar.f147010m);
                                    } else if (intValue == 1) {
                                        tuxIconView.clearAnimation();
                                        tuxIconView.setIconRes(R.raw.icon_spinner_normal);
                                        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                                        rotateAnimation.setRepeatCount(-1);
                                        rotateAnimation.setRepeatMode(1);
                                        rotateAnimation.setDuration(600);
                                        tuxIconView.startAnimation(rotateAnimation);
                                        tuxIconView.setRotation(180.0f);
                                    } else if (intValue == 2) {
                                        C65126f.m22977a(fVar.mo104335v(), new C65150v(tuxIconView, fVar, intValue));
                                    } else if (intValue == 3) {
                                        tuxIconView.clearAnimation();
                                        tuxIconView.setIconRes(R.raw.icon_arrow_triangle_down_fill);
                                        View view2 = fVar.f147008k;
                                        if (view2 != null) {
                                            view2.setBackgroundResource(R.drawable.b7x);
                                        }
                                    }
                                }
                                return C89391z.f203057a;
                            }
                        }

                        /* renamed from: a */
                        public final void mo104333a(boolean z, View view, View view2, float f) {
                            ValueAnimator ofFloat;
                            if (view != null && view2 != null) {
                                if (z) {
                                    ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    C89219l.m154716b(ofFloat, "");
                                } else {
                                    ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                    C89219l.m154716b(ofFloat, "");
                                }
                                ofFloat.setDuration(300L);
                                C89233z.C89235b bVar = new C89233z.C89235b();
                                bVar.element = 0.0f;
                                if (view instanceof RecommendCommonUserViewMus) {
                                    bVar.element = ((RecommendCommonUserViewMus) view).getViewHeightFromInnerAdapter() + 72.0f;
                                }
                                ofFloat.addUpdateListener(new C65151w(this, view, view2, f, bVar));
                                ofFloat.start();
                            }
                        }
                    }
