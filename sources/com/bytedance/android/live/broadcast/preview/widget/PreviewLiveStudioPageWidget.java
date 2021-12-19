package com.bytedance.android.live.broadcast.preview.widget;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.preview.p200a.C3367a;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewLiveStudioPageWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public static final C3605a f9966a = new C3605a((byte) 0);

    /* renamed from: b */
    private boolean f9967b;

    static {
        Covode.recordClassIndex(4103);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewLiveStudioPageWidget$a */
    public static final class C3605a {
        static {
            Covode.recordClassIndex(4104);
        }

        private C3605a() {
        }

        public /* synthetic */ C3605a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        HSImageView hSImageView = (HSImageView) findViewById(R.id.bxe);
        C89219l.m154716b(hSImageView, "");
        ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
        layoutParams.height = ((C3966y.m9664c() - C3966y.m9653a(32.0f)) * C3966y.m9653a(215.0f)) / C3966y.m9653a(343.0f);
        hSImageView.setLayoutParams(layoutParams);
        C3941k.m9607a(hSImageView, "tiktok_live_interaction_resource", "ttlive_broadcast_live_studio_preview_page_detail.png");
    }

    /* renamed from: a */
    public final void mo8893a(boolean z) {
        String str;
        super.show();
        this.f9967b = z;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C6501b.C6502a.m13948a("livesdk_live_studio_intro_show").mo12651a("anchor_id", C3367a.m8811a()).mo12651a("from_message", str).mo12655b();
    }
}
