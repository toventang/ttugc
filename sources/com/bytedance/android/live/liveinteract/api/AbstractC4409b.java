package com.bytedance.android.live.liveinteract.api;

import android.view.SurfaceView;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11640d;
import com.bytedance.covode.number.Covode;
import java.util.Set;

/* renamed from: com.bytedance.android.live.liveinteract.api.b */
public interface AbstractC4409b extends AbstractC2953a {
    static {
        Covode.recordClassIndex(4985);
    }

    long getBattleId();

    long getChannelId();

    String getCurrentInviteeList();

    int getCurrentLinkMode();

    String getCurrentPkState();

    Set<Long> getHasInvitedUidSet();

    String getInviteeList();

    SurfaceView getLinkInAnchorSurface();

    String getLinkStatus4H5();

    AbstractC4434e getLinkWidgetFactory();

    int getLinkedGuestNum();

    long getRivalAnchorUidWhenAnchorLinkMic();

    String getRoomScene();

    Set<Long> getSocialInvitingUserId();

    Set<Long> getSocialLocalInviteUIDs();

    Set<Long> getSocialOnlineAndWaitingUserId();

    Set<Long> getSocialOnlineUserIds();

    Set<Long> getUninvitedUidSet();

    EnumC4408av getUserRole(long j);

    void handleLiveRoomStopped();

    boolean isAnchorVideoEnable();

    boolean isAudienceApplied();

    boolean isBattleStarter();

    boolean isBattling();

    boolean isInCoHost();

    boolean isInMultiGuest();

    boolean isInRandomLinkMic();

    boolean isInteracting();

    boolean isMultiLiveFloatLayout();

    boolean isMultiLiveGridLayout();

    boolean isRoomInBattle();

    AbstractC4433d linkCrossRoomWidget();

    void preloadWidgetView();

    void registerInteractStateChangeListener(AbstractC11640d dVar);

    void removeInteractStateChangeListener(AbstractC11640d dVar);
}
