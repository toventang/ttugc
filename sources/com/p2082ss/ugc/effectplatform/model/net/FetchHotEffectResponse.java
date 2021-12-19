package com.p2082ss.ugc.effectplatform.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.AbstractC86845h;
import com.p2082ss.ugc.effectplatform.model.CategoryEffectModel;
import com.p2082ss.ugc.effectplatform.model.Effect;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse */
public class FetchHotEffectResponse extends AbstractC86845h<FetchHotEffectResponse> {
    private Data data;
    private boolean isFromCache;
    private String message;
    private int status_code;

    static {
        Covode.recordClassIndex(102582);
    }

    public FetchHotEffectResponse() {
        this(null, null, 0, 7, null);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public FetchHotEffectResponse getResponseData() {
        return this;
    }

    /* renamed from: com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse$Data */
    public static class Data {
        private final CategoryEffectModel category_effects;
        private final Extra extra;
        private List<String> url_prefix;

        static {
            Covode.recordClassIndex(102583);
        }

        public Data() {
            this(null, null, null, 7, null);
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public List<Effect> getCollection() {
            return this.category_effects.getCollection();
        }

        public List<Effect> getEffects() {
            return this.category_effects.getCategory_effects();
        }

        public String getRecId() {
            Extra extra2 = this.extra;
            if (extra2 != null) {
                return extra2.getRec_id();
            }
            return null;
        }

        public void setRecId(String str) {
            Extra extra2 = this.extra;
            if (extra2 != null) {
                extra2.setRec_id(str);
            }
        }

        public void setUrl_prefix(List<String> list) {
            C89219l.m154719c(list, "");
            this.url_prefix = list;
        }

        public void setCollection(List<? extends Effect> list) {
            C89219l.m154719c(list, "");
            this.category_effects.setCollection(list);
        }

        public void setEffects(List<? extends Effect> list) {
            C89219l.m154719c(list, "");
            this.category_effects.setCategory_effects(list);
        }

        public Data(CategoryEffectModel categoryEffectModel, Extra extra2, List<String> list) {
            C89219l.m154719c(categoryEffectModel, "");
            C89219l.m154719c(list, "");
            this.category_effects = categoryEffectModel;
            this.extra = extra2;
            this.url_prefix = list;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Data(com.p2082ss.ugc.effectplatform.model.CategoryEffectModel r16, com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra r17, java.util.List r18, int r19, p4600h.p4611f.p4613b.C89214g r20) {
            /*
                r15 = this;
                r2 = r17
                r1 = r18
                r4 = r16
                r0 = r19 & 1
                if (r0 == 0) goto L_0x001a
                com.ss.ugc.effectplatform.model.CategoryEffectModel r4 = new com.ss.ugc.effectplatform.model.CategoryEffectModel
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 255(0xff, float:3.57E-43)
                r14 = 0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            L_0x001a:
                r0 = r19 & 2
                if (r0 == 0) goto L_0x0025
                com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse$Extra r2 = new com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse$Extra
                r3 = 0
                r0 = 1
                r2.<init>(r3, r0, r3)
            L_0x0025:
                r0 = r19 & 4
                if (r0 == 0) goto L_0x0033
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0 = r15
            L_0x002f:
                r15.<init>(r4, r2, r1)
                return
            L_0x0033:
                r0 = r15
                goto L_0x002f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data.<init>(com.ss.ugc.effectplatform.model.CategoryEffectModel, com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse$Extra, java.util.List, int, h.f.b.g):void");
        }
    }

    /* renamed from: com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse$Extra */
    public static class Extra {
        private String rec_id;

        static {
            Covode.recordClassIndex(102584);
        }

        public Extra() {
            this(null, 1, null);
        }

        public String getRec_id() {
            return this.rec_id;
        }

        public void setRec_id(String str) {
            this.rec_id = str;
        }

        public Extra(String str) {
            this.rec_id = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Extra(String str, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public Data getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public int getStatusCode() {
        return getStatus_code();
    }

    public final List<Effect> getCollection_list() {
        return getData().getCollection();
    }

    public final List<Effect> getEffect_list() {
        return getData().getEffects();
    }

    public String getRecId() {
        Data data2 = getData();
        if (data2 != null) {
            return data2.getRecId();
        }
        return null;
    }

    public List<String> getUrlPrefix() {
        return getData().getUrl_prefix();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.AbstractC86845h
    public boolean checkValue() {
        List<Effect> effect_list = getEffect_list();
        if (effect_list == null || !(!effect_list.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void setFromCache(boolean z) {
        this.isFromCache = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setData(Data data2) {
        C89219l.m154719c(data2, "");
        this.data = data2;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        getData().setCollection(list);
    }

    public final void setEffect_list(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        getData().setEffects(list);
    }

    public void setRecId(String str) {
        Data data2 = getData();
        if (data2 != null) {
            data2.setRecId(str);
        }
    }

    public void setUrlPrefix(List<String> list) {
        C89219l.m154719c(list, "");
        Data data2 = getData();
        if (data2 != null) {
            data2.setUrl_prefix(list);
        }
    }

    public FetchHotEffectResponse(Data data2, String str, int i) {
        C89219l.m154719c(data2, "");
        this.data = data2;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchHotEffectResponse(Data data2, String str, int i, int i2, C89214g gVar) {
        this((i2 & 1) != 0 ? new Data(null, null, null, 7, null) : data2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
