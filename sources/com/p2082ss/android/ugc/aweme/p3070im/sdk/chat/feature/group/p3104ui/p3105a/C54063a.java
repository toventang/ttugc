package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3104ui.p3105a;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.C19489e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54004b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC54002g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53982a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.C53998c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC53997b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.EnumC54001f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.p3133a.AbstractC54376a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.a.a */
public final class C54063a extends AbstractC54376a {
    static {
        Covode.recordClassIndex(63738);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.p3133a.AbstractC54376a
    /* renamed from: b */
    public final boolean mo91168b() {
        return this.f124584n.isGroupChat();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.a.a$a */
    public static final class C54064a implements AbstractC54002g {

        /* renamed from: a */
        final /* synthetic */ AbstractC54482a f123915a;

        /* renamed from: b */
        final /* synthetic */ C19538ai f123916b;

        static {
            Covode.recordClassIndex(63739);
        }

        C54064a(AbstractC54482a aVar, C19538ai aiVar) {
            this.f123915a = aVar;
            this.f123916b = aiVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.p3103a.AbstractC54002g
        /* renamed from: a */
        public final void mo91093a(C54006a aVar, EnumC54001f fVar) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(fVar, "");
            AbstractC54482a aVar2 = this.f123915a;
            C19538ai aiVar = this.f123916b;
            aVar2.f124826v = null;
            if (aVar != null && aVar.getUser() != null && aVar.getUid().equals(String.valueOf(aVar2.f124823s.getSender()))) {
                aVar2.mo91569a(aiVar, aVar);
                if (aVar2.f124812h == null) {
                    return;
                }
                if (aiVar.isSelf() || aiVar.getConversationType() != C19489e.AbstractC19490a.f46181b) {
                    aVar2.f124812h.setVisibility(8);
                    return;
                }
                aVar2.f124812h.setText(aVar.getDisplayName());
                aVar2.f124812h.setVisibility(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54063a(C54004b bVar, View view) {
        super(bVar, view);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view, "");
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
        aVar.mo91570a(aiVar, equals);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c
    /* renamed from: a */
    public final void mo91167a(AbstractC54482a<?> aVar, IMUser iMUser, C19538ai aiVar) {
        C89219l.m154721d(aVar, "");
        if (aiVar != null) {
            if (aiVar.isSelf()) {
                aVar.mo91572a(iMUser, aiVar);
                return;
            }
            EnumC53997b bVar = EnumC53997b.AT_MOST_DB;
            C54064a aVar2 = new C54064a(aVar, aiVar);
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(aiVar, "");
            C89219l.m154721d(aVar2, "");
            C53982a.m99198a(bVar, new C53998c(aiVar.getConversationId(), String.valueOf(aiVar.getSender()), aiVar.getSecSender()), aVar2);
        }
    }
}
