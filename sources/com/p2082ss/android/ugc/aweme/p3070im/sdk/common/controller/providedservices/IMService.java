package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.powerpage.C17740d;
import com.bytedance.keva.Keva;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.base.AbstractC34530c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46639a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.p2759di.ImEntranceService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.invite.C54039g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3093c.p3094a.C53841a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3121a.DialogC54286a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3122b.C54292a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.feature.p3118a.p3120b.p3122b.C54293b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.C54314c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.C54341a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3139a.C54603a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54883e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.SessionListNavArg;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.fragment.SessionListFragment;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55049b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3173d.C55074a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55075a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55083f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3175f.C55121a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55127a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3182k.C55159d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55168aa;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55213i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55218m;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.C55276a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3189b.p3192c.C55273c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.p3194a.C55286b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55341b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3208a.C55620a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55649c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55654e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.data.p3219a.C55703a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.privacy.p3214b.p3216b.View$OnClickListenerC55692a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55717a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3221b.C55727e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.activity.RelationSelectActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.data.ImUnder16Manger;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56199c;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56224g;
import com.p2082ss.android.ugc.aweme.p3070im.service.C56185a;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56255h;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.NoticePushMessage;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56194a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56206g;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3253d.AbstractC56219a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3254e.AbstractC56221a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56227c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3258h.AbstractC56229a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56231a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56232b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56236d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3262l.AbstractC56243a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import org.greenrobot.eventbus.EventBus;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService */
public final class IMService implements IIMService {
    public static final Companion Companion = new Companion(null);
    public static IIMService inst;

    static {
        Covode.recordClassIndex(64891);
    }

    public static final IIMService get() {
        return Companion.get();
    }

    public static final IIMService inst() {
        return Companion.inst();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void cacheRecentShareContact(IMContact iMContact) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final boolean isIMAvailable() {
        return true;
    }

    public final void showNoticePush(NoticePushMessage noticePushMessage) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(64892);
        }

        private Companion() {
        }

        public final IIMService get() {
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            C89219l.m154716b(createIIMServicebyMonsterPlugin, "");
            return createIIMServicebyMonsterPlugin;
        }

        public final IIMService inst() {
            if (IMService.inst == null) {
                IMService.inst = get();
                C56244a.m102185a("follow_status", "IMService.inst: IMService not initialized");
            }
            return IMService.inst;
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }

        private final boolean isExistHistoryMsg(IMUser iMUser) {
            if (iMUser == null || TextUtils.isEmpty(iMUser.getUid())) {
                return false;
            }
            AbstractC17420a a = AbstractC17420a.C17421a.m32276a();
            String uid = iMUser.getUid();
            C89219l.m154716b(uid, "");
            C19638h a2 = a.mo27720a(AbstractC17427b.C17428a.m32309a(Long.parseLong(uid)));
            if (a2 == null) {
                return false;
            }
            if (a2.getLastMessage() == null && iMUser.getFollowStatus() == 0 && (iMUser.getType() == 4 || iMUser.getType() == -1)) {
                return false;
            }
            return true;
        }

