package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.TtsInfos */
public final class TtsInfos implements Serializable {
    @AbstractC27891c(mo46611a = "lang")
    public String lang;
    @AbstractC27891c(mo46611a = "language_id")
    public Long languageId;
    @AbstractC27891c(mo46611a = "play_addr")
    public PlayAddress playAddress;
    @AbstractC27891c(mo46611a = "voice_type")
    public String voiceType;
    @AbstractC27891c(mo46611a = "volume_info")
    public String volumeInfo;

    static {
        Covode.recordClassIndex(58764);
    }

    public TtsInfos() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ TtsInfos copy$default(TtsInfos ttsInfos, String str, Long l, String str2, PlayAddress playAddress2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ttsInfos.lang;
        }
        if ((i & 2) != 0) {
            l = ttsInfos.languageId;
        }
        if ((i & 4) != 0) {
            str2 = ttsInfos.voiceType;
        }
        if ((i & 8) != 0) {
            playAddress2 = ttsInfos.playAddress;
        }
        if ((i & 16) != 0) {
            str3 = ttsInfos.volumeInfo;
        }
        return ttsInfos.copy(str, l, str2, playAddress2, str3);
    }

    public final String component1() {
        return this.lang;
    }

    public final Long component2() {
        return this.languageId;
    }

    public final String component3() {
        return this.voiceType;
    }

    public final PlayAddress component4() {
        return this.playAddress;
    }

    public final String component5() {
        return this.volumeInfo;
    }

    public final TtsInfos copy(String str, Long l, String str2, PlayAddress playAddress2, String str3) {
        return new TtsInfos(str, l, str2, playAddress2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TtsInfos)) {
            return false;
        }
        TtsInfos ttsInfos = (TtsInfos) obj;
        return C89219l.m154714a(this.lang, ttsInfos.lang) && C89219l.m154714a(this.languageId, ttsInfos.languageId) && C89219l.m154714a(this.voiceType, ttsInfos.voiceType) && C89219l.m154714a(this.playAddress, ttsInfos.playAddress) && C89219l.m154714a(this.volumeInfo, ttsInfos.volumeInfo);
    }

    public final int hashCode() {
        String str = this.lang;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.languageId;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.voiceType;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        PlayAddress playAddress2 = this.playAddress;
        int hashCode4 = (hashCode3 + (playAddress2 != null ? playAddress2.hashCode() : 0)) * 31;
        String str3 = this.volumeInfo;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "TtsInfos(lang=" + this.lang + ", languageId=" + this.languageId + ", voiceType=" + this.voiceType + ", playAddress=" + this.playAddress + ", volumeInfo=" + this.volumeInfo + ")";
    }

    public final String getLang() {
        return this.lang;
    }

    public final Long getLanguageId() {
        return this.languageId;
    }

    public final PlayAddress getPlayAddress() {
        return this.playAddress;
    }

    public final String getVoiceType() {
        return this.voiceType;
    }

    public final String getVolumeInfo() {
        return this.volumeInfo;
    }

    public TtsInfos(String str, Long l, String str2, PlayAddress playAddress2, String str3) {
        this.lang = str;
        this.languageId = l;
        this.voiceType = str2;
        this.playAddress = playAddress2;
        this.volumeInfo = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TtsInfos(String str, Long l, String str2, PlayAddress playAddress2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : playAddress2, (i & 16) == 0 ? str3 : null);
    }
}
