package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.p032a.C0637f;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.emoji.p2897b.C46447a;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46460b;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46616a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.EmojiContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3107a.C54086b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54101a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.p3108b.p3110b.p3112b.C54111b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui.DialogInterface$OnDismissListenerC54209b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.SoftInputResizeFuncLayoutView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.reply.p3123ui.ReplyMessageLayout;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.C54346b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53651a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.activity.ChatRoomActivity;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.SearchableEditText;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.viewmodel.ChatViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55080c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55195e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55196f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.p3187a.p3188a.AbstractC55249a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3196a.C55326b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView */
public final class InputView extends BaseInputView implements TextWatcher, View.OnClickListener, AbstractC54141a {

    /* renamed from: m */
    public static final String f124043m = InputView.class.getSimpleName();

    /* renamed from: n */
    public static final C54131a f124044n = new C54131a((byte) 0);

    /* renamed from: j */
    public ViewGroup f124045j;

    /* renamed from: k */
    public final ChatViewModel f124046k;

    /* renamed from: l */
    public final C53709a f124047l;

    /* renamed from: o */
    private final AbstractC89244h f124048o = C89250i.m154773a((AbstractC89171a) new C54133c(this));

    /* renamed from: p */
    private final AbstractC89244h f124049p = C89250i.m154773a((AbstractC89171a) new C54140j(this));

    /* renamed from: q */
    private final AbstractC89244h f124050q = C89250i.m154773a((AbstractC89171a) new C54134d(this));

    /* renamed from: r */
    private C54111b f124051r;

    /* renamed from: s */
    private TuxIconView f124052s;

    /* renamed from: t */
    private ReplyMessageLayout f124053t;

    /* renamed from: u */
    private boolean f124054u;

    /* renamed from: v */
    private boolean f124055v = true;

    /* renamed from: w */
    private final RunnableC54132b f124056w;

    /* renamed from: x */
    private final boolean f124057x;

    /* renamed from: y */
    private final WeakReference<Fragment> f124058y;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$a */
    public static final class C54131a {
        static {
            Covode.recordClassIndex(63810);
        }

        private C54131a() {
        }

        public /* synthetic */ C54131a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$b */
    final class RunnableC54132b implements Runnable {

        /* renamed from: a */
        long f124059a;

        static {
            Covode.recordClassIndex(63811);
        }

