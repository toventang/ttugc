package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.os.Bundle;
import android.util.SparseArray;
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
import com.bytedance.tux.navigation.p1723a.AbstractC23190d;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.prop.b.d */
public final class C65271d extends Fragment implements AbstractC23185a {

    /* renamed from: b */
    public static int f147277b;

    /* renamed from: c */
    public static final C65272a f147278c = new C65272a((byte) 0);

    /* renamed from: a */
    public AbstractC65268a f147279a;

    /* renamed from: d */
    private SparseArray f147280d;

    static {
        Covode.recordClassIndex(76750);
    }

    /* renamed from: b */
    private View m116939b(int i) {
        if (this.f147280d == null) {
            this.f147280d = new SparseArray();
        }
        View view = (View) this.f147280d.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f147280d.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.b.d$a */
    public static final class C65272a {
        static {
            Covode.recordClassIndex(76751);
        }

        private C65272a() {
        }

        public /* synthetic */ C65272a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.b.d$b */
    public static final class C65273b implements AbstractC23190d {

        /* renamed from: a */
        final /* synthetic */ C65271d f147281a;

        static {
            Covode.recordClassIndex(76752);
        }

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
        @Override // com.bytedance.tux.navigation.p1723a.AbstractC23190d
        /* renamed from: a */
        public final void mo37744a() {
            /*
                r1 = this;
                com.ss.android.ugc.aweme.prop.b.d r0 = r1.f147281a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.prop.p3606b.C65271d.C65273b.mo37744a():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C65273b(C65271d dVar) {
            this.f147281a = dVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f147280d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.AbstractC23185a
    /* renamed from: a */
    public final TuxNavBar.C23179a mo37737a() {
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = getString(R.string.c43);
        C89219l.m154716b(string, "");
        return aVar.mo37731a(gVar.mo37753a(string)).mo37733b(new C23187b().mo37738a(R.raw.icon_x_mark_small).mo37740a((AbstractC23190d) new C65273b(this)));
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.b.d$c */
    static final class View$OnClickListenerC65274c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65271d f147282a;

        static {
            Covode.recordClassIndex(76753);
        }

        View$OnClickListenerC65274c(C65271d dVar) {
            this.f147282a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147282a.mo104436a(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.prop.b.d$d */
    static final class View$OnClickListenerC65275d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C65271d f147283a;

        static {
            Covode.recordClassIndex(76754);
        }

        View$OnClickListenerC65275d(C65271d dVar) {
            this.f147283a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f147283a.mo104436a(3);
        }
    }

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
    /* renamed from: a */
    public final void mo104436a(int r4) {
        /*
            r3 = this;
            com.p2082ss.android.ugc.aweme.prop.p3606b.C65271d.f147277b = r4
            r0 = 2131365553(0x7f0a0eb1, float:1.8350975E38)
            android.view.View r1 = r3.m116939b(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2131233780(0x7f080bf4, float:1.8083707E38)
            r0 = 2131233782(0x7f080bf6, float:1.8083711E38)
            if (r4 != 0) goto L_0x003a
            r0 = 2131233780(0x7f080bf4, float:1.8083707E38)
        L_0x0016:
            r1.setImageResource(r0)
            r0 = 2131365554(0x7f0a0eb2, float:1.8350977E38)
            android.view.View r1 = r3.m116939b(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 3
            if (r4 != r0) goto L_0x0036
        L_0x0025:
            r1.setImageResource(r2)
            com.ss.android.ugc.aweme.prop.b.a r1 = r3.f147279a
            if (r1 == 0) goto L_0x0031
            int r0 = com.p2082ss.android.ugc.aweme.prop.p3606b.C65271d.f147277b
            r1.mo104434a(r0)
        L_0x0031:
            r0 = r3
            com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
            return
        L_0x0036:
            r2 = 2131233782(0x7f080bf6, float:1.8083711E38)
            goto L_0x0025
        L_0x003a:
            r0 = 2131233782(0x7f080bf6, float:1.8083711E38)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.prop.p3606b.C65271d.mo104436a(int):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) m116939b(R.id.c42);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setBackground(C17177c.m31711c(getContext()));
        LinearLayout linearLayout2 = (LinearLayout) m116939b(R.id.c43);
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setBackground(C17177c.m31711c(getContext()));
        ImageView imageView = (ImageView) m116939b(R.id.c0u);
        int i2 = f147277b;
        int i3 = R.drawable.bhz;
        if (i2 == 0) {
            i = R.drawable.bhz;
        } else {
            i = R.drawable.bi1;
        }
        imageView.setImageResource(i);
        ImageView imageView2 = (ImageView) m116939b(R.id.c0v);
        if (f147277b != 3) {
            i3 = R.drawable.bi1;
        }
        imageView2.setImageResource(i3);
        ((LinearLayout) m116939b(R.id.c42)).setOnClickListener(new View$OnClickListenerC65274c(this));
        ((LinearLayout) m116939b(R.id.c43)).setOnClickListener(new View$OnClickListenerC65275d(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.ak3, viewGroup, false);
    }
}
