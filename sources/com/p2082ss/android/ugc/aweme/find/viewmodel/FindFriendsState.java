package com.p2082ss.android.ugc.aweme.find.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsState */
public final class FindFriendsState implements AbstractC20368af {
    private final boolean canShowEmtpyTail;
    private final List<Integer> channels;
    private final int cursor;
    private final boolean hasMore;
    private final List<C51034a> list;
    private final C51039e resType;
    private final C51041f searchType;
    private final List<Integer> tailChannels;

    static {
        Covode.recordClassIndex(60205);
    }

    public FindFriendsState() {
        this(null, null, false, 0, null, null, false, null, 255, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_find_viewmodel_FindFriendsState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m95419xce1a0a37(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.find.viewmodel.FindFriendsState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FindFriendsState copy$default(FindFriendsState findFriendsState, C51039e eVar, List list2, boolean z, int i, List list3, List list4, boolean z2, C51041f fVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            eVar = findFriendsState.resType;
        }
        if ((i2 & 2) != 0) {
            list2 = findFriendsState.list;
        }
        if ((i2 & 4) != 0) {
            z = findFriendsState.hasMore;
        }
        if ((i2 & 8) != 0) {
            i = findFriendsState.cursor;
        }
        if ((i2 & 16) != 0) {
            list3 = findFriendsState.channels;
        }
        if ((i2 & 32) != 0) {
            list4 = findFriendsState.tailChannels;
        }
        if ((i2 & 64) != 0) {
            z2 = findFriendsState.canShowEmtpyTail;
        }
        if ((i2 & 128) != 0) {
            fVar = findFriendsState.searchType;
        }
        return findFriendsState.copy(eVar, list2, z, i, list3, list4, z2, fVar);
    }

    public final C51039e component1() {
        return this.resType;
    }

    public final List<C51034a> component2() {
        return this.list;
    }

    public final boolean component3() {
        return this.hasMore;
    }

    public final int component4() {
        return this.cursor;
    }

    public final List<Integer> component5() {
        return this.channels;
    }

    public final List<Integer> component6() {
        return this.tailChannels;
    }

    public final boolean component7() {
        return this.canShowEmtpyTail;
    }

    public final C51041f component8() {
        return this.searchType;
    }

    public final FindFriendsState copy(C51039e eVar, List<C51034a> list2, boolean z, int i, List<Integer> list3, List<Integer> list4, boolean z2, C51041f fVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(list3, "");
        C89219l.m154721d(list4, "");
        C89219l.m154721d(fVar, "");
        return new FindFriendsState(eVar, list2, z, i, list3, list4, z2, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FindFriendsState)) {
            return false;
        }
        FindFriendsState findFriendsState = (FindFriendsState) obj;
        return C89219l.m154714a(this.resType, findFriendsState.resType) && C89219l.m154714a(this.list, findFriendsState.list) && this.hasMore == findFriendsState.hasMore && this.cursor == findFriendsState.cursor && C89219l.m154714a(this.channels, findFriendsState.channels) && C89219l.m154714a(this.tailChannels, findFriendsState.tailChannels) && this.canShowEmtpyTail == findFriendsState.canShowEmtpyTail && C89219l.m154714a(this.searchType, findFriendsState.searchType);
    }

    public final int hashCode() {
        C51039e eVar = this.resType;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        List<C51034a> list2 = this.list;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        boolean z = this.hasMore;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_find_viewmodel_FindFriendsState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode2 + i3) * 31) + m95419xce1a0a37(this.cursor)) * 31;
        List<Integer> list3 = this.channels;
        int hashCode3 = (com_ss_android_ugc_aweme_find_viewmodel_FindFriendsState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Integer> list4 = this.tailChannels;
        int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
        if (!this.canShowEmtpyTail) {
            i2 = 0;
        }
        int i6 = (hashCode4 + i2) * 31;
        C51041f fVar = this.searchType;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return i6 + i;
    }

    public final String toString() {
        return "FindFriendsState(resType=" + this.resType + ", list=" + this.list + ", hasMore=" + this.hasMore + ", cursor=" + this.cursor + ", channels=" + this.channels + ", tailChannels=" + this.tailChannels + ", canShowEmtpyTail=" + this.canShowEmtpyTail + ", searchType=" + this.searchType + ")";
    }

    public final boolean getCanShowEmtpyTail() {
        return this.canShowEmtpyTail;
    }

    public final List<Integer> getChannels() {
        return this.channels;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final List<C51034a> getList() {
        return this.list;
    }

    public final C51039e getResType() {
        return this.resType;
    }

    public final C51041f getSearchType() {
        return this.searchType;
    }

    public final List<Integer> getTailChannels() {
        return this.tailChannels;
    }

    public FindFriendsState(C51039e eVar, List<C51034a> list2, boolean z, int i, List<Integer> list3, List<Integer> list4, boolean z2, C51041f fVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(list3, "");
        C89219l.m154721d(list4, "");
        C89219l.m154721d(fVar, "");
        this.resType = eVar;
        this.list = list2;
        this.hasMore = z;
        this.cursor = i;
        this.channels = list3;
        this.tailChannels = list4;
        this.canShowEmtpyTail = z2;
        this.searchType = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FindFriendsState(C51039e eVar, List list2, boolean z, int i, List list3, List list4, boolean z2, C51041f fVar, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? new C51039e(0) : eVar, (i2 & 2) != 0 ? C89086z.INSTANCE : list2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? C89086z.INSTANCE : list3, (i2 & 32) != 0 ? C89086z.INSTANCE : list4, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? new C51041f(0) : fVar);
    }
}
