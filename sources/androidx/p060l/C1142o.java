package androidx.p060l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.p037h.C0792v;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.l.o */
public final class C1142o {

    /* renamed from: a */
    static ArrayList<ViewGroup> f3881a = new ArrayList<>();

    /* renamed from: b */
    private static AbstractC1134m f3882b = new C1097b();

    /* renamed from: c */
    private static ThreadLocal<WeakReference<C0484a<ViewGroup, ArrayList<AbstractC1134m>>>> f3883c = new ThreadLocal<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.l.o$a */
    public static class View$OnAttachStateChangeListenerC1143a implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        AbstractC1134m f3884a;

        /* renamed from: b */
        ViewGroup f3885b;

        static {
            Covode.recordClassIndex(1236);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        /* renamed from: a */
        private void m3798a() {
            this.f3885b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3885b.removeOnAttachStateChangeListener(this);
        }

        public final boolean onPreDraw() {
            m3798a();
            if (!C1142o.f3881a.remove(this.f3885b)) {
                return true;
            }
            final C0484a<ViewGroup, ArrayList<AbstractC1134m>> a = C1142o.m3793a();
            ArrayList<AbstractC1134m> arrayList = a.get(this.f3885b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                a.put(this.f3885b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f3884a);
            this.f3884a.mo3908a(new C1141n() {
                /* class androidx.p060l.C1142o.View$OnAttachStateChangeListenerC1143a.C11441 */

                static {
                    Covode.recordClassIndex(1237);
                }

                @Override // androidx.p060l.AbstractC1134m.AbstractC1140c, androidx.p060l.C1141n
                /* renamed from: a */
                public final void mo3865a(AbstractC1134m mVar) {
                    ((ArrayList) a.get(View$OnAttachStateChangeListenerC1143a.this.f3885b)).remove(mVar);
                }
            });
            this.f3884a.mo3913a(this.f3885b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC1134m) it.next()).mo3932e(this.f3885b);
                }
            }
            this.f3884a.mo3911a(this.f3885b);
            return true;
        }

        public final void onViewDetachedFromWindow(View view) {
            m3798a();
            C1142o.f3881a.remove(this.f3885b);
            ArrayList<AbstractC1134m> arrayList = C1142o.m3793a().get(this.f3885b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<AbstractC1134m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo3932e(this.f3885b);
                }
            }
            this.f3884a.mo3917a(true);
        }

        View$OnAttachStateChangeListenerC1143a(AbstractC1134m mVar, ViewGroup viewGroup) {
            this.f3884a = mVar;
            this.f3885b = viewGroup;
        }
    }

    static {
        Covode.recordClassIndex(1235);
    }

    /* renamed from: a */
    static C0484a<ViewGroup, ArrayList<AbstractC1134m>> m3793a() {
        C0484a<ViewGroup, ArrayList<AbstractC1134m>> aVar;
        WeakReference<C0484a<ViewGroup, ArrayList<AbstractC1134m>>> weakReference = f3883c.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        C0484a<ViewGroup, ArrayList<AbstractC1134m>> aVar2 = new C0484a<>();
        f3883c.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    /* renamed from: a */
    public static void m3794a(ViewGroup viewGroup) {
        m3795a(viewGroup, null);
    }

    /* renamed from: b */
    private static void m3796b(ViewGroup viewGroup, AbstractC1134m mVar) {
        if (mVar != null && viewGroup != null) {
            View$OnAttachStateChangeListenerC1143a aVar = new View$OnAttachStateChangeListenerC1143a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: a */
    public static void m3795a(ViewGroup viewGroup, AbstractC1134m mVar) {
        if (!f3881a.contains(viewGroup) && C0792v.m2788v(viewGroup)) {
            f3881a.add(viewGroup);
            if (mVar == null) {
                mVar = f3882b;
            }
            AbstractC1134m e = mVar.clone();
            m3797c(viewGroup, e);
            viewGroup.setTag(R.id.en4, null);
            m3796b(viewGroup, e);
        }
    }

    /* renamed from: c */
    private static void m3797c(ViewGroup viewGroup, AbstractC1134m mVar) {
        ArrayList<AbstractC1134m> arrayList = m3793a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<AbstractC1134m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo3930d(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo3913a(viewGroup, true);
        }
        C1122j a = C1122j.m3729a(viewGroup);
        if (a != null && C1122j.m3729a(a.f3823a) == a && a.f3824b != null) {
            a.f3824b.run();
        }
    }
}
