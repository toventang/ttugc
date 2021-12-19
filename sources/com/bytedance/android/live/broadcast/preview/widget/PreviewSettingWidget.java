package com.bytedance.android.live.broadcast.preview.widget;

import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3013ae;
import com.bytedance.android.live.broadcast.C3184c;
import com.bytedance.android.live.broadcast.C3250l;
import com.bytedance.android.live.broadcast.api.BroadcastSettingApi;
import com.bytedance.android.live.broadcast.model.C3260f;
import com.bytedance.android.live.broadcast.preview.p201b.C3382a;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p450an.C6800c;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.p452ao.C6805b;
import com.bytedance.android.livesdk.p452ao.C6806c;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdkapi.p700m.C11831d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.xbridge.p1301e.AbstractC18511d;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.p1301e.C18502c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewSettingWidget extends PreviewToolBaseWidget implements AbstractC18511d, AbstractC33974au {

    /* renamed from: a */
    public static final C3612a f9985a = new C3612a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f9986b = C11831d.m20835a(C3615d.f9992a);

    /* renamed from: c */
    private final int f9987c = R.string.gq1;

    /* renamed from: d */
    private final int f9988d = 2131234728;

    /* renamed from: e */
    private final AbstractC0952i f9989e;

    static {
        Covode.recordClassIndex(4117);
    }

    /* renamed from: c */
    private final C3382a m9041c() {
        return (C3382a) this.f9986b.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSettingWidget$a */
    public static final class C3612a {
        static {
            Covode.recordClassIndex(4118);
        }

        private C3612a() {
        }

        public /* synthetic */ C3612a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return this.f9987c;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return this.f9988d;
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSettingWidget$d */
    static final class C3615d extends AbstractC89220m implements AbstractC89171a<C3382a> {

        /* renamed from: a */
        public static final C3615d f9992a = new C3615d();

        static {
            Covode.recordClassIndex(4121);
        }

        C3615d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C3382a invoke() {
            return new C3382a();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C18494b.m34422b("ttlive_show_setting_dialog", this);
    }

    /* renamed from: f */
    private final void m9042f() {
        C6501b.C6502a.m13948a("livesdk_live_take_page_settings_click").mo12643a(this.dataChannel).mo12655b();
        C6805b<Boolean> bVar = AbstractC6804a.f16959bH;
        C89219l.m154716b(bVar, "");
        C6806c.m14603a((C6800c) bVar, (Object) false);
        mo8934e();
        if (!m9041c().mo18054n()) {
            m9041c().show(this.f9989e, "PreviewSettingWidget");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        ((BroadcastSettingApi) C5805e.m12718a().mo11572a(BroadcastSettingApi.class)).fetchBroadcastSetting().mo143271a(new C11191f()).mo143254a(new C3613b(this), new C3614c(this));
        C6805b<Boolean> bVar = AbstractC6804a.f16959bH;
        C89219l.m154716b(bVar, "");
        Boolean a = bVar.mo13066a();
        C89219l.m154716b(a, "");
        if (a.booleanValue()) {
            mo8933d();
        }
        C18494b.m34417a("ttlive_show_setting_dialog", this);
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        C89219l.m154721d(view, "");
        m9042f();
    }

    public PreviewSettingWidget(AbstractC0952i iVar) {
        C89219l.m154721d(iVar, "");
        this.f9989e = iVar;
    }

    @Override // com.bytedance.ies.xbridge.p1301e.AbstractC18511d
    /* renamed from: a */
    public final void mo8791a(C18502c cVar) {
        C89219l.m154721d(cVar, "");
        if (C89219l.m154714a((Object) cVar.f44153a, (Object) "ttlive_show_setting_dialog")) {
            m9042f();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSettingWidget$b */
    static final class C3613b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ PreviewSettingWidget f9990a;

        static {
            Covode.recordClassIndex(4119);
        }

        C3613b(PreviewSettingWidget previewSettingWidget) {
            this.f9990a = previewSettingWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C3260f fVar = (C3260f) ((C5832d) obj).data;
            if (fVar != null) {
                DataChannel dataChannel = this.f9990a.dataChannel;
                if (dataChannel != null) {
                    dataChannel.mo28315b(C3184c.class, fVar);
                }
                DataChannel dataChannel2 = this.f9990a.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.mo28315b(C3250l.class, Integer.valueOf(fVar.f9326a));
                }
                DataChannel dataChannel3 = this.f9990a.dataChannel;
                if (dataChannel3 != null) {
                    dataChannel3.mo28315b(C3013ae.class, Integer.valueOf(fVar.f9331f));
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewSettingWidget$c */
    static final class C3614c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ PreviewSettingWidget f9991a;

        static {
            Covode.recordClassIndex(4120);
        }

        C3614c(PreviewSettingWidget previewSettingWidget) {
            this.f9991a = previewSettingWidget;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            String str = "";
            C89219l.m154716b(th, str);
            HashMap hashMap = new HashMap();
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            hashMap.put("error_msg", str);
            if (th instanceof C2912a) {
                hashMap.put("error_code", Integer.valueOf(((C2908a) th).getErrorCode()));
            } else {
                hashMap.put("error_code", -1);
            }
            C3868c.m9491a("ttlive_live_replay_faq_show_all", 1, hashMap);
            C3868c.m9491a("ttlive_live_replay_faq_show_error", 1, hashMap);
        }
    }
}
