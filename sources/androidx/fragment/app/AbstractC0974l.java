package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.fragment.app.l */
public abstract class AbstractC0974l extends PagerAdapter {

    /* renamed from: a */
    private final AbstractC0952i f3459a;

    /* renamed from: b */
    private AbstractC0976n f3460b;

    /* renamed from: c */
    private Fragment f3461c;

    static {
        Covode.recordClassIndex(1067);
    }

    /* renamed from: a */
    public abstract Fragment mo3639a(int i);

    /* renamed from: b */
    public long mo3640b(int i) {
        return (long) i;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public AbstractC0974l(AbstractC0952i iVar) {
        this.f3459a = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0976n nVar = this.f3460b;
        if (nVar != null) {
            nVar.mo3478e();
            this.f3460b = null;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
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
    private static String m3366a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f3460b == null) {
            this.f3460b = this.f3459a.mo3552a();
        }
        long b = mo3640b(i);
        Fragment a = this.f3459a.mo3551a(m3366a(viewGroup.getId(), b));
        if (a != null) {
            this.f3460b.mo3477e(a);
        } else {
            a = mo3639a(i);
            this.f3460b.mo3454a(viewGroup.getId(), a, m3366a(viewGroup.getId(), b));
        }
        if (a != this.f3461c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f3460b == null) {
            this.f3460b = this.f3459a.mo3552a();
        }
        this.f3460b.mo3475d((Fragment) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3461c;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f3461c.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f3461c = fragment;
        }
    }
}
