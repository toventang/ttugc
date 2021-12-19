package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.view.AbstractC51346a;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51700au;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.C56398e;
import com.p2082ss.android.ugc.aweme.inbox.C56407f;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.BaseNotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62264h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.AbstractC66614a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.LinkedHashMap;
import java.util.Set;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.av */
public final class C62070av extends C62129p {

    /* renamed from: a */
    public AbstractC34478k<User> f140900a;

    /* renamed from: b */
    public C51086a f140901b = new C51086a(this.f140903d, new C51086a.C51094g(this) {
        /* class com.p2082ss.android.ugc.aweme.notification.p3529h.C62070av.C620711 */

        /* renamed from: a */
        final /* synthetic */ C62070av f140908a;

        static {
            Covode.recordClassIndex(72825);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f140908a = r1;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.C51094g, com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51093f
        /* renamed from: a */
        public final void mo63346a(int i, User user) {
            C62070av.m112263c();
            AbstractC34478k<User> kVar = this.f140908a.f140900a;
            if (kVar != null) {
                int i2 = C51700au.f119176h;
                int position = this.f140908a.getPosition();
                this.f140908a.f140902c.getView();
                kVar.mo60910a(i2, user, position);
            }
        }
    });

    /* renamed from: c */
    public final AbstractC66614a f140902c;

    /* renamed from: d */
    private AbstractC51346a f140903d;

    /* renamed from: e */
    private int f140904e = 2001;

    /* renamed from: f */
    private User f140905f;

    /* renamed from: q */
    private final int f140906q;

    /* renamed from: r */
    private final BaseNotificationVM f140907r;

    static {
        Covode.recordClassIndex(72824);
    }

    /* renamed from: c */
    public static void m112263c() {
        C56407f.m102374b(C62076e.f140917a);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        if (this.f140906q == 9) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void cf_() {
        AbstractC34478k<User> kVar;
        User user;
        String str;
        super.cf_();
        if (!(this.f140904e != 2011 || (user = this.f140905f) == null || user.getUid() == null)) {
            Set<String> g = this.f140907r.mo100348g();
            User user2 = this.f140905f;
            if (user2 == null) {
                C89219l.m154715b();
            }
            if (!g.contains(user2.getUid())) {
                Set<String> g2 = this.f140907r.mo100348g();
                User user3 = this.f140905f;
                if (user3 == null) {
                    C89219l.m154715b();
                }
                String uid = user3.getUid();
                C89219l.m154716b(uid, "");
                g2.add(uid);
                User user4 = this.f140905f;
                if (user4 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154721d(user4, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "notification_page");
                String uid2 = user4.getUid();
                C89219l.m154716b(uid2, "");
                linkedHashMap.put("to_user_id", uid2);
                linkedHashMap.put("follow_status", String.valueOf(C62259e.m112610a(user4)));
                if (user4.isPrivateAccount()) {
                    str = "1";
                } else {
                    str = "0";
                }
                linkedHashMap.put("is_private_account", str);
                C39162r.m79460a("invite_follow_cell_show", linkedHashMap);
            }
        }
        if (this.f140904e == 2001 && (kVar = this.f140900a) != null) {
            int i = C51700au.f119175g;
            User user5 = this.f140905f;
            int position = getPosition();
            this.f140902c.getView();
            kVar.mo60910a(i, user5, position);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.av$e */
    public static final class C62076e extends AbstractC89220m implements AbstractC89172b<C56398e.C56399a, C89391z> {

        /* renamed from: a */
        public static final C62076e f140917a = new C62076e();

        static {
            Covode.recordClassIndex(72830);
        }

        C62076e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56398e.C56399a aVar) {
            C56398e.C56399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.mo93389b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo100123a(AbstractC34478k<User> kVar) {
        this.f140900a = kVar;
        if (this.f140906q == 9) {
            this.itemView.setOnLongClickListener(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.av$a */
    public static final class C62072a implements C51086a.AbstractC51090c {

        /* renamed from: a */
        final /* synthetic */ boolean f140909a;

        /* renamed from: b */
        final /* synthetic */ C62070av f140910b;

        /* renamed from: c */
        final /* synthetic */ User f140911c;

        static {
            Covode.recordClassIndex(72826);
        }

        C62072a(boolean z, C62070av avVar, User user) {
            this.f140909a = z;
            this.f140910b = avVar;
            this.f140911c = user;
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51090c
        /* renamed from: a */
        public final boolean mo63341a(int i) {
            boolean a = C62264h.m112640a(this.f140910b.f140983i, this.f140911c, null, null, null, !this.f140909a, 28);
            if (a) {
                User user = this.f140911c;
                C59256u a2 = new C59256u().mo96834a("notification_page");
                a2.f135350a = C59256u.EnumC59259c.CARD;
                a2.f135352b = C59256u.EnumC59257a.ENTER_CHAT;
                a2.mo96832a(user).mo96841s(user.getRequestId()).mo96792f();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.h.av$b */
    public static final class C62073b implements C51086a.AbstractC51091d {

        /* renamed from: a */
        final /* synthetic */ C62070av f140912a;

        /* renamed from: b */
        final /* synthetic */ User f140913b;

        static {
            Covode.recordClassIndex(72827);
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63342a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: b */
        public final void mo63344b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51091d
        /* renamed from: a */
        public final void mo63343a(FollowStatus followStatus) {
            if (followStatus != null) {
                IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                this.f140912a.f140902c.mo61442a(followStatus.followStatus, followStatus.followerStatus, this.f140913b.getUid());
            }
            C51648a aVar = C51648a.f118980a;
            Context context = this.f140912a.f140983i;
            C89219l.m154716b(context, "");
            aVar.mo87304a(3, "notification_page", "follow", context);
        }

        C62073b(C62070av avVar, User user) {
            this.f140912a = avVar;
            this.f140913b = user;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.av$d */
    public static final class C62075d implements C51086a.AbstractC51092e {

        /* renamed from: a */
        public static final C62075d f140916a = new C62075d();

        static {
            Covode.recordClassIndex(72829);
        }

        C62075d() {
        }

        @Override // com.p2082ss.android.ugc.aweme.follow.widet.C51086a.AbstractC51092e
        /* renamed from: a */
        public final void mo63345a(FollowStatus followStatus) {
            C89219l.m154716b(followStatus, "");
            if (followStatus.followStatus == 0) {
                C39162r.m79460a("follow_cancel_finish", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("to_user_id", followStatus.userId).f79943a);
            } else {
                C39162r.m79460a("follow_finish", new C33744d().mo59983a("enter_from", "notification_page").mo59983a("to_user_id", followStatus.userId).f79943a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.h.av$c */
    public static final class C62074c extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62070av f140914a;

        /* renamed from: b */
        final /* synthetic */ User f140915b;

        static {
            Covode.recordClassIndex(72828);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62074c(C62070av avVar, User user) {
            super(1);
            this.f140914a = avVar;
            this.f140915b = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            boolean z;
            int intValue = num.intValue();
            if (intValue == C51700au.f119171c) {
                C62070av.m112263c();
            }
            if (intValue == C51700au.f119172d) {
                User user = this.f140915b;
                if (user != null) {
                    C51086a aVar = this.f140914a.f140901b;
                    if (aVar == null) {
                        C89219l.m154715b();
                    }
                    String uid = user.getUid();
                    String secUid = user.getSecUid();
                    int followStatus = user.getFollowStatus();
                    int followerStatus = user.getFollowerStatus();
                    if (user.isSecret() || user.isPrivateAccount()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.mo86509a(uid, secUid, followStatus, followerStatus, z);
                }
            } else {
                AbstractC34478k<User> kVar = this.f140914a.f140900a;
                if (kVar != null) {
                    User user2 = this.f140915b;
                    int layoutPosition = this.f140914a.getLayoutPosition();
                    this.f140914a.f140902c.getView();
                    kVar.mo60910a(intValue, user2, layoutPosition);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo100124a(User user, int i) {
        this.f140904e = i;
        this.f140905f = user;
        if (user != null) {
            boolean d = IMUnder16ProxyImpl.m102047n().mo93022d();
            if (C80580in.m139687c() || d) {
                this.f140902c.mo61445a(false);
            } else {
                this.f140902c.mo61445a(true);
            }
            this.f140902c.mo61444a(user);
            C51086a aVar = this.f140901b;
            if (aVar != null) {
                aVar.mo86508a(user);
            }
            C51086a aVar2 = this.f140901b;
            if (aVar2 != null) {
                aVar2.f117879e = new C62072a(d, this, user);
            }
            C51086a aVar3 = this.f140901b;
            if (aVar3 != null) {
                aVar3.f117878d = new C62073b(this, user);
            }
            C51086a aVar4 = this.f140901b;
            if (aVar4 != null) {
                aVar4.f117880f = C62075d.f140916a;
            }
            this.f140902c.setEventListener(new C62074c(this, user));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62070av(AbstractC66614a aVar, int i, BaseNotificationVM baseNotificationVM) {
        super(aVar.getView());
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(baseNotificationVM, "");
        this.f140902c = aVar;
        this.f140906q = i;
        this.f140907r = baseNotificationVM;
        this.f140903d = aVar.getFollowBtn();
    }
}
