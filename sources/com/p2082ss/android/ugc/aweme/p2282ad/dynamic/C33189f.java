package com.p2082ss.android.ugc.aweme.p2282ad.dynamic;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33209f;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33203a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f */
public final class C33189f implements AbstractC33208e, AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C33190a f78863e = new C33190a((byte) 0);

    /* renamed from: a */
    public long f78864a;

    /* renamed from: b */
    public long f78865b = 1;

    /* renamed from: c */
    public int f78866c;

    /* renamed from: d */
    public final ViewGroup f78867d;

    /* renamed from: f */
    private Aweme f78868f;

    /* renamed from: g */
    private BulletContainerView f78869g;

    /* renamed from: h */
    private AbstractC16208i f78870h;

    /* renamed from: i */
    private final List<AbstractC33209f> f78871i = new ArrayList();

    static {
        Covode.recordClassIndex(40009);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(293, new RunnableC90250g(C33189f.class, "onDynamicAdStatusEvent", C33188e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f$a */
    public static final class C33190a {
        static {
            Covode.recordClassIndex(40010);
        }

        private C33190a() {
        }

        public /* synthetic */ C33190a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f$g */
    public static final class C33196g implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f78877a;

        /* renamed from: b */
        final /* synthetic */ String f78878b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f78879c = null;

        /* renamed from: d */
        private final String f78880d;

        static {
            Covode.recordClassIndex(40016);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f78880d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f78877a;
        }

        C33196g(String str, JSONObject jSONObject) {
            this.f78878b = str;
            this.f78880d = str;
            this.f78877a = null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: f */
    public final long mo59102f() {
        return this.f78864a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: g */
    public final long mo59103g() {
        return this.f78865b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: e */
    public final boolean mo59101e() {
        if (this.f78866c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo59094a() {
        String aid;
        Aweme aweme = this.f78868f;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: b */
    public final void mo59097b() {
        m68025a("play");
        this.f78866c = 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: c */
    public final void mo59099c() {
        m68025a("pause");
        this.f78866c = 2;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: d */
    public final void mo59100d() {
        m68025a("stop");
        this.f78866c = 3;
        this.f78864a = 0;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f$b */
    static final class C33191b extends AbstractC89220m implements AbstractC89172b<AbstractC33209f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33189f f78872a;

        static {
            Covode.recordClassIndex(40011);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33191b(C33189f fVar) {
            super(1);
            this.f78872a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC33209f fVar) {
            AbstractC33209f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            fVar2.mo59137a(this.f78872a.mo59094a(), this.f78872a.f78865b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f$c */
    static final class C33192c extends AbstractC89220m implements AbstractC89172b<AbstractC33209f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33189f f78873a;

        static {
            Covode.recordClassIndex(40012);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33192c(C33189f fVar) {
            super(1);
            this.f78873a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC33209f fVar) {
            AbstractC33209f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            this.f78873a.f78866c = 1;
            fVar2.mo59136a(this.f78873a.mo59094a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f$d */
    static final class C33193d extends AbstractC89220m implements AbstractC89172b<AbstractC33209f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33189f f78874a;

        static {
            Covode.recordClassIndex(40013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33193d(C33189f fVar) {
            super(1);
            this.f78874a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC33209f fVar) {
            AbstractC33209f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            this.f78874a.f78866c = 3;
            fVar2.mo59139b(this.f78874a.mo59094a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f$e */
    static final class C33194e extends AbstractC89220m implements AbstractC89172b<AbstractC33209f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33189f f78875a;

        static {
            Covode.recordClassIndex(40014);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33194e(C33189f fVar) {
            super(1);
            this.f78875a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC33209f fVar) {
            AbstractC33209f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            fVar2.mo59140c(this.f78875a.mo59094a());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.dynamic.f$f */
    static final class C33195f extends AbstractC89220m implements AbstractC89172b<AbstractC33209f, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33189f f78876a;

        static {
            Covode.recordClassIndex(40015);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33195f(C33189f fVar) {
            super(1);
            this.f78876a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC33209f fVar) {
            AbstractC33209f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            fVar2.mo59138a(this.f78876a.mo59094a(), this.f78876a.f78864a, this.f78876a.f78865b);
            return C89391z.f203057a;
        }
    }

    public C33189f(ViewGroup viewGroup) {
        C89219l.m154721d(viewGroup, "");
        this.f78867d = viewGroup;
    }

    /* renamed from: a */
    private final void m68024a(AbstractC89172b<? super AbstractC33209f, C89391z> bVar) {
        Iterator<T> it = this.f78871i.iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: b */
    public final void mo59098b(AbstractC33209f fVar) {
        C89219l.m154721d(fVar, "");
        this.f78871i.remove(fVar);
    }

    /* renamed from: a */
    private final void m68025a(String str) {
        C89219l.m154721d("sendEventToFe: ".concat(String.valueOf(str)), "");
        AbstractC16208i iVar = this.f78870h;
        if (iVar != null) {
            iVar.onEvent(new C33196g(str, null));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: a */
    public final void mo59095a(AbstractC33209f fVar) {
        C89219l.m154721d(fVar, "");
        this.f78871i.add(fVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e
    /* renamed from: a */
    public final void mo59096a(Aweme aweme) {
        MethodCollector.m26663i(7427);
        if (aweme == null) {
            MethodCollector.m26664o(7427);
            return;
        }
        this.f78868f = aweme;
        C89219l.m154721d("attachBulletView", "");
        ViewGroup viewGroup = null;
        if (this.f78867d.getChildAt(0) instanceof BulletContainerView) {
            this.f78867d.removeViewAt(0);
            this.f78869g = null;
            this.f78870h = null;
        }
        C33203a a = C33180b.f78839a.mo59083a(mo59094a());
        if (a == null) {
            C89219l.m154721d("attachBulletView failed, dynamicAdCache not found", "");
            MethodCollector.m26664o(7427);
        } else if (a.f78897a != 1) {
            C89219l.m154721d("attachBulletView failed, fe not ready", "");
            MethodCollector.m26664o(7427);
        } else {
            BulletContainerView bulletContainerView = a.f78898b;
            if (bulletContainerView == null) {
                C89219l.m154721d("attachBulletView failed, bulletView == null", "");
                MethodCollector.m26664o(7427);
                return;
            }
            if (bulletContainerView.getParent() != null) {
                C89219l.m154721d("bulletView parent not null", "");
                ViewParent parent = bulletContainerView.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = parent;
                }
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(bulletContainerView);
                }
            }
            this.f78869g = bulletContainerView;
            this.f78870h = a.f78899c;
            long j = a.f78900d;
            if (j <= 0) {
                j = 1;
            }
            this.f78865b = j;
            ViewGroup viewGroup3 = this.f78867d;
            if (viewGroup3 instanceof FrameLayout) {
                viewGroup3.addView(this.f78869g, 0, new FrameLayout.LayoutParams(-1, -1, 17));
                MethodCollector.m26664o(7427);
            } else if (viewGroup3 instanceof RelativeLayout) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13, -1);
                this.f78867d.addView(this.f78869g, 0, layoutParams);
                MethodCollector.m26664o(7427);
            } else {
                viewGroup3.addView(this.f78869g, 0, new ViewGroup.LayoutParams(-1, -1));
                MethodCollector.m26664o(7427);
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDynamicAdStatusEvent(C33188e eVar) {
        int i;
        JSONObject jSONObject;
        C89219l.m154721d(eVar, "");
        int i2 = eVar.f78860a;
        BulletContainerView bulletContainerView = this.f78869g;
        if (bulletContainerView != null) {
            i = bulletContainerView.hashCode();
        } else {
            i = 0;
        }
        if (i2 == i) {
            C89219l.m154714a((Object) eVar.f78861b, (Object) "updateTime");
            C89219l.m154721d("onDynamicAdStatusEvent, type: " + eVar.f78861b + ", params: " + eVar.f78862c, "");
            String str = eVar.f78861b;
            switch (str.hashCode()) {
                case -934426579:
                    if (str.equals("resume")) {
                        m68024a(new C33192c(this));
                        return;
                    }
                    return;
                case -599445191:
                    if (str.equals("complete")) {
                        m68024a(new C33194e(this));
                        return;
                    }
                    return;
                case -295931082:
                    if (str.equals("updateTime") && (jSONObject = eVar.f78862c) != null) {
                        this.f78864a = (long) jSONObject.optDouble("time");
                        m68024a(new C33195f(this));
                        return;
                    }
                    return;
                case 106440182:
                    if (str.equals("pause")) {
                        m68024a(new C33193d(this));
                        return;
                    }
                    return;
                case 108386723:
                    if (str.equals("ready")) {
                        m68024a(new C33191b(this));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
