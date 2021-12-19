package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56252e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a */
public final class C54315a extends C53709a {

    /* renamed from: a */
    private String f124416a;

    /* renamed from: b */
    private IMUser f124417b;

    /* renamed from: c */
    private Serializable f124418c;

    /* renamed from: d */
    private C56252e f124419d;

    static {
        Covode.recordClassIndex(64012);
    }

    public final Serializable getChatExt() {
        return this.f124418c;
    }

    public final IMUser getFromUser() {
        return this.f124417b;
    }

    public final C56252e getImAdLog() {
        return this.f124419d;
    }

    public final String getShareUserId() {
        return this.f124416a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a
    public final IMUser getSingleChatFromUser() {
        return this.f124417b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a
    public final String getSingleChatFromUserId() {
        IMUser iMUser = this.f124417b;
        if (iMUser != null) {
            return iMUser.getUid();
        }
        return null;
    }

    public final void setChatExt(Serializable serializable) {
        this.f124418c = serializable;
    }

    public final void setFromUser(IMUser iMUser) {
        this.f124417b = iMUser;
    }

    public final void setImAdLog(C56252e eVar) {
        this.f124419d = eVar;
    }

    public final void setShareUserId(String str) {
        this.f124416a = str;
    }
}
