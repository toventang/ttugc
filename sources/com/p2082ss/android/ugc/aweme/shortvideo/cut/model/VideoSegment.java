package com.p2082ss.android.ugc.aweme.shortvideo.cut.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70503u;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.vesdk.VEUtils;
import com.p2082ss.android.vesdk.clipparam.VEClipAlgorithmParam;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment */
public class VideoSegment implements Parcelable {
    public static final Parcelable.Creator<VideoSegment> CREATOR = new Parcelable.Creator<VideoSegment>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment.C700851 */

        static {
            Covode.recordClassIndex(82508);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ VideoSegment[] newArray(int i) {
            return new VideoSegment[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoSegment createFromParcel(Parcel parcel) {
            return new VideoSegment(parcel);
        }
    };

    /* renamed from: a */
    public int f156709a;

    /* renamed from: b */
    public long f156710b;

    /* renamed from: c */
    public long f156711c;

    /* renamed from: d */
    public long f156712d;

    /* renamed from: e */
    public float f156713e;

    /* renamed from: f */
    public int f156714f;

    /* renamed from: g */
    public int f156715g;

    /* renamed from: h */
    public String f156716h;

    /* renamed from: i */
    public boolean f156717i;

    /* renamed from: j */
    public int f156718j;

    /* renamed from: k */
    public float f156719k = 1.0f;

    /* renamed from: l */
    public float f156720l = 1.0f;

    /* renamed from: m */
    public String f156721m;

    /* renamed from: n */
    public C70090e f156722n;

    /* renamed from: o */
    public boolean f156723o;

    /* renamed from: p */
    public boolean f156724p;

    /* renamed from: q */
    public int f156725q = VEClipAlgorithmParam.BINGO_EFFECT_NULL;

    /* renamed from: r */
    public int f156726r;

    /* renamed from: s */
    public int f156727s;

    /* renamed from: t */
    public int f156728t;

    /* renamed from: u */
    public int f156729u;

    /* renamed from: v */
    public String f156730v;

    /* renamed from: w */
    public String f156731w;

    /* renamed from: x */
    public boolean f156732x;

    /* renamed from: y */
    private String f156733y;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(82507);
    }

    /* renamed from: a */
    public final int mo110570a() {
        if (this.f156726r == 0) {
            m123746h();
        }
        return this.f156726r;
    }

    /* renamed from: b */
    public final int mo110575b() {
        if (this.f156729u == 0) {
            m123746h();
        }
        return this.f156729u;
    }

    /* renamed from: c */
    public final int mo110577c() {
        if (this.f156727s == 0) {
            m123746h();
        }
        return this.f156727s;
    }

    /* renamed from: d */
    public final long mo110578d() {
        if (mo110583g()) {
            return this.f156722n.getVideoStart();
        }
        return this.f156711c;
    }

    /* renamed from: e */
    public final long mo110580e() {
        if (mo110583g()) {
            return this.f156722n.getVideoEnd();
        }
        return this.f156712d;
    }

    /* renamed from: f */
    public final float mo110582f() {
        if (mo110583g()) {
            return this.f156722n.getSpeed();
        }
        return this.f156713e;
    }

    /* renamed from: g */
    public final boolean mo110583g() {
        if (!this.f156723o || this.f156722n == null) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m123746h() {
        VEUtils.VEVideoFileInfo a;
        if (!this.f156732x && (a = C70503u.m124367a(this.f156733y)) != null) {
            this.f156714f = a.width;
            this.f156715g = a.height;
            this.f156726r = a.fps;
            this.f156729u = a.codec;
            this.f156727s = a.bitrate;
            this.f156728t = a.keyFrameCount;
        }
    }

    /* renamed from: a */
    public final String mo110571a(boolean z) {
        if (z) {
            return new StringBuilder().append(this.f156709a).toString();
        }
        return this.f156733y;
    }

    /* renamed from: b */
    public final void mo110576b(long j) {
        if (mo110583g()) {
            this.f156722n.setVideoEnd(j);
        } else {
            this.f156712d = j;
        }
    }

    public VideoSegment(MediaModel mediaModel) {
        this.f156733y = mediaModel.f134662b;
        this.f156714f = mediaModel.f134672l;
        this.f156715g = mediaModel.f134673m;
        this.f156716h = mediaModel.f134671k;
        this.f156710b = mediaModel.f134668h;
        this.f156711c = (long) mediaModel.f134677q;
        if (mediaModel.f134678r > 0) {
            this.f156712d = (long) mediaModel.f134678r;
        } else {
            this.f156712d = this.f156710b;
        }
        this.f156713e = mediaModel.f134679s;
        this.f156732x = C84896h.m145862a(mediaModel);
    }

    /* renamed from: a */
    public final void mo110572a(float f) {
        if (mo110583g()) {
            this.f156722n.setSpeed(1.0f);
        } else {
            this.f156713e = f;
        }
    }

    /* renamed from: a */
    public final void mo110573a(long j) {
        if (mo110583g()) {
            this.f156722n.setVideoStart(j);
        } else {
            this.f156711c = j;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSegment)) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) obj;
        if (this.f156709a == videoSegment.f156709a && this.f156710b == videoSegment.f156710b && this.f156711c == videoSegment.f156711c && this.f156712d == videoSegment.f156712d && Float.compare(videoSegment.f156713e, this.f156713e) == 0 && this.f156714f == videoSegment.f156714f && this.f156715g == videoSegment.f156715g && this.f156717i == videoSegment.f156717i && (((str = this.f156733y) == (str2 = videoSegment.f156733y) || (str != null && str.equals(str2))) && (((str3 = this.f156716h) == (str4 = videoSegment.f156716h) || (str3 != null && str3.equals(str4))) && ((str5 = this.f156721m) == (str6 = videoSegment.f156721m) || (str5 != null && str5.equals(str6)))))) {
            return true;
        }
        return false;
    }

