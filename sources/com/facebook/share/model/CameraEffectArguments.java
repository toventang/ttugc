package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class CameraEffectArguments implements ShareModel {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new Parcelable.Creator<CameraEffectArguments>() {
        /* class com.facebook.share.model.CameraEffectArguments.C249681 */

        static {
            Covode.recordClassIndex(30273);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }
    };

    /* renamed from: a */
    public final Bundle f59230a;

    /* renamed from: com.facebook.share.model.CameraEffectArguments$a */
    public static class C24969a {

        /* renamed from: a */
        public Bundle f59231a = new Bundle();

        static {
            Covode.recordClassIndex(30274);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30272);
    }

    private CameraEffectArguments(C24969a aVar) {
        this.f59230a = aVar.f59231a;
    }

    CameraEffectArguments(Parcel parcel) {
        this.f59230a = parcel.readBundle(getClass().getClassLoader());
    }

    /* synthetic */ CameraEffectArguments(C24969a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static Object m47897a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f59230a);
    }
}
