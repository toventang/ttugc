package com.bytedance.android.live.broadcast.preview.widget;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.base.model.user.C2997d;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.p198g.C3241b;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p405s.AbstractC6103e;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9023aq;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.model.C11838d;
import com.bytedance.android.livesdkapi.p697j.AbstractC11821a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewShareWidget extends PreviewToolBaseWidget implements AbstractC33974au {

    /* renamed from: a */
    private final int f9993a = R.string.gvm;

    /* renamed from: b */
    private final int f9994b = 2131234599;

    /* renamed from: c */
    private final User f9995c;

    static {
        Covode.recordClassIndex(4122);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return this.f9993a;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return this.f9994b;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        User user = this.f9995c;
        if (user != null && user.getSecret() != 1) {
            super.show();
        }
    }

    public PreviewShareWidget(User user) {
        this.f9995c = user;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        User user;
        String str;
        C89219l.m154721d(view, "");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        AbstractC2994b a = b.mo13147a();
        if (a instanceof User) {
            user = (User) a;
        } else {
            user = this.f9995c;
        }
        if (user != null && this.context != null) {
            if (user.getSecret() == 1) {
                ((AbstractC6103e) C6193a.m13435a(AbstractC6103e.class)).report(C11279p.m20001a(this.context), new C11838d(0, user.getId(), user.getId(), user.getSecUid(), "start_broadcast", C6544e.m13987a(), C6544e.m13990d(), "click", "report_anchor", ""));
            } else if (C3241b.f9296a != null) {
                HashMap hashMap = new HashMap();
                AbstractC2953a a2 = C6193a.m13435a(IHostApp.class);
                C89219l.m154716b(a2, "");
                if (((IHostApp) a2).isInMusicallyRegion()) {
                    str = "h5_m";
                } else {
                    str = "h5_t";
                }
                StringBuilder sb = new StringBuilder("www.tiktok.com/@");
                AbstractC2994b a3 = b.mo13147a();
                C89219l.m154716b(a3, "");
                StringBuilder sb2 = new StringBuilder(sb.append(a3.getDisplayId()).append("/live?prepare=1&source=").append(str).append("&_r=1").toString());
                C6501b.C6502a.m13948a("anchor_share_click").mo12643a(this.dataChannel).mo12651a("request_page", "live_take").mo12651a("anchor_id", String.valueOf(b.mo13161c())).mo12655b();
                C11666c.C11667a aVar = new C11666c.C11667a(C2997d.C2998a.m8305a(), (byte) 0);
                aVar.f27855b = -1;
                AbstractC11821a aVar2 = C3241b.f9296a;
                ActivityC0945e a4 = C11279p.m20001a(this.context);
                aVar.f27857d = b.mo13161c();
                aVar.f27870q = true;
                aVar.f27865l = sb2.toString();
                aVar.f27837A = hashMap;
                aVar2.mo18890a(a4, aVar.mo18437a(), new C3616a(this, b));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewShareWidget$a */
    public static final class C3616a implements AbstractC11665b {

        /* renamed from: a */
        final /* synthetic */ PreviewShareWidget f9996a;

        /* renamed from: b */
        final /* synthetic */ AbstractC6872f f9997b;

        static {
            Covode.recordClassIndex(4123);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
        /* renamed from: a */
        public final void mo8904a(Throwable th) {
            C89219l.m154721d(th, "");
        }

        C3616a(PreviewShareWidget previewShareWidget, AbstractC6872f fVar) {
            this.f9996a = previewShareWidget;
            this.f9997b = fVar;
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
        /* renamed from: a */
        public final void mo8903a(String str, String str2, Bundle bundle) {
            String str3;
            String valueOf;
            String str4 = "";
            C89219l.m154721d(str, str4);
            C89219l.m154721d(str2, str4);
            PreviewShareWidget previewShareWidget = this.f9996a;
            AbstractC6872f fVar = this.f9997b;
            C89219l.m154716b(fVar, str4);
            if (bundle == null || (str3 = bundle.getString("shareIdList")) == null) {
                str3 = str4;
            }
            C89219l.m154716b(str3, str4);
            String mD5String = MD5Utils.getMD5String("share_success" + System.currentTimeMillis());
            C6501b.C6502a.m13948a("share_info").mo12651a("bind_id", mD5String).mo12651a("to_user_id", str3).mo12655b();
            HashMap hashMap = new HashMap();
            hashMap.put("share_platform", str);
            hashMap.put("share_type", str2);
            hashMap.put("user_type", "anchor");
            hashMap.put("request_page", "live_take");
            C89219l.m154716b(mD5String, str4);
            hashMap.put("bind_id", mD5String);
            hashMap.put("anchor_id", String.valueOf(fVar.mo13161c()));
            hashMap.put("initiator", "anchor");
            String g = C6544e.m13993g();
            if (TextUtils.isEmpty(g) || !C89219l.m154714a((Object) "click_push_live_cd_user", (Object) g)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            if (C3966y.m9670f()) {
                hashMap.put("room_orientation", "portrait");
            } else {
                hashMap.put("room_orientation", "landscape");
            }
            Hashtag hashtag = (Hashtag) previewShareWidget.dataChannel.mo28318b(C9023aq.class);
            if (hashtag != null) {
                String str5 = hashtag.title;
                if (str5 == null) {
                    str5 = str4;
                }
                hashMap.put("hash_type", str5);
                Long l = hashtag.f23083id;
                if (!(l == null || (valueOf = String.valueOf(l.longValue())) == null)) {
                    str4 = valueOf;
                }
                hashMap.put("hashtag_id", str4);
            }
            C6501b.C6502a.m13948a("share").mo12643a(previewShareWidget.dataChannel).mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }
}