        private final void resetRemoteImageViewDefaultIcon(RemoteImageView remoteImageView, int i) {
            C24246a aVar = (C24246a) remoteImageView.getHierarchy();
            if (aVar != null) {
                aVar.mo39966c(i);
                aVar.mo39970d(i);
                return;
            }
            remoteImageView.setHierarchy(C24247b.m46042a(remoteImageView.getResources()).mo39977b(i).mo39974a(i).mo39973a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void clearIMNotification() {
        C55649c.m101404b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC56227c getDurationPerfMon() {
        return C55127a.f126154a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC56199c getIMErrorMonitor() {
        return C55218m.f126294a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void refreshLoginState() {
        C55076b.m100726e();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void ensureIMState() {
        C17419b.m32261a().mo27891b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC56231a getFamiliarService() {
        return IMServiceProvider.INSTANCE.getFamiliarService();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC85631b getImParser() {
        return new C55159d();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC56221a getInboxAdapterService() {
        return IMServiceProvider.INSTANCE.getInboxAdapterService();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC56219a getMessagingGeckoUtils() {
        return new C55121a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC56232b getRelationService() {
        return IMServiceProvider.INSTANCE.getRelationService();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC56234c getShareService() {
        return IMServiceProvider.INSTANCE.getShareService();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final AbstractC56236d getSystemEmojiService() {
        return IMServiceProvider.INSTANCE.getSystemSmallEmojiService();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final boolean isNotificationMessageQueueEmpty() {
        return C55649c.m101405c();
    }

    public final void prePostUnread() {
        C55102l.C55104a.m100801a().mo92017f();
    }

    public IMService() {
        ImEntranceService.m83411a().init(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final int getFriendsCount() {
        C89219l.m154716b(C55273c.m101041a(), "");
        return C55273c.m101064k();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final boolean isMtInnerPushEnabled() {
        C55219n a = C55219n.m100965a();
        C89219l.m154716b(a, "");
        return a.mo92214k();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final boolean isNeedToContinuePlayInAct() {
        return C55076b.m100723b().isNeedToContinuePlayInAct();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void onBlockUserSuccessEvent() {
        AbstractC81915c.m141874a(new C56194a());
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void resetLoginState() {
        if (C55197c.m100917a()) {
            C55085g.m100762c();
        }
        C55076b.m100726e();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final List<IMUser> getAllFollowIMUsers() {
        C89219l.m154716b(C55083f.m100744a(), "");
        C55273c.m101041a();
        List<IMUser> c = C55273c.m101054c(C55273c.m101059f());
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final List<IMUser> getAllFriends() {
        C89219l.m154716b(C55083f.m100744a(), "");
        C55273c.m101041a();
        List<IMUser> c = C55273c.m101054c(C55273c.m101053c());
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void switchLocale() {
        if (C55102l.f126096i != null && C55102l.f126097j) {
            C55102l lVar = C55102l.f126096i;
            if (lVar != null) {
                lVar.f126102d = true;
            }
            C56244a.m102191c("SessionListManager", "switchLocal set mSortIMAtNext true");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final List<IMUser> getRecentIMUsers() {
        C89219l.m154716b(C55083f.m100744a(), "");
        ArrayList arrayList = new ArrayList();
        List<C19638h> arrayList2 = new ArrayList(AbstractC17420a.C17421a.m32276a().mo27721a());
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C19638h hVar = (C19638h) it.next();
            C19538ai lastMessage = hVar.getLastMessage();
            long c = AbstractC17427b.C17428a.m32311c(hVar.getConversationId());
            if (hVar.getConversationType() != C19489e.AbstractC19490a.f46180a || lastMessage == null || lastMessage.getMsgType() == 15 || c <= 0) {
                it.remove();
            }
        }
        if (arrayList2.size() > 10) {
            arrayList2 = arrayList2.subList(0, 10);
        }
        for (C19638h hVar2 : arrayList2) {
            IMUser c2 = C55080c.m100732c(hVar2);
            if (c2 != null) {
                c2.setType(1);
                arrayList.add(c2);
            }
        }
        C89219l.m154716b(arrayList, "");
        return arrayList;
    }

    public final void setMinimizePaginationPageCountOpen(boolean z) {
        C55620a.f126873a.storeBoolean("is_minimize_pagination_page_count", z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void setNeedToContinuePlayInAct(boolean z) {
        C55076b.m100723b().setNeedToContinueToPlay(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final String getIMContactConversationId(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        return C55082e.m100740a(iMContact);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void registerLifeCycle(Application application) {
        C89219l.m154721d(application, "");
        application.registerActivityLifecycleCallbacks(C55075a.f126045a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void showIMNotification(boolean z) {
        if (!z) {
            C55654e.f126932b.mo92542a(0L);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final boolean startChat(C56245a aVar) {
        C89219l.m154721d(aVar, "");
        ChatRoomActivity.C54401a.m99731a(aVar);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void updateIMUserFollowStatus(IMUser iMUser) {
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new IMService$updateIMUserFollowStatus$1(this, iMUser, null), 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void setKeyMtInnerPushSwitchOn(boolean z) {
        C55219n a = C55219n.m100965a();
        C89219l.m154716b(a, "");
        a.f126297a.edit().putBoolean("key_mt_inner_push_switch_on", z).apply();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void updateChatUserSetting(int i) {
        C55703a aVar;
        C55219n a = C55219n.m100965a();
        C89219l.m154716b(a, "");
        C55703a l = a.mo92215l();
        if (l != null) {
            aVar = C55703a.copy$default(l, i, 0, 0, 4, null);
        } else {
            aVar = null;
        }
        a.mo92203a(aVar);
    }

    public final void updateContactName(IMUser iMUser) {
        IMUser a;
        if (iMUser != null && (a = C55085g.m100751a(iMUser.getUid(), iMUser.getSecUid())) != null) {
            iMUser.setContactName(a.getContactName());
        }
    }

    public static IIMService createIIMServicebyMonsterPlugin(boolean z) {
        MethodCollector.m26663i(5278);
        Object a = C81908b.m141854a(IIMService.class, z);
        if (a != null) {
            IIMService iIMService = (IIMService) a;
            MethodCollector.m26664o(5278);
            return iIMService;
        }
        if (C81908b.f183245bv == null) {
            synchronized (IIMService.class) {
                try {
                    if (C81908b.f183245bv == null) {
                        C81908b.f183245bv = new IMService();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(5278);
                    throw th;
                }
            }
        }
        IMService iMService = (IMService) C81908b.f183245bv;
        MethodCollector.m26664o(5278);
        return iMService;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final String getConversationId(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        C55076b.m100727f();
        Long valueOf = Long.valueOf(str);
        C89219l.m154716b(valueOf, "");
        String a = AbstractC17427b.C17428a.m32309a(valueOf.longValue());
        if (a == null) {
            return "";
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final String getIMContactUserId(IMContact iMContact) {
        C89219l.m154721d(iMContact, "");
        C89219l.m154721d(iMContact, "");
        if (iMContact instanceof IMUser) {
            return ((IMUser) iMContact).getUid();
        }
        if (!(iMContact instanceof IMConversation)) {
            return null;
        }
        IMConversation iMConversation = (IMConversation) iMContact;
        if (iMConversation.getConversationType() == C19489e.AbstractC19490a.f46180a) {
            return String.valueOf(AbstractC17427b.C17428a.m32311c(iMConversation.getConversationId()));
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final Intent getSessionListActivityIntent(Context context) {
        C89219l.m154721d(context, "");
        if (!C56318b.m102311b()) {
            return C17740d.f42407a.mo28214a(context, SessionListFragment.class, null);
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
        intent.setFlags(67108864);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        return intent;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void openSessionListActivity(Context context) {
        C89219l.m154721d(context, "");
        if (C56318b.m102311b()) {
            SmartRouter.buildRoute(context, "//chat/center").open();
        } else {
            C17740d.m32875a(C17740d.f42407a, context, SessionListFragment.class, null, 0, 28);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void updateIMUser(IMUser iMUser) {
        if (iMUser == null) {
            C56244a.m102185a("follow_status", "IMService.updateSimpleUser user = null");
            return;
        }
        if (iMUser.isBlock()) {
            iMUser.setFollowStatus(0);
        }
        AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89546bf.f203267b, null, new IMService$updateIMUser$1(this, iMUser, null), 2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void storeFollowStatus(FollowStatus followStatus) {
        C89219l.m154721d(followStatus, "");
        Keva a = C53841a.m99080a();
        long currentTimeMillis = System.currentTimeMillis();
        C89219l.m154721d(followStatus, "");
        C89219l.m154721d(a, "");
        if (followStatus.followStatus == 1 || followStatus.followStatus == 4) {
            String str = followStatus.userId;
            C89219l.m154716b(str, "");
            if (!a.contains("key_single_follow_status".concat(String.valueOf(str)))) {
                a.storeBoolean("key_single_follow_status".concat(String.valueOf(str)), true);
            }
        } else if (followStatus.followStatus == 2) {
            String str2 = followStatus.userId;
            C89219l.m154716b(str2, "");
            C53841a.m99081a(str2, a, currentTimeMillis);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void processMessagingDeepLink(Fragment fragment) {
        SessionListNavArg sessionListNavArg;
        int i;
        int i2;
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(fragment, "");
        Bundle arguments = fragment.getArguments();
        String str = null;
        if (arguments == null) {
            sessionListNavArg = null;
        } else {
            C89219l.m154716b(arguments, "");
            String string = arguments.getString("enter_from");
            String string2 = arguments.getString("enter_method");
            Integer valueOf = Integer.valueOf(arguments.getInt("message_cnt"));
            String string3 = arguments.getString("notice_type");
            String string4 = arguments.getString("im_group_invite_id");
            String string5 = arguments.getString("conversation_id");
            String string6 = arguments.getString("is_member_request", "0");
            C89219l.m154716b(string6, "");
            Integer e = C89361p.m154863e(string6);
            int i3 = 0;
            if (e != null) {
                i = e.intValue();
            } else {
                i = 0;
            }
            Integer valueOf2 = Integer.valueOf(i);
            String string7 = arguments.getString("chat_type", "0");
            C89219l.m154716b(string7, "");
            Integer e2 = C89361p.m154863e(string7);
            if (e2 != null) {
                i2 = e2.intValue();
            } else {
                i2 = 0;
            }
            Integer valueOf3 = Integer.valueOf(i2);
            String string8 = arguments.getString("message_preview_enabled", "0");
            C89219l.m154716b(string8, "");
            Integer e3 = C89361p.m154863e(string8);
            if (e3 != null) {
                i3 = e3.intValue();
            }
            sessionListNavArg = new SessionListNavArg(string, string2, valueOf, string3, string4, string5, valueOf2, valueOf3, Integer.valueOf(i3));
        }
        C54883e eVar = new C54883e();
        ActivityC0945e requireActivity = fragment.requireActivity();
        C89219l.m154716b(requireActivity, "");
        eVar.mo91898a(requireActivity, sessionListNavArg);
        ActivityC0945e requireActivity2 = fragment.requireActivity();
        C89219l.m154716b(requireActivity2, "");
        C55341b bVar = new C55341b(requireActivity2);
        if (sessionListNavArg != null) {
            str = sessionListNavArg.getJumpedFromInviteId();
        }
        bVar.mo92405a(str);
    }

    public final IMUser getIMUserFromUid(String str, String str2) {
        return C55085g.m100751a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final View getDmEntranceView(Context context, String str) {
        C89219l.m154721d(str, "");
        if (context == null) {
            return null;
        }
        return C55286b.m101085a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final List<IMUser> searchFollowIMUser(List<? extends IMUser> list, String str) {
        List<IMUser> a = C55083f.m100744a().mo92004a(list, str, false);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final Dialog commentReply(Context context, C56255h hVar) {
        DialogC54286a.C54291b bVar = new DialogC54286a.C54291b(context);
        bVar.f124364b = hVar;
        bVar.f124366d = new C54292a(hVar, context);
        bVar.f124365c = C54293b.f124369a;
        DialogC54286a aVar = new DialogC54286a(bVar, (byte) 0);
        aVar.show();
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void onNewNoticeArrived(int i, Bundle bundle) {
        C89219l.m154721d(bundle, "");
        if (i == 1) {
            C55168aa.m100877a();
        } else if (i == 3) {
            C55168aa.m100877a();
        } else if (i == 4) {
            AbstractC81915c.m141874a(new C55276a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void openBaMessageSettingActivity(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        SmartRouter.buildRoute(context, "//setting/ba/message_setting").withParam("enter_from", str).open();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void enterChooseContact(Context context, Bundle bundle) {
        C89219l.m154721d(context, "");
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        if (!createIUserServicebyMonsterPlugin.isLogin()) {
            C58957c.m108318a((Activity) context, "chat_list", "button");
        } else {
            RelationSelectActivity.C55896a.m101700a(context, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void enterCreateChatPage(Context context, Bundle bundle) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(bundle, "");
        if (C55213i.m100955a()) {
            bundle.putSerializable("member_select_config", new C55539b.C55555p(null, null, null, null, 15, null));
            C54603a.m100103a("notification_page");
            C54603a.m100100a();
        }
        enterChooseContact(context, bundle);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void showGroupChatGuideBubble(Context context, View view) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(view, "");
        Keva repo = Keva.getRepo("im_session_group_repo");
        if (!repo.getBoolean("im_key_guide_show", false)) {
            view.post(new IMService$showGroupChatGuideBubble$1(context, view, repo));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void handleGroupInvite(Activity activity, String str) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C54039g gVar = new C54039g(activity, str);
        if (!C56201b.m102110a() || C80580in.m139687c()) {
            gVar.mo91149a();
            return;
        }
        String obj = C46639a.m90021b().toString();
        C54039g.C54040a aVar = new C54039g.C54040a(gVar, obj);
        C89219l.m154721d(obj, "");
        C89219l.m154721d(aVar, "");
        if (ImUnder16Manger.f128134h.get(obj) == null) {
            ImUnder16Manger.f128134h.put(obj, new CopyOnWriteArrayList<>());
        }
        CopyOnWriteArrayList<AbstractC56224g> copyOnWriteArrayList = ImUnder16Manger.f128134h.get(obj);
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(aVar);
        }
        if (C89219l.m154714a((Object) C55197c.m100919b(), (Object) obj) && ImUnder16Manger.f128128b) {
            aVar.mo91150a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void openSessionListActivity(Context context, Bundle bundle) {
        C89219l.m154721d(context, "");
        if (C56318b.m102311b()) {
            SmartRouter.buildRoute(context, "//chat/center").withParam(bundle).open();
        } else {
            C17740d.m32875a(C17740d.f42407a, context, SessionListFragment.class, bundle, 0, 24);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final String getEntranceButtonText(Context context, String str) {
        C89219l.m154721d(context, "");
        Keva a = C53841a.m99080a();
        C89219l.m154721d(context, "");
        C89219l.m154721d(a, "");
        String string = context.getResources().getString(R.string.d2m);
        C89219l.m154716b(string, "");
        if (str != null) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(a, "");
            if (a.contains("key_single_follow_status".concat(String.valueOf(str)))) {
                C53841a.m99081a(str, a, System.currentTimeMillis());
                a.erase("key_single_follow_status".concat(String.valueOf(str)));
            }
            if (a.contains("key_double_follow_time_stamp".concat(String.valueOf(str)))) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = a.getLong("key_double_follow_time_stamp".concat(String.valueOf(str)), -1);
                if (j != -1 && currentTimeMillis - j < 86400000) {
                    if (C56203d.m102112a() == 4 || C56203d.m102112a() == 5 || C56203d.m102112a() == 6) {
                        String string2 = context.getResources().getString(R.string.c9p, "👋");
                        C89219l.m154716b(string2, "");
                        return string2;
                    } else if (C56203d.m102112a() != 2 && C56203d.m102112a() != 3) {
                        return string;
                    } else {
                        String string3 = context.getResources().getString(R.string.c9o);
                        C89219l.m154716b(string3, "");
                        return string3;
                    }
                }
            }
        }
        String string4 = context.getResources().getString(R.string.d2m);
        C89219l.m154716b(string4, "");
        return string4;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void setHighlightText(TextView textView, String str, String str2) {
        C89219l.m154721d(textView, "");
        C89219l.m154721d(str2, "");
        C55727e.m101480a(textView, str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void setInnerPushSwitch(String str, int i, boolean z) {
        C89219l.m154721d(str, "");
        C55654e.f126932b.mo92544a(str, i, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void saveChatUserSetting(int i, int i2, int i3) {
        C55219n a = C55219n.m100965a();
        C89219l.m154716b(a, "");
        a.mo92203a(new C55703a(i, i2, i3));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void initialize(Application application, C56185a aVar, AbstractC56220e eVar) {
        long j;
        C89219l.m154721d(application, "");
        C89219l.m154721d(eVar, "");
        inst = this;
        if (aVar != null) {
            String str = aVar.f128182e;
            C89219l.m154716b(str, "");
            C55074a.f126040b = str;
            String str2 = aVar.f128179b;
            C89219l.m154716b(str2, "");
            C55074a.f126039a = str2;
            String str3 = aVar.f128180c;
            C89219l.m154716b(str3, "");
            C55074a.f126041c = str3;
        }
        C55076b bVar = C55076b.f126052e;
        C89219l.m154721d(application, "");
        C89219l.m154721d(eVar, "");
        if (!C55076b.f126051d) {
            C55076b.f126051d = true;
            C56244a.m102191c("AwemeImManager", "init");
            C55076b.f126050c = aVar;
            C55076b.f126049b = eVar;
            if (!C56206g.m102126c()) {
                application.registerActivityLifecycleCallbacks(C55075a.f126045a);
            }
            if (!EventBus.m156962a().mo145393a(bVar)) {
                EventBus.m156966a(EventBus.m156962a(), bVar);
            }
            if (((Boolean) C56206g.f128202a.getValue()).booleanValue()) {
                j = 5000;
            } else if (((Boolean) C56206g.f128203b.getValue()).booleanValue()) {
                j = 8000;
            } else {
                j = 10;
            }
            AbstractC89568bz unused = C89624i.m155555a(C55076b.f126048a, null, null, new C55076b.C55077a(j, null), 3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void tryShowingChatPrivacyPanel(String str, AbstractC0952i iVar, AbstractC56229a aVar) {
        C55219n a;
        C55703a l;
        C89219l.m154721d(str, "");
        C89219l.m154721d(iVar, "");
        if (C55049b.m100667a() == 0) {
            return;
        }
        if ((!C89219l.m154714a((Object) str, (Object) "notification_page") || C55049b.m100667a() == 2) && (l = (a = C55219n.m100965a()).mo92215l()) != null) {
            Integer valueOf = Integer.valueOf(l.getChatSettingsPanel());
            if (valueOf.intValue() == 1 && 1 != 0 && valueOf != null) {
                valueOf.intValue();
                if (a.f126297a.getLong("chat_user_setting_last_open", 0) < System.currentTimeMillis() - 86400000 && a.mo92216m() < 3) {
                    valueOf.intValue();
                    a.f126297a.edit().putLong("chat_user_setting_last_open", System.currentTimeMillis()).commit();
                    a.f126297a.edit().putInt("chat_user_setting_open_count", a.mo92216m() + 1).commit();
                    C89233z.C89238e eVar = new C89233z.C89238e();
                    eVar.element = null;
                    C23226a.C23227a aVar2 = new C23226a.C23227a();
                    View$OnClickListenerC55692a aVar3 = new View$OnClickListenerC55692a();
                    Bundle bundle = new Bundle();
                    bundle.putInt("chat_set_extra", l.getChatSet());
                    bundle.putString("enter_from_extra", str);
                    bundle.putInt("user_type_extra", l.getChatUserType());
                    bundle.putInt("open_count_extra", a.mo92216m());
                    aVar3.setArguments(bundle);
                    aVar3.f127042a = new IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$1(aVar3, eVar, l, a, str, aVar, iVar);
                    eVar.element = (T) aVar2.mo37817a(aVar3).mo37812a(1).mo37815a(new IMService$tryShowingChatPrivacyPanel$$inlined$run$lambda$2(l, a, str, aVar, iVar)).f55057a;
                    eVar.element.show(iVar, "Chat Privacy Panel");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0054 A[SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showIMSnackbar(android.content.Context r10, android.view.View r11, com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j r12) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService.showIMSnackbar(android.content.Context, android.view.View, com.ss.android.ugc.aweme.im.service.model.j):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final String convertSearchKeyword(String str, String str2, String str3, String str4) {
        String a = C55717a.m101460a(str, str2, str3, str4);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, AbstractC34530c<Boolean> cVar) {
        C89219l.m154721d(cVar, "");
        if (sharePackage != null) {
            if (TextUtils.equals(sharePackage.f155487d, "web")) {
                C55949a.m101802a(Collections.singletonList(iMContact), (String) null, sharePackage, (BaseContent) null, C55058a.m100681a(), (String) null, (AbstractC55947a) null);
            } else {
                C55949a.m101802a(Collections.singletonList(iMContact), (String) null, sharePackage, (BaseContent) null, (String) null, (String) null, (AbstractC55947a) null);
            }
            if (cVar != null) {
                cVar.mo60998a(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r0 == null) goto L_0x0074;
     */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void showReplyFragment(android.view.View r7, androidx.fragment.app.AbstractC0952i r8, android.os.Bundle r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService.showReplyFragment(android.view.View, androidx.fragment.app.i, android.os.Bundle, java.lang.String):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void showDmInputViewDialogFragment(AbstractC0952i iVar, String str, Aweme aweme, String str2, AbstractC56243a aVar) {
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(iVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(aVar, "");
        C54341a aVar2 = new C54341a();
        Bundle bundle = new Bundle();
        bundle.putString("enter_from", str);
        bundle.putSerializable("bindAweme", aweme);
        bundle.putString("bindInputText", str2);
        aVar2.setArguments(bundle);
        aVar2.f124477a = aVar;
        try {
            aVar2.show(iVar, "StoryDmDialogFragment");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.IIMService
    public final void startSelectChatMsg(Context context, String str, IMUser iMUser, int i, String str2) {
        Integer num;
        int i2;
        if (i == 1) {
            if (TextUtils.isEmpty(str2)) {
                C54314c.m99608a(str);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap<String, Integer> hashMap = C54314c.f124414b;
                if (hashMap != null) {
                    num = hashMap.get(str);
                } else {
                    num = null;
                }
                C56245a.C56246a a = C56245a.C56247b.m102214a(context, iMUser);
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                C56245a.C56246a a2 = a.mo93270b(i2).mo93268a(str);
                a2.f128281a.setSelectMsgType(i);
                a2.f128281a.setEnterSelectChatMsgActivity(true);
                ChatRoomActivity.C54401a.m99731a(a2.f128281a);
            }
        }
    }
}
