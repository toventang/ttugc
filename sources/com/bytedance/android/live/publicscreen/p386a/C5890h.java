package com.bytedance.android.live.publicscreen.p386a;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5862a;
import com.bytedance.android.live.publicscreen.p386a.p389c.AbstractC5863b;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p391e.AbstractC5885e;
import com.bytedance.android.livesdk.model.message.C9871g;
import com.bytedance.android.livesdk.model.message.C9878i;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11639c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.a.h */
public class C5890h implements AbstractC5880e {
    static {
        Covode.recordClassIndex(6497);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void addOnRegistryReadyListener(AbstractC5885e eVar) {
        C89219l.m154721d(eVar, "");
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void clearMockChatMessage() {
    }

    public AbstractC11639c createExternalLauncher(Context context, ViewGroup viewGroup, long j) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(viewGroup, "");
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public AbstractC5863b createGameMessageView(Context context, int i, AbstractC5862a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public C9871g getCurrentBottomMessage(long j) {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public long getHotDuration(long j) {
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public Class<? extends LiveRecyclableWidget> getPublicScreenWidgetClass(boolean z) {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public Long getStartStreamingTimestamp(long j) {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public AbstractC5886f getTextMessageConfig() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void hideWarningMessage(long j) {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void insertBottomMessage(long j, String str, C9698b bVar, long j2, int i, int i2, int i3) {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public long insertMessage(long j, AbstractC6571a aVar, boolean z) {
        C89219l.m154721d(aVar, "");
        return 0;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public C9878i mockChatMessage(long j, String str, User user) {
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void onStartStreaming(long j) {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void onStopStreaming(long j) {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void removeModelByToken(long j, long j2) {
    }

    public void removeOnRegistryReadyListener(AbstractC5885e eVar) {
        C89219l.m154721d(eVar, "");
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void resetDuration(long j) {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public boolean uiOptimized(boolean z) {
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void updateGameMessageViewUserCount(int i) {
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void updateMessage(long j, long j2, AbstractC6571a aVar) {
        C89219l.m154721d(aVar, "");
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public void updateModel(long j, AbstractC5873h hVar) {
        C89219l.m154721d(hVar, "");
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.AbstractC5880e
    public List<AbstractC5885e> getOnRegistryReadyListeners() {
        return C89086z.INSTANCE;
    }
}
