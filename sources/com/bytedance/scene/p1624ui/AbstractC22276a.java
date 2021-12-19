package com.bytedance.scene.p1624ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.group.AbstractC22213f;

/* renamed from: com.bytedance.scene.ui.a */
public abstract class AbstractC22276a extends PagerAdapter {

    /* renamed from: a */
    private AbstractC22186b f52688a;

    /* renamed from: b */
    private AbstractC22213f f52689b;

    static {
        Covode.recordClassIndex(26089);
    }

    /* renamed from: a */
    public abstract AbstractC22213f mo36583a(int i);

    public AbstractC22276a(AbstractC22186b bVar) {
        this.f52688a = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((AbstractC22219j) obj).f52550n == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int id = viewGroup.getId();
        if (id != -1) {
            String concat = "android:switcher:".concat(String.valueOf((long) i));
            ViewPager viewPager = (ViewPager) viewGroup;
            AbstractC22213f fVar = (AbstractC22213f) this.f52688a.mo36386a(concat);
            if (fVar != null) {
                m41951a(viewPager, fVar, i);
                this.f52688a.mo36417e(fVar);
                return fVar;
            }
            AbstractC22213f a = mo36583a(i);
            m41951a(viewPager, a, i);
            this.f52688a.mo36387a(id, a, concat);
            return a;
        }
        throw new IllegalArgumentException("ViewPager should have view id before use ScenePageAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        this.f52688a.mo36400c((AbstractC22219j) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        AbstractC22213f fVar = (AbstractC22213f) obj;
        AbstractC22213f fVar2 = this.f52689b;
        if (fVar != fVar2) {
            if (fVar2 != null) {
                fVar2.mo36459a(false);
            }
            if (fVar != null) {
                fVar.mo36459a(true);
            }
            this.f52689b = fVar;
        }
    }

    /* renamed from: a */
    private void m41951a(ViewPager viewPager, AbstractC22213f fVar, int i) {
        if (this.f52689b == null && viewPager.getCurrentItem() == i) {
            this.f52689b = fVar;
        }
        if (fVar == this.f52689b) {
            if (fVar.f52519c) {
                fVar.mo36459a(false);
            }
            fVar.mo36459a(true);
        } else if (fVar.f52519c) {
            fVar.mo36459a(false);
        }
    }
}
