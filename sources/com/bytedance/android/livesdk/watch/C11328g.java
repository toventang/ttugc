package com.bytedance.android.livesdk.watch;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.android.livesdk.callback.AbstractC7258b;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.watch.g */
public class C11328g implements AbstractC11325d {
    static {
        Covode.recordClassIndex(12967);
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void addLiveDuration(long j) {
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void addLiveDurationTask(AbstractC7258b bVar) {
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public AbstractC11321b createDrawerFeedFragment(FullDraggableContainer fullDraggableContainer, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public AbstractC11650h createLiveRoomFragment(EnterRoomConfig enterRoomConfig) {
        C89219l.m154721d(enterRoomConfig, "");
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void dislikeLiveFromSharePanel(Room room, String str, String str2) {
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public int getLiveRoomChangeCount() {
        return 0;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public AbstractC11322c getPreFetchManager() {
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void logDislikeLiveFromLongPressSharePanel(Room room, String str, String str2) {
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void logDislikeLiveFromSharePanel(Room room, String str, String str2) {
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void logReportLiveFromSharePanel(Room room, String str, String str2, String str3) {
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public DialogInterface openLongPressDialog(IHostLongPressCallback iHostLongPressCallback, Context context, Room room, String str, String str2, String str3) {
        return null;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void openShareSettingsDialog(Activity activity, String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void preloadWatchResource(Context context) {
        C89219l.m154721d(context, "");
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void setLiveRoomChangeCount(int i) {
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public boolean shouldDislikeActionShow(String str, String str2) {
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public void showMaskLayer(long j, boolean z) {
    }

    /* renamed from: com.bytedance.android.livesdk.watch.g$a */
    public static final class C11329a implements AbstractC11320a {
        static {
            Covode.recordClassIndex(12968);
        }

        @Override // com.bytedance.android.livesdk.watch.AbstractC11320a
        /* renamed from: a */
        public final void mo17744a() {
        }

        @Override // com.bytedance.android.livesdk.watch.AbstractC11320a
        /* renamed from: a */
        public final void mo17745a(Runnable runnable) {
            C89219l.m154721d(runnable, "");
        }

        @Override // com.bytedance.android.livesdk.watch.AbstractC11320a
        /* renamed from: b */
        public final void mo17746b() {
        }

        @Override // com.bytedance.android.livesdk.watch.AbstractC11320a
        /* renamed from: c */
        public final boolean mo17747c() {
            return false;
        }

        C11329a() {
        }
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public AbstractC11320a createShareGuideEvasionStrategy(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        return new C11329a();
    }

    @Override // com.bytedance.android.livesdk.watch.AbstractC11325d
    public List<?> audienceToolbarList(DataChannel dataChannel, Context context) {
        C89219l.m154721d(dataChannel, "");
        C89219l.m154721d(context, "");
        return new ArrayList();
    }
}
