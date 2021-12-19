package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base;

import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.C1434i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17434e;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SayHelloContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53732a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53746c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53734ab;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53750f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53751g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53753i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53756l;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53757m;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53761q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53762r;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53763s;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53766v;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53770z;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53771a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3098a.C53865b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3098a.C53868c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.businessaccount.p3100ui.helper.BaAutoMessageServiceImpl;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54141a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractView$OnClickListenerC54146d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.InputView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54232b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3092b.C53840a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b.C53856d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.C54282b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.selectmsg.C54314c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53635b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3082b.C53638d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53660b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53700k;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3136d.C54441b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.ChatLinearLayoutManager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view.StrangerChatRiskHint;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54542d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.ChatRoomLiveStateManager;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.RunnableC54545g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55053f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55171ac;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55173ae;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56197d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56205f;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4589j.C88939d;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel */
public abstract class BaseChatPanel extends LifecyclePanel implements AbstractC33974au {

    /* renamed from: a */
    private boolean f124631a = true;

    /* renamed from: b */
    public final View f124632b;

    /* renamed from: c */
    public final Context f124633c;

    /* renamed from: d */
    public final Fragment f124634d;

    /* renamed from: e */
    public final ActivityC0945e f124635e;

    /* renamed from: f */
    public final RecyclerView f124636f;

    /* renamed from: g */
    public final ChatLinearLayoutManager f124637g;

    /* renamed from: h */
    public final View f124638h;

    /* renamed from: i */
    C53856d f124639i;

    /* renamed from: j */
    protected AbstractC54141a f124640j;

    /* renamed from: k */
    public final C1213t<List<C19538ai>> f124641k;

    /* renamed from: l */
    public EnumC53771a f124642l;

    /* renamed from: m */
    protected AbstractC54386c f124643m;

    /* renamed from: n */
    public final ChatRoomViewModel f124644n;

    /* renamed from: o */
    public boolean f124645o;

    /* renamed from: p */
    final AbstractC89244h f124646p;

    /* renamed from: q */
    public final View f124647q;

    /* renamed from: r */
    public final C53709a f124648r;

    /* renamed from: u */
    private final ImTextTitleBar f124649u;

    /* renamed from: v */
    private final AbstractC89244h f124650v;

    /* renamed from: w */
    private final AbstractC89244h f124651w;

    /* renamed from: x */
    private C54441b f124652x;

    /* renamed from: y */
    private final C88411a f124653y;

    static {
        Covode.recordClassIndex(64112);
    }

    /* renamed from: i */
    private final C23001b m99734i() {
        return (C23001b) this.f124651w.getValue();
    }

    /* renamed from: a */
    public abstract AbstractC54386c mo91153a();

