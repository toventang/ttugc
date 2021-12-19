package com.p2082ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.model.UrlModel$Companion$CREATOR$1 */
public final class UrlModel$Companion$CREATOR$1 implements Parcelable.Creator<UrlModel> {
    static {
        Covode.recordClassIndex(95483);
    }

    UrlModel$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final UrlModel[] newArray(int i) {
        return new UrlModel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final UrlModel createFromParcel(Parcel parcel) {
        Object obj;
        C89219l.m154719c(parcel, "");
        UrlModel urlModel = null;
        try {
            Object obj2 = UrlModel.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof UrlModel)) {
                obj = null;
            }
            urlModel = (UrlModel) obj;
        } catch (Exception e) {
            EPLog.m141900e("createFromParcel", "get creator failed!", e);
        }
        return new UrlModel(urlModel);
    }
}
