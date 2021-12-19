package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2839b.C44384a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState */
public final class DeliveryPanelState implements AbstractC20368af {
    private final List<Object> addressRenderData;
    private final boolean apply;
    private final C44479b changePage;
    private final Set<LogisticDTO> exposedItems;
    private final List<Object> logisticList;
    private final LogisticDTO selectedLogistic;
    private final C44384a selectedShipToInfo;
    private final int status;

    static {
        Covode.recordClassIndex(52810);
    }

    public DeliveryPanelState() {
        this(null, false, null, null, null, 0, null, null, 255, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_delivery_vm_DeliveryPanelState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87149x7de36c0c(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryPanelState copy$default(DeliveryPanelState deliveryPanelState, C44479b bVar, boolean z, LogisticDTO logisticDTO, C44384a aVar, List list, int i, List list2, Set set, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bVar = deliveryPanelState.changePage;
        }
        if ((i2 & 2) != 0) {
            z = deliveryPanelState.apply;
        }
        if ((i2 & 4) != 0) {
            logisticDTO = deliveryPanelState.selectedLogistic;
        }
        if ((i2 & 8) != 0) {
            aVar = deliveryPanelState.selectedShipToInfo;
        }
        if ((i2 & 16) != 0) {
            list = deliveryPanelState.addressRenderData;
        }
        if ((i2 & 32) != 0) {
            i = deliveryPanelState.status;
        }
        if ((i2 & 64) != 0) {
            list2 = deliveryPanelState.logisticList;
        }
        if ((i2 & 128) != 0) {
            set = deliveryPanelState.exposedItems;
        }
        return deliveryPanelState.copy(bVar, z, logisticDTO, aVar, list, i, list2, set);
    }

    public final C44479b component1() {
        return this.changePage;
    }

    public final boolean component2() {
        return this.apply;
    }

    public final LogisticDTO component3() {
        return this.selectedLogistic;
    }

    public final C44384a component4() {
        return this.selectedShipToInfo;
    }

    public final List<Object> component5() {
        return this.addressRenderData;
    }

    public final int component6() {
        return this.status;
    }

    public final List<Object> component7() {
        return this.logisticList;
    }

    public final Set<LogisticDTO> component8() {
        return this.exposedItems;
    }

    public final DeliveryPanelState copy(C44479b bVar, boolean z, LogisticDTO logisticDTO, C44384a aVar, List<? extends Object> list, int i, List<? extends Object> list2, Set<LogisticDTO> set) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(set, "");
        return new DeliveryPanelState(bVar, z, logisticDTO, aVar, list, i, list2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryPanelState)) {
            return false;
        }
        DeliveryPanelState deliveryPanelState = (DeliveryPanelState) obj;
        return C89219l.m154714a(this.changePage, deliveryPanelState.changePage) && this.apply == deliveryPanelState.apply && C89219l.m154714a(this.selectedLogistic, deliveryPanelState.selectedLogistic) && C89219l.m154714a(this.selectedShipToInfo, deliveryPanelState.selectedShipToInfo) && C89219l.m154714a(this.addressRenderData, deliveryPanelState.addressRenderData) && this.status == deliveryPanelState.status && C89219l.m154714a(this.logisticList, deliveryPanelState.logisticList) && C89219l.m154714a(this.exposedItems, deliveryPanelState.exposedItems);
    }

    public final int hashCode() {
        C44479b bVar = this.changePage;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        boolean z = this.apply;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode + i2) * 31;
        LogisticDTO logisticDTO = this.selectedLogistic;
        int hashCode2 = (i5 + (logisticDTO != null ? logisticDTO.hashCode() : 0)) * 31;
        C44384a aVar = this.selectedShipToInfo;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        List<Object> list = this.addressRenderData;
        int hashCode4 = (((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + m87149x7de36c0c(this.status)) * 31;
        List<Object> list2 = this.logisticList;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Set<LogisticDTO> set = this.exposedItems;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "DeliveryPanelState(changePage=" + this.changePage + ", apply=" + this.apply + ", selectedLogistic=" + this.selectedLogistic + ", selectedShipToInfo=" + this.selectedShipToInfo + ", addressRenderData=" + this.addressRenderData + ", status=" + this.status + ", logisticList=" + this.logisticList + ", exposedItems=" + this.exposedItems + ")";
    }

    public final List<Object> getAddressRenderData() {
        return this.addressRenderData;
    }

    public final boolean getApply() {
        return this.apply;
    }

    public final C44479b getChangePage() {
        return this.changePage;
    }

    public final Set<LogisticDTO> getExposedItems() {
        return this.exposedItems;
    }

    public final List<Object> getLogisticList() {
        return this.logisticList;
    }

    public final LogisticDTO getSelectedLogistic() {
        return this.selectedLogistic;
    }

    public final C44384a getSelectedShipToInfo() {
        return this.selectedShipToInfo;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean canSelectLogistic(Parcelable parcelable) {
        boolean z;
        boolean z2;
        C44457d a;
        boolean z3;
        if (this.selectedShipToInfo.f103498a == null) {
            z = true;
        } else {
            z = false;
        }
        if (!this.addressRenderData.isEmpty()) {
            Iterator<T> it = this.addressRenderData.iterator();
            while (true) {
                T t = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (next instanceof C44457d) {
                    t = next;
                }
                T t2 = t;
                if (t2 != null && t2.f103649a) {
                    if (next != null) {
                        z2 = false;
                    }
                }
            }
            boolean z4 = parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage;
            a = this.selectedShipToInfo.mo75409a();
            if (a != null || a.f103649a) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (((z || !z2) && !z3) || !z4) {
                return true;
            }
            return false;
        }
        z2 = true;
        boolean z42 = parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage;
        a = this.selectedShipToInfo.mo75409a();
        if (a != null) {
        }
        z3 = false;
        if (z) {
        }
        return true;
    }

    public DeliveryPanelState(C44479b bVar, boolean z, LogisticDTO logisticDTO, C44384a aVar, List<? extends Object> list, int i, List<? extends Object> list2, Set<LogisticDTO> set) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(set, "");
        this.changePage = bVar;
        this.apply = z;
        this.selectedLogistic = logisticDTO;
        this.selectedShipToInfo = aVar;
        this.addressRenderData = list;
        this.status = i;
        this.logisticList = list2;
        this.exposedItems = set;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliveryPanelState(C44479b bVar, boolean z, LogisticDTO logisticDTO, C44384a aVar, List list, int i, List list2, Set set, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? new C44479b(EnumC44478a.NONE) : bVar, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : logisticDTO, (i2 & 8) != 0 ? new C44384a() : aVar, (i2 & 16) != 0 ? C89086z.INSTANCE : list, (i2 & 32) == 0 ? i : 0, (i2 & 64) == 0 ? list2 : null, (i2 & 128) != 0 ? new LinkedHashSet() : set);
    }
}
