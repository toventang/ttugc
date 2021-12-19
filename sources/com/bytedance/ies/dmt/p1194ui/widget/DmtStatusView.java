package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d;
import com.bytedance.ies.dmt.p1194ui.common.C17175b;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtStatusView */
public class DmtStatusView extends FrameLayout implements AbstractC17178d, AbstractC17279h {

    /* renamed from: a */
    List<View> f41293a;

    /* renamed from: b */
    private int f41294b;

    /* renamed from: c */
    private int f41295c;

    /* renamed from: d */
    private Boolean f41296d;

    /* renamed from: e */
    private boolean f41297e;

    static {
        Covode.recordClassIndex(19742);
    }

    public Boolean getForceDarkTheme() {
        return this.f41296d;
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.DmtStatusView$a */
    public static class C17269a {

        /* renamed from: a */
        public Context f41298a;

        /* renamed from: b */
        View f41299b;

        /* renamed from: c */
        View f41300c;

        /* renamed from: d */
        View f41301d;

        /* renamed from: e */
        public View f41302e;

        /* renamed from: f */
        View f41303f;

        /* renamed from: g */
        public int f41304g = -1;

        static {
            Covode.recordClassIndex(19743);
        }

        /* renamed from: a */
        public final C17269a mo27404a(C17273d dVar) {
            C17275e eVar = new C17275e(this.f41298a);
            eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            eVar.setStatus(dVar);
            this.f41300c = eVar;
            return this;
        }

        /* renamed from: a */
        public final C17269a mo27397a() {
            DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(this.f41298a);
            dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            mo27403a(dmtLoadingLayout);
            return this;
        }

        /* renamed from: b */
        public final C17269a mo27405b() {
            return mo27404a(new C17273d.C17274a(this.f41298a).mo27464c(R.string.cvn).f41365a);
        }

        /* renamed from: a */
        public static C17269a m31905a(Context context) {
            return new C17269a(context).mo27397a();
        }

        /* renamed from: b */
        public final C17269a mo27406b(View view) {
            this.f41300c = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: c */
        public final C17269a mo27408c(View view) {
            this.f41301d = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: d */
        public final C17269a mo27409d(View view) {
            this.f41302e = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: e */
        public final C17269a mo27410e(View view) {
            this.f41303f = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        public C17269a(Context context) {
            if (context != null) {
                this.f41298a = context;
                return;
            }
            throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
        }

        /* renamed from: a */
        public final C17269a mo27398a(int i) {
            return mo27407b(new C17273d.C17274a(this.f41298a).mo27464c(i).f41365a);
        }

        /* renamed from: b */
        public final C17269a mo27407b(C17273d dVar) {
            C17275e eVar = new C17275e(this.f41298a);
            eVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            eVar.setStatus(dVar);
            this.f41301d = eVar;
            return this;
        }

        /* renamed from: a */
        public final C17269a mo27402a(View.OnClickListener onClickListener) {
            mo27398a(R.string.cxh);
            this.f41301d.setOnClickListener(onClickListener);
            return this;
        }

        /* renamed from: a */
        public final C17269a mo27403a(View view) {
            this.f41299b = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: a */
        public final C17269a mo27399a(int i, int i2) {
            return mo27404a(new C17273d.C17274a(this.f41298a).mo27462b(i).mo27464c(i2).f41365a);
        }

        /* renamed from: a */
        public final C17269a mo27401a(int i, View.OnClickListener onClickListener) {
            return mo27407b(new C17273d.C17274a(this.f41298a).mo27462b(i).mo27464c(R.string.gzr).mo27459a(EnumC17270a.BORDER, R.string.gzy, onClickListener).f41365a);
        }

        /* renamed from: a */
        public final C17269a mo27400a(int i, int i2, int i3, int i4, View.OnClickListener onClickListener) {
            return mo27407b(new C17273d.C17274a(this.f41298a).mo27457a(i).mo27462b(i2).mo27464c(i3).mo27459a(EnumC17270a.BORDER, i4, onClickListener).f41365a);
        }
    }

    /* renamed from: f */
    public final void mo27384f() {
        setVisibility(0);
        setStatus(0);
    }

    /* renamed from: j */
    public boolean mo27389j() {
        if (this.f41294b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo27390k() {
        if (this.f41294b == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo27383e() {
        if (this.f41294b == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo27385g() {
        setVisibility(0);
        setStatus(1);
    }

    /* renamed from: h */
    public final void mo27387h() {
        setVisibility(0);
        setStatus(2);
    }

    /* renamed from: i */
    public final void mo27388i() {
        setVisibility(0);
        setStatus(3);
    }

    /* renamed from: l */
    public boolean mo27391l() {
        if (this.f41294b == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo27392m() {
        if (this.f41294b == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo27393n() {
        if (this.f41294b == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo27382d() {
        int i = this.f41294b;
        if (i != -1) {
            View b = mo27380b(i);
            if (b != null) {
                b.setVisibility(4);
            }
            setVisibility(4);
            this.f41294b = -1;
        }
    }

    /* renamed from: c */
    public C17269a mo27381c() {
        C17269a aVar = new C17269a(getContext());
        aVar.f41299b = this.f41293a.get(0);
        aVar.f41300c = this.f41293a.get(1);
        aVar.f41301d = this.f41293a.get(2);
        aVar.f41302e = this.f41293a.get(3);
        aVar.f41303f = this.f41293a.get(4);
        return aVar;
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.AbstractC17178d
    /* renamed from: a */
    public void mo27128a(int i) {
        mo85225c(i);
    }

    public DmtStatusView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo27379a(boolean z) {
        this.f41297e = z;
        mo27382d();
    }

    /* renamed from: b */
    public final View mo27380b(int i) {
        if (i < 0 || i >= this.f41293a.size()) {
            return null;
        }
        return this.f41293a.get(i);
    }

    public void setForceDarkTheme(Boolean bool) {
        this.f41296d = bool;
        if (bool.booleanValue()) {
            for (View view : this.f41293a) {
                if (view instanceof C17275e) {
                    ((C17275e) view).mo27467a(this.f41296d);
                }
            }
        }
    }

    public void setStatus(int i) {
        View b;
        int i2 = this.f41294b;
        if (i2 != i) {
            if (i2 >= 0 && (b = mo27380b(i2)) != null) {
                b.setVisibility(4);
            }
            if (i >= 0) {
                setVisibility(0);
                View b2 = mo27380b(i);
                if (b2 != null) {
                    b2.setVisibility(0);
                }
            } else {
                setVisibility(4);
            }
            this.f41294b = i;
        }
    }

    /* renamed from: c */
    private void mo85225c(int i) {
        if (i >= 0 && this.f41295c != i) {
            this.f41295c = i;
            View view = this.f41293a.get(0);
            if (view instanceof DmtLoadingLayout) {
                ((DmtLoadingLayout) view).mo27128a(this.f41295c);
            }
            View view2 = this.f41293a.get(1);
            if (view2 instanceof AbstractC17178d) {
                ((AbstractC17178d) view2).mo27128a(this.f41295c);
            }
            View view3 = this.f41293a.get(2);
            if (view3 instanceof C17275e) {
                ((C17275e) view3).mo27128a(this.f41295c);
            }
            View view4 = this.f41293a.get(3);
            if (view4 instanceof C17275e) {
                ((C17275e) view4).mo27128a(this.f41295c);
            }
            View view5 = this.f41293a.get(4);
            if (view5 instanceof C17275e) {
                ((C17275e) view5).mo27128a(this.f41295c);
            }
        }
    }

    public void setBuilder(C17269a aVar) {
        if (aVar == null) {
            aVar = C17269a.m31905a(getContext());
        }
        this.f41293a.clear();
        this.f41293a.add(aVar.f41299b);
        this.f41293a.add(aVar.f41300c);
        this.f41293a.add(aVar.f41301d);
        this.f41293a.add(aVar.f41302e);
        this.f41293a.add(aVar.f41303f);
        if (aVar.f41304g < 0) {
            aVar.f41304g = C17175b.C17176a.f40922a.f40921a;
        }
        mo85225c(aVar.f41304g);
        removeAllViews();
        for (int i = 0; i < this.f41293a.size(); i++) {
            View view = this.f41293a.get(i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.widget.AbstractC17279h
    public void setUseScreenHeight(int i) {
        View view = this.f41293a.get(0);
        if (view instanceof AbstractC17279h) {
            ((AbstractC17279h) view).setUseScreenHeight(i);
        }
        View view2 = this.f41293a.get(1);
        if (view2 instanceof AbstractC17279h) {
            ((AbstractC17279h) view2).setUseScreenHeight(i);
        }
        View view3 = this.f41293a.get(2);
        if (view3 instanceof AbstractC17279h) {
            ((AbstractC17279h) view3).setUseScreenHeight(i);
        }
        View view4 = this.f41293a.get(3);
        if (view4 instanceof AbstractC17279h) {
            ((AbstractC17279h) view4).setUseScreenHeight(i);
        }
        View view5 = this.f41293a.get(4);
        if (view5 instanceof AbstractC17279h) {
            ((AbstractC17279h) view5).setUseScreenHeight(i);
        }
    }

    public DmtStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DmtStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(11233);
        this.f41293a = new ArrayList(5);
        this.f41294b = -1;
        this.f41295c = -1;
        this.f41296d = false;
        this.f41297e = false;
        MethodCollector.m26664o(11233);
    }
}
