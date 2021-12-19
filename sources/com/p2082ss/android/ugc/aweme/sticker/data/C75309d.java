package com.p2082ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.data.d */
public final class C75309d implements Serializable {
    @AbstractC27891c(mo46611a = "audio_uri")
    public String audioUri;
    @AbstractC27891c(mo46611a = "auto_captions")
    public List<C75307b> autoCaptions;
    @AbstractC27891c(mo46611a = "disable")
    public long disable;
    @AbstractC27891c(mo46611a = "location")
    public int location;
    @AbstractC27891c(mo46611a = "margin_bottom")
    public Integer marginBottom;
    @AbstractC27891c(mo46611a = "margin_start")
    public Integer marginStart;
    @AbstractC27891c(mo46611a = "margin_top")
    public Integer marginTop;
    @AbstractC27891c(mo46611a = "select_lang")
    public String selectLang;
    @AbstractC27891c(mo46611a = "task_id")
    public String taskId;
    @AbstractC27891c(mo46611a = "utterances")
    public List<C75313h> utterances;
    @AbstractC27891c(mo46611a = "video_width")
    public Integer videoWidth;

    static {
        Covode.recordClassIndex(88226);
    }

    public C75309d() {
    }

    /* renamed from: com_ss_android_ugc_aweme_sticker_data_CaptionStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m132114x477d9477(int i) {
        return i;
    }

    /* renamed from: com_ss_android_ugc_aweme_sticker_data_CaptionStruct_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m132115x477d9477(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.sticker.data.d */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C75309d copy$default(C75309d dVar, String str, List list, int i, List list2, String str2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dVar.audioUri;
        }
        if ((i2 & 2) != 0) {
            list = dVar.utterances;
        }
        if ((i2 & 4) != 0) {
            i = dVar.location;
        }
        if ((i2 & 8) != 0) {
            list2 = dVar.autoCaptions;
        }
        if ((i2 & 16) != 0) {
            str2 = dVar.selectLang;
        }
        if ((i2 & 32) != 0) {
            j = dVar.disable;
        }
        return dVar.copy(str, list, i, list2, str2, j);
    }

    public final String component1() {
        return this.audioUri;
    }

    public final List<C75313h> component2() {
        return this.utterances;
    }

    public final int component3() {
        return this.location;
    }

    public final List<C75307b> component4() {
        return this.autoCaptions;
    }

    public final String component5() {
        return this.selectLang;
    }

    public final long component6() {
        return this.disable;
    }

    public final C75309d copy(String str, List<C75313h> list, int i, List<C75307b> list2, String str2, long j) {
        return new C75309d(str, list, i, list2, str2, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75309d)) {
            return false;
        }
        C75309d dVar = (C75309d) obj;
        return C89219l.m154714a(this.audioUri, dVar.audioUri) && C89219l.m154714a(this.utterances, dVar.utterances) && this.location == dVar.location && C89219l.m154714a(this.autoCaptions, dVar.autoCaptions) && C89219l.m154714a(this.selectLang, dVar.selectLang) && this.disable == dVar.disable;
    }

    public final int hashCode() {
        String str = this.audioUri;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C75313h> list = this.utterances;
        int hashCode2 = (((hashCode + (list != null ? list.hashCode() : 0)) * 31) + m132114x477d9477(this.location)) * 31;
        List<C75307b> list2 = this.autoCaptions;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.selectLang;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode3 + i) * 31) + m132115x477d9477(this.disable);
    }

    public final String toString() {
        return "CaptionStruct(audioUri=" + this.audioUri + ", utterances=" + this.utterances + ", location=" + this.location + ", autoCaptions=" + this.autoCaptions + ", selectLang=" + this.selectLang + ", disable=" + this.disable + ")";
    }

    public final String getAudioUri() {
        return this.audioUri;
    }

    public final List<C75307b> getAutoCaptions() {
        return this.autoCaptions;
    }

    public final long getDisable() {
        return this.disable;
    }

    public final int getLocation() {
        return this.location;
    }

    public final Integer getMarginBottom() {
        return this.marginBottom;
    }

    public final Integer getMarginStart() {
        return this.marginStart;
    }

    public final Integer getMarginTop() {
        return this.marginTop;
    }

    public final String getSelectLang() {
        return this.selectLang;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final List<C75313h> getUtterances() {
        return this.utterances;
    }

    public final Integer getVideoWidth() {
        return this.videoWidth;
    }

    public final void setAudioUri(String str) {
        this.audioUri = str;
    }

    public final void setAutoCaptions(List<C75307b> list) {
        this.autoCaptions = list;
    }

    public final void setDisable(long j) {
        this.disable = j;
    }

    public final void setLocation(int i) {
        this.location = i;
    }

    public final void setMarginBottom(Integer num) {
        this.marginBottom = num;
    }

    public final void setMarginStart(Integer num) {
        this.marginStart = num;
    }

    public final void setMarginTop(Integer num) {
        this.marginTop = num;
    }

    public final void setSelectLang(String str) {
        this.selectLang = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }

    public final void setUtterances(List<C75313h> list) {
        this.utterances = list;
    }

    public final void setVideoWidth(Integer num) {
        this.videoWidth = num;
    }

    public C75309d(String str, List<C75313h> list, int i, List<C75307b> list2, String str2, long j) {
        this.audioUri = str;
        this.utterances = list;
        this.location = i;
        this.autoCaptions = list2;
        this.selectLang = str2;
        this.disable = j;
        this.taskId = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C75309d(String str, List list, int i, List list2, String str2, long j, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : str, list, (i2 & 4) != 0 ? EnumC75306a.LEFT_BOTTOM.getValue() : i, (i2 & 8) != 0 ? null : list2, (i2 & 16) == 0 ? str2 : null, (i2 & 32) != 0 ? 0 : j);
    }
}
