package com.bytedance.android.live.publicscreen.impl;

import android.content.Context;
import android.util.LongSparseArray;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.impl.game.C5977i;
import com.bytedance.android.live.publicscreen.impl.p393a.C5895a;
import com.bytedance.android.live.publicscreen.impl.p396c.C5910c;
import com.bytedance.android.live.publicscreen.impl.p399e.C5953h;
import com.bytedance.android.live.publicscreen.impl.widget.LandscapePublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.PortraitPublicScreenWidget;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5880e;
import com.bytedance.android.live.publicscreen.p386a.AbstractC5886f;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenUiOptimizationSetting;
import com.bytedance.android.livesdk.model.message.C9871g;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.a */
public class C5893a implements AbstractC5880e {
    private final LongSparseArray<Long> hotDurations;
    private final List<AbstractC5885e> onRegistryReadyListeners;
    private LongSparseArray<C9871g> pendingBottomMessages;
    private final LongSparseArray<C5953h> presenters;
    private final LongSparseArray<Long> startStreamingTimestamps;
    public final C5898b textMessageConfig;
    private final AbstractC89244h uiOptimized$delegate = C89250i.m154773a((AbstractC89171a) C5894a.f14758a);
    private final List<AbstractC5885e> unmodifiableOnRegistryReadyListeners;

    static {
        Covode.recordClassIndex(6500);
    }

