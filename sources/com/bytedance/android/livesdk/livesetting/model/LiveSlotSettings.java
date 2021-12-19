package com.bytedance.android.livesdk.livesetting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveSlotSettings implements Serializable {
    @AbstractC27891c(mo46611a = "biz_type_disallow")
    private final Map<String, SlotBizTypeDisallow> bizTypeDisallow;

    static {
        Covode.recordClassIndex(10557);
    }

    public LiveSlotSettings() {
        this(null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.livesetting.model.LiveSlotSettings */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveSlotSettings copy$default(LiveSlotSettings liveSlotSettings, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = liveSlotSettings.bizTypeDisallow;
        }
        return liveSlotSettings.copy(map);
    }

    public final Map<String, SlotBizTypeDisallow> component1() {
        return this.bizTypeDisallow;
    }

    public final LiveSlotSettings copy(Map<String, SlotBizTypeDisallow> map) {
        return new LiveSlotSettings(map);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveSlotSettings) && C89219l.m154714a(this.bizTypeDisallow, ((LiveSlotSettings) obj).bizTypeDisallow);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, SlotBizTypeDisallow> map = this.bizTypeDisallow;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LiveSlotSettings(bizTypeDisallow=" + this.bizTypeDisallow + ")";
    }

    public final Map<String, SlotBizTypeDisallow> getBizTypeDisallow() {
        return this.bizTypeDisallow;
    }

    public LiveSlotSettings(Map<String, SlotBizTypeDisallow> map) {
        this.bizTypeDisallow = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveSlotSettings(Map map, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : map);
    }
}
