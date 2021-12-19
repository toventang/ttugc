package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a */
public final class C54006a extends IMContact implements Serializable {

    /* renamed from: a */
    private IMUser f123831a;

    /* renamed from: b */
    private C19537ah f123832b;

    /* renamed from: c */
    private final String f123833c;

    /* renamed from: d */
    private final String f123834d;

    static {
        Covode.recordClassIndex(63677);
    }

    public final C19537ah getMember() {
        return this.f123832b;
    }

    public final String getSecUid() {
        return this.f123834d;
    }

    public final String getUid() {
        return this.f123833c;
    }

    public final IMUser getUser() {
        return this.f123831a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final UrlModel getDisplayAvatar() {
        IMUser iMUser = this.f123831a;
        if (iMUser != null) {
            return iMUser.getDisplayAvatar();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final String getDisplayName() {
        IMUser iMUser = this.f123831a;
        if (iMUser != null) {
            return iMUser.getDisplayName();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact
    public final String getNickName() {
        IMUser iMUser = this.f123831a;
        if (iMUser != null) {
            return iMUser.getNickName();
        }
        return null;
    }

    public final void setMember(C19537ah ahVar) {
        this.f123832b = ahVar;
    }

    public final void setUser(IMUser iMUser) {
        this.f123831a = iMUser;
    }

    public C54006a(String str, String str2) {
        C89219l.m154721d(str, "");
        this.f123833c = str;
        this.f123834d = str2;
    }
}
