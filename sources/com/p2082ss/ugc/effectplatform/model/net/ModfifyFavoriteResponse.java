package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.ModfifyFavoriteResponse */
public final class ModfifyFavoriteResponse extends AbstractC86845h<List<? extends String>> {
    private List<String> data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102589);
    }

    public ModfifyFavoriteResponse() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.ModfifyFavoriteResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModfifyFavoriteResponse copy$default(ModfifyFavoriteResponse modfifyFavoriteResponse, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = modfifyFavoriteResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = modfifyFavoriteResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = modfifyFavoriteResponse.status_code;
        }
        return modfifyFavoriteResponse.copy(list, str, i);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final boolean checkValue() {
        return true;
    }

    public final List<String> component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ModfifyFavoriteResponse copy(List<String> list, String str, int i) {
        return new ModfifyFavoriteResponse(list, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModfifyFavoriteResponse)) {
            return false;
        }
        ModfifyFavoriteResponse modfifyFavoriteResponse = (ModfifyFavoriteResponse) obj;
        return C89219l.m154714a(this.data, modfifyFavoriteResponse.data) && C89219l.m154714a(this.message, modfifyFavoriteResponse.message) && this.status_code == modfifyFavoriteResponse.status_code;
    }

    public final int hashCode() {
        List<String> list = this.data;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "ModfifyFavoriteResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final List<String> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    /* Return type fixed from 'java.util.List<java.lang.String>' to match base method */
    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final List<? extends String> getResponseData() {
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

    public final void setData(List<String> list) {
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ModfifyFavoriteResponse(List<String> list, String str, int i) {
        this.data = list;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModfifyFavoriteResponse(List list, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
