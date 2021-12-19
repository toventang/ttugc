package com.p2082ss.android.ugc.aweme.ecommerce.semipdp;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpState */
public final class SemiPdpState implements AbstractC20368af {
    private final CartEntry cartEntry;
    private final List<Object> contentList;
    private final boolean dismissPage;
    private final boolean isFullScreen;
    private final Integer pdpState;
    private final int productState;
    private final int scrollOffset;

    static {
        Covode.recordClassIndex(53756);
    }

    public SemiPdpState() {
        this(false, null, false, 0, null, 0, null, 127, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m87889xa39e9162(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SemiPdpState copy$default(SemiPdpState semiPdpState, boolean z, List list, boolean z2, int i, Integer num, int i2, CartEntry cartEntry2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = semiPdpState.dismissPage;
        }
        if ((i3 & 2) != 0) {
            list = semiPdpState.contentList;
        }
        if ((i3 & 4) != 0) {
            z2 = semiPdpState.isFullScreen;
        }
        if ((i3 & 8) != 0) {
            i = semiPdpState.scrollOffset;
        }
        if ((i3 & 16) != 0) {
            num = semiPdpState.pdpState;
        }
        if ((i3 & 32) != 0) {
            i2 = semiPdpState.productState;
        }
        if ((i3 & 64) != 0) {
            cartEntry2 = semiPdpState.cartEntry;
        }
        return semiPdpState.copy(z, list, z2, i, num, i2, cartEntry2);
    }

    public final boolean component1() {
        return this.dismissPage;
    }

    public final List<Object> component2() {
        return this.contentList;
    }

    public final boolean component3() {
        return this.isFullScreen;
    }

    public final int component4() {
        return this.scrollOffset;
    }

    public final Integer component5() {
        return this.pdpState;
    }

    public final int component6() {
        return this.productState;
    }

    public final CartEntry component7() {
        return this.cartEntry;
    }

    public final SemiPdpState copy(boolean z, List<? extends Object> list, boolean z2, int i, Integer num, int i2, CartEntry cartEntry2) {
        C89219l.m154721d(list, "");
        return new SemiPdpState(z, list, z2, i, num, i2, cartEntry2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemiPdpState)) {
            return false;
        }
        SemiPdpState semiPdpState = (SemiPdpState) obj;
        return this.dismissPage == semiPdpState.dismissPage && C89219l.m154714a(this.contentList, semiPdpState.contentList) && this.isFullScreen == semiPdpState.isFullScreen && this.scrollOffset == semiPdpState.scrollOffset && C89219l.m154714a(this.pdpState, semiPdpState.pdpState) && this.productState == semiPdpState.productState && C89219l.m154714a(this.cartEntry, semiPdpState.cartEntry);
    }

    public final int hashCode() {
        boolean z = this.dismissPage;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        List<Object> list = this.contentList;
        int i6 = 0;
        int hashCode = (i5 + (list != null ? list.hashCode() : 0)) * 31;
        if (!this.isFullScreen) {
            i = 0;
        }
        int com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode + i) * 31) + m87889xa39e9162(this.scrollOffset)) * 31;
        Integer num = this.pdpState;
        int hashCode2 = (((com_ss_android_ugc_aweme_ecommerce_semipdp_SemiPdpState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (num != null ? num.hashCode() : 0)) * 31) + m87889xa39e9162(this.productState)) * 31;
        CartEntry cartEntry2 = this.cartEntry;
        if (cartEntry2 != null) {
            i6 = cartEntry2.hashCode();
        }
        return hashCode2 + i6;
    }

    public final String toString() {
        return "SemiPdpState(dismissPage=" + this.dismissPage + ", contentList=" + this.contentList + ", isFullScreen=" + this.isFullScreen + ", scrollOffset=" + this.scrollOffset + ", pdpState=" + this.pdpState + ", productState=" + this.productState + ", cartEntry=" + this.cartEntry + ")";
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final List<Object> getContentList() {
        return this.contentList;
    }

    public final boolean getDismissPage() {
        return this.dismissPage;
    }

    public final Integer getPdpState() {
        return this.pdpState;
    }

    public final int getProductState() {
        return this.productState;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public SemiPdpState(boolean z, List<? extends Object> list, boolean z2, int i, Integer num, int i2, CartEntry cartEntry2) {
        C89219l.m154721d(list, "");
        this.dismissPage = z;
        this.contentList = list;
        this.isFullScreen = z2;
        this.scrollOffset = i;
        this.pdpState = num;
        this.productState = i2;
        this.cartEntry = cartEntry2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemiPdpState(boolean z, List list, boolean z2, int i, Integer num, int i2, CartEntry cartEntry2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? C89086z.INSTANCE : list, (i3 & 4) != 0 ? false : z2, (i3 & 8) == 0 ? i : 0, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? 1 : i2, (i3 & 64) == 0 ? cartEntry2 : null);
    }
}
