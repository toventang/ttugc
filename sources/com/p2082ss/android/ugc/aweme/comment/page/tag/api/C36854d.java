package com.p2082ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.api.d */
public final class C36854d implements Serializable {
    @AbstractC27891c(mo46611a = "mention_type")

    /* renamed from: a */
    private int f86838a;
    @AbstractC27891c(mo46611a = "block_type")

    /* renamed from: b */
    private int f86839b;

    static {
        Covode.recordClassIndex(44192);
    }

    public C36854d() {
        this(0, 0, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckSingleTypeResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m74493x57c2b6b8(int i) {
        return i;
    }

    public static /* synthetic */ C36854d copy$default(C36854d dVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dVar.f86838a;
        }
        if ((i3 & 2) != 0) {
            i2 = dVar.f86839b;
        }
        return dVar.copy(i, i2);
    }

    public final int component1() {
        return this.f86838a;
    }

    public final int component2() {
        return this.f86839b;
    }

    public final C36854d copy(int i, int i2) {
        return new C36854d(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36854d)) {
            return false;
        }
        C36854d dVar = (C36854d) obj;
        return this.f86838a == dVar.f86838a && this.f86839b == dVar.f86839b;
    }

    public final int hashCode() {
        return (m74493x57c2b6b8(this.f86838a) * 31) + m74493x57c2b6b8(this.f86839b);
    }

    public final String toString() {
        return "MentionCheckSingleTypeResult(mentionType=" + this.f86838a + ", blockType=" + this.f86839b + ")";
    }

    public final int getBlockType() {
        return this.f86839b;
    }

    public final int getMentionType() {
        return this.f86838a;
    }

    public final void setBlockType(int i) {
        this.f86839b = i;
    }

    public final void setMentionType(int i) {
        this.f86838a = i;
    }

    public C36854d(int i, int i2) {
        this.f86838a = i;
        this.f86839b = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C36854d(int i, int i2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
