package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a;

import android.content.Context;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53622e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.C54994d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3164ui.p3165a.EnumC54977a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56254g;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a */
public class C54841a extends AbstractC54850d {

    /* renamed from: e */
    public static final C54842a f125618e = new C54842a((byte) 0);

    /* renamed from: a */
    public EnumC54843b f125619a = EnumC54843b.NONE;

    /* renamed from: b */
    public boolean f125620b;

    /* renamed from: c */
    public IMUser f125621c;

    /* renamed from: d */
    public final String f125622d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a$b */
    public enum EnumC54843b {
        NONE,
        MUSICIAN,
        ENTERPRISE,
        OTHER;

        static {
            Covode.recordClassIndex(64562);
        }
    }

    static {
        Covode.recordClassIndex(64560);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: c */
    public int mo91860c() {
        return 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a$a */
    public static final class C54842a {
        static {
            Covode.recordClassIndex(64561);
        }

        private C54842a() {
        }

        public /* synthetic */ C54842a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: b */
    public AbstractC56238b mo91859b() {
        return new C54844c(this);
    }

    /* renamed from: a */
    public final IMUser mo91858a() {
        if (this.f125621c == null) {
            C56244a.m102191c("ChatSession", "getFromUser is null");
            long c = AbstractC17427b.C17428a.m32311c(this.f128232k);
            IMUser b = C55085g.m100757b(String.valueOf(c), this.f125622d);
            if (b != null) {
                this.f125621c = b;
            } else {
                C55085g.m100755a(String.valueOf(c), this.f125622d, new C54845d(this));
            }
        }
        return this.f125621c;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a$c */
    public static final class C54844c implements AbstractC56238b {

        /* renamed from: a */
        final /* synthetic */ C54841a f125624a;

        static {
            Covode.recordClassIndex(64563);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54844c(C54841a aVar) {
            this.f125624a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56238b
        /* renamed from: a */
        public final void mo91861a(ActivityC0945e eVar, AbstractC56237a aVar, int i) {
            String str;
            String str2;
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(aVar, "");
            String valueOf = String.valueOf(AbstractC17427b.C17428a.m32311c(aVar.bL_()));
            if (i == 0) {
                C54994d.m100601a(eVar, this.f125624a.mo91858a(), aVar, EnumC54977a.ChatSession);
            } else if (i == 1 || i == 2) {
                if (C89219l.m154714a((Object) valueOf, (Object) C55197c.m100919b())) {
                    C53622e.m98868a("", "to_myself");
                } else {
                    C53622e.m98868a(valueOf, "no_stranger");
                }
                IMUser a = this.f125624a.mo91858a();
                if (a == null) {
                    a = new IMUser();
                    a.setUid(valueOf);
                    if (this.f125624a.f128233l instanceof UrlModel) {
                        Object obj = this.f125624a.f128233l;
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
                        a.setAvatarThumb((UrlModel) obj);
                    }
                    a.setNickName(this.f125624a.mo91869f());
                }
                a.setType(-1);
                C56254g gVar = new C56254g();
                gVar.commerceScene = "msg_list";
                C56245a.C56246a a2 = C56245a.C56247b.m102214a((Context) eVar, a).mo93262a(3);
                HashMap<String, String> hashMap = aVar.f128242u;
                if (hashMap == null || (str = hashMap.get("enter_from")) == null) {
                    str = "message";
                }
                C56245a.C56246a c = a2.mo93274c(str);
                HashMap<String, String> hashMap2 = aVar.f128242u;
                if (hashMap2 == null || (str2 = hashMap2.get("enter_method")) == null) {
                    str2 = "cell";
                }
                ChatRoomActivity.C54401a.m99731a(c.mo93271b(str2).mo93268a(aVar.bL_()).mo93267a(gVar).mo93273c(aVar.f128238q).mo93275d(a.getFollowStatus()).mo93272b(aVar.f128239r).mo93269a(aVar.f128240s).f128281a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.a$d */
    public static final class C54845d implements AbstractC56230a {

        /* renamed from: a */
        final /* synthetic */ C54841a f125625a;

        static {
            Covode.recordClassIndex(64564);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54845d(C54841a aVar) {
            this.f125625a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91086a(Throwable th) {
            C89219l.m154721d(th, "");
            C56244a.m102186a("ChatSession", "getFromUser fetch user error", th);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3259i.AbstractC56230a
        /* renamed from: a */
        public final void mo91085a(IMUser iMUser) {
            boolean z;
            if (iMUser != null) {
                z = true;
            } else {
                z = false;
            }
            C56244a.m102185a("ChatSession", "User onQueryResult hasUSer=".concat(String.valueOf(z)));
            this.f125625a.f125621c = iMUser;
        }
    }

    public C54841a(String str, IMUser iMUser) {
        this.f125622d = str;
        this.f125621c = iMUser;
    }
}
