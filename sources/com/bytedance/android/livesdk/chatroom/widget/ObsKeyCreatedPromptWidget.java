package com.bytedance.android.livesdk.chatroom.widget;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.api.C3064f;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public final class ObsKeyCreatedPromptWidget extends LiveRecyclableWidget implements AbstractC33974au {

    /* renamed from: a */
    public static final C8160a f20234a = new C8160a((byte) 0);

    static {
        Covode.recordClassIndex(8978);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bcc;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.ObsKeyCreatedPromptWidget$a */
    public static final class C8160a {
        static {
            Covode.recordClassIndex(8979);
        }

        private C8160a() {
        }

        public /* synthetic */ C8160a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        DataChannelGlobal.f42558d.mo28326b(this);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.ObsKeyCreatedPromptWidget$b */
    static final class C8161b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ObsKeyCreatedPromptWidget f20235a;

        static {
            Covode.recordClassIndex(8980);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8161b(ObsKeyCreatedPromptWidget obsKeyCreatedPromptWidget) {
            super(1);
            this.f20235a = obsKeyCreatedPromptWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.f20235a.show();
            } else {
                this.f20235a.hide();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        String a = C3966y.m9660a((int) R.string.e8g, "tiktok.com");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#FFFFFFE6"));
        C89219l.m154716b(a, "");
        spannableStringBuilder.setSpan(foregroundColorSpan, C89361p.m154888a((CharSequence) a, "tiktok.com", 0, false, 6), C89361p.m154888a((CharSequence) a, "tiktok.com", 0, false, 6) + 10, 33);
        View findViewById = findViewById(R.id.d_u);
        C89219l.m154716b(findViewById, "");
        ((LiveTextView) findViewById).setText(spannableStringBuilder);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f42558d;
        C8161b bVar = new C8161b(this);
        C89219l.m154719c(this, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(C3064f.class, "");
        C89219l.m154719c(bVar, "");
        dataChannelGlobal.mo28307a(this, this, C3064f.class, true, bVar);
    }
}
