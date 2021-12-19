package com.bytedance.android.live.broadcast.preview.p204d;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.broadcast.p182a.AbstractC3006a;
import com.bytedance.android.live.broadcast.preview.p204d.C3502d;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.broadcast.preview.d.a */
public final class C3495a extends AbstractC3006a {

    /* renamed from: a */
    private HashMap f9785a;

    static {
        Covode.recordClassIndex(3979);
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3006a, com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a */
    public final void mo8165a() {
        HashMap hashMap = this.f9785a;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.broadcast.p182a.AbstractC3006a, com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: a_ */
    public final View mo8166a_(int i) {
        if (this.f9785a == null) {
            this.f9785a = new HashMap();
        }
        View view = (View) this.f9785a.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f9785a.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.live.broadcast.p182a.AbstractC3006a, com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo8165a();
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b7h);
        bVar.f27015b = R.style.a2c;
        bVar.mo18055a(new ColorDrawable(0));
        bVar.f27020g = 80;
        bVar.f27022i = -1;
        return bVar;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.d.a$a */
    static final class View$OnClickListenerC3496a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C3495a f9786a;

        static {
            Covode.recordClassIndex(3980);
        }

        View$OnClickListenerC3496a(C3495a aVar) {
            this.f9786a = aVar;
        }

        public final void onClick(View view) {
            this.f9786a.dismiss();
        }
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        mo8166a_(R.id.cy6).setOnClickListener(new View$OnClickListenerC3496a(this));
        getChildFragmentManager().mo3552a().mo3453a(R.id.b82, C3502d.C3503a.m8930a("live_take_page")).mo3467b();
    }
}
