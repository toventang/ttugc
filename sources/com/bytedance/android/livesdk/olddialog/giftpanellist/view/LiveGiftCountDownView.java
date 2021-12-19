package com.bytedance.android.livesdk.olddialog.giftpanellist.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.firstrecharge.C8729d;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveGiftCountDownView extends FrameLayout {

    /* renamed from: a */
    private LiveTextView f24378a;

    /* renamed from: b */
    private final Handler f24379b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final int f24380c = 60;

    /* renamed from: d */
    private final int f24381d = 3600;

    static {
        Covode.recordClassIndex(11592);
    }

    /* renamed from: b */
    public final void mo16863b() {
        this.f24379b.postDelayed(new RunnableC10038a(this), 1000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.view.LiveGiftCountDownView$a */
    public static final class RunnableC10038a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LiveGiftCountDownView f24382a;

        static {
            Covode.recordClassIndex(11593);
        }

        RunnableC10038a(LiveGiftCountDownView liveGiftCountDownView) {
            this.f24382a = liveGiftCountDownView;
        }

        public final void run() {
            long a = C8729d.f21542u.f21548e - (C11200a.m19851a() / 1000);
            if (a >= 0) {
                this.f24382a.mo16863b();
                this.f24382a.setTimeText(a);
            }
        }
    }

    /* renamed from: a */
    public final void mo16862a() {
        long a = C8729d.f21542u.f21548e - (C11200a.m19851a() / 1000);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.bdo, this, true);
        LiveTextView liveTextView = (LiveTextView) findViewById(R.id.ei5);
        this.f24378a = liveTextView;
        if (liveTextView != null) {
            liveTextView.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
        LiveTextView liveTextView2 = this.f24378a;
        if (liveTextView2 != null) {
            liveTextView2.setText(m18568a(a));
        }
        mo16863b();
    }

    public final void setTimeText(long j) {
        LiveTextView liveTextView = this.f24378a;
        if (liveTextView != null) {
            liveTextView.setText(m18568a(j));
        }
    }

    /* renamed from: a */
    private final String m18568a(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / ((long) this.f24381d);
        String valueOf = String.valueOf(j2);
        if (valueOf.length() <= 1) {
            sb.append("0");
        }
        sb.append(valueOf);
        sb.append(":");
        long j3 = (j - (((long) this.f24381d) * j2)) / ((long) this.f24380c);
        String valueOf2 = String.valueOf(j3);
        if (valueOf2.length() <= 1) {
            sb.append("0");
        }
        sb.append(valueOf2);
        sb.append(":");
        String valueOf3 = String.valueOf((j - (j2 * ((long) this.f24381d))) - (j3 * ((long) this.f24380c)));
        if (valueOf3.length() <= 1) {
            sb.append("0");
        }
        sb.append(valueOf3);
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveGiftCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(5963);
        MethodCollector.m26664o(5963);
    }
}
