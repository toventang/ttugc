package com.bytedance.android.livesdk.rank.impl;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankSupportAreaSetting;
import com.bytedance.android.livesdk.model.C9591j;
import com.bytedance.android.livesdk.model.message.C9682bo;
import com.bytedance.android.livesdk.p514d.C8313a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.rank.api.AbstractC10336c;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.p607b.AbstractC10335a;
import com.bytedance.android.livesdk.rank.impl.api.model.EnumC10367d;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.api.model.RankPage;
import com.bytedance.android.livesdk.rank.impl.p610c.C10384a;
import com.bytedance.android.livesdk.rank.impl.p612e.C10403c;
import com.bytedance.android.livesdk.rank.impl.ranks.RankEntranceWidget;
import com.bytedance.android.livesdk.rank.impl.ranks.p615a.C10492d;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;

/* renamed from: com.bytedance.android.livesdk.rank.impl.d */
public class C10385d implements C8313a.AbstractC8314a, AbstractC10339d {
    private List<C9682bo> canShowRankEntrances = new ArrayList();
    private boolean notMatchAgeGate;
    private boolean rankAreaSupported;
    private final Map<Long, AbstractC10335a> rankControllerMap = new HashMap();
    private boolean settingLoaded;

    static {
        Covode.recordClassIndex(11959);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public int getCurrentRoomAudienceNum() {
        return C10384a.f25067b;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public int getCurrentRoomHourlyRank() {
        return C10384a.f25066a;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public LiveRecyclableWidget getHourlyRankWidget() {
        return new RankEntranceWidget();
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public AbstractC10336c getRankOptOutPresenter() {
        return new C10403c();
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public LiveRecyclableWidget getRankWidget() {
        return new OnlineAudienceRankWidget();
    }

    public boolean isRankAreaSupported() {
        if (!this.settingLoaded) {
            loadSetting();
            this.settingLoaded = true;
        }
        return this.rankAreaSupported;
    }

    public C10385d() {
        C8313a.f20585a = this;
    }

    private void loadSetting() {
        this.notMatchAgeGate = LiveAnchorGiftDisableSetting.INSTANCE.getValue();
        this.rankAreaSupported = RankSupportAreaSetting.INSTANCE.getValue();
    }

    public boolean matchAgeGate() {
        if (!this.settingLoaded) {
            loadSetting();
            this.settingLoaded = true;
        }
        if (!this.notMatchAgeGate) {
            return true;
        }
        return false;
    }

    public String getRankDisabledReason() {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            return "hide_due_to_empty_room";
        }
        if (room.getOwner() == null) {
            return "hide_due_to_empty_owner";
        }
        if (C11115u.m19743a().mo17915b().mo13147a().getSecret() == 1) {
            return "hide_due_to_secret_audience";
        }
        if (room.getOwner().getSecret() == 1) {
            return "hide_due_to_secret_anchor";
        }
        if (this.notMatchAgeGate) {
            return "hide_due_to_age_gate";
        }
        if (!this.rankAreaSupported) {
            return "hide_due_to_unsupported_area";
        }
        return "";
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public Class<? extends LiveRecyclableWidget> getRankWidgetClass(int i) {
        if (i == 4) {
            return RankEntranceWidget.class;
        }
        if (i == 5) {
            return OnlineAudienceRankWidget.class;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void setRankEntranceList(List<C9682bo> list) {
        this.canShowRankEntrances.clear();
        this.canShowRankEntrances.addAll(list);
    }

    @Override // com.bytedance.android.livesdk.p514d.C8313a.AbstractC8314a
    public boolean filter(C9591j jVar) {
        if (!TextUtils.equals(jVar.f23267c, "hourly_rank") && !TextUtils.equals(jVar.f23267c, "weekly_rank")) {
            return true;
        }
        if (!this.settingLoaded) {
            loadSetting();
            this.settingLoaded = true;
        }
        if (!this.rankAreaSupported || this.notMatchAgeGate) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public boolean isRankEnabled(int i) {
        if (!matchAgeGate()) {
            return false;
        }
        for (C9682bo boVar : this.canShowRankEntrances) {
            if (boVar.f23562e == i && boVar.f23558a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void registerRankController(long j, AbstractC10335a aVar) {
        if (aVar != null) {
            this.rankControllerMap.put(Long.valueOf(j), aVar);
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void unregisterRankController(long j, AbstractC10335a aVar) {
        if (aVar != null) {
            this.rankControllerMap.remove(Long.valueOf(j));
        }
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public boolean isRankEnabledInTheRoom(int i, long j) {
        AbstractC10335a aVar;
        if (isRankEnabled(i) && (aVar = this.rankControllerMap.get(Long.valueOf(j))) != null) {
            return aVar.mo17113a();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void setRankEnabled(long j, boolean z) {
        AbstractC10335a aVar = this.rankControllerMap.get(Long.valueOf(j));
        if (aVar != null) {
            aVar.mo17112a(z);
        }
    }

    static final /* synthetic */ C89391z lambda$getRankRoomIds$0$RankService(AbstractC10339d.AbstractC10340a aVar, RankPage rankPage) {
        ArrayList<Long> arrayList = new ArrayList<>();
        for (Rank rank : rankPage.getRanks()) {
            arrayList.add(Long.valueOf(rank.getRoomId()));
        }
        aVar.mo15036a(arrayList);
        return null;
    }

    @Override // com.bytedance.android.livesdk.rank.api.AbstractC10339d
    public void getRankRoomIds(long j, long j2, int i, Fragment fragment, DataChannel dataChannel, AbstractC10339d.AbstractC10340a aVar) {
        new C10492d(j, j2, dataChannel, new ArrayList(), EnumC10367d.UNKNOWN.getValue()).mo17326a(i, fragment, new C10388e(aVar));
    }
}
