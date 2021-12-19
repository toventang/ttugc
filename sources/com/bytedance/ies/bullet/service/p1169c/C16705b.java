package com.bytedance.ies.bullet.service.p1169c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.AbstractC16647h;
import com.bytedance.ies.bullet.service.base.AbstractC16650k;
import com.bytedance.ies.bullet.service.base.AbstractC16655p;
import com.bytedance.ies.bullet.service.base.AbstractC16656q;
import com.bytedance.ies.bullet.service.base.p1163a.C16588r;
import com.bytedance.ies.bullet.service.base.p1164b.C16616a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.c.b */
public final class C16705b extends C16616a implements AbstractC16656q {

    /* renamed from: a */
    private final AbstractC16655p f39881a;

    static {
        Covode.recordClassIndex(19145);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16572f
    /* renamed from: d */
    public final FrameLayout.LayoutParams mo26337d() {
        return this.f39881a.mo26417b();
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16572f
    /* renamed from: e */
    public final FrameLayout.LayoutParams mo26338e() {
        return this.f39881a.mo26419c();
    }

    public C16705b(AbstractC16655p pVar) {
        C89219l.m154719c(pVar, "");
        this.f39881a = pVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16572f
    /* renamed from: a */
    public final AbstractC16650k mo26334a(Context context) {
        C89219l.m154719c(context, "");
        return this.f39881a.mo26415a(context);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16572f
    /* renamed from: b */
    public final AbstractC16647h mo26336b(Context context) {
        C89219l.m154719c(context, "");
        return this.f39881a.mo26418b(context);
    }

    @Override // com.bytedance.ies.bullet.service.base.p1163a.AbstractC16572f
    /* renamed from: a */
    public final boolean mo26335a(Context context, Uri uri, C16588r rVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(uri, "");
        C89219l.m154719c(rVar, "");
        Class<Activity> a = this.f39881a.mo26416a();
        if (a == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, a));
        intent.setData(uri);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtras(rVar.f39715a);
        if (rVar.f39716b == null) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return true;
        }
        Bundle bundle = rVar.f39716b;
        C84349a.m145093a(intent, context);
        context.startActivity(intent, bundle);
        return true;
    }
}
