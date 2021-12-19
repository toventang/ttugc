package com.bytedance.android.livesdk.rank.api;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.model.message.C9682bo;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.p607b.AbstractC10335a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.api.g */
public class C10343g implements AbstractC10339d {
    static {
        Covode.recordClassIndex(11909);
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public int getCurrentRoomAudienceNum() {
        return -1;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public int getCurrentRoomHourlyRank() {
        return -1;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public LiveRecyclableWidget getHourlyRankWidget() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public AbstractC10336c getRankOptOutPresenter() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void getRankRoomIds(long j, long j2, int i, Fragment fragment, DataChannel dataChannel, AbstractC10339d.AbstractC10340a aVar) {
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public LiveRecyclableWidget getRankWidget() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public Class<? extends LiveRecyclableWidget> getRankWidgetClass(int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public boolean isRankEnabled(int i) {
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public boolean isRankEnabledInTheRoom(int i, long j) {
        return false;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void registerRankController(long j, AbstractC10335a aVar) {
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void setRankEnabled(long j, boolean z) {
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void setRankEntranceList(List<C9682bo> list) {
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void unregisterRankController(long j, AbstractC10335a aVar) {
    }
}
