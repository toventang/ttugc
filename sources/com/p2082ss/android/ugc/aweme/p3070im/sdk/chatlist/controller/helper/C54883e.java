package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54004b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatdetail.p3142ui.activity.GroupChatDetailActivity;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.e */
public final class C54883e {

    /* renamed from: a */
    private final AbstractC89172b<C56245a, Boolean> f125659a;

    /* renamed from: b */
    private final AbstractC89187q<Activity, C54004b, Integer, C89391z> f125660b;

    static {
        Covode.recordClassIndex(64603);
    }

    public /* synthetic */ C54883e() {
        this(new AbstractC89172b<C56245a, Boolean>(ChatRoomActivity.f124621c) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54883e.C548841 */

            static {
                Covode.recordClassIndex(64604);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(C56245a aVar) {
                C56245a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                return Boolean.valueOf(ChatRoomActivity.C54401a.m99731a(aVar2));
            }
        }, new AbstractC89187q<Activity, C54004b, Integer, C89391z>(GroupChatDetailActivity.f125251b) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54883e.C548852 */

            static {
                Covode.recordClassIndex(64605);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89187q
            public final /* synthetic */ C89391z invoke(Activity activity, C54004b bVar, Integer num) {
                Activity activity2 = activity;
                C54004b bVar2 = bVar;
                int intValue = num.intValue();
                C89219l.m154721d(activity2, "");
                C89219l.m154721d(bVar2, "");
                GroupChatDetailActivity.C54640a.m100148a(activity2, bVar2, intValue);
                return C89391z.f203057a;
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.im.service.model.a, java.lang.Boolean> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.q<? super android.app.Activity, ? super com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.b, ? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private C54883e(AbstractC89172b<? super C56245a, Boolean> bVar, AbstractC89187q<? super Activity, ? super C54004b, ? super Integer, C89391z> qVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(qVar, "");
        this.f125659a = bVar;
        this.f125660b = qVar;
    }

    /* renamed from: a */
    public final void mo91898a(Activity activity, SessionListNavArg sessionListNavArg) {
        String str = "";
        C89219l.m154721d(activity, str);
        if (sessionListNavArg != null && sessionListNavArg.getConversationId() != null) {
            Integer messagePreviewEnabled = sessionListNavArg.getMessagePreviewEnabled();
            if (messagePreviewEnabled == null || messagePreviewEnabled.intValue() != 0) {
                Integer isGroupMemberRequest = sessionListNavArg.isGroupMemberRequest();
                if (isGroupMemberRequest != null && isGroupMemberRequest.intValue() == 1) {
                    C54004b bVar = new C54004b();
                    String conversationId = sessionListNavArg.getConversationId();
                    if (conversationId != null) {
                        str = conversationId;
                    }
                    bVar.setConversationId(str);
                    bVar.setEnterFromForMob(sessionListNavArg.getEnterFrom());
                    this.f125660b.invoke(activity, bVar, 16);
                    return;
                }
                Integer chatType = sessionListNavArg.getChatType();
                if (chatType != null) {
                    if (chatType.intValue() == 0) {
                        this.f125659a.invoke(C56245a.C56247b.m102212a(activity, 0, sessionListNavArg.getConversationId()).mo93274c(sessionListNavArg.getEnterFrom()).mo93261a().f128281a);
                    } else if (chatType.intValue() == 1) {
                        this.f125659a.invoke(C56245a.C56247b.m102212a(activity, 3, sessionListNavArg.getConversationId()).mo93274c(sessionListNavArg.getEnterFrom()).mo93261a().f128281a);
                    }
                }
            }
        }
    }
}
