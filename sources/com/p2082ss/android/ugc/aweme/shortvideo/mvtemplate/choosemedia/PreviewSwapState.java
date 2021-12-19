package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewSwapState */
public final class PreviewSwapState implements AbstractC20368af {
    private final Integer from;

    /* renamed from: to */
    private final Integer f161488to;
    private final long value;

    static {
        Covode.recordClassIndex(84714);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_mvtemplate_choosemedia_PreviewSwapState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m127185x69942c73(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ PreviewSwapState copy$default(PreviewSwapState previewSwapState, Integer num, Integer num2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            num = previewSwapState.from;
        }
        if ((i & 2) != 0) {
            num2 = previewSwapState.f161488to;
        }
        if ((i & 4) != 0) {
            j = previewSwapState.value;
        }
        return previewSwapState.copy(num, num2, j);
    }

    public final Integer component1() {
        return this.from;
    }

    public final Integer component2() {
        return this.f161488to;
    }

    public final long component3() {
        return this.value;
    }

    public final PreviewSwapState copy(Integer num, Integer num2, long j) {
        return new PreviewSwapState(num, num2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewSwapState)) {
            return false;
        }
        PreviewSwapState previewSwapState = (PreviewSwapState) obj;
        return C89219l.m154714a(this.from, previewSwapState.from) && C89219l.m154714a(this.f161488to, previewSwapState.f161488to) && this.value == previewSwapState.value;
    }

    public final int hashCode() {
        Integer num = this.from;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f161488to;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((hashCode + i) * 31) + m127185x69942c73(this.value);
    }

    public final String toString() {
        return "PreviewSwapState(from=" + this.from + ", to=" + this.f161488to + ", value=" + this.value + ")";
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final Integer getTo() {
        return this.f161488to;
    }

    public final long getValue() {
        return this.value;
    }

    public PreviewSwapState(Integer num, Integer num2, long j) {
        this.from = num;
        this.f161488to = num2;
        this.value = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreviewSwapState(Integer num, Integer num2, long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, j);
    }
}
