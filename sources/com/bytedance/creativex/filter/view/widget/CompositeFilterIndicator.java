package com.bytedance.creativex.filter.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;

public final class CompositeFilterIndicator extends LinearLayout {

    /* renamed from: a */
    private final C14089a f34269a;

    /* renamed from: b */
    private final C14089a f34270b;

    static {
        Covode.recordClassIndex(16157);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompositeFilterIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(9755);
        C14089a aVar = new C14089a(getContext());
        this.f34269a = aVar;
        C14089a aVar2 = new C14089a(getContext());
        this.f34270b = aVar2;
        setOrientation(1);
        addView(aVar);
        addView(aVar2);
        aVar2.setScaleX(0.5f);
        aVar2.setScaleY(0.5f);
        MethodCollector.m26664o(9755);
    }

    /* renamed from: a */
    public final void mo22631a(C14094b bVar, C14094b bVar2, boolean z) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(bVar2, "");
        this.f34269a.mo22632a(bVar.f34284a, bVar2.f34284a, z);
        this.f34270b.mo22632a(bVar.f34285b, bVar2.f34285b, z);
        setVisibility(0);
    }
}
