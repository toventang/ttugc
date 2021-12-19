package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.j */
public final class C56257j implements AbstractC81914b {

    /* renamed from: a */
    public IMContact f128318a;

    /* renamed from: b */
    public List<IMContact> f128319b;

    /* renamed from: c */
    public boolean f128320c;

    /* renamed from: d */
    public String f128321d;

    /* renamed from: e */
    public String f128322e;

    /* renamed from: f */
    public String f128323f;

    /* renamed from: g */
    public String f128324g;

    /* renamed from: h */
    public boolean f128325h;

    /* renamed from: i */
    public String f128326i;

    /* renamed from: j */
    public int f128327j;

    /* renamed from: k */
    public boolean f128328k;

    static {
        Covode.recordClassIndex(66070);
    }

    public C56257j(IMContact iMContact, boolean z, String str, String str2, String str3, String str4) {
        this.f128318a = iMContact;
        this.f128320c = z;
        this.f128321d = str;
        this.f128322e = str2;
        this.f128323f = str3;
        this.f128324g = str4;
        this.f128326i = null;
    }

    public C56257j(List<IMContact> list, IMContact iMContact, int i, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2) {
        this.f128319b = list;
        this.f128318a = iMContact;
        this.f128327j = i;
        this.f128320c = z;
        this.f128321d = str;
        this.f128322e = str2;
        this.f128323f = str3;
        this.f128324g = str4;
        this.f128325h = z2;
        this.f128326i = str5;
    }
}
