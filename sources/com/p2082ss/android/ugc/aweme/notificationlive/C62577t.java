package com.p2082ss.android.ugc.aweme.notificationlive;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.p2140di.push.C29902a;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62605a;
import com.p2082ss.android.ugc.aweme.profile.AbstractC63755f;
import com.p2082ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.aweme.utils.C80429fh;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.t */
public final class C62577t {

    /* renamed from: a */
    public static PackageManager f141904a;

    /* renamed from: b */
    public static final C62577t f141905b = new C62577t();

    /* renamed from: c */
    private static final C62579b f141906c = new C62579b();

    /* renamed from: d */
    private static C88960c<C62513a> f141907d;

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$a */
    public interface AbstractC62578a {
        static {
            Covode.recordClassIndex(73375);
        }

        /* renamed from: a */
        void mo100527a(User user);
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$b */
    public static final class C62579b {
        static {
            Covode.recordClassIndex(73376);
        }

        C62579b() {
        }
    }

    private C62577t() {
    }

    /* renamed from: a */
    public static boolean m113005a(Activity activity, String str, User user, AbstractC63755f fVar) {
        C89219l.m154721d(str, "");
        C89233z.C89238e eVar = new C89233z.C89238e();
        String str2 = null;
        eVar.element = fVar != null ? (T) fVar.mo96118a() : null;
        if (C89219l.m154714a((Object) str, (Object) "push_setting") && (!m113007b() || !m113008c())) {
            m113003a(activity, user);
            return false;
        } else if (m113007b() && m113008c()) {
            return true;
        } else {
            if (eVar.element != null) {
                C39162r.m79460a("livesdk_push_pre_permission_show", new C33744d().mo59983a("enter_from_merge", eVar.element.f144527c).mo59983a("enter_method", eVar.element.f144528d).mo59983a("room_id", eVar.element.f144525a).mo59983a("anchor_id", eVar.element.f144526b).f79943a);
            } else {
                C39162r.m79460a("push_pre_permission_show", new C33744d().mo59983a("enter_from", str).mo59983a("enter_method", "notification_bell").mo59983a("enter_reason", "leave").f79943a);
            }
            if (activity != null) {
                C23023b bVar = (C23023b) new C23023b(activity).mo37479a(R.string.cwp);
                String string = activity.getString(R.string.gwy);
                C89219l.m154716b(string, "");
                Object[] objArr = new Object[1];
                if (user != null) {
                    str2 = user.getUniqueId();
                }
                objArr[0] = str2;
                String a = C1764a.m5928a(string, Arrays.copyOf(objArr, 1));
                C89219l.m154716b(a, "");
                ((C23023b) C23028c.m43435a(bVar.mo37413d(a), new C62580c(activity, user, str, eVar, fVar)).mo37481a(new C62583d(user, str, eVar, fVar))).mo37405a().mo37396b().show();
            }
            return false;
        }
    }

    static {
        Covode.recordClassIndex(73374);
    }

    /* renamed from: b */
    public static boolean m113007b() {
        Keva repo = Keva.getRepo("push_live_" + m113009d(), 0);
        C89219l.m154716b(repo, "");
        return repo.getBoolean("key_mt_live_push_switch", true);
    }

