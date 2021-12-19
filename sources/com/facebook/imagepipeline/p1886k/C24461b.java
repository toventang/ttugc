package com.facebook.imagepipeline.p1886k;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1833e.C24099a;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.k.b */
public final class C24461b implements AbstractC24462c {

    /* renamed from: a */
    public final List<AbstractC24462c> f58109a;

    static {
        Covode.recordClassIndex(28604);
    }

    public C24461b(AbstractC24462c... cVarArr) {
        this.f58109a = new ArrayList(cVarArr.length);
        for (AbstractC24462c cVar : cVarArr) {
            if (cVar != null) {
                this.f58109a.add(cVar);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final boolean requiresExtraMap(String str) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            if (this.f58109a.get(i).requiresExtraMap(str)) {
                return true;
            }
        }
        return false;
    }

    public C24461b(Set<AbstractC24462c> set) {
        this.f58109a = new ArrayList(set.size());
        for (AbstractC24462c cVar : set) {
            if (cVar != null) {
                this.f58109a.add(cVar);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestCancellation(String str) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onRequestCancellation(str);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onRequestCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onProducerStart(String str, String str2) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onProducerStart(str, str2);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onProducerStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onProducerEvent(String str, String str2, String str3) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onProducerEvent(str, str2, str3);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onIntermediateChunkStart", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onProducerFinishWithCancellation(str, str2, map);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithCancellation", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onProducerFinishWithSuccess(str, str2, map);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestSuccess(C24636b bVar, String str, boolean z) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onRequestSuccess(bVar, str, z);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onRequestSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onUltimateProducerReached(String str, String str2, boolean z) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onUltimateProducerReached(str, str2, z);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithSuccess", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24547an
    public final void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onProducerFinishWithFailure(str, str2, th, map);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onProducerFinishWithFailure", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestFailure(C24636b bVar, String str, Throwable th, boolean z) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onRequestFailure(bVar, str, th, z);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onRequestFailure", e);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1886k.AbstractC24462c
    public final void onRequestStart(C24636b bVar, Object obj, String str, boolean z) {
        int size = this.f58109a.size();
        for (int i = 0; i < size; i++) {
            try {
                this.f58109a.get(i).onRequestStart(bVar, obj, str, z);
            } catch (Exception e) {
                C24099a.m45658c("ForwardingRequestListener", "InternalListener exception in onRequestStart", e);
            }
        }
    }
}
