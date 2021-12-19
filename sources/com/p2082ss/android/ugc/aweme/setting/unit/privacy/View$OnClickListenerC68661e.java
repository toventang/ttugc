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
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.C68356f;
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

/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e */
public final class View$OnClickListenerC68661e extends C40934c implements View.OnClickListener, AbstractC68350b {

    /* renamed from: j */
    public static final C68662a f153641j = new C68662a((byte) 0);

    /* renamed from: a */
    public C88411a f153642a = new C88411a();

    /* renamed from: b */
    boolean f153643b;

    /* renamed from: c */
    public C68356f f153644c;

    /* renamed from: d */
    public long f153645d;

    /* renamed from: e */
    public long f153646e;

    /* renamed from: f */
    public int f153647f;

    /* renamed from: g */
    public final String f153648g = "click";

    /* renamed from: h */
    public AbstractC88412b f153649h;

    /* renamed from: i */
    public final AbstractC68195a f153650i;

    /* renamed from: m */
    private boolean f153651m;

    /* renamed from: n */
    private final AbstractC89244h f153652n = C89250i.m154773a((AbstractC89171a) new C68665d(this));

    /* renamed from: o */
    private final AbstractC89244h f153653o = C89250i.m154773a((AbstractC89171a) new C68674j(this));

    static {
        Covode.recordClassIndex(80921);
    }

    /* renamed from: e */
    public final Context mo109154e() {
        return (Context) this.f153652n.getValue();
    }

