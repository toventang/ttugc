package com.p2082ss.android.ugc.aweme.feed.model;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorLynxModel */
public final class AnchorLynxModel {
    public final Bundle bundle;
    public final String lynxSchema;

    static {
        Covode.recordClassIndex(58605);
    }

    public static /* synthetic */ AnchorLynxModel copy$default(AnchorLynxModel anchorLynxModel, String str, Bundle bundle2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anchorLynxModel.lynxSchema;
        }
        if ((i & 2) != 0) {
            bundle2 = anchorLynxModel.bundle;
        }
        return anchorLynxModel.copy(str, bundle2);
    }

    public final AnchorLynxModel copy(String str, Bundle bundle2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle2, "");
        return new AnchorLynxModel(str, bundle2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorLynxModel)) {
            return false;
        }
        AnchorLynxModel anchorLynxModel = (AnchorLynxModel) obj;
        return C89219l.m154714a(this.lynxSchema, anchorLynxModel.lynxSchema) && C89219l.m154714a(this.bundle, anchorLynxModel.bundle);
    }

    public final int hashCode() {
        String str = this.lynxSchema;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Bundle bundle2 = this.bundle;
        if (bundle2 != null) {
            i = bundle2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AnchorLynxModel(lynxSchema=" + this.lynxSchema + ", bundle=" + this.bundle + ")";
    }

    public AnchorLynxModel(String str, Bundle bundle2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bundle2, "");
        this.lynxSchema = str;
        this.bundle = bundle2;
    }
}
