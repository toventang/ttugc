package com.p2082ss.android.ugc.aweme.effect.p2889b;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.EffectModel;
import com.p2082ss.android.ugc.aweme.effect.p2889b.C46313b;
import com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46311b;
import com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.AbstractC46312c;
import com.p2082ss.android.ugc.aweme.effect.p2889b.p2890a.C46310a;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.effect.b.a */
public final class C46300a {

    /* renamed from: f */
    public static AbstractC46415f f107938f;

    /* renamed from: g */
    public static final C46301a f107939g = new C46301a((byte) 0);

    /* renamed from: a */
    public Queue<Effect> f107940a;

    /* renamed from: b */
    public final List<AbstractC46311b> f107941b;

    /* renamed from: c */
    public final AtomicBoolean f107942c;

    /* renamed from: d */
    public final AtomicInteger f107943d;

    /* renamed from: e */
    public final Handler f107944e;

    /* renamed from: h */
    private Queue<Effect> f107945h;

    /* renamed from: i */
    private Queue<Effect> f107946i;

    /* renamed from: j */
    private final AtomicBoolean f107947j;

    /* renamed from: k */
    private final AbstractC46312c f107948k;

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$b */
    public static final class C46302b {

        /* renamed from: c */
        public static final C46303a f107949c = new C46303a((byte) 0);

        /* renamed from: a */
        public Integer f107950a = 0;

        /* renamed from: b */
        public AbstractC46312c f107951b;

        static {
            Covode.recordClassIndex(54879);
        }

        /* renamed from: com.ss.android.ugc.aweme.effect.b.a$b$a */
        public static final class C46303a {
            static {
                Covode.recordClassIndex(54880);
            }

            private C46303a() {
            }

            public /* synthetic */ C46303a(byte b) {
                this();
            }
        }

