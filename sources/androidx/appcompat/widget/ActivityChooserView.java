package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0418c;
import androidx.core.p037h.AbstractC0763b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;

public final class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    final C0349a f1302a;

    /* renamed from: b */
    final FrameLayout f1303b;

    /* renamed from: c */
    final FrameLayout f1304c;

    /* renamed from: d */
    AbstractC0763b f1305d;

    /* renamed from: e */
    final DataSetObserver f1306e;

    /* renamed from: f */
    PopupWindow.OnDismissListener f1307f;

    /* renamed from: g */
    boolean f1308g;

    /* renamed from: h */
    int f1309h;

    /* renamed from: i */
    private final View$OnClickListenerC0350b f1310i;

    /* renamed from: j */
    private final View f1311j;

    /* renamed from: k */
    private final ImageView f1312k;

    /* renamed from: l */
    private final int f1313l;

    /* renamed from: m */
    private final ViewTreeObserver.OnGlobalLayoutListener f1314m;

    /* renamed from: n */
    private C0381aa f1315n;

    /* renamed from: o */
    private boolean f1316o;

    /* renamed from: p */
    private int f1317p;

    static {
        Covode.recordClassIndex(392);
    }

    public final C0418c getDataModel() {
        return this.f1302a.f1319a;
    }

    /* renamed from: b */
    private boolean m1322b() {
        return getListPopupWindow().f1501w.isShowing();
    }

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        private static final int[] f1318a = {16842964};

        static {
            Covode.recordClassIndex(393);
        }

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0405al a = C0405al.m1465a(context, attributeSet, f1318a);
            setBackgroundDrawable(a.mo1826a(0));
            a.f1585a.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserView$b */
    public class View$OnClickListenerC0350b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ ActivityChooserView f1325a;

        static {
            Covode.recordClassIndex(395);
        }

        public final void onDismiss() {
            if (this.f1325a.f1307f != null) {
                this.f1325a.f1307f.onDismiss();
            }
            if (this.f1325a.f1305d != null) {
                this.f1325a.f1305d.mo2886a(false);
            }
        }

        public final boolean onLongClick(View view) {
            if (view == this.f1325a.f1304c) {
                if (this.f1325a.f1302a.getCount() > 0) {
                    this.f1325a.f1308g = true;
                    ActivityChooserView activityChooserView = this.f1325a;
                    activityChooserView.mo1317a(activityChooserView.f1309h);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        public final void onClick(View view) {
            if (view == this.f1325a.f1304c) {
                this.f1325a.mo1318a();
                Intent b = this.f1325a.f1302a.f1319a.mo1890b(this.f1325a.f1302a.f1319a.mo1887a(this.f1325a.f1302a.f1319a.mo1891b()));
                if (b != null) {
                    b.addFlags(524288);
                    m1329a(this.f1325a.getContext(), b);
                }
            } else if (view == this.f1325a.f1303b) {
                this.f1325a.f1308g = false;
                ActivityChooserView activityChooserView = this.f1325a;
                activityChooserView.mo1317a(activityChooserView.f1309h);
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        private static void m1329a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            float f;
            int itemViewType = ((C0349a) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType == 0) {
                this.f1325a.mo1318a();
                if (!this.f1325a.f1308g) {
                    if (!this.f1325a.f1302a.f1320b) {
                        i++;
                    }
                    Intent b = this.f1325a.f1302a.f1319a.mo1890b(i);
                    if (b != null) {
                        b.addFlags(524288);
                        m1329a(this.f1325a.getContext(), b);
                    }
                } else if (i > 0) {
                    C0418c cVar = this.f1325a.f1302a.f1319a;
                    synchronized (cVar.f1637b) {
                        cVar.mo1892c();
                        C0418c.C0419a aVar = cVar.f1638c.get(i);
                        C0418c.C0419a aVar2 = cVar.f1638c.get(0);
                        if (aVar2 != null) {
                            f = (aVar2.f1651b - aVar.f1651b) + 5.0f;
                        } else {
                            f = 1.0f;
                        }
                        cVar.mo1889a(new C0418c.C0421c(new ComponentName(aVar.f1650a.activityInfo.packageName, aVar.f1650a.activityInfo.name), System.currentTimeMillis(), f));
                    }
                }
            } else if (itemViewType == 1) {
                this.f1325a.mo1317a(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0418c cVar = this.f1302a.f1319a;
        if (cVar != null) {
            cVar.registerObserver(this.f1306e);
        }
        this.f1316o = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActivityChooserView$a */
    public class C0349a extends BaseAdapter {

        /* renamed from: a */
        public C0418c f1319a;

        /* renamed from: b */
        public boolean f1320b;

        /* renamed from: c */
        final /* synthetic */ ActivityChooserView f1321c;

        /* renamed from: d */
        private int f1322d;

        /* renamed from: e */
        private boolean f1323e;

        /* renamed from: f */
        private boolean f1324f;

        static {
            Covode.recordClassIndex(394);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getViewTypeCount() {
            return 3;
        }

        /* renamed from: a */
        public final int mo1332a() {
            int i = this.f1322d;
            this.f1322d = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f1322d = i;
            return i2;
        }

        public final int getCount() {
            int a = this.f1319a.mo1886a();
            if (!this.f1320b && this.f1319a.mo1891b() != null) {
                a--;
            }
            int min = Math.min(a, this.f1322d);
            if (this.f1324f) {
                return min + 1;
            }
            return min;
        }

        /* renamed from: a */
        public final void mo1333a(int i) {
            if (this.f1322d != i) {
                this.f1322d = i;
                notifyDataSetChanged();
            }
        }

        public final int getItemViewType(int i) {
            if (!this.f1324f || i != getCount() - 1) {
                return 0;
            }
            return 1;
        }

        /* renamed from: a */
        public final void mo1334a(boolean z) {
            if (this.f1324f != z) {
                this.f1324f = z;
                notifyDataSetChanged();
            }
        }

        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (!this.f1320b && this.f1319a.mo1891b() != null) {
                    i++;
                }
                return this.f1319a.mo1888a(i);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public final void mo1335a(boolean z, boolean z2) {
            if (this.f1320b != z || this.f1323e != z2) {
                this.f1320b = z;
                this.f1323e = z2;
                notifyDataSetChanged();
            }
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                if (view == null || view.getId() != R.id.c_7) {
                    view = C1764a.m5927a(LayoutInflater.from(this.f1321c.getContext()), R.layout.a9, viewGroup, false);
                }
                PackageManager packageManager = this.f1321c.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(R.id.bh1)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(R.id.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.f1320b || i != 0 || !this.f1323e) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View a = C1764a.m5927a(LayoutInflater.from(this.f1321c.getContext()), R.layout.a9, viewGroup, false);
                a.setId(1);
                ((TextView) a.findViewById(R.id.title)).setText(this.f1321c.getContext().getString(R.string.lb));
                return a;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1318a() {
        if (!getListPopupWindow().f1501w.isShowing()) {
            return true;
        }
        getListPopupWindow().mo918d();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1314m);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final C0381aa getListPopupWindow() {
        if (this.f1315n == null) {
            C0381aa aaVar = new C0381aa(getContext());
            this.f1315n = aaVar;
            aaVar.mo1709a(this.f1302a);
            this.f1315n.f1493o = this;
            this.f1315n.mo1711b();
            this.f1315n.f1495q = this.f1310i;
            this.f1315n.mo1710a(this.f1310i);
        }
        return this.f1315n;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0418c cVar = this.f1302a.f1319a;
        if (cVar != null) {
            cVar.unregisterObserver(this.f1306e);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1314m);
        }
        if (m1322b()) {
            mo1318a();
        }
        this.f1316o = false;
    }

    public final void setDefaultActionButtonContentDescription(int i) {
        this.f1317p = i;
    }

    public final void setInitialActivityCount(int i) {
        this.f1309h = i;
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1307f = onDismissListener;
    }

    public final void setProvider(AbstractC0763b bVar) {
        this.f1305d = bVar;
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1312k.setImageDrawable(drawable);
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1312k.setContentDescription(getContext().getString(i));
    }

    public final void setActivityChooserModel(C0418c cVar) {
        C0349a aVar = this.f1302a;
        C0418c cVar2 = aVar.f1321c.f1302a.f1319a;
        if (cVar2 != null && aVar.f1321c.isShown()) {
            cVar2.unregisterObserver(aVar.f1321c.f1306e);
        }
        aVar.f1319a = cVar;
        if (cVar != null && aVar.f1321c.isShown()) {
            cVar.registerObserver(aVar.f1321c.f1306e);
        }
        aVar.notifyDataSetChanged();
        if (getListPopupWindow().f1501w.isShowing()) {
            mo1318a();
            if (!getListPopupWindow().f1501w.isShowing() && this.f1316o) {
                this.f1308g = false;
                mo1317a(this.f1309h);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1317a(int r6) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActivityChooserView.mo1317a(int):void");
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View view = this.f1311j;
        if (this.f1304c.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1311j.layout(0, 0, i3 - i, i4 - i2);
        if (!m1322b()) {
            mo1318a();
        }
    }
}
