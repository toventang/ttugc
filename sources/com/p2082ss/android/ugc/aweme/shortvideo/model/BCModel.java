package com.p2082ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.BCModel */
public final class BCModel {
    public final boolean shouldShowUsageCheck;

    static {
        Covode.recordClassIndex(84548);
    }

    public BCModel() {
        this(false, 1, null);
    }

    public static /* synthetic */ BCModel copy$default(BCModel bCModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bCModel.shouldShowUsageCheck;
        }
        return bCModel.copy(z);
    }

    public final BCModel copy(boolean z) {
        return new BCModel(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BCModel) && this.shouldShowUsageCheck == ((BCModel) obj).shouldShowUsageCheck;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.shouldShowUsageCheck;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "BCModel(shouldShowUsageCheck=" + this.shouldShowUsageCheck + ")";
    }

    public BCModel(boolean z) {
        this.shouldShowUsageCheck = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BCModel(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z);
    }
}
