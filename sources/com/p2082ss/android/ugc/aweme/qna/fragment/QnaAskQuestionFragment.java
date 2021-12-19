package com.p2082ss.android.ugc.aweme.qna.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.bytedance.assem.arch.viewModel.AbstractC12846h;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12815c;
import com.bytedance.assem.arch.viewModel.C12854k;
import com.bytedance.assem.arch.viewModel.C12856l;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.assem.p793a.C12642a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.BaseFragmentViewModel;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tiktok.proxy.AbstractC22876d;
import com.bytedance.tiktok.proxy.AbstractC22878f;
import com.bytedance.tiktok.proxy.AbstractC22880h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.services.CommentService;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qainvitation.p3640e.EnumC65848e;
import com.p2082ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.p2082ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.p2082ss.android.ugc.aweme.qna.model.AskQuestionParam;
import com.p2082ss.android.ugc.aweme.qna.p3646d.AbstractC66042f;
import com.p2082ss.android.ugc.aweme.qna.p3648f.C66063a;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.C66361g;
import com.p2082ss.android.ugc.aweme.qna.p3651vm.QnaCreationViewModel;
import com.p2082ss.android.ugc.aweme.question.model.C66575a;
import com.p2082ss.android.ugc.aweme.service.EOYServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.MultiAvatarView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
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
import p4600h.p4615g.C89241a;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

@AbstractC17735a
/* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment */
public final class QnaAskQuestionFragment extends C17372a implements AbstractC12846h, KeyboardUtils.AbstractC34711a {

    /* renamed from: j */
    public static final C66070g f148768j = new C66070g((byte) 0);

    /* renamed from: e */
    AbstractC66071h f148769e;

    /* renamed from: f */
    public final IQAInvitationService f148770f;

    /* renamed from: g */
    public List<? extends User> f148771g;

    /* renamed from: h */
    public List<? extends IMUser> f148772h;

    /* renamed from: i */
    public boolean f148773i;

    /* renamed from: k */
    private final AbstractC89244h f148774k = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: l */
    private final AbstractC89244h f148775l = C89250i.m154773a((AbstractC89171a) new C66087s(this));

    /* renamed from: m */
    private final C12642a f148776m = new C12642a(C89204ab.m154669a(QnaCreationViewModel.class), null, C66067d.INSTANCE, new C66068e(this), C66069f.INSTANCE, C66064a.INSTANCE, new C66065b(this), new C66066c(this));

    /* renamed from: n */
    private Runnable f148777n;

    /* renamed from: o */
    private SparseArray f148778o;

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$a */
    public static final class C66064a extends AbstractC89220m implements AbstractC89172b<C66361g, C66361g> {
        public static final C66064a INSTANCE = new C66064a();

        static {
            Covode.recordClassIndex(77571);
        }

        public C66064a() {
            super(1);
        }

