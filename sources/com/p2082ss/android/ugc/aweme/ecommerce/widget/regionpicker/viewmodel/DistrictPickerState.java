package com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState */
public final class DistrictPickerState implements AbstractC20368af {
    private final List<Object> districtList;
    private final District selectedDistrict;
    private final int status;
    private final String title;
    private final String titleEn;

    static {
        Covode.recordClassIndex(54160);
    }

    public DistrictPickerState() {
        this(null, null, null, null, 0, 31, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_widget_regionpicker_viewmodel_DistrictPickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m88167x551d985a(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DistrictPickerState copy$default(DistrictPickerState districtPickerState, String str, String str2, List list, District district, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = districtPickerState.title;
        }
        if ((i2 & 2) != 0) {
            str2 = districtPickerState.titleEn;
        }
        if ((i2 & 4) != 0) {
            list = districtPickerState.districtList;
        }
        if ((i2 & 8) != 0) {
            district = districtPickerState.selectedDistrict;
        }
        if ((i2 & 16) != 0) {
            i = districtPickerState.status;
        }
        return districtPickerState.copy(str, str2, list, district, i);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.titleEn;
    }

    public final List<Object> component3() {
        return this.districtList;
    }

    public final District component4() {
        return this.selectedDistrict;
    }

    public final int component5() {
        return this.status;
    }

    public final DistrictPickerState copy(String str, String str2, List<? extends Object> list, District district, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        return new DistrictPickerState(str, str2, list, district, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictPickerState)) {
            return false;
        }
        DistrictPickerState districtPickerState = (DistrictPickerState) obj;
        return C89219l.m154714a(this.title, districtPickerState.title) && C89219l.m154714a(this.titleEn, districtPickerState.titleEn) && C89219l.m154714a(this.districtList, districtPickerState.districtList) && C89219l.m154714a(this.selectedDistrict, districtPickerState.selectedDistrict) && this.status == districtPickerState.status;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.titleEn;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Object> list = this.districtList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        District district = this.selectedDistrict;
        if (district != null) {
            i = district.hashCode();
        }
        return ((hashCode3 + i) * 31) + m88167x551d985a(this.status);
    }

    public final String toString() {
        return "DistrictPickerState(title=" + this.title + ", titleEn=" + this.titleEn + ", districtList=" + this.districtList + ", selectedDistrict=" + this.selectedDistrict + ", status=" + this.status + ")";
    }

    public final List<Object> getDistrictList() {
        return this.districtList;
    }

    public final District getSelectedDistrict() {
        return this.selectedDistrict;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleEn() {
        return this.titleEn;
    }

    public DistrictPickerState(String str, String str2, List<? extends Object> list, District district, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        this.title = str;
        this.titleEn = str2;
        this.districtList = list;
        this.selectedDistrict = district;
        this.status = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DistrictPickerState(java.lang.String r7, java.lang.String r8, java.util.List r9, com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District r10, int r11, int r12, p4600h.p4611f.p4613b.C89214g r13) {
        /*
            r6 = this;
            r4 = r10
            r3 = r9
            r5 = r11
            r1 = r7
            r0 = r12 & 1
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x000b
            r1 = r2
        L_0x000b:
            r0 = r12 & 2
            if (r0 == 0) goto L_0x0025
        L_0x000f:
            r0 = r12 & 4
            if (r0 == 0) goto L_0x0015
            h.a.z r3 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0015:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x001a
            r4 = 0
        L_0x001a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0020
            r0 = -1
            r5 = -1
        L_0x0020:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L_0x0025:
            r2 = r8
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.widget.regionpicker.viewmodel.DistrictPickerState.<init>(java.lang.String, java.lang.String, java.util.List, com.ss.android.ugc.aweme.ecommerce.widget.regionpicker.model.District, int, int, h.f.b.g):void");
    }
}
