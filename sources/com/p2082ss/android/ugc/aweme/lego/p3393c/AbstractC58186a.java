package com.p2082ss.android.ugc.aweme.lego.p3393c;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.lego.c.a */
public abstract class AbstractC58186a extends AbstractC58188b<Fragment> {

    /* renamed from: a */
    private AbstractC0952i f132495a;

    /* renamed from: b */
    private AbstractC0976n f132496b;

    /* renamed from: com.ss.android.ugc.aweme.lego.c.a$a */
    public interface AbstractC58187a {
        static {
            Covode.recordClassIndex(68253);
        }
    }

    static {
        Covode.recordClassIndex(68252);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
    }

    public AbstractC58186a(AbstractC0952i iVar) {
        this.f132495a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0976n nVar = this.f132496b;
        if (nVar != null) {
            nVar.mo3473c();
            this.f132496b = null;
            this.f132495a.mo3560b();
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
    private static String m105095a(int i, long j) {
        return "android:switcher:" + i + ':' + j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Fragment mo70816b(ViewGroup viewGroup, int i) {
        Fragment fragment = (Fragment) this.f132497d.get(i);
        if (fragment == null) {
            return null;
        }
        String a = m105095a(viewGroup.getId(), (long) i);
        if (this.f132495a.mo3551a(a) == null) {
            if (this.f132496b == null) {
                this.f132496b = this.f132495a.mo3552a();
            }
            this.f132496b.mo3454a(viewGroup.getId(), fragment, a);
            this.f132497d.remove(i);
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f132496b == null) {
            this.f132496b = this.f132495a.mo3552a();
        }
        String a = m105095a(viewGroup.getId(), (long) i);
        Fragment a2 = this.f132495a.mo3551a(a);
        if (a2 == null) {
            a2 = (Fragment) mo62762a(i);
            if (a2 instanceof AbstractC58187a) {
                this.f132497d.put(i, a2);
            } else {
                this.f132496b.mo3454a(viewGroup.getId(), a2, a);
            }
        } else {
            this.f132496b.mo3477e(a2);
        }
        if (this.f132498e != a2) {
            a2.setUserVisibleHint(false);
            a2.setMenuVisibility(false);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f132496b == null) {
            this.f132496b = this.f132495a.mo3552a();
        }
        if (this.f132495a.mo3551a(m105095a(viewGroup.getId(), (long) i)) != null) {
            this.f132497d.remove(i);
        } else {
            this.f132496b.mo3475d((Fragment) obj);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58188b
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (mo70817b(i)) {
            startUpdate(viewGroup);
            mo70816b(viewGroup, i);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f132498e) {
            if (this.f132498e != null) {
                ((Fragment) this.f132498e).setUserVisibleHint(false);
                ((Fragment) this.f132498e).setMenuVisibility(false);
            }
            if (fragment != null) {
                fragment.setUserVisibleHint(true);
                fragment.setMenuVisibility(true);
            }
            this.f132498e = fragment;
        }
    }
}
