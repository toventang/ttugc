package com.p2082ss.android.ugc.aweme.notificationlive.p3537ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import java.util.HashMap;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState */
public final class NotificationChoiceState implements AbstractC20368af {
    private final String hotsoonText;
    private final boolean isHotsoonHasMore;
    private final boolean isSelf;
    private final ListState<Object, C51133f> listState;
    private final boolean pushSwitchState;
    private final String secUserId;
    private final HashMap<String, Integer> unreadCountMap;
    private final List<String> unreadUidList;
    private final String userId;
    private final int vcdCount;

    static {
        Covode.recordClassIndex(73389);
    }

    public NotificationChoiceState() {
        this(null, null, false, null, false, 0, null, false, null, null, 1023, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notificationlive_ui_NotificationChoiceState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m113013xa3942863(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationChoiceState copy$default(NotificationChoiceState notificationChoiceState, String str, String str2, boolean z, ListState listState2, boolean z2, int i, String str3, boolean z3, HashMap hashMap, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notificationChoiceState.userId;
        }
        if ((i2 & 2) != 0) {
            str2 = notificationChoiceState.secUserId;
        }
        if ((i2 & 4) != 0) {
            z = notificationChoiceState.isSelf;
        }
        if ((i2 & 8) != 0) {
            listState2 = notificationChoiceState.listState;
        }
        if ((i2 & 16) != 0) {
            z2 = notificationChoiceState.isHotsoonHasMore;
        }
        if ((i2 & 32) != 0) {
            i = notificationChoiceState.vcdCount;
        }
        if ((i2 & 64) != 0) {
            str3 = notificationChoiceState.hotsoonText;
        }
        if ((i2 & 128) != 0) {
            z3 = notificationChoiceState.pushSwitchState;
        }
        if ((i2 & 256) != 0) {
            hashMap = notificationChoiceState.unreadCountMap;
        }
        if ((i2 & 512) != 0) {
            list = notificationChoiceState.unreadUidList;
        }
        return notificationChoiceState.copy(str, str2, z, listState2, z2, i, str3, z3, hashMap, list);
    }

    public final String component1() {
        return this.userId;
    }

    public final List<String> component10() {
        return this.unreadUidList;
    }

    public final String component2() {
        return this.secUserId;
    }

    public final boolean component3() {
        return this.isSelf;
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

    public final boolean component8() {
        return this.pushSwitchState;
    }

    public final HashMap<String, Integer> component9() {
        return this.unreadCountMap;
    }

    public final NotificationChoiceState copy(String str, String str2, boolean z, ListState<Object, C51133f> listState2, boolean z2, int i, String str3, boolean z3, HashMap<String, Integer> hashMap, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(listState2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(list, "");
        return new NotificationChoiceState(str, str2, z, listState2, z2, i, str3, z3, hashMap, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationChoiceState)) {
            return false;
        }
        NotificationChoiceState notificationChoiceState = (NotificationChoiceState) obj;
        return C89219l.m154714a(this.userId, notificationChoiceState.userId) && C89219l.m154714a(this.secUserId, notificationChoiceState.secUserId) && this.isSelf == notificationChoiceState.isSelf && C89219l.m154714a(this.listState, notificationChoiceState.listState) && this.isHotsoonHasMore == notificationChoiceState.isHotsoonHasMore && this.vcdCount == notificationChoiceState.vcdCount && C89219l.m154714a(this.hotsoonText, notificationChoiceState.hotsoonText) && this.pushSwitchState == notificationChoiceState.pushSwitchState && C89219l.m154714a(this.unreadCountMap, notificationChoiceState.unreadCountMap) && C89219l.m154714a(this.unreadUidList, notificationChoiceState.unreadUidList);
    }

    public final int hashCode() {
        String str = this.userId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.secUserId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isSelf;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        ListState<Object, C51133f> listState2 = this.listState;
        int hashCode3 = (i6 + (listState2 != null ? listState2.hashCode() : 0)) * 31;
        boolean z2 = this.isHotsoonHasMore;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int com_ss_android_ugc_aweme_notificationlive_ui_NotificationChoiceState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode3 + i7) * 31) + m113013xa3942863(this.vcdCount)) * 31;
        String str3 = this.hotsoonText;
        int hashCode4 = (com_ss_android_ugc_aweme_notificationlive_ui_NotificationChoiceState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str3 != null ? str3.hashCode() : 0)) * 31;
        if (!this.pushSwitchState) {
            i2 = 0;
        }
        int i10 = (hashCode4 + i2) * 31;
        HashMap<String, Integer> hashMap = this.unreadCountMap;
        int hashCode5 = (i10 + (hashMap != null ? hashMap.hashCode() : 0)) * 31;
        List<String> list = this.unreadUidList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "NotificationChoiceState(userId=" + this.userId + ", secUserId=" + this.secUserId + ", isSelf=" + this.isSelf + ", listState=" + this.listState + ", isHotsoonHasMore=" + this.isHotsoonHasMore + ", vcdCount=" + this.vcdCount + ", hotsoonText=" + this.hotsoonText + ", pushSwitchState=" + this.pushSwitchState + ", unreadCountMap=" + this.unreadCountMap + ", unreadUidList=" + this.unreadUidList + ")";
    }

    public final String getHotsoonText() {
        return this.hotsoonText;
    }

    public final ListState<Object, C51133f> getListState() {
        return this.listState;
    }

    public final boolean getPushSwitchState() {
        return this.pushSwitchState;
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

    public final boolean isSelf() {
        return this.isSelf;
    }

    public NotificationChoiceState(String str, String str2, boolean z, ListState<Object, C51133f> listState2, boolean z2, int i, String str3, boolean z3, HashMap<String, Integer> hashMap, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(listState2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(hashMap, "");
        C89219l.m154721d(list, "");
        this.userId = str;
        this.secUserId = str2;
        this.isSelf = z;
        this.listState = listState2;
        this.isHotsoonHasMore = z2;
        this.vcdCount = i;
        this.hotsoonText = str3;
        this.pushSwitchState = z3;
        this.unreadCountMap = hashMap;
        this.unreadUidList = list;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NotificationChoiceState(java.lang.String r21, java.lang.String r22, boolean r23, com.bytedance.jedi.arch.ext.list.ListState r24, boolean r25, int r26, java.lang.String r27, boolean r28, java.util.HashMap r29, java.util.List r30, int r31, p4600h.p4611f.p4613b.C89214g r32) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.NotificationChoiceState.<init>(java.lang.String, java.lang.String, boolean, com.bytedance.jedi.arch.ext.list.ListState, boolean, int, java.lang.String, boolean, java.util.HashMap, java.util.List, int, h.f.b.g):void");
    }
}
