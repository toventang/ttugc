package com.zhihu.matisse.internal.p4516ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActivityC0218d;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.google.android.play.core.p1965d.C26975a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.C87955b;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.p4514b.C87949c;
import com.zhihu.matisse.internal.p4515c.C87951b;
import com.zhihu.matisse.internal.p4516ui.p4517a.C87969c;
import com.zhihu.matisse.internal.p4516ui.widget.C87984b;
import com.zhihu.matisse.internal.p4516ui.widget.CheckRadioView;
import com.zhihu.matisse.internal.p4516ui.widget.CheckView;
import com.zhihu.matisse.p4512b.AbstractC87940b;

/* renamed from: com.zhihu.matisse.internal.ui.a */
public abstract class AbstractView$OnClickListenerC87958a extends ActivityC0218d implements View.OnClickListener, ViewPager.AbstractC1579e, AbstractC87940b {

    /* renamed from: a */
    protected final C87949c f199771a = new C87949c(this);

    /* renamed from: b */
    protected C87956c f199772b;

    /* renamed from: c */
    protected ViewPager f199773c;

    /* renamed from: d */
    protected C87969c f199774d;

    /* renamed from: e */
    protected CheckView f199775e;

    /* renamed from: f */
    protected TextView f199776f;

    /* renamed from: g */
    protected TextView f199777g;

    /* renamed from: h */
    protected TextView f199778h;

    /* renamed from: i */
    protected int f199779i = -1;

    /* renamed from: j */
    public CheckRadioView f199780j;

    /* renamed from: k */
    protected boolean f199781k;

    /* renamed from: l */
    private LinearLayout f199782l;

    /* renamed from: m */
    private FrameLayout f199783m;

    /* renamed from: n */
    private FrameLayout f199784n;

    /* renamed from: o */
    private boolean f199785o = false;

    static {
        Covode.recordClassIndex(103977);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        m153016a(false);
        super.onBackPressed();
    }

