package com.p2082ss.android.ugc.aweme.ecommerce.address.edit;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a.C43340a;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState */
public final class AddressEditState implements AbstractC20368af {
    private final int autoScrollIndex;
    private final Integer changeRegionLoadingStatus;
    private final Integer deleteLoadingStatus;
    private final boolean emailHintVisible;
    private final int inputItemFirstTimeLoadingStatus;
    private final List<C43340a> inputItemVOList;
    private final boolean isAddressEditorFocus;
    private final Integer saveLoadingStatus;

    static {
        Covode.recordClassIndex(51611);
    }

    public AddressEditState() {
        this(0, null, null, null, null, false, 0, false, 255, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86482xf3c7283f(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressEditState copy$default(AddressEditState addressEditState, int i, Integer num, Integer num2, Integer num3, List list, boolean z, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = addressEditState.inputItemFirstTimeLoadingStatus;
        }
        if ((i3 & 2) != 0) {
            num = addressEditState.changeRegionLoadingStatus;
        }
        if ((i3 & 4) != 0) {
            num2 = addressEditState.deleteLoadingStatus;
        }
        if ((i3 & 8) != 0) {
            num3 = addressEditState.saveLoadingStatus;
        }
        if ((i3 & 16) != 0) {
            list = addressEditState.inputItemVOList;
        }
        if ((i3 & 32) != 0) {
            z = addressEditState.emailHintVisible;
        }
        if ((i3 & 64) != 0) {
            i2 = addressEditState.autoScrollIndex;
        }
        if ((i3 & 128) != 0) {
            z2 = addressEditState.isAddressEditorFocus;
        }
        return addressEditState.copy(i, num, num2, num3, list, z, i2, z2);
    }

    public final int component1() {
        return this.inputItemFirstTimeLoadingStatus;
    }

    public final Integer component2() {
        return this.changeRegionLoadingStatus;
    }

    public final Integer component3() {
        return this.deleteLoadingStatus;
    }

    public final Integer component4() {
        return this.saveLoadingStatus;
    }

    public final List<C43340a> component5() {
        return this.inputItemVOList;
    }

    public final boolean component6() {
        return this.emailHintVisible;
    }

    public final int component7() {
        return this.autoScrollIndex;
    }

    public final boolean component8() {
        return this.isAddressEditorFocus;
    }

    public final AddressEditState copy(int i, Integer num, Integer num2, Integer num3, List<C43340a> list, boolean z, int i2, boolean z2) {
        C89219l.m154721d(list, "");
        return new AddressEditState(i, num, num2, num3, list, z, i2, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressEditState)) {
            return false;
        }
        AddressEditState addressEditState = (AddressEditState) obj;
        return this.inputItemFirstTimeLoadingStatus == addressEditState.inputItemFirstTimeLoadingStatus && C89219l.m154714a(this.changeRegionLoadingStatus, addressEditState.changeRegionLoadingStatus) && C89219l.m154714a(this.deleteLoadingStatus, addressEditState.deleteLoadingStatus) && C89219l.m154714a(this.saveLoadingStatus, addressEditState.saveLoadingStatus) && C89219l.m154714a(this.inputItemVOList, addressEditState.inputItemVOList) && this.emailHintVisible == addressEditState.emailHintVisible && this.autoScrollIndex == addressEditState.autoScrollIndex && this.isAddressEditorFocus == addressEditState.isAddressEditorFocus;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m86482xf3c7283f(this.inputItemFirstTimeLoadingStatus) * 31;
        Integer num = this.changeRegionLoadingStatus;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.deleteLoadingStatus;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.saveLoadingStatus;
        int hashCode3 = (hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        List<C43340a> list = this.inputItemVOList;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.emailHintVisible;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((i2 + i4) * 31) + m86482xf3c7283f(this.autoScrollIndex)) * 31;
        if (!this.isAddressEditorFocus) {
            i3 = 0;
        }
        return com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + i3;
    }

    public final String toString() {
        return "AddressEditState(inputItemFirstTimeLoadingStatus=" + this.inputItemFirstTimeLoadingStatus + ", changeRegionLoadingStatus=" + this.changeRegionLoadingStatus + ", deleteLoadingStatus=" + this.deleteLoadingStatus + ", saveLoadingStatus=" + this.saveLoadingStatus + ", inputItemVOList=" + this.inputItemVOList + ", emailHintVisible=" + this.emailHintVisible + ", autoScrollIndex=" + this.autoScrollIndex + ", isAddressEditorFocus=" + this.isAddressEditorFocus + ")";
    }

    public final int getAutoScrollIndex() {
        return this.autoScrollIndex;
    }

    public final Integer getChangeRegionLoadingStatus() {
        return this.changeRegionLoadingStatus;
    }

    public final Integer getDeleteLoadingStatus() {
        return this.deleteLoadingStatus;
    }

    public final boolean getEmailHintVisible() {
        return this.emailHintVisible;
    }

    public final int getInputItemFirstTimeLoadingStatus() {
        return this.inputItemFirstTimeLoadingStatus;
    }

    public final List<C43340a> getInputItemVOList() {
        return this.inputItemVOList;
    }

    public final Integer getSaveLoadingStatus() {
        return this.saveLoadingStatus;
    }

    public final boolean isAddressEditorFocus() {
        return this.isAddressEditorFocus;
    }

    public AddressEditState(int i, Integer num, Integer num2, Integer num3, List<C43340a> list, boolean z, int i2, boolean z2) {
        C89219l.m154721d(list, "");
        this.inputItemFirstTimeLoadingStatus = i;
        this.changeRegionLoadingStatus = num;
        this.deleteLoadingStatus = num2;
        this.saveLoadingStatus = num3;
        this.inputItemVOList = list;
        this.emailHintVisible = z;
        this.autoScrollIndex = i2;
        this.isAddressEditorFocus = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressEditState(int i, Integer num, Integer num2, Integer num3, List list, boolean z, int i2, boolean z2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : num2, (i3 & 8) == 0 ? num3 : null, (i3 & 16) != 0 ? C89086z.INSTANCE : list, (i3 & 32) != 0 ? false : z, (i3 & 64) == 0 ? i2 : -1, (i3 & 128) == 0 ? z2 : false);
    }
}
