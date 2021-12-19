package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3130ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.service.IFollowService;
import com.p2082ss.android.ugc.aweme.friends.services.FollowService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.IMFromMessageTips;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.IMNoticeMsgStruct;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ImChatTopTipModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ImChatTopTipModelKt;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SystemContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticePushStatus;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.BottomNoticeViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.SafeConversationConfirmation;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3127a.C54354a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3128b.C54361a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3128b.C54363b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3129c.C54364a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.C53701d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53700k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55052e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55058a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.C55276a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68066a;
import com.p2082ss.android.ugc.aweme.utils.C80243bg;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4601a.C89036ab;
import p4600h.p4601a.C89064i;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip */
public final class ChatTopTip extends LinearLayout implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static final C54367b f124519c = new C54367b((byte) 0);

    /* renamed from: a */
    C53709a f124520a;

    /* renamed from: b */
    public TuxTextView f124521b;

    /* renamed from: d */
    private AbstractC1204m f124522d;

    /* renamed from: e */
    private ImChatTopTipModel f124523e;

    /* renamed from: f */
    private TextView f124524f;

    /* renamed from: g */
    private AvatarImageView f124525g;

    /* renamed from: h */
    private TextView f124526h;

    /* renamed from: i */
    private TuxIconView f124527i;

    /* renamed from: j */
    private final AbstractC89516am f124528j;

    static {
        Covode.recordClassIndex(64068);
    }

    public ChatTopTip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(134, new RunnableC90250g(ChatTopTip.class, "onReceiveChatTopTipEvent", C54363b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(135, new RunnableC90250g(ChatTopTip.class, "onReceiveChatControlChange", C68066a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$b */
    public static final class C54367b {
        static {
            Covode.recordClassIndex(64070);
        }

        private C54367b() {
        }

        public /* synthetic */ C54367b(byte b) {
            this();
        }
    }

    public final AbstractC1204m getLifecycleOwner() {
        return this.f124522d;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$c */
    public static final class C54368c implements IFollowService.AbstractC51636a {

        /* renamed from: a */
        final /* synthetic */ ChatTopTip f124529a;

        static {
            Covode.recordClassIndex(64071);
        }

        /* renamed from: b */
        private static boolean m99679b() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.service.IFollowService.AbstractC51636a
        /* renamed from: a */
        public final void mo87342a() {
            C53700k.m98969a(new RunnableC54369a(this));
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$c$a */
        static final class RunnableC54369a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C54368c f124530a;

            static {
                Covode.recordClassIndex(64072);
            }

            RunnableC54369a(C54368c cVar) {
                this.f124530a = cVar;
            }

            public final void run() {
                TuxTextView tuxTextView = this.f124530a.f124529a.f124521b;
                if (tuxTextView != null) {
                    tuxTextView.setText(R.string.cdy);
                }
                TuxTextView tuxTextView2 = this.f124530a.f124529a.f124521b;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTuxFont(52);
                }
                this.f124530a.f124529a.setVisibility(8);
                AbstractC81915c.m141874a(new C55276a(this.f124530a.f124529a.getUid()));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54368c(ChatTopTip chatTopTip) {
            this.f124529a = chatTopTip;
        }

        @Override // com.p2082ss.android.ugc.aweme.friends.service.IFollowService.AbstractC51636a
        /* renamed from: a */
        public final void mo87343a(Exception exc) {
            Exception exc2;
            C89219l.m154721d(exc, "");
            String string = this.f124529a.getContext().getString(R.string.cdr);
            this.f124529a.getContext();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = m99679b();
            }
            if (!C58029j.f132253e) {
                string = this.f124529a.getContext().getString(R.string.dcq);
            } else {
                if (!(exc instanceof C34485a)) {
                    exc2 = null;
                } else {
                    exc2 = exc;
                }
                C34485a aVar = (C34485a) exc2;
                if (aVar != null) {
                    String errorMsg = aVar.getErrorMsg();
                    C89219l.m154716b(errorMsg, "");
                    if (errorMsg.length() > 0) {
                        string = aVar.getErrorMsg();
                    }
                }
                Throwable cause = exc.getCause();
                if (!(cause instanceof C34485a)) {
                    cause = null;
                }
                C34485a aVar2 = (C34485a) cause;
                if (aVar2 != null) {
                    String errorMsg2 = aVar2.getErrorMsg();
                    C89219l.m154716b(errorMsg2, "");
                    if (errorMsg2.length() > 0) {
                        string = aVar2.getErrorMsg();
                    }
                }
            }
            new C23144b(this.f124529a).mo37635a(string).mo37637b();
        }
    }

    public final String getSecUid() {
        String secUid;
        C53709a aVar = this.f124520a;
        if (!(aVar instanceof C54315a)) {
            return "";
        }
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        IMUser fromUser = ((C54315a) aVar).getFromUser();
        if (fromUser == null || (secUid = fromUser.getSecUid()) == null) {
            return "";
        }
        return secUid;
    }

    public final String getUid() {
        String uid;
        C53709a aVar = this.f124520a;
        if (!(aVar instanceof C54315a)) {
            return "";
        }
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        IMUser fromUser = ((C54315a) aVar).getFromUser();
        if (fromUser == null || (uid = fromUser.getUid()) == null) {
            return "";
        }
        return uid;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        AbstractC1196i lifecycle;
        EventBus.m156962a().mo145395b(this);
        AbstractC1204m mVar = this.f124522d;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.mo4013b(this);
        }
        C89517an.m155450b(this.f124528j);
    }

    /* renamed from: c */
    private final void m99676c() {
        MethodCollector.m26663i(5710);
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.a4_, this);
        this.f124526h = (TextView) findViewById(R.id.bj2);
        this.f124527i = (TuxIconView) findViewById(R.id.bj3);
        MethodCollector.m26664o(5710);
    }

    /* renamed from: b */
    private final void m99674b() {
        MethodCollector.m26663i(5708);
        removeAllViews();
        LayoutInflater.from(getContext()).inflate(R.layout.a4a, this);
        this.f124524f = (TextView) findViewById(R.id.em3);
        this.f124521b = (TuxTextView) findViewById(R.id.el6);
        this.f124525g = (AvatarImageView) findViewById(R.id.ekv);
        setVisibility(0);
        TuxTextView tuxTextView = this.f124521b;
        if (tuxTextView != null) {
            tuxTextView.setOnClickListener(new View$OnClickListenerC54374g(this));
            tuxTextView.setText(R.string.bxw);
            tuxTextView.setTuxFont(62);
            MethodCollector.m26664o(5708);
            return;
        }
        MethodCollector.m26664o(5708);
    }

    /* renamed from: a */
    public final void mo91439a() {
        String str;
        IMNoticeMsgStruct noticeMsgStruct;
        Integer msgType;
        IMNoticeMsgStruct noticeMsgStruct2;
        if (getVisibility() == 0) {
            ImChatTopTipModel imChatTopTipModel = this.f124523e;
            String str2 = null;
            if (imChatTopTipModel == null || (noticeMsgStruct2 = imChatTopTipModel.getNoticeMsgStruct()) == null || (str = noticeMsgStruct2.getNoticeCode()) == null) {
                str = "";
            }
            ImChatTopTipModel imChatTopTipModel2 = this.f124523e;
            if (imChatTopTipModel2 != null && (noticeMsgStruct = imChatTopTipModel2.getNoticeMsgStruct()) != null && (msgType = noticeMsgStruct.getMsgType()) != null && msgType.intValue() == 1026) {
                C53709a aVar = this.f124520a;
                if (aVar != null) {
                    str2 = aVar.getConversationId();
                }
                C54364a.m99670a(str, str2, 1);
                removeAllViews();
                setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$a */
    public static final class C54366a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(64069);
        }

        public C54366a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
            C56244a.m102193e("ChatTopTip", "fetchChatTopTip error: " + th.getMessage());
        }
    }

    public final void setLifecycleOwner(AbstractC1204m mVar) {
        this.f124522d = mVar;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onReceiveChatControlChange(C68066a aVar) {
        C89219l.m154721d(aVar, "");
        C53709a aVar2 = this.f124520a;
        if (aVar2 != null) {
            m99675b(aVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$e */
    public static final class View$OnClickListenerC54371e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatTopTip f124533a;

        static {
            Covode.recordClassIndex(64074);
        }

        View$OnClickListenerC54371e(ChatTopTip chatTopTip) {
            this.f124533a = chatTopTip;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C54354a.m99667a(1, C54354a.C54359e.f124505a);
            this.f124533a.mo91439a();
        }
    }

    /* renamed from: a */
    private final void m99671a(SystemContent systemContent) {
        SystemContent.Key key;
        SystemContent.Key[] template = systemContent.getTemplate();
        if (template != null && (key = (SystemContent.Key) C89064i.m154503d(template)) != null && key.getAction() == 8) {
            C53615d.m98861a(this.f124520a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$d */
    public static final class View$OnClickListenerC54370d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatTopTip f124531a;

        /* renamed from: b */
        final /* synthetic */ ImChatTopTipModel f124532b;

        static {
            Covode.recordClassIndex(64073);
        }

        View$OnClickListenerC54370d(ChatTopTip chatTopTip, ImChatTopTipModel imChatTopTipModel) {
            this.f124531a = chatTopTip;
            this.f124532b = imChatTopTipModel;
        }

        public final void onClick(View view) {
            String noticeCode;
            ClickAgent.onClick(view);
            IMNoticeMsgStruct noticeMsgStruct = this.f124532b.getNoticeMsgStruct();
            if (!(noticeMsgStruct == null || (noticeCode = noticeMsgStruct.getNoticeCode()) == null || noticeCode.length() == 0)) {
                Set<String> stringSet = C54361a.m99669a().getStringSet("key_notice_had_ack", C89036ab.INSTANCE);
                Keva a = C54361a.m99669a();
                stringSet.add(noticeCode);
                a.storeStringSet("key_notice_had_ack", stringSet);
            }
            this.f124531a.removeAllViews();
            this.f124531a.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$g */
    public static final class View$OnClickListenerC54374g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChatTopTip f124541a;

        static {
            Covode.recordClassIndex(64077);
        }

        View$OnClickListenerC54374g(ChatTopTip chatTopTip) {
            this.f124541a = chatTopTip;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ChatTopTip chatTopTip = this.f124541a;
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", C55058a.m100683a(chatTopTip.f124520a));
            hashMap.put("enter_method", "follow_button");
            C39162r.m79460a("follow", hashMap);
            FollowService.createIFollowServicebyMonsterPlugin(false).sendRequest(chatTopTip.getUid(), chatTopTip.getSecUid(), 1, new C54368c(chatTopTip));
        }
    }

    /* renamed from: b */
    private final void m99675b(C53709a aVar) {
        TopChatNoticePushStatus topChatNoticePushStatus;
        if (C80428fg.m139432a(getContext())) {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_ON;
        } else {
            topChatNoticePushStatus = TopChatNoticePushStatus.PUSH_STATUS_OFF;
        }
        AbstractC89568bz unused = C89624i.m155555a(this.f124528j, C89546bf.f203267b, null, new C54372f(this, aVar, topChatNoticePushStatus.getStatus(), null), 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$f */
    public static final class C54372f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f124534a;

        /* renamed from: b */
        final /* synthetic */ ChatTopTip f124535b;

        /* renamed from: c */
        final /* synthetic */ C53709a f124536c;

        /* renamed from: d */
        final /* synthetic */ int f124537d;

        static {
            Covode.recordClassIndex(64075);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54372f(ChatTopTip chatTopTip, C53709a aVar, int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f124535b = chatTopTip;
            this.f124536c = aVar;
            this.f124537d = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54372f(this.f124535b, this.f124536c, this.f124537d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54372f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x005b A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                h.c.a.a r3 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r12.f124534a
                r4 = 2
                r1 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r1) goto L_0x0046
                if (r0 != r4) goto L_0x005c
                p4600h.C89382r.m154942a(r13)
            L_0x000f:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0012:
                p4600h.C89382r.m154942a(r13)
                com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi r5 = com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55262b.m101019a()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip r0 = r12.f124535b
                java.lang.String r6 = r0.getUid()
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip r0 = r12.f124535b
                java.lang.String r7 = r0.getSecUid()
                com.ss.android.ugc.aweme.im.sdk.chat.data.a r0 = r12.f124536c
                java.lang.String r8 = r0.getConversationId()
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType.DM_CHAT
                java.lang.String r9 = r0.getType()
                com.ss.android.ugc.aweme.im.sdk.chat.data.a r0 = r12.f124536c
                int r10 = r0.getUnreadCount()
                int r11 = r12.f124537d
                kotlinx.coroutines.av r0 = r5.getTopChatNotice(r6, r7, r8, r9, r10, r11)
                r12.f124534a = r1
                java.lang.Object r13 = r0.mo144106a(r12)
                if (r13 != r3) goto L_0x0049
                return r3
            L_0x0046:
                p4600h.C89382r.m154942a(r13)
            L_0x0049:
                com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel r13 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ImChatTopTipModel) r13
                kotlinx.coroutines.android.b r2 = com.p2082ss.android.ugc.aweme.p2304af.C33429a.f79465a
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$f$1 r1 = new com.ss.android.ugc.aweme.im.sdk.chat.feature.top.ui.ChatTopTip$f$1
                r0 = 0
                r1.<init>(r12, r13, r0)
                r12.f124534a = r4
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r12)
                if (r0 != r3) goto L_0x000f
                return r3
            L_0x005c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.p3130ui.ChatTopTip.C54372f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onReceiveChatTopTipEvent(C54363b bVar) {
        String str;
        String tips;
        C89219l.m154721d(bVar, "");
        String str2 = bVar.f124511b;
        C53709a aVar = this.f124520a;
        if (aVar != null) {
            str = aVar.getConversationId();
        } else {
            str = null;
        }
        if (!(!C89219l.m154714a((Object) str2, (Object) str)) && (tips = bVar.f124510a.getTips()) != null && tips.length() != 0) {
            m99674b();
            AvatarImageView avatarImageView = this.f124525g;
            if (avatarImageView != null) {
                avatarImageView.setVisibility(8);
            }
            TuxTextView tuxTextView = this.f124521b;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            m99672a(bVar.f124510a, this.f124524f, -1, "", R.color.bx);
            C56244a.m102190b("ChatTopTip", "onReceiveChatTopTipEvent");
        }
    }

    /* renamed from: a */
    public final void mo91440a(C53709a aVar) {
        C89219l.m154721d(aVar, "");
        if (aVar.getSelectMsgType() == 1) {
            setVisibility(8);
            return;
        }
        this.f124520a = aVar;
        m99675b(aVar);
    }

    public final void setTips(ImChatTopTipModel imChatTopTipModel) {
        Integer num;
        String str;
        Integer msgType;
        IMFromMessageTips msgContent;
        String tips;
        IMUser fromUser;
        MethodCollector.m26663i(5848);
        this.f124523e = imChatTopTipModel;
        if (imChatTopTipModel == null || imChatTopTipModel.getNoticeMsgStruct() == null) {
            setVisibility(8);
            MethodCollector.m26664o(5848);
            return;
        }
        StringBuilder sb = new StringBuilder("ChatTopTip: setTips ");
        IMNoticeMsgStruct noticeMsgStruct = imChatTopTipModel.getNoticeMsgStruct();
        C54315a aVar = null;
        if (noticeMsgStruct != null) {
            num = noticeMsgStruct.getMsgType();
        } else {
            num = null;
        }
        C56244a.m102190b("ChatTopTip", sb.append(num).toString());
        IMNoticeMsgStruct noticeMsgStruct2 = imChatTopTipModel.getNoticeMsgStruct();
        if (noticeMsgStruct2 != null) {
            str = noticeMsgStruct2.getNoticeCode();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (str.length() != 0 && C54361a.m99669a().getStringSet("key_notice_had_ack", C89036ab.INSTANCE).contains(str)) {
            setVisibility(8);
            MethodCollector.m26664o(5848);
            return;
        }
        setVisibility(0);
        IMNoticeMsgStruct noticeMsgStruct3 = imChatTopTipModel.getNoticeMsgStruct();
        if (!(noticeMsgStruct3 == null || (msgType = noticeMsgStruct3.getMsgType()) == null)) {
            if (msgType.intValue() == 1023) {
                m99674b();
                C53709a aVar2 = this.f124520a;
                if (aVar2 instanceof C54315a) {
                    aVar = aVar2;
                }
                C54315a aVar3 = aVar;
                if (aVar3 == null || (fromUser = aVar3.getFromUser()) == null) {
                    MethodCollector.m26664o(5848);
                    return;
                }
                AvatarImageView avatarImageView = this.f124525g;
                if (avatarImageView != null) {
                    avatarImageView.setVisibility(0);
                }
                TuxTextView tuxTextView = this.f124521b;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                }
                C34577e.m70592a(this.f124525g, fromUser.getDisplayAvatar());
                m99672a(ImChatTopTipModelKt.toSystemContent(imChatTopTipModel), this.f124524f, msgType.intValue(), "", R.color.bx);
                C59256u a = new C59256u().mo96834a(C55058a.m100683a(this.f124520a));
                a.f135352b = C59256u.EnumC59257a.SHOW;
                User user = new User();
                user.setUid(fromUser.getUid());
                user.setFollowStatus(fromUser.getFollowStatus());
                a.mo96832a(user).mo96792f();
                MethodCollector.m26664o(5848);
                return;
            } else if (msgType.intValue() == 1022) {
                m99674b();
                AvatarImageView avatarImageView2 = this.f124525g;
                if (avatarImageView2 != null) {
                    avatarImageView2.setVisibility(8);
                }
                TuxTextView tuxTextView2 = this.f124521b;
                if (tuxTextView2 != null) {
                    tuxTextView2.setVisibility(8);
                }
                SystemContent systemContent = ImChatTopTipModelKt.toSystemContent(imChatTopTipModel);
                m99672a(systemContent, this.f124524f, msgType.intValue(), "", R.color.bx);
                m99671a(systemContent);
                MethodCollector.m26664o(5848);
                return;
            } else if (msgType.intValue() == 1024) {
                m99676c();
                TextView textView = this.f124526h;
                if (textView != null) {
                    IMNoticeMsgStruct noticeMsgStruct4 = imChatTopTipModel.getNoticeMsgStruct();
                    if (!(noticeMsgStruct4 == null || (msgContent = noticeMsgStruct4.getMsgContent()) == null || (tips = msgContent.getTips()) == null)) {
                        str2 = tips;
                    }
                    textView.setText(str2);
                }
                TuxIconView tuxIconView = this.f124527i;
                if (tuxIconView != null) {
                    tuxIconView.setOnClickListener(new View$OnClickListenerC54370d(this, imChatTopTipModel));
                    MethodCollector.m26664o(5848);
                    return;
                }
                MethodCollector.m26664o(5848);
                return;
            } else if (msgType.intValue() == 1026) {
                if (C55052e.m100673d()) {
                    View rootView = getRootView();
                    C89219l.m154716b(rootView, str2);
                    SafeConversationConfirmation safeConversationConfirmation = (SafeConversationConfirmation) rootView.findViewById(R.id.d_k);
                    C53709a aVar4 = this.f124520a;
                    C89219l.m154721d(str, str2);
                    BottomNoticeViewModel viewModel = safeConversationConfirmation.getViewModel();
                    C89219l.m154721d(str, str2);
                    viewModel.f124485a = aVar4;
                    viewModel.f124486b = str;
                    if (safeConversationConfirmation.f124488a) {
                        safeConversationConfirmation.setVisibility(0);
                    } else {
                        safeConversationConfirmation.f124488a = true;
                        View.inflate(safeConversationConfirmation.getContext(), R.layout.a8n, safeConversationConfirmation);
                        safeConversationConfirmation.getFirstButton().setTuxFont(51);
                        safeConversationConfirmation.getSecondButton().setTuxFont(52);
                        safeConversationConfirmation.setVisibility(0);
                        safeConversationConfirmation.getCloseButton().setOnClickListener(new SafeConversationConfirmation.View$OnClickListenerC54349c(safeConversationConfirmation));
                        safeConversationConfirmation.getFirstButton().setOnClickListener(new SafeConversationConfirmation.View$OnClickListenerC54350d(safeConversationConfirmation));
                        safeConversationConfirmation.getSecondButton().setOnClickListener(new SafeConversationConfirmation.View$OnClickListenerC54351e(safeConversationConfirmation));
                    }
                    C54354a.m99664a();
                } else if (C55052e.m100672c()) {
                    m99676c();
                    AvatarImageView avatarImageView3 = this.f124525g;
                    if (avatarImageView3 != null) {
                        avatarImageView3.setVisibility(8);
                    }
                    TuxTextView tuxTextView3 = this.f124521b;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setVisibility(8);
                    }
                    SystemContent systemContent2 = ImChatTopTipModelKt.toSystemContent(imChatTopTipModel);
                    m99672a(systemContent2, this.f124526h, msgType.intValue(), str, R.color.bd);
                    m99671a(systemContent2);
                    C54354a.m99664a();
                    TuxIconView tuxIconView2 = this.f124527i;
                    if (tuxIconView2 != null) {
                        tuxIconView2.setOnClickListener(new View$OnClickListenerC54371e(this));
                        MethodCollector.m26664o(5848);
                        return;
                    }
                    MethodCollector.m26664o(5848);
                    return;
                } else {
                    setVisibility(8);
                    MethodCollector.m26664o(5848);
                    return;
                }
            }
        }
        setVisibility(8);
        MethodCollector.m26664o(5848);
    }

    private /* synthetic */ ChatTopTip(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ChatTopTip(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        AbstractC1196i lifecycle;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5998);
        this.f124528j = C89517an.m155448a(new C54366a(CoroutineExceptionHandler.f203145c));
        setVisibility(8);
        Activity a = C80243bg.m139083a(context);
        AbstractC1204m mVar = (AbstractC1204m) (!(a instanceof AbstractC1204m) ? null : a);
        this.f124522d = mVar;
        if (mVar == null || (lifecycle = mVar.getLifecycle()) == null) {
            MethodCollector.m26664o(5998);
            return;
        }
        lifecycle.mo4012a(this);
        MethodCollector.m26664o(5998);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private final void m99672a(SystemContent systemContent, TextView textView, int i, String str, int i2) {
        C53701d.m98974a(this, null, systemContent, textView, getUid(), getSecUid(), C0643b.m2378c(getContext(), i2), C0643b.m2378c(getContext(), R.color.c9), true, i, str, this.f124520a);
    }
}
