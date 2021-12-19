package com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.commerce.sdk.p2517b.p2518a.AbstractC37530a;
import com.p2082ss.android.ugc.aweme.commerce.sdk.p2517b.p2519b.p2520a.C37531a;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a.C44490a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.p2843b.p2844a.C44491b;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.p2845a.AbstractC44498a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.indicator.NumberIndicator;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c;
import com.p2082ss.android.ugc.trill.R;
import dmt.viewpager.DmtRtlViewPager;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e */
public final class C44507e extends FrameLayout implements AbstractC37530a {

    /* renamed from: a */
    public C44529c f103785a;

    /* renamed from: b */
    protected BounceBackViewPager f103786b;

    /* renamed from: c */
    public C44503d f103787c;

    /* renamed from: d */
    public C44496a f103788d;

    /* renamed from: e */
    public int f103789e = 1;

    /* renamed from: f */
    boolean f103790f;

    /* renamed from: g */
    float f103791g;

    /* renamed from: h */
    public ViewPager.AbstractC1579e f103792h = new ViewPager.C1582h() {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e.C445081 */

        static {
            Covode.recordClassIndex(52858);
        }

        @Override // androidx.viewpager.widget.ViewPager.C1582h, androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("position", C44507e.this.f103786b.getCurrentItem());
                jSONObject.put("identity", C44507e.this.f103787c.f103751g);
                jSONObject.put("from", C44507e.this.f103787c.f103752h);
                jSONObject.put(StringSet.type, 0);
                EventCenter.m87158a().mo75479a("ec_gallery_new_image_viewed", jSONObject.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (i == C44507e.this.f103787c.f103765u) {
                C44507e.this.mo75524a(i - 1);
                return;
            }
            C44507e.this.f103787c.f103745a = i % C44507e.this.f103787c.f103765u;
            if (C44507e.this.f103787c.f103749e) {
                C44507e.this.mo75522a(i, 0);
            } else {
                for (int i2 = 1; i2 <= C44507e.this.f103789e; i2++) {
                    C44507e.this.mo75522a(i, i2);
                }
            }
            if (C44507e.this.f103787c.f103763s != null) {
                C44507e.this.f103787c.f103763s.mo75519a(C44507e.this.f103786b.getCurrentItem());
            }
        }
    };

