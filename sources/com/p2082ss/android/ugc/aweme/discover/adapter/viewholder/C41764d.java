package com.p2082ss.android.ugc.aweme.discover.adapter.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractView$OnClickListenerC42302e;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.discover.widget.DialogC43041d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d */
public final class C41764d extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final C41765a f97432b = new C41765a((byte) 0);

    /* renamed from: a */
    public AbstractC42664al.AbstractC42666b f97433a;

    static {
        Covode.recordClassIndex(49679);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$a */
    public static final class C41765a {
        static {
            Covode.recordClassIndex(49680);
        }

        private C41765a() {
        }

        public /* synthetic */ C41765a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$b */
    public static final class C41766b extends AbstractView$OnClickListenerC42302e {

        /* renamed from: a */
        final /* synthetic */ C41764d f97434a;

        /* renamed from: b */
        final /* synthetic */ AbstractC42664al.AbstractC42666b f97435b;

        static {
            Covode.recordClassIndex(49681);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractView$OnClickListenerC42302e
        /* renamed from: a */
        public final void mo70821a() {
            AbstractC42664al.AbstractC42666b bVar;
            if (this.f97434a.f97433a != null && (bVar = this.f97435b) != null) {
                bVar.mo72863b();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41766b(C41764d dVar, AbstractC42664al.AbstractC42666b bVar) {
            super((byte) 0);
            this.f97434a = dVar;
            this.f97435b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$c */
    public static final class C41767c extends AbstractView$OnClickListenerC42302e {

        /* renamed from: a */
        final /* synthetic */ C41764d f97436a;

        static {
            Covode.recordClassIndex(49682);
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractView$OnClickListenerC42302e
        /* renamed from: a */
        public final void mo70821a() {
            if (this.f97436a.f97433a != null) {
                View view = this.f97436a.itemView;
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                DialogC43041d dVar = new DialogC43041d(context);
                View view2 = this.f97436a.itemView;
                C89219l.m154716b(view2, "");
                String string = view2.getContext().getString(R.string.ffx);
                C89219l.m154716b(string, "");
                DialogC43041d c = dVar.mo73238c(string);
                View view3 = this.f97436a.itemView;
                C89219l.m154716b(view3, "");
                String string2 = view3.getContext().getString(R.string.ffy);
                C89219l.m154716b(string2, "");
                DialogC43041d d = c.mo73239d(string2);
                View view4 = this.f97436a.itemView;
                C89219l.m154716b(view4, "");
                String string3 = view4.getContext().getString(R.string.ffv);
                C89219l.m154716b(string3, "");
                DialogC43041d a = d.mo73236a(string3);
                View view5 = this.f97436a.itemView;
                C89219l.m154716b(view5, "");
                String string4 = view5.getContext().getString(R.string.ffw);
                C89219l.m154716b(string4, "");
                DialogC43041d b = a.mo73237b(string4);
                b.show();
                TextView textView = b.f100340a;
                TextView textView2 = b.f100341b;
                if (textView != null) {
                    textView.setOnClickListener(new View$OnClickListenerC41768a(b));
                }
                if (textView2 != null) {
                    textView2.setOnClickListener(new View$OnClickListenerC41769b(this, b));
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41767c(C41764d dVar) {
            super((byte) 0);
            this.f97436a = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$c$a */
        static final class View$OnClickListenerC41768a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ DialogC43041d f97437a;

            static {
                Covode.recordClassIndex(49683);
            }

            View$OnClickListenerC41768a(DialogC43041d dVar) {
                this.f97437a = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f97437a.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$c$b */
        static final class View$OnClickListenerC41769b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C41767c f97438a;

            /* renamed from: b */
            final /* synthetic */ DialogC43041d f97439b;

            static {
                Covode.recordClassIndex(49684);
            }

            View$OnClickListenerC41769b(C41767c cVar, DialogC43041d dVar) {
                this.f97438a = cVar;
                this.f97439b = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC42664al.AbstractC42666b bVar = this.f97438a.f97436a.f97433a;
                if (bVar != null) {
                    bVar.mo72863b();
                }
                this.f97439b.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41764d(View view, AbstractC42664al.AbstractC42666b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97433a = bVar;
        this.itemView.setOnClickListener(new C41766b(this, bVar));
        this.itemView.setOnClickListener(new C41767c(this));
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.a6a);
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(42);
        }
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            layoutParams.height = (int) C13628n.m24520b(view3.getContext(), 40.0f);
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            view4.setLayoutParams(layoutParams);
        }
    }
}
