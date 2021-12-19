package com.bytedance.helios.sdk.jsb;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.AbstractC15315l;
import com.bytedance.helios.api.p1088b.C15314k;
import com.bytedance.helios.api.p1088b.C15320o;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.HandlerThreadC15486g;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import p4600h.p4611f.p4613b.C89219l;

public final class JsbEventFetcherImpl extends AbstractC15315l {
    private final long DELAYED_MILLS = HeliosEnvImpl.INSTANCE.getCrpConfig().getReportDelayedMills();
    private final long TIMEOUT_MILLS = HeliosEnvImpl.INSTANCE.getCrpConfig().getEventTimeOutMills();
    public final LinkedList<C15314k> mJsbEventList = new LinkedList<>();

    static {
        Covode.recordClassIndex(17728);
    }

    /* renamed from: com.bytedance.helios.sdk.jsb.JsbEventFetcherImpl$a */
    static final class RunnableC15476a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JsbEventFetcherImpl f37720a;

        /* renamed from: b */
        final /* synthetic */ C15314k f37721b;

        static {
            Covode.recordClassIndex(17729);
        }

        RunnableC15476a(JsbEventFetcherImpl jsbEventFetcherImpl, C15314k kVar) {
            this.f37720a = jsbEventFetcherImpl;
            this.f37721b = kVar;
        }

        public final void run() {
            this.f37720a.removeTimeOutEvents();
            this.f37720a.mJsbEventList.add(this.f37721b);
        }
    }

    public JsbEventFetcherImpl() {
        C89219l.m154719c(this, "");
        C15320o.f37387g = this;
    }

    @Override // com.bytedance.helios.api.p1088b.AbstractC15315l
    public final List<C15314k> getJsbEvents() {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int size = this.mJsbEventList.size() - 1; size >= 0; size--) {
            C15314k kVar = this.mJsbEventList.get(size);
            C89219l.m154709a((Object) kVar, "");
            C15314k kVar2 = kVar;
            if (currentTimeMillis - kVar2.f37345d > this.TIMEOUT_MILLS + this.DELAYED_MILLS) {
                break;
            }
            arrayList.add(kVar2);
        }
        return arrayList;
    }

    public final C15314k removeTimeOutEvents() {
        long currentTimeMillis = System.currentTimeMillis();
        ListIterator<C15314k> listIterator = this.mJsbEventList.listIterator();
        C89219l.m154709a((Object) listIterator, "");
        C15314k kVar = null;
        while (listIterator.hasNext()) {
            kVar = listIterator.next();
            if (currentTimeMillis - kVar.f37345d < this.TIMEOUT_MILLS) {
                break;
            }
            listIterator.remove();
        }
        return kVar;
    }

    @Override // com.bytedance.helios.api.p1088b.AbstractC15315l
    public final void addJsbEvent(C15314k kVar) {
        C89219l.m154719c(kVar, "");
        HandlerThreadC15486g.m28499b().post(new RunnableC15476a(this, kVar));
    }
}
