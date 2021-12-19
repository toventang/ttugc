package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryPageModel;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse */
public class CategoryEffectListResponse extends BaseNetResponse {
    private CategoryPageModel data;

    static {
        Covode.recordClassIndex(95603);
    }

    public CategoryPageModel getData() {
        return this.data;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.BaseNetResponse
    public boolean checkValue() {
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null || categoryPageModel.getCategoryEffects() == null) {
            return false;
        }
        return true;
    }

    public String getRecId() {
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null) {
            return null;
        }
        return categoryPageModel.getRecId();
    }

    public void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }
}