    /* renamed from: d */
    public final int mo142491d() {
        int e = this.f199771a.mo142464e();
        int i = 0;
        for (int i2 = 0; i2 < e; i2++) {
            Item item = this.f199771a.mo142457b().get(i2);
            if (item.mo142474a() && C87951b.m152996a(item.f199739d) > ((float) this.f199772b.f199766t)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    private void mo142452a() {
        this.f199780j.setChecked(this.f199781k);
        if (!this.f199781k) {
            this.f199780j.setColor(-1);
        }
        if (mo142491d() > 0 && this.f199781k) {
            C87984b.m153051a("", getString(R.string.d1e, new Object[]{Integer.valueOf(this.f199772b.f199766t)})).show(getSupportFragmentManager(), C87984b.class.getName());
            this.f199780j.setChecked(false);
            this.f199780j.setColor(-1);
            this.f199781k = false;
        }
    }

    /* renamed from: c */
    public final void mo142490c() {
        int e = this.f199771a.mo142464e();
        if (e == 0) {
            this.f199777g.setText(R.string.d18);
            this.f199777g.setEnabled(false);
        } else if (e != 1 || !this.f199772b.mo142483a()) {
            this.f199777g.setEnabled(true);
            this.f199777g.setText(getString(R.string.d17, new Object[]{Integer.valueOf(e)}));
        } else {
            this.f199777g.setText(R.string.d18);
            this.f199777g.setEnabled(true);
        }
        if (this.f199772b.f199764r) {
            this.f199782l.setVisibility(0);
            mo142452a();
            return;
        }
        this.f199782l.setVisibility(8);
    }

    @Override // com.zhihu.matisse.p4512b.AbstractC87940b
    /* renamed from: b */
    public final void mo142438b() {
        if (this.f199772b.f199765s) {
            if (this.f199785o) {
                this.f199784n.animate().setInterpolator(new C0995b()).translationYBy((float) this.f199784n.getMeasuredHeight()).start();
                this.f199783m.animate().translationYBy((float) (-this.f199783m.getMeasuredHeight())).setInterpolator(new C0995b()).start();
            } else {
                this.f199784n.animate().setInterpolator(new C0995b()).translationYBy((float) (-this.f199784n.getMeasuredHeight())).start();
                this.f199783m.animate().setInterpolator(new C0995b()).translationYBy((float) this.f199783m.getMeasuredHeight()).start();
            }
            this.f199785o = !this.f199785o;
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        Context b = C53457c.m98656b(context);
        C26975a.m53596a(b, false);
        super.attachBaseContext(b);
    }

    /* renamed from: b */
    public final boolean mo142489b(Item item) {
        C87955b d = this.f199771a.mo142462d(item);
        C87955b.m153008a(this, d);
        if (d == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        this.f199771a.mo142458b(bundle);
        bundle.putBoolean("checkState", this.f199781k);
        super.onSaveInstanceState(bundle);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.a05) {
            onBackPressed();
        } else if (view.getId() == R.id.a04) {
            m153016a(true);
            finish();
        }
    }

    /* renamed from: a */
    private void m153016a(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.f199771a.mo142454a());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.f199781k);
        setResult(-1, intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r4.f199771a.mo142463d() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r4.f199771a.mo142463d() == false) goto L_0x006c;
     */
    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageSelected(int r5) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.p4516ui.AbstractView$OnClickListenerC87958a.onPageSelected(int):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo142487a(Item item) {
        if (item.mo142475b()) {
            this.f199778h.setVisibility(0);
            this.f199778h.setText(C87951b.m152996a(item.f199739d) + "M");
        } else {
            this.f199778h.setVisibility(8);
        }
        if (item.mo142476c()) {
            this.f199782l.setVisibility(8);
        } else if (this.f199772b.f199764r) {
            this.f199782l.setVisibility(0);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        setTheme(C87956c.C87957a.f199768a.f199750d);
        super.onCreate(bundle);
        if (!C87956c.C87957a.f199768a.f199762p) {
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.bl);
        int i = Build.VERSION.SDK_INT;
        getWindow().addFlags(67108864);
        C87956c cVar = C87956c.C87957a.f199768a;
        this.f199772b = cVar;
        if (cVar.mo142484b()) {
            setRequestedOrientation(this.f199772b.f199751e);
        }
        if (bundle == null) {
            C87949c cVar2 = this.f199771a;
            Bundle bundleExtra = getIntent().getBundleExtra("extra_default_bundle");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            cVar2.mo142455a(bundleExtra);
            this.f199781k = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.f199771a.mo142455a(bundle);
            this.f199781k = bundle.getBoolean("checkState");
        }
        this.f199776f = (TextView) findViewById(R.id.a05);
        this.f199777g = (TextView) findViewById(R.id.a04);
        this.f199778h = (TextView) findViewById(R.id.e1k);
        this.f199776f.setOnClickListener(this);
        this.f199777g.setOnClickListener(this);
        ViewPager viewPager = (ViewPager) findViewById(R.id.cys);
        this.f199773c = viewPager;
        viewPager.addOnPageChangeListener(this);
        C87969c cVar3 = new C87969c(getSupportFragmentManager());
        this.f199774d = cVar3;
        this.f199773c.setAdapter(cVar3);
        CheckView checkView = (CheckView) findViewById(R.id.a4k);
        this.f199775e = checkView;
        checkView.setCountable(this.f199772b.f199752f);
        this.f199783m = (FrameLayout) findViewById(R.id.vj);
        this.f199784n = (FrameLayout) findViewById(R.id.em6);
        this.f199775e.setOnClickListener(new View.OnClickListener() {
            /* class com.zhihu.matisse.internal.p4516ui.AbstractView$OnClickListenerC87958a.View$OnClickListenerC879591 */

            static {
                Covode.recordClassIndex(103978);
            }

            public final void onClick(View view) {
                if (AbstractView$OnClickListenerC87958a.this.f199774d.getCount() > 0) {
                    Item c = AbstractView$OnClickListenerC87958a.this.f199774d.mo142506c(AbstractView$OnClickListenerC87958a.this.f199773c.getCurrentItem());
                    if (AbstractView$OnClickListenerC87958a.this.f199771a.mo142461c(c)) {
                        AbstractView$OnClickListenerC87958a.this.f199771a.mo142459b(c);
                        if (AbstractView$OnClickListenerC87958a.this.f199772b.f199752f) {
                            AbstractView$OnClickListenerC87958a.this.f199775e.setCheckedNum(Integer.MIN_VALUE);
                        } else {
                            AbstractView$OnClickListenerC87958a.this.f199775e.setChecked(false);
                        }
                    } else if (AbstractView$OnClickListenerC87958a.this.mo142489b(c)) {
                        AbstractView$OnClickListenerC87958a.this.f199771a.mo142456a(c);
                        if (AbstractView$OnClickListenerC87958a.this.f199772b.f199752f) {
                            AbstractView$OnClickListenerC87958a.this.f199775e.setCheckedNum(AbstractView$OnClickListenerC87958a.this.f199771a.mo142465e(c));
                        } else {
                            AbstractView$OnClickListenerC87958a.this.f199775e.setChecked(true);
                        }
                    }
                    AbstractView$OnClickListenerC87958a.this.mo142490c();
                    if (AbstractView$OnClickListenerC87958a.this.f199772b.f199763q != null) {
                        AbstractView$OnClickListenerC87958a.this.f199771a.mo142460c();
                    }
                }
            }
        });
        this.f199782l = (LinearLayout) findViewById(R.id.cxr);
        this.f199780j = (CheckRadioView) findViewById(R.id.cxq);
        this.f199782l.setOnClickListener(new View.OnClickListener() {
            /* class com.zhihu.matisse.internal.p4516ui.AbstractView$OnClickListenerC87958a.View$OnClickListenerC879602 */

            static {
                Covode.recordClassIndex(103979);
            }

            public final void onClick(View view) {
                int d = AbstractView$OnClickListenerC87958a.this.mo142491d();
                if (d > 0) {
                    C87984b.m153051a("", AbstractView$OnClickListenerC87958a.this.getString(R.string.d1d, new Object[]{Integer.valueOf(d), Integer.valueOf(AbstractView$OnClickListenerC87958a.this.f199772b.f199766t)})).show(AbstractView$OnClickListenerC87958a.this.getSupportFragmentManager(), C87984b.class.getName());
                    return;
                }
                AbstractView$OnClickListenerC87958a aVar = AbstractView$OnClickListenerC87958a.this;
                aVar.f199781k = true ^ aVar.f199781k;
                AbstractView$OnClickListenerC87958a.this.f199780j.setChecked(AbstractView$OnClickListenerC87958a.this.f199781k);
                if (!AbstractView$OnClickListenerC87958a.this.f199781k) {
                    AbstractView$OnClickListenerC87958a.this.f199780j.setColor(-1);
                }
            }
        });
        mo142490c();
    }
}
