package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.story.model.g */
public final class C77384g extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "play_vv")

    /* renamed from: a */
    private final long f173628a;

    static {
        Covode.recordClassIndex(90414);
    }

    public C77384g() {
        this(0, 1, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_model_StoryViewInfoResponse_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m135311x9044456a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C77384g copy$default(C77384g gVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gVar.f173628a;
        }
        return gVar.copy(j);
    }

    public final long component1() {
        return this.f173628a;
    }

    public final C77384g copy(long j) {
        return new C77384g(j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C77384g) && this.f173628a == ((C77384g) obj).f173628a;
        }
        return true;
    }

    public final int hashCode() {
        return m135311x9044456a(this.f173628a);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryViewInfoResponse(playVideoViewers=" + this.f173628a + ")";
    }

    public final long getPlayVideoViewers() {
        return this.f173628a;
    }

    public C77384g(long j) {
        this.f173628a = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C77384g(long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j);
    }
}
