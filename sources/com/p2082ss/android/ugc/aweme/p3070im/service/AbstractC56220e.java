package com.p2082ss.android.ugc.aweme.p3070im.service;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3250a.AbstractC56189c;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.im.service.e */
public interface AbstractC56220e {
    static {
        Covode.recordClassIndex(66029);
    }

    boolean canShowInnerNotification();

    boolean enableIM();

    boolean enableSendPic();

    void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view, Bundle bundle);

    void feedbackIm(String str, String str2);

    ViewGroup getCurrentDecorView(Activity activity);

    String getEnterFrom();

    AbstractC56218d getFamiliarProxy();

    C56256i getIMSetting();

    String getLastWsConnectUrl();

    IIMunder16Proxy getUnder16Proxy();

    boolean isEnableShowTeenageTip();

    boolean isNeedToContinuePlayInAct();

    void jumpToLivePage(Context context, String str, String str2, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle, boolean z);

    void jumpToLivePage(Context context, String str, String str2, String str3, Bundle bundle);

    void monitorMsgSendStatus(Map<String, String> map);

    void openNotificationSetting(Context context, String str);

    void openUrl(Context context, String str, boolean z);

    void popCaptcha(Activity activity, int i, AbstractC56189c cVar);

    void putSecUidToMap(String str, String str2);

    void registerAppStateCallback(AbstractC33485al alVar);

    void registerWsListener(AbstractC13651e eVar);

    void sendShareOverEvent(String str, int i);

    void setIMAwemeProvider(AbstractC56190b bVar);

    void setNeedToContinueToPlay(boolean z);

    void setSharePlayer(Object... objArr);

    Dialog showShareCompleteTipsDialog(Activity activity, String str, AbstractC89171a aVar, AbstractC89171a aVar2);

    void updateApk(Context context);
}
