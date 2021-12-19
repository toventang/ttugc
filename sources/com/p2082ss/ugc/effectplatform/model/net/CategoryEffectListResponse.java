package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.CategoryPageModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.CategoryEffectListResponse */
public final class CategoryEffectListResponse extends AbstractC86845h<CategoryPageModel> {
    private CategoryPageModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102572);
    }

    public CategoryEffectListResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ CategoryEffectListResponse copy$default(CategoryEffectListResponse categoryEffectListResponse, CategoryPageModel categoryPageModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            categoryPageModel = categoryEffectListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = categoryEffectListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = categoryEffectListResponse.status_code;
        }
        return categoryEffectListResponse.copy(categoryPageModel, str, i);
    }

    public final CategoryPageModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final CategoryEffectListResponse copy(CategoryPageModel categoryPageModel, String str, int i) {
        return new CategoryEffectListResponse(categoryPageModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryEffectListResponse)) {
            return false;
        }
        CategoryEffectListResponse categoryEffectListResponse = (CategoryEffectListResponse) obj;
        return C89219l.m154714a(this.data, categoryEffectListResponse.data) && C89219l.m154714a(this.message, categoryEffectListResponse.message) && this.status_code == categoryEffectListResponse.status_code;
    }

    public final int hashCode() {
        CategoryPageModel categoryPageModel = this.data;
        int i = 0;
        int hashCode = (categoryPageModel != null ? categoryPageModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "CategoryEffectListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final CategoryPageModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final CategoryPageModel getResponseData() {
        return this.data;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final String getResponseMessage() {
        return this.message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final boolean checkValue() {
        CategoryPageModel categoryPageModel = this.data;
        if (categoryPageModel == null || categoryPageModel.getCategory_effects() == null) {
            return false;
        }
        return true;
    }

    public final void setData(CategoryPageModel categoryPageModel) {
        this.data = categoryPageModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i) {
        this.data = categoryPageModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryEffectListResponse(CategoryPageModel categoryPageModel, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : categoryPageModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
