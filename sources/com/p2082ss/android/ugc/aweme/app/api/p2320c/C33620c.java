package com.p2082ss.android.ugc.aweme.app.api.p2320c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.squareup.wire.Message;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.c */
public class C33620c<P extends Message, J> implements AbstractC33622e, AbstractC33623d {

    /* renamed from: a */
    final J f79807a;

    /* renamed from: b */
    final P f79808b;
    @AbstractC27891c(mo46611a = "rid")

    /* renamed from: c */
    String f79809c;

    /* renamed from: d */
    private transient Long f79810d;

    static {
        Covode.recordClassIndex(40513);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.f79809c;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.p2320c.AbstractC33622e
    public void setNetworkInfoKey(Long l) {
        this.f79810d = l;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.f79809c = str;
    }

    /* renamed from: a */
    public final J mo59949a(AbstractC88434g<P, J> gVar) {
        J j = this.f79807a;
        if (j == null) {
            j = gVar.apply(this.f79808b);
        }
        if (j instanceof AbstractC33623d) {
            j.setRequestId(this.f79809c);
        }
        if (j instanceof AbstractC33622e) {
            j.setNetworkInfoKey(this.f79810d);
        }
        return j;
    }

    C33620c(J j, P p) {
        if (j == null && p == null) {
            throw new IllegalArgumentException("wrong args");
        }
        this.f79807a = j;
        this.f79808b = p;
    }
}
