package com.bytedance.android.livesdk.watch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.watch.d */
public interface AbstractC11325d extends AbstractC2953a {
    static {
        Covode.recordClassIndex(12964);
    }

    void addLiveDuration(long j);

    void addLiveDurationTask(AbstractC7258b bVar);

    List<?> audienceToolbarList(DataChannel dataChannel, Context context);

    AbstractC11321b createDrawerFeedFragment(FullDraggableContainer fullDraggableContainer, Bundle bundle);

    AbstractC11650h createLiveRoomFragment(EnterRoomConfig enterRoomConfig);

    AbstractC11320a createShareGuideEvasionStrategy(DataChannel dataChannel);

    void dislikeLiveFromSharePanel(Room room, String str, String str2);

    int getLiveRoomChangeCount();

    AbstractC11322c getPreFetchManager();

    void logDislikeLiveFromLongPressSharePanel(Room room, String str, String str2);

    void logDislikeLiveFromSharePanel(Room room, String str, String str2);

    void logReportLiveFromSharePanel(Room room, String str, String str2, String str3);

    DialogInterface openLongPressDialog(IHostLongPressCallback iHostLongPressCallback, Context context, Room room, String str, String str2, String str3);

    void openShareSettingsDialog(Activity activity, String str);

    void preloadWatchResource(Context context);

    void setLiveRoomChangeCount(int i);

    boolean shouldDislikeActionShow(String str, String str2);

    void showMaskLayer(long j, boolean z);
}
