package com.p2082ss.android.ugc.aweme.sticker;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.StickerInfo */
public final class StickerInfo implements Serializable {
    public static final C75245a Companion = new C75245a((byte) 0);
    private static final long serialVersionUID = 1;
    @AbstractC27891c(mo46611a = "effect_intensity")
    private String effectIntensity;
    @AbstractC27891c(mo46611a = "grade_key")
    private String gradeKey;
    @AbstractC27891c(mo46611a = "is_default_prop")
    private String hasDefaultProp;
    @AbstractC27891c(mo46611a = "prop_impr_position")
    private String imprPosition;
    @AbstractC27891c(mo46611a = "is_audio_graph_output")
    private Boolean isAudioGraphOutput;
    @AbstractC27891c(mo46611a = "is_auto_use_prop")
    private Boolean isAutoUseProp;
    @AbstractC27891c(mo46611a = "is_game_type_sticker")
    private boolean isGameTypeSticker;
    @AbstractC27891c(mo46611a = "is_music_beat")
    private boolean isMusicBeatSticker;
    @AbstractC27891c(mo46611a = "is_original_sticker")
    private boolean isOriginalSticker;
    @AbstractC27891c(mo46611a = "is_text_type_sticker")
    private boolean isTextTypeSticker;
    @AbstractC27891c(mo46611a = "prop_parent_id")
    private String mParentStickerId;
    private boolean needFilter;
    @AbstractC27891c(mo46611a = "prop_source")
    private String propSource;
    @AbstractC27891c(mo46611a = "rec_id")
    private String recId;
    @AbstractC27891c(mo46611a = "prop_tab_order")
    private String tabOrder;
    @AbstractC27891c(mo46611a = "welfare_activity_id")
    private String welfareActivityId;

    static {
        Covode.recordClassIndex(88144);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.StickerInfo$a */
    public static final class C75245a {
        static {
            Covode.recordClassIndex(88145);
        }

        private C75245a() {
        }

        public /* synthetic */ C75245a(byte b) {
            this();
        }
    }

    public final String getEffectIntensity() {
        return this.effectIntensity;
    }

    public final String getHasDefaultProp() {
        return this.hasDefaultProp;
    }

    public final String getImprPosition() {
        return this.imprPosition;
    }

    public final String getMParentStickerId() {
        return this.mParentStickerId;
    }

    public final boolean getNeedFilter() {
        return this.needFilter;
    }

    public final String getPropSource() {
        return this.propSource;
    }

    public final String getRecId() {
        return this.recId;
    }

    public final String getTabOrder() {
        return this.tabOrder;
    }

    public final String getWelfareActivityId() {
        return this.welfareActivityId;
    }

    public final Boolean isAudioGraphOutput() {
        return this.isAudioGraphOutput;
    }

    public final Boolean isAutoUseProp() {
        return this.isAutoUseProp;
    }

    public final boolean isGameTypeSticker() {
        return this.isGameTypeSticker;
    }

    public final boolean isMusicBeatSticker() {
        return this.isMusicBeatSticker;
    }

    public final boolean isOriginalSticker() {
        return this.isOriginalSticker;
    }

    public final boolean isTextTypeSticker() {
        return this.isTextTypeSticker;
    }

    public final String getGradeKey() {
        String str = this.gradeKey;
        if (str == null || str.length() == 0) {
            return "";
        }
        return this.gradeKey;
    }

    public final boolean hasImprPosition() {
        String str = this.imprPosition;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public final boolean hasTabOrder() {
        String str = this.tabOrder;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public StickerInfo() {
        this.needFilter = true;
        this.recId = "0";
        this.effectIntensity = "";
        this.hasDefaultProp = "";
        this.isAutoUseProp = false;
        this.isAudioGraphOutput = false;
    }

    public final void setAudioGraphOutput(Boolean bool) {
        this.isAudioGraphOutput = bool;
    }

    public final void setAutoUseProp(Boolean bool) {
        this.isAutoUseProp = bool;
    }

    public final void setEffectIntensity(String str) {
        this.effectIntensity = str;
    }

    public final void setGameTypeSticker(boolean z) {
        this.isGameTypeSticker = z;
    }

    public final void setGradeKey(String str) {
        this.gradeKey = str;
    }

    public final void setHasDefaultProp(String str) {
        this.hasDefaultProp = str;
    }

    public final void setImprPosition(String str) {
        this.imprPosition = str;
    }

    public final void setMParentStickerId(String str) {
        this.mParentStickerId = str;
    }

    public final void setMusicBeatSticker(boolean z) {
        this.isMusicBeatSticker = z;
    }

    public final void setNeedFilter(boolean z) {
        this.needFilter = z;
    }

    public final void setOriginalSticker(boolean z) {
        this.isOriginalSticker = z;
    }

    public final void setPropSource(String str) {
        this.propSource = str;
    }

    public final void setTabOrder(String str) {
        this.tabOrder = str;
    }

    public final void setTextTypeSticker(boolean z) {
        this.isTextTypeSticker = z;
    }

    public final void setWelfareActivityId(String str) {
        this.welfareActivityId = str;
    }

    public final void setRecId(String str) {
        C89219l.m154721d(str, "");
        this.recId = str;
    }

    public StickerInfo(String str, String str2, String str3) {
        this();
        this.propSource = str;
        this.gradeKey = str2;
        this.recId = str3 == null ? "0" : str3;
    }
}
