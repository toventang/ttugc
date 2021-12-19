package com.p2082ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveOptSchemaWatchLiveSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.powerpage.C17740d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC34266aw;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.p2082ss.android.ugc.aweme.app.C33569ac;
import com.p2082ss.android.ugc.aweme.app.C33659b;
import com.p2082ss.android.ugc.aweme.app.C33717c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.invite.p3021v2.InvitationReflowHelper;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.InviteUserListActivity;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.deeplink.AbstractC58600a;
import com.p2082ss.android.ugc.aweme.live.deeplink.C58604c;
import com.p2082ss.android.ugc.aweme.live.feedpage.AbstractC58619c;
import com.p2082ss.android.ugc.aweme.livewallpaper.p3420ui.LocalLiveWallPaperActivity;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.miniapp_api.model.p3445b.C59315a;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.notification.MusNewNotificationFragment;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileActivity;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.aweme.story.live.AbstractC77352b;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.p4200a.C80186c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.app.x */
public final class C33860x extends C33659b {

    /* renamed from: b */
    public static final C33863c f80148b = new C33863c((byte) 0);

    static {
        Covode.recordClassIndex(40773);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$c */
    public static final class C33863c {
        static {
            Covode.recordClassIndex(40776);
        }

        private C33863c() {
        }

        public /* synthetic */ C33863c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$p */
    public static final class C33876p extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40789);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "live";
        }

        /* renamed from: b */
        private static boolean m69325b() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.app.x$p$a */
        static final class C33877a<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ User f80164a;

            static {
                Covode.recordClassIndex(40790);
            }

