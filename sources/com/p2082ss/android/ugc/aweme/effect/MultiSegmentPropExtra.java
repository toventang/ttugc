package com.p2082ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra */
public final class MultiSegmentPropExtra implements Parcelable, Serializable {
    public static final Parcelable.Creator<MultiSegmentPropExtra> CREATOR = new C46261a();
    @AbstractC27891c(mo46611a = "clips")

    /* renamed from: a */
    private final List<ClipsModel> f107804a;

    static {
        Covode.recordClassIndex(54834);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MultiSegmentPropExtra copy$default(MultiSegmentPropExtra multiSegmentPropExtra, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = multiSegmentPropExtra.f107804a;
        }
        return multiSegmentPropExtra.copy(list);
    }

    public final List<ClipsModel> component1() {
        return this.f107804a;
    }

    public final MultiSegmentPropExtra copy(List<ClipsModel> list) {
        C89219l.m154721d(list, "");
        return new MultiSegmentPropExtra(list);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof MultiSegmentPropExtra) && C89219l.m154714a(this.f107804a, ((MultiSegmentPropExtra) obj).f107804a);
        }
        return true;
    }

    public final int hashCode() {
        List<ClipsModel> list = this.f107804a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MultiSegmentPropExtra(clips=" + this.f107804a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C89219l.m154721d(parcel, "");
        List<ClipsModel> list = this.f107804a;
        parcel.writeInt(list.size());
        for (ClipsModel clipsModel : list) {
            clipsModel.writeToParcel(parcel, 0);
        }
    }

    public final List<ClipsModel> getClips() {
        return this.f107804a;
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.MultiSegmentPropExtra$a */
    public static class C46261a implements Parcelable.Creator<MultiSegmentPropExtra> {
        static {
            Covode.recordClassIndex(54835);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MultiSegmentPropExtra[] newArray(int i) {
            return new MultiSegmentPropExtra[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MultiSegmentPropExtra createFromParcel(Parcel parcel) {
            C89219l.m154721d(parcel, "");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(ClipsModel.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            return new MultiSegmentPropExtra(arrayList);
        }
    }

    public final boolean checkValid() {
        boolean z;
        if (this.f107804a.size() <= 6) {
            z = true;
        } else {
            z = false;
        }
        double d = 0.0d;
        for (T t : this.f107804a) {
            double duration = (double) t.getDuration();
            Double.isNaN(duration);
            d += duration;
            if (!z || ((double) t.getDuration()) <= 0.0d) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z || d > 60.0d) {
            return false;
        }
        return true;
    }

    public MultiSegmentPropExtra(List<ClipsModel> list) {
        C89219l.m154721d(list, "");
        this.f107804a = list;
    }
}
