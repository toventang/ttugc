package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.story.model.a */
public final class C77378a extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "reaction_id")

    /* renamed from: a */
    private final long f173609a;
    @AbstractC27891c(mo46611a = "emoji_id")

    /* renamed from: b */
    private final int f173610b;

    static {
        Covode.recordClassIndex(90408);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_model_EmojiReaction_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m135306xbec2ab90(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_story_model_EmojiReaction_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m135307xbec2ab90(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C77378a copy$default(C77378a aVar, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = aVar.f173609a;
        }
        if ((i2 & 2) != 0) {
            i = aVar.f173610b;
        }
        return aVar.copy(j, i);
    }

    public final long component1() {
        return this.f173609a;
    }

    public final int component2() {
        return this.f173610b;
    }

    public final C77378a copy(long j, int i) {
        return new C77378a(j, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77378a)) {
            return false;
        }
        C77378a aVar = (C77378a) obj;
        return this.f173609a == aVar.f173609a && this.f173610b == aVar.f173610b;
    }

    public final int hashCode() {
        return (m135307xbec2ab90(this.f173609a) * 31) + m135306xbec2ab90(this.f173610b);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "EmojiReaction(reactionId=" + this.f173609a + ", emojiId=" + this.f173610b + ")";
    }

    public final int getEmojiId() {
        return this.f173610b;
    }

    public final long getReactionId() {
        return this.f173609a;
    }

    public C77378a(long j, int i) {
        this.f173609a = j;
        this.f173610b = i;
    }
}
