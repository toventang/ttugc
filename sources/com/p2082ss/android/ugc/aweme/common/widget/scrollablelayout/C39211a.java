package com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.a */
public class C39211a {

    /* renamed from: a */
    public View f92630a;

    /* renamed from: b */
    public AbstractC39212a f92631b;

    /* renamed from: c */
    private int f92632c = Build.VERSION.SDK_INT;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.a$a */
    public interface AbstractC39212a {
        static {
            Covode.recordClassIndex(46845);
        }

        /* renamed from: m */
        View mo62680m();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.a$b */
    public interface AbstractC39213b {
        static {
            Covode.recordClassIndex(46846);
        }

        /* renamed from: q */
        boolean mo5599q();
    }

    static {
        Covode.recordClassIndex(46844);
    }

    /* renamed from: b */
    public final boolean mo68100b() {
        View a = mo68098a();
        if (a == null) {
            return false;
        }
        if (a instanceof AdapterView) {
            return m79560a((AdapterView) a);
        }
        if (a instanceof ScrollView) {
            return m79561a((ScrollView) a);
        }
        if (a instanceof AbstractC39213b) {
            return ((AbstractC39213b) a).mo5599q();
        }
        if (a instanceof RecyclerView) {
            return m79562a((RecyclerView) a);
        }
        if (a instanceof WebView) {
            return m79559a((WebView) a);
        }
        throw new IllegalStateException("scrollableView must be a instance of AdapterView|ScrollView|RecyclerView");
    }

    /* renamed from: a */
    public final View mo68098a() {
        AbstractC39212a aVar = this.f92631b;
        if (aVar == null) {
            return this.f92630a;
        }
        return aVar.mo62680m();
    }

    /* renamed from: a */
    private static boolean m79559a(WebView webView) {
        if (webView == null || webView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m79560a(AdapterView adapterView) {
        if (adapterView != null) {
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            View childAt = adapterView.getChildAt(0);
            if (childAt == null) {
                return true;
            }
            if (firstVisiblePosition == 0 && childAt.getTop() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m79561a(ScrollView scrollView) {
        if (scrollView == null || scrollView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m79562a(RecyclerView recyclerView) {
        if (recyclerView == null || recyclerView.canScrollVertically(-1)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo68099a(int i, int i2, int i3) {
        View a = mo68098a();
        if (a instanceof AbsListView) {
            AbsListView absListView = (AbsListView) a;
            if (this.f92632c >= 21) {
                absListView.fling(i);
            } else {
                absListView.smoothScrollBy(i2, i3);
            }
        } else if (a instanceof ScrollView) {
            ((ScrollView) a).fling(i);
        } else if (a instanceof RecyclerView) {
            ((RecyclerView) a).mo4420b(0, i);
        } else if (a instanceof WebView) {
            ((WebView) a).flingScroll(0, i);
        }
    }
}
