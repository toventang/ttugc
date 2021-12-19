package com.p2082ss.android.ugc.effectmanager.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.p2082ss.ugc.effectplatform.model.algorithm.ModelInfo;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.model.ModelInfoTemplate */
public class ModelInfoTemplate extends ModelInfo {
    private ExtendedUrlModel fileUrl;
    private final transient ModelInfo kModelInfo;

    static {
        Covode.recordClassIndex(95775);
    }

    public ModelInfoTemplate() {
        this(null, 1, null);
    }

    public ModelInfo getKModelInfo() {
        return this.kModelInfo;
    }

    public String getMD5() {
        ExtendedUrlModel file_url = getFile_url();
        if (file_url != null) {
            return file_url.getUri();
        }
        return null;
    }

    public ExtendedUrlModel getFileUrl() {
        ExtendedUrlModel extendedUrlModel;
        ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 == null || (extendedUrlModel = kModelInfo2.getFile_url()) == null) {
            extendedUrlModel = super.getFile_url();
        }
        return new ExtendedUrlModel(extendedUrlModel);
    }

    public void setFileUrl(ExtendedUrlModel extendedUrlModel) {
        this.fileUrl = extendedUrlModel;
        ModelInfo kModelInfo2 = getKModelInfo();
        if (kModelInfo2 != null) {
            kModelInfo2.setFile_url(extendedUrlModel);
        }
        super.setFile_url(extendedUrlModel);
    }

    public ModelInfoTemplate(ModelInfo modelInfo) {
        super(null, null, null, null, 0, 0, 0, 127, null);
        this.kModelInfo = modelInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModelInfoTemplate(ModelInfo modelInfo, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : modelInfo);
    }
}
