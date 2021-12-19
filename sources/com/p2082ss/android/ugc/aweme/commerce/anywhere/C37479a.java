package com.p2082ss.android.ugc.aweme.commerce.anywhere;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.anywheredoor_api.depend.IAnyDoorRouterDepend;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33756h;
import com.p2082ss.android.ugc.aweme.base.AnchorListManager;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.metrics.C59213ah;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.search.C67446h;
import com.p2082ss.android.ugc.aweme.search.model.C67674b;
import com.p2082ss.android.ugc.aweme.search.model.C67677c;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.reflect.Method;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commerce.anywhere.a */
public final class C37479a implements IAnyDoorRouterDepend {

    /* renamed from: a */
    public static final C37480a f88467a = new C37480a((byte) 0);

    static {
        Covode.recordClassIndex(44865);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.anywhere.a$a */
    public static final class C37480a {
        static {
            Covode.recordClassIndex(44866);
        }

        private C37480a() {
        }

        public /* synthetic */ C37480a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.anywhere.a$c */
    public static final class C37482c implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ Context f88469a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f88470b;

        static {
            Covode.recordClassIndex(44868);
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

        C37482c(Context context, RecordConfig.Builder builder) {
            this.f88469a = context;
            this.f88470b = builder;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f88469a, this.f88470b.build());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commerce.anywhere.a$d */
    public static final class RunnableC37483d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f88471a;

        static {
            Covode.recordClassIndex(44869);
        }

        RunnableC37483d(Activity activity) {
            this.f88471a = activity;
        }

        public final void run() {
            Method declaredMethod = this.f88471a.getClass().getDeclaredMethod("getCurrentFeedRecommendFragment", new Class[0]);
            C89219l.m154716b(declaredMethod, "");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f88471a, new Object[0]);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.anywhere.a$b */
    static final class RunnableC37481b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f88468a;

        static {
            Covode.recordClassIndex(44867);
        }

        RunnableC37481b(Context context) {
            this.f88468a = context;
        }

        public final void run() {
            ComponentName componentName;
            Intent launchIntentForPackage = this.f88468a.getPackageManager().getLaunchIntentForPackage(this.f88468a.getPackageName());
            Context context = this.f88468a;
            if (launchIntentForPackage != null) {
                componentName = launchIntentForPackage.getComponent();
            } else {
                componentName = null;
            }
            Intent makeRestartActivityTask = Intent.makeRestartActivityTask(componentName);
            C84349a.m145093a(makeRestartActivityTask, context);
            context.startActivity(makeRestartActivityTask);
            Runtime.getRuntime().exit(0);
        }
    }

    /* renamed from: a */
    private static void m75574a() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isLogin()) {
            C31575b.m65865g().queryUser();
            C31575b.m65865g().refreshPassportUserInfo();
            C33756h.m69101a();
        }
    }

    /* renamed from: b */
    private static void m75576b(Context context) {
        C89219l.m154721d(context, "");
        C67674b.C67675a newBuilder = C67674b.Companion.newBuilder();
        newBuilder.f151625a = "homepage_hot";
        newBuilder.f151627c = "";
        C67674b a = newBuilder.mo106686a();
        C67446h.f151111a.mo106201a(new C67677c(context, new C67678d(), a, ""));
    }

