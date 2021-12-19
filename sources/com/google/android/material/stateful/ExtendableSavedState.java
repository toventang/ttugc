package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() {
        /* class com.google.android.material.stateful.ExtendableSavedState.C267131 */

        static {
            Covode.recordClassIndex(32177);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ExtendableSavedState[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, (byte) 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (byte) 0);
        }
    };

    /* renamed from: a */
    public final C0497g<String, Bundle> f63285a;

    static {
        Covode.recordClassIndex(32176);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f63285a + "}";
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f63285a = new C0497g<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f63285a = new C0497g<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f63285a.put(strArr[i], bundleArr[i]);
        }
    }

    @Override // androidx.customview.view.AbsSavedState
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.f63285a.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = this.f63285a.mo2162b(i2);
            bundleArr[i2] = this.f63285a.mo2163c(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }
}
