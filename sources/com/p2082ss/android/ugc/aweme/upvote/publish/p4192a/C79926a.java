package com.p2082ss.android.ugc.aweme.upvote.publish.p4192a;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.extensions.C12793o;
import com.bytedance.assem.arch.extensions.C12794p;
import com.bytedance.assem.arch.extensions.C12795q;
import com.bytedance.assem.arch.extensions.C12796r;
import com.bytedance.assem.arch.viewModel.AbstractC12818f;
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.keyboard.AbstractC39142c;
import com.p2082ss.android.ugc.aweme.common.keyboard.C39141b;
import com.p2082ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39112b;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46595g;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46597h;
import com.p2082ss.android.ugc.aweme.emoji.sysemoji.C46605i;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.p2082ss.android.ugc.aweme.upvote.p4188b.C79705a;
import com.p2082ss.android.ugc.aweme.upvote.publish.C80022g;
import com.p2082ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.p2082ss.android.ugc.aweme.upvote.publish.p4192a.C79970e;
import com.p2082ss.android.ugc.aweme.upvote.wiget.InterceptEventLayout;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a */
public final class C79926a extends C39112b implements TextWatcher, AbstractC12846h, AbstractC39142c {

    /* renamed from: f */
    public static final C79940g f179194f = new C79940g((byte) 0);

    /* renamed from: a */
    public View f179195a;

    /* renamed from: b */
    public String f179196b;

    /* renamed from: c */
    public UpvotePublishMobParam f179197c;

    /* renamed from: d */
    public String f179198d;

    /* renamed from: e */
    public boolean f179199e;

    /* renamed from: g */
    private final AbstractC89244h f179200g = C89250i.m154773a((AbstractC89171a) new C79958x(this));

    /* renamed from: h */
    private final AbstractC89244h f179201h = C89250i.m154773a((AbstractC89171a) new C79941h(this));

    /* renamed from: i */
    private final AbstractC89244h f179202i = C89250i.m154773a((AbstractC89171a) new C79934ag(this));

    /* renamed from: j */
    private final AbstractC89244h f179203j = C89250i.m154773a((AbstractC89171a) new C79956v(this));

    /* renamed from: k */
    private final AbstractC89244h f179204k = C89250i.m154773a((AbstractC89171a) new C79946m(this));

    /* renamed from: l */
    private final AbstractC89244h f179205l = C89250i.m154773a((AbstractC89171a) new C79945l(this));

    /* renamed from: m */
    private final AbstractC89244h f179206m = C89250i.m154773a((AbstractC89171a) new C79947n(this));

    /* renamed from: n */
    private final AbstractC89244h f179207n = C89250i.m154773a((AbstractC89171a) new C79957w(this));

    /* renamed from: o */
    private final AbstractC89244h f179208o = C89250i.m154773a((AbstractC89171a) new C79933af(this));

    /* renamed from: p */
    private final List<String> f179209p = C89070n.m154522b("👏", "😍", "😂");

    /* renamed from: q */
    private final List<String> f179210q = C89070n.m154522b("😁", "🥰", "😳", "😏", "😅", "🥺", "😌", "😬", "😊", "😎");

    /* renamed from: r */
    private String f179211r;

    /* renamed from: s */
    private final C12642a f179212s = new C12642a(C89204ab.m154669a(UpvotePublishVM.class), null, C79937d.INSTANCE, new C79938e(this), C79939f.INSTANCE, C79927a.INSTANCE, new C79935b(this), new C79936c(this));

    /* renamed from: t */
    private SparseArray f179213t;

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$a */
    public static final class C79927a extends AbstractC89220m implements AbstractC89172b<C80022g, C80022g> {
        public static final C79927a INSTANCE = new C79927a();

        static {
            Covode.recordClassIndex(93154);
        }

        public C79927a() {
            super(1);
        }

