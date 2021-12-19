package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.m */
public abstract class AbstractC0975m extends PagerAdapter {

    /* renamed from: a */
    private final AbstractC0952i f3462a;

    /* renamed from: b */
    private AbstractC0976n f3463b;

    /* renamed from: c */
    private ArrayList<Fragment.SavedState> f3464c = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<Fragment> f3465d = new ArrayList<>();

    /* renamed from: e */
    private Fragment f3466e = null;

    static {
        Covode.recordClassIndex(1068);
    }

    /* renamed from: a */
    public abstract Fragment mo3649a(int i);

    @Override // androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        Bundle bundle;
        if (this.f3464c.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f3464c.size()];
            this.f3464c.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f3465d.size(); i++) {
            Fragment fragment = this.f3465d.get(i);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3462a.mo3553a(bundle, "f".concat(String.valueOf(i)), fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0976n nVar = this.f3463b;
        if (nVar != null) {
            nVar.mo3478e();
            this.f3463b = null;
        }
    }

    public AbstractC0975m(AbstractC0952i iVar) {
        this.f3462a = iVar;
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

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f3465d.size() > i && (fragment = this.f3465d.get(i)) != null) {
            return fragment;
        }
        if (this.f3463b == null) {
            this.f3463b = this.f3462a.mo3552a();
        }
        Fragment a = mo3649a(i);
        if (this.f3464c.size() > i && (savedState = this.f3464c.get(i)) != null) {
            a.setInitialSavedState(savedState);
        }
        while (this.f3465d.size() <= i) {
            this.f3465d.add(null);
        }
        a.setMenuVisibility(false);
        a.setUserVisibleHint(false);
        this.f3465d.set(i, a);
        this.f3463b.mo3453a(viewGroup.getId(), a);
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.util.ArrayList<androidx.fragment.app.Fragment$SavedState> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.viewpager.widget.PagerAdapter
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3464c.clear();
            this.f3465d.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3464c.add(parcelable2);
                }
            }
            for (T t : bundle.keySet()) {
                if (t.startsWith("f")) {
                    int parseInt = Integer.parseInt(t.substring(1));
                    Fragment a = this.f3462a.mo3550a(bundle, t);
                    if (a != null) {
                        while (this.f3465d.size() <= parseInt) {
                            this.f3465d.add(null);
                        }
                        a.setMenuVisibility(false);
                        this.f3465d.set(parseInt, a);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3466e;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                this.f3466e.setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f3466e = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.f3463b == null) {
            this.f3463b = this.f3462a.mo3552a();
        }
        while (this.f3464c.size() <= i) {
            this.f3464c.add(null);
        }
        ArrayList<Fragment.SavedState> arrayList = this.f3464c;
        if (fragment.isAdded()) {
            savedState = this.f3462a.mo3548a(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.f3465d.set(i, null);
        this.f3463b.mo3455a(fragment);
    }
}
