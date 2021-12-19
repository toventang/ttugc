package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.core.p218f.C3958s;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.p492g.C7589k;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtFeedDrawerShowMoreLiveSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMtForyouEntranceShowMoreLiveSetting;
import com.bytedance.android.livesdk.p561j.C9072ck;
import com.bytedance.android.livesdk.widget.roundcorner.RoundCornerFrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.TimeZone;
import org.json.JSONObject;

public class LiveDrawerEntranceWidget extends RoomRecycleWidget implements AbstractC33974au {

    /* renamed from: a */
    private RoundCornerFrameLayout f19915a;

    /* renamed from: b */
    private ImageView f19916b;

    /* renamed from: c */
    private HSImageView f19917c;

    /* renamed from: d */
    private View f19918d;

    static {
        Covode.recordClassIndex(8797);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.b4m;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public boolean shouldAttach() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.dataChannel == null) {
            return false;
        }
        if (!LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            if (!C7589k.m15601a(this.dataChannel) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            if (!C7589k.m15603b(this.dataChannel) || !LiveMtForyouEntranceShowMoreLiveSetting.INSTANCE.getValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!C7589k.m15604c(this.dataChannel) || !LiveMtFeedDrawerShowMoreLiveSetting.INSTANCE.getValue()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z || z2 || z3) {
                return true;
            }
            return false;
        } else if (!((Boolean) this.dataChannel.mo28318b(C9072ck.class)).booleanValue() || LiveDrawerSettings.INSTANCE.getValue().getEnableDrawerRepeatJump()) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        this.f19916b = (ImageView) getView().findViewById(R.id.aw8);
        if (C3958s.m9646b(this.dataChannel)) {
            this.f19916b.setImageDrawable(C0643b.m2369a(getContext(), 2131234362));
        }
        this.f19915a = (RoundCornerFrameLayout) getView().findViewById(R.id.aw3);
        this.f19918d = getView().findViewById(R.id.aw6);
        int a = C3966y.m9653a(8.0f);
        if (LiveDrawerSettings.INSTANCE.getValue().getEnableFullEntrance()) {
            a = C3966y.m9653a(2.0f);
        }
        if (C6229a.m13521a(getContext())) {
            this.f19915a.setBackground(getContext().getResources().getDrawable(R.drawable.box));
            this.f19918d.setPadding(0, 0, a, 0);
        } else {
            this.f19915a.setBackground(getContext().getResources().getDrawable(R.drawable.bow));
            this.f19918d.setPadding(a, 0, 0, 0);
        }
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "error_code", 0L);
        C3866a.m9475a(jSONObject, "error_msg", "load drawer widget");
        C3866a.m9475a(jSONObject, "enter_method", C7411d.m15284a().mo13612c());
        C3868c.m9492a("ttlive_audience_room_with_drawer", 0, jSONObject);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b2  */
    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLoad(java.lang.Object[] r13) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget.onLoad(java.lang.Object[]):void");
    }

    /* renamed from: a */
    private static long m16183a(long j, TimeZone timeZone) {
        return (((long) timeZone.getOffset(j)) + j) / 86400000;
    }
}
