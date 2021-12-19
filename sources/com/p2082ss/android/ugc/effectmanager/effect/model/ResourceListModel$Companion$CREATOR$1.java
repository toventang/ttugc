package com.p2082ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.ugc.effectplatform.model.ResourceListModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$Companion$CREATOR$1 */
public final class ResourceListModel$Companion$CREATOR$1 implements Parcelable.Creator<ResourceListModel> {
    static {
        Covode.recordClassIndex(95597);
    }

    ResourceListModel$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final ResourceListModel[] newArray(int i) {
        return new ResourceListModel[i];
    }

    @Override // android.os.Parcelable.Creator
    public final ResourceListModel createFromParcel(Parcel parcel) {
        Object obj;
        C89219l.m154719c(parcel, "");
        ResourceListModel resourceListModel = null;
        try {
            Object obj2 = ResourceListModel.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof ResourceListModel)) {
                obj = null;
            }
            resourceListModel = (ResourceListModel) obj;
        } catch (Exception e) {
            EPLog.m141900e("createFromParcel", "get creator failed!", e);
        }
        return new ResourceListModel(resourceListModel);
    }
}
