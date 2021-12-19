package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.AbstractC0320p;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class AbstractC0290b implements AbstractC0318o {

    /* renamed from: a */
    protected Context f1018a;

    /* renamed from: b */
    protected Context f1019b;

    /* renamed from: c */
    public C0302h f1020c;

    /* renamed from: d */
    protected LayoutInflater f1021d;

    /* renamed from: e */
    protected LayoutInflater f1022e;

    /* renamed from: f */
    public AbstractC0318o.AbstractC0319a f1023f;

    /* renamed from: g */
    public AbstractC0320p f1024g;

    /* renamed from: h */
    public int f1025h;

    /* renamed from: i */
    private int f1026i = R.layout.a5;

    /* renamed from: j */
    private int f1027j = R.layout.a4;

    static {
        Covode.recordClassIndex(327);
    }

    /* renamed from: a */
    public abstract void mo893a(C0306j jVar, AbstractC0320p.AbstractC0321a aVar);

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public boolean mo896a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo898a(C0306j jVar) {
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final boolean mo901b(C0306j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: c */
    public final boolean mo902c(C0306j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: b */
    public final int mo900b() {
        return this.f1025h;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public boolean mo899a(SubMenuC0328u uVar) {
        AbstractC0318o.AbstractC0319a aVar = this.f1023f;
        if (aVar != null) {
            return aVar.mo560a(uVar);
        }
        return false;
    }

    public AbstractC0290b(Context context) {
        this.f1018a = context;
        this.f1021d = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public AbstractC0320p mo890a(ViewGroup viewGroup) {
        if (this.f1024g == null) {
            AbstractC0320p pVar = (AbstractC0320p) C1764a.m5927a(this.f1021d, this.f1026i, viewGroup, false);
            this.f1024g = pVar;
            pVar.mo817a(this.f1020c);
            mo895a(true);
        }
        return this.f1024g;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo894a(AbstractC0318o.AbstractC0319a aVar) {
        this.f1023f = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public void mo895a(boolean z) {
        C0306j jVar;
        ViewGroup viewGroup = (ViewGroup) this.f1024g;
        if (viewGroup != null) {
            C0302h hVar = this.f1020c;
            int i = 0;
            if (hVar != null) {
                hVar.mo991j();
                ArrayList<C0306j> i2 = this.f1020c.mo989i();
                int size = i2.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    C0306j jVar2 = i2.get(i4);
                    if (mo898a(jVar2)) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (childAt instanceof AbstractC0320p.AbstractC0321a) {
                            jVar = ((AbstractC0320p.AbstractC0321a) childAt).getItemData();
                        } else {
                            jVar = null;
                        }
                        View a = mo889a(jVar2, childAt, viewGroup);
                        if (jVar2 != jVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.f1024g).addView(a, i3);
                        }
                        i3++;
                    }
                }
                i = i3;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo897a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public void mo892a(C0302h hVar, boolean z) {
        AbstractC0318o.AbstractC0319a aVar = this.f1023f;
        if (aVar != null) {
            aVar.mo559a(hVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public void mo891a(Context context, C0302h hVar) {
        this.f1019b = context;
        this.f1022e = LayoutInflater.from(context);
        this.f1020c = hVar;
    }

    /* renamed from: a */
    public boolean mo897a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public View mo889a(C0306j jVar, View view, ViewGroup viewGroup) {
        AbstractC0320p.AbstractC0321a aVar;
        if (view instanceof AbstractC0320p.AbstractC0321a) {
            aVar = (AbstractC0320p.AbstractC0321a) view;
        } else {
            aVar = (AbstractC0320p.AbstractC0321a) C1764a.m5927a(this.f1021d, this.f1027j, viewGroup, false);
        }
        mo893a(jVar, aVar);
        return (View) aVar;
    }
}
