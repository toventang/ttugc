package com.p2082ss.android.ugc.aweme.editSticker.text.bean;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.sticker.data.AbstractC75310e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData */
public final class TextStickerData implements Parcelable, AbstractC75310e, Cloneable {
    public static final Parcelable.Creator<TextStickerData> CREATOR = new C46069a();
    @AbstractC27891c(mo46611a = "align")
    private int align;
    @AbstractC27891c(mo46611a = "audio_path_list")
    private List<String> audioPathList;
    @AbstractC27891c(mo46611a = "old_text")
    private String audioText;
    @AbstractC27891c(mo46611a = "audio_track_duration")
    private int audioTrackDuration;
    @AbstractC27891c(mo46611a = "audio_track_file_path")
    private String audioTrackFilePath;
    @AbstractC27891c(mo46611a = "audio_track_index")
    private int audioTrackIndex;
    private boolean autoSelect;
    @AbstractC27891c(mo46611a = "bg_mode")
    private int bgMode;
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    private int color;
    @AbstractC27891c(mo46611a = "cover_extra_data")
    private TextStickerCoverExtraData coverExtraData;
    @AbstractC27891c(mo46611a = "edit_center_point")
    private Point editCenterPoint;
    @AbstractC27891c(mo46611a = "effect_text_layout_config")
    private InnerEffectTextLayoutConfig effectTextLayoutConfig;
    @AbstractC27891c(mo46611a = "mEndTime")
    private int endTime;
    private int fontSize;
    @AbstractC27891c(mo46611a = "font_type")
    private String fontType;
    @AbstractC27891c(mo46611a = "has_read_text_audio")
    private boolean hasReadTextAudio;
    @AbstractC27891c(mo46611a = "is_guidance_sticker")
    private boolean isGuidanceSticker;
    @AbstractC27891c(mo46611a = "r")
    private float rotation;
    @AbstractC27891c(mo46611a = "s")
    private float scale;
    @AbstractC27891c(mo46611a = "speaker_id")
    private String speakerID;
    @AbstractC27891c(mo46611a = "mStartTime")
    private int startTime;
    @AbstractC27891c(mo46611a = "text_str")
    private String textStr;
    @AbstractC27891c(mo46611a = "text_str_ary")
    private String[] textStrAry;
    @AbstractC27891c(mo46611a = "text_str_wrap")
    private TextStickerTextWrap textWrap;
    @AbstractC27891c(mo46611a = "text_str_wrap_list")
    private List<TextStickerTextWrap> textWrapList;
    @AbstractC27891c(mo46611a = "mUIEndTime")
    private int uiEndTime;
    @AbstractC27891c(mo46611a = "mUIStartTime")
    private int uiStartTime;

    /* renamed from: x */
    private float f107308x;

    /* renamed from: y */
    private float f107309y;

    static {
        Covode.recordClassIndex(54621);
    }

    public TextStickerData() {
        this(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870911, null);
    }

    public TextStickerData(String str) {
        this(str, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870910, null);
    }

    public TextStickerData(String str, int i) {
        this(str, i, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870908, null);
    }

    public TextStickerData(String str, int i, int i2) {
        this(str, i, i2, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870904, null);
    }

