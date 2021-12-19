package com.bytedance.android.live.broadcast.preview.widget;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6956d;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveObsHelpPageSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdkapi.depend.model.live.C11729j;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewHelpWidget extends PreviewToolBaseWidget implements AbstractC33974au {

    /* renamed from: a */
    public static final C3596a f9941a = new C3596a((byte) 0);

    /* renamed from: b */
    private final int f9942b = R.string.e9s;

    /* renamed from: c */
    private final int f9943c = 2131234590;

    static {
        Covode.recordClassIndex(4092);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewHelpWidget$a */
    public static final class C3596a {
        static {
            Covode.recordClassIndex(4093);
        }

        private C3596a() {
        }

        public /* synthetic */ C3596a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final int mo8870a() {
        return this.f9942b;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: b */
    public final int mo8872b() {
        return this.f9943c;
    }

    @Override // com.bytedance.android.live.broadcast.preview.widget.base.PreviewToolBaseWidget
    /* renamed from: a */
    public final void mo8871a(View view) {
        EnumC11728i iVar;
        C89219l.m154721d(view, "");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iVar = (EnumC11728i) dataChannel.mo28318b(C3802x.class)) != null) {
            if (C11729j.m20689f(iVar)) {
                AbstractC6956d webViewManager = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
                Context context = getContext();
                AbstractC6956d.C6957a b = AbstractC6963e.m14872b("https://webcast.tiktokv.com/falcon/webcast_mt/page/screen_share_intro/index.html");
                b.f17378b = C3966y.m9657a((int) R.string.e9s);
                b.f17385i = false;
                webViewManager.mo13248a(context, b);
                return;
            }
            AbstractC6956d webViewManager2 = ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager();
            Context context2 = this.context;
            AbstractC6956d.C6957a b2 = AbstractC6963e.m14872b(LiveObsHelpPageSetting.INSTANCE.getValue());
            b2.f17378b = C3966y.m9657a((int) R.string.gpb);
            webViewManager2.mo13248a(context2, b2);
            C6501b c = C6501b.C6502a.m13948a("thirdparty_take_guide").mo12643a(this.dataChannel).mo12654b("live_take").mo12656c("click");
            C89219l.m154721d(c, "");
            C89219l.m154721d("live_start", "");
            c.mo12651a("request_page", "live_start");
            c.mo12655b();
        }
    }
}
