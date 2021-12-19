package com.bytedance.android.live.gift;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.p488c.C7381an;
import com.bytedance.android.livesdk.gift.assets.AbstractC8784a;
import com.bytedance.android.livesdk.gift.assets.AbstractC8785b;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.C8856t;
import com.bytedance.android.livesdk.gift.model.C8859w;
import com.bytedance.android.livesdk.gift.model.EnumC8850n;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.p543a.AbstractC8782a;
import com.bytedance.android.livesdk.gift.p543a.AbstractC8783b;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8806a;
import com.bytedance.android.livesdk.gift.p549e.AbstractC8807b;
import com.bytedance.android.livesdk.model.AbstractC9918z;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.model.EnumC9541ay;
import com.bytedance.android.livesdk.model.message.C9895y;
import com.bytedance.android.livesdk.p425aa.p428c.C6537o;
import com.bytedance.android.livesdk.p430ab.AbstractC6570b;
import com.bytedance.android.livesdkapi.depend.p680d.p681a.AbstractC11630b;
import com.bytedance.android.widget.Widget;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.gift.g */
public class C4331g implements IGiftService {
    static {
        Covode.recordClassIndex(4905);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void clearAssets(String str) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void clearFastGift(long j) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void downloadAssets(String str, long j, AbstractC8784a aVar, int i) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean enableRedEnvelope() {
        return true;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void exitRoom(Boolean bool) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C9904t findGiftById(long j) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AssetsModel getAssets(String str, long j) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC8785b getAssetsManager() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getAssetsPath(String str, long j) {
        return "";
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C8856t getBoostChartInfo() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C9904t getFastGift(long j) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC8783b getFirstRechargeManager() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC6570b getGiftInterceptor(long j, boolean z) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C9895y getGiftMessage(long j, C8859w wVar, User user) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public List<GiftPage> getGiftPages() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public LiveWidget getGiftWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getLowAgeReportUrl() {
        return "";
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public Widget getRedEnvelopeWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public C6537o getSendGiftResultLog(C8859w wVar) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public LiveWidget getWishListWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC11630b giftPlayControllerManager() {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public long giftVideoResourcesClear(boolean z) {
        return 0;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void initGiftResource() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void initGiftResourceManager(Context context) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean isAssetsDownloaded(String str, long j) {
        return false;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public boolean isFirstRecharge() {
        return false;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void loadBehavior(Context context, DataChannel dataChannel, int i) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void logBoostCardLiveEndClick(int i) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void logBoostCardLiveEndShow() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorBroadcastClicked(long j) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorBroadcastMonitor(long j, boolean z) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void monitorGiftIconShow(boolean z, EnumC9541ay ayVar, String str, String str2) {
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void onPlayFragmentCreate() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void onTurnTableUrlEmpty(String str) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openGiftDialog(String str) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openGiftDialogFromJSB(C7381an anVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void openRechargeFAQPage(Context context) {
        C89219l.m154721d(context, "");
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void playGiftVideo(long j, AbstractC9918z zVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void removeAnimationEngine(EnumC8850n nVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void resetRoomStatus() {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public AbstractC88979t<C5832d<C8859w>> sendGift(long j, long j2, long j3, int i) {
        return null;
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void sendGiftInternal(long j, int i, AbstractC8806a aVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void setGiftAnimationEngine(EnumC8850n nVar, AbstractC8782a aVar) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void syncGiftList(int i) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public void syncGiftList(AbstractC8807b bVar, long j, int i, boolean z) {
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public List<C9904t> getStickerGifts() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public String getAmountString(long j) {
        return String.valueOf(j);
    }
}
