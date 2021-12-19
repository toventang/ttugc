package com.bytedance.ies.bullet.p1141e.p1144c;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.bullet.service.base.C16615b;
import com.bytedance.ies.bullet.service.base.C16645f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.e.c.a */
public final class C16285a {
    static {
        Covode.recordClassIndex(18578);
    }

    /* renamed from: a */
    public static final BulletContainerView m30273a(View view) {
        if (view == null || !(view instanceof BulletContainerView)) {
            return null;
        }
        return (BulletContainerView) view;
    }

    /* renamed from: com.bytedance.ies.bullet.e.c.a$a */
    public static final class C16286a extends AbstractC89220m implements AbstractC89172b<ViewGroup, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f39114a;

        static {
            Covode.recordClassIndex(18579);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16286a(View view) {
            super(1);
            this.f39114a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ViewGroup viewGroup) {
            MethodCollector.m26663i(8110);
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154719c(viewGroup2, "");
            viewGroup2.removeView(this.f39114a);
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(8110);
            return zVar;
        }
    }

    /* renamed from: a */
    public static final C16645f m30272a(C16615b bVar) {
        C89219l.m154719c(bVar, "");
        return new C16645f(bVar.f39768a, bVar.f39769b, bVar.f39771d);
    }

    /* renamed from: com.bytedance.ies.bullet.e.c.a$b */
    public static final class C16287b extends AbstractC89220m implements AbstractC89172b<ViewGroup, C89391z> {

        /* renamed from: a */
        final /* synthetic */ BulletContainerView f39115a;

        /* renamed from: b */
        final /* synthetic */ BulletContainerView f39116b;

        static {
            Covode.recordClassIndex(18580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16287b(BulletContainerView bulletContainerView, BulletContainerView bulletContainerView2) {
            super(1);
            this.f39115a = bulletContainerView;
            this.f39116b = bulletContainerView2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ViewGroup viewGroup) {
            MethodCollector.m26663i(5906);
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154719c(viewGroup2, "");
            viewGroup2.removeView(this.f39115a);
            viewGroup2.addView(this.f39116b, this.f39115a.getLayoutParams());
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(5906);
            return zVar;
        }
    }

    /* renamed from: a */
    public static final void m30274a(View view, AbstractC89172b<? super ViewGroup, C89391z> bVar) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(bVar, "");
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            bVar.invoke(parent);
        }
    }
}
