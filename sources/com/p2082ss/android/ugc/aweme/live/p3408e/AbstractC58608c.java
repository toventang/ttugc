package com.p2082ss.android.ugc.aweme.live.p3408e;

import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.p687c.C11690a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11656k;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import org.json.JSONObject;
import p4600h.C89378p;

/* renamed from: com.ss.android.ugc.aweme.live.e.c */
public interface AbstractC58608c {
    static {
        Covode.recordClassIndex(68905);
    }

    void changeSRSupportScene(boolean z);

    void destroy();

    Boolean getLivePlayControllerIsPlaying();

    String getPlayerTag();

    JSONObject getStaticLog();

    TextureRenderView getTextureView();

    void pause();

    void pauseWithStreamData();

    void play(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout);

    void playWithStreamData(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout);

    C89378p<Integer, Integer> resolutionOfLiveFromStream(LiveRoomStruct liveRoomStruct);

    void setLivePlayerEntranceParam(C11690a aVar);

    void setMute(boolean z);

    void setPlayControllerShouldDestroy(boolean z);

    void setPlayerLogCache(AbstractC11656k kVar);

    void stop();

    void stopWithStreamData();

    void switchCndAbrSwitchResolution();
}
