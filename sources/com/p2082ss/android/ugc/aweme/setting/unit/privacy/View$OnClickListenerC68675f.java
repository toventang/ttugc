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

/* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.f */
public final class View$OnClickListenerC68675f extends C40945h implements View.OnClickListener {

    /* renamed from: c */
    public static final C68676a f153667c = new C68676a((byte) 0);

    /* renamed from: a */
    public final C88411a f153668a = new C88411a();

    /* renamed from: b */
    public final AbstractC68195a f153669b;

    /* renamed from: d */
    private final AbstractC89244h f153670d = C89250i.m154773a((AbstractC89171a) new C68680e(this));

    /* renamed from: e */
    private final AbstractC89244h f153671e = C89250i.m154773a((AbstractC89171a) new C68677b(this));

    static {
        Covode.recordClassIndex(80935);
    }

    /* renamed from: e */
    public final FindCtxViewModel mo109164e() {
        return (FindCtxViewModel) this.f153670d.getValue();
    }

    /* renamed from: f */
    public final ActivityC0945e mo109165f() {
        return (ActivityC0945e) this.f153671e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.f$a */
    public static final class C68676a {
        static {
            Covode.recordClassIndex(80936);
        }

        private C68676a() {
        }

        public /* synthetic */ C68676a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34800h mo70128b() {
        return mo70128b();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.f$b */
    static final class C68677b extends AbstractC89220m implements AbstractC89171a<ActivityC0945e> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68675f f153672a;

        static {
            Covode.recordClassIndex(80937);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68677b(View$OnClickListenerC68675f fVar) {
            super(0);
            this.f153672a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ActivityC0945e invoke() {
            return this.f153672a.f153669b.requireActivity();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.f$e */
    static final class C68680e extends AbstractC89220m implements AbstractC89171a<FindCtxViewModel> {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC68675f f153677a;

        static {
            Covode.recordClassIndex(80940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68680e(View$OnClickListenerC68675f fVar) {
            super(0);
            this.f153677a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FindCtxViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f153677a.f153669b, (C1175ad.AbstractC1177b) null).mo3983a(FindCtxViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h
    /* renamed from: a */
    public final C34800h mo70133a() {
        boolean z = mo109164e().f153607a;
        String string = mo109165f().getString(R.string.g9f);
        C89219l.m154716b(string, "");
        return new C34800h(z, string, this, false, null, null, this, null, mo109165f().getString(R.string.g9e), false, 15288);
    }

    public View$OnClickListenerC68675f(AbstractC68195a aVar) {
        C89219l.m154721d(aVar, "");
        this.f153669b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.f$c */
    static final class C68678c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f153673a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC68675f f153674b;

        static {
            Covode.recordClassIndex(80938);
        }

        C68678c(ActivityC0945e eVar, View$OnClickListenerC68675f fVar) {
            this.f153673a = eVar;
            this.f153674b = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.SYNC_STATUS && !dVar.f178517b.f178518a) {
                C89219l.m154716b(dVar, "");
                C68646c cVar = new C68646c(dVar, "contact");
                FindCtxViewModel e = this.f153674b.mo109164e();
                if (e != null) {
                    e.mo109138a(cVar);
                }
                this.f153674b.f153668a.mo142944a();
            } else if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178520c != 0) {
                new C79459a(this.f153674b.mo109165f()).mo123050a(R.string.bon).mo123053a();
                this.f153674b.f153668a.mo142944a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.unit.privacy.f$d */
    static final class C68679d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f153675a;

        /* renamed from: b */
        final /* synthetic */ View$OnClickListenerC68675f f153676b;

        static {
            Covode.recordClassIndex(80939);
        }

        C68679d(ActivityC0945e eVar, View$OnClickListenerC68675f fVar) {
            this.f153675a = eVar;
            this.f153676b = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178518a) {
                C89219l.m154716b(dVar, "");
                C68646c cVar = new C68646c(dVar, "contact");
                FindCtxViewModel e = this.f153676b.mo109164e();
                if (e != null) {
                    e.mo109138a(cVar);
                }
                this.f153676b.f153668a.mo142944a();
            } else if (dVar.f178516a == EnumC79549g.SYNC_STATUS && dVar.f178517b.f178520c != 0) {
                new C79459a(this.f153676b.mo109165f()).mo123050a(R.string.bon).mo123053a();
                this.f153676b.f153668a.mo142944a();
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        if (C68313a.m120606a()) {
            new C79459a(mo109165f()).mo123050a(R.string.f_c).mo123053a();
        } else if (((C34800h) mo70132l()).f82200c) {
            C68083a.m120383b(1);
            ActivityC0945e f = mo109165f();
            if (f != null) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                User curUser = g.getCurUser();
                C89219l.m154716b(curUser, "");
                String uid = curUser.getUid();
                if (uid != null) {
                    C89219l.m154716b(f, "");
                    AbstractC88412b d = C79515b.m138230b(f, C51648a.f118980a.mo87320c(), uid, "privacy_setting", "click").mo143289d(new C68678c(f, this));
                    C89219l.m154716b(d, "");
                    C88934a.m154195a(d, this.f153668a);
                }
            }
        } else {
            C68083a.m120380a(1);
            ActivityC0945e f2 = mo109165f();
            if (f2 != null) {
                IAccountUserService g2 = C31575b.m65865g();
                C89219l.m154716b(g2, "");
                User curUser2 = g2.getCurUser();
                C89219l.m154716b(curUser2, "");
                String uid2 = curUser2.getUid();
                if (uid2 != null) {
                    C89219l.m154716b(f2, "");
                    AbstractC88412b d2 = C79515b.m138227a(f2, C51648a.f118980a.mo87320c(), uid2, "privacy_setting", "click", true).mo143289d(new C68679d(f2, this));
                    C89219l.m154716b(d2, "");
                    C88934a.m154195a(d2, this.f153668a);
                }
            }
        }
    }
}
