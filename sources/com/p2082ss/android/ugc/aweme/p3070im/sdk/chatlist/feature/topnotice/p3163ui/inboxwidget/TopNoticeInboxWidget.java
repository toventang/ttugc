package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.inboxwidget;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.C54956a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.EnumC54957b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget */
public final class TopNoticeInboxWidget extends InboxAdapterWidget implements AbstractC33974au {

    /* renamed from: a */
    public final C1213t<InboxAdapterWidget.EnumC56518b> f125815a;

    /* renamed from: b */
    public final C54956a f125816b;

    /* renamed from: c */
    private final LiveData<InboxAdapterWidget.EnumC56518b> f125817c;

    /* renamed from: i */
    private final C1213t<Boolean> f125818i;

    /* renamed from: j */
    private final RecyclerView.AbstractC1350a<?> f125819j;

    /* renamed from: k */
    private final SessionListTopNoticeViewModel f125820k;

    /* renamed from: l */
    private final AbstractC89171a<Integer> f125821l;

    /* renamed from: m */
    private final AbstractC89172b<Context, Boolean> f125822m;

    static {
        Covode.recordClassIndex(64687);
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: a */
    public final int mo87485a(int i) {
        return -1;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    public final C1213t<Boolean> bw_() {
        return this.f125818i;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: f */
    public final LiveData<InboxAdapterWidget.EnumC56518b> mo87492f() {
        return this.f125817c;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: g */
    public final RecyclerView.AbstractC1350a<?> mo87493g() {
        return this.f125819j;
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget
    /* renamed from: h */
    public final void mo87494h() {
        int intValue = this.f125821l.invoke().intValue();
        AbstractC89172b<Context, Boolean> bVar = this.f125822m;
        Context requireContext = this.f128856e.requireContext();
        C89219l.m154716b(requireContext, "");
        this.f125820k.mo91942a(intValue, bVar.invoke(requireContext).booleanValue());
        this.f125815a.setValue(InboxAdapterWidget.EnumC56518b.LOADING);
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        this.f125820k.f125837i.observe(this.f128856e, new C54965a(this));
        this.f125820k.f125833e.observe(this.f128856e, new C54966b(this));
        this.f125820k.f125835g.observe(this.f128856e, new C54967c(this));
        mo87494h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget$c */
    public static final class C54967c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ TopNoticeInboxWidget f125827a;

        static {
            Covode.recordClassIndex(64692);
        }

        C54967c(TopNoticeInboxWidget topNoticeInboxWidget) {
            this.f125827a = topNoticeInboxWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C80428fg.m139434b(this.f125827a.f128856e.requireContext());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget$b */
    public static final class C54966b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ TopNoticeInboxWidget f125826a;

        static {
            Covode.recordClassIndex(64691);
        }

        C54966b(TopNoticeInboxWidget topNoticeInboxWidget) {
            this.f125826a = topNoticeInboxWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            SmartRouter.buildRoute(this.f125826a.f128856e.requireContext(), "aweme://push_setting_manager").open();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget$a */
    public static final class C54965a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ TopNoticeInboxWidget f125825a;

        static {
            Covode.recordClassIndex(64690);
        }

        C54965a(TopNoticeInboxWidget topNoticeInboxWidget) {
            this.f125825a = topNoticeInboxWidget;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (obj == EnumC54957b.EmptyTopNoticeView) {
                this.f125825a.f125816b.mo5018a(C89086z.INSTANCE);
                this.f125825a.f125815a.setValue(InboxAdapterWidget.EnumC56518b.EMPTY);
                return;
            }
            this.f125825a.f125816b.mo5018a(C89070n.m154516a(obj));
            this.f125825a.f125815a.setValue(InboxAdapterWidget.EnumC56518b.SUCCESS);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TopNoticeInboxWidget(androidx.fragment.app.Fragment r10, androidx.lifecycle.LiveData r11) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel r1 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel
            java.lang.String r2 = "notification_page"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a r6 = new com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.a
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.TopChatNoticeSourceType r0 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.TopChatNoticeSourceType.INBOX
            r6.<init>(r0, r1)
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget$1 r7 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.inboxwidget.TopNoticeInboxWidget.C549631.f125823a
            com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget$2 r8 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.inboxwidget.TopNoticeInboxWidget.C549642.f125824a
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.p3163ui.inboxwidget.TopNoticeInboxWidget.<init>(androidx.fragment.app.Fragment, androidx.lifecycle.LiveData):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super android.content.Context, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TopNoticeInboxWidget(Fragment fragment, LiveData<InboxAdapterWidget.EnumC56518b> liveData, SessionListTopNoticeViewModel sessionListTopNoticeViewModel, C54956a aVar, AbstractC89171a<Integer> aVar2, AbstractC89172b<? super Context, Boolean> bVar) {
        super(fragment, liveData);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(liveData, "");
        C89219l.m154721d(sessionListTopNoticeViewModel, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(bVar, "");
        this.f125820k = sessionListTopNoticeViewModel;
        this.f125816b = aVar;
        this.f125821l = aVar2;
        this.f125822m = bVar;
        C1213t<InboxAdapterWidget.EnumC56518b> tVar = new C1213t<>();
        this.f125815a = tVar;
        this.f125817c = tVar;
        this.f125818i = new C1213t<>();
        this.f125819j = aVar;
    }
}
