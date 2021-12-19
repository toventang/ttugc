package com.bytedance.android.livesdk.p603q;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.gift.C4343s;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.C6889az;
import com.bytedance.android.livesdk.C8916h;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.model.C9904t;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9076co;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.p561j.C9114dz;
import com.bytedance.android.livesdk.p603q.C10148k;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.service.p625c.p626a.C10715e;
import com.bytedance.android.livesdk.service.p625c.p633h.C10753a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.q.a */
public final class C10136a extends FrameLayout implements C10148k.AbstractC10149a {

    /* renamed from: a */
    C10148k f24585a;

    /* renamed from: b */
    LiveNewSendGiftAnimationView f24586b;

    /* renamed from: c */
    boolean f24587c;

    /* renamed from: d */
    LiveAutoRtlTextView f24588d;

    /* renamed from: e */
    private LiveAutoRtlImageView f24589e;

    /* renamed from: f */
    private DataChannel f24590f;

    /* renamed from: g */
    private C9904t f24591g;

    /* renamed from: h */
    private boolean f24592h;

    /* renamed from: i */
    private AbstractC89172b<Boolean, C89391z> f24593i;

    static {
        Covode.recordClassIndex(11699);
    }

    public final Context getActivityContext() {
        return getContext();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        DataChannel dataChannel = this.f24590f;
        if (dataChannel != null) {
            dataChannel.mo28316b(this);
        }
        C10148k kVar = this.f24585a;
        if (kVar != null) {
            if (kVar.f24612c != null) {
                kVar.f24612c.mo142944a();
            }
            kVar.f24613d = null;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo16977a() {
        long j;
        boolean z;
        Room room;
        DataChannel dataChannel = this.f24590f;
        if (dataChannel != null && !((Boolean) dataChannel.mo28318b(C9076co.class)).booleanValue()) {
            this.f24590f.mo28319c(C4343s.class);
        }
        C6501b.C6502a.m13948a("shortcut_gift_click").mo12639a().mo12654b("live").mo12656c("click").mo12658d("live_detail").mo12660e("bottom_tab").mo12655b();
        C10715e eVar = C10715e.f25799h;
        C9904t tVar = this.f24591g;
        if (tVar != null) {
            j = tVar.f23999d;
        } else {
            j = 0;
        }
        C9904t tVar2 = this.f24591g;
        if (tVar2 == null || !tVar2.mo16601a()) {
            z = false;
        } else {
            z = true;
        }
        Boolean.valueOf(false);
        eVar.mo17643a(j, true, z, "convenient_icon", "", "click");
        C10148k kVar = this.f24585a;
        if (kVar.f24611b != null && kVar.f24610a != null && (room = (Room) kVar.f24611b.mo28318b(C9093de.class)) != null) {
            C10700d dVar = new C10700d(GiftDialogViewModel.EnumC10039a.GIFT, kVar.f24610a.f23999d, kVar.f24610a.mo16601a());
            dVar.f25764f = kVar.f24610a.f24001f;
            dVar.f25775q = kVar.f24610a.f23993J;
            dVar.f25768j = "convenient_gift";
            dVar.f25767i = room.getOwner();
            dVar.f25776r = true;
            kVar.f24611b.mo28320c(C6889az.class, dVar);
        }
    }

    @Override // com.bytedance.android.livesdk.p603q.C10148k.AbstractC10149a
    public final void setImageDrawable(int i) {
        LiveAutoRtlImageView liveAutoRtlImageView = this.f24589e;
        if (liveAutoRtlImageView != null) {
            liveAutoRtlImageView.setImageResource(i);
        }
    }

    @Override // com.bytedance.android.livesdk.p603q.C10148k.AbstractC10149a
    /* renamed from: a */
    public final void mo16978a(C9904t tVar) {
        if (tVar != null) {
            this.f24591g = tVar;
            if (this.f24587c) {
                C7577g.m15571a(this.f24589e, tVar.f23997b, C3966y.m9653a(24.0f), C3966y.m9653a(24.0f), 0);
                String str = tVar.f23996a;
                if (str == null) {
                    str = C3966y.m9657a((int) R.string.ebn);
                }
                this.f24588d.setText(str);
            } else {
                C7577g.m15571a(this.f24589e, tVar.f23997b, C3966y.m9653a(26.0f), C3966y.m9653a(26.0f), 0);
            }
            if (!this.f24592h) {
                this.f24592h = true;
                if (isShown()) {
                    C10753a.m19349a();
                }
            }
        }
    }

    public C10136a(Context context, DataChannel dataChannel) {
        super(context);
        MethodCollector.m26663i(5155);
        C10137b bVar = new C10137b(this);
        this.f24593i = bVar;
        this.f24590f = dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28312a(this, C8916h.class, bVar);
            this.f24587c = Boolean.TRUE.equals(dataChannel.mo28318b(C9114dz.class));
        }
        if (this.f24587c) {
            View a = C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bfx, null, false);
            this.f24589e = (LiveAutoRtlImageView) a.findViewById(R.id.ek8);
            this.f24588d = (LiveAutoRtlTextView) a.findViewById(R.id.ekj);
            a.setOnClickListener(new View$OnClickListenerC10139d(this));
            addView(a);
        } else {
            setBackgroundResource(R.drawable.c8s);
            LiveAutoRtlImageView liveAutoRtlImageView = new LiveAutoRtlImageView(getContext());
            this.f24589e = liveAutoRtlImageView;
            liveAutoRtlImageView.setOnClickListener(new View$OnClickListenerC10138c(this));
            int b = (int) C13628n.m24520b(getContext(), 5.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C3966y.m9653a(26.0f), C3966y.m9653a(26.0f));
            layoutParams.topMargin = b;
            layoutParams.leftMargin = b;
            int i = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(b);
            this.f24589e.setLayoutParams(layoutParams);
            addView(this.f24589e);
        }
        if (getContext() != null) {
            addView(C2690b.m7784a(R.layout.bfw, null));
            LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = (LiveNewSendGiftAnimationView) findViewById(R.id.azc);
            this.f24586b = liveNewSendGiftAnimationView;
            liveNewSendGiftAnimationView.setAnimationType(LiveNewSendGiftAnimationView.EnumC10674a.Fast);
            this.f24586b.setVisibility(8);
            this.f24586b.setScaleX(0.5f);
            this.f24586b.setScaleY(0.5f);
        }
        C6203g.m13469c(new RunnableC10140e(this, dataChannel));
        this.f24591g = null;
        setClipChildren(false);
        this.f24592h = false;
        MethodCollector.m26664o(5155);
    }
}
