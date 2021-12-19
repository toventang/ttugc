package com.bytedance.android.livesdk.rank.api;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.livesdk.model.message.C9682bo;
import com.bytedance.android.livesdk.rank.api.p607b.AbstractC10335a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.rank.api.d */
public interface AbstractC10339d extends AbstractC2953a {

    /* renamed from: com.bytedance.android.livesdk.rank.api.d$a */
    public interface AbstractC10340a {
        static {
            Covode.recordClassIndex(11906);
        }

        /* renamed from: a */
        void mo15036a(ArrayList<Long> arrayList);
    }

    static {
        Covode.recordClassIndex(11905);
    }

    int getCurrentRoomAudienceNum();

    int getCurrentRoomHourlyRank();

    LiveRecyclableWidget getHourlyRankWidget();

    AbstractC10336c getRankOptOutPresenter();

    void getRankRoomIds(long j, long j2, int i, Fragment fragment, DataChannel dataChannel, AbstractC10340a aVar);

    LiveRecyclableWidget getRankWidget();

    Class<? extends LiveRecyclableWidget> getRankWidgetClass(int i);

    boolean isRankEnabled(int i);

    boolean isRankEnabledInTheRoom(int i, long j);

    void registerRankController(long j, AbstractC10335a aVar);

    void setRankEnabled(long j, boolean z);

    void setRankEntranceList(List<C9682bo> list);

    void unregisterRankController(long j, AbstractC10335a aVar);
}
