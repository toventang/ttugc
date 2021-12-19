package com.p2082ss.android.p2092ad.splash.core.p2099d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.core.C29495h;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29474p;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29622h;
import com.p2082ss.android.p2092ad.splash.core.video2.BDASplashVideoView;
import com.p2082ss.android.p2092ad.splash.core.video2.C29613c;
import com.p2082ss.android.p2092ad.splash.core.video2.C29614d;
import com.p2082ss.android.p2092ad.splash.core.video2.C29618f;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ad.splash.core.d.a */
public final class C29448a extends PagerAdapter {

    /* renamed from: a */
    public C29614d f69962a = new C29614d();

    /* renamed from: b */
    public List<AbstractC29622h> f69963b = new ArrayList(2);

    /* renamed from: c */
    private C29455b f69964c;

    /* renamed from: d */
    private Context f69965d;

    /* renamed from: e */
    private C29614d f69966e = new C29614d();

    /* renamed from: f */
    private boolean f69967f;

    static {
        Covode.recordClassIndex(35842);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: a */
    public final void mo51524a() {
        C29614d dVar = this.f69966e;
        if (dVar != null) {
            dVar.mo51872j();
            this.f69966e = null;
        }
        C29614d dVar2 = this.f69962a;
        if (dVar2 != null) {
            dVar2.mo51872j();
            this.f69962a = null;
        }
    }

    /* renamed from: a */
    public final AbstractC29621g mo51523a(int i) {
        if (i == 1) {
            return this.f69966e;
        }
        return this.f69962a;
    }

    public C29448a(Context context, C29455b bVar) {
        this.f69965d = context;
        this.f69964c = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        C29614d dVar;
        C29474p pVar;
        MethodCollector.m26663i(11013);
        BDASplashVideoView bDASplashVideoView = new BDASplashVideoView(this.f69965d);
        bDASplashVideoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewGroup.addView(bDASplashVideoView);
        this.f69963b.add(bDASplashVideoView);
        if (i == 1) {
            this.f69966e.mo51895a(bDASplashVideoView);
            dVar = this.f69966e;
            pVar = this.f69964c.f70040r;
        } else {
            this.f69962a.mo51895a(bDASplashVideoView);
            dVar = this.f69962a;
            pVar = this.f69964c.f70041s;
            this.f69962a.f70612e = new C29613c() {
                /* class com.p2082ss.android.p2092ad.splash.core.p2099d.C29448a.C294491 */

                static {
                    Covode.recordClassIndex(35843);
                }

                @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
                /* renamed from: b */
                public final void mo51487b(int i) {
                    C29448a.this.f69962a.mo51870h();
                }
            };
        }
        String b = C29654j.m59740b(pVar);
        if (C29657l.m59760a(b)) {
            MethodCollector.m26664o(11013);
            return bDASplashVideoView;
        }
        if (dVar.mo51862a(b, pVar.f70129i)) {
            if (!this.f69967f) {
                C29618f.m59608a().mo51907a(this.f69964c, C29495h.f70242r);
                this.f69967f = true;
            }
            if (i == 0) {
                this.f69962a.mo51860a(true);
            }
        }
        C29618f.m59608a().mo51908a(dVar, this.f69964c.f69990O, this.f69964c.mo51536c());
        MethodCollector.m26664o(11013);
        return bDASplashVideoView;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(11163);
        if (obj instanceof View) {
            viewGroup.removeView((View) obj);
        }
        if (obj instanceof AbstractC29622h) {
            this.f69963b.remove(obj);
        }
        if (i == 1) {
            C29614d dVar = this.f69966e;
            if (dVar != null) {
                dVar.mo51872j();
                this.f69966e = null;
                MethodCollector.m26664o(11163);
                return;
            }
        } else {
            C29614d dVar2 = this.f69962a;
            if (dVar2 != null) {
                dVar2.mo51872j();
                this.f69962a = null;
            }
        }
        MethodCollector.m26664o(11163);
    }
}
