package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.CheckMessage;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53717c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53721g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53729k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53732a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53746c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53751g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53752h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53754j;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53756l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53761q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53762r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53766v;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53770z;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.AbstractC53613b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.AbstractC54432d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55131b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55132c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55214j;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56227c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88398aa;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88974o;
import p4560f.p4561a.AbstractC88976q;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4589j.C88939d;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel */
public final class ChatRoomViewModel extends AbstractC1174ac implements AbstractC33974au {

    /* renamed from: m */
    public static final C54577a f125103m = new C54577a((byte) 0);

    /* renamed from: a */
    public final C88960c<AbstractC53746c> f125104a;

    /* renamed from: b */
    public final C88960c<AbstractC53732a> f125105b;

    /* renamed from: c */
    public final C88960c<C89391z> f125106c;

    /* renamed from: d */
    public final C53709a f125107d;

    /* renamed from: e */
    public final AbstractC53729k f125108e;

    /* renamed from: f */
    public final AbstractC53721g f125109f;

    /* renamed from: g */
    public final AbstractC53613b f125110g;

    /* renamed from: h */
    public final AbstractC56227c f125111h;

    /* renamed from: i */
    public final AbstractC53717c f125112i;

    /* renamed from: j */
    public final AbstractC54432d f125113j;

    /* renamed from: k */
    final C88411a f125114k;

    /* renamed from: l */
    final AbstractC88398aa f125115l;

    /* renamed from: n */
    private final C88411a f125116n;

