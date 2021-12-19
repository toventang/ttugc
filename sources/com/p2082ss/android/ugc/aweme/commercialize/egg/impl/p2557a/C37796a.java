package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2557a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.drawee.view.C24262c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2559c.C37818a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2553b.AbstractC37785b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.a */
public final class C37796a implements AbstractC37781a {

    /* renamed from: h */
    public static final C37797a f89252h = new C37797a((byte) 0);

    /* renamed from: a */
    public String f89253a = "";

    /* renamed from: b */
    public String f89254b = "";

    /* renamed from: c */
    public String f89255c = "";

    /* renamed from: d */
    public String f89256d = "";

    /* renamed from: e */
    public String f89257e = "";

    /* renamed from: f */
    public String f89258f = "";

    /* renamed from: g */
    public String f89259g = "";

    static {
        Covode.recordClassIndex(45243);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: c */
    public final boolean mo65784c() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: d */
    public final boolean mo65785d() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.a.a$a */
    public static final class C37797a {
        static {
            Covode.recordClassIndex(45244);
        }

        private C37797a() {
        }

        public /* synthetic */ C37797a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: a */
    public final void mo65779a() {
        IAppLogDepend iAppLogDepend = C16091a.f38741a;
        if (iAppLogDepend != null) {
            iAppLogDepend.onEventV3Map("show_egg_ad", new C33744d().mo59983a("egg_ad_id", this.f89253a).mo59983a("comment_text", this.f89254b).mo59983a("scene_id", "1003").mo59983a("enter_from", this.f89259g).mo59983a("group_id", this.f89257e).mo59983a("author_id", this.f89258f).f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: b */
    public final void mo65782b() {
        IAppLogDepend iAppLogDepend = C16091a.f38741a;
        if (iAppLogDepend != null) {
            iAppLogDepend.onEventV3Map("show_egg_ad_fail", new C33744d().mo59983a("egg_ad_id", this.f89253a).mo59983a("comment_text", this.f89254b).mo59983a("scene_id", "1003").mo59983a("enter_from", this.f89259g).mo59983a("group_id", this.f89257e).mo59983a("author_id", this.f89258f).mo59983a("fail_type", "load_fail").f79943a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: a */
    public final void mo65781a(View view, View view2) {
        AbstractC24255a controller;
        Animatable i;
        C89219l.m154721d(view2, "");
        view2.setVisibility(8);
        if (view != null) {
            view.setVisibility(8);
            if ((view instanceof SimpleDraweeView) && (controller = ((C24262c) view).getController()) != null && (i = controller.mo39821i()) != null && i.isRunning()) {
                i.stop();
            }
        }
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
        int i = (int) (d * 0.64d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a
    /* renamed from: a */
    public final void mo65780a(View view, int i) {
        C89219l.m154721d(view, "");
        if (!TextUtils.isEmpty(this.f89255c) || !TextUtils.isEmpty(this.f89256d)) {
            AbstractC37785b a = C37818a.m76472a();
            if (a == null) {
                C89219l.m154715b();
            }
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            if (!a.mo65694b(context, this.f89256d)) {
                Context context2 = view.getContext();
                C89219l.m154716b(context2, "");
                a.mo65693a(context2, this.f89255c, "");
            }
            IAppLogDepend iAppLogDepend = C16091a.f38741a;
            if (iAppLogDepend != null) {
                iAppLogDepend.onEventV3Map("click_egg_ad", new C33744d().mo59983a("egg_ad_id", this.f89253a).mo59983a("comment_text", this.f89254b).mo59983a("scene_id", "1003").mo59983a("enter_from", this.f89259g).mo59983a("group_id", this.f89257e).mo59983a("author_id", this.f89258f).mo59980a("duration", i).f79943a);
            }
        }
    }
}
