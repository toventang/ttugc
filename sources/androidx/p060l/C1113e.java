package androidx.p060l;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0988q;
import androidx.p060l.AbstractC1134m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.l.e */
public class C1113e extends AbstractC0988q {
    static {
        Covode.recordClassIndex(1206);
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final boolean mo3662a(Object obj) {
        return obj instanceof AbstractC1134m;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final Object mo3663b(Object obj) {
        if (obj != null) {
            return ((AbstractC1134m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: c */
    public final Object mo3668c(Object obj) {
        if (obj == null) {
            return null;
        }
        C1146q qVar = new C1146q();
        qVar.mo3941a((AbstractC1134m) obj);
        return qVar;
    }

    /* renamed from: a */
    private static boolean m3700a(AbstractC1134m mVar) {
        if (!m3431a((List) mVar.f3853f) || !m3431a((List) mVar.f3855h) || !m3431a((List) mVar.f3856i)) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3655a(ViewGroup viewGroup, Object obj) {
        C1142o.m3795a(viewGroup, (AbstractC1134m) obj);
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final void mo3665b(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1134m) obj).mo3921b(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: c */
    public final void mo3669c(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1134m) obj).mo3925c(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3656a(Object obj, final Rect rect) {
        if (obj != null) {
            ((AbstractC1134m) obj).mo3915a(new AbstractC1134m.AbstractC1139b() {
                /* class androidx.p060l.C1113e.C11174 */

                static {
                    Covode.recordClassIndex(1210);
                }

                @Override // androidx.p060l.AbstractC1134m.AbstractC1139b
                /* renamed from: a */
                public final Rect mo3897a() {
                    Rect rect = rect;
                    if (rect == null || rect.isEmpty()) {
                        return null;
                    }
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3657a(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            m3429a(view, rect);
            ((AbstractC1134m) obj).mo3915a(new AbstractC1134m.AbstractC1139b() {
                /* class androidx.p060l.C1113e.C11141 */

                static {
                    Covode.recordClassIndex(1207);
                }

                @Override // androidx.p060l.AbstractC1134m.AbstractC1139b
                /* renamed from: a */
                public final Rect mo3897a() {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3660a(Object obj, ArrayList<View> arrayList) {
        AbstractC1134m mVar = (AbstractC1134m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C1146q) {
                C1146q qVar = (C1146q) mVar;
                int size = qVar.f3888a.size();
                while (i < size) {
                    mo3660a(qVar.mo3943c(i), arrayList);
                    i++;
                }
            } else if (!m3700a(mVar) && m3431a((List) mVar.f3854g)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    mVar.mo3921b(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final void mo3666b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((AbstractC1134m) obj).mo3908a(new AbstractC1134m.AbstractC1140c() {
            /* class androidx.p060l.C1113e.C11152 */

            static {
                Covode.recordClassIndex(1208);
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
            /* renamed from: b */
            public final void mo3866b(AbstractC1134m mVar) {
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
            /* renamed from: c */
            public final void mo3867c(AbstractC1134m mVar) {
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
            /* renamed from: d */
            public final void mo3868d(AbstractC1134m mVar) {
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
            /* renamed from: a */
            public final void mo3865a(AbstractC1134m mVar) {
                mVar.mo3922b(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final Object mo3654a(Object obj, Object obj2, Object obj3) {
        C1146q qVar = new C1146q();
        if (obj != null) {
            qVar.mo3941a((AbstractC1134m) obj);
        }
        if (obj2 != null) {
            qVar.mo3941a((AbstractC1134m) obj2);
        }
        if (obj3 != null) {
            qVar.mo3941a((AbstractC1134m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final Object mo3664b(Object obj, Object obj2, Object obj3) {
        AbstractC1134m mVar = (AbstractC1134m) obj;
        AbstractC1134m mVar2 = (AbstractC1134m) obj2;
        AbstractC1134m mVar3 = (AbstractC1134m) obj3;
        if (mVar != null) {
            if (mVar2 != null) {
                mVar = new C1146q().mo3941a(mVar).mo3941a(mVar2).mo3940a(1);
            }
        } else if (mVar2 != null) {
            mVar = mVar2;
        } else {
            mVar = null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C1146q qVar = new C1146q();
        if (mVar != null) {
            qVar.mo3941a(mVar);
        }
        qVar.mo3941a(mVar3);
        return qVar;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final void mo3667b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC1134m mVar = (AbstractC1134m) obj;
        int i = 0;
        if (mVar instanceof C1146q) {
            C1146q qVar = (C1146q) mVar;
            int size = qVar.f3888a.size();
            while (i < size) {
                mo3667b((Object) qVar.mo3943c(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m3700a(mVar)) {
            ArrayList<View> arrayList3 = mVar.f3854g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        mVar.mo3921b(arrayList2.get(i));
                        i++;
                    }
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    mVar.mo3925c(arrayList.get(size3));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3658a(Object obj, View view, ArrayList<View> arrayList) {
        AbstractC1134m mVar = (AbstractC1134m) obj;
        ArrayList<View> arrayList2 = mVar.f3854g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m3430a((List<View>) arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo3660a(mVar, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3661a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        AbstractC1134m mVar = (AbstractC1134m) obj;
        if (mVar != null) {
            mVar.f3854g.clear();
            mVar.f3854g.addAll(arrayList2);
            mo3667b((Object) mVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3659a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((AbstractC1134m) obj).mo3908a(new AbstractC1134m.AbstractC1140c() {
            /* class androidx.p060l.C1113e.C11163 */

            static {
                Covode.recordClassIndex(1209);
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
            /* renamed from: a */
            public final void mo3865a(AbstractC1134m mVar) {
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
            /* renamed from: b */
            public final void mo3866b(AbstractC1134m mVar) {
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
            /* renamed from: c */
            public final void mo3867c(AbstractC1134m mVar) {
            }

            @Override // androidx.p060l.AbstractC1134m.AbstractC1140c
            /* renamed from: d */
            public final void mo3868d(AbstractC1134m mVar) {
                Object obj = obj2;
                if (obj != null) {
                    C1113e.this.mo3667b(obj, arrayList, (ArrayList<View>) null);
                }
                Object obj2 = obj3;
                if (obj2 != null) {
                    C1113e.this.mo3667b(obj2, arrayList2, (ArrayList<View>) null);
                }
                Object obj3 = obj4;
                if (obj3 != null) {
                    C1113e.this.mo3667b(obj3, arrayList3, (ArrayList<View>) null);
                }
            }
        });
    }
}
