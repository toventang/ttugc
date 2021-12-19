package com.p2082ss.android.ugc.effectmanager.effect.model.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse */
public final class FetchFavoriteListResponse extends FetchFavoriteListResponseTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel;

    static {
        Covode.recordClassIndex(95607);
    }

    public FetchFavoriteListResponse() {
        this(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse$Data */
    public static final class Data extends FetchFavoriteListResponseTemplate.DataTemplate implements Serializable {
        private final transient FetchFavoriteListResponse.Data kData;

        static {
            Covode.recordClassIndex(95608);
        }

        public Data() {
            this(null, 1, null);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.DataTemplate
        public final FetchFavoriteListResponse.Data getKData() {
            return this.kData;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final List<Effect> getBind_effects() {
            List<Effect> bind_effects;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (bind_effects = kData2.getBind_effects()) == null) {
                return super.getBind_effects();
            }
            return bind_effects;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final List<Effect> getCollection() {
            List<Effect> collection;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (collection = kData2.getCollection()) == null) {
                return super.getCollection();
            }
            return collection;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final List<Effect> getEffects() {
            List<Effect> effects;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (effects = kData2.getEffects()) == null) {
                return super.getEffects();
            }
            return effects;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final String getType() {
            String type;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (type = kData2.getType()) == null) {
                return super.getType();
            }
            return type;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final List<String> getUrl_prefix() {
            List<String> url_prefix;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 == null || (url_prefix = kData2.getUrl_prefix()) == null) {
                return super.getUrl_prefix();
            }
            return url_prefix;
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final void setBind_effects(List<? extends Effect> list) {
            C89219l.m154719c(list, "");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setBind_effects(list);
            }
            super.setBind_effects(list);
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final void setCollection(List<? extends Effect> list) {
            C89219l.m154719c(list, "");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setCollection(list);
            }
            super.setCollection(list);
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final void setEffects(List<? extends Effect> list) {
            C89219l.m154719c(list, "");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setEffects(list);
            }
            super.setEffects(list);
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final void setType(String str) {
            C89219l.m154719c(str, "");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setType(str);
            }
            super.setType(str);
        }

        @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public final void setUrl_prefix(List<String> list) {
            C89219l.m154719c(list, "");
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                kData2.setUrl_prefix(list);
            }
            super.setUrl_prefix(list);
        }

        public Data(FetchFavoriteListResponse.Data data) {
            super(data);
            this.kData = data;
            FetchFavoriteListResponse.Data kData2 = getKData();
            if (kData2 != null) {
                List<Effect> bind_effects = kData2.getBind_effects();
                if (bind_effects != null) {
                    super.setBind_effects(bind_effects);
                }
                List<Effect> collection = kData2.getCollection();
                if (collection != null) {
                    super.setCollection(collection);
                }
                List<Effect> effects = kData2.getEffects();
                if (effects != null) {
                    super.setEffects(effects);
                }
                String type = kData2.getType();
                if (type != null) {
                    super.setType(type);
                }
                List<String> url_prefix = kData2.getUrl_prefix();
                if (url_prefix != null) {
                    super.setUrl_prefix(url_prefix);
                }
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(FetchFavoriteListResponse.Data data, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : data);
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public final com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse getKFavoriteModel() {
        return this.kFavoriteModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public final List<com.p2082ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public final List<com.p2082ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        return super.getCollectEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public final List<com.p2082ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public final String getType() {
        return super.getType();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public final List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public final int getStatus_code() {
        com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            return kFavoriteModel2.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public final List<FetchFavoriteListResponse.Data> getData() {
        List<FetchFavoriteListResponse.Data> data;
        com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 == null || (data = kFavoriteModel2.getData()) == null) {
            return super.getData();
        }
        return data;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public final String getMessage() {
        String message;
        com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 == null || (message = kFavoriteModel2.getMessage()) == null) {
            return super.getMessage();
        }
        return message;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public final void setEffects(List<? extends com.p2082ss.android.ugc.effectmanager.effect.model.Effect> list) {
        C89219l.m154719c(list, "");
        super.setEffects(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public final void setMessage(String str) {
        com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            kFavoriteModel2.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public final void setStatus_code(int i) {
        com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            kFavoriteModel2.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public final void setData(List<? extends FetchFavoriteListResponse.Data> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            kFavoriteModel2.setData(list);
        }
        super.setData(list);
    }

    public FetchFavoriteListResponse(com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse fetchFavoriteListResponse) {
        super(fetchFavoriteListResponse);
        this.kFavoriteModel = fetchFavoriteListResponse;
        com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 != null) {
            List<Effect> collection_effects = kFavoriteModel2.getCollection_effects();
            if (collection_effects != null) {
                super.setCollection_effects(collection_effects);
            }
            List<FetchFavoriteListResponse.Data> data = kFavoriteModel2.getData();
            if (data != null) {
                super.setData(data);
            }
            List<Effect> effect_list = kFavoriteModel2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            String message = kFavoriteModel2.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kFavoriteModel2.getStatus_code());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchFavoriteListResponse(com.p2082ss.ugc.effectplatform.model.net.FetchFavoriteListResponse fetchFavoriteListResponse, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : fetchFavoriteListResponse);
    }
}
