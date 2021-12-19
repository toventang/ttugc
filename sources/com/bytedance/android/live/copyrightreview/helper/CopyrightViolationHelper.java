package com.bytedance.android.live.copyrightreview.helper;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.android.live.copyrightreview.ReviewApi;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.p481b.C7307f;
import com.bytedance.android.livesdk.chatroom.p491f.C7557c;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.message.C9688bt;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p562k.DialogC9148b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

public class CopyrightViolationHelper implements AbstractC33974au {

    /* renamed from: a */
    Dialog f10545a;

    /* renamed from: b */
    Dialog f10546b;

    /* renamed from: c */
    AbstractC88412b f10547c;

    /* renamed from: d */
    boolean f10548d;

    /* renamed from: e */
    boolean f10549e;

    /* renamed from: f */
    final Runnable f10550f = new RunnableC3815a(this);

    /* renamed from: g */
    private final Handler f10551g;

    static {
        Covode.recordClassIndex(4343);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void onDestroy() {
        Dialog dialog = this.f10545a;
        if (dialog != null && dialog.isShowing()) {
            this.f10545a.dismiss();
        }
        Dialog dialog2 = this.f10546b;
        if (dialog2 != null && dialog2.isShowing()) {
            this.f10546b.dismiss();
        }
        this.f10551g.removeMessages(1);
        this.f10551g.removeMessages(2);
    }

    /* renamed from: b */
    static int m9378b(Room room) {
        if (m9380d(room)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: c */
    private static String m9379c(Room room) {
        if (m9380d(room)) {
            return "anchor";
        }
        return "user";
    }

    public CopyrightViolationHelper(AbstractC1204m mVar) {
        mVar.getLifecycle().mo4012a(this);
        this.f10551g = new Handler(new C3816b(this));
    }

    /* renamed from: d */
    private static boolean m9380d(Room room) {
        if (room.getOwnerUserId() == C11115u.m19743a().mo17915b().mo13161c()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo9163a(int i) {
        if (!this.f10551g.hasMessages(i)) {
            this.f10551g.sendEmptyMessageDelayed(i, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e6m);
    }

    /* renamed from: a */
    static void m9376a(Room room) {
        if (m9380d(room)) {
            C7307f.m15216a((Handler) null);
        } else {
            ((LinkApi) C5805e.m12718a().mo11572a(LinkApi.class)).leave(room.getId(), C6894d.m14753a().f17274u).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142926c();
        }
    }

    /* renamed from: a */
    static void m9377a(Room room, String str, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("anchor_id", String.valueOf(room.author().getId()));
        hashMap.put("room_id", String.valueOf(room.getId()));
        if (z) {
            hashMap.put("button_click_type", str);
            hashMap.put("object_oriented", m9379c(room));
            C6501b.C6502a.m13948a("livesdk_copyright_notification_popup_click").mo12652a((Map<String, String>) hashMap).mo12655b();
            return;
        }
        hashMap.put("button_type", str);
        C6501b.C6502a.m13948a("livesdk_copyright_warning_popup_click").mo12652a((Map<String, String>) hashMap).mo12655b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC88412b mo9162a(Room room, int i, int i2) {
        return ((ReviewApi) C5805e.m12718a().mo11572a(ReviewApi.class)).confirmCopyright(room.getId(), i, i2).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C3822h(this), new C3823i(this));
    }

    /* renamed from: a */
    public final void mo9164a(Context context, C9688bt btVar, Room room, C88411a aVar) {
        boolean z;
        Dialog dialog;
        if (btVar.f23579f == 7) {
            z = true;
        } else {
            z = false;
            Dialog dialog2 = this.f10545a;
            if (dialog2 != null && dialog2.isShowing()) {
                return;
            }
        }
        if (!this.f10548d && !this.f10551g.hasMessages(1)) {
            if ((!z || (dialog = this.f10546b) == null || !dialog.isShowing()) && !this.f10549e && !this.f10551g.hasMessages(2)) {
                CharSequence a = C7557c.m15538a(btVar.f23587n, "");
                if (TextUtils.isEmpty(a)) {
                    a = btVar.f23578a;
                }
                if (!TextUtils.isEmpty(a)) {
                    CharSequence a2 = C7557c.m15538a(btVar.f23586m, "");
                    if (TextUtils.isEmpty(a2)) {
                        a2 = C7557c.m15538a(btVar.f23581h, "");
                    }
                    if (TextUtils.isEmpty(a2)) {
                        a2 = C3966y.m9657a((int) R.string.glj);
                    }
                    if (z) {
                        int b = m9378b(room);
                        DialogC9148b.C9149a aVar2 = new DialogC9148b.C9149a(context);
                        aVar2.f22256m = false;
                        DialogC9148b.C9149a b2 = aVar2.mo15244a(R.string.gw2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3820f(this, aVar, room, b), false).mo15249b(R.string.dzt, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3821g(this, room, aVar, b), false);
                        b2.f22244a = a2;
                        b2.f22246c = a;
                        this.f10546b = b2.mo15247a();
                        Dialog dialog3 = this.f10545a;
                        if (dialog3 == null || !dialog3.isShowing()) {
                            this.f10551g.post(this.f10550f);
                        } else {
                            this.f10551g.postDelayed(this.f10550f, InteractFirstFrameTimeOutDurationSetting.DEFAULT);
                        }
                    } else {
                        DialogC9148b.C9149a aVar3 = new DialogC9148b.C9149a(context);
                        aVar3.f22256m = false;
                        DialogC9148b.C9149a b3 = aVar3.mo15244a(R.string.gw2, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3818d(this, aVar, room), false).mo15249b(R.string.gi6, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3819e(this, room), false);
                        b3.f22244a = a2;
                        b3.f22246c = a;
                        DialogC9148b a3 = b3.mo15247a();
                        this.f10545a = a3;
                        a3.show();
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("anchor_id", String.valueOf(room.author().getId()));
                    hashMap.put("room_id", String.valueOf(room.getId()));
                    if (z) {
                        hashMap.put("object_oriented", m9379c(room));
                        C6501b.C6502a.m13948a("livesdk_copyright_notification_popup_show").mo12652a((Map<String, String>) hashMap).mo12655b();
                        return;
                    }
                    C6501b.C6502a.m13948a("livesdk_copyright_warning_popup_show").mo12652a((Map<String, String>) hashMap).mo12655b();
                }
            }
        }
    }
}
