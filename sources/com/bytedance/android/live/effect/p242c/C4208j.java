package com.bytedance.android.live.effect.p242c;

import android.text.TextUtils;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.effect.C4175b;
import com.bytedance.android.live.effect.C4242e;
import com.bytedance.android.live.effect.C4284g;
import com.bytedance.android.live.effect.api.AbstractC4170f;
import com.bytedance.android.live.effect.api.p240a.AbstractC4157j;
import com.bytedance.android.live.effect.model.C4315e;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.live.effect.p241b.C4187e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.effect.LiveNewEffectPanelSetting;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9019am;
import com.bytedance.android.livesdk.p561j.C9082cu;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.p2082ss.android.ugc.effectmanager.EffectManager;
import com.p2082ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88446a;
import p4600h.C89386u;

/* renamed from: com.bytedance.android.live.effect.c.j */
public final class C4208j implements AbstractC4170f {

    /* renamed from: a */
    public final List<FilterModel> f11679a;

    /* renamed from: b */
    EffectManager f11680b;

    /* renamed from: c */
    public Map<String, Double> f11681c;

    /* renamed from: d */
    public final List<AbstractC4170f.AbstractC4171a> f11682d;

    /* renamed from: e */
    private final List<AbstractC4170f.AbstractC4172b> f11683e;

