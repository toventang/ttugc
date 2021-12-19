package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.p1264a.AbstractC18089f;
import com.bytedance.ies.ugc.aweme.network.p1264a.C18087e;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33617c;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.m */
public class C42426m extends SearchApiResult implements AbstractC18089f, AbstractC33617c {
    @AbstractC27891c(mo46611a = "cursor")

    /* renamed from: a */
    public int f98848a;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: b */
    public boolean f98849b;
    @AbstractC27891c(mo46611a = "data")

    /* renamed from: c */
    public List<C42411h> f98850c;
    @AbstractC27891c(mo46611a = "backtrace")

    /* renamed from: e */
    public String f98851e;

    /* renamed from: f */
    public String f98852f;

    /* renamed from: g */
    public C1731i<C42426m> f98853g;

    /* renamed from: h */
    public boolean f98854h;
    @AbstractC27891c(mo46611a = "ack")

    /* renamed from: i */
    public int f98855i = -2;
    @AbstractC27891c(mo46611a = "result_status")

    /* renamed from: j */
    public int f98856j;

    /* renamed from: k */
    transient C18087e f98857k;

    /* renamed from: l */
    public transient boolean f98858l;

    static {
        Covode.recordClassIndex(50372);
    }

    @Override // com.bytedance.ies.ugc.aweme.network.p1264a.AbstractC18089f
    /* renamed from: a */
    public final void mo28850a(C18087e eVar) {
        this.f98857k = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33617c
    public void setJsonData(String str) {
        this.f98852f = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d, com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult
    public void setRequestId(String str) {
        super.setRequestId(str);
        List<C42411h> list = this.f98850c;
        if (list != null) {
            for (C42411h hVar : list) {
                hVar.setRequestId(str);
            }
        }
    }
}