        /* renamed from: a */
        public final C46300a mo78796a() {
            int i;
            Integer num = this.f107950a;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 3;
            }
            AbstractC46312c cVar = this.f107951b;
            if (cVar == null) {
                cVar = new C46310a();
            }
            return new C46300a(i, cVar, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(54877);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$a */
    public static final class C46301a {
        static {
            Covode.recordClassIndex(54878);
        }

        private C46301a() {
        }

        /* renamed from: a */
        public static AbstractC46415f m89337a() {
            if (C46300a.f107938f == null) {
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                C46300a.f107938f = C46404c.m89554a(application, null);
            }
            return C46300a.f107938f;
        }

        public /* synthetic */ C46301a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$g */
    public static final class C46308g implements IFetchEffectListener {

        /* renamed from: a */
        final /* synthetic */ C46300a f107962a;

        /* renamed from: b */
        final /* synthetic */ Effect f107963b;

        static {
            Covode.recordClassIndex(54885);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* renamed from: com.ss.android.ugc.aweme.effect.b.a$g$a */
        static final class RunnableC46309a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C46308g f107964a;

            static {
                Covode.recordClassIndex(54886);
            }

            RunnableC46309a(C46308g gVar) {
                this.f107964a = gVar;
            }

            public final void run() {
                this.f107964a.f107962a.mo78788a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            this.f107962a.f107940a.remove(this.f107963b);
            this.f107962a.f107943d.incrementAndGet();
            C46300a aVar = this.f107962a;
            Effect effect3 = this.f107963b;
            C89219l.m154721d(effect3, "");
            if (C46300a.m89325b()) {
                aVar.f107944e.post(new RunnableC46305d(aVar, effect3, effect2));
            } else {
                List<AbstractC46311b> list = aVar.f107941b;
                C89219l.m154716b(list, "");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo78805b(effect3);
                }
            }
            C89219l.m154714a(this.f107963b, effect2);
            this.f107963b.getName();
            this.f107962a.f107942c.set(true);
            this.f107962a.f107944e.post(new RunnableC46309a(this));
        }

        C46308g(C46300a aVar, Effect effect) {
            this.f107962a = aVar;
            this.f107963b = effect;
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f107962a.f107940a.remove(this.f107963b);
            this.f107962a.f107943d.incrementAndGet();
            C46300a aVar = this.f107962a;
            if (C46300a.m89325b()) {
                aVar.f107944e.post(new RunnableC46304c(aVar, effect, exceptionResult));
            } else {
                List<AbstractC46311b> list = aVar.f107941b;
                C89219l.m154716b(list, "");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo78806c(effect);
                }
            }
            C89219l.m154714a(this.f107963b, effect);
            if (effect != null) {
                effect.getName();
            }
            exceptionResult.getMsg();
            Log.getStackTraceString(exceptionResult.getException());
            this.f107962a.f107942c.set(!this.f107962a.f107940a.isEmpty());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$f */
    static final class RunnableC46307f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46300a f107961a;

        static {
            Covode.recordClassIndex(54884);
        }

        RunnableC46307f(C46300a aVar) {
            this.f107961a = aVar;
        }

        public final void run() {
            this.f107961a.f107942c.set(true);
            this.f107961a.mo78788a();
        }
    }

    /* renamed from: b */
    static boolean m89325b() {
        return !C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper());
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$c */
    static final class RunnableC46304c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46300a f107952a;

        /* renamed from: b */
        final /* synthetic */ Effect f107953b;

        /* renamed from: c */
        final /* synthetic */ ExceptionResult f107954c;

        static {
            Covode.recordClassIndex(54881);
        }

        RunnableC46304c(C46300a aVar, Effect effect, ExceptionResult exceptionResult) {
            this.f107952a = aVar;
            this.f107953b = effect;
            this.f107954c = exceptionResult;
        }

        public final void run() {
            List<AbstractC46311b> list = this.f107952a.f107941b;
            C89219l.m154716b(list, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo78806c(this.f107953b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$d */
    static final class RunnableC46305d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46300a f107955a;

        /* renamed from: b */
        final /* synthetic */ Effect f107956b;

        /* renamed from: c */
        final /* synthetic */ Effect f107957c;

        /* renamed from: d */
        final /* synthetic */ boolean f107958d = true;

        static {
            Covode.recordClassIndex(54882);
        }

        RunnableC46305d(C46300a aVar, Effect effect, Effect effect2) {
            this.f107955a = aVar;
            this.f107956b = effect;
            this.f107957c = effect2;
        }

        public final void run() {
            List<AbstractC46311b> list = this.f107955a.f107941b;
            C89219l.m154716b(list, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo78805b(this.f107956b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$e */
    public static final class RunnableC46306e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46300a f107959a;

        /* renamed from: b */
        final /* synthetic */ Effect f107960b;

        static {
            Covode.recordClassIndex(54883);
        }

        RunnableC46306e(C46300a aVar, Effect effect) {
            this.f107959a = aVar;
            this.f107960b = effect;
        }

        public final void run() {
            List<AbstractC46311b> list = this.f107959a.f107941b;
            C89219l.m154716b(list, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo78804a(this.f107960b);
            }
        }
    }

    /* renamed from: c */
    public final void mo78795c() {
        AbstractC46415f a = C46301a.m89337a();
        if (a != null) {
            a.destroy();
        }
        f107938f = null;
        this.f107940a.clear();
        this.f107945h.clear();
        this.f107941b.clear();
        this.f107942c.set(false);
    }

    /* renamed from: a */
    public final void mo78788a() {
        Effect a;
        boolean z = true;
        while (this.f107942c.get() && this.f107943d.get() > 0 && z) {
            if (!this.f107945h.isEmpty()) {
                a = this.f107945h.poll();
            } else if (!(!this.f107946i.isEmpty())) {
                if (this.f107948k.mo78803a()) {
                    a = this.f107948k.mo78802a(this.f107940a);
                }
                z = false;
                this.f107942c.set(!this.f107940a.isEmpty());
            } else if (this.f107948k.mo78803a()) {
                a = this.f107948k.mo78802a(this.f107940a);
            } else {
                a = this.f107946i.poll();
            }
            if (a != null) {
                if (m89326b(a)) {
                    m89327c(a);
                }
                z = true;
                this.f107942c.set(!this.f107940a.isEmpty());
            }
            z = false;
            this.f107942c.set(!this.f107940a.isEmpty());
        }
    }

    /* renamed from: a */
    public final void mo78789a(AbstractC46311b bVar) {
        this.f107941b.add(bVar);
    }

    /* renamed from: b */
    public final void mo78793b(AbstractC46311b bVar) {
        this.f107941b.remove(bVar);
    }

    /* renamed from: b */
    private final void m89324b(List<? extends Effect> list) {
        for (T t : list) {
            if (!this.f107946i.contains(t)) {
                this.f107946i.add(t);
            }
        }
    }

    /* renamed from: c */
    private final void m89327c(Effect effect) {
        this.f107943d.decrementAndGet();
        m89328d(effect);
        AbstractC46415f a = C46301a.m89337a();
        if (a != null) {
            a.mo78887a(effect, C46313b.C46314a.m89346a("edit_effect_download_error_rate", "edit_effect", new C46308g(this, effect)));
        }
    }

    /* renamed from: a */
    public final void mo78791a(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        m89324b(list);
        this.f107942c.set(true);
        this.f107947j.set(true);
        mo78788a();
    }

    /* renamed from: b */
    private final boolean m89326b(Effect effect) {
        if (this.f107940a.contains(effect)) {
            return false;
        }
        this.f107940a.add(effect);
        return true;
    }

    /* renamed from: d */
    private final void m89328d(Effect effect) {
        if (m89325b()) {
            this.f107944e.post(new RunnableC46306e(this, effect));
            return;
        }
        List<AbstractC46311b> list = this.f107941b;
        C89219l.m154716b(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next().mo78804a(effect);
        }
    }

    /* renamed from: a */
    public final void mo78790a(Effect effect) {
        if (effect != null) {
            if (!this.f107945h.contains(effect) && !this.f107940a.contains(effect)) {
                this.f107945h.add(effect);
            }
            m89328d(effect);
            if (!this.f107942c.get()) {
                this.f107944e.post(new RunnableC46307f(this));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo78794b(EffectModel effectModel) {
        String str;
        if (effectModel == null) {
            return false;
        }
        for (T t : this.f107945h) {
            if (t != null) {
                str = t.getName();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo78792a(EffectModel effectModel) {
        String str;
        if (effectModel == null) {
            return false;
        }
        for (T t : this.f107940a) {
            if (t != null) {
                str = t.getName();
            } else {
                str = null;
            }
            if (C89219l.m154714a((Object) str, (Object) effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    private C46300a(int i, AbstractC46312c cVar) {
        this.f107948k = cVar;
        this.f107940a = new ConcurrentLinkedQueue();
        this.f107945h = new ConcurrentLinkedQueue();
        this.f107946i = new ConcurrentLinkedQueue();
        this.f107941b = Collections.synchronizedList(new ArrayList());
        this.f107947j = new AtomicBoolean(false);
        this.f107942c = new AtomicBoolean(false);
        this.f107943d = new AtomicInteger(i);
        this.f107944e = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ C46300a(int i, AbstractC46312c cVar, byte b) {
        this(i, cVar);
    }
}
