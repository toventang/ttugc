package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.f */
public final class C56253f extends IMContact {

    /* renamed from: a */
    private final UrlModel f128296a;

    /* renamed from: b */
    private final String f128297b;

    /* renamed from: c */
    private final String f128298c;

    /* renamed from: d */
    private final List<IMUser> f128299d;

    /* renamed from: e */
    private final String f128300e;

    static {
        Covode.recordClassIndex(66066);
    }

    public final List<IMUser> getBatchContacts() {
        return this.f128299d;
    }

    public final String getBatchGroupType() {
        return this.f128300e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final UrlModel getDisplayAvatar() {
        return this.f128296a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final String getDisplayName() {
        return this.f128297b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final String getNickName() {
        return this.f128297b;
    }

    public final String getPanelTitle() {
        return this.f128298c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56253f(UrlModel urlModel, String str, String str2, List<? extends IMUser> list, String str3) {
        C89219l.m154721d(urlModel, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(str3, "");
        this.f128296a = urlModel;
        this.f128297b = str;
        this.f128298c = str2;
        this.f128299d = list;
        this.f128300e = str3;
        this.relationListItemType = 15;
    }
}
