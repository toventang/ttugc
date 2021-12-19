package com.bytedance.android.live.broadcast.p188b;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.b.d */
public final class C3076d extends AbstractC11293v {

    /* renamed from: b */
    public static final String f8935b = C3076d.class.getSimpleName();

    /* renamed from: c */
    public static C3076d f8936c;

    /* renamed from: d */
    public static final C3077a f8937d = new C3077a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super Boolean, C89391z> f8938a;

    /* renamed from: e */
    private TextView f8939e;

    /* renamed from: f */
    private FrameLayout f8940f;

    /* renamed from: g */
    private FrameLayout f8941g;

    /* renamed from: h */
    private FrameLayout f8942h;

    /* renamed from: i */
    private HashMap f8943i;

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f8943i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f8943i == null) {
            this.f8943i = new HashMap();
        }
        View view = (View) this.f8943i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f8943i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.d$a */
    public static final class C3077a {
        static {
            Covode.recordClassIndex(3557);
        }

        private C3077a() {
        }

        public /* synthetic */ C3077a(byte b) {
            this();
        }
    }

    private C3076d() {
    }

    static {
        Covode.recordClassIndex(3556);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b7s);
        bVar.f27015b = R.style.a28;
        bVar.f27020g = 80;
        bVar.f27019f = 0.0f;
        bVar.f27022i = -2;
        bVar.mo18055a(new ColorDrawable(0));
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.d$d */
    static final class View$OnClickListenerC3080d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3076d f8946a;

        static {
            Covode.recordClassIndex(3560);
        }

        View$OnClickListenerC3080d(C3076d dVar) {
            this.f8946a = dVar;
        }

        public final void onClick(View view) {
            this.f8946a.dismissAllowingStateLoss();
        }
    }

    public /* synthetic */ C3076d(byte b) {
        this();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.a28);
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.d$b */
    static final class View$OnClickListenerC3078b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3076d f8944a;

        static {
            Covode.recordClassIndex(3558);
        }

        View$OnClickListenerC3078b(C3076d dVar) {
            this.f8944a = dVar;
        }

        public final void onClick(View view) {
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f8944a.f8938a;
            if (bVar != null) {
                bVar.invoke(false);
            }
            this.f8944a.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.b.d$c */
    static final class View$OnClickListenerC3079c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3076d f8945a;

        static {
            Covode.recordClassIndex(3559);
        }

        View$OnClickListenerC3079c(C3076d dVar) {
            this.f8945a = dVar;
        }

        public final void onClick(View view) {
            AbstractC89172b<? super Boolean, C89391z> bVar = this.f8945a.f8938a;
            if (bVar != null) {
                bVar.invoke(true);
            }
            this.f8945a.dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.title);
        C89219l.m154716b(findViewById, "");
        this.f8939e = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.yd);
        C89219l.m154716b(findViewById2, "");
        this.f8940f = (FrameLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.yx);
        C89219l.m154716b(findViewById3, "");
        this.f8941g = (FrameLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.x5);
        C89219l.m154716b(findViewById4, "");
        this.f8942h = (FrameLayout) findViewById4;
        FrameLayout frameLayout = this.f8940f;
        if (frameLayout == null) {
            C89219l.m154710a("neverShowBtnItem");
        }
        frameLayout.setOnClickListener(new View$OnClickListenerC3078b(this));
        FrameLayout frameLayout2 = this.f8941g;
        if (frameLayout2 == null) {
            C89219l.m154710a("showNextTimeItem");
        }
        frameLayout2.setOnClickListener(new View$OnClickListenerC3079c(this));
        FrameLayout frameLayout3 = this.f8942h;
        if (frameLayout3 == null) {
            C89219l.m154710a("cancelBtnItem");
        }
        frameLayout3.setOnClickListener(new View$OnClickListenerC3080d(this));
    }
}
