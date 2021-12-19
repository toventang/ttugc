package com.p2082ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1392ac;
import androidx.recyclerview.widget.AbstractC1491x;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.C1482s;
import androidx.recyclerview.widget.C1494y;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49504ag;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager */
public class GalleryLayoutManager extends RecyclerView.AbstractC1362i implements RecyclerView.AbstractC1375r.AbstractC1377b {

    /* renamed from: a */
    int f114052a;

    /* renamed from: b */
    public int f114053b;

    /* renamed from: c */
    View f114054c;

    /* renamed from: d */
    public AbstractC1392ac f114055d;

    /* renamed from: e */
    C49577b f114056e;

    /* renamed from: f */
    public boolean f114057f;

    /* renamed from: g */
    public int f114058g;

    /* renamed from: h */
    public WeakReference<Activity> f114059h;

    /* renamed from: i */
    public AbstractC49579d f114060i;

    /* renamed from: j */
    public ArrayList<AbstractC49578c> f114061j;

    /* renamed from: k */
    public RecyclerView f114062k;

    /* renamed from: l */
    public int f114063l;

    /* renamed from: m */
    private int f114064m;

    /* renamed from: n */
    private int f114065n;

    /* renamed from: o */
    private boolean f114066o;

    /* renamed from: p */
    private C49581f f114067p;

    /* renamed from: q */
    private AbstractC1491x f114068q;

    /* renamed from: r */
    private AbstractC1491x f114069r;

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$c */
    public interface AbstractC49578c {
        static {
            Covode.recordClassIndex(58422);
        }

        /* renamed from: a */
        void mo80304a(RecyclerView recyclerView, int i);

        /* renamed from: h */
        void mo80311h();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$d */
    public interface AbstractC49579d {
        static {
            Covode.recordClassIndex(58423);
        }

        /* renamed from: a */
        void mo81345a(GalleryLayoutManager galleryLayoutManager, View view, float f);
    }

    static {
        Covode.recordClassIndex(58419);
    }

    /* renamed from: i */
    private int m92954i() {
        return (this.f4485J - mo4733v()) - mo4731t();
    }

    /* renamed from: k */
    private int m92955k() {
        return (this.f4486K - mo4734w()) - mo4732u();
    }

    /* renamed from: l */
    private C49581f m92956l() {
        if (this.f114067p == null) {
            this.f114067p = new C49581f();
        }
        return this.f114067p;
    }

