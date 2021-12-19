package com.p2082ss.android.ugc.aweme.find.p2992ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.ui.f */
public final class C50993f extends FrameLayout {

    /* renamed from: a */
    private final View f117636a;

    /* renamed from: b */
    private SparseArray f117637b;

    /* renamed from: com.ss.android.ugc.aweme.find.ui.f$a */
    final /* synthetic */ class View$OnClickListenerC50994a implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f117638a;

        static {
            Covode.recordClassIndex(60172);
        }

        View$OnClickListenerC50994a(AbstractC89172b bVar) {
            this.f117638a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            ClickAgent.onClick(view);
            C89219l.m154716b(this.f117638a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(60171);
    }

    /* renamed from: a */
    private View m95404a(int i) {
        if (this.f117637b == null) {
            this.f117637b = new SparseArray();
        }
        View view = (View) this.f117637b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f117637b.put(i, findViewById);
        return findViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.find.ui.f$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setOnClickButtonListener(p4600h.p4611f.p4612a.AbstractC89172b<? super android.view.View, p4600h.C89391z> r3) {
        /*
            r2 = this;
            android.view.View r1 = r2.f117636a
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            r0 = 2131363964(0x7f0a087c, float:1.8347752E38)
            android.view.View r1 = r1.findViewById(r0)
            com.bytedance.tux.button.TuxButton r1 = (com.bytedance.tux.button.TuxButton) r1
            if (r3 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.find.ui.f$a r0 = new com.ss.android.ugc.aweme.find.ui.f$a
            r0.<init>(r3)
            r3 = r0
        L_0x0018:
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r1.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.find.p2992ui.C50993f.setOnClickButtonListener(h.f.a.b):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C50993f(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10839);
        this.f117636a = C1764a.m5927a(LayoutInflater.from(context), R.layout.a2r, this, true);
        Space space = (Space) m95404a(R.id.em1);
        C89219l.m154716b(space, "");
        space.setVisibility(8);
        Space space2 = (Space) m95404a(R.id.ve);
        C89219l.m154716b(space2, "");
        space2.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        MethodCollector.m26664o(10839);
    }

    public /* synthetic */ C50993f(Context context, byte b) {
        this(context);
    }
}