    static {
        Covode.recordClassIndex(64288);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            subscribeToEvents$im_base_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume$im_base_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop$im_base_release();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy$im_base_release();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$a */
    public static final class C54577a {
        static {
            Covode.recordClassIndex(64289);
        }

        private C54577a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$a$a */
        public static final class C54578a implements C1175ad.AbstractC1177b {

            /* renamed from: a */
            final /* synthetic */ C53709a f125117a;

            static {
                Covode.recordClassIndex(64290);
            }

            public C54578a(C53709a aVar) {
                this.f125117a = aVar;
            }

            @Override // androidx.lifecycle.C1175ad.AbstractC1177b
            /* renamed from: a */
            public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
                C89219l.m154721d(cls, "");
                if (cls.isAssignableFrom(ChatRoomViewModel.class)) {
                    return new ChatRoomViewModel(this.f125117a);
                }
                throw new IllegalArgumentException("ChatRoomViewModel.get(): Unknown ViewModel class");
            }
        }

        public /* synthetic */ C54577a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$i */
    static final class C54586i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125125a;

        static {
            Covode.recordClassIndex(64298);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54586i(ChatRoomViewModel chatRoomViewModel) {
            super(0);
            this.f125125a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f125125a.f125112i.mo90297c("refreshStrangerMode() conversation invalid: conversation is null");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$l */
    static final class C54589l extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125129a;

        static {
            Covode.recordClassIndex(64301);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54589l(ChatRoomViewModel chatRoomViewModel) {
            super(0);
            this.f125129a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f125129a.f125112i.mo90296b("shouldShowChatTopTip() no extras");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final AbstractC17434e mo91661a() {
        return this.f125108e.mo90311a(this.f125107d.getConversationId());
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy$im_base_release() {
        this.f125104a.onComplete();
        this.f125105b.onComplete();
        this.f125116n.mo142944a();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume$im_base_release() {
        mo91663b();
        this.f125108e.mo90313c(this.f125107d.getConversationId());
    }

    /* renamed from: b */
    public final void mo91663b() {
        AbstractC88403ab<C19638h> b = this.f125109f.mo90308c(this.f125107d.getConversationId()).mo142918b(this.f125115l);
        C89219l.m154716b(b, "");
        C88934a.m154195a(C88939d.m154198a(b, new C54582e(this), new C54581d(this)), this.f125114k);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop$im_base_release() {
        String str;
        this.f125108e.mo90314d(this.f125107d.getConversationId());
        AbstractC53613b bVar = this.f125110g;
        String conversationId = this.f125107d.getConversationId();
        if (this.f125107d.isStrangerChat()) {
            str = "stranger";
        } else {
            str = "no_stranger";
        }
        bVar.mo90190a(conversationId, str);
        this.f125110g.mo90188a();
        this.f125114k.mo142944a();
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void subscribeToEvents$im_base_release() {
        C88934a.m154195a(C88939d.m154203a(this.f125109f.mo90306a(this.f125107d.getConversationId()), null, null, new C54591n(this.f125105b), 3), this.f125116n);
        AbstractC88979t<AbstractC53732a> a = this.f125105b.mo143261a(this.f125115l);
        C89219l.m154716b(a, "");
        C88934a.m154195a(C88939d.m154203a(a, new C54593p(this), null, new C54592o(this), 2), this.f125116n);
        C88934a.m154195a(C88939d.m154203a(this.f125108e.mo90312b(this.f125107d.getConversationId()), null, null, new C54594q(this.f125104a), 3), this.f125116n);
        AbstractC88979t<AbstractC53746c> b = this.f125104a.mo143278b(this.f125115l);
        C89219l.m154716b(b, "");
        C88934a.m154195a(C88939d.m154203a(b, new C54596s(this), null, new C54595r(this), 2), this.f125116n);
        AbstractC88979t<C89391z> d = this.f125106c.mo143261a(this.f125115l).mo143291d(100, TimeUnit.MILLISECONDS);
        C89219l.m154716b(d, "");
        C88934a.m154195a(C88939d.m154203a(d, null, null, new C54597t(this), 3), this.f125116n);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$d */
    public static final class C54581d extends AbstractC89220m implements AbstractC89172b<C19638h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125120a;

        static {
            Covode.recordClassIndex(64293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54581d(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125120a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19638h hVar) {
            this.f125120a.f125106c.onNext(C89391z.f203057a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$n */
    public static final /* synthetic */ class C54591n extends C89217j implements AbstractC89172b<AbstractC53732a, C89391z> {
        static {
            Covode.recordClassIndex(64303);
        }

        C54591n(C88960c cVar) {
            super(1, cVar, C88960c.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC53732a aVar) {
            C89219l.m154721d(aVar, "");
            ((C88960c) this.receiver).onNext(aVar);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$q */
    public static final /* synthetic */ class C54594q extends C89217j implements AbstractC89172b<AbstractC53746c, C89391z> {
        static {
            Covode.recordClassIndex(64306);
        }

        C54594q(C88960c cVar) {
            super(1, cVar, C88960c.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC53746c cVar) {
            C89219l.m154721d(cVar, "");
            ((C88960c) this.receiver).onNext(cVar);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$b */
    public static final class C54579b extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125118a;

        static {
            Covode.recordClassIndex(64291);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54579b(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125118a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f125118a.f125112i.mo90294a("checkCommentMsgState error", th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$c */
    static final class C54580c extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125119a;

        static {
            Covode.recordClassIndex(64292);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54580c(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125119a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f125119a.f125112i.mo90294a("clearGreetEmoji unexpected error", th2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$e */
    public static final class C54582e extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125121a;

        static {
            Covode.recordClassIndex(64294);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54582e(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125121a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f125121a.f125112i.mo90294a("ensureConversationCreated() unexpected error", th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$j */
    static final class C54587j extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125126a;

        static {
            Covode.recordClassIndex(64299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54587j(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125126a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f125126a.f125112i.mo90294a("refreshStrangerMode() unexpected error", th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$m */
    static final class C54590m extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125130a;

        static {
            Covode.recordClassIndex(64302);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54590m(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125130a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f125130a.f125112i.mo90295a(th2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$p */
    public static final class C54593p extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125132a;

        static {
            Covode.recordClassIndex(64305);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54593p(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125132a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f125132a.f125112i.mo90294a("subscribeToConversationChanges unexpected error:", th2);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$s */
    public static final class C54596s extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125134a;

        static {
            Covode.recordClassIndex(64308);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54596s(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125134a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            this.f125134a.f125112i.mo90294a("subscribeToMessages unexpected error:", th2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$f */
    static final class C54583f<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125122a;

        static {
            Covode.recordClassIndex(64295);
        }

        C54583f(ChatRoomViewModel chatRoomViewModel) {
            this.f125122a = chatRoomViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            C19638h hVar = (C19638h) obj;
            C89219l.m154721d(hVar, "");
            if (hVar.isTemp()) {
                this.f125122a.f125112i.mo90297c("refreshStrangerMode conversation invalid: isTemp == true");
                return false;
            } else if (hVar.isSingleChat()) {
                return true;
            } else {
                this.f125122a.f125112i.mo90297c("refreshStrangerMode not single chat: conversationType = " + hVar.getConversationType());
                return false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$g */
    static final class C54584g<T> implements AbstractC88976q {

        /* renamed from: a */
        final /* synthetic */ C19538ai f125123a;

        static {
            Covode.recordClassIndex(64296);
        }

        C54584g(C19538ai aiVar) {
            this.f125123a = aiVar;
        }

        @Override // p4560f.p4561a.AbstractC88976q
        /* renamed from: a */
        public final void mo58447a(AbstractC88974o<C89378p<CheckMessage, SystemContent>> oVar) {
            C89219l.m154721d(oVar, "");
            CheckMessage checkMessage = (CheckMessage) C55214j.m100957a(this.f125123a.getLocalExt().get("s:send_response_check_msg"), CheckMessage.class);
            SystemContent content = CheckMessage.getContent(checkMessage);
            if (content != null) {
                oVar.mo143049a(new C89378p<>(checkMessage, content));
            } else {
                oVar.mo143048a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$k */
    static final class C54588k extends AbstractC89220m implements AbstractC89172b<C89378p<? extends CheckMessage, ? extends SystemContent>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125127a;

        /* renamed from: b */
        final /* synthetic */ C19538ai f125128b;

        static {
            Covode.recordClassIndex(64300);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54588k(ChatRoomViewModel chatRoomViewModel, C19538ai aiVar) {
            super(1);
            this.f125127a = chatRoomViewModel;
            this.f125128b = aiVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89378p<? extends CheckMessage, ? extends SystemContent> pVar) {
            C89378p<? extends CheckMessage, ? extends SystemContent> pVar2 = pVar;
            SystemContent systemContent = (SystemContent) pVar2.component2();
            CheckMessage.StatusMsg statusMsg = ((CheckMessage) pVar2.component1()).status_msg;
            if (statusMsg != null && statusMsg.msg_type == 1022) {
                AbstractC54432d dVar = this.f125127a.f125113j;
                String conversationId = this.f125128b.getConversationId();
                C89219l.m154716b(conversationId, "");
                dVar.mo91501a(systemContent, conversationId);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChatRoomViewModel(com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.data.c.l r2 = new com.ss.android.ugc.aweme.im.sdk.chat.data.c.l
            r2.<init>()
            com.ss.android.ugc.aweme.im.sdk.chat.data.c.h r3 = new com.ss.android.ugc.aweme.im.sdk.chat.data.c.h
            r3.<init>()
            com.ss.android.ugc.aweme.im.sdk.chat.a.c r4 = new com.ss.android.ugc.aweme.im.sdk.chat.a.c
            r4.<init>()
            com.ss.android.ugc.aweme.im.sdk.common.controller.h.a.a r5 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55127a.f126154a
            com.ss.android.ugc.aweme.im.sdk.chat.data.c.d r6 = new com.ss.android.ugc.aweme.im.sdk.chat.data.c.d
            java.lang.String r0 = "ChatRoomViewModel"
            r6.<init>(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.ui.base.e r7 = new com.ss.android.ugc.aweme.im.sdk.chat.ui.base.e
            r7.<init>()
            f.a.b.a r8 = new f.a.b.a
            r8.<init>()
            f.a.b.a r9 = new f.a.b.a
            r9.<init>()
            f.a.aa r0 = p4560f.p4561a.p4590k.C88946a.f201991c
            f.a.aa r10 = p4560f.p4561a.p4587h.C88925a.m154180b(r0)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r10, r0)
            r0 = r11
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.viewmodel.ChatRoomViewModel.<init>(com.ss.android.ugc.aweme.im.sdk.chat.data.a):void");
    }

    /* renamed from: a */
    public final void mo91662a(List<C19538ai> list) {
        C89219l.m154721d(list, "");
        AbstractC88410b b = this.f125113j.mo91504b(list).mo143242b(this.f125115l).mo143240b();
        C89219l.m154716b(b, "");
        C88934a.m154195a(C88939d.m154199a(b, new C54579b(this)), this.f125114k);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$h */
    static final class C54585h extends AbstractC89220m implements AbstractC89172b<C19638h, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125124a;

        static {
            Covode.recordClassIndex(64297);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54585h(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125124a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19638h hVar) {
            C19638h hVar2 = hVar;
            if (this.f125124a.f125107d.isStrangerChat()) {
                C89219l.m154716b(hVar2, "");
                if (!hVar2.isStranger()) {
                    this.f125124a.f125112i.mo90296b("refreshStrangerMode change to friend");
                    this.f125124a.f125107d.setChatType(0);
                    return C89391z.f203057a;
                }
            }
            if (this.f125124a.f125107d.isFriendChat()) {
                C89219l.m154716b(hVar2, "");
                if (hVar2.isStranger()) {
                    this.f125124a.f125112i.mo90296b("refreshStrangerMode change to stranger");
                    this.f125124a.f125107d.setChatType(1);
                    this.f125124a.f125108e.mo90315e(this.f125124a.f125107d.getConversationId());
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$o */
    public static final class C54592o extends AbstractC89220m implements AbstractC89172b<AbstractC53732a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125131a;

        static {
            Covode.recordClassIndex(64304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54592o(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125131a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC53732a aVar) {
            AbstractC53732a aVar2 = aVar;
            if (aVar2 instanceof C53754j) {
                this.f125131a.f125104a.onNext(new C53751g(this.f125131a.f125107d.getConversationId()));
            } else if (aVar2 instanceof C53752h) {
                this.f125131a.f125113j.mo91500a(((C53752h) aVar2).f123288a);
                this.f125131a.f125106c.onNext(C89391z.f203057a);
            } else if (aVar2 instanceof C53770z) {
                this.f125131a.f125106c.onNext(C89391z.f203057a);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$t */
    public static final class C54597t extends AbstractC89220m implements AbstractC89172b<C89391z, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125135a;

        static {
            Covode.recordClassIndex(64309);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54597t(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125135a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89391z zVar) {
            ChatRoomViewModel chatRoomViewModel = this.f125135a;
            String conversationId = chatRoomViewModel.f125107d.getConversationId();
            C89219l.m154721d(conversationId, "");
            AbstractC88973n<C19638h> a = chatRoomViewModel.f125109f.mo90307b(conversationId).mo143238a(new C54583f(chatRoomViewModel));
            C89219l.m154716b(a, "");
            AbstractC88973n<C19638h> b = a.mo143242b(chatRoomViewModel.f125115l);
            C89219l.m154716b(b, "");
            C54585h hVar = new C54585h(chatRoomViewModel);
            C88934a.m154195a(C88939d.m154201a(b, new C54587j(chatRoomViewModel), new C54586i(chatRoomViewModel), hVar), chatRoomViewModel.f125114k);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$r */
    public static final class C54595r extends AbstractC89220m implements AbstractC89172b<AbstractC53746c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ChatRoomViewModel f125133a;

        static {
            Covode.recordClassIndex(64307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54595r(ChatRoomViewModel chatRoomViewModel) {
            super(1);
            this.f125133a = chatRoomViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC53746c cVar) {
            AbstractC53746c cVar2 = cVar;
            if (cVar2 instanceof C53766v) {
                C19538ai aiVar = ((C53766v) cVar2).f123313b;
                if (this.f125133a.f125107d.isStrangerChat() && aiVar.getMsgStatus() == 2) {
                    this.f125133a.f125112i.mo90293a("onSendMsg: RefreshStrangerEvent");
                    this.f125133a.f125113j.mo91502a(this.f125133a.f125107d.getConversationId());
                }
                if (aiVar.getMsgStatus() == 3) {
                    AbstractC53721g gVar = this.f125133a.f125109f;
                    String conversationId = aiVar.getConversationId();
                    C89219l.m154716b(conversationId, "");
                    if (!gVar.mo90309d(conversationId)) {
                        this.f125133a.mo91663b();
                    }
                }
                ChatRoomViewModel chatRoomViewModel = this.f125133a;
                C89219l.m154721d(aiVar, "");
                if (aiVar.getMsgStatus() == 3) {
                    C89219l.m154721d(aiVar, "");
                    AbstractC88973n a = AbstractC88973n.m154243a((AbstractC88976q) new C54584g(aiVar));
                    C89219l.m154716b(a, "");
                    AbstractC88973n b = a.mo143242b(chatRoomViewModel.f125115l);
                    C89219l.m154716b(b, "");
                    C54588k kVar = new C54588k(chatRoomViewModel, aiVar);
                    C88934a.m154195a(C88939d.m154201a(b, new C54590m(chatRoomViewModel), new C54589l(chatRoomViewModel), kVar), chatRoomViewModel.f125114k);
                }
                this.f125133a.f125110g.mo90189a(aiVar);
            } else if (cVar2 instanceof C53756l) {
                C53756l lVar = (C53756l) cVar2;
                if (lVar.f123293b == 0) {
                    ChatRoomViewModel chatRoomViewModel2 = this.f125133a;
                    String conversationId2 = chatRoomViewModel2.f125107d.getConversationId();
                    C89219l.m154721d(conversationId2, "");
                    AbstractC88410b b2 = chatRoomViewModel2.f125109f.mo90305a(conversationId2, "awe:greet_emoji").mo142941b(chatRoomViewModel2.f125115l);
                    C89219l.m154716b(b2, "");
                    C88934a.m154195a(C88939d.m154199a(b2, new C54580c(chatRoomViewModel2)), chatRoomViewModel2.f125114k);
                }
                this.f125133a.mo91662a(lVar.f123292a);
            } else if (cVar2 instanceof C53762r) {
                C53762r rVar = (C53762r) cVar2;
                this.f125133a.f125113j.mo91503a(rVar.f123305a);
                this.f125133a.mo91662a(rVar.f123305a);
                this.f125133a.f125111h.mo92037a(new C55132c(this.f125133a.f125107d.getConversationId()), new C55131b(rVar.f123305a.size()));
            } else if (cVar2 instanceof C53761q) {
                C53761q qVar = (C53761q) cVar2;
                if (qVar.f123304b) {
                    this.f125133a.f125113j.mo91503a(qVar.f123303a);
                    this.f125133a.mo91662a(qVar.f123303a);
                }
            }
            return C89391z.f203057a;
        }
    }

    private ChatRoomViewModel(C53709a aVar, AbstractC53729k kVar, AbstractC53721g gVar, AbstractC53613b bVar, AbstractC56227c cVar, AbstractC53717c cVar2, AbstractC54432d dVar, C88411a aVar2, C88411a aVar3, AbstractC88398aa aaVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(cVar2, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        C89219l.m154721d(aaVar, "");
        this.f125107d = aVar;
        this.f125108e = kVar;
        this.f125109f = gVar;
        this.f125110g = bVar;
        this.f125111h = cVar;
        this.f125112i = cVar2;
        this.f125113j = dVar;
        this.f125114k = aVar2;
        this.f125116n = aVar3;
        this.f125115l = aaVar;
        C88960c<AbstractC53746c> cVar3 = new C88960c<>();
        C89219l.m154716b(cVar3, "");
        this.f125104a = cVar3;
        C88960c<AbstractC53732a> cVar4 = new C88960c<>();
        C89219l.m154716b(cVar4, "");
        this.f125105b = cVar4;
        C88960c<C89391z> cVar5 = new C88960c<>();
        C89219l.m154716b(cVar5, "");
        this.f125106c = cVar5;
    }
}
