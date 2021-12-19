package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.p3152ui.p3153a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a;
import com.p2082ss.android.ugc.aweme.inbox.widget.C56520b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.focused.viewmodel.AbstractC54913a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55233v;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.BadgeTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a */
public final class C54896a extends RecyclerView.ViewHolder implements AbstractC56519a {

    /* renamed from: d */
    public static final C54897a f125683d = new C54897a((byte) 0);

    /* renamed from: a */
    public final ImageView f125684a;

    /* renamed from: b */
    public final BadgeTextView f125685b;

    /* renamed from: c */
    public final AbstractC54913a f125686c;

    /* renamed from: e */
    private C56520b f125687e;

    static {
        Covode.recordClassIndex(64617);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a$a */
    public static final class C54897a {
        static {
            Covode.recordClassIndex(64618);
        }

        private C54897a() {
        }

        public /* synthetic */ C54897a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.a.a$b */
    public static final class View$OnClickListenerC54898b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C54896a f125688a;

        /* renamed from: b */
        final /* synthetic */ C54899b f125689b;

        static {
            Covode.recordClassIndex(64619);
        }

        public View$OnClickListenerC54898b(C54896a aVar, C54899b bVar) {
            this.f125688a = aVar;
            this.f125689b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f125688a.f125686c.mo91909a(this.f125689b.f128238q);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.inbox.widget.AbstractC56519a
    /* renamed from: a */
    public final void mo87499a(C56520b bVar) {
        C89219l.m154721d(bVar, "");
        if (!C89219l.m154714a(this.f125687e, bVar)) {
            this.f125687e = bVar;
            if (bVar.f128859a != -1) {
                View view = this.itemView;
                C89219l.m154716b(view, "");
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = bVar.f128859a;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54896a(View view, AbstractC54913a aVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        this.f125686c = aVar;
        View findViewById = view.findViewById(R.id.c0x);
        C89219l.m154716b(findViewById, "");
        this.f125684a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.f6l);
        C89219l.m154716b(findViewById2, "");
        this.f125685b = (BadgeTextView) findViewById2;
        C55233v.m101004a(view);
    }
}
