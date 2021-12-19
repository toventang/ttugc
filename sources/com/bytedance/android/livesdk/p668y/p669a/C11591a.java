package com.bytedance.android.livesdk.p668y.p669a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p668y.p670b.C11596a;
import com.bytedance.android.livesdk.p668y.p670b.C11597b;
import com.bytedance.android.livesdk.p668y.p670b.C11598c;
import com.bytedance.android.livesdk.p668y.p671c.C11599a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.y.a.a */
public final class C11591a extends AbstractC11293v {

    /* renamed from: a */
    LiveTextView f27742a;

    /* renamed from: b */
    LiveTextView f27743b;

    /* renamed from: c */
    public long f27744c;

    /* renamed from: d */
    public int f27745d;

    /* renamed from: e */
    private final C88411a f27746e = new C88411a();

    static {
        Covode.recordClassIndex(13257);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo9929d() {
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void dismissAllowingStateLoss() {
        super.dismissAllowingStateLoss();
        C6779a.m14563a().mo13053a(new C11598c());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f27746e.mo142944a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        getDialog().getWindow().setLayout(-1, -1);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b5r);
        bVar.f27025l = 48;
        bVar.f27020g = 17;
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f27742a = (LiveTextView) view.findViewById(R.id.af2);
        this.f27743b = (LiveTextView) view.findViewById(R.id.af3);
        ((LiveTextView) view.findViewById(R.id.c91)).setOnClickListener(new View$OnClickListenerC11592b(this));
        view.findViewById(R.id.c8y).setOnClickListener(new View$OnClickListenerC11593c(this));
        Resources resources = getResources();
        long j = this.f27744c;
        String quantityString = resources.getQuantityString(R.plurals.ge, (int) j, Integer.valueOf((int) j));
        int i = this.f27745d;
        ((LiveTextView) view.findViewById(R.id.c8z)).setText(quantityString + resources.getQuantityString(R.plurals.gf, i, Integer.valueOf(i)));
        this.f27746e.mo142945a(C6779a.m14563a().mo13052a(C11596a.class).mo143289d(new C11594d(this)));
        this.f27746e.mo142945a(C6779a.m14563a().mo13052a(C11597b.class).mo143289d(new C11595e(this)));
        C11599a.C11601a.f27757a.mo18397a();
    }
}
