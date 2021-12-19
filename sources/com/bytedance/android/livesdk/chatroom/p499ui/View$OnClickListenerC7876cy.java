package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.C2907a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.livesdk.C6905bf;
import com.bytedance.android.livesdk.chatroom.p488c.C7370ac;
import com.bytedance.android.livesdk.chatroom.p488c.C7386e;
import com.bytedance.android.livesdk.chatroom.p490e.C7494o;
import com.bytedance.android.livesdk.model.C9533aq;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.C11734o;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy */
public final class View$OnClickListenerC7876cy extends C2907a implements View.OnClickListener, C7494o.AbstractC7495a {

    /* renamed from: i */
    private static final C7877a f19601i = new C7877a((byte) 0);

    /* renamed from: a */
    public DialogC9148b f19602a;

    /* renamed from: b */
    private int f19603b;

    /* renamed from: c */
    private boolean f19604c = true;

    /* renamed from: d */
    private boolean f19605d;

    /* renamed from: e */
    private C7923dv f19606e;

    /* renamed from: f */
    private final C7494o f19607f;

    /* renamed from: g */
    private boolean f19608g;

    /* renamed from: h */
    private C88411a f19609h;

    /* renamed from: j */
    private HashMap f19610j;

    static {
        Covode.recordClassIndex(8671);
    }

