package com.lynx.p2032b.p2033a.p2039f;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.lynx.p2032b.p2033a.C28194a;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28216e;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28217f;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28218g;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28219h;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28220i;
import com.lynx.p2032b.p2033a.p2035b.C28224c;
import com.lynx.p2032b.p2033a.p2035b.EnumC28223b;
import com.lynx.p2032b.p2033a.p2038e.C28230b;
import com.lynx.p2032b.p2033a.p2038e.C28231c;

/* renamed from: com.lynx.b.a.f.a */
public abstract class AbstractC28233a extends RelativeLayout implements AbstractC28218g {

    /* renamed from: w */
    protected View f66197w;

    /* renamed from: x */
    protected C28224c f66198x;

    /* renamed from: y */
    protected AbstractC28218g f66199y;

    static {
        Covode.recordClassIndex(34179);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    public View getView() {
        View view = this.f66197w;
        if (view == null) {
            return this;
        }
        return view;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    public C28224c getSpinnerStyle() {
        C28224c cVar = this.f66198x;
        if (cVar != null) {
            return cVar;
        }
        AbstractC28218g gVar = this.f66199y;
        if (!(gVar == null || gVar == this)) {
            return gVar.getSpinnerStyle();
        }
        View view = this.f66197w;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof C28194a.C28210c) {
                C28224c cVar2 = ((C28194a.C28210c) layoutParams).f66124b;
                this.f66198x = cVar2;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            if (layoutParams != null && (layoutParams.height == 0 || layoutParams.height == -1)) {
                C28224c[] cVarArr = C28224c.f66147f;
                for (C28224c cVar3 : cVarArr) {
                    if (cVar3.f66150i) {
                        this.f66198x = cVar3;
                        return cVar3;
                    }
                }
            }
        }
        C28224c cVar4 = C28224c.f66142a;
        this.f66198x = cVar4;
        return cVar4;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    /* renamed from: a */
    public boolean mo30707a() {
        AbstractC28218g gVar = this.f66199y;
        if (gVar == null || gVar == this || !gVar.mo30707a()) {
            return false;
        }
        return true;
    }

    public AbstractC28233a(Context context) {
        super(context, null, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractC28233a(android.view.View r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
            if (r0 == 0) goto L_0x000b
            r0 = r2
            com.lynx.b.a.a.g r0 = (com.lynx.p2032b.p2033a.p2034a.AbstractC28218g) r0
        L_0x0007:
            r1.<init>(r2, r0)
            return
        L_0x000b:
            r0 = 0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.p2039f.AbstractC28233a.<init>(android.view.View):void");
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    public void setPrimaryColors(int... iArr) {
        AbstractC28218g gVar = this.f66199y;
        if (gVar != null && gVar != this) {
            gVar.setPrimaryColors(iArr);
        }
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof AbstractC28218g) || getView() != ((AbstractC28218g) obj).getView()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo48310a(boolean z) {
        AbstractC28218g gVar = this.f66199y;
        if (!(gVar instanceof AbstractC28216e) || !((AbstractC28216e) gVar).mo30708a(z)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    /* renamed from: a */
    public int mo30701a(AbstractC28220i iVar, boolean z) {
        AbstractC28218g gVar = this.f66199y;
        if (gVar == null || gVar == this) {
            return 0;
        }
        return gVar.mo30701a(iVar, z);
    }

    private AbstractC28233a(View view, AbstractC28218g gVar) {
        super(view.getContext(), null, 0);
        this.f66197w = view;
        this.f66199y = gVar;
        if ((this instanceof C28230b) && (gVar instanceof AbstractC28217f) && gVar.getSpinnerStyle() == C28224c.f66146e) {
            gVar.getView().setScaleY(-1.0f);
        } else if (this instanceof C28231c) {
            AbstractC28218g gVar2 = this.f66199y;
            if ((gVar2 instanceof AbstractC28216e) && gVar2.getSpinnerStyle() == C28224c.f66146e) {
                gVar.getView().setScaleY(-1.0f);
            }
        }
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    /* renamed from: b */
    public void mo30709b(AbstractC28220i iVar, int i, int i2) {
        AbstractC28218g gVar = this.f66199y;
        if (gVar != null && gVar != this) {
            gVar.mo30709b(iVar, i, i2);
        }
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    /* renamed from: a */
    public void mo30702a(float f, int i, int i2) {
        AbstractC28218g gVar = this.f66199y;
        if (gVar != null && gVar != this) {
            gVar.mo30702a(f, i, i2);
        }
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    /* renamed from: a */
    public final void mo30703a(AbstractC28219h hVar, int i, int i2) {
        AbstractC28218g gVar = this.f66199y;
        if (gVar == null || gVar == this) {
            View view = this.f66197w;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof C28194a.C28210c) {
                    hVar.mo48281a(this, ((C28194a.C28210c) layoutParams).f66123a);
                    return;
                }
                return;
            }
            return;
        }
        gVar.mo30703a(hVar, i, i2);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    /* renamed from: a */
    public void mo30704a(AbstractC28220i iVar, int i, int i2) {
        AbstractC28218g gVar = this.f66199y;
        if (gVar != null && gVar != this) {
            gVar.mo30704a(iVar, i, i2);
        }
    }

    @Override // com.lynx.p2032b.p2033a.p2040g.AbstractC28239f
    /* renamed from: a */
    public void mo30705a(AbstractC28220i iVar, EnumC28223b bVar, EnumC28223b bVar2) {
        AbstractC28218g gVar = this.f66199y;
        if (gVar != null && gVar != this) {
            if ((this instanceof C28230b) && (gVar instanceof AbstractC28217f)) {
                if (bVar.isFooter) {
                    bVar = bVar.toHeader();
                }
                if (bVar2.isFooter) {
                    bVar2 = bVar2.toHeader();
                }
            } else if ((this instanceof C28231c) && (gVar instanceof AbstractC28216e)) {
                if (bVar.isHeader) {
                    bVar = bVar.toFooter();
                }
                if (bVar2.isHeader) {
                    bVar2 = bVar2.toFooter();
                }
            }
            AbstractC28218g gVar2 = this.f66199y;
            if (gVar2 != null) {
                gVar2.mo30705a(iVar, bVar, bVar2);
            }
        }
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g
    /* renamed from: a */
    public void mo30706a(boolean z, float f, int i, int i2, int i3) {
        AbstractC28218g gVar = this.f66199y;
        if (gVar != null && gVar != this) {
            gVar.mo30706a(z, f, i, i2, i3);
        }
    }
}
