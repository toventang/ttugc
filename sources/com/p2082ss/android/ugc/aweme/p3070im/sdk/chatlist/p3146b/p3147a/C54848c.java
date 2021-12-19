package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.C54994d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.EnumC54977a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55082e;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMConversation;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.c */
public final class C54848c extends AbstractC54850d {
    static {
        Covode.recordClassIndex(64567);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: c */
    public final int mo91860c() {
        return 20;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: b */
    public final AbstractC56238b mo91859b() {
        return new C54849a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.c$a */
    public static final class C54849a implements AbstractC56238b {

        /* renamed from: a */
        final /* synthetic */ C54848c f125627a;

        static {
            Covode.recordClassIndex(64568);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54849a(C54848c cVar) {
            this.f125627a = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b
        /* renamed from: a */
        public final void mo91861a(ActivityC0945e eVar, AbstractC56237a aVar, int i) {
            String str;
            String str2;
            IMConversation iMConversation;
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(aVar, "");
            if (i == 1 || i == 2) {
                C56245a.C56246a a = C56245a.C56247b.m102212a(eVar, 3, this.f125627a.bL_()).mo93262a(3);
                HashMap<String, String> hashMap = aVar.f128242u;
                if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                    str = "message";
                }
                C56245a.C56246a c = a.mo93274c(str);
                HashMap<String, String> hashMap2 = aVar.f128242u;
                if (hashMap2 == null || (str2 = hashMap2.get("enter_method")) == null) {
                    str2 = "chat_list";
                }
                ChatRoomActivity.C54401a.m99731a(c.mo93271b(str2).mo93273c(aVar.f128238q).mo93272b(aVar.f128239r).mo93269a(aVar.f128240s).f128281a);
            } else if (i == 0) {
                C19638h a2 = AbstractC17420a.C17421a.m32276a().mo27720a(this.f125627a.f128232k);
                if (a2 != null) {
                    iMConversation = C55082e.m100743b(a2);
                } else {
                    iMConversation = null;
                }
                C54994d.m100601a(eVar, iMConversation, aVar, EnumC54977a.ChatSession);
            }
        }
    }
}
