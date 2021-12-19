package dmt.p4542av.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.editor.preview.AbstractC14088a;
import com.bytedance.creativex.editor.preview.IAudioEffectParam;
import com.p2082ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.effect.MultiSegmentPropExtra;
import com.p2082ss.android.ugc.aweme.mvtheme.C61288d;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.VECherEffectParam;
import com.p2082ss.android.vesdk.VEEditorModel;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* renamed from: dmt.av.video.VEPreviewParams */
public class VEPreviewParams implements Parcelable, AbstractC14088a, Serializable {
    public static final Parcelable.Creator<VEPreviewParams> CREATOR = new Parcelable.Creator<VEPreviewParams>() {
        /* class dmt.p4542av.video.VEPreviewParams.C881501 */

        static {
            Covode.recordClassIndex(104184);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VEPreviewParams[] newArray(int i) {
            return new VEPreviewParams[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VEPreviewParams createFromParcel(Parcel parcel) {
            return new VEPreviewParams(parcel);
        }
    };

    /* renamed from: a */
    private boolean f200098a;
    public long audioAecDelayTime;
    public CanvasVideoData canvasVideoPreviewData;
    public boolean isCutSameType;
    public boolean isFastImport;
    public boolean isFromCut;
    public boolean isMusicSyncMode;
    public boolean isStoryEditMode;
    public boolean isVideoImageMixFastImport;
    public String[] mAudioPaths;
    public int mCanvasHeight;
    public int mCanvasWidth;
    public long mEditorHandler;
    public VEEditorModel mEditorModel;
    public boolean mEnableAutoStart;
    public int mFps;
    public boolean mIsFromDraft;
    public int mMusicInPoint;
    public int mMusicOutPoint;
    public String mMusicPath;
    public float mMusicVolume;
    public int mPageType;
    public int mPreviewHeight;
    public int mPreviewWidth;
    public int[] mRotateArray;
    public float[] mSpeedArray;
    public C85391be mTimelineParams;
    public int[] mVTrimIn;
    public int[] mVTrimOut;
    public AudioEffectParam mVeAudioEffectParam;
    public AudioRecorderParam mVeAudioRecordParam;
    public String[] mVideoPaths;
    public float mVolume;
    public String mWorkspace;
    public C61288d mvCreateVideoData;
    public boolean needVEUserConfig;
    public MultiEditVideoStatusRecordData recordData;
    public int sceneIn;
    public int sceneOut;
    public SingleImageCoverBitmapData singleImageCoverBitmapData;
    public StitchParams stitchParams;
    public VECherEffectParam veCherEffectParam;
    public int videoEditorType;

    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public MultiSegmentPropExtra getMultiSegmentPropInfo() {
        return null;
    }

    public String getRecordStickers() {
        return null;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public List<IAudioEffectParam> getVeAudioEffectParamList() {
        return null;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public boolean isCanvasVEEditorType() {
        return false;
    }

    public void setMultiSegmentPropInfo(MultiSegmentPropExtra multiSegmentPropExtra) {
    }

    public void setRecordStickers(String str) {
    }

    public void setVeAudioEffectParamList(List<? extends IAudioEffectParam> list) {
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public String[] getAudioPaths() {
        return this.mAudioPaths;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public int getCanvasHeight() {
        return this.mCanvasHeight;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public int getCanvasWidth() {
        return this.mCanvasWidth;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public long getEditorHandler() {
        return this.mEditorHandler;
    }

    public VEEditorModel getEditorModel() {
        return this.mEditorModel;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public boolean getEnableAutoStart() {
        return this.mEnableAutoStart;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public boolean getEnableMusicSync() {
        return this.f200098a;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public int getFps() {
        return this.mFps;
    }

    public float getMusicVolume() {
        return this.mMusicVolume;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public boolean getNeedVEUserConfig() {
        return this.needVEUserConfig;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public int getPreviewHeight() {
        return this.mPreviewHeight;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public int getPreviewWidth() {
        return this.mPreviewWidth;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public int[] getRotateArray() {
        return this.mRotateArray;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public float[] getSpeedArray() {
        return this.mSpeedArray;
    }

    public C85391be getTimelineParams() {
        return this.mTimelineParams;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public int[] getVTrimIn() {
        return this.mVTrimIn;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public int[] getVTrimOut() {
        return this.mVTrimOut;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public IAudioEffectParam getVeAudioEffectParam() {
        return this.mVeAudioEffectParam;
    }

    public AudioRecorderParam getVeAudioRecordParam() {
        return this.mVeAudioRecordParam;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public String[] getVideoPaths() {
        return this.mVideoPaths;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public float getVolume() {
        return this.mVolume;
    }

    @Override // com.bytedance.creativex.editor.preview.AbstractC14088a
    public String getWorkspace() {
        return this.mWorkspace;
    }

    static {
        Covode.recordClassIndex(104183);
    }

    public VEPreviewParams() {
        this.mFps = -1;
        this.mEnableAutoStart = true;
        this.mVolume = 1.0f;
    }

    public String toString() {
        return "VEPreviewParams{mVideoPaths=" + Arrays.toString(this.mVideoPaths) + ", mAudioPaths=" + Arrays.toString(this.mAudioPaths) + ", mWorkspace='" + this.mWorkspace + '\'' + ", mVolume=" + this.mVolume + ", mFps=" + this.mFps + ", mVTrimIn=" + this.mVTrimIn + ", mVTrimOut=" + this.mVTrimOut + ", sceneIn=" + this.sceneIn + ", sceneOut=" + this.sceneOut + ", canvasWidth=" + this.mCanvasWidth + ", canvasHeight=" + this.mCanvasHeight + '}';
    }

    public void setCanvasHeight(int i) {
        this.mCanvasHeight = i;
    }

    public void setCanvasWidth(int i) {
        this.mCanvasWidth = i;
    }

    public void setEditorHandler(long j) {
        this.mEditorHandler = j;
    }

    public void setEditorModel(VEEditorModel vEEditorModel) {
        this.mEditorModel = vEEditorModel;
    }

    public void setEnableAutoStart(boolean z) {
        this.mEnableAutoStart = z;
    }

    public void setEnableMusicSync(boolean z) {
        this.f200098a = z;
    }

    public void setNeedVEUserConfig(boolean z) {
        this.needVEUserConfig = z;
    }

    public void setTimelineParams(C85391be beVar) {
        this.mTimelineParams = beVar;
    }

    public void setVeAudioRecordParam(AudioRecorderParam audioRecorderParam) {
        this.mVeAudioRecordParam = audioRecorderParam;
    }

    public void setVeAudioEffectParam(IAudioEffectParam iAudioEffectParam) {
        this.mVeAudioEffectParam = (AudioEffectParam) iAudioEffectParam;
    }

    protected VEPreviewParams(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        this.mFps = -1;
        boolean z7 = true;
        this.mEnableAutoStart = true;
        this.mVideoPaths = parcel.createStringArray();
        this.mAudioPaths = parcel.createStringArray();
        this.mWorkspace = parcel.readString();
        this.mVolume = parcel.readFloat();
        this.mMusicVolume = parcel.readFloat();
        this.mFps = parcel.readInt();
        this.mVTrimIn = parcel.createIntArray();
        this.mVTrimOut = parcel.createIntArray();
        this.sceneIn = parcel.readInt();
        this.sceneOut = parcel.readInt();
        this.videoEditorType = parcel.readInt();
        this.mvCreateVideoData = (C61288d) parcel.readSerializable();
        this.mSpeedArray = parcel.createFloatArray();
        this.mRotateArray = parcel.createIntArray();
        this.veCherEffectParam = (VECherEffectParam) parcel.readParcelable(VECherEffectParam.class.getClassLoader());
        this.mCanvasWidth = parcel.readInt();
        this.mCanvasHeight = parcel.readInt();
        this.mMusicPath = parcel.readString();
        this.mMusicInPoint = parcel.readInt();
        this.mMusicOutPoint = parcel.readInt();
        this.mPageType = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.mIsFromDraft = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isCutSameType = z2;
        this.mVeAudioRecordParam = (AudioRecorderParam) parcel.readParcelable(AudioRecorderParam.class.getClassLoader());
        this.recordData = (MultiEditVideoStatusRecordData) parcel.readParcelable(MultiEditVideoStatusRecordData.class.getClassLoader());
        this.mPreviewWidth = parcel.readInt();
        this.mPreviewHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isFastImport = z3;
        this.stitchParams = (StitchParams) parcel.readParcelable(StitchParams.class.getClassLoader());
        this.audioAecDelayTime = parcel.readLong();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isStoryEditMode = z4;
        this.canvasVideoPreviewData = (CanvasVideoData) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f200098a = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.isMusicSyncMode = z6;
        this.isVideoImageMixFastImport = parcel.readByte() == 0 ? false : z7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.mVideoPaths);
        parcel.writeStringArray(this.mAudioPaths);
        parcel.writeString(this.mWorkspace);
        parcel.writeFloat(this.mVolume);
        parcel.writeFloat(this.mMusicVolume);
        parcel.writeInt(this.mFps);
        parcel.writeIntArray(this.mVTrimIn);
        parcel.writeIntArray(this.mVTrimOut);
        parcel.writeInt(this.sceneIn);
        parcel.writeInt(this.sceneOut);
        parcel.writeInt(this.videoEditorType);
        parcel.writeSerializable(this.mvCreateVideoData);
        parcel.writeFloatArray(this.mSpeedArray);
        parcel.writeIntArray(this.mRotateArray);
        parcel.writeParcelable(this.veCherEffectParam, i);
        parcel.writeInt(this.mCanvasWidth);
        parcel.writeInt(this.mCanvasHeight);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mMusicInPoint);
        parcel.writeInt(this.mMusicOutPoint);
        parcel.writeInt(this.mPageType);
        parcel.writeByte(this.mIsFromDraft ? (byte) 1 : 0);
        parcel.writeParcelable(this.mVeAudioRecordParam, i);
        parcel.writeParcelable(this.recordData, i);
        parcel.writeInt(this.mPreviewWidth);
        parcel.writeInt(this.mPreviewHeight);
        parcel.writeByte(this.isFastImport ? (byte) 1 : 0);
        parcel.writeByte(this.isCutSameType ? (byte) 1 : 0);
        parcel.writeParcelable(this.stitchParams, i);
        parcel.writeLong(this.audioAecDelayTime);
        parcel.writeByte(this.isStoryEditMode ? (byte) 1 : 0);
        parcel.writeSerializable(this.canvasVideoPreviewData);
        parcel.writeByte(this.f200098a ? (byte) 1 : 0);
        parcel.writeByte(this.isMusicSyncMode ? (byte) 1 : 0);
        parcel.writeByte(this.isVideoImageMixFastImport ? (byte) 1 : 0);
    }
}