    /* renamed from: a */
    public void mo91154a(int i, int i2, Intent intent) {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$h */
    public static final class C54419h extends C1434i {
        static {
            Covode.recordClassIndex(64124);
        }

        C54419h() {
        }

        @Override // androidx.recyclerview.widget.C1434i, androidx.recyclerview.widget.AbstractC1391ab
        /* renamed from: a */
        public final boolean mo4852a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            C89219l.m154721d(viewHolder, "");
            C89219l.m154721d(viewHolder2, "");
            if (viewHolder == viewHolder2) {
                return super.mo4852a(viewHolder, viewHolder2, i, i2, i3, i4);
            }
            viewHolder.itemView.animate().cancel();
            viewHolder2.itemView.animate().cancel();
            viewHolder.itemView.animate().alpha(0.0f).setDuration(125).start();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$i */
    public static final class C54420i implements ImTextTitleBar.AbstractC55309a {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124670a;

        static {
            Covode.recordClassIndex(64125);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: b */
        public final void mo91164b() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: c */
        public final void mo91165c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91162a() {
            this.f124670a.f124635e.onBackPressed();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C54420i(BaseChatPanel baseChatPanel) {
            this.f124670a = baseChatPanel;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.ImTextTitleBar.AbstractC55309a
        /* renamed from: a */
        public final void mo91163a(int i) {
            boolean z;
            List<C19538ai> value = this.f124670a.f124641k.getValue();
            if (value == null || value.isEmpty()) {
                new C23144b(this.f124670a.f124635e).mo37640e(R.string.cbp).mo37637b();
                return;
            }
            if (value.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            String str = "";
            if (!z) {
                StringBuilder sb = new StringBuilder();
                for (T t : value) {
                    if (t != null) {
                        sb.append(t.getMsgId()).append(",");
                    }
                }
                if (sb.length() > 0) {
                    String substring = sb.substring(0, sb.length() - 1);
                    C89219l.m154716b(substring, str);
                    str = substring;
                }
            }
            if (!(str == null || str.length() == 0)) {
                C54314c.m99610a(this.f124670a.f124648r.getConversationId(), value);
                C56197d dVar = new C56197d();
                dVar.f128194b = this.f124670a.f124648r.getConversationId();
                dVar.f128193a = str;
                AbstractC81915c.m141874a(dVar);
                this.f124670a.f124635e.finish();
            }
        }
    }

    /* renamed from: e */
    public final void mo91488e() {
        m99733a(this.f124649u);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$k */
    static final class C54423k extends AbstractC89220m implements AbstractC89171a<ChatRoomLiveStateManager> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124673a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f124674b;

        static {
            Covode.recordClassIndex(64128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54423k(BaseChatPanel baseChatPanel, AbstractC1204m mVar) {
            super(0);
            this.f124673a = baseChatPanel;
            this.f124674b = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ChatRoomLiveStateManager invoke() {
            return new ChatRoomLiveStateManager(this.f124673a.f124636f, this.f124674b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$l */
    static final class C54424l extends AbstractC89220m implements AbstractC89171a<GestureDetector> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124675a;

        static {
            Covode.recordClassIndex(64129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54424l(BaseChatPanel baseChatPanel) {
            super(0);
            this.f124675a = baseChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ GestureDetector invoke() {
            return new GestureDetector(this.f124675a.f124633c, new GestureDetector.SimpleOnGestureListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel.C54424l.C544251 */

                /* renamed from: a */
                final /* synthetic */ C54424l f124676a;

                static {
                    Covode.recordClassIndex(64130);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f124676a = r1;
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    C89219l.m154721d(motionEvent, "");
                    this.f124676a.f124675a.mo91486c();
                    return super.onSingleTapConfirmed(motionEvent);
                }

                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    int l;
                    if (motionEvent == null || motionEvent2 == null) {
                        return super.onFling(motionEvent, motionEvent2, f, f2);
                    }
                    float x = motionEvent.getX() - motionEvent2.getX();
                    if (motionEvent.getY() < motionEvent2.getY()) {
                        float y = motionEvent2.getY() - motionEvent.getY();
                        if (x == 0.0f) {
                            x = 1.0f;
                        }
                        if (y / Math.abs(x) > 0.65f) {
                            ChatLinearLayoutManager chatLinearLayoutManager = this.f124676a.f124675a.f124637g;
                            if (chatLinearLayoutManager.f4336l) {
                                l = chatLinearLayoutManager.mo4374n();
                            } else {
                                l = chatLinearLayoutManager.mo4372l();
                            }
                            if (l == this.f124676a.f124675a.mo91487d().getItemCount() - 1) {
                                this.f124676a.f124675a.mo91489f();
                            }
                        }
                    }
                    return super.onFling(motionEvent, motionEvent2, f, f2);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AbstractC54141a mo91486c() {
        AbstractC54141a aVar = this.f124640j;
        if (aVar == null) {
            C89219l.m154710a("mInputView");
        }
        return aVar;
    }

    /* renamed from: d */
    public final AbstractC54386c mo91487d() {
        AbstractC54386c cVar = this.f124643m;
        if (cVar == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        return cVar;
    }

    /* renamed from: f */
    public final void mo91489f() {
        AbstractC54386c cVar = this.f124643m;
        if (cVar == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        cVar.mo91468e();
    }

    /* renamed from: g */
    public final void mo91490g() {
        AbstractC54141a aVar = this.f124640j;
        if (aVar == null) {
            C89219l.m154710a("mInputView");
        }
        aVar.mo91250r();
    }

    /* renamed from: h */
    public final void mo91491h() {
        AbstractC54141a aVar = this.f124640j;
        if (aVar == null) {
            C89219l.m154710a("mInputView");
        }
        aVar.mo91228n();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$c */
    static final class RunnableC54414c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC54386c f124661a;

        /* renamed from: b */
        final /* synthetic */ BaseChatPanel f124662b;

        static {
            Covode.recordClassIndex(64119);
        }

        RunnableC54414c(AbstractC54386c cVar, BaseChatPanel baseChatPanel) {
            this.f124661a = cVar;
            this.f124662b = baseChatPanel;
        }

        public final void run() {
            if (this.f124662b.f124638h.getVisibility() == 0) {
                this.f124662b.f124638h.setVisibility(8);
            }
            this.f124661a.f124582l = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$j */
    static final class C54421j extends AbstractC89220m implements AbstractC89171a<C23001b> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124671a;

        static {
            Covode.recordClassIndex(64126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54421j(BaseChatPanel baseChatPanel) {
            super(0);
            this.f124671a = baseChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23001b invoke() {
            C22999a a = C23005c.m43393a(C544221.f124672a);
            Context context = this.f124671a.f124633c;
            C89219l.m154716b(context, "");
            return a.mo37368a(context);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel
    public void onPause() {
        super.onPause();
        AbstractC54386c cVar = this.f124643m;
        if (cVar == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        cVar.f124580j = false;
        C54881c.m100501e(AbstractC17420a.C17421a.m32276a().mo27720a(this.f124648r.getConversationId()));
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel
    public void onStop() {
        super.onStop();
        AbstractC54386c cVar = this.f124652x.f124715o;
        if (cVar.f124579i != null) {
            cVar.f124579i.getLocalExt().remove("show_unread_message_tips");
        }
        C54542d f = C54542d.m100005f();
        if (f.f125005a != null && f.f125005a.get(f.f125007c) != null && C17873f.f42636l) {
            f.f125005a.get(f.f125007c);
        }
    }

    /* renamed from: b */
    public void mo91155b() {
        int i = C54428a.f124679a[this.f124642l.ordinal()];
        if (i == 1) {
            StrangerChatRiskHint strangerChatRiskHint = (StrangerChatRiskHint) this.f124647q.findViewById(R.id.a49);
            if (strangerChatRiskHint != null) {
                strangerChatRiskHint.setVisibility(8);
            }
            AbstractC54141a aVar = this.f124640j;
            if (aVar == null) {
                C89219l.m154710a("mInputView");
            }
            aVar.mo91245b(8);
        } else if (i == 2) {
            StrangerChatRiskHint strangerChatRiskHint2 = (StrangerChatRiskHint) this.f124647q.findViewById(R.id.a49);
            if (strangerChatRiskHint2 != null) {
                strangerChatRiskHint2.setVisibility(8);
            }
            AbstractC54141a aVar2 = this.f124640j;
            if (aVar2 == null) {
                C89219l.m154710a("mInputView");
            }
            aVar2.mo91245b(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel
    public void onDestroy() {
        super.onDestroy();
        C89517an.m155450b(C53660b.f123123d);
        C53660b.m98933a().clear();
        C53660b.f123120a = null;
        C53660b.f123124e.evictAll();
        this.f124636f.setAdapter(null);
        AbstractC54386c cVar = this.f124643m;
        if (cVar == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        cVar.mo91469f();
        AbstractC1196i lifecycle = getLifecycle();
        AbstractC54141a aVar = this.f124640j;
        if (aVar == null) {
            C89219l.m154710a("mInputView");
        }
        lifecycle.mo4013b(aVar);
        C55059b.f126007a = null;
        C54542d.m100005f().mo90197c();
        this.f124653y.mo142944a();
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel
    public void onResume() {
        super.onResume();
        mo91488e();
        if (!this.f124631a) {
            C54542d f = C54542d.m100005f();
            if (!f.f125008d || f.f125005a == null || f.f125005a.size() <= 0) {
                C54542d f2 = C54542d.m100005f();
                if (!(f2.f125005a == null || f2.f125005a.get(f2.f125007c) == null)) {
                    f2.f125005a.get(f2.f125007c);
                }
            } else {
                Runnable a = C54542d.m100005f().mo91631a(this.f124636f);
                C89219l.m154716b(a, "");
                C53700k.m98969a(a);
            }
        }
        this.f124631a = false;
        AbstractC54386c cVar = this.f124643m;
        if (cVar == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        cVar.f124580j = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.base.LifecyclePanel
    public void onCreate() {
        super.onCreate();
        C55059b.f126007a = this.f124648r;
        if (this.f124648r.getSelectMsgType() == 1) {
            mo91483a(EnumC53771a.Report);
        }
        mo91488e();
        AbstractC54386c cVar = this.f124643m;
        if (cVar == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        C89219l.m154721d(cVar, "");
        C53660b.f123123d = C89517an.m155448a(C89546bf.f203266a);
        C53660b.f123120a = cVar;
        String str = C55059b.f126008b;
        if (str == null) {
            str = UUID.randomUUID().toString();
            C89219l.m154716b(str, "");
        }
        C53660b.f123121b = str;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
        C89219l.m154716b(currentUserID, "");
        C53660b.f123122c = currentUserID;
        AbstractC54386c cVar2 = this.f124643m;
        if (cVar2 == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        C55171ac.m100879a("djjQueryMsg");
        if (cVar2.f124543b != null) {
            cVar2.f124543b.clear();
        }
        if (cVar2.f124575e.mo27767h().isEmpty()) {
            cVar2.f124575e.mo27765f();
            C56244a.m102190b("MessageAdapter", "refreshData preload list is empty");
        } else {
            C56244a.m102190b("MessageAdapter", "refreshData preload list notempty hasQueryMessage=" + cVar2.f124581k);
            if (cVar2.f124576f != null && !cVar2.f124581k) {
                ChatRoomViewModel chatRoomViewModel = cVar2.f124576f;
                List<C19538ai> i = cVar2.f124575e.mo27768i();
                C89219l.m154721d(i, "");
                C89219l.m154721d("messageAdapter", "");
                chatRoomViewModel.f125104a.onNext(new C53762r(i, 1, "messageAdapter"));
            }
        }
        C54542d.m100005f().mo90192a();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$a */
    static final class C54412a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124658a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1204m f124659b;

        static {
            Covode.recordClassIndex(64117);
        }

        C54412a(BaseChatPanel baseChatPanel, AbstractC1204m mVar) {
            this.f124658a = baseChatPanel;
            this.f124659b = mVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f124658a.mo91485a((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$m */
    static final class C54426m<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124677a;

        static {
            Covode.recordClassIndex(64131);
        }

        C54426m(BaseChatPanel baseChatPanel) {
            this.f124677a = baseChatPanel;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C19538ai aiVar = (C19538ai) obj;
            if (aiVar != null) {
                this.f124677a.mo91486c().mo91242a(aiVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$f */
    static final class C54417f extends AbstractC89220m implements AbstractC89172b<AbstractC53732a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124666a;

        /* renamed from: b */
        final /* synthetic */ C53868c f124667b;

        static {
            Covode.recordClassIndex(64122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54417f(BaseChatPanel baseChatPanel, C53868c cVar) {
            super(1);
            this.f124666a = baseChatPanel;
            this.f124667b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC53732a aVar) {
            AbstractC53732a aVar2 = aVar;
            if ((aVar2 instanceof C53770z) && ((C53770z) aVar2).f123323b == 5) {
                this.f124666a.mo91488e();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo91483a(EnumC53771a aVar) {
        C89219l.m154721d(aVar, "");
        this.f124642l = aVar;
        C56244a.m102190b("BaseChatPanel", "bottomType: ".concat(String.valueOf(aVar)));
        mo91155b();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$b */
    static final class C54413b implements AbstractC54386c.AbstractC54391a {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124660a;

        static {
            Covode.recordClassIndex(64118);
        }

        C54413b(BaseChatPanel baseChatPanel) {
            this.f124660a = baseChatPanel;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c.AbstractC54391a
        /* renamed from: a */
        public final void mo91473a(C19538ai aiVar) {
            BaseChatPanel baseChatPanel = this.f124660a;
            C89219l.m154716b(aiVar, "");
            BaseContent b = EnumC53772b.C53814f.m99071b(aiVar);
            Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent");
            SayHelloContent sayHelloContent = (SayHelloContent) b;
            baseChatPanel.f124639i = new C53856d(baseChatPanel.f124638h, EnumC53772b.SAY_HELLO, true);
            C53856d dVar = baseChatPanel.f124639i;
            if (dVar == null) {
                C89219l.m154710a("oneStickerSayHiViewHolder");
            }
            dVar.mo91008a(aiVar, (C19538ai) null, sayHelloContent, 0);
            baseChatPanel.f124638h.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo91484a(String str) {
        C89219l.m154721d(str, "");
        AbstractC54141a aVar = this.f124640j;
        if (aVar == null) {
            C89219l.m154710a("mInputView");
        }
        aVar.mo91212a(str);
    }

    /* renamed from: a */
    private final void m99733a(ImTextTitleBar imTextTitleBar) {
        if (this.f124648r.getSelectMsgType() == 1) {
            imTextTitleBar.setOnTitlebarClickListener(new C54420i(this));
            imTextTitleBar.setRightTextColor(C0643b.m2378c(this.f124633c, R.color.bh));
            imTextTitleBar.setLeftIcon(m99734i());
            imTextTitleBar.setRightText(R.string.cd4);
            if (this.f124648r.getChatType() == 3) {
                imTextTitleBar.setLeftTitleVisible(true);
                imTextTitleBar.setRightTuxFont(42);
            }
            mo91485a(this.f124641k.getValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$n */
    static final class C54427n extends AbstractC89220m implements AbstractC89172b<AbstractC53746c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124678a;

        static {
            Covode.recordClassIndex(64132);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54427n(BaseChatPanel baseChatPanel) {
            super(1);
            this.f124678a = baseChatPanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC53746c cVar) {
            AbstractC53746c cVar2 = cVar;
            if (cVar2 instanceof C53766v) {
                this.f124678a.mo91487d().mo91465a(C89070n.m154516a(((C53766v) cVar2).f123313b), 0);
            } else if (cVar2 instanceof C53750f) {
                this.f124678a.mo91487d().mo91465a(C89070n.m154516a(((C53750f) cVar2).f123285b), 1);
            } else if (cVar2 instanceof C53756l) {
                this.f124678a.mo91487d().mo91465a(((C53756l) cVar2).f123292a, 2);
            } else if (cVar2 instanceof C53753i) {
                this.f124678a.mo91487d().mo91465a(C89070n.m154516a(((C53753i) cVar2).f123289a), 3);
            } else if (cVar2 instanceof C53762r) {
                this.f124678a.mo91487d().mo91465a(((C53762r) cVar2).f123305a, 4);
            } else if (cVar2 instanceof C53761q) {
                this.f124678a.mo91487d().mo91465a(((C53761q) cVar2).f123303a, 5);
            } else if (cVar2 instanceof C53734ab) {
                this.f124678a.mo91487d().mo91465a(((C53734ab) cVar2).f123264a, 6);
            } else if (cVar2 instanceof C53763s) {
                this.f124678a.mo91487d().mo91465a(C89070n.m154516a(((C53763s) cVar2).f123308a), 7);
            } else if (cVar2 instanceof C53751g) {
                AbstractC54386c d = this.f124678a.mo91487d();
                if (d.f124574d == 1) {
                    d.f124574d = 0;
                }
            } else if (cVar2 instanceof C53757m) {
                AbstractC54386c d2 = this.f124678a.mo91487d();
                C19538ai aiVar = ((C53757m) cVar2).f123295a;
                if (!(d2 == null || aiVar == null)) {
                    d2.mo90257a((Object) C89070n.m154524c(aiVar), 0);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo91485a(List<C19538ai> list) {
        if (list == null || list.isEmpty()) {
            this.f124649u.setRightTextColor(C0643b.m2378c(this.f124633c, R.color.bz));
            this.f124649u.getRightView().setOnTouchListener(null);
            return;
        }
        this.f124649u.setRightTextColor(C0643b.m2378c(this.f124633c, R.color.bh));
        C55173ae.m100882a(this.f124649u.getRightView());
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$g */
    static final class C54418g extends AbstractC89220m implements AbstractC89172b<AbstractC53746c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124668a;

        /* renamed from: b */
        final /* synthetic */ C53868c f124669b;

        static {
            Covode.recordClassIndex(64123);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54418g(BaseChatPanel baseChatPanel, C53868c cVar) {
            super(1);
            this.f124668a = baseChatPanel;
            this.f124669b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC53746c cVar) {
            C53868c cVar2;
            Integer num;
            AbstractC53746c cVar3 = cVar;
            if ((cVar3 instanceof C53756l) && (cVar2 = this.f124669b) != null) {
                List<C19538ai> list = ((C53756l) cVar3).f123292a;
                C89219l.m154721d(list, "");
                for (C19538ai aiVar : list) {
                    BaseContent b = EnumC53772b.C53814f.m99071b(aiVar);
                    if (b != null) {
                        num = Integer.valueOf(b.getType());
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        if (num.intValue() == 704) {
                            String str = cVar2.f123513a;
                            String valueOf = String.valueOf(aiVar.getMsgId());
                            String conversationId = aiVar.getConversationId();
                            C89219l.m154716b(conversationId, "");
                            String str2 = C55059b.f126008b;
                            C89219l.m154716b(str2, "");
                            String obj = C55197c.m100919b().toString();
                            C53865b.C53867b bVar = C53865b.C53867b.f123512a;
                            C89219l.m154721d(str, "");
                            C89219l.m154721d(conversationId, "");
                            C89219l.m154721d(valueOf, "");
                            C89219l.m154721d(str2, "");
                            C89219l.m154721d(obj, "");
                            C89219l.m154721d(bVar, "");
                            bVar.invoke("ttelite_BA_send_welcome_message", C89041ag.m154428c(C89387v.m154943a("enter_from", str), C89387v.m154943a("process_id", str2), C89387v.m154943a("message_id", valueOf), C89387v.m154943a("conversation_id", conversationId), C89387v.m154943a("to_user_id", obj)));
                        } else if (num.intValue() == 705) {
                            String str3 = cVar2.f123513a;
                            String valueOf2 = String.valueOf(aiVar.getMsgId());
                            String conversationId2 = aiVar.getConversationId();
                            C89219l.m154716b(conversationId2, "");
                            String str4 = C55059b.f126008b;
                            C89219l.m154716b(str4, "");
                            String obj2 = C55197c.m100919b().toString();
                            C53865b.C53866a aVar = C53865b.C53866a.f123511a;
                            C89219l.m154721d(str3, "");
                            C89219l.m154721d(conversationId2, "");
                            C89219l.m154721d(valueOf2, "");
                            C89219l.m154721d(str4, "");
                            C89219l.m154721d(obj2, "");
                            C89219l.m154721d(aVar, "");
                            aVar.invoke("ttelite_BA_send_auto_reply", C89041ag.m154428c(C89387v.m154943a("enter_from", str3), C89387v.m154943a("process_id", str4), C89387v.m154943a("message_id", valueOf2), C89387v.m154943a("conversation_id", conversationId2), C89387v.m154943a("to_user_id", obj2)));
                        }
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$e */
    public static final class C54416e extends C51425a {

        /* renamed from: a */
        final /* synthetic */ BaseChatPanel f124665a;

        static {
            Covode.recordClassIndex(64121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54416e(Context context, BaseChatPanel baseChatPanel) {
            super(context);
            this.f124665a = baseChatPanel;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n, com.p2082ss.android.ugc.aweme.framework.p3007b.C51425a
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            LinearLayoutManager linearLayoutManager;
            int m;
            C19538ai b;
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 1) {
                this.f124665a.mo91486c().mo91228n();
            }
            C54542d.m100005f().mo90193a(recyclerView, i);
            if (this.f124665a.f124643m != null) {
                AbstractC54386c d = this.f124665a.mo91487d();
                C89219l.m154721d(recyclerView, "");
                C89219l.m154721d(d, "");
                if (C53635b.m98893a() && i == 0 && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null && (m = linearLayoutManager.mo4373m()) >= 0) {
                    int i2 = m + 1;
                    C89378p a = C89387v.m154943a(Integer.valueOf(i2), Integer.valueOf(i2 + ((Number) C53638d.f123064a.getValue()).intValue()));
                    if (d.getItemCount() > 0) {
                        new ArrayList();
                        int intValue = ((Number) a.getSecond()).intValue();
                        for (int intValue2 = ((Number) a.getFirst()).intValue(); intValue2 < intValue; intValue2++) {
                            if (intValue2 >= 0 && intValue2 < d.getItemCount() && (b = d.mo91466b(intValue2)) != null) {
                                C53638d.m98897b(C89070n.m154516a(b));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$d */
    static final class View$OnTouchListenerC54415d implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f124663a;

        /* renamed from: b */
        final /* synthetic */ BaseChatPanel f124664b;

        static {
            Covode.recordClassIndex(64120);
        }

        View$OnTouchListenerC54415d(RecyclerView recyclerView, BaseChatPanel baseChatPanel) {
            this.f124663a = recyclerView;
            this.f124664b = baseChatPanel;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (!C89219l.m154714a(view, this.f124663a) || !((GestureDetector) this.f124664b.f124646p.getValue()).onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseChatPanel(AbstractC1204m mVar, View view, C53709a aVar) {
        super(mVar);
        boolean z;
        C53840a aVar2;
        C53868c cVar;
        String str;
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f124647q = view;
        this.f124648r = aVar;
        this.f124632b = view;
        Context context = view.getContext();
        this.f124633c = context;
        Fragment fragment = (Fragment) mVar;
        this.f124634d = fragment;
        ActivityC0945e requireActivity = fragment.requireActivity();
        C89219l.m154716b(requireActivity, "");
        this.f124635e = requireActivity;
        View findViewById = view.findViewById(R.id.a4a);
        C89219l.m154716b(findViewById, "");
        this.f124649u = (ImTextTitleBar) findViewById;
        View findViewById2 = view.findViewById(R.id.dgl);
        C89219l.m154716b(findViewById2, "");
        RecyclerView recyclerView = (RecyclerView) findViewById2;
        this.f124636f = recyclerView;
        C89219l.m154716b(context, "");
        ChatLinearLayoutManager chatLinearLayoutManager = new ChatLinearLayoutManager(context);
        this.f124637g = chatLinearLayoutManager;
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) new C54423k(this, mVar));
        this.f124650v = a;
        this.f124651w = C89250i.m154773a((AbstractC89171a) new C54421j(this));
        View findViewById3 = view.findViewById(R.id.dp3);
        C89219l.m154716b(findViewById3, "");
        this.f124638h = findViewById3;
        C1213t<List<C19538ai>> tVar = new C1213t<>();
        tVar.observe(mVar, new C54412a(this, mVar));
        this.f124641k = tVar;
        this.f124642l = EnumC53771a.Input;
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(aVar, "");
        AbstractC1174ac a2 = C1181ae.m3879a(fragment, new ChatRoomViewModel.C54577a.C54578a(aVar)).mo3983a(ChatRoomViewModel.class);
        C89219l.m154716b(a2, "");
        ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) a2;
        this.f124644n = chatRoomViewModel;
        this.f124645o = true;
        C88411a aVar3 = new C88411a();
        this.f124653y = aVar3;
        this.f124646p = C89250i.m154773a((AbstractC89171a) new C54424l(this));
        WeakReference weakReference = new WeakReference(fragment);
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(weakReference, "");
        if (C55053f.m100676a() != 1) {
            z = true;
        } else {
            z = false;
        }
        this.f124640j = new InputView(viewGroup, aVar, z, weakReference);
        AbstractC1196i lifecycle = getLifecycle();
        AbstractC54141a aVar4 = this.f124640j;
        if (aVar4 == null) {
            C89219l.m154710a("mInputView");
        }
        lifecycle.mo4012a(aVar4);
        AbstractC54386c a3 = mo91153a();
        a3.setHasStableIds(true);
        a3.f124585o = tVar;
        if (!(a3.f124584n == null || a3.f124584n.getSelectMsgList() == null || a3.f124584n.getSelectMsgList().isEmpty() || a3.f124585o == null)) {
            List<C19538ai> value = a3.f124585o.getValue();
            value = value == null ? new ArrayList<>() : value;
            value.addAll(a3.f124584n.getSelectMsgList());
            a3.f124585o.setValue(value);
        }
        a3.f124587q = (ChatRoomLiveStateManager) a.getValue();
        if (C56203d.m102114c()) {
            aVar2 = new C53840a();
            C54413b bVar = new C54413b(this);
            C89219l.m154721d(bVar, "");
            aVar2.f123461a = bVar;
        } else if (C56203d.m102113b()) {
            aVar2 = new C53840a();
        } else {
            aVar2 = null;
        }
        a3.f124583m = aVar2;
        if (C56203d.m102114c()) {
            a3.f124582l = new RunnableC54414c(a3, this);
        }
        this.f124643m = a3;
        if (C56205f.m102122b()) {
            AbstractC54386c cVar2 = this.f124643m;
            if (cVar2 == null) {
                C89219l.m154710a("mMessageAdapter");
            }
            cVar2.f124586p.observe(this.f126399t, new C54426m(this));
        }
        IMUser singleChatFromUser = aVar.getSingleChatFromUser();
        String enterFromForMob = aVar.getEnterFromForMob();
        if (enterFromForMob != null) {
            cVar = new C53868c(enterFromForMob);
        } else {
            cVar = null;
        }
        if (singleChatFromUser != null) {
            str = singleChatFromUser.getUid();
        } else {
            str = null;
        }
        if (str != null && singleChatFromUser.getAccountType() == 3) {
            IBaAutoMessageService d = BaAutoMessageServiceImpl.m99180d();
            String uid = singleChatFromUser.getUid();
            C89219l.m154716b(uid, "");
            d.mo91015a(uid);
        }
        AbstractC88979t<AbstractC53732a> a4 = chatRoomViewModel.f125105b.mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a4, "");
        C88934a.m154195a(C88939d.m154203a(a4, null, null, new C54417f(this, cVar), 3), aVar3);
        AbstractC88979t<AbstractC53746c> a5 = chatRoomViewModel.f125104a.mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a5, "");
        C88934a.m154195a(C88939d.m154203a(a5, null, null, new C54418g(this, cVar), 3), aVar3);
        AbstractC88979t<AbstractC53746c> a6 = chatRoomViewModel.f125104a.mo143261a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a6, "");
        C88934a.m154195a(C88939d.m154203a(a6, null, null, new C54427n(this), 3), aVar3);
        AbstractC54386c cVar3 = this.f124643m;
        if (cVar3 == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        cVar3.f124575e = chatRoomViewModel.mo91661a();
        cVar3.f124576f = chatRoomViewModel;
        recyclerView.setClickable(true);
        C54419h hVar = new C54419h();
        hVar.f4621m = false;
        recyclerView.setItemAnimator(hVar);
        chatLinearLayoutManager.mo4357b(true);
        chatLinearLayoutManager.mo4329a(false);
        recyclerView.setLayoutManager(chatLinearLayoutManager);
        recyclerView.setVerticalScrollBarEnabled(true);
        recyclerView.setScrollBarStyle(33554432);
        AbstractC54386c cVar4 = this.f124643m;
        if (cVar4 == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        recyclerView.setAdapter(cVar4);
        recyclerView.requestDisallowInterceptTouchEvent(true);
        recyclerView.setOnTouchListener(new View$OnTouchListenerC54415d(recyclerView, this));
        recyclerView.mo4405a(new C54416e(context, this));
        C53700k.m98970a(new RunnableC54545g(C54542d.m100005f(), recyclerView), 800);
        C80330da.C80331a.m139266a("message_list").mo123698a(recyclerView);
        AbstractC54141a aVar5 = this.f124640j;
        if (aVar5 == null) {
            C89219l.m154710a("mInputView");
        }
        aVar5.mo91207a(new AbstractC54142b.AbstractC54144b(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel.C544081 */

            /* renamed from: a */
            final /* synthetic */ BaseChatPanel f124654a;

            static {
                Covode.recordClassIndex(64113);
            }

            {
                this.f124654a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.base.AbstractC54142b.AbstractC54144b
            /* renamed from: a */
            public final void mo91257a(int i) {
                boolean z;
                C54542d f = C54542d.m100005f();
                RecyclerView recyclerView = this.f124654a.f124636f;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                f.mo90194a(recyclerView, z);
            }
        });
        AbstractC54141a aVar6 = this.f124640j;
        if (aVar6 == null) {
            C89219l.m154710a("mInputView");
        }
        aVar6.mo91210a(new AbstractC54232b.AbstractC54233a(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel.C544092 */

            /* renamed from: a */
            final /* synthetic */ BaseChatPanel f124655a;

            static {
                Covode.recordClassIndex(64114);
            }

            {
                this.f124655a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.view.AbstractC54232b.AbstractC54233a
            /* renamed from: a */
            public final void mo91202a(int i, View view) {
                if (i != -1) {
                    this.f124655a.f124636f.postDelayed(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel.C544092.RunnableC544101 */

                        /* renamed from: a */
                        final /* synthetic */ C544092 f124656a;

                        static {
                            Covode.recordClassIndex(64115);
                        }

                        {
                            this.f124656a = r1;
                        }

                        public final void run() {
                            LinearLayoutManager linearLayoutManager;
                            if ((this.f124656a.f124655a.f124636f.getLayoutManager() instanceof ChatLinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) this.f124656a.f124655a.f124636f.getLayoutManager()) != null) {
                                RecyclerView recyclerView = this.f124656a.f124655a.f124636f;
                                C89219l.m154721d(recyclerView, "");
                                int i = 0;
                                if (linearLayoutManager.f4336l) {
                                    linearLayoutManager.mo4354a(recyclerView, (RecyclerView.C1378s) null, 0);
                                    return;
                                }
                                if (linearLayoutManager.mo4685A() - 1 >= 0) {
                                    i = linearLayoutManager.mo4685A() - 1;
                                }
                                linearLayoutManager.mo4354a(recyclerView, (RecyclerView.C1378s) null, i);
                            }
                        }
                    }, 50);
                }
            }
        });
        AbstractC54141a aVar7 = this.f124640j;
        if (aVar7 == null) {
            C89219l.m154710a("mInputView");
        }
        aVar7.mo91208a(new AbstractView$OnClickListenerC54146d(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.base.BaseChatPanel.C544113 */

            /* renamed from: a */
            final /* synthetic */ BaseChatPanel f124657a;

            static {
                Covode.recordClassIndex(64116);
            }

            public final boolean onLongClick(View view) {
                return false;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f124657a = r1;
            }

            public final void onClick(View view) {
                C54542d.m100005f().mo90194a(this.f124657a.f124636f, true);
            }
        });
        AbstractC17434e a7 = chatRoomViewModel.mo91661a();
        C89219l.m154721d(requireActivity, "");
        C89219l.m154721d(a7, "");
        C89219l.m154721d(aVar, "");
        AbstractC1174ac a8 = C1181ae.m3881a(requireActivity, new C54282b(a7, aVar)).mo3983a(ReadStateViewModel.class);
        C89219l.m154716b(a8, "");
        ReadStateViewModel readStateViewModel = (ReadStateViewModel) a8;
        String a9 = chatRoomViewModel.mo91661a().mo27757a();
        C89219l.m154721d(a9, "");
        readStateViewModel.f124329a.mo91368b().clear();
        readStateViewModel.f124329a.mo91369c().setValue(null);
        C17419b.m32261a().mo27889a(a9, readStateViewModel);
        C89219l.m154721d(fragment, "");
        fragment.getLifecycle().mo4012a(readStateViewModel);
        fragment.getLifecycle().mo4012a(readStateViewModel.mo91363b());
        fragment.getLifecycle().mo4012a(readStateViewModel.mo91364c());
        AbstractC54386c cVar5 = this.f124643m;
        if (cVar5 == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        cVar5.mo91454a(readStateViewModel);
        AbstractC54141a aVar8 = this.f124640j;
        if (aVar8 == null) {
            C89219l.m154710a("mInputView");
        }
        aVar8.mo91206a(readStateViewModel);
        AbstractC54386c cVar6 = this.f124643m;
        if (cVar6 == null) {
            C89219l.m154710a("mMessageAdapter");
        }
        this.f124652x = new C54441b(view, recyclerView, cVar6);
        fragment.getLifecycle().mo4012a(chatRoomViewModel);
    }
}
