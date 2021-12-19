package com.p2082ss.android.ugc.aweme.social.widget.card.permission;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.p2082ss.android.ugc.aweme.social.widget.card.permission.C74808c;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell */
public abstract class PermissionSquareCell<T extends C74808c> extends PermissionCell<T> {

    /* renamed from: l */
    public static int f168124l;

    /* renamed from: m */
    public static final C74803a f168125m = new C74803a((byte) 0);

    /* renamed from: n */
    private final int f168126n = R.layout.b07;

    static {
        Covode.recordClassIndex(87656);
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell$a */
    public static final class C74803a {
        static {
            Covode.recordClassIndex(87657);
        }

        private C74803a() {
        }

        public /* synthetic */ C74803a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    /* renamed from: b */
    public final int mo117853b() {
        return this.f168126n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell$c */
    public static final class C74805c extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C74805c f168128a = new C74805c();

        static {
            Covode.recordClassIndex(87659);
        }

        C74805c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54466e = Integer.valueOf((int) R.color.f);
            eVar2.f54469h = 1;
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    /* renamed from: a */
    public void mo117848a(TuxIconView tuxIconView) {
        C89219l.m154721d(tuxIconView, "");
        C23008e a = C23009f.m43397a(C74805c.f168128a);
        Context context = tuxIconView.getContext();
        C89219l.m154716b(context, "");
        tuxIconView.setBackground(a.mo37389a(context));
    }

    /* renamed from: com.ss.android.ugc.aweme.social.widget.card.permission.PermissionSquareCell$b */
    static final class C74804b extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C74804b f168127a = new C74804b();

        static {
            Covode.recordClassIndex(87658);
        }

        C74804b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.w);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            eVar2.f54465d = 1;
            eVar2.f54467f = Integer.valueOf((int) R.attr.h);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.social.widget.card.permission.PermissionCell
    /* renamed from: b */
    public void mo117849b(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        C23008e a = C23009f.m43397a(C74804b.f168127a);
        Context context = viewGroup.getContext();
        C89219l.m154716b(context, "");
        viewGroup.setBackground(a.mo37389a(context));
        if (f168124l != 0) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = f168124l;
                viewGroup.setLayoutParams(layoutParams);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }
}
