package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.view.View;
import android.view.ViewParent;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.SearchRecyclerView;

/* renamed from: com.ss.android.ugc.aweme.search.l.j */
public final class C67631j {
    static {
        Covode.recordClassIndex(79270);
    }

    /* renamed from: a */
    public static SearchRecyclerView m119781a(View view) {
        if (view == null) {
            return null;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof SearchRecyclerView) {
                return (SearchRecyclerView) parent;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m119782a(final View view, final Runnable runnable) {
        SearchRecyclerView a = m119781a(view);
        if (a != null || C0792v.m2791y(view)) {
            m119783a(a, runnable);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                /* class com.p2082ss.android.ugc.aweme.search.p3696l.C67631j.View$OnAttachStateChangeListenerC676321 */

                static {
                    Covode.recordClassIndex(79271);
                }

                public final void onViewDetachedFromWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                }

                public final void onViewAttachedToWindow(View view) {
                    view.removeOnAttachStateChangeListener(this);
                    C67631j.m119783a(C67631j.m119781a(view), runnable);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m119783a(final SearchRecyclerView searchRecyclerView, final Runnable runnable) {
        if (searchRecyclerView == null || searchRecyclerView.getVisibility() == 0) {
            runnable.run();
        } else {
            searchRecyclerView.mo71644a(new SearchRecyclerView.AbstractC42440a() {
                /* class com.p2082ss.android.ugc.aweme.search.p3696l.C67631j.C676332 */

                static {
                    Covode.recordClassIndex(79272);
                }

                @Override // com.p2082ss.android.ugc.aweme.discover.mixfeed.p2794ui.SearchRecyclerView.AbstractC42440a
                /* renamed from: a */
                public final void mo71645a() {
                    runnable.run();
                    searchRecyclerView.f98914R.mo106612a().remove(this);
                }
            });
        }
    }
}
