package com.p2082ss.android.ugc.aweme.commercialize.p2535b;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.aweme.base.AnchorListManager;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.p2536a.C37610a;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.b.b */
public final class DialogC37619b extends DialogC26609a {

    /* renamed from: a */
    public RecyclerView f88933a;

    /* renamed from: b */
    public C37610a f88934b;

    /* renamed from: c */
    private View f88935c;

    /* renamed from: d */
    private View f88936d;

    /* renamed from: e */
    private final List<AnchorPublishStruct> f88937e;

    /* renamed from: f */
    private final AbstractC1204m f88938f;

    static {
        Covode.recordClassIndex(45041);
    }

    public final void show() {
        setOnShowListener(DialogInterface$OnShowListenerC37622c.f88942a);
        super.show();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.b$a */
    static final class RunnableC37620a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ DialogC37619b f88939a;

        /* renamed from: b */
        final /* synthetic */ int f88940b;

        static {
            Covode.recordClassIndex(45042);
        }

        RunnableC37620a(DialogC37619b bVar, int i) {
            this.f88939a = bVar;
            this.f88940b = i;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            RecyclerView recyclerView = this.f88939a.f88933a;
            if (recyclerView != null) {
                recyclerView.setVerticalScrollBarEnabled(true);
            }
            RecyclerView recyclerView2 = this.f88939a.f88933a;
            if (recyclerView2 != null) {
                recyclerView2.setScrollBarSize((int) C13628n.m24520b(this.f88939a.getContext(), 4.0f));
            }
            RecyclerView recyclerView3 = this.f88939a.f88933a;
            if (recyclerView3 == null) {
                C89219l.m154715b();
            }
            if (recyclerView3.getHeight() > this.f88940b / 2) {
                RecyclerView recyclerView4 = this.f88939a.f88933a;
                if (recyclerView4 != null) {
                    layoutParams = recyclerView4.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = this.f88940b / 2;
                RecyclerView recyclerView5 = this.f88939a.f88933a;
                if (recyclerView5 != null) {
                    recyclerView5.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public final void dismiss() {
        RecyclerView.AbstractC1362i iVar;
        RecyclerView recyclerView = this.f88933a;
        if (recyclerView != null) {
            iVar = recyclerView.getLayoutManager();
        } else {
            iVar = null;
        }
        Objects.requireNonNull(iVar, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        List<AnchorPublishStruct> subList = this.f88937e.subList(0, ((LinearLayoutManager) iVar).mo4373m() + 1);
        ArrayList arrayList = new ArrayList();
        for (T t : subList) {
            if (t.isNew) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            AnchorListManager.m70429a(arrayList2);
        }
        super.dismiss();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.b$b */
    static final class View$OnClickListenerC37621b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC37619b f88941a;

        static {
            Covode.recordClassIndex(45043);
        }

        View$OnClickListenerC37621b(DialogC37619b bVar) {
            this.f88941a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88941a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.b.b$c */
    static final class DialogInterface$OnShowListenerC37622c implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public static final DialogInterface$OnShowListenerC37622c f88942a = new DialogInterface$OnShowListenerC37622c();

        static {
            Covode.recordClassIndex(45044);
        }

        DialogInterface$OnShowListenerC37622c() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
            FrameLayout frameLayout = (FrameLayout) ((DialogC26609a) dialogInterface).findViewById(R.id.ajx);
            if (frameLayout != null) {
                BottomSheetBehavior a = BottomSheetBehavior.m52754a(frameLayout);
                C89219l.m154716b(a, "");
                a.mo43976b(frameLayout.getHeight());
                a.f62895i = true;
            }
        }
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.adw);
        this.f88935c = findViewById(R.id.bu7);
        this.f88933a = (RecyclerView) findViewById(R.id.je);
        this.f88936d = findViewById(R.id.dnb);
        RecyclerView recyclerView = this.f88933a;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            recyclerView.setLayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        int b = C13628n.m24521b(getContext()) - C13628n.m24525e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                i = -1;
            } else {
                i = b;
            }
            window.setLayout(-1, i);
            window.setGravity(80);
            Window window2 = getWindow();
            if (window2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(window2, "");
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.gravity = 80;
            Window window3 = getWindow();
            if (window3 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(window3, "");
            window3.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        RecyclerView recyclerView2 = this.f88933a;
        if (recyclerView2 != null) {
            recyclerView2.post(new RunnableC37620a(this, b));
        }
        RecyclerView recyclerView3 = this.f88933a;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        C37610a aVar = new C37610a(this.f88937e, this.f88938f);
        this.f88934b = aVar;
        RecyclerView recyclerView4 = this.f88933a;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(aVar);
        }
        View view = this.f88935c;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC37621b(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC37619b(Context context, List<AnchorPublishStruct> list, AbstractC1204m mVar) {
        super(context, R.style.wg);
        C89219l.m154721d(context, "");
        C89219l.m154721d(list, "");
        C89219l.m154721d(mVar, "");
        this.f88937e = list;
        this.f88938f = mVar;
    }
}
