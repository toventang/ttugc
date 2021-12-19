package com.bytedance.android.live.effect;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.effect.api.C4147a;
import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p242c.C4193a;
import com.bytedance.android.live.effect.p242c.C4194b;
import com.bytedance.android.live.effect.p244e.C4265f;
import com.bytedance.android.live.effect.p244e.C4268g;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.depend.model.C11672a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.lang.ref.WeakReference;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.effect.g */
public final class C4284g implements AbstractC4157j {

    /* renamed from: a */
    static EffectManager f11803a;

    /* renamed from: b */
    public static final C4284g f11804b = new C4284g();

    private C4284g() {
    }

    /* renamed from: com.bytedance.android.live.effect.g$a */
    static final class C4285a implements AbstractC4157j.AbstractC4160c<C11672a> {

        /* renamed from: a */
        private final WeakReference<DataChannel> f11805a;

        static {
            Covode.recordClassIndex(4855);
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4160c
        /* renamed from: a */
        public final void mo9868a() {
            DataChannel dataChannel = this.f11805a.get();
            if (dataChannel != null) {
                dataChannel.mo28319c(C4302j.class);
            }
        }

        public C4285a(DataChannel dataChannel) {
            this.f11805a = new WeakReference<>(dataChannel);
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4160c
        /* renamed from: a */
        public final void mo9869a(List<C4315e<C11672a>> list) {
            C89219l.m154721d(list, "");
            DataChannel dataChannel = this.f11805a.get();
            if (dataChannel != null) {
                dataChannel.mo28315b(C4142a.class, list);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.effect.g$c */
    public static final class C4287c<T> implements IFetchEffectChannelListener {

        /* renamed from: a */
        public final String f11807a;

        /* renamed from: b */
        public final AbstractC4157j.AbstractC4158a<T> f11808b;

        /* renamed from: c */
        public final AbstractC4157j.AbstractC4161d<T> f11809c;

        /* renamed from: d */
        public final AbstractC4157j.AbstractC4160c<T> f11810d;

        static {
            Covode.recordClassIndex(4857);
        }

        /* renamed from: a */
        private static boolean m10396a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* renamed from: b */
        private static boolean m10397b() {
            if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
                return C58029j.f132253e;
            }
            boolean a = m10396a();
            C58029j.f132253e = a;
            return a;
        }

        /* renamed from: com.bytedance.android.live.effect.g$c$a */
        public static final class C4288a implements ICheckChannelListener {

            /* renamed from: a */
            final /* synthetic */ C4287c f11811a;

            static {
                Covode.recordClassIndex(4858);
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelFailed(ExceptionResult exceptionResult) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C4288a(C4287c cVar) {
                this.f11811a = cVar;
            }

            @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
            public final void checkChannelSuccess(boolean z) {
                if (z) {
                    C4284g.f11803a.fetchEffectList(this.f11811a.f11807a, false, (IFetchEffectChannelListener) new C4291d(this.f11811a.f11808b, this.f11811a.f11809c, this.f11811a.f11810d));
                }
            }
        }

        /* renamed from: com.bytedance.android.live.effect.g$c$c */
        static final class C4290c<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C4287c f11814a;

            static {
                Covode.recordClassIndex(4860);
            }

            C4290c(C4287c cVar) {
                this.f11814a = cVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                List<C4315e<T>> list = (List) obj;
                C4287c cVar = this.f11814a;
                C89219l.m154716b(list, "");
                cVar.mo9955a(list);
            }
        }

        /* renamed from: com.bytedance.android.live.effect.g$c$b */
        static final class C4289b<T> implements AbstractC88983w {

            /* renamed from: a */
            final /* synthetic */ C4287c f11812a;

            /* renamed from: b */
            final /* synthetic */ EffectChannelResponse f11813b;

            static {
                Covode.recordClassIndex(4859);
            }

            C4289b(C4287c cVar, EffectChannelResponse effectChannelResponse) {
                this.f11812a = cVar;
                this.f11813b = effectChannelResponse;
            }

            @Override // p4560f.p4561a.AbstractC88983w
            public final void subscribe(AbstractC88982v<List<C4315e<T>>> vVar) {
                C89219l.m154721d(vVar, "");
                vVar.mo143031a(this.f11812a.f11809c.mo9870a(this.f11812a.f11808b.mo9866a(this.f11813b)));
            }
        }

        /* renamed from: a */
        public final void mo9955a(List<C4315e<T>> list) {
            if (list.isEmpty()) {
                onFail(new ExceptionResult(-1));
                return;
            }
            AbstractC4157j.AbstractC4160c<T> cVar = this.f11810d;
            if (cVar != null) {
                cVar.mo9869a(list);
            }
            C3966y.m9669e();
            if (m10397b()) {
                C4284g.f11803a.checkedEffectListUpdate(this.f11807a, new C4288a(this));
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            C3966y.m9669e();
            if (m10397b()) {
                C4284g.f11803a.fetchEffectList(this.f11807a, false, (IFetchEffectChannelListener) new C4291d(this.f11808b, this.f11809c, this.f11810d));
                return;
            }
            AbstractC4157j.AbstractC4160c<T> cVar = this.f11810d;
            if (cVar != null) {
                cVar.mo9868a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (C6204h.m13480b()) {
                AbstractC88979t.m154294a(new C4289b(this, effectChannelResponse2)).mo143271a(new C11191f()).mo143289d(new C4290c(this));
            } else {
                mo9955a(this.f11809c.mo9870a(this.f11808b.mo9866a(effectChannelResponse2)));
            }
        }

        public C4287c(String str, AbstractC4157j.AbstractC4158a<T> aVar, AbstractC4157j.AbstractC4161d<T> dVar, AbstractC4157j.AbstractC4160c<T> cVar) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(dVar, "");
            this.f11807a = str;
            this.f11808b = aVar;
            this.f11809c = dVar;
            this.f11810d = cVar;
        }
    }

    static {
        Covode.recordClassIndex(4854);
        AbstractC2953a a = C6193a.m13435a(IHostContext.class);
        C89219l.m154716b(a, "");
        EffectManager effectManager = ((IHostContext) a).getEffectManager();
        C89219l.m154716b(effectManager, "");
        f11803a = effectManager;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.effect.g$d */
    public static final class C4291d<T> implements IFetchEffectChannelListener {

        /* renamed from: a */
        public final AbstractC4157j.AbstractC4158a<T> f11815a;

        /* renamed from: b */
        public final AbstractC4157j.AbstractC4161d<T> f11816b;

        /* renamed from: c */
        public final AbstractC4157j.AbstractC4160c<T> f11817c;

        static {
            Covode.recordClassIndex(4861);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            AbstractC4157j.AbstractC4160c<T> cVar = this.f11817c;
            if (cVar != null) {
                cVar.mo9868a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            List<C4315e<T>> a = this.f11816b.mo9870a(this.f11815a.mo9866a(effectChannelResponse));
            if (a.isEmpty()) {
                onFail(new ExceptionResult(-1));
                return;
            }
            AbstractC4157j.AbstractC4160c<T> cVar = this.f11817c;
            if (cVar != null) {
                cVar.mo9869a(a);
            }
        }

        public C4291d(AbstractC4157j.AbstractC4158a<T> aVar, AbstractC4157j.AbstractC4161d<T> dVar, AbstractC4157j.AbstractC4160c<T> cVar) {
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(dVar, "");
            this.f11815a = aVar;
            this.f11816b = dVar;
            this.f11817c = cVar;
        }
    }

    /* renamed from: com.bytedance.android.live.effect.g$b */
    static final class C4286b implements IFetchEffectListener {

        /* renamed from: a */
        private final WeakReference<AbstractC4157j.AbstractC4159b> f11806a;

        static {
            Covode.recordClassIndex(4856);
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        public C4286b(AbstractC4157j.AbstractC4159b bVar) {
            this.f11806a = new WeakReference<>(bVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            AbstractC4157j.AbstractC4159b bVar = this.f11806a.get();
            if (bVar != null) {
                bVar.mo9867a();
            }
        }

        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            C89219l.m154721d(exceptionResult, "");
            this.f11806a.get();
        }
    }

    /* renamed from: a */
    public static void m10388a(AbstractC4157j.AbstractC4160c<FilterModel> cVar) {
        C89219l.m154721d(cVar, "");
        String str = C4147a.f11587e;
        C89219l.m154716b(str, "");
        m10391a(str, new C4193a(), new C4194b(), cVar);
    }

    /* renamed from: a */
    public static void m10389a(DataChannel dataChannel) {
        String str = C4147a.f11586d;
        C89219l.m154716b(str, "");
        m10391a(str, new C4265f(), new C4268g(), new C4285a(dataChannel));
    }

    /* renamed from: a */
    public static boolean m10392a(C11672a aVar) {
        if (aVar == null) {
            return false;
        }
        return m10393a(aVar.f27909q);
    }

    /* renamed from: a */
    public static boolean m10393a(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (DownloadableModelSupport.isInitialized()) {
            return DownloadableModelSupport.getInstance().isEffectReady(f11803a, effect);
        }
        return f11803a.isEffectDownloaded(effect);
    }

    /* renamed from: a */
    public static void m10390a(Effect effect, AbstractC4157j.AbstractC4159b bVar) {
        if (effect != null) {
            f11803a.fetchEffect(effect, new C4286b(bVar));
        }
    }

    /* renamed from: a */
    private static <T> void m10391a(String str, AbstractC4157j.AbstractC4158a<T> aVar, AbstractC4157j.AbstractC4161d<T> dVar, AbstractC4157j.AbstractC4160c<T> cVar) {
        f11803a.fetchEffectListFromCache(str, new C4287c(str, aVar, dVar, cVar));
    }
}
