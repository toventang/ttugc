package com.p2082ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel */
public final class CoverPublishModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<CoverPublishModel> CREATOR = new C45929a();
    @AbstractC27891c(mo46611a = "ai_cover_index")
    private int aiCoverIndex;
    @AbstractC27891c(mo46611a = "ai_cover_start_time")
    private float aiCoverStartTime;
    @AbstractC27891c(mo46611a = "effect_text_model")
    private final EffectTextModel effectTextModel;
    @AbstractC27891c(mo46611a = "image_cover_view_trans_x")
    private float imageCoverViewTransX;
    @AbstractC27891c(mo46611a = "image_cover_view_trans_y")
    private float imageCoverViewTransY;
    @AbstractC27891c(mo46611a = "image_current_index")
    private int imageCurrentIndex;
    @AbstractC27891c(mo46611a = "is_ai_recommend_cover")
    private boolean isAiRecommendCover;
    @AbstractC27891c(mo46611a = "need_expand_compiled_size")
    private boolean needExpandCompiledSize;
    @AbstractC27891c(mo46611a = "cover_recommend_title")
    private List<RecCoverTitleBean> recTitleList;
    @AbstractC27891c(mo46611a = "save_rec_title_id")
    private String saveTitleId;
    @AbstractC27891c(mo46611a = "video_cover_view_trans_x")
    private float videoCoverViewTransX;
    @AbstractC27891c(mo46611a = "video_cover_view_trans_y")
    private float videoCoverViewTransY;
    @AbstractC27891c(mo46611a = "video_cover_view_x")
    private float videoCoverViewX;
    @AbstractC27891c(mo46611a = "video_cover_crop_path")
    private String videoCropCoverPath;

    static {
        Covode.recordClassIndex(54455);
    }

    public CoverPublishModel() {
        this(null, 0.0f, 0.0f, 0.0f, null, false, 0.0f, 0, false, null, null, 0, 0.0f, 0.0f, 16383, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeParcelable(this.effectTextModel, i);
        parcel.writeFloat(this.videoCoverViewX);
        parcel.writeFloat(this.videoCoverViewTransX);
        parcel.writeFloat(this.videoCoverViewTransY);
        parcel.writeString(this.videoCropCoverPath);
        parcel.writeInt(this.needExpandCompiledSize ? 1 : 0);
        parcel.writeFloat(this.aiCoverStartTime);
        parcel.writeInt(this.aiCoverIndex);
        parcel.writeInt(this.isAiRecommendCover ? 1 : 0);
        List<RecCoverTitleBean> list = this.recTitleList;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (RecCoverTitleBean recCoverTitleBean : list) {
                recCoverTitleBean.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.saveTitleId);
        parcel.writeInt(this.imageCurrentIndex);
        parcel.writeFloat(this.imageCoverViewTransX);
        parcel.writeFloat(this.imageCoverViewTransY);
    }

    public final int getAiCoverIndex() {
        return this.aiCoverIndex;
    }

    public final float getAiCoverStartTime() {
        return this.aiCoverStartTime;
    }

    public final EffectTextModel getEffectTextModel() {
        return this.effectTextModel;
    }

    public final float getImageCoverViewTransX() {
        return this.imageCoverViewTransX;
    }

    public final float getImageCoverViewTransY() {
        return this.imageCoverViewTransY;
    }

    public final int getImageCurrentIndex() {
        return this.imageCurrentIndex;
    }

    public final boolean getNeedExpandCompiledSize() {
        return this.needExpandCompiledSize;
    }

    public final List<RecCoverTitleBean> getRecTitleList() {
        return this.recTitleList;
    }

    public final String getSaveTitleId() {
        return this.saveTitleId;
    }

    public final float getVideoCoverViewTransX() {
        return this.videoCoverViewTransX;
    }

    public final float getVideoCoverViewTransY() {
        return this.videoCoverViewTransY;
    }

    public final float getVideoCoverViewX() {
        return this.videoCoverViewX;
    }

    public final String getVideoCropCoverPath() {
        return this.videoCropCoverPath;
    }

    public final boolean isAiRecommendCover() {
        return this.isAiRecommendCover;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel$a */
    public static class C45929a implements Parcelable.Creator<CoverPublishModel> {
        static {
            Covode.recordClassIndex(54456);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CoverPublishModel[] newArray(int i) {
            return new CoverPublishModel[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CoverPublishModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            C89219l.m154721d(parcel, "");
            EffectTextModel effectTextModel = (EffectTextModel) parcel.readParcelable(CoverPublishModel.class.getClassLoader());
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            float readFloat3 = parcel.readFloat();
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            float readFloat4 = parcel.readFloat();
            int readInt = parcel.readInt();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList.add(RecCoverTitleBean.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList = null;
            }
            return new CoverPublishModel(effectTextModel, readFloat, readFloat2, readFloat3, readString, z, readFloat4, readInt, z2, arrayList, parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readFloat());
        }
    }

    public final void setAiCoverIndex(int i) {
        this.aiCoverIndex = i;
    }

    public final void setAiCoverStartTime(float f) {
        this.aiCoverStartTime = f;
    }

    public final void setAiRecommendCover(boolean z) {
        this.isAiRecommendCover = z;
    }

    public final void setImageCoverViewTransX(float f) {
        this.imageCoverViewTransX = f;
    }

    public final void setImageCoverViewTransY(float f) {
        this.imageCoverViewTransY = f;
    }

    public final void setImageCurrentIndex(int i) {
        this.imageCurrentIndex = i;
    }

    public final void setNeedExpandCompiledSize(boolean z) {
        this.needExpandCompiledSize = z;
    }

    public final void setRecTitleList(List<RecCoverTitleBean> list) {
        this.recTitleList = list;
    }

    public final void setSaveTitleId(String str) {
        this.saveTitleId = str;
    }

    public final void setVideoCoverViewTransX(float f) {
        this.videoCoverViewTransX = f;
    }

    public final void setVideoCoverViewTransY(float f) {
        this.videoCoverViewTransY = f;
    }

    public final void setVideoCoverViewX(float f) {
        this.videoCoverViewX = f;
    }

    public final void setVideoCropCoverPath(String str) {
        this.videoCropCoverPath = str;
    }

    public CoverPublishModel(EffectTextModel effectTextModel2, float f, float f2, float f3, String str, boolean z, float f4, int i, boolean z2, List<RecCoverTitleBean> list, String str2, int i2, float f5, float f6) {
        C89219l.m154721d(effectTextModel2, "");
        this.effectTextModel = effectTextModel2;
        this.videoCoverViewX = f;
        this.videoCoverViewTransX = f2;
        this.videoCoverViewTransY = f3;
        this.videoCropCoverPath = str;
        this.needExpandCompiledSize = z;
        this.aiCoverStartTime = f4;
        this.aiCoverIndex = i;
        this.isAiRecommendCover = z2;
        this.recTitleList = list;
        this.saveTitleId = str2;
        this.imageCurrentIndex = i2;
        this.imageCoverViewTransX = f5;
        this.imageCoverViewTransY = f6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoverPublishModel(EffectTextModel effectTextModel2, float f, float f2, float f3, String str, boolean z, float f4, int i, boolean z2, List list, String str2, int i2, float f5, float f6, int i3, C89214g gVar) {
        this((i3 & 1) != 0 ? new EffectTextModel(false, null, null, null, null, 31, null) : effectTextModel2, (i3 & 2) != 0 ? 0.0f : f, (i3 & 4) != 0 ? 0.0f : f2, (i3 & 8) != 0 ? 0.0f : f3, (i3 & 16) != 0 ? null : str, (i3 & 32) != 0 ? false : z, (i3 & 64) == 0 ? f4 : 0.0f, (i3 & 128) != 0 ? -1 : i, (i3 & 256) != 0 ? false : z2, (i3 & 512) != 0 ? null : list, (i3 & 1024) == 0 ? str2 : null, (i3 & 2048) == 0 ? i2 : 0, (i3 & 4096) != 0 ? -1.0f : f5, (i3 & 8192) == 0 ? f6 : -1.0f);
    }
}
