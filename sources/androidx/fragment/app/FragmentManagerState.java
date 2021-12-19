package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() {
        /* class androidx.fragment.app.FragmentManagerState.C09371 */

        static {
            Covode.recordClassIndex(1029);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }
    };

    /* renamed from: a */
    public FragmentState[] f3330a;

    /* renamed from: b */
    int[] f3331b;

    /* renamed from: c */
    BackStackState[] f3332c;

    /* renamed from: d */
    int f3333d = -1;

    /* renamed from: e */
    int f3334e;

    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
    }

    static {
        Covode.recordClassIndex(1028);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3330a = (FragmentState[]) parcel.createTypedArray(FragmentState.CREATOR);
        this.f3331b = parcel.createIntArray();
        this.f3332c = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3333d = parcel.readInt();
        this.f3334e = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f3330a, i);
        parcel.writeIntArray(this.f3331b);
        parcel.writeTypedArray(this.f3332c, i);
        parcel.writeInt(this.f3333d);
        parcel.writeInt(this.f3334e);
    }
}
