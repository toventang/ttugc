package com.p2082ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment */
public class EditVideoSegment implements Parcelable, Serializable {
    public static final Parcelable.Creator<EditVideoSegment> CREATOR = new C71406b();
    public static final C71405a Companion = new C71405a((byte) 0);
    private String audioPath;
    private transient boolean isImage;
    private transient String muxPath;
    private VideoCutInfo videoCutInfo;
    private final VideoFileInfo videoFileInfo;
    private String videoPath;

    public final EditVideoSegment copy() {
        return copy$default(this, null, null, null, null, 15, null);
    }

    public final EditVideoSegment copy(String str) {
        return copy$default(this, str, null, null, null, 14, null);
    }

    public final EditVideoSegment copy(String str, String str2) {
        return copy$default(this, str, str2, null, null, 12, null);
    }

    public final EditVideoSegment copy(String str, String str2, VideoFileInfo videoFileInfo2) {
        return copy$default(this, str, str2, videoFileInfo2, null, 8, null);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment$a */
    public static final class C71405a {
        static {
            Covode.recordClassIndex(83935);
        }

        private C71405a() {
        }

        public /* synthetic */ C71405a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment$b */
    public static final class C71406b implements Parcelable.Creator<EditVideoSegment> {
        static {
            Covode.recordClassIndex(83936);
        }

        C71406b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EditVideoSegment[] newArray(int i) {
            return new EditVideoSegment[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EditVideoSegment createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            return new EditVideoSegment(parcel);
        }
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final String getMuxPath() {
        return this.muxPath;
    }

    public final VideoCutInfo getVideoCutInfo() {
        return this.videoCutInfo;
    }

    public final VideoFileInfo getVideoFileInfo() {
        return this.videoFileInfo;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final boolean isImage() {
        return this.isImage;
    }

    static {
        Covode.recordClassIndex(83934);
    }

    public final void setAudioPath(String str) {
        this.audioPath = str;
    }

    public final void setImage(boolean z) {
        this.isImage = z;
    }

    public final void setMuxPath(String str) {
        this.muxPath = str;
    }

    public final void setVideoCutInfo(VideoCutInfo videoCutInfo2) {
        this.videoCutInfo = videoCutInfo2;
    }

    public final void setVideoPath(String str) {
        C89219l.m154721d(str, "");
        this.videoPath = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EditVideoSegment(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r4, r0)
            java.lang.String r2 = r4.readString()
            if (r2 == 0) goto L_0x003a
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r0)
            java.lang.String r1 = r4.readString()
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo> r0 = com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r0 = (com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo) r0
            if (r0 == 0) goto L_0x0032
            r3.<init>(r2, r1, r0)
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo> r0 = com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r0 = (com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo) r0
            r3.videoCutInfo = r0
            return
        L_0x0032:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "create EditVideoSegment instance with invalid VideoFileInfo"
            r1.<init>(r0)
            throw r1
        L_0x003a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "create EditVideoSegment instance with invalid videoPath"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment.<init>(android.os.Parcel):void");
    }

    public void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        parcel.writeString(this.videoPath);
        parcel.writeString(this.audioPath);
        parcel.writeParcelable(this.videoFileInfo, i);
        parcel.writeParcelable(this.videoCutInfo, i);
    }

    public EditVideoSegment(String str, String str2, VideoFileInfo videoFileInfo2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(videoFileInfo2, "");
        this.videoPath = str;
        this.audioPath = str2;
        this.videoFileInfo = videoFileInfo2;
    }

    public final EditVideoSegment copy(String str, String str2, VideoFileInfo videoFileInfo2, VideoCutInfo videoCutInfo2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(videoFileInfo2, "");
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, str2, videoFileInfo2);
        editVideoSegment.videoCutInfo = videoCutInfo2;
        return editVideoSegment;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditVideoSegment(String str, String str2, VideoFileInfo videoFileInfo2, int i, C89214g gVar) {
        this(str, (i & 2) != 0 ? null : str2, videoFileInfo2);
    }

    public static /* synthetic */ EditVideoSegment copy$default(EditVideoSegment editVideoSegment, String str, String str2, VideoFileInfo videoFileInfo2, VideoCutInfo videoCutInfo2, int i, Object obj) {
        VideoFileInfo videoFileInfo3 = videoFileInfo2;
        VideoCutInfo videoCutInfo3 = videoCutInfo2;
        if (obj == null) {
            if ((i & 1) != 0) {
                str = editVideoSegment.videoPath;
            }
            if ((i & 2) != 0) {
                str2 = editVideoSegment.audioPath;
            }
            if ((i & 4) != 0) {
                videoFileInfo3 = VideoFileInfo.copy$default(editVideoSegment.videoFileInfo, 0, 0, 0, 0, 0, 0, 0, 0, 255, null);
            }
            if ((i & 8) != 0) {
                VideoCutInfo videoCutInfo4 = editVideoSegment.videoCutInfo;
                if (videoCutInfo4 != null) {
                    videoCutInfo3 = VideoCutInfo.copy$default(videoCutInfo4, 0, 0, 0.0f, 0, 15, null);
                } else {
                    videoCutInfo3 = null;
                }
            }
            return editVideoSegment.copy(str, str2, videoFileInfo3, videoCutInfo3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
    }
}
