package com.p2082ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.model.ExtendedUrlModel */
public final class ExtendedUrlModel extends ExtendedUrlModelTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel;

    static {
        Covode.recordClassIndex(95770);
    }

    public ExtendedUrlModel() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel getKUrlModel() {
        return this.kUrlModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final List<String> getUrlList() {
        return super.getUrlList();
    }

    @Override // com.p2082ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final List<String> getZipUrlList() {
        return super.getZipUrlList();
    }

    @Override // com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final String getUri() {
        String uri;
        com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (uri = kUrlModel2.getUri()) == null) {
            return super.getUri();
        }
        return uri;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final List<String> getUrl_list() {
        List<String> url_list;
        com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (url_list = kUrlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final List<String> getZip_url_list() {
        List<String> zip_url_list;
        com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (zip_url_list = kUrlModel2.getZip_url_list()) == null) {
            return super.getZip_url_list();
        }
        return zip_url_list;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final void setUri(String str) {
        com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUri(str);
        }
        super.setUri(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final void setUrlList(List<String> list) {
        C89219l.m154719c(list, "");
        super.setUrlList(list);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate
    public final void setZipUrlList(List<String> list) {
        C89219l.m154719c(list, "");
        super.setZipUrlList(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final void setUrl_list(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel
    public final void setZip_url_list(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setZip_url_list(list);
        }
        super.setZip_url_list(list);
    }

    public ExtendedUrlModel(com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel) {
        super(extendedUrlModel);
        this.kUrlModel = extendedUrlModel;
        com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            String uri = kUrlModel2.getUri();
            if (uri != null) {
                super.setUri(uri);
            }
            List<String> url_list = kUrlModel2.getUrl_list();
            if (url_list != null) {
                super.setUrl_list(url_list);
            }
            List<String> zip_url_list = kUrlModel2.getZip_url_list();
            if (zip_url_list != null) {
                super.setZip_url_list(zip_url_list);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModel(com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel extendedUrlModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : extendedUrlModel);
    }
}
