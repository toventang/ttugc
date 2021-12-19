package com.bytedance.tux.tooltip.p1727a.p1728a;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.tooltip.a.a.b */
public final class C23319b extends AbstractC23332b<C23319b> {

    /* renamed from: c */
    public List<? extends AbstractC23318a> f55267c = C89086z.INSTANCE;

    /* renamed from: d */
    public int f55268d = -1;

    /* renamed from: e */
    public int f55269e = -1;

    /* renamed from: f */
    public C23008e f55270f;

    static {
        Covode.recordClassIndex(27272);
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23332b
    /* renamed from: d */
    public final AbstractC23317a mo38012d() {
        mo38037a(true, (View.OnClickListener) null);
        C23320c cVar = new C23320c(this.f55301b, (byte) 0);
        cVar.setActions(this.f55267c);
        int i = this.f55268d;
        if (i >= 0) {
            cVar.setMinimumWidth(i);
        }
        C23008e eVar = this.f55270f;
        if (eVar != null) {
            Context context = cVar.getContext();
            C89219l.m154709a((Object) context, "");
            cVar.setDividerDrawable(eVar.mo37389a(context));
        }
        int i2 = this.f55269e;
        if (i2 >= 0) {
            cVar.setDividerPadding(i2);
        }
        mo38031a(cVar);
        return super.mo38012d();
    }

    /* renamed from: a */
    public final C23319b mo38011a(AbstractC89172b<? super C23322d, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        C23322d dVar = new C23322d(this.f55301b);
        bVar.invoke(dVar);
        this.f55267c = dVar.f55272a;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23319b(Context context) {
        super(context);
        C89219l.m154719c(context, "");
        int[] iArr = {R.attr.gm, R.attr.gn, R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu};
        C89219l.m154709a((Object) iArr, "");
        Integer a = C23155d.m43642a(context, iArr, 0);
        if (a != null) {
            mo38028a(a.intValue());
        }
    }
}
