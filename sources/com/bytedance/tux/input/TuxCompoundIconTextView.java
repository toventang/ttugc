package com.bytedance.tux.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

public final class TuxCompoundIconTextView extends TuxTextView {

    /* renamed from: a */
    private C23001b f54850a;

    /* renamed from: b */
    private C23001b f54851b;

    /* renamed from: e */
    private C23001b f54852e;

    /* renamed from: f */
    private C23001b f54853f;

    static {
        Covode.recordClassIndex(27102);
    }

    public TuxCompoundIconTextView(Context context) {
        this(context, null, 0, 6);
    }

    public TuxCompoundIconTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: a */
    private final void m43684a() {
        if (C23163i.m43664a(this)) {
            setCompoundDrawablesWithIntrinsicBounds(this.f54851b, this.f54852e, this.f54850a, this.f54853f);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(this.f54850a, this.f54852e, this.f54851b, this.f54853f);
        }
    }

    public final void setBottomIcon(C22999a aVar) {
        C89219l.m154719c(aVar, "");
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f54853f = aVar.mo37368a(context);
        m43684a();
    }

    public final void setEndIcon(C22999a aVar) {
        C89219l.m154719c(aVar, "");
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f54851b = aVar.mo37368a(context);
        m43684a();
    }

    public final void setStartIcon(C22999a aVar) {
        C89219l.m154719c(aVar, "");
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f54850a = aVar.mo37368a(context);
        m43684a();
    }

    public final void setTopIcon(C22999a aVar) {
        C89219l.m154719c(aVar, "");
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        this.f54852e = aVar.mo37368a(context);
        m43684a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.input.TuxCompoundIconTextView$a */
    public static final class C23171a extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ int f54854a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f54855b;

        /* renamed from: c */
        final /* synthetic */ int f54856c;

        /* renamed from: d */
        final /* synthetic */ int f54857d;

        /* renamed from: e */
        final /* synthetic */ boolean f54858e;

        static {
            Covode.recordClassIndex(27103);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23171a(int i, C89233z.C89238e eVar, int i2, int i3, boolean z) {
            super(1);
            this.f54854a = i;
            this.f54855b = eVar;
            this.f54856c = i2;
            this.f54857d = i3;
            this.f54858e = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154719c(aVar2, "");
            aVar2.f54431a = this.f54854a;
            aVar2.f54434d = this.f54855b.element;
            aVar2.f54432b = this.f54856c;
            aVar2.f54433c = this.f54857d;
            aVar2.f54436f = this.f54858e;
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxCompoundIconTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap7, R.attr.ap8, R.attr.ap_, R.attr.apa, R.attr.apb, R.attr.apc, R.attr.apd, R.attr.apf, R.attr.apg, R.attr.aph, R.attr.api, R.attr.apj, R.attr.apk, R.attr.apm, R.attr.apn, R.attr.apo, R.attr.app, R.attr.ark, R.attr.arl, R.attr.arm, R.attr.arn}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        this.f54850a = m43683a(obtainStyledAttributes, 11, 19, 15, 4, 9);
        this.f54851b = m43683a(obtainStyledAttributes, 1, 18, 14, 3, 8);
        this.f54852e = m43683a(obtainStyledAttributes, 12, 20, 16, 5, 10);
        this.f54853f = m43683a(obtainStyledAttributes, 0, 17, 13, 2, 7);
        setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        obtainStyledAttributes.recycle();
        m43684a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ TuxCompoundIconTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.ce : i);
    }

    /* renamed from: a */
    private final C23001b m43683a(TypedArray typedArray, int i, int i2, int i3, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = null;
        if (typedArray.hasValue(i2)) {
            eVar.element = (T) Integer.valueOf(typedArray.getColor(i2, 0));
        }
        C22999a a = C23005c.m43393a(new C23171a(resourceId, eVar, typedArray.getDimensionPixelSize(i3, -1), typedArray.getDimensionPixelSize(i4, -1), typedArray.getBoolean(i5, false)));
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        return a.mo37368a(context);
    }
}
