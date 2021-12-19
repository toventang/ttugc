package com.bytedance.android.livesdk.mvp;

import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;

public final class CheckCodeExtra extends Extra {
    @AbstractC27891c(mo46611a = "block_duration")
    private final long blockDuration;

    static {
        Covode.recordClassIndex(11467);
    }

    public CheckCodeExtra() {
        this(0, 1, null);
    }

    /* renamed from: com_bytedance_android_livesdk_mvp_CheckCodeExtra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m18240xa07926be(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ CheckCodeExtra copy$default(CheckCodeExtra checkCodeExtra, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = checkCodeExtra.blockDuration;
        }
        return checkCodeExtra.copy(j);
    }

    public final long component1() {
        return this.blockDuration;
    }

    public final CheckCodeExtra copy(long j) {
        return new CheckCodeExtra(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CheckCodeExtra) && this.blockDuration == ((CheckCodeExtra) obj).blockDuration;
        }
        return true;
    }

    public final int hashCode() {
        return m18240xa07926be(this.blockDuration);
    }

    public final String toString() {
        return "CheckCodeExtra(blockDuration=" + this.blockDuration + ")";
    }

    public final long getBlockDuration() {
        return this.blockDuration;
    }

    public CheckCodeExtra(long j) {
        this.blockDuration = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckCodeExtra(long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j);
    }
}
