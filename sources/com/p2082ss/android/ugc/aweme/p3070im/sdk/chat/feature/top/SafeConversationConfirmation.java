package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation */
public final class SafeConversationConfirmation extends FrameLayout {

    /* renamed from: a */
    public boolean f124488a;

    /* renamed from: b */
    private final AbstractC89244h f124489b;

    /* renamed from: c */
    private final AbstractC89244h f124490c;

    /* renamed from: d */
    private final AbstractC89244h f124491d;

    /* renamed from: e */
    private final AbstractC89244h f124492e;

    static {
        Covode.recordClassIndex(64048);
    }

    public SafeConversationConfirmation(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View getCloseButton() {
        return (View) this.f124490c.getValue();
    }

    public final TuxButton getFirstButton() {
        return (TuxButton) this.f124491d.getValue();
    }

    public final TuxButton getSecondButton() {
        return (TuxButton) this.f124492e.getValue();
    }

    public final BottomNoticeViewModel getViewModel() {
        return (BottomNoticeViewModel) this.f124489b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation$g */
    static final class C54353g extends AbstractC89220m implements AbstractC89171a<BottomNoticeViewModel> {

        /* renamed from: a */
        final /* synthetic */ Context f124499a;

        static {
            Covode.recordClassIndex(64055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54353g(Context context) {
            super(0);
            this.f124499a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BottomNoticeViewModel invoke() {
            return new BottomNoticeViewModel(this.f124499a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation$a */
    static final class C54347a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ SafeConversationConfirmation f124493a;

        static {
            Covode.recordClassIndex(64049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54347a(SafeConversationConfirmation safeConversationConfirmation) {
            super(0);
            this.f124493a = safeConversationConfirmation;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f124493a.findViewById(R.id.bgf);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation$b */
    static final class C54348b extends AbstractC89220m implements AbstractC89171a<TuxButton> {

        /* renamed from: a */
        final /* synthetic */ SafeConversationConfirmation f124494a;

        static {
            Covode.recordClassIndex(64050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54348b(SafeConversationConfirmation safeConversationConfirmation) {
            super(0);
            this.f124494a = safeConversationConfirmation;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxButton invoke() {
            return this.f124494a.findViewById(R.id.bko);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation$f */
    static final class C54352f extends AbstractC89220m implements AbstractC89171a<TuxButton> {

        /* renamed from: a */
        final /* synthetic */ SafeConversationConfirmation f124498a;

        static {
            Covode.recordClassIndex(64054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54352f(SafeConversationConfirmation safeConversationConfirmation) {
            super(0);
            this.f124498a = safeConversationConfirmation;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxButton invoke() {
            return this.f124498a.findViewById(R.id.bkp);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation$c */
    public static final class View$OnClickListenerC54349c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SafeConversationConfirmation f124495a;

        static {
            Covode.recordClassIndex(64051);
        }

        public View$OnClickListenerC54349c(SafeConversationConfirmation safeConversationConfirmation) {
            this.f124495a = safeConversationConfirmation;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f124495a.getViewModel().mo91428b(1);
            this.f124495a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation$e */
    public static final class View$OnClickListenerC54351e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SafeConversationConfirmation f124497a;

        static {
            Covode.recordClassIndex(64053);
        }

        public View$OnClickListenerC54351e(SafeConversationConfirmation safeConversationConfirmation) {
            this.f124497a = safeConversationConfirmation;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BottomNoticeViewModel viewModel = this.f124497a.getViewModel();
            Context context = viewModel.f124487c;
            while (true) {
                if (context != null) {
                    if (!(context instanceof Activity)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        Activity activity = (Activity) context;
                        if (activity != null) {
                            new C23144b(activity).mo37640e(R.string.dlk).mo37637b();
                            viewModel.mo91428b(2);
                        }
                    }
                } else {
                    break;
                }
            }
            this.f124497a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation$d */
    public static final class View$OnClickListenerC54350d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SafeConversationConfirmation f124496a;

        static {
            Covode.recordClassIndex(64052);
        }

        public View$OnClickListenerC54350d(SafeConversationConfirmation safeConversationConfirmation) {
            this.f124496a = safeConversationConfirmation;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
            if (r1 == null) goto L_0x0016;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r5)
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation r0 = r4.f124496a
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel r3 = r0.getViewModel()
                android.content.Context r2 = r3.f124487c
            L_0x000b:
                r0 = 0
                if (r2 == 0) goto L_0x0016
                boolean r0 = r2 instanceof android.app.Activity
                if (r0 == 0) goto L_0x0045
                android.app.Activity r2 = (android.app.Activity) r2
                if (r2 != 0) goto L_0x001e
            L_0x0016:
                com.ss.android.ugc.aweme.im.sdk.chat.feature.top.SafeConversationConfirmation r1 = r4.f124496a
                r0 = 8
                r1.setVisibility(r0)
                return
            L_0x001e:
                com.ss.android.ugc.aweme.im.sdk.chat.data.a r1 = r3.f124485a
                if (r1 == 0) goto L_0x0033
                boolean r0 = r1 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.C54004b
                if (r0 == 0) goto L_0x0038
                java.lang.String r0 = r1.getConversationId()
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g$a r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g.m98959a(r0)
            L_0x002e:
                java.lang.String r0 = "5"
                com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g.m98963a(r1, r2, r0)
            L_0x0033:
                r0 = 3
                r3.mo91428b(r0)
                goto L_0x0016
            L_0x0038:
                boolean r0 = r1 instanceof com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a
                if (r0 == 0) goto L_0x0033
                com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a r1 = (com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a) r1
                com.ss.android.ugc.aweme.im.sdk.chat.b.c.g$a r1 = com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g.m98958a(r1)
                if (r1 != 0) goto L_0x002e
                goto L_0x0016
            L_0x0045:
                boolean r0 = r2 instanceof android.content.ContextWrapper
                if (r0 == 0) goto L_0x0016
                android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
                android.content.Context r2 = r2.getBaseContext()
                goto L_0x000b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.top.SafeConversationConfirmation.View$OnClickListenerC54350d.onClick(android.view.View):void");
        }
    }

    private /* synthetic */ SafeConversationConfirmation(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SafeConversationConfirmation(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4445);
        this.f124489b = C89250i.m154773a((AbstractC89171a) new C54353g(context));
        this.f124490c = C89250i.m154773a((AbstractC89171a) new C54347a(this));
        this.f124491d = C89250i.m154773a((AbstractC89171a) new C54348b(this));
        this.f124492e = C89250i.m154773a((AbstractC89171a) new C54352f(this));
        MethodCollector.m26664o(4445);
    }
}