    /* renamed from: m */
    private AbstractC1491x m92957m() {
        if (this.f114058g == 0) {
            if (this.f114068q == null) {
                this.f114068q = AbstractC1491x.m5054a(this);
            }
            return this.f114068q;
        }
        if (this.f114069r == null) {
            this.f114069r = AbstractC1491x.m5056b(this);
        }
        return this.f114069r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final RecyclerView.C1367j mo4334b() {
        if (this.f114058g == 1) {
            return new C49580e(-1, -2);
        }
        return new C49580e(-2, -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: f */
    public final boolean mo4366f() {
        RecyclerView recyclerView = this.f114062k;
        if (recyclerView == null || recyclerView.mo4486n() || !this.f114066o || this.f114058g != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final boolean mo4368g() {
        RecyclerView recyclerView = this.f114062k;
        if (recyclerView == null || recyclerView.mo4486n() || !this.f114066o || this.f114058g != 1) {
            return false;
        }
        return true;
    }

    public GalleryLayoutManager() {
        this.f114064m = 1;
        this.f114066o = true;
        this.f114053b = -1;
        this.f114056e = new C49577b(this, (byte) 0);
        this.f114057f = false;
        this.f114058g = 0;
        this.f114061j = new ArrayList<>();
        this.f114063l = 0;
        this.f114058g = 0;
        if (C49504ag.m92741b()) {
            this.f114055d = new C1494y();
        } else {
            this.f114055d = new C1482s();
        }
    }

    /* renamed from: h */
    private void m92953h() {
        C49581f fVar = this.f114067p;
        if (fVar != null) {
            fVar.f114074a.clear();
        }
        int i = this.f114053b;
        if (i != -1) {
            this.f114052a = i;
        }
        int min = Math.min(Math.max(0, this.f114052a), mo4685A() - 1);
        this.f114052a = min;
        this.f114065n = min;
        this.f114064m = min;
        this.f114053b = -1;
        View view = this.f114054c;
        if (view != null) {
            view.setSelected(false);
            this.f114054c = null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final boolean mo4330a(RecyclerView.C1367j jVar) {
        return jVar instanceof C49580e;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$b */
    class C49577b extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        int f114071a;

        /* renamed from: b */
        boolean f114072b;

        static {
            Covode.recordClassIndex(58421);
        }

        private C49577b() {
        }

        /* synthetic */ C49577b(GalleryLayoutManager galleryLayoutManager, byte b) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            super.mo4753a(recyclerView, i);
            this.f114071a = i;
            if (i == 0) {
                GalleryLayoutManager.this.f114063l = 0;
                View a = GalleryLayoutManager.this.f114055d.mo4855a(recyclerView.getLayoutManager());
                if (a != null) {
                    recyclerView.getLayoutManager();
                    int e = RecyclerView.AbstractC1362i.m4426e(a);
                    if (e != GalleryLayoutManager.this.f114053b) {
                        if (GalleryLayoutManager.this.f114054c != null) {
                            GalleryLayoutManager.this.f114054c.setSelected(false);
                        }
                        GalleryLayoutManager.this.f114054c = a;
                        GalleryLayoutManager.this.f114054c.setSelected(true);
                        GalleryLayoutManager.this.f114053b = e;
                        if (GalleryLayoutManager.this.f114061j != null) {
                            GalleryLayoutManager galleryLayoutManager = GalleryLayoutManager.this;
                            galleryLayoutManager.mo81344a(recyclerView, galleryLayoutManager.f114053b);
                        }
                    } else if (!GalleryLayoutManager.this.f114057f && GalleryLayoutManager.this.f114061j != null && this.f114072b) {
                        this.f114072b = false;
                        GalleryLayoutManager galleryLayoutManager2 = GalleryLayoutManager.this;
                        galleryLayoutManager2.mo81344a(recyclerView, galleryLayoutManager2.f114053b);
                    }
                }
            } else {
                GalleryLayoutManager.this.f114063l = 2;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            super.mo4754a(recyclerView, i, i2);
            View a = GalleryLayoutManager.this.f114055d.mo4855a(recyclerView.getLayoutManager());
            if (a != null) {
                recyclerView.getLayoutManager();
                int e = RecyclerView.AbstractC1362i.m4426e(a);
                if (e != GalleryLayoutManager.this.f114053b) {
                    if (GalleryLayoutManager.this.f114054c != null) {
                        GalleryLayoutManager.this.f114054c.setSelected(false);
                    }
                    GalleryLayoutManager.this.f114054c = a;
                    GalleryLayoutManager.this.f114054c.setSelected(true);
                    GalleryLayoutManager.this.f114053b = e;
                    if (!GalleryLayoutManager.this.f114057f && this.f114071a != 0) {
                        this.f114072b = true;
                    } else if (GalleryLayoutManager.this.f114061j != null) {
                        GalleryLayoutManager galleryLayoutManager = GalleryLayoutManager.this;
                        galleryLayoutManager.mo81344a(recyclerView, galleryLayoutManager.f114053b);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$e */
    public static class C49580e extends RecyclerView.C1367j {
        static {
            Covode.recordClassIndex(58424);
        }

        public C49580e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C49580e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C49580e(int i, int i2) {
            super(i, i2);
        }

        public C49580e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$f */
    public class C49581f {

        /* renamed from: a */
        SparseArray<Rect> f114074a = new SparseArray<>();

        /* renamed from: b */
        int f114075b = 0;

        static {
            Covode.recordClassIndex(58425);
        }

        C49581f() {
        }
    }

    /* renamed from: a */
    public final void mo4318a(int i) {
        RecyclerView recyclerView = this.f114062k;
        if (recyclerView != null && i >= 0) {
            mo4354a(recyclerView, (RecyclerView.C1378s) null, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager$a */
    class C49576a extends C1481r {
        static {
            Covode.recordClassIndex(58420);
        }

        @Override // androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final float mo4862a(DisplayMetrics displayMetrics) {
            if (C49504ag.m92741b()) {
                return super.mo4862a(displayMetrics) / 1.5f;
            }
            return super.mo4862a(displayMetrics);
        }

        C49576a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
        /* renamed from: a */
        public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
            int i;
            RecyclerView.AbstractC1362i iVar = this.f4517i;
            int i2 = 0;
            if (iVar == null || !iVar.mo4366f()) {
                i = 0;
            } else {
                RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
                int o = RecyclerView.AbstractC1362i.m4431o(view) - jVar.leftMargin;
                int q = RecyclerView.AbstractC1362i.m4433q(view) + jVar.rightMargin;
                int t = iVar.mo4731t();
                int i3 = o + ((int) (((float) (q - o)) / 2.0f));
                i = ((int) (((float) ((iVar.f4485J - iVar.mo4733v()) - t)) / 2.0f)) - i3;
            }
            RecyclerView.AbstractC1362i iVar2 = this.f4517i;
            if (iVar2 != null && iVar2.mo4368g()) {
                RecyclerView.C1367j jVar2 = (RecyclerView.C1367j) view.getLayoutParams();
                int p = RecyclerView.AbstractC1362i.m4432p(view) - jVar2.topMargin;
                int r = RecyclerView.AbstractC1362i.m4434r(view) + jVar2.bottomMargin;
                int u = iVar2.mo4732u();
                int i4 = p + ((int) (((float) (r - p)) / 2.0f));
                i2 = ((int) (((float) ((iVar2.f4486K - iVar2.mo4734w()) - u)) / 2.0f)) - i4;
            }
            int a = mo5010a((int) Math.sqrt((double) ((i * i) + (i2 * i2))));
            if (a > 0) {
                aVar.mo4780a(-i, -i2, a, this.f4912b);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4317a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C49580e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C49580e(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r.AbstractC1377b
    /* renamed from: d */
    public final PointF mo4360d(int i) {
        int i2 = -1;
        if (mo4730s() != 0 && i >= this.f114065n) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.f114058g == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4316a(Context context, AttributeSet attributeSet) {
        return new C49580e(context, attributeSet);
    }

    /* renamed from: a */
    private float m92945a(View view, float f) {
        int height;
        int b = m92948b(view, f);
        if (this.f114058g == 0) {
            height = view.getWidth();
        } else {
            height = view.getHeight();
        }
        return Math.max(-1.0f, Math.min(1.0f, (((float) b) * 1.0f) / ((float) height)));
    }

    /* renamed from: b */
    private int m92948b(View view, float f) {
        float height;
        int top;
        AbstractC1491x m = m92957m();
        int c = ((m.mo5025c() - m.mo5023b()) / 2) + m.mo5023b();
        if (this.f114058g == 0) {
            height = ((float) (view.getWidth() / 2)) - f;
            top = view.getLeft();
        } else {
            height = ((float) (view.getHeight() / 2)) - f;
            top = view.getTop();
        }
        return (int) ((height + ((float) top)) - ((float) c));
    }

    /* renamed from: a */
    private void m92946a(RecyclerView.C1372o oVar, int i) {
        int i2;
        if (mo4685A() != 0) {
            if (this.f114058g == 0) {
                int b = m92957m().mo5023b();
                int c = m92957m().mo5025c();
                if (mo4730s() > 0) {
                    if (i >= 0) {
                        int i3 = 0;
                        for (int i4 = 0; i4 < mo4730s(); i4++) {
                            View g = mo4717g(i4 + i3);
                            if (m4433q(g) - i >= b) {
                                break;
                            }
                            mo4691a(g, oVar);
                            this.f114065n++;
                            i3--;
                        }
                    } else {
                        for (int s = mo4730s() - 1; s >= 0; s--) {
                            View g2 = mo4717g(s);
                            if (m4431o(g2) - i > c) {
                                mo4691a(g2, oVar);
                                this.f114064m--;
                            }
                        }
                    }
                }
                int i5 = this.f114065n;
                int k = m92955k();
                int i6 = -1;
                if (i >= 0) {
                    if (mo4730s() != 0) {
                        View g3 = mo4717g(mo4730s() - 1);
                        i5 = m4426e(g3) + 1;
                        i2 = m4433q(g3);
                    } else {
                        i2 = -1;
                    }
                    for (int i7 = i5; i7 < mo4685A() && i2 < c + i; i7++) {
                        Rect rect = m92956l().f114074a.get(i7);
                        View c2 = oVar.mo4766c(i7);
                        mo4710c(c2);
                        if (rect == null) {
                            rect = new Rect();
                            m92956l().f114074a.put(i7, rect);
                        }
                        mo4725l(c2);
                        int m = m4429m(c2);
                        int n = m4430n(c2);
                        int u = (int) (((float) mo4732u()) + (((float) (k - n)) / 2.0f));
                        if (i2 == -1 && i5 == 0) {
                            int t = (int) (((float) mo4731t()) + (((float) (m92954i() - m)) / 2.0f));
                            rect.set(t, u, m + t, n + u);
                        } else {
                            rect.set(i2, u, m + i2, n + u);
                        }
                        m4418a(c2, rect.left, rect.top, rect.right, rect.bottom);
                        i2 = rect.right;
                        this.f114064m = i7;
                    }
                } else {
                    if (mo4730s() > 0) {
                        View g4 = mo4717g(0);
                        i5 = m4426e(g4) - 1;
                        i6 = m4431o(g4);
                    }
                    while (i5 >= 0 && i6 > b + i) {
                        Rect rect2 = m92956l().f114074a.get(i5);
                        View c3 = oVar.mo4766c(i5);
                        mo4688a(c3, 0);
                        if (rect2 == null) {
                            rect2 = new Rect();
                            m92956l().f114074a.put(i5, rect2);
                        }
                        mo4725l(c3);
                        int m2 = m4429m(c3);
                        int n2 = m4430n(c3);
                        int u2 = (int) (((float) mo4732u()) + (((float) (k - n2)) / 2.0f));
                        rect2.set(i6 - m2, u2, i6, n2 + u2);
                        m4418a(c3, rect2.left, rect2.top, rect2.right, rect2.bottom);
                        i6 = rect2.left;
                        this.f114065n = i5;
                        i5--;
                    }
                }
            } else {
                m92949b(oVar, i);
            }
            if (this.f114060i != null) {
                for (int i8 = 0; i8 < mo4730s(); i8++) {
                    View g5 = mo4717g(i8);
                    this.f114060i.mo81345a(this, g5, m92945a(g5, (float) i));
                }
            }
        }
    }

    /* renamed from: b */
    private void m92949b(RecyclerView.C1372o oVar, int i) {
        int i2;
        int b = m92957m().mo5023b();
        int c = m92957m().mo5025c();
        if (mo4730s() > 0) {
            if (i < 0) {
                for (int s = mo4730s() - 1; s >= 0; s--) {
                    View g = mo4717g(s);
                    if (m4432p(g) - i <= c) {
                        break;
                    }
                    mo4691a(g, oVar);
                    this.f114064m--;
                }
            } else {
                int i3 = 0;
                for (int i4 = 0; i4 < mo4730s(); i4++) {
                    View g2 = mo4717g(i4 + i3);
                    if (m4434r(g2) - i >= b) {
                        break;
                    }
                    mo4691a(g2, oVar);
                    this.f114065n++;
                    i3--;
                }
            }
        }
        int i5 = this.f114065n;
        int i6 = m92954i();
        int i7 = -1;
        if (i >= 0) {
            if (mo4730s() != 0) {
                View g3 = mo4717g(mo4730s() - 1);
                i5 = m4426e(g3) + 1;
                i2 = m4434r(g3);
            } else {
                i2 = -1;
            }
            for (int i8 = i5; i8 < mo4685A() && i2 < c + i; i8++) {
                Rect rect = m92956l().f114074a.get(i8);
                View c2 = oVar.mo4766c(i8);
                mo4710c(c2);
                if (rect == null) {
                    rect = new Rect();
                    m92956l().f114074a.put(i8, rect);
                }
                mo4725l(c2);
                int m = m4429m(c2);
                int n = m4430n(c2);
                int t = (int) (((float) mo4731t()) + (((float) (i6 - m)) / 2.0f));
                if (i2 == -1 && i5 == 0) {
                    int u = (int) (((float) mo4732u()) + (((float) (m92955k() - n)) / 2.0f));
                    rect.set(t, u, m + t, n + u);
                } else {
                    rect.set(t, i2, m + t, n + i2);
                }
                m4418a(c2, rect.left, rect.top, rect.right, rect.bottom);
                i2 = rect.bottom;
                this.f114064m = i8;
            }
            return;
        }
        if (mo4730s() > 0) {
            View g4 = mo4717g(0);
            i5 = m4426e(g4) - 1;
            i7 = m4432p(g4);
        }
        while (i5 >= 0 && i7 > b + i) {
            Rect rect2 = m92956l().f114074a.get(i5);
            View c3 = oVar.mo4766c(i5);
            mo4688a(c3, 0);
            if (rect2 == null) {
                rect2 = new Rect();
                m92956l().f114074a.put(i5, rect2);
            }
            mo4725l(c3);
            int m2 = m4429m(c3);
            int n2 = m4430n(c3);
            int t2 = (int) (((float) mo4731t()) + (((float) (i6 - m2)) / 2.0f));
            rect2.set(t2, i7 - n2, m2 + t2, i7);
            m4418a(c3, rect2.left, rect2.top, rect2.right, rect2.bottom);
            i7 = rect2.top;
            this.f114065n = i5;
            i5--;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (mo4685A() == 0) {
            m92953h();
            mo4693a(oVar);
        } else if (!sVar.f4535g) {
            if (sVar.mo4782a() == 0 || sVar.f4534f) {
                if (mo4730s() == 0 || sVar.f4534f) {
                    m92953h();
                }
                this.f114052a = Math.min(Math.max(0, this.f114052a), mo4685A() - 1);
                mo4693a(oVar);
                if (this.f114058g == 0) {
                    mo4693a(oVar);
                    int b = m92957m().mo5023b();
                    int c = m92957m().mo5025c();
                    int i = this.f114052a;
                    Rect rect = new Rect();
                    int k = m92955k();
                    View c2 = oVar.mo4766c(this.f114052a);
                    mo4688a(c2, 0);
                    mo4725l(c2);
                    int m = m4429m(c2);
                    int n = m4430n(c2);
                    int u = (int) (((float) mo4732u()) + (((float) (k - n)) / 2.0f));
                    int t = (int) (((float) mo4731t()) + (((float) (m92954i() - m)) / 2.0f));
                    rect.set(t, u, m + t, n + u);
                    m4418a(c2, rect.left, rect.top, rect.right, rect.bottom);
                    if (m92956l().f114074a.get(i) == null) {
                        m92956l().f114074a.put(i, rect);
                    } else {
                        m92956l().f114074a.get(i).set(rect);
                    }
                    this.f114065n = i;
                    this.f114064m = i;
                    int o = m4431o(c2);
                    int q = m4433q(c2);
                    m92947a(oVar, this.f114052a - 1, o, b);
                    m92950b(oVar, this.f114052a + 1, q, c);
                } else {
                    mo4693a(oVar);
                    int b2 = m92957m().mo5023b();
                    int c3 = m92957m().mo5025c();
                    int i2 = this.f114052a;
                    Rect rect2 = new Rect();
                    int i3 = m92954i();
                    View c4 = oVar.mo4766c(this.f114052a);
                    mo4688a(c4, 0);
                    mo4725l(c4);
                    int m2 = m4429m(c4);
                    int n2 = m4430n(c4);
                    int t2 = (int) (((float) mo4731t()) + (((float) (i3 - m2)) / 2.0f));
                    int u2 = (int) (((float) mo4732u()) + (((float) (m92955k() - n2)) / 2.0f));
                    rect2.set(t2, u2, m2 + t2, n2 + u2);
                    m4418a(c4, rect2.left, rect2.top, rect2.right, rect2.bottom);
                    if (m92956l().f114074a.get(i2) == null) {
                        m92956l().f114074a.put(i2, rect2);
                    } else {
                        m92956l().f114074a.get(i2).set(rect2);
                    }
                    this.f114065n = i2;
                    this.f114064m = i2;
                    int p = m4432p(c4);
                    int r = m4434r(c4);
                    m92951c(oVar, this.f114052a - 1, p, b2);
                    m92952d(oVar, this.f114052a + 1, r, c3);
                }
                if (this.f114060i != null) {
                    for (int i4 = 0; i4 < mo4730s(); i4++) {
                        View g = mo4717g(i4);
                        this.f114060i.mo81345a(this, g, m92945a(g, 0.0f));
                    }
                }
                this.f114056e.mo4754a(this.f114062k, 0, 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo81344a(RecyclerView recyclerView, int i) {
        Iterator<AbstractC49578c> it = this.f114061j.iterator();
        while (it.hasNext()) {
            it.next().mo80304a(recyclerView, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final void mo4335b(RecyclerView recyclerView, int i, int i2) {
        super.mo4335b(recyclerView, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int min;
        if (mo4730s() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int c = ((m92957m().mo5025c() - m92957m().mo5023b()) / 2) + m92957m().mo5023b();
        if (i > 0) {
            if (m4426e(mo4717g(mo4730s() - 1)) == mo4685A() - 1) {
                View g = mo4717g(mo4730s() - 1);
                min = Math.max(0, Math.min(i, (((g.getRight() - g.getLeft()) / 2) + g.getLeft()) - c));
            }
            int i3 = -i2;
            m92956l().f114075b = i3;
            m92946a(oVar, i3);
            mo4719h(i2);
            return i3;
        }
        if (this.f114065n == 0) {
            View g2 = mo4717g(0);
            min = Math.min(0, Math.max(i, (((g2.getRight() - g2.getLeft()) / 2) + g2.getLeft()) - c));
        }
        int i32 = -i2;
        m92956l().f114075b = i32;
        m92946a(oVar, i32);
        mo4719h(i2);
        return i32;
        i2 = -min;
        int i322 = -i2;
        m92956l().f114075b = i322;
        m92946a(oVar, i322);
        mo4719h(i2);
        return i322;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int min;
        if (mo4730s() == 0 || i == 0) {
            return 0;
        }
        int i2 = -i;
        int c = ((m92957m().mo5025c() - m92957m().mo5023b()) / 2) + m92957m().mo5023b();
        if (i > 0) {
            if (m4426e(mo4717g(mo4730s() - 1)) == mo4685A() - 1) {
                View g = mo4717g(mo4730s() - 1);
                min = Math.max(0, Math.min(i, (((m4434r(g) - m4432p(g)) / 2) + m4432p(g)) - c));
            }
            int i3 = -i2;
            m92956l().f114075b = i3;
            m92946a(oVar, i3);
            mo4721i(i2);
            return i3;
        }
        if (this.f114065n == 0) {
            View g2 = mo4717g(0);
            min = Math.min(0, Math.max(i, (((m4434r(g2) - m4432p(g2)) / 2) + m4432p(g2)) - c));
        }
        int i32 = -i2;
        m92956l().f114075b = i32;
        m92946a(oVar, i32);
        mo4721i(i2);
        return i32;
        i2 = -min;
        int i322 = -i2;
        m92956l().f114075b = i322;
        m92946a(oVar, i322);
        mo4721i(i2);
        return i322;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        C49576a aVar = new C49576a(recyclerView.getContext());
        aVar.f4515g = i;
        mo4695a(aVar);
    }

    /* renamed from: a */
    private void m92947a(RecyclerView.C1372o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int k = m92955k();
        while (i >= 0 && i2 > i3) {
            View c = oVar.mo4766c(i);
            mo4688a(c, 0);
            mo4725l(c);
            int m = m4429m(c);
            int n = m4430n(c);
            int u = (int) (((float) mo4732u()) + (((float) (k - n)) / 2.0f));
            rect.set(i2 - m, u, i2, n + u);
            m4418a(c, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.left;
            this.f114065n = i;
            if (m92956l().f114074a.get(i) == null) {
                m92956l().f114074a.put(i, rect);
            } else {
                m92956l().f114074a.get(i).set(rect);
            }
            i--;
        }
    }

    /* renamed from: b */
    private void m92950b(RecyclerView.C1372o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int k = m92955k();
        while (i < mo4685A() && i2 < i3) {
            View c = oVar.mo4766c(i);
            mo4710c(c);
            mo4725l(c);
            int m = m4429m(c);
            int n = m4430n(c);
            int u = (int) (((float) mo4732u()) + (((float) (k - n)) / 2.0f));
            rect.set(i2, u, m + i2, n + u);
            m4418a(c, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.right;
            this.f114064m = i;
            if (m92956l().f114074a.get(i) == null) {
                m92956l().f114074a.put(i, rect);
            } else {
                m92956l().f114074a.get(i).set(rect);
            }
            i++;
        }
    }

    /* renamed from: c */
    private void m92951c(RecyclerView.C1372o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int i4 = m92954i();
        while (i >= 0 && i2 > i3) {
            View c = oVar.mo4766c(i);
            mo4688a(c, 0);
            mo4725l(c);
            int m = m4429m(c);
            int n = m4430n(c);
            int t = (int) (((float) mo4731t()) + (((float) (i4 - m)) / 2.0f));
            rect.set(t, i2 - n, m + t, i2);
            m4418a(c, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.top;
            this.f114065n = i;
            if (m92956l().f114074a.get(i) == null) {
                m92956l().f114074a.put(i, rect);
            } else {
                m92956l().f114074a.get(i).set(rect);
            }
            i--;
        }
    }

    /* renamed from: d */
    private void m92952d(RecyclerView.C1372o oVar, int i, int i2, int i3) {
        Rect rect = new Rect();
        int i4 = m92954i();
        while (i < mo4685A() && i2 < i3) {
            View c = oVar.mo4766c(i);
            mo4710c(c);
            mo4725l(c);
            int m = m4429m(c);
            int n = m4430n(c);
            int t = (int) (((float) mo4731t()) + (((float) (i4 - m)) / 2.0f));
            rect.set(t, i2, m + t, n + i2);
            m4418a(c, rect.left, rect.top, rect.right, rect.bottom);
            i2 = rect.bottom;
            this.f114064m = i;
            if (m92956l().f114074a.get(i) == null) {
                m92956l().f114074a.put(i, rect);
            } else {
                m92956l().f114074a.get(i).set(rect);
            }
            i++;
        }
    }
}
