package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.model.d */
public final class C77381d extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "story_archive_detail")

    /* renamed from: a */
    private final C77380c f173622a;

    static {
        Covode.recordClassIndex(90411);
    }

    public static /* synthetic */ C77381d copy$default(C77381d dVar, C77380c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = dVar.f173622a;
        }
        return dVar.copy(cVar);
    }

    public final C77380c component1() {
        return this.f173622a;
    }

    public final C77381d copy(C77380c cVar) {
        return new C77381d(cVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C77381d) && C89219l.m154714a(this.f173622a, ((C77381d) obj).f173622a);
        }
        return true;
    }

    public final int hashCode() {
        C77380c cVar = this.f173622a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryArchDetailResponse(detail=" + this.f173622a + ")";
    }

    public final C77380c getDetail() {
        return this.f173622a;
    }

    public C77381d(C77380c cVar) {
        this.f173622a = cVar;
    }
}
