package com.bytedance.android.live.effect.p239a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.effect.C4269f;
import com.bytedance.android.live.effect.api.p240a.AbstractC4154g;
import com.bytedance.android.live.effect.model.C4312b;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.widget.AdjustPercentBar;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.a.a */
public final class C4143a extends C10935a {

    /* renamed from: c */
    public static final C4144a f11577c = new C4144a((byte) 0);

    /* renamed from: a */
    public AbstractC4154g f11578a;

    /* renamed from: b */
    public C4312b f11579b;

    /* renamed from: d */
    private HashMap f11580d;

    static {
        Covode.recordClassIndex(4710);
    }

    /* renamed from: com.bytedance.android.live.effect.a.a$a */
    public static final class C4144a {
        static {
            Covode.recordClassIndex(4711);
        }

        private C4144a() {
        }

        public /* synthetic */ C4144a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f11580d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.p643ui.C10935a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f11580d == null) {
            this.f11580d = new HashMap();
        }
        View view2 = (View) this.f11580d.get(Integer.valueOf((int) R.id.e37));
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null) {
                view2 = null;
            } else {
                view2 = view3.findViewById(R.id.e37);
                this.f11580d.put(Integer.valueOf((int) R.id.e37), view2);
            }
        }
        AdjustPercentBar adjustPercentBar = (AdjustPercentBar) view2;
        C89219l.m154716b(adjustPercentBar, "");
        AbstractC4154g gVar = this.f11578a;
        C4312b bVar = this.f11579b;
        C89219l.m154721d(adjustPercentBar, "");
        C4269f fVar = new C4269f();
        fVar.f11790a = adjustPercentBar;
        fVar.f11792c = gVar;
        fVar.f11793d = bVar;
        getChildFragmentManager().mo3552a().mo3453a(R.id.re, fVar).mo3478e();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.b8y, viewGroup, false);
    }
}
