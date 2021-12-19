package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.CaptionLanguage */
public final class CaptionLanguage implements Serializable {
    @AbstractC27891c(mo46611a = "language_id")
    public long languageId;
    @AbstractC27891c(mo46611a = "lang")
    public String languageName;

    static {
        Covode.recordClassIndex(58662);
    }

    public CaptionLanguage() {
        this(null, 0, 3, null);
    }

    /* renamed from: com_ss_android_ugc_aweme_feed_model_CaptionLanguage_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m93173xf1a88a16(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static /* synthetic */ CaptionLanguage copy$default(CaptionLanguage captionLanguage, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captionLanguage.languageName;
        }
        if ((i & 2) != 0) {
            j = captionLanguage.languageId;
        }
        return captionLanguage.copy(str, j);
    }

    public final String component1() {
        return this.languageName;
    }

    public final long component2() {
        return this.languageId;
    }

    public final CaptionLanguage copy(String str, long j) {
        C89219l.m154721d(str, "");
        return new CaptionLanguage(str, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionLanguage)) {
            return false;
        }
        CaptionLanguage captionLanguage = (CaptionLanguage) obj;
        return C89219l.m154714a(this.languageName, captionLanguage.languageName) && this.languageId == captionLanguage.languageId;
    }

    public final int hashCode() {
        String str = this.languageName;
        return ((str != null ? str.hashCode() : 0) * 31) + m93173xf1a88a16(this.languageId);
    }

    public final String toString() {
        return "CaptionLanguage(languageName=" + this.languageName + ", languageId=" + this.languageId + ")";
    }

    public final long getLanguageId() {
        return this.languageId;
    }

    public final String getLanguageName() {
        return this.languageName;
    }

    public CaptionLanguage(String str, long j) {
        C89219l.m154721d(str, "");
        this.languageName = str;
        this.languageId = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CaptionLanguage(String str, long j, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : j);
    }
}
