package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11686g;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11687h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.android.live.broadcast.preview.ak */
public class C3378ak implements AbstractC11687h {

    /* renamed from: a */
    private List<AbstractC11686g> f9601a;

    static {
        Covode.recordClassIndex(3862);
    }

    public C3378ak() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f9601a = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new C3535o());
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d
    /* renamed from: a */
    public final void mo8695a() {
        for (AbstractC11686g gVar : this.f9601a) {
            if (gVar instanceof AbstractC11682d) {
                ((AbstractC11682d) gVar).mo8695a();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11686g
    public void onStartLive() {
        for (AbstractC11686g gVar : this.f9601a) {
            gVar.onStartLive();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11687h
    /* renamed from: b */
    public final void mo8700b(AbstractC11686g gVar) {
        this.f9601a.remove(gVar);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11687h
    /* renamed from: a */
    public final void mo8698a(AbstractC11686g gVar) {
        if (!this.f9601a.contains(gVar)) {
            this.f9601a.add(gVar);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d
    /* renamed from: a */
    public final void mo8696a(int i) {
        for (AbstractC11686g gVar : this.f9601a) {
            if (gVar instanceof AbstractC11682d) {
                ((AbstractC11682d) gVar).mo8696a(i);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d
    /* renamed from: b */
    public final void mo8699b(int i, DataChannel dataChannel) {
        for (AbstractC11686g gVar : this.f9601a) {
            if (gVar instanceof AbstractC11682d) {
                ((AbstractC11682d) gVar).mo8699b(i, dataChannel);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11682d
    /* renamed from: a */
    public final void mo8697a(int i, DataChannel dataChannel) {
        for (AbstractC11686g gVar : this.f9601a) {
            if (gVar instanceof AbstractC11682d) {
                ((AbstractC11682d) gVar).mo8697a(i, dataChannel);
            }
        }
    }
}
