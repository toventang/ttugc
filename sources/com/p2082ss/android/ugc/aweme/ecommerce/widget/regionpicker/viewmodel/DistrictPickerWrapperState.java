package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState */
public final class DistrictPickerWrapperState implements AbstractC20368af {
    private final boolean close;
    private final boolean done;
    private final boolean physicalBack;
    private final List<Region> selectedRegions;
    private final boolean titleBarBack;

    static {
        Covode.recordClassIndex(54168);
    }

    public DistrictPickerWrapperState() {
        this(false, false, false, false, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerWrapperState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictPickerWrapperState copy$default(DistrictPickerWrapperState districtPickerWrapperState, boolean z, boolean z2, boolean z3, boolean z4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = districtPickerWrapperState.done;
        }
        if ((i & 2) != 0) {
            z2 = districtPickerWrapperState.close;
        }
        if ((i & 4) != 0) {
            z3 = districtPickerWrapperState.titleBarBack;
        }
        if ((i & 8) != 0) {
            z4 = districtPickerWrapperState.physicalBack;
        }
        if ((i & 16) != 0) {
            list = districtPickerWrapperState.selectedRegions;
        }
        return districtPickerWrapperState.copy(z, z2, z3, z4, list);
    }

    public final boolean component1() {
        return this.done;
    }

    public final boolean component2() {
        return this.close;
    }

    public final boolean component3() {
        return this.titleBarBack;
    }

    public final boolean component4() {
        return this.physicalBack;
    }

    public final List<Region> component5() {
        return this.selectedRegions;
    }

    public final DistrictPickerWrapperState copy(boolean z, boolean z2, boolean z3, boolean z4, List<Region> list) {
        C89219l.m154721d(list, "");
        return new DistrictPickerWrapperState(z, z2, z3, z4, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictPickerWrapperState)) {
            return false;
        }
        DistrictPickerWrapperState districtPickerWrapperState = (DistrictPickerWrapperState) obj;
        return this.done == districtPickerWrapperState.done && this.close == districtPickerWrapperState.close && this.titleBarBack == districtPickerWrapperState.titleBarBack && this.physicalBack == districtPickerWrapperState.physicalBack && C89219l.m154714a(this.selectedRegions, districtPickerWrapperState.selectedRegions);
    }

    public final int hashCode() {
        boolean z = this.done;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.close;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.titleBarBack;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        if (!this.physicalBack) {
            i = 0;
        }
        int i14 = (i13 + i) * 31;
        List<Region> list = this.selectedRegions;
        return i14 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "DistrictPickerWrapperState(done=" + this.done + ", close=" + this.close + ", titleBarBack=" + this.titleBarBack + ", physicalBack=" + this.physicalBack + ", selectedRegions=" + this.selectedRegions + ")";
    }

    public final boolean getClose() {
        return this.close;
    }

    public final boolean getDone() {
        return this.done;
    }

    public final boolean getPhysicalBack() {
        return this.physicalBack;
    }

    public final List<Region> getSelectedRegions() {
        return this.selectedRegions;
    }

    public final boolean getTitleBarBack() {
        return this.titleBarBack;
    }

    public DistrictPickerWrapperState(boolean z, boolean z2, boolean z3, boolean z4, List<Region> list) {
        C89219l.m154721d(list, "");
        this.done = z;
        this.close = z2;
        this.titleBarBack = z3;
        this.physicalBack = z4;
        this.selectedRegions = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DistrictPickerWrapperState(boolean z, boolean z2, boolean z3, boolean z4, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) == 0 ? z4 : false, (i & 16) != 0 ? C89086z.INSTANCE : list);
    }
}
