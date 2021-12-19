package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.story.model.e */
public final class C77382e implements Serializable {
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: a */
    private final long f173623a;

    static {
        Covode.recordClassIndex(90412);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_model_StoryArchStatistic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m135308xdc6181f4(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C77382e copy$default(C77382e eVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = eVar.f173623a;
        }
        return eVar.copy(j);
    }

    public final long component1() {
        return this.f173623a;
    }

    public final C77382e copy(long j) {
        return new C77382e(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C77382e) && this.f173623a == ((C77382e) obj).f173623a;
        }
        return true;
    }

    public final int hashCode() {
        return m135308xdc6181f4(this.f173623a);
    }

    public final String toString() {
        return "StoryArchStatistic(total=" + this.f173623a + ")";
    }

    public final long getTotal() {
        return this.f173623a;
    }

    public C77382e(long j) {
        this.f173623a = j;
    }
}
