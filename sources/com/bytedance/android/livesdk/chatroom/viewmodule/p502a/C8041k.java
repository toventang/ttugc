package com.bytedance.android.livesdk.chatroom.viewmodule.p502a;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.live.broadcast.preview.C3377aj;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.C4031a;
import com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f;
import com.bytedance.android.live.p385p.EnumC5847l;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.widget.C12242b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a.k */
public final class C8041k implements AbstractC1214u<C12242b>, AbstractView$OnClickListenerC5841f {

    /* renamed from: a */
    private DataChannel f20035a;

    /* renamed from: b */
    private Context f20036b;

    static {
        Covode.recordClassIndex(8848);
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
    private static boolean m16231a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public C8041k(Context context) {
        this.f20036b = context;
    }

    public final void onClick(View view) {
        C6806c.m14603a((C6800c) AbstractC6804a.f17016cL, (Object) false);
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m16231a();
        }
        if (!C58029j.f132256h) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.edd);
            return;
        }
        Context context = this.f20036b;
        if (!(context == null || this.f20035a == null)) {
            C4031a.m9839a(C3888a.m9506b(context), C3377aj.m8813a(false));
        }
        C6501b.C6502a.m13948a("livesdk_room_detail_setting").mo12639a().mo12661f("click").mo12655b();
    }

    @Override // com.bytedance.android.live.p385p.AbstractView$OnClickListenerC5841f
    /* renamed from: a */
    public final void mo8491a(View view, DataChannel dataChannel) {
        this.f20035a = dataChannel;
        EnumC5847l.INTRO.setRedDotVisible(dataChannel, AbstractC6804a.f17016cL.mo13066a().booleanValue());
        C6501b.C6502a.m13948a("livesdk_room_detail_setting").mo12639a().mo12661f("show").mo12655b();
    }
}
