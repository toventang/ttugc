package com.p2082ss.android.ugc.aweme.upvote.p4189c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89064i;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.upvote.c.h */
public final class C79714h implements Serializable {
    @AbstractC27891c(mo46611a = "comment_id")

    /* renamed from: a */
    private final String f178856a;
    @AbstractC27891c(mo46611a = "text")

    /* renamed from: b */
    private String f178857b;
    @AbstractC27891c(mo46611a = "item_id")

    /* renamed from: c */
    private final String f178858c;
    @AbstractC27891c(mo46611a = "create_time")

    /* renamed from: d */
    private final long f178859d;
    @AbstractC27891c(mo46611a = "like_count")

    /* renamed from: e */
    private int f178860e;
    @AbstractC27891c(mo46611a = "status")

    /* renamed from: f */
    private final int f178861f;
    @AbstractC27891c(mo46611a = "user")

    /* renamed from: g */
    private final User f178862g;
    @AbstractC27891c(mo46611a = "user_liked")

    /* renamed from: h */
    private boolean f178863h;
    @AbstractC27891c(mo46611a = "upvote_label_type")

    /* renamed from: i */
    private final int f178864i;
    @AbstractC27891c(mo46611a = "is_author_liked")

    /* renamed from: j */
    private final boolean f178865j;
    @AbstractC27891c(mo46611a = "user_list")

    /* renamed from: k */
    private final List<User> f178866k;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: l */
    private final int f178867l;
    @AbstractC27891c(mo46611a = "bubble_hidden")

    /* renamed from: m */
    private final boolean f178868m;

    /* renamed from: n */
    private EnumC79710d f178869n;

    static {
        Covode.recordClassIndex(92935);
    }

