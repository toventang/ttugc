package com.p2082ss.android.ugc.effectmanager.effect.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.logger.EPLog;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse$Companion$CREATOR$1 */
public final class EffectCategoryResponse$Companion$CREATOR$1 implements Parcelable.Creator<EffectCategoryResponse> {
    static {
        Covode.recordClassIndex(95582);
    }

    EffectCategoryResponse$Companion$CREATOR$1() {
    }

    @Override // android.os.Parcelable.Creator
    public final EffectCategoryResponse[] newArray(int i) {
        return new EffectCategoryResponse[i];
    }

    @Override // android.os.Parcelable.Creator
    public final EffectCategoryResponse createFromParcel(Parcel parcel) {
        Object obj;
        C89219l.m154719c(parcel, "");
        EffectCategoryResponse effectCategoryResponse = null;
        try {
            Object obj2 = EffectCategoryResponse.class.getField("CREATOR").get(null);
            if (!(obj2 instanceof Parcelable.Creator)) {
                obj2 = null;
            }
            Parcelable.Creator creator = (Parcelable.Creator) obj2;
            if (creator != null) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            if (!(obj instanceof EffectCategoryResponse)) {
                obj = null;
            }
            effectCategoryResponse = (EffectCategoryResponse) obj;
        } catch (Exception e) {
            EPLog.m141900e("createFromParcel", "get creator failed!", e);
        }
        return new EffectCategoryResponse(effectCategoryResponse);
    }
}
