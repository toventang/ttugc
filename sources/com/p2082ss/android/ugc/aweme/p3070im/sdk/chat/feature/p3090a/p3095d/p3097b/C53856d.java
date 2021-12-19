package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.p3090a.p3095d.p3097b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.SayHelloContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56203d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.d */
public final class C53856d extends AbstractC54482a<SayHelloContent> {

    /* renamed from: b */
    public static final C53857a f123499b = new C53857a((byte) 0);

    /* renamed from: a */
    public final boolean f123500a;

    /* renamed from: x */
    private View f123501x;

    /* renamed from: y */
    private AbstractC53845a f123502y;

    static {
        Covode.recordClassIndex(63516);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.a.d.b.d$a */
    public static final class C53857a {
        static {
            Covode.recordClassIndex(63517);
        }

        private C53857a() {
        }

        public /* synthetic */ C53857a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.viewholder.AbstractC54482a
    /* renamed from: a */
    public final void mo91007a() {
        super.mo91007a();
        View findViewById = this.itemView.findViewById(R.id.dp4);
        C89219l.m154716b(findViewById, "");
        this.f123501x = findViewById;
    }

    public /* synthetic */ C53856d(View view, EnumC53772b bVar) {
        this(view, bVar, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53856d(View view, EnumC53772b bVar, boolean z) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f123500a = z;
    }

    /* renamed from: a */
    public final void mo91008a(C19538ai aiVar, C19538ai aiVar2, SayHelloContent sayHelloContent, int i) {
        C89219l.m154721d(aiVar, "");
        super.mo91008a(aiVar, aiVar2, (BaseContent) sayHelloContent, i);
        boolean z = false;
        if (aiVar != null && sayHelloContent != null && !C56203d.m102116e() && (!C56203d.m102114c() || this.f123500a)) {
            if (sayHelloContent.isNewStyle()) {
                AbstractC53845a aVar = this.f123502y;
                if (!(aVar instanceof C53848b)) {
                    if (aVar != null) {
                        aVar.mo90992a(false);
                    }
                    this.f123502y = new C53848b(this);
                }
            } else {
                AbstractC53845a aVar2 = this.f123502y;
                if (!(aVar2 instanceof C53850c)) {
                    if (aVar2 != null) {
                        aVar2.mo90992a(false);
                    }
                    this.f123502y = new C53850c(this);
                }
            }
            z = true;
        }
        if (!z) {
            View view = this.f123501x;
            if (view == null) {
                C89219l.m154710a("rootLayout");
            }
            view.setVisibility(8);
            return;
        }
        if (this.f123500a) {
            View view2 = this.f123501x;
            if (view2 == null) {
                C89219l.m154710a("rootLayout");
            }
            C23163i.m43668b(view2, 0, 0, 0, 0, false, 16);
        }
        AbstractC53845a aVar3 = this.f123502y;
        if (aVar3 == null) {
            C89219l.m154715b();
        }
        if (sayHelloContent == null) {
            C89219l.m154715b();
        }
        aVar3.mo90991a(aiVar, aiVar2, sayHelloContent, i, this.f123500a);
    }
}
