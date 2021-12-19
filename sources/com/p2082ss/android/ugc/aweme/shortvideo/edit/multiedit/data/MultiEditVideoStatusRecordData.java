package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData */
public class MultiEditVideoStatusRecordData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiEditVideoStatusRecordData> CREATOR = new Parcelable.Creator<MultiEditVideoStatusRecordData>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData.C714911 */

        static {
            Covode.recordClassIndex(84030);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiEditVideoStatusRecordData[] newArray(int i) {
            return new MultiEditVideoStatusRecordData[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiEditVideoStatusRecordData createFromParcel(Parcel parcel) {
            return new MultiEditVideoStatusRecordData(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "edit_adjust_clips_state")
    public EditAdjustClipsState adjustClipsState;
    @AbstractC27891c(mo46611a = "cover_img_path")
    public String coverImagePath;
    @AbstractC27891c(mo46611a = "cur_multi_edit_data")
    public MultiEditVideoRecordData curMultiEditVideoRecordData;
    @AbstractC27891c(mo46611a = "cur_select_index")
    public int currentEditIndex = -1;
    @AbstractC27891c(mo46611a = "edit_cut_segments")
    public ArrayList<TimeSpeedModelExtension> editCutSegments;
    @AbstractC27891c(mo46611a = "edit_segments")
    public ArrayList<TimeSpeedModelExtension> editSegments;
    @AbstractC27891c(mo46611a = "is_multi_edit_retake")
    public boolean isMultiEditRetake;
    @AbstractC27891c(mo46611a = "is_support_multi_edit")
    public boolean isSupportMultiEdit;
    @AbstractC27891c(mo46611a = "is_use_multi_edit")
    public boolean isUseMultiEdit;
    @AbstractC27891c(mo46611a = "origin_multi_edit_data")
    public MultiEditVideoRecordData originMultiEditRecordData;
    @AbstractC27891c(mo46611a = "original_music_start")
    public int originalMusicStart;
    @AbstractC27891c(mo46611a = "original_segments")
    public ArrayList<TimeSpeedModelExtension> originalSegments;
    @AbstractC27891c(mo46611a = "record_music")
    public C69905c recordMusic;
    @AbstractC27891c(mo46611a = "restore_multi_edit_data")
    public MultiEditVideoRecordData restoreMultiEditVideoRecordData;
    @AbstractC27891c(mo46611a = "restore_edit_segments")
    public ArrayList<TimeSpeedModelExtension> restoreSegments;
    @AbstractC27891c(mo46611a = "segment_size_change")
    public boolean segmentSizeChange;
    @AbstractC27891c(mo46611a = "single_restore_multi_edit_data")
    public MultiEditVideoRecordData singleRestoreMultiEditRecordData;
    @AbstractC27891c(mo46611a = "single_restore_segments")
    public ArrayList<TimeSpeedModelExtension> singleRestoreSegments;
    @AbstractC27891c(mo46611a = "video_meta_data")
    public String videoMetaData;

    public int describeContents() {
        return 0;
    }

    public MultiEditVideoStatusRecordData() {
    }

    static {
        Covode.recordClassIndex(84029);
    }

    protected MultiEditVideoStatusRecordData(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.curMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.restoreMultiEditVideoRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.singleRestoreMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.originMultiEditRecordData = (MultiEditVideoRecordData) parcel.readParcelable(MultiEditVideoRecordData.class.getClassLoader());
        this.currentEditIndex = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.segmentSizeChange = z;
        this.originalSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.editSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.restoreSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.singleRestoreSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        this.editCutSegments = parcel.createTypedArrayList(TimeSpeedModelExtension.CREATOR);
        if (parcel.readByte() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.isMultiEditRetake = z2;
        if (parcel.readByte() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.isUseMultiEdit = z3;
        this.coverImagePath = parcel.readString();
        this.recordMusic = (C69905c) parcel.readSerializable();
        this.originalMusicStart = parcel.readInt();
        this.videoMetaData = parcel.readString();
        this.isSupportMultiEdit = parcel.readByte() == 1 ? true : z4;
        this.adjustClipsState = (EditAdjustClipsState) parcel.readParcelable(EditAdjustClipsState.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.curMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.restoreMultiEditVideoRecordData, i);
        parcel.writeParcelable(this.singleRestoreMultiEditRecordData, i);
        parcel.writeParcelable(this.originMultiEditRecordData, i);
        parcel.writeInt(this.currentEditIndex);
        parcel.writeByte(this.segmentSizeChange ? (byte) 1 : 0);
        parcel.writeTypedList(this.originalSegments);
        parcel.writeTypedList(this.editSegments);
        parcel.writeTypedList(this.restoreSegments);
        parcel.writeTypedList(this.singleRestoreSegments);
        parcel.writeTypedList(this.editCutSegments);
        parcel.writeByte(this.isMultiEditRetake ? (byte) 1 : 0);
        parcel.writeByte(this.isUseMultiEdit ? (byte) 1 : 0);
        parcel.writeString(this.coverImagePath);
        parcel.writeSerializable(this.recordMusic);
        parcel.writeInt(this.originalMusicStart);
        parcel.writeString(this.videoMetaData);
        parcel.writeByte(this.isSupportMultiEdit ? (byte) 1 : 0);
        parcel.writeParcelable(this.adjustClipsState, i);
    }
}