    private final boolean getUiOptimized() {
        return ((Boolean) this.uiOptimized$delegate.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public /* bridge */ /* synthetic */ AbstractC5886f getTextMessageConfig() {
        return this.textMessageConfig;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void clearMockChatMessage() {
        C5895a.f14759a.clear();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public List<AbstractC5885e> getOnRegistryReadyListeners() {
        List<AbstractC5885e> list = this.unmodifiableOnRegistryReadyListeners;
        C89219l.m154716b(list, "");
        return list;
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.a$a */
    static final class C5894a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C5894a f14758a = new C5894a();

        static {
            Covode.recordClassIndex(6501);
        }

        C5894a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(LivePublicScreenUiOptimizationSetting.INSTANCE.getValue());
        }
    }

    public C5893a() {
        ArrayList arrayList = new ArrayList();
        this.onRegistryReadyListeners = arrayList;
        this.unmodifiableOnRegistryReadyListeners = Collections.unmodifiableList(arrayList);
        this.presenters = new LongSparseArray<>();
        this.textMessageConfig = new C5898b();
        this.hotDurations = new LongSparseArray<>();
        this.startStreamingTimestamps = new LongSparseArray<>();
        this.pendingBottomMessages = new LongSparseArray<>();
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void updateGameMessageViewUserCount(int i) {
        C5977i.f15008d = i;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public Class<? extends LiveRecyclableWidget> getPublicScreenWidgetClass(boolean z) {
        if (z) {
            return PortraitPublicScreenWidget.class;
        }
        return LandscapePublicScreenWidget.class;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void onStopStreaming(long j) {
        this.startStreamingTimestamps.remove(j);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void resetDuration(long j) {
        this.hotDurations.remove(j);
    }

    public final void unregisterPresenter(long j) {
        this.presenters.remove(j);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void addOnRegistryReadyListener(AbstractC5885e eVar) {
        C89219l.m154721d(eVar, "");
        this.onRegistryReadyListeners.add(eVar);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public C9871g getCurrentBottomMessage(long j) {
        C5953h hVar = this.presenters.get(j);
        if (hVar != null) {
            return hVar.f14920c;
        }
        return null;
    }

    public final C9871g getPendingBottomMessage(long j) {
        C9871g gVar = this.pendingBottomMessages.get(j);
        this.pendingBottomMessages.remove(j);
        return gVar;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public Long getStartStreamingTimestamp(long j) {
        return this.startStreamingTimestamps.get(j);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void onStartStreaming(long j) {
        this.startStreamingTimestamps.put(j, Long.valueOf(System.currentTimeMillis()));
    }

    public void removeOnRegistryReadyListener(AbstractC5885e eVar) {
        C89219l.m154721d(eVar, "");
        this.onRegistryReadyListeners.remove(eVar);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public boolean uiOptimized(boolean z) {
        if (!z || !getUiOptimized()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public long getHotDuration(long j) {
        Long l = this.hotDurations.get(j);
        if (l != null) {
            return l.longValue();
        }
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void hideWarningMessage(long j) {
        C5953h hVar = this.presenters.get(j);
        if (hVar != null) {
            ((C5953h.AbstractC5956a) hVar.f38654y).mo11852h();
        }
    }

    public final void registerPresenter(long j, C5953h hVar) {
        C89219l.m154721d(hVar, "");
        this.presenters.put(j, hVar);
    }

    public final void addHotDuration(long j, long j2) {
        long j3;
        Long l = this.hotDurations.get(j);
        if (l != null) {
            j3 = l.longValue();
        } else {
            j3 = 0;
        }
        this.hotDurations.put(j, Long.valueOf(j3 + j2));
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void updateModel(long j, AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
        C5953h hVar2 = this.presenters.get(j);
        if (hVar2 != null) {
            hVar2.mo11836c(hVar);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void removeModelByToken(long j, long j2) {
        C5953h hVar = this.presenters.get(j);
        if (hVar != null && j2 != 0) {
            int a = hVar.mo11828a(j2);
            if (a != -1) {
                hVar.mo11835b(a);
            } else if (!C5953h.m13022a(j2, hVar.f14924g) && !C5953h.m13022a(j2, hVar.f14925h)) {
                C5953h.m13022a(j2, hVar.f14926i);
            }
        }
    }

    public C5910c createExternalLauncher(Context context, ViewGroup viewGroup, long j) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        return new C5910c(context, viewGroup, j);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public AbstractC5863b createGameMessageView(Context context, int i, AbstractC5862a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        return new C5977i(context, i, aVar);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public long insertMessage(long j, AbstractC6571a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        C5953h hVar = this.presenters.get(j);
        if (hVar != null) {
            return hVar.mo11829a(aVar, z);
        }
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public C9878i mockChatMessage(long j, String str, User user) {
        C9878i iVar = new C9878i();
        long j2 = -System.currentTimeMillis();
        C5895a.f14759a.add(Long.valueOf(j2));
        iVar.f23852a = j2;
        iVar.f23858k = String.valueOf(j2);
        C11778b bVar = new C11778b();
        bVar.f28137c = j;
        bVar.f28138d = j2;
        bVar.f28141g = true;
        iVar.f28134O = bVar;
        iVar.f23853f = str;
        iVar.f23854g = user;
        return iVar;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void updateMessage(long j, long j2, AbstractC6571a aVar) {
        AbstractC5873h a;
        int a2;
        C89219l.m154721d(aVar, "");
        C5953h hVar = this.presenters.get(j);
        if (hVar != null && j2 != 0 && aVar != null && (a = hVar.mo11830a(aVar)) != null && (a2 = hVar.mo11828a(j2)) != -1) {
            hVar.mo11831a(a2, a);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void insertBottomMessage(long j, String str, C9698b bVar, long j2, int i, int i2, int i3) {
        C9871g gVar = new C9871g();
        long j3 = -System.currentTimeMillis();
        C11778b bVar2 = new C11778b();
        bVar2.f28137c = j;
        bVar2.f28138d = j3;
        bVar2.f28141g = true;
        bVar2.f28144j = bVar;
        gVar.f28134O = bVar2;
        gVar.f23845a = str;
        gVar.f23848h = j2;
        gVar.f23846f = i;
        gVar.f23847g = i2;
        gVar.f23849i = i3;
        C5953h hVar = this.presenters.get(j);
        if (hVar != null) {
            hVar.mo11833a(gVar);
        } else {
            this.pendingBottomMessages.put(j, gVar);
        }
    }
}
