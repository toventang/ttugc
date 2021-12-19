package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticePushStatus;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.EnumC54957b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.TikTokImApi;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Map;
import kotlinx.coroutines.AbstractC89507ah;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89531av;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel */
public class SessionListTopNoticeViewModel extends AbstractC1174ac {

    /* renamed from: m */
    public static final C54971c f125828m = new C54971c((byte) 0);

    /* renamed from: a */
    private final AbstractC89516am f125829a;

    /* renamed from: b */
    private final CoroutineExceptionHandler f125830b;

    /* renamed from: c */
    private final CoroutineExceptionHandler f125831c;

    /* renamed from: d */
    public final C1213t<C54976b<C89391z>> f125832d;

    /* renamed from: e */
    public final LiveData<C54976b<C89391z>> f125833e;

    /* renamed from: f */
    public final C1213t<C54976b<C89391z>> f125834f;

    /* renamed from: g */
    public final LiveData<C54976b<C89391z>> f125835g;

    /* renamed from: h */
    public final C1213t<EnumC54957b> f125836h;

    /* renamed from: i */
    public final LiveData<EnumC54957b> f125837i;

    /* renamed from: j */
    public final TikTokImApi f125838j;

    /* renamed from: k */
    public final C55219n f125839k;

    /* renamed from: l */
    public final AbstractC89507ah f125840l;

    /* renamed from: n */
    private final String f125841n;

    /* renamed from: o */
    private final AbstractC89183m<String, Map<String, String>, C89391z> f125842o;

    /* renamed from: p */
    private final AbstractC89507ah f125843p;

    static {
        Covode.recordClassIndex(64693);
    }

