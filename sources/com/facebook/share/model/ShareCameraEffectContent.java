package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;

public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new Parcelable.Creator<ShareCameraEffectContent>() {
        /* class com.facebook.share.model.ShareCameraEffectContent.C249721 */

        static {
            Covode.recordClassIndex(30279);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }
    };

    /* renamed from: a */
    public String f59234a;

    /* renamed from: b */
    public CameraEffectArguments f59235b;

    /* renamed from: c */
    public CameraEffectTextures f59236c;

    static {
        Covode.recordClassIndex(30278);
    }

    ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f59234a = parcel.readString();
        CameraEffectArguments.C24969a aVar = new CameraEffectArguments.C24969a();
        CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
        if (cameraEffectArguments != null) {
            aVar.f59231a.putAll(cameraEffectArguments.f59230a);
        }
        this.f59235b = new CameraEffectArguments(aVar, (byte) 0);
        CameraEffectTextures.C24971a aVar2 = new CameraEffectTextures.C24971a();
        CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
        if (cameraEffectTextures != null) {
            aVar2.f59233a.putAll(cameraEffectTextures.f59232a);
        }
        this.f59236c = new CameraEffectTextures(aVar2, (byte) 0);
    }

    @Override // com.facebook.share.model.ShareContent
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f59234a);
        parcel.writeParcelable(this.f59235b, 0);
        parcel.writeParcelable(this.f59236c, 0);
    }
}
