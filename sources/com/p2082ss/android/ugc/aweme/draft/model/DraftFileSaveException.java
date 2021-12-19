package com.p2082ss.android.ugc.aweme.draft.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.model.DraftFileSaveException */
public final class DraftFileSaveException {
    private final int errorCode;
    private final Throwable throwable;

    static {
        Covode.recordClassIndex(51411);
    }

    public DraftFileSaveException() {
        this(0, null, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_draft_model_DraftFileSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m86188x62841638(int i) {
        return i;
    }

    public static /* synthetic */ DraftFileSaveException copy$default(DraftFileSaveException draftFileSaveException, int i, Throwable th, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = draftFileSaveException.errorCode;
        }
        if ((i2 & 2) != 0) {
            th = draftFileSaveException.throwable;
        }
        return draftFileSaveException.copy(i, th);
    }

    public final int component1() {
        return this.errorCode;
    }

    public final Throwable component2() {
        return this.throwable;
    }

    public final DraftFileSaveException copy(int i, Throwable th) {
        return new DraftFileSaveException(i, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftFileSaveException)) {
            return false;
        }
        DraftFileSaveException draftFileSaveException = (DraftFileSaveException) obj;
        return this.errorCode == draftFileSaveException.errorCode && C89219l.m154714a(this.throwable, draftFileSaveException.throwable);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_draft_model_DraftFileSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = m86188x62841638(this.errorCode) * 31;
        Throwable th = this.throwable;
        return com_ss_android_ugc_aweme_draft_model_DraftFileSaveException_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "DraftFileSaveException(errorCode=" + this.errorCode + ", throwable=" + this.throwable + ")";
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isSuc() {
        if (this.errorCode == 0) {
            return true;
        }
        return false;
    }

    public DraftFileSaveException(int i, Throwable th) {
        this.errorCode = i;
        this.throwable = th;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DraftFileSaveException(int i, Throwable th, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : th);
    }
}
