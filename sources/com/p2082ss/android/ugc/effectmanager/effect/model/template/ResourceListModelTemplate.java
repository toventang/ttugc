package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ResourceListModel;
import com.p2082ss.ugc.effectplatform.model.ResourceListModel;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate */
public class ResourceListModelTemplate extends ResourceListModel {
    private String iconUri;
    private final transient ResourceListModel kResourceModel;
    private String param;
    private List<ResourceListModel.ResourceListBean> resourceList;
    private List<String> urlPrefix;

    static {
        Covode.recordClassIndex(95637);
    }

    public ResourceListModelTemplate() {
        this(null, 1, null);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate$ResourceListBeanTemplate */
    public static class ResourceListBeanTemplate extends ResourceListModel.ResourceListBean {
        private final transient ResourceListModel.ResourceListBean kResourceBean;
        private String resourceUrl;

        static {
            Covode.recordClassIndex(95638);
        }

        public ResourceListBeanTemplate() {
            this(null, 1, null);
        }

        public ResourceListModel.ResourceListBean getKResourceBean() {
            return this.kResourceBean;
        }

        public String getResourceUrl() {
            String resource_uri;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 == null || (resource_uri = kResourceBean2.getResource_uri()) == null) {
                return super.getResource_uri();
            }
            return resource_uri;
        }

        public ResourceListBeanTemplate(ResourceListModel.ResourceListBean resourceListBean) {
            super(null, null, null, 7, null);
            this.kResourceBean = resourceListBean;
        }

        public void setResourceUrl(String str) {
            this.resourceUrl = str;
            ResourceListModel.ResourceListBean kResourceBean2 = getKResourceBean();
            if (kResourceBean2 != null) {
                kResourceBean2.setResource_uri(str);
            }
            super.setResource_uri(str);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ResourceListBeanTemplate(ResourceListModel.ResourceListBean resourceListBean, int i, C89214g gVar) {
            this((i & 1) != 0 ? null : resourceListBean);
        }
    }

    public com.p2082ss.ugc.effectplatform.model.ResourceListModel getKResourceModel() {
        return this.kResourceModel;
    }

    public String getIconUri() {
        String icon_uri;
        com.p2082ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (icon_uri = kResourceModel2.getIcon_uri()) == null) {
            return super.getIcon_uri();
        }
        return icon_uri;
    }

    public String getParam() {
        String params;
        com.p2082ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (params = kResourceModel2.getParams()) == null) {
            return super.getParams();
        }
        return params;
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        com.p2082ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 == null || (url_prefix = kResourceModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate, com.ss.ugc.effectplatform.model.ResourceListModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.p2082ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean> getResourceList() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.ResourceListModel r4 = r5.getKResourceModel()
            if (r4 == 0) goto L_0x000c
            java.util.List r1 = r4.getResource_list()
            if (r1 != 0) goto L_0x0010
        L_0x000c:
            java.util.List r1 = super.getResource_list()
        L_0x0010:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0022
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = r0 instanceof com.p2082ss.android.ugc.effectmanager.effect.model.ResourceListModel.ResourceListBean
            if (r0 == 0) goto L_0x0028
        L_0x0021:
            return r1
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0021
        L_0x0028:
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = p4600h.p4601a.C89070n.m154526a(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r2.next()
            com.ss.ugc.effectplatform.model.ResourceListModel$ResourceListBean r1 = (com.p2082ss.ugc.effectplatform.model.ResourceListModel.ResourceListBean) r1
            com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean r0 = new com.ss.android.ugc.effectmanager.effect.model.ResourceListModel$ResourceListBean
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x0037
        L_0x004c:
            java.util.List r3 = (java.util.List) r3
            if (r4 == 0) goto L_0x0053
            r4.setResource_list(r3)
        L_0x0053:
            super.setResource_list(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.effectmanager.effect.model.template.ResourceListModelTemplate.getResourceList():java.util.List");
    }

    public void setIconUri(String str) {
        this.iconUri = str;
        com.p2082ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setIcon_uri(str);
        }
        super.setIcon_uri(str);
    }

    public void setParam(String str) {
        this.param = str;
        com.p2082ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setParams(str);
        }
        super.setParams(str);
    }

    public ResourceListModelTemplate(com.p2082ss.ugc.effectplatform.model.ResourceListModel resourceListModel) {
        super(null, null, null, null, 15, null);
        this.kResourceModel = resourceListModel;
        this.resourceList = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    public void setResourceList(List<ResourceListModel.ResourceListBean> list) {
        C89219l.m154719c(list, "");
        this.resourceList = list;
        com.p2082ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setResource_list(list);
        }
        super.setResource_list(list);
    }

    public void setUrlPrefix(List<String> list) {
        C89219l.m154719c(list, "");
        this.urlPrefix = list;
        com.p2082ss.ugc.effectplatform.model.ResourceListModel kResourceModel2 = getKResourceModel();
        if (kResourceModel2 != null) {
            kResourceModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListModelTemplate(com.p2082ss.ugc.effectplatform.model.ResourceListModel resourceListModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : resourceListModel);
    }
}