    /* renamed from: c */
    public static boolean m113008c() {
        NotificationChannel notificationChannel;
        String realChannelId = C29902a.m60273a().getRealChannelId("live_push");
        Object a = m113000a(C17867d.m33078a(), "notification");
        Objects.requireNonNull(a, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) a;
        if (Build.VERSION.SDK_INT < 26 || realChannelId == null || realChannelId.length() == 0 || (notificationChannel = notificationManager.getNotificationChannel(realChannelId)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static long m113009d() {
        String curUserId;
        IAccountUserService e = AccountService.m65215a().mo57069e();
        if (AccountService.m65215a().mo57069e() == null) {
            curUserId = "-1";
        } else {
            C89219l.m154716b(e, "");
            curUserId = e.getCurUserId();
            C89219l.m154716b(curUserId, "");
        }
        return Long.parseLong(curUserId.toString());
    }

    /* renamed from: a */
    public static C88960c<C62513a> m112999a() {
        AbstractC88979t<C62513a> a;
        if (f141907d == null) {
            C88960c<C62513a> cVar = new C88960c<>();
            f141907d = cVar;
            AbstractC88979t<C62513a> g = cVar.mo143301g(400, TimeUnit.MILLISECONDS);
            if (!(g == null || (a = g.mo143261a(C88391a.m153580a(C88392a.f200660a))) == null)) {
                a.mo143289d(C62587g.f141929a);
            }
        }
        return f141907d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$d */
    public static final class C62583d extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ User f141915a;

        /* renamed from: b */
        final /* synthetic */ String f141916b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89238e f141917c;

        /* renamed from: d */
        final /* synthetic */ AbstractC63755f f141918d;

        static {
            Covode.recordClassIndex(73380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62583d(User user, String str, C89233z.C89238e eVar, AbstractC63755f fVar) {
            super(1);
            this.f141915a = user;
            this.f141916b = str;
            this.f141917c = eVar;
            this.f141918d = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C89219l.m154721d(aVar, "");
            AbstractC63755f fVar = this.f141918d;
            if (fVar != null) {
                fVar.mo96120b();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$c */
    public static final class C62580c extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Activity f141908a;

        /* renamed from: b */
        final /* synthetic */ User f141909b;

        /* renamed from: c */
        final /* synthetic */ String f141910c;

        /* renamed from: d */
        final /* synthetic */ C89233z.C89238e f141911d;

        /* renamed from: e */
        final /* synthetic */ AbstractC63755f f141912e;

        static {
            Covode.recordClassIndex(73377);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62580c(Activity activity, User user, String str, C89233z.C89238e eVar, AbstractC63755f fVar) {
            super(1);
            this.f141908a = activity;
            this.f141909b = user;
            this.f141910c = str;
            this.f141911d = eVar;
            this.f141912e = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.c4i, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.C62577t.C62580c.C625811 */

                /* renamed from: a */
                final /* synthetic */ C62580c f141913a;

                static {
                    Covode.recordClassIndex(73378);
                }

                {
                    this.f141913a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    SmartRouter.buildRoute(this.f141913a.f141908a, "aweme://push_setting_notification_choice").withParam("enter_from", this.f141913a.f141910c).open();
                    if (this.f141913a.f141911d.element != null) {
                        C39162r.m79460a("livesdk_push_pre_permission_auth", new C33744d().mo59983a("enter_from_merge", this.f141913a.f141911d.element.f144527c).mo59983a("enter_method", this.f141913a.f141911d.element.f144528d).mo59983a("room_id", this.f141913a.f141911d.element.f144525a).mo59983a("anchor_id", this.f141913a.f141911d.element.f144526b).f79943a);
                    } else {
                        C39162r.m79460a("push_pre_permission_auth", new C33744d().mo59983a("enter_from", this.f141913a.f141910c).mo59983a("enter_method", "notification_bell").mo59983a("enter_reason", "leave").f79943a);
                    }
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.dhl, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.C62577t.C62580c.C625822 */

                /* renamed from: a */
                final /* synthetic */ C62580c f141914a;

                static {
                    Covode.recordClassIndex(73379);
                }

                {
                    this.f141914a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    if (this.f141914a.f141911d.element != null) {
                        C39162r.m79460a("livesdk_push_pre_permission_deny", new C33744d().mo59983a("enter_from_merge", this.f141914a.f141911d.element.f144527c).mo59983a("enter_method", this.f141914a.f141911d.element.f144528d).mo59983a("room_id", this.f141914a.f141911d.element.f144525a).mo59983a("anchor_id", this.f141914a.f141911d.element.f144526b).f79943a);
                    } else {
                        C39162r.m79460a("push_pre_permission_deny", new C33744d().mo59983a("enter_from", this.f141914a.f141910c).mo59983a("enter_method", "notification_bell").mo59983a("enter_reason", "leave").f79943a);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$e */
    static final class C62584e extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C62584e f141919a = new C62584e();

        static {
            Covode.recordClassIndex(73381);
        }

        C62584e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.d14, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$f */
    static final class C62585f extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ Activity f141920a;

        /* renamed from: b */
        final /* synthetic */ User f141921b;

        /* renamed from: c */
        final /* synthetic */ AbstractC62578a f141922c;

        /* renamed from: d */
        final /* synthetic */ String f141923d;

        /* renamed from: e */
        final /* synthetic */ String f141924e;

        /* renamed from: f */
        final /* synthetic */ String f141925f;

        /* renamed from: g */
        final /* synthetic */ String f141926g;

        /* renamed from: h */
        final /* synthetic */ AwemeRawAd f141927h;

        static {
            Covode.recordClassIndex(73382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62585f(Activity activity, User user, AbstractC62578a aVar, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd) {
            super(1);
            this.f141920a = activity;
            this.f141921b = user;
            this.f141922c = aVar;
            this.f141923d = str;
            this.f141924e = str2;
            this.f141925f = str3;
            this.f141926g = str4;
            this.f141927h = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.dkh, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.C62577t.C62585f.C625861 */

                /* renamed from: a */
                final /* synthetic */ C62585f f141928a;

                static {
                    Covode.recordClassIndex(73383);
                }

                {
                    this.f141928a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    String string = this.f141928a.f141920a.getString(R.string.a6_);
                    if (string == null) {
                        string = "";
                    }
                    C89219l.m154716b(string, "");
                    String a = C1764a.m5928a(string, Arrays.copyOf(new Object[]{this.f141928a.f141921b.getUniqueId()}, 1));
                    C89219l.m154716b(a, "");
                    new C23144b(this.f141928a.f141920a).mo37635a(a).mo37637b();
                    String uid = this.f141928a.f141921b.getUid();
                    C89219l.m154716b(uid, "");
                    String secUid = this.f141928a.f141921b.getSecUid();
                    C89219l.m154716b(secUid, "");
                    AbstractC81915c.m141874a(new C62688z(uid, secUid));
                    C62577t.m113002a(this.f141928a.f141920a, this.f141928a.f141921b, this.f141928a.f141922c, this.f141928a.f141923d, this.f141928a.f141924e, this.f141928a.f141925f, this.f141928a.f141926g, this.f141928a.f141927h);
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.a8y, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$h */
    public static final class C62588h extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C62588h f141930a = new C62588h();

        static {
            Covode.recordClassIndex(73385);
        }

        C62588h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.d14, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$i */
    public static final class C62589i extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        public static final C62589i f141931a = new C62589i();

        static {
            Covode.recordClassIndex(73386);
        }

        C62589i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            bVar2.mo37416a(R.string.d14, (AbstractC89172b<? super C23024a, C89391z>) null);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static C23226a m112998a(C62523j jVar) {
        C89219l.m154721d(jVar, "");
        return new C23226a.C23227a().mo37812a(1).mo37817a(jVar).mo37815a(jVar.f141828l).mo37814a(jVar.f141829m).f55057a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.t$g */
    public static final class C62587g<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C62587g f141929a = new C62587g();

        static {
            Covode.recordClassIndex(73384);
        }

        C62587g() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            int i;
            String str;
            String str2;
            String str3;
            int i2;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            GeneralPermission generalPermission;
            C62513a aVar = (C62513a) obj;
            User user = aVar.f141783a;
            Activity activity = aVar.f141784b;
            String str10 = aVar.f141785c;
            String str11 = aVar.f141786d;
            String str12 = aVar.f141787e;
            AbstractC62578a aVar2 = aVar.f141788f;
            String str13 = aVar.f141789g;
            AwemeRawAd awemeRawAd = aVar.f141790h;
            boolean z = aVar.f141791i;
            AbstractC63755f fVar = aVar.f141792j;
            if (user != null) {
                i = user.getFollowStatus();
            } else {
                i = 0;
            }
            String str14 = "";
            if (str10 == null) {
                str = str14;
            } else {
                str = str10;
            }
            if (user == null || (str2 = user.getUid()) == null) {
                str2 = str14;
            }
            if (str11 == null) {
                str3 = str14;
            } else {
                str3 = str11;
            }
            C89219l.m154721d(str, str14);
            C89219l.m154721d(str2, str14);
            C89219l.m154721d(str3, str14);
            C39162r.m79460a("click_notification_bell", new C33744d().mo59983a("enter_from", str).mo59980a("follow_status", i).mo59983a("to_user_id", str2).mo59983a("previous_page", str3).f79943a);
            if (user == null || (generalPermission = user.getGeneralPermission()) == null) {
                i2 = 0;
            } else {
                i2 = generalPermission.getFollowToastType();
            }
            if (i2 != 1) {
                if (str10 == null) {
                    str4 = str14;
                } else {
                    str4 = str10;
                }
                if (str11 == null) {
                    str5 = str14;
                } else {
                    str5 = str11;
                }
                if (C62577t.m113006a(activity, str4, str5, fVar)) {
                    if (str10 == null) {
                        str6 = str14;
                    } else {
                        str6 = str10;
                    }
                    if (C62577t.m113005a(activity, str6, user, fVar)) {
                        if (str10 == null) {
                            str7 = str14;
                        } else {
                            str7 = str10;
                        }
                        if (str11 == null) {
                            str8 = str14;
                        } else {
                            str8 = str11;
                        }
                        if (str12 == null) {
                            str9 = str14;
                        } else {
                            str9 = str12;
                        }
                        C89219l.m154721d(str7, str14);
                        C89219l.m154721d(str8, str14);
                        C89219l.m154721d(str9, str14);
                        if (user == null || !user.isBlock || C80580in.m139679a(user.getFollowStatus())) {
                            if (i == 4) {
                                C62577t.m113001a(activity);
                            } else if (i == 0) {
                                if (str10 == null) {
                                    str10 = str14;
                                }
                                if (str11 == null) {
                                    str11 = str14;
                                }
                                if (str12 != null) {
                                    str14 = str12;
                                }
                                C62577t.m113002a(activity, user, aVar2, str10, str11, str14, str13, awemeRawAd);
                            } else if (i == 1 || i == 2) {
                                if (str10 == null) {
                                    str10 = str14;
                                }
                                if (str11 == null) {
                                    str11 = str14;
                                }
                                C89219l.m154721d(str10, str14);
                                C89219l.m154721d(str11, str14);
                                if (user != null && (activity instanceof ActivityC0945e)) {
                                    if (z) {
                                        C62523j jVar = new C62523j(user, aVar2, false, str10, str11, "", str13, awemeRawAd, fVar);
                                        ActivityC0945e eVar = (ActivityC0945e) activity;
                                        AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
                                        C89219l.m154716b(supportFragmentManager, str14);
                                        if (!supportFragmentManager.mo3567h()) {
                                            C62577t.m112998a(jVar).show(eVar.getSupportFragmentManager(), "NotificationBottomDialog");
                                            return;
                                        }
                                        return;
                                    }
                                    C62605a aVar3 = new C62605a();
                                    Bundle bundle = new Bundle();
                                    bundle.putSerializable(C62605a.f141960t, user);
                                    bundle.putString(C62605a.f141961u, str10);
                                    bundle.putString(C62605a.f141962v, str11);
                                    bundle.putString(C62605a.f141963w, str13);
                                    bundle.putSerializable(C62605a.f141964x, awemeRawAd);
                                    aVar3.setArguments(bundle);
                                    aVar3.f141984f = aVar2;
                                    aVar3.f141989k = fVar;
                                    aVar3.f27012r = aVar3.f141991m;
                                    aVar3.f141990l = aVar3.f141992n;
                                    AbstractC0952i supportFragmentManager2 = ((ActivityC0945e) activity).getSupportFragmentManager();
                                    C89219l.m154716b(supportFragmentManager2, str14);
                                    aVar3.show(supportFragmentManager2, "NotificationBottomDialog");
                                }
                            }
                        } else if (activity != null) {
                            C23028c.m43435a((C23023b) new C23023b(activity).mo37483b(R.string.h0x), new C62585f(activity, user, aVar2, str7, str8, str9, str13, awemeRawAd)).mo37405a().mo37396b().show();
                        }
                    }
                }
            } else if (activity != null) {
                C23028c.m43435a((C23023b) new C23023b(activity).mo37479a(R.string.bqq).mo37483b(R.string.s0), C62584e.f141919a).mo37405a().mo37396b().show();
            }
        }
    }

    /* renamed from: a */
    public static void m113001a(Activity activity) {
        if (activity != null) {
            C23028c.m43435a((C23023b) new C23023b(activity).mo37479a(R.string.byw).mo37483b(R.string.etd), C62589i.f141931a).mo37405a().mo37396b().show();
        }
    }

    /* renamed from: a */
    public static void m113004a(boolean z) {
        Keva repo = Keva.getRepo("push_live_" + m113009d(), 0);
        C89219l.m154716b(repo, "");
        repo.storeBoolean("key_mt_live_push_switch", z);
    }

    /* renamed from: a */
    private static Object m113000a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(8095);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(8095);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m113003a(Context context, User user) {
        String str;
        C39162r.m79460a("push_pre_permission_show", new C33744d().mo59983a("enter_from", "push_setting").mo59983a("enter_method", "notification_bell").mo59983a("enter_reason", "leave").f79943a);
        if (context != null) {
            C23023b bVar = (C23023b) new C23023b(context).mo37479a(R.string.gwx);
            String string = context.getString(R.string.gwy);
            C89219l.m154716b(string, "");
            Object[] objArr = new Object[1];
            if (user != null) {
                str = user.getUniqueId();
            } else {
                str = null;
            }
            objArr[0] = str;
            String a = C1764a.m5928a(string, Arrays.copyOf(objArr, 1));
            C89219l.m154716b(a, "");
            C23028c.m43435a(bVar.mo37413d(a), C62588h.f141930a).mo37405a().mo37396b().show();
        }
    }

    /* renamed from: a */
    public static boolean m113006a(Activity activity, String str, String str2, AbstractC63755f fVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (C80428fg.m139432a(activity)) {
            return true;
        }
        C80429fh.m139442a(activity, false, null, null, true, true, str, fVar);
        return false;
    }

    /* renamed from: a */
    public static void m113002a(Activity activity, User user, AbstractC62578a aVar, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (user != null && (activity instanceof ActivityC0945e)) {
            C62523j jVar = new C62523j(user, aVar, true, str, str2, str3, str4, awemeRawAd, 256);
            ActivityC0945e eVar = (ActivityC0945e) activity;
            AbstractC0952i supportFragmentManager = eVar.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            if (!supportFragmentManager.mo3567h()) {
                m112998a(jVar).show(eVar.getSupportFragmentManager(), "NotificationBottomDialog");
            }
        }
    }
}
