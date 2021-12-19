package com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState */
public final class FollowerRelationState implements AbstractC20368af {
    private final String hotsoonText;
    private final boolean isHotsoonHasMore;
    private final ListState<Object, C51133f> listState;
    private final List<Object> recommendList;
    private final String secUserId;
    private final HashMap<String, Integer> unreadCountMap;
    private final List<String> unreadUidList;
    private final String userId;
    private final int vcdCount;

    static {
        Covode.recordClassIndex(60569);
    }

    public FollowerRelationState() {
        this(null, null, null, null, false, 0, null, null, null, 511, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_following_ui_viewmodel_FollowerRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m95731x58f930ce(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowerRelationState copy$default(FollowerRelationState followerRelationState, String str, String str2, List list, ListState listState2, boolean z, int i, String str3, HashMap hashMap, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = followerRelationState.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = followerRelationState.secUserId;
        }
        if ((i2 & 4) != 0) {
            list = followerRelationState.recommendList;
        }
        if ((i2 & 8) != 0) {
            listState2 = followerRelationState.listState;
        }
        if ((i2 & 16) != 0) {
            z = followerRelationState.isHotsoonHasMore;
        }
        if ((i2 & 32) != 0) {
            i = followerRelationState.vcdCount;
        }
        if ((i2 & 64) != 0) {
            str3 = followerRelationState.hotsoonText;
        }
        if ((i2 & 128) != 0) {
            hashMap = followerRelationState.unreadCountMap;
        }
        if ((i2 & 256) != 0) {
            list2 = followerRelationState.unreadUidList;
        }
        return followerRelationState.copy(str, str2, list, listState2, z, i, str3, hashMap, list2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final List<Object> component3() {
        return this.recommendList;
    }

    public final ListState<Object, C51133f> component4() {
        return this.listState;
    }

    public final boolean component5() {
        return this.isHotsoonHasMore;
    }

    public final int component6() {
        return this.vcdCount;
    }

    public final String component7() {
        return this.hotsoonText;
    }

    public final HashMap<String, Integer> component8() {
        return this.unreadCountMap;
    }

    public final List<String> component9() {
        return this.unreadUidList;
    }

    public final FollowerRelationState copy(String str, String str2, List<? extends Object> list, ListState<Object, C51133f> listState2, boolean z, int i, String str3, HashMap<String, Integer> hashMap, List<String> list2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(listState2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(list2, "");
        return new FollowerRelationState(str, str2, list, listState2, z, i, str3, hashMap, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowerRelationState)) {
            return false;
        }
        FollowerRelationState followerRelationState = (FollowerRelationState) obj;
        return C89219l.m154714a(this.userId, followerRelationState.userId) && C89219l.m154714a(this.secUserId, followerRelationState.secUserId) && C89219l.m154714a(this.recommendList, followerRelationState.recommendList) && C89219l.m154714a(this.listState, followerRelationState.listState) && this.isHotsoonHasMore == followerRelationState.isHotsoonHasMore && this.vcdCount == followerRelationState.vcdCount && C89219l.m154714a(this.hotsoonText, followerRelationState.hotsoonText) && C89219l.m154714a(this.unreadCountMap, followerRelationState.unreadCountMap) && C89219l.m154714a(this.unreadUidList, followerRelationState.unreadUidList);
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Object> list = this.recommendList;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ListState<Object, C51133f> listState2 = this.listState;
        int hashCode4 = (hashCode3 + (listState2 != null ? listState2.hashCode() : 0)) * 31;
        boolean z = this.isHotsoonHasMore;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_following_ui_viewmodel_FollowerRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode4 + i2) * 31) + m95731x58f930ce(this.vcdCount)) * 31;
        String str3 = this.hotsoonText;
        int hashCode5 = (com_ss_android_ugc_aweme_following_ui_viewmodel_FollowerRelationState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        HashMap<String, Integer> hashMap = this.unreadCountMap;
        int hashCode6 = (hashCode5 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<String> list2 = this.unreadUidList;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        return "FollowerRelationState(userId=" + this.userId + ", secUserId=" + this.secUserId + ", recommendList=" + this.recommendList + ", listState=" + this.listState + ", isHotsoonHasMore=" + this.isHotsoonHasMore + ", vcdCount=" + this.vcdCount + ", hotsoonText=" + this.hotsoonText + ", unreadCountMap=" + this.unreadCountMap + ", unreadUidList=" + this.unreadUidList + ")";
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState<Object, C51133f> getListState() {
        return this.listState;
    }

    public final List<Object> getRecommendList() {
        return this.recommendList;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final HashMap<String, Integer> getUnreadCountMap() {
        return this.unreadCountMap;
    }

    public final List<String> getUnreadUidList() {
        return this.unreadUidList;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getVcdCount() {
        return this.vcdCount;
    }

    public final boolean isHotsoonHasMore() {
        return this.isHotsoonHasMore;
    }

    public FollowerRelationState(String str, String str2, List<? extends Object> list, ListState<Object, C51133f> listState2, boolean z, int i, String str3, HashMap<String, Integer> hashMap, List<String> list2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(listState2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(list2, "");
        this.userId = str;
        this.secUserId = str2;
        this.recommendList = list;
        this.listState = listState2;
        this.isHotsoonHasMore = z;
        this.vcdCount = i;
        this.hotsoonText = str3;
        this.unreadCountMap = hashMap;
        this.unreadUidList = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FollowerRelationState(java.lang.String r20, java.lang.String r21, java.util.List r22, com.bytedance.jedi.arch.ext.list.ListState r23, boolean r24, int r25, java.lang.String r26, java.util.HashMap r27, java.util.List r28, int r29, p4600h.p4611f.p4613b.C89214g r30) {
        /*
            r19 = this;
            r6 = r24
            r9 = r27
            r2 = r20
            r10 = r28
            r3 = r21
            r4 = r22
            r1 = r29
            r5 = r23
            r0 = r1 & 1
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0017
            r2 = r8
        L_0x0017:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x001c
            r3 = r8
        L_0x001c:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x0022
            h.a.z r4 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0022:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x003a
            com.bytedance.jedi.arch.ext.list.ListState r5 = new com.bytedance.jedi.arch.ext.list.ListState
            com.ss.android.ugc.aweme.following.repository.f r12 = new com.ss.android.ugc.aweme.following.repository.f
            r12.<init>()
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 30
            r18 = 0
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
        L_0x003a:
            r0 = r1 & 16
            r7 = 0
            if (r0 == 0) goto L_0x0040
            r6 = 0
        L_0x0040:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0060
        L_0x0044:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x005d
        L_0x0048:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0051
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L_0x0051:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0057
            h.a.z r10 = p4600h.p4601a.C89086z.INSTANCE
        L_0x0057:
            r1 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x005d:
            r8 = r26
            goto L_0x0048
        L_0x0060:
            r7 = r25
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationState.<init>(java.lang.String, java.lang.String, java.util.List, com.bytedance.jedi.arch.ext.list.ListState, boolean, int, java.lang.String, java.util.HashMap, java.util.List, int, h.f.b.g):void");
    }
}
