package com.p2082ss.android.ugc.aweme.livewallpaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.video.C80720e;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean */
public class LiveWallPaperBean implements Parcelable {
    public static final Parcelable.Creator<LiveWallPaperBean> CREATOR = new Parcelable.Creator<LiveWallPaperBean>() {
        /* class com.p2082ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean.C589091 */

        static {
            Covode.recordClassIndex(69226);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LiveWallPaperBean[] newArray(int i) {
            return new LiveWallPaperBean[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LiveWallPaperBean createFromParcel(Parcel parcel) {
            return new LiveWallPaperBean(parcel);
        }
    };
    private boolean forceToPause;
    private int height;

    /* renamed from: id */
    private String f134103id;
    private boolean shouldMute;
    private String source;
    private String thumbnailPath;
    private UrlModel thumbnailUrlModel;
    private String videoPath;
    private String videoUri;
    private String videoUrl;
    private float volume;
    private int width;

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean$a */
    public static final class C58910a {

        /* renamed from: a */
        public String f134104a;

        /* renamed from: b */
        public String f134105b;

        /* renamed from: c */
        public String f134106c;

        /* renamed from: d */
        public int f134107d;

        /* renamed from: e */
        public int f134108e;

        /* renamed from: f */
        public String f134109f;

        /* renamed from: g */
        public float f134110g;

        /* renamed from: h */
        public UrlModel f134111h;

        /* renamed from: i */
        public String f134112i;

        /* renamed from: j */
        public String f134113j;

        /* renamed from: k */
        public boolean f134114k;

        /* renamed from: l */
        public boolean f134115l;

        static {
            Covode.recordClassIndex(69227);
        }

        private C58910a() {
        }

        /* renamed from: a */
        public final LiveWallPaperBean mo96357a() {
            return new LiveWallPaperBean(this);
        }

        /* synthetic */ C58910a(byte b) {
            this();
        }
    }

    public int getHeight() {
        return this.height;
    }

    public String getId() {
        return this.f134103id;
    }

    public String getSource() {
        return this.source;
    }

    public String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public UrlModel getThumbnailUrlModel() {
        return this.thumbnailUrlModel;
    }

    public String getVideoPath() {
        return this.videoPath;
    }

    public String getVideoUri() {
        return this.videoUri;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public float getVolume() {
        return this.volume;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isForceToPause() {
        return this.forceToPause;
    }

    public boolean isShouldMute() {
        return this.shouldMute;
    }

    public static C58910a newBuilder() {
        return new C58910a((byte) 0);
    }

    static {
        Covode.recordClassIndex(69225);
    }

    public static LiveWallPaperBean buildEmptyBean() {
        C58910a aVar = new C58910a((byte) 0);
        aVar.f134104a = "";
        aVar.f134107d = 0;
        aVar.f134108e = 0;
        aVar.f134105b = "";
        aVar.f134106c = "";
        aVar.f134109f = "";
        aVar.f134110g = 0.0f;
        return aVar.mo96357a();
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.f134103id)) {
            return false;
        }
        if (C80720e.m139927b(this.thumbnailPath) && C80720e.m139927b(this.videoPath)) {
            return true;
        }
        if (this.thumbnailUrlModel == null || TextUtils.isEmpty(this.videoUrl) || TextUtils.isEmpty(this.videoUri)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "LiveWallPaperBean{id='" + this.f134103id + '\'' + ", thumbnailPath='" + this.thumbnailPath + '\'' + ", videoPath='" + this.videoPath + '\'' + ", width=" + this.width + ", height=" + this.height + ", source=" + this.source + ", volume=" + this.volume + '}';
    }

    public void setForceToPause(boolean z) {
        this.forceToPause = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setId(String str) {
        this.f134103id = str;
    }

    public void setShouldMute(boolean z) {
        this.shouldMute = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setThumbnailPath(String str) {
        this.thumbnailPath = str;
    }

    public void setThumbnailUrlModel(UrlModel urlModel) {
        this.thumbnailUrlModel = urlModel;
    }

    public void setVideoPath(String str) {
        this.videoPath = str;
    }

    public void setVideoUri(String str) {
        this.videoUri = str;
    }

    public void setVideoUrl(String str) {
        this.videoUrl = str;
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    private LiveWallPaperBean(C58910a aVar) {
        this.f134103id = aVar.f134104a;
        this.thumbnailPath = aVar.f134105b;
        this.videoPath = aVar.f134106c;
        this.width = aVar.f134107d;
        this.height = aVar.f134108e;
        this.source = aVar.f134109f;
        this.volume = aVar.f134110g;
        this.thumbnailUrlModel = aVar.f134111h;
        this.videoUrl = aVar.f134112i;
        this.videoUri = aVar.f134113j;
        this.shouldMute = aVar.f134114k;
        this.forceToPause = aVar.f134115l;
    }

    private LiveWallPaperBean(Parcel parcel) {
        boolean z;
        this.f134103id = parcel.readString();
        this.thumbnailPath = parcel.readString();
        this.videoPath = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.source = parcel.readString();
        this.volume = parcel.readFloat();
        this.thumbnailUrlModel = (UrlModel) parcel.readSerializable();
        this.videoUrl = parcel.readString();
        this.videoUri = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.shouldMute = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134103id);
        parcel.writeString(this.thumbnailPath);
        parcel.writeString(this.videoPath);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeString(this.source);
        parcel.writeFloat(this.volume);
        parcel.writeSerializable(this.thumbnailUrlModel);
        parcel.writeString(this.videoUrl);
        parcel.writeString(this.videoUri);
        parcel.writeByte(this.shouldMute ? (byte) 1 : 0);
    }
}
