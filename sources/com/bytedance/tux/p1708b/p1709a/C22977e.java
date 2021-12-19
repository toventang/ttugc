package com.bytedance.tux.p1708b.p1709a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1710c.C23008e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.a.e */
public final class C22977e extends AbstractC22974b<View> {
    static {
        Covode.recordClassIndex(26894);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
    /* renamed from: a */
    public final /* synthetic */ boolean mo37290a(View view, int i, Object obj) {
        View view2 = view;
        C89219l.m154719c(view2, "");
        C89219l.m154719c(obj, "");
        if (i == C22983g.m43326a().f54332a) {
            C22983g.m43326a();
            C89219l.m154719c(obj, "");
            view2.setAlpha(((Number) obj).floatValue());
            return true;
        } else if (i == C22983g.m43328b().f54332a) {
            C22983g.m43328b();
            C89219l.m154719c(obj, "");
            view2.setBackgroundResource(((Number) obj).intValue());
            return true;
        } else if (i != C22983g.m43329c().f54332a) {
            return false;
        } else {
            C22983g.m43329c();
            C89219l.m154719c(obj, "");
            Context context = view2.getContext();
            C89219l.m154709a((Object) context, "");
            view2.setBackground(((C23008e) obj).mo37389a(context));
            return true;
        }
    }
}