        public final void run() {
            this.f124059a = SystemClock.elapsedRealtime();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC54132b() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: o */
    public final void mo91229o() {
        C54086b.m99274a("chat");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: p */
    public final void mo91235p() {
        C54086b.m99275b("chat");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$c */
    static final class C54133c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ InputView f124061a;

        static {
            Covode.recordClassIndex(63812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54133c(InputView inputView) {
            super(0);
            this.f124061a = inputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0637f.m2349b(this.f124061a.mo91223i().getResources(), R.color.c5, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$d */
    static final class C54134d extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ InputView f124062a;

        static {
            Covode.recordClassIndex(63813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54134d(InputView inputView) {
            super(0);
            this.f124062a = inputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0637f.m2349b(this.f124062a.mo91223i().getResources(), R.color.c5, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$j */
    static final class C54140j extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ InputView f124071a;

        static {
            Covode.recordClassIndex(63819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54140j(InputView inputView) {
            super(0);
            this.f124071a = inputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C0637f.m2349b(this.f124071a.mo91223i().getResources(), R.color.bx, null));
        }
    }

    static {
        Covode.recordClassIndex(63809);
    }

    /* renamed from: v */
    private final void m99362v() {
        if (!this.f124055v) {
            mo91200a().setVisibility(8);
        }
        if (!this.f124054u) {
            mo91214b().setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: j */
    public final void mo91224j() {
        super.mo91224j();
        SearchableEditText a = mo91200a();
        a.removeTextChangedListener(this);
        a.addTextChangedListener(this);
        TuxIconView tuxIconView = this.f124052s;
        if (tuxIconView == null) {
            C89219l.m154710a("shareBtn");
        }
        tuxIconView.setOnClickListener(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: q */
    public final void mo91249q() {
        Editable text = mo91200a().getText();
        if (text != null) {
            C89219l.m154716b(text, "");
            ChatViewModel chatViewModel = this.f124046k;
            if (chatViewModel != null) {
                chatViewModel.mo91669a(text, this.f124047l.getConversationId());
            }
            C55059b.m100694b("enter_from", "chat");
            mo91227m();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: r */
    public final boolean mo91250r() {
        if (mo91219e().mo91326a()) {
            mo91228n();
            return false;
        }
        if (mo91223i() instanceof ChatRoomActivity) {
            Context i = mo91223i();
            Objects.requireNonNull(i, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) i).finish();
        }
        return false;
    }

    /* renamed from: s */
    public final void mo91251s() {
        mo91200a().setHint(mo91223i().getString(R.string.ce_));
        ReplyMessageLayout replyMessageLayout = this.f124053t;
        if (replyMessageLayout == null) {
            C89219l.m154710a("replyLayout");
        }
        replyMessageLayout.setVisibility(8);
    }

    /* renamed from: t */
    public final void mo91252t() {
        for (Context i = mo91223i(); i != null; i = ((ContextWrapper) i).getBaseContext()) {
            if (i instanceof Activity) {
                Activity activity = (Activity) i;
                if (activity != null && C55196f.m100911a(activity)) {
                    new C23144b(activity).mo37640e(R.string.b93).mo37637b();
                    return;
                }
                return;
            } else if (!(i instanceof ContextWrapper)) {
                return;
            }
        }
    }

    /* renamed from: u */
    private final boolean m99361u() {
        if ((this.f124047l.isAuthorSupporterChat() && C53651a.m98928b()) || this.f124047l.isGroupChat()) {
            return false;
        }
        IMUser a = C55085g.m100751a(String.valueOf(AbstractC17427b.C17428a.m32311c(this.f124047l.getConversationId())), C55080c.m100730a(this.f124047l.getConversationId()));
        if (a == null) {
            return true;
        }
        if (a.getFollowStatus() == 2 || C55197c.m100918a(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$h */
    public static final class C54138h implements DialogInterface$OnDismissListenerC54209b.AbstractC54211b {

        /* renamed from: a */
        final /* synthetic */ InputView f124069a;

        static {
            Covode.recordClassIndex(63817);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54138h(InputView inputView) {
            this.f124069a = inputView;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.video.p3116ui.DialogInterface$OnDismissListenerC54209b.AbstractC54211b
        /* renamed from: a */
        public final void mo91255a(Aweme aweme, DialogInterface$OnDismissListenerC54209b.AbstractC54212c cVar) {
            C89219l.m154721d(aweme, "");
            C89219l.m154721d(cVar, "");
            ChatViewModel chatViewModel = this.f124069a.f124046k;
            if (chatViewModel != null) {
                String str = cVar.f124208a;
                String conversationId = this.f124069a.f124047l.getConversationId();
                C89219l.m154721d(aweme, "");
                C89219l.m154721d(str, "");
                C89219l.m154721d(conversationId, "");
                chatViewModel.f125137a = 101;
                chatViewModel.f125140d.setValue(new AbstractC55249a.C55253c(Integer.valueOf(chatViewModel.f125137a)));
                C17438g.C17439a.m32347a().mo27820b(conversationId).mo27813a(ShareAwemeContent.fromAweme(aweme, str)).mo27819a(new ChatViewModel.C54602e(chatViewModel));
            }
        }
    }

    /* renamed from: a */
    private static /* synthetic */ ViewGroup m99357a(InputView inputView) {
        ViewGroup viewGroup = inputView.f124045j;
        if (viewGroup == null) {
            C89219l.m154710a("inputRootLayout");
        }
        return viewGroup;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54141a
    /* renamed from: b */
    public final void mo91245b(int i) {
        ViewGroup viewGroup = this.f124045j;
        if (viewGroup == null) {
            C89219l.m154710a("inputRootLayout");
        }
        viewGroup.setVisibility(i);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$e */
    static final class View$OnClickListenerC54135e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputView f124063a;

        static {
            Covode.recordClassIndex(63814);
        }

        View$OnClickListenerC54135e(InputView inputView) {
            this.f124063a = inputView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String str = InputView.f124043m;
            C89219l.m154716b(str, "");
            C56244a.m102191c(str, "Reply closed");
            ChatViewModel chatViewModel = this.f124063a.f124046k;
            if (chatViewModel != null) {
                chatViewModel.mo91668a(null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$g */
    static final class C54137g<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ Fragment f124067a;

        /* renamed from: b */
        final /* synthetic */ InputView f124068b;

        static {
            Covode.recordClassIndex(63816);
        }

        C54137g(Fragment fragment, InputView inputView) {
            this.f124067a = fragment;
            this.f124068b = inputView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            AbstractC55249a aVar = (AbstractC55249a) obj;
            if (!(aVar instanceof AbstractC55249a.C55254d)) {
                aVar = null;
            }
            AbstractC55249a.C55254d dVar = (AbstractC55249a.C55254d) aVar;
            if (dVar == null || (t = dVar.f126348a) == null) {
                this.f124068b.mo91251s();
            } else {
                this.f124068b.mo91246b((C19538ai) t);
            }
        }
    }

    /* renamed from: a */
    private final void m99358a(List<? extends C46534a> list) {
        C54111b bVar = this.f124051r;
        if (bVar == null) {
            C89219l.m154710a("emojiSearchView");
        }
        bVar.mo91196a(list);
    }

    /* renamed from: c */
    private final void m99359c(boolean z) {
        int i;
        if (this.f124057x) {
            TuxIconView tuxIconView = this.f124052s;
            if (tuxIconView == null) {
                C89219l.m154710a("shareBtn");
            }
            boolean isActivated = tuxIconView.isActivated();
            TuxIconView tuxIconView2 = this.f124052s;
            if (tuxIconView2 == null) {
                C89219l.m154710a("shareBtn");
            }
            tuxIconView2.setActivated(z);
            TuxIconView tuxIconView3 = this.f124052s;
            if (tuxIconView3 == null) {
                C89219l.m154710a("shareBtn");
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView3.setVisibility(i);
            if (z && !isActivated) {
                TuxIconView tuxIconView4 = this.f124052s;
                if (tuxIconView4 == null) {
                    C89219l.m154710a("shareBtn");
                }
                C55326b.m101137a(tuxIconView4);
            }
        }
    }

    /* renamed from: d */
    private final void m99360d(boolean z) {
        int i;
        int i2;
        boolean isActivated = mo91217c().isActivated();
        mo91217c().setActivated(z);
        if (this.f124057x) {
            TuxIconView c = mo91217c();
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c.setVisibility(i2);
        }
        TuxIconView c2 = mo91217c();
        if (z) {
            i = R.attr.ay;
        } else {
            i = R.attr.bd;
        }
        c2.setTintColorRes(i);
        if (z && !isActivated) {
            C55326b.m101137a(mo91217c());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: a */
    public final C54101a.C54104b mo91199a(C54101a.C54104b bVar) {
        C89219l.m154721d(bVar, "");
        return bVar.mo91192f().mo91189c().mo91190d();
    }

    /* renamed from: b */
    public final void mo91246b(C19538ai aiVar) {
        mo91200a().setHint(mo91223i().getString(R.string.ce7));
        ReplyMessageLayout replyMessageLayout = this.f124053t;
        if (replyMessageLayout == null) {
            C89219l.m154710a("replyLayout");
        }
        replyMessageLayout.setReplyMessage(aiVar);
        ReplyMessageLayout replyMessageLayout2 = this.f124053t;
        if (replyMessageLayout2 == null) {
            C89219l.m154710a("replyLayout");
        }
        replyMessageLayout2.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: a */
    public final void mo91201a(int i) {
        super.mo91201a(i);
        C54111b bVar = this.f124051r;
        if (bVar == null) {
            C89219l.m154710a("emojiSearchView");
        }
        bVar.mo91196a(null);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: b */
    public final void mo91216b(boolean z) {
        int intValue;
        if (this.f124027g != z) {
            super.mo91216b(z);
            SearchableEditText a = mo91200a();
            if (z) {
                intValue = ((Number) this.f124048o.getValue()).intValue();
            } else {
                intValue = ((Number) this.f124050q.getValue()).intValue();
            }
            a.setHintTextColor(intValue);
            mo91200a().setTextColor(((Number) this.f124049p.getValue()).intValue());
            mo91218d().setBackgroundResource(R.drawable.aqg);
            m99362v();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$f */
    static final class C54136f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ ChatViewModel f124064a;

        /* renamed from: b */
        final /* synthetic */ Fragment f124065b;

        /* renamed from: c */
        final /* synthetic */ InputView f124066c;

        static {
            Covode.recordClassIndex(63815);
        }

        C54136f(ChatViewModel chatViewModel, Fragment fragment, InputView inputView) {
            this.f124064a = chatViewModel;
            this.f124065b = fragment;
            this.f124066c = inputView;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Activity activity;
            AbstractC0952i supportFragmentManager;
            AbstractC55249a aVar = (AbstractC55249a) obj;
            if (aVar instanceof AbstractC55249a.C55253c) {
                C54346b.m99660a(this.f124066c.f124047l.getConversationId(), "");
                return;
            }
            Activity activity2 = null;
            r2 = null;
            Fragment fragment = null;
            r2 = null;
            Activity activity3 = null;
            activity2 = null;
            if (aVar instanceof AbstractC55249a.C55254d) {
                if (this.f124064a.f125137a == 101) {
                    Context i = this.f124066c.mo91223i();
                    while (true) {
                        if (i != null) {
                            if (!(i instanceof Activity)) {
                                if (!(i instanceof ContextWrapper)) {
                                    break;
                                }
                                i = ((ContextWrapper) i).getBaseContext();
                            } else {
                                activity = (Activity) i;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    activity = null;
                    if (!(activity instanceof ActivityC0945e)) {
                        activity = null;
                    }
                    ActivityC0945e eVar = (ActivityC0945e) activity;
                    if (!(eVar == null || (supportFragmentManager = eVar.getSupportFragmentManager()) == null)) {
                        fragment = supportFragmentManager.mo3551a(InputView.f124043m);
                    }
                    DialogInterface$OnCancelListenerC0944d dVar = (DialogInterface$OnCancelListenerC0944d) fragment;
                    if (dVar != null) {
                        dVar.dismiss();
                    }
                }
            } else if (aVar instanceof AbstractC55249a.C55250a) {
                int i2 = this.f124064a.f125138b;
                if (i2 == 1) {
                    Context i3 = this.f124066c.mo91223i();
                    while (true) {
                        if (i3 != null) {
                            if (!(i3 instanceof Activity)) {
                                if (!(i3 instanceof ContextWrapper)) {
                                    break;
                                }
                                i3 = ((ContextWrapper) i3).getBaseContext();
                            } else {
                                activity2 = (Activity) i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    C55195e.m100909a(activity2);
                } else if (i2 == 2) {
                    Context i4 = this.f124066c.mo91223i();
                    while (true) {
                        if (i4 != null) {
                            if (!(i4 instanceof Activity)) {
                                if (!(i4 instanceof ContextWrapper)) {
                                    break;
                                }
                                i4 = ((ContextWrapper) i4).getBaseContext();
                            } else {
                                activity3 = (Activity) i4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    C55195e.m100910b(activity3);
                } else if (i2 == 3) {
                    T t = ((AbstractC55249a.C55250a) aVar).f126344a;
                    String str = InputView.f124043m;
                    C89219l.m154716b(str, "");
                    C56244a.m102190b(str, "onSendFailure: ".concat(String.valueOf(t)));
                } else if (i2 == 102) {
                    this.f124066c.mo91252t();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: a */
    public final void mo91204a(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        View findViewById = viewGroup.findViewById(R.id.boz);
        C89219l.m154716b(findViewById, "");
        this.f124045j = (ViewGroup) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.cmi);
        C89219l.m154716b(findViewById2, "");
        mo91211a((SearchableEditText) findViewById2);
        View findViewById3 = viewGroup.findViewById(R.id.arr);
        C89219l.m154716b(findViewById3, "");
        mo91203a(findViewById3);
        View findViewById4 = viewGroup.findViewById(R.id.au7);
        C89219l.m154716b(findViewById4, "");
        mo91205a((TuxIconView) findViewById4);
        View findViewById5 = viewGroup.findViewById(R.id.dvb);
        C89219l.m154716b(findViewById5, "");
        mo91215b((TuxIconView) findViewById5);
        View findViewById6 = viewGroup.findViewById(R.id.dz8);
        C89219l.m154716b(findViewById6, "");
        this.f124052s = (TuxIconView) findViewById6;
        View findViewById7 = viewGroup.findViewById(R.id.cyt);
        C89219l.m154716b(findViewById7, "");
        mo91209a((SoftInputResizeFuncLayoutView) findViewById7);
        View findViewById8 = viewGroup.findViewById(R.id.di6);
        C89219l.m154716b(findViewById8, "");
        this.f124053t = (ReplyMessageLayout) findViewById8;
        if (this.f124057x) {
            mo91217c().setVisibility(8);
            TuxIconView tuxIconView = this.f124052s;
            if (tuxIconView == null) {
                C89219l.m154710a("shareBtn");
            }
            tuxIconView.setVisibility(0);
        } else {
            mo91217c().setVisibility(0);
            TuxIconView tuxIconView2 = this.f124052s;
            if (tuxIconView2 == null) {
                C89219l.m154710a("shareBtn");
            }
            tuxIconView2.setVisibility(8);
        }
        ((TextView) viewGroup.findViewById(R.id.ewm)).setVisibility(8);
        ((RecyclerView) viewGroup.findViewById(R.id.dob)).setVisibility(8);
        ViewGroup viewGroup2 = this.f124045j;
        if (viewGroup2 == null) {
            C89219l.m154710a("inputRootLayout");
        }
        this.f124051r = new C54111b(this, viewGroup2, this.f124047l.getConversationId());
        m99362v();
        mo91225k();
        ReplyMessageLayout replyMessageLayout = this.f124053t;
        if (replyMessageLayout == null) {
            C89219l.m154710a("replyLayout");
        }
        replyMessageLayout.setCloseButtonOnClick(new View$OnClickListenerC54135e(this));
        super.mo91204a(viewGroup);
    }

    public final void afterTextChanged(Editable editable) {
        int i;
        boolean z;
        C89219l.m154721d(editable, "");
        String obj = editable.toString();
        boolean z2 = true;
        int length = obj.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length) {
            if (!z3) {
                i = i2;
            } else {
                i = length;
            }
            if (C89219l.m154703a(obj.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                if (!z) {
                    break;
                }
                length--;
            } else if (!z) {
                z3 = true;
            } else {
                i2++;
            }
        }
        if (TextUtils.isEmpty(obj.subSequence(i2, length + 1).toString())) {
            mo91220f().mo91179a(false);
            m99359c(true);
            m99360d(false);
        } else {
            mo91220f().mo91179a(true);
            m99359c(false);
            m99360d(true);
        }
        m99362v();
        RunnableC54132b bVar = this.f124056w;
        if (editable.length() <= 0) {
            z2 = false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = bVar.f124059a + InteractFirstFrameTimeOutDurationSetting.DEFAULT;
        if (j <= elapsedRealtime || !z2) {
            bVar.f124059a = elapsedRealtime;
            return;
        }
        m99357a(InputView.this).removeCallbacks(bVar);
        m99357a(InputView.this).postDelayed(bVar, j - elapsedRealtime);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54141a
    /* renamed from: a */
    public final void mo91242a(C19538ai aiVar) {
        C89219l.m154721d(aiVar, "");
        mo91201a(-2);
        ChatViewModel chatViewModel = this.f124046k;
        if (chatViewModel != null) {
            chatViewModel.mo91668a(aiVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0112 A[SYNTHETIC] */
    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
        // Method dump skipped, instructions count: 365
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.InputView.onClick(android.view.View):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b
    /* renamed from: a */
    public final void mo91243a(C46447a aVar) {
        C89219l.m154721d(aVar, "");
        ChatViewModel chatViewModel = this.f124046k;
        if (chatViewModel != null) {
            boolean u = m99361u();
            String conversationId = this.f124047l.getConversationId();
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(conversationId, "");
            chatViewModel.f125137a = 102;
            chatViewModel.f125140d.setValue(new AbstractC55249a.C55253c(Integer.valueOf(chatViewModel.f125137a)));
            C46534a aVar2 = aVar.f108224d;
            C89219l.m154716b(aVar2, "");
            int stickerType = aVar2.getStickerType();
            if ((stickerType == 10 || stickerType == 2 || stickerType == 3) && u) {
                chatViewModel.f125138b = 4;
                chatViewModel.f125140d.setValue(new AbstractC55249a.C55250a(Integer.valueOf(chatViewModel.f125138b)));
                return;
            }
            C17438g.C17439a.m32347a().mo27820b(conversationId).mo27813a(EmojiContent.obtain(aVar.f108224d)).mo27818a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b, com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.BaseInputView
    /* renamed from: a */
    public final void mo91212a(String str) {
        C89219l.m154721d(str, "");
        super.mo91212a(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView$i */
    static final class C54139i extends AbstractC89220m implements AbstractC89187q<View, C46447a, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ InputView f124070a;

        static {
            Covode.recordClassIndex(63818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54139i(InputView inputView) {
            super(3);
            this.f124070a = inputView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(View view, C46447a aVar, Integer num) {
            C46447a aVar2 = aVar;
            num.intValue();
            C89219l.m154721d(view, "");
            C89219l.m154721d(aVar2, "");
            C46534a aVar3 = aVar2.f108224d;
            C89219l.m154716b(aVar3, "");
            C46460b.m89694a(aVar3);
            this.f124070a.mo91221g().mo91243a(aVar2);
            return C89391z.f203057a;
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C89219l.m154721d(charSequence, "");
        Object tag = mo91200a().getTag(R.id.v);
        if (!(tag instanceof CharSequence)) {
            tag = null;
        }
        CharSequence charSequence2 = (CharSequence) tag;
        if (charSequence2 != null && TextUtils.equals(charSequence2, charSequence)) {
            mo91200a().setTag(R.id.v, null);
        } else if (C46616a.m89982b()) {
        } else {
            if (TextUtils.isEmpty(charSequence)) {
                m99358a((List<? extends C46534a>) null);
            } else {
                m99358a(C46616a.m89976a(charSequence.toString()));
            }
        }
    }

    public InputView(ViewGroup viewGroup, C53709a aVar, boolean z, WeakReference<Fragment> weakReference) {
        ChatViewModel chatViewModel;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(weakReference, "");
        this.f124047l = aVar;
        this.f124057x = z;
        this.f124058y = weakReference;
        Fragment fragment = weakReference.get();
        if (fragment != null) {
            C89219l.m154716b(fragment, "");
            chatViewModel = ChatViewModel.C54598a.m100094a(fragment);
        } else {
            chatViewModel = null;
        }
        this.f124046k = chatViewModel;
        this.f124054u = true;
        if (aVar.isAuthorSupporterChat()) {
            this.f124055v = C53651a.m98925a();
            this.f124054u = C53651a.m98929c();
        }
        this.f124056w = new RunnableC54132b();
        mo91204a(viewGroup);
        mo91224j();
        if (mo91222h()) {
            Fragment fragment2 = weakReference.get();
            if (fragment2 != null && chatViewModel != null) {
                chatViewModel.f125140d.observe(fragment2, new C54136f(chatViewModel, fragment2, this));
                chatViewModel.f125141e.observe(fragment2, new C54137g(fragment2, this));
                return;
            }
            return;
        }
        throw new Exception("Call initEmojiPanel() method os base class");
    }
}
