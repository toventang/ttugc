package com.bytedance.tux.tooltip.p1727a.p1729b;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1722h.C23155d;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.AbstractC23332b;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23330b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.tooltip.a.b.a */
public final class C23329a extends AbstractC23332b<C23329a> {

    /* renamed from: c */
    private CharSequence f55292c = "";

    /* renamed from: d */
    private int f55293d;

    /* renamed from: e */
    private int f55294e;

    /* renamed from: f */
    private AbstractC89172b<? super ImageView, C89391z> f55295f;

    static {
        Covode.recordClassIndex(27282);
    }

    @Override // com.bytedance.tux.tooltip.AbstractC23332b
    /* renamed from: d */
    public final AbstractC23317a mo38012d() {
        C23330b bVar = new C23330b(this.f55301b, (byte) 0);
        CharSequence charSequence = this.f55292c;
        C89219l.m154719c(charSequence, "");
        TuxTextView tuxTextView = (TuxTextView) bVar.f55296a.findViewById(R.id.cj9);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(charSequence);
        if (!TextUtils.isEmpty(charSequence)) {
            TuxTextView tuxTextView2 = (TuxTextView) bVar.f55296a.findViewById(R.id.cj9);
            C89219l.m154709a((Object) tuxTextView2, "");
            tuxTextView2.setVisibility(0);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) bVar.f55296a.findViewById(R.id.cj9);
            C89219l.m154709a((Object) tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
        int i = this.f55293d;
        C22999a a = C23005c.m43393a(new C23330b.C23331a(i, this.f55294e));
        Context context = bVar.getContext();
        C89219l.m154709a((Object) context, "");
        ((ImageView) bVar.f55296a.findViewById(R.id.bky)).setImageDrawable(a.mo37368a(context));
        if (i != 0) {
            ImageView imageView = (ImageView) bVar.f55296a.findViewById(R.id.bky);
            C89219l.m154709a((Object) imageView, "");
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = (ImageView) bVar.f55296a.findViewById(R.id.bky);
            C89219l.m154709a((Object) imageView2, "");
            imageView2.setVisibility(8);
        }
        bVar.setCustomImage(this.f55295f);
        mo38031a(bVar);
        return super.mo38012d();
    }

    /* renamed from: a */
    public final C23329a mo38022a(CharSequence charSequence) {
        C89219l.m154719c(charSequence, "");
        this.f55292c = charSequence;
        return this;
    }

    /* renamed from: e */
    public final C23329a mo38023e(int i) {
        String string = this.f55301b.getString(i);
        C89219l.m154709a((Object) string, "");
        this.f55292c = string;
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23329a(Context context) {
        super(context);
        C89219l.m154719c(context, "");
        int[] iArr = {R.attr.gm, R.attr.gn, R.attr.go, R.attr.gp, R.attr.gq, R.attr.gr, R.attr.gs, R.attr.gt, R.attr.gu};
        C89219l.m154709a((Object) iArr, "");
        Integer a = C23155d.m43642a(context, iArr, 6);
        if (a != null) {
            mo38028a(a.intValue());
        }
    }
}
