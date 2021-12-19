package com.p2082ss.android.ugc.aweme.setting.unit.privacy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.table.cell.EnumC23292b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.p2386be.C34796d;
import com.p2082ss.android.ugc.aweme.p2727db.C40934c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.p3720h.C68083a;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.setting.page.privacy.p3727a.C68313a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p2082ss.android.ugc.aweme.setting.serverpush.api.SocialRelationDataCheckResponse;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68353e;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.TimeUnit;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4617i.AbstractC89255c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d */
public final class View$OnClickListenerC68647d extends C40934c implements View.OnClickListener, AbstractC68350b {

    /* renamed from: j */
    public static final C68648a f153615j = new C68648a((byte) 0);

    /* renamed from: a */
    public C88411a f153616a = new C88411a();

    /* renamed from: b */
    boolean f153617b;

    /* renamed from: c */
    public C68353e f153618c;

    /* renamed from: d */
    public long f153619d;

    /* renamed from: e */
    public long f153620e;

    /* renamed from: f */
    public int f153621f;

    /* renamed from: g */
    public final String f153622g = "click";

    /* renamed from: h */
    public AbstractC88412b f153623h;

    /* renamed from: i */
    public final AbstractC68195a f153624i;

    /* renamed from: m */
    private boolean f153625m;

    /* renamed from: n */
    private final AbstractC89244h f153626n = C89250i.m154773a((AbstractC89171a) new C68651d(this));

    /* renamed from: o */
    private final AbstractC89244h f153627o;

    static {
        Covode.recordClassIndex(80907);
    }

    /* renamed from: e */
    public final Context mo109143e() {
        return (Context) this.f153626n.getValue();
    }

