package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.C55357e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.i */
public final class C55785i extends AbstractC55766f<C19638h, IMContact> {

    /* renamed from: a */
    public static final C55787b f127208a = new C55787b((byte) 0);

    static {
        Covode.recordClassIndex(65571);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.i$a */
    public static final class C55786a extends AbstractC55766f.AbstractC55767a<C55785i, C19638h, IMContact> {

        /* renamed from: a */
        public final C55785i f127209a = new C55785i();

        static {
            Covode.recordClassIndex(65572);
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f.AbstractC55767a
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C55785i mo92638a() {
            return this.f127209a;
        }

        /* Return type fixed from 'com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.f' to match base method */
        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f.AbstractC55767a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ C55785i mo92639b() {
            return this.f127209a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.i$b */
    public static final class C55787b {
        static {
            Covode.recordClassIndex(65573);
        }

        private C55787b() {
        }

        public /* synthetic */ C55787b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: a */
    public final AbstractC89172b<C19638h, IMContact> mo92632a() {
        return new C55788c(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: d */
    public final List<C19638h> mo92634d() {
        throw new UnsupportedOperationException("Recent not support load more");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.p3224a.AbstractC55766f
    /* renamed from: c */
    public final List<C19638h> mo92633c() {
        List<C19638h> a = AbstractC17420a.C17421a.m32276a().mo27721a();
        C56244a.m102191c("RecentLoader", "loadInternal: " + a.size());
        return C89070n.m154585g((Collection) a);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.a.i$c */
    static final /* synthetic */ class C55788c extends C89217j implements AbstractC89172b<C19638h, IMContact> {
        static {
            Covode.recordClassIndex(65574);
        }

        C55788c(C55785i iVar) {
            super(1, iVar, C55785i.class, "convert", "convert(Lcom/bytedance/im/core/model/Conversation;)Lcom/ss/android/ugc/aweme/im/service/model/IMContact;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: com.ss.android.ugc.aweme.im.service.model.IMUser */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ IMContact invoke(C19638h hVar) {
            IMConversation iMConversation;
            IMUser c;
            C19638h hVar2 = hVar;
            C89219l.m154721d(hVar2, "");
            if (hVar2.isSingleChat()) {
                long j = 0;
                if (AbstractC17427b.C17428a.m32311c(hVar2.getConversationId()) <= 0 || (c = C55080c.m100732c(hVar2)) == 0) {
                    return null;
                }
                c.setStickTop(hVar2.isStickTop());
                c.setType(1);
                C19538ai lastMessage = hVar2.getLastMessage();
                if (lastMessage != null) {
                    j = lastMessage.getCreatedAt();
                }
                if (hVar2.isStickTop()) {
                    j = Math.max(j, hVar2.getUpdatedTime());
                }
                c.setFriendRecTime(j);
                iMConversation = c;
            } else {
                IMConversation iMConversation2 = new IMConversation();
                iMConversation2.setConversationId(hVar2.getConversationId());
                iMConversation2.setConversationType(hVar2.getConversationType());
                iMConversation2.setConversationMemberCount(hVar2.getMemberCount());
                iMConversation2.setStickTop(hVar2.isStickTop());
                C55357e.C55358a.m101168a();
                iMConversation2.setConversationAvatar(C55357e.m101167b(hVar2));
                C19639i coreInfo = hVar2.getCoreInfo();
                if (coreInfo != null) {
                    iMConversation2.setConversationName(coreInfo.getName());
                }
                iMConversation2.setType(1);
                iMConversation = iMConversation2;
            }
            iMConversation.setIsRecentContact(1);
            return iMConversation;
        }
    }
}
