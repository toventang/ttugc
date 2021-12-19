package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.tux.sheet.sheet.C23226a;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.favorites.api.C47198h;
import com.p2082ss.android.ugc.aweme.favorites.model.C47481j;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah */
public final class C47662ah extends Fragment {

    /* renamed from: g */
    public static final C47663a f110523g = new C47663a((byte) 0);

    /* renamed from: a */
    public TuxSpinner f110524a;

    /* renamed from: b */
    public EditText f110525b;

    /* renamed from: c */
    public ImageView f110526c;

    /* renamed from: d */
    public TextView f110527d;

    /* renamed from: e */
    public TextView f110528e;

    /* renamed from: f */
    public AbstractC47664b f110529f;

    /* renamed from: h */
    private AbstractC88412b f110530h;

    /* renamed from: i */
    private SparseArray f110531i;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$b */
    public interface AbstractC47664b {
        static {
            Covode.recordClassIndex(56286);
        }

        /* renamed from: a */
        void mo79777a(String str);
    }

    static {
        Covode.recordClassIndex(56284);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$a */
    public static final class C47663a {
        static {
            Covode.recordClassIndex(56285);
        }

        private C47663a() {
        }

        public /* synthetic */ C47663a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C47662ah m90667a(String str, String str2, String str3, boolean z, AbstractC47664b bVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
            C47662ah ahVar = new C47662ah();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString("btnName", str3);
            bundle.putBoolean("cancelStyle", z);
            bundle.putString("defaultInput", str2);
            ahVar.setArguments(bundle);
            ahVar.f110529f = bVar;
            return ahVar;
        }

        /* renamed from: a */
        public static void m90669a(AbstractC0952i iVar, String str, String str2, String str3, AbstractC47664b bVar) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(str3, "");
            new C23226a.C23227a().mo37812a(1).mo37817a(m90667a(str, str2, str3, true, bVar)).f55057a.show(iVar, "VideoCollectionChoose");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f110531i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$k */
    static final class RunnableC47673k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C47662ah f110541a;

        static {
            Covode.recordClassIndex(56295);
        }

        RunnableC47673k(C47662ah ahVar) {
            this.f110541a = ahVar;
        }

        public final void run() {
            C47662ah.m90661a(this.f110541a).requestFocus();
            KeyboardUtils.m70896b(C47662ah.m90661a(this.f110541a));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        AbstractC88412b bVar;
        super.onDestroy();
        AbstractC88412b bVar2 = this.f110530h;
        if (bVar2 != null && !bVar2.isDisposed() && (bVar = this.f110530h) != null) {
            bVar.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        super.onStart();
        ActivityC0945e activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setSoftInputMode(32);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$j */
    static final class ViewTreeObserver$OnGlobalLayoutListenerC47672j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ View f110540a;

        static {
            Covode.recordClassIndex(56294);
        }

        ViewTreeObserver$OnGlobalLayoutListenerC47672j(View view) {
            this.f110540a = view;
        }

        public final void onGlobalLayout() {
            Rect rect = new Rect();
            this.f110540a.getWindowVisibleDisplayFrame(rect);
            Context context = this.f110540a.getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            C89219l.m154716b(resources, "");
            int i = resources.getDisplayMetrics().heightPixels;
            int i2 = rect.bottom;
            if (i < i2) {
                i = i2;
            }
            int i3 = i - i2;
            if (i3 != 0) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                int a = i3 + C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
                if (this.f110540a.getPaddingBottom() != a) {
                    this.f110540a.setPadding(0, 0, 0, a);
                }
            } else if (this.f110540a.getPaddingBottom() != 0) {
                this.f110540a.setPadding(0, 0, 0, 0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$e */
    static final class View$OnClickListenerC47667e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47662ah f110534a;

        static {
            Covode.recordClassIndex(56289);
        }

        View$OnClickListenerC47667e(C47662ah ahVar) {
            this.f110534a = ahVar;
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
        public final void onClick(android.view.View r2) {
            /*
                r1 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r2)
                com.ss.android.ugc.aweme.favorites.ui.ah r0 = r1.f110534a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah.View$OnClickListenerC47667e.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$f */
    static final class View$OnClickListenerC47668f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47662ah f110535a;

        static {
            Covode.recordClassIndex(56290);
        }

        View$OnClickListenerC47668f(C47662ah ahVar) {
            this.f110535a = ahVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C23226a.C23228b.m43791b(this.f110535a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$g */
    static final class View$OnClickListenerC47669g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47662ah f110536a;

        static {
            Covode.recordClassIndex(56291);
        }

        View$OnClickListenerC47669g(C47662ah ahVar) {
            this.f110536a = ahVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C47662ah.m90661a(this.f110536a).setText("");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m90661a(C47662ah ahVar) {
        EditText editText = ahVar.f110525b;
        if (editText == null) {
            C89219l.m154710a("etInput");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ TuxSpinner m90662b(C47662ah ahVar) {
        TuxSpinner tuxSpinner = ahVar.f110524a;
        if (tuxSpinner == null) {
            C89219l.m154710a("loading");
        }
        return tuxSpinner;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m90663c(C47662ah ahVar) {
        ImageView imageView = ahVar.f110526c;
        if (imageView == null) {
            C89219l.m154710a("ivClearAll");
        }
        return imageView;
    }

    /* renamed from: d */
    public static final /* synthetic */ TextView m90664d(C47662ah ahVar) {
        TextView textView = ahVar.f110527d;
        if (textView == null) {
            C89219l.m154710a("tvEditHint");
        }
        return textView;
    }

    /* renamed from: e */
    public static final /* synthetic */ TextView m90665e(C47662ah ahVar) {
        TextView textView = ahVar.f110528e;
        if (textView == null) {
            C89219l.m154710a("submit");
        }
        return textView;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$i */
    static final class View$OnClickListenerC47671i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47662ah f110539a;

        static {
            Covode.recordClassIndex(56293);
        }

        View$OnClickListenerC47671i(C47662ah ahVar) {
            this.f110539a = ahVar;
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
        public final void onClick(android.view.View r3) {
            /*
                r2 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r3)
                com.ss.android.ugc.aweme.favorites.ui.ah r0 = r2.f110539a
                com.ss.android.ugc.aweme.favorites.ui.ah$b r1 = r0.f110529f
                if (r1 == 0) goto L_0x001a
                com.ss.android.ugc.aweme.favorites.ui.ah r0 = r2.f110539a
                android.widget.EditText r0 = com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah.m90661a(r0)
                android.text.Editable r0 = r0.getEditableText()
                java.lang.String r0 = r0.toString()
                r1.mo79777a(r0)
            L_0x001a:
                com.ss.android.ugc.aweme.favorites.ui.ah r0 = r2.f110539a
                com.bytedance.tux.sheet.sheet.C23226a.C23228b.m43788a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47662ah.View$OnClickListenerC47671i.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$d */
    public static final class C47666d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47662ah f110533a;

        static {
            Covode.recordClassIndex(56288);
        }

        C47666d(C47662ah ahVar) {
            this.f110533a = ahVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C47662ah.m90662b(this.f110533a).setVisibility(8);
            C47662ah.m90663c(this.f110533a).setVisibility(0);
            C47662ah.m90664d(this.f110533a).setVisibility(0);
            C47662ah.m90664d(this.f110533a).setText(this.f110533a.getText(R.string.bst));
            C47662ah.m90665e(this.f110533a).setEnabled(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$c */
    public static final class C47665c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C47662ah f110532a;

        static {
            Covode.recordClassIndex(56287);
        }

        C47665c(C47662ah ahVar) {
            this.f110532a = ahVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            if (!C89219l.m154714a((Object) ((C47198h) obj).f109863a, (Object) true)) {
                C47662ah.m90662b(this.f110532a).setVisibility(8);
                C47662ah.m90663c(this.f110532a).setVisibility(0);
                C47662ah.m90664d(this.f110532a).setVisibility(0);
                C47662ah.m90664d(this.f110532a).setText(this.f110532a.getText(R.string.bst));
                C47662ah.m90665e(this.f110532a).setEnabled(false);
                return;
            }
            C47662ah.m90662b(this.f110532a).setVisibility(8);
            C47662ah.m90663c(this.f110532a).setVisibility(0);
            C47662ah.m90664d(this.f110532a).setVisibility(8);
            C47662ah.m90665e(this.f110532a).setEnabled(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ah$h */
    public static final class C47670h implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C47662ah f110537a;

        /* renamed from: b */
        final /* synthetic */ TextView f110538b;

        static {
            Covode.recordClassIndex(56292);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            int i;
            String str;
            String obj;
            if (editable == null || (obj = editable.toString()) == null) {
                i = 0;
            } else {
                i = obj.length();
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C0643b.m2378c(C47662ah.m90661a(this.f110537a).getContext(), R.color.ly));
            C17191a.C17192a aVar = new C17191a.C17192a();
            if (i > 30) {
                aVar.mo27178a(C17191a.C17193b.m31755a(i), foregroundColorSpan, 33);
            } else {
                aVar.mo27177a(C17191a.C17193b.m31755a(i));
            }
            aVar.mo27180c("/");
            aVar.mo27177a(C17191a.C17193b.m31755a(30));
            C17191a aVar2 = aVar.f40973a;
            TextView textView = this.f110538b;
            C89219l.m154716b(textView, "");
            textView.setText(aVar2);
            C47662ah ahVar = this.f110537a;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            ahVar.mo79796a(str);
        }

        C47670h(C47662ah ahVar, TextView textView) {
            this.f110537a = ahVar;
            this.f110538b = textView;
        }
    }

    /* renamed from: a */
    public final void mo79796a(String str) {
        AbstractC88412b bVar;
        TextView textView = this.f110528e;
        if (textView == null) {
            C89219l.m154710a("submit");
        }
        textView.setEnabled(false);
        ImageView imageView = this.f110526c;
        if (imageView == null) {
            C89219l.m154710a("ivClearAll");
        }
        imageView.setVisibility(8);
        TextView textView2 = this.f110527d;
        if (textView2 == null) {
            C89219l.m154710a("tvEditHint");
        }
        textView2.setVisibility(8);
        AbstractC88412b bVar2 = this.f110530h;
        if (!(bVar2 == null || bVar2.isDisposed() || (bVar = this.f110530h) == null)) {
            bVar.dispose();
        }
        if (str != null && str.length() != 0 && !C89361p.m154870a((CharSequence) str)) {
            if (str.length() > 30) {
                ImageView imageView2 = this.f110526c;
                if (imageView2 == null) {
                    C89219l.m154710a("ivClearAll");
                }
                imageView2.setVisibility(0);
                TextView textView3 = this.f110527d;
                if (textView3 == null) {
                    C89219l.m154710a("tvEditHint");
                }
                textView3.setVisibility(0);
                TuxSpinner tuxSpinner = this.f110524a;
                if (tuxSpinner == null) {
                    C89219l.m154710a("loading");
                }
                tuxSpinner.setVisibility(8);
                TextView textView4 = this.f110527d;
                if (textView4 == null) {
                    C89219l.m154710a("tvEditHint");
                }
                textView4.setText(getText(R.string.bsh));
                TextView textView5 = this.f110528e;
                if (textView5 == null) {
                    C89219l.m154710a("submit");
                }
                textView5.setEnabled(false);
                return;
            }
            TextView textView6 = this.f110527d;
            if (textView6 == null) {
                C89219l.m154710a("tvEditHint");
            }
            textView6.setVisibility(8);
            TuxSpinner tuxSpinner2 = this.f110524a;
            if (tuxSpinner2 == null) {
                C89219l.m154710a("loading");
            }
            tuxSpinner2.setVisibility(0);
            this.f110530h = new C47481j().f110302b.mo79756a(str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C47665c(this), new C47666d(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        String obj;
        String string;
        String str2 = "";
        C89219l.m154721d(view, str2);
        View findViewById = view.findViewById(R.id.ebk);
        C89219l.m154716b(findViewById, str2);
        this.f110528e = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.evk);
        C89219l.m154716b(findViewById2, str2);
        this.f110527d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bu3);
        C89219l.m154716b(findViewById3, str2);
        this.f110526c = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ax1);
        C89219l.m154716b(findViewById4, str2);
        this.f110525b = (EditText) findViewById4;
        TextView textView = (TextView) view.findViewById(R.id.evm);
        TextView textView2 = (TextView) view.findViewById(R.id.title);
        View findViewById5 = view.findViewById(R.id.a0w);
        View findViewById6 = view.findViewById(R.id.pf);
        View findViewById7 = view.findViewById(R.id.cfa);
        C89219l.m154716b(findViewById7, str2);
        this.f110524a = (TuxSpinner) findViewById7;
        C89219l.m154716b(textView2, str2);
        Bundle arguments = getArguments();
        String str3 = null;
        if (arguments != null) {
            str = arguments.getString("title");
        } else {
            str = null;
        }
        textView2.setText(str);
        TextView textView3 = this.f110528e;
        if (textView3 == null) {
            C89219l.m154710a("submit");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str3 = arguments2.getString("btnName");
        }
        textView3.setText(str3);
        EditText editText = this.f110525b;
        if (editText == null) {
            C89219l.m154710a("etInput");
        }
        editText.setHint(R.string.bsj);
        findViewById5.setOnClickListener(new View$OnClickListenerC47667e(this));
        findViewById6.setOnClickListener(new View$OnClickListenerC47668f(this));
        C89219l.m154716b(findViewById5, str2);
        Bundle arguments3 = getArguments();
        int i2 = 8;
        int i3 = 0;
        if (arguments3 == null || !arguments3.getBoolean("cancelStyle")) {
            i = 8;
        } else {
            i = 0;
        }
        findViewById5.setVisibility(i);
        C89219l.m154716b(findViewById6, str2);
        Bundle arguments4 = getArguments();
        if (arguments4 == null || !arguments4.getBoolean("cancelStyle")) {
            i2 = 0;
        }
        findViewById6.setVisibility(i2);
        ImageView imageView = this.f110526c;
        if (imageView == null) {
            C89219l.m154710a("ivClearAll");
        }
        imageView.setOnClickListener(new View$OnClickListenerC47669g(this));
        EditText editText2 = this.f110525b;
        if (editText2 == null) {
            C89219l.m154710a("etInput");
        }
        editText2.addTextChangedListener(new C47670h(this, textView));
        EditText editText3 = this.f110525b;
        if (editText3 == null) {
            C89219l.m154710a("etInput");
        }
        Bundle arguments5 = getArguments();
        if (!(arguments5 == null || (string = arguments5.getString("defaultInput")) == null)) {
            str2 = string;
        }
        editText3.setText(str2);
        EditText editText4 = this.f110525b;
        if (editText4 == null) {
            C89219l.m154710a("etInput");
        }
        EditText editText5 = this.f110525b;
        if (editText5 == null) {
            C89219l.m154710a("etInput");
        }
        Editable editableText = editText5.getEditableText();
        if (!(editableText == null || (obj = editableText.toString()) == null)) {
            i3 = obj.length();
        }
        editText4.setSelection(i3);
        TextView textView4 = this.f110528e;
        if (textView4 == null) {
            C89219l.m154710a("submit");
        }
        textView4.setOnClickListener(new View$OnClickListenerC47671i(this));
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC47672j(view));
        }
        EditText editText6 = this.f110525b;
        if (editText6 == null) {
            C89219l.m154710a("etInput");
        }
        editText6.postDelayed(new RunnableC47673k(this), 200);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.zr, viewGroup, false);
    }
}
