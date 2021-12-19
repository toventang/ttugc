package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.ResourceListModel;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.ResourceListResponse */
public final class ResourceListResponse extends AbstractC86845h<ResourceListModel> {
    private ResourceListModel data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102599);
    }

    public ResourceListResponse() {
        this(null, null, 0, 7, null);
    }

    private final ResourceListModel component1() {
        return this.data;
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ ResourceListResponse copy$default(ResourceListResponse resourceListResponse, ResourceListModel resourceListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resourceListModel = resourceListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = resourceListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = resourceListResponse.status_code;
        }
        return resourceListResponse.copy(resourceListModel, str, i);
    }

    public final int component3() {
        return this.status_code;
    }

    public final ResourceListResponse copy(ResourceListModel resourceListModel, String str, int i) {
        return new ResourceListResponse(resourceListModel, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceListResponse)) {
            return false;
        }
        ResourceListResponse resourceListResponse = (ResourceListResponse) obj;
        return C89219l.m154714a(this.data, resourceListResponse.data) && C89219l.m154714a(this.message, resourceListResponse.message) && this.status_code == resourceListResponse.status_code;
    }

    public final int hashCode() {
        ResourceListModel resourceListModel = this.data;
        int i = 0;
        int hashCode = (resourceListModel != null ? resourceListModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "ResourceListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final ResourceListModel getResponseData() {
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
        ResourceListModel resourceListModel = this.data;
        if (resourceListModel == null || resourceListModel.getResource_list() == null) {
            return false;
        }
        return true;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ResourceListResponse(ResourceListModel resourceListModel, String str, int i) {
        this.data = resourceListModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListResponse(ResourceListModel resourceListModel, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : resourceListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