            C33877a(User user) {
                this.f80164a = user;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                String uid = this.f80164a.getUid();
                C89219l.m154716b(uid, "");
                Long l = (Long) ((Map) obj).get(Long.valueOf(Long.parseLong(uid)));
                if (l != null) {
                    long longValue = l.longValue();
                    C77354d.m135264b(String.valueOf(longValue), this.f80164a.getUid());
                    String uid2 = this.f80164a.getUid();
                    if (longValue > 0) {
                        str = "live_on";
                    } else {
                        str = "live_finish";
                    }
                    C77354d.m135259a(uid2, longValue, str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.app.x$p$c */
        public static final class C33879c<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ User f80173a;

            static {
                Covode.recordClassIndex(40792);
            }

            C33879c(User user) {
                this.f80173a = user;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                String str;
                String uid = this.f80173a.getUid();
                C89219l.m154716b(uid, "");
                Long l = (Long) ((Map) obj).get(Long.valueOf(Long.parseLong(uid)));
                if (l != null) {
                    long longValue = l.longValue();
                    C77354d.m135264b(String.valueOf(longValue), this.f80173a.getUid());
                    String uid2 = this.f80173a.getUid();
                    if (longValue > 0) {
                        str = "live_on";
                    } else {
                        str = "live_finish";
                    }
                    C77354d.m135259a(uid2, longValue, str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.app.x$p$b */
        public static final class C33878b extends AbstractC89220m implements AbstractC89172b<C58604c, C89391z> {

            /* renamed from: a */
            final /* synthetic */ User f80165a;

            /* renamed from: b */
            final /* synthetic */ String f80166b;

            /* renamed from: c */
            final /* synthetic */ C89233z.C89238e f80167c;

            /* renamed from: d */
            final /* synthetic */ C89233z.C89238e f80168d;

            /* renamed from: e */
            final /* synthetic */ C89233z.C89238e f80169e;

            /* renamed from: f */
            final /* synthetic */ String f80170f;

            /* renamed from: g */
            final /* synthetic */ C89233z.C89238e f80171g;

            /* renamed from: h */
            final /* synthetic */ Activity f80172h;

            static {
                Covode.recordClassIndex(40791);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33878b(User user, String str, C89233z.C89238e eVar, C89233z.C89238e eVar2, C89233z.C89238e eVar3, String str2, C89233z.C89238e eVar4, Activity activity) {
                super(1);
                this.f80165a = user;
                this.f80166b = str;
                this.f80167c = eVar;
                this.f80168d = eVar2;
                this.f80169e = eVar3;
                this.f80170f = str2;
                this.f80171g = eVar4;
                this.f80172h = activity;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C58604c cVar) {
                T t;
                int i;
                C58604c cVar2 = cVar;
                if (cVar2 != null) {
                    User user = this.f80165a;
                    String str = cVar2.f133473c;
                    if (str == null) {
                        str = "0";
                    }
                    user.roomId = Long.parseLong(str);
                    this.f80165a.setUid(cVar2.f133471a);
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    try {
                        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                        String str2 = this.f80166b;
                        if (str2 != null) {
                            i = Integer.parseInt(str2);
                        } else {
                            i = -1;
                        }
                        roomsData.f28364t = i;
                    } catch (Throwable unused) {
                    }
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
                    T t2 = "webview";
                    if (!TextUtils.isEmpty(this.f80167c.element)) {
                        t = this.f80167c.element;
                    } else {
                        t = t2;
                    }
                    roomsData2.f28293J = t;
                    EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.f28233c;
                    if (!TextUtils.isEmpty(this.f80168d.element)) {
                        t2 = this.f80168d.element;
                    }
                    roomsData3.f28295L = t2;
                    enterRoomConfig.f28232b.f28274r = this.f80169e.element;
                    enterRoomConfig.f28233c.f28303T = this.f80170f;
                    enterRoomConfig.f28232b.f28246C = this.f80171g.element;
                    ILiveOuterService s = LiveOuterService.m107269s();
                    C89219l.m154716b(s, "");
                    s.mo95835i().mo105593a(this.f80172h, this.f80165a, enterRoomConfig);
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "live");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            long j;
            Long g;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (!LiveOptSchemaWatchLiveSetting.INSTANCE.getValue()) {
                return m69324b(activity, uri, str, str2, str3, z);
            }
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (z) {
                User user = new User();
                user.setUid(uri.getQueryParameter("user_id"));
                String queryParameter = uri.getQueryParameter("room_id");
                if (queryParameter == null || (g = C89361p.m154865g(queryParameter)) == null) {
                    j = 0;
                } else {
                    j = g.longValue();
                }
                user.roomId = j;
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                AbstractC58619c b = s.mo95828b();
                C33860x.f80148b.getClass();
                b.mo96084a(user, new C33877a(user), "");
            }
            C33659b.C33694h.m68983a(uri.getQueryParameter("user_id"), uri, true);
            HashMap hashMap = new HashMap();
            hashMap.put("from_notification", String.valueOf(z));
            ILiveOuterService s2 = LiveOuterService.m107269s();
            C89219l.m154716b(s2, "");
            if (!s2.mo95830d().mo13005a(activity, uri, hashMap)) {
                return new Intent(activity, MainActivity.class);
            }
            C33717c.C33718a.m69039a("live", uri);
            return null;
        }

        /* renamed from: b */
        private static Intent m69324b(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            long j;
            Intent intent;
            T t;
            int i;
            String str4;
            String str5;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            String queryParameter = uri.getQueryParameter("userId");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C89219l.m154716b(queryParameter, "");
            if (TextUtils.isEmpty(queryParameter) && (queryParameter = uri.getQueryParameter("user_id")) == null) {
                queryParameter = "";
            }
            String queryParameter2 = uri.getQueryParameter("unique_id");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            C89219l.m154716b(queryParameter2, "");
            if (!TextUtils.isEmpty(queryParameter)) {
                queryParameter2 = C89361p.m154920c(queryParameter2, "@", "");
            }
            String queryParameter3 = uri.getQueryParameter("sec_uid");
            C33659b.C33694h.m68983a(queryParameter, uri, true);
            String queryParameter4 = uri.getQueryParameter("liveId");
            if (queryParameter4 == null) {
                queryParameter4 = "";
            }
            C89219l.m154716b(queryParameter4, "");
            if (TextUtils.isEmpty(queryParameter4) && (queryParameter4 = uri.getQueryParameter("room_id")) == null) {
                queryParameter4 = "";
            }
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) uri.getQueryParameter("from");
            if (TextUtils.isEmpty(eVar.element)) {
                eVar.element = (T) uri.getQueryParameter("gd_label");
            }
            C89233z.C89238e eVar2 = new C89233z.C89238e();
            eVar2.element = (T) uri.getQueryParameter("enter_from_merge");
            C89233z.C89238e eVar3 = new C89233z.C89238e();
            eVar3.element = (T) uri.getQueryParameter("enter_method");
            String queryParameter5 = uri.getQueryParameter("backurl");
            String queryParameter6 = uri.getQueryParameter("tab_index");
            try {
                j = Long.parseLong(queryParameter4);
            } catch (NumberFormatException unused) {
                j = 0;
            }
            String queryParameter7 = uri.getQueryParameter("params_url");
            C89233z.C89238e eVar4 = new C89233z.C89238e();
            eVar4.element = "";
            if (!C13627m.m24498a(queryParameter7)) {
                Uri parse = Uri.parse(queryParameter7);
                if (parse != null) {
                    str5 = parse.getQueryParameter("user_id");
                } else {
                    str5 = null;
                }
                eVar4.element = (T) String.valueOf(str5);
            }
            String queryParameter8 = uri.getQueryParameter("slim_room");
            User user = new User();
            user.setUid(queryParameter);
            user.roomId = j;
            if (!TextUtils.isEmpty(queryParameter8)) {
                ILiveOuterService s = LiveOuterService.m107269s();
                C89219l.m154716b(s, "");
                queryParameter8 = s.mo95836j().mo96053a(queryParameter8);
                user.roomData = queryParameter8;
            }
            HashMap hashMap = new HashMap();
            String uri2 = uri.toString();
            C89219l.m154716b(uri2, "");
            hashMap.put("schema_uri", uri2);
            ILiveOuterService s2 = LiveOuterService.m107269s();
            C89219l.m154716b(s2, "");
            s2.mo95839m().mo34111a("ttlive_push_event_schema", 0, hashMap);
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m69325b();
            }
            if (!C58029j.f132253e) {
                return new Intent(activity, MainActivity.class);
            }
            C17964b.f42784c = true;
            if (TextUtils.isEmpty(queryParameter2) || user.roomId > 0 || z) {
                intent = null;
                T t2 = "push";
                if (!TextUtils.isEmpty(queryParameter)) {
                    C33568ab abVar = new C33568ab(activity);
                    abVar.f79733d = eVar.element;
                    abVar.f79732c = str3;
                    abVar.f79734e = j;
                    abVar.f79736g = null;
                    T t3 = eVar.element;
                    abVar.f79731b = queryParameter6;
                    abVar.f79730a = z;
                    abVar.f79737h = eVar2.element;
                    abVar.f79738i = eVar3.element;
                    abVar.f79739j = t3;
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    try {
                        if (!C13627m.m24498a(queryParameter6)) {
                            enterRoomConfig.f28233c.f28364t = Integer.valueOf(queryParameter6).intValue();
                        }
                    } catch (Exception unused2) {
                    }
                    EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f28233c;
                    if (TextUtils.isEmpty(abVar.f79737h)) {
                        str4 = t2;
                    } else {
                        str4 = abVar.f79737h;
                    }
                    roomsData.f28293J = str4;
                    EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f28233c;
                    if (!TextUtils.isEmpty(abVar.f79738i)) {
                        t2 = abVar.f79738i;
                    }
                    roomsData2.f28295L = t2;
                    enterRoomConfig.f28232b.f28274r = t3;
                    enterRoomConfig.f28233c.f28287D = queryParameter;
                    enterRoomConfig.f28233c.f28348d = queryParameter3;
                    enterRoomConfig.f28233c.f28301R = abVar.f79734e;
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        enterRoomConfig.f28231a.f28386m = true;
                    }
                    LiveOuterService.m107269s().mo95835i().mo105591a(abVar.f79735f, enterRoomConfig, queryParameter8);
                    if (z) {
                        C77354d.m135264b(String.valueOf(abVar.f79734e), queryParameter);
                    }
                    if (abVar.f79730a) {
                        C77354d.m135259a(queryParameter, abVar.f79734e, "unknow");
                    }
                    if (!TextUtils.equals(abVar.f79733d, "webview") && !TextUtils.isEmpty("jsbridge")) {
                        C17867d.m33078a();
                        C77354d.m135261a("", queryParameter, 0);
                    }
                    if (!TextUtils.isEmpty(abVar.f79732c)) {
                        C39162r.m79460a("live_play", new C33744d().mo59983a("enter_from", abVar.f79732c).mo59983a("anchor_id", queryParameter).f79943a);
                    }
                } else {
                    if (!TextUtils.equals(eVar.element, "webview") && !TextUtils.equals(eVar.element, "jsbridge")) {
                        C77354d.m135261a(user.getRequestId(), user.getUid(), user.roomId);
                    }
                    if (z) {
                        AbstractC58619c b = LiveOuterService.m107269s().mo95828b();
                        C33860x.f80148b.getClass();
                        b.mo96084a(user, new C33879c(user), "");
                    }
                    EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        enterRoomConfig2.f28231a.f28386m = true;
                    }
                    try {
                        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig2.f28233c;
                        if (queryParameter6 != null) {
                            i = Integer.parseInt(queryParameter6);
                        } else {
                            i = -1;
                        }
                        roomsData3.f28364t = i;
                    } catch (Throwable unused3) {
                    }
                    EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig2.f28233c;
                    if (!TextUtils.isEmpty(eVar2.element)) {
                        t = eVar2.element;
                    } else if (z) {
                        t = t2;
                    } else {
                        t = "webview";
                    }
                    roomsData4.f28293J = t;
                    EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig2.f28233c;
                    if (!TextUtils.isEmpty(eVar3.element)) {
                        t2 = eVar3.element;
                    } else if (!z) {
                        t2 = "webview";
                    }
                    roomsData5.f28295L = t2;
                    enterRoomConfig2.f28232b.f28274r = eVar.element;
                    enterRoomConfig2.f28233c.f28303T = queryParameter5;
                    enterRoomConfig2.f28232b.f28246C = eVar4.element;
                    ILiveOuterService s3 = LiveOuterService.m107269s();
                    C89219l.m154716b(s3, "");
                    s3.mo95835i().mo105593a(activity, user, enterRoomConfig2);
                }
            } else {
                ILiveOuterService s4 = LiveOuterService.m107269s();
                C89219l.m154716b(s4, "");
                AbstractC77352b f = s4.mo95832f();
                C89219l.m154716b(f, "");
                AbstractC58600a c = f.mo120929c();
                intent = null;
                c.mo96057a(queryParameter2, new C33878b(user, queryParameter6, eVar2, eVar3, eVar, queryParameter5, eVar4, activity));
            }
            C33717c.C33718a.m69039a("live", uri);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$q */
    public static final class C33880q extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40793);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "live";
        }

        /* renamed from: b */
        private static boolean m69329b() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "live_square");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                return new Intent(activity, MainActivity.class);
            }
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m69329b();
            }
            if (!C58029j.f132253e) {
                return new Intent(activity, MainActivity.class);
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f28233c.f28298O = true;
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95835i().mo105595b(activity, enterRoomConfig, "push");
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$u */
    public static final class C33884u extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40797);
        }

        /* renamed from: a */
        private static void m69339a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (!C56318b.m102311b()) {
                return false;
            }
            return C89219l.m154714a((Object) str, (Object) "notification");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            C89219l.m154721d(activity, "");
            Intent a = C17740d.f42407a.mo28214a(activity, MusNewNotificationFragment.class, null);
            if (a == null) {
                C39109f.m79404c("NewInboxNotificationCommand", "get PowerPage Intent is null on Push!!");
                return;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                m69339a(activity, C33569ac.C33570a.m68782a(activity, a, queryParameter));
                return;
            }
            C33717c.C33718a.m69039a(uri.getQueryParameter("label"), uri);
            C33836o a2 = C33836o.m69201a();
            C89219l.m154716b(a2, "");
            if (a2.f80094a.mo89311a()) {
                m69339a(activity, a);
                return;
            }
            activity.startActivities(new Intent[]{C80186c.m139003a(activity), a});
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$a */
    public static final class C33861a extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40774);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "account");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                return null;
            }
            if (C89219l.m154714a((Object) str2, (Object) "/2sv")) {
                return new Intent(activity, TwoStepVerificationManageActivity.class);
            }
            if (C89219l.m154714a((Object) str2, (Object) "/setting")) {
                return SmartRouter.buildRoute(activity, "//account/setting").buildIntent();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$b */
    public static final class C33862b extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40775);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C80580in.m139687c();
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            C33717c.C33718a.m69039a("homepage_hot", uri);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$e */
    public static final class C33865e extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40778);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "feed");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent(activity, MainActivity.class);
            String queryParameter = uri.getQueryParameter("tab");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C89219l.m154716b(queryParameter, "");
            try {
                int parseInt = Integer.parseInt(queryParameter);
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    C33717c.C33718a.m69039a("homepage_hot", uri);
                } else if (parseInt == 2) {
                    C33717c.C33718a.m69039a("homepage_fresh", uri);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            intent.addFlags(67108864);
            intent.addFlags(268435456);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            return InvitationReflowHelper.C51548a.m96060a(uri, intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$g */
    public static final class C33867g extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40780);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) "game", (Object) str);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C33836o a = C33836o.m69201a();
            C89219l.m154716b(a, "");
            if (a.f80094a.mo89311a()) {
                C59315a.C59316a aVar = new C59315a.C59316a();
                aVar.f135536b = "schema";
                C59315a a2 = aVar.mo96936a();
                IMiniAppService a3 = C59320c.C59324a.f135560a.mo96989a();
                uri.getQueryParameter("game_id");
                a3.openMiniApp(activity, "", a2);
                return;
            }
            Intent mainActivityIntent = MainActivity.getMainActivityIntent(activity);
            String queryParameter = uri.getQueryParameter("game_id");
            mainActivityIntent.putExtra("jumpToGame", true);
            mainActivityIntent.putExtra("gameId", queryParameter);
            C84349a.m145093a(mainActivityIntent, activity);
            activity.startActivity(mainActivityIntent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$h */
    public static final class C33868h extends AbstractC34266aw {

        /* renamed from: a */
        public final String f80149a = "click_push_follow_request";

        /* renamed from: b */
        public final String f80150b = "click_push_follow_approve";

        /* renamed from: c */
        public final String f80151c = "click_push_follow";

        /* renamed from: d */
        public final String f80152d = "click_push_digg";

        /* renamed from: e */
        public final String f80153e = "click_push_digg_comment";

        /* renamed from: f */
        public final String f80154f = "click_push_forward_digg";

        /* renamed from: g */
        public final String f80155g = "click_push_comment";

        /* renamed from: h */
        public final String f80156h = "click_push_replycomment";

        /* renamed from: i */
        public final String f80157i = "click_push_forward";

        /* renamed from: j */
        public final String f80158j = "click_push_forward_and_forward";

        /* renamed from: k */
        public final String f80159k = "click_push_forward_comment";

        /* renamed from: l */
        public final String f80160l = "click_push_forwardreplycomment";

        /* renamed from: m */
        public final String f80161m = "click_push_videoat";

        /* renamed from: n */
        public final String f80162n = "click_push_commentat";

        /* renamed from: o */
        public final String f80163o = "click_push_forward_at";

        static {
            Covode.recordClassIndex(40781);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "notification");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            if (!C89219l.m154714a((Object) "notification", (Object) str)) {
                return null;
            }
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            String queryParameter2 = uri.getQueryParameter("label");
            C33717c.C33718a.m69039a(queryParameter2, uri);
            if (TextUtils.equals(queryParameter2, "check_profile")) {
                intent.putExtra("push", true);
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                return C33569ac.C33570a.m68782a(activity, intent, queryParameter);
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$i */
    public static final class C33869i extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40782);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "helper_center");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return SmartRouter.buildRoute(activity, "//helper_center").withParam("URL_FIELD", "https://support.tiktok.com").withParam("FIELD_TITLE", activity.getString(R.string.bvd)).withParam("FIELD_SHOW_AGREE_BUTTON", false).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$m */
    public static final class C33873m extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40786);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "chat");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            super.mo59959a(activity, uri, z);
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                Intent a = C33569ac.C33570a.m68782a(activity, null, queryParameter);
                C84349a.m145093a(a, activity);
                activity.startActivity(a);
                return;
            }
            SmartRouter.buildRoute(activity, uri.toString()).withParam("enter_from", "outer_push").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$n */
    public static final class C33874n extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40787);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "learn");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent(activity, MainActivity.class);
            intent.addFlags(536870912);
            intent.addFlags(32768);
            intent.putExtra("page_type", 16000);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$o */
    public static final class C33875o extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40788);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "link_account");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent();
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_LINK_ACCOUNT", true);
            C33717c.C33718a.m69039a("message", uri);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$r */
    public static final class C33881r extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40794);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "livewallpaper");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent(activity, LocalLiveWallPaperActivity.class);
            intent.putExtra("from", uri.getQueryParameter("from"));
            String encodedQuery = uri.getEncodedQuery();
            if (encodedQuery != null && encodedQuery.length() != 0) {
                Iterator it = C89361p.m154921c(encodedQuery, new String[]{"&"}).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    List c = C89361p.m154921c((String) it.next(), new String[]{"="});
                    if (c.size() == 2 && C89219l.m154714a(c.get(0), (Object) "is_first_install_launch")) {
                        intent.putExtra("is_first_install_launch", C89219l.m154714a(c.get(1), (Object) "true"));
                        break;
                    }
                }
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$t */
    public static final class C33883t extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40796);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "growth_activity_dialog");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return new Intent(activity, MainActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$v */
    public static final class C33885v extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40798);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "private");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent();
            String queryParameter = uri.getQueryParameter("multi_account_push_uid");
            intent.setClassName(activity, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent.setFlags(335544320);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
            intent.putExtra("label", uri.getQueryParameter("label"));
            intent.putExtra("uid", uri.getLastPathSegment());
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                return C33569ac.C33570a.m68782a(activity, intent, queryParameter);
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$x */
    public static final class C33887x extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40800);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "prop_detail";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "stickers");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            boolean z2;
            Collection collection;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (TextUtils.isEmpty(str2) || !C89361p.m154874b(str2, "/detail/", false)) {
                z2 = false;
            } else {
                z2 = true;
            }
            ArrayList arrayList = null;
            if (!z2) {
                return null;
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (!TextUtils.isEmpty(lastPathSegment)) {
                if (lastPathSegment == null) {
                    C89219l.m154715b();
                }
                List<String> split = new C89350l(",").split(lastPathSegment, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                collection = C89070n.m154571d((Iterable) split, listIterator.nextIndex() + 1);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    Object[] array = collection.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    String[] strArr = (String[]) array;
                    arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(strArr, strArr.length)));
                }
                collection = C89086z.INSTANCE;
                Object[] array2 = collection.toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr2 = (String[]) array2;
                arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(strArr2, strArr2.length)));
            }
            Intent buildIntent = SmartRouter.buildRoute(activity, "//stickers/detail").withParam("extra_stickers", arrayList).buildIntent();
            C33717c.C33718a.m69039a("prop_detail", uri);
            return buildIntent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$y */
    public static final class C33888y extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40801);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "challenge_detail";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "tag");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            CommerceChallengeServiceImpl.m75741e().mo65380a(uri, uri.getQueryParameter("id"));
            SmartRoute withParam = SmartRouter.buildRoute(activity, "//challenge/detail").withParam("id", uri.getQueryParameter("id")).withParam("enter_from", uri.getQueryParameter("enter_from"));
            C33717c.C33718a.m69039a("challenge_detail", uri);
            return withParam.buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$f */
    public static final class C33866f extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40779);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) (str + str2), (Object) "friend/find");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin() || !TextUtils.equals(uri.getQueryParameter("platform"), "facebook") || C80580in.m139687c() || !C16048b.m29633a().mo25421a(true, "ftc_bind_enable", false) || C31575b.m65863e().isPlatformBound("facebook")) {
                return null;
            }
            Intent intent = new Intent(activity, InviteUserListActivity.class);
            intent.putExtra(StringSet.type, 3);
            intent.putExtra("enter_from", "guide_to_invite_third_friends");
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$s */
    public static final class C33882s extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40795);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) "microapp", (Object) str) || C89219l.m154714a((Object) "microgame", (Object) str)) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            String str;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            String queryParameter = uri.getQueryParameter("schema_from");
            if (TextUtils.equals(queryParameter, "splash")) {
                str = "025001";
            } else if (TextUtils.equals(queryParameter, "qr_code")) {
                str = "021002";
            } else if (TextUtils.equals(queryParameter, "ad_link")) {
                str = "025003";
            } else {
                str = "";
            }
            String queryParameter2 = uri.getQueryParameter("position");
            if (queryParameter2 == null) {
                queryParameter2 = "";
            }
            C89219l.m154716b(queryParameter2, "");
            C59315a.C59316a aVar = new C59315a.C59316a();
            aVar.f135536b = "schema";
            aVar.f135537c = str;
            aVar.f135535a = queryParameter2;
            aVar.f135538d = "open_url";
            C59320c.C59324a.f135560a.mo96989a().openMiniApp(activity, uri.toString(), aVar.mo96936a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$d */
    public static final class C33864d extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40777);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89361p.m154874b(str + str2, "aweme/create", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            boolean booleanQueryParameter = uri.getBooleanQueryParameter("effects", false);
            boolean booleanQueryParameter2 = uri.getBooleanQueryParameter("blur", false);
            boolean booleanQueryParameter3 = uri.getBooleanQueryParameter("duet", false);
            String queryParameter = uri.getQueryParameter("aweme_id");
            Intent intent = new Intent(activity, PushCameraBlurActivity.class);
            intent.putExtra("show_dialog", booleanQueryParameter2);
            intent.putExtra("show_effect", booleanQueryParameter);
            intent.putExtra("show_duet", booleanQueryParameter3);
            intent.putExtra("aid", queryParameter);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$w */
    public static final class C33886w extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40799);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89361p.m154874b(str + str2, "user/referral", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return new Intent(activity, MainActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$z */
    public static final class C33889z extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40802);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89361p.m154874b(str + str2, "user/profile/", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            String queryParameter = uri.getQueryParameter("gd_label");
            String queryParameter2 = uri.getQueryParameter("multi_account_push_uid");
            String lastPathSegment = uri.getLastPathSegment();
            String a = C33659b.C33694h.m68983a(lastPathSegment, uri, true);
            if (TextUtils.equals(queryParameter, "click_push_fr")) {
                C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "push").mo59983a("enter_method", "click_push").mo59983a("to_user_id", lastPathSegment).f79943a);
            }
            if (TextUtils.equals(queryParameter, "user_recommend")) {
                C39162r.m79460a("follow_card", new C33744d().mo59983a("enter_from", "follow_card_push").mo59983a("event_type", "enter_profile").mo59983a("rec_uid", lastPathSegment).f79943a);
                C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", "follow_card_push").mo59983a("to_user_id", lastPathSegment).f79943a);
            }
            if (TextUtils.equals(queryParameter, "click_push_user")) {
                C39162r.m79460a("follow_recommend", new C33744d().mo59983a("enter_from", "push_out_app").mo59983a("scene_type", "push").mo59983a("action_type", "enter_profile").mo59983a("to_user_id", uri.getQueryParameter("to_user_id")).mo59983a("rule_id", uri.getQueryParameter("rule_id")).mo59983a("rec_type", uri.getQueryParameter("rec_type")).mo59983a("follow_type", uri.getQueryParameter("follow_type")).mo59983a("relation_type", uri.getQueryParameter("relation_type")).f79943a);
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (TextUtils.equals(lastPathSegment, g.getCurUserId())) {
                C33717c.C33718a.m69039a("personal_homepage", uri);
            } else {
                C33717c.C33718a.m69039a("others_homepage", uri);
            }
            Intent intent = new Intent(activity, UserProfileActivity.class);
            String queryParameter3 = uri.getQueryParameter("from");
            intent.putExtra("uid", lastPathSegment);
            intent.putExtra("sec_user_id", a);
            intent.putExtra(StringSet.type, uri.getQueryParameter(StringSet.type));
            intent.putExtra("source_aid", uri.getQueryParameter("source_aid"));
            intent.putExtra("from_micro_app", queryParameter3);
            if (TextUtils.equals(queryParameter, "click_push_user")) {
                intent.putExtra("recommend_enter_profile_params", new C66623g(uri.getQueryParameter("enter_from"), "", C59256u.EnumC59259c.PUSH, uri.getQueryParameter("rec_type"), C59256u.EnumC59258b.SINGLE, uri.getQueryParameter("to_user_id"), uri.getQueryParameter("group_id"), uri.getQueryParameter("author_id"), uri.getQueryParameter("req_id"), uri.getQueryParameter("homepage_user_id"), uri.getQueryParameter("relation_type"), uri.getQueryParameter("social_info")));
            }
            IAccountUserService g2 = C31575b.m65865g();
            C89219l.m154716b(g2, "");
            if (g2.isLogin() || !C89219l.m154714a((Object) "click_push_follow_approve", (Object) queryParameter)) {
                return intent;
            }
            return C33569ac.C33570a.m68782a(activity, intent, queryParameter2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$j */
    public static final class C33870j extends C33659b.C33696j {
        static {
            Covode.recordClassIndex(40783);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo60120a(Uri uri, Intent intent, boolean z) {
            C33596al.m68809a(uri, intent, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$k */
    public static final class C33871k extends C33659b.C33698k {
        static {
            Covode.recordClassIndex(40784);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo60120a(Uri uri, Intent intent, boolean z) {
            C33596al.m68809a(uri, intent, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.x$l */
    public static final class C33872l extends C33659b.C33710v {
        static {
            Covode.recordClassIndex(40785);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo60120a(Uri uri, Intent intent, boolean z) {
            C33596al.m68809a(uri, intent, z);
        }
    }
}
