package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ChallengeBillboard */
public final class ChallengeBillboard implements Serializable {
    private int rank;
    private String schema;
    private int version;

    static {
        Covode.recordClassIndex(50433);
    }

    public ChallengeBillboard() {
        this(0, 0, null, 7, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_discover_model_ChallengeBillboard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m84887x533ebaa9(int i) {
        return i;
    }

    public static /* synthetic */ ChallengeBillboard copy$default(ChallengeBillboard challengeBillboard, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = challengeBillboard.rank;
        }
        if ((i3 & 2) != 0) {
            i2 = challengeBillboard.version;
        }
        if ((i3 & 4) != 0) {
            str = challengeBillboard.schema;
        }
        return challengeBillboard.copy(i, i2, str);
    }

    public final int component1() {
        return this.rank;
    }

    public final int component2() {
        return this.version;
    }

    public final String component3() {
        return this.schema;
    }

    public final ChallengeBillboard copy(int i, int i2, String str) {
        C89219l.m154721d(str, "");
        return new ChallengeBillboard(i, i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeBillboard)) {
            return false;
        }
        ChallengeBillboard challengeBillboard = (ChallengeBillboard) obj;
        return this.rank == challengeBillboard.rank && this.version == challengeBillboard.version && C89219l.m154714a(this.schema, challengeBillboard.schema);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_discover_model_ChallengeBillboard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m84887x533ebaa9(this.rank) * 31) + m84887x533ebaa9(this.version)) * 31;
        String str = this.schema;
        return com_ss_android_ugc_aweme_discover_model_ChallengeBillboard_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ChallengeBillboard(rank=" + this.rank + ", version=" + this.version + ", schema=" + this.schema + ")";
    }

    public final int getRank() {
        return this.rank;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final void setVersion(int i) {
        this.version = i;
    }

    public final void setSchema(String str) {
        C89219l.m154721d(str, "");
        this.schema = str;
    }

    public ChallengeBillboard(int i, int i2, String str) {
        C89219l.m154721d(str, "");
        this.rank = i;
        this.version = i2;
        this.schema = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeBillboard(int i, int i2, String str, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str);
    }
}
