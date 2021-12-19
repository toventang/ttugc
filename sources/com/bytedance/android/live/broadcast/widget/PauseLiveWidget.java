package com.bytedance.android.live.broadcast.widget;

import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.chatroom.p488c.C7400q;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9075cn;
import com.bytedance.android.livesdk.rank.api.C10341e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PauseLiveWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: b */
    public static final C3758b f10397b = new C3758b((byte) 0);

    /* renamed from: a */
    public final CountDownTimerC3759c f10398a = new CountDownTimerC3759c(this);

    /* renamed from: c */
    private long f10399c;

    /* renamed from: d */
    private final View f10400d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.broadcast.widget.PauseLiveWidget$a */
    public enum EnumC3757a {
        ENTER_PAGE,
        GO_ON_LIVE,
        END_LIVE;

        static {
            Covode.recordClassIndex(4279);
        }
    }

    static {
        Covode.recordClassIndex(4278);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgb;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PauseLiveWidget$b */
    public static final class C3758b {
        static {
            Covode.recordClassIndex(4280);
        }

        private C3758b() {
        }

        public /* synthetic */ C3758b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C11279p.m20021c(this.f10400d);
    }

    @Override // com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C11279p.m20017b(this.f10400d);
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PauseLiveWidget$c */
    public static final class CountDownTimerC3759c extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ PauseLiveWidget f10405a;

        static {
            Covode.recordClassIndex(4281);
        }

        public final void onFinish() {
            this.f10405a.mo9088a(EnumC3757a.END_LIVE);
            C6779a.m14563a().mo13053a(new C7400q(17));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        CountDownTimerC3759c(PauseLiveWidget pauseLiveWidget) {
            super(300000, 1000);
            this.f10405a = pauseLiveWidget;
        }

        public final void onTick(long j) {
            String valueOf;
            LiveTextView liveTextView;
            PauseLiveWidget pauseLiveWidget = this.f10405a;
            int i = (int) (j / 1000);
            int i2 = i % 60;
            StringBuilder append = new StringBuilder("0").append(i / 60).append(':');
            if (i2 < 10) {
                valueOf = "0".concat(String.valueOf(i2));
            } else {
                valueOf = String.valueOf(i2);
            }
            String sb = append.append(valueOf).toString();
            View view = pauseLiveWidget.getView();
            if (view != null && (liveTextView = (LiveTextView) view.findViewById(R.id.eun)) != null) {
                liveTextView.setText(sb);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        LiveButton liveButton;
        super.onCreate();
        View view = getView();
        if (view != null) {
            view.setOnClickListener(View$OnClickListenerC3760d.f10406a);
        }
        View view2 = getView();
        if (!(view2 == null || (liveButton = (LiveButton) view2.findViewById(R.id.xe)) == null)) {
            liveButton.setOnClickListener(new View$OnClickListenerC3761e(this));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28309a((AbstractC1204m) this, C9075cn.class, (AbstractC89172b) new C3762f(this));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PauseLiveWidget$d */
    static final class View$OnClickListenerC3760d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC3760d f10406a = new View$OnClickListenerC3760d();

        static {
            Covode.recordClassIndex(4282);
        }

        View$OnClickListenerC3760d() {
        }

        public final void onClick(View view) {
            C11226ao.m19882a(C3966y.m9669e(), (int) R.string.duo);
        }
    }

    public PauseLiveWidget(View view) {
        C89219l.m154721d(view, "");
        this.f10400d = view;
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PauseLiveWidget$e */
    static final class View$OnClickListenerC3761e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PauseLiveWidget f10407a;

        static {
            Covode.recordClassIndex(4283);
        }

        View$OnClickListenerC3761e(PauseLiveWidget pauseLiveWidget) {
            this.f10407a = pauseLiveWidget;
        }

        public final void onClick(View view) {
            this.f10407a.dataChannel.mo28315b(C9075cn.class, (Object) false);
            this.f10407a.hide();
            this.f10407a.f10398a.cancel();
            this.f10407a.mo9088a(EnumC3757a.GO_ON_LIVE);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PauseLiveWidget$f */
    static final class C3762f extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PauseLiveWidget f10408a;

        static {
            Covode.recordClassIndex(4284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3762f(PauseLiveWidget pauseLiveWidget) {
            super(1);
            this.f10408a = pauseLiveWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (bool.booleanValue() && !this.f10408a.isShowing()) {
                this.f10408a.show();
                this.f10408a.f10398a.start();
                this.f10408a.mo9088a(EnumC3757a.ENTER_PAGE);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo9088a(EnumC3757a aVar) {
        boolean z;
        long elapsedRealtime;
        int i = 0;
        if (aVar == EnumC3757a.ENTER_PAGE) {
            z = true;
            elapsedRealtime = 0;
            if (1 != 0) {
                this.f10399c = SystemClock.elapsedRealtime();
            }
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.f10399c) / 1000;
        } else {
            z = false;
            elapsedRealtime = (SystemClock.elapsedRealtime() - this.f10399c) / 1000;
        }
        C6501b a = C6501b.C6502a.m13948a("livesdk_live_pause_page").mo12643a(this.dataChannel);
        String aVar2 = aVar.toString();
        Locale locale = Locale.ENGLISH;
        C89219l.m154716b(locale, "");
        Objects.requireNonNull(aVar2, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = aVar2.toLowerCase(locale);
        C89219l.m154716b(lowerCase, "");
        C6501b a2 = a.mo12651a("action_type", lowerCase);
        Integer num = (Integer) this.dataChannel.mo28318b(C10341e.class);
        if (num != null) {
            i = num.intValue();
        }
        C6501b a3 = a2.mo12645a("viewers_cnt", i);
        if (!z) {
            a3.mo12646a("pause_duration", elapsedRealtime);
        }
        a3.mo12655b();
    }
}
