package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.share.ClientKeyScopesResponse */
public class ClientKeyScopesResponse extends BaseResponse {
    private DataBean data;

    /* renamed from: com.ss.android.ugc.aweme.share.ClientKeyScopesResponse$DataBean */
    public static class DataBean {
        private String app_icon;
        private String app_name;
        private List<ScopesBean> scopes;

        static {
            Covode.recordClassIndex(81101);
        }

        /* renamed from: com.ss.android.ugc.aweme.share.ClientKeyScopesResponse$DataBean$ScopesBean */
        public static class ScopesBean {
            private String desc;
            private String name;

            static {
                Covode.recordClassIndex(81102);
            }

            public String getDesc() {
                return this.desc;
            }

            public String getName() {
                return this.name;
            }

            public void setDesc(String str) {
                this.desc = str;
            }

            public void setName(String str) {
                this.name = str;
            }
        }

        public String getAppName() {
            return this.app_name;
        }

        public String getApp_icon() {
            return this.app_icon;
        }

        public List<ScopesBean> getScopes() {
            return this.scopes;
        }

        public void setAppName(String str) {
            this.app_name = str;
        }

        public void setApp_icon(String str) {
            this.app_icon = str;
        }

        public void setScopes(List<ScopesBean> list) {
            this.scopes = list;
        }
    }

    static {
        Covode.recordClassIndex(81100);
    }

    public DataBean getData() {
        return this.data;
    }

    public void setData(DataBean dataBean) {
        this.data = dataBean;
    }
}
