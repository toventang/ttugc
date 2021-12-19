package androidx.core.p033d;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.d.e */
public final class C0651e {
    static {
        Covode.recordClassIndex(730);
    }

    /* renamed from: androidx.core.d.e$a */
    static class C0652a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a */
        private final AbstractC0653f<T> f2648a;

        static {
            Covode.recordClassIndex(731);
        }

        C0652a(AbstractC0653f<T> fVar) {
            this.f2648a = fVar;
        }

        @Override // android.os.Parcelable.Creator
        public final T createFromParcel(Parcel parcel) {
            return this.f2648a.mo2682a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final T[] newArray(int i) {
            return this.f2648a.mo2683a(i);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f2648a.mo2682a(parcel, classLoader);
        }
    }

    /* renamed from: a */
    public static <T> Parcelable.Creator<T> m2387a(AbstractC0653f<T> fVar) {
        return new C0652a(fVar);
    }
}
