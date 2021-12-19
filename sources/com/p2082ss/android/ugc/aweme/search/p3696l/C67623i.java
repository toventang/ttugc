package com.p2082ss.android.ugc.aweme.search.p3696l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2780b.C42193a;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2782d.C42213c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx.C42421a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx.C42422b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.lynx.C42423c;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.search.l.i */
public final class C67623i {

    /* renamed from: f */
    public static volatile AtomicInteger f151509f = new AtomicInteger(0);

    /* renamed from: a */
    public AbstractC67630a f151510a;

    /* renamed from: b */
    public AbstractC67621h f151511b;

    /* renamed from: c */
    public AbstractC67621h f151512c;

    /* renamed from: d */
    public AbstractC67621h f151513d;

    /* renamed from: e */
    public Handler f151514e = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private ViewGroup f151515g;

    /* renamed from: com.ss.android.ugc.aweme.search.l.i$a */
    public interface AbstractC67630a {
        static {
            Covode.recordClassIndex(79269);
        }

        /* renamed from: b */
        RecyclerView.ViewHolder mo106627b(ViewGroup viewGroup);

        /* renamed from: c */
        RecyclerView.ViewHolder mo71333c(ViewGroup viewGroup);

        /* renamed from: d */
        RecyclerView.ViewHolder mo71334d(ViewGroup viewGroup);
    }

    /* renamed from: b */
    public static void m119773b() {
        f151509f.compareAndSet(1, 2);
    }

    /* renamed from: a */
    public final void mo106624a() {
        this.f151512c.mo106621a(2);
    }

    static {
        Covode.recordClassIndex(79262);
    }

    public C67623i(final ViewGroup viewGroup, final AbstractC67630a aVar) {
        this.f151515g = viewGroup;
        this.f151510a = aVar;
        this.f151511b = new AbstractC67621h(this.f151514e) {
            /* class com.p2082ss.android.ugc.aweme.search.p3696l.C67623i.C676241 */

            static {
                Covode.recordClassIndex(79263);
            }

            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.android.ugc.aweme.search.p3696l.AbstractC67621h
            /* renamed from: a */
            public final RecyclerView.ViewHolder mo106620a() {
                return aVar.mo71333c(viewGroup);
            }
        };
        this.f151512c = new AbstractC67621h(this.f151514e) {
            /* class com.p2082ss.android.ugc.aweme.search.p3696l.C67623i.C676252 */

            static {
                Covode.recordClassIndex(79264);
            }

            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.android.ugc.aweme.search.p3696l.AbstractC67621h
            /* renamed from: a */
            public final RecyclerView.ViewHolder mo106620a() {
                return aVar.mo71334d(viewGroup);
            }
        };
        this.f151513d = new AbstractC67621h(this.f151514e) {
            /* class com.p2082ss.android.ugc.aweme.search.p3696l.C67623i.C676263 */

            static {
                Covode.recordClassIndex(79265);
            }

            /* access modifiers changed from: package-private */
            @Override // com.p2082ss.android.ugc.aweme.search.p3696l.AbstractC67621h
            /* renamed from: a */
            public final RecyclerView.ViewHolder mo106620a() {
                return aVar.mo106627b(viewGroup);
            }
        };
    }

    /* renamed from: a */
    public static void m119772a(Context context, String str, C42421a aVar) {
        C42423c cVar;
        List<C42422b> list;
        String str2;
        if (!(aVar == null || (cVar = aVar.f98838a) == null || (list = cVar.f98843a) == null || aVar.f98839b == null || !TextUtils.equals(str, aVar.f98839b.getRequestKeyword()))) {
            aVar.f98839b.getRequestKeyword();
            list.size();
            for (C42422b bVar : list) {
                if (TextUtils.isEmpty(bVar.f98840a)) {
                    str2 = bVar.f98842c;
                } else {
                    str2 = bVar.f98840a;
                }
                if (str2 != null) {
                    C42213c.C42214a.m84501a(str2, 2);
                    C42193a.f98351b.mo71392a(context, str2, bVar.f98841b);
                }
            }
        }
    }
}
