package com.p2082ss.android.ugc.aweme.find.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.find.viewmodel.FindFriendsState;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51506b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder */
public final class FindFriendsHeaderViewHolder extends FindFriendsBaseViewHolder implements AbstractC33974au {

    /* renamed from: c */
    public List<Integer> f117643c;

    /* renamed from: d */
    public final ViewGroup f117644d;

    /* renamed from: e */
    public final View f117645e;

    static {
        Covode.recordClassIndex(60175);
    }

    @Override // com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsBaseViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: b */
    public final void mo86329b() {
        withState(this.f117639a, new C51004g(this));
    }

    /* renamed from: c */
    public final void mo86330c() {
        this.f117639a.mo86374b(101);
        C51488a.m95912a("find_friends_page");
    }

    /* renamed from: d */
    public final void mo86331d() {
        this.f117639a.mo86374b(103);
        C51488a.m95921a("contact", this.f117639a.f117700c, C51506b.m95979b());
    }

    /* renamed from: e */
    public final void mo86332e() {
        this.f117639a.mo86374b(102);
        C51488a.m95921a("facebook", this.f117639a.f117700c, m95405a());
        C51488a.m95938d();
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder$a */
    static final class View$OnClickListenerC50998a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsHeaderViewHolder f117648a;

        /* renamed from: b */
        final /* synthetic */ int f117649b;

        /* renamed from: c */
        final /* synthetic */ View f117650c;

        static {
            Covode.recordClassIndex(60178);
        }

        View$OnClickListenerC50998a(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i, View view) {
            this.f117648a = findFriendsHeaderViewHolder;
            this.f117649b = i;
            this.f117650c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117648a.mo86330c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder$b */
    static final class View$OnClickListenerC50999b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsHeaderViewHolder f117651a;

        /* renamed from: b */
        final /* synthetic */ int f117652b;

        /* renamed from: c */
        final /* synthetic */ View f117653c;

        static {
            Covode.recordClassIndex(60179);
        }

        View$OnClickListenerC50999b(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i, View view) {
            this.f117651a = findFriendsHeaderViewHolder;
            this.f117652b = i;
            this.f117653c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117651a.mo86330c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder$c */
    static final class View$OnClickListenerC51000c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsHeaderViewHolder f117654a;

        /* renamed from: b */
        final /* synthetic */ int f117655b;

        /* renamed from: c */
        final /* synthetic */ View f117656c;

        static {
            Covode.recordClassIndex(60180);
        }

        View$OnClickListenerC51000c(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i, View view) {
            this.f117654a = findFriendsHeaderViewHolder;
            this.f117655b = i;
            this.f117656c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117654a.mo86331d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder$d */
    static final class View$OnClickListenerC51001d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsHeaderViewHolder f117657a;

        /* renamed from: b */
        final /* synthetic */ int f117658b;

        /* renamed from: c */
        final /* synthetic */ View f117659c;

        static {
            Covode.recordClassIndex(60181);
        }

        View$OnClickListenerC51001d(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i, View view) {
            this.f117657a = findFriendsHeaderViewHolder;
            this.f117658b = i;
            this.f117659c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117657a.mo86331d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder$e */
    static final class View$OnClickListenerC51002e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsHeaderViewHolder f117660a;

        /* renamed from: b */
        final /* synthetic */ int f117661b;

        /* renamed from: c */
        final /* synthetic */ View f117662c;

        static {
            Covode.recordClassIndex(60182);
        }

        View$OnClickListenerC51002e(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i, View view) {
            this.f117660a = findFriendsHeaderViewHolder;
            this.f117661b = i;
            this.f117662c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117660a.mo86332e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder$f */
    static final class View$OnClickListenerC51003f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FindFriendsHeaderViewHolder f117663a;

        /* renamed from: b */
        final /* synthetic */ int f117664b;

        /* renamed from: c */
        final /* synthetic */ View f117665c;

        static {
            Covode.recordClassIndex(60183);
        }

        View$OnClickListenerC51003f(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder, int i, View view) {
            this.f117663a = findFriendsHeaderViewHolder;
            this.f117664b = i;
            this.f117665c = view;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f117663a.mo86332e();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ FindFriendsHeaderViewHolder(android.view.ViewGroup r4) {
        /*
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131559489(0x7f0d0441, float:1.8744323E38)
            r0 = 0
            android.view.View r1 = com.C1764a.m5927a(r2, r1, r4, r0)
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r0)
            r3.<init>(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder$g */
    public static final class C51004g extends AbstractC89220m implements AbstractC89172b<FindFriendsState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FindFriendsHeaderViewHolder f117666a;

        static {
            Covode.recordClassIndex(60184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51004g(FindFriendsHeaderViewHolder findFriendsHeaderViewHolder) {
            super(1);
            this.f117666a = findFriendsHeaderViewHolder;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FindFriendsState findFriendsState) {
            FindFriendsState findFriendsState2 = findFriendsState;
            C89219l.m154721d(findFriendsState2, "");
            if (findFriendsState2.getChannels().size() != this.f117666a.f117643c.size()) {
                this.f117666a.f117643c = findFriendsState2.getChannels();
                this.f117666a.mo86329b();
            }
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FindFriendsHeaderViewHolder(ViewGroup viewGroup, View view) {
        super(view);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        this.f117644d = viewGroup;
        this.f117645e = view;
        this.f117643c = C89086z.INSTANCE;
        this.f117640b.getLifecycle().mo4012a(this);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder.View$OnAttachStateChangeListenerC509961 */

            /* renamed from: a */
            final /* synthetic */ FindFriendsHeaderViewHolder f117646a;

            static {
                Covode.recordClassIndex(60176);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f117646a = r1;
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f117646a.f117639a.mo86373a(true);
            }

            public final void onViewAttachedToWindow(View view) {
                this.f117646a.f117639a.mo86373a(false);
                Iterator<T> it = this.f117646a.f117643c.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    if (intValue == 0) {
                        C51488a.m95935c();
                    } else if (intValue == 1) {
                        C51488a.m95931b("contact", this.f117646a.f117639a.f117700c, C51506b.m95979b());
                    } else if (intValue == 2) {
                        C51488a.m95931b("facebook", this.f117646a.f117639a.f117700c, FindFriendsHeaderViewHolder.m95405a());
                    }
                }
            }
        });
        mo86329b();
        AbstractC88412b unused = selectSubscribe(this.f117639a, C51019a.f117694a, new C20370ah(), new AbstractC89183m<AbstractC20477i, List<? extends Integer>, C89391z>(this) {
            /* class com.p2082ss.android.ugc.aweme.find.viewholder.FindFriendsHeaderViewHolder.C509972 */

            /* renamed from: a */
            final /* synthetic */ FindFriendsHeaderViewHolder f117647a;

            static {
                Covode.recordClassIndex(60177);
            }

            {
                this.f117647a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: java.util.List<? extends java.lang.Integer> */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Integer> list) {
                MethodCollector.m26663i(14165);
                List<? extends Integer> list2 = list;
                C89219l.m154721d(iVar, "");
                C89219l.m154721d(list2, "");
                this.f117647a.f117643c = list2;
                FindFriendsHeaderViewHolder findFriendsHeaderViewHolder = this.f117647a;
                ((LinearLayout) findFriendsHeaderViewHolder.f117645e.findViewById(R.id.a3z)).removeAllViews();
                Iterator<T> it = findFriendsHeaderViewHolder.f117643c.iterator();
                while (it.hasNext()) {
                    int intValue = it.next().intValue();
                    View a = C1764a.m5927a(LayoutInflater.from(findFriendsHeaderViewHolder.f117644d.getContext()), R.layout.a2c, findFriendsHeaderViewHolder.f117644d, false);
                    C89219l.m154716b(a, "");
                    View view = findFriendsHeaderViewHolder.f117645e;
                    if (intValue == 0) {
                        ((TuxIconView) a.findViewById(R.id.bky)).setIconRes(R.raw.icon_color_invitation_circle);
                        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.title);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setText(view.getResources().getString(R.string.cnh));
                        TuxTextView tuxTextView2 = (TuxTextView) a.findViewById(R.id.ajd);
                        C89219l.m154716b(tuxTextView2, "");
                        tuxTextView2.setText(view.getResources().getString(R.string.b63));
                        TuxButton tuxButton = (TuxButton) a.findViewById(R.id.button);
                        C89219l.m154716b(tuxButton, "");
                        tuxButton.setText(view.getResources().getString(R.string.cnk));
                        a.setOnClickListener(new View$OnClickListenerC50998a(findFriendsHeaderViewHolder, intValue, a));
                        ((TuxButton) a.findViewById(R.id.button)).setOnClickListener(new View$OnClickListenerC50999b(findFriendsHeaderViewHolder, intValue, a));
                    } else if (intValue == 1) {
                        ((TuxIconView) a.findViewById(R.id.bky)).setIconRes(R.raw.icon_color_contact_circle);
                        TuxTextView tuxTextView3 = (TuxTextView) a.findViewById(R.id.title);
                        C89219l.m154716b(tuxTextView3, "");
                        tuxTextView3.setText(view.getResources().getString(R.string.at_));
                        TuxTextView tuxTextView4 = (TuxTextView) a.findViewById(R.id.ajd);
                        C89219l.m154716b(tuxTextView4, "");
                        tuxTextView4.setText(view.getResources().getString(R.string.atb));
                        TuxButton tuxButton2 = (TuxButton) a.findViewById(R.id.button);
                        C89219l.m154716b(tuxButton2, "");
                        tuxButton2.setText(view.getResources().getString(R.string.a7e));
                        a.setOnClickListener(new View$OnClickListenerC51000c(findFriendsHeaderViewHolder, intValue, a));
                        ((TuxButton) a.findViewById(R.id.button)).setOnClickListener(new View$OnClickListenerC51001d(findFriendsHeaderViewHolder, intValue, a));
                    } else if (intValue == 2) {
                        ((TuxIconView) a.findViewById(R.id.bky)).setIconRes(R.raw.icon_color_facebook_circle);
                        TuxTextView tuxTextView5 = (TuxTextView) a.findViewById(R.id.title);
                        C89219l.m154716b(tuxTextView5, "");
                        tuxTextView5.setText(view.getResources().getString(R.string.bse));
                        TuxTextView tuxTextView6 = (TuxTextView) a.findViewById(R.id.ajd);
                        C89219l.m154716b(tuxTextView6, "");
                        tuxTextView6.setText(view.getResources().getString(R.string.bsd));
                        TuxButton tuxButton3 = (TuxButton) a.findViewById(R.id.button);
                        C89219l.m154716b(tuxButton3, "");
                        tuxButton3.setText(view.getResources().getString(R.string.a7e));
                        a.setOnClickListener(new View$OnClickListenerC51002e(findFriendsHeaderViewHolder, intValue, a));
                        ((TuxButton) a.findViewById(R.id.button)).setOnClickListener(new View$OnClickListenerC51003f(findFriendsHeaderViewHolder, intValue, a));
                    }
                    ((LinearLayout) findFriendsHeaderViewHolder.f117645e.findViewById(R.id.a3z)).addView(a);
                }
                C89391z zVar = C89391z.f203057a;
                MethodCollector.m26664o(14165);
                return zVar;
            }
        });
    }
}
