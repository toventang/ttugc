package com.bytedance.android.livesdk.p603q;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.livesdk.chatroom.p488c.C7388g;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p603q.C10142g;
import com.bytedance.android.livesdk.service.p625c.p633h.C10753a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.q.i */
public final class C10145i extends FrameLayout implements C10142g.AbstractC10143a {

    /* renamed from: a */
    private LiveAutoRtlImageView f24605a;

    /* renamed from: b */
    private C10142g f24606b;

    /* renamed from: c */
    private final boolean f24607c;

    /* renamed from: d */
    private LiveAutoRtlTextView f24608d;

    static {
        Covode.recordClassIndex(11708);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        C10142g gVar = this.f24606b;
        if (!(gVar == null || gVar.f24602c == null)) {
            gVar.f24602c.mo142944a();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.android.livesdk.p603q.C10142g.AbstractC10143a
    /* renamed from: a */
    public final void mo16986a(C9904t tVar) {
        if (tVar != null) {
            if (this.f24607c) {
                LiveAutoRtlTextView liveAutoRtlTextView = this.f24608d;
                if (liveAutoRtlTextView != null) {
                    String str = tVar.f23996a;
                    if (str == null) {
                        str = C3966y.m9657a((int) R.string.ebn);
                    }
                    liveAutoRtlTextView.setText(str);
                }
                C7577g.m15571a(this.f24605a, tVar.f23997b, C3966y.m9653a(24.0f), C3966y.m9653a(24.0f), 0);
            } else {
                C7577g.m15571a(this.f24605a, tVar.f23997b, C3966y.m9653a(26.0f), C3966y.m9653a(26.0f), 0);
            }
            if (isShown()) {
                C10753a.m19349a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10145i(Context context, DataChannel dataChannel) {
        super(context);
        boolean z;
        C89219l.m154721d(context, "");
        C89219l.m154721d(dataChannel, "");
        MethodCollector.m26663i(3682);
        Boolean bool = (Boolean) dataChannel.mo28318b(C9114dz.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f24607c = z;
        if (z) {
            View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bfx, null, false);
            this.f24605a = (LiveAutoRtlImageView) a.findViewById(R.id.ek8);
            this.f24608d = (LiveAutoRtlTextView) a.findViewById(R.id.ekj);
            addView(a);
        } else {
            setBackgroundResource(R.drawable.c8s);
            this.f24605a = new LiveAutoRtlImageView(getContext());
            int b = (int) C13628n.m24520b(getContext(), 5.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C3966y.m9653a(26.0f), C3966y.m9653a(26.0f));
            layoutParams.topMargin = b;
            layoutParams.leftMargin = b;
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(b);
            LiveAutoRtlImageView liveAutoRtlImageView = this.f24605a;
            if (liveAutoRtlImageView == null) {
                C89219l.m154715b();
            }
            liveAutoRtlImageView.setLayoutParams(layoutParams);
            addView(this.f24605a);
        }
        C10142g gVar = new C10142g(dataChannel);
        this.f24606b = gVar;
        gVar.f24603d = this;
        gVar.f24602c.mo142945a(C6779a.m14563a().mo13052a(C7388g.class).mo143289d(new C10144h(gVar)));
        setClipChildren(false);
        MethodCollector.m26664o(3682);
    }
}
