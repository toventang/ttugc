package com.bytedance.android.live.liveinteract.api;

import android.view.SurfaceView;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11640d;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.live.liveinteract.api.j */
public class C4439j implements AbstractC4409b {
    static {
        Covode.recordClassIndex(5015);
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public long getBattleId() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public long getChannelId() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getCurrentInviteeList() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public int getCurrentLinkMode() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getCurrentPkState() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getInviteeList() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public SurfaceView getLinkInAnchorSurface() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getLinkStatus4H5() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public AbstractC4434e getLinkWidgetFactory() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public int getLinkedGuestNum() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public long getRivalAnchorUidWhenAnchorLinkMic() {
        return 0;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public String getRoomScene() {
        return "";
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getSocialInvitingUserId() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getSocialOnlineAndWaitingUserId() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getSocialOnlineUserIds() {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public EnumC4408av getUserRole(long j) {
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public void handleLiveRoomStopped() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isAnchorVideoEnable() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isAudienceApplied() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isBattleStarter() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isBattling() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isInCoHost() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isInMultiGuest() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isInRandomLinkMic() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isInteracting() {
        return false;
    }

    public boolean isLinkingMic() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isMultiLiveFloatLayout() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isMultiLiveGridLayout() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public boolean isRoomInBattle() {
        return false;
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public AbstractC4433d linkCrossRoomWidget() {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public void preloadWidgetView() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public void registerInteractStateChangeListener(AbstractC11640d dVar) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public void removeInteractStateChangeListener(AbstractC11640d dVar) {
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getHasInvitedUidSet() {
        return new LinkedHashSet();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getSocialLocalInviteUIDs() {
        return new HashSet();
    }

    @Override // com.bytedance.android.live.liveinteract.api.AbstractC4409b
    public Set<Long> getUninvitedUidSet() {
        return new LinkedHashSet();
    }
}
