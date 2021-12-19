package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.C0273a;
import androidx.appcompat.view.menu.AbstractC0290b;
import androidx.appcompat.view.menu.AbstractC0318o;
import androidx.appcompat.view.menu.AbstractC0320p;
import androidx.appcompat.view.menu.AbstractC0324s;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0302h;
import androidx.appcompat.view.menu.C0306j;
import androidx.appcompat.view.menu.C0316n;
import androidx.appcompat.view.menu.SubMenuC0328u;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C0705a;
import androidx.core.p037h.AbstractC0763b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public class ActionMenuPresenter extends AbstractC0290b implements AbstractC0763b.AbstractC0764a {

    /* renamed from: A */
    private final SparseBooleanArray f1251A = new SparseBooleanArray();

    /* renamed from: B */
    private View f1252B;

    /* renamed from: C */
    private C0338b f1253C;

    /* renamed from: i */
    C0340d f1254i;

    /* renamed from: j */
    Drawable f1255j;

    /* renamed from: k */
    boolean f1256k;

    /* renamed from: l */
    public boolean f1257l;

    /* renamed from: m */
    public boolean f1258m;

    /* renamed from: n */
    C0342e f1259n;

    /* renamed from: o */
    C0337a f1260o;

    /* renamed from: p */
    RunnableC0339c f1261p;

    /* renamed from: q */
    final C0343f f1262q = new C0343f();

    /* renamed from: r */
    int f1263r;

    /* renamed from: s */
    private boolean f1264s;

    /* renamed from: t */
    private int f1265t;

    /* renamed from: u */
    private int f1266u;

    /* renamed from: v */
    private int f1267v;

    /* renamed from: w */
    private boolean f1268w;

    /* renamed from: x */
    private boolean f1269x;

    /* renamed from: y */
    private boolean f1270y;

    /* renamed from: z */
    private int f1271z;

    static {
        Covode.recordClassIndex(376);
    }

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.appcompat.widget.ActionMenuPresenter.SavedState.C03361 */

            static {
                Covode.recordClassIndex(378);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        public int f1272a;

        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        static {
            Covode.recordClassIndex(377);
        }

        SavedState(Parcel parcel) {
            this.f1272a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1272a);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final boolean mo898a(C0306j jVar) {
        return jVar.mo1017f();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final boolean mo897a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1254i) {
            return false;
        }
        return super.mo897a(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o, androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final boolean mo899a(SubMenuC0328u uVar) {
        boolean z = false;
        if (!uVar.hasVisibleItems()) {
            return false;
        }
        SubMenuC0328u uVar2 = uVar;
        while (uVar2.f1195n != this.f1020c) {
            uVar2 = (SubMenuC0328u) uVar2.f1195n;
        }
        MenuItem item = uVar2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.f1024g;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof AbstractC0320p.AbstractC0321a) || ((AbstractC0320p.AbstractC0321a) childAt).getItemData() != item) {
                    i++;
                } else if (childAt != null) {
                    this.f1263r = uVar.getItem().getItemId();
                    int size = uVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        MenuItem item2 = uVar.getItem(i2);
                        if (item2.isVisible() && item2.getIcon() != null) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    C0337a aVar = new C0337a(this.f1019b, uVar, childAt);
                    this.f1260o = aVar;
                    aVar.mo1130a(z);
                    if (this.f1260o.mo1131b()) {
                        super.mo899a(uVar);
                        return true;
                    }
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C0340d extends AppCompatImageView implements ActionMenuView.AbstractC0344a {

        /* renamed from: b */
        private final float[] f1278b = new float[2];

        static {
            Covode.recordClassIndex(382);
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0344a
        /* renamed from: c */
        public final boolean mo798c() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.AbstractC0344a
        /* renamed from: d */
        public final boolean mo799d() {
            return false;
        }

        /* access modifiers changed from: protected */
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            C58030k.m104850a(this);
        }

        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1278e();
            return true;
        }

        public C0340d(Context context) {
            super(context, null, R.attr.hn);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0409an.m1520a(this, getContentDescription());
            setOnTouchListener(new AbstractView$OnAttachStateChangeListenerC0461z(this, ActionMenuPresenter.this) {
                /* class androidx.appcompat.widget.ActionMenuPresenter.C0340d.C03411 */

                static {
                    Covode.recordClassIndex(383);
                }

                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0461z
                /* renamed from: b */
                public final boolean mo815b() {
                    ActionMenuPresenter.this.mo1278e();
                    return true;
                }

                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0461z
                /* renamed from: a */
                public final AbstractC0324s mo814a() {
                    if (ActionMenuPresenter.this.f1259n == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.f1259n.mo1127a();
                }

                @Override // androidx.appcompat.widget.AbstractView$OnAttachStateChangeListenerC0461z
                /* renamed from: c */
                public final boolean mo1291c() {
                    if (ActionMenuPresenter.this.f1261p != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.mo1279g();
                    return true;
                }
            });
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0705a.m2495a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: d */
    public final void mo1277d() {
        this.f1257l = true;
        this.f1264s = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C0337a extends C0316n {
        static {
            Covode.recordClassIndex(379);
        }

        @Override // androidx.appcompat.view.menu.C0316n
        /* renamed from: d */
        public final void mo1133d() {
            ActionMenuPresenter.this.f1260o = null;
            ActionMenuPresenter.this.f1263r = 0;
            super.mo1133d();
        }

        public C0337a(Context context, SubMenuC0328u uVar, View view) {
            super(context, uVar, view, false);
            View view2;
            if (!((C0306j) uVar.getItem()).mo1017f()) {
                if (ActionMenuPresenter.this.f1254i == null) {
                    view2 = (View) ActionMenuPresenter.this.f1024g;
                } else {
                    view2 = ActionMenuPresenter.this.f1254i;
                }
                this.f1159a = view2;
            }
            mo1129a(ActionMenuPresenter.this.f1262q);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: f */
    public final Parcelable mo920f() {
        SavedState savedState = new SavedState();
        savedState.f1272a = this.f1263r;
        return savedState;
    }

    /* renamed from: h */
    public final boolean mo1280h() {
        return mo1279g() | mo1281i();
    }

    /* renamed from: i */
    public final boolean mo1281i() {
        C0337a aVar = this.f1260o;
        if (aVar == null) {
            return false;
        }
        aVar.mo1132c();
        return true;
    }

    /* renamed from: j */
    public final boolean mo1282j() {
        C0342e eVar = this.f1259n;
        if (eVar == null || !eVar.mo1134e()) {
            return false;
        }
        return true;
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    class C0338b extends ActionMenuItemView.AbstractC0288b {
        static {
            Covode.recordClassIndex(380);
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0288b
        /* renamed from: a */
        public final AbstractC0324s mo816a() {
            if (ActionMenuPresenter.this.f1260o != null) {
                return ActionMenuPresenter.this.f1260o.mo1127a();
            }
            return null;
        }

        C0338b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C0342e extends C0316n {
        static {
            Covode.recordClassIndex(384);
        }

        @Override // androidx.appcompat.view.menu.C0316n
        /* renamed from: d */
        public final void mo1133d() {
            if (ActionMenuPresenter.this.f1020c != null) {
                ActionMenuPresenter.this.f1020c.close();
            }
            ActionMenuPresenter.this.f1259n = null;
            super.mo1133d();
        }

        public C0342e(Context context, C0302h hVar, View view) {
            super(context, hVar, view, true);
            this.f1160b = 8388613;
            mo1129a(ActionMenuPresenter.this.f1262q);
        }
    }

    /* renamed from: c */
    public final void mo1276c() {
        if (!this.f1268w) {
            this.f1267v = C0273a.m938a(this.f1019b).mo738a();
        }
        if (this.f1020c != null) {
            this.f1020c.mo972b(true);
        }
    }

    /* renamed from: g */
    public final boolean mo1279g() {
        if (this.f1261p == null || this.f1024g == null) {
            C0342e eVar = this.f1259n;
            if (eVar == null) {
                return false;
            }
            eVar.mo1132c();
            return true;
        }
        ((View) this.f1024g).removeCallbacks(this.f1261p);
        this.f1261p = null;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class RunnableC0339c implements Runnable {

        /* renamed from: b */
        private C0342e f1276b;

        static {
            Covode.recordClassIndex(381);
        }

        public final void run() {
            if (ActionMenuPresenter.this.f1020c != null) {
                C0302h hVar = ActionMenuPresenter.this.f1020c;
                if (hVar.f1091c != null) {
                    hVar.f1091c.mo536a(hVar);
                }
            }
            View view = (View) ActionMenuPresenter.this.f1024g;
            if (!(view == null || view.getWindowToken() == null || !this.f1276b.mo1131b())) {
                ActionMenuPresenter.this.f1259n = this.f1276b;
            }
            ActionMenuPresenter.this.f1261p = null;
        }

        public RunnableC0339c(C0342e eVar) {
            this.f1276b = eVar;
        }
    }

    /* renamed from: e */
    public final boolean mo1278e() {
        if (!this.f1257l || mo1282j() || this.f1020c == null || this.f1024g == null || this.f1261p != null || this.f1020c.mo992k().isEmpty()) {
            return false;
        }
        this.f1261p = new RunnableC0339c(new C0342e(this.f1019b, this.f1020c, this.f1254i));
        ((View) this.f1024g).post(this.f1261p);
        super.mo899a((SubMenuC0328u) null);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0137, code lost:
        if (r3 == false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0113  */
    @Override // androidx.appcompat.view.menu.AbstractC0318o, androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo896a() {
        /*
        // Method dump skipped, instructions count: 326
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuPresenter.mo896a():boolean");
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    class C0343f implements AbstractC0318o.AbstractC0319a {
        static {
            Covode.recordClassIndex(385);
        }

        C0343f() {
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final boolean mo560a(C0302h hVar) {
            if (hVar == null) {
                return false;
            }
            ActionMenuPresenter.this.f1263r = ((SubMenuC0328u) hVar).getItem().getItemId();
            AbstractC0318o.AbstractC0319a aVar = ActionMenuPresenter.this.f1023f;
            if (aVar != null) {
                return aVar.mo560a(hVar);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.AbstractC0318o.AbstractC0319a
        /* renamed from: a */
        public final void mo559a(C0302h hVar, boolean z) {
            if (hVar instanceof SubMenuC0328u) {
                hVar.mo993l().mo956a(false);
            }
            AbstractC0318o.AbstractC0319a aVar = ActionMenuPresenter.this.f1023f;
            if (aVar != null) {
                aVar.mo559a(hVar, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final AbstractC0320p mo890a(ViewGroup viewGroup) {
        AbstractC0320p pVar = this.f1024g;
        AbstractC0320p a = super.mo890a(viewGroup);
        if (pVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    public ActionMenuPresenter(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o
    /* renamed from: a */
    public final void mo909a(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.f1272a > 0 && (findItem = this.f1020c.findItem(savedState.f1272a)) != null) {
                mo899a((SubMenuC0328u) findItem.getSubMenu());
            }
        }
    }

    @Override // androidx.core.p037h.AbstractC0763b.AbstractC0764a
    /* renamed from: b */
    public final void mo1275b(boolean z) {
        if (z) {
            super.mo899a((SubMenuC0328u) null);
        } else if (this.f1020c != null) {
            this.f1020c.mo956a(false);
        }
    }

    /* renamed from: a */
    public final void mo1274a(ActionMenuView actionMenuView) {
        this.f1024g = actionMenuView;
        actionMenuView.f1283a = this.f1020c;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o, androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final void mo895a(boolean z) {
        ArrayList<C0306j> arrayList;
        int size;
        super.mo895a(z);
        ((View) this.f1024g).requestLayout();
        if (this.f1020c != null) {
            C0302h hVar = this.f1020c;
            hVar.mo991j();
            ArrayList<C0306j> arrayList2 = hVar.f1093e;
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                AbstractC0763b bVar = arrayList2.get(i).f1128f;
                if (bVar != null) {
                    bVar.f2902f = this;
                }
            }
        }
        if (this.f1020c != null) {
            arrayList = this.f1020c.mo992k();
        } else {
            arrayList = null;
        }
        if (!this.f1257l || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!arrayList.get(0).isActionViewExpanded()))) {
            C0340d dVar = this.f1254i;
            if (dVar != null && dVar.getParent() == this.f1024g) {
                ((ViewGroup) this.f1024g).removeView(this.f1254i);
            }
        } else {
            if (this.f1254i == null) {
                this.f1254i = new C0340d(this.f1018a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1254i.getParent();
            if (viewGroup != this.f1024g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1254i);
                }
                C0340d dVar2 = this.f1254i;
                ActionMenuView.C0346c a = ActionMenuView.m1304a();
                a.f1295a = true;
                ((ActionMenuView) this.f1024g).addView(dVar2, a);
            }
        }
        ((ActionMenuView) this.f1024g).setOverflowReserved(this.f1257l);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o, androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final void mo892a(C0302h hVar, boolean z) {
        mo1280h();
        super.mo892a(hVar, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0318o, androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final void mo891a(Context context, C0302h hVar) {
        super.mo891a(context, hVar);
        Resources resources = context.getResources();
        C0273a a = C0273a.m938a(context);
        if (!this.f1264s) {
            int i = Build.VERSION.SDK_INT;
            this.f1257l = true;
        }
        if (!this.f1270y) {
            this.f1265t = a.f891a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.f1268w) {
            this.f1267v = a.mo738a();
        }
        int i2 = this.f1265t;
        if (this.f1257l) {
            if (this.f1254i == null) {
                C0340d dVar = new C0340d(this.f1018a);
                this.f1254i = dVar;
                if (this.f1256k) {
                    dVar.setImageDrawable(this.f1255j);
                    this.f1255j = null;
                    this.f1256k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1254i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.f1254i.getMeasuredWidth();
        } else {
            this.f1254i = null;
        }
        this.f1266u = i2;
        this.f1271z = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.f1252B = null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final void mo893a(C0306j jVar, AbstractC0320p.AbstractC0321a aVar) {
        aVar.mo795a(jVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1024g);
        if (this.f1253C == null) {
            this.f1253C = new C0338b();
        }
        actionMenuItemView.setPopupCallback(this.f1253C);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0290b
    /* renamed from: a */
    public final View mo889a(C0306j jVar, View view, ViewGroup viewGroup) {
        int i;
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo1038j()) {
            actionView = super.mo889a(jVar, view, viewGroup);
        }
        if (jVar.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.m1305a(layoutParams));
        }
        return actionView;
    }
}
