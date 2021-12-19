package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.tux.navigation.AbstractC23185a;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c */
public final class C73545c extends Fragment implements AbstractC23185a {

    /* renamed from: h */
    public static final C73546a f165231h = new C73546a((byte) 0);

    /* renamed from: a */
    public LinearLayout f165232a;

    /* renamed from: b */
    public LinearLayout f165233b;

    /* renamed from: c */
    public ImageView f165234c;

    /* renamed from: d */
    public ImageView f165235d;

    /* renamed from: e */
    public Drawable f165236e;

    /* renamed from: f */
    public Drawable f165237f;

    /* renamed from: g */
    public AbstractC73756j f165238g;

    /* renamed from: i */
    private int f165239i;

    /* renamed from: j */
    private boolean f165240j;

    /* renamed from: k */
    private HashMap f165241k;

    static {
        Covode.recordClassIndex(86282);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$a */
    public static final class C73546a {
        static {
            Covode.recordClassIndex(86283);
        }

        private C73546a() {
        }

        public /* synthetic */ C73546a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C73545c m129669a(int i, boolean z, AbstractC73756j jVar) {
            C89219l.m154721d(jVar, "");
            C73545c cVar = new C73545c();
            Bundle bundle = new Bundle();
            bundle.putInt("extra.PERMISSION", i);
            bundle.putBoolean("extra.showTuxNavBarBack", z);
            cVar.setArguments(bundle);
            cVar.f165238g = jVar;
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$b */
    static final class C73547b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73545c f165242a;

        static {
            Covode.recordClassIndex(86284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73547b(C73545c cVar) {
            super(0);
            this.f165242a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C23226a.C23228b.m43791b(this.f165242a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$c */
    static final class C73548c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C73545c f165243a;

        static {
            Covode.recordClassIndex(86285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73548c(C73545c cVar) {
            super(0);
            this.f165243a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ p4600h.C89391z invoke() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.shortvideo.ui.c r0 = r1.f165243a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73545c.C73548c.invoke():java.lang.Object");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f165241k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a b = new TuxNavBar.C23179a().mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37741a((AbstractC89171a<C89391z>) new C73548c(this)));
        C23194g gVar = new C23194g();
        String string = getString(R.string.gf_);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a = b.mo37731a(gVar.mo37753a(string));
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("extra.showTuxNavBarBack", false)) {
            a.mo37732a(new C23187b().mo37738a(R.raw.icon_chevron_left_offset_ltr).mo37741a((AbstractC89171a<C89391z>) new C73547b(this)));
        }
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$d */
    static final class View$OnClickListenerC73549d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73545c f165244a;

        static {
            Covode.recordClassIndex(86286);
        }

        View$OnClickListenerC73549d(C73545c cVar) {
            this.f165244a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f165244a.mo116134a(1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.c$e */
    static final class View$OnClickListenerC73550e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73545c f165245a;

        static {
            Covode.recordClassIndex(86287);
        }

        View$OnClickListenerC73550e(C73545c cVar) {
            this.f165245a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f165245a.mo116134a(0);
        }
    }

    /* renamed from: a */
    public final void mo116134a(int i) {
        this.f165239i = i;
        m129666b(i);
        AbstractC73756j jVar = this.f165238g;
        if (jVar != null) {
            jVar.mo79539a(this.f165239i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("extra.PERMISSION");
        } else {
            i = 0;
        }
        this.f165239i = i;
    }

    /* renamed from: b */
    private final void m129666b(int i) {
        if (i != 0 || this.f165240j) {
            ImageView imageView = this.f165235d;
            if (imageView == null) {
                C89219l.m154710a("mImgPermissionPublic");
            }
            Drawable drawable = this.f165237f;
            if (drawable == null) {
                C89219l.m154710a("mImgNormal");
            }
            imageView.setImageDrawable(drawable);
            ImageView imageView2 = this.f165234c;
            if (imageView2 == null) {
                C89219l.m154710a("mImgPermissionAdv");
            }
            Drawable drawable2 = this.f165236e;
            if (drawable2 == null) {
                C89219l.m154710a("mImgSelected");
            }
            imageView2.setImageDrawable(drawable2);
            return;
        }
        ImageView imageView3 = this.f165235d;
        if (imageView3 == null) {
            C89219l.m154710a("mImgPermissionPublic");
        }
        Drawable drawable3 = this.f165236e;
        if (drawable3 == null) {
            C89219l.m154710a("mImgSelected");
        }
        imageView3.setImageDrawable(drawable3);
        ImageView imageView4 = this.f165234c;
        if (imageView4 == null) {
            C89219l.m154710a("mImgPermissionAdv");
        }
        Drawable drawable4 = this.f165237f;
        if (drawable4 == null) {
            C89219l.m154710a("mImgNormal");
        }
        imageView4.setImageDrawable(drawable4);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.c58);
        C89219l.m154716b(findViewById, "");
        this.f165232a = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.c5b);
        C89219l.m154716b(findViewById2, "");
        this.f165233b = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.d0e);
        C89219l.m154716b(findViewById3, "");
        this.f165234c = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.d0s);
        C89219l.m154716b(findViewById4, "");
        this.f165235d = (ImageView) findViewById4;
        Drawable drawable = getResources().getDrawable(2131232475);
        C89219l.m154716b(drawable, "");
        this.f165236e = drawable;
        Drawable drawable2 = getResources().getDrawable(R.drawable.h_);
        C89219l.m154716b(drawable2, "");
        this.f165237f = drawable2;
        LinearLayout linearLayout = this.f165232a;
        if (linearLayout == null) {
            C89219l.m154710a("mPermissionAdvLayout");
        }
        linearLayout.setOnClickListener(new View$OnClickListenerC73549d(this));
        LinearLayout linearLayout2 = this.f165233b;
        if (linearLayout2 == null) {
            C89219l.m154710a("mPermissionPublicLayout");
        }
        linearLayout2.setOnClickListener(new View$OnClickListenerC73550e(this));
        LinearLayout linearLayout3 = this.f165232a;
        if (linearLayout3 == null) {
            C89219l.m154710a("mPermissionAdvLayout");
        }
        linearLayout3.setBackground(C17177c.m31711c(getContext()));
        LinearLayout linearLayout4 = this.f165233b;
        if (linearLayout4 == null) {
            C89219l.m154710a("mPermissionPublicLayout");
        }
        linearLayout4.setBackground(C17177c.m31711c(getContext()));
        AbstractC32846a e = C63238c.f143594u.mo93906e();
        boolean z = true;
        if (e == null || !e.mo58662e()) {
            z = false;
        }
        this.f165240j = z;
        if (z) {
            LinearLayout linearLayout5 = this.f165233b;
            if (linearLayout5 == null) {
                C89219l.m154710a("mPermissionPublicLayout");
            }
            linearLayout5.setVisibility(8);
        }
        m129666b(this.f165239i);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a0l, viewGroup, false);
    }
}
