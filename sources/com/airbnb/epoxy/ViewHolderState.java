package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.p025c.C0489d;
import com.bytedance.covode.number.Covode;

class ViewHolderState extends C0489d<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new Parcelable.Creator<ViewHolderState>() {
        /* class com.airbnb.epoxy.ViewHolderState.C18901 */

        static {
            Covode.recordClassIndex(2080);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ViewHolderState[] newArray(int i) {
            return new ViewHolderState[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ViewHolderState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(readInt, (byte) 0);
            for (int i = 0; i < readInt; i++) {
                viewHolderState.mo2083b(parcel.readLong(), parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }
    };

    public int describeContents() {
        return 0;
    }

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new Parcelable.ClassLoaderCreator<ViewState>() {
            /* class com.airbnb.epoxy.ViewHolderState.ViewState.C18911 */

            static {
                Covode.recordClassIndex(2082);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ViewState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m6073a(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m6073a(parcel, classLoader);
            }

            /* renamed from: a */
            private static ViewState m6073a(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(classLoader), (byte) 0);
            }
        };

        public int describeContents() {
            return 0;
        }

        ViewState() {
        }

        static {
            Covode.recordClassIndex(2081);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.os.Parcelable[] */
        /* JADX WARN: Multi-variable type inference failed */
        public void writeToParcel(Parcel parcel, int i) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = keyAt(i2);
                parcelableArr[i2] = valueAt(i2);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        private ViewState(int i, int[] iArr, Parcelable[] parcelableArr) {
            super(i);
            for (int i2 = 0; i2 < i; i2++) {
                put(iArr[i2], parcelableArr[i2]);
            }
        }

        /* synthetic */ ViewState(int i, int[] iArr, Parcelable[] parcelableArr, byte b) {
            this(i, iArr, parcelableArr);
        }
    }

    ViewHolderState() {
    }

    static {
        Covode.recordClassIndex(2079);
    }

    private ViewHolderState(int i) {
        super(i);
    }

    /* synthetic */ ViewHolderState(int i, byte b) {
        this(i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = mo2080b();
        parcel.writeInt(b);
        for (int i2 = 0; i2 < b; i2++) {
            parcel.writeLong(mo2081b(i2));
            parcel.writeParcelable((Parcelable) mo2085c(i2), 0);
        }
    }
}
