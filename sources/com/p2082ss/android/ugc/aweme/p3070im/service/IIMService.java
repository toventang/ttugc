package com.p2082ss.android.ugc.aweme.p3070im.service;

import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.AbstractC34530c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56255h;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3253d.AbstractC56219a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3254e.AbstractC56221a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56227c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3258h.AbstractC56229a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56231a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56232b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56234c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3260j.AbstractC56236d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3262l.AbstractC56243a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.service.IIMService */
public interface IIMService {
    static {
        Covode.recordClassIndex(65991);
    }

    void cacheRecentShareContact(IMContact iMContact);

    void clearIMNotification();

    Dialog commentReply(Context context, C56255h hVar);

    String convertSearchKeyword(String str, String str2, String str3, String str4);

    void ensureIMState();

    void enterChooseContact(Context context, Bundle bundle);

    void enterCreateChatPage(Context context, Bundle bundle);

    List<IMUser> getAllFollowIMUsers();

    List<IMUser> getAllFriends();

    String getConversationId(String str);

    View getDmEntranceView(Context context, String str);

    AbstractC56227c getDurationPerfMon();

    String getEntranceButtonText(Context context, String str);

    AbstractC56231a getFamiliarService();

    int getFriendsCount();

    String getIMContactConversationId(IMContact iMContact);

    String getIMContactUserId(IMContact iMContact);

    AbstractC56199c getIMErrorMonitor();

    AbstractC85631b getImParser();

    AbstractC56221a getInboxAdapterService();

    AbstractC56219a getMessagingGeckoUtils();

    List<IMUser> getRecentIMUsers();

    AbstractC56232b getRelationService();

    Intent getSessionListActivityIntent(Context context);

    AbstractC56234c getShareService();

    AbstractC56236d getSystemEmojiService();

    void handleGroupInvite(Activity activity, String str);

    void initialize(Application application, C56185a aVar, AbstractC56220e eVar);

    boolean isIMAvailable();

    boolean isMtInnerPushEnabled();

    boolean isNeedToContinuePlayInAct();

    boolean isNotificationMessageQueueEmpty();

    void onBlockUserSuccessEvent();

    void onNewNoticeArrived(int i, Bundle bundle);

    void openBaMessageSettingActivity(Context context, String str);

    void openSessionListActivity(Context context);

    void openSessionListActivity(Context context, Bundle bundle);

    void processMessagingDeepLink(Fragment fragment);

    void refreshLoginState();

    void registerLifeCycle(Application application);

    void resetLoginState();

    void saveChatUserSetting(int i, int i2, int i3);

    List<IMUser> searchFollowIMUser(List<? extends IMUser> list, String str);

    void setHighlightText(TextView textView, String str, String str2);

    void setInnerPushSwitch(String str, int i, boolean z);

    void setKeyMtInnerPushSwitchOn(boolean z);

    void setNeedToContinuePlayInAct(boolean z);

    void shareSingleMsg(Context context, IMContact iMContact, SharePackage sharePackage, AbstractC34530c<Boolean> cVar);

    void showDmInputViewDialogFragment(AbstractC0952i iVar, String str, Aweme aweme, String str2, AbstractC56243a aVar);

    void showGroupChatGuideBubble(Context context, View view);

    void showIMNotification(boolean z);

    void showIMSnackbar(Context context, View view, C56257j jVar);

    void showReplyFragment(View view, AbstractC0952i iVar, Bundle bundle, String str);

    boolean startChat(C56245a aVar);

    void startSelectChatMsg(Context context, String str, IMUser iMUser, int i, String str2);

    void storeFollowStatus(FollowStatus followStatus);

    void switchLocale();

    void tryShowingChatPrivacyPanel(String str, AbstractC0952i iVar, AbstractC56229a aVar);

    void updateChatUserSetting(int i);

    void updateIMUser(IMUser iMUser);

    void updateIMUserFollowStatus(IMUser iMUser);
}
