package com.bytedance.sdk.p1665b.p1667b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.bytedance.sdk.b.b.a */
public final class C22528a {

    /* renamed from: a */
    public List<C22529a> f53255a;

    static {
        Covode.recordClassIndex(26344);
    }

    /* renamed from: com.bytedance.sdk.b.b.a$a */
    public static class C22529a implements Serializable {

        /* renamed from: a */
        private String f53256a;

        /* renamed from: b */
        private String f53257b;

        /* renamed from: c */
        private String f53258c;

        /* renamed from: d */
        private String f53259d;

        /* renamed from: e */
        private String f53260e;

        static {
            Covode.recordClassIndex(26345);
        }

        public final String getContent() {
            return this.f53258c;
        }

        public final String getIconUrl() {
            return this.f53259d;
        }

        public final String getPlanId() {
            return this.f53256a;
        }

        public final String getTitle() {
            return this.f53257b;
        }

        public final String getUrl() {
            return this.f53260e;
        }

        public final String toString() {
            return "DataPlanEntity{planId='" + this.f53256a + '\'' + ", title='" + this.f53257b + '\'' + ", content='" + this.f53258c + '\'' + ", iconUrl='" + this.f53259d + '\'' + ", url='" + this.f53260e + '\'' + '}';
        }

        public final void setContent(String str) {
            this.f53258c = str;
        }

        public final void setIconUrl(String str) {
            this.f53259d = str;
        }

        public final void setPlanId(String str) {
            this.f53256a = str;
        }

        public final void setTitle(String str) {
            this.f53257b = str;
        }

        public final void setUrl(String str) {
            this.f53260e = str;
        }
    }
}
