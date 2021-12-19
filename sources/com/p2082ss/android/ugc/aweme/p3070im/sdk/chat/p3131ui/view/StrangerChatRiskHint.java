package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.C23142d;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53771a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3079a.C53615d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.p3083c.C53688g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3171b.C55059b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55262b;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69124b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint */
public final class StrangerChatRiskHint extends LinearLayout {

    /* renamed from: c */
    public static final C54456a f124747c = new C54456a((byte) 0);

    /* renamed from: a */
    public C54463a f124748a;

    /* renamed from: b */
    public C54315a f124749b;

    /* renamed from: d */
    private final AbstractC89244h f124750d;

    /* renamed from: e */
    private HashMap f124751e;

    static {
        Covode.recordClassIndex(64165);
    }

    public StrangerChatRiskHint(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo91527a(int i) {
        if (this.f124751e == null) {
            this.f124751e = new HashMap();
        }
        View view = (View) this.f124751e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f124751e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Keva getKeva() {
        return (Keva) this.f124750d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint$a */
    public static final class C54456a {
        static {
            Covode.recordClassIndex(64166);
        }

        private C54456a() {
        }

        public /* synthetic */ C54456a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint$e */
    static final class C54462e extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C54462e f124758a = new C54462e();

        static {
            Covode.recordClassIndex(64172);
        }

        C54462e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("im_strange_chat_risk");
        }
    }

    /* renamed from: a */
    public final void mo91528a() {
        C54315a aVar = this.f124749b;
        if (aVar != null && aVar.getConversationId() != null) {
            getKeva().storeBoolean(getKey(), true);
        }
    }

    public final String getKey() {
        String str;
        StringBuilder sb = new StringBuilder("im_stranger_receiver_risk_hint_");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        String str2 = null;
        if (curUser != null) {
            str = curUser.getUid();
        } else {
            str = null;
        }
        StringBuilder append = sb.append(str).append('_');
        C54315a aVar = this.f124749b;
        if (aVar != null) {
            str2 = aVar.getConversationId();
        }
        return append.append(str2).toString();
    }

    /* renamed from: b */
    private final void m99796b() {
        MethodCollector.m26663i(5937);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.a8m, this);
        ((TuxTextView) mo91527a(R.id.xf)).setOnClickListener(new View$OnClickListenerC54457b(this));
        ((TuxTextView) mo91527a(R.id.wy)).setOnClickListener(new View$OnClickListenerC54458c(this));
        String string = getContext().getString(R.string.b9d);
        C89219l.m154716b(string, "");
        String string2 = getContext().getString(R.string.b9c, string);
        C89219l.m154716b(string2, "");
        C23142d dVar = new C23142d(string2);
        dVar.mo37628a(41);
        int a = C89361p.m154888a((CharSequence) string2, string, 0, false, 6);
        dVar.setSpan(new C54461d(this, C0643b.m2378c(getContext(), R.color.bx)), a, string.length() + a, 34);
        dVar.setSpan(new C23126b(42, true), a, string.length() + a, 34);
        TuxTextView tuxTextView = (TuxTextView) mo91527a(R.id.eaf);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView2 = (TuxTextView) mo91527a(R.id.eaf);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setHighlightColor(C0643b.m2378c(getContext(), R.color.c9));
        TuxTextView tuxTextView3 = (TuxTextView) mo91527a(R.id.eaf);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(dVar);
        MethodCollector.m26664o(5937);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint$d */
    public static final class C54461d extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ StrangerChatRiskHint f124756a;

        /* renamed from: b */
        final /* synthetic */ int f124757b;

        static {
            Covode.recordClassIndex(64171);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(this.f124757b);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C53688g.C53689a a;
            C89219l.m154721d(view, "");
            StrangerChatRiskHint strangerChatRiskHint = this.f124756a;
            C54315a aVar = strangerChatRiskHint.f124749b;
            if (aVar != null && (a = C53688g.m98958a(aVar)) != null) {
                Context context = strangerChatRiskHint.getContext();
                C89219l.m154716b(context, "");
                Activity a2 = C69124b.m122223a(context);
                if (a2 != null) {
                    C53688g.m98963a(a, a2, "4");
                }
                C55059b.m100699d(a.f123196b, "click_share_button");
                C53615d.m98862a(aVar, "report");
            }
        }

        C54461d(StrangerChatRiskHint strangerChatRiskHint, int i) {
            this.f124756a = strangerChatRiskHint;
            this.f124757b = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint$c */
    public static final class View$OnClickListenerC54458c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StrangerChatRiskHint f124753a;

        static {
            Covode.recordClassIndex(64168);
        }

        View$OnClickListenerC54458c(StrangerChatRiskHint strangerChatRiskHint) {
            this.f124753a = strangerChatRiskHint;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint$c$b */
        static final class C54460b<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C54460b f124755a = new C54460b();

            static {
                Covode.recordClassIndex(64170);
            }

            C54460b() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                C56244a.m102193e("StrangerChatRiskHint", "postChatStrangeUnLimit error");
                C89219l.m154716b(th, "");
                C56244a.m102188a(th);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint$c$a */
        static final class C54459a<T> implements AbstractC88433f {

            /* renamed from: a */
            public static final C54459a f124754a = new C54459a();

            static {
                Covode.recordClassIndex(64169);
            }

            C54459a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Integer num;
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse == null || baseResponse.status_code != 0) {
                    StringBuilder sb = new StringBuilder("postChatStrangeUnLimit status_code: ");
                    if (baseResponse != null) {
                        num = Integer.valueOf(baseResponse.status_code);
                    } else {
                        num = null;
                    }
                    C56244a.m102185a("StrangerChatRiskHint", sb.append(num).toString());
                }
            }
        }

        public final void onClick(View view) {
            AbstractC89172b<EnumC53771a, C89391z> bVar;
            String str;
            String str2;
            AbstractC88979t<BaseResponse> b;
            IMUser fromUser;
            IMUser fromUser2;
            ClickAgent.onClick(view);
            C54315a aVar = this.f124753a.f124749b;
            if (aVar != null) {
                this.f124753a.mo91528a();
                C54315a aVar2 = this.f124753a.f124749b;
                if (aVar2 == null || (fromUser2 = aVar2.getFromUser()) == null || (str = fromUser2.getUid()) == null) {
                    str = "";
                }
                C54315a aVar3 = this.f124753a.f124749b;
                if (aVar3 == null || (fromUser = aVar3.getFromUser()) == null || (str2 = fromUser.getSecUid()) == null) {
                    str2 = "";
                }
                String conversationId = aVar.getConversationId();
                C89219l.m154721d(str, "");
                C89219l.m154721d(str2, "");
                C89219l.m154721d(conversationId, "");
                AbstractC88979t<BaseResponse> postChatStrangeUnLimit = C55262b.m101019a().postChatStrangeUnLimit(str, str2, conversationId);
                if (!(postChatStrangeUnLimit == null || (b = postChatStrangeUnLimit.mo143278b(C88925a.m154180b(C88946a.f201991c))) == null)) {
                    b.mo143254a(C54459a.f124754a, C54460b.f124755a);
                }
                C53615d.m98862a(aVar, "accept");
            }
            C54463a aVar4 = this.f124753a.f124748a;
            if (aVar4 != null && (bVar = aVar4.f124760b) != null) {
                bVar.invoke(EnumC53771a.Input);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.view.StrangerChatRiskHint$b */
    public static final class View$OnClickListenerC54457b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StrangerChatRiskHint f124752a;

        static {
            Covode.recordClassIndex(64167);
        }

        View$OnClickListenerC54457b(StrangerChatRiskHint strangerChatRiskHint) {
            this.f124752a = strangerChatRiskHint;
        }

        public final void onClick(View view) {
            AbstractC89171a<C89391z> aVar;
            ClickAgent.onClick(view);
            C54315a aVar2 = this.f124752a.f124749b;
            if (aVar2 != null) {
                AbstractC17420a.C17421a.m32276a().mo27732c(aVar2.getConversationId(), null);
                this.f124752a.mo91528a();
                C53615d.m98862a(aVar2, "delete");
            }
            C54463a aVar3 = this.f124752a.f124748a;
            if (aVar3 != null && (aVar = aVar3.f124759a) != null) {
                aVar.invoke();
            }
        }
    }

    private /* synthetic */ StrangerChatRiskHint(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StrangerChatRiskHint(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5939);
        this.f124750d = C89250i.m154773a((AbstractC89171a) C54462e.f124758a);
        m99796b();
        MethodCollector.m26664o(5939);
    }
}
