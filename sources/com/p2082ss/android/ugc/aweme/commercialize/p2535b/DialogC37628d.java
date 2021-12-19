package com.p2082ss.android.ugc.aweme.commercialize.p2535b;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a.C37612c;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.d */
public final class DialogC37628d extends DialogC26609a {

    /* renamed from: a */
    public final List<WikipediaInfo> f88952a;

    /* renamed from: b */
    public final AbstractC89172b<WikipediaInfo, C89391z> f88953b;

    /* renamed from: c */
    public final AbstractC89171a<C89391z> f88954c;

    /* renamed from: d */
    private final Map<String, String> f88955d;

    static {
        Covode.recordClassIndex(45050);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.d$c */
    static final class DialogInterface$OnCancelListenerC37631c implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ DialogC37628d f88958a;

        static {
            Covode.recordClassIndex(45053);
        }

        DialogInterface$OnCancelListenerC37631c(DialogC37628d dVar) {
            this.f88958a = dVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            AbstractC89171a<C89391z> aVar = this.f88958a.f88954c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.d$a */
    static final class C37629a extends AbstractC89220m implements AbstractC89172b<WikipediaInfo, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DialogC37628d f88956a;

        static {
            Covode.recordClassIndex(45051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37629a(DialogC37628d dVar) {
            super(1);
            this.f88956a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(WikipediaInfo wikipediaInfo) {
            C89219l.m154721d(wikipediaInfo, "");
            AbstractC89172b<WikipediaInfo, C89391z> bVar = this.f88956a.f88953b;
            if (bVar != null) {
                bVar.invoke(wikipediaInfo);
            }
            this.f88956a.dismiss();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.d$b */
    static final class View$OnClickListenerC37630b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC37628d f88957a;

        static {
            Covode.recordClassIndex(45052);
        }

        View$OnClickListenerC37630b(DialogC37628d dVar) {
            this.f88957a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88957a.dismiss();
            AbstractC89171a<C89391z> aVar = this.f88957a.f88954c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ady);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.do0);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new C37612c(this.f88952a, this.f88955d, new C37629a(this)));
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.f88952a.size() > 7) {
            marginLayoutParams.height = (int) C13628n.m24520b(recyclerView.getContext(), 422.0f);
        } else if (this.f88952a.size() <= 4) {
            marginLayoutParams.height = (int) C13628n.m24520b(recyclerView.getContext(), 250.0f);
            recyclerView.setPadding(0, 0, 0, 0);
        } else {
            marginLayoutParams.height = -2;
        }
        recyclerView.setLayoutParams(marginLayoutParams);
        ((ImageView) findViewById(R.id.bsg)).setOnClickListener(new View$OnClickListenerC37630b(this));
        int b = C13628n.m24521b(getContext()) - C13628n.m24525e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        setOnCancelListener(new DialogInterface$OnCancelListenerC37631c(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.feed.model.WikipediaInfo, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC37628d(Context context, List<WikipediaInfo> list, Map<String, String> map, AbstractC89172b<? super WikipediaInfo, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        super(context, R.style.wg);
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(map, "");
        this.f88952a = list;
        this.f88955d = map;
        this.f88953b = bVar;
        this.f88954c = aVar;
    }
}
