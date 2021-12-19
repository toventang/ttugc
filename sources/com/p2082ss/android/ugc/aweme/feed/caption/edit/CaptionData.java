package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.CaptionData */
public final class CaptionData implements Serializable {
    @AbstractC27891c(mo46611a = "end_time")
    private final int endTime;
    @AbstractC27891c(mo46611a = "gender")
    private final String gender;
    @AbstractC27891c(mo46611a = "start_time")
    private final int startTime;
    @AbstractC27891c(mo46611a = "text")
    private String text;

    static {
        Covode.recordClassIndex(58159);
    }

    public CaptionData() {
        this(0, 0, null, null, 15, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_caption_edit_CaptionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m92443x9dc80e16(int i) {
        return i;
    }

    public static /* synthetic */ CaptionData copy$default(CaptionData captionData, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = captionData.startTime;
        }
        if ((i3 & 2) != 0) {
            i2 = captionData.endTime;
        }
        if ((i3 & 4) != 0) {
            str = captionData.text;
        }
        if ((i3 & 8) != 0) {
            str2 = captionData.gender;
        }
        return captionData.copy(i, i2, str, str2);
    }

    public final int component1() {
        return this.startTime;
    }

    public final int component2() {
        return this.endTime;
    }

    public final String component3() {
        return this.text;
    }

    public final String component4() {
        return this.gender;
    }

    public final CaptionData copy(int i, int i2, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new CaptionData(i, i2, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionData)) {
            return false;
        }
        CaptionData captionData = (CaptionData) obj;
        return this.startTime == captionData.startTime && this.endTime == captionData.endTime && C89219l.m154714a(this.text, captionData.text) && C89219l.m154714a(this.gender, captionData.gender);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_feed_caption_edit_CaptionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((m92443x9dc80e16(this.startTime) * 31) + m92443x9dc80e16(this.endTime)) * 31;
        String str = this.text;
        int i = 0;
        int hashCode = (com_ss_android_ugc_aweme_feed_caption_edit_CaptionData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.gender;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CaptionData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", text=" + this.text + ", gender=" + this.gender + ")";
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getGender() {
        return this.gender;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        C89219l.m154721d(str, "");
        this.text = str;
    }

    public CaptionData(int i, int i2, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.startTime = i;
        this.endTime = i2;
        this.text = str;
        this.gender = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptionData(int i, int i2, String str, String str2, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "male" : str2);
    }
}
