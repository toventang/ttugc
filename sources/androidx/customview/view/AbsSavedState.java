package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new Parcelable.ClassLoaderCreator<AbsSavedState>() {
        /* class androidx.customview.view.AbsSavedState.C08322 */

        static {
            Covode.recordClassIndex(916);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AbsSavedState[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m2959a(parcel, null);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m2959a(parcel, classLoader);
        }

        /* renamed from: a */
        private static AbsSavedState m2959a(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f3088c;
            }
            throw new IllegalStateException("superState must be null");
        }
    };

    /* renamed from: c */
    public static final AbsSavedState f3088c = new AbsSavedState() {
        /* class androidx.customview.view.AbsSavedState.C08311 */

        static {
            Covode.recordClassIndex(915);
        }
    };

    /* renamed from: d */
    public final Parcelable f3089d;

    public int describeContents() {
        return 0;
    }

    private AbsSavedState() {
    }

    static {
        Covode.recordClassIndex(914);
    }

    /* synthetic */ AbsSavedState(byte b) {
        this();
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3089d = parcelable == f3088c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3089d, i);
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3089d = readParcelable == null ? f3088c : readParcelable;
    }
}
