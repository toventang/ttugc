package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1779b.C23684c;
import com.bytedance.p1777x.p1779b.C23688g;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.af */
public class C38218af implements Serializable {
    @AbstractC27891c(mo46611a = "static_resource")

    /* renamed from: a */
    private Set<String> f90280a;
    @AbstractC27891c(mo46611a = "icon_view_tracking")

    /* renamed from: b */
    private Set<String> f90281b;
    @AbstractC27891c(mo46611a = "icon_click")

    /* renamed from: c */
    private C38219a f90282c;

    static {
        Covode.recordClassIndex(45702);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.af$a */
    public static class C38219a implements Serializable {
        @AbstractC27891c(mo46611a = "click_through")

        /* renamed from: a */
        private String f90283a;
        @AbstractC27891c(mo46611a = "click_tracking")

        /* renamed from: b */
        private Set<String> f90284b;

        static {
            Covode.recordClassIndex(45703);
        }

        public String getClickThrough() {
            return this.f90283a;
        }

        public Set<String> getClickTracking() {
            return this.f90284b;
        }

        public C23688g toVideoClick() {
            C23688g gVar = new C23688g();
            gVar.clickThrough = this.f90283a;
            gVar.clickTracking = this.f90284b;
            return gVar;
        }

        public void setClickThrough(String str) {
            this.f90283a = str;
        }

        public void setClickTracking(Set<String> set) {
            this.f90284b = set;
        }
    }

    public C38219a getIconClick() {
        return this.f90282c;
    }

    public Set<String> getStaticResource() {
        return this.f90280a;
    }

    public Set<String> getViewTracking() {
        return this.f90281b;
    }

    public void setIconClick(C38219a aVar) {
        this.f90282c = aVar;
    }

    public void setStaticResource(Set<String> set) {
        this.f90280a = set;
    }

    public void setViewTracking(Set<String> set) {
        this.f90281b = set;
    }

    public C23684c toIcon(String str) {
        C23684c cVar = new C23684c();
        cVar.program = str;
        cVar.staticResource = this.f90280a;
        cVar.viewTracking = this.f90281b;
        if (this.f90282c != null) {
            cVar.clickList = new LinkedList();
            cVar.clickList.add(this.f90282c.toVideoClick());
        }
        return cVar;
    }
}
