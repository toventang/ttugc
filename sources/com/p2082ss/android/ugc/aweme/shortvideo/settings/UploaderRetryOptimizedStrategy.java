package com.p2082ss.android.ugc.aweme.shortvideo.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.settings.UploaderRetryOptimizedStrategy */
public final class UploaderRetryOptimizedStrategy {
    @AbstractC27891c(mo46611a = "max_req_count")
    private final int maxRequestCount;
    @AbstractC27891c(mo46611a = "protect_timeout")
    private final int protectTimeout;
    @AbstractC27891c(mo46611a = "socket_connect_timeout")
    private final int socketConnectTimeout;
    @AbstractC27891c(mo46611a = "socket_read_timeout")
    private final int socketReadTimeout;
    @AbstractC27891c(mo46611a = "socket_write_timeout")
    private final int socketWriteTimeout;

    static {
        Covode.recordClassIndex(85516);
    }

    public UploaderRetryOptimizedStrategy() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_settings_UploaderRetryOptimizedStrategy_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m128606x835244cb(int i) {
        return i;
    }

    public static /* synthetic */ UploaderRetryOptimizedStrategy copy$default(UploaderRetryOptimizedStrategy uploaderRetryOptimizedStrategy, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = uploaderRetryOptimizedStrategy.maxRequestCount;
        }
        if ((i6 & 2) != 0) {
            i2 = uploaderRetryOptimizedStrategy.socketConnectTimeout;
        }
        if ((i6 & 4) != 0) {
            i3 = uploaderRetryOptimizedStrategy.socketReadTimeout;
        }
        if ((i6 & 8) != 0) {
            i4 = uploaderRetryOptimizedStrategy.socketWriteTimeout;
        }
        if ((i6 & 16) != 0) {
            i5 = uploaderRetryOptimizedStrategy.protectTimeout;
        }
        return uploaderRetryOptimizedStrategy.copy(i, i2, i3, i4, i5);
    }

    public final int component1() {
        return this.maxRequestCount;
    }

    public final int component2() {
        return this.socketConnectTimeout;
    }

    public final int component3() {
        return this.socketReadTimeout;
    }

    public final int component4() {
        return this.socketWriteTimeout;
    }

    public final int component5() {
        return this.protectTimeout;
    }

    public final UploaderRetryOptimizedStrategy copy(int i, int i2, int i3, int i4, int i5) {
        return new UploaderRetryOptimizedStrategy(i, i2, i3, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploaderRetryOptimizedStrategy)) {
            return false;
        }
        UploaderRetryOptimizedStrategy uploaderRetryOptimizedStrategy = (UploaderRetryOptimizedStrategy) obj;
        return this.maxRequestCount == uploaderRetryOptimizedStrategy.maxRequestCount && this.socketConnectTimeout == uploaderRetryOptimizedStrategy.socketConnectTimeout && this.socketReadTimeout == uploaderRetryOptimizedStrategy.socketReadTimeout && this.socketWriteTimeout == uploaderRetryOptimizedStrategy.socketWriteTimeout && this.protectTimeout == uploaderRetryOptimizedStrategy.protectTimeout;
    }

    public final int hashCode() {
        return (((((((m128606x835244cb(this.maxRequestCount) * 31) + m128606x835244cb(this.socketConnectTimeout)) * 31) + m128606x835244cb(this.socketReadTimeout)) * 31) + m128606x835244cb(this.socketWriteTimeout)) * 31) + m128606x835244cb(this.protectTimeout);
    }

    public final String toString() {
        return "UploaderRetryOptimizedStrategy(maxRequestCount=" + this.maxRequestCount + ", socketConnectTimeout=" + this.socketConnectTimeout + ", socketReadTimeout=" + this.socketReadTimeout + ", socketWriteTimeout=" + this.socketWriteTimeout + ", protectTimeout=" + this.protectTimeout + ")";
    }

    public final int getMaxRequestCount() {
        return this.maxRequestCount;
    }

    public final int getProtectTimeout() {
        return this.protectTimeout;
    }

    public final int getSocketConnectTimeout() {
        return this.socketConnectTimeout;
    }

    public final int getSocketReadTimeout() {
        return this.socketReadTimeout;
    }

    public final int getSocketWriteTimeout() {
        return this.socketWriteTimeout;
    }

    public UploaderRetryOptimizedStrategy(int i, int i2, int i3, int i4, int i5) {
        this.maxRequestCount = i;
        this.socketConnectTimeout = i2;
        this.socketReadTimeout = i3;
        this.socketWriteTimeout = i4;
        this.protectTimeout = i5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploaderRetryOptimizedStrategy(int i, int i2, int i3, int i4, int i5, int i6, C89214g gVar) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
