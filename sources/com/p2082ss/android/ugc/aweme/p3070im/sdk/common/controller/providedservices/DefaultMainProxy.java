package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.wschannel.app.AbstractC13651e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33485al;
import com.p2082ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56190b;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56218d;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56256i;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3250a.AbstractC56186a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3250a.AbstractC56187b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3250a.AbstractC56189c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.DefaultMainProxy */
public class DefaultMainProxy implements AbstractC56220e {
    static {
        Covode.recordClassIndex(64888);
    }

    public void bindRecommendContactItemView(RecyclerView.ViewHolder viewHolder, RecommendContact recommendContact, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public boolean canShowInnerNotification() {
        return false;
    }

    public boolean checkIMInsertRecommendContact() {
        return false;
    }

    public void checkPluginAndLoadLibrary(Context context, boolean z, String str, AbstractC56186a aVar) {
    }

    public boolean checkShowPushNotificationGuide(Context context) {
        return false;
    }

    public void connectWS() {
    }

    public RecyclerView.ViewHolder createRecommendContactItemView(ViewGroup viewGroup, AbstractC89183m<RecommendContact, Integer, C89391z> mVar) {
        return null;
    }

    public RecyclerView.ViewHolder createRecommendViewHolder(Context context, HashMap<String, Boolean> hashMap, Object obj, AbstractC56187b<User> bVar) {
        return null;
    }

    public void downloadPdf(Context context, String str, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public boolean enableIM() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public boolean enableSendPic() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view, Bundle bundle) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void feedbackIm(String str, String str2) {
    }

    public int getAssociativeEmoji() {
        return 0;
    }

    public Activity getCurrentActivity() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public ViewGroup getCurrentDecorView(Activity activity) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public String getEnterFrom() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public AbstractC56218d getFamiliarProxy() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public String getLastWsConnectUrl() {
        return "";
    }

    public int getRecommendContactPosition() {
        return -1;
    }

    public String getToReportId() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public IIMunder16Proxy getUnder16Proxy() {
        return null;
    }

    public boolean is2Entrance() {
        return false;
    }

    public boolean isCheckPlugin() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public boolean isEnableShowTeenageTip() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public boolean isNeedToContinuePlayInAct() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void jumpToLivePage(Context context, String str, String str2, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void jumpToLivePage(Context context, String str, String str2, String str3, Bundle bundle) {
    }

    public void logIMShareHeadShow() {
    }

    public void logIMShareHeadShow(Map<String, String> map) {
    }

    public void makePhoneCall(Activity activity, String str, String str2, String str3, String str4) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void monitorMsgSendStatus(Map<String, String> map) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void openNotificationSetting(Context context, String str) {
    }

    public void openPrivacyReminder(Context context) {
    }

    public void openUrl(Context context, Uri uri, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void openUrl(Context context, String str, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void popCaptcha(Activity activity, int i, AbstractC56189c cVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void putSecUidToMap(String str, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void registerAppStateCallback(AbstractC33485al alVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void registerWsListener(AbstractC13651e eVar) {
    }

    public void saveLogPb(String str, String str2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void sendShareOverEvent(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void setIMAwemeProvider(AbstractC56190b bVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void setNeedToContinueToPlay(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void setSharePlayer(Object... objArr) {
    }

    public void showPushNotification(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public Dialog showShareCompleteTipsDialog(Activity activity, String str, AbstractC89171a aVar, AbstractC89171a aVar2) {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public void updateApk(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e
    public C56256i getIMSetting() {
        return C56256i.m102224a();
    }
}
