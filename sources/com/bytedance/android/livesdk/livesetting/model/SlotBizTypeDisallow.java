package com.bytedance.android.livesdk.livesetting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class SlotBizTypeDisallow implements Serializable {
    @AbstractC27891c(mo46611a = "disallow_all")
    private final boolean disallowAll;
    @AbstractC27891c(mo46611a = "frame_slot_disallow_list")
    private final List<String> frameSlotDisallowList;
    @AbstractC27891c(mo46611a = "icon_slot_disallow_list")
    private final List<String> iconSlotDisallowList;

    static {
        Covode.recordClassIndex(10559);
    }

    public SlotBizTypeDisallow() {
        this(false, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlotBizTypeDisallow copy$default(SlotBizTypeDisallow slotBizTypeDisallow, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = slotBizTypeDisallow.disallowAll;
        }
        if ((i & 2) != 0) {
            list = slotBizTypeDisallow.iconSlotDisallowList;
        }
        if ((i & 4) != 0) {
            list2 = slotBizTypeDisallow.frameSlotDisallowList;
        }
        return slotBizTypeDisallow.copy(z, list, list2);
    }

    public final boolean component1() {
        return this.disallowAll;
    }

    public final List<String> component2() {
        return this.iconSlotDisallowList;
    }

    public final List<String> component3() {
        return this.frameSlotDisallowList;
    }

    public final SlotBizTypeDisallow copy(boolean z, List<String> list, List<String> list2) {
        return new SlotBizTypeDisallow(z, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotBizTypeDisallow)) {
            return false;
        }
        SlotBizTypeDisallow slotBizTypeDisallow = (SlotBizTypeDisallow) obj;
        return this.disallowAll == slotBizTypeDisallow.disallowAll && C89219l.m154714a(this.iconSlotDisallowList, slotBizTypeDisallow.iconSlotDisallowList) && C89219l.m154714a(this.frameSlotDisallowList, slotBizTypeDisallow.frameSlotDisallowList);
    }

    public final int hashCode() {
        boolean z = this.disallowAll;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        List<String> list = this.iconSlotDisallowList;
        int i5 = 0;
        int hashCode = (i4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.frameSlotDisallowList;
        if (list2 != null) {
            i5 = list2.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "SlotBizTypeDisallow(disallowAll=" + this.disallowAll + ", iconSlotDisallowList=" + this.iconSlotDisallowList + ", frameSlotDisallowList=" + this.frameSlotDisallowList + ")";
    }

    public final boolean getDisallowAll() {
        return this.disallowAll;
    }

    public final List<String> getFrameSlotDisallowList() {
        return this.frameSlotDisallowList;
    }

    public final List<String> getIconSlotDisallowList() {
        return this.iconSlotDisallowList;
    }

    public SlotBizTypeDisallow(boolean z, List<String> list, List<String> list2) {
        this.disallowAll = z;
        this.iconSlotDisallowList = list;
        this.frameSlotDisallowList = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotBizTypeDisallow(boolean z, List list, List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
