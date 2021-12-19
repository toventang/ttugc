package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bg */
public final class C54526bg {

    /* renamed from: a */
    public final TuxIconView f124971a;

    /* renamed from: b */
    private C19538ai f124972b;

    /* renamed from: c */
    private final AbstractC89244h f124973c = C89250i.m154773a((AbstractC89171a) new C54527a(this));

    /* renamed from: d */
    private final AbstractC89244h f124974d = C89250i.m154773a((AbstractC89171a) C54529b.f124977a);

    static {
        Covode.recordClassIndex(64237);
    }

    /* renamed from: b */
    private final View.OnAttachStateChangeListener m99978b() {
        return (View.OnAttachStateChangeListener) this.f124973c.getValue();
    }

    /* renamed from: c */
    private final C22999a m99979c() {
        return (C22999a) this.f124974d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bg$a */
    static final class C54527a extends AbstractC89220m implements AbstractC89171a<View$OnAttachStateChangeListenerC545281> {

        /* renamed from: a */
        final /* synthetic */ C54526bg f124975a;

        static {
            Covode.recordClassIndex(64238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54527a(C54526bg bgVar) {
            super(0);
            this.f124975a = bgVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View$OnAttachStateChangeListenerC545281 invoke() {
            return new View.OnAttachStateChangeListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.C54526bg.C54527a.View$OnAttachStateChangeListenerC545281 */

                /* renamed from: a */
                final /* synthetic */ C54527a f124976a;

                static {
                    Covode.recordClassIndex(64239);
                }

                public final void onViewDetachedFromWindow(View view) {
                    C89219l.m154721d(view, "");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f124976a = r1;
                }

                public final void onViewAttachedToWindow(View view) {
                    C89219l.m154721d(view, "");
                    this.f124976a.f124975a.mo91620a();
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.bg$b */
    static final class C54529b extends AbstractC89220m implements AbstractC89171a<C22999a> {

        /* renamed from: a */
        public static final C54529b f124977a = new C54529b();

        static {
            Covode.recordClassIndex(64240);
        }

        C54529b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C22999a invoke() {
            return C23005c.m43393a(C545301.f124978a);
        }
    }

    /* renamed from: d */
    private final void m99980d() {
        TuxIconView tuxIconView = this.f124971a;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
    }

    /* renamed from: e */
    private final void m99981e() {
        TuxIconView tuxIconView = this.f124971a;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
    }

    /* renamed from: f */
    private final void m99982f() {
        TuxIconView tuxIconView = this.f124971a;
        if (tuxIconView != null) {
            tuxIconView.setTuxIcon(m99979c());
            this.f124971a.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo91620a() {
        Integer valueOf;
        C19538ai aiVar = this.f124972b;
        if (aiVar != null && (valueOf = Integer.valueOf(aiVar.getMsgStatus())) != null) {
            if (valueOf.intValue() == 1 || valueOf.intValue() == 0) {
                m99980d();
            } else if (valueOf.intValue() == 3) {
                m99982f();
            } else if (valueOf.intValue() == 2 || valueOf.intValue() == 5) {
                m99981e();
            }
        }
    }

    /* renamed from: a */
    public final void mo91621a(C19538ai aiVar) {
        TuxIconView tuxIconView = this.f124971a;
        if (tuxIconView != null) {
            tuxIconView.setTag(50331648, 6);
            tuxIconView.setTag(67108864, aiVar);
        }
        this.f124972b = aiVar;
        mo91620a();
    }

    public C54526bg(TuxIconView tuxIconView) {
        this.f124971a = tuxIconView;
        if (tuxIconView != null) {
            tuxIconView.removeOnAttachStateChangeListener(m99978b());
            tuxIconView.addOnAttachStateChangeListener(m99978b());
        }
    }
}
