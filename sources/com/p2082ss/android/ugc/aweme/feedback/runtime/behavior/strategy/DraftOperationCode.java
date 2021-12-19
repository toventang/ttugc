package com.p2082ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.DraftOperationCode */
public final class DraftOperationCode {
    @AbstractC27891c(mo46611a = "code")
    private final String code;

    static {
        Covode.recordClassIndex(59737);
    }

    public DraftOperationCode() {
        this(null, 1, null);
    }

    public static /* synthetic */ DraftOperationCode copy$default(DraftOperationCode draftOperationCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftOperationCode.code;
        }
        return draftOperationCode.copy(str);
    }

    public final String component1() {
        return this.code;
    }

    public final DraftOperationCode copy(String str) {
        C89219l.m154721d(str, "");
        return new DraftOperationCode(str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof DraftOperationCode) && C89219l.m154714a(this.code, ((DraftOperationCode) obj).code);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.code;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DraftOperationCode(code=" + this.code + ")";
    }

    public final String getCode() {
        return this.code;
    }

    public DraftOperationCode(String str) {
        C89219l.m154721d(str, "");
        this.code = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftOperationCode(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str);
    }
}
