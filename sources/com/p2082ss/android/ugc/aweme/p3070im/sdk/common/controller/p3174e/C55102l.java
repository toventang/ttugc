package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1208im.core.api.C17419b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17441h;
import com.bytedance.ies.p1208im.core.api.p1211b.p1212a.AbstractC17422a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1417i.AbstractC19718b;
import com.bytedance.p1399im.core.p1417i.C19720d;
import com.p2082ss.android.ugc.aweme.inbox.p3266a.C56297a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61561m;
import com.p2082ss.android.ugc.aweme.notice.api.p3509ab.C61538b;
import com.p2082ss.android.ugc.aweme.notice.api.p3510b.C61547c;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.p3150b.C54871c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54848c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54852e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a.C54856f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3170a.C55054g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55127a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55137h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3177h.p3178a.C55138i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55168aa;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55219n;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3200b.p3201a.C55361a;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56220e;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMunder16Proxy;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3251b.C56198e;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56202c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89587ci;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l */
public final class C55102l implements AbstractC19718b, HandlerC53707g.AbstractC53708a, AbstractC90252i, AbstractC90253j {

    /* renamed from: i */
    public static volatile C55102l f126096i;

    /* renamed from: j */
    public static volatile boolean f126097j;

    /* renamed from: k */
    public static final C55104a f126098k = new C55104a((byte) 0);

    /* renamed from: a */
    public final Map<String, AbstractC56237a> f126099a;

    /* renamed from: b */
    public final Map<String, AbstractC56237a> f126100b;

    /* renamed from: c */
    public volatile int f126101c;

    /* renamed from: d */
    public volatile boolean f126102d;

    /* renamed from: e */
    public final Handler f126103e;

    /* renamed from: f */
    public final AbstractC1214u<List<Long>> f126104f;

    /* renamed from: g */
    public final Comparator<AbstractC56237a> f126105g;

    /* renamed from: h */
    public final AbstractC55105b f126106h;

    /* renamed from: l */
    private final AbstractC89516am f126107l;

    /* renamed from: m */
    private final Set<AbstractC55101k<AbstractC56237a>> f126108m;

    /* renamed from: n */
    private AbstractC89568bz f126109n;

    /* renamed from: o */
    private HandlerC53707g.AbstractC53708a f126110o;

    /* renamed from: p */
    private final AbstractC17422a f126111p;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$b */
    public interface AbstractC55105b {
        static {
            Covode.recordClassIndex(64833);
        }

        /* renamed from: a */
        AbstractC56237a mo92019a(C19638h hVar);

        /* renamed from: a */
        void mo92020a(int i);

        /* renamed from: a */
        void mo92021a(int i, boolean z, boolean z2);

        /* renamed from: a */
        boolean mo92022a();

        /* renamed from: b */
        Map<String, AbstractC56237a> mo92023b();

        /* renamed from: b */
        void mo92024b(int i);

        /* renamed from: c */
        Map<String, AbstractC56237a> mo92025c();

        /* renamed from: d */
        int mo92026d();

        /* renamed from: e */
        List<C19638h> mo92027e();

        /* renamed from: f */
        Comparator<AbstractC56237a> mo92028f();

        /* renamed from: g */
        boolean mo92029g();

        /* renamed from: h */
        boolean mo92030h();

        /* renamed from: i */
        boolean mo92031i();

        /* renamed from: j */
        boolean mo92032j();
    }

