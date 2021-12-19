package com.p2082ss.android.ugc.aweme.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.settings.DislikeReason */
public final class DislikeReason {
    @AbstractC27891c(mo46611a = "id")

    /* renamed from: id */
    private String f153735id;
    @AbstractC27891c(mo46611a = "text")
    private String text;

    static {
        Covode.recordClassIndex(80989);
    }

    public DislikeReason() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DislikeReason copy$default(DislikeReason dislikeReason, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dislikeReason.f153735id;
        }
        if ((i & 2) != 0) {
            str2 = dislikeReason.text;
        }
        return dislikeReason.copy(str, str2);
    }

    public final String component1() {
        return this.f153735id;
    }

    public final String component2() {
        return this.text;
    }

    public final DislikeReason copy(String str, String str2) {
        return new DislikeReason(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DislikeReason)) {
            return false;
        }
        DislikeReason dislikeReason = (DislikeReason) obj;
        return C89219l.m154714a(this.f153735id, dislikeReason.f153735id) && C89219l.m154714a(this.text, dislikeReason.text);
    }

    public final int hashCode() {
        String str = this.f153735id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DislikeReason(id=" + this.f153735id + ", text=" + this.text + ")";
    }

    public final String getId() {
        return this.f153735id;
    }

    public final String getText() {
        return this.text;
    }

    public final void setId(String str) {
        this.f153735id = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public DislikeReason(String str, String str2) {
        this.f153735id = str;
        this.text = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DislikeReason(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
