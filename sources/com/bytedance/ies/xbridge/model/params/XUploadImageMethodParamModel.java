package com.bytedance.ies.xbridge.model.params;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import p4600h.p4611f.p4613b.C89219l;

public final class XUploadImageMethodParamModel extends AbstractC18749a {
    public static final C18748a Companion = new C18748a((byte) 0);
    private final String filePath;
    private AbstractC18754n header;
    private AbstractC18754n params;
    private final String url;

    static {
        Covode.recordClassIndex(21443);
    }

    /* renamed from: com.bytedance.ies.xbridge.model.params.XUploadImageMethodParamModel$a */
    public static final class C18748a {
        static {
            Covode.recordClassIndex(21444);
        }

        private C18748a() {
        }

        public /* synthetic */ C18748a(byte b) {
            this();
        }
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final AbstractC18754n getHeader() {
        return this.header;
    }

    public final AbstractC18754n getParams() {
        return this.params;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setHeader(AbstractC18754n nVar) {
        this.header = nVar;
    }

    public final void setParams(AbstractC18754n nVar) {
        this.params = nVar;
    }

    public static final XUploadImageMethodParamModel convert(AbstractC18754n nVar) {
        boolean z;
        C89219l.m154719c(nVar, "");
        String str = C18586i.m34539a(nVar, "url", "");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str2 = C18586i.m34539a(nVar, "filePath", "");
        if (str2.length() == 0) {
            return null;
        }
        AbstractC18754n b = C18586i.m34543b(nVar, "params");
        AbstractC18754n b2 = C18586i.m34543b(nVar, "header");
        XUploadImageMethodParamModel xUploadImageMethodParamModel = new XUploadImageMethodParamModel(str, str2);
        if (b != null) {
            xUploadImageMethodParamModel.setParams(b);
        }
        if (b2 != null) {
            xUploadImageMethodParamModel.setHeader(b2);
        }
        return xUploadImageMethodParamModel;
    }

    public XUploadImageMethodParamModel(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.url = str;
        this.filePath = str2;
    }
}
