package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.p2082ss.android.ugc.aweme.shortvideo.mapping.TimeSpeedModelExtrasAdapterFactory;
import com.p2082ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.p2082ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.p2082ss.android.ugc.aweme.sticker.StickerInfo;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension */
public class TimeSpeedModelExtension implements Parcelable {
    public static final Parcelable.Creator<TimeSpeedModelExtension> CREATOR = new Parcelable.Creator<TimeSpeedModelExtension>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension.C733331 */

        static {
            Covode.recordClassIndex(86063);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeSpeedModelExtension[] newArray(int i) {
            return new TimeSpeedModelExtension[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeSpeedModelExtension createFromParcel(Parcel parcel) {
            return new TimeSpeedModelExtension(parcel);
        }
    };
    private int cameraId;
    private String cameraLensInfo;
    private int duration;
    private int editPageButtonStyle;
    private SimpleEffect effectInfo;
    private boolean enable;
    @AbstractC27891c(mo46611a = "segmentFrameKey")
    private String identityKey;
    private boolean isBusiSticker;
    private boolean isUploadTypeSticker;
    private List<String> mARText;
    private C75439a mBackgroundVideo;
    private BeautyMetadata mBeautyMetadata;
    private List<String> mBubbleText;
    @AbstractC27890b(mo46609a = TimeSpeedModelChallengeAdapterFactory.class)
    private List<AVChallenge> mChallenge;
    private String mStickerId;
    private List<String> mStickerMusicIds;
    private EmbaddedWindowInfo mWindowInfo;
    @AbstractC27890b(mo46609a = TimeSpeedModelExtrasAdapterFactory.class)
    public Bundle recordExtras;
    private SavePhotoStickerInfo savePhotoStickerInfo;
    private String segmentBeginTime;
    private double speed;
    private StickerInfo stickerInfo;
    private boolean supportExtractFrame;
    private boolean supportRetake;
    private int uploadTypeStickerSelectMediaSize;
    private String words;

    public int describeContents() {
        return 0;
    }

    public List<String> getARTexts() {
        return this.mARText;
    }

    public C75439a getBackgroundVideo() {
        return this.mBackgroundVideo;
    }

    public BeautyMetadata getBeautyMetadata() {
        return this.mBeautyMetadata;
    }

    public List<String> getBubbleTexts() {
        return this.mBubbleText;
    }

    public int getCameraId() {
        return this.cameraId;
    }

    public String getCameraLensInfo() {
        return this.cameraLensInfo;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEditPageButtonStyle() {
        return this.editPageButtonStyle;
    }

    public SimpleEffect getEffectInfo() {
        return this.effectInfo;
    }

    public List<AVChallenge> getHashtag() {
        return this.mChallenge;
    }

    public String getIdentityKey() {
        return this.identityKey;
    }

    public SavePhotoStickerInfo getSavePhotoStickerInfo() {
        return this.savePhotoStickerInfo;
    }

    public String getSegmentBeginTime() {
        return this.segmentBeginTime;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String getStickerId() {
        return this.mStickerId;
    }

    public StickerInfo getStickerInfo() {
        return this.stickerInfo;
    }

    public List<String> getStickerMusicIds() {
        return this.mStickerMusicIds;
    }

    public int getUploadTypeStickerSelectMediaSize() {
        return this.uploadTypeStickerSelectMediaSize;
    }

    public String getWords() {
        return this.words;
    }

    public EmbaddedWindowInfo getmWindowInfo() {
        return this.mWindowInfo;
    }

    public boolean isBusiSticker() {
        return this.isBusiSticker;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public boolean isSupportExtractFrame() {
        return this.supportExtractFrame;
    }

    public boolean isSupportRetake() {
        return this.supportRetake;
    }

    public boolean isUploadTypeSticker() {
        return this.isUploadTypeSticker;
    }

    static {
        Covode.recordClassIndex(86062);
    }

    public String getEffectIntensity() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null) {
            return "";
        }
        return stickerInfo2.getEffectIntensity();
    }

    public String getImprPosition() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null) {
            return "";
        }
        return stickerInfo2.getImprPosition();
    }

    public String getTabOrder() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null) {
            return "";
        }
        return stickerInfo2.getTabOrder();
    }

    public boolean isGameTypeSticker() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null || !stickerInfo2.isGameTypeSticker()) {
            return false;
        }
        return true;
    }

    public boolean isTextTypeSticker() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null || !stickerInfo2.isTextTypeSticker()) {
            return false;
        }
        return true;
    }

    public TimeSpeedModelExtension() {
        this.recordExtras = new Bundle(TimeSpeedModelExtension.class.getClassLoader());
        this.enable = true;
        this.supportExtractFrame = false;
    }

    @Override // java.lang.Object
    public TimeSpeedModelExtension clone() {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(this);
        obtain.setDataPosition(0);
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) obtain.readValue(TimeSpeedModelExtension.class.getClassLoader());
        obtain.recycle();
        return timeSpeedModelExtension;
    }

    public String getGradeKey() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null || stickerInfo2.getGradeKey() == null) {
            return "";
        }
        return this.stickerInfo.getGradeKey();
    }

    public String getOriginalId() {
        SimpleEffect simpleEffect = this.effectInfo;
        if (simpleEffect == null || simpleEffect.getDesignerUid() == null) {
            return "";
        }
        return this.effectInfo.getDesignerUid();
    }

    public String getPropRec() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null || stickerInfo2.getRecId() == null) {
            return "0";
        }
        return this.stickerInfo.getRecId();
    }

    public String getPropSource() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null || stickerInfo2.getPropSource() == null) {
            return "";
        }
        return this.stickerInfo.getPropSource();
    }

    public Bundle getRecordExtras() {
        Bundle bundle = this.recordExtras;
        C89219l.m154721d(this, "");
        C89219l.m154721d(bundle, "");
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        return this.recordExtras;
    }

    public boolean isAudioGraphOutput() {
        StickerInfo stickerInfo2 = this.stickerInfo;
        if (stickerInfo2 == null || !stickerInfo2.isAudioGraphOutput().booleanValue()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "durationSDK: " + getDuration() + " speed: " + getSpeed();
    }

    public void adjustDuration(long j) {
        this.duration = (int) j;
    }

    public void setARText(List<String> list) {
        this.mARText = list;
    }

    public void setBubbleText(List<String> list) {
        this.mBubbleText = list;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setStickerMusicIds(List<String> list) {
        this.mStickerMusicIds = list;
    }

    public void setSupportExtractFrame(boolean z) {
        this.supportExtractFrame = z;
    }

    public void setWords(String str) {
        this.words = str;
    }

    public void setmWindowInfo(EmbaddedWindowInfo embaddedWindowInfo) {
        this.mWindowInfo = embaddedWindowInfo;
    }

    public <T> T getFromRecordExtras(String str) {
        T t = (T) m129387x52a4e02c(this.recordExtras, str);
        if (t == null) {
            return null;
        }
        return t;
    }

    public C28022o toJson(C27910f fVar) {
        return fVar.mo46661a(this).mo46789j();
    }

    public static int calculateRealTime(List<TimeSpeedModelExtension> list) {
        int i = 0;
        if (list != null && list.size() > 0) {
            for (TimeSpeedModelExtension timeSpeedModelExtension : list) {
                i += calculateRealTime(timeSpeedModelExtension.duration, timeSpeedModelExtension.speed);
            }
        }
        return i;
    }

    protected TimeSpeedModelExtension(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.recordExtras = new Bundle(TimeSpeedModelExtension.class.getClassLoader());
        boolean z4 = true;
        this.enable = true;
        this.supportExtractFrame = false;
        this.duration = parcel.readInt();
        this.speed = parcel.readDouble();
        this.cameraId = parcel.readInt();
        this.mStickerId = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isBusiSticker = z;
        this.editPageButtonStyle = parcel.readInt();
        this.mStickerMusicIds = parcel.createStringArrayList();
        this.stickerInfo = (StickerInfo) parcel.readSerializable();
        this.words = parcel.readString();
        this.mChallenge = parcel.createTypedArrayList(AVChallenge.CREATOR);
        this.mWindowInfo = (EmbaddedWindowInfo) parcel.readParcelable(EmbaddedWindowInfo.class.getClassLoader());
        this.mBubbleText = parcel.createStringArrayList();
        this.mARText = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.supportRetake = z2;
        this.mBeautyMetadata = (BeautyMetadata) parcel.readParcelable(BeautyMetadata.class.getClassLoader());
        this.cameraLensInfo = parcel.readString();
        this.savePhotoStickerInfo = (SavePhotoStickerInfo) parcel.readParcelable(SavePhotoStickerInfo.class.getClassLoader());
        this.segmentBeginTime = parcel.readString();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUploadTypeSticker = z3;
        this.uploadTypeStickerSelectMediaSize = parcel.readInt();
        this.recordExtras = (Bundle) parcel.readParcelable(TimeSpeedModelExtension.class.getClassLoader());
        this.effectInfo = (SimpleEffect) parcel.readParcelable(SimpleEffect.class.getClassLoader());
        this.identityKey = parcel.readString();
        this.supportExtractFrame = parcel.readByte() == 0 ? false : z4;
    }

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_ui_TimeSpeedModelExtension_com_ss_android_ugc_aweme_lancet_IntentLancet_get */
    public static Object m129387x52a4e02c(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static int calculateRealTime(int i, double d) {
        double d2 = (double) i;
        Double.isNaN(d2);
        return (int) ((d2 * 1.0d) / d);
    }

    public static TimeSpeedModelExtension fromJson(C27910f fVar, C28022o oVar) {
        return (TimeSpeedModelExtension) fVar.mo46667a((AbstractC28019l) oVar, TimeSpeedModelExtension.class);
    }

    public static long calculateRealTime(long j, double d) {
        double d2 = (double) j;
        Double.isNaN(d2);
        return (long) ((d2 * 1.0d) / d);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.duration);
        parcel.writeDouble(this.speed);
        parcel.writeInt(this.cameraId);
        parcel.writeString(this.mStickerId);
        parcel.writeByte(this.isBusiSticker ? (byte) 1 : 0);
        parcel.writeInt(this.editPageButtonStyle);
        parcel.writeStringList(this.mStickerMusicIds);
        parcel.writeSerializable(this.stickerInfo);
        parcel.writeString(this.words);
        parcel.writeTypedList(this.mChallenge);
        parcel.writeParcelable(this.mWindowInfo, i);
        parcel.writeStringList(this.mBubbleText);
        parcel.writeStringList(this.mARText);
        parcel.writeByte(this.supportRetake ? (byte) 1 : 0);
        parcel.writeParcelable(this.mBeautyMetadata, i);
        parcel.writeString(this.cameraLensInfo);
        parcel.writeParcelable(this.savePhotoStickerInfo, i);
        parcel.writeString(this.segmentBeginTime);
        parcel.writeByte(this.isUploadTypeSticker ? (byte) 1 : 0);
        parcel.writeInt(this.uploadTypeStickerSelectMediaSize);
        parcel.writeParcelable(this.recordExtras, i);
        parcel.writeParcelable(this.effectInfo, i);
        parcel.writeString(this.identityKey);
        parcel.writeByte(isSupportExtractFrame() ? (byte) 1 : 0);
    }

    public TimeSpeedModelExtension(int i, double d, String str, List<AVChallenge> list, List<String> list2) {
        this.recordExtras = new Bundle(TimeSpeedModelExtension.class.getClassLoader());
        this.enable = true;
        this.supportExtractFrame = false;
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.mChallenge = list;
        this.mStickerMusicIds = list2;
    }

    public TimeSpeedModelExtension(int i, double d, String str, StickerInfo stickerInfo2, SimpleEffect simpleEffect, List<AVChallenge> list, List<String> list2, EmbaddedWindowInfo embaddedWindowInfo, List<String> list3, List<String> list4, int i2, boolean z, int i3, boolean z2, C75439a aVar, BeautyMetadata beautyMetadata, String str2, SavePhotoStickerInfo savePhotoStickerInfo2, String str3, boolean z3, int i4, String str4, Bundle bundle) {
        Bundle bundle2 = new Bundle(TimeSpeedModelExtension.class.getClassLoader());
        this.recordExtras = bundle2;
        this.enable = true;
        this.supportExtractFrame = false;
        this.duration = i;
        this.speed = d;
        this.mStickerId = str;
        this.stickerInfo = stickerInfo2;
        this.effectInfo = simpleEffect;
        this.mChallenge = list;
        this.mStickerMusicIds = list2;
        this.mWindowInfo = embaddedWindowInfo;
        this.mARText = list3;
        this.mBubbleText = list4;
        this.cameraId = i2;
        this.isBusiSticker = z;
        this.editPageButtonStyle = i3;
        this.mBackgroundVideo = aVar;
        this.supportRetake = z2;
        this.mBeautyMetadata = beautyMetadata;
        this.cameraLensInfo = str2;
        this.savePhotoStickerInfo = savePhotoStickerInfo2;
        this.segmentBeginTime = str3;
        this.isUploadTypeSticker = z3;
        this.uploadTypeStickerSelectMediaSize = i4;
        if (str4 != null) {
            this.identityKey = str4;
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            this.supportExtractFrame = bundle.getBoolean("support_extract_frame", false);
        }
    }
}