        public final C80022g invoke(C80022g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    static {
        Covode.recordClassIndex(93153);
    }

    /* renamed from: k */
    private final ConstraintLayout m138678k() {
        return (ConstraintLayout) this.f179201h.getValue();
    }

    /* renamed from: l */
    private final TuxNavBar m138679l() {
        return (TuxNavBar) this.f179202i.getValue();
    }

    /* renamed from: a */
    public final MeasureLinearLayout mo123421a() {
        return (MeasureLinearLayout) this.f179200g.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SmartAvatarImageView mo123425b() {
        return (SmartAvatarImageView) this.f179203j.getValue();
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final InterceptEventLayout mo123427c() {
        return (InterceptEventLayout) this.f179204k.getValue();
    }

    /* renamed from: d */
    public final TuxEditText mo123428d() {
        return (TuxEditText) this.f179205l.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final InterceptEventLayout mo123429e() {
        return (InterceptEventLayout) this.f179206m.getValue();
    }

    /* renamed from: f */
    public final LinearLayout mo123430f() {
        return (LinearLayout) this.f179207n.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final TuxButton mo123431g() {
        return (TuxButton) this.f179208o.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getHasSubscribedForReused() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC1204m getHostLifecycleOwner() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22876d getReceiverForHostVM() {
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* renamed from: h */
    public final UpvotePublishVM mo123432h() {
        return (UpvotePublishVM) this.f179212s.getValue();
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$e */
    public static final class C79938e extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f179224a;

        static {
            Covode.recordClassIndex(93165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79938e(AbstractC1204m mVar) {
            super(0);
            this.f179224a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f179224a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$g */
    public static final class C79940g {
        static {
            Covode.recordClassIndex(93167);
        }

        private C79940g() {
        }

        public /* synthetic */ C79940g(byte b) {
            this();
        }
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22878f
    public final AbstractC1204m getActualLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22878f getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // com.bytedance.tiktok.proxy.AbstractC22880h
    public final AbstractC22876d getActualReceiver() {
        return this;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    public final AbstractC22880h<AbstractC22876d> getActualReceiverHolder() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.keyboard.AbstractC39142c
    /* renamed from: a */
    public final void mo64600a(boolean z, int i) {
        if (z) {
            MeasureLinearLayout a = mo123421a();
            C89219l.m154716b(a, "");
            m138677a(a);
        }
    }

    /* renamed from: a */
    public final void mo123423a(boolean z) {
        if (z) {
            TuxEditText d = mo123428d();
            if (d != null) {
                d.requestFocus();
            }
            KeyboardUtils.m70896b(mo123428d());
            return;
        }
        KeyboardUtils.m70897c(mo123428d());
        dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$d */
    public static final class C79937d extends AbstractC89220m implements AbstractC89171a<C12874b<C80022g>> {
        public static final C79937d INSTANCE = new C79937d();

        static {
            Covode.recordClassIndex(93164);
        }

        public C79937d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C80022g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$f */
    public static final class C79939f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C79939f INSTANCE = new C79939f();

        static {
            Covode.recordClassIndex(93166);
        }

        public C79939f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$aa */
    static final class C79928aa extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89234a f179214a;

        /* renamed from: b */
        final /* synthetic */ Map f179215b;

        static {
            Covode.recordClassIndex(93155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79928aa(C89233z.C89234a aVar, Map map) {
            super(0);
            this.f179214a = aVar;
            this.f179215b = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f179214a.element = true;
            C39162r.m79460a("comment_rethink_cg_ck", this.f179215b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$af */
    static final class C79933af extends AbstractC89220m implements AbstractC89171a<TuxButton> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179220a;

        static {
            Covode.recordClassIndex(93160);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79933af(C79926a aVar) {
            super(0);
            this.f179220a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxButton invoke() {
            return C79926a.m138676a(this.f179220a).findViewById(R.id.efa);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$ag */
    static final class C79934ag extends AbstractC89220m implements AbstractC89171a<TuxNavBar> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179221a;

        static {
            Covode.recordClassIndex(93161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79934ag(C79926a aVar) {
            super(0);
            this.f179221a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxNavBar invoke() {
            return C79926a.m138676a(this.f179221a).findViewById(R.id.ejx);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$h */
    static final class C79941h extends AbstractC89220m implements AbstractC89171a<ConstraintLayout> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179225a;

        static {
            Covode.recordClassIndex(93168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79941h(C79926a aVar) {
            super(0);
            this.f179225a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ConstraintLayout invoke() {
            return C79926a.m138676a(this.f179225a).findViewById(R.id.a5s);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$l */
    static final class C79945l extends AbstractC89220m implements AbstractC89171a<TuxEditText> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179232a;

        static {
            Covode.recordClassIndex(93172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79945l(C79926a aVar) {
            super(0);
            this.f179232a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxEditText invoke() {
            return C79926a.m138676a(this.f179232a).findViewById(R.id.ax0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$m */
    static final class C79946m extends AbstractC89220m implements AbstractC89171a<InterceptEventLayout> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179233a;

        static {
            Covode.recordClassIndex(93173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79946m(C79926a aVar) {
            super(0);
            this.f179233a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InterceptEventLayout invoke() {
            return C79926a.m138676a(this.f179233a).findViewById(R.id.biq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$n */
    static final class C79947n extends AbstractC89220m implements AbstractC89171a<InterceptEventLayout> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179234a;

        static {
            Covode.recordClassIndex(93174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79947n(C79926a aVar) {
            super(0);
            this.f179234a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ InterceptEventLayout invoke() {
            return C79926a.m138676a(this.f179234a).findViewById(R.id.bir);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$q */
    static final class RunnableC79951q implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C79926a f179240a;

        static {
            Covode.recordClassIndex(93178);
        }

        RunnableC79951q(C79926a aVar) {
            this.f179240a = aVar;
        }

        public final void run() {
            MeasureLinearLayout a = this.f179240a.mo123421a();
            if (a != null) {
                C79926a.m138677a(a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$v */
    static final class C79956v extends AbstractC89220m implements AbstractC89171a<SmartAvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179245a;

        static {
            Covode.recordClassIndex(93183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79956v(C79926a aVar) {
            super(0);
            this.f179245a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartAvatarImageView invoke() {
            return C79926a.m138676a(this.f179245a).findViewById(R.id.bsr);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$w */
    static final class C79957w extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179246a;

        static {
            Covode.recordClassIndex(93184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79957w(C79926a aVar) {
            super(0);
            this.f179246a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return C79926a.m138676a(this.f179246a).findViewById(R.id.cd6);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$x */
    static final class C79958x extends AbstractC89220m implements AbstractC89171a<MeasureLinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179247a;

        static {
            Covode.recordClassIndex(93185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79958x(C79926a aVar) {
            super(0);
            this.f179247a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ MeasureLinearLayout invoke() {
            return C79926a.m138676a(this.f179247a).findViewById(R.id.ceb);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f179213t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$b */
    public static final class C79935b extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179222a;

        static {
            Covode.recordClassIndex(93162);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79935b(Fragment fragment) {
            super(0);
            this.f179222a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179222a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$c */
    public static final class C79936c extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f179223a;

        static {
            Covode.recordClassIndex(93163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C79936c(Fragment fragment) {
            super(0);
            this.f179223a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f179223a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$i */
    public static final class C79942i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Map f179226a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f179227b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f179228c;

        static {
            Covode.recordClassIndex(93169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79942i(Map map, AlertDialog alertDialog, AbstractC89171a aVar) {
            super(0);
            this.f179226a = map;
            this.f179227b = alertDialog;
            this.f179228c = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f179226a.put("action_type", "1");
            C39162r.m79460a("click_discard_pop_up", this.f179226a);
            this.f179227b.dismiss();
            this.f179228c.invoke();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$j */
    public static final class C79943j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ Map f179229a;

        /* renamed from: b */
        final /* synthetic */ AlertDialog f179230b;

        static {
            Covode.recordClassIndex(93170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79943j(Map map, AlertDialog alertDialog) {
            super(0);
            this.f179229a = map;
            this.f179230b = alertDialog;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f179229a.put("action_type", "0");
            C39162r.m79460a("click_discard_pop_up", this.f179229a);
            this.f179230b.dismiss();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$k */
    public static final class C79944k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179231a;

        static {
            Covode.recordClassIndex(93171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79944k(C79926a aVar) {
            super(0);
            this.f179231a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str = this.f179231a.f179196b;
            if (str != null) {
                this.f179231a.mo123432h().mo123417a(str, this.f179231a.f179197c);
            }
            this.f179231a.mo123423a(false);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void dismiss() {
        TuxEditText d = mo123428d();
        C89219l.m154716b(d, "");
        d.setCursorVisible(false);
        super.dismiss();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MeasureLinearLayout a = mo123421a();
        C89219l.m154716b(a, "");
        a.getKeyBoardObservable().mo67905b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        MeasureLinearLayout a = mo123421a();
        C89219l.m154716b(a, "");
        a.getKeyBoardObservable().mo67903a(this);
        mo123423a(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$ab */
    static final class C79929ab extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179216a;

        static {
            Covode.recordClassIndex(93156);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79929ab(C79926a aVar) {
            super(0);
            this.f179216a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C79926a aVar = this.f179216a;
            LinearLayout f = aVar.mo123430f();
            C89219l.m154716b(f, "");
            f.setAlpha(0.34f);
            SmartAvatarImageView b = aVar.mo123425b();
            C89219l.m154716b(b, "");
            b.setAlpha(0.34f);
            TuxEditText d = aVar.mo123428d();
            C89219l.m154716b(d, "");
            d.setAlpha(0.34f);
            aVar.mo123427c().setInterceptTouchEvent(true);
            aVar.mo123429e().setInterceptTouchEvent(true);
            aVar.mo123431g().setLoading(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$z */
    static final class C79960z extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179251a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f179252b;

        /* renamed from: c */
        final /* synthetic */ Map f179253c;

        static {
            Covode.recordClassIndex(93187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79960z(C79926a aVar, C89233z.C89234a aVar2, Map map) {
            super(0);
            this.f179251a = aVar;
            this.f179252b = aVar2;
            this.f179253c = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            Map map = this.f179253c;
            if (this.f179252b.element) {
                str = "1";
            } else {
                str = "0";
            }
            map.put("if_click_cg", str);
            C39162r.m79460a("comment_rethink_edit_ck", this.f179253c);
            this.f179251a.mo123428d().postDelayed(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.upvote.publish.p4192a.C79926a.C79960z.RunnableC799611 */

                /* renamed from: a */
                final /* synthetic */ C79960z f179254a;

                static {
                    Covode.recordClassIndex(93188);
                }

                {
                    this.f179254a = r1;
                }

                public final void run() {
                    if (this.f179254a.f179251a.f92309ad) {
                        MeasureLinearLayout a = this.f179254a.f179251a.mo123421a();
                        if (a != null) {
                            a.setVisibility(0);
                        }
                        this.f179254a.f179251a.mo123423a(true);
                    }
                }
            }, 300);
            return C89391z.f203057a;
        }
    }

    /* renamed from: j */
    public final void mo123434j() {
        LinearLayout f = mo123430f();
        C89219l.m154716b(f, "");
        f.setAlpha(1.0f);
        SmartAvatarImageView b = mo123425b();
        C89219l.m154716b(b, "");
        b.setAlpha(1.0f);
        TuxEditText d = mo123428d();
        C89219l.m154716b(d, "");
        d.setAlpha(1.0f);
        mo123427c().setInterceptTouchEvent(false);
        mo123429e().setInterceptTouchEvent(false);
        mo123431g().setLoading(false);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$s */
    static final class C79953s extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179242a;

        static {
            Covode.recordClassIndex(93180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79953s(C79926a aVar) {
            super(0);
            this.f179242a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            boolean z;
            String str2;
            String str3;
            String obj;
            TuxEditText d = this.f179242a.mo123428d();
            String str4 = "";
            C89219l.m154716b(d, str4);
            Editable text = d.getText();
            if (text == null || (obj = text.toString()) == null) {
                str = null;
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                str = C89361p.m154910b((CharSequence) obj).toString();
            }
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z2 = !z;
            C89378p[] pVarArr = new C89378p[4];
            UpvotePublishMobParam upvotePublishMobParam = this.f179242a.f179197c;
            if (!(upvotePublishMobParam == null || (str3 = upvotePublishMobParam.f179137a) == null)) {
                str4 = str3;
            }
            pVarArr[0] = C89387v.m154943a(str4, "enter_from");
            pVarArr[1] = C89387v.m154943a("icon", "enter_method");
            pVarArr[2] = C89387v.m154943a("input_page", "page");
            if (z2) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            pVarArr[3] = C89387v.m154943a(str2, "with_recommendation");
            C39162r.m79462a("close_recommend_panel", pVarArr);
            this.f179242a.mo123433i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$y */
    static final class C79959y extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179248a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89234a f179249b;

        /* renamed from: c */
        final /* synthetic */ Map f179250c;

        static {
            Covode.recordClassIndex(93186);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79959y(C79926a aVar, C89233z.C89234a aVar2, Map map) {
            super(0);
            this.f179248a = aVar;
            this.f179249b = aVar2;
            this.f179250c = map;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            String obj;
            Map map = this.f179250c;
            if (this.f179249b.element) {
                str = "1";
            } else {
                str = "0";
            }
            map.put("if_click_cg", str);
            C39162r.m79460a("comment_rethink_post_ck", this.f179250c);
            TuxEditText d = this.f179248a.mo123428d();
            String str2 = "";
            C89219l.m154716b(d, str2);
            Editable text = d.getText();
            if (!(text == null || (obj = text.toString()) == null)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = C89361p.m154910b((CharSequence) obj).toString();
                if (obj2 != null) {
                    str2 = obj2;
                }
            }
            String str3 = this.f179248a.f179196b;
            if (str3 != null) {
                this.f179248a.mo123432h().mo123419a(str3, str2, this.f179248a.f179197c);
                this.f179248a.dismiss();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$o */
    static final class RunnableC79948o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C79926a f179235a;

        /* renamed from: b */
        final /* synthetic */ List f179236b;

        static {
            Covode.recordClassIndex(93175);
        }

        RunnableC79948o(C79926a aVar, List list) {
            this.f179235a = aVar;
            this.f179236b = list;
        }

        public final void run() {
            MethodCollector.m26663i(5351);
            if (this.f179235a.getContext() == null) {
                MethodCollector.m26664o(5351);
                return;
            }
            LinearLayout f = this.f179235a.mo123430f();
            C89219l.m154716b(f, "");
            int width = f.getWidth();
            LinearLayout f2 = this.f179235a.mo123430f();
            C89219l.m154716b(f2, "");
            int paddingStart = width - f2.getPaddingStart();
            LinearLayout f3 = this.f179235a.mo123430f();
            C89219l.m154716b(f3, "");
            int paddingEnd = paddingStart - f3.getPaddingEnd();
            int size = this.f179236b.size();
            int i = 0;
            for (final int i2 = 0; i2 < size; i2++) {
                int i3 = paddingEnd - i;
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                if (i3 < a + C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics()))) {
                    break;
                }
                Context requireContext = this.f179235a.requireContext();
                C89219l.m154716b(requireContext, "");
                TuxTextView tuxTextView = new TuxTextView(requireContext, null, 0, 6);
                tuxTextView.setTuxFont(31);
                tuxTextView.setGravity(17);
                tuxTextView.setText((CharSequence) this.f179236b.get(i2));
                tuxTextView.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.upvote.publish.p4192a.C79926a.RunnableC79948o.View$OnClickListenerC799491 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC79948o f179237a;

                    static {
                        Covode.recordClassIndex(93176);
                    }

                    {
                        this.f179237a = r1;
                    }

                    public final void onClick(View view) {
                        Object obj;
                        Editable editable;
                        ClickAgent.onClick(view);
                        C79926a aVar = this.f179237a.f179235a;
                        String str = (String) this.f179237a.f179236b.get(i2);
                        if (str != null && str.length() != 0) {
                            TuxEditText d = aVar.mo123428d();
                            C89219l.m154716b(d, "");
                            int b = C89271h.m154769b(d.getSelectionStart(), 0);
                            TuxEditText d2 = aVar.mo123428d();
                            C89219l.m154716b(d2, "");
                            int b2 = C89271h.m154769b(d2.getSelectionEnd(), 0);
                            if (b == b2) {
                                TuxEditText d3 = aVar.mo123428d();
                                C89219l.m154716b(d3, "");
                                Editable text = d3.getText();
                                if (text != null) {
                                    text.insert(b, str);
                                }
                            } else {
                                try {
                                    TuxEditText d4 = aVar.mo123428d();
                                    C89219l.m154716b(d4, "");
                                    Editable text2 = d4.getText();
                                    if (text2 != null) {
                                        editable = text2.replace(b, b2, str);
                                    } else {
                                        editable = null;
                                    }
                                    obj = C89379q.m157068constructorimpl(editable);
                                } catch (Throwable th) {
                                    obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
                                }
                                C89379q.m157071exceptionOrNullimpl(obj);
                            }
                            aVar.mo123428d().setSelection(Math.min(b + str.length(), aVar.mo123428d().length()));
                        }
                    }
                });
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                int a2 = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system3.getDisplayMetrics()));
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a2, C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system4.getDisplayMetrics())));
                Resources system5 = Resources.getSystem();
                C89219l.m154709a((Object) system5, "");
                i += C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system5.getDisplayMetrics()));
                if (i2 > 0) {
                    Resources system6 = Resources.getSystem();
                    C89219l.m154709a((Object) system6, "");
                    layoutParams.setMarginStart(C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system6.getDisplayMetrics())));
                    Resources system7 = Resources.getSystem();
                    C89219l.m154709a((Object) system7, "");
                    i += C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system7.getDisplayMetrics()));
                }
                this.f179235a.mo123430f().addView(tuxTextView, layoutParams);
            }
            MethodCollector.m26664o(5351);
        }
    }

    /* renamed from: i */
    public final void mo123433i() {
        CharSequence b;
        String b2;
        if (getContext() != null) {
            int i = 0;
            if (mo123431g().f54417a) {
                mo123423a(false);
                return;
            }
            C79944k kVar = new C79944k(this);
            TuxEditText d = mo123428d();
            C89219l.m154716b(d, "");
            Editable text = d.getText();
            String str = null;
            if (text == null || (b = C89361p.m154910b(text)) == null || b.length() == 0) {
                kVar.invoke();
                return;
            }
            C89378p[] pVarArr = new C89378p[2];
            UpvotePublishMobParam upvotePublishMobParam = this.f179197c;
            if (upvotePublishMobParam != null) {
                str = upvotePublishMobParam.f179137a;
            }
            pVarArr[0] = C89387v.m154943a("enter_from", str);
            pVarArr[1] = C89387v.m154943a("pop_up_type", "cancel_text");
            Map b3 = C89041ag.m154427b(pVarArr);
            C39162r.m79460a("show_discard_pop_up", b3);
            Context requireContext = requireContext();
            C89219l.m154716b(requireContext, "");
            C79970e eVar = new C79970e(requireContext, (byte) 0);
            String b4 = C34722h.m70923b(R.string.f6d);
            C89219l.m154716b(b4, "");
            eVar.setTitle(b4);
            if (C79705a.m138534b()) {
                b2 = C34722h.m70923b(R.string.f6c);
            } else {
                b2 = C34722h.m70923b(R.string.faq);
            }
            C89219l.m154716b(b2, "");
            eVar.setMessage(b2);
            AlertDialog create = new AlertDialog.Builder(requireContext()).setView(eVar).create();
            String b5 = C34722h.m70923b(R.string.f6a);
            C89219l.m154716b(b5, "");
            C79942i iVar = new C79942i(b3, create, kVar);
            C89219l.m154721d(b5, "");
            TuxTextView tuxTextView = (TuxTextView) eVar.findViewById(R.id.f1c);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(b5);
            tuxTextView.setOnClickListener(new C79970e.View$OnClickListenerC79972b(b5, iVar));
            String b6 = C34722h.m70923b(R.string.f6b);
            C89219l.m154716b(b6, "");
            C79943j jVar = new C79943j(b3, create);
            C89219l.m154721d(b6, "");
            TuxTextView tuxTextView2 = (TuxTextView) eVar.findViewById(R.id.f00);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(b6);
            tuxTextView2.setOnClickListener(new C79970e.View$OnClickListenerC79971a(b6, jVar));
            create.show();
            C89219l.m154716b(create, "");
            Window window = create.getWindow();
            if (window != null) {
                window.setBackgroundDrawableResource(R.drawable.vg);
                WindowManager.LayoutParams attributes = window.getAttributes();
                Context requireContext2 = requireContext();
                C89219l.m154716b(requireContext2, "");
                Resources resources = requireContext2.getResources();
                C89219l.m154709a((Object) resources, "");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    i = displayMetrics.widthPixels;
                }
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                int a = i - (C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())) * 2);
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                attributes.width = Math.min(a, C89241a.m154730a(TypedValue.applyDimension(1, 360.0f, system2.getDisplayMetrics())));
                window.setAttributes(attributes);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$ac */
    static final class C79930ac extends AbstractC89220m implements AbstractC89172b<BaseResponse, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179217a;

        static {
            Covode.recordClassIndex(93157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79930ac(C79926a aVar) {
            super(1);
            this.f179217a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseResponse baseResponse) {
            C89219l.m154721d(baseResponse, "");
            this.f179217a.mo123423a(false);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$ad */
    static final class C79931ad extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179218a;

        static {
            Covode.recordClassIndex(93158);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79931ad(C79926a aVar) {
            super(1);
            this.f179218a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            C89219l.m154721d(th, "");
            this.f179218a.mo123434j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m138676a(C79926a aVar) {
        View view = aVar.f179195a;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onConfigurationChanged(Configuration configuration) {
        C89219l.m154721d(configuration, "");
        super.onConfigurationChanged(configuration);
        mo123421a().mo67898a();
    }

    /* renamed from: a */
    public static void m138677a(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    public final void afterTextChanged(Editable editable) {
        boolean z;
        TuxButton g = mo123431g();
        C89219l.m154716b(g, "");
        if (editable == null || editable.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        g.setEnabled(!z);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setLayout(-1, -1);
        }
        if (bundle != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setStyle(1, R.style.a3m);
        Bundle arguments = getArguments();
        UpvotePublishMobParam upvotePublishMobParam = null;
        if (arguments != null) {
            str = arguments.getString("upvote_item_id");
        } else {
            str = null;
        }
        this.f179196b = str;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("emoji_text");
        } else {
            str2 = null;
        }
        this.f179211r = str2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            upvotePublishMobParam = (UpvotePublishMobParam) arguments3.getParcelable("mob_param");
        }
        this.f179197c = upvotePublishMobParam;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(20);
        }
        Window window2 = onCreateDialog.getWindow();
        if (window2 != null) {
            window2.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        onCreateDialog.setCancelable(true);
        return onCreateDialog;
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$r */
    static final class C79952r extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179241a;

        static {
            Covode.recordClassIndex(93179);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79952r(C79926a aVar) {
            super(1);
            this.f179241a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = Integer.valueOf(C0643b.m2378c(this.f179241a.requireContext(), R.color.r));
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54470i = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54471j = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$p */
    static final class View$OnClickListenerC79950p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79926a f179239a;

        static {
            Covode.recordClassIndex(93177);
        }

        View$OnClickListenerC79950p(C79926a aVar) {
            this.f179239a = aVar;
        }

        public final void onClick(View view) {
            String str;
            boolean z;
            String str2;
            String str3;
            String obj;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                TuxEditText d = this.f179239a.mo123428d();
                String str4 = "";
                C89219l.m154716b(d, str4);
                Editable text = d.getText();
                if (text == null || (obj = text.toString()) == null) {
                    str = null;
                } else {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                    str = C89361p.m154910b((CharSequence) obj).toString();
                }
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                C89378p[] pVarArr = new C89378p[4];
                UpvotePublishMobParam upvotePublishMobParam = this.f179239a.f179197c;
                if (!(upvotePublishMobParam == null || (str3 = upvotePublishMobParam.f179137a) == null)) {
                    str4 = str3;
                }
                pVarArr[0] = C89387v.m154943a(str4, "enter_from");
                pVarArr[1] = C89387v.m154943a("other", "enter_method");
                pVarArr[2] = C89387v.m154943a("input_page", "page");
                if (z2) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                pVarArr[3] = C89387v.m154943a(str2, "with_recommendation");
                C39162r.m79462a("close_recommend_panel", pVarArr);
                this.f179239a.mo123433i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$t */
    static final class View$OnClickListenerC79954t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C79926a f179243a;

        static {
            Covode.recordClassIndex(93181);
        }

        View$OnClickListenerC79954t(C79926a aVar) {
            this.f179243a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
            if (r0 == null) goto L_0x007b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
            if (r5 == null) goto L_0x00bd;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
            // Method dump skipped, instructions count: 332
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.upvote.publish.p4192a.C79926a.View$OnClickListenerC79954t.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$ae */
    static final class C79932ae extends AbstractC89220m implements AbstractC89183m<AbstractC22876d, CommentRethinkPopup, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C79926a f179219a;

        static {
            Covode.recordClassIndex(93159);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79932ae(C79926a aVar) {
            super(2);
            this.f179219a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC22876d dVar, CommentRethinkPopup commentRethinkPopup) {
            String str;
            String str2;
            CommentRethinkPopup commentRethinkPopup2 = commentRethinkPopup;
            String str3 = "";
            C89219l.m154721d(dVar, str3);
            this.f179219a.mo123434j();
            AbstractC0952i fragmentManager = this.f179219a.getFragmentManager();
            if (!(commentRethinkPopup2 == null || fragmentManager == null)) {
                C79926a aVar = this.f179219a;
                MeasureLinearLayout a = aVar.mo123421a();
                C89219l.m154716b(a, str3);
                a.setVisibility(4);
                KeyboardUtils.m70897c(aVar.mo123428d());
                C89378p[] pVarArr = new C89378p[4];
                if (aVar.f179199e) {
                    str = "1";
                } else {
                    str = "0";
                }
                pVarArr[0] = C89387v.m154943a("resend_same_cmt", str);
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, str3);
                pVarArr[1] = C89387v.m154943a("user_id", g.getCurUserId());
                UpvotePublishMobParam upvotePublishMobParam = aVar.f179197c;
                if (!(upvotePublishMobParam == null || (str2 = upvotePublishMobParam.f179139c) == null)) {
                    str3 = str2;
                }
                pVarArr[2] = C89387v.m154943a("group_id", str3);
                pVarArr[3] = C89387v.m154943a("scene", "recommend");
                Map b = C89041ag.m154427b(pVarArr);
                C39162r.m79460a("comment_rethink_sw", b);
                C89233z.C89234a aVar2 = new C89233z.C89234a();
                aVar2.element = false;
                CommentServiceImpl.m73664e().mo63292a(fragmentManager, commentRethinkPopup2, new C79959y(aVar, aVar2, b), new C79960z(aVar, aVar2, b), new C79928aa(aVar2, b), "UpvoteCommentDialogFragment");
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2634f.C39112b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        ArrayList arrayList;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (getContext() != null) {
            MeasureLinearLayout a = mo123421a();
            C89219l.m154716b(a, "");
            a.setKeyBoardObservable(new C39141b());
            mo123421a().setOnClickListener(new View$OnClickListenerC79950p(this));
            MeasureLinearLayout a2 = mo123421a();
            C89219l.m154716b(a2, "");
            a2.setVisibility(4);
            mo123421a().postDelayed(new RunnableC79951q(this), 500);
            ConstraintLayout k = m138678k();
            C89219l.m154716b(k, "");
            C23008e a3 = C23009f.m43397a(new C79952r(this));
            Context requireContext = requireContext();
            C89219l.m154716b(requireContext, "");
            k.setBackground(a3.mo37389a(requireContext));
            m138678k().setOnClickListener(null);
            TuxNavBar l = m138679l();
            C23194g gVar = new C23194g();
            String b = C34722h.m70923b(R.string.f6f);
            C89219l.m154716b(b, "");
            l.mo37725a(gVar.mo37753a(b));
            m138679l().mo37728b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37741a((AbstractC89171a<C89391z>) new C79953s(this)));
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            User curUser = g.getCurUser();
            C89219l.m154716b(curUser, "");
            C20766v a4 = C20761r.m39060a(C34735v.m70965a(curUser.getAvatarThumb()));
            a4.f49092E = mo123425b();
            a4.mo34186c();
            String str = this.f179211r;
            if (!(str == null || str.length() == 0)) {
                TuxEditText d = mo123428d();
                C89219l.m154716b(d, "");
                Editable text = d.getText();
                if (text != null) {
                    text.append((CharSequence) this.f179211r);
                }
            }
            mo123428d().addTextChangedListener(this);
            C79955u uVar = new C79955u(this);
            TuxEditText d2 = mo123428d();
            C89219l.m154716b(d2, "");
            d2.setFilters(new InputFilter[]{uVar});
            TuxButton g2 = mo123431g();
            C89219l.m154716b(g2, "");
            String str2 = this.f179211r;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            g2.setEnabled(!z);
            mo123431g().setOnClickListener(new View$OnClickListenerC79954t(this));
            List<String> list = this.f179209p;
            C46597h.f108651e.mo79192c();
            C46595g.C46596a.m89935a();
            List<C46605i> a5 = C46595g.m89932a(2);
            if (a5 != null) {
                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) a5, 10));
                Iterator<T> it = a5.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().getPreviewEmoji());
                }
                ArrayList arrayList3 = arrayList2;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    List<String> list2 = this.f179210q;
                    ArrayList arrayList4 = new ArrayList();
                    for (T t : list2) {
                        if (arrayList3.contains(t) && !this.f179209p.contains(t)) {
                            arrayList4.add(t);
                        }
                    }
                    arrayList = arrayList4;
                    mo123430f().post(new RunnableC79948o(this, C89070n.m154572d((Collection) list, arrayList)));
                }
            }
            arrayList = C89086z.INSTANCE;
            mo123430f().post(new RunnableC79948o(this, C89070n.m154572d((Collection) list, arrayList)));
        }
        mo123432h().mo20663a(C79962b.f179255a, C12856l.m23100a(), new C79931ad(this), new C79929ab(this), new C79930ac(this));
        AbstractC12818f.C12819a.m23063a(this, mo123432h(), C79963c.f179256a, C12856l.m23100a(), new C79932ae(this), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bha, viewGroup, false);
        C89219l.m154716b(a, "");
        this.f179195a = a;
        if (a == null) {
            C89219l.m154710a("contentView");
        }
        return a;
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j> void mo20508a(AssemViewModel<S> assemViewModel, C12854k<S> kVar, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super S, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23092a(this, assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: b */
    public final <S extends AbstractC12853j, A> void mo20515b(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23097b(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.publish.a.a$u */
    static final class C79955u implements InputFilter {

        /* renamed from: a */
        final /* synthetic */ C79926a f179244a;

        static {
            Covode.recordClassIndex(93182);
        }

        C79955u(C79926a aVar) {
            this.f179244a = aVar;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            return this.f179244a.mo123422a(charSequence, i, i2, spanned, i3, i4);
        }
    }

    /* renamed from: a */
    public final CharSequence mo123422a(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5;
        String str;
        if (spanned != null) {
            i5 = spanned.length();
        } else {
            i5 = 0;
        }
        int i6 = 150 - (i5 - (i4 - i3));
        Context context = getContext();
        if (context != null) {
            str = context.getString(R.string.hc7);
        } else {
            str = null;
        }
        if (i6 <= 0) {
            if (!(charSequence == null || charSequence.length() == 0)) {
                new C23144b(this).mo37635a(str).mo37637b();
            }
            return "";
        } else if (i6 >= i2 - i) {
            return null;
        } else {
            int i7 = i6 + i;
            if (charSequence == null || charSequence.length() == 0 || !Character.isHighSurrogate(charSequence.charAt(i7 - 1)) || i7 - 1 != i) {
                new C23144b(this).mo37635a(str).mo37637b();
                if (charSequence != null) {
                    return charSequence.subSequence(i, i7);
                }
                return null;
            }
            new C23144b(this).mo37635a(str).mo37637b();
            return "";
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B> void mo20510a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C12854k<C12794p<A, B>> kVar3, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89187q<? super AbstractC22876d, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(qVar, "");
        AbstractC12846h.C12847a.m23094a(this, assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C> void mo20511a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C12854k<C12795q<A, B, C>> kVar4, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89188r<? super AbstractC22876d, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(rVar, "");
        AbstractC12846h.C12847a.m23095a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.AbstractC12818f
    /* renamed from: a */
    public final <S extends AbstractC12853j, A, B, C, D> void mo20512a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C12854k<C12796r<A, B, C, D>> kVar5, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89189s<? super AbstractC22876d, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(sVar, "");
        AbstractC12846h.C12847a.m23096a(this, assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }
}
