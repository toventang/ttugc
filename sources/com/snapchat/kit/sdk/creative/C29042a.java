package com.snapchat.kit.sdk.creative;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.SnapKitComponent;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.p2070c.C28995a;
import com.snapchat.kit.sdk.creative.api.C29048a;
import com.snapchat.kit.sdk.creative.p2071a.C29045a;
import com.snapchat.kit.sdk.creative.p2071a.C29046b;
import com.snapchat.kit.sdk.creative.p2071a.C29047c;
import com.snapchat.kit.sdk.creative.p2073c.C29054b;
import dagger.p4535a.C88077b;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.snapchat.kit.sdk.creative.a */
public final class C29042a implements CreativeComponent {

    /* renamed from: a */
    private SnapKitComponent f68610a;

    /* renamed from: b */
    private AbstractC89405a<MetricQueue<OpMetric>> f68611b;

    /* renamed from: c */
    private AbstractC89405a<C29046b> f68612c;

    static {
        Covode.recordClassIndex(35388);
    }

    /* renamed from: com.snapchat.kit.sdk.creative.a$a */
    public static final class C29043a {

        /* renamed from: a */
        public SnapKitComponent f68613a;

        static {
            Covode.recordClassIndex(35389);
        }

        private C29043a() {
        }

        public /* synthetic */ C29043a(byte b) {
            this();
        }
    }

    /* renamed from: com.snapchat.kit.sdk.creative.a$b */
    static class C29044b implements AbstractC89405a<MetricQueue<OpMetric>> {

        /* renamed from: a */
        private final SnapKitComponent f68614a;

        static {
            Covode.recordClassIndex(35390);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // javax.p4631a.AbstractC89405a
        public final /* synthetic */ MetricQueue<OpMetric> get() {
            return C88081f.m153153a(this.f68614a.operationalMetricsQueue(), "Cannot return null from a non-@Nullable component method");
        }

        C29044b(SnapKitComponent snapKitComponent) {
            this.f68614a = snapKitComponent;
        }
    }

    @Override // com.snapchat.kit.sdk.creative.CreativeComponent
    public final C29054b getMediaFactory() {
        return new C29054b(this.f68612c.get());
    }

    @Override // com.snapchat.kit.sdk.creative.CreativeComponent
    public final C29048a getApi() {
        return new C29048a((Context) C88081f.m153153a(this.f68610a.context(), "Cannot return null from a non-@Nullable component method"), (String) C88081f.m153153a(this.f68610a.clientId(), "Cannot return null from a non-@Nullable component method"), (String) C88081f.m153153a(this.f68610a.redirectUrl(), "Cannot return null from a non-@Nullable component method"), this.f68612c.get(), (MetricQueue) C88081f.m153153a(this.f68610a.analyticsEventQueue(), "Cannot return null from a non-@Nullable component method"), new C29045a((C28995a) C88081f.m153153a(this.f68610a.kitEventBaseFactory(), "Cannot return null from a non-@Nullable component method")), (KitPluginType) C88081f.m153153a(this.f68610a.kitPluginType(), "Cannot return null from a non-@Nullable component method"), this.f68610a.sdkIsFromReactNativePlugin());
    }

    private C29042a(C29043a aVar) {
        this.f68610a = aVar.f68613a;
        C29044b bVar = new C29044b(aVar.f68613a);
        this.f68611b = bVar;
        this.f68612c = C88077b.m153149a(new C29047c(bVar));
    }

    public /* synthetic */ C29042a(C29043a aVar, byte b) {
        this(aVar);
    }
}
