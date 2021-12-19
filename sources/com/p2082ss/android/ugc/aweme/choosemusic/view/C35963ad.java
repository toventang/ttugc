package com.p2082ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.content.C0643b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.AbstractC35717k;
import com.p2082ss.android.ugc.aweme.choosemusic.p2461a.C35719m;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ad */
public final class C35963ad extends PopupWindow {

    /* renamed from: a */
    public C35719m f84890a;

    /* renamed from: b */
    private RecyclerView f84891b;

    /* renamed from: c */
    private View f84892c;

    /* renamed from: d */
    private final Context f84893d;

    /* renamed from: e */
    private final AbstractC35717k f84894e;

    static {
        Covode.recordClassIndex(43209);
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ad$a */
    static final class View$OnClickListenerC35964a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35963ad f84895a;

        static {
            Covode.recordClassIndex(43210);
        }

        View$OnClickListenerC35964a(C35963ad adVar) {
            this.f84895a = adVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f84895a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35963ad(Context context, AbstractC35717k kVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(kVar, "");
        this.f84893d = context;
        this.f84894e = kVar;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b2o, null, false);
        setContentView(a);
        View findViewById = a.findViewById(R.id.edn);
        C89219l.m154716b(findViewById, "");
        this.f84891b = (RecyclerView) findViewById;
        View findViewById2 = a.findViewById(R.id.sw);
        C89219l.m154716b(findViewById2, "");
        this.f84892c = findViewById2;
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(context, R.color.c9)));
        setFocusable(true);
        setAnimationStyle(R.style.a1e);
        View view = this.f84892c;
        if (view == null) {
            C89219l.m154710a("mBlankView");
        }
        view.setOnClickListener(new View$OnClickListenerC35964a(this));
        RecyclerView recyclerView = this.f84891b;
        if (recyclerView == null) {
            C89219l.m154710a("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        C35719m mVar = new C35719m(kVar);
        this.f84890a = mVar;
        mVar.mo67829d(false);
        RecyclerView recyclerView2 = this.f84891b;
        if (recyclerView2 == null) {
            C89219l.m154710a("mRecyclerView");
        }
        C35719m mVar2 = this.f84890a;
        if (mVar2 == null) {
            C89219l.m154710a("mAdapter");
        }
        recyclerView2.setAdapter(mVar2);
    }
}
