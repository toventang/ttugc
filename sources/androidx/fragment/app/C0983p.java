package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.p */
final class C0983p extends AbstractC0988q {
    static {
        Covode.recordClassIndex(1076);
    }

    C0983p() {
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final boolean mo3662a(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final Object mo3663b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: c */
    public final Object mo3668c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    private static boolean m3411a(Transition transition) {
        if (!m3431a((List) transition.getTargetIds()) || !m3431a((List) transition.getTargetNames()) || !m3431a((List) transition.getTargetTypes())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3655a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final void mo3665b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: c */
    public final void mo3669c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3656a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                /* class androidx.fragment.app.C0983p.C09874 */

                static {
                    Covode.recordClassIndex(1080);
                }

                public final Rect onGetEpicenter(Transition transition) {
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
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
                /* class androidx.fragment.app.C0983p.C09841 */

                static {
                    Covode.recordClassIndex(1077);
                }

                public final Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3660a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo3660a(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m3411a(transition) && m3431a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final Object mo3654a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final void mo3666b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            /* class androidx.fragment.app.C0983p.C09852 */

            static {
                Covode.recordClassIndex(1078);
            }

            public final void onTransitionCancel(Transition transition) {
            }

            public final void onTransitionPause(Transition transition) {
            }

            public final void onTransitionResume(Transition transition) {
            }

            public final void onTransitionStart(Transition transition) {
            }

            public final void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final Object mo3664b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null) {
            if (transition2 != null) {
                transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
            }
        } else if (transition2 != null) {
            transition = transition2;
        } else {
            transition = null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: b */
    public final void mo3667b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo3667b((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m3411a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i < size) {
                    transition.addTarget(arrayList2.get(i));
                    i++;
                }
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3658a(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m3430a(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo3660a(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3661a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3667b((Object) transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC0988q
    /* renamed from: a */
    public final void mo3659a(Object obj, final Object obj2, final ArrayList<View> arrayList, final Object obj3, final ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new Transition.TransitionListener() {
            /* class androidx.fragment.app.C0983p.C09863 */

            static {
                Covode.recordClassIndex(1079);
            }

            public final void onTransitionCancel(Transition transition) {
            }

            public final void onTransitionEnd(Transition transition) {
            }

            public final void onTransitionPause(Transition transition) {
            }

            public final void onTransitionResume(Transition transition) {
            }

            public final void onTransitionStart(Transition transition) {
                Object obj = obj2;
                if (obj != null) {
                    C0983p.this.mo3667b(obj, arrayList, (ArrayList<View>) null);
                }
                Object obj2 = obj3;
                if (obj2 != null) {
                    C0983p.this.mo3667b(obj2, arrayList2, (ArrayList<View>) null);
                }
                Object obj3 = obj4;
                if (obj3 != null) {
                    C0983p.this.mo3667b(obj3, arrayList3, (ArrayList<View>) null);
                }
            }
        });
    }
}
