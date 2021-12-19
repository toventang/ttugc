package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.MixStatusStruct */
public final class MixStatusStruct implements Serializable {
    public static final Companion Companion = new Companion(null);
    @AbstractC27891c(mo46611a = "is_collected")
    public int isCollected;
    @AbstractC27891c(mo46611a = "status")
    public int status;
    @AbstractC27891c(mo46611a = "viewed_in_mix")
    public int viewedInMix;

    static {
        Covode.recordClassIndex(58727);
    }

    public MixStatusStruct() {
        this(0, 0, 0, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_MixStatusStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93182xdd18469b(int i) {
        return i;
    }

    public static /* synthetic */ MixStatusStruct copy$default(MixStatusStruct mixStatusStruct, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mixStatusStruct.status;
        }
        if ((i4 & 2) != 0) {
            i2 = mixStatusStruct.isCollected;
        }
        if ((i4 & 4) != 0) {
            i3 = mixStatusStruct.viewedInMix;
        }
        return mixStatusStruct.copy(i, i2, i3);
    }

    public final int component1() {
        return this.status;
    }

    public final int component2() {
        return this.isCollected;
    }

    public final int component3() {
        return this.viewedInMix;
    }

    public final MixStatusStruct copy(int i, int i2, int i3) {
        return new MixStatusStruct(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MixStatusStruct)) {
            return false;
        }
        MixStatusStruct mixStatusStruct = (MixStatusStruct) obj;
        return this.status == mixStatusStruct.status && this.isCollected == mixStatusStruct.isCollected && this.viewedInMix == mixStatusStruct.viewedInMix;
    }

    public final int hashCode() {
        return (((m93182xdd18469b(this.status) * 31) + m93182xdd18469b(this.isCollected)) * 31) + m93182xdd18469b(this.viewedInMix);
    }

    public final String toString() {
        return "MixStatusStruct(status=" + this.status + ", isCollected=" + this.isCollected + ", viewedInMix=" + this.viewedInMix + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.MixStatusStruct$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(58728);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getViewedInMix() {
        return this.viewedInMix;
    }

    public final int isCollected() {
        return this.isCollected;
    }

    public final void setCollected(int i) {
        this.isCollected = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setViewedInMix(int i) {
        this.viewedInMix = i;
    }

    public MixStatusStruct(int i, int i2, int i3) {
        this.status = i;
        this.isCollected = i2;
        this.viewedInMix = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MixStatusStruct(int i, int i2, int i3, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
