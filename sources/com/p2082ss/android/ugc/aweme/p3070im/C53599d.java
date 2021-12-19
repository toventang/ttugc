package com.p2082ss.android.ugc.aweme.p3070im;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0569a;
import androidx.core.app.C0576b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.C12290b;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpage.ActivityC17733a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.MainActivity;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.notice.api.p3514e.C61598t;
import com.p2082ss.android.ugc.aweme.p3060i.C53429a;
import com.p2082ss.android.ugc.aweme.p3070im.C53603g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56218d;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56222f;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3250a.AbstractC56189c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.secapi.C67837a;
import com.p2082ss.android.ugc.aweme.settingsrequest.AbstractC68806f;
import com.p2082ss.android.ugc.aweme.utils.C80320cy;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.d */
public final class C53599d implements AbstractC56220e {

    /* renamed from: a */
    private boolean f123019a;

    static {
        Covode.recordClassIndex(63177);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final AbstractC56218d getFamiliarProxy() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final boolean isEnableShowTeenageTip() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void openNotificationSetting(Context context, String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void sendShareOverEvent(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final Dialog showShareCompleteTipsDialog(Activity activity, String str, AbstractC89171a aVar, AbstractC89171a aVar2) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final boolean isNeedToContinuePlayInAct() {
        return this.f123019a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final boolean enableIM() {
        return C53588a.m98813a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final IIMunder16Proxy getUnder16Proxy() {
        return IMUnder16ProxyImpl.m102047n();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final String getLastWsConnectUrl() {
        return C61598t.f139791j.mo99346a().f139794c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final boolean enableSendPic() {
        if (SharePrefCache.inst().getCanImSendPic().mo59941c().intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final C56256i getIMSetting() {
        AbstractC68806f a = AbstractC68806f.m121278a();
        if (a.f153887a == null) {
            return SettingsRequestServiceImpl.m65417i().mo57283b();
        }
        return a.f153887a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final String getEnterFrom() {
        Activity j = C17873f.m33102j();
        if (j instanceof MainActivity) {
            return ((MainActivity) j).getEnterFrom();
        }
        if (j instanceof AbstractC34585f) {
            return ((AbstractC34585f) j).mo61041c();
        }
        if (!(j instanceof ActivityC17733a)) {
            return "";
        }
        Fragment rootFragment = ((ActivityC17733a) j).getRootFragment();
        if (rootFragment instanceof AbstractC34585f) {
            return ((AbstractC34585f) rootFragment).mo61041c();
        }
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final boolean canShowInnerNotification() {
        Aweme a;
        C53603g.C53604a.m98850a();
        Activity c = C53603g.m98842a().mo90140c();
        if (c == null) {
            return false;
        }
        String localClassName = c.getLocalClassName();
        if (TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.im.sdk.chat.ChatRoomActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.live.LivePlayActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.live.LiveBroadcastActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.account.login.I18nSignUpActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity") || TextUtils.equals(localClassName, "com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity")) {
            return false;
        }
        Fragment a2 = C80320cy.m139242a(c);
        if (a2 != null && TextUtils.equals(a2.getClass().getName(), "com.ss.android.ugc.aweme.im.sdk.module.session.SessionListFragment")) {
            return false;
        }
        C53603g.C53604a.m98850a();
        if (C53603g.m98842a().mo90136a()) {
            return false;
        }
        if (((!(c instanceof AbstractC59103j) || !(((AbstractC59103j) c).getCurFragment() instanceof AbstractC59105l)) && !(c instanceof DetailActivity)) || (a = AwemeChangeCallBack.m108593a((ActivityC0945e) c)) == null || !a.isAd()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void setIMAwemeProvider(AbstractC56190b bVar) {
        C50529ae.f116793d = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void setNeedToContinueToPlay(boolean z) {
        this.f123019a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void registerAppStateCallback(AbstractC33485al alVar) {
        C53429a.m98598c().mo89996a(alVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final ViewGroup getCurrentDecorView(Activity activity) {
        C53603g.C53604a.m98850a();
        return C53603g.m98842a().mo90132a(activity);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void registerWsListener(AbstractC13651e eVar) {
        C61598t a = C61598t.f139791j.mo99346a();
        C89219l.m154721d(eVar, "");
        a.f139796e.add(eVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void updateApk(Context context) {
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://go.onelink.me/BAuo/410a1973"));
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void monitorMsgSendStatus(Map<String, String> map) {
        try {
            int parseInt = Integer.parseInt(map.get("success_cnt"));
            while (true) {
                int i = parseInt - 1;
                if (parseInt <= 0) {
                    break;
                }
                C12290b.m22060a("aweme_im_message_error_rate", 0, (JSONObject) null);
                parseInt = i;
            }
            int parseInt2 = Integer.parseInt(map.get("fail_cnt"));
            while (true) {
                int i2 = parseInt2 - 1;
                if (parseInt2 > 0) {
                    C12290b.m22060a("aweme_im_message_error_rate", 1, (JSONObject) null);
                    parseInt2 = i2;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void setSharePlayer(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            if (objArr[0] != null && (objArr[0] instanceof AbstractC56222f)) {
                C49625h.m93072a().f114189a = (AbstractC80747i) ((AbstractC56222f) objArr[0]).mo91999a();
            }
            if (objArr[1] != null && (objArr[1] instanceof Long) && ((Long) objArr[1]).longValue() > 0) {
                C49625h.m93072a().f114191c = 0;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void feedbackIm(String str, String str2) {
        RuntimeBehaviorServiceImpl.m94812c().mo85866a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void putSecUidToMap(String str, String str2) {
        C80517gw.m139563a().mo123773a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void popCaptcha(Activity activity, int i, final AbstractC56189c cVar) {
        SecApiImpl.m119993a().popCaptcha(activity, i, new C67837a() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.C53599d.C536001 */

            static {
                Covode.recordClassIndex(63178);
            }

            @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
            /* renamed from: a */
            public final void mo90185a() {
                AbstractC56189c cVar = cVar;
                if (cVar != null) {
                    cVar.mo92074a();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.secapi.C67837a
            /* renamed from: a */
            public final void mo61882a(boolean z, int i) {
                AbstractC56189c cVar = cVar;
                if (cVar != null) {
                    cVar.mo92075a(z, "");
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (r5 == null) goto L_0x0083;
     */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void openUrl(android.content.Context r9, java.lang.String r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.C53599d.openUrl(android.content.Context, java.lang.String, boolean):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void jumpToLivePage(Context context, String str, String str2, String str3, Bundle bundle) {
        User user = new User();
        user.setUid(str);
        user.setSecUid(str2);
        try {
            user.setBroadcasterRoomId(Long.parseLong(str3));
        } catch (Exception unused) {
        }
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28293J = "chat";
        enterRoomConfig.f28233c.f28295L = "live_cover";
        if (bundle != null) {
            enterRoomConfig.f28232b.f28246C = bundle.getString("share_user_id", null);
        }
        LiveOuterService.m107269s().mo95835i().mo105593a(context, user, enterRoomConfig);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void jumpToLivePage(Context context, String str, String str2, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle, boolean z) {
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.f28233c.f28293J = "chat";
        enterRoomConfig.f28233c.f28295L = "live_cover";
        enterRoomConfig.f28233c.f28287D = str;
        enterRoomConfig.f28233c.f28348d = str2;
        enterRoomConfig.f28232b.f28258b = str;
        if (bundle != null) {
            enterRoomConfig.f28232b.f28246C = bundle.getString("share_user_id", null);
        }
        if (z) {
            enterRoomConfig.f28231a.f28386m = true;
        }
        LiveOuterService.m107269s().mo95835i().mo105592a(context, newLiveRoomStruct, enterRoomConfig);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public final void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view, Bundle bundle) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("refer", str2);
        intent.putExtra("video_from", str3);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        intent.putExtra("enter_method", bundle.getString("enter_method", null));
        if (str4 != null) {
            intent.putExtra("userid", str4);
        }
        intent.putExtra("key_from_chat_room_playing", bundle.getBoolean("key_from_chat_room_playing"));
        intent.putExtra("key_from_chat_room_real_aid", bundle.getString("key_from_chat_room_real_aid"));
        intent.putExtra("message", bundle.getSerializable("message"));
        String string = bundle.getString("cid");
        if (!TextUtils.isEmpty(string)) {
            intent.putExtra("cid", string);
            intent.putExtra("id", bundle.getString("realItemId"));
        }
        if (view == null) {
            try {
                DetailActivity.m83200a(context, intent);
            } catch (Exception unused) {
                DetailActivity.m83200a(context, intent);
            }
        } else {
            C0569a.m2372a(context, intent, C0576b.m2193b(view, view.getWidth(), view.getHeight()).mo2564a());
        }
        C39162r.m79460a("feed_enter", new C33744d().mo59983a("enter_from", "chat").mo59983a("group_id", str).f79943a);
    }
}
