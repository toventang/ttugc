package com.p2082ss.android.ugc.aweme.legoImp.task.uitask;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.p1708b.C22982f;
import com.bytedance.tux.p1710c.C23001b;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58264w;
import com.p2082ss.android.ugc.aweme.lego.AbstractC58265x;
import com.p2082ss.android.ugc.aweme.lego.EnumC58148ab;
import com.p2082ss.android.ugc.aweme.lego.EnumC58150ad;
import com.p2082ss.android.ugc.aweme.lego.EnumC58151ae;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4160a.C79344a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4162c.C79366a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4163d.C79395a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4164e.C79397a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4164e.C79407b;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4164e.C79411c;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4165f.C79415a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4167h.C79446a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.uitask.TuxInitTask */
public final class TuxInitTask implements AbstractC58264w {
    static {
        Covode.recordClassIndex(68711);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    public final int bQ_() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: f */
    public final EnumC58150ad mo28606f() {
        return AbstractC58265x.m105221a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: g */
    public final String mo28607g() {
        return "task_";
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: i */
    public final boolean mo28609i() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: j */
    public final List mo28610j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58264w
    /* renamed from: b */
    public final EnumC58151ae mo28601b() {
        return EnumC58151ae.BACKGROUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: k */
    public final EnumC58148ab mo28611k() {
        return EnumC58148ab.DEFAULT;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: h */
    public final String mo28608h() {
        return getClass().getSimpleName();
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.AbstractC58252n
    /* renamed from: a */
    public final void mo28600a(Context context) {
        boolean z;
        if (context != null) {
            C89219l.m154721d(context, "");
            if (C16048b.m29633a().mo25412a(true, "tux_config_lazy_load", 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            C22982f.f54340a = z;
            C22982f.f54341b.mo37295a(R.attr.ap2, C79366a.C79367a.f178285a);
            C22982f.f54341b.mo37295a(R.attr.aok, C79344a.C79345a.f178264a).mo37295a(R.attr.aom, C79344a.C79350b.f178269a).mo37295a(R.attr.cu, C79344a.C79362c.f178281a);
            C22982f.f54341b.mo37295a(R.attr.ap6, C79395a.C79396a.f178313a);
            C22982f.f54341b.mo37295a(R.attr.aop, C79397a.C79398a.f178314a).mo37295a(R.attr.aoq, C79397a.C79401b.f178317a).mo37295a(R.attr.cv, C79397a.C79404c.f178320a);
            C22982f.f54341b.mo37295a(R.attr.er, C79407b.C79408a.f178323a);
            C22982f.f54341b.mo37295a(R.attr.fg, C79411c.C79412a.f178326a);
            C22982f.f54341b.mo37295a(R.attr.ar_, C79446a.C79447a.f178358a).mo37295a(R.attr.g4, C79446a.C79456b.f178367a);
            C22982f.f54341b.mo37295a(R.attr.apw, C79415a.C79416a.f178329a).mo37295a(R.attr.apx, C79415a.C79429b.f178342a);
            C23001b.f54438e = C16048b.m29633a().mo25421a(true, "enable_graw", false);
        }
    }
}