    /* renamed from: i */
    C44529c.AbstractC44536b f103793i = new C44529c.AbstractC44536b() {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e.C445103 */

        static {
            Covode.recordClassIndex(52860);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c.AbstractC44536b
        /* renamed from: a */
        public final void mo75541a() {
            C44507e.this.f103790f = true;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c.AbstractC44536b
        /* renamed from: a */
        public final void mo75542a(int i, float f) {
            ImageView imageView;
            C44507e.this.f103791g = 255.0f * f;
            C44507e eVar = C44507e.this;
            eVar.setBackgroundColor(eVar.mo75520a(eVar.f103791g));
            if (((double) f) <= 0.05d && i == 2 && (imageView = C44507e.this.f103787c.mo75516a().get(C44507e.this.f103787c.f103745a)) != null) {
                imageView.setVisibility(0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c.AbstractC44536b
        /* renamed from: a */
        public final void mo75543a(int i, int i2, int i3) {
            C44507e.this.f103790f = false;
            if (i2 == 100) {
                if (i == 1) {
                    C44507e.this.mo75527d();
                    C44507e.this.f103786b.setVisibility(0);
                    C44507e.m87203a(C44507e.this.f103785a);
                } else if (i == 2) {
                    C44507e.this.mo75521a();
                }
            } else if (i != 1) {
                if (i == 2 && i3 == 201) {
                    C44507e.this.mo75521a();
                }
            } else if (i3 == 201) {
                C44507e.this.mo75527d();
                C44507e.this.f103786b.setVisibility(0);
                C44507e.m87203a(C44507e.this.f103785a);
            }
        }
    };

    /* renamed from: j */
    C44517b.AbstractC44526e f103794j = new C44517b.AbstractC44526e() {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e.C445114 */

        static {
            Covode.recordClassIndex(52861);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44517b.AbstractC44526e
        /* renamed from: a */
        public final void mo75544a(float f) {
            if (f > 1.0f) {
                C44507e.this.mo75528e();
            } else {
                C44507e.this.mo75529f();
            }
        }
    };

    /* renamed from: k */
    private AbstractC44498a f103795k;

    /* renamed from: l */
    private AbstractC44513a f103796l;

    /* renamed from: m */
    private Set<Integer> f103797m;

    /* renamed from: n */
    private Context f103798n;

    /* renamed from: o */
    private AbstractC44498a.AbstractC44499a f103799o = new AbstractC44498a.AbstractC44499a() {
        /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e.C445092 */

        static {
            Covode.recordClassIndex(52859);
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.p2845a.AbstractC44498a.AbstractC44499a
        /* renamed from: a */
        public final void mo75509a() {
            C44507e.this.f103786b.mo61356a(C44507e.this.f103792h);
            int i = C44507e.this.f103787c.f103745a;
            if (C44507e.this.f103787c.f103749e) {
                C44507e.this.mo75522a(i, 0);
            } else {
                C44507e.this.mo75522a(i, 1);
            }
        }
    };

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.gallery.transfer.e$a */
    public interface AbstractC44513a {
        static {
            Covode.recordClassIndex(52863);
        }

        /* renamed from: a */
        void mo75546a();
    }

    static {
        Covode.recordClassIndex(52857);
    }

    public final Context getActivityContext() {
        return this.f103798n;
    }

    public final C44517b.AbstractC44526e getOnScaleListener() {
        return this.f103794j;
    }

    public final AbstractC44498a getTransAdapter() {
        return this.f103795k;
    }

    public final C44503d getTransConfig() {
        return this.f103787c;
    }

    public final C44529c.AbstractC44536b getTransListener() {
        return this.f103793i;
    }

    @Override // com.p2082ss.android.ugc.aweme.commerce.sdk.p2517b.p2518a.AbstractC37530a
    public final C44503d getTransferConfig() {
        return this.f103787c;
    }

    /* access modifiers changed from: package-private */
    public final DmtRtlViewPager getViewPager() {
        return this.f103786b;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: c */
    public final AbstractC44514f mo75526c() {
        return new C44500b(this);
    }

    /* access modifiers changed from: package-private */
    public final int getCurrentPosition() {
        return this.f103786b.getCurrentItem() % this.f103787c.f103765u;
    }

    /* renamed from: e */
    public final void mo75528e() {
        C44490a aVar = this.f103787c.f103757m;
        if (aVar != null && (this.f103787c.f103765u >= 2 || this.f103787c.f103761q)) {
            aVar.mo75488a();
        }
        C44491b bVar = this.f103787c.f103758n;
        if (bVar == null) {
            return;
        }
        if (this.f103787c.f103765u >= 2 || this.f103787c.f103761q) {
            bVar.mo75491a();
        }
    }

    /* renamed from: f */
    public final void mo75529f() {
        C44490a aVar = this.f103787c.f103757m;
        if (aVar != null && (this.f103787c.f103765u >= 2 || this.f103787c.f103761q)) {
            aVar.mo75490a(this.f103786b);
        }
        C44491b bVar = this.f103787c.f103758n;
        if (bVar == null) {
            return;
        }
        if (this.f103787c.f103765u >= 2 || this.f103787c.f103761q) {
            bVar.mo75492a(this.f103786b);
        }
    }

    /* renamed from: a */
    public final void mo75521a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        MethodCollector.m26663i(8788);
        this.f103790f = false;
        this.f103797m.clear();
        C44490a aVar = this.f103787c.f103757m;
        if (!(aVar == null || aVar.f103707a == null || (viewGroup2 = (ViewGroup) aVar.f103707a.getParent()) == null)) {
            viewGroup2.removeView(aVar.f103707a);
        }
        C44491b bVar = this.f103787c.f103758n;
        if (!(bVar == null || bVar.f103710a == null || (viewGroup = (ViewGroup) bVar.f103710a.getParent()) == null)) {
            viewGroup.removeView(bVar.f103710a);
        }
        removeAllViews();
        this.f103796l.mo75546a();
        MethodCollector.m26664o(8788);
    }

    /* renamed from: b */
    public final void mo75525b() {
        C37531a aVar = new C37531a(this, this.f103787c.f103754j.size(), this.f103787c.f103745a);
        this.f103795k = aVar;
        aVar.f103737c = this.f103799o;
        BounceBackViewPager bounceBackViewPager = new BounceBackViewPager(this.f103798n);
        this.f103786b = bounceBackViewPager;
        bounceBackViewPager.setOverScrollMode(2);
        setBackgroundColor(mo75520a(255.0f));
        this.f103786b.setVisibility(4);
        this.f103786b.setOffscreenPageLimit(this.f103789e + 1);
        this.f103786b.setAdapter(this.f103795k);
        this.f103786b.setCurrentItem(this.f103787c.f103745a);
        addView(this.f103786b, new FrameLayout.LayoutParams(-1, -1));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("position", this.f103786b.getCurrentItem());
            jSONObject.put("identity", this.f103787c.f103751g);
            jSONObject.put("from", this.f103787c.f103752h);
            jSONObject.put(StringSet.type, 1);
            EventCenter.m87158a().mo75479a("ec_gallery_new_image_viewed", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        int i = this.f103787c.f103745a;
        if (i < 0) {
            i = 0;
        }
        this.f103785a = mo75526c().mo75510a(i);
    }

    /* renamed from: d */
    public final void mo75527d() {
        MethodCollector.m26663i(8934);
        C44490a aVar = this.f103787c.f103757m;
        if (aVar != null && (this.f103787c.f103765u > 0 || this.f103787c.f103761q)) {
            aVar.f103709c = this;
            aVar.f103707a = LayoutInflater.from(getContext()).inflate(R.layout.or, (ViewGroup) null);
            aVar.f103708b = (NumberIndicator) aVar.f103707a.findViewById(R.id.d62);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            addView(aVar.f103707a, layoutParams);
            aVar.f103707a.setPadding(0, C34723i.m70927b(), 0, 0);
            aVar.mo75490a(this.f103786b);
        }
        C44491b bVar = this.f103787c.f103758n;
        if (bVar != null && (this.f103787c.f103765u > 0 || this.f103787c.f103761q)) {
            bVar.f103711b = this;
            bVar.f103710a = LayoutInflater.from(getContext()).inflate(R.layout.oq, (ViewGroup) null);
            bVar.f103712c = (TuxTextView) bVar.f103710a.findViewById(R.id.d6_);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 80;
            addView(bVar.f103710a, layoutParams2);
            bVar.mo75492a(this.f103786b);
        }
        MethodCollector.m26664o(8934);
    }

    public final void setOnLayoutResetListener(AbstractC44513a aVar) {
        this.f103796l = aVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C44496a aVar = this.f103788d;
        if (aVar != null) {
            aVar.mo75508a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public static void m87203a(View view) {
        MethodCollector.m26663i(8930);
        if (view == null) {
            MethodCollector.m26664o(8930);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        MethodCollector.m26664o(8930);
    }

    /* renamed from: b */
    private void m87204b(int i) {
        mo75526c().mo75513b(i % this.f103787c.f103754j.size());
    }

    C44507e(Context context) {
        super(context);
        MethodCollector.m26663i(8786);
        this.f103798n = context;
        this.f103797m = new HashSet();
        MethodCollector.m26664o(8786);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo75520a(float f) {
        int i = this.f103787c.f103747c;
        return Color.argb(Math.round(f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C44529c cVar;
        C44496a aVar;
        if (motionEvent.getPointerCount() == 1 && (cVar = this.f103785a) != null && !cVar.f103858l && !cVar.f103859m && (aVar = this.f103788d) != null && motionEvent.getPointerCount() == 1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                aVar.f103730a = motionEvent.getRawX();
                aVar.f103731b = motionEvent.getRawY();
            } else if (action == 1) {
                aVar.f103731b = 0.0f;
            } else if (action == 2 && motionEvent.getRawY() - aVar.f103731b > ((float) aVar.f103732c)) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo75524a(int i) {
        if (this.f103790f) {
            return false;
        }
        C44529c cVar = this.f103785a;
        if (cVar != null && cVar.getState() == 2) {
            return false;
        }
        if (this.f103787c.f103762r != null) {
            this.f103787c.f103762r.mo75518a();
        }
        if (this.f103787c.f103750f <= 0 || i < this.f103787c.f103750f) {
            this.f103785a = mo75526c().mo75514c(i);
        } else {
            this.f103785a = null;
        }
        if (this.f103785a == null) {
            mo75521a();
        } else {
            this.f103786b.setVisibility(4);
        }
        mo75528e();
        return true;
    }

    /* renamed from: a */
    public final void mo75523a(final C44529c cVar, final int i) {
        cVar.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e.View$OnClickListenerC445125 */

            static {
                Covode.recordClassIndex(52862);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                C44529c cVar = cVar;
                if (cVar.f103860n == 0.0f && cVar.f103861o == 1.0f && cVar.getTranslationX() == 0.0f && cVar.getTranslationY() == 0.0f) {
                    C44507e.this.mo75524a(i);
                } else {
                    cVar.mo75559c();
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo75522a(int i, int i2) {
        int i3 = i - i2;
        int i4 = i2 + i;
        m87204b(i);
        this.f103797m.add(Integer.valueOf(i));
        if (i3 >= 0 && !this.f103797m.contains(Integer.valueOf(i3))) {
            m87204b(i3);
            this.f103797m.add(Integer.valueOf(i3));
        }
        if (i4 < this.f103787c.f103754j.size() && !this.f103797m.contains(Integer.valueOf(i4))) {
            m87204b(i4);
            this.f103797m.add(Integer.valueOf(i4));
        }
    }
}