    /* renamed from: f */
    private int f11684f;

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: b */
    public final void mo9894b() {
        this.f11684f = -1;
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: a */
    public final List<FilterModel> mo9890a() {
        return this.f11679a;
    }

    /* renamed from: com.bytedance.android.live.effect.c.j$a */
    class C4211a implements AbstractC4157j.AbstractC4160c<FilterModel> {

        /* renamed from: b */
        private final WeakReference<DataChannel> f11690b;

        static {
            Covode.recordClassIndex(4781);
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4160c
        /* renamed from: a */
        public final void mo9868a() {
            C4208j.this.mo9923a(false);
        }

        @Override // com.bytedance.android.live.effect.api.p240a.AbstractC4157j.AbstractC4160c
        /* renamed from: a */
        public final void mo9869a(List<C4315e<FilterModel>> list) {
            if (!list.isEmpty()) {
                List<T> list2 = list.get(0).f11862b;
                C4208j.this.f11679a.clear();
                C4208j.this.f11679a.addAll(list2);
                C4208j jVar = C4208j.this;
                AbstractC88979t a = AbstractC88979t.m154309b((Iterable) list2).mo143268a(C4213k.f11692a).mo143267a((AbstractC88434g) new C4214l(jVar), false).mo143261a(C88391a.m153580a(C88392a.f200660a));
                AbstractC88433f<? super Throwable> fVar = C88446a.f200698d;
                a.mo143255a(fVar, fVar, new C4215m(jVar));
                DataChannel dataChannel = this.f11690b.get();
                if (dataChannel != null) {
                    dataChannel.mo28315b(C4242e.class, list2);
                }
            }
            C4208j.this.mo9923a(true);
        }

        private C4211a(DataChannel dataChannel) {
            this.f11690b = new WeakReference<>(dataChannel);
        }

        /* synthetic */ C4211a(C4208j jVar, DataChannel dataChannel, byte b) {
            this(dataChannel);
        }
    }

    /* renamed from: com.bytedance.android.live.effect.c.j$b */
    public static final class C4212b {

        /* renamed from: a */
        public static final C4208j f11691a = new C4208j((byte) 0);

        static {
            Covode.recordClassIndex(4782);
        }
    }

    /* renamed from: d */
    private static boolean m10294d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(4778);
        if (AbstractC6804a.f16886O.mo13066a().intValue() < 0) {
            C6806c.m14603a((C6800c) AbstractC6804a.f16886O, (Object) 1);
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: c */
    public final boolean mo9899c() {
        List<FilterModel> list = this.f11679a;
        if (list == null) {
            return false;
        }
        for (FilterModel filterModel : list) {
            if (filterModel.isNew()) {
                return true;
            }
        }
        return false;
    }

    private C4208j() {
        this.f11681c = new HashMap();
        this.f11682d = new ArrayList();
        this.f11684f = -1;
        this.f11680b = ((IHostContext) C6193a.m13435a(IHostContext.class)).getEffectManager();
        this.f11683e = new ArrayList();
        this.f11679a = new ArrayList();
        this.f11681c = AbstractC6804a.f17023cS.mo13066a();
    }

    /* synthetic */ C4208j(byte b) {
        this();
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: a */
    public final void mo9891a(AbstractC4170f.AbstractC4171a aVar) {
        this.f11682d.add(aVar);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: b */
    public final void mo9895b(int i) {
        this.f11684f = i;
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: a */
    public final void mo9892a(AbstractC4170f.AbstractC4172b bVar) {
        this.f11683e.add(bVar);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: b */
    public final void mo9896b(AbstractC4170f.AbstractC4171a aVar) {
        this.f11682d.remove(aVar);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: a */
    public final float mo9889a(int i) {
        FilterModel filterModel;
        if (i < this.f11679a.size()) {
            filterModel = this.f11679a.get(i);
        } else {
            filterModel = null;
        }
        return mo9901d(filterModel);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: b */
    public final void mo9897b(AbstractC4170f.AbstractC4172b bVar) {
        this.f11683e.remove(bVar);
    }

    /* renamed from: a */
    public final float mo9919a(String str) {
        FilterModel filterModel;
        Iterator<FilterModel> it = this.f11679a.iterator();
        while (true) {
            if (!it.hasNext()) {
                filterModel = null;
                break;
            }
            filterModel = it.next();
            if (TextUtils.equals(str, filterModel.getFilterId())) {
                break;
            }
        }
        return mo9901d(filterModel);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: b */
    public final boolean mo9898b(FilterModel filterModel) {
        if (filterModel == null) {
            return false;
        }
        if (filterModel.getFilterType() != 2) {
            return true;
        }
        if (!DownloadableModelSupport.isInitialized() || filterModel.getEffect() == null) {
            EffectManager effectManager = this.f11680b;
            if (effectManager == null || !effectManager.isEffectDownloaded(filterModel.getEffect())) {
                return false;
            }
            return true;
        } else if (this.f11680b == null || !DownloadableModelSupport.getInstance().isEffectReady(this.f11680b, filterModel.getEffect())) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: c */
    public final boolean mo9900c(FilterModel filterModel) {
        EffectManager effectManager;
        if (filterModel.getFilterType() == 2 && (effectManager = this.f11680b) != null && effectManager.isEffectDownloading(filterModel.getEffect())) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: d */
    public final float mo9901d(FilterModel filterModel) {
        if (filterModel == null) {
            return 1.0f;
        }
        if (this.f11681c.containsKey(filterModel.getFilterId())) {
            return this.f11681c.get(filterModel.getFilterId()).floatValue();
        }
        FilterModel.C4308a aVar = filterModel.filterConfig;
        return C4187e.m10262a(aVar.f11842a, aVar.f11843b, aVar.f11844c);
    }

    @Override // com.bytedance.android.live.effect.api.AbstractC4170f
    /* renamed from: a */
    public final void mo9893a(FilterModel filterModel) {
        if (filterModel.getFilterType() == 2) {
            Effect effect = filterModel.getEffect();
            this.f11679a.indexOf(filterModel);
            if (effect != null) {
                C3966y.m9669e();
                if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132253e = m10294d();
                }
                if (C58029j.f132253e) {
                    this.f11680b.fetchEffect(effect, new IFetchEffectListener() {
                        /* class com.bytedance.android.live.effect.p242c.C4208j.C42102 */

                        static {
                            Covode.recordClassIndex(4780);
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                        }

                        @Override // com.p2082ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onStart(Effect effect) {
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.p2082ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* bridge */ /* synthetic */ void onSuccess(Effect effect) {
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9920a(DataChannel dataChannel) {
        C4284g.m10388a(new C4211a(this, dataChannel, (byte) 0));
    }

    /* renamed from: a */
    public final void mo9923a(boolean z) {
        if (!C13617h.m24465a(this.f11683e)) {
            for (AbstractC4170f.AbstractC4172b bVar : this.f11683e) {
                bVar.mo9902a(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo9922a(String str, String str2) {
        EffectManager effectManager = this.f11680b;
        if (effectManager != null) {
            effectManager.updateTag(str, str2, null);
        }
    }

    /* renamed from: a */
    public final void mo9921a(DataChannel dataChannel, int i, boolean z, boolean z2) {
        int i2 = i;
        if (!this.f11679a.isEmpty()) {
            if (i2 < 0 || i2 >= this.f11679a.size()) {
                i2 = 0;
            }
            if (this.f11684f != i2) {
                this.f11684f = i2;
                String filterId = this.f11679a.get(i2).getFilterId();
                long currentTimeMillis = System.currentTimeMillis();
                C6806c.m14603a(AbstractC6804a.f16886O, Integer.valueOf(i2));
                for (AbstractC4170f.AbstractC4171a aVar : this.f11682d) {
                    aVar.mo8670a(i2, z, z2);
                }
                C6806c.m14603a(AbstractC6804a.f17022cR, Long.valueOf(System.currentTimeMillis()));
                if (LiveNewEffectPanelSetting.INSTANCE.useOldPanel()) {
                    C4175b.f11604a.mo9878b(dataChannel, z, filterId, z2, i2 + 1);
                } else if (z) {
                    if (C11279p.m20022c()) {
                        DataChannelGlobal.f42558d.mo28321a(C9019am.class, filterId);
                        if (TextUtils.isEmpty((String) DataChannelGlobal.f42558d.mo28324b(C9019am.class))) {
                            return;
                        }
                    }
                    int i3 = i2 + 1;
                    C4175b.f11604a.mo9876a(dataChannel, true, filterId, true, i3);
                    C4175b.f11604a.mo9878b(dataChannel, true, filterId, z2, i3);
                    DataChannelGlobal.f42558d.mo28321a(C9082cu.class, new C89386u(filterId, Float.valueOf(mo9919a(filterId)), Long.valueOf(currentTimeMillis)));
                    DataChannelGlobal.f42558d.mo28321a(C9019am.class, "");
                }
            }
        }
    }
}
