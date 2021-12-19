package com.p2082ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.p2082ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.photomovie.PhotoMovieContext */
public class PhotoMovieContext extends BaseShortVideoContext implements Parcelable {
    public static final Parcelable.Creator<PhotoMovieContext> CREATOR = new Parcelable.Creator<PhotoMovieContext>() {
        /* class com.p2082ss.android.ugc.aweme.photomovie.PhotoMovieContext.C628881 */

        static {
            Covode.recordClassIndex(73722);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PhotoMovieContext[] newArray(int i) {
            return new PhotoMovieContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PhotoMovieContext createFromParcel(Parcel parcel) {
            return new PhotoMovieContext(parcel);
        }
    };
    @AbstractC27891c(mo46611a = "coverPublishModel")
    private CoverPublishModel coverPublishModel;
    @AbstractC27891c(mo46611a = "creationId")
    public String creationId;
    @AbstractC27891c(mo46611a = "draftId")
    public int draftId;
    @AbstractC27891c(mo46611a = "extract_model")
    public ExtractFramesModel extractFramesModel;
    @AbstractC27891c(mo46611a = "is_background_publish")
    public boolean isBackgroundPublish;
    @AbstractC27891c(mo46611a = "isMusicIllegal")
    public boolean isMusicIllegal;
    @AbstractC27891c(mo46611a = "is_open_foreground_publish")
    public boolean isOpenForegroundPublish;
    @AbstractC27891c(mo46611a = "mCoverStartTm")
    public float mCoverStartTm;
    @AbstractC27891c(mo46611a = "mFilterId")
    public int mFilterId;
    @AbstractC27891c(mo46611a = "mFilterName")
    public String mFilterName;
    @AbstractC27891c(mo46611a = "mFilterPath")
    public String mFilterPath;
    @AbstractC27891c(mo46611a = "mFinalVideoTmpPath")
    public String mFinalVideoTmpPath;
    @AbstractC27891c(mo46611a = "mFrom")
    public int mFrom;
    @AbstractC27891c(mo46611a = "mHeight")
    public int mHeight;
    @AbstractC27891c(mo46611a = "mImageList")
    public List<String> mImageList;
    @AbstractC27891c(mo46611a = "mInputAudioPath")
    public String mInputAudioPath;
    @AbstractC27891c(mo46611a = "mMusic")
    public C69905c mMusic;
    @AbstractC27891c(mo46611a = "mMusicList")
    public List<C69905c> mMusicList = new ArrayList();
    @AbstractC27891c(mo46611a = "mMusicPath")
    public String mMusicPath;
    @AbstractC27891c(mo46611a = "mOutputVideoPath")
    public String mOutputVideoPath;
    @AbstractC27891c(mo46611a = "mPlayType")
    public int mPlayType;
    @AbstractC27891c(mo46611a = "mRealImageCount")
    public int mRealImageCount;
    @AbstractC27891c(mo46611a = "save_model")
    public AVUploadSaveModel mSaveModel;
    @AbstractC27891c(mo46611a = "mWidth")
    public int mWidth;
    @AbstractC27891c(mo46611a = "music_origin")
    public String musicOrigin;
    @AbstractC27891c(mo46611a = "newDraftId")
    public String newDraftId = "";
    @AbstractC27891c(mo46611a = "photo_time")
    public int photoTime;
    @AbstractC27891c(mo46611a = "shop_draft_id")
    public String shopDraftId;
    @AbstractC27891c(mo46611a = "startTime")
    public long startTime;
    @AbstractC27891c(mo46611a = "trans_time")
    public int transTime;
    @AbstractC27891c(mo46611a = "video_cover_path")
    private String videoCoverPath;

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(73721);
    }

    public PhotoMovieContext() {
    }

    public CoverPublishModel getCoverPublishModel() {
        if (this.coverPublishModel == null) {
            this.coverPublishModel = new CoverPublishModel();
        }
        return this.coverPublishModel;
    }

    public int getImageCount() {
        List<String> list = this.mImageList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public String getLocalTempPath() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null) {
            return null;
        }
        return aVUploadSaveModel.getLocalTempPath();
    }