    public TextStickerData(String str, int i, int i2, int i3) {
        this(str, i, i2, i3, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870896, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2) {
        this(str, i, i2, i3, str2, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870880, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point) {
        this(str, i, i2, i3, str2, point, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870848, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4) {
        this(str, i, i2, i3, str2, point, i4, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870784, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5) {
        this(str, i, i2, i3, str2, point, i4, i5, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870656, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870400, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536869888, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536868864, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536866816, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536862720, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536854528, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536838144, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536805376, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, null, null, 0, null, null, 0, null, null, null, null, null, false, 536739840, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, null, 0, null, null, 0, null, null, null, null, null, false, 536608768, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, 0, null, null, 0, null, null, null, null, null, false, 536346624, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, null, null, 0, null, null, null, null, null, false, 535822336, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, str5, null, 0, null, null, null, null, null, false, 534773760, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5, List<String> list) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, str5, list, 0, null, null, null, null, null, false, 532676608, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5, List<String> list, int i10) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, str5, list, i10, null, null, null, null, null, false, 528482304, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5, List<String> list, int i10, String[] strArr) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, str5, list, i10, strArr, null, null, null, null, false, 520093696, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, str5, list, i10, strArr, textStickerTextWrap, null, null, null, false, 503316480, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, str5, list, i10, strArr, textStickerTextWrap, list2, null, null, false, 469762048, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, str5, list, i10, strArr, textStickerTextWrap, list2, innerEffectTextLayoutConfig, null, false, 402653184, null);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData) {
        this(str, i, i2, i3, str2, point, i4, i5, i6, i7, f, f2, f3, f4, z, z2, i8, str3, str4, i9, str5, list, i10, strArr, textStickerTextWrap, list2, innerEffectTextLayoutConfig, textStickerCoverExtraData, false, 268435456, null);
    }

    private static /* synthetic */ void getTextStrAry$annotations() {
    }

    private static /* synthetic */ void getTextWrap$annotations() {
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.textStr);
        parcel.writeInt(this.bgMode);
        parcel.writeInt(this.color);
        parcel.writeInt(this.align);
        parcel.writeString(this.fontType);
        parcel.writeParcelable(this.editCenterPoint, i);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeInt(this.uiStartTime);
        parcel.writeInt(this.uiEndTime);
        parcel.writeFloat(this.f107308x);
        parcel.writeFloat(this.f107309y);
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.scale);
        parcel.writeInt(this.autoSelect ? 1 : 0);
        parcel.writeInt(this.hasReadTextAudio ? 1 : 0);
        parcel.writeInt(this.audioTrackIndex);
        parcel.writeString(this.audioTrackFilePath);
        parcel.writeString(this.speakerID);
        parcel.writeInt(this.audioTrackDuration);
        parcel.writeString(this.audioText);
        parcel.writeStringList(this.audioPathList);
        parcel.writeInt(this.fontSize);
        parcel.writeStringArray(this.textStrAry);
        this.textWrap.writeToParcel(parcel, 0);
        List<TextStickerTextWrap> list = this.textWrapList;
        parcel.writeInt(list.size());
        for (TextStickerTextWrap textStickerTextWrap : list) {
            textStickerTextWrap.writeToParcel(parcel, 0);
        }
        InnerEffectTextLayoutConfig innerEffectTextLayoutConfig = this.effectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            parcel.writeInt(1);
            innerEffectTextLayoutConfig.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        this.coverExtraData.writeToParcel(parcel, 0);
        parcel.writeInt(this.isGuidanceSticker ? 1 : 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData$b */
    public static final class C46070b {

        /* renamed from: a */
        public static final C46070b f107310a = new C46070b();

        private C46070b() {
        }

        static {
            Covode.recordClassIndex(54623);
        }

        /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData$b$b */
        public static final class C46072b extends AbstractC89220m implements AbstractC89172b<List<? extends TextStickerTextWrap>, String> {

            /* renamed from: a */
            public static final C46072b f107312a = new C46072b();

            static {
                Covode.recordClassIndex(54625);
            }

            C46072b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ String invoke(List<? extends TextStickerTextWrap> list) {
                return m88932a(list);
            }

            /* renamed from: a */
            public static String m88932a(List<TextStickerTextWrap> list) {
                if (list == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder("");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    sb.append(it.next().getText());
                }
                String sb2 = sb.toString();
                C89219l.m154716b(sb2, "");
                return sb2;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData$b$a */
        public static final class C46071a extends AbstractC89220m implements AbstractC89183m<Float, Float, Boolean> {

            /* renamed from: a */
            public static final C46071a f107311a = new C46071a();

            static {
                Covode.recordClassIndex(54624);
            }

            C46071a() {
                super(2);
            }

            /* renamed from: a */
            public static boolean m88931a(float f, float f2) {
                if (Math.abs(f2 - f) <= 5.0f) {
                    return true;
                }
                return false;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ Boolean invoke(Float f, Float f2) {
                return Boolean.valueOf(m88931a(f.floatValue(), f2.floatValue()));
            }
        }
    }

    public final int getAlign() {
        return this.align;
    }

    public final List<String> getAudioPathList() {
        return this.audioPathList;
    }

    public final String getAudioText() {
        return this.audioText;
    }

    public final int getAudioTrackDuration() {
        return this.audioTrackDuration;
    }

    public final String getAudioTrackFilePath() {
        return this.audioTrackFilePath;
    }

    public final int getAudioTrackIndex() {
        return this.audioTrackIndex;
    }

    public final boolean getAutoSelect() {
        return this.autoSelect;
    }

    public final int getBgMode() {
        return this.bgMode;
    }

    public final int getColor() {
        return this.color;
    }

    public final TextStickerCoverExtraData getCoverExtraData() {
        return this.coverExtraData;
    }

    public final Point getEditCenterPoint() {
        return this.editCenterPoint;
    }

    public final InnerEffectTextLayoutConfig getEffectTextLayoutConfig() {
        return this.effectTextLayoutConfig;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final String getFontType() {
        return this.fontType;
    }

    public final boolean getHasReadTextAudio() {
        return this.hasReadTextAudio;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScale() {
        return this.scale;
    }

    public final String getSpeakerID() {
        return this.speakerID;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final String getTextStr() {
        return this.textStr;
    }

    public final List<TextStickerTextWrap> getTextWrapList() {
        return this.textWrapList;
    }

    public final int getUiEndTime() {
        return this.uiEndTime;
    }

    public final int getUiStartTime() {
        return this.uiStartTime;
    }

    public final float getX() {
        return this.f107308x;
    }

    public final float getY() {
        return this.f107309y;
    }

    public final boolean isGuidanceSticker() {
        return this.isGuidanceSticker;
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2, Point point, int i4, int i5, int i6, int i7, float f, float f2, float f3, float f4, boolean z, boolean z2, int i8, String str3, String str4, int i9, String str5, List<String> list, int i10, String[] strArr, TextStickerTextWrap textStickerTextWrap, List<TextStickerTextWrap> list2, InnerEffectTextLayoutConfig innerEffectTextLayoutConfig, TextStickerCoverExtraData textStickerCoverExtraData, boolean z3) {
        C89219l.m154721d(point, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(textStickerTextWrap, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(textStickerCoverExtraData, "");
        this.textStr = str;
        this.bgMode = i;
        this.color = i2;
        this.align = i3;
        this.fontType = str2;
        this.editCenterPoint = point;
        this.startTime = i4;
        this.endTime = i5;
        this.uiStartTime = i6;
        this.uiEndTime = i7;
        this.f107308x = f;
        this.f107309y = f2;
        this.rotation = f3;
        this.scale = f4;
        this.autoSelect = z;
        this.hasReadTextAudio = z2;
        this.audioTrackIndex = i8;
        this.audioTrackFilePath = str3;
        this.speakerID = str4;
        this.audioTrackDuration = i9;
        this.audioText = str5;
        this.audioPathList = list;
        this.fontSize = i10;
        this.textStrAry = strArr;
        this.textWrap = textStickerTextWrap;
        this.textWrapList = list2;
        this.effectTextLayoutConfig = innerEffectTextLayoutConfig;
        this.coverExtraData = textStickerCoverExtraData;
        this.isGuidanceSticker = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextStickerData(java.lang.String r37, int r38, int r39, int r40, java.lang.String r41, android.graphics.Point r42, int r43, int r44, int r45, int r46, float r47, float r48, float r49, float r50, boolean r51, boolean r52, int r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.util.List r58, int r59, java.lang.String[] r60, com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap r61, java.util.List r62, com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig r63, com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData r64, boolean r65, int r66, p4600h.p4611f.p4613b.C89214g r67) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData.<init>(java.lang.String, int, int, int, java.lang.String, android.graphics.Point, int, int, int, int, float, float, float, float, boolean, boolean, int, java.lang.String, java.lang.String, int, java.lang.String, java.util.List, int, java.lang.String[], com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap, java.util.List, com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig, com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerCoverExtraData, boolean, int, h.f.b.g):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData$a */
    public static class C46069a implements Parcelable.Creator<TextStickerData> {
        static {
            Covode.recordClassIndex(54622);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TextStickerData[] newArray(int i) {
            return new TextStickerData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TextStickerData createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            Point point = (Point) parcel.readParcelable(TextStickerData.class.getClassLoader());
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt8 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt9 = parcel.readInt();
            String readString5 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt10 = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            TextStickerTextWrap createFromParcel = TextStickerTextWrap.CREATOR.createFromParcel(parcel);
            int readInt11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt11);
            while (readInt11 != 0) {
                arrayList.add(TextStickerTextWrap.CREATOR.createFromParcel(parcel));
                readInt11--;
            }
            return new TextStickerData(readString, readInt, readInt2, readInt3, readString2, point, readInt4, readInt5, readInt6, readInt7, readFloat, readFloat2, readFloat3, readFloat4, z, z2, readInt8, readString3, readString4, readInt9, readString5, createStringArrayList, readInt10, createStringArray, createFromParcel, arrayList, parcel.readInt() != 0 ? InnerEffectTextLayoutConfig.CREATOR.createFromParcel(parcel) : null, TextStickerCoverExtraData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }
    }

    public final boolean hasTimeData() {
        if (this.endTime != 0) {
            return true;
        }
        return false;
    }

    public final boolean hasPositionData() {
        if (this.scale != 0.0f) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public final TextStickerData clone() {
        try {
            Object clone = super.clone();
            if (clone != null) {
                return (TextStickerData) clone;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, false, false, 0, null, null, 0, null, null, 0, null, null, null, null, null, false, 536870911, null);
        }
    }

    public final String toString() {
        return "textStr: " + this.textStr + ", bgMode: " + this.bgMode + ", color: " + this.color + ", align: " + this.align + ", fontType: " + this.fontType + ", centerPoint: " + this.editCenterPoint + ", fontSize: " + this.fontSize + ", position: (" + this.f107308x + ", " + this.f107309y + "), scale: " + this.scale;
    }

    public final void setAlign(int i) {
        this.align = i;
    }

    public final void setAudioText(String str) {
        this.audioText = str;
    }

    public final void setAudioTrackDuration(int i) {
        this.audioTrackDuration = i;
    }

    public final void setAudioTrackFilePath(String str) {
        this.audioTrackFilePath = str;
    }

    public final void setAudioTrackIndex(int i) {
        this.audioTrackIndex = i;
    }

    public final void setAutoSelect(boolean z) {
        this.autoSelect = z;
    }

    public final void setBgMode(int i) {
        this.bgMode = i;
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setEffectTextLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.effectTextLayoutConfig = innerEffectTextLayoutConfig;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setFontSize(int i) {
        this.fontSize = i;
    }

    public final void setFontType(String str) {
        this.fontType = str;
    }

    public final void setGuidanceSticker(boolean z) {
        this.isGuidanceSticker = z;
    }

    public final void setHasReadTextAudio(boolean z) {
        this.hasReadTextAudio = z;
    }

    public final void setRotation(float f) {
        this.rotation = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setSpeakerID(String str) {
        this.speakerID = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final void setTextStr(String str) {
        this.textStr = str;
    }

    public final void setUiEndTime(int i) {
        this.uiEndTime = i;
    }

    public final void setUiStartTime(int i) {
        this.uiStartTime = i;
    }

    public final void setX(float f) {
        this.f107308x = f;
    }

    public final void setY(float f) {
        this.f107309y = f;
    }

    public final void setAudioPathList(List<String> list) {
        C89219l.m154721d(list, "");
        this.audioPathList = list;
    }

    public final void setCoverExtraData(TextStickerCoverExtraData textStickerCoverExtraData) {
        C89219l.m154721d(textStickerCoverExtraData, "");
        this.coverExtraData = textStickerCoverExtraData;
    }

    public final void setEditCenterPoint(Point point) {
        C89219l.m154721d(point, "");
        this.editCenterPoint = point;
    }

    public final void setTextWrapList(List<TextStickerTextWrap> list) {
        C89219l.m154721d(list, "");
        this.textWrapList = list;
    }

    public final boolean isVisibleWhen(long j) {
        if (!hasTimeData()) {
            return true;
        }
        long j2 = (long) this.startTime;
        long j3 = (long) this.endTime;
        if (j2 <= j && j3 >= j) {
            return true;
        }
        return false;
    }
}
