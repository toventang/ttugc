package com.bytedance.android.livesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.livesdk.like.AbstractC9167a;
import com.bytedance.android.livesdk.like.AbstractC9168b;
import com.bytedance.android.livesdk.model.AbsBarrageWidget;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a;
import com.p2082ss.ugc.live.barrage.view.BarrageLayout;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.b */
public class C6890b implements AbstractC10073p {
    static {
        Covode.recordClassIndex(7628);
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public void configInteractionHelper(Fragment fragment, DataChannel dataChannel, GestureDetectLayout gestureDetectLayout) {
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public void configLikeHelper(ActivityC0945e eVar, AbstractC1204m mVar, Room room, AbstractC9167a aVar, boolean z, boolean z2, boolean z3, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public String formatLikeNumber(long j) {
        return "";
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbstractC11633b getBarrageLauncher(Context context, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbsBarrageWidget getBarrageWidget() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbstractC87048a getDiggBarrage(Bitmap bitmap, Double d) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbstractC87059a getDiggController(BarrageLayout barrageLayout, int i) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public AbstractC9168b getLikeHelper(long j) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public Class<? extends LiveRecyclableWidget> getLikeUserInfoAnimWidgetClass(AbstractC9168b bVar) {
        C89219l.m154721d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public Class<? extends LiveRecyclableWidget> getOthersLikeWidgetClass(AbstractC9168b bVar) {
        C89219l.m154721d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public Class<? extends LiveRecyclableWidget> getSelfLikeWidgetClass(AbstractC9168b bVar) {
        C89219l.m154721d(bVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.AbstractC10073p
    public void releaseLikeHelper(long j) {
    }
}
