package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53622e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.C54994d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.EnumC54977a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.g */
public class C54859g extends C54841a {

    /* renamed from: i */
    public static final C54860a f125637i = new C54860a((byte) 0);

    static {
        Covode.recordClassIndex(64578);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54841a, com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: c */
    public int mo91860c() {
        return 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.g$a */
    public static final class C54860a {
        static {
            Covode.recordClassIndex(64579);
        }

        private C54860a() {
        }

        public /* synthetic */ C54860a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54841a, com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: b */
    public AbstractC56238b mo91859b() {
        return new C54861b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: f */
    public String mo91869f() {
        IMUser a = mo91858a();
        if (a == null) {
            C56244a.m102193e("StrangerSession", "getName user invalid");
            return "";
        }
        String nickName = a.getNickName();
        C89219l.m154716b(nickName, "");
        return nickName;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.g$b */
    public static final class C54861b implements AbstractC56238b {

        /* renamed from: a */
        final /* synthetic */ C54859g f125638a;

        static {
            Covode.recordClassIndex(64580);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54861b(C54859g gVar) {
            this.f125638a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b
        /* renamed from: a */
        public final void mo91861a(ActivityC0945e eVar, AbstractC56237a aVar, int i) {
            String str;
            String str2;
            String str3 = "";
            C89219l.m154721d(eVar, str3);
            C89219l.m154721d(aVar, str3);
            IMUser a = this.f125638a.mo91858a();
            if (i == 0) {
                C54994d.m100601a(eVar, this.f125638a.mo91858a(), aVar, EnumC54977a.StrangerSession);
            } else if (i != 1 && i != 2) {
            } else {
                if (a == null) {
                    C56244a.m102193e("StrangerSession", "doAction click user invalid");
                    return;
                }
                a.setType(4);
                C56245a.C56246a a2 = C56245a.C56247b.m102214a((Context) eVar, a).mo93262a(2);
                HashMap<String, String> hashMap = aVar.f128242u;
                if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                    str = str3;
                }
                C56245a.C56246a c = a2.mo93274c(str);
                HashMap<String, String> hashMap2 = aVar.f128242u;
                if (!(hashMap2 == null || (str2 = hashMap2.get("enter_method")) == null)) {
                    str3 = str2;
                }
                ChatRoomActivity.C54401a.m99731a(c.mo93271b(str3).mo93268a(this.f125638a.f128232k).mo93273c(aVar.f128238q).mo93275d(a.getFollowStatus()).mo93272b(aVar.f128239r).mo93269a(aVar.f128240s).f128281a);
                C53622e.m98868a(aVar.bL_(), "stranger");
            }
        }
    }

    public C54859g(String str, IMUser iMUser) {
        super(str, iMUser);
    }
}
