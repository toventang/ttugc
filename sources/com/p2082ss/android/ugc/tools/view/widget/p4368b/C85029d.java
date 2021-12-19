package com.p2082ss.android.ugc.tools.view.widget.p4368b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.view.widget.b.d */
public final class C85029d extends FrameLayout implements AbstractC85027b<EnumC85026a> {

    /* renamed from: a */
    private final Map<EnumC85026a, View> f190234a;

    /* renamed from: b */
    private final Map<EnumC85026a, AbstractC89172b<ViewGroup, View>> f190235b;

    /* renamed from: c */
    private EnumC85026a f190236c;

    static {
        Covode.recordClassIndex(99050);
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b
    public final EnumC85026a getState() {
        return this.f190236c;
    }

    public final void setState(EnumC85026a aVar) {
        C89219l.m154721d(aVar, "");
        View view = this.f190234a.get(this.f190236c);
        if (view != null) {
            view.setVisibility(8);
        }
        this.f190236c = aVar;
        AbstractC89172b<ViewGroup, View> bVar = this.f190235b.get(aVar);
        if (bVar != null) {
            if (!this.f190234a.containsKey(this.f190236c)) {
                View invoke = bVar.invoke(this);
                invoke.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                addView(invoke);
                this.f190234a.put(this.f190236c, invoke);
            }
            View view2 = this.f190234a.get(this.f190236c);
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo129961a(EnumC85026a aVar, AbstractC89172b<? super ViewGroup, ? extends View> bVar) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        this.f190235b.put(aVar, bVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C85029d(Context context, Map<EnumC85026a, ? extends AbstractC89172b<? super ViewGroup, ? extends View>> map, EnumC85026a aVar) {
        super(context, null);
        C89219l.m154721d(context, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(aVar, "");
        MethodCollector.m26663i(8711);
        this.f190234a = new LinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f190235b = linkedHashMap;
        linkedHashMap.putAll(map);
        this.f190236c = aVar;
        MethodCollector.m26664o(8711);
    }

    public /* synthetic */ C85029d(Context context, Map map, EnumC85026a aVar, byte b) {
        this(context, map, aVar);
    }
}
