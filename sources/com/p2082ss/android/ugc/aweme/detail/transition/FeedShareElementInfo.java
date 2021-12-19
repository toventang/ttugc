package com.p2082ss.android.ugc.aweme.detail.transition;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.detail.transition.FeedShareElementInfo */
public class FeedShareElementInfo<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<FeedShareElementInfo> CREATOR = new Parcelable.Creator<FeedShareElementInfo>() {
        /* class com.p2082ss.android.ugc.aweme.detail.transition.FeedShareElementInfo.C413261 */

        static {
            Covode.recordClassIndex(49215);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FeedShareElementInfo[] newArray(int i) {
            return new FeedShareElementInfo[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FeedShareElementInfo createFromParcel(Parcel parcel) {
            return new FeedShareElementInfo(parcel);
        }
    };

    /* renamed from: a */
    public transient View f96449a;

    /* renamed from: b */
    public Parcelable f96450b;

    /* renamed from: c */
    public boolean f96451c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(49214);
    }

    public FeedShareElementInfo(View view) {
        this.f96449a = view;
        view.setTag(R.id.b13, this);
    }

    protected FeedShareElementInfo(Parcel parcel) {
        boolean z;
        this.f96450b = parcel.readParcelable(Parcelable.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f96451c = z;
    }

    /* renamed from: a */
    public static FeedShareElementInfo m83187a(View view) {
        if (view == null) {
            return null;
        }
        Object tag = view.getTag(R.id.b13);
        if (tag instanceof FeedShareElementInfo) {
            return (FeedShareElementInfo) tag;
        }
        return null;
    }

    /* renamed from: a */
    public static void m83188a(View view, FeedShareElementInfo feedShareElementInfo) {
        if (view != null) {
            view.setTag(R.id.b13, feedShareElementInfo);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f96450b, i);
        parcel.writeByte(this.f96451c ? (byte) 1 : 0);
    }
}
