package com.bytedance.ies.ugc.aweme.network.p1264a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33632h;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33638k;
import com.p2082ss.android.ugc.aweme.app.api.C33633i;
import com.p2082ss.android.ugc.aweme.app.api.C33637j;

/* renamed from: com.bytedance.ies.ugc.aweme.network.a.b */
public class C18079b<T> implements AbstractC33623d, AbstractC33631g, AbstractC33638k {

    /* renamed from: a */
    C33637j f43043a;

    /* renamed from: b */
    public C18087e f43044b;

    /* renamed from: c */
    private AbstractC18083a<T> f43045c;

    /* renamed from: e */
    private String f43046e;

    /* renamed from: f */
    private C14612a f43047f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.network.a.b$a */
    public interface AbstractC18083a<T> {
        static {
            Covode.recordClassIndex(20720);
        }

        /* renamed from: a */
        void mo28845a(AbstractC18078a<T> aVar);
    }

    static {
        Covode.recordClassIndex(20716);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public C33633i getRequestLog() {
        return AbstractC33632h.m68862a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.f43046e;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public C14612a getRequestInfo() {
        return this.f43047f;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33638k
    /* renamed from: a */
    public void mo28839a(C33637j jVar) {
        this.f43043a = jVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.f43046e = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public void setRequestInfo(C14612a aVar) {
        this.f43047f = aVar;
    }

    C18079b(AbstractC18083a<T> aVar) {
        this.f43046e = "";
        this.f43045c = aVar;
    }

    /* renamed from: a */
    public final void mo28838a(AbstractC18078a<T> aVar) {
        this.f43045c.mo28845a(aVar);
        this.f43045c = null;
    }

    /* synthetic */ C18079b(AbstractC18083a aVar, byte b) {
        this(aVar);
    }
}
