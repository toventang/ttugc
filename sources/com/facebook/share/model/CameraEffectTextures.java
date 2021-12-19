package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class CameraEffectTextures implements ShareModel {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new Parcelable.Creator<CameraEffectTextures>() {
        /* class com.facebook.share.model.CameraEffectTextures.C249701 */

        static {
            Covode.recordClassIndex(30276);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }
    };

    /* renamed from: a */
    public final Bundle f59232a;

    /* renamed from: com.facebook.share.model.CameraEffectTextures$a */
    public static class C24971a {

        /* renamed from: a */
        public Bundle f59233a = new Bundle();

        static {
            Covode.recordClassIndex(30277);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30275);
    }

    private CameraEffectTextures(C24971a aVar) {
        this.f59232a = aVar.f59233a;
    }

    CameraEffectTextures(Parcel parcel) {
        this.f59232a = parcel.readBundle(getClass().getClassLoader());
    }

    /* synthetic */ CameraEffectTextures(C24971a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static Object m47898a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f59232a);
    }
}
