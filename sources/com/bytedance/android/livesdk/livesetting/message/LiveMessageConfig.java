package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

public final class LiveMessageConfig {
    @AbstractC27891c(mo46611a = "duplicate_size")
    private final int duplicateSize;
    @AbstractC27891c(mo46611a = "enhance_websocket")
    private final boolean enhanceWebsocket;

    static {
        Covode.recordClassIndex(10542);
    }

    public LiveMessageConfig() {
        this(0, false, 3, null);
    }

    /* renamed from: com_bytedance_android_livesdk_livesetting_message_LiveMessageConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m17594x2f21932f(int i) {
        return i;
    }

    public static /* synthetic */ LiveMessageConfig copy$default(LiveMessageConfig liveMessageConfig, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = liveMessageConfig.duplicateSize;
        }
        if ((i2 & 2) != 0) {
            z = liveMessageConfig.enhanceWebsocket;
        }
        return liveMessageConfig.copy(i, z);
    }

    public final int component1() {
        return this.duplicateSize;
    }

    public final boolean component2() {
        return this.enhanceWebsocket;
    }

    public final LiveMessageConfig copy(int i, boolean z) {
        return new LiveMessageConfig(i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveMessageConfig)) {
            return false;
        }
        LiveMessageConfig liveMessageConfig = (LiveMessageConfig) obj;
        return this.duplicateSize == liveMessageConfig.duplicateSize && this.enhanceWebsocket == liveMessageConfig.enhanceWebsocket;
    }

    public final int hashCode() {
        int com_bytedance_android_livesdk_livesetting_message_LiveMessageConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m17594x2f21932f(this.duplicateSize) * 31;
        boolean z = this.enhanceWebsocket;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return com_bytedance_android_livesdk_livesetting_message_LiveMessageConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i;
    }

    public final String toString() {
        return "LiveMessageConfig(duplicateSize=" + this.duplicateSize + ", enhanceWebsocket=" + this.enhanceWebsocket + ")";
    }

    public final int getDuplicateSize() {
        return this.duplicateSize;
    }

    public final boolean getEnhanceWebsocket() {
        return this.enhanceWebsocket;
    }

    public LiveMessageConfig(int i, boolean z) {
        this.duplicateSize = i;
        this.enhanceWebsocket = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveMessageConfig(int i, boolean z, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 512 : i, (i2 & 2) != 0 ? false : z);
    }
}