    static {
        Covode.recordClassIndex(64830);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a
    /* renamed from: a */
    public final void mo90255a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a
    /* renamed from: a */
    public final void mo90257a(Object obj, int i) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(177, new RunnableC90250g(C55102l.class, "updateU16Settings", C56198e.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$a */
    public static final class C55104a {
        static {
            Covode.recordClassIndex(64832);
        }

        private C55104a() {
        }

        /* renamed from: a */
        public static C55102l m100801a() {
            C55102l lVar;
            MethodCollector.m26663i(3169);
            C55102l lVar2 = C55102l.f126096i;
            if (lVar2 == null) {
                synchronized (C55102l.class) {
                    try {
                        lVar = C55102l.f126096i;
                        if (lVar == null) {
                            lVar = new C55102l((byte) 0);
                            C55102l.f126096i = lVar;
                        }
                    } finally {
                        MethodCollector.m26664o(3169);
                    }
                }
                return lVar;
            }
            MethodCollector.m26664o(3169);
            return lVar2;
        }

        public /* synthetic */ C55104a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$c */
    public static final class C55106c implements AbstractC55105b {

        /* renamed from: a */
        final /* synthetic */ C55102l f126113a;

        static {
            Covode.recordClassIndex(64834);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: b */
        public final Map<String, AbstractC56237a> mo92023b() {
            return this.f126113a.f126100b;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: c */
        public final Map<String, AbstractC56237a> mo92025c() {
            return this.f126113a.f126099a;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: d */
        public final int mo92026d() {
            return this.f126113a.f126101c;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: f */
        public final Comparator<AbstractC56237a> mo92028f() {
            return this.f126113a.f126105g;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: g */
        public final boolean mo92029g() {
            return C56202c.m102111a();
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: i */
        public final boolean mo92031i() {
            return C56297a.m102301c();
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: j */
        public final boolean mo92032j() {
            return C61538b.m111451b();
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: e */
        public final List<C19638h> mo92027e() {
            return AbstractC17420a.C17421a.m32276a().mo27721a();
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: h */
        public final boolean mo92030h() {
            if (C55054g.m100677a() > 0) {
                return true;
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: a */
        public final boolean mo92022a() {
            return this.f126113a.f126102d;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55106c(C55102l lVar) {
            this.f126113a = lVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: a */
        public final void mo92020a(int i) {
            this.f126113a.f126101c = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: a */
        public final AbstractC56237a mo92019a(C19638h hVar) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(hVar, "");
            return C54871c.m100470a(hVar);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: b */
        public final void mo92024b(int i) {
            AbstractC81915c.m141874a(new C61547c(i));
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.AbstractC55105b
        /* renamed from: a */
        public final void mo92021a(int i, boolean z, boolean z2) {
            C55127a.f126154a.mo92037a(new C55138i(C55197c.m100919b().toString()), new C55137h(i, z, z2));
        }
    }

    /* renamed from: f */
    public final void mo92017f() {
        this.f126103e.sendEmptyMessage(1);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$i */
    static final class RunnableC55113i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C55102l f126126a;

        static {
            Covode.recordClassIndex(64841);
        }

        RunnableC55113i(C55102l lVar) {
            this.f126126a = lVar;
        }

        public final void run() {
            if (C55197c.m100917a()) {
                this.f126126a.mo92015d();
            }
        }
    }

    /* renamed from: d */
    public final void mo92015d() {
        if (C17419b.m32261a().mo27896d() != null) {
            C55361a.f126584d.mo92406a();
            AbstractC89568bz unused = C89624i.m155555a(this.f126107l, C33429a.f79465a, null, new C55107d(this, null), 2);
        }
    }

    /* renamed from: g */
    private final synchronized AbstractC89568bz m100786g() {
        AbstractC89568bz bzVar;
        MethodCollector.m26663i(3809);
        C56244a.m102191c("SessionListManager", "syncSessionListI18n step 1");
        boolean unused = C55127a.f126154a.mo92038a(new C55138i(C55197c.m100919b().toString()), false);
        C56244a.m102191c("SessionListManager", "syncSessionListI18n step 2");
        bzVar = C89624i.m155555a(this.f126107l, null, null, new C55114j(this, null), 3);
        MethodCollector.m26664o(3809);
        return bzVar;
    }

    /* renamed from: h */
    private final synchronized AbstractC89568bz m100787h() {
        AbstractC89568bz bzVar;
        MethodCollector.m26663i(3893);
        C56244a.m102191c("SessionListManager", "syncSessionListNotice");
        bzVar = C89624i.m155555a(this.f126107l, null, null, new C55116k(this, null), 3);
        MethodCollector.m26664o(3893);
        return bzVar;
    }

    private C55102l() {
        this.f126107l = C89517an.m155448a(C89546bf.f203267b);
        this.f126105g = C55108e.f126116a;
        this.f126099a = new ConcurrentHashMap();
        this.f126100b = new ConcurrentHashMap();
        this.f126108m = new HashSet();
        this.f126110o = this;
        this.f126103e = new HandlerC53707g(Looper.getMainLooper(), this.f126110o);
        this.f126104f = new AbstractC1214u(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.C551031 */

            /* renamed from: a */
            final /* synthetic */ C55102l f126112a;

            static {
                Covode.recordClassIndex(64831);
            }

            {
                this.f126112a = r1;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* synthetic */ void onChanged(Object obj) {
                this.f126112a.f126102d = true;
                this.f126112a.f126103e.sendEmptyMessage(2);
            }
        };
        this.f126111p = new C55109f(this);
        this.f126106h = new C55106c(this);
    }

    /* renamed from: b */
    public final void mo92012b() {
        int i;
        C61542b.m111460a(99, this.f126101c);
        AbstractC81915c.m141874a(new C61561m(99, this.f126101c));
        if (C54881c.m100493a()) {
            i = 1;
        } else {
            i = -1;
        }
        C61542b.m111460a(101, i);
        AbstractC81915c.m141874a(new C61561m(101, i));
        C56244a.m102191c("notice_count", "postUnreadCount=" + this.f126101c + " unreadDot=" + i);
    }

    /* renamed from: c */
    public final void mo92014c() {
        AbstractC17420a.C17421a.m32276a().mo27723a(this.f126111p);
        AbstractC17441h.C17442a.m32359a().mo27779a(this);
        AbstractC89568bz unused = C89624i.m155555a(this.f126107l, C33429a.f79465a, null, new C55112h(this, null), 2);
        if (C56201b.m102110a()) {
            if (C17419b.m32261a().mo27896d() != null) {
                mo92015d();
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC55113i(this), InteractFirstFrameTimeOutDurationSetting.DEFAULT);
            }
        }
        C55168aa.m100877a();
    }

    /* renamed from: e */
    public final void mo92016e() {
        AbstractC17420a.C17421a.m32276a().mo27729b(this.f126111p);
        AbstractC17441h.C17442a.m32359a().mo27781b(this);
        AbstractC89568bz unused = C89624i.m155555a(this.f126107l, C33429a.f79465a, null, new C55118l(this, null), 2);
        if (C56201b.m102110a() && C17419b.m32261a().mo27896d() != null) {
            C55361a aVar = C55361a.f126584d;
            C55361a.f126581a.clear();
            AbstractC17420a.C17421a.m32276a().mo27729b(aVar);
            AbstractC89568bz unused2 = C89624i.m155555a(this.f126107l, C33429a.f79465a, null, new C55119m(this, null), 2);
        }
        this.f126103e.removeMessages(2);
        AbstractC89568bz bzVar = this.f126109n;
        if (bzVar != null) {
            bzVar.mo143985a((CancellationException) null);
        }
        this.f126099a.clear();
        this.f126100b.clear();
        this.f126102d = false;
        this.f126101c = 0;
        mo92012b();
    }

    public /* synthetic */ C55102l(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$f */
    public static final class C55109f implements AbstractC17422a {

        /* renamed from: a */
        final /* synthetic */ C55102l f126117a;

        static {
            Covode.recordClassIndex(64837);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28003a(String str, int i) {
            C89219l.m154721d(str, "");
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28004a(String str, int i, List<Long> list) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(list, "");
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28005a(String str, List<? extends C19537ah> list) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(list, "");
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28006a(List<? extends C19537ah> list) {
            C89219l.m154721d(list, "");
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: b */
        public final void mo28012b(List<? extends C19537ah> list) {
            C89219l.m154721d(list, "");
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: c */
        public final void mo28014c(C19638h hVar) {
            C89219l.m154721d(hVar, "");
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: c */
        public final void mo28015c(List<? extends C19537ah> list) {
            C89219l.m154721d(list, "");
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: d */
        public final int mo28016d() {
            return 0;
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: d */
        public final void mo28017d(C19638h hVar) {
            C89219l.m154721d(hVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C55109f(C55102l lVar) {
            this.f126117a = lVar;
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28001a(C19638h hVar) {
            C89219l.m154721d(hVar, "");
            this.f126117a.f126102d = true;
            this.f126117a.f126103e.sendEmptyMessage(2);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: b */
        public final void mo28010b(C19638h hVar) {
            C89219l.m154721d(hVar, "");
            this.f126117a.f126102d = true;
            this.f126117a.f126103e.sendEmptyMessage(2);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19667p
        /* renamed from: a */
        public final void mo28007a(Map<String, ? extends C19638h> map) {
            C89219l.m154721d(map, "");
            C55102l.f126097j = true;
            this.f126117a.f126102d = true;
            this.f126117a.f126103e.sendEmptyMessage(2);
        }

        @Override // com.bytedance.p1399im.core.p1408d.AbstractC19669r
        /* renamed from: a */
        public final void mo28002a(C19638h hVar, int i) {
            C89219l.m154721d(hVar, "");
            this.f126117a.f126102d = true;
            this.f126117a.f126103e.sendEmptyMessage(2);
        }
    }

    /* renamed from: b */
    public final void mo92013b(AbstractC55101k<AbstractC56237a> kVar) {
        Set<AbstractC55101k<AbstractC56237a>> set = this.f126108m;
        Objects.requireNonNull(set, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        C89206ad.m154680b(set).remove(kVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$d */
    public static final class C55107d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126114a;

        /* renamed from: b */
        final /* synthetic */ C55102l f126115b;

        static {
            Covode.recordClassIndex(64835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55107d(C55102l lVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126115b = lVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55107d(this.f126115b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55107d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f126114a == 0) {
                C89382r.m154942a(obj);
                C55361a.f126582b.observeForever(this.f126115b.f126104f);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$h */
    static final class C55112h extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126124a;

        /* renamed from: b */
        final /* synthetic */ C55102l f126125b;

        static {
            Covode.recordClassIndex(64840);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55112h(C55102l lVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126125b = lVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55112h(this.f126125b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55112h) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f126124a == 0) {
                C89382r.m154942a(obj);
                EventBus.m156966a(EventBus.m156962a(), this.f126125b);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$l */
    static final class C55118l extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126140a;

        /* renamed from: b */
        final /* synthetic */ C55102l f126141b;

        static {
            Covode.recordClassIndex(64846);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55118l(C55102l lVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126141b = lVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55118l(this.f126141b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55118l) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f126140a == 0) {
                C89382r.m154942a(obj);
                EventBus.m156962a().mo145395b(this.f126141b);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$m */
    static final class C55119m extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126142a;

        /* renamed from: b */
        final /* synthetic */ C55102l f126143b;

        static {
            Covode.recordClassIndex(64847);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55119m(C55102l lVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126143b = lVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55119m(this.f126143b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55119m) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f126142a == 0) {
                C89382r.m154942a(obj);
                C55361a.f126582b.removeObserver(this.f126143b.f126104f);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public final void mo92009a(AbstractC55101k<AbstractC56237a> kVar) {
        C89219l.m154721d(kVar, "");
        this.f126108m.add(kVar);
        this.f126103e.sendEmptyMessage(1);
    }

    /* renamed from: b */
    private static List<AbstractC56237a> m100785b(List<AbstractC56237a> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC56237a> it = list.iterator();
        while (it.hasNext()) {
            AbstractC56237a next = it.next();
            if (next instanceof C54848c) {
                it.remove();
                arrayList.add(next);
            }
        }
        list.addAll(arrayList);
        return list;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g.AbstractC53708a
    /* renamed from: a */
    public final void mo90256a(int i) {
        AbstractC89568bz bzVar;
        AbstractC89568bz bzVar2 = this.f126109n;
        if (bzVar2 == null || bzVar2.mo144007k()) {
            C56244a.m102185a("SessionListManager", "Will update data");
            AbstractC56220e b = C55076b.m100723b();
            if (b == null || !b.enableIM() || (b.getUnder16Proxy() != null && b.getUnder16Proxy().mo93019a())) {
                bzVar = m100787h();
            } else {
                bzVar = m100786g();
            }
            this.f126109n = bzVar;
            return;
        }
        C56244a.m102185a("SessionListManager", "Will not update data because previous job is still running");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void updateU16Settings(C56198e eVar) {
        C56244a.m102191c("SessionListManager", "updateU16Settings");
        if (!C80580in.m139687c()) {
            if (C55197c.m100917a()) {
                C56244a.m102191c("SessionListManager", "updateU16Settings is login");
                this.f126103e.sendEmptyMessage(1);
                return;
            }
            this.f126101c = 0;
            mo92012b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$j */
    public static final class C55114j extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f126127a;

        /* renamed from: b */
        int f126128b;

        /* renamed from: c */
        int f126129c;

        /* renamed from: d */
        final /* synthetic */ C55102l f126130d;

        static {
            Covode.recordClassIndex(64842);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55114j(C55102l lVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126130d = lVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55114j(this.f126130d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55114j) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            final List<AbstractC56237a> component1;
            final int intValue;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f126129c;
            if (i == 0) {
                C89382r.m154942a(obj);
                C89378p<List<AbstractC56237a>, Integer> a = C55102l.m100784a(this.f126130d.f126106h);
                component1 = a.component1();
                intValue = a.component2().intValue();
                AbstractC89587ci ciVar = C89652o.f203399a;
                C551151 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.C55114j.C551151 */

                    /* renamed from: a */
                    int f126131a;

                    /* renamed from: b */
                    final /* synthetic */ C55114j f126132b;

                    static {
                        Covode.recordClassIndex(64843);
                    }

                    {
                        this.f126132b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$k */
                        public static final class C55116k extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f126135a;

                            /* renamed from: b */
                            final /* synthetic */ C55102l f126136b;

                            static {
                                Covode.recordClassIndex(64844);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C55116k(C55102l lVar, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f126136b = lVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C55116k(this.f126136b, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C55116k) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f126135a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    C55102l lVar = this.f126136b;
                                    final ArrayList arrayList = new ArrayList(lVar.f126100b.values());
                                    IIMunder16Proxy under16Proxy = C55076b.m100723b().getUnder16Proxy();
                                    if (under16Proxy != null && under16Proxy.mo93020b()) {
                                        C55219n a = C55219n.m100965a();
                                        C89219l.m154716b(a, "");
                                        if (!a.f126297a.getBoolean("notice_under_16_deleted_state", false)) {
                                            arrayList.add(new C54852e());
                                        }
                                    }
                                    lVar.f126101c = 0;
                                    C89070n.m154530a((List) arrayList, (Comparator) lVar.f126105g);
                                    AbstractC89587ci ciVar = C89652o.f203399a;
                                    C551171 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                        /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.C55116k.C551171 */

                                        /* renamed from: a */
                                        int f126137a;

                                        /* renamed from: b */
                                        final /* synthetic */ C55116k f126138b;

                                        static {
                                            Covode.recordClassIndex(64845);
                                        }

                                        {
                                            this.f126138b = r2;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return 

                                            @Override // com.bytedance.p1399im.core.p1417i.AbstractC19718b
                                            /* renamed from: a */
                                            public final void mo27780a(C19720d dVar) {
                                                String str;
                                                String str2;
                                                StringBuilder sb = new StringBuilder("onStrangerBoxUpdate: ");
                                                if (dVar != null) {
                                                    long j = -1;
                                                    if (dVar.f46869b != null) {
                                                        str2 = dVar.f46869b.getConversationId();
                                                        C19538ai lastMessage = dVar.f46869b.getLastMessage();
                                                        if (lastMessage != null) {
                                                            j = lastMessage.getMsgId();
                                                        }
                                                    } else {
                                                        str2 = null;
                                                    }
                                                    str = "StrangerBox{totalUnread=" + dVar.f46868a + ", latestConversation=" + str2 + ", latestMessageId=" + j + "}";
                                                } else {
                                                    str = null;
                                                }
                                                C56244a.m102191c("SessionListManager", sb.append(str).toString());
                                                if (dVar == null || dVar.f46869b == null) {
                                                    C55104a.m100801a().mo92010a("stranger_1");
                                                } else {
                                                    AbstractC89568bz unused = C89624i.m155555a(this.f126107l, null, null, new C55110g(this, dVar, null), 3);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$g */
                                            public static final class C55110g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                                /* renamed from: a */
                                                int f126118a;

                                                /* renamed from: b */
                                                final /* synthetic */ C55102l f126119b;

                                                /* renamed from: c */
                                                final /* synthetic */ C19720d f126120c;

                                                static {
                                                    Covode.recordClassIndex(64838);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C55110g(C55102l lVar, C19720d dVar, AbstractC89124d dVar2) {
                                                    super(2, dVar2);
                                                    this.f126119b = lVar;
                                                    this.f126120c = dVar;
                                                }

                                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                    C89219l.m154721d(dVar, "");
                                                    return new C55110g(this.f126119b, this.f126120c, dVar);
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                                public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                                    return ((C55110g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                                }

                                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                public final Object invokeSuspend(Object obj) {
                                                    boolean z;
                                                    String str;
                                                    long j;
                                                    EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                                    int i = this.f126118a;
                                                    if (i == 0) {
                                                        C89382r.m154942a(obj);
                                                        C19638h hVar = this.f126120c.f46869b;
                                                        C89219l.m154716b(hVar, "");
                                                        AbstractC56237a a = C54871c.m100470a(hVar);
                                                        C19638h hVar2 = this.f126120c.f46869b;
                                                        C89219l.m154716b(hVar2, "");
                                                        C89219l.m154721d(hVar2, "");
                                                        String a2 = C55080c.m100730a(hVar2.getConversationId());
                                                        C19538ai lastMessage = hVar2.getLastMessage();
                                                        if (a2 == null || a2.length() == 0) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (z && lastMessage != null) {
                                                            a2 = lastMessage.getSecSender();
                                                        }
                                                        final C54856f fVar = new C54856f(a2, C55085g.m100751a(String.valueOf(AbstractC17427b.C17428a.m32311c(hVar2.getConversationId())), a2), (byte) 0);
                                                        fVar.f128234m = C17867d.m33078a().getString(R.string.d2r);
                                                        if (a == null || (str = a.mo91870g()) == null) {
                                                            C19538ai lastMessage2 = hVar2.getLastMessage();
                                                            if (lastMessage2 == null) {
                                                                str = "";
                                                            } else {
                                                                str = C54871c.m100473a(EnumC53772b.C53814f.m99071b(lastMessage2), lastMessage2, false);
                                                            }
                                                        }
                                                        fVar.f128235n = str;
                                                        if (a != null) {
                                                            j = a.f128236o;
                                                        } else {
                                                            j = hVar2.getUpdatedTime();
                                                        }
                                                        fVar.mo93051a(j);
                                                        String conversationId = hVar2.getConversationId();
                                                        C89219l.m154716b(conversationId, "");
                                                        fVar.f125635g = conversationId;
                                                        AbstractC89587ci ciVar = C89652o.f203399a;
                                                        C551111 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                                            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55102l.C55110g.C551111 */

                                                            /* renamed from: a */
                                                            int f126121a;

                                                            /* renamed from: b */
                                                            final /* synthetic */ C55110g f126122b;

                                                            static {
                                                                Covode.recordClassIndex(64839);
                                                            }

                                                            {
                                                                this.f126122b = r2;
                                                            }

                                                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                C89219l.m154721d(dVar, "");
                                                                return 

                                                                /* renamed from: a */
                                                                public final void mo92010a(String str) {
                                                                    if (!TextUtils.isEmpty(str)) {
                                                                        Map<String, AbstractC56237a> map = this.f126100b;
                                                                        Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                                                                        if (map.containsKey(str)) {
                                                                            Map<String, AbstractC56237a> map2 = this.f126100b;
                                                                            Objects.requireNonNull(map2, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
                                                                            C89206ad.m154686h(map2).remove(str);
                                                                            this.f126103e.sendEmptyMessage(2);
                                                                        }
                                                                    }
                                                                }

                                                                /* renamed from: a */
                                                                public static C89378p<List<AbstractC56237a>, Integer> m100784a(AbstractC55105b bVar) {
                                                                    boolean z;
                                                                    int i;
                                                                    boolean z2;
                                                                    C89219l.m154721d(bVar, "");
                                                                    ArrayList arrayList = new ArrayList(bVar.mo92023b().values());
                                                                    boolean z3 = false;
                                                                    int i2 = 0;
                                                                    if (bVar.mo92022a()) {
                                                                        bVar.mo92025c().clear();
                                                                        List<C19638h> e = bVar.mo92027e();
                                                                        C56244a.m102191c("SessionListManager", "syncSessionListI18n step 3, ConversationSize: " + e.size());
                                                                        boolean z4 = false;
                                                                        int i3 = 0;
                                                                        for (C19638h hVar : e) {
                                                                            try {
                                                                                AbstractC56237a a = bVar.mo92019a(hVar);
                                                                                if (a != null) {
                                                                                    Map<String, AbstractC56237a> c = bVar.mo92025c();
                                                                                    String bL_ = a.bL_();
                                                                                    C89219l.m154716b(bL_, "");
                                                                                    c.put(bL_, a);
                                                                                    arrayList.add(a);
                                                                                    if (!a.mo93053i() || !hVar.isMute()) {
                                                                                        z = false;
                                                                                    } else {
                                                                                        z = true;
                                                                                    }
                                                                                    if ((a instanceof C54848c) && bVar.mo92029g()) {
                                                                                        C56244a.m102191c("SessionListManager", "IMGroupChatHoldoutExperiment is on conversation isMute: " + z + " session unread count: " + ((C54848c) a).f128238q);
                                                                                    } else if (!z) {
                                                                                        if (bVar.mo92030h()) {
                                                                                            if (a.f128238q > 0) {
                                                                                                z2 = true;
                                                                                            } else {
                                                                                                z2 = false;
                                                                                            }
                                                                                            boolean z5 = a.f128239r;
                                                                                            if (z2 || z5) {
                                                                                                i = 1;
                                                                                            } else {
                                                                                                i = 0;
                                                                                            }
                                                                                        } else {
                                                                                            i = a.f128238q;
                                                                                        }
                                                                                        i3 += i;
                                                                                    }
                                                                                } else {
                                                                                    C56244a.m102191c("SessionListManager", "syncSessionListI18n step 4, session is null for conversation " + hVar.getConversationId());
                                                                                }
                                                                            } catch (Exception e2) {
                                                                                C56244a.m102186a("SessionListManager", "syncSessionListI18n step 4, faulted for conversation " + hVar.getConversationId() + ": ", e2);
                                                                                z4 = true;
                                                                            }
                                                                        }
                                                                        C56244a.m102191c("SessionListManager", "syncSessionListI18n step 5, completing session conversion, completed: " + arrayList.size());
                                                                        if (!bVar.mo92031i()) {
                                                                            i2 = i3;
                                                                        }
                                                                        if (bVar.mo92032j()) {
                                                                            bVar.mo92024b(bVar.mo92026d());
                                                                        }
                                                                        bVar.mo92020a(i2);
                                                                        C56244a.m102191c("SessionListManager", "syncSessionListI18n step 6, mUnreadCount: " + bVar.mo92026d());
                                                                        z3 = z4;
                                                                    } else {
                                                                        arrayList.addAll(bVar.mo92025c().values());
                                                                    }
                                                                    C89070n.m154530a((List) arrayList, (Comparator) bVar.mo92028f());
                                                                    if (bVar.mo92029g()) {
                                                                        m100785b(arrayList);
                                                                    }
                                                                    bVar.mo92021a(arrayList.size(), bVar.mo92022a(), z3);
                                                                    return new C89378p<>(arrayList, Integer.valueOf(bVar.mo92026d()));
                                                                }

                                                                /* renamed from: a */
                                                                public final void mo92011a(List<? extends AbstractC56237a> list) {
                                                                    for (AbstractC55101k<AbstractC56237a> kVar : this.f126108m) {
                                                                        if (list == null) {
                                                                            kVar.mo91910a(new ArrayList());
                                                                        } else {
                                                                            kVar.mo91910a(C89206ad.m154682d(list));
                                                                        }
                                                                    }
                                                                }

                                                                /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.l$e */
                                                                static final class C55108e<T> implements Comparator {

                                                                    /* renamed from: a */
                                                                    public static final C55108e f126116a = new C55108e();

                                                                    static {
                                                                        Covode.recordClassIndex(64836);
                                                                    }

                                                                    C55108e() {
                                                                    }

                                                                    @Override // java.util.Comparator
                                                                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                                                                        AbstractC56237a aVar = (AbstractC56237a) obj;
                                                                        AbstractC56237a aVar2 = (AbstractC56237a) obj2;
                                                                        C89219l.m154716b(aVar, "");
                                                                        int i = aVar.f128241t;
                                                                        C89219l.m154716b(aVar2, "");
                                                                        if (i == aVar2.f128241t) {
                                                                            return (aVar2.f128236o > aVar.f128236o ? 1 : (aVar2.f128236o == aVar.f128236o ? 0 : -1));
                                                                        }
                                                                        return C89219l.m154703a(aVar2.f128241t, aVar.f128241t);
                                                                    }
                                                                }
                                                            }
