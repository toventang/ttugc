package com.p2082ss.android.ugc.aweme.shortvideo.cut.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext */
public class CutVideoContext implements Parcelable, Serializable {
    public static final Parcelable.Creator<CutVideoContext> CREATOR = new Parcelable.Creator<CutVideoContext>() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext.C700841 */

        static {
            Covode.recordClassIndex(82505);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CutVideoContext[] newArray(int i) {
            return new CutVideoContext[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CutVideoContext createFromParcel(Parcel parcel) {
            return new CutVideoContext(parcel);
        }
    };

    /* renamed from: a */
    private List<VideoSegment> f156707a;
    public float totalSpeed;

    public int describeContents() {
        return 0;
    }

    public CutVideoContext() {
    }

    public List<VideoSegment> getVideoSegmentList() {
        return this.f156707a;
    }

    static {
        Covode.recordClassIndex(82504);
    }

    public void resetVideoSegmentList() {
        if (!C84892d.m145850a(this.f156707a)) {
            for (int i = 0; i < this.f156707a.size(); i++) {
                VideoSegment videoSegment = this.f156707a.get(i);
                videoSegment.f156711c = 0;
                videoSegment.f156712d = videoSegment.f156710b;
                videoSegment.f156713e = EnumC78601i.NORMAL.value();
                videoSegment.f156718j = 0;
                videoSegment.f156717i = false;
            }
        }
    }

    public void setSpeed(float f) {
        this.totalSpeed = f;
    }

    public void setVideoSegmentList(List<VideoSegment> list) {
        this.f156707a = list;
    }

    protected CutVideoContext(Parcel parcel) {
        this.totalSpeed = parcel.readFloat();
        ArrayList arrayList = new ArrayList();
        this.f156707a = arrayList;
        parcel.readList(arrayList, VideoSegment.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble((double) this.totalSpeed);
        parcel.writeList(this.f156707a);
    }
}
