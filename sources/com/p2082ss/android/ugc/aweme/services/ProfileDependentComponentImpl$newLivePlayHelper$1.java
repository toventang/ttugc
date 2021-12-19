package com.p2082ss.android.ugc.aweme.services;

import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58606a;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58607b;
import com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl$newLivePlayHelper$1 */
public final class ProfileDependentComponentImpl$newLivePlayHelper$1 implements AbstractC58608c {
    final /* synthetic */ AbstractC58607b $callback;
    final /* synthetic */ Runnable $onStreamPlay;
    private final AbstractC58608c livePlayHelper;

    static {
        Covode.recordClassIndex(79716);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void destroy() {
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final Boolean getLivePlayControllerIsPlaying() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final String getPlayerTag() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final TextureRenderView getTextureView() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void pause() {
    }

    public final void setLinkCallback(AbstractC58606a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void setPlayControllerShouldDestroy(boolean z) {
    }

    public final AbstractC58608c getLivePlayHelper() {
        return this.livePlayHelper;
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final JSONObject getStaticLog() {
        return new JSONObject();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void pauseWithStreamData() {
        this.livePlayHelper.pauseWithStreamData();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void stop() {
        this.livePlayHelper.stop();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void stopWithStreamData() {
        this.livePlayHelper.stopWithStreamData();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void switchCndAbrSwitchResolution() {
        this.livePlayHelper.switchCndAbrSwitchResolution();
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void changeSRSupportScene(boolean z) {
        this.livePlayHelper.changeSRSupportScene(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void setMute(boolean z) {
        this.livePlayHelper.setMute(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final C89378p<Integer, Integer> resolutionOfLiveFromStream(LiveRoomStruct liveRoomStruct) {
        return new C89378p<>(0, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void setLivePlayerEntranceParam(C11690a aVar) {
        C89219l.m154721d(aVar, "");
        this.livePlayHelper.setLivePlayerEntranceParam(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void setPlayerLogCache(AbstractC11656k kVar) {
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar, "");
    }

    public final C89378p<Integer, Integer> sizeOfLiveFromRoom(LiveRoomStruct liveRoomStruct) {
        return new C89378p<>(0, 0);
    }

    ProfileDependentComponentImpl$newLivePlayHelper$1(Runnable runnable, AbstractC58607b bVar) {
        this.$onStreamPlay = runnable;
        this.$callback = bVar;
        this.livePlayHelper = LiveOuterService.m107269s().mo95826a(runnable, new C67874xe4249561(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void play(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        C89219l.m154721d(liveRoomStruct, "");
        this.livePlayHelper.play(z, liveRoomStruct, frameLayout);
    }

    @Override // com.p2082ss.android.ugc.aweme.live.p3408e.AbstractC58608c
    public final void playWithStreamData(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
        C89219l.m154721d(liveRoomStruct, "");
        this.livePlayHelper.playWithStreamData(z, liveRoomStruct, frameLayout);
    }
}
