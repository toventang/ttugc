package com.p2082ss.android.ugc.aweme.profile.widgets.p3598k;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12777b;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63420af;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63786o;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64024bj;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64205aa;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64314y;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64615i;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.AbstractC64868e;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.a */
public final class C64900a extends AbstractC12769a implements AbstractC64907d {

    /* renamed from: j */
    public boolean f146716j;

    /* renamed from: k */
    public boolean f146717k;

    /* renamed from: l */
    private TextView f146718l;

    /* renamed from: m */
    private ProfileViewModel f146719m;

    static {
        Covode.recordClassIndex(76367);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: j */
    public final void mo20525j() {
        super.mo20525j();
        if (this.f146717k && this.f146716j) {
            C64314y.m116176a();
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public final void mo20518f() {
        super.mo20518f();
        Fragment a = C12777b.m22999a((AbstractC1204m) this);
        if (a != null) {
            this.f146719m = ProfileViewModel.C64397a.m116300a(a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.a$b */
    public static final class C64902b implements C64024bj.AbstractC64026b {

        /* renamed from: a */
        final /* synthetic */ C64900a f146721a;

        static {
            Covode.recordClassIndex(76369);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C64902b(C64900a aVar) {
            this.f146721a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64024bj.AbstractC64026b
        /* renamed from: a */
        public final void mo102003a(String str) {
            C89219l.m154721d(str, "");
            ((AbstractC64868e) C12801d.m23018a(this.f146721a, C89204ab.m154669a(AbstractC64868e.class))).mo104214a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.a$c */
    static final class C64903c extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64900a f146722a;

        static {
            Covode.recordClassIndex(76370);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64903c(C64900a aVar) {
            super(1);
            this.f146722a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            this.f146722a.f146717k = bool.booleanValue();
            if (this.f146722a.f146717k && this.f146722a.f146716j) {
                C64314y.m116176a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.a$d */
    static final class C64904d extends AbstractC89220m implements AbstractC89172b<C12776a<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64900a f146723a;

        static {
            Covode.recordClassIndex(76371);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64904d(C64900a aVar) {
            super(1);
            this.f146723a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C12776a<? extends User> aVar) {
            T t;
            C12776a<? extends User> aVar2 = aVar;
            if (!(aVar2 == null || (t = aVar2.f31085a) == null)) {
                C64900a aVar3 = this.f146723a;
                t.getFollowStatus();
                aVar3.mo104258a(t.getSignature());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        if (!(view instanceof TextView)) {
            view = null;
        }
        this.f146718l = (TextView) view;
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64905b.f146724a, new C64903c(this));
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64616j.class), C64906c.f146725a, new C64904d(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.k.a$a */
    public static final class View$OnClickListenerC64901a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64900a f146720a;

        static {
            Covode.recordClassIndex(76368);
        }

        View$OnClickListenerC64901a(C64900a aVar) {
            this.f146720a = aVar;
        }

        public final void onClick(View view) {
            User user;
            String str;
            ClickAgent.onClick(view);
            C39162r.m79460a("enter_profile_bio", new C33744d().mo59983a("enter_method", "click_hint").f79943a);
            this.f146720a.f146716j = false;
            C64900a aVar = this.f146720a;
            C89219l.m154716b(view, "");
            C64615i iVar = (C64615i) C12801d.m23029f(aVar, C89204ab.m154669a(AbstractC64616j.class));
            String str2 = null;
            if (iVar != null) {
                user = iVar.f146329a;
                if (user != null) {
                    str2 = user.getSignature();
                }
            } else {
                user = null;
            }
            if (TextUtils.isEmpty(str2) && !C58001a.m104815a(view, 1200)) {
                Keva keva = C64205aa.f145624a;
                if (keva != null) {
                    keva.storeBoolean("profile_v2_show_bio_hint", false);
                }
                if (user == null || (str = user.getSignature()) == null) {
                    str = "";
                }
                C64024bj a = C64024bj.C64025a.m115784a("bio", str);
                a.setUserVisibleHint(true);
                a.mo103592a(new C64902b(aVar));
                ActivityC0945e b = C12777b.m23004b(aVar);
                if (b != null) {
                    AbstractC0952i supportFragmentManager = b.getSupportFragmentManager();
                    C89219l.m154716b(supportFragmentManager, "");
                    a.show(supportFragmentManager, "EditNicknameDialog");
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.p3598k.AbstractC64907d
    /* renamed from: a */
    public final void mo104258a(String str) {
        ProfileViewModel profileViewModel = this.f146719m;
        if (profileViewModel != null) {
            profileViewModel.mo104032b(C63786o.m115355e());
        }
        TextView textView = this.f146718l;
        User user = null;
        String str2 = null;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        if (!C39223a.m79589c().mo68606a(4) && !C80580in.m139687c() && TextUtils.isEmpty(str) && C64205aa.f145624a != null) {
            Keva keva = C64205aa.f145624a;
            if (keva == null) {
                C89219l.m154715b();
            }
            if (keva.getBoolean("profile_v2_show_bio_hint", true)) {
                this.f146716j = true;
                TextView textView2 = this.f146718l;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                    Context az_ = az_();
                    if (az_ != null) {
                        str2 = az_.getString(R.string.dnm);
                    }
                    textView2.setText(str2);
                    textView2.setOnClickListener(new View$OnClickListenerC64901a(this));
                    return;
                }
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            TextView textView3 = this.f146718l;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        C64615i iVar = (C64615i) C12801d.m23029f(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            user = iVar.f146329a;
        }
        TextView textView4 = this.f146718l;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        if (C80580in.m139694g(user) && C80580in.m139687c()) {
            TextView textView5 = this.f146718l;
            if (textView5 != null) {
                textView5.setText(R.string.fxt);
            }
        } else if (this.f31048h) {
            C63420af.m114998a(this.f146718l, str);
        }
    }
}
