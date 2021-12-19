package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public abstract class ShareMedia implements ShareModel {

    /* renamed from: a */
    final Bundle f59260a;

    static {
        Covode.recordClassIndex(30288);
    }

    /* renamed from: a */
    public abstract EnumC24979b mo40842a();

    public int describeContents() {
        return 0;
    }

    /* renamed from: com.facebook.share.model.ShareMedia$b */
    public enum EnumC24979b {
        PHOTO,
        VIDEO;

        static {
            Covode.recordClassIndex(30290);
        }
    }

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    public static abstract class AbstractC24978a<M extends ShareMedia, B extends AbstractC24978a> {

        /* renamed from: a */
        public Bundle f59261a = new Bundle();

        static {
            Covode.recordClassIndex(30289);
        }

        /* renamed from: a */
        public B mo40845a(M m) {
            if (m == null) {
                return this;
            }
            this.f59261a.putAll(new Bundle(m.f59260a));
            return this;
        }
    }

    ShareMedia(Parcel parcel) {
        this.f59260a = parcel.readBundle();
    }

    protected ShareMedia(AbstractC24978a aVar) {
        this.f59260a = new Bundle(aVar.f59261a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f59260a);
    }
}
