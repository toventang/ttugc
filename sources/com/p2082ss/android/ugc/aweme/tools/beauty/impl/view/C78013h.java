package com.p2082ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4086a.C77861e;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77870a;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautyStyleFrameLayout;
import com.p2082ss.android.ugc.aweme.tools.beauty.views.C78092c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.impl.view.h */
public final class C78013h extends FrameLayout implements AbstractC77870a {

    /* renamed from: a */
    private View f175007a;

    /* renamed from: b */
    private final View f175008b;

    /* renamed from: c */
    private final BeautyStyleFrameLayout f175009c;

    /* renamed from: d */
    private C78092c f175010d;

    /* renamed from: e */
    private View.OnClickListener f175011e;

    /* renamed from: f */
    private ViewGroup f175012f;

    /* renamed from: g */
    private final ViewGroup f175013g;

    /* renamed from: h */
    private C77861e f175014h;

    /* renamed from: i */
    private AbstractC89171a<? extends View> f175015i;

    static {
        Covode.recordClassIndex(91103);
    }

    public final ViewGroup getContainer() {
        return this.f175012f;
    }

    public final ViewGroup getParent() {
        return this.f175013g;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77870a
    public final View getRoot() {
        return this.f175007a;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.a<? extends android.view.View>, h.f.a.a<android.view.View> */
    public final AbstractC89171a<View> getRootProvider() {
        return this.f175015i;
    }

    public final C77861e getViewConfig() {
        return this.f175014h;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77870a
    /* renamed from: b */
    public final void mo121468b() {
        C78092c cVar = this.f175010d;
        if (cVar != null) {
            cVar.mo70112b(new C40903b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77870a
    /* renamed from: a */
    public final void mo121467a() {
        C78092c cVar = this.f175010d;
        if (cVar != null) {
            cVar.f175356c = this.f175014h.f174730h;
        }
        C78092c cVar2 = this.f175010d;
        if (cVar2 != null) {
            cVar2.mo70110a(new C40903b());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77870a
    /* renamed from: c */
    public final void mo121469c() {
        BeautyStyleFrameLayout beautyStyleFrameLayout = this.f175009c;
        Context context = getContext();
        C89219l.m154716b(context, "");
        beautyStyleFrameLayout.mo121888a(C84912r.m145930a(context, this.f175014h.f174690b.f174662a));
    }

    public final void setRootProvider(AbstractC89171a<? extends View> aVar) {
        this.f175015i = aVar;
    }

    public final void setRoot(View view) {
        C89219l.m154721d(view, "");
        this.f175007a = view;
    }

    public final void setViewConfig(C77861e eVar) {
        C89219l.m154721d(eVar, "");
        this.f175014h = eVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77870a
    public final void setContainer(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f175012f = viewGroup;
        this.f175010d = new C78092c(this.f175012f, this, getRoot());
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.beauty.p4085b.p4088c.AbstractC77870a
    public final void setDismissViewClickListener(View.OnClickListener onClickListener) {
        C89219l.m154721d(onClickListener, "");
        this.f175011e = onClickListener;
        if (this.f175014h.f174731i) {
            this.f175008b.setOnClickListener(this.f175011e);
            return;
        }
        View view = this.f175008b;
        C89219l.m154716b(view, "");
        view.setClickable(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C78013h(Context context, ViewGroup viewGroup, C77861e eVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(eVar, "");
        MethodCollector.m26663i(8679);
        this.f175013g = viewGroup;
        this.f175014h = eVar;
        this.f175015i = null;
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.ej, this, true);
        C89219l.m154716b(a, "");
        this.f175007a = a;
        this.f175008b = getRoot().findViewById(R.id.fan);
        this.f175009c = (BeautyStyleFrameLayout) getRoot().findViewById(R.id.b3w);
        this.f175012f = viewGroup;
        MethodCollector.m26664o(8679);
    }

    public /* synthetic */ C78013h(Context context, ViewGroup viewGroup, C77861e eVar, byte b) {
        this(context, viewGroup, eVar);
    }
}
