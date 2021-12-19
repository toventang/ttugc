package com.p2082ss.android.ugc.aweme.profile.p3576ui.widget;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.assem.C63444a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.o */
public final class C64382o extends Fragment {

    /* renamed from: e */
    public static final int f145980e = 9;

    /* renamed from: f */
    public static final C64383a f145981f = new C64383a((byte) 0);

    /* renamed from: a */
    public String f145982a;

    /* renamed from: b */
    public String f145983b;

    /* renamed from: c */
    public ViewGroup f145984c;

    /* renamed from: d */
    public final C64347a f145985d = new C64347a(this.f145982a, this.f145983b);

    /* renamed from: g */
    private View f145986g;

    /* renamed from: h */
    private SparseArray f145987h;

    /* renamed from: a */
    public final View mo103931a(int i) {
        if (this.f145987h == null) {
            this.f145987h = new SparseArray();
        }
        View view = (View) this.f145987h.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145987h.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.o$a */
    public static final class C64383a {
        static {
            Covode.recordClassIndex(75837);
        }

        private C64383a() {
        }

        public /* synthetic */ C64383a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.o$d */
    static final class RunnableC64388d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C64382o f145992a;

        static {
            Covode.recordClassIndex(75842);
        }

        RunnableC64388d(C64382o oVar) {
            this.f145992a = oVar;
        }

        public final void run() {
            ViewGroup viewGroup = this.f145992a.f145984c;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo103932a() {
        AbstractC0952i supportFragmentManager;
        ActivityC0945e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.mo3562c();
        }
    }

    static {
        Covode.recordClassIndex(75836);
    }

    public C64382o() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        User curUser = g.getCurUser();
        C89219l.m154716b(curUser, "");
        this.f145982a = curUser.getUid();
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        User curUser2 = g2.getCurUser();
        C89219l.m154716b(curUser2, "");
        this.f145983b = curUser2.getSecUid();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ViewGroup publishAddVideoContainer = AVExternalServiceImpl.m113114a().publishService().getPublishAddVideoContainer(getActivity());
        this.f145984c = publishAddVideoContainer;
        if (publishAddVideoContainer != null) {
            publishAddVideoContainer.postDelayed(new RunnableC64388d(this), 300);
        }
        AVExternalServiceImpl.m113114a().publishService().setDestroyFlag(getActivity());
        SparseArray sparseArray = this.f145987h;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.o$b */
    static final class View$OnClickListenerC64384b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C64382o f145988a;

        static {
            Covode.recordClassIndex(75838);
        }

        View$OnClickListenerC64384b(C64382o oVar) {
            this.f145988a = oVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145988a.mo103932a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.o$c */
    static final class C64385c extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64382o f145989a;

        static {
            Covode.recordClassIndex(75839);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64385c(C64382o oVar) {
            super(1);
            this.f145989a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f145989a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64382o.C64385c.C643861 */

                /* renamed from: a */
                final /* synthetic */ C64385c f145990a;

                static {
                    Covode.recordClassIndex(75840);
                }

                {
                    this.f145990a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    iVar2.mo20617a(new C64349c(this.f145990a.f145989a.f145982a, this.f145990a.f145989a.f145983b, this.f145990a.f145989a));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145989a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64382o.C64385c.C643872 */

                /* renamed from: a */
                final /* synthetic */ C64385c f145991a;

                static {
                    Covode.recordClassIndex(75841);
                }

                {
                    this.f145991a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C63444a.class));
                    qVar2.f31050b = new C63444a();
                    qVar2.f31053e = (LinearLayout) this.f145991a.f145989a.mo103931a(R.id.c_6);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) mo103931a(R.id.a6w);
        this.f145986g = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC64384b(this));
        }
        C12780d.m23005a(this, new C64385c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ang, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == f145980e && i2 == -1) {
            AVExternalServiceImpl.m113114a().publishService().addMyVideoChain(getActivity(), this.f145985d.f145875a, this.f145985d.f145876b, this.f145985d.f145879e, this.f145985d.f145877c, this.f145985d.f145878d, "click_preview", this.f145985d.f145880f, this.f145985d.f145881g);
            mo103932a();
            ViewGroup viewGroup = this.f145984c;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
    }
}
