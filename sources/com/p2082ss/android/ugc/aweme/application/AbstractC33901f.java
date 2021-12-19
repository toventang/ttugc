package com.p2082ss.android.ugc.aweme.application;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.local_test.LocalTestApi;

/* renamed from: com.ss.android.ugc.aweme.application.f */
public abstract class AbstractC33901f implements AbstractC33904i {

    /* renamed from: a */
    private LocalTestApi f80199a;

    static {
        Covode.recordClassIndex(40819);
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public String mo60130a(String str) {
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public void mo60131a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public void mo60132a(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public void mo60133a(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public void mo60134a(Configuration configuration) {
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: b */
    public void mo60137b() {
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: b */
    public void mo60138b(Context context) {
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: c */
    public boolean mo60139c() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: d */
    public boolean mo60140d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.application.AbstractC33904i
    /* renamed from: a */
    public Resources mo60129a(Resources resources) {
        if (this.f80199a == null) {
            this.f80199a = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        }
        LocalTestApi localTestApi = this.f80199a;
        if (localTestApi != null) {
            return localTestApi.getTranslationProxyResource(resources);
        }
        return resources;
    }
}
