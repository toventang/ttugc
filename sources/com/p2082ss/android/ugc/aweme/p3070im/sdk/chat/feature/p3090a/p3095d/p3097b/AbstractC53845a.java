package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.p025c.C0484a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.C17438g;
import com.bytedance.p1399im.core.p1404a.p1405a.AbstractC19479b;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.EmojiContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SayHelloContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3091a.C53835a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.story.C54346b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55231t;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a */
public abstract class AbstractC53845a {

    /* renamed from: f */
    public static final C53846a f123469f = new C53846a((byte) 0);

    /* renamed from: a */
    public final View f123470a;

    /* renamed from: b */
    public final Context f123471b;

    /* renamed from: c */
    protected C19538ai f123472c;

    /* renamed from: d */
    protected SayHelloContent f123473d;

    /* renamed from: e */
    public final C53856d f123474e;

    /* renamed from: g */
    private View f123475g;

    /* renamed from: h */
    private TextView f123476h;

    /* renamed from: i */
    private View f123477i;

    /* renamed from: j */
    private boolean f123478j;

    static {
        Covode.recordClassIndex(63505);
    }

    /* renamed from: a */
    public abstract void mo90992a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<C46534a> mo90994b();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a$a */
    public static final class C53846a {
        static {
            Covode.recordClassIndex(63506);
        }

        private C53846a() {
        }

        public /* synthetic */ C53846a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SayHelloContent mo90989a() {
        SayHelloContent sayHelloContent = this.f123473d;
        if (sayHelloContent == null) {
            C89219l.m154710a("content");
        }
        return sayHelloContent;
    }

    /* renamed from: e */
    private final String mo90998e() {
        C19538ai aiVar = this.f123472c;
        if (aiVar == null) {
            C89219l.m154710a("message");
        }
        String valueOf = String.valueOf(AbstractC17427b.C17428a.m32311c(aiVar.getConversationId()));
        C89219l.m154716b(valueOf, "");
        return valueOf;
    }

    /* renamed from: c */
    public void mo90995c() {
        this.f123476h = (TextView) mo90993b(R.id.dp5);
        this.f123475g = mo90993b(R.id.a77);
        View b = mo90993b(R.id.amp);
        this.f123477i = b;
        if (b == null) {
            C89219l.m154710a("dividerTop");
        }
        b.setVisibility(8);
        View view = this.f123475g;
        if (view == null) {
            C89219l.m154710a("closeIv");
        }
        view.setOnClickListener(new View$OnClickListenerC53847b(this));
    }

    /* renamed from: d */
    public final void mo90996d() {
        String e = mo90998e();
        C19538ai aiVar = this.f123472c;
        if (aiVar == null) {
            C89219l.m154710a("message");
        }
        String conversationId = aiVar.getConversationId();
        C89219l.m154716b(conversationId, "");
        C53835a.m99077a(e, conversationId, mo90994b(), true);
        C19538ai aiVar2 = this.f123472c;
        if (aiVar2 == null) {
            C89219l.m154710a("message");
        }
        C55231t.m101000a(aiVar2, (AbstractC19479b<C19538ai>) null);
        if (this.f123478j) {
            this.f123470a.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.a$b */
    public static final class View$OnClickListenerC53847b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC53845a f123479a;

        static {
            Covode.recordClassIndex(63507);
        }

        View$OnClickListenerC53847b(AbstractC53845a aVar) {
            this.f123479a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f123479a.mo90996d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final <T extends View> T mo90993b(int i) {
        T t = (T) this.f123470a.findViewById(i);
        C89219l.m154716b(t, "");
        return t;
    }

    public AbstractC53845a(C53856d dVar) {
        C89219l.m154721d(dVar, "");
        this.f123474e = dVar;
        View view = dVar.itemView;
        C89219l.m154716b(view, "");
        this.f123470a = view;
        Context context = view.getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        this.f123471b = context;
        mo90995c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo90990a(int i) {
        if (i < mo90994b().size()) {
            C46534a aVar = mo90994b().get(i);
            C19538ai aiVar = this.f123472c;
            if (aiVar == null) {
                C89219l.m154710a("message");
            }
            C55231t.m101000a(aiVar, (AbstractC19479b<C19538ai>) null);
            if (this.f123478j) {
                this.f123470a.setVisibility(8);
            }
            C19538ai aiVar2 = this.f123472c;
            if (aiVar2 == null) {
                C89219l.m154710a("message");
            }
            String conversationId = aiVar2.getConversationId();
            C89219l.m154716b(conversationId, "");
            C54346b.m99660a(conversationId, "");
            C17438g.C17439a.m32347a().mo27815a(mo90998e()).mo27813a(EmojiContent.obtain(aVar)).mo27818a();
            C19538ai aiVar3 = this.f123472c;
            if (aiVar3 == null) {
                C89219l.m154710a("message");
            }
            String conversationId2 = aiVar3.getConversationId();
            String valueOf = String.valueOf(aVar.getId());
            C53835a.C53839d dVar = C53835a.C53839d.f123460a;
            C89219l.m154721d(valueOf, "");
            C89219l.m154721d(dVar, "");
            C0484a aVar2 = new C0484a();
            String b = C13607d.m24442b(conversationId2);
            C89219l.m154716b(b, "");
            aVar2.put("conversation_id", b);
            aVar2.put(C53835a.C53837b.f123457a, valueOf);
            dVar.invoke(C53835a.C53836a.f123455c, aVar2);
        }
    }

    /* renamed from: a */
    public void mo90991a(C19538ai aiVar, C19538ai aiVar2, SayHelloContent sayHelloContent, int i, boolean z) {
        String str;
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(sayHelloContent, "");
        this.f123472c = aiVar;
        this.f123473d = sayHelloContent;
        this.f123478j = z;
        if (aiVar.getLocalExt().get("is_logger") == null) {
            aiVar.addLocalExt("is_logger", "true");
            String e = mo90998e();
            C19538ai aiVar3 = this.f123472c;
            if (aiVar3 == null) {
                C89219l.m154710a("message");
            }
            String conversationId = aiVar3.getConversationId();
            C89219l.m154716b(conversationId, "");
            C53835a.m99077a(e, conversationId, mo90994b(), false);
            C55231t.m100999a(aiVar);
        }
        TextView textView = this.f123476h;
        if (textView == null) {
            C89219l.m154710a("sayHelloTv");
        }
        String str2 = sayHelloContent.helloText;
        if (str2 == null || str2.length() == 0) {
            str = this.f123471b.getString(R.string.c9q, sayHelloContent.nickname);
        } else {
            str = sayHelloContent.helloText;
        }
        textView.setText(str);
    }
}
