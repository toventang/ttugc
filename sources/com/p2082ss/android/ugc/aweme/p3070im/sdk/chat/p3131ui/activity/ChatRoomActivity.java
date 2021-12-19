package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.p025c.C0484a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3086b.C53714b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3093c.p3094a.C53841a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.SelectChatMsgActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53622e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53635b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53697j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55067e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55127a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55132c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56196c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity */
public final class ChatRoomActivity extends AbstractActivityC54405a implements ActivityStack.AbstractC80170b, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public static String f124619a;

    /* renamed from: b */
    public static AbstractC89172b<? super Boolean, C89391z> f124620b;

    /* renamed from: c */
    public static final C54401a f124621c = new C54401a((byte) 0);

    /* renamed from: f */
    private Dialog f124622f;

    /* renamed from: g */
    private boolean f124623g;

    /* renamed from: h */
    private final C53697j f124624h = new C53697j();

    /* renamed from: i */
    private HashMap f124625i;

    static {
        Covode.recordClassIndex(64104);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f124625i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f124625i == null) {
            this.f124625i = new HashMap();
        }
        View view = (View) this.f124625i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f124625i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.ActivityStack.AbstractC80170b
    /* renamed from: b */
    public final void mo69457b() {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(235, new RunnableC90250g(ChatRoomActivity.class, "onEvent", C53714b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity$a */
    public static final class C54401a {
        static {
            Covode.recordClassIndex(64105);
        }

        private C54401a() {
        }

        public /* synthetic */ C54401a(byte b) {
            this();
        }

        /* renamed from: a */
        public static boolean m99731a(C56245a aVar) {
            Intent intent;
            boolean z;
            String str;
            int followStatus;
            String uid;
            AbstractC89172b<Boolean, C89391z> routerCallback;
            AbstractC89172b<Boolean, C89391z> routerCallback2;
            C89219l.m154721d(aVar, "");
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            if (!createIUserServicebyMonsterPlugin.isLogin()) {
                if (aVar.getContext() instanceof Activity) {
                    Activity activity = (Activity) aVar.getContext();
                    String enterFromForMob = aVar.getEnterFromForMob();
                    if (enterFromForMob == null) {
                        enterFromForMob = "chat";
                    }
                    String enterMethodForMob = aVar.getEnterMethodForMob();
                    if (enterMethodForMob == null) {
                        enterMethodForMob = "enter_chat";
                    }
                    C58957c.m108318a(activity, enterFromForMob, enterMethodForMob);
                }
                if (!(aVar.getRouterCallback() == null || (routerCallback2 = aVar.getRouterCallback()) == null)) {
                    routerCallback2.invoke(false);
                }
                return false;
            } else if (C55076b.m100723b().isEnableShowTeenageTip()) {
                if (!(aVar.getRouterCallback() == null || (routerCallback = aVar.getRouterCallback()) == null)) {
                    routerCallback.invoke(false);
                }
                return false;
            } else {
                C53635b.m98892a(aVar);
                if (aVar.getEnterSelectChatMsgActivity()) {
                    intent = new Intent(aVar.getContext(), SelectChatMsgActivity.class);
                } else {
                    intent = new Intent(aVar.getContext(), ChatRoomActivity.class);
                    ChatRoomActivity.f124619a = aVar.getThirdAppName();
                    ChatRoomActivity.f124620b = aVar.getRouterCallback();
                }
                String sessionId = aVar.getSessionId();
                if (sessionId == null || C89361p.m154870a((CharSequence) sessionId)) {
                    z = true;
                } else {
                    z = false;
                }
                String str2 = null;
                if (z) {
                    IMContact imContact = aVar.getImContact();
                    if (!(imContact instanceof IMConversation)) {
                        imContact = null;
                    }
                    IMConversation iMConversation = (IMConversation) imContact;
                    if (iMConversation != null && iMConversation.getConversationType() == C19489e.AbstractC19490a.f46181b) {
                        IMContact imContact2 = aVar.getImContact();
                        if (!(imContact2 instanceof IMConversation)) {
                            imContact2 = null;
                        }
                        IMConversation iMConversation2 = (IMConversation) imContact2;
                        if (iMConversation2 != null) {
                            str2 = iMConversation2.getConversationId();
                        }
                        aVar.setSessionId(str2);
                    }
                    IMUser imUser = aVar.getImUser();
                    if (imUser != null && (uid = imUser.getUid()) != null && !C89361p.m154870a((CharSequence) uid) && aVar.getChatType() == 0) {
                        aVar.setSessionId(AbstractC17427b.C17428a.m32310b(uid));
                    }
                }
                intent.addFlags(268435456);
                intent.putExtra("key_enter_chat_params", aVar);
                String sessionId2 = aVar.getSessionId();
                if (!(sessionId2 == null || C89361p.m154870a((CharSequence) sessionId2) || sessionId2 == null)) {
                    boolean unused = C55127a.f126154a.mo92038a(new C55132c(sessionId2), false);
                }
                if (aVar.getContext() != null) {
                    Context context = aVar.getContext();
                    if (context != null) {
                        m99730a(context, intent);
                    }
                } else {
                    m99730a(C17867d.m33078a(), intent);
                }
                if (aVar.getKeepEnterFrom()) {
                    str = "1";
                } else {
                    str = "0";
                }
                C55059b.m100694b("keep_enter_from", str);
                if (!aVar.getNoEvent()) {
                    if (aVar.getImUser() == null) {
                        followStatus = -1;
                    } else {
                        IMUser imUser2 = aVar.getImUser();
                        if (imUser2 == null) {
                            C89219l.m154715b();
                        }
                        followStatus = imUser2.getFollowStatus();
                    }
                    int chatType = aVar.getChatType();
                    if (chatType == 1) {
                        C53622e.m98867a(aVar, "stranger", (String) null, followStatus, (AbstractC17420a) null, (AbstractC89183m) null, 52);
                    } else if (chatType != 3) {
                        C53622e.m98865a(aVar, "private", followStatus);
                    } else {
                        C53622e.m98867a(aVar, "group", (String) null, 0, (AbstractC17420a) null, (AbstractC89183m) null, 60);
                    }
                }
                C35434c.m72461a("im_chat_room");
                return true;
            }
        }

        /* renamed from: a */
        private static void m99730a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.utils.ActivityStack.AbstractC80170b
    /* renamed from: a */
    public final void mo69456a() {
        Dialog dialog = this.f124622f;
        if (dialog != null && dialog.isShowing()) {
            C55076b.m100723b().sendShareOverEvent(getClass().getSimpleName(), 3);
            Dialog dialog2 = this.f124622f;
            if (dialog2 == null) {
                C89219l.m154715b();
            }
            dialog2.dismiss();
            this.f124622f = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        if (this.f124623g) {
            SmartRouter.buildRoute(C17867d.m33078a(), "aweme://main").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION").addFlags(67108864).open();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onResume", true);
        super.onResume();
        AbstractC89172b<? super Boolean, C89391z> bVar = f124620b;
        if (bVar != null) {
            bVar.invoke(true);
            f124620b = null;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        String str;
        C15477a.m28479e(this);
        super.onDestroy();
        ActivityStack.removeAppBackGroundListener(this);
        this.f124624h.mo90242b();
        long c = this.f124624h.mo90243c();
        if (c > 86400000) {
            HashMap hashMap = new HashMap();
            hashMap.put("tag", " start: " + this.f124624h.f123212a + " leave: " + this.f124624h.f123213b + " duration: " + c);
            C55197c.m100920b("leave_chat_duration", hashMap);
        }
        C53709a aVar = this.f124684d;
        if (aVar != null) {
            String conversationId = aVar.getConversationId();
            int chatType = aVar.getChatType();
            if (chatType == 0) {
                str = "private";
            } else if (chatType == 1) {
                str = "stranger";
            } else if (chatType != 3) {
                str = "";
            } else {
                str = "group";
            }
            C0484a aVar2 = new C0484a();
            aVar2.put("conversation_id", conversationId);
            aVar2.put("chat_type", str);
            aVar2.put("duration", String.valueOf(c));
            C39162r.m79460a("leave_chat", aVar2);
        }
    }

    public final void onEnterAnimationComplete() {
        Boolean bool;
        String singleChatFromUserId;
        boolean z;
        super.onEnterAnimationComplete();
        C53709a aVar = this.f124684d;
        if (aVar != null && aVar.isSingleChat()) {
            C53709a aVar2 = this.f124684d;
            String str = null;
            if (aVar2 == null || (singleChatFromUserId = aVar2.getSingleChatFromUserId()) == null) {
                bool = null;
            } else {
                Keva a = C53841a.m99080a();
                C89219l.m154721d(singleChatFromUserId, "");
                C89219l.m154721d(a, "");
                if (!a.contains("key_double_follow_time_stamp".concat(String.valueOf(singleChatFromUserId))) || a.getLong("key_double_follow_time_stamp".concat(String.valueOf(singleChatFromUserId)), -1) == -1) {
                    z = false;
                } else {
                    a.storeLong("key_double_follow_time_stamp".concat(String.valueOf(singleChatFromUserId)), -1);
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                C53709a aVar3 = this.f124684d;
                if (aVar3 != null) {
                    str = aVar3.getSingleChatFromUserId();
                }
                AbstractC81915c.m141874a(new C56196c(str));
                if (C56203d.m102116e()) {
                    mo91499a(C55067e.m100706a());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity$b */
    static final class C54402b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C54402b f124626a = new C54402b();

        static {
            Covode.recordClassIndex(64106);
        }

        C54402b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C544031.f124627a);
            baseActivityViewModel2.config(C544042.f124628a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.ActivityC54429b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.AbstractActivityC54405a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onCreate", true);
        activityConfiguration(C54402b.f124626a);
        super.onCreate(bundle);
        ActivityStack.addAppBackGroundListener(this);
        this.f124624h.mo90241a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity", "onCreate", false);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onEvent(C53714b bVar) {
        C89219l.m154721d(bVar, "");
        C56244a.m102190b("ChatRoomActivity", "MessageRvScrollToBottomEvent from=" + bVar.f123245a);
        C56244a.m102190b("ChatRoomActivity", "showShareCompleteTipsDialog thirdAppName=" + f124619a);
        if (!TextUtils.isEmpty(f124619a) && !isFinishing()) {
            this.f124622f = C55076b.m100723b().showShareCompleteTipsDialog(this, f124619a, null, null);
            f124619a = null;
            this.f124623g = true;
        }
    }
}
