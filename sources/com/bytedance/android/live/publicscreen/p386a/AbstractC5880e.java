package com.bytedance.android.live.publicscreen.p386a;

import android.content.Context;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e;
import com.bytedance.android.livesdk.model.message.C9871g;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;

/* renamed from: com.bytedance.android.live.publicscreen.a.e */
public interface AbstractC5880e extends AbstractC2953a {
    static {
        Covode.recordClassIndex(6487);
    }

    void addOnRegistryReadyListener(AbstractC5885e eVar);

    void clearMockChatMessage();

    AbstractC5863b createGameMessageView(Context context, int i, AbstractC5862a aVar);

    C9871g getCurrentBottomMessage(long j);

    long getHotDuration(long j);

    List<AbstractC5885e> getOnRegistryReadyListeners();

    Class<? extends LiveRecyclableWidget> getPublicScreenWidgetClass(boolean z);

    Long getStartStreamingTimestamp(long j);

    AbstractC5886f getTextMessageConfig();

    void hideWarningMessage(long j);

    void insertBottomMessage(long j, String str, C9698b bVar, long j2, int i, int i2, int i3);

    long insertMessage(long j, AbstractC6571a aVar, boolean z);

    C9878i mockChatMessage(long j, String str, User user);

    void onStartStreaming(long j);

    void onStopStreaming(long j);

    void removeModelByToken(long j, long j2);

    void resetDuration(long j);

    boolean uiOptimized(boolean z);

    void updateGameMessageViewUserCount(int i);

    void updateMessage(long j, long j2, AbstractC6571a aVar);

    void updateModel(long j, AbstractC5873h hVar);
}
