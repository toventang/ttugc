package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.C41811b;
import com.p2082ss.android.ugc.aweme.discover.jedi.C42135b;
import com.p2082ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.performance.EnumC62846j;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p077b.C1731i;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.search.l.k */
public enum EnumC67634k {
    INSTANCE;
    

    /* renamed from: a */
    private final LinkedList<Future> f151536a = new LinkedList<>();
    public final ExecutorService executorService = C40780g.m82242a(C40787l.m82269a(EnumC40793o.SERIAL).mo70028a());
    public final Map<Class, Object> objectMap = new HashMap();

    /* renamed from: com.ss.android.ugc.aweme.search.l.k$a */
    public interface AbstractC67638a<T, R> {
        static {
            Covode.recordClassIndex(79277);
        }

        /* renamed from: a */
        R mo72937a();
    }

    static {
        Covode.recordClassIndex(79273);
    }

    public final void await() {
        if (C67641m.f151543a) {
            Iterator<Future> it = this.f151536a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().get();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            this.f151536a.clear();
        }
    }

    public final void async(Runnable runnable) {
        if (C67641m.f151543a) {
            this.f151536a.add(this.executorService.submit(runnable));
        } else {
            runnable.run();
        }
    }

    private EnumC67634k(String str) {
    }

    public final void prepare(Fragment fragment) {
        if (C67641m.f151543a) {
            EnumC62846j.INSTANCE.setContext(new MutableContextWrapper(fragment.getContext()));
            EnumC62846j.INSTANCE.preInflate(R.layout.atn, null).mo143300g();
            EnumC62846j.INSTANCE.preInflate(R.layout.aw_, null).mo143300g();
            EnumC62846j.INSTANCE.preInflate(R.layout.au4, null).mo143289d(new AbstractC88433f<View>() {
                /* class com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k.C676351 */

                static {
                    Covode.recordClassIndex(79274);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(View view) {
                    DmtTabLayout dmtTabLayout = (DmtTabLayout) view.findViewById(R.id.ee7);
                    dmtTabLayout.setCustomTabViewResId(R.layout.av8);
                    int a = C67458j.m119526a();
                    for (int i = 0; i < a; i++) {
                        DmtTabLayout.C17294f fVar = new DmtTabLayout.C17294f();
                        fVar.f41527h = dmtTabLayout;
                        fVar.f41528i = dmtTabLayout.mo27530b();
                        fVar.f41528i.mo27597a(fVar);
                        fVar.mo27589a(R.layout.av8);
                        DmtTabLayout.f41456b.release(fVar);
                    }
                }
            });
            EnumC62846j.INSTANCE.preInflate(R.layout.au3, null).mo143289d(new AbstractC88433f<View>() {
                /* class com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k.C676362 */

                static {
                    Covode.recordClassIndex(79275);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.p4567d.AbstractC88433f
                public final /* synthetic */ void accept(View view) {
                    C42135b bVar = new C42135b();
                    bVar.mo71340a(view);
                    bVar.mo72905I();
                    bVar.mo71300m();
                    EnumC67634k.this.objectMap.put(C42135b.class, bVar);
                }
            });
            C1731i.m5640b(new Callable<Object>() {
                /* class com.p2082ss.android.ugc.aweme.search.p3696l.EnumC67634k.CallableC676373 */

                static {
                    Covode.recordClassIndex(79276);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    try {
                        new SearchResultActivity();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        AVExternalServiceImpl.m113114a().classnameService();
                        new SearchState();
                        new C41811b(null, null);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return null;
                }
            }, C1731i.f5562a);
        }
    }

    public final <T> T computeIfAbsent(Class<T> cls, AbstractC67638a<Class<T>, T> aVar) {
        T t = (T) this.objectMap.get(cls);
        if (t == null) {
            return aVar.mo72937a();
        }
        this.objectMap.remove(cls);
        return t;
    }

    public final View getView(Context context, int i, ViewGroup viewGroup) {
        return EnumC62846j.INSTANCE.inflate(context, i, viewGroup);
    }

    public final View getView(LayoutInflater layoutInflater, Context context, int i, ViewGroup viewGroup) {
        return EnumC62846j.INSTANCE.inflate(layoutInflater, context, i, viewGroup);
    }
}