    /* renamed from: a */
    private View m15997a(int i) {
        if (this.f19610j == null) {
            this.f19610j = new HashMap();
        }
        View view = (View) this.f19610j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f19610j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy$a */
    static final class C7877a {
        static {
            Covode.recordClassIndex(8672);
        }

        private C7877a() {
        }

        public /* synthetic */ C7877a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final boolean m15998b() {
        if (this.f19603b == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f19610j;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View$OnClickListenerC7876cy() {
        C7494o oVar = new C7494o();
        oVar.mo10297a(this);
        this.f19607f = oVar;
        this.f19609h = new C88411a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f19608g = false;
        this.f19607f.mo8577b();
        this.f19609h.dispose();
        this.f19609h.mo142944a();
    }

    /* renamed from: a */
    public final void mo14175a() {
        if (this.f19604c && !this.f19605d) {
            if (m15998b()) {
                RecyclerView recyclerView = (RecyclerView) m15997a(R.id.e8h);
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                View a = m15997a(R.id.cg3);
                if (a != null) {
                    a.setVisibility(0);
                }
                LiveLoadingView liveLoadingView = (LiveLoadingView) m15997a(R.id.d_3);
                if (liveLoadingView != null) {
                    liveLoadingView.setVisibility(0);
                }
                LiveTextView liveTextView = (LiveTextView) m15997a(R.id.djd);
                if (liveTextView != null) {
                    liveTextView.setVisibility(8);
                }
            }
            this.f19607f.mo13742a(C89041ag.m154421a(C89387v.m154943a("cursor", String.valueOf(this.f19603b)), C89387v.m154943a("count", "11")));
            this.f19605d = true;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy$b */
    public static final class C7878b extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC7876cy f19611a;

        static {
            Covode.recordClassIndex(8673);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C7878b(View$OnClickListenerC7876cy cyVar) {
            this.f19611a = cyVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager instanceof LinearLayoutManager)) {
                    layoutManager = null;
                }
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                if (linearLayoutManager != null && linearLayoutManager.mo4373m() >= linearLayoutManager.mo4685A() - 2) {
                    this.f19611a.mo14175a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy$g */
    public static final class DialogInterface$OnDismissListenerC7883g implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        public static final DialogInterface$OnDismissListenerC7883g f19617a = new DialogInterface$OnDismissListenerC7883g();

        static {
            Covode.recordClassIndex(8678);
        }

        DialogInterface$OnDismissListenerC7883g() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C6905bf.m14776a().mo13208c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy$h */
    public static final class DialogInterface$OnShowListenerC7884h implements DialogInterface.OnShowListener {

        /* renamed from: a */
        public static final DialogInterface$OnShowListenerC7884h f19618a = new DialogInterface$OnShowListenerC7884h();

        static {
            Covode.recordClassIndex(8679);
        }

        DialogInterface$OnShowListenerC7884h() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            C6905bf.m14776a().mo13207b();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy$c */
    static final class C7879c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC7876cy f19612a;

        static {
            Covode.recordClassIndex(8674);
        }

        C7879c(View$OnClickListenerC7876cy cyVar) {
            this.f19612a = cyVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C7370ac acVar = (C7370ac) obj;
            if (acVar != null) {
                this.f19612a.onEvent(acVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy$d */
    static final class C7880d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC7876cy f19613a;

        static {
            Covode.recordClassIndex(8675);
        }

        C7880d(View$OnClickListenerC7876cy cyVar) {
            this.f19613a = cyVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f19613a.dismissAllowingStateLoss();
            DialogC9148b bVar = this.f19613a.f19602a;
            if (bVar != null) {
                bVar.dismiss();
            }
        }
    }

    public final void onClick(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.djd) {
                mo14175a();
            } else if (valueOf.intValue() == R.id.e8_) {
                dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C89219l.m154716b(onCreateDialog, "");
        onCreateDialog.requestWindowFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(true);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            C89219l.m154716b(window, "");
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            double b = (double) C3966y.m9662b();
            Double.isNaN(b);
            attributes.height = (int) (b * 0.7d);
            window.setAttributes(attributes);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ActivityC0945e a;
        super.onCreate(bundle);
        this.f19608g = true;
        setStyle(1, R.style.a28);
        this.f19609h.mo142945a(C6779a.m14563a().mo13052a(C7370ac.class).mo143289d(new C7879c(this)));
        this.f19609h.mo142945a(C6779a.m14563a().mo13052a(C7386e.class).mo143289d(new C7880d(this)));
        Context context = getContext();
        if (context != null && (a = C11279p.m20001a(context)) != null) {
            this.f19606e = new C7923dv(a);
        }
    }

    public final void onEvent(C7370ac acVar) {
        if (acVar.f18269a != null) {
            DialogC9148b.C9149a aVar = new DialogC9148b.C9149a(getContext());
            aVar.f22244a = C3966y.m9660a((int) R.string.eg4, acVar.f18269a.f23145a);
            DialogC9148b.C9149a b = aVar.mo15248b(R.string.eg5).mo15244a(R.string.eg6, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC7881e(this, acVar), false).mo15249b(R.string.gi8, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC7882f.f19616a, false);
            b.f22249f = DialogInterface$OnDismissListenerC7883g.f19617a;
            b.f22250g = DialogInterface$OnShowListenerC7884h.f19618a;
            DialogC9148b a = b.mo15247a();
            this.f19602a = a;
            if (a != null) {
                a.show();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7494o.AbstractC7495a
    /* renamed from: a */
    public final void mo13743a(C11734o oVar) {
        Collection<? extends C9533aq> collection;
        String str = "";
        C89219l.m154721d(oVar, str);
        if (this.f19608g) {
            this.f19605d = false;
            this.f19603b = oVar.f28073b;
            boolean z = true;
            if (oVar.f28074c != 1) {
                z = false;
            }
            this.f19604c = z;
            RecyclerView recyclerView = (RecyclerView) m15997a(R.id.e8h);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            View a = m15997a(R.id.cg3);
            if (a != null) {
                a.setVisibility(8);
            }
            C7923dv dvVar = this.f19606e;
            if (dvVar != null) {
                C89219l.m154721d(oVar, str);
                List<C9533aq> list = dvVar.f19724a;
                List<C9533aq> list2 = oVar.f28078g;
                if (list2 == null || (collection = C89070n.m154580f((Iterable) list2)) == null) {
                    collection = C89086z.INSTANCE;
                }
                list.addAll(collection);
                String str2 = oVar.f28075d;
                if (str2 != null) {
                    str = str2;
                }
                dvVar.f19725b = str;
                dvVar.notifyDataSetChanged();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.p490e.C7494o.AbstractC7495a
    /* renamed from: a */
    public final void mo13744a(Throwable th) {
        if (this.f19608g) {
            this.f19605d = false;
            C11264f.m19958a(getContext(), th, (int) R.string.gsq);
            if (m15998b()) {
                RecyclerView recyclerView = (RecyclerView) m15997a(R.id.e8h);
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                View a = m15997a(R.id.cg3);
                if (a != null) {
                    a.setVisibility(0);
                }
                LiveLoadingView liveLoadingView = (LiveLoadingView) m15997a(R.id.d_3);
                if (liveLoadingView != null) {
                    liveLoadingView.setVisibility(8);
                }
                LiveTextView liveTextView = (LiveTextView) m15997a(R.id.djd);
                if (liveTextView != null) {
                    liveTextView.setVisibility(0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy$f */
    public static final class DialogInterface$OnClickListenerC7882f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final DialogInterface$OnClickListenerC7882f f19616a = new DialogInterface$OnClickListenerC7882f();

        static {
            Covode.recordClassIndex(8677);
        }

        DialogInterface$OnClickListenerC7882f() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.cy$e */
    public static final class DialogInterface$OnClickListenerC7881e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC7876cy f19614a;

        /* renamed from: b */
        final /* synthetic */ C7370ac f19615b;

        static {
            Covode.recordClassIndex(8676);
        }

        DialogInterface$OnClickListenerC7881e(View$OnClickListenerC7876cy cyVar, C7370ac acVar) {
            this.f19614a = cyVar;
            this.f19615b = acVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
            if (r1 > 0) goto L_0x003f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r10, int r11) {
            /*
            // Method dump skipped, instructions count: 106
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.View$OnClickListenerC7876cy.DialogInterface$OnClickListenerC7881e.onClick(android.content.DialogInterface, int):void");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        LiveTextView liveTextView = (LiveTextView) m15997a(R.id.djd);
        if (liveTextView != null) {
            liveTextView.setOnClickListener(this);
        }
        LiveAutoRtlImageView liveAutoRtlImageView = (LiveAutoRtlImageView) m15997a(R.id.e8_);
        if (liveAutoRtlImageView != null) {
            liveAutoRtlImageView.setOnClickListener(this);
        }
        RecyclerView recyclerView = (RecyclerView) m15997a(R.id.e8h);
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f19606e);
        }
        RecyclerView recyclerView2 = (RecyclerView) m15997a(R.id.e8h);
        if (recyclerView2 != null) {
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView3 = (RecyclerView) m15997a(R.id.e8h);
        if (recyclerView3 != null) {
            recyclerView3.mo4405a(new C7878b(this));
        }
        mo14175a();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(359);
        C89219l.m154721d(layoutInflater, "");
        View inflate = layoutInflater.inflate(R.layout.b6k, viewGroup);
        MethodCollector.m26664o(359);
        return inflate;
    }
}
