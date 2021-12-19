package com.p2082ss.android.ugc.aweme.upvote.detail.cell;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.viewModel.AbstractC12848i;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.api.UpvoteApi;
import com.p2082ss.android.ugc.aweme.upvote.detail.cell.C79773a;
import com.p2082ss.android.ugc.aweme.upvote.detail.cell.C79776b;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.C79884l;
import com.p2082ss.android.ugc.aweme.upvote.detail.panel.UpvoteDetailPanelViewModel;
import com.p2082ss.android.ugc.aweme.upvote.event.C79899b;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79706b;
import com.p2082ss.android.ugc.aweme.upvote.p4189c.C79714h;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell */
public final class UpvoteDetailPanelListCell extends PowerCell<C79787d> implements View.OnClickListener {

    /* renamed from: a */
    public static final C79767o f178940a = new C79767o((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f178941b = C89250i.m154773a((AbstractC89171a) new C79770r(this));

    /* renamed from: j */
    private final AbstractC89244h f178942j = C89250i.m154773a((AbstractC89171a) new C79768p(this));

    /* renamed from: k */
    private final AbstractC89244h f178943k = C89250i.m154773a((AbstractC89171a) new C79769q(this));

    /* renamed from: l */
    private final C12814b f178944l;

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$g */
    public static final class C79759g extends AbstractC89220m implements AbstractC89172b<C79884l, C79884l> {
        public static final C79759g INSTANCE = new C79759g();

        static {
            Covode.recordClassIndex(92983);
        }

        public C79759g() {
            super(1);
        }

        public final C79884l invoke(C79884l lVar) {
            C89219l.m154719c(lVar, "");
            return lVar;
        }
    }

    static {
        Covode.recordClassIndex(92976);
    }

    /* renamed from: b */
    private final C79773a m138594b() {
        return (C79773a) this.f178942j.getValue();
    }

    /* renamed from: c */
    private final C79776b m138595c() {
        return (C79776b) this.f178943k.getValue();
    }

    /* renamed from: a */
    public final UpvoteDetailPanelViewModel mo123358a() {
        return (UpvoteDetailPanelViewModel) this.f178944l.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$o */
    public static final class C79767o {
        static {
            Covode.recordClassIndex(92991);
        }

        private C79767o() {
        }

        public /* synthetic */ C79767o(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$b */
    public static final class C79754b extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79754b INSTANCE = new C79754b();

        static {
            Covode.recordClassIndex(92978);
        }

        public C79754b() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$c */
    public static final class C79755c extends AbstractC89220m implements AbstractC89171a<C12874b<C79884l>> {
        public static final C79755c INSTANCE = new C79755c();

        static {
            Covode.recordClassIndex(92979);
        }

        public C79755c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C79884l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$h */
    public static final class C79760h extends AbstractC89220m implements AbstractC89171a<C12874b<C79884l>> {
        public static final C79760h INSTANCE = new C79760h();

        static {
            Covode.recordClassIndex(92984);
        }

        public C79760h() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C79884l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$k */
    public static final class C79763k extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79763k INSTANCE = new C79763k();

        static {
            Covode.recordClassIndex(92987);
        }

        public C79763k() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$l */
    public static final class C79764l extends AbstractC89220m implements AbstractC89171a<C12874b<C79884l>> {
        public static final C79764l INSTANCE = new C79764l();

        static {
            Covode.recordClassIndex(92988);
        }

        public C79764l() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C79884l> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$a */
    public static final class C79753a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f178945a;

        static {
            Covode.recordClassIndex(92977);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79753a(AbstractC89277c cVar) {
            super(0);
            this.f178945a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f178945a).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$r */
    static final class C79770r extends AbstractC89220m implements AbstractC89171a<C79781c> {

        /* renamed from: a */
        final /* synthetic */ UpvoteDetailPanelListCell f178955a;

        static {
            Covode.recordClassIndex(92994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79770r(UpvoteDetailPanelListCell upvoteDetailPanelListCell) {
            super(0);
            this.f178955a = upvoteDetailPanelListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C79781c invoke() {
            View view = this.f178955a.itemView;
            C89219l.m154716b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.b70);
            C89219l.m154716b(tuxTextView, "");
            return new C79781c(tuxTextView, this.f178955a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$d */
    public static final class C79756d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f178946a;

        static {
            Covode.recordClassIndex(92980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79756d(PowerCell powerCell) {
            super(0);
            this.f178946a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            if (this.f178946a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f178946a.mo28070i();
                if (i != null) {
                    return (AbstractC12748a) i;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$e */
    public static final class C79757e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f178947a;

        static {
            Covode.recordClassIndex(92981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79757e(PowerCell powerCell) {
            super(0);
            this.f178947a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            if (this.f178947a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f178947a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).getViewModelStore();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$f */
    public static final class C79758f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f178948a;

        static {
            Covode.recordClassIndex(92982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79758f(PowerCell powerCell) {
            super(0);
            this.f178948a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            if (this.f178948a.mo28070i() instanceof AbstractC12748a) {
                AbstractC1204m i = this.f178948a.mo28070i();
                if (i != null) {
                    return ((AbstractC12748a) i).mo20598q();
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$p */
    static final class C79768p extends AbstractC89220m implements AbstractC89171a<C79773a> {

        /* renamed from: a */
        final /* synthetic */ UpvoteDetailPanelListCell f178953a;

        static {
            Covode.recordClassIndex(92992);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79768p(UpvoteDetailPanelListCell upvoteDetailPanelListCell) {
            super(0);
            this.f178953a = upvoteDetailPanelListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C79773a invoke() {
            View view = this.f178953a.itemView;
            C89219l.m154716b(view, "");
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.a_w);
            C89219l.m154716b(tuxTextView, "");
            return new C79773a(tuxTextView, this.f178953a.mo123358a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$q */
    static final class C79769q extends AbstractC89220m implements AbstractC89171a<C79776b> {

        /* renamed from: a */
        final /* synthetic */ UpvoteDetailPanelListCell f178954a;

        static {
            Covode.recordClassIndex(92993);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79769q(UpvoteDetailPanelListCell upvoteDetailPanelListCell) {
            super(0);
            this.f178954a = upvoteDetailPanelListCell;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C79776b invoke() {
            View view = this.f178954a.itemView;
            C89219l.m154716b(view, "");
            View findViewById = view.findViewById(R.id.ccx);
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.view.ViewGroup");
            return new C79776b((ViewGroup) findViewById, this.f178954a.mo123358a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$t */
    static final class RunnableC79772t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UpvoteDetailPanelListCell f178958a;

        /* renamed from: b */
        final /* synthetic */ Resources f178959b;

        static {
            Covode.recordClassIndex(92996);
        }

        RunnableC79772t(UpvoteDetailPanelListCell upvoteDetailPanelListCell, Resources resources) {
            this.f178958a = upvoteDetailPanelListCell;
            this.f178959b = resources;
        }

        public final void run() {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f178958a.itemView, "backgroundColor", this.f178959b.getColor(R.color.v), this.f178959b.getColor(R.color.c9));
            ofInt.setDuration(3000L);
            ofInt.setEvaluator(new ArgbEvaluator());
            ofInt.start();
            C79787d dVar = (C79787d) this.f178958a.f42160d;
            if (dVar != null) {
                dVar.f178998c = false;
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: l */
    public final void mo28073l() {
        super.mo28073l();
        C79787d dVar = (C79787d) this.f42160d;
        if (dVar != null && dVar.f178998c) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            this.itemView.postDelayed(new RunnableC79772t(this, view.getResources()), 150);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$i */
    public static final class C79761i extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f178949a;

        static {
            Covode.recordClassIndex(92985);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79761i(PowerCell powerCell) {
            super(0);
            this.f178949a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            View view = this.f178949a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f178949a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    return (ActivityC0945e) context2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (context instanceof ContextWrapper) {
                View view3 = this.f178949a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        return (ActivityC0945e) baseContext;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f178949a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$j */
    public static final class C79762j extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f178950a;

        static {
            Covode.recordClassIndex(92986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79762j(PowerCell powerCell) {
            super(0);
            this.f178950a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            ActivityC0945e eVar;
            View view = this.f178950a.itemView;
            C89219l.m154709a((Object) view, "");
            Context context = view.getContext();
            if (context instanceof ActivityC0945e) {
                View view2 = this.f178950a.itemView;
                C89219l.m154709a((Object) view2, "");
                Context context2 = view2.getContext();
                if (context2 != null) {
                    eVar = (ActivityC0945e) context2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (context instanceof ContextThemeWrapper) {
                View view3 = this.f178950a.itemView;
                C89219l.m154709a((Object) view3, "");
                Context context3 = view3.getContext();
                if (context3 != null) {
                    Context baseContext = ((ContextThemeWrapper) context3).getBaseContext();
                    if (baseContext != null) {
                        eVar = (ActivityC0945e) baseContext;
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                StringBuilder sb = new StringBuilder("can not convert ");
                View view4 = this.f178950a.itemView;
                C89219l.m154709a((Object) view4, "");
                throw new IllegalStateException(sb.append(view4.getContext()).append(" to activity.").toString());
            }
            C1182af viewModelStore = eVar.getViewModelStore();
            C89219l.m154709a((Object) viewModelStore, "");
            return viewModelStore;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$m */
    public static final class C79765m extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f178951a;

        static {
            Covode.recordClassIndex(92989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79765m(PowerCell powerCell) {
            super(0);
            this.f178951a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            AbstractC1204m i = this.f178951a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f178951a.mo28070i();
                if (i2 != null) {
                    return (Fragment) i2;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f178951a.mo28070i();
                if (i3 != null) {
                    Fragment a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                    if (a != null) {
                        return a;
                    }
                    throw new IllegalStateException("can not find fragment.");
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$n */
    public static final class C79766n extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ PowerCell f178952a;

        static {
            Covode.recordClassIndex(92990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79766n(PowerCell powerCell) {
            super(0);
            this.f178952a = powerCell;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            Fragment a;
            C1182af viewModelStore;
            AbstractC1204m i = this.f178952a.mo28070i();
            if (i instanceof Fragment) {
                AbstractC1204m i2 = this.f178952a.mo28070i();
                if (i2 != null) {
                    a = (Fragment) i2;
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else if (i instanceof AbstractC12748a) {
                AbstractC1204m i3 = this.f178952a.mo28070i();
                if (i3 != null) {
                    a = C12777b.m22999a((AbstractC1204m) ((AbstractC12748a) i3));
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            } else {
                throw new IllegalStateException("can not find fragment.");
            }
            if (a != null && (viewModelStore = a.getViewModelStore()) != null) {
                return viewModelStore;
            }
            throw new IllegalStateException("can not get viewModelStore due to null fragment.");
        }
    }

    public UpvoteDetailPanelListCell() {
        C12814b bVar;
        AbstractC12848i.C12852d dVar = AbstractC12848i.C12852d.f31278a;
        AbstractC89277c a = C89204ab.m154669a(UpvoteDetailPanelViewModel.class);
        C79753a aVar = new C79753a(a);
        C79759g gVar = C79759g.INSTANCE;
        if (C89219l.m154714a(dVar, AbstractC12848i.C12849a.f31275a)) {
            bVar = new C12814b(a, aVar, C79760h.INSTANCE, new C79761i(this), new C79762j(this), C79763k.INSTANCE, gVar);
        } else if (C89219l.m154714a(dVar, AbstractC12848i.C12852d.f31278a)) {
            bVar = new C12814b(a, aVar, C79764l.INSTANCE, new C79765m(this), new C79766n(this), C79754b.INSTANCE, gVar);
        } else if (dVar == null || C89219l.m154714a(dVar, AbstractC12848i.C12850b.f31276a)) {
            bVar = new C12814b(a, aVar, C79755c.INSTANCE, new C79756d(this), new C79757e(this), new C79758f(this), gVar);
        } else {
            throw new IllegalArgumentException("Don't support this VMScope: " + dVar + " there");
        }
        this.f178944l = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell$s */
    static final class C79771s extends AbstractC89220m implements AbstractC89172b<View, C89391z> {

        /* renamed from: a */
        final /* synthetic */ UpvoteDetailPanelListCell f178956a;

        /* renamed from: b */
        final /* synthetic */ C79714h f178957b;

        static {
            Covode.recordClassIndex(92995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79771s(UpvoteDetailPanelListCell upvoteDetailPanelListCell, C79714h hVar) {
            super(1);
            this.f178956a = upvoteDetailPanelListCell;
            this.f178957b = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
            if (r8 == null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
            r8 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
            if (r3 == null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
            r9 = r3.f179147c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            if (r9 != null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
            r9 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r3 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r0 = r3.f179149e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r0 != null) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            com.p2082ss.android.ugc.aweme.upvote.publish.C79981c.m138709a(r2, r1, new com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam(r6, "long_press", r8, r9, r10), null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
            return p4600h.C89391z.f203057a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
            r10 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
            if (r3 != null) goto L_0x002b;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(android.view.View r12) {
            /*
                r11 = this;
                java.lang.String r10 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r12, r10)
                com.ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell r0 = r11.f178956a
                T extends com.bytedance.ies.powerlist.b.a r0 = r0.f42160d
                com.ss.android.ugc.aweme.upvote.detail.cell.d r0 = (com.p2082ss.android.ugc.aweme.upvote.detail.cell.C79787d) r0
                r4 = 0
                if (r0 == 0) goto L_0x004a
                com.ss.android.ugc.aweme.upvote.event.b r3 = r0.f178997b
            L_0x0010:
                com.ss.android.ugc.aweme.upvote.c.h r0 = r11.f178957b
                java.lang.String r2 = r0.getItemId()
                com.ss.android.ugc.aweme.upvote.c.h r0 = r11.f178957b
                java.lang.String r0 = r0.getText()
                boolean r1 = com.p2082ss.android.ugc.aweme.utils.C80537hk.m139613a(r0)
                com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam r5 = new com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam
                if (r3 == 0) goto L_0x0028
                java.lang.String r6 = r3.f179145a
                if (r6 != 0) goto L_0x002b
            L_0x0028:
                r6 = r10
                if (r3 == 0) goto L_0x002f
            L_0x002b:
                java.lang.String r8 = r3.f179146b
                if (r8 != 0) goto L_0x0032
            L_0x002f:
                r8 = r10
                if (r3 == 0) goto L_0x0036
            L_0x0032:
                java.lang.String r9 = r3.f179147c
                if (r9 != 0) goto L_0x0039
            L_0x0036:
                r9 = r10
                if (r3 == 0) goto L_0x003d
            L_0x0039:
                java.lang.String r0 = r3.f179149e
                if (r0 != 0) goto L_0x0048
            L_0x003d:
                java.lang.String r7 = "long_press"
                r5.<init>(r6, r7, r8, r9, r10)
                com.p2082ss.android.ugc.aweme.upvote.publish.C79981c.m138709a(r2, r1, r5, r4)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0048:
                r10 = r0
                goto L_0x003d
            L_0x004a:
                r3 = r4
                goto L_0x0010
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.upvote.detail.cell.UpvoteDetailPanelListCell.C79771s.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    private final void m138593a(boolean z) {
        User user;
        String str;
        Integer num;
        String str2;
        C79899b bVar;
        C79714h hVar;
        C79787d dVar = (C79787d) this.f42160d;
        String str3 = null;
        if (dVar == null || (hVar = dVar.f178996a) == null) {
            user = null;
        } else {
            user = hVar.getUser();
        }
        C89378p[] pVarArr = new C89378p[4];
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        pVarArr[0] = C89387v.m154943a(str, "to_user_id");
        if (user != null) {
            num = Integer.valueOf(user.getFollowStatus());
        } else {
            num = null;
        }
        pVarArr[1] = C89387v.m154943a(num, "follow_status");
        C79787d dVar2 = (C79787d) this.f42160d;
        if (!(dVar2 == null || (bVar = dVar2.f178997b) == null)) {
            str3 = bVar.f179145a;
        }
        pVarArr[2] = C89387v.m154943a(str3, "enter_from");
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        pVarArr[3] = C89387v.m154943a(str2, "is_self");
        C39162r.m79462a("click_recommendation", pVarArr);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final View mo23349a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.bhc, viewGroup, false);
        C89219l.m154716b(a, "");
        ((AvatarImageView) a.findViewById(R.id.on)).setOnClickListener(this);
        ((TuxTextView) a.findViewById(R.id.cpq)).setOnClickListener(this);
        a.findViewById(R.id.al9).setOnClickListener(this);
        a.setOnClickListener(this);
        C89219l.m154716b(a, "");
        return a;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: a */
    public final /* synthetic */ void mo23350a(C79787d dVar) {
        String str;
        C79899b bVar;
        UrlModel avatarThumb;
        C79787d dVar2 = dVar;
        C89219l.m154721d(dVar2, "");
        C79714h hVar = dVar2.f178996a;
        User user = hVar.getUser();
        if (user == null || (avatarThumb = user.getAvatarThumb()) == null) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            ((SimpleDraweeView) view.findViewById(R.id.on)).setActualImageResource(R.raw.icon_color_default_avatar);
        } else {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            C34577e.m70592a((RemoteImageView) view2.findViewById(R.id.on), avatarThumb);
        }
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        TuxTextView tuxTextView = (TuxTextView) view3.findViewById(R.id.cpq);
        C89219l.m154716b(tuxTextView, "");
        if (user == null || (str = C80580in.m139677a(user, false)) == null) {
            str = "";
        }
        tuxTextView.setText(str);
        if (user != null) {
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            Context context = view4.getContext();
            String customVerify = user.getCustomVerify();
            String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
            View view5 = this.itemView;
            C89219l.m154716b(view5, "");
            C80581io.m139704a(context, customVerify, enterpriseVerifyReason, (TextView) view5.findViewById(R.id.cpq));
        }
        C79781c cVar = (C79781c) this.f178941b.getValue();
        C79787d dVar3 = (C79787d) this.f42160d;
        C79899b bVar2 = null;
        if (dVar3 != null) {
            bVar = dVar3.f178997b;
        } else {
            bVar = null;
        }
        int bindingAdapterPosition = getBindingAdapterPosition();
        cVar.f178985b = user;
        cVar.f178986c = bVar;
        cVar.f178987d = bindingAdapterPosition;
        cVar.mo123365a().mo142944a();
        cVar.f178988e = false;
        if (user != null) {
            ((C51086a) cVar.f178984a.getValue()).mo86508a(user);
        }
        C79773a b = m138594b();
        C89219l.m154721d(hVar, "");
        b.f178960a = hVar;
        b.mo123362a(hVar.getText(), hVar.getCreateTime());
        UpvoteDetailPanelViewModel upvoteDetailPanelViewModel = b.f178962c;
        String commentId = hVar.getCommentId();
        C89219l.m154721d(commentId, "");
        C89219l.m154721d(b, "");
        UpvoteDetailPanelViewModel.C79796a aVar = upvoteDetailPanelViewModel.mo23343h().get(commentId);
        if (aVar != null && aVar.f179016a) {
            b.mo85296a(aVar.f179017b);
        }
        C79776b c = m138595c();
        C79787d dVar4 = (C79787d) this.f42160d;
        if (dVar4 != null) {
            bVar2 = dVar4.f178997b;
        }
        C89219l.m154721d(hVar, "");
        c.f178974d = user;
        c.f178975e = bVar2;
        if (hVar.isFake()) {
            c.f178976f.setVisibility(8);
            return;
        }
        c.f178976f.setVisibility(0);
        c.mo123363a(hVar.getUserLiked(), hVar.getLikeCount());
    }

    public final void onClick(View view) {
        C79787d dVar;
        C79714h hVar;
        User user;
        String str;
        C79714h hVar2;
        C79899b bVar;
        AbstractC0952i supportFragmentManager;
        int i;
        String uid;
        String str2;
        Integer num;
        ClickAgent.onClick(view);
        if (view != null && (dVar = (C79787d) this.f42160d) != null && (hVar = dVar.f178996a) != null && !hVar.isOperationDisable() && (user = hVar.getUser()) != null && !C58001a.m104815a(view, 1200)) {
            int id = view.getId();
            User user2 = null;
            String str3 = null;
            ActivityC0945e eVar = null;
            user2 = null;
            int i2 = 0;
            int i3 = 1;
            String str4 = "";
            if (id == R.id.on || id == R.id.cpq) {
                C79787d dVar2 = (C79787d) this.f42160d;
                if (dVar2 == null || (bVar = dVar2.f178997b) == null || (str = bVar.f179145a) == null) {
                    str = str4;
                }
                C79787d dVar3 = (C79787d) this.f42160d;
                if (!(dVar3 == null || (hVar2 = dVar3.f178996a) == null)) {
                    user2 = hVar2.getUser();
                }
                C59252q o = new C59252q().mo96825o(str);
                if (user2 != null) {
                    i2 = user2.getFollowStatus();
                }
                o.f135222V = i2;
                o.mo96786a("sub_page", "recommend_panel").mo96785a("rank", getBindingAdapterPosition() + 1).mo96792f();
                View view2 = this.itemView;
                C89219l.m154716b(view2, str4);
                SmartRouter.buildRoute(view2.getContext(), "//user/profile").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).open();
            } else if (id == R.id.al9) {
                C79776b c = m138595c();
                C89219l.m154721d(hVar, str4);
                c.f178971a.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new C79776b.RunnableC79778b(c)).start();
                C89378p[] pVarArr = new C89378p[3];
                User user3 = c.f178974d;
                if (user3 != null) {
                    str2 = user3.getUid();
                } else {
                    str2 = null;
                }
                pVarArr[0] = C89387v.m154943a(str2, "to_user_id");
                User user4 = c.f178974d;
                if (user4 != null) {
                    num = Integer.valueOf(user4.getFollowStatus());
                } else {
                    num = null;
                }
                pVarArr[1] = C89387v.m154943a(num, "follow_status");
                C79899b bVar2 = c.f178975e;
                if (bVar2 != null) {
                    str3 = bVar2.f179145a;
                }
                C89378p a = C89387v.m154943a(str3, "enter_from");
                int i4 = 2;
                pVarArr[2] = a;
                C39162r.m79462a("like_recommendation", pVarArr);
                Context context = c.f178971a.getContext();
                C89219l.m154716b(context, str4);
                if (!C80422fe.m139425a(context)) {
                    new C79459a(c.f178971a.getContext()).mo123050a(R.string.dcq).mo123053a();
                    return;
                }
                UpvoteDetailPanelViewModel upvoteDetailPanelViewModel = c.f178977g;
                boolean z = !c.f178972b;
                C79776b.C79780d dVar4 = new C79776b.C79780d(c);
                C89219l.m154721d(hVar, str4);
                C89219l.m154721d(dVar4, str4);
                String commentId = hVar.getCommentId();
                if (!upvoteDetailPanelViewModel.mo123375i().contains(commentId)) {
                    upvoteDetailPanelViewModel.mo123375i().add(commentId);
                    if (z) {
                        i4 = 1;
                    }
                    AbstractC88412b a2 = UpvoteApi.f178837a.digg(commentId, hVar.getItemId(), i4).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new UpvoteDetailPanelViewModel.C79797b(upvoteDetailPanelViewModel, commentId, hVar, z), new UpvoteDetailPanelViewModel.C79798c(upvoteDetailPanelViewModel, commentId, dVar4));
                    C89219l.m154716b(a2, str4);
                    C88934a.m154195a(a2, upvoteDetailPanelViewModel.mo23342g());
                    boolean z2 = !c.f178972b;
                    int i5 = c.f178973c;
                    if (c.f178972b) {
                        i3 = -1;
                    }
                    c.mo123363a(z2, i5 + i3);
                }
            } else {
                View view3 = this.itemView;
                C89219l.m154716b(view3, str4);
                Context context2 = view3.getContext();
                if (context2 instanceof ActivityC0218d) {
                    eVar = context2;
                }
                ActivityC0945e eVar2 = eVar;
                if (eVar2 != null && (supportFragmentManager = eVar2.getSupportFragmentManager()) != null) {
                    ArrayList arrayList = new ArrayList();
                    if (C80580in.m139694g(hVar.getUser())) {
                        m138593a(true);
                        C23208a.C23209a b = new C23208a.C23214e().mo37789b(1);
                        String b2 = C34722h.m70923b(((Number) C79706b.m138537a(Integer.valueOf((int) R.string.f65), Integer.valueOf((int) R.string.faj))).intValue());
                        C89219l.m154716b(b2, str4);
                        arrayList.add(b.mo37788a(b2).mo37787a(new C79771s(this, hVar)));
                    } else {
                        m138593a(false);
                        C79773a b3 = m138594b();
                        C89219l.m154721d(arrayList, str4);
                        C89219l.m154721d(hVar, str4);
                        String text = hVar.getText();
                        if (!(text == null || text.length() == 0)) {
                            boolean a3 = b3.f178962c.mo123374a(hVar.getCommentId());
                            User user5 = hVar.getUser();
                            if (!(user5 == null || (uid = user5.getUid()) == null)) {
                                str4 = uid;
                            }
                            C23208a.C23214e eVar3 = new C23208a.C23214e();
                            if (a3) {
                                i = R.string.fhg;
                            } else {
                                i = R.string.gh6;
                            }
                            arrayList.add(eVar3.mo37785a(i).mo37787a(new C79773a.C79774a(b3, a3, hVar, str4)));
                            arrayList.add(new C23208a.C23214e().mo37785a(R.string.fa_).mo37787a(new C79773a.C79775b(b3, hVar, str4)));
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        new C23208a.C23211b().mo37799b(arrayList).mo37800b().show(supportFragmentManager, "upvote_detail_panel_cell");
                    }
                }
            }
        }
    }
}
