package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2557a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.b */
public final class C37798b implements AbstractC37781a {

    /* renamed from: d */
    public static final C37799a f89260d = new C37799a((byte) 0);

    /* renamed from: a */
    public String f89261a = "";

    /* renamed from: b */
    public String f89262b = "";

    /* renamed from: c */
    public String f89263c = "";

    static {
        Covode.recordClassIndex(45245);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: c */
    public final boolean mo65784c() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: d */
    public final boolean mo65785d() {
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.b$a */
    public static final class C37799a {
        static {
            Covode.recordClassIndex(45246);
        }

        private C37799a() {
        }

        public /* synthetic */ C37799a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: a */
    public final void mo65779a() {
        IAppLogDepend iAppLogDepend = C16091a.f38741a;
        if (iAppLogDepend != null) {
            iAppLogDepend.onEventV3Map("show_egg_ad", new C33744d().mo59983a("enter_from", this.f89263c).mo59983a("group_id", this.f89261a).mo59983a("author_id", this.f89262b).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: b */
    public final void mo65782b() {
        IAppLogDepend iAppLogDepend = C16091a.f38741a;
        if (iAppLogDepend != null) {
            iAppLogDepend.onEventV3Map("show_egg_ad_fail", new C33744d().mo59983a("fail_type", "load_fail").mo59983a("enter_from", this.f89263c).mo59983a("group_id", this.f89261a).mo59983a("author_id", this.f89262b).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: a */
    public final void mo65780a(View view, int i) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: a */
    public final void mo65781a(View view, View view2) {
        C89219l.m154721d(view2, "");
        C89219l.m154721d(view2, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: b */
    public final void mo65783b(View view, View view2) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        Context context = view2.getContext();
        C89219l.m154716b(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        double d = (double) resources.getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        Context context2 = view2.getContext();
        C89219l.m154716b(context2, "");
        Resources resources2 = context2.getResources();
        C89219l.m154716b(resources2, "");
        double d2 = (double) resources2.getDisplayMetrics().heightPixels;
        Double.isNaN(d2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (d * 0.64d), (int) (d2 * 0.64d));
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }
}
