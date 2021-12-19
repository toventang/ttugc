package com.p2082ss.android.ugc.aweme.discover.alading.p2764a;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80284by;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.a.b */
public final class C41811b extends RecyclerView.ViewHolder {

    /* renamed from: i */
    static final float f97530i = C80284by.m139183a(2);

    /* renamed from: j */
    public static final C41812a f97531j = new C41812a((byte) 0);

    /* renamed from: a */
    View f97532a;

    /* renamed from: b */
    SmartImageView f97533b;

    /* renamed from: c */
    TextView f97534c;

    /* renamed from: d */
    TextView f97535d;

    /* renamed from: e */
    View f97536e;

    /* renamed from: f */
    boolean f97537f;

    /* renamed from: g */
    Aweme f97538g;

    /* renamed from: h */
    public final AbstractC89187q<View, Integer, Aweme, C89391z> f97539h;

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.b$a */
    public static final class C41812a {
        static {
            Covode.recordClassIndex(49728);
        }

        private C41812a() {
        }

        public /* synthetic */ C41812a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.b$b */
    static final class View$OnClickListenerC41813b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41811b f97540a;

        /* renamed from: b */
        final /* synthetic */ Aweme f97541b;

        static {
            Covode.recordClassIndex(49729);
        }

        View$OnClickListenerC41813b(C41811b bVar, Aweme aweme) {
            this.f97540a = bVar;
            this.f97541b = aweme;
        }

        /* renamed from: a */
        private static boolean m83763a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                View view2 = this.f97540a.itemView;
                C89219l.m154716b(view2, "");
                view2.getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m83763a();
                }
                if (!C58029j.f132256h) {
                    View view3 = this.f97540a.itemView;
                    C89219l.m154716b(view3, "");
                    new C79459a(view3.getContext()).mo123050a(R.string.dcq).mo123053a();
                    return;
                }
                C41806a.f97519f = this.f97541b.getAid();
                AbstractC89187q<View, Integer, Aweme, C89391z> qVar = this.f97540a.f97539h;
                if (qVar != null) {
                    C89219l.m154716b(view, "");
                    qVar.invoke(view, Integer.valueOf(this.f97540a.getAdapterPosition()), this.f97541b);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(49727);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.q<? super android.view.View, ? super java.lang.Integer, ? super com.ss.android.ugc.aweme.feed.model.Aweme, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41811b(View view, AbstractC89187q<? super View, ? super Integer, ? super Aweme, C89391z> qVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97539h = qVar;
        this.f97532a = view;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(R.id.afn);
        C89219l.m154716b(linearGradientDraweeView, "");
        this.f97533b = linearGradientDraweeView;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c8p);
        C89219l.m154716b(tuxTextView, "");
        this.f97534c = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.crw);
        C89219l.m154716b(tuxTextView2, "");
        this.f97535d = tuxTextView2;
        View findViewById = view.findViewById(R.id.fd4);
        C89219l.m154716b(findViewById, "");
        this.f97536e = findViewById;
        this.f97537f = C80471gb.m139483a(view.getContext());
    }
}
