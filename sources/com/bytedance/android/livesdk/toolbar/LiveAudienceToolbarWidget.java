package com.bytedance.android.livesdk.toolbar;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.gift.C4328d;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.p378m.C5762c;
import com.bytedance.android.live.p385p.AbstractC5843h;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p385p.EnumC5852o;
import com.bytedance.android.live.p385p.EnumC5854q;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.livesetting.other.LiveTurntableUrlSetting;
import com.bytedance.android.livesdk.p561j.C9034ba;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p561j.C9119ed;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;

public class LiveAudienceToolbarWidget extends RoomRecycleWidget implements AbstractC33974au {

    /* renamed from: a */
    private static final int f26163a = C3966y.m9653a(8.0f);

    /* renamed from: b */
    private static final int f26164b = C3966y.m9653a(4.0f);

    /* renamed from: c */
    private List<EnumC5847l> f26165c = new ArrayList();

    /* renamed from: d */
    private LinearLayout f26166d;

    /* renamed from: e */
    private boolean f26167e;

    /* renamed from: f */
    private boolean f26168f;

    /* renamed from: g */
    private boolean f26169g = false;

    /* renamed from: h */
    private EnumC5854q f26170h;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bek;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        Covode.recordClassIndex(12497);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f26165c.clear();
        ((AbstractC5843h) C6193a.m13435a(AbstractC5843h.class)).toolbarManager().mo11615a(this.dataChannel);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public void onVisibilityToUser(boolean z) {
        super.onVisibilityToUser(z);
        EnumC5852o.RIGHT.onVisibility(z, this.dataChannel, this.f26165c, this.f26170h);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        this.f26167e = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f26168f = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
        this.f26166d = (LinearLayout) getView();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        if (room != null) {
            if (C5762c.m12633b(this.dataChannel)) {
                EnumC5847l.QUESTION.setEnableClick(this.dataChannel, true);
            } else {
                EnumC5847l.QUESTION.unload(this.dataChannel);
            }
            List<?> audienceToolbarList = ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).audienceToolbarList(this.dataChannel, getContext());
            ArrayList arrayList = new ArrayList();
            if (audienceToolbarList != null) {
                for (int i = 0; i < audienceToolbarList.size(); i++) {
                    arrayList.add(audienceToolbarList.get(i));
                }
            }
            if (arrayList.size() > 0) {
                EnumC5852o.RIGHT.refreshHolder(this.dataChannel, this.f26166d, arrayList, this.f26170h);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        int i = 0;
        C0792v.m2759b((View) this.f26166d, 0);
        this.f26167e = ((Boolean) this.dataChannel.mo28318b(C9119ed.class)).booleanValue();
        this.f26168f = ((Boolean) this.dataChannel.mo28318b(C9076co.class)).booleanValue();
        boolean equals = Boolean.TRUE.equals(this.dataChannel.mo28318b(C9114dz.class));
        this.f26169g = equals;
        if (equals) {
            this.f26170h = EnumC5854q.ICON_WITH_TEXT;
        } else {
            this.f26170h = EnumC5854q.ICON;
        }
        this.dataChannel.mo28309a((AbstractC1204m) this, C9034ba.class, (AbstractC89172b) new C10903b(this)).mo28313b((AbstractC1204m) this, C4328d.class, (AbstractC89172b) new C10904c(this));
        if (TextUtils.isEmpty(LiveTurntableUrlSetting.INSTANCE.getValue())) {
            ((IGiftService) C6193a.m13435a(IGiftService.class)).onTurnTableUrlEmpty("The value in LiveConfigSettingKeys is empty");
        }
        if (objArr != null && objArr.length > 0 && (objArr[0] instanceof List)) {
            this.f26165c = (List) objArr[0];
        }
        EnumC5852o.RIGHT.createHolder(this.dataChannel, this.f26166d, this.f26165c, this.f26170h);
        if (this.context != null && !this.f26167e && this.contentView != null && (this.contentView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.contentView.getLayoutParams();
            if (this.f26168f || !C6229a.m13521a(this.context)) {
                marginLayoutParams.rightMargin = f26163a;
                if (this.f26169g) {
                    i = f26164b;
                }
                marginLayoutParams.leftMargin = i;
            } else {
                marginLayoutParams.leftMargin = f26163a;
                if (this.f26169g) {
                    i = f26164b;
                }
                marginLayoutParams.rightMargin = i;
            }
            this.contentView.setLayoutParams(marginLayoutParams);
        }
    }
}
