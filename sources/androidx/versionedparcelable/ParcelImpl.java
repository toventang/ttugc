package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() {
        /* class androidx.versionedparcelable.ParcelImpl.C15661 */

        static {
            Covode.recordClassIndex(1710);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }
    };

    /* renamed from: a */
    public final AbstractC1569c f5141a;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(1709);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f5141a = new C1568b(parcel).mo5235i();
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1568b(parcel).mo5220b(this.f5141a);
    }
}
