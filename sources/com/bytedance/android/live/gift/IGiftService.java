package com.bytedance.android.live.gift;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
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
import java.util.List;
import p4560f.p4561a.AbstractC88979t;

public interface IGiftService extends AbstractC2953a {
    static {
        Covode.recordClassIndex(4898);
    }

    void clearAssets(String str);

    void clearFastGift(long j);

    void downloadAssets(String str, long j, AbstractC8784a aVar, int i);

    boolean enableRedEnvelope();

    void exitRoom(Boolean bool);

    C9904t findGiftById(long j);

    String getAmountString(long j);

    AssetsModel getAssets(String str, long j);

    AbstractC8785b getAssetsManager();

    String getAssetsPath(String str, long j);

    C8856t getBoostChartInfo();

    C9904t getFastGift(long j);

    AbstractC8783b getFirstRechargeManager();

    AbstractC6570b getGiftInterceptor(long j, boolean z);

    C9895y getGiftMessage(long j, C8859w wVar, User user);

    List<GiftPage> getGiftPages();

    LiveWidget getGiftWidget();

    String getLowAgeReportUrl();

    Widget getRedEnvelopeWidget();

    C6537o getSendGiftResultLog(C8859w wVar);

    List<C9904t> getStickerGifts();

    LiveWidget getWishListWidget();

    AbstractC11630b giftPlayControllerManager();

    long giftVideoResourcesClear(boolean z);

    void initGiftResource();

    void initGiftResourceManager(Context context);

    boolean isAssetsDownloaded(String str, long j);

    boolean isFirstRecharge();

    void loadBehavior(Context context, DataChannel dataChannel, int i);

    void logBoostCardLiveEndClick(int i);

    void logBoostCardLiveEndShow();

    void monitorBroadcastClicked(long j);

    void monitorBroadcastMonitor(long j, boolean z);

    void monitorGiftIconShow(boolean z, EnumC9541ay ayVar, String str, String str2);

    void onPlayFragmentCreate();

    void onTurnTableUrlEmpty(String str);

    void openGiftDialog(String str);

    void openGiftDialogFromJSB(C7381an anVar);

    void openRechargeFAQPage(Context context);

    void playGiftVideo(long j, AbstractC9918z zVar);

    void removeAnimationEngine(EnumC8850n nVar);

    void resetRoomStatus();

    AbstractC88979t<C5832d<C8859w>> sendGift(long j, long j2, long j3, int i);

    void sendGiftInternal(long j, int i, AbstractC8806a aVar);

    void setGiftAnimationEngine(EnumC8850n nVar, AbstractC8782a aVar);

    void syncGiftList(int i);

    void syncGiftList(AbstractC8807b bVar, long j, int i, boolean z);
}