    public SessionListTopNoticeViewModel() {
        this(null, null, null, null, null, null, 63);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$c */
    public static final class C54971c {
        static {
            Covode.recordClassIndex(64697);
        }

        private C54971c() {
        }

        public /* synthetic */ C54971c(byte b) {
            this();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public void onCleared() {
        super.onCleared();
        C89517an.m155450b(this.f125829a);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$a */
    public static final class C54969a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(64695);
        }

        public C54969a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C56244a.m102193e("TopNoticeViewModel", "fetchTopNoticeService onError called with ".concat(String.valueOf(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$b */
    public static final class C54970b extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(64696);
        }

        public C54970b(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C56244a.m102193e("TopNoticeViewModel", "sendNoticeAckService onError called with ".concat(String.valueOf(th)));
        }
    }

    /* renamed from: a */
    public final void mo91943a(String str) {
        String eventPopUpType;
        EnumC54957b value = this.f125836h.getValue();
        if (value != null && (eventPopUpType = value.getEventPopUpType()) != null) {
            this.f125842o.invoke(str, C89041ag.m154421a(C89387v.m154943a("enter_from", this.f125841n), C89387v.m154943a("pop_up_type", eventPopUpType)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$d */
    public static final class C54972d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f125845a;

        /* renamed from: b */
        final /* synthetic */ SessionListTopNoticeViewModel f125846b;

        /* renamed from: c */
        final /* synthetic */ int f125847c;

        /* renamed from: d */
        final /* synthetic */ TopChatNoticePushStatus f125848d;

        static {
            Covode.recordClassIndex(64698);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54972d(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, int i, TopChatNoticePushStatus topChatNoticePushStatus, AbstractC89124d dVar) {
            super(2, dVar);
            this.f125846b = sessionListTopNoticeViewModel;
            this.f125847c = i;
            this.f125848d = topChatNoticePushStatus;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54972d(this.f125846b, this.f125847c, this.f125848d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54972d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0051 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r12.f125845a
                r4 = 2
                r1 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r1) goto L_0x003a
                if (r0 != r4) goto L_0x0052
                p4600h.C89382r.m154942a(r13)
            L_0x000f:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0012:
                p4600h.C89382r.m154942a(r13)
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel r0 = r12.f125846b
                com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r5 = r0.f125838j
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType.INBOX
                java.lang.String r9 = r0.getType()
                int r10 = r12.f125847c
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticePushStatus r0 = r12.f125848d
                int r11 = r0.getStatus()
                java.lang.String r6 = ""
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                kotlinx.coroutines.av r0 = r5.getTopChatNotice(r6, r7, r8, r9, r10, r11)
                r12.f125845a = r1
                java.lang.Object r13 = r0.mo144106a(r12)
                if (r13 != r3) goto L_0x003d
                return r3
            L_0x003a:
                p4600h.C89382r.m154942a(r13)
            L_0x003d:
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel r13 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ImChatTopTipModel) r13
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel r0 = r12.f125846b
                kotlinx.coroutines.ah r2 = r0.f125840l
                com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$d$1 r1 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$d$1
                r0 = 0
                r1.<init>(r12, r13, r0)
                r12.f125845a = r4
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r12)
                if (r0 != r3) goto L_0x000f
                return r3
            L_0x0052:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel.C54972d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$e */
    public static final class C54974e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f125852a;

        /* renamed from: b */
        final /* synthetic */ SessionListTopNoticeViewModel f125853b;

        /* renamed from: c */
        final /* synthetic */ String f125854c;

        /* renamed from: d */
        final /* synthetic */ TopChatNoticeSourceType f125855d;

        /* renamed from: e */
        final /* synthetic */ int f125856e;

        /* renamed from: f */
        final /* synthetic */ String f125857f;

        static {
            Covode.recordClassIndex(64700);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54974e(SessionListTopNoticeViewModel sessionListTopNoticeViewModel, String str, TopChatNoticeSourceType topChatNoticeSourceType, int i, String str2, AbstractC89124d dVar) {
            super(2, dVar);
            this.f125853b = sessionListTopNoticeViewModel;
            this.f125854c = str;
            this.f125855d = topChatNoticeSourceType;
            this.f125856e = i;
            this.f125857f = str2;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54974e(this.f125853b, this.f125854c, this.f125855d, this.f125856e, this.f125857f, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54974e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f125852a;
            if (i == 0) {
                C89382r.m154942a(obj);
                AbstractC89531av<BaseResponse> acknowledgeNoticeRead = this.f125853b.f125838j.acknowledgeNoticeRead(this.f125854c, this.f125855d.getType(), this.f125856e, this.f125857f);
                this.f125852a = 1;
                obj = acknowledgeNoticeRead.mo144106a(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56244a.m102191c("TopNoticeViewModel", "sendNoticeAckService OnSuccess called with " + ((BaseResponse) obj).status_code);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo91942a(int i, boolean z) {
        TopChatNoticePushStatus topChatNoticePushStatus;
        if (z) {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_ON;
        } else {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_OFF;
        }
        AbstractC89568bz unused = C89624i.m155555a(this.f125829a, this.f125830b, null, new C54972d(this, i, topChatNoticePushStatus, null), 2);
    }

    /* renamed from: a */
    public final void mo91944a(String str, TopChatNoticeSourceType topChatNoticeSourceType, int i, String str2) {
        C89219l.m154721d(topChatNoticeSourceType, "");
        if (str == null || C89361p.m154870a((CharSequence) str)) {
            C56244a.m102192d("TopNoticeViewModel", "sendNoticeAckEvent notice code is null ".concat(String.valueOf(str)));
        } else {
            AbstractC89568bz unused = C89624i.m155555a(this.f125829a, this.f125831c, null, new C54974e(this, str, topChatNoticeSourceType, i, str2, null), 2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.m<? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private SessionListTopNoticeViewModel(String str, TikTokImApi tikTokImApi, AbstractC89183m<? super String, ? super Map<String, String>, C89391z> mVar, C55219n nVar, AbstractC89507ah ahVar, AbstractC89507ah ahVar2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(tikTokImApi, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(nVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(ahVar2, "");
        this.f125841n = str;
        this.f125838j = tikTokImApi;
        this.f125842o = mVar;
        this.f125839k = nVar;
        this.f125843p = ahVar;
        this.f125840l = ahVar2;
        C1213t<C54976b<C89391z>> tVar = new C1213t<>();
        this.f125832d = tVar;
        this.f125833e = tVar;
        C1213t<C54976b<C89391z>> tVar2 = new C1213t<>();
        this.f125834f = tVar2;
        this.f125835g = tVar2;
        C1213t<EnumC54957b> tVar3 = new C1213t<>();
        this.f125836h = tVar3;
        this.f125837i = tVar3;
        this.f125829a = C89517an.m155448a(ahVar);
        this.f125830b = new C54969a(CoroutineExceptionHandler.f203145c);
        this.f125831c = new C54970b(CoroutineExceptionHandler.f203145c);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SessionListTopNoticeViewModel(java.lang.String r9, com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.TikTokImApi r10, p4600h.p4611f.p4612a.AbstractC89183m r11, com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n r12, kotlinx.coroutines.AbstractC89507ah r13, kotlinx.coroutines.AbstractC89507ah r14, int r15) {
        /*
            r8 = this;
            r7 = r14
            r6 = r13
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0 = r15 & 1
            if (r0 == 0) goto L_0x000c
            java.lang.String r2 = "chat_list"
        L_0x000c:
            r0 = r15 & 2
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0019
            com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r3 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55262b.m101019a()
            p4600h.p4611f.p4613b.C89219l.m154716b(r3, r1)
        L_0x0019:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel$1 r4 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel.C549681.f125844a
        L_0x001f:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x002a
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n r5 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n.m100965a()
            p4600h.p4611f.p4613b.C89219l.m154716b(r5, r1)
        L_0x002a:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0030
            kotlinx.coroutines.ah r6 = kotlinx.coroutines.C89546bf.f203267b
        L_0x0030:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x0036
            kotlinx.coroutines.android.b r7 = com.p2082ss.android.ugc.aweme.p2304af.C33429a.f79465a
        L_0x0036:
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel.<init>(java.lang.String, com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi, h.f.a.m, com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n, kotlinx.coroutines.ah, kotlinx.coroutines.ah, int):void");
    }
}
