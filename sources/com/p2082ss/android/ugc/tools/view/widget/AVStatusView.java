package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.tools.view.p4365d.AbstractC84953a;
import com.p2082ss.android.ugc.tools.view.widget.C85008a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.tools.view.widget.AVStatusView */
public class AVStatusView extends FrameLayout implements AbstractC84953a, AbstractC85057l {

    /* renamed from: a */
    List<View> f190042a;

    /* renamed from: b */
    public int f190043b;

    /* renamed from: c */
    public boolean f190044c;

    /* renamed from: d */
    private int f190045d;

    static {
        Covode.recordClassIndex(98996);
    }

    /* renamed from: b */
    public final void mo129846b() {
        setVisibility(0);
        setStatus(0);
    }

    /* renamed from: c */
    public final void mo129847c() {
        setVisibility(0);
        setStatus(1);
    }

    /* renamed from: d */
    public final void mo129848d() {
        setVisibility(0);
        setStatus(2);
    }

    /* renamed from: com.ss.android.ugc.tools.view.widget.AVStatusView$a */
    public static class C84988a {

        /* renamed from: a */
        Context f190046a;

        /* renamed from: b */
        View f190047b;

        /* renamed from: c */
        public View f190048c;

        /* renamed from: d */
        View f190049d;

        /* renamed from: e */
        View f190050e;

        /* renamed from: f */
        View f190051f;

        /* renamed from: g */
        public int f190052g = -1;

        static {
            Covode.recordClassIndex(98997);
        }

        /* renamed from: a */
        private C84988a m146074a() {
            AVLoadingLayout aVLoadingLayout = new AVLoadingLayout(this.f190046a);
            aVLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f190047b = aVLoadingLayout;
            aVLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }

        /* renamed from: a */
        public static C84988a m146075a(Context context) {
            return new C84988a(context).m146074a();
        }

        private C84988a(Context context) {
            if (context != null) {
                this.f190046a = context;
                return;
            }
            throw new IllegalArgumentException("DmtStatusView.Builder:Context can not be null");
        }

        /* renamed from: a */
        private C84988a m146076a(C85008a aVar) {
            C85024b bVar = new C85024b(this.f190046a);
            bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            bVar.setStatus(aVar);
            this.f190048c = bVar;
            return this;
        }

        /* renamed from: a */
        public final C84988a mo129851a(int i) {
            return m146076a(new C85008a.C85009a(this.f190046a).mo129932a(i).f190184a);
        }

        /* renamed from: a */
        public final C84988a mo129852a(View view) {
            this.f190049d = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this;
        }
    }

    /* renamed from: a */
    public final void mo129845a() {
        int i = this.f190043b;
        if (i != -1) {
            View b = m146067b(i);
            if (b != null) {
                b.setVisibility(4);
            }
            setVisibility(4);
            this.f190043b = -1;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4365d.AbstractC84953a
    /* renamed from: a */
    public final void mo129712a(int i) {
        m146068c(i);
    }

    public AVStatusView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private View m146067b(int i) {
        if (i < 0 || i >= this.f190042a.size()) {
            return null;
        }
        return this.f190042a.get(i);
    }

    public void setStatus(int i) {
        View b;
        int i2 = this.f190043b;
        if (i2 != i) {
            if (i2 >= 0 && (b = m146067b(i2)) != null) {
                b.setVisibility(4);
            }
            if (i >= 0) {
                setVisibility(0);
                View b2 = m146067b(i);
                if (b2 != null) {
                    b2.setVisibility(0);
                }
            } else {
                setVisibility(4);
            }
            this.f190043b = i;
        }
    }

    /* renamed from: c */
    private void m146068c(int i) {
        if (i >= 0 && this.f190045d != i) {
            this.f190045d = i;
            View view = this.f190042a.get(0);
            if (view instanceof AVLoadingLayout) {
                ((AVLoadingLayout) view).mo129712a(this.f190045d);
            }
            View view2 = this.f190042a.get(1);
            if (view2 instanceof AbstractC84953a) {
                ((AbstractC84953a) view2).mo129712a(this.f190045d);
            }
            View view3 = this.f190042a.get(2);
            if (view3 instanceof C85024b) {
                ((C85024b) view3).mo129712a(this.f190045d);
            }
            View view4 = this.f190042a.get(3);
            if (view4 instanceof C85024b) {
                ((C85024b) view4).mo129712a(this.f190045d);
            }
            View view5 = this.f190042a.get(4);
            if (view5 instanceof C85024b) {
                ((C85024b) view5).mo129712a(this.f190045d);
            }
        }
    }

    public void setBuilder(C84988a aVar) {
        if (aVar == null) {
            aVar = C84988a.m146075a(getContext());
        }
        this.f190042a.clear();
        this.f190042a.add(aVar.f190047b);
        this.f190042a.add(aVar.f190048c);
        this.f190042a.add(aVar.f190049d);
        this.f190042a.add(aVar.f190050e);
        this.f190042a.add(aVar.f190051f);
        if (aVar.f190052g < 0) {
            aVar.f190052g = C63244g.m114602a().mo73259E().mo93881a();
        }
        m146068c(aVar.f190052g);
        removeAllViews();
        for (int i = 0; i < this.f190042a.size(); i++) {
            View view = this.f190042a.get(i);
            if (view != null) {
                view.setVisibility(4);
                addView(view);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.AbstractC85057l
    public void setUseScreenHeight(int i) {
        View view = this.f190042a.get(0);
        if (view instanceof AbstractC85057l) {
            ((AbstractC85057l) view).setUseScreenHeight(i);
        }
        View view2 = this.f190042a.get(1);
        if (view2 instanceof AbstractC85057l) {
            ((AbstractC85057l) view2).setUseScreenHeight(i);
        }
        View view3 = this.f190042a.get(2);
        if (view3 instanceof AbstractC85057l) {
            ((AbstractC85057l) view3).setUseScreenHeight(i);
        }
        View view4 = this.f190042a.get(3);
        if (view4 instanceof AbstractC85057l) {
            ((AbstractC85057l) view4).setUseScreenHeight(i);
        }
        View view5 = this.f190042a.get(4);
        if (view5 instanceof AbstractC85057l) {
            ((AbstractC85057l) view5).setUseScreenHeight(i);
        }
    }

    public AVStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private AVStatusView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(1037);
        this.f190042a = new ArrayList(5);
        this.f190043b = -1;
        this.f190045d = -1;
        this.f190044c = false;
        MethodCollector.m26664o(1037);
    }
}
