package com.p2082ss.android.ugc.aweme.dependence.beauty.data;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.data.BeautifyTag */
public final class BeautifyTag {
    private final String tag;
    private final float value;

    static {
        Covode.recordClassIndex(48971);
    }

    public BeautifyTag() {
        this(null, 0.0f, 3, null);
    }

    public static /* synthetic */ BeautifyTag copy$default(BeautifyTag beautifyTag, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautifyTag.tag;
        }
        if ((i & 2) != 0) {
            f = beautifyTag.value;
        }
        return beautifyTag.copy(str, f);
    }

    public final String component1() {
        return this.tag;
    }

    public final float component2() {
        return this.value;
    }

    public final BeautifyTag copy(String str, float f) {
        C89219l.m154721d(str, "");
        return new BeautifyTag(str, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautifyTag)) {
            return false;
        }
        BeautifyTag beautifyTag = (BeautifyTag) obj;
        return C89219l.m154714a(this.tag, beautifyTag.tag) && Float.compare(this.value, beautifyTag.value) == 0;
    }

    public final int hashCode() {
        String str = this.tag;
        return ((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.value);
    }

    public final String toString() {
        return "BeautifyTag(tag=" + this.tag + ", value=" + this.value + ")";
    }

    public final String getTag() {
        return this.tag;
    }

    public final float getValue() {
        return this.value;
    }

    public BeautifyTag(String str, float f) {
        C89219l.m154721d(str, "");
        this.tag = str;
        this.value = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautifyTag(String str, float f, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f);
    }
}
