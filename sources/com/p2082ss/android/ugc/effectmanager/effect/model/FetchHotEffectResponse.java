package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse */
public final class FetchHotEffectResponse extends FetchHotEffectResponseTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel;

    static {
        Covode.recordClassIndex(95587);
    }

    public FetchHotEffectResponse() {
        this(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse$Data */
    public static final class Data extends FetchHotEffectResponseTemplate.DataTemplate implements Serializable {
        private final transient FetchHotEffectResponse.Data kData;

        static {
            Covode.recordClassIndex(95588);
        }

        public Data() {
            this(null, 1, null);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.DataTemplate
        public final FetchHotEffectResponse.Data getKData() {
            return this.kData;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final List<Effect> getCollection() {
            List<Effect> collection;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (collection = kData2.getCollection()) == null) {
                return super.getCollection();
            }
            return collection;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final List<Effect> getEffects() {
            List<Effect> effects;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (effects = kData2.getEffects()) == null) {
                return super.getEffects();
            }
            return effects;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final String getRecId() {
            String recId;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (recId = kData2.getRecId()) == null) {
                return super.getRecId();
            }
            return recId;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final List<String> getUrl_prefix() {
            List<String> url_prefix;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 == null || (url_prefix = kData2.getUrl_prefix()) == null) {
                return super.getUrl_prefix();
            }
            return url_prefix;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final void setRecId(String str) {
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setRecId(str);
            }
            super.setRecId(str);
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final void setCollection(List<? extends Effect> list) {
            C89219l.m154719c(list, "");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setCollection(list);
            }
            super.setCollection(list);
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final void setEffects(List<? extends Effect> list) {
            C89219l.m154719c(list, "");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setEffects(list);
            }
            super.setEffects(list);
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public final void setUrl_prefix(List<String> list) {
            C89219l.m154719c(list, "");
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setUrl_prefix(list);
            }
            super.setUrl_prefix(list);
        }

        public Data(FetchHotEffectResponse.Data data) {
            super(data);
            this.kData = data;
            FetchHotEffectResponse.Data kData2 = getKData();
            if (kData2 != null) {
                List<Effect> collection = kData2.getCollection();
                if (collection != null) {
                    super.setCollection(collection);
                }
                List<Effect> effects = kData2.getEffects();
                if (effects != null) {
                    super.setEffects(effects);
                }
                String recId = kData2.getRecId();
                if (recId != null) {
                    super.setRecId(recId);
                }
                List<String> url_prefix = kData2.getUrl_prefix();
                if (url_prefix != null) {
                    super.setUrl_prefix(url_prefix);
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(FetchHotEffectResponse.Data data, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : data);
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.FetchHotEffectResponse$Extra */
    public static final class Extra extends FetchHotEffectResponseTemplate.ExtraTemplate implements Serializable {
        private final transient FetchHotEffectResponse.Extra kData;

        static {
            Covode.recordClassIndex(95589);
        }

        public Extra() {
            this(null, 1, null);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.ExtraTemplate
        public final FetchHotEffectResponse.Extra getKData() {
            return this.kData;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra
        public final String getRec_id() {
            String rec_id;
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 == null || (rec_id = kData2.getRec_id()) == null) {
                return super.getRec_id();
            }
            return rec_id;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra
        public final void setRec_id(String str) {
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 != null) {
                kData2.setRec_id(str);
            }
            super.setRec_id(str);
        }

        public Extra(FetchHotEffectResponse.Extra extra) {
            super(extra);
            String rec_id;
            this.kData = extra;
            FetchHotEffectResponse.Extra kData2 = getKData();
            if (kData2 != null && (rec_id = kData2.getRec_id()) != null) {
                super.setRec_id(rec_id);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Extra(FetchHotEffectResponse.Extra extra, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : extra);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public final com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse getKFetchHotModel() {
        return this.kFetchHotModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public final List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public final List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final int getStatus_code() {
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            return kFetchHotModel2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final FetchHotEffectResponse.Data getData() {
        FetchHotEffectResponse.Data data;
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (data = kFetchHotModel2.getData()) == null) {
            return super.getData();
        }
        return data;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final String getMessage() {
        String message;
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (message = kFetchHotModel2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final String getRecId() {
        String recId;
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (recId = kFetchHotModel2.getRecId()) == null) {
            return super.getRecId();
        }
        return recId;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final List<String> getUrlPrefix() {
        List<String> urlPrefix;
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 == null || (urlPrefix = kFetchHotModel2.getUrlPrefix()) == null) {
            return super.getUrlPrefix();
        }
        return urlPrefix;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public final void setEffects(List<? extends Effect> list) {
        C89219l.m154719c(list, "");
        super.setEffects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setMessage(String str) {
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setRecId(String str) {
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setRecId(str);
        }
        super.setRecId(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setStatus_code(int i) {
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setData(FetchHotEffectResponse.Data data) {
        C89219l.m154719c(data, "");
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setData(data);
        }
        super.setData(data);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public final void setUrlPrefix(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setUrlPrefix(list);
        }
        super.setUrlPrefix(list);
    }

    public FetchHotEffectResponse(com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse fetchHotEffectResponse) {
        super(fetchHotEffectResponse);
        this.kFetchHotModel = fetchHotEffectResponse;
        com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            List<Effect> collection_list = kFetchHotModel2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            FetchHotEffectResponse.Data data = kFetchHotModel2.getData();
            if (data != null) {
                super.setData(data);
            }
            List<Effect> effect_list = kFetchHotModel2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            super.setFromCache(kFetchHotModel2.isFromCache());
            String message = kFetchHotModel2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            String recId = kFetchHotModel2.getRecId();
            if (recId != null) {
                super.setRecId(recId);
            }
            super.setStatus_code(kFetchHotModel2.getStatus_code());
            List<String> urlPrefix = kFetchHotModel2.getUrlPrefix();
            if (urlPrefix != null) {
                super.setUrlPrefix(urlPrefix);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchHotEffectResponse(com.p2082ss.ugc.effectplatform.model.net.FetchHotEffectResponse fetchHotEffectResponse, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : fetchHotEffectResponse);
    }
}
