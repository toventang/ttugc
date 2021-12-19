package com.p2082ss.android.ugc.aweme.services.story;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.services.story.StoryCoverExtractConfig */
public final class StoryCoverExtractConfig {
    private final int height;
    private final int timestamp;
    private final int width;

    static {
        Covode.recordClassIndex(79990);
    }

    public StoryCoverExtractConfig() {
        this(0, 0, 0, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_story_StoryCoverExtractConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120130x37f7ed45(int i) {
        return i;
    }

    public static /* synthetic */ StoryCoverExtractConfig copy$default(StoryCoverExtractConfig storyCoverExtractConfig, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = storyCoverExtractConfig.width;
        }
        if ((i4 & 2) != 0) {
            i2 = storyCoverExtractConfig.height;
        }
        if ((i4 & 4) != 0) {
            i3 = storyCoverExtractConfig.timestamp;
        }
        return storyCoverExtractConfig.copy(i, i2, i3);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final int component3() {
        return this.timestamp;
    }

    public final StoryCoverExtractConfig copy(int i, int i2, int i3) {
        return new StoryCoverExtractConfig(i, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryCoverExtractConfig)) {
            return false;
        }
        StoryCoverExtractConfig storyCoverExtractConfig = (StoryCoverExtractConfig) obj;
        return this.width == storyCoverExtractConfig.width && this.height == storyCoverExtractConfig.height && this.timestamp == storyCoverExtractConfig.timestamp;
    }

    public final int hashCode() {
        return (((m120130x37f7ed45(this.width) * 31) + m120130x37f7ed45(this.height)) * 31) + m120130x37f7ed45(this.timestamp);
    }

    public final String toString() {
        return "StoryCoverExtractConfig(width=" + this.width + ", height=" + this.height + ", timestamp=" + this.timestamp + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final int getWidth() {
        return this.width;
    }

    public StoryCoverExtractConfig(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.timestamp = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryCoverExtractConfig(int i, int i2, int i3, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? 0 : i3);
    }
}
