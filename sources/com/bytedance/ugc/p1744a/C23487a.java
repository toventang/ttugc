package com.bytedance.ugc.p1744a;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.UGCTools;
import com.bytedance.ugc.p1744a.C23497b;
import com.bytedance.ugc.p1744a.C23500c;
import com.bytedance.ugc.p1744a.p1745a.C23490a;
import com.bytedance.ugc.p1744a.p1745a.C23491b;
import com.bytedance.ugc.p1744a.p1745a.C23492c;
import com.bytedance.ugc.p1744a.p1745a.C23493d;
import com.bytedance.ugc.p1744a.p1745a.C23494e;
import com.bytedance.ugc.p1744a.p1745a.C23495f;
import com.bytedance.ugc.p1744a.p1745a.C23496g;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ugc.a.a */
public final class C23487a {

    /* renamed from: a */
    static Handler f55678a;

    /* renamed from: b */
    static C23500c.AbstractC23505d f55679b;

    /* renamed from: c */
    static C23500c.AbstractC23504c f55680c;

    /* renamed from: d */
    public static final C23487a f55681d = new C23487a();

    /* renamed from: e */
    private static final List<C23500c.AbstractC23501a> f55682e = C89070n.m154524c(C23495f.f55701a, C23493d.f55699a, C23491b.f55697a, C23492c.f55698a, C23496g.f55702a, C23494e.f55700a, C23490a.f55696a);

    /* renamed from: f */
    private static final CopyOnWriteArrayList<C23500c.AbstractC23501a> f55683f = new CopyOnWriteArrayList<>();

    private C23487a() {
    }

    static {
        Covode.recordClassIndex(27489);
    }

    /* renamed from: com.bytedance.ugc.a.a$b */
    public static final class RunnableC23489b implements Runnable {

        /* renamed from: a */
        private final View f55690a;

        /* renamed from: b */
        private final String f55691b;

        /* renamed from: c */
        private final C23500c.AbstractC23501a f55692c;

        /* renamed from: d */
        private final JSONObject f55693d = null;

        /* renamed from: e */
        private final C23500c.AbstractC23504c f55694e;

        /* renamed from: f */
        private final C23500c.AbstractC23505d f55695f;

