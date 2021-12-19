package com.bytedance.android.live.core.widget;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.p025c.C0484a;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;

public class StateLayout extends FrameLayout implements View.OnClickListener {

    /* renamed from: a */
    public boolean f11050a;

    /* renamed from: b */
    public boolean f11051b;

    /* renamed from: c */
    private Map<String, View> f11052c;

    /* renamed from: d */
    private Map<View, String> f11053d;

    /* renamed from: e */
    private Map<String, AbstractC4030a> f11054e;

    /* renamed from: f */
    private String f11055f;

    /* renamed from: g */
    private View f11056g;

    /* renamed from: h */
    private View f11057h;

    /* renamed from: i */
    private View f11058i;

    /* renamed from: j */
    private View f11059j;

    /* renamed from: k */
    private TransitionSet f11060k;

    /* renamed from: l */
    private TransitionSet f11061l;

    /* renamed from: com.bytedance.android.live.core.widget.StateLayout$a */
    public interface AbstractC4030a {
        static {
            Covode.recordClassIndex(4571);
        }

        /* renamed from: a */
        void mo9424a();
    }

    static {
        Covode.recordClassIndex(4570);
    }

    public void setInTransition(TransitionSet transitionSet) {
        this.f11060k = transitionSet;
    }

    public void setOutTransition(TransitionSet transitionSet) {
        this.f11061l = transitionSet;
    }

    public void setContentView(View view) {
        m9835a("CONTENT", view);
    }

    public void setContentViewSrc(int i) {
        mo9407a("CONTENT", i);
    }

    public void setEmptyView(View view) {
        m9835a("EMPTY", view);
    }

    public void setEmptyViewSrc(int i) {
        mo9407a("EMPTY", i);
    }

    public void setErrorView(View view) {
        m9835a("ERROR", view);
    }

    public void setErrorViewSrc(int i) {
        mo9407a("ERROR", i);
    }

    public void setLoadingView(View view) {
        m9835a("LOADING", view);
    }

    public void setLoadingViewSrc(int i) {
        mo9407a("LOADING", i);
    }

    public void setOfflineView(View view) {
        m9835a("OFFLINE", view);
    }

    public void setOfflineViewSrc(int i) {
        mo9407a("OFFLINE", i);
    }

    public void onClick(View view) {
        AbstractC4030a aVar = this.f11054e.get(this.f11053d.get(view));
        if (aVar != null) {
            aVar.mo9424a();
        }
    }

    public void setEmptyClickListener(AbstractC4030a aVar) {
        this.f11054e.put("EMPTY", aVar);
        View view = this.f11057h;
        if (view != null) {
            view.setOnClickListener(this);
            this.f11053d.put(this.f11057h, "EMPTY");
        } else if (this.f11052c.containsKey("EMPTY")) {
            this.f11052c.get("EMPTY").setOnClickListener(this);
            this.f11053d.put(this.f11052c.get("EMPTY"), "EMPTY");
        }
    }

    public void setErrorClickListener(AbstractC4030a aVar) {
        this.f11054e.put("ERROR", aVar);
        View view = this.f11058i;
        if (view != null) {
            view.setOnClickListener(this);
            this.f11053d.put(this.f11058i, "ERROR");
        } else if (this.f11052c.containsKey("ERROR")) {
            this.f11052c.get("ERROR").setOnClickListener(this);
            this.f11053d.put(this.f11052c.get("ERROR"), "ERROR");
        }
    }

    public void setOfflineClickListener(AbstractC4030a aVar) {
        this.f11054e.put("OFFLINE", aVar);
        View view = this.f11059j;
        if (view != null) {
            view.setOnClickListener(this);
            this.f11053d.put(this.f11059j, "OFFLINE");
        } else if (this.f11052c.containsKey("OFFLINE")) {
            this.f11052c.get("OFFLINE").setOnClickListener(this);
            this.f11053d.put(this.f11052c.get("OFFLINE"), "OFFLINE");
        }
    }

    /* renamed from: a */
    public final void mo9406a(String str) {
        if (!str.equals(this.f11055f)) {
            if (this.f11052c.containsKey(this.f11055f)) {
                if (this.f11051b && this.f11061l != null) {
                    int i = Build.VERSION.SDK_INT;
                    TransitionManager.beginDelayedTransition(this, new TransitionSet().addTransition(this.f11061l).addTarget(this.f11052c.get(this.f11055f)));
                }
                this.f11052c.get(this.f11055f).setVisibility(8);
            }
            if (this.f11052c.containsKey(str)) {
                if (this.f11050a && this.f11060k != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    TransitionManager.beginDelayedTransition(this, new TransitionSet().addTransition(this.f11060k).addTarget(this.f11052c.get(str)));
                }
                this.f11052c.get(str).setVisibility(0);
            }
            this.f11055f = str;
        }
    }

    public StateLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private void m9835a(String str, View view) {
        this.f11052c.put(str, view);
        view.setVisibility(8);
        if (view.getParent() != this) {
            addView(view);
            if (this.f11054e.containsKey(str)) {
                view.setOnClickListener(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo9407a(String str, int i) {
        if (i == -1) {
            m9835a(str, this.f11056g);
        } else {
            m9835a(str, C1764a.m5927a(LayoutInflater.from(getContext()), i, this, false));
        }
    }

    private StateLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(12283);
        this.f11052c = new C0484a();
        this.f11053d = new C0484a();
        this.f11054e = new C0484a();
        this.f11056g = new FrameLayout(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.pv, R.attr.sh, R.attr.si, R.attr.t5, R.attr.t8, R.attr.a3l, R.attr.a6g, R.attr.a6h, R.attr.asn, R.attr.asp}, 0, 0);
        setLoadingViewSrc(obtainStyledAttributes.getResourceId(5, -1));
        setContentViewSrc(obtainStyledAttributes.getResourceId(0, -1));
        setEmptyViewSrc(obtainStyledAttributes.getResourceId(2, -1));
        setErrorViewSrc(obtainStyledAttributes.getResourceId(4, -1));
        setOfflineViewSrc(obtainStyledAttributes.getResourceId(7, -1));
        this.f11057h = findViewById(obtainStyledAttributes.getResourceId(1, 0));
        this.f11058i = findViewById(obtainStyledAttributes.getResourceId(3, 0));
        this.f11059j = findViewById(obtainStyledAttributes.getResourceId(6, 0));
        this.f11050a = obtainStyledAttributes.getBoolean(8, true);
        this.f11051b = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        int i = Build.VERSION.SDK_INT;
        this.f11060k = new TransitionSet().addTransition(new Fade(1)).setDuration(300L).setInterpolator((TimeInterpolator) new AccelerateInterpolator());
        this.f11061l = new TransitionSet().addTransition(new Fade(2)).setDuration(300L).setInterpolator((TimeInterpolator) new DecelerateInterpolator());
        MethodCollector.m26664o(12283);
    }
}
