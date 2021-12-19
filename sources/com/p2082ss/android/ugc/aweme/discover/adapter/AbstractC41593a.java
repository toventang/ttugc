package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58186a;
import com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58188b;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.a */
public abstract class AbstractC41593a extends AbstractC58188b<Fragment> {

    /* renamed from: f */
    private static final C41594a f97016f = new C41594a((byte) 0);

    /* renamed from: a */
    private AbstractC0976n f97017a;

    /* renamed from: b */
    private final boolean f97018b = true;

    /* renamed from: c */
    private final AbstractC0952i f97019c;

    static {
        Covode.recordClassIndex(49506);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void startUpdate(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.a$a */
    static final class C41594a {
        static {
            Covode.recordClassIndex(49507);
        }

        private C41594a() {
        }

        public /* synthetic */ C41594a(byte b) {
            this();
        }
    }

    public AbstractC41593a(AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        this.f97019c = iVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58188b
    /* renamed from: b */
    public final boolean mo70817b(int i) {
        if (!this.f97018b || !super.mo70817b(i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void finishUpdate(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        AbstractC0976n nVar = this.f97017a;
        if (nVar != null) {
            nVar.mo3473c();
            this.f97017a = null;
            this.f97019c.mo3560b();
        }
    }

    /* renamed from: a */
    private static String m83535a(int i, long j) {
        return "ViewPager:Fragment:" + i + ':' + j;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        if (view == ((Fragment) obj).getView()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m83536a(Fragment fragment, String str) {
        if (fragment.isAdded()) {
            C51423a.m95784a(4, "TikTokSearch", "PagerAdapter added, ignoring");
            return false;
        } else if (this.f97019c.mo3551a(str) == null) {
            return true;
        } else {
            C51423a.m95784a(4, "TikTokSearch", "PagerAdapter manager already found the fragment ");
            return false;
        }
    }

    /* renamed from: a */
    public final Fragment mo70816b(ViewGroup viewGroup, int i) {
        Fragment fragment;
        C89219l.m154721d(viewGroup, "");
        if (!this.f97018b || (fragment = (Fragment) this.f132497d.get(i)) == null) {
            return null;
        }
        String a = m83535a(viewGroup.getId(), (long) i);
        if (this.f97019c.mo3551a(a) == null) {
            if (this.f97017a == null) {
                this.f97017a = this.f97019c.mo3552a();
            }
            AbstractC0976n nVar = this.f97017a;
            if (nVar == null) {
                C89219l.m154715b();
            }
            nVar.mo3454a(viewGroup.getId(), fragment, a);
            this.f132497d.remove(i);
        }
        return fragment;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Boolean bool;
        C89219l.m154721d(viewGroup, "");
        if (this.f97017a == null) {
            this.f97017a = this.f97019c.mo3552a();
        }
        String a = m83535a(viewGroup.getId(), (long) i);
        Fragment a2 = this.f97019c.mo3551a(a);
        String a3 = C67458j.m119528a(i);
        StringBuilder append = new StringBuilder("PagerAdapter instantiate check, pos: ").append(i).append(" (").append(a3).append("), added: ");
        Boolean bool2 = null;
        if (a2 != null) {
            bool = Boolean.valueOf(a2.isAdded());
        } else {
            bool = null;
        }
        C51423a.m95791b(4, "TikTokSearch", append.append(bool).toString());
        if (a2 == null) {
            a2 = (Fragment) mo62762a(i);
            StringBuilder append2 = new StringBuilder("PagerAdapter create, pos: ").append(i).append(" (").append(a3).append("), added: ");
            if (a2 != null) {
                bool2 = Boolean.valueOf(a2.isAdded());
            }
            C51423a.m95791b(4, "TikTokSearch", append2.append(bool2).toString());
            if (!this.f97018b || !(a2 instanceof AbstractC58186a.AbstractC58187a)) {
                C51423a.m95791b(4, "TikTokSearch", "PagerAdapter adding");
                C89219l.m154716b(a2, "");
                if (m83536a(a2, a)) {
                    AbstractC0976n nVar = this.f97017a;
                    if (nVar == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(nVar.mo3454a(viewGroup.getId(), a2, a), "");
                } else {
                    C51423a.m95791b(4, "TikTokSearch", "PagerAdapter added, ignoring");
                }
            } else {
                C51423a.m95791b(4, "TikTokSearch", "PagerAdapter storing");
                this.f132497d.put(i, a2);
            }
        } else if (m83536a(a2, a)) {
            C51423a.m95791b(4, "TikTokSearch", "PagerAdapter attaching");
            AbstractC0976n nVar2 = this.f97017a;
            if (nVar2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(nVar2.mo3477e(a2), "");
        } else {
            C51423a.m95791b(4, "TikTokSearch", "PagerAdapter attached, ignoring");
        }
        if (a2 != this.f132498e) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.p2082ss.android.ugc.aweme.lego.p3393c.AbstractC58188b
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        if (mo70817b(i)) {
            startUpdate(viewGroup);
            mo70816b(viewGroup, i);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f132498e) {
            if (this.f132498e != null) {
                ((Fragment) this.f132498e).setMenuVisibility(false);
                Object obj2 = this.f132498e;
                C89219l.m154716b(obj2, "");
                ((Fragment) obj2).setUserVisibleHint(false);
            }
            fragment.setMenuVisibility(true);
            fragment.setUserVisibleHint(true);
            this.f132498e = fragment;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        if (this.f97017a == null) {
            this.f97017a = this.f97019c.mo3552a();
        }
        String a = m83535a(viewGroup.getId(), (long) i);
        C51423a.m95791b(4, "TikTokSearch", "PagerAdapter destroyItem, pos: " + i + " (" + C67458j.m119528a(i) + ')');
        if (!this.f97018b || this.f97019c.mo3551a(a) == null) {
            AbstractC0976n nVar = this.f97017a;
            if (nVar == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(nVar.mo3475d((Fragment) obj), "");
            return;
        }
        this.f132497d.remove(i);
    }
}
