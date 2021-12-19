package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.adminsetting.AbstractC2915b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.p561j.C9021ao;
import com.bytedance.android.livesdk.p561j.C9058bx;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.C12242b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.l */
public final class C8042l implements AbstractC1214u<C12242b>, AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    private Room f20037a;

    /* renamed from: b */
    private DataChannel f20038b;

    /* renamed from: c */
    private EnumC11728i f20039c;

    /* renamed from: d */
    private Context f20040d;

    static {
        Covode.recordClassIndex(8849);
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8492a(boolean z) {
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: b */
    public final void mo8493b(View view, DataChannel dataChannel) {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* bridge */ /* synthetic */ void onChanged(C12242b bVar) {
    }

    /* renamed from: a */
    private static boolean m16235a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public C8042l(Context context) {
        this.f20040d = context;
    }

    public final void onClick(View view) {
        C6806c.m14603a((C6800c) AbstractC6804a.f16957bF, (Object) false);
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m16235a();
        }
        if (!C58029j.f132256h) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.edd);
            return;
        }
        AbstractC0952i iVar = (AbstractC0952i) this.f20038b.mo28318b(C9021ao.class);
        if (this.f20037a != null && iVar != null) {
            ((AbstractC2915b) C6193a.m13435a(AbstractC2915b.class)).getAdminSettingDialog().show(iVar, "ToolbarManageBehavior");
            C6501b.C6502a.m13948a("livesdk_anchor_set_page_click").mo12643a(this.f20038b).mo12651a("live_type", C11729j.m20684a(this.f20037a.getStreamType())).mo12655b();
        }
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        this.f20038b = dataChannel;
        this.f20037a = (Room) dataChannel.mo28318b(C9093de.class);
        this.f20039c = (EnumC11728i) dataChannel.mo28318b(C9058bx.class);
        EnumC5847l.SETTING.setRedDotVisible(dataChannel, AbstractC6804a.f16957bF.mo13066a().booleanValue());
    }
}