    /* renamed from: com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m138539xba1a4f2b(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m138540xba1a4f2b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ C79714h copy$default(C79714h hVar, String str, String str2, String str3, long j, int i, int i2, User user, boolean z, int i3, boolean z2, List list, int i4, boolean z3, EnumC79710d dVar, int i5, Object obj) {
        String str4 = str;
        String str5 = str3;
        String str6 = str2;
        long j2 = j;
        int i6 = i;
        User user2 = user;
        int i7 = i2;
        int i8 = i3;
        boolean z4 = z;
        List list2 = list;
        boolean z5 = z2;
        boolean z6 = z3;
        int i9 = i4;
        EnumC79710d dVar2 = dVar;
        if ((i5 & 1) != 0) {
            str4 = hVar.f178856a;
        }
        if ((i5 & 2) != 0) {
            str6 = hVar.f178857b;
        }
        if ((i5 & 4) != 0) {
            str5 = hVar.f178858c;
        }
        if ((i5 & 8) != 0) {
            j2 = hVar.f178859d;
        }
        if ((i5 & 16) != 0) {
            i6 = hVar.f178860e;
        }
        if ((i5 & 32) != 0) {
            i7 = hVar.f178861f;
        }
        if ((i5 & 64) != 0) {
            user2 = hVar.f178862g;
        }
        if ((i5 & 128) != 0) {
            z4 = hVar.f178863h;
        }
        if ((i5 & 256) != 0) {
            i8 = hVar.f178864i;
        }
        if ((i5 & 512) != 0) {
            z5 = hVar.f178865j;
        }
        if ((i5 & 1024) != 0) {
            list2 = hVar.f178866k;
        }
        if ((i5 & 2048) != 0) {
            i9 = hVar.f178867l;
        }
        if ((i5 & 4096) != 0) {
            z6 = hVar.f178868m;
        }
        if ((i5 & 8192) != 0) {
            dVar2 = hVar.f178869n;
        }
        return hVar.copy(str4, str6, str5, j2, i6, i7, user2, z4, i8, z5, list2, i9, z6, dVar2);
    }

    public final String component1() {
        return this.f178856a;
    }

    public final boolean component10() {
        return this.f178865j;
    }

    public final List<User> component11() {
        return this.f178866k;
    }

    public final int component12() {
        return this.f178867l;
    }

    public final boolean component13() {
        return this.f178868m;
    }

    public final EnumC79710d component14() {
        return this.f178869n;
    }

    public final String component2() {
        return this.f178857b;
    }

    public final String component3() {
        return this.f178858c;
    }

    public final long component4() {
        return this.f178859d;
    }

    public final int component5() {
        return this.f178860e;
    }

    public final int component6() {
        return this.f178861f;
    }

    public final User component7() {
        return this.f178862g;
    }

    public final boolean component8() {
        return this.f178863h;
    }

    public final int component9() {
        return this.f178864i;
    }

    public final C79714h copy(String str, String str2, String str3, long j, int i, int i2, User user, boolean z, int i3, boolean z2, List<? extends User> list, int i4, boolean z3, EnumC79710d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(list, "");
        return new C79714h(str, str2, str3, j, i, i2, user, z, i3, z2, list, i4, z3, dVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79714h)) {
            return false;
        }
        C79714h hVar = (C79714h) obj;
        return C89219l.m154714a(this.f178856a, hVar.f178856a) && C89219l.m154714a(this.f178857b, hVar.f178857b) && C89219l.m154714a(this.f178858c, hVar.f178858c) && this.f178859d == hVar.f178859d && this.f178860e == hVar.f178860e && this.f178861f == hVar.f178861f && C89219l.m154714a(this.f178862g, hVar.f178862g) && this.f178863h == hVar.f178863h && this.f178864i == hVar.f178864i && this.f178865j == hVar.f178865j && C89219l.m154714a(this.f178866k, hVar.f178866k) && this.f178867l == hVar.f178867l && this.f178868m == hVar.f178868m && C89219l.m154714a(this.f178869n, hVar.f178869n);
    }

    public final int hashCode() {
        String str = this.f178856a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f178857b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f178858c;
        int hashCode3 = (((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + m138540xba1a4f2b(this.f178859d)) * 31) + m138539xba1a4f2b(this.f178860e)) * 31) + m138539xba1a4f2b(this.f178861f)) * 31;
        User user = this.f178862g;
        int hashCode4 = (hashCode3 + (user != null ? user.hashCode() : 0)) * 31;
        boolean z = this.f178863h;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = (((hashCode4 + i3) * 31) + m138539xba1a4f2b(this.f178864i)) * 31;
        boolean z2 = this.f178865j;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (com_ss_android_ugc_aweme_upvote_model_UpvoteStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i6) * 31;
        List<User> list = this.f178866k;
        int hashCode5 = (((i9 + (list != null ? list.hashCode() : 0)) * 31) + m138539xba1a4f2b(this.f178867l)) * 31;
        if (!this.f178868m) {
            i2 = 0;
        }
        int i10 = (hashCode5 + i2) * 31;
        EnumC79710d dVar = this.f178869n;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        return "UpvoteStruct(commentId=" + this.f178856a + ", text=" + this.f178857b + ", itemId=" + this.f178858c + ", createTime=" + this.f178859d + ", likeCount=" + this.f178860e + ", status=" + this.f178861f + ", user=" + this.f178862g + ", userLiked=" + this.f178863h + ", upvoteLabelType=" + this.f178864i + ", isAuthorLiked=" + this.f178865j + ", userList=" + this.f178866k + ", total=" + this.f178867l + ", bubbleHidden=" + this.f178868m + ", cacheState=" + this.f178869n + ")";
    }

    public final boolean getBubbleHidden() {
        return this.f178868m;
    }

    public final EnumC79710d getCacheState() {
        return this.f178869n;
    }

    public final String getCommentId() {
        return this.f178856a;
    }

    public final long getCreateTime() {
        return this.f178859d;
    }

    public final String getItemId() {
        return this.f178858c;
    }

    public final int getLikeCount() {
        return this.f178860e;
    }

    public final int getStatus() {
        return this.f178861f;
    }

    public final String getText() {
        return this.f178857b;
    }

    public final int getTotal() {
        return this.f178867l;
    }

    public final int getUpvoteLabelType() {
        return this.f178864i;
    }

    public final User getUser() {
        return this.f178862g;
    }

    public final boolean getUserLiked() {
        return this.f178863h;
    }

    public final List<User> getUserList() {
        return this.f178866k;
    }

    public final boolean isAuthorLiked() {
        return this.f178865j;
    }

    public final boolean isPublished() {
        if (this.f178869n == null) {
            return true;
        }
        return false;
    }

    public final boolean isFake() {
        return C89064i.m154489a(new EnumC79710d[]{EnumC79710d.PRE_PUBLISH, EnumC79710d.PUBLISH_FAILED}, this.f178869n);
    }

    public final boolean isOperationDisable() {
        return C89064i.m154489a(new EnumC79710d[]{EnumC79710d.PRE_PUBLISH, EnumC79710d.PRE_REMOVE}, this.f178869n);
    }

    public final void setCacheState(EnumC79710d dVar) {
        this.f178869n = dVar;
    }

    public final void setLikeCount(int i) {
        this.f178860e = i;
    }

    public final void setText(String str) {
        this.f178857b = str;
    }

    public final void setUserLiked(boolean z) {
        this.f178863h = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> */
    /* JADX WARN: Multi-variable type inference failed */
    public C79714h(String str, String str2, String str3, long j, int i, int i2, User user, boolean z, int i3, boolean z2, List<? extends User> list, int i4, boolean z3, EnumC79710d dVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(list, "");
        this.f178856a = str;
        this.f178857b = str2;
        this.f178858c = str3;
        this.f178859d = j;
        this.f178860e = i;
        this.f178861f = i2;
        this.f178862g = user;
        this.f178863h = z;
        this.f178864i = i3;
        this.f178865j = z2;
        this.f178866k = list;
        this.f178867l = i4;
        this.f178868m = z3;
        this.f178869n = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C79714h(String str, String str2, String str3, long j, int i, int i2, User user, boolean z, int i3, boolean z2, List list, int i4, boolean z3, EnumC79710d dVar, int i5, C89214g gVar) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? null : str2, str3, (i5 & 8) != 0 ? 0 : j, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? null : user, (i5 & 128) != 0 ? false : z, (i5 & 256) != 0 ? 0 : i3, (i5 & 512) != 0 ? false : z2, (i5 & 1024) != 0 ? C89086z.INSTANCE : list, (i5 & 2048) != 0 ? 0 : i4, (i5 & 4096) != 0 ? false : z3, (i5 & 8192) == 0 ? dVar : null);
    }
}
