package com.p2082ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.common.model.UrlModel */
public class UrlModel extends UrlModelTemplate implements Parcelable, Serializable {
    public static final Parcelable.Creator<UrlModel> CREATOR = new UrlModel$Companion$CREATOR$1();
    public static final Companion Companion = new Companion(null);
    private final transient com.p2082ss.ugc.effectplatform.model.UrlModel urlModel;

    public UrlModel() {
        this(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.model.UrlModel$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(95482);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public com.p2082ss.ugc.effectplatform.model.UrlModel getUrlModel() {
        return this.urlModel;
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public List<String> getUrlList() {
        return super.getUrlList();
    }

    static {
        Covode.recordClassIndex(95481);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.UrlModel
    public String getUri() {
        String uri;
        com.p2082ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 == null || (uri = urlModel2.getUri()) == null) {
            return super.getUri();
        }
        return uri;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.UrlModel
    public List<String> getUrl_list() {
        List<String> url_list;
        com.p2082ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 == null || (url_list = urlModel2.getUrl_list()) == null) {
            return super.getUrl_list();
        }
        return url_list;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.UrlModel
    public void setUri(String str) {
        com.p2082ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            urlModel2.setUri(str);
        }
        super.setUri(str);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public void setUrlList(List<String> list) {
        C89219l.m154719c(list, "");
        super.setUrlList(list);
    }

    public UrlModel(com.p2082ss.ugc.effectplatform.model.UrlModel urlModel2) {
        super(urlModel2);
        this.urlModel = urlModel2;
        com.p2082ss.ugc.effectplatform.model.UrlModel urlModel3 = getUrlModel();
        if (urlModel3 != null) {
            String uri = urlModel3.getUri();
            if (uri != null) {
                super.setUri(uri);
            }
            List<String> url_list = urlModel3.getUrl_list();
            if (url_list != null) {
                super.setUrl_list(url_list);
            }
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.model.UrlModel
    public void setUrl_list(List<String> list) {
        C89219l.m154719c(list, "");
        com.p2082ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
        if (urlModel2 != null) {
            urlModel2.setUrl_list(list);
        }
        super.setUrl_list(list);
    }

    @Override // com.p2082ss.ugc.effectplatform.model.UrlModel, com.p2082ss.android.ugc.effectmanager.common.model.UrlModelTemplate
    public void writeToParcel(Parcel parcel, int i) {
        C89219l.m154719c(parcel, "");
        if (getUrlModel() != null) {
            com.p2082ss.ugc.effectplatform.model.UrlModel urlModel2 = getUrlModel();
            if (urlModel2 != null) {
                urlModel2.writeToParcel(parcel, i);
                return;
            }
            return;
        }
        super.writeToParcel(parcel, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UrlModel(com.p2082ss.ugc.effectplatform.model.UrlModel urlModel2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : urlModel2);
    }
}