    protected VideoSegment(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f156709a = parcel.readInt();
        this.f156733y = parcel.readString();
        this.f156710b = parcel.readLong();
        this.f156711c = parcel.readLong();
        this.f156712d = parcel.readLong();
        this.f156713e = parcel.readFloat();
        this.f156714f = parcel.readInt();
        this.f156715g = parcel.readInt();
        this.f156716h = parcel.readString();
        boolean z4 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f156717i = z;
        this.f156718j = parcel.readInt();
        this.f156721m = parcel.readString();
        this.f156719k = parcel.readFloat();
        this.f156720l = parcel.readFloat();
        this.f156722n = (C70090e) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f156723o = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f156724p = z3;
        this.f156725q = parcel.readInt();
        this.f156732x = parcel.readByte() == 0 ? false : z4;
    }

    /* renamed from: a */
    public final void mo110574a(String str) {
        this.f156733y = str;
        this.f156732x = C84896h.m145866a(str, false);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f156709a);
        parcel.writeString(this.f156733y);
        parcel.writeLong(this.f156710b);
        parcel.writeLong(this.f156711c);
        parcel.writeLong(this.f156712d);
        parcel.writeFloat(this.f156713e);
        parcel.writeInt(this.f156714f);
        parcel.writeInt(this.f156715g);
        parcel.writeString(this.f156716h);
        parcel.writeByte(this.f156717i ? (byte) 1 : 0);
        parcel.writeInt(this.f156718j);
        parcel.writeString(this.f156721m);
        parcel.writeFloat(this.f156719k);
        parcel.writeFloat(this.f156720l);
        parcel.writeSerializable(this.f156722n);
        parcel.writeInt(this.f156723o ? 1 : 0);
        parcel.writeInt(this.f156724p ? 1 : 0);
        parcel.writeInt(this.f156725q);
        parcel.writeByte(this.f156732x ? (byte) 1 : 0);
    }

    public VideoSegment(String str, int i, int i2, int i3) {
        this.f156733y = str;
        this.f156714f = i;
        this.f156715g = i2;
        this.f156716h = "";
        long j = (long) i3;
        this.f156710b = j;
        this.f156712d = j;
        this.f156713e = EnumC78601i.NORMAL.value();
        this.f156732x = C84896h.m145866a(str, false);
    }
}
