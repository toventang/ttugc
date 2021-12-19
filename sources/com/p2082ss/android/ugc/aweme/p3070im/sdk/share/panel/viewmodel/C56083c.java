package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.panel.viewmodel;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55708a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3220a.C55712b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.C55946a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55949a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3236b.C55956g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56204e;
import com.p2082ss.android.ugc.aweme.p3070im.service.share.p3264a.AbstractC56264b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.c */
public final class C56083c {

    /* renamed from: a */
    public final AbstractC56264b f127903a;

    /* renamed from: b */
    private int f127904b = -1;

    /* renamed from: c */
    private IMContact f127905c;

    /* renamed from: d */
    private final SharePanelViewModel f127906d;

    static {
        Covode.recordClassIndex(65882);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.c$a */
    public static final class C56084a implements AbstractC55947a {

        /* renamed from: a */
        final /* synthetic */ C56083c f127907a;

        /* renamed from: b */
        final /* synthetic */ String f127908b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f127909c;

        /* renamed from: d */
        final /* synthetic */ List f127910d;

        static {
            Covode.recordClassIndex(65883);
        }

        C56084a(C56083c cVar, String str, SharePackage sharePackage, List list) {
            this.f127907a = cVar;
            this.f127908b = str;
            this.f127909c = sharePackage;
            this.f127910d = list;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3234b.p3235a.AbstractC55947a
        /* renamed from: a */
        public final void mo92815a() {
            C55956g.m101813a(this.f127908b, this.f127909c, this.f127910d);
            AbstractC56264b bVar = this.f127907a.f127903a;
            if (bVar != null) {
                SharePackage sharePackage = this.f127909c;
                this.f127910d.size();
                bVar.mo90151c(sharePackage);
            }
            C55712b.m101459a(this.f127909c, "", C89070n.m154585g((Collection) this.f127910d));
        }
    }

    /* renamed from: a */
    public final void mo92946a(IMContact iMContact) {
        AbstractC56264b bVar;
        C89219l.m154721d(iMContact, "");
        SharePackage sharePackage = this.f127906d.f127873d;
        if (sharePackage == null || (bVar = this.f127903a) == null || bVar.mo90149a(sharePackage)) {
            m101982b(iMContact);
        } else {
            C51423a.m95787a("LongPressShare cancel share by callback");
        }
    }

    /* renamed from: a */
    private final void m101981a(SharePackage sharePackage) {
        sharePackage.f155492i.putInt("is_create_group_chat", 0);
        IMContact iMContact = this.f127905c;
        if (iMContact instanceof IMUser) {
            sharePackage.f155492i.putInt("friends_shared_cnt", 1);
        } else if (iMContact instanceof IMConversation) {
            sharePackage.f155492i.putInt("friends_shared_cnt", ((IMConversation) iMContact).getConversationMemberCount());
        }
    }

    /* renamed from: b */
    private final void m101982b(IMContact iMContact) {
        SharePackage sharePackage = this.f127906d.f127873d;
        if (sharePackage != null) {
            List c = C89070n.m154524c(iMContact);
            Bundle bundle = sharePackage.f155492i;
            StringBuilder sb = new StringBuilder();
            Integer num = null;
            IMUser iMUser = (IMUser) (!(iMContact instanceof IMUser) ? null : iMContact);
            if (iMUser != null) {
                num = Integer.valueOf(iMUser.getFollowStatus());
            }
            bundle.putString("relation_tag", sb.append(String.valueOf(num)).toString());
            bundle.putInt("rank_num", this.f127904b);
            C55708a.m101453a(C55708a.f127082a, sharePackage, iMContact, false, null, 0, null, null, 120);
            sharePackage.f155492i.remove("rank_num");
            String a = C55058a.m100681a();
            AbstractC56264b bVar = this.f127903a;
            if (bVar != null) {
                bVar.mo90150b(sharePackage);
            }
            C55946a.m101789a(sharePackage, c);
            m101981a(sharePackage);
            C56084a aVar = new C56084a(this, a, sharePackage, c);
            ArrayList arrayList = new ArrayList();
            for (Object obj : c) {
                if (obj instanceof IMConversation) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                C55949a.m101802a(c, "", sharePackage, (BaseContent) null, a, (String) null, aVar);
            } else {
                C55949a.m101804a((List<IMContact>) c, "", sharePackage, a, false, (AbstractC55947a) aVar);
            }
            if (C56204e.m102118b()) {
                this.f127906d.mo92936a(iMContact);
            }
        }
    }

    public C56083c(SharePanelViewModel sharePanelViewModel, AbstractC56264b bVar) {
        C89219l.m154721d(sharePanelViewModel, "");
        this.f127906d = sharePanelViewModel;
        this.f127903a = bVar;
    }

    /* renamed from: a */
    public final void mo92947a(IMContact iMContact, int i) {
        C89219l.m154721d(iMContact, "");
        this.f127905c = iMContact;
        this.f127904b = i;
    }
}
