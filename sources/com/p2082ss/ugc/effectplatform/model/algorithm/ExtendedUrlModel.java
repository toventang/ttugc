package com.p2082ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel */
public class ExtendedUrlModel {
    private String uri;
    private List<String> url_list;
    private List<String> zip_url_list;

    static {
        Covode.recordClassIndex(102556);
    }

    public ExtendedUrlModel() {
        this(null, null, null, 7, null);
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public List<String> getZip_url_list() {
        return this.zip_url_list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        C89219l.m154719c(list, "");
        this.url_list = list;
    }

    public void setZip_url_list(List<String> list) {
        C89219l.m154719c(list, "");
        this.zip_url_list = list;
    }

    public final List<String> getUrl(EnumC86835b bVar) {
        C89219l.m154719c(bVar, "");
        int i = C86834a.f195754a[bVar.ordinal()];
        if (i == 1) {
            return getZip_url_list();
        }
        if (i == 2) {
            return getUrl_list();
        }
        throw new C89376n();
    }

    public ExtendedUrlModel(List<String> list, String str, List<String> list2) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        this.url_list = list;
        this.uri = str;
        this.zip_url_list = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExtendedUrlModel(List list, String str, List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
