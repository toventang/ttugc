package com.p2082ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.model.ExtendedUrlModelTemplate */
public class ExtendedUrlModelTemplate extends ExtendedUrlModel implements Serializable {
    private final transient ExtendedUrlModel kUrlModel;
    private List<String> urlList;
    private List<String> zipUrlList;

    static {
        Covode.recordClassIndex(95771);
    }

    public ExtendedUrlModelTemplate() {
        this(null, 1, null);
    }

    public ExtendedUrlModel getKUrlModel() {
        return this.kUrlModel;
    }

    public List<String> getUrlList() {
        List<String> url_list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (url_list = kUrlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    public List<String> getZipUrlList() {
        List<String> zip_url_list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 == null || (zip_url_list = kUrlModel2.getZip_url_list()) == null) {
            return super.getZip_url_list();
        }
        return zip_url_list;
    }

    public ExtendedUrlModelTemplate(ExtendedUrlModel extendedUrlModel) {
        super(null, null, null, 7, null);
        this.kUrlModel = extendedUrlModel;
        this.zipUrlList = new ArrayList();
        this.urlList = new ArrayList();
    }

    public void setUrlList(List<String> list) {
        C89219l.m154719c(list, "");
        this.urlList = list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    public void setZipUrlList(List<String> list) {
        C89219l.m154719c(list, "");
        this.zipUrlList = list;
        ExtendedUrlModel kUrlModel2 = getKUrlModel();
        if (kUrlModel2 != null) {
            kUrlModel2.setZip_url_list(list);
        }
        super.setZip_url_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModelTemplate(ExtendedUrlModel extendedUrlModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : extendedUrlModel);
    }
}
