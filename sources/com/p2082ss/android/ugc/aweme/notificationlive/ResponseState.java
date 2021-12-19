package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ResponseState */
public final class ResponseState implements AbstractC20368af {
    private final C62562r cacheEvent;
    private final C62562r networkEvent;
    private final int pushState;
    private final int statusCode;

    static {
        Covode.recordClassIndex(73308);
    }

    public ResponseState() {
        this(0, 0, null, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_notificationlive_ResponseState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m112953x8caf4c17(int i) {
        return i;
    }

    public static /* synthetic */ ResponseState copy$default(ResponseState responseState, int i, int i2, C62562r rVar, C62562r rVar2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = responseState.pushState;
        }
        if ((i3 & 2) != 0) {
            i2 = responseState.statusCode;
        }
        if ((i3 & 4) != 0) {
            rVar = responseState.cacheEvent;
        }
        if ((i3 & 8) != 0) {
            rVar2 = responseState.networkEvent;
        }
        return responseState.copy(i, i2, rVar, rVar2);
    }

    public final int component1() {
        return this.pushState;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final C62562r component3() {
        return this.cacheEvent;
    }

    public final C62562r component4() {
        return this.networkEvent;
    }

    public final ResponseState copy(int i, int i2, C62562r rVar, C62562r rVar2) {
        return new ResponseState(i, i2, rVar, rVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseState)) {
            return false;
        }
        ResponseState responseState = (ResponseState) obj;
        return this.pushState == responseState.pushState && this.statusCode == responseState.statusCode && C89219l.m154714a(this.cacheEvent, responseState.cacheEvent) && C89219l.m154714a(this.networkEvent, responseState.networkEvent);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_notificationlive_ResponseState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m112953x8caf4c17(this.pushState) * 31) + m112953x8caf4c17(this.statusCode)) * 31;
        C62562r rVar = this.cacheEvent;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_notificationlive_ResponseState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C62562r rVar2 = this.networkEvent;
        if (rVar2 != null) {
            i = rVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ResponseState(pushState=" + this.pushState + ", statusCode=" + this.statusCode + ", cacheEvent=" + this.cacheEvent + ", networkEvent=" + this.networkEvent + ")";
    }

    public final C62562r getCacheEvent() {
        return this.cacheEvent;
    }

    public final C62562r getNetworkEvent() {
        return this.networkEvent;
    }

    public final int getPushState() {
        return this.pushState;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public ResponseState(int i, int i2, C62562r rVar, C62562r rVar2) {
        this.pushState = i;
        this.statusCode = i2;
        this.cacheEvent = rVar;
        this.networkEvent = rVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResponseState(int i, int i2, C62562r rVar, C62562r rVar2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? null : rVar, (i3 & 8) != 0 ? null : rVar2);
    }
}
