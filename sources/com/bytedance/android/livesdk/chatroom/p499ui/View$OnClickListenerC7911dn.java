package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.C4334j;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.livesetting.other.RoomFollowNoticeDurationSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p428c.C6526e;
import com.bytedance.android.livesdk.p430ab.C6581g;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p450an.C6782a;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6865d;
import com.bytedance.android.livesdk.p456as.C6869e;
import com.bytedance.android.livesdk.p456as.C6873g;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.p542g.DialogC8776b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11264f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.depend.p678b.C11625a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dn */
public class View$OnClickListenerC7911dn extends DialogC8776b implements View.OnClickListener {

    /* renamed from: a */
    public static final String f19670a = View$OnClickListenerC7911dn.class.getSimpleName();

    /* renamed from: b */
    public TextView f19671b;

    /* renamed from: c */
    public boolean f19672c;

    /* renamed from: d */
    public boolean f19673d;

    /* renamed from: e */
    public DataChannel f19674e;

    /* renamed from: i */
    private Room f19675i;

    /* renamed from: j */
    private User f19676j;

    /* renamed from: k */
    private Activity f19677k;

    /* renamed from: l */
    private String f19678l;

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19673d = true;
    }

    public void onDetachedFromWindow() {
        this.f19673d = false;
        super.onDetachedFromWindow();
    }

    static {
        Covode.recordClassIndex(8706);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b77);
        ((HSImageView) findViewById(R.id.j6)).setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.b6a);
        this.f19671b = textView;
        textView.setOnClickListener(this);
        C7577g.m15570a((ImageView) findViewById(R.id.nz), this.f19676j.getAvatarThumb(), 2131234742);
        ((TextView) findViewById(R.id.cpj)).setText(C6581g.m14076b(this.f19676j));
        ((TextView) findViewById(R.id.ajt)).setText(R.string.e1p);
        C6779a.m14563a().mo13053a(new C4334j());
    }

    public void onClick(View view) {
        String str;
        if (view.getId() != R.id.b6a) {
            return;
        }
        if (!C11115u.m19743a().mo17915b().mo13165e()) {
            Bundle bundle = new Bundle();
            bundle.putString("enter_from", "live_detail");
            bundle.putString("action_type", "follow");
            bundle.putString("source", "live");
            bundle.putString("v1_source", "follow");
            AbstractC6872f b = C11115u.m19743a().mo17915b();
            Context context = getContext();
            C6876j.C6877a a = C6876j.m14732a();
            a.f17232a = C6782a.m14569a();
            a.f17233b = C6782a.m14570b();
            a.f17236e = "live_detail";
            a.f17237f = "follow";
            a.f17235d = "live";
            a.f17234c = -1;
            b.mo13149a(context, a.mo13173a()).mo143062b(new C6873g());
        } else if (!this.f19672c) {
            C11115u.m19743a().mo17915b().mo13151a(((C6869e.AbstractC6870a) ((C6869e.AbstractC6870a) ((C6869e.AbstractC6870a) ((C6869e.AbstractC6870a) ((C6865d.AbstractC6866a) new C6869e.C6871b().mo13134a(this.f19676j.getId())).mo13136a(this.f19675i.getRequestId()).mo13139b("live_detail").mo13140c("live_follow_popup").mo13138b(this.f19675i.getId()).mo13142d(this.f19675i.getLabels())).mo13143a(this.f19677k)).mo13145e("live_detail")).mo13146f("follow")).mo13141c()).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new AbstractC88986z<C11688a>() {
                /* class com.bytedance.android.livesdk.chatroom.p499ui.View$OnClickListenerC7911dn.C79121 */

                static {
                    Covode.recordClassIndex(8707);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onSubscribe(AbstractC88412b bVar) {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                    if (View$OnClickListenerC7911dn.this.f19673d) {
                        View$OnClickListenerC7911dn.this.f19672c = false;
                        C11264f.m19957a(View$OnClickListenerC7911dn.this.getContext(), th);
                    }
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(C11688a aVar) {
                    C11688a aVar2 = aVar;
                    if (View$OnClickListenerC7911dn.this.f19673d) {
                        View$OnClickListenerC7911dn.this.f19672c = false;
                        View$OnClickListenerC7911dn.this.f19671b.setText(R.string.e1n);
                        View$OnClickListenerC7911dn.this.dismiss();
                        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.e1n);
                        C6779a.m14563a().mo13053a(new C11625a(aVar2));
                    }
                }
            });
            this.f19672c = true;
            HashMap hashMap = new HashMap();
            hashMap.put("follow_notice_duration", String.valueOf((long) RoomFollowNoticeDurationSetting.INSTANCE.getValue()));
            hashMap.put("growth_deepevent", "1");
            if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
                hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
            }
            String g = C6544e.m13993g();
            if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            if (this.f21642f) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            hashMap.put("room_orientation", str);
            C6501b.C6502a.m13948a("follow").mo12652a((Map<String, String>) hashMap).mo12640a(new C6526e("live_follow_popup", this.f19676j.getId())).mo12654b("live_interact").mo12658d("live_detail").mo12643a(this.f19674e).mo12655b();
        }
    }

    public View$OnClickListenerC7911dn(Activity activity, boolean z, Room room, String str) {
        super(activity, z);
        this.f19677k = activity;
        this.f19675i = room;
        this.f19676j = room.getOwner();
        this.f19678l = str;
    }
}