        static {
            Covode.recordClassIndex(27491);
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C23500c.AbstractC23504c cVar = this.f55694e;
            if (cVar == null) {
                cVar = C23487a.f55680c;
            }
            if (cVar != null) {
                C23500c.AbstractC23505d dVar = this.f55695f;
                if (dVar == null) {
                    dVar = C23487a.f55679b;
                }
                C23497b bVar = new C23497b(this.f55690a.getWidth(), this.f55690a.getHeight());
                View view = this.f55690a;
                C23487a.m44186a(bVar, view, 0, 0, 0, 0, view.getWidth(), this.f55690a.getHeight(), this.f55692c);
                Handler handler = C23487a.f55678a;
                if (handler == null) {
                    handler = UGCTools.mainHandler;
                    C89219l.m154709a((Object) handler, "");
                }
                handler.post(new RunnableC23488a(bVar, this.f55690a, this.f55691b, this.f55693d, cVar, dVar));
                if (dVar != null) {
                    dVar.mo19175b(this.f55691b, System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }

        public RunnableC23489b(View view, String str, C23500c.AbstractC23501a aVar, JSONObject jSONObject, C23500c.AbstractC23504c cVar, C23500c.AbstractC23505d dVar) {
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            this.f55690a = view;
            this.f55691b = str;
            this.f55692c = aVar;
            this.f55694e = cVar;
            this.f55695f = dVar;
        }
    }

    /* renamed from: com.bytedance.ugc.a.a$a */
    public static final class RunnableC23488a implements Runnable {

        /* renamed from: a */
        private final C23497b f55684a;

        /* renamed from: b */
        private final View f55685b;

        /* renamed from: c */
        private final String f55686c;

        /* renamed from: d */
        private final JSONObject f55687d;

        /* renamed from: e */
        private final C23500c.AbstractC23504c f55688e;

        /* renamed from: f */
        private final C23500c.AbstractC23505d f55689f;

        static {
            Covode.recordClassIndex(27490);
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C23497b bVar = this.f55684a;
            View view = this.f55685b;
            String str = this.f55686c;
            C23500c.AbstractC23504c cVar = this.f55688e;
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            int i = ((bVar.f55706d - 1) / bVar.f55703a) + 1;
            int i2 = ((bVar.f55705c - 1) / bVar.f55703a) + 1;
            int i3 = i * i2;
            int[] iArr = new int[i3];
            for (Integer[] numArr : bVar.f55704b) {
                int max = Math.max(0, numArr[0].intValue() / bVar.f55703a);
                int max2 = Math.max(0, numArr[1].intValue() / bVar.f55703a);
                int min = Math.min(i2 - 1, numArr[2].intValue() / bVar.f55703a);
                int min2 = Math.min(i - 1, numArr[3].intValue() / bVar.f55703a);
                if (max2 <= min2) {
                    while (true) {
                        if (max <= min) {
                            int i4 = max;
                            while (true) {
                                iArr[(max2 * i2) + i4] = numArr[4].intValue();
                                if (i4 == min) {
                                    break;
                                }
                                i4++;
                            }
                        }
                        if (max2 == min2) {
                            break;
                        }
                        max2++;
                    }
                }
            }
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (iArr[i6] == 1) {
                    i5++;
                }
            }
            cVar.mo19173a(view, str, i3, i5, i3 - i5);
            C23500c.AbstractC23505d dVar = this.f55689f;
            if (dVar != null) {
                dVar.mo19174a(this.f55686c, System.currentTimeMillis() - currentTimeMillis);
            }
            if (C23500c.f55711a) {
                C23497b bVar2 = this.f55684a;
                View view2 = this.f55685b;
                C89219l.m154719c(view2, "");
                if (!(view2 instanceof ViewGroup)) {
                    view2 = null;
                }
                ViewGroup viewGroup = (ViewGroup) view2;
                if (viewGroup != null) {
                    UGCTools.mainHandler.post(new C23497b.RunnableC23499b(bVar2, viewGroup));
                }
            }
        }

        public RunnableC23488a(C23497b bVar, View view, String str, JSONObject jSONObject, C23500c.AbstractC23504c cVar, C23500c.AbstractC23505d dVar) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(view, "");
            C89219l.m154719c(str, "");
            C89219l.m154719c(cVar, "");
            this.f55684a = bVar;
            this.f55685b = view;
            this.f55686c = str;
            this.f55687d = jSONObject;
            this.f55688e = cVar;
            this.f55689f = dVar;
        }
    }

    /* renamed from: a */
    public static void m44186a(C23497b bVar, View view, int i, int i2, int i3, int i4, int i5, int i6, C23500c.AbstractC23501a aVar) {
        C89219l.m154719c(bVar, "");
        C89219l.m154719c(view, "");
        if (aVar != null && aVar.mo19176a(bVar, view, i, i2, i3, i4, i5, i6, aVar)) {
            return;
        }
        if (view instanceof C23500c.AbstractC23503b) {
            bVar.mo38239a(i3, i4, i5, i6, ((C23500c.AbstractC23503b) view).mo38242a());
            return;
        }
        Iterator<C23500c.AbstractC23501a> it = f55683f.iterator();
        while (it.hasNext()) {
            if (it.next().mo19176a(bVar, view, i, i2, i3, i4, i5, i6, aVar)) {
                return;
            }
        }
        for (C23500c.AbstractC23501a aVar2 : f55682e) {
            if (aVar2.mo19176a(bVar, view, i, i2, i3, i4, i5, i6, aVar)) {
                return;
            }
        }
        if (f55679b != null) {
            C89219l.m154719c(view, "");
        }
    }
}
