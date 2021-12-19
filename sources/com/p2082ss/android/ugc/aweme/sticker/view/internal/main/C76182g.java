package com.p2082ss.android.ugc.aweme.sticker.view.internal.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75520e;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76146b;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.g */
public final class C76182g implements AbstractC76146b {

    /* renamed from: a */
    public final ImageView f171141a;

    /* renamed from: b */
    public boolean f171142b = true;

    /* renamed from: c */
    public final C76183a f171143c;

    /* renamed from: d */
    public final ViewGroup f171144d;

    /* renamed from: e */
    public final C75520e f171145e;

    /* renamed from: f */
    public final boolean f171146f;

    /* renamed from: g */
    private TextView f171147g;

    /* renamed from: h */
    private final View f171148h;

    static {
        Covode.recordClassIndex(89132);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.g$a */
    public static class C76183a {

        /* renamed from: a */
        public AbstractC89172b<? super TextView, C89391z> f171149a;

        static {
            Covode.recordClassIndex(89133);
        }

        private C76183a() {
            this.f171149a = null;
        }

        public /* synthetic */ C76183a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.g$b */
    static final class RunnableC76184b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C76182g f171150a;

        static {
            Covode.recordClassIndex(89134);
        }

        RunnableC76184b(C76182g gVar) {
            this.f171150a = gVar;
        }

        public final void run() {
            this.f171150a.f171141a.setEnabled(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.g$c */
    static final class RunnableC76185c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C76182g f171151a;

        static {
            Covode.recordClassIndex(89135);
        }

        RunnableC76185c(C76182g gVar) {
            this.f171151a = gVar;
        }

        public final void run() {
            this.f171151a.f171141a.setRotation(0.0f);
            this.f171151a.f171141a.setEnabled(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76146b
    /* renamed from: a */
    public final void mo119901a(boolean z) {
        m133613b(z);
    }

    /* renamed from: b */
    private final void m133613b(boolean z) {
        float f;
        this.f171142b = z;
        this.f171148h.setEnabled(z);
        ImageView imageView = this.f171141a;
        float f2 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        imageView.setAlpha(f);
        TextView textView = this.f171147g;
        if (textView != null) {
            if (!z) {
                f2 = 0.5f;
            }
            textView.setAlpha(f2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.main.g$d */
    static final class View$OnClickListenerC76186d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C76182g f171152a;

        /* renamed from: b */
        final /* synthetic */ Context f171153b;

        static {
            Covode.recordClassIndex(89136);
        }

        View$OnClickListenerC76186d(C76182g gVar, Context context) {
            this.f171152a = gVar;
            this.f171153b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f171152a.f171142b) {
                Context context = this.f171153b;
                C85052j.C85053a.m146248b(context, context.getResources().getString(R.string.f7a), 0).mo129996a();
                return;
            }
            AbstractC89172b<? super Boolean, Boolean> bVar = this.f171152a.f171145e.f169728d;
            if (bVar == null || !bVar.invoke(Boolean.valueOf(this.f171152a.f171142b)).booleanValue()) {
                C76182g gVar = this.f171152a;
                C75520e eVar = gVar.f171145e;
                gVar.f171141a.animate().rotationBy(-180.0f).setDuration(200).withStartAction(new RunnableC76184b(gVar)).withEndAction(new RunnableC76185c(gVar)).start();
                AbstractC89172b<? super View, C89391z> bVar2 = eVar.f169727c;
                if (bVar2 != null) {
                    bVar2.invoke(gVar.f171141a);
                }
            }
        }
    }

    public C76182g(ViewGroup viewGroup, C75520e eVar, boolean z) {
        int i;
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(eVar, "");
        this.f171144d = viewGroup;
        this.f171145e = eVar;
        this.f171146f = z;
        C76183a aVar = new C76183a((byte) 0);
        this.f171143c = aVar;
        AbstractC89172b<? super C76183a, C89391z> bVar = eVar.f169730f;
        if (bVar != null) {
            bVar.invoke(aVar);
        }
        Context context = viewGroup.getContext();
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.aal, viewGroup, true);
        C89219l.m154716b(a, "");
        this.f171148h = a;
        View findViewById = a.findViewById(R.id.bti);
        findViewById.setFocusable(true);
        findViewById.setContentDescription(context.getString(R.string.fch));
        View findViewById2 = viewGroup.findViewById(R.id.bwm);
        C89219l.m154716b(findViewById2, "");
        ImageView imageView = (ImageView) findViewById2;
        this.f171141a = imageView;
        C89219l.m154716b(context, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        TextView textView = (TextView) viewGroup.findViewById(R.id.ex1);
        if (textView != null) {
            AbstractC89172b<? super TextView, C89391z> bVar2 = aVar.f171149a;
            if (bVar2 != null) {
                bVar2.invoke(textView);
            }
        } else {
            textView = null;
        }
        this.f171147g = textView;
        boolean z2 = eVar.f169726b;
        TextView textView2 = this.f171147g;
        if (textView2 != null) {
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            textView2.setVisibility(i);
        }
        View findViewById3 = a.findViewById(R.id.bti);
        C89219l.m154716b(findViewById3, "");
        findViewById3.setVisibility(0);
        imageView.setOnClickListener(new View$OnClickListenerC76186d(this, context));
        imageView.setImageResource(eVar.f169729e);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (eVar.f169725a > 0) {
            marginLayoutParams.topMargin = eVar.f169725a;
        }
        marginLayoutParams.topMargin += C70636dh.m124833c(context);
        m133613b(z);
    }
}