    /* renamed from: c */
    private static void m75577c(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity != null) {
                    new C23144b(activity).mo37635a("coming soon..").mo37637b();
                    return;
                }
                return;
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private static void m75578d(Context context) {
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        new C23144b(activity).mo37635a("Restart after 3s").mo37637b();
                    }
                }
            } else {
                break;
            }
        }
        C58957c.m108318a(C17873f.m33102j(), "Anywhere", "click_repost_button");
    }

    /* renamed from: a */
    private static void m75575a(Context context) {
        C89219l.m154721d(context, "");
        Activity[] activityStack = ActivityStack.getActivityStack();
        if (activityStack == null) {
            while (context != null) {
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        new C23144b(activity).mo37635a("【AnyWhereDoor】activityStack Not Found!").mo37637b();
                        return;
                    }
                    return;
                } else if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    return;
                }
            }
            return;
        }
        for (Activity activity2 : activityStack) {
            String name = activity2.getClass().getName();
            C89219l.m154716b(name, "");
            if (C89361p.m154908a((CharSequence) name, (CharSequence) "com.ss.android.ugc.aweme.main.MainActivity", false)) {
                Intent mainActivityIntent = MainActivity.getMainActivityIntent(C17867d.m33078a());
                mainActivityIntent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
                Context a = C17867d.m33078a();
                C84349a.m145093a(mainActivityIntent, a);
                a.startActivity(mainActivityIntent);
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC37483d(activity2), 500);
                return;
            }
        }
        while (context != null) {
            if (context instanceof Activity) {
                Activity activity3 = (Activity) context;
                if (activity3 != null) {
                    new C23144b(activity3).mo37635a("【AnyWhereDoor】Main Activity Not Found!").mo37637b();
                    return;
                }
                return;
            } else if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return;
            }
        }
    }

    @Override // com.p2082ss.android.anywheredoor_api.depend.IAnyDoorRouterDepend
    public final void startRoute(String str, Context context) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        switch (str.hashCode()) {
            case -1849961962:
                if (str.equals("my_profile")) {
                    C89219l.m154721d(context, "");
                    SmartRouter.buildRoute(context, "aweme://user/profile?sec_uid=MS4wLjABAAAATmLP1Fku8Ml_6vNt554lml47qGBxkB7GOy0Fob8TvhI").open();
                    m75574a();
                    return;
                }
                return;
            case -1157333237:
                if (str.equals("normal_challenge")) {
                    C89219l.m154721d(context, "");
                    SmartRouter.buildRoute(context, "aweme://challenge/detail/0?hashtag=any_door&is_commerce=0").open();
                    return;
                }
                return;
            case -906336856:
                if (str.equals("search")) {
                    m75576b(context);
                    return;
                }
                return;
            case -895866265:
                if (str.equals("splash")) {
                    C89219l.m154721d(context, "");
                    ISplashAdService i = SplashAdServiceImpl.m33397i();
                    if (i != null) {
                        i.mo28715b();
                        return;
                    }
                    return;
                }
                return;
            case -169343402:
                if (str.equals("shutdown")) {
                    Context context2 = context;
                    while (true) {
                        if (context2 != null) {
                            if (context2 instanceof Activity) {
                                Activity activity = (Activity) context2;
                                if (activity != null) {
                                    new C23144b(activity).mo37635a("Please relogin startAtlas account").mo37637b();
                                }
                            } else if (context2 instanceof ContextWrapper) {
                                context2 = ((ContextWrapper) context2).getBaseContext();
                            }
                        }
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new RunnableC37481b(context), 3000);
                    return;
                }
                return;
            case -121207376:
                if (str.equals("discovery")) {
                    C89219l.m154721d(context, "");
                    m75576b(context);
                    return;
                }
                return;
            case 3138974:
                if (str.equals("feed")) {
                    m75575a(context);
                    return;
                }
                return;
            case 461177713:
                if (str.equals("search_query")) {
                    C89219l.m154721d(context, "");
                    SmartRouter.buildRoute(context, "//search?keyword=FPX NB&display_keyword=search&enter_from=anywheredoor&search_from=anywheredoor").open();
                    return;
                }
                return;
            case 1210177285:
                if (str.equals("anchor_request")) {
                    AnchorListManager.m70432a();
                    return;
                }
                return;
            case 1216225589:
                if (str.equals("user_profile")) {
                    C89219l.m154721d(context, "");
                    SmartRouter.buildRoute(context, "aweme://user/profile?sec_uid=MS4wLjABAAAATmLP1Fku8Ml_6vNt554lml47qGBxkB7GOy0Fob8TvhI").open();
                    m75574a();
                    return;
                }
                return;
            case 1402633315:
                if (str.equals("challenge")) {
                    C89219l.m154721d(context, "");
                    SmartRouter.buildRoute(context, "//challenge/detail/1572018483564545").withParam("is_commerce", "1").open();
                    return;
                }
                return;
            case 1434631203:
                if (str.equals("settings")) {
                    m75577c(context);
                    return;
                }
                return;
            case 1880910712:
                if (str.equals("create_video")) {
                    C89219l.m154721d(context, "");
                    AVExternalServiceImpl.m113114a().asyncService(context, "direct_shoot", new C37482c(context, new RecordConfig.Builder().creationId("").shootWay("direct_shoot").groupId(C59213ah.f134853b).enterFrom(C39223a.m79601o().mo68713j()).fromMain(true).musicType(1).translationType(3)));
                    return;
                }
                return;
            case 2122459230:
                if (str.equals("star_atlas")) {
                    m75578d(context);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
