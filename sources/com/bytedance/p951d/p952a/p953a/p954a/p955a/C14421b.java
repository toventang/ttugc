package com.bytedance.p951d.p952a.p953a.p954a.p955a;

import com.bytedance.bdp.serviceapi.defaults.network.BdpRequest;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.d.a.a.a.a.b */
public final class C14421b {

    /* renamed from: a */
    public final long f34887a = 30000;

    /* renamed from: b */
    public final LinkedHashMap<String, String> f34888b = new LinkedHashMap<>();

    /* renamed from: c */
    public boolean f34889c;

    /* renamed from: d */
    public long f34890d = 30000;

    /* renamed from: e */
    public long f34891e = 30000;

    /* renamed from: f */
    public long f34892f = 30000;

    /* renamed from: g */
    public byte[] f34893g;

    /* renamed from: h */
    public final String f34894h;

    /* renamed from: i */
    public final String f34895i;

    static {
        Covode.recordClassIndex(16499);
    }

    /* renamed from: a */
    public final BdpRequest mo23239a() {
        BdpRequest bdpRequest = new BdpRequest();
        bdpRequest.setMethod(this.f34894h);
        bdpRequest.setUrl(this.f34895i);
        bdpRequest.getHeaders().clear();
        bdpRequest.getHeaders().putAll(this.f34888b);
        bdpRequest.setNeedAddCommonParam(this.f34889c);
        bdpRequest.setConnectTimeOut(this.f34890d);
        bdpRequest.setReadTimeOut(this.f34891e);
        bdpRequest.setWriteTimeOut(this.f34892f);
        bdpRequest.setData(this.f34893g);
        return bdpRequest;
    }

    public C14421b(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f34894h = str;
        this.f34895i = str2;
    }
}
