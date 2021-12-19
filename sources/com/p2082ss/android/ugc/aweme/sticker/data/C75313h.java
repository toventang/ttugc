package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.h */
public final class C75313h implements Serializable {
    @AbstractC27891c(mo46611a = "end_time")
    public long endTime;
    @AbstractC27891c(mo46611a = "start_time")
    public long startTime;
    @AbstractC27891c(mo46611a = "text")
    public String text;

    static {
        Covode.recordClassIndex(88230);
    }

    /* renamed from: com_ss_android_ugc_aweme_sticker_data_Utterance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m132116x9033e88d(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public C75313h() {
        this.text = "";
    }

    public final int hashCode() {
        return (int) ((((this.startTime * 31) + ((long) m132116x9033e88d(this.endTime))) * 31) + ((long) this.text.hashCode()));
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        this.text = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C75313h(C75313h hVar) {
        this();
        C89219l.m154721d(hVar, "");
        this.startTime = hVar.startTime;
        this.endTime = hVar.endTime;
        this.text = hVar.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.data.Utterance");
        C75313h hVar = (C75313h) obj;
        if (this.startTime == hVar.startTime && this.endTime == hVar.endTime && !(!C89219l.m154714a((Object) this.text, (Object) hVar.text))) {
            return true;
        }
        return false;
    }

    public C75313h(long j, long j2) {
        this();
        this.startTime = j;
        this.endTime = j2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C75313h(long j, long j2, String str) {
        this();
        C89219l.m154721d(str, "");
        this.startTime = j;
        this.endTime = j2;
        this.text = str;
    }
}
