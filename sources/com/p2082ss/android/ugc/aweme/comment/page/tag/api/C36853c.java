package com.p2082ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.api.c */
public final class C36853c implements Serializable {
    @AbstractC27891c(mo46611a = "uid")

    /* renamed from: a */
    private long f86836a;
    @AbstractC27891c(mo46611a = "user_blocked_results")

    /* renamed from: b */
    private ArrayList<C36854d> f86837b;

    static {
        Covode.recordClassIndex(44191);
    }

    public C36853c() {
        this(0, null, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m74492x84a33b6(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.page.tag.api.c */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36853c copy$default(C36853c cVar, long j, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cVar.f86836a;
        }
        if ((i & 2) != 0) {
            arrayList = cVar.f86837b;
        }
        return cVar.copy(j, arrayList);
    }

    public final long component1() {
        return this.f86836a;
    }

    public final ArrayList<C36854d> component2() {
        return this.f86837b;
    }

    public final C36853c copy(long j, ArrayList<C36854d> arrayList) {
        return new C36853c(j, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36853c)) {
            return false;
        }
        C36853c cVar = (C36853c) obj;
        return this.f86836a == cVar.f86836a && C89219l.m154714a(this.f86837b, cVar.f86837b);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m74492x84a33b6(this.f86836a) * 31;
        ArrayList<C36854d> arrayList = this.f86837b;
        return com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        return "MentionCheckResult(uid=" + this.f86836a + ", tagUpdateStatus=" + this.f86837b + ")";
    }

    public final ArrayList<C36854d> getTagUpdateStatus() {
        return this.f86837b;
    }

    public final long getUid() {
        return this.f86836a;
    }

    public final void setTagUpdateStatus(ArrayList<C36854d> arrayList) {
        this.f86837b = arrayList;
    }

    public final void setUid(long j) {
        this.f86836a = j;
    }

    public C36853c(long j, ArrayList<C36854d> arrayList) {
        this.f86836a = j;
        this.f86837b = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36853c(long j, ArrayList arrayList, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : arrayList);
    }
}