    /* renamed from: f */
    public final FindCtxViewModel mo109155f() {
        return (FindCtxViewModel) this.f153653o.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$a */
    public static final class C68662a {
        static {
            Covode.recordClassIndex(80922);
        }

        private C68662a() {
        }

        public /* synthetic */ C68662a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void cm_() {
        mo109156g();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34796d mo70128b() {
        return mo70128b();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$d */
    static final class C68665d extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68661e f153656a;

        static {
            Covode.recordClassIndex(80925);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68665d(View$OnClickListenerC68661e eVar) {
            super(0);
            this.f153656a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            return this.f153656a.f153650i.getActivity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$j */
    static final class C68674j extends AbstractC89220m implements AbstractC89171a<FindCtxViewModel> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68661e f153666a;

        static {
            Covode.recordClassIndex(80934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68674j(View$OnClickListenerC68661e eVar) {
            super(0);
            this.f153666a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FindCtxViewModel invoke() {
            return C1181ae.m3879a(this.f153666a.f153650i, (C1175ad.AbstractC1177b) null).mo3983a(FindCtxViewModel.class);
        }
    }

    /* renamed from: i */
    public final void mo109158i() {
        this.f153651m = false;
        mo70126a(C68666e.f153657a);
    }

    /* renamed from: j */
    public final void mo109159j() {
        this.f153651m = true;
        mo70126a(C68667f.f153658a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$g */
    public static final class RunnableC68668g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68661e f153659a;

        /* renamed from: b */
        final /* synthetic */ int f153660b;

        static {
            Covode.recordClassIndex(80928);
        }

        RunnableC68668g(View$OnClickListenerC68661e eVar, int i) {
            this.f153659a = eVar;
            this.f153660b = i;
        }

        public final void run() {
            int i = this.f153660b;
            if (i == 0) {
                this.f153659a.mo70126a(C686691.f153661a);
            } else if (i == 1) {
                this.f153659a.mo70126a(C686702.f153662a);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.setting.serverpush.p3729b.AbstractC68350b
    public final void aD_() {
        new C79459a(mo109154e()).mo123050a(R.string.f_c).mo123053a();
        C68083a.m120381a(true);
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: d */
    public final /* synthetic */ C34796d mo70131d() {
        super.mo70131d();
        C68356f fVar = new C68356f();
        fVar.mo67839a_(this);
        this.f153644c = fVar;
        mo109158i();
        mo109157h();
        return (C34796d) mo70132l();
    }

    /* renamed from: g */
    public final void mo109156g() {
        C68083a.m120381a(false);
        mo109159j();
        mo109153a(0);
        new C79459a(mo109154e()).mo123050a(R.string.bon).mo123053a();
    }

    /* renamed from: h */
    public final void mo109157h() {
        PushSettingsApiManager.m120624a(2).mo5534a(new C68663b(this), C1731i.f5562a, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40934c
    /* renamed from: a */
    public final C34796d mo70133a() {
        EnumC23292b bVar = EnumC23292b.DESTRUCTIVE;
        String string = C17867d.m33078a().getString(R.string.ft);
        C89219l.m154716b(string, "");
        return new C34796d(string, null, this, null, false, null, null, false, bVar, false, C17867d.m33078a().getString(R.string.fs), false, this, 108026);
    }

    /* renamed from: a */
    public final void mo109153a(int i) {
        C34727m.m70944a(new RunnableC68668g(this, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$e */
    public static final class C68666e extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        public static final C68666e f153657a = new C68666e();

        static {
            Covode.recordClassIndex(80926);
        }

        C68666e() {
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
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$f */
    public static final class C68667f extends AbstractC89220m implements AbstractC89172b<C34796d, C34796d> {

        /* renamed from: a */
        public static final C68667f f153658a = new C68667f();

        static {
            Covode.recordClassIndex(80927);
        }

        C68667f() {
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

    public View$OnClickListenerC68661e(AbstractC68195a aVar) {
        C89219l.m154721d(aVar, "");
        this.f153650i = aVar;
        aVar.getLifecycle().mo4012a(new RemoveFBFriendsUnit$1(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$i */
    static final class DialogInterface$OnClickListenerC68672i implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68661e f153664a;

        static {
            Covode.recordClassIndex(80932);
        }

        DialogInterface$OnClickListenerC68672i(View$OnClickListenerC68661e eVar) {
            this.f153664a = eVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$i$a */
        static final class C68673a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ DialogInterface$OnClickListenerC68672i f153665a;

            static {
                Covode.recordClassIndex(80933);
            }

            C68673a(DialogInterface$OnClickListenerC68672i iVar) {
                this.f153665a = iVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C79546d dVar = (C79546d) obj;
                if (dVar.f178516a == EnumC79549g.SYNC_STATUS && !dVar.f178517b.f178518a) {
                    C89219l.m154716b(dVar, "");
                    C68646c cVar = new C68646c(dVar, "facebook");
                    FindCtxViewModel f = this.f153665a.f153664a.mo109155f();
                    if (f != null) {
                        f.mo109138a(cVar);
                    }
                    this.f153665a.f153664a.f153642a.mo142944a();
                } else if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178520c != 0) {
                    new C79459a(this.f153665a.f153664a.mo109154e()).mo123050a(R.string.bon).mo123053a();
                    this.f153665a.f153664a.f153642a.mo142944a();
                }
            }
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Context e;
            C68083a.m120382a(true, 2);
            C68313a.m120609c(true);
            this.f153664a.mo109153a(1);
            C68356f fVar = this.f153664a.f153644c;
            if (fVar != null) {
                fVar.mo57616a(2);
            }
            FindCtxViewModel f = this.f153664a.mo109155f();
            if (!(f == null || !f.f153608b || (e = this.f153664a.mo109154e()) == null)) {
                Class<? extends AbstractC79495a> f2 = C51648a.f118980a.mo87326f();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                AbstractC88412b d = C79515b.m138230b(e, f2, curUser.getUid(), "privacy_setting", this.f153664a.f153648g).mo143278b(C88391a.m153580a(C88392a.f200660a)).mo143289d(new C68673a(this));
                C89219l.m154716b(d, "");
                C88934a.m154195a(d, this.f153664a.f153642a);
            }
            View$OnClickListenerC68661e eVar = this.f153664a;
            eVar.f153649h = AbstractC88979t.m154282a(0, 1, TimeUnit.SECONDS).mo143289d(new C68664c(eVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$b */
    public static final class C68663b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68661e f153654a;

        static {
            Covode.recordClassIndex(80923);
        }

        C68663b(View$OnClickListenerC68661e eVar) {
            this.f153654a = eVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                if (!C89361p.m154872a("error", ((SocialRelationDataCheckResponse) iVar.mo5545d()).message, true)) {
                    if (!((SocialRelationDataCheckResponse) iVar.mo5545d()).getHasRemainingData()) {
                        AbstractC88412b bVar = this.f153654a.f153649h;
                        if (bVar != null) {
                            bVar.dispose();
                        }
                        if (C68313a.m120608b()) {
                            new C79459a(this.f153654a.mo109154e()).mo123050a(R.string.fn).mo123053a();
                        }
                        this.f153654a.mo109158i();
                        C68313a.m120609c(false);
                        this.f153654a.mo109153a(0);
                    } else if (C68313a.m120608b()) {
                        this.f153654a.mo109153a(1);
                        this.f153654a.mo109158i();
                    } else {
                        this.f153654a.mo109153a(0);
                        this.f153654a.mo109159j();
                    }
                    return C89391z.f203057a;
                }
            }
            this.f153654a.mo109159j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$c */
    static final class C68664c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68661e f153655a;

        static {
            Covode.recordClassIndex(80924);
        }

        C68664c(View$OnClickListenerC68661e eVar) {
            this.f153655a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Long l = (Long) obj;
            if (this.f153655a.f153647f >= 10 || !C68313a.m120608b()) {
                AbstractC88412b bVar = this.f153655a.f153649h;
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f153655a.mo109156g();
                View$OnClickListenerC68661e eVar = this.f153655a;
                C68313a.m120609c(false);
                eVar.f153647f = 0;
                eVar.f153645d = 0;
                eVar.f153646e = 0;
            }
            long j = this.f153655a.f153646e + this.f153655a.f153645d;
            if (l != null && l.longValue() == j && this.f153655a.f153647f < 10) {
                this.f153655a.f153646e += this.f153655a.f153645d;
                this.f153655a.f153647f++;
                this.f153655a.f153645d = AbstractC89255c.Default.nextLong(5, 10);
                this.f153655a.mo109157h();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        C68083a.m120384c(2);
        if (this.f153651m) {
            C68083a.m120385d(2);
            new C17197a.C17200a(mo109154e()).mo27189a(R.string.ft).mo27194b(R.string.f_a).mo27195b(R.string.fq, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC68671h.f153663a, false).mo27190a(R.string.fr, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC68672i(this), false).mo27193a().mo27185c();
            return;
        }
        new C79459a(view.getContext()).mo123050a(R.string.fo).mo123053a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.e$h */
    static final class DialogInterface$OnClickListenerC68671h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC68671h f153663a = new DialogInterface$OnClickListenerC68671h();

        static {
            Covode.recordClassIndex(80931);
        }

        DialogInterface$OnClickListenerC68671h() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C68083a.m120382a(false, 2);
        }
    }
}
