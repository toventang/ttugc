package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.a */
public abstract class AbstractC72358a extends AbstractC72360b<Fragment> {

    /* renamed from: a */
    private AbstractC0952i f162226a;

    /* renamed from: d */
    private AbstractC0976n f162227d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.a$a */
    public interface AbstractC72359a {
        static {
            Covode.recordClassIndex(85029);
        }
    }

    static {
        Covode.recordClassIndex(85028);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
    }

    public AbstractC72358a(AbstractC0952i iVar) {
        this.f162226a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0976n nVar = this.f162227d;
        if (nVar != null) {
            nVar.mo3473c();
            this.f162227d = null;
            this.f162226a.mo3560b();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m127592a(int i, long j) {
        return "android:switcher:" + i + ':' + j;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Fragment mo114641a(ViewGroup viewGroup, int i) {
        Fragment fragment = (Fragment) this.f162228b.get(i);
        if (fragment == null) {
            return null;
        }
        String a = m127592a(viewGroup.getId(), (long) i);
        if (this.f162226a.mo3551a(a) == null) {
            if (this.f162227d == null) {
                this.f162227d = this.f162226a.mo3552a();
            }
            this.f162227d.mo3454a(viewGroup.getId(), fragment, a);
            this.f162228b.remove(i);
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f162227d == null) {
            this.f162227d = this.f162226a.mo3552a();
        }
        String a = m127592a(viewGroup.getId(), (long) i);
        Fragment a2 = this.f162226a.mo3551a(a);
        if (a2 == null) {
            a2 = (Fragment) mo114382a(i);
            if (a2 instanceof AbstractC72359a) {
                this.f162228b.put(i, a2);
            } else {
                this.f162227d.mo3454a(viewGroup.getId(), a2, a);
            }
        } else {
            this.f162227d.mo3477e(a2);
        }
        if (this.f162229c != a2) {
            a2.setUserVisibleHint(false);
            a2.setMenuVisibility(false);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f162227d == null) {
            this.f162227d = this.f162226a.mo3552a();
        }
        if (this.f162226a.mo3551a(m127592a(viewGroup.getId(), (long) i)) != null) {
            this.f162228b.remove(i);
        } else {
            this.f162227d.mo3475d((Fragment) obj);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.AbstractC72360b, androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (mo114642b(i)) {
            startUpdate(viewGroup);
            mo114641a(viewGroup, i);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f162229c) {
            if (this.f162229c != null) {
                ((Fragment) this.f162229c).setUserVisibleHint(false);
                ((Fragment) this.f162229c).setMenuVisibility(false);
            }
            if (fragment != null) {
                fragment.setUserVisibleHint(true);
                fragment.setMenuVisibility(true);
            }
            this.f162229c = fragment;
        }
    }
}
