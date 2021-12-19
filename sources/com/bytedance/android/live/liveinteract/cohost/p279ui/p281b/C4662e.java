package com.bytedance.android.live.liveinteract.cohost.p279ui.p281b;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.p263a.p264a.C4484g;
import com.bytedance.android.live.liveinteract.cohost.p263a.p267d.C4591z;
import com.bytedance.android.live.liveinteract.cohost.p263a.p268e.C4595b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.e */
public final class C4662e extends AbstractC11293v implements C4484g.AbstractC4486b {

    /* renamed from: c */
    public static final C4663a f12335c = new C4663a((byte) 0);

    /* renamed from: a */
    public C4484g.AbstractC4485a f12336a;

    /* renamed from: b */
    public boolean f12337b;

    /* renamed from: d */
    private HashMap f12338d;

    static {
        Covode.recordClassIndex(5239);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f12338d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f12338d == null) {
            this.f12338d = new HashMap();
        }
        View view = (View) this.f12338d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f12338d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.e$a */
    public static final class C4663a {
        static {
            Covode.recordClassIndex(5240);
        }

        private C4663a() {
        }

        public /* synthetic */ C4663a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b70);
        bVar.f27020g = 80;
        bVar.f27019f = 0.0f;
        bVar.f27021h = -1;
        bVar.f27022i = -2;
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.e$b */
    static final class View$OnClickListenerC4664b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4662e f12339a;

        static {
            Covode.recordClassIndex(5241);
        }

        View$OnClickListenerC4664b(C4662e eVar) {
            this.f12339a = eVar;
        }

        public final void onClick(View view) {
            this.f12339a.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.e$c */
    static final class View$OnClickListenerC4665c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4662e f12340a;

        static {
            Covode.recordClassIndex(5242);
        }

        View$OnClickListenerC4665c(C4662e eVar) {
            this.f12340a = eVar;
        }

        public final void onClick(View view) {
            C4484g.AbstractC4485a aVar = this.f12340a.f12336a;
            if (aVar != null) {
                aVar.mo10270b();
            }
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.e$d */
    static final class View$OnClickListenerC4666d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C4662e f12341a;

        static {
            Covode.recordClassIndex(5243);
        }

        View$OnClickListenerC4666d(C4662e eVar) {
            this.f12341a = eVar;
        }

        public final void onClick(View view) {
            C4484g.AbstractC4485a aVar = this.f12341a.f12336a;
            if (aVar != null) {
                aVar.mo10269a();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String a;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C4591z zVar = new C4591z(this.f27010p);
        C89219l.m154721d(this, "");
        zVar.f12222a = this;
        this.f12336a = zVar;
        LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.f1x);
        EnumC4949c a2 = C4947a.f12909a.mo10672a();
        if (a2.compareTo((Enum) EnumC4949c.START) < 0 || a2.compareTo((Enum) EnumC4949c.PUNISH) >= 0) {
            a = C3966y.m9657a((int) R.string.dwp);
        } else {
            a = C3966y.m9657a((int) R.string.dx0);
        }
        liveTextView.setText(a);
        LiveButton liveButton = (LiveButton) view.findViewById(R.id.wi);
        if (C4595b.m10702b()) {
            liveButton.setText(C3966y.m9657a((int) R.string.dyn));
            liveButton.setOnClickListener(new View$OnClickListenerC4664b(this));
        } else {
            liveButton.setText(C3966y.m9657a((int) R.string.dsh));
            liveButton.setOnClickListener(new View$OnClickListenerC4665c(this));
        }
        ((LiveButton) view.findViewById(R.id.wj)).setOnClickListener(new View$OnClickListenerC4666d(this));
        if (this.f12337b) {
            View findViewById = view.findViewById(R.id.c7n);
            C89219l.m154716b(findViewById, "");
            ((LinearLayout) findViewById).setVisibility(0);
        }
    }
}
