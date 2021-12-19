package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.search.activity.SearchResultActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.gu */
public final class C80514gu {

    /* renamed from: a */
    public static int f180114a = C16048b.m29633a().mo25412a(true, "search_result_activity_limit", 6);

    /* renamed from: b */
    public static Queue<List<SearchResultActivity>> f180115b = new LinkedList();

    /* renamed from: c */
    public static final C80514gu f180116c = new C80514gu();

    private C80514gu() {
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.gu$a */
    static final class RunnableC80515a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f180117a;

        static {
            Covode.recordClassIndex(93788);
        }

        RunnableC80515a(Activity activity) {
            this.f180117a = activity;
        }

        public final void run() {
            C80514gu.m139558a(this.f180117a);
        }
    }

    /* renamed from: b */
    public static List<SearchResultActivity> m139561b() {
        List<SearchResultActivity> list = (List) C89070n.m154576e((Iterable) f180115b);
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    /* renamed from: a */
    public static SearchResultActivity m139557a() {
        List<SearchResultActivity> b = m139561b();
        if (b == null || b.isEmpty()) {
            return null;
        }
        return b.get(b.size() - 1);
    }

    static {
        Covode.recordClassIndex(93787);
    }

    /* renamed from: a */
    public static Bundle m139556a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m139562b(Activity activity) {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC80515a(activity), 500);
    }

    /* renamed from: a */
    public static boolean m139560a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        Iterator<T> it = f180115b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C89219l.m154716b(next, "");
            Iterator it2 = next.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (C89219l.m154714a(it2.next(), eVar)) {
                        if (next.size() > 1) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m139558a(Activity activity) {
        for (T t : f180115b) {
            C89219l.m154716b(t, "");
            Iterator it = t.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C89219l.m154714a(it.next(), activity)) {
                        Iterator it2 = t.iterator();
                        while (it2.hasNext()) {
                            SearchResultActivity searchResultActivity = (SearchResultActivity) it2.next();
                            if (!C89219l.m154714a(searchResultActivity, activity)) {
                                it2.remove();
                                searchResultActivity.finish();
                            }
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m139559a(SearchResultActivity searchResultActivity) {
        C89219l.m154721d(searchResultActivity, "");
        if (!f180115b.isEmpty()) {
            Iterator<List<SearchResultActivity>> it = f180115b.iterator();
            while (it.hasNext()) {
                List<SearchResultActivity> next = it.next();
                Iterator<SearchResultActivity> it2 = next.iterator();
                while (it2.hasNext()) {
                    if (C89219l.m154714a(it2.next(), searchResultActivity)) {
                        it2.remove();
                    }
                }
                if (next.size() == 0) {
                    it.remove();
                }
            }
        }
    }
}
