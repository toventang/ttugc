package com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1214u;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23048e;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39256o;
import com.p2082ss.android.ugc.aweme.compliance.privacy.data.C39659b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.p2666a.C39631a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.C39699a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.PrivacySettingViewModel;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39810a;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.C39823c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.CanQuitBusinessAccountApi;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39713b;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i;
import com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.C39723h;
import com.p2082ss.android.ugc.aweme.compliance.privacy.utils.C40043a;
import com.p2082ss.android.ugc.aweme.metrics.C59206ab;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.aweme.setting.verification.C68707c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b */
public final class C39815b extends AbstractC39714c implements AbstractC39718e.AbstractC39719a, AbstractC39724i {

    /* renamed from: a */
    public final PrivacySettingViewModel f93732a;

    /* renamed from: b */
    private final AbstractC89244h f93733b = C89250i.m154773a((AbstractC89171a) C39821f.f93747a);

    /* renamed from: c */
    private boolean f93734c;

    static {
        Covode.recordClassIndex(47546);
    }

    /* renamed from: b */
    public final C39256o mo69128b() {
        return (C39256o) this.f93733b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b$f */
    static final class C39821f extends AbstractC89220m implements AbstractC89171a<C39256o> {

        /* renamed from: a */
        public static final C39821f f93747a = new C39821f();

        static {
            Covode.recordClassIndex(47552);
        }

        C39821f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39256o invoke() {
            return C39659b.m80537a(0, "private_account");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final AbstractC39714c.AbstractC39715a mo69094a() {
        return new C39818c(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
    /* renamed from: c */
    public final boolean mo69102c() {
        return C39699a.m80581a(mo69128b()).f93535a;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39724i
    /* renamed from: d */
    public final boolean mo69103d() {
        return C39699a.m80581a(mo69128b()).f93536b;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b$a */
    static final class C39816a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39815b f93735a;

        /* renamed from: b */
        final /* synthetic */ View f93736b;

        /* renamed from: c */
        final /* synthetic */ C39723h f93737c;

        static {
            Covode.recordClassIndex(47547);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39816a(C39815b bVar, View view, C39723h hVar) {
            super(0);
            this.f93735a = bVar;
            this.f93736b = view;
            this.f93737c = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C39256o b = this.f93735a.mo69128b();
            View view = this.f93737c.itemView;
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            C39699a.m80584a(b, context);
            return C89391z.f203057a;
        }
    }

    /* renamed from: e */
    public final boolean mo69129e() {
        return C89219l.m154714a((Object) this.f93732a.f93549d.getValue(), (Object) true);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b$b */
    static final class C39817b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C39815b f93738a;

        /* renamed from: b */
        final /* synthetic */ View f93739b;

        /* renamed from: c */
        final /* synthetic */ C39723h f93740c;

        static {
            Covode.recordClassIndex(47548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39817b(C39815b bVar, View view, C39723h hVar) {
            super(0);
            this.f93738a = bVar;
            this.f93739b = view;
            this.f93740c = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            int i;
            C39723h hVar = this.f93740c;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.PrivateAccountViewHolder");
            C39823c cVar = (C39823c) hVar;
            boolean e = this.f93738a.mo69129e();
            if (C39631a.m80487c()) {
                View view = cVar.itemView;
                C89219l.m154716b(view, "");
                new C23144b(view).mo37640e(R.string.bu2).mo37637b();
                C40043a.m80999a("PRIVACY_SETTING_ALOG", "Force private account: can't modify");
            } else {
                if (e) {
                    String c = cVar.mo69136c();
                    C89219l.m154721d(c, "");
                    C39162r.m79460a("private_account_on", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").mo59983a("enter_method", c).f79943a);
                } else {
                    String c2 = cVar.mo69136c();
                    C89219l.m154721d(c2, "");
                    C39162r.m79460a("private_account_off", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").mo59983a("enter_method", c2).f79943a);
                }
                C40043a.m80999a("PRIVACY_SETTING_ALOG", "handlePrivateAccountClick - Start");
                View view2 = cVar.itemView;
                C89219l.m154716b(view2, "");
                Context context = view2.getContext();
                if (context != null) {
                    User e2 = C39631a.m80489e();
                    if (C39823c.C39824a.m80749a(e2) && !C39631a.m80486b() && !cVar.mo69135b()) {
                        C40043a.m80999a("PRIVACY_SETTING_ALOG", "Pro account: open private account");
                        if (e2.getAccountType() == 3) {
                            C40043a.m80999a("PRIVACY_SETTING_ALOG", "Business account: quit check, call /aweme/v1/ad/ba/quitcheck/");
                            AbstractC88979t<BaseResponse> a = CanQuitBusinessAccountApi.C39809a.f93724a.check().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
                            C89219l.m154716b(a, "");
                            cVar.f93750a.mo142945a(a.mo143254a(new C39823c.C39826c(cVar, e2), new C39823c.C39827d(cVar)));
                        } else {
                            C40043a.m80999a("PRIVACY_SETTING_ALOG", "Pro account but not business: showPrivacyDialog");
                            cVar.mo69131a(e2);
                        }
                    } else if (cVar.mo69135b()) {
                        C59206ab.m108755a("shield_off").mo96746b(StringSet.type, "account").mo96792f();
                        C40043a.m80999a("PRIVACY_SETTING_ALOG", "Personal account: close private account, showChangePrivacyAlert");
                        C40043a.m80999a("PRIVACY_SETTING_ALOG", "Close private account alert dialog: show");
                        C39162r.m79460a("show_private_account_pop_up", new C33744d().mo59983a("enter_from", "privacy_and_safety_settings").f79943a);
                        View view3 = cVar.itemView;
                        C89219l.m154716b(view3, "");
                        Context context2 = view3.getContext();
                        C89219l.m154716b(context2, "");
                        C23048e eVar = new C23048e(context2);
                        if (QnaService.m117969a().enablePublicQna()) {
                            i = R.string.f39;
                        } else {
                            i = R.string.ab0;
                        }
                        ((C23048e) eVar.mo37483b(i).mo37479a(R.string.aax)).mo37443a(R.string.as0, new C39823c.DialogInterface$OnClickListenerC39841i(cVar)).mo37444a(new C39823c.DialogInterface$OnClickListenerC39842j(cVar)).mo37442a().mo37396b().show();
                    } else {
                        C40043a.m80999a("PRIVACY_SETTING_ALOG", "Personal account: open private account");
                        C89219l.m154721d(e2, "");
                        C68707c cVar2 = new C68707c();
                        AbstractC88979t a2 = AbstractC88979t.m154294a(new C39810a.C39811a(cVar2, e2)).mo143265a(C88446a.f200698d, new C39810a.C39813b(cVar2)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
                        C89219l.m154716b(a2, "");
                        cVar.f93750a.mo142945a(a2.mo143254a(new C39823c.C39829e(cVar, context), C39823c.C39831f.f93761a));
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b$d */
    static final class C39819d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39815b f93743a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39718e f93744b;

        static {
            Covode.recordClassIndex(47550);
        }

        C39819d(C39815b bVar, AbstractC39718e eVar) {
            this.f93743a = bVar;
            this.f93744b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC39713b.m80597a(this.f93744b, this.f93743a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b$e */
    static final class C39820e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39815b f93745a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39718e f93746b;

        static {
            Covode.recordClassIndex(47551);
        }

        C39820e(C39815b bVar, AbstractC39718e eVar) {
            this.f93745a = bVar;
            this.f93746b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC39713b.m80597a(this.f93746b, this.f93745a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b$c */
    public static final class C39818c implements AbstractC39714c.AbstractC39715a {

        /* renamed from: a */
        final /* synthetic */ C39815b f93741a;

        /* renamed from: b */
        final /* synthetic */ int f93742b = R.layout.un;

        static {
            Covode.recordClassIndex(47549);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39818c(C39815b bVar) {
            this.f93741a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c.AbstractC39715a
        /* renamed from: a */
        public final C39723h mo69096a(Context context, ViewGroup viewGroup) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(viewGroup, "");
            View a = C1764a.m5927a(LayoutInflater.from(context), this.f93742b, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C39823c(a, this.f93741a.f93732a);
        }
    }

    public C39815b(PrivacySettingViewModel privacySettingViewModel) {
        C89219l.m154721d(privacySettingViewModel, "");
        this.f93732a = privacySettingViewModel;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39718e.AbstractC39719a
    /* renamed from: a */
    public final void mo69100a(AbstractC39718e eVar) {
        C89219l.m154721d(eVar, "");
        this.f93732a.f93549d.observe(eVar, new C39819d(this, eVar));
        this.f93732a.f93550e.observe(eVar, new C39820e(this, eVar));
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.privacy.settings.account.items.privateaccount.b$g */
    static final class C39822g extends AbstractC89220m implements AbstractC89172b<C33743c, C33743c> {

        /* renamed from: a */
        public static final C39822g f93748a = new C39822g();

        static {
            Covode.recordClassIndex(47553);
        }

        C39822g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C33743c invoke(C33743c cVar) {
            C33743c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            C40043a.m80991a(cVar2, "Private account state");
            C40043a.m80992a(cVar2, "cur_value", Boolean.valueOf(C39631a.m80486b()));
            C40043a.m80992a(cVar2, "pro_account", Boolean.valueOf(C39823c.C39824a.m80749a(C39631a.m80489e())));
            return C40043a.m80992a(cVar2, "force_private_account", Boolean.valueOf(C39631a.m80487c()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.privacy.settings.account.p2669a.AbstractC39714c
    /* renamed from: a */
    public final void mo69095a(C39723h hVar, int i) {
        int i2;
        View findViewById;
        C89219l.m154721d(hVar, "");
        View view = hVar.itemView;
        C89219l.m154716b(view, "");
        TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.bqp);
        Context context = view.getContext();
        tuxTextCell.setTitle(context.getString(R.string.esq));
        tuxTextCell.setSubtitle(context.getString(R.string.fob));
        tuxTextCell.setCellEnabled(mo69102c());
        C89219l.m154716b(tuxTextCell, "");
        if (mo69103d()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        tuxTextCell.setVisibility(i2);
        if (!(tuxTextCell.getAccessory() instanceof AbstractC23293c.C23309j)) {
            Context context2 = tuxTextCell.getContext();
            C89219l.m154716b(context2, "");
            tuxTextCell.setAccessory(new AbstractC23293c.C23309j(context2));
        }
        tuxTextCell.setCellEnabled(mo69102c());
        tuxTextCell.setLoading(C89219l.m154714a((Object) this.f93732a.f93550e.getValue(), (Object) true));
        AbstractC23293c.AbstractC23296b accessory = tuxTextCell.getAccessory();
        Objects.requireNonNull(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AbstractC23293c.AbstractC23299e eVar = (AbstractC23293c.AbstractC23299e) accessory;
        eVar.mo37959c(mo69129e());
        eVar.f55218a = new C39816a(this, view, hVar);
        eVar.mo37958a(new C39817b(this, view, hVar));
        if (this.f93732a.f93547b && !this.f93734c && (findViewById = tuxTextCell.findViewById(R.id.a2w)) != null) {
            this.f93734c = true;
            int c = C0643b.m2378c(findViewById.getContext(), R.color.gm);
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofObject = ObjectAnimator.ofObject(findViewById, "backgroundColor", new ArgbEvaluator(), -1, Integer.valueOf(c));
            ofObject.setInterpolator(new LinearInterpolator());
            ofObject.setStartDelay(500);
            ofObject.setDuration(300L);
            ObjectAnimator ofObject2 = ObjectAnimator.ofObject(findViewById, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(c), -1);
            ofObject2.setInterpolator(new LinearInterpolator());
            ofObject2.setStartDelay(800);
            ofObject2.setDuration(300L);
            animatorSet.playSequentially(ofObject, ofObject2);
            animatorSet.start();
        }
        C40043a.m80998a("PRIVACY_SETTING_ALOG", C39822g.f93748a);
    }
}
