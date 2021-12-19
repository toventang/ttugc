package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.C33506b;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.c */
public final class C36381c extends FrameLayout {

    /* renamed from: a */
    public final SmartImageView f86046a;

    /* renamed from: b */
    public final TuxTextView f86047b;

    /* renamed from: c */
    public final View f86048c;

    static {
        Covode.recordClassIndex(43676);
    }

    /* renamed from: a */
    public static boolean m74097a(C60202d dVar) {
        C89219l.m154721d(dVar, "");
        AbstractC60201c cVar = (AbstractC60201c) C89070n.m154583g((List) dVar.f137229a);
        if (cVar == null || cVar.mo97874d() <= 1) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.c$a */
    public static final class View$OnClickListenerC36382a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC60201c f86049a;

        /* renamed from: b */
        final /* synthetic */ C36381c f86050b;

        /* renamed from: c */
        final /* synthetic */ C60202d f86051c;

        static {
            Covode.recordClassIndex(43677);
        }

        public View$OnClickListenerC36382a(AbstractC60201c cVar, C36381c cVar2, C60202d dVar) {
            this.f86049a = cVar;
            this.f86050b = cVar2;
            this.f86051c = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC60201c cVar = this.f86049a;
            C60202d dVar = this.f86051c;
            cVar.mo97892c(C33506b.m68654a(dVar, cVar, C36381c.m74097a(dVar)));
            AbstractC60201c cVar2 = this.f86049a;
            C60202d dVar2 = this.f86051c;
            cVar2.mo97893d(C33506b.m68655b(dVar2, cVar2, C36381c.m74097a(dVar2)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C36381c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8768);
        FrameLayout.inflate(context, R.layout.i0, this);
        View findViewById = findViewById(R.id.jk);
        C89219l.m154716b(findViewById, "");
        this.f86046a = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.jp);
        C89219l.m154716b(findViewById2, "");
        this.f86047b = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.jm);
        C89219l.m154716b(findViewById3, "");
        this.f86048c = findViewById3;
        MethodCollector.m26664o(8768);
    }

    public /* synthetic */ C36381c(Context context, byte b) {
        this(context);
    }
}