    /* renamed from: f */
    public final FindCtxViewModel mo109144f() {
        return (FindCtxViewModel) this.f153627o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$a */
    public static final class C68648a {
        static {
            Covode.recordClassIndex(80908);
        }

        private C68648a() {
        }

        public /* synthetic */ C68648a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void cm_() {
        mo109148j();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34796d mo70128b() {
        return mo70128b();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$d */
    static final class C68651d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68647d f153630a;

        static {
            Covode.recordClassIndex(80911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68651d(View$OnClickListenerC68647d dVar) {
            super(0);
            this.f153630a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            return this.f153630a.f153624i.getActivity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$j */
    static final class C68660j extends AbstractC89220m implements AbstractC89171a<FindCtxViewModel> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68647d f153640a;

        static {
            Covode.recordClassIndex(80920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68660j(View$OnClickListenerC68647d dVar) {
            super(0);
            this.f153640a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FindCtxViewModel invoke() {
            return C1181ae.m3879a(this.f153640a.f153624i, (C1175ad.AbstractC1177b) null).mo3983a(FindCtxViewModel.class);
        }
    }

    /* renamed from: h */
    public final void mo109146h() {
        this.f153625m = false;
        mo70126a(C68652e.f153631a);
    }

    /* renamed from: i */
    public final void mo109147i() {
        this.f153625m = true;
        mo70126a(C68653f.f153632a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$g */
    public static final class RunnableC68654g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68647d f153633a;

        /* renamed from: b */
        final /* synthetic */ int f153634b;

        static {
            Covode.recordClassIndex(80914);
        }

        RunnableC68654g(View$OnClickListenerC68647d dVar, int i) {
            this.f153633a = dVar;
            this.f153634b = i;
        }

        public final void run() {
            int i = this.f153634b;
            if (i == 0) {
                this.f153633a.mo70126a(C686551.f153635a);
            } else if (i == 1) {
                this.f153633a.mo70126a(C686562.f153636a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void aD_() {
        new C79459a(mo109143e()).mo123050a(R.string.f_c).mo123053a();
        C68083a.m120381a(true);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: d */
    public final /* synthetic */ C34796d mo70131d() {
        C34796d dVar = (C34796d) super.mo70131d();
        C68353e eVar = new C68353e();
        eVar.mo67839a_(this);
        this.f153618c = eVar;
        mo109146h();
        mo109145g();
        return dVar;
    }

    /* renamed from: g */
    public final void mo109145g() {
        PushSettingsApiManager.m120624a(1).mo5534a(new C68649b(this), C1731i.f5562a, null);
    }

    /* renamed from: j */
    public final void mo109148j() {
        C68083a.m120381a(false);
        mo109147i();
        mo109142a(0);
        new C79459a(mo109143e()).mo123050a(R.string.bon).mo123053a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c
    /* renamed from: a */
    public final C34796d mo70133a() {
        EnumC23292b bVar = EnumC23292b.DESTRUCTIVE;
        String string = C17867d.m33078a().getString(R.string.f_e);
        C89219l.m154716b(string, "");
        return new C34796d(string, null, this, null, false, null, null, false, bVar, false, C17867d.m33078a().getString(R.string.f__), false, this, 108026);
    }

    /* renamed from: a */
    public final void mo109142a(int i) {
        C34727m.m70944a(new RunnableC68654g(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$e */
    public static final class C68652e extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        public static final C68652e f153631a = new C68652e();

        static {
            Covode.recordClassIndex(80912);
        }

        C68652e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34796d invoke(C34796d dVar) {
            C34796d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C34796d.m71048a(dVar2, null, null, null, null, false, null, null, null, false, null, false, null, false, false, null, false, 0, 126975);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$f */
    public static final class C68653f extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        public static final C68653f f153632a = new C68653f();

        static {
            Covode.recordClassIndex(80913);
        }

        C68653f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34796d invoke(C34796d dVar) {
            C34796d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            return C34796d.m71048a(dVar2, null, null, null, null, false, null, null, null, false, null, false, null, true, false, null, false, 0, 126975);
        }
    }

    public View$OnClickListenerC68647d(AbstractC68195a aVar) {
        C89219l.m154721d(aVar, "");
        this.f153624i = aVar;
        aVar.getLifecycle().mo4012a(new RemoveContactsUnit$1(this));
        this.f153627o = C89250i.m154773a((AbstractC89171a) new C68660j(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$i */
    static final class DialogInterface$OnClickListenerC68658i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68647d f153638a;

        static {
            Covode.recordClassIndex(80918);
        }

        DialogInterface$OnClickListenerC68658i(View$OnClickListenerC68647d dVar) {
            this.f153638a = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$i$a */
        static final class C68659a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ DialogInterface$OnClickListenerC68658i f153639a;

            static {
                Covode.recordClassIndex(80919);
            }

            C68659a(DialogInterface$OnClickListenerC68658i iVar) {
                this.f153639a = iVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C79546d dVar = (C79546d) obj;
                if (dVar.f178516a == EnumC79549g.SYNC_STATUS && !dVar.f178517b.f178518a) {
                    C89219l.m154716b(dVar, "");
                    C68646c cVar = new C68646c(dVar, "contact");
                    FindCtxViewModel f = this.f153639a.f153638a.mo109144f();
                    if (f != null) {
                        f.mo109138a(cVar);
                    }
                    this.f153639a.f153638a.f153616a.mo142944a();
                } else if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178520c != 0) {
                    new C79459a(this.f153639a.f153638a.mo109143e()).mo123050a(R.string.bon).mo123053a();
                    this.f153639a.f153638a.f153616a.mo142944a();
                }
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Context e;
            C68083a.m120382a(true, 1);
            C68313a.m120607b(true);
            this.f153638a.mo109142a(1);
            C68353e eVar = this.f153638a.f153618c;
            if (eVar != null) {
                eVar.mo57616a(1);
            }
            FindCtxViewModel f = this.f153638a.mo109144f();
            if (!(f == null || !f.f153607a || (e = this.f153638a.mo109143e()) == null)) {
                Class<? extends AbstractC79495a> c = C51648a.f118980a.mo87320c();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                AbstractC88412b d = C79515b.m138230b(e, c, curUser.getUid(), "privacy_setting", this.f153638a.f153622g).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C68659a(this));
                C89219l.m154716b(d, "");
                C88934a.m154195a(d, this.f153638a.f153616a);
            }
            View$OnClickListenerC68647d dVar = this.f153638a;
            dVar.f153623h = AbstractC88979t.m154282a(0, 1, TimeUnit.SECONDS).mo143289d(new C68650c(dVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$b */
    public static final class C68649b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68647d f153628a;

        static {
            Covode.recordClassIndex(80909);
        }

        C68649b(View$OnClickListenerC68647d dVar) {
            this.f153628a = dVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                if (!C89361p.m154872a("error", ((SocialRelationDataCheckResponse) iVar.mo5545d()).message, true)) {
                    if (!((SocialRelationDataCheckResponse) iVar.mo5545d()).getHasRemainingData()) {
                        AbstractC88412b bVar = this.f153628a.f153623h;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        if (C68313a.m120606a()) {
                            new C79459a(this.f153628a.mo109143e()).mo123050a(R.string.f_d).mo123053a();
                        }
                        this.f153628a.mo109146h();
                        C68313a.m120607b(false);
                        this.f153628a.mo109142a(0);
                    } else if (C68313a.m120606a()) {
                        this.f153628a.mo109142a(1);
                        this.f153628a.mo109146h();
                    } else {
                        this.f153628a.mo109142a(0);
                        this.f153628a.mo109147i();
                    }
                    return C89391z.f203057a;
                }
            }
            this.f153628a.mo109147i();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$c */
    static final class C68650c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68647d f153629a;

        static {
            Covode.recordClassIndex(80910);
        }

        C68650c(View$OnClickListenerC68647d dVar) {
            this.f153629a = dVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            if (this.f153629a.f153621f >= 10 || !C68313a.m120606a()) {
                AbstractC88412b bVar = this.f153629a.f153623h;
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f153629a.mo109148j();
                View$OnClickListenerC68647d dVar = this.f153629a;
                C68313a.m120607b(false);
                dVar.f153621f = 0;
                dVar.f153620e = 0;
                dVar.f153619d = 0;
            }
            long j = this.f153629a.f153620e + this.f153629a.f153619d;
            if (l != null && l.longValue() == j && this.f153629a.f153621f < 10) {
                this.f153629a.f153620e += this.f153629a.f153619d;
                this.f153629a.f153621f++;
                this.f153629a.f153619d = AbstractC89255c.Default.nextLong(5, 10);
                this.f153629a.mo109145g();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        C68083a.m120384c(1);
        if (this.f153625m) {
            C68083a.m120385d(1);
            new C17197a.C17200a(mo109143e()).mo27189a(R.string.f_e).mo27194b(R.string.f_a).mo27195b(R.string.f_8, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC68657h.f153637a, false).mo27190a(R.string.f_9, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC68658i(this), false).mo27193a().mo27185c();
            return;
        }
        new C79459a(view.getContext()).mo123050a(R.string.gfs).mo123053a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.d$h */
    static final class DialogInterface$OnClickListenerC68657h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC68657h f153637a = new DialogInterface$OnClickListenerC68657h();

        static {
            Covode.recordClassIndex(80917);
        }

        DialogInterface$OnClickListenerC68657h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C68083a.m120382a(false, 1);
        }
    }
}
