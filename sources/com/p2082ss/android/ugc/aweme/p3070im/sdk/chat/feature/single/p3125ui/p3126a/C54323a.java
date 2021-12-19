package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3125ui.p3126a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.p3133a.AbstractC54376a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.a.a */
public final class C54323a extends AbstractC54376a {

    /* renamed from: x */
    private boolean f124432x = true;

    /* renamed from: y */
    private final C54315a f124433y;

    static {
        Covode.recordClassIndex(64022);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.p3133a.AbstractC54376a, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c
    /* renamed from: c */
    public final void mo91411c() {
        super.mo91411c();
        if (this.f124432x) {
            this.f124432x = false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.p3133a.AbstractC54376a
    /* renamed from: b */
    public final boolean mo91168b() {
        if (this.f124584n.isFriendChat() || this.f124584n.isEnterpriseChat()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54323a(C54315a aVar, View view) {
        super(aVar, view);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        this.f124433y = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c
    /* renamed from: a */
    public final void mo91166a(AbstractC54482a<?> aVar, C19538ai aiVar) {
        boolean equals;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aiVar, "");
        if (((AbstractC54376a) this).f124549u == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(((AbstractC54376a) this).f124549u, aiVar.getUuid());
        }
        C54881c.m100488a(this.f124433y);
        aVar.mo91570a(aiVar, equals);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c
    /* renamed from: a */
    public final void mo91167a(AbstractC54482a<?> aVar, IMUser iMUser, C19538ai aiVar) {
        C89219l.m154721d(aVar, "");
        if (aiVar == null || !aiVar.isSelf()) {
            aVar.mo91572a(this.f124584n.getSingleChatFromUser(), aiVar);
        } else {
            aVar.mo91572a(iMUser, aiVar);
        }
    }
}
