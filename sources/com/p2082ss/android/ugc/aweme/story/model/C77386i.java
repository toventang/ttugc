package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.model.i */
public final class C77386i extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: a */
    private int f173631a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    private boolean f173632b;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: c */
    private long f173633c;
    @AbstractC27891c(mo46611a = "viewer_list")

    /* renamed from: d */
    private List<C77385h> f173634d;

    static {
        Covode.recordClassIndex(90416);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m135312x34d00613(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m135313x34d00613(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.i */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C77386i copy$default(C77386i iVar, int i, boolean z, long j, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = iVar.f173631a;
        }
        if ((i2 & 2) != 0) {
            z = iVar.f173632b;
        }
        if ((i2 & 4) != 0) {
            j = iVar.f173633c;
        }
        if ((i2 & 8) != 0) {
            list = iVar.f173634d;
        }
        return iVar.copy(i, z, j, list);
    }

    public final int component1() {
        return this.f173631a;
    }

    public final boolean component2() {
        return this.f173632b;
    }

    public final long component3() {
        return this.f173633c;
    }

    public final List<C77385h> component4() {
        return this.f173634d;
    }

    public final C77386i copy(int i, boolean z, long j, List<C77385h> list) {
        return new C77386i(i, z, j, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77386i)) {
            return false;
        }
        C77386i iVar = (C77386i) obj;
        return this.f173631a == iVar.f173631a && this.f173632b == iVar.f173632b && this.f173633c == iVar.f173633c && C89219l.m154714a(this.f173634d, iVar.f173634d);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m135312x34d00613(this.f173631a) * 31;
        boolean z = this.f173632b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i) * 31) + m135313x34d00613(this.f173633c)) * 31;
        List<C77385h> list = this.f173634d;
        return com_ss_android_ugc_aweme_story_model_StoryViewerListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryViewerListModel(total=" + this.f173631a + ", hasMore=" + this.f173632b + ", cursor=" + this.f173633c + ", viewerList=" + this.f173634d + ")";
    }

    public final long getCursor() {
        return this.f173633c;
    }

    public final boolean getHasMore() {
        return this.f173632b;
    }

    public final int getTotal() {
        return this.f173631a;
    }

    public final List<C77385h> getViewerList() {
        return this.f173634d;
    }

    public final void setCursor(long j) {
        this.f173633c = j;
    }

    public final void setHasMore(boolean z) {
        this.f173632b = z;
    }

    public final void setTotal(int i) {
        this.f173631a = i;
    }

    public final void setViewerList(List<C77385h> list) {
        this.f173634d = list;
    }

    public C77386i(int i, boolean z, long j, List<C77385h> list) {
        this.f173631a = i;
        this.f173632b = z;
        this.f173633c = j;
        this.f173634d = list;
    }
}
