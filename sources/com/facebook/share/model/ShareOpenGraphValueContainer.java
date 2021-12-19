package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.AbstractC24993a;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends AbstractC24993a> implements ShareModel {

    /* renamed from: a */
    public final Bundle f59289a;

    static {
        Covode.recordClassIndex(30315);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public final String mo40871b(String str) {
        return this.f59289a.getString(str);
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    public static abstract class AbstractC24993a<P extends ShareOpenGraphValueContainer, E extends AbstractC24993a> {

        /* renamed from: a */
        public Bundle f59290a = new Bundle();

        static {
            Covode.recordClassIndex(30316);
        }

        /* renamed from: a */
        public E mo40865a(P p) {
            if (p != null) {
                this.f59290a.putAll((Bundle) p.f59289a.clone());
            }
            return this;
        }
    }

    ShareOpenGraphValueContainer(Parcel parcel) {
        this.f59289a = parcel.readBundle(AbstractC24993a.class.getClassLoader());
    }

    /* renamed from: a */
    public final Object mo40870a(String str) {
        return m47906a(this.f59289a, str);
    }

    protected ShareOpenGraphValueContainer(AbstractC24993a<P, E> aVar) {
        this.f59289a = (Bundle) aVar.f59290a.clone();
    }

    /* renamed from: a */
    private static Object m47906a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f59289a);
    }
}
