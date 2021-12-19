package com.p2082ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.model.f */
public final class C77383f extends BaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: a */
    private int f173624a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    private boolean f173625b;
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: c */
    private long f173626c;
    @AbstractC27891c(mo46611a = "liked_list")

    /* renamed from: d */
    private List<User> f173627d;

    static {
        Covode.recordClassIndex(90413);
    }

    /* renamed from: com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m135309x78ec8494(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m135310x78ec8494(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.model.f */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C77383f copy$default(C77383f fVar, int i, boolean z, long j, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fVar.f173624a;
        }
        if ((i2 & 2) != 0) {
            z = fVar.f173625b;
        }
        if ((i2 & 4) != 0) {
            j = fVar.f173626c;
        }
        if ((i2 & 8) != 0) {
            list = fVar.f173627d;
        }
        return fVar.copy(i, z, j, list);
    }

    public final int component1() {
        return this.f173624a;
    }

    public final boolean component2() {
        return this.f173625b;
    }

    public final long component3() {
        return this.f173626c;
    }

    public final List<User> component4() {
        return this.f173627d;
    }

    public final C77383f copy(int i, boolean z, long j, List<User> list) {
        return new C77383f(i, z, j, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77383f)) {
            return false;
        }
        C77383f fVar = (C77383f) obj;
        return this.f173624a == fVar.f173624a && this.f173625b == fVar.f173625b && this.f173626c == fVar.f173626c && C89219l.m154714a(this.f173627d, fVar.f173627d);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m135309x78ec8494(this.f173624a) * 31;
        boolean z = this.f173625b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 = (((com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i) * 31) + m135310x78ec8494(this.f173626c)) * 31;
        List<User> list = this.f173627d;
        return com_ss_android_ugc_aweme_story_model_StoryLikedListModel_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "StoryLikedListModel(total=" + this.f173624a + ", hasMore=" + this.f173625b + ", cursor=" + this.f173626c + ", likedList=" + this.f173627d + ")";
    }

    public final long getCursor() {
        return this.f173626c;
    }

    public final boolean getHasMore() {
        return this.f173625b;
    }

    public final List<User> getLikedList() {
        return this.f173627d;
    }

    public final int getTotal() {
        return this.f173624a;
    }

    public final void setCursor(long j) {
        this.f173626c = j;
    }

    public final void setHasMore(boolean z) {
        this.f173625b = z;
    }

    public final void setLikedList(List<User> list) {
        this.f173627d = list;
    }

    public final void setTotal(int i) {
        this.f173624a = i;
    }

    public C77383f(int i, boolean z, long j, List<User> list) {
        this.f173624a = i;
        this.f173625b = z;
        this.f173626c = j;
        this.f173627d = list;
    }
}
