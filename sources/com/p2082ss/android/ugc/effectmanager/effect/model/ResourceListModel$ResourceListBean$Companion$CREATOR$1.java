package com.p2082ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p2082ss.ugc.effectplatform.model.ResourceListModel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean$Companion$CREATOR$1 */
public final class ResourceListModel$ResourceListBean$Companion$CREATOR$1 implements Parcelable.Creator<ResourceListModel.ResourceListBean> {
    static {
        Covode.recordClassIndex(95600);
    }

    ResourceListModel$ResourceListBean$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final ResourceListModel.ResourceListBean[] newArray(int i) {
        return new ResourceListModel.ResourceListBean[i];
    }

    @Override // android.os.Parcelable.Creator
    public final ResourceListModel.ResourceListBean createFromParcel(Parcel parcel) {
        Object obj;
        C89219l.m154719c(parcel, "");
        ResourceListModel.ResourceListBean resourceListBean = null;
        try {
            Object obj2 = ResourceListModel.ResourceListBean.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof ResourceListModel.ResourceListBean)) {
                obj = null;
            }
            resourceListBean = (ResourceListModel.ResourceListBean) obj;
        } catch (Exception e) {
            EPLog.m141900e("createFromParcel", "get creator failed!", e);
        }
        return new ResourceListModel.ResourceListBean(resourceListBean);
    }
}