        public final C66361g invoke(C66361g gVar) {
            C89219l.m154719c(gVar, "");
            return gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$h */
    public interface AbstractC66071h {
        static {
            Covode.recordClassIndex(77578);
        }
    }

    static {
        Covode.recordClassIndex(77570);
    }

    /* renamed from: h */
    private final QnaCreationViewModel m117875h() {
        return (QnaCreationViewModel) this.f148776m.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f148778o == null) {
            this.f148778o = new SparseArray();
        }
        View view = (View) this.f148778o.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f148778o.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f148778o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
    /* renamed from: c */
    public final void mo64296c() {
    }

    /* renamed from: d */
    public final AskQuestionParam mo105120d() {
        return (AskQuestionParam) this.f148774k.getValue();
    }

    /* renamed from: e */
    public final AskQuestionParam mo105121e() {
        return (AskQuestionParam) this.f148775l.getValue();
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

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$e */
    public static final class C66068e extends AbstractC89220m implements AbstractC89171a<AbstractC1204m> {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f148781a;

        static {
            Covode.recordClassIndex(77575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66068e(AbstractC1204m mVar) {
            super(0);
            this.f148781a = mVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC1204m invoke() {
            return this.f148781a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$g */
    public static final class C66070g {
        static {
            Covode.recordClassIndex(77577);
        }

        private C66070g() {
        }

        public /* synthetic */ C66070g(byte b) {
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

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$d */
    public static final class C66067d extends AbstractC89220m implements AbstractC89171a<C12874b<C66361g>> {
        public static final C66067d INSTANCE = new C66067d();

        static {
            Covode.recordClassIndex(77574);
        }

        public C66067d() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C66361g> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$f */
    public static final class C66069f extends AbstractC89220m implements AbstractC89171a<C12815c> {
        public static final C66069f INSTANCE = new C66069f();

        static {
            Covode.recordClassIndex(77576);
        }

        public C66069f() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12815c invoke() {
            return new C12815c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$x */
    public static final class C66093x implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148806a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f148807b;

        static {
            Covode.recordClassIndex(77600);
        }

        C66093x(QnaAskQuestionFragment qnaAskQuestionFragment, AbstractC89171a aVar) {
            this.f148806a = qnaAskQuestionFragment;
            this.f148807b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            this.f148807b.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$q */
    static final class View$OnClickListenerC66084q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148795a;

        static {
            Covode.recordClassIndex(77591);
        }

        View$OnClickListenerC66084q(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f148795a = qnaAskQuestionFragment;
        }

        /* renamed from: a */
        private static boolean m117896a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f148795a.getContext();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m117896a();
            }
            if (!C58029j.f132253e) {
                new C79459a(this.f148795a.getContext()).mo123050a(R.string.dcq).mo123053a();
            } else {
                this.f148795a.mo105115a(new AbstractC89171a<C89391z>(this.f148795a) {
                    /* class com.p2082ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment.View$OnClickListenerC66084q.C660851 */

                    static {
                        Covode.recordClassIndex(77592);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        QnaAskQuestionFragment qnaAskQuestionFragment = (QnaAskQuestionFragment) this.receiver;
                        qnaAskQuestionFragment.mo105123g();
                        ActivityC0945e activity = qnaAskQuestionFragment.getActivity();
                        if (activity != null) {
                            IQAInvitationService iQAInvitationService = qnaAskQuestionFragment.f148770f;
                            Objects.requireNonNull(activity, "null cannot be cast to non-null type android.app.Activity");
                            String enterFrom = qnaAskQuestionFragment.mo105121e().getEnterFrom();
                            if (enterFrom == null) {
                                enterFrom = "";
                            }
                            iQAInvitationService.mo105003a(activity, "ask_textual_question", enterFrom, EnumC65848e.NEW_QUESTION, null, null, qnaAskQuestionFragment.f148772h, new C66086r(qnaAskQuestionFragment));
                        }
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$v */
    public static final class C66091v implements AbstractC34543f {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148802a;

        static {
            Covode.recordClassIndex(77598);
        }

        C66091v(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f148802a = qnaAskQuestionFragment;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: b */
        public final void mo57674b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
        /* renamed from: a */
        public final void mo57673a() {
            ((TuxButton) this.f148802a.mo27715a(R.id.ln)).callOnClick();
        }
    }

    /* renamed from: i */
    private static boolean m117876i() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        mo105117a(false);
        m117877j();
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$b */
    public static final class C66065b extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148779a;

        static {
            Covode.recordClassIndex(77572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66065b(Fragment fragment) {
            super(0);
            this.f148779a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148779a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20583b(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$c */
    public static final class C66066c extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ Fragment f148780a;

        static {
            Covode.recordClassIndex(77573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66066c(Fragment fragment) {
            super(0);
            this.f148780a = fragment;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            ActivityC0945e b = C12777b.m23004b(this.f148780a);
            if (b != null) {
                return Assembler.C12747a.m22936a(b).mo20584c(b);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$k */
    static final class RunnableC66074k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f148784a;

        /* renamed from: b */
        final /* synthetic */ QnaAskQuestionFragment f148785b;

        static {
            Covode.recordClassIndex(77581);
        }

        RunnableC66074k(String str, QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f148784a = str;
            this.f148785b = qnaAskQuestionFragment;
        }

        public final void run() {
            TuxEditText tuxEditText = (TuxEditText) this.f148785b.mo27715a(R.id.lp);
            if (tuxEditText != null) {
                tuxEditText.setSelection(this.f148784a.length(), this.f148784a.length());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$l */
    static final class C66075l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148786a;

        static {
            Covode.recordClassIndex(77582);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66075l(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(0);
            this.f148786a = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            KeyboardUtils.m70897c(this.f148786a.mo27715a(R.id.lp));
            ActivityC0945e activity = this.f148786a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$s */
    static final class C66087s extends AbstractC89220m implements AbstractC89171a<AskQuestionParam> {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148797a;

        static {
            Covode.recordClassIndex(77594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66087s(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(0);
            this.f148797a = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AskQuestionParam invoke() {
            AskQuestionParam d = this.f148797a.mo105120d();
            if (d == null) {
                return new AskQuestionParam(null, null, null, null, null, false, false, false, null, 511, null);
            }
            return d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$u */
    public static final class RunnableC66090u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148800a;

        /* renamed from: b */
        final /* synthetic */ boolean f148801b = true;

        static {
            Covode.recordClassIndex(77597);
        }

        RunnableC66090u(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f148800a = qnaAskQuestionFragment;
        }

        public final void run() {
            TuxEditText tuxEditText = (TuxEditText) this.f148800a.mo27715a(R.id.lp);
            if (tuxEditText == null) {
                return;
            }
            if (this.f148801b) {
                tuxEditText.requestFocus();
                KeyboardUtils.m70896b(tuxEditText);
                return;
            }
            KeyboardUtils.m70897c(tuxEditText);
        }
    }

    /* renamed from: j */
    private final void m117877j() {
        TuxEditText tuxEditText = (TuxEditText) mo27715a(R.id.lp);
        if (tuxEditText != null) {
            tuxEditText.postDelayed(new RunnableC66090u(this), 100);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$p */
    public static final class C66082p implements TextWatcher {

        /* renamed from: a */
        public String f148790a = "";

        /* renamed from: b */
        final /* synthetic */ QnaAskQuestionFragment f148791b;

        static {
            Covode.recordClassIndex(77589);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$p$a */
        static final class RunnableC66083a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f148792a;

            /* renamed from: b */
            final /* synthetic */ int f148793b;

            /* renamed from: c */
            final /* synthetic */ C66082p f148794c;

            static {
                Covode.recordClassIndex(77590);
            }

            RunnableC66083a(int i, int i2, C66082p pVar) {
                this.f148792a = i;
                this.f148793b = i2;
                this.f148794c = pVar;
            }

            public final void run() {
                try {
                    ((TuxEditText) this.f148794c.f148791b.mo27715a(R.id.lp)).setSelection(this.f148792a, this.f148793b);
                    C89379q.m157068constructorimpl(C89391z.f203057a);
                } catch (Throwable th) {
                    C89379q.m157068constructorimpl(C89382r.m154941a(th));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C66082p(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f148791b = qnaAskQuestionFragment;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            if (!C89219l.m154714a((Object) str, (Object) this.f148791b.mo105121e().getQuestion())) {
                this.f148791b.f148773i = true;
            }
            if (editable != null) {
                String replace = new C89350l("(?m)\t*\r?\n").replace(editable, "");
                TuxEditText tuxEditText = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                C89219l.m154716b(tuxEditText, "");
                int i = 0;
                if (tuxEditText.getLineCount() > 10) {
                    TuxEditText tuxEditText2 = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                    C89219l.m154716b(tuxEditText2, "");
                    int selectionStart = tuxEditText2.getSelectionStart();
                    TuxEditText tuxEditText3 = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                    C89219l.m154716b(tuxEditText3, "");
                    if (selectionStart != tuxEditText3.getSelectionEnd() || selectionStart >= replace.length() || selectionStart <= 0) {
                        Objects.requireNonNull(replace, "null cannot be cast to non-null type java.lang.String");
                        replace = replace.substring(0, replace.length() - 1);
                        C89219l.m154716b(replace, "");
                    } else {
                        StringBuilder sb = new StringBuilder();
                        Objects.requireNonNull(replace, "null cannot be cast to non-null type java.lang.String");
                        String substring = replace.substring(0, selectionStart - 1);
                        C89219l.m154716b(substring, "");
                        StringBuilder append = sb.append(substring);
                        Objects.requireNonNull(replace, "null cannot be cast to non-null type java.lang.String");
                        String substring2 = replace.substring(selectionStart);
                        C89219l.m154716b(substring2, "");
                        replace = append.append(substring2).toString();
                    }
                    ((TuxEditText) this.f148791b.mo27715a(R.id.lp)).setText(replace);
                    TuxEditText tuxEditText4 = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                    TuxEditText tuxEditText5 = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                    C89219l.m154716b(tuxEditText5, "");
                    Editable text = tuxEditText5.getText();
                    if (text != null) {
                        i = text.length();
                    }
                    tuxEditText4.setSelection(i);
                } else if (!C89219l.m154714a((Object) replace, (Object) editable.toString())) {
                    ((TuxEditText) this.f148791b.mo27715a(R.id.lp)).setText(replace);
                    TuxEditText tuxEditText6 = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                    TuxEditText tuxEditText7 = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                    C89219l.m154716b(tuxEditText7, "");
                    Editable text2 = tuxEditText7.getText();
                    if (text2 != null) {
                        i = text2.length();
                    }
                    tuxEditText6.setSelection(i);
                }
                this.f148790a = replace;
                QnaAskQuestionFragment qnaAskQuestionFragment = this.f148791b;
                Objects.requireNonNull(replace, "null cannot be cast to non-null type kotlin.CharSequence");
                qnaAskQuestionFragment.mo105118b(C89361p.m154910b((CharSequence) replace).toString().length());
                QnaAskQuestionFragment qnaAskQuestionFragment2 = this.f148791b;
                String str2 = this.f148790a;
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                qnaAskQuestionFragment2.mo105119c(C89361p.m154910b((CharSequence) str2).toString().length());
                TuxEditText tuxEditText8 = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                C89219l.m154716b(tuxEditText8, "");
                int selectionStart2 = tuxEditText8.getSelectionStart();
                TuxEditText tuxEditText9 = (TuxEditText) this.f148791b.mo27715a(R.id.lp);
                C89219l.m154716b(tuxEditText9, "");
                int selectionEnd = tuxEditText9.getSelectionEnd();
                if (EOYServiceImpl.m120048b().mo106960a((TextView) this.f148791b.mo27715a(R.id.lp))) {
                    ((TuxEditText) this.f148791b.mo27715a(R.id.lp)).post(new RunnableC66083a(selectionStart2, selectionEnd, this));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$w */
    static final class RunnableC66092w implements Runnable {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148803a;

        /* renamed from: b */
        final /* synthetic */ User f148804b;

        /* renamed from: c */
        final /* synthetic */ View f148805c;

        static {
            Covode.recordClassIndex(77599);
        }

        RunnableC66092w(QnaAskQuestionFragment qnaAskQuestionFragment, User user, View view) {
            this.f148803a = qnaAskQuestionFragment;
            this.f148804b = user;
            this.f148805c = view;
        }

        public final void run() {
            Resources resources;
            String string;
            Context context = this.f148803a.getContext();
            if (context != null && (resources = context.getResources()) != null && (string = resources.getString(R.string.f1w, C80580in.m139684b(this.f148804b))) != null) {
                Context context2 = this.f148803a.getContext();
                if (context2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context2, "");
                C89219l.m154716b(string, "");
                ((C23329a) new C23329a(context2).mo38041b(this.f148805c).mo38034a(EnumC23352h.TOP)).mo38022a(string).mo38030a(3000L).mo38043b(false).mo38027a().mo38012d().mo38001a();
            }
        }
    }

    public QnaAskQuestionFragment() {
        IQAInvitationService b = QAInvitationService.m117786b();
        C89219l.m154716b(b, "");
        this.f148770f = b;
        this.f148771g = new ArrayList();
        this.f148772h = new ArrayList();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo105123g() {
        ArrayList arrayList;
        List<? extends IMUser> list = this.f148772h;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (T t : list) {
                String uid = t.getUid();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!C89219l.m154714a((Object) uid, (Object) g.getCurUserId())) {
                    arrayList3.add(t);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        this.f148772h = arrayList;
        List<? extends User> list2 = this.f148771g;
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (T t2 : list2) {
                String uid2 = t2.getUid();
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                if (!C89219l.m154714a((Object) uid2, (Object) g2.getCurUserId())) {
                    arrayList4.add(t2);
                }
            }
            arrayList2 = arrayList4;
        }
        this.f148771g = arrayList2;
        mo105116a(arrayList2);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
    /* renamed from: b */
    public final void mo61027b() {
        ArrayList<User> invitedUsers;
        User user;
        ArrayList<User> invitedUsers2 = mo105121e().getInvitedUsers();
        if (invitedUsers2 != null && !invitedUsers2.isEmpty()) {
            Keva repo = Keva.getRepo("question_repo");
            StringBuilder sb = new StringBuilder("ask_question_invite_message_show");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (repo.getBoolean(sb.append(g.getCurUserId()).toString(), true) && (invitedUsers = mo105121e().getInvitedUsers()) != null && (user = invitedUsers.get(0)) != null) {
                MultiAvatarView multiAvatarView = (MultiAvatarView) mo27715a(R.id.bq0);
                C89219l.m154716b(multiAvatarView, "");
                C89219l.m154716b(user, "");
                RunnableC66092w wVar = new RunnableC66092w(this, user, multiAvatarView);
                this.f148777n = wVar;
                multiAvatarView.postDelayed(wVar, 300);
                Keva repo2 = Keva.getRepo("question_repo");
                StringBuilder sb2 = new StringBuilder("ask_question_invite_message_show");
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                repo2.storeBoolean(sb2.append(g2.getCurUserId()).toString(), false);
            }
        }
    }

    /* renamed from: f */
    public final void mo105122f() {
        String str;
        String enterMethod;
        TuxEditText tuxEditText = (TuxEditText) mo27715a(R.id.lp);
        if (tuxEditText != null) {
            tuxEditText.getContext();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m117876i();
            }
            if (!C58029j.f132253e) {
                new C79459a(tuxEditText.getContext()).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            IAccountUserService g = C31575b.m65865g();
            String str2 = "";
            C89219l.m154716b(g, str2);
            if (!g.isLogin()) {
                AskQuestionParam d = mo105120d();
                if (d == null || (str = d.getEnterFrom()) == null) {
                    str = str2;
                }
                AskQuestionParam d2 = mo105120d();
                if (!(d2 == null || (enterMethod = d2.getEnterMethod()) == null)) {
                    str2 = enterMethod;
                }
                C58957c.m108325a(this, str, str2, new C66091v(this));
                return;
            }
            TuxButton tuxButton = (TuxButton) mo27715a(R.id.ln);
            if (tuxButton != null) {
                tuxButton.setLoading(true);
            }
            TuxButton tuxButton2 = (TuxButton) mo27715a(R.id.ln);
            if (tuxButton2 != null) {
                tuxButton2.setClickable(false);
            }
            TuxButton tuxButton3 = (TuxButton) mo27715a(R.id.lo);
            if (tuxButton3 != null) {
                tuxButton3.setClickable(false);
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) mo27715a(R.id.lq);
            if (constraintLayout != null) {
                constraintLayout.setClickable(false);
            }
            String valueOf = String.valueOf(tuxEditText.getText());
            mo105123g();
            if (this.f148769e == null) {
                String replace = new C89350l("(?m)^[ \t]*\r?\n").replace(valueOf, str2);
                Objects.requireNonNull(replace, "null cannot be cast to non-null type kotlin.CharSequence");
                if (C89361p.m154910b((CharSequence) replace).toString().length() == 0) {
                    mo105117a(true);
                    return;
                }
                QnaCreationViewModel h = m117875h();
                CharSequence b = C89361p.m154910b((CharSequence) valueOf);
                List<? extends User> list = this.f148771g;
                C89219l.m154721d(b, str2);
                h.mo20662a(QnaCreationViewModel.C66349a.f149188a);
                try {
                    String a = QnaCreationViewModel.m117998a(list);
                    AbstractC66042f fVar = h.f149187j.f148704b;
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, str2);
                    String curUserId = g2.getCurUserId();
                    C89219l.m154716b(curUserId, str2);
                    Long g3 = C89361p.m154865g(curUserId);
                    String obj = b.toString();
                    C89219l.m154716b(a, str2);
                    AbstractC88412b a2 = fVar.mo105101a(g3, obj, a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new QnaCreationViewModel.C66350b(h), new QnaCreationViewModel.C66351c(h));
                    C89219l.m154716b(a2, str2);
                    h.mo20659a(a2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$m */
    static final class View$OnClickListenerC66076m implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148787a;

        static {
            Covode.recordClassIndex(77583);
        }

        View$OnClickListenerC66076m(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f148787a = qnaAskQuestionFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f148787a.mo105115a(new AbstractC89171a<C89391z>(this.f148787a) {
                /* class com.p2082ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment.View$OnClickListenerC66076m.C660771 */

                static {
                    Covode.recordClassIndex(77584);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    ArrayList arrayList;
                    QnaAskQuestionFragment qnaAskQuestionFragment = (QnaAskQuestionFragment) this.receiver;
                    qnaAskQuestionFragment.mo105123g();
                    TuxEditText tuxEditText = (TuxEditText) qnaAskQuestionFragment.mo27715a(R.id.lp);
                    if (tuxEditText != null) {
                        if (qnaAskQuestionFragment.f148769e == null) {
                            IAccountUserService g = C31575b.m65865g();
                            C89219l.m154716b(g, "");
                            String curUserId = g.getCurUserId();
                            IAccountUserService g2 = C31575b.m65865g();
                            C89219l.m154716b(g2, "");
                            String e = C80580in.m139690e(g2.getCurUser());
                            IAccountUserService g3 = C31575b.m65865g();
                            C89219l.m154716b(g3, "");
                            String avatarUrl = g3.getAvatarUrl();
                            IAccountUserService g4 = C31575b.m65865g();
                            C89219l.m154716b(g4, "");
                            String curSecUserId = g4.getCurSecUserId();
                            List<? extends User> list = qnaAskQuestionFragment.f148771g;
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    String uid = it.next().getUid();
                                    C89219l.m154716b(uid, "");
                                    arrayList2.add(Long.valueOf(Long.parseLong(uid)));
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = null;
                            }
                            Context context = tuxEditText.getContext();
                            if (context != null) {
                                CommentService e2 = CommentServiceImpl.m73664e();
                                C89219l.m154716b(curUserId, "");
                                long parseLong = Long.parseLong(curUserId);
                                UrlModel urlModel = new UrlModel();
                                urlModel.setUri(avatarUrl);
                                urlModel.setUrlList(C89070n.m154516a(avatarUrl));
                                String valueOf = String.valueOf(tuxEditText.getText());
                                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                                String obj = C89361p.m154910b((CharSequence) valueOf).toString();
                                if (arrayList == null) {
                                    arrayList = C89086z.INSTANCE;
                                }
                                e2.mo63288a(context, new QaStruct(0, parseLong, 0, urlModel, e, obj, curSecUserId, arrayList, null, 261, null), qnaAskQuestionFragment.mo105121e().getEnterFrom(), "ask_textual_question", "question");
                            }
                        } else if (qnaAskQuestionFragment.f148769e != null) {
                            String.valueOf(tuxEditText.getText());
                        }
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$n */
    static final class View$OnClickListenerC66078n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148788a;

        static {
            Covode.recordClassIndex(77585);
        }

        View$OnClickListenerC66078n(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f148788a = qnaAskQuestionFragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f148788a.mo105115a(new AbstractC89171a<C89391z>(this.f148788a) {
                /* class com.p2082ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment.View$OnClickListenerC66078n.C660791 */

                static {
                    Covode.recordClassIndex(77586);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    ((QnaAskQuestionFragment) this.receiver).mo105122f();
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$t */
    static final class C66088t extends AbstractC89220m implements AbstractC89172b<BaseFragmentViewModel, C89391z> {

        /* renamed from: a */
        public static final C66088t f148798a = new C66088t();

        static {
            Covode.recordClassIndex(77595);
        }

        C66088t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseFragmentViewModel baseFragmentViewModel) {
            BaseFragmentViewModel baseFragmentViewModel2 = baseFragmentViewModel;
            C89219l.m154721d(baseFragmentViewModel2, "");
            baseFragmentViewModel2.config(C660891.f148799a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Window window;
        super.onCreate(bundle);
        mo27716a(C66088t.f148798a);
        ActivityC0945e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(16);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$j */
    static final class C66073j extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148783a;

        static {
            Covode.recordClassIndex(77580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66073j(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(1);
            this.f148783a = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            int i;
            C89219l.m154721d(th, "");
            String enterFrom = this.f148783a.mo105121e().getEnterFrom();
            List<? extends User> list = this.f148783a.f148771g;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            C66063a.m117874a(enterFrom, "ask_textual_question", 0L, Integer.valueOf(i), 0);
            this.f148783a.mo105117a(true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$r */
    static final class C66086r extends AbstractC89220m implements AbstractC89172b<List<? extends IMUser>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148796a;

        static {
            Covode.recordClassIndex(77593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66086r(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(1);
            this.f148796a = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends IMUser> list) {
            QnaAskQuestionFragment qnaAskQuestionFragment;
            List<? extends User> list2;
            List<? extends IMUser> list3 = list;
            C89219l.m154721d(list3, "");
            List<User> b = this.f148796a.f148770f.mo105005b(list3);
            boolean z = !C89219l.m154714a(this.f148796a.f148771g, b);
            this.f148796a.f148771g = b;
            this.f148796a.f148772h = list3;
            QnaAskQuestionFragment qnaAskQuestionFragment2 = this.f148796a;
            qnaAskQuestionFragment2.mo105116a(qnaAskQuestionFragment2.f148771g);
            if (z && (list2 = (qnaAskQuestionFragment = this.f148796a).f148771g) != null) {
                if (list2.size() == 1) {
                    new C23144b(qnaAskQuestionFragment).mo37635a(qnaAskQuestionFragment.getResources().getString(R.string.f27, C80580in.m139684b((User) list2.get(0)))).mo37637b();
                } else if (list2.size() > 1) {
                    new C23144b(qnaAskQuestionFragment).mo37635a(qnaAskQuestionFragment.getResources().getString(R.string.f26, C80580in.m139684b((User) list2.get(0)), Integer.valueOf(list2.size() - 1))).mo37637b();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$i */
    static final class C66072i extends AbstractC89220m implements AbstractC89172b<C66575a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148782a;

        static {
            Covode.recordClassIndex(77579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66072i(QnaAskQuestionFragment qnaAskQuestionFragment) {
            super(1);
            this.f148782a = qnaAskQuestionFragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C66575a aVar) {
            String str;
            Editable text;
            C66575a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            TuxEditText tuxEditText = (TuxEditText) this.f148782a.mo27715a(R.id.lp);
            if (tuxEditText == null || (text = tuxEditText.getText()) == null) {
                str = null;
            } else {
                str = text.toString();
            }
            int i = 0;
            if (!C89219l.m154714a((Object) this.f148782a.mo105121e().getEnterFrom(), (Object) "eoy_hub") || !C89219l.m154714a((Object) this.f148782a.mo105121e().getEnterMethod(), (Object) "click_header") || str == null || str.length() == 0 || !EOYServiceImpl.m120048b().mo106961a(str)) {
                SmartRouter.buildRoute(this.f148782a.getActivity(), "//qna/detail/").withParam("id", String.valueOf(aVar2.f149687a)).withParam("question_type", "textual").withParam("enter_from", this.f148782a.mo105121e().getEnterFrom()).withParam("enter_method", "ask_question").open();
                String enterFrom = this.f148782a.mo105121e().getEnterFrom();
                String enterMethod = this.f148782a.mo105121e().getEnterMethod();
                Long valueOf = Long.valueOf(aVar2.f149687a);
                C33744d dVar = new C33744d();
                if (enterFrom != null) {
                    dVar.mo59983a("enter_from", enterFrom);
                }
                if (enterMethod != null) {
                    dVar.mo59983a("enter_method", enterMethod);
                }
                if (valueOf != null) {
                    dVar.mo59981a("question_id", valueOf.longValue());
                }
                dVar.mo59983a("question_type", "textual");
                C39162r.m79460a("post_question", dVar.f79943a);
                String enterFrom2 = this.f148782a.mo105121e().getEnterFrom();
                Long valueOf2 = Long.valueOf(aVar2.f149687a);
                List<? extends User> list = this.f148782a.f148771g;
                if (list != null) {
                    i = list.size();
                }
                C66063a.m117874a(enterFrom2, "ask_textual_question", valueOf2, Integer.valueOf(i), 1);
            } else {
                KeyboardUtils.m70897c(this.f148782a.mo27715a(R.id.lp));
                ActivityC0945e activity = this.f148782a.getActivity();
                if (activity != null) {
                    activity.setResult(-1, new Intent().putExtra("question_id", String.valueOf(aVar2.f149687a)).putExtra("question_text", str));
                }
            }
            ActivityC0945e activity2 = this.f148782a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo105118b(int i) {
        int i2 = 8;
        if (1 <= i && 5 > i) {
            TuxTextView tuxTextView = (TuxTextView) mo27715a(R.id.lm);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            TuxButton tuxButton = (TuxButton) mo27715a(R.id.lo);
            if (tuxButton != null) {
                tuxButton.setEnabled(true);
            }
            TuxButton tuxButton2 = (TuxButton) mo27715a(R.id.lo);
            if (tuxButton2 != null) {
                tuxButton2.setIconTintColorRes(R.attr.bc);
            }
            TuxButton tuxButton3 = (TuxButton) mo27715a(R.id.ln);
            if (tuxButton3 != null) {
                tuxButton3.setEnabled(false);
            }
        } else if (5 <= i && 150 >= i) {
            TuxTextView tuxTextView2 = (TuxTextView) mo27715a(R.id.lm);
            if (tuxTextView2 != null) {
                if (i >= 130) {
                    i2 = 0;
                }
                tuxTextView2.setVisibility(i2);
            }
            TuxButton tuxButton4 = (TuxButton) mo27715a(R.id.lo);
            if (tuxButton4 != null) {
                tuxButton4.setEnabled(true);
            }
            TuxButton tuxButton5 = (TuxButton) mo27715a(R.id.lo);
            if (tuxButton5 != null) {
                tuxButton5.setIconTintColorRes(R.attr.bc);
            }
            TuxButton tuxButton6 = (TuxButton) mo27715a(R.id.ln);
            if (tuxButton6 != null) {
                tuxButton6.setEnabled(this.f148773i);
            }
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) mo27715a(R.id.lm);
            if (tuxTextView3 != null) {
                if (i != 0) {
                    i2 = 0;
                }
                tuxTextView3.setVisibility(i2);
            }
            TuxButton tuxButton7 = (TuxButton) mo27715a(R.id.lo);
            if (tuxButton7 != null) {
                tuxButton7.setEnabled(false);
            }
            TuxButton tuxButton8 = (TuxButton) mo27715a(R.id.lo);
            if (tuxButton8 != null) {
                tuxButton8.setIconTintColorRes(R.attr.bd);
            }
            TuxButton tuxButton9 = (TuxButton) mo27715a(R.id.ln);
            if (tuxButton9 != null) {
                tuxButton9.setEnabled(false);
            }
        }
    }

    /* renamed from: c */
    public final void mo105119c(int i) {
        ForegroundColorSpan foregroundColorSpan;
        Resources resources;
        Resources resources2;
        Resources resources3;
        Resources resources4;
        ForegroundColorSpan foregroundColorSpan2;
        Resources resources5;
        ForegroundColorSpan foregroundColorSpan3;
        Resources resources6;
        String valueOf = String.valueOf(i);
        ForegroundColorSpan foregroundColorSpan4 = null;
        if (!C80471gb.m139483a(getContext())) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf + "/150");
            if (i > 150 || i <= 0) {
                Context context = getContext();
                if (context == null || (resources5 = context.getResources()) == null) {
                    foregroundColorSpan2 = null;
                } else {
                    foregroundColorSpan2 = new ForegroundColorSpan(resources5.getColor(R.color.ly));
                }
                spannableStringBuilder.setSpan(foregroundColorSpan2, 0, valueOf.length(), 18);
            } else {
                Context context2 = getContext();
                if (context2 == null || (resources6 = context2.getResources()) == null) {
                    foregroundColorSpan3 = null;
                } else {
                    foregroundColorSpan3 = new ForegroundColorSpan(resources6.getColor(R.color.c5));
                }
                spannableStringBuilder.setSpan(foregroundColorSpan3, 0, valueOf.length(), 18);
            }
            Context context3 = getContext();
            if (!(context3 == null || (resources4 = context3.getResources()) == null)) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources4.getColor(R.color.c5));
            }
            spannableStringBuilder.setSpan(foregroundColorSpan4, valueOf.length(), spannableStringBuilder.length(), 18);
            TuxTextView tuxTextView = (TuxTextView) mo27715a(R.id.lm);
            if (tuxTextView != null) {
                tuxTextView.setText(spannableStringBuilder);
                return;
            }
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("150/" + valueOf);
        Context context4 = getContext();
        if (context4 == null || (resources3 = context4.getResources()) == null) {
            foregroundColorSpan = null;
        } else {
            foregroundColorSpan = new ForegroundColorSpan(resources3.getColor(R.color.c5));
        }
        spannableStringBuilder2.setSpan(foregroundColorSpan, 0, 4, 18);
        if (i > 150 || i <= 0) {
            Context context5 = getContext();
            if (!(context5 == null || (resources = context5.getResources()) == null)) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources.getColor(R.color.ly));
            }
            spannableStringBuilder2.setSpan(foregroundColorSpan4, 4, spannableStringBuilder2.length(), 18);
        } else {
            Context context6 = getContext();
            if (!(context6 == null || (resources2 = context6.getResources()) == null)) {
                foregroundColorSpan4 = new ForegroundColorSpan(resources2.getColor(R.color.c5));
            }
            spannableStringBuilder2.setSpan(foregroundColorSpan4, 4, spannableStringBuilder2.length(), 18);
        }
        TuxTextView tuxTextView2 = (TuxTextView) mo27715a(R.id.lm);
        if (tuxTextView2 != null) {
            tuxTextView2.setText(spannableStringBuilder2);
        }
    }

    /* renamed from: a */
    public final void mo105115a(AbstractC89171a<C89391z> aVar) {
        IAccountUserService g = C31575b.m65865g();
        String str = "";
        C89219l.m154716b(g, str);
        if (!g.isLogin()) {
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                String enterFrom = mo105121e().getEnterFrom();
                if (enterFrom == null) {
                    enterFrom = str;
                }
                String enterMethod = mo105121e().getEnterMethod();
                if (enterMethod != null) {
                    str = enterMethod;
                }
                C58957c.m108321a(activity, enterFrom, str, new C66093x(this, aVar));
                return;
            }
            return;
        }
        aVar.invoke();
    }

    /* renamed from: a */
    public final void mo105116a(List<? extends User> list) {
        boolean z;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            MultiAvatarView multiAvatarView = (MultiAvatarView) mo27715a(R.id.bq0);
            if (multiAvatarView != null) {
                multiAvatarView.setVisibility(8);
            }
            TuxTextView tuxTextView = (TuxTextView) mo27715a(R.id.bq1);
            if (tuxTextView != null) {
                tuxTextView.setVisibility(0);
                return;
            }
            return;
        }
        MultiAvatarView multiAvatarView2 = (MultiAvatarView) mo27715a(R.id.bq0);
        if (multiAvatarView2 != null) {
            multiAvatarView2.setVisibility(0);
        }
        TuxTextView tuxTextView2 = (TuxTextView) mo27715a(R.id.bq1);
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(8);
        }
        MultiAvatarView multiAvatarView3 = (MultiAvatarView) mo27715a(R.id.bq0);
        if (multiAvatarView3 != null) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            multiAvatarView3.mo125016a(a, C89241a.m154730a(TypedValue.applyDimension(1, 13.5f, system2.getDisplayMetrics())));
        }
        MultiAvatarView multiAvatarView4 = (MultiAvatarView) mo27715a(R.id.bq0);
        if (multiAvatarView4 != null) {
            multiAvatarView4.mo125017a(list, (long) list.size());
        }
    }

    /* renamed from: a */
    public final void mo105117a(boolean z) {
        Integer num;
        int i;
        int i2;
        Editable text;
        TuxEditText tuxEditText = (TuxEditText) mo27715a(R.id.lp);
        if (tuxEditText == null || (text = tuxEditText.getText()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(text.length());
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        mo105118b(i);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        mo105119c(i2);
        TuxButton tuxButton = (TuxButton) mo27715a(R.id.ln);
        if (tuxButton != null) {
            tuxButton.setLoading(false);
        }
        TuxButton tuxButton2 = (TuxButton) mo27715a(R.id.ln);
        if (tuxButton2 != null) {
            tuxButton2.setClickable(true);
        }
        TuxButton tuxButton3 = (TuxButton) mo27715a(R.id.lo);
        if (tuxButton3 != null) {
            tuxButton3.setClickable(true);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) mo27715a(R.id.lq);
        if (constraintLayout != null) {
            constraintLayout.setClickable(true);
        }
        if (z) {
            new C23144b(this).mo37640e(R.string.f19).mo37637b();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TuxTextView tuxTextView;
        TuxNavBar tuxNavBar;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        Context context = getContext();
        int i = 0;
        if (!(context == null || (tuxNavBar = (TuxNavBar) mo27715a(R.id.lr)) == null)) {
            TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
            C23187b a = new C23187b().mo37738a(R.raw.icon_x_mark);
            a.f54930b = true;
            TuxNavBar.C23179a a2 = aVar.mo37732a(a.mo37741a((AbstractC89171a<C89391z>) new C66075l(this)));
            C23194g gVar = new C23194g();
            String string = context.getString(R.string.f17);
            C89219l.m154716b(string, "");
            TuxNavBar.C23179a a3 = a2.mo37731a(gVar.mo37753a(string));
            a3.f54919d = true;
            tuxNavBar.setNavActions(a3);
        }
        TuxButton tuxButton = (TuxButton) mo27715a(R.id.lo);
        if (tuxButton != null) {
            tuxButton.setOnClickListener(new View$OnClickListenerC66076m(this));
        }
        TuxButton tuxButton2 = (TuxButton) mo27715a(R.id.ln);
        if (tuxButton2 != null) {
            tuxButton2.setOnClickListener(new View$OnClickListenerC66078n(this));
        }
        TuxEditText tuxEditText = (TuxEditText) mo27715a(R.id.lp);
        if (tuxEditText != null) {
            tuxEditText.setRawInputType(1);
        }
        TuxEditText tuxEditText2 = (TuxEditText) mo27715a(R.id.lp);
        if (tuxEditText2 != null) {
            tuxEditText2.setOnEditorActionListener(new C66080o(this));
        }
        TuxEditText tuxEditText3 = (TuxEditText) mo27715a(R.id.lp);
        if (tuxEditText3 != null) {
            tuxEditText3.addTextChangedListener(new C66082p(this));
        }
        ((ConstraintLayout) mo27715a(R.id.lq)).setOnClickListener(new View$OnClickListenerC66084q(this));
        mo105117a(false);
        m117877j();
        AskQuestionParam e = mo105121e();
        String enterFrom = e.getEnterFrom();
        String enterMethod = e.getEnterMethod();
        C33744d dVar = new C33744d();
        if (enterFrom != null) {
            dVar.mo59983a("enter_from", enterFrom);
        }
        if (enterMethod != null) {
            dVar.mo59983a("enter_method", enterMethod);
        }
        C39162r.m79460a("ask_question", dVar.f79943a);
        String question = e.getQuestion();
        if (question != null && question.length() > 0 && question.length() <= 150) {
            TuxEditText tuxEditText4 = (TuxEditText) mo27715a(R.id.lp);
            if (tuxEditText4 != null) {
                tuxEditText4.setText(question);
            }
            TuxEditText tuxEditText5 = (TuxEditText) mo27715a(R.id.lp);
            if (tuxEditText5 != null) {
                tuxEditText5.post(new RunnableC66074k(question, this));
            }
        }
        ArrayList<User> invitedUsers = e.getInvitedUsers();
        if (invitedUsers != null && (!invitedUsers.isEmpty())) {
            this.f148771g = invitedUsers;
            this.f148772h = this.f148770f.mo105001a(invitedUsers);
        }
        String bannerText = e.getBannerText();
        if (!(bannerText == null || bannerText.length() <= 0 || (tuxTextView = (TuxTextView) mo27715a(R.id.lj)) == null)) {
            tuxTextView.setText(bannerText);
        }
        if (e.getBannerShow()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) mo27715a(R.id.lk);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
        } else {
            String bannerText2 = e.getBannerText();
            if (bannerText2 == null || bannerText2.length() == 0) {
                Keva repo = Keva.getRepo("question_repo");
                StringBuilder sb = new StringBuilder("ask_question_banner_message_show");
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (repo.getBoolean(sb.append(g.getCurUserId()).toString(), true)) {
                    Keva repo2 = Keva.getRepo("question_repo");
                    StringBuilder sb2 = new StringBuilder("ask_question_banner_message_show");
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    repo2.storeBoolean(sb2.append(g2.getCurUserId()).toString(), false);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) mo27715a(R.id.lk);
                    if (constraintLayout2 != null) {
                        constraintLayout2.setVisibility(0);
                    }
                }
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) mo27715a(R.id.lk);
            if (constraintLayout3 != null) {
                constraintLayout3.setVisibility(8);
            }
        }
        TuxButton tuxButton3 = (TuxButton) mo27715a(R.id.lo);
        if (tuxButton3 != null) {
            if (!e.getRecordShow()) {
                i = 8;
            }
            tuxButton3.setVisibility(i);
        }
        if (e.getAutoInvite()) {
            ((ConstraintLayout) mo27715a(R.id.lq)).callOnClick();
        }
        mo105116a(this.f148771g);
        AssemViewModel.m23030a(m117875h(), C66157l.f148882a, C12856l.m23100a(), new C66073j(this), null, new C66072i(this), 8);
        KeyboardUtils.m70895a(this, getView(), this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.aqk, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment$o */
    static final class C66080o implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ QnaAskQuestionFragment f148789a;

        static {
            Covode.recordClassIndex(77587);
        }

        C66080o(QnaAskQuestionFragment qnaAskQuestionFragment) {
            this.f148789a = qnaAskQuestionFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            TuxButton tuxButton = (TuxButton) this.f148789a.mo27715a(R.id.ln);
            C89219l.m154716b(tuxButton, "");
            if (!tuxButton.isEnabled()) {
                return false;
            }
            TuxButton tuxButton2 = (TuxButton) this.f148789a.mo27715a(R.id.ln);
            C89219l.m154716b(tuxButton2, "");
            if (!tuxButton2.isClickable()) {
                return false;
            }
            this.f148789a.mo105115a(new AbstractC89171a<C89391z>(this.f148789a) {
                /* class com.p2082ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment.C66080o.C660811 */

                static {
                    Covode.recordClassIndex(77588);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    ((QnaAskQuestionFragment) this.receiver).mo105122f();
                    return C89391z.f203057a;
                }
            });
            return true;
        }
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
    /* renamed from: a */
    public final <S extends AbstractC12853j, A> void mo20509a(AssemViewModel<S> assemViewModel, AbstractC89290k<S, ? extends A> kVar, C12854k<C12793o<A>> kVar2, AbstractC89172b<? super Throwable, C89391z> bVar, AbstractC89183m<? super AbstractC22876d, ? super A, C89391z> mVar) {
        C89219l.m154721d(assemViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(mVar, "");
        AbstractC12846h.C12847a.m23093a(this, assemViewModel, kVar, kVar2, bVar, mVar);
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