    public boolean isSaveLocal() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveLocal()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithWaterMark() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveLocalWithWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveLocalWithoutWaterMark() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || aVUploadSaveModel.isWaterMark()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToAlbum() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.getSaveToAlbum()) {
            return false;
        }
        return true;
    }

    public boolean isSaveToLocalPathInsteadOfAlbum() {
        AVUploadSaveModel aVUploadSaveModel = this.mSaveModel;
        if (aVUploadSaveModel == null || !aVUploadSaveModel.isSaveToAppPathInsteadOfAlbum()) {
            return false;
        }
        return true;
    }

    public void setCoverPublishModel(CoverPublishModel coverPublishModel2) {
        this.coverPublishModel = coverPublishModel2;
    }

    /* renamed from: com_ss_android_ugc_aweme_photomovie_PhotoMovieContext_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir */
    public static File m113288x176ecac3(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }

    private String generateTempCoverPath(Context context) {
        return getCacheDir(context) + getRandomFileName("_cover.png");
    }

    private String getCacheDir(Context context) {
        return m113288x176ecac3(context).getPath() + File.separator;
    }

    public String getVideoCoverPath(Context context) {
        if (TextUtils.isEmpty(this.videoCoverPath)) {
            this.videoCoverPath = generateTempCoverPath(context);
        }
        return this.videoCoverPath;
    }

    private String getRandomFileName(String str) {
        return new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US).format(Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime()) + str;
    }

    public static PhotoMovieContext convertFromDraft(C43223c cVar) {
        PhotoMovieContext photoMovieContext = cVar.f100903c;
        if (photoMovieContext == null || cVar.f100902b == null) {
            return null;
        }
        photoMovieContext.challenges = cVar.f100902b.f100737c;
        photoMovieContext.title = cVar.f100902b.f100735a;
        photoMovieContext.structList = cVar.f100902b.f100736b;
        photoMovieContext.isPrivate = cVar.f100881D;
        photoMovieContext.excludeUserList = cVar.f100900W.f100787aT;
        photoMovieContext.allowRecommend = cVar.f100900W.f100789aV;
        photoMovieContext.geofencingSetting = cVar.f100900W.f100786aS;
        photoMovieContext.mIsFromDraft = true;
        photoMovieContext.mDraftToEditFrom = cVar.f100920t;
        photoMovieContext.isMusicIllegal = cVar.f100903c.isMusicIllegal;
        photoMovieContext.mFrom = 1;
        photoMovieContext.mSaveModel = cVar.f100900W.f100744D;
        photoMovieContext.draftEditTransferModel = new DraftEditTransferModel(cVar.mo73726r(), null);
        return photoMovieContext;
    }

    protected PhotoMovieContext(Parcel parcel) {
        super(parcel);
        boolean z;
        this.mFinalVideoTmpPath = parcel.readString();
        this.mImageList = parcel.createStringArrayList();
        this.musicOrigin = parcel.readString();
        this.mMusicPath = parcel.readString();
        this.mHeight = parcel.readInt();
        this.mWidth = parcel.readInt();
        this.mPlayType = parcel.readInt();
        this.mOutputVideoPath = parcel.readString();
        this.mInputAudioPath = parcel.readString();
        this.mCoverStartTm = parcel.readFloat();
        this.mMusic = (C69905c) parcel.readSerializable();
        this.mFilterPath = parcel.readString();
        this.mFilterName = parcel.readString();
        this.mFilterId = parcel.readInt();
        this.mFrom = parcel.readInt();
        this.creationId = parcel.readString();
        this.draftId = parcel.readInt();
        this.newDraftId = parcel.readString();
        this.shopDraftId = parcel.readString();
        this.mSaveModel = (AVUploadSaveModel) parcel.readParcelable(AVUploadSaveModel.class.getClassLoader());
        this.extractFramesModel = (ExtractFramesModel) parcel.readSerializable();
        this.photoTime = parcel.readInt();
        this.transTime = parcel.readInt();
        this.mRealImageCount = parcel.readInt();
        this.coverPublishModel = (CoverPublishModel) parcel.readParcelable(CoverPublishModel.class.getClassLoader());
        this.videoCoverPath = parcel.readString();
        this.mDraftToEditFrom = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isMusicIllegal = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mFinalVideoTmpPath);
        parcel.writeStringList(this.mImageList);
        parcel.writeString(this.musicOrigin);
        parcel.writeString(this.mMusicPath);
        parcel.writeInt(this.mHeight);
        parcel.writeInt(this.mWidth);
        parcel.writeInt(this.mPlayType);
        parcel.writeString(this.mOutputVideoPath);
        parcel.writeString(this.mInputAudioPath);
        parcel.writeFloat(this.mCoverStartTm);
        parcel.writeSerializable(this.mMusic);
        parcel.writeString(this.mFilterPath);
        parcel.writeString(this.mFilterName);
        parcel.writeInt(this.mFilterId);
        parcel.writeInt(this.mFrom);
        parcel.writeString(this.creationId);
        parcel.writeInt(this.draftId);
        parcel.writeString(this.newDraftId);
        parcel.writeString(this.shopDraftId);
        parcel.writeParcelable(this.mSaveModel, i);
        parcel.writeSerializable(this.extractFramesModel);
        parcel.writeInt(this.photoTime);
        parcel.writeInt(this.transTime);
        parcel.writeInt(this.mRealImageCount);
        parcel.writeParcelable(this.coverPublishModel, i);
        parcel.writeString(this.videoCoverPath);
        parcel.writeInt(this.mDraftToEditFrom);
        parcel.writeByte(this.isMusicIllegal ? (byte) 1 : 0);
    }
}
