package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70151a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70438d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView */
public final class StickPointMusicView extends FrameLayout implements AbstractC70498b {

    /* renamed from: a */
    public AbstractC70438d f157524a;

    /* renamed from: b */
    private View f157525b;

    /* renamed from: c */
    private RecyclerView f157526c;

    /* renamed from: d */
    private View f157527d;

    /* renamed from: e */
    private View f157528e;

    /* renamed from: f */
    private View f157529f;

    /* renamed from: g */
    private View f157530g;

    static {
        Covode.recordClassIndex(82936);
    }

    public StickPointMusicView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    /* renamed from: d */
    public final View mo111065d() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    /* renamed from: a */
    public final void mo111061a() {
        View view = this.f157529f;
        if (view == null) {
            C89219l.m154710a("loadingView");
        }
        view.setVisibility(0);
        View view2 = this.f157530g;
        if (view2 == null) {
            C89219l.m154710a("contentView");
        }
        view2.setVisibility(8);
        View view3 = this.f157527d;
        if (view3 == null) {
            C89219l.m154710a("noDataView");
        }
        view3.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    /* renamed from: b */
    public final void mo111063b() {
        View view = this.f157530g;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        view.setVisibility(0);
        View view2 = this.f157529f;
        if (view2 == null) {
            C89219l.m154710a("loadingView");
        }
        view2.setVisibility(8);
        View view3 = this.f157527d;
        if (view3 == null) {
            C89219l.m154710a("noDataView");
        }
        view3.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    /* renamed from: c */
    public final void mo111064c() {
        View view = this.f157527d;
        if (view == null) {
            C89219l.m154710a("noDataView");
        }
        view.setVisibility(0);
        View view2 = this.f157530g;
        if (view2 == null) {
            C89219l.m154710a("contentView");
        }
        view2.setVisibility(8);
        View view3 = this.f157529f;
        if (view3 == null) {
            C89219l.m154710a("loadingView");
        }
        view3.setVisibility(8);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    public final void setStickPointMusicListener(AbstractC70438d dVar) {
        C89219l.m154721d(dVar, "");
        this.f157524a = dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$a */
    final class C70490a extends LinearLayoutManager {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f157531a;

        static {
            Covode.recordClassIndex(82937);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$a$a */
        final class C70491a extends C1481r {

            /* renamed from: f */
            final /* synthetic */ C70490a f157532f;

            static {
                Covode.recordClassIndex(82938);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final float mo4862a(DisplayMetrics displayMetrics) {
                C89219l.m154721d(displayMetrics, "");
                return 150.0f / ((float) displayMetrics.densityDpi);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C70491a(C70490a aVar, Context context) {
                super(context);
                C89219l.m154721d(context, "");
                this.f157532f = aVar;
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final int mo5011a(int i, int i2, int i3, int i4, int i5) {
                return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
            }
        }

        public C70490a(StickPointMusicView stickPointMusicView, Context context) {
            C89219l.m154721d(context, "");
            this.f157531a = stickPointMusicView;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
        /* renamed from: a */
        public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
            C89219l.m154721d(recyclerView, "");
            Context context = recyclerView.getContext();
            C89219l.m154716b(context, "");
            C70491a aVar = new C70491a(this, context);
            aVar.f4515g = i;
            mo4695a(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    /* renamed from: a */
    public final void mo111062a(int i) {
        RecyclerView recyclerView = this.f157526c;
        if (recyclerView == null) {
            C89219l.m154710a("musicRecyleView");
        }
        recyclerView.mo4435d(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    public final void setCollectMusicCallback(AbstractC70151a aVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$b */
    static final class View$OnClickListenerC70492b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f157533a;

        static {
            Covode.recordClassIndex(82939);
        }

        View$OnClickListenerC70492b(StickPointMusicView stickPointMusicView) {
            this.f157533a = stickPointMusicView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC70438d dVar = this.f157533a.f157524a;
            if (dVar != null) {
                C89219l.m154716b(view, "");
                dVar.mo110923a(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.StickPointMusicView$c */
    static final class View$OnClickListenerC70493c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ StickPointMusicView f157534a;

        static {
            Covode.recordClassIndex(82940);
        }

        View$OnClickListenerC70493c(StickPointMusicView stickPointMusicView) {
            this.f157534a = stickPointMusicView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC70438d dVar = this.f157534a.f157524a;
            if (dVar != null) {
                C89219l.m154716b(view, "");
                dVar.mo110924b(view);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    public final void setRecyclerViewAdapter(AbstractC63154aa.AbstractC63163h hVar) {
        C89219l.m154721d(hVar, "");
        RecyclerView recyclerView = this.f157526c;
        if (recyclerView == null) {
            C89219l.m154710a("musicRecyleView");
        }
        recyclerView.setAdapter(hVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.AbstractC70498b
    public final void setButtonClickable(boolean z) {
        if (this.f157525b == null) {
            C89219l.m154710a("rootContentView");
            return;
        }
        View view = this.f157525b;
        if (view == null) {
            C89219l.m154710a("rootContentView");
        }
        View findViewById = view.findViewById(R.id.a3x);
        C89219l.m154716b(findViewById, "");
        findViewById.setClickable(z);
    }

    private /* synthetic */ StickPointMusicView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StickPointMusicView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11980);
        View inflate = LayoutInflater.from(context).inflate(R.layout.ai7, this);
        C89219l.m154716b(inflate, "");
        this.f157525b = inflate;
        if (inflate == null) {
            C89219l.m154710a("rootContentView");
        }
        View findViewById = inflate.findViewById(R.id.ade);
        C89219l.m154716b(findViewById, "");
        this.f157530g = findViewById;
        View view = this.f157525b;
        if (view == null) {
            C89219l.m154710a("rootContentView");
        }
        View findViewById2 = view.findViewById(R.id.csr);
        C89219l.m154716b(findViewById2, "");
        this.f157527d = findViewById2;
        View view2 = this.f157525b;
        if (view2 == null) {
            C89219l.m154710a("rootContentView");
        }
        View findViewById3 = view2.findViewById(R.id.djf);
        C89219l.m154716b(findViewById3, "");
        this.f157528e = findViewById3;
        View view3 = this.f157525b;
        if (view3 == null) {
            C89219l.m154710a("rootContentView");
        }
        View findViewById4 = view3.findViewById(R.id.cg3);
        C89219l.m154716b(findViewById4, "");
        this.f157529f = findViewById4;
        View view4 = this.f157525b;
        if (view4 == null) {
            C89219l.m154710a("rootContentView");
        }
        View findViewById5 = view4.findViewById(R.id.co7);
        C89219l.m154716b(findViewById5, "");
        this.f157526c = (RecyclerView) findViewById5;
        C70490a aVar = new C70490a(this, context);
        aVar.mo4356b(0);
        RecyclerView recyclerView = this.f157526c;
        if (recyclerView == null) {
            C89219l.m154710a("musicRecyleView");
        }
        recyclerView.setLayoutManager(aVar);
        View view5 = this.f157525b;
        if (view5 == null) {
            C89219l.m154710a("rootContentView");
        }
        view5.findViewById(R.id.a3x).setOnClickListener(new View$OnClickListenerC70492b(this));
        View view6 = this.f157528e;
        if (view6 == null) {
            C89219l.m154710a("retryView");
        }
        view6.setOnClickListener(new View$OnClickListenerC70493c(this));
        MethodCollector.m26664o(11980);
    }
}
