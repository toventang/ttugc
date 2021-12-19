package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.facebook.share.model.ShareOpenGraphValueContainer;

public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, C24990a> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new Parcelable.Creator<ShareOpenGraphAction>() {
        /* class com.facebook.share.model.ShareOpenGraphAction.C249891 */

        static {
            Covode.recordClassIndex(30309);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }
    };

    static {
        Covode.recordClassIndex(30308);
    }

    ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }

    private ShareOpenGraphAction(C24990a aVar) {
        super(aVar);
    }

    /* renamed from: com.facebook.share.model.ShareOpenGraphAction$a */
    public static final class C24990a extends ShareOpenGraphValueContainer.AbstractC24993a<ShareOpenGraphAction, C24990a> {
        static {
            Covode.recordClassIndex(30310);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C24990a mo40865a(ShareOpenGraphAction shareOpenGraphAction) {
            if (shareOpenGraphAction == null) {
                return this;
            }
            C24990a aVar = (C24990a) super.mo40865a((ShareOpenGraphValueContainer) shareOpenGraphAction);
            aVar.f59290a.putString("og:type", shareOpenGraphAction.mo40871b("og:type"));
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C24990a mo40864a(Parcel parcel) {
            return mo40865a((ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader()));
        }
    }

    /* synthetic */ ShareOpenGraphAction(C24990a aVar, byte b) {
        this(aVar);
    }
}
