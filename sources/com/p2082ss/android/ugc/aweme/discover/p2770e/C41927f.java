package com.p2082ss.android.ugc.aweme.discover.p2770e;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.e.f */
public final class C41927f implements AbstractC81914b {

    /* renamed from: a */
    public final LiveRoomStruct f97802a;

    /* renamed from: b */
    public final ArrayList<LiveRoomStruct> f97803b;

    /* renamed from: c */
    public final long f97804c;

    /* renamed from: d */
    public final EnterRoomConfig f97805d;

    /* renamed from: e */
    public final Boolean f97806e;

    static {
        Covode.recordClassIndex(49853);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41927f)) {
            return false;
        }
        C41927f fVar = (C41927f) obj;
        return C89219l.m154714a(this.f97802a, fVar.f97802a) && C89219l.m154714a(this.f97803b, fVar.f97803b) && this.f97804c == fVar.f97804c && C89219l.m154714a(this.f97805d, fVar.f97805d) && C89219l.m154714a(this.f97806e, fVar.f97806e);
    }

    public final String toString() {
        return "EnterLiveRoomEvent(curRawData=" + this.f97802a + ", rawDataList=" + this.f97803b + ", startCursor=" + this.f97804c + ", config=" + this.f97805d + ", hasMore=" + this.f97806e + ")";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        LiveRoomStruct liveRoomStruct = this.f97802a;
        int i4 = 0;
        if (liveRoomStruct != null) {
            i = liveRoomStruct.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        ArrayList<LiveRoomStruct> arrayList = this.f97803b;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        } else {
            i2 = 0;
        }
        long j = this.f97804c;
        int i6 = (((i5 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        EnterRoomConfig enterRoomConfig = this.f97805d;
        if (enterRoomConfig != null) {
            i3 = enterRoomConfig.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        Boolean bool = this.f97806e;
        if (bool != null) {
            i4 = bool.hashCode();
        }
        return i7 + i4;
    }

    public C41927f(LiveRoomStruct liveRoomStruct, ArrayList<LiveRoomStruct> arrayList, long j, EnterRoomConfig enterRoomConfig, Boolean bool) {
        this.f97802a = liveRoomStruct;
        this.f97803b = arrayList;
        this.f97804c = j;
        this.f97805d = enterRoomConfig;
        this.f97806e = bool;
    }
}
