package com.p2082ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.friends.p3013c.C51483d;
import com.p2082ss.android.ugc.aweme.friends.service.IFriendsService;
import com.p2082ss.android.ugc.aweme.relation.C66865b;
import com.p2082ss.android.ugc.aweme.relation.EnumC66889c;
import com.p2082ss.android.ugc.aweme.relation.p3672a.C66824a;
import com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66890a;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66893c;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66937g;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66994m;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66995n;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67103e;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.service.SocialFriendsService */
public final class SocialFriendsService implements AbstractC33974au, AbstractC51649b {

    /* renamed from: b */
    public static final C51643a f118971b = new C51643a((byte) 0);

    /* renamed from: c */
    private ActivityC0945e f118972c;

    /* renamed from: d */
    private IFriendsService.AbstractC51639c f118973d;

    static {
        Covode.recordClassIndex(60993);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.SocialFriendsService$a */
    public static final class C51643a {
        static {
            Covode.recordClassIndex(60994);
        }

        private C51643a() {
        }

        public /* synthetic */ C51643a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b
    /* renamed from: a */
    public final void mo87353a() {
        IFriendsService.AbstractC51639c cVar = this.f118973d;
        if (cVar != null) {
            cVar.mo87346a();
            this.f118973d = null;
        }
    }

    /* renamed from: b */
    public final void mo87359b() {
        ActivityC0945e eVar = this.f118972c;
        if (eVar != null) {
            eVar.getLifecycle().mo4013b(this);
            this.f118972c = null;
        }
        IFriendsService.AbstractC51639c cVar = this.f118973d;
        if (cVar != null) {
            cVar.mo87346a();
            this.f118973d = null;
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        ActivityC0945e eVar = this.f118972c;
        if (eVar != null) {
            eVar.getLifecycle().mo4013b(this);
            this.f118972c = null;
        }
        if (this.f118973d != null) {
            this.f118973d = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.SocialFriendsService$c */
    static final class C51645c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SocialFriendsService f118976a;

        static {
            Covode.recordClassIndex(60996);
        }

        C51645c(SocialFriendsService socialFriendsService) {
            this.f118976a = socialFriendsService;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f118976a.mo87359b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.SocialFriendsService$e */
    static final class C51647e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SocialFriendsService f118979a;

        static {
            Covode.recordClassIndex(60998);
        }

        C51647e(SocialFriendsService socialFriendsService) {
            this.f118979a = socialFriendsService;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f118979a.mo87359b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.SocialFriendsService$b */
    static final class C51644b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SocialFriendsService f118974a;

        /* renamed from: b */
        final /* synthetic */ int f118975b;

        static {
            Covode.recordClassIndex(60995);
        }

        C51644b(SocialFriendsService socialFriendsService, int i) {
            this.f118974a = socialFriendsService;
            this.f118975b = i;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f118974a.mo87357a((C67103e) obj, this.f118975b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.service.SocialFriendsService$d */
    static final class C51646d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SocialFriendsService f118977a;

        /* renamed from: b */
        final /* synthetic */ int f118978b;

        static {
            Covode.recordClassIndex(60997);
        }

        C51646d(SocialFriendsService socialFriendsService, int i) {
            this.f118977a = socialFriendsService;
            this.f118978b = i;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f118977a.mo87357a((C67103e) obj, this.f118978b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b
    /* renamed from: a */
    public final C89378p<Boolean, Long> mo87352a(int i) {
        return new C89378p<>(Boolean.valueOf(C66893c.C66894a.m118637a().mo105823b(i, EnumC66892b.CONSENT.getValue())), Long.valueOf(C66893c.C66894a.m118637a().mo105824c(i, EnumC66892b.CONSENT.getValue())));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b
    /* renamed from: b */
    public final C89378p<Boolean, Long> mo87358b(int i) {
        return new C89378p<>(Boolean.valueOf(C66893c.C66894a.m118637a().mo105823b(i, EnumC66892b.RECOMMEND.getValue())), Long.valueOf(C66893c.C66894a.m118637a().mo105824c(i, EnumC66892b.RECOMMEND.getValue())));
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b
    /* renamed from: a */
    public final void mo87355a(ActivityC0945e eVar, IFriendsService.AbstractC51639c cVar) {
        int value;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        if (eVar.isFinishing()) {
            cVar.mo87346a();
            return;
        }
        this.f118973d = cVar;
        this.f118972c = eVar;
        eVar.getLifecycle().mo4012a(this);
        C66870b.AbstractC66875d a = C66870b.m118585a(3);
        int c = a.mo105819c();
        AbstractC1174ac a2 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class);
        C89219l.m154716b(a2, "");
        SocialRecFlowModel socialRecFlowModel = (SocialRecFlowModel) a2;
        socialRecFlowModel.f150411a.observe(eVar, new C51646d(this, c));
        socialRecFlowModel.f150412b.observe(eVar, new C51647e(this));
        if (a.mo105815a().getFirst().booleanValue()) {
            if (C66865b.m118575c()) {
                value = EnumC66892b.NEW_VERSION_FACEBOOK.getValue();
            } else {
                value = EnumC66892b.NEW_VERSION_CONTACT.getValue();
            }
            mo87357a(new C67103e(value, null, null, null, 14), c);
            return;
        }
        mo87357a(new C67103e(EnumC66892b.NEW_VERSION_RECOMMEND.getValue(), null, null, null, 14), c);
    }

    /* renamed from: a */
    public final void mo87357a(C67103e eVar, int i) {
        if (eVar == null) {
            mo87359b();
            return;
        }
        int i2 = eVar.f150486a;
        if (i2 == EnumC66892b.CONSENT.getValue()) {
            C66824a c = C66870b.m118590c(i);
            if (c != null) {
                C66825b a = C66825b.C66830d.m118563a(c);
                IFriendsService.AbstractC51639c cVar = this.f118973d;
                if (cVar != null) {
                    cVar.mo87347a(a);
                    return;
                }
                return;
            }
            mo87359b();
        } else if (i2 == EnumC66892b.RECOMMEND.getValue()) {
            C66994m d = C66870b.m118592d(i);
            if (d != null) {
                C66995n a2 = C66995n.C67000d.m118705a(d);
                IFriendsService.AbstractC51639c cVar2 = this.f118973d;
                if (cVar2 != null) {
                    cVar2.mo87347a(a2);
                    return;
                }
                return;
            }
            mo87359b();
        } else if (i2 == EnumC66892b.NEW_VERSION_CONTACT.getValue() || i2 == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
            C66824a a3 = C66870b.m118584a(i, eVar.f150486a);
            if (a3 != null) {
                C66825b a4 = C66825b.C66830d.m118563a(a3);
                IFriendsService.AbstractC51639c cVar3 = this.f118973d;
                if (cVar3 != null) {
                    cVar3.mo87347a(a4);
                    return;
                }
                return;
            }
            mo87359b();
        } else if (i2 == EnumC66892b.NEW_VERSION_RECOMMEND.getValue()) {
            C66994m d2 = C66870b.m118592d(i);
            if (d2 != null) {
                C66937g a5 = C66937g.C66950m.m118681a(d2, eVar.f150488c, eVar.f150489d);
                IFriendsService.AbstractC51639c cVar4 = this.f118973d;
                if (cVar4 != null) {
                    cVar4.mo87347a(a5);
                    return;
                }
                return;
            }
            mo87359b();
        } else {
            mo87359b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b
    /* renamed from: a */
    public final void mo87354a(Activity activity, boolean z, IFriendsService.AbstractC51639c cVar) {
        int i;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        C31575b.m65859a();
        int i2 = 2;
        if (!C89219l.m154714a((Object) C31575b.f75524a.mo57075k().getLatestLoginMethodName(), (Object) "facebook")) {
            i = 1;
        } else {
            i = 2;
        }
        C66870b.AbstractC66875d a = C66870b.m118585a(i);
        if (!a.mo105816a((ActivityC0945e) activity)) {
            cVar.mo87346a();
            return;
        }
        this.f118973d = cVar;
        int c = a.mo105819c();
        C89378p<Boolean, Boolean> a2 = a.mo105815a();
        if (!a.mo105818b()) {
            if (!z) {
                if (c != 2) {
                    i2 = 1;
                }
                AbstractC81915c.m141874a(new C51483d(i2, a2));
                C66890a.C66891a.m118631a().f150169a.storeBoolean("after_login_permission_pop_up", true);
            }
            mo87353a();
        } else if (a2.getFirst().booleanValue()) {
            C89219l.m154721d(activity, "");
            SmartRouter.buildRoute(activity, "//friends/social_friends").withParam("socialRecType", c).withParam("nextStep", EnumC66892b.CONSENT.getValue()).open();
        } else {
            C89219l.m154721d(activity, "");
            SmartRouter.buildRoute(activity, "//friends/social_friends").withParam("socialRecType", c).withParam("nextStep", EnumC66892b.RECOMMEND.getValue()).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b
    /* renamed from: a */
    public final void mo87356a(ActivityC0945e eVar, EnumC66889c cVar, IFriendsService.AbstractC51639c cVar2) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(cVar2, "");
        if (eVar.isFinishing()) {
            cVar2.mo87346a();
            return;
        }
        C31575b.m65859a();
        int i = 1;
        if (!(!C89219l.m154714a((Object) C31575b.f75524a.mo57075k().getLatestLoginMethodName(), (Object) "facebook"))) {
            i = 2;
        }
        C66870b.AbstractC66875d a = C66870b.m118585a(i);
        if (!a.mo105818b()) {
            cVar2.mo87346a();
        } else if (a.mo105817a(cVar)) {
            cVar2.mo87346a();
        } else if (!a.mo105816a(eVar)) {
            cVar2.mo87346a();
        } else {
            this.f118973d = cVar2;
            this.f118972c = eVar;
            eVar.getLifecycle().mo4012a(this);
            int c = a.mo105819c();
            ((SocialRecFlowModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class)).f150411a.observe(eVar, new C51644b(this, c));
            ((SocialRecFlowModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class)).f150412b.observe(eVar, new C51645c(this));
            if (a.mo105815a().getFirst().booleanValue()) {
                mo87357a(new C67103e(EnumC66892b.CONSENT.getValue(), null, null, null, 14), c);
            } else {
                mo87357a(new C67103e(EnumC66892b.RECOMMEND.getValue(), null, null, null, 14), c);
            }
        }
    }
}
