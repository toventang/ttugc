package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.q */
public abstract class AbstractC0988q {
    static {
        Covode.recordClassIndex(1081);
    }

    /* renamed from: a */
    public abstract Object mo3654a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    public abstract void mo3655a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo3656a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo3657a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo3658a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo3659a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo3660a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo3661a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo3662a(Object obj);

    /* renamed from: b */
    public abstract Object mo3663b(Object obj);

    /* renamed from: b */
    public abstract Object mo3664b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo3665b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo3666b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo3667b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo3668c(Object obj);

    /* renamed from: c */
    public abstract void mo3669c(Object obj, View view);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3683a(ArrayList<View> arrayList, View view) {
        Boolean bool;
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (Build.VERSION.SDK_INT < 21 ? ((bool = (Boolean) viewGroup.getTag(R.id.eey)) == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0792v.m2778l(viewGroup) == null : !viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo3683a(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3684a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String l = C0792v.m2778l(view);
            if (l != null) {
                map.put(l, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo3684a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m3431a(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    static ArrayList<String> m3428a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C0792v.m2778l(view));
            C0792v.m2752a(view, (String) null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    protected static void m3429a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    protected static void m3430a(List<View> list, View view) {
        int size = list.size();
        if (!m3432a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m3432a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m3432a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3682a(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String l = C0792v.m2778l(view2);
            arrayList4.add(l);
            if (l != null) {
                C0792v.m2752a(view2, (String) null);
                String str = map.get(l);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C0792v.m2752a(arrayList2.get(i2), l);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        View$OnAttachStateChangeListenerC0992r.m3452a(view, new Runnable() {
            /* class androidx.fragment.app.AbstractC0988q.RunnableC09891 */

            static {
                Covode.recordClassIndex(1082);
            }

            public final void run() {
                for (int i = 0; i < size; i++) {
                    C0792v.m2752a((View) arrayList2.get(i), (String) arrayList3.get(i));
                    C0792v.m2752a((View) arrayList.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }
}
