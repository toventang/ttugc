package com.p2082ss.android.ugc.aweme.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.AbstractC34266aw;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.IReplaceMusicDownloadService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33717c;
import com.p2082ss.android.ugc.aweme.app.C33722d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.p2331i.C33795a;
import com.p2082ss.android.ugc.aweme.app.p2332j.C33797a;
import com.p2082ss.android.ugc.aweme.app.p2333k.C33800b;
import com.p2082ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.p2570im.C38024a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.deeplink.C41050m;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.experiment.C46882ej;
import com.p2082ss.android.ugc.aweme.feedback.C50567b;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.ContactsActivity;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.live.AbstractC58593c;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;
import com.p2082ss.android.ugc.aweme.metrics.C59252q;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60830h;
import com.p2082ss.android.ugc.aweme.notification.MusNotificationDetailActivity;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.ProfileEditActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.UserProfileActivity;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.p3895y.C74325a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3895y.C74329b;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import com.p2082ss.android.ugc.aweme.utils.p4200a.C80186c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.app.b */
public class C33659b {

    /* renamed from: a */
    public static final C33694h f79857a = new C33694h((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.app.b$af */
    public static final class C33666af extends AbstractC34266aw {

        /* renamed from: a */
        public static final C33667a f79858a = new C33667a((byte) 0);

        static {
            Covode.recordClassIndex(40561);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return null;
        }

        /* renamed from: com.ss.android.ugc.aweme.app.b$af$a */
        public static final class C33667a {
            static {
                Covode.recordClassIndex(40562);
            }

            private C33667a() {
            }

            public /* synthetic */ C33667a(byte b) {
                this();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (!C89361p.m154872a("messages", str, true) || !C89361p.m154872a("/group", str2, true)) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C33836o a = C33836o.m69201a();
            C89219l.m154716b(a, "");
            boolean a2 = a.f80094a.mo89311a();
            String queryParameter = uri.getQueryParameter("invite_id");
            if (queryParameter == null) {
                queryParameter = "";
            }
            if (queryParameter.length() != 0) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    if (!a2) {
                        Intent a3 = C80186c.m139003a(activity);
                        C84349a.m145093a(a3, activity);
                        activity.startActivity(a3);
                    }
                    IMService.createIIMServicebyMonsterPlugin(false).handleGroupInvite(activity, queryParameter);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$aj */
    public static final class C33671aj extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40566);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.b$aj$a */
        public static final class C33672a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ Activity f79859a;

            /* renamed from: b */
            final /* synthetic */ Uri f79860b;

            static {
                Covode.recordClassIndex(40567);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            C33672a(Activity activity, Uri uri) {
                this.f79859a = activity;
                this.f79860b = uri;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                Activity activity = this.f79859a;
                Uri uri = this.f79860b;
                C89219l.m154721d(activity, "");
                C89219l.m154721d(uri, "");
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59960a() {
            return AVExternalServiceImpl.m113114a().classnameService().getVideoPublishActivityClass().getName();
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "publishVideo");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            AVExternalServiceImpl.m113114a().asyncService(activity, "deep_link_publish_video", new C33672a(activity, uri));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$an */
    public static final class C33676an extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40571);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.b$an$a */
        public static final class C33677a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ Activity f79861a;

            /* renamed from: b */
            final /* synthetic */ Uri f79862b;

            static {
                Covode.recordClassIndex(40572);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            C33677a(Activity activity, Uri uri) {
                this.f79861a = activity;
                this.f79862b = uri;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                AVExternalServiceImpl.m113114a().shoutOutsService().startShoutoutsPublishActivityFromDL(this.f79861a, this.f79862b);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89361p.m154874b(str + str2, "shoutouts/publish", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            AVExternalServiceImpl.m113114a().asyncService(activity, "deep_link_shoutouts_publish_video", new C33677a(activity, uri));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ao */
    public static final class C33678ao extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40573);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.b$ao$a */
        public static final class C33679a implements IExternalService.ServiceLoadCallback {

            /* renamed from: a */
            final /* synthetic */ Activity f79863a;

            static {
                Covode.recordClassIndex(40574);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onDismiss() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onFailed() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onOK() {
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
            }

            C33679a(Activity activity) {
                this.f79863a = activity;
            }

            @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                C89219l.m154721d(asyncAVService, "");
                asyncAVService.uiService().recordService().startRecord(this.f79863a, new RecordConfig.Builder().shootWay("upload_anchor").build());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (!C89361p.m154872a("studio", str, true) || !C89361p.m154872a("/upload", str2, true)) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            AVExternalServiceImpl.m113114a().asyncServiceWithActivity(activity, "deep_link_upload_video", new C33679a(activity));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$c */
    public static final class C33688c extends AbstractC34266aw {

        /* renamed from: a */
        public static final String f79868a = "hot";

        /* renamed from: b */
        public static final String f79869b = "cold";

        /* renamed from: c */
        public static final String f79870c = "feed";

        /* renamed from: d */
        public static final String f79871d = "detail";

        /* renamed from: e */
        public static final String f79872e = "gids";

        /* renamed from: f */
        public static final C33689a f79873f = new C33689a((byte) 0);

        /* renamed from: com.ss.android.ugc.aweme.app.b$c$a */
        public static final class C33689a {
            static {
                Covode.recordClassIndex(40584);
            }

            private C33689a() {
            }

            public /* synthetic */ C33689a(byte b) {
                this();
            }
        }

        static {
            Covode.recordClassIndex(40583);
        }

        /* renamed from: a */
        private static Intent m68967a(Activity activity) {
            C89219l.m154721d(activity, "");
            Intent a = C80186c.m139003a(activity);
            a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            a.putExtra("tab", 1);
            return a;
        }

        /* renamed from: a */
        private static Intent m68968a(Activity activity, Uri uri) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("from_adsapp_activity", true);
            intent.putExtra("from_uid", uri.getQueryParameter("from_uid"));
            return intent;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) (str + str2), (Object) "aweme/push_detail");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            Intent a;
            int i;
            String str4;
            String str5 = "";
            C89219l.m154721d(activity, str5);
            C89219l.m154721d(uri, str5);
            C89219l.m154721d(str, str5);
            C89219l.m154721d(str2, str5);
            C89219l.m154721d(str3, str5);
            JSONObject jSONObject = new JSONObject();
            C33836o a2 = C33836o.m69201a();
            C89219l.m154716b(a2, str5);
            if (a2.f80094a.mo89311a()) {
                if (TextUtils.equals(uri.getQueryParameter(f79868a), f79870c)) {
                    a = m68967a(activity);
                } else {
                    a = m68968a(activity, uri);
                }
            } else if (TextUtils.equals(uri.getQueryParameter(f79869b), f79870c)) {
                a = m68967a(activity);
            } else {
                a = m68968a(activity, uri);
            }
            C89219l.m154721d(uri, str5);
            C89219l.m154721d(str3, str5);
            if (a != null) {
                String queryParameter = uri.getQueryParameter(f79872e);
                if (!TextUtils.isEmpty(queryParameter)) {
                    a.putExtra("ids", queryParameter);
                    a.putExtra("gids", queryParameter);
                }
                String queryParameter2 = uri.getQueryParameter("from");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    a.putExtra("from_micro_app", queryParameter2);
                }
                String queryParameter3 = uri.getQueryParameter("label");
                if (TextUtils.isEmpty(queryParameter3)) {
                    queryParameter3 = "web";
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = queryParameter3;
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    str3 = "mp_page";
                }
                a.putExtra("refer", str3);
                a.putExtra("gd_label", uri.getQueryParameter("gd_label"));
                String queryParameter4 = uri.getQueryParameter("push_params");
                if (!TextUtils.isEmpty(queryParameter4)) {
                    a.putExtra("push_params", queryParameter4);
                }
                if (TextUtils.equals(uri.getQueryParameter(f79869b), "nearby_detail")) {
                    C33836o a3 = C33836o.m69201a();
                    C89219l.m154716b(a3, str5);
                    if (!a3.f80094a.mo89311a()) {
                        a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
                    }
                }
            }
            try {
                C33836o a4 = C33836o.m69201a();
                C89219l.m154716b(a4, str5);
                if (a4.f80094a.mo89311a()) {
                    i = 0;
                } else {
                    i = 1;
                }
                jSONObject.put("is_cold_launch", i);
                C33836o a5 = C33836o.m69201a();
                C89219l.m154716b(a5, str5);
                if (a5.f80094a.mo89311a()) {
                    str4 = f79868a;
                } else {
                    str4 = f79869b;
                }
                jSONObject.put("landing_page", uri.getQueryParameter(str4));
                String queryParameter5 = uri.getQueryParameter("push_id");
                if (queryParameter5 == null) {
                    queryParameter5 = str5;
                }
                jSONObject.put("rule_id", queryParameter5);
                String queryParameter6 = uri.getQueryParameter("gids");
                if (queryParameter6 == null) {
                    queryParameter6 = str5;
                }
                jSONObject.put("group_id", queryParameter6);
                Activity[] activityStack = ActivityStack.getActivityStack();
                if (activityStack == null || activityStack.length <= 1) {
                    jSONObject.put("last_page_path", str5);
                } else {
                    jSONObject.put("last_page_path", activityStack[activityStack.length - 1].getClass().getSimpleName());
                }
                String queryParameter7 = uri.getQueryParameter("gd_label");
                if (queryParameter7 != null) {
                    str5 = queryParameter7;
                }
                jSONObject.put("push_label", str5);
                C33717c.C33718a.m69039a("homepage_hot", uri);
                C39162r.m79461a("hot_search_video_push", jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$j */
    public static class C33696j extends AbstractC34266aw {

        /* renamed from: c */
        public static final C33697a f79874c = new C33697a((byte) 0);

        /* renamed from: a */
        public final String f79875a = "click_push_videoat";

        /* renamed from: b */
        public final String f79876b = "follow_card_push_publish";

        static {
            Covode.recordClassIndex(40591);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "detail";
        }

        /* renamed from: com.ss.android.ugc.aweme.app.b$j$a */
        public static final class C33697a {
            static {
                Covode.recordClassIndex(40592);
            }

            private C33697a() {
            }

            public /* synthetic */ C33697a(byte b) {
                this();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89361p.m154874b(str + str2, "aweme/detail/", false) || C89361p.m154874b(str + str2, "tuwen/detail/", false) || C89361p.m154874b(str + str2, "story/detail/", false)) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            Intent intent = new Intent(activity, DetailActivity.class);
            String queryParameter = uri.getQueryParameter("enter_from");
            String queryParameter2 = uri.getQueryParameter("video_from");
            String queryParameter3 = uri.getQueryParameter("story_type");
            intent.putExtra("id", uri.getLastPathSegment());
            intent.putExtra("video_from", queryParameter2);
            intent.putExtra("refer", "notification_page");
            intent.putExtra("enter_from", queryParameter);
            intent.putExtra("story type", queryParameter3);
            intent.setData(uri);
            String queryParameter4 = uri.getQueryParameter("commentId");
            if (!TextUtils.isEmpty(queryParameter4)) {
                intent.putExtra("cid", queryParameter4);
            }
            C33836o a = C33836o.m69201a();
            C89219l.m154716b(a, "");
            if (a.f80094a.mo89311a()) {
                C84349a.m145093a(intent, activity);
                activity.startActivity(intent);
                return;
            }
            activity.startActivities(new Intent[]{C80186c.m139003a(activity), intent});
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0113  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0148  */
        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo59955a(android.app.Activity r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23) {
            /*
            // Method dump skipped, instructions count: 470
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.C33659b.C33696j.mo59955a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$k */
    public static class C33698k extends AbstractC34266aw {

        /* renamed from: a */
        public static final C33699a f79877a = new C33699a((byte) 0);

        static {
            Covode.recordClassIndex(40593);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.b$k$a */
        public static final class C33699a {
            static {
                Covode.recordClassIndex(40594);
            }

            private C33699a() {
            }

            public /* synthetic */ C33699a(byte b) {
                this();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "detail");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent(activity, DetailActivity.class);
            if (!TextUtils.isEmpty(str3)) {
                str4 = str3;
            } else {
                str4 = "web";
            }
            Intent a = C33694h.m68982a(activity, uri, intent, z, uri.getQueryParameter("id"));
            mo60120a(uri, a, z);
            a.putExtra("refer", str4);
            a.putExtra("from_token", str3);
            a.putExtra("id", uri.getQueryParameter("id"));
            C33717c.C33718a.m69039a("detail", uri);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$v */
    public static class C33710v extends AbstractC34266aw {

        /* renamed from: a */
        public static final C33711a f79878a = new C33711a((byte) 0);

        static {
            Covode.recordClassIndex(40605);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "detail";
        }

        /* renamed from: com.ss.android.ugc.aweme.app.b$v$a */
        public static final class C33711a {
            static {
                Covode.recordClassIndex(40606);
            }

            private C33711a() {
            }

            public /* synthetic */ C33711a(byte b) {
                this();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) str, (Object) "item") || C89219l.m154714a((Object) str, (Object) "musical")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent a = C33694h.m68982a(activity, uri, new Intent(activity, DetailActivity.class), z, uri.getQueryParameter("id"));
            mo60120a(uri, a, z);
            a.putExtra("refer", "web");
            a.putExtra("id", uri.getQueryParameter("id"));
            C33717c.C33718a.m69039a("detail", uri);
            return a;
        }
    }

    static {
        Covode.recordClassIndex(40554);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$h */
    public static final class C33694h {
        static {
            Covode.recordClassIndex(40589);
        }

        private C33694h() {
        }

        public /* synthetic */ C33694h(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m68984a(Uri uri, Intent intent) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(intent, "");
            String queryParameter = uri.getQueryParameter("tab");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C89219l.m154716b(queryParameter, "");
            try {
                int parseInt = Integer.parseInt(queryParameter);
                intent.putExtra("tab", parseInt);
                if (parseInt == 1) {
                    C33717c.C33718a.m69039a("discovery", uri);
                } else if (parseInt == 5) {
                    C33717c.C33718a.m69039a("follow", uri);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public static String m68983a(String str, Uri uri, boolean z) {
            String str2;
            String str3;
            if (uri != null) {
                str2 = uri.getQueryParameter("sec_uid");
            } else {
                str2 = null;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                C80517gw.m139563a().mo123773a(str, str2);
            }
            if (z) {
                C80517gw.m139563a();
                if (uri == null || (str3 = uri.toString()) == null) {
                    str3 = "";
                }
                C80517gw.m139564a(str3, str, str2);
            }
            return str2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
            if (r0.f80094a.mo89311a() == false) goto L_0x003b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static android.content.Intent m68982a(android.app.Activity r6, android.net.Uri r7, android.content.Intent r8, boolean r9, java.lang.String r10) {
            /*
            // Method dump skipped, instructions count: 161
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.C33659b.C33694h.m68982a(android.app.Activity, android.net.Uri, android.content.Intent, boolean, java.lang.String):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$al */
    public static final class C33674al extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40569);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59960a() {
            return AVExternalServiceImpl.m113114a().classnameService().getVideoRecordActivityClass().getName();
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) str, (Object) "openRecord") || C89219l.m154714a((Object) str, (Object) "video_record") || C89361p.m154874b(str + str2, "studio/task/create", false) || C89361p.m154874b(str + str2, "studio/create", false)) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            String queryParameter = uri.getQueryParameter("target_sec_uid");
            boolean a = C89219l.m154714a((Object) "live", (Object) uri.getQueryParameter("record_type"));
            if (!TextUtils.isEmpty(queryParameter)) {
                C31575b.m65859a();
                IAccountUserService e = C31575b.f75524a.mo57069e();
                C89219l.m154716b(e, "");
                if (e.isLogin()) {
                    C31575b.m65859a();
                    IAccountUserService e2 = C31575b.f75524a.mo57069e();
                    C89219l.m154716b(e2, "");
                    if (!TextUtils.equals(queryParameter, e2.getCurSecUserId())) {
                        String string = activity.getString(R.string.g_y);
                        C89219l.m154716b(string, "");
                        if (!TextUtils.isEmpty(string)) {
                            new C23144b(activity).mo37632a().mo37635a(string).mo37637b();
                        }
                    }
                }
            }
            if (activity.getIntent().getBooleanExtra("from_tile_service", false)) {
                C33744d a2 = new C33744d().mo59983a("launch_method", "click_shoot_notificationbar");
                C33796j a3 = C33796j.m69147a();
                C89219l.m154716b(a3, "");
                C39162r.m79460a("launch_from_notificationbar", a2.mo59980a("is_cold_launch", a3.f80041b ? 1 : 0).f79943a);
            }
            if (z) {
                C89219l.m154721d(activity, "");
                C89219l.m154721d(uri, "");
                RecordConfig.Builder interceptBackground = new RecordConfig.Builder().shootWay("push").enterFrom("push").interceptBackground(false);
                if (a) {
                    interceptBackground.defaultTab(2);
                }
                C74325a.m130799a(activity, interceptBackground, uri);
                interceptBackground.permissionActivityRequired(true);
                if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().needLoginBeforeRecord()) {
                    C33836o a4 = C33836o.m69201a();
                    C89219l.m154716b(a4, "");
                    boolean a5 = a4.f80094a.mo89311a();
                    Intent intent = new Intent(activity, PushLoginActivity.class);
                    intent.putExtra("EXTRA_AV_RECORD_CONFIG", interceptBackground.build());
                    if (a5) {
                        C74325a.m130796a(activity, intent);
                        return;
                    }
                    activity.startActivities(new Intent[]{C80186c.m139003a(activity), intent});
                    return;
                }
                AVExternalServiceImpl.m113114a().asyncService(activity, "push", new C74325a.C74326a(activity, interceptBackground));
                return;
            }
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C33836o a6 = C33836o.m69201a();
            C89219l.m154716b(a6, "");
            boolean a7 = a6.f80094a.mo89311a();
            RecordConfig.Builder builder = new RecordConfig.Builder();
            C74325a.m130799a(activity, builder, uri);
            builder.permissionActivityRequired(true);
            if (a7) {
                AVExternalServiceImpl.m113114a().asyncService(activity, "route", new C74325a.C74327b(activity, builder));
                return;
            }
            Intent intent2 = new Intent();
            intent2.getFlags();
            intent2.setFlags(C74329b.m130801a(activity, intent2));
            new Bundle();
            intent2.putExtra("EXTRA_AV_RECORD_CONFIG", builder.build());
            intent2.putExtras(intent2.putExtra("enter_record_from_other_platform", true));
            C74325a.m130796a(activity, intent2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ah */
    public static final class C33669ah extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40564);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "others_homepage";
        }

        /* renamed from: a */
        private static String m68925a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "profile");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C33717c.C33718a.m69039a("personal_homepage", uri);
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("uid", uri.getQueryParameter("id"));
            intent.putExtra("sec_user_id", C33694h.m68983a(uri.getQueryParameter("id"), uri, true));
            intent.putExtra("enter_from", uri.getQueryParameter("enter_from"));
            String a = m68925a(activity.getIntent(), "token_request_id");
            if (!TextUtils.isEmpty(a) && !TextUtils.isEmpty(str3)) {
                C59252q qVar = (C59252q) new C59252q().mo96825o(str3).mo96741a("click_button");
                qVar.f135314q = uri.getLastPathSegment();
                qVar.f135315r = a;
                qVar.mo96792f();
            }
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$w */
    public static final class C33712w extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40607);
        }

        /* renamed from: a */
        private static void m69022a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "login");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                C33836o a = C33836o.m69201a();
                C89219l.m154716b(a, "");
                if (a.f80094a.mo89311a()) {
                    m69022a(activity, new Intent(activity, PushLoginActivity.class));
                    return;
                }
                activity.startActivities(new Intent[]{C80186c.m139003a(activity), new Intent(activity, PushLoginActivity.class)});
                return;
            }
            m69022a(activity, C80186c.m139003a(activity));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ab */
    public static final class C33662ab extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40557);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "collection");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (C89219l.m154714a((Object) "0", (Object) uri.getQueryParameter("group"))) {
                return SmartRouter.buildRoute(activity, "aweme://music/category/").withParam("mc_id", uri.getQueryParameter("id")).withParam("title_name", uri.getQueryParameter("collection_name")).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1).buildIntent();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ad */
    public static final class C33664ad extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40559);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "nearby";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) "nearby", (Object) str);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59958a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            int i;
            Integer num;
            Integer e;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent a = C80186c.m139003a(activity);
            C89219l.m154716b(a, "");
            a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NEARBY");
            String queryParameter = uri.getQueryParameter("feed_type");
            if (queryParameter == null || (e = C89361p.m154863e(queryParameter)) == null) {
                i = 0;
            } else {
                i = e.intValue();
            }
            a.putExtra("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", i);
            String queryParameter2 = uri.getQueryParameter("insert_fresh_aweme_ids");
            String queryParameter3 = uri.getQueryParameter("insert_fresh_type");
            if (queryParameter3 != null) {
                num = C89361p.m154863e(queryParameter3);
            } else {
                num = null;
            }
            if (!TextUtils.isEmpty(queryParameter2) && num != null) {
                a.putExtra("insert_aweme_ids", queryParameter2);
                a.putExtra("insert_type", num.intValue());
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ai */
    public static final class C33670ai extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40565);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "profile_edit";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "profileEdit");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return new Intent(activity, ProfileEditActivity.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$am */
    public static final class C33675am extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40570);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "search");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (C39223a.m79602p().mo68656e()) {
                return C80186c.m139003a(activity);
            }
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            if (e.isLogin() || !Arrays.asList("AT", "BE", "BG", "HR", "CY", "CZ", "DK", "EE", "FI", "FR", "DE", "GR", "HU", "IS", "IE", "IT", "LV", "LI", "LT", "LU", "MT", "NL", "NO", "PL", "PT", "RO", "SK", "SI", "ES", "SE", "CH", "GB", "US").contains(C58071d.m104907a())) {
                return C67446h.f151111a.mo106187a(activity, uri);
            }
            C33836o a = C33836o.m69201a();
            C89219l.m154716b(a, "");
            if (a.f80094a.mo89311a()) {
                return null;
            }
            Intent a2 = C80186c.m139003a(activity);
            a2.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            a2.putExtra("tab", 1);
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$as */
    public static final class C33683as extends AbstractC34266aw {

        /* renamed from: a */
        private final String f79864a = "ban_music";

        static {
            Covode.recordClassIndex(40578);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "openVideoEditPage");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            String queryParameter = uri.getQueryParameter(StringSet.type);
            if (!TextUtils.isEmpty(queryParameter) && C89219l.m154714a((Object) queryParameter, (Object) this.f79864a)) {
                String queryParameter2 = uri.getQueryParameter("item_id");
                if (!TextUtils.isEmpty(queryParameter2)) {
                    IReplaceMusicDownloadService a = ReplaceMusicDownloadService.m108603a();
                    if (queryParameter2 == null) {
                        C89219l.m154715b();
                    }
                    a.mo57249a(queryParameter2, activity, "");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$av */
    public static final class C33686av extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40581);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "webview");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            if (!TextUtils.isEmpty(uri.getQueryParameter("rn_schema"))) {
                String uri2 = uri.toString();
                C89219l.m154716b(uri2, "");
                String a = C89361p.m154869a(uri2, C41050m.f95959a.mo70181e(), "aweme", false);
                String uri3 = C60830h.m110432a(a).mo98235a().toString();
                C89219l.m154716b(uri3, "");
                C60830h.C60831a a2 = C60830h.m110432a(a);
                if (C33797a.m69148a()) {
                    a2.mo98236a("sec_link_scene", "deeplink");
                }
                C36125t.m73598a(C36125t.m73591a(), uri3);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
            if (r5 != null) goto L_0x0047;
         */
        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo59955a(android.app.Activity r8, android.net.Uri r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.C33659b.C33686av.mo59955a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$f */
    public static final class C33692f extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40587);
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
            return C89219l.m154714a((Object) str, (Object) "challenge");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            int i;
            String queryParameter;
            String queryParameter2;
            Integer e;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            String queryParameter3 = uri.getQueryParameter("is_commerce");
            String queryParameter4 = uri.getQueryParameter("show_tab");
            boolean z2 = false;
            if (queryParameter4 == null || (e = C89361p.m154863e(queryParameter4)) == null) {
                i = 0;
            } else {
                i = e.intValue();
            }
            int i2 = i - 1;
            String queryParameter5 = uri.getQueryParameter("enter_from");
            String queryParameter6 = uri.getQueryParameter("extra_challenge_from");
            if (TextUtils.equals(queryParameter3, "1") || C89361p.m154872a("true", queryParameter3, true)) {
                CommerceChallengeServiceImpl.m75741e().mo65386a(uri.getQueryParameter("id"));
            }
            String queryParameter7 = uri.getQueryParameter("group");
            if (!TextUtils.isEmpty(str2) && C89361p.m154874b(str2, "/detail/", false)) {
                z2 = true;
            }
            if (!C89219l.m154714a((Object) "0", (Object) queryParameter7) && !z2) {
                return null;
            }
            if (!z2 ? (queryParameter = uri.getQueryParameter("id")) == null : (queryParameter = uri.getLastPathSegment()) == null) {
                queryParameter = "";
            }
            C89219l.m154716b(queryParameter, "");
            CommerceChallengeServiceImpl.m75741e().mo65380a(uri, queryParameter);
            SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//challenge/detail");
            if (z2) {
                queryParameter2 = uri.getLastPathSegment();
            } else {
                queryParameter2 = uri.getQueryParameter("id");
            }
            SmartRoute withParam = buildRoute.withParam("id", queryParameter2).withParam("from_token", str3).withParam("show_tab_index", i2).withParam("enter_from", queryParameter5).withParam("extra_challenge_from", queryParameter6);
            try {
                Long.parseLong(queryParameter);
            } catch (NumberFormatException unused) {
                withParam.withParam("extra_challenge_is_hashtag", true);
            }
            C33717c.C33718a.m69039a("challenge_detail", uri);
            return withParam.buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$g */
    public static final class C33693g extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40588);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "change_phone");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C31575b.m65863e().modifyMobile(activity, "scheme", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$m */
    public static final class C33701m extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40596);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) "discovery", (Object) str);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent a = C80186c.m139003a(activity);
            a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
            C89219l.m154716b(a, "");
            C33694h.m68984a(uri, a);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$n */
    public static final class C33702n extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40597);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "ec_lynxview");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            String query = uri.getQuery();
            if (query != null) {
                C89219l.m154716b(query, "");
                HashMap<String, Object> a = C33800b.C33801a.m69152a(query);
                String[] strArr = C46882ej.f109254b;
                if (strArr != null) {
                    boolean z2 = false;
                    for (String str : strArr) {
                        if (a.containsKey(str)) {
                            a.remove(str);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        uri = Uri.parse(uri.getScheme() + "://" + uri.getAuthority() + "?" + C33800b.C33801a.m69151a(a));
                        C89219l.m154716b(uri, "");
                    }
                }
            }
            SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").authority("lynxview").build().toString()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$p */
    public static final class C33704p extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40599);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "feedback_input");
        }

        /* renamed from: a */
        private static void m69003a(String str, HashMap<String, String> hashMap) {
            if (!(str == null || str.length() == 0)) {
                for (String str2 : C89361p.m154915b(str, new String[]{"&"})) {
                    List<String> b = C89361p.m154915b(str2, new String[]{"="});
                    if (b.size() == 2) {
                        hashMap.put(b.get(0), b.get(1));
                    }
                }
            }
        }

        /* renamed from: b */
        private static String m69004b(String str, HashMap<String, String> hashMap) {
            int a = C89361p.m154882a((CharSequence) str, '?', 0, false, 6);
            if (a > 0) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                str = str.substring(0, a);
                C89219l.m154716b(str, "");
            }
            C29844g gVar = new C29844g(str);
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                gVar.mo52130a(entry.getKey(), entry.getValue());
            }
            String a2 = gVar.mo52126a();
            C89219l.m154716b(a2, "");
            return a2;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            int i;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
                C89219l.m154716b(feedbackConf, "");
                str4 = feedbackConf.getFeHelp();
                C89219l.m154716b(str4, "");
            } catch (C16041a unused) {
                str4 = "";
            }
            HashMap hashMap = new HashMap();
            String queryParameter = Uri.parse(str4).getQueryParameter("url");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C89219l.m154716b(queryParameter, "");
            int a = C89361p.m154882a((CharSequence) queryParameter, '?', 0, false, 6);
            if (a > 0 && queryParameter.length() > (i = a + 1)) {
                Objects.requireNonNull(queryParameter, "null cannot be cast to non-null type java.lang.String");
                String substring = queryParameter.substring(i);
                C89219l.m154716b(substring, "");
                m69003a(substring, hashMap);
            }
            m69003a(uri.getEncodedQuery(), hashMap);
            String b = m69004b(queryParameter, hashMap);
            String encode = URLEncoder.encode(queryParameter);
            C89219l.m154716b(encode, "");
            String encode2 = URLEncoder.encode(b);
            C89219l.m154716b(encode2, "");
            return C33722d.C33723a.m69042a(activity, Uri.parse(C89361p.m154869a(str4, encode, encode2, true)), !z, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$q */
    public static final class C33705q extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40600);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "feedback_record");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            String queryParameter = uri.getQueryParameter("enter_from");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C89219l.m154716b(queryParameter, "");
            C50567b.m94799a(activity, queryParameter);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$r */
    public static final class C33706r extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40601);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) "modern_feed", (Object) str);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent a = C80186c.m139003a(activity);
            a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "DISCOVER");
            C89219l.m154716b(a, "");
            C33694h.m68984a(uri, a);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$x */
    public static final class C33713x extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40608);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "lynxview");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            String query = uri.getQuery();
            if (query != null) {
                C89219l.m154716b(query, "");
                HashMap<String, Object> a = C33800b.C33801a.m69152a(query);
                String[] strArr = C46882ej.f109254b;
                if (strArr != null) {
                    boolean z2 = false;
                    for (String str : strArr) {
                        if (a.containsKey(str)) {
                            a.remove(str);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        uri = Uri.parse(uri.getScheme() + "://" + uri.getAuthority() + "?" + C33800b.C33801a.m69151a(a));
                        C89219l.m154716b(uri, "");
                    }
                }
            }
            SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$a */
    public static final class C33660a extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40555);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "friend_recommend";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) (str + str2), (Object) "user/find_friends");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            int i;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            String queryParameter = uri.getQueryParameter("inviteType");
            if (queryParameter == null) {
                queryParameter = "";
            }
            C89219l.m154716b(queryParameter, "");
            try {
                Integer valueOf = Integer.valueOf(queryParameter);
                C89219l.m154716b(valueOf, "");
                i = valueOf.intValue();
            } catch (Exception unused) {
                i = 1;
            }
            String queryParameter2 = uri.getQueryParameter("puid");
            String a = C33694h.m68983a(queryParameter2, uri, true);
            Intent a2 = C51648a.f118980a.mo87294a(activity, 0, i, "", "push");
            if (a2 != null) {
                a2.putExtra("bundle_puid", queryParameter2);
                a2.putExtra("bundle_sec_puid", a);
                a2.putExtra("bundle_recommend_user_type", queryParameter2);
            }
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ag */
    public static final class C33668ag extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40563);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (!C89361p.m154872a("user", str, true) || !C89361p.m154872a("/favorite/", str2, true)) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            String str = "";
            C89219l.m154721d(activity, str);
            C89219l.m154721d(uri, str);
            String queryParameter = uri.getQueryParameter("tab_name");
            if (queryParameter == null) {
                queryParameter = str;
            }
            String queryParameter2 = uri.getQueryParameter("mix_ids");
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
            C36125t.m73598a(C36125t.m73591a(), "aweme://favorite?tab_name=" + queryParameter + "&push_ids=" + str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$aq */
    public static final class C33681aq extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40576);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) str, (Object) "verify");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ar */
    public static final class C33682ar extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40577);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "detail";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) (str + str2), (Object) "user/video");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent(activity, DetailActivity.class);
            intent.putExtra("enter_from", "push");
            intent.putExtra("refer", "push");
            intent.putExtra("id", uri.getQueryParameter("id"));
            intent.putExtra("cid", uri.getQueryParameter("commentId"));
            C33717c.C33718a.m69039a("detail", uri);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$at */
    public static final class C33684at extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40579);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89361p.m154874b(str, "wallet_index", false) || C89219l.m154714a((Object) str, (Object) "wallet")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$u */
    public static final class C33709u extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40604);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "notification";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89219l.m154714a((Object) (str + str2), (Object) "user/imfans");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return SmartRouter.buildRoute(activity, "//notification").withParam("from_where", 0).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$z */
    public static final class C33715z extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40610);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "music_detail";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) str, (Object) "music") || C89219l.m154714a((Object) str, (Object) "song")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (C89219l.m154714a((Object) str, (Object) "song")) {
                Intent buildIntent = SmartRouter.buildRoute(activity, "//music/detail").withParam("id", uri.getQueryParameter("trackId")).buildIntent();
                C33717c.C33718a.m69039a("music_detail", uri);
                return buildIntent;
            }
            String queryParameter = uri.getQueryParameter("group");
            boolean z2 = false;
            if (!TextUtils.isEmpty(str2) && C89361p.m154874b(str2, "/detail/", false)) {
                z2 = true;
            }
            String str4 = null;
            if (!C89219l.m154714a((Object) "0", (Object) queryParameter) && !z2) {
                return null;
            }
            Intent buildIntent2 = SmartRouter.buildRoute(activity, "//music/detail").buildIntent();
            String queryParameter2 = uri.getQueryParameter("id");
            if (TextUtils.isEmpty(queryParameter2)) {
                queryParameter2 = uri.getLastPathSegment();
            }
            if (!C89219l.m154714a((Object) "detail", (Object) queryParameter2) && !C89219l.m154714a((Object) "0", (Object) queryParameter2)) {
                str4 = queryParameter2;
            }
            buildIntent2.putExtra("id", str4);
            buildIntent2.putExtra("from_token", str3);
            buildIntent2.putExtra("partnerName", uri.getQueryParameter("partnerName"));
            buildIntent2.putExtra("partnerMusicId", uri.getQueryParameter("partnerMusicId"));
            buildIntent2.putExtra("extra_music_from", uri.getQueryParameter("enter_from"));
            C33717c.C33718a.m69039a("music_detail", uri);
            return buildIntent2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ae */
    public static final class C33665ae extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40560);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (!C89361p.m154872a("chatting", str, true) || !C89361p.m154872a("/message", str2, true)) {
                return false;
            }
            return true;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C38024a.m77083a(activity, uri.getQueryParameter("uid"), uri.getQueryParameter("ext"), null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$l */
    public static final class C33700l extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40595);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "detail";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89361p.m154874b(str + str2, "aweme/detail_list", false) || C89361p.m154874b(str + str2, "tuwen/detail_list", false)) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.content.Intent mo59955a(android.app.Activity r11, android.net.Uri r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16) {
            /*
            // Method dump skipped, instructions count: 195
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.app.C33659b.C33700l.mo59955a(android.app.Activity, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, boolean):android.content.Intent");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$s */
    public static final class C33707s extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40602);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "live";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89361p.m154874b(str + str2, "hotlive/feed", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            AbstractC66586a i = s.mo95835i();
            if (i != null) {
                i.mo105595b(activity, new EnterRoomConfig(), "HotLiveCommand");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$aa */
    public static final class C33661aa extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40556);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89361p.m154874b(str + str2, "assmusic/category", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ac */
    public static final class C33663ac extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40558);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "personal_homepage";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) "mine", (Object) str) || C89219l.m154714a((Object) (str + str2), (Object) "user/homepage")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59958a(Activity activity, Uri uri, String str, String str2, String str3, boolean z, boolean z2) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin() || z2) {
                Intent a = C80186c.m139003a(activity);
                C89219l.m154716b(a, "");
                a.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                C33717c.C33718a.m69039a("mine", uri);
                return a;
            }
            Intent a2 = C80186c.m139003a(activity);
            C89219l.m154716b(a2, "");
            return a2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ap */
    public static final class C33680ap extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40575);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "others_homepage";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) (str + str2), (Object) "user/profile") || C89219l.m154714a((Object) str, (Object) "profile")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            String queryParameter = uri.getQueryParameter("id");
            if (queryParameter == null) {
                queryParameter = uri.getQueryParameter("uid");
            }
            String queryParameter2 = uri.getQueryParameter("unique_id");
            String a = C33694h.m68983a(queryParameter, uri, true);
            Intent intent = new Intent(activity, UserProfileActivity.class);
            intent.putExtra("uid", queryParameter);
            intent.putExtra("sec_user_id", a);
            intent.putExtra("unique_id", queryParameter2);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$au */
    public static final class C33685au extends AbstractC34266aw {

        /* renamed from: a */
        private final int f79865a = 3;

        /* renamed from: b */
        private final long f79866b = -1;

        /* renamed from: c */
        private boolean f79867c;

        static {
            Covode.recordClassIndex(40580);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final String mo59956a(Uri uri) {
            C89219l.m154721d(uri, "");
            return "live";
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) str, (Object) "sign") || C89219l.m154714a((Object) str, (Object) "webcast_room") || C89219l.m154714a((Object) str, (Object) "webcast_profile") || C89219l.m154714a((Object) str, (Object) "webcast_feed") || C89219l.m154714a((Object) str, (Object) "webcast_feed_activity") || C89219l.m154714a((Object) str, (Object) "webcast_webview") || C89219l.m154714a((Object) str, (Object) "webcast_lynxview")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            int i;
            String uri2;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            String str = null;
            AbstractC58593c cVar = null;
            if (C89219l.m154714a((Object) uri.getHost(), (Object) "webcast_feed") || C89219l.m154714a((Object) uri.getHost(), (Object) "webcast_feed_activity")) {
                HashMap hashMap = new HashMap();
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null) {
                    for (String str2 : queryParameterNames) {
                        String queryParameter = uri.getQueryParameter(str2);
                        if (queryParameter != null) {
                            hashMap.put(str2, queryParameter);
                        }
                    }
                }
                try {
                    ILiveOuterService s = LiveOuterService.m107269s();
                    C89219l.m154716b(s, "");
                    if (s.mo95838l().mo95864b()) {
                        if (C11755f.m20713a() != null) {
                            AbstractC11846d a = C11755f.m20713a();
                            if (a != null) {
                                Map<String, Object> a2 = a.mo12983a(this.f79866b);
                                if (a2 != null) {
                                    if (a2.get("feed_url") instanceof String) {
                                        Object obj = a2.get("feed_url");
                                        if (obj != null) {
                                            str = (String) obj;
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                        }
                                    }
                                    if (a2.get("feed_style") instanceof Integer) {
                                        Object obj2 = a2.get("feed_style");
                                        if (obj2 != null) {
                                            i = ((Integer) obj2).intValue();
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    if (C13627m.m24498a(str)) {
                                        return;
                                    }
                                    if (i != this.f79865a) {
                                        return;
                                    }
                                    if (C11755f.m20713a() != null) {
                                        AbstractC11846d a3 = C11755f.m20713a();
                                        if (a3 == null) {
                                            C89219l.m154715b();
                                        }
                                        C89219l.m154716b(a3, "");
                                        if (a3.mo13034o() == null) {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (!this.f79867c) {
                            this.f79867c = true;
                        } else {
                            return;
                        }
                        String str3 = (String) hashMap.get("gd_label");
                        String str4 = (String) hashMap.get("enter_from_merge");
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("_param_live_platform", "live");
                        if (str3 != null) {
                            hashMap2.put("gd_label", str3);
                            hashMap2.put("enter_from_merge", "inner_ad");
                        } else {
                            if (str4 == null) {
                                str4 = "";
                            }
                            hashMap2.put("enter_from_merge", str4);
                        }
                        C39162r.m79460a("livesdk_enter_live_merge", hashMap2);
                        if (C11755f.m20713a() != null) {
                            AbstractC11846d a4 = C11755f.m20713a();
                            if (a4 == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(a4, "");
                            if (a4.mo13034o() != null) {
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("intercept", "new_style");
                                String str5 = (String) hashMap.get("gd_label");
                                if (str5 != null) {
                                    hashMap3.put("gd_label", str5);
                                }
                                String str6 = (String) hashMap.get("enter_from_merge");
                                if (str6 != null) {
                                    hashMap3.put("enter_from_merge", str6);
                                }
                                String str7 = (String) hashMap.get("enter_method");
                                if (str7 != null) {
                                    hashMap3.put("enter_method", str7);
                                }
                                AbstractC11846d a5 = C11755f.m20713a();
                                if (a5 == null) {
                                    C89219l.m154715b();
                                }
                                C89219l.m154716b(a5, "");
                                a5.mo13034o().mo13211a(hashMap3);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                if (C89219l.m154714a((Object) uri.getHost(), (Object) "webcast_webview") || C89219l.m154714a((Object) uri.getHost(), (Object) "webcast_lynxview")) {
                    ILiveOuterService s2 = LiveOuterService.m107269s();
                    C89219l.m154716b(s2, "");
                    ILiveOuterService s3 = LiveOuterService.m107269s();
                    C89219l.m154716b(s3, "");
                    String[] strArr = (String[]) s3.mo95830d().mo12981a("deeplink_webcast_webview_allowed_list", new String[0]);
                    if (((Boolean) s2.mo95830d().mo12981a("deeplink_webcast_webview_enable", (Object) false)).booleanValue()) {
                        String queryParameter2 = uri.getQueryParameter("url");
                        if (C13627m.m24498a(queryParameter2) || (uri2 = Uri.parse(queryParameter2).toString()) == null) {
                            uri2 = "";
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            Uri parse = Uri.parse(uri2);
                            C89219l.m154716b(parse, "");
                            for (String str8 : strArr) {
                                if (!C89219l.m154714a((Object) "https", (Object) parse.getScheme()) || parse.getUserInfo() != null || !C89219l.m154714a((Object) str8, (Object) parse.getHost())) {
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    Uri.Builder appendQueryParameter = Uri.parse(uri.toString()).buildUpon().appendQueryParameter("is_from_push", String.valueOf(z));
                    if (!z) {
                        appendQueryParameter.appendQueryParameter("sec_link_scene", "deeplink");
                    }
                    Uri build = appendQueryParameter.build();
                    C89219l.m154716b(build, "");
                    uri = build;
                } catch (Throwable th) {
                    C13468b.m24210a(th);
                }
                try {
                    ILiveOuterService s4 = LiveOuterService.m107269s();
                    if (s4 == null || (cVar = s4.mo95830d()) == null) {
                        C89219l.m154715b();
                    }
                    cVar.mo13004a(activity, uri);
                } catch (Throwable th2) {
                    C13468b.m24210a(th2);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$e */
    public static final class C33691e extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40586);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) str, (Object) "mobile") || C89219l.m154714a((Object) str, (Object) "bind_phone")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C31575b.m65863e().bindMobile(activity, "scheme", null, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$i */
    public static final class C33695i extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40590);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) (str + str2), (Object) "user/addressbook/list") || C89219l.m154714a((Object) str, (Object) "friendRecommend") || C89219l.m154714a((Object) str, (Object) "newFriendRecommend")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent(activity, ContactsActivity.class);
            if (!TextUtils.isEmpty(null)) {
                intent.putExtra("enter_from", (String) null);
            }
            intent.putExtra("just_granted_read_contacts", false);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$o */
    public static final class C33703o extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40598);
        }

        /* renamed from: a */
        private static Uri m69000a(Uri uri, String str) {
            Uri.Builder clearQuery = uri.buildUpon().clearQuery();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            ArrayList<String> arrayList = new ArrayList();
            for (T t : queryParameterNames) {
                if (!C89219l.m154714a((Object) t, (Object) str)) {
                    arrayList.add(t);
                }
            }
            for (String str2 : arrayList) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
            Uri build = clearQuery.build();
            C89219l.m154716b(build, "");
            return build;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59964a(Uri uri, String str, String str2, String str3) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (!C89219l.m154714a((Object) "ec", (Object) str2)) {
                return false;
            }
            switch (str3.hashCode()) {
                case -685527820:
                    if (str3.equals("/address/edit")) {
                        return true;
                    }
                    return false;
                case -685314168:
                    if (str3.equals("/address/list")) {
                        return true;
                    }
                    return false;
                case -335200235:
                    if (str3.equals("/order_center")) {
                        return true;
                    }
                    return false;
                case 1511021:
                    if (str3.equals("/pdp")) {
                        return true;
                    }
                    return false;
                case 43085793:
                    if (str3.equals("/order/detail")) {
                        return true;
                    }
                    return false;
                case 137278424:
                    if (str3.equals("/order_submit")) {
                        return true;
                    }
                    return false;
                case 852758595:
                    if (str3.equals("/order_submit_v2")) {
                        return true;
                    }
                    return false;
                case 1315188432:
                    if (str3.equals("/bind_result")) {
                        return true;
                    }
                    return false;
                case 1923799401:
                    if (str3.equals("/order/middle_page")) {
                        return true;
                    }
                    return false;
                default:
                    return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (C89219l.m154714a((Object) uri.getPath(), (Object) "/pdp")) {
                String queryParameter = uri.getQueryParameter("fullScreen");
                if (queryParameter == null) {
                    queryParameter = "false";
                }
                C89219l.m154716b(queryParameter, "");
                if (true ^ C89219l.m154714a((Object) queryParameter, (Object) "true")) {
                    uri = m69000a(uri, "fullScreen").buildUpon().appendQueryParameter("fullScreen", "true").build();
                    C89219l.m154716b(uri, "");
                }
                return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
            }
            String queryParameter2 = uri.getQueryParameter("fallback");
            if (queryParameter2 == null || queryParameter2.length() == 0) {
                return SmartRouter.buildRoute(activity, uri.buildUpon().scheme("aweme").build().toString()).buildIntent();
            }
            return SmartRouter.buildRoute(activity, m69000a(uri, "fallback").buildUpon().scheme("aweme").build().toString()).buildIntent();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$y */
    public static final class C33714y extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40609);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59957a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return C89361p.m154874b(str + str2, "notice/detail", false);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent(activity, MusNotificationDetailActivity.class);
            intent.putExtra("from_where", uri.getQueryParameter("from_where"));
            intent.putExtra("unRead_message_count", uri.getQueryParameter("unRead_message_count"));
            intent.putExtra("second_tab_name", uri.getQueryParameter("second_tab_name"));
            intent.putExtra("notice_name", uri.getQueryParameter("notice_name"));
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$ak */
    public static final class C33673ak extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40568);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            SmartRouter.buildRoute(activity, "//qna/detail").withParam("id", uri.getLastPathSegment()).open();
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59964a(Uri uri, String str, String str2, String str3) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return C89219l.m154714a((Object) str2, (Object) "qna");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$d */
    public static final class C33690d extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40585);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final void mo59959a(Activity activity, Uri uri, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            SmartRouter.buildRoute(activity, "//baautomessaging").open();
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59964a(Uri uri, String str, String str2, String str3) {
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return C89219l.m154714a((Object) str2, (Object) "baautomessaging");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$t */
    public static final class C33708t extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40603);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59965a(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            if (C89219l.m154714a((Object) str, (Object) "https") || C89219l.m154714a((Object) str, (Object) "http")) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            String str4;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            Intent intent = new Intent(activity, CrossPlatformActivity.class);
            String uri2 = uri.toString();
            C89219l.m154716b(uri2, "");
            if (z) {
                str4 = "push";
            } else {
                str4 = "deeplink";
            }
            intent.setData(Uri.parse(C33795a.m69146a(uri2, str4)));
            if (z) {
                intent.putExtra("hide_more", false);
                intent.putExtra("enter_from", "notification");
            }
            C33717c.C33718a.m69039a("h5", uri);
            return intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.b$b */
    public static final class C33687b extends AbstractC34266aw {
        static {
            Covode.recordClassIndex(40582);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final boolean mo59965a(String str, String str2, String str3) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return C89219l.m154714a((Object) str2, (Object) "anywhere");
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC34266aw
        /* renamed from: a */
        public final Intent mo59955a(Activity activity, Uri uri, String str, String str2, String str3, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            return SmartRouter.buildRoute(activity, uri.toString()).buildIntent();
        }
    }
}
