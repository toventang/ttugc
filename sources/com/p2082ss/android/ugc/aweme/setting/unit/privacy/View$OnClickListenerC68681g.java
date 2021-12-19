package com.p2082ss.android.ugc.aweme.setting.unit.privacy;

import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.p3720h.C68083a;
import com.p2082ss.android.ugc.aweme.setting.page.AbstractC68195a;
import com.p2082ss.android.ugc.aweme.setting.page.privacy.p3727a.C68313a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.g */
public final class View$OnClickListenerC68681g extends C40945h implements View.OnClickListener {

    /* renamed from: a */
    public final C88411a f153678a = new C88411a();

    /* renamed from: b */
    public final AbstractC68195a f153679b;

    /* renamed from: c */
    private final AbstractC89244h f153680c = C89250i.m154773a((AbstractC89171a) new C68685d(this));

    /* renamed from: d */
    private final AbstractC89244h f153681d = C89250i.m154773a((AbstractC89171a) new C68682a(this));

    static {
        Covode.recordClassIndex(80941);
    }

    /* renamed from: e */
    public final FindCtxViewModel mo109167e() {
        return (FindCtxViewModel) this.f153680c.getValue();
    }

    /* renamed from: f */
    public final ActivityC0945e mo109168f() {
        return (ActivityC0945e) this.f153681d.getValue();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34800h mo70128b() {
        return mo70128b();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.g$a */
    static final class C68682a extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68681g f153682a;

        static {
            Covode.recordClassIndex(80942);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68682a(View$OnClickListenerC68681g gVar) {
            super(0);
            this.f153682a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            return this.f153682a.f153679b.requireActivity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.g$d */
    static final class C68685d extends AbstractC89220m implements AbstractC89171a<FindCtxViewModel> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68681g f153687a;

        static {
            Covode.recordClassIndex(80945);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68685d(View$OnClickListenerC68681g gVar) {
            super(0);
            this.f153687a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FindCtxViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f153687a.f153679b, (C1175ad.AbstractC1177b) null).mo3983a(FindCtxViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h
    /* renamed from: a */
    public final C34800h mo70133a() {
        boolean z = mo109167e().f153608b;
        String string = mo109168f().getString(R.string.fpb);
        C89219l.m154716b(string, "");
        return new C34800h(z, string, this, false, null, null, this, null, mo109168f().getString(R.string.fpa), false, 15288);
    }

    public View$OnClickListenerC68681g(AbstractC68195a aVar) {
        C89219l.m154721d(aVar, "");
        this.f153679b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.g$b */
    static final class C68683b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f153683a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC68681g f153684b;

        static {
            Covode.recordClassIndex(80943);
        }

        C68683b(ActivityC0945e eVar, View$OnClickListenerC68681g gVar) {
            this.f153683a = eVar;
            this.f153684b = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.SYNC_STATUS && !dVar.f178517b.f178518a) {
                C89219l.m154716b(dVar, "");
                C68646c cVar = new C68646c(dVar, "facebook");
                FindCtxViewModel e = this.f153684b.mo109167e();
                if (e != null) {
                    e.mo109138a(cVar);
                }
                this.f153684b.f153678a.mo142944a();
            } else if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178520c != 0) {
                new C79459a(this.f153684b.mo109168f()).mo123050a(R.string.bon).mo123053a();
                this.f153684b.f153678a.mo142944a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.g$c */
    static final class C68684c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f153685a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC68681g f153686b;

        static {
            Covode.recordClassIndex(80944);
        }

        C68684c(ActivityC0945e eVar, View$OnClickListenerC68681g gVar) {
            this.f153685a = eVar;
            this.f153686b = gVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178518a) {
                C89219l.m154716b(dVar, "");
                C68646c cVar = new C68646c(dVar, "facebook");
                FindCtxViewModel e = this.f153686b.mo109167e();
                if (e != null) {
                    e.mo109138a(cVar);
                }
                this.f153686b.f153678a.mo142944a();
            } else if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178520c != 0) {
                new C79459a(this.f153686b.mo109168f()).mo123050a(R.string.bon).mo123053a();
                this.f153686b.f153678a.mo142944a();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        if (C68313a.m120608b()) {
            new C79459a(mo109168f()).mo123050a(R.string.f_c).mo123053a();
        } else if (((C34800h) mo70132l()).f82200c) {
            C68083a.m120383b(2);
            ActivityC0945e f = mo109168f();
            if (f != null) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                String uid = curUser.getUid();
                if (uid != null) {
                    C89219l.m154716b(f, "");
                    AbstractC88412b d = C79515b.m138230b(f, C51648a.f118980a.mo87326f(), uid, "privacy_setting", "click").mo143289d(new C68683b(f, this));
                    C89219l.m154716b(d, "");
                    C88934a.m154195a(d, this.f153678a);
                }
            }
        } else {
            C68083a.m120380a(2);
            ActivityC0945e f2 = mo109168f();
            if (f2 != null) {
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                User curUser2 = g2.getCurUser();
                C89219l.m154716b(curUser2, "");
                String uid2 = curUser2.getUid();
                if (uid2 != null) {
                    C89219l.m154716b(f2, "");
                    AbstractC88412b d2 = C79515b.m138227a(f2, C51648a.f118980a.mo87326f(), uid2, "privacy_setting", "click", true).mo143289d(new C68684c(f2, this));
                    C89219l.m154716b(d2, "");
                    C88934a.m154195a(d2, this.f153678a);
                }
            }
        }
    }
}
