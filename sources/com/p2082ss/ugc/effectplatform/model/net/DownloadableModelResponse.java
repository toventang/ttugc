package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.DownloadableModelResponse */
public final class DownloadableModelResponse extends AbstractC86845h<Data> {
    private Data data;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102573);
    }

    public DownloadableModelResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ DownloadableModelResponse copy$default(DownloadableModelResponse downloadableModelResponse, Data data2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            data2 = downloadableModelResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = downloadableModelResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = downloadableModelResponse.status_code;
        }
        return downloadableModelResponse.copy(data2, str, i);
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final DownloadableModelResponse copy(Data data2, String str, int i) {
        return new DownloadableModelResponse(data2, str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableModelResponse)) {
            return false;
        }
        DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) obj;
        return C89219l.m154714a(this.data, downloadableModelResponse.data) && C89219l.m154714a(this.message, downloadableModelResponse.message) && this.status_code == downloadableModelResponse.status_code;
    }

    public final int hashCode() {
        Data data2 = this.data;
        int i = 0;
        int hashCode = (data2 != null ? data2.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public final String toString() {
        return "DownloadableModelResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    /* renamed from: com.ss.ugc.effectplatform.model.net.DownloadableModelResponse$Data */
    public static final class Data {
        private Map<String, ? extends List<? extends ModelInfo>> arithmetics;

        static {
            Covode.recordClassIndex(102574);
        }

        public Data() {
            this(null, 1, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.ugc.effectplatform.model.net.DownloadableModelResponse$Data */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = data.arithmetics;
            }
            return data.copy(map);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.ss.ugc.effectplatform.model.algorithm.ModelInfo>>, java.util.Map<java.lang.String, java.util.List<com.ss.ugc.effectplatform.model.algorithm.ModelInfo>> */
        public final Map<String, List<ModelInfo>> component1() {
            return this.arithmetics;
        }

        public final Data copy(Map<String, ? extends List<? extends ModelInfo>> map) {
            return new Data(map);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Data) && C89219l.m154714a(this.arithmetics, ((Data) obj).arithmetics);
            }
            return true;
        }

        public final int hashCode() {
            Map<String, ? extends List<? extends ModelInfo>> map = this.arithmetics;
            if (map != null) {
                return map.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "Data(arithmetics=" + this.arithmetics + ")";
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.ss.ugc.effectplatform.model.algorithm.ModelInfo>>, java.util.Map<java.lang.String, java.util.List<com.ss.ugc.effectplatform.model.algorithm.ModelInfo>> */
        public final Map<String, List<ModelInfo>> getArithmetics() {
            return this.arithmetics;
        }

        public final void setArithmetics(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        public Data(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(Map map, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : map);
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public final Data getResponseData() {
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

    public final void setData(Data data2) {
        this.data = data2;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public DownloadableModelResponse(Data data2, String str, int i) {
        this.data = data2;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadableModelResponse(Data data2, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? null : data2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
