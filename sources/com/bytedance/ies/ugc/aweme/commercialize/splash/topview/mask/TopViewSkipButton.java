package com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask;

import android.content.Context;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class TopViewSkipButton extends ConstraintLayout implements HandlerC29663q.AbstractC29664a {

    /* renamed from: i */
    public static final C18069a f43010i = new C18069a((byte) 0);

    /* renamed from: g */
    public final HandlerC29663q f43011g;

    /* renamed from: h */
    AbstractC18070b f43012h;

    /* renamed from: j */
    private final AbstractC89244h f43013j;

    /* renamed from: k */
    private final AbstractC89244h f43014k;

    /* renamed from: l */
    private final AbstractC89244h f43015l;

    /* renamed from: m */
    private String f43016m;

    /* renamed from: n */
    private int f43017n;

    /* renamed from: o */
    private Timer f43018o;

    /* renamed from: p */
    private AwemeSplashInfo.SkipInfo f43019p;

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton$b */
    public interface AbstractC18070b {
        static {
            Covode.recordClassIndex(20700);
        }

        /* renamed from: a */
        void mo28782a(int i);
    }

    static {
        Covode.recordClassIndex(20698);
    }

    public TopViewSkipButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final TextView getButtonUi() {
        return (TextView) this.f43013j.getValue();
    }

    private final View getButtonUnClick() {
        return (View) this.f43015l.getValue();
    }

    public final View getButtonHot() {
        return (View) this.f43014k.getValue();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton$a */
    public static final class C18069a {
        static {
            Covode.recordClassIndex(20699);
        }

        private C18069a() {
        }

        public /* synthetic */ C18069a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton$c */
    static final class C18071c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ TopViewSkipButton f43020a;

        static {
            Covode.recordClassIndex(20701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18071c(TopViewSkipButton topViewSkipButton) {
            super(0);
            this.f43020a = topViewSkipButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f43020a.findViewById(R.id.pe);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton$d */
    static final class C18072d extends AbstractC89220m implements AbstractC89171a<TextView> {

        /* renamed from: a */
        final /* synthetic */ TopViewSkipButton f43021a;

        static {
            Covode.recordClassIndex(20702);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18072d(TopViewSkipButton topViewSkipButton) {
            super(0);
            this.f43021a = topViewSkipButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TextView invoke() {
            return this.f43021a.findViewById(R.id.f41);
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton$e */
    static final class C18073e extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ TopViewSkipButton f43022a;

        static {
            Covode.recordClassIndex(20703);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18073e(TopViewSkipButton topViewSkipButton) {
            super(0);
            this.f43022a = topViewSkipButton;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f43022a.findViewById(R.id.fb4);
        }
    }

    /* renamed from: c */
    private final void m33617c() {
        View buttonUnClick = getButtonUnClick();
        C89219l.m154716b(buttonUnClick, "");
        buttonUnClick.setVisibility(0);
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton$g */
    public static final class C18075g extends TimerTask {

        /* renamed from: a */
        final /* synthetic */ TopViewSkipButton f43026a;

        static {
            Covode.recordClassIndex(20705);
        }

        public final void run() {
            Message obtainMessage = this.f43026a.f43011g.obtainMessage();
            C89219l.m154716b(obtainMessage, "");
            obtainMessage.what = 1;
            this.f43026a.f43011g.sendMessage(obtainMessage);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C18075g(TopViewSkipButton topViewSkipButton) {
            this.f43026a = topViewSkipButton;
        }
    }

    /* renamed from: b */
    public final void mo9139b() {
        this.f43012h = null;
        Timer timer = this.f43018o;
        if (timer != null) {
            timer.cancel();
        }
        this.f43018o = null;
        this.f43011g.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        String string = getContext().getString(R.string.g0b);
        C89219l.m154716b(string, "");
        this.f43016m = string;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.mask.TopViewSkipButton$f */
    public static final class RunnableC18074f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TopViewSkipButton f43023a;

        /* renamed from: b */
        final /* synthetic */ int f43024b;

        /* renamed from: c */
        final /* synthetic */ int f43025c;

        static {
            Covode.recordClassIndex(20704);
        }

        RunnableC18074f(TopViewSkipButton topViewSkipButton, int i, int i2) {
            this.f43023a = topViewSkipButton;
            this.f43024b = i;
            this.f43025c = i2;
        }

        public final void run() {
            View buttonHot = this.f43023a.getButtonHot();
            C89219l.m154716b(buttonHot, "");
            ViewGroup.LayoutParams layoutParams = buttonHot.getLayoutParams();
            View buttonHot2 = this.f43023a.getButtonHot();
            C89219l.m154716b(buttonHot2, "");
            layoutParams.width = buttonHot2.getWidth() + (this.f43024b * 2);
            View buttonHot3 = this.f43023a.getButtonHot();
            C89219l.m154716b(buttonHot3, "");
            layoutParams.height = buttonHot3.getHeight() + (this.f43025c * 2);
            View buttonHot4 = this.f43023a.getButtonHot();
            C89219l.m154716b(buttonHot4, "");
            buttonHot4.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: d */
    private final void m33618d() {
        TextView buttonUi;
        Object[] objArr;
        String str;
        String str2;
        AwemeSplashInfo.SkipInfo skipInfo = this.f43019p;
        if (skipInfo != null && skipInfo.isCountdown_enable() && this.f43017n != 0) {
            if (C80471gb.m139483a(getContext())) {
                buttonUi = getButtonUi();
                C89219l.m154716b(buttonUi, "");
                objArr = new Object[3];
                String str3 = this.f43016m;
                if (str3 == null) {
                    C89219l.m154710a("buttonText");
                }
                objArr[0] = str3;
                objArr[1] = Integer.valueOf(this.f43017n);
                str = skipInfo.getCountdownUnit();
                str2 = "%s %s%s";
            } else {
                buttonUi = getButtonUi();
                C89219l.m154716b(buttonUi, "");
                objArr = new Object[3];
                objArr[0] = Integer.valueOf(this.f43017n);
                objArr[1] = skipInfo.getCountdownUnit();
                str = this.f43016m;
                if (str == null) {
                    C89219l.m154710a("buttonText");
                }
                str2 = "%s%s %s";
            }
            objArr[2] = str;
            String a = C1764a.m5928a(str2, Arrays.copyOf(objArr, 3));
            C89219l.m154716b(a, "");
            buttonUi.setText(a);
        }
    }

    private final void setCountDownTime(int i) {
        int i2 = this.f43017n;
        if (i2 == 0) {
            this.f43017n = i;
        } else if (i < i2) {
            AbstractC18070b bVar = this.f43012h;
            if (bVar != null) {
                bVar.mo28782a(i);
            }
            this.f43017n = i;
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.AbstractC29664a
    /* renamed from: a */
    public final void mo28809a(Message message) {
        if (message != null && message.what == 1) {
            setCountDownTime(this.f43017n - 1);
            m33618d();
            if (this.f43017n == 0) {
                Timer timer = this.f43018o;
                if (timer != null) {
                    timer.cancel();
                }
                this.f43018o = null;
            }
        }
    }

    /* renamed from: a */
    private final void m33615a(AwemeSplashInfo.SkipInfo skipInfo) {
        getButtonHot().post(new RunnableC18074f(this, (int) C29661o.m59767a(getContext(), (float) skipInfo.getHeightExtraSize()), (int) C29661o.m59767a(getContext(), (float) skipInfo.getWidthExtraSize())));
    }

    /* renamed from: a */
    public final void mo28807a(long j) {
        setCountDownTime((int) (j / 1000));
        if (this.f43018o == null) {
            m33618d();
            Timer timer = new Timer();
            this.f43018o = timer;
            timer.scheduleAtFixedRate(new C18075g(this), (j % 1000) + 1000, 1000);
        }
    }

    /* renamed from: b */
    private final void m33616b(int i) {
        if (C80471gb.m139483a(getContext()) && i != 2 && i != 3) {
            C0550b bVar = new C0550b();
            bVar.mo2451a(this);
            TextView buttonUi = getButtonUi();
            C89219l.m154716b(buttonUi, "");
            bVar.mo2446a(buttonUi.getId(), 2);
            TextView buttonUi2 = getButtonUi();
            C89219l.m154716b(buttonUi2, "");
            bVar.mo2449a(buttonUi2.getId(), 1, 0, 1, 10);
            View buttonUnClick = getButtonUnClick();
            C89219l.m154716b(buttonUnClick, "");
            if (buttonUnClick.getVisibility() == 0) {
                View buttonUnClick2 = getButtonUnClick();
                C89219l.m154716b(buttonUnClick2, "");
                bVar.mo2446a(buttonUnClick2.getId(), 2);
                View buttonUnClick3 = getButtonUnClick();
                C89219l.m154716b(buttonUnClick3, "");
                bVar.mo2446a(buttonUnClick3.getId(), 1);
                View buttonUnClick4 = getButtonUnClick();
                C89219l.m154716b(buttonUnClick4, "");
                int id = buttonUnClick4.getId();
                TextView buttonUi3 = getButtonUi();
                C89219l.m154716b(buttonUi3, "");
                bVar.mo2448a(id, 2, buttonUi3.getId(), 2);
                View buttonUnClick5 = getButtonUnClick();
                C89219l.m154716b(buttonUnClick5, "");
                bVar.mo2448a(buttonUnClick5.getId(), 1, 0, 1);
            }
            bVar.mo2454b(this);
        }
    }

    /* renamed from: a */
    public final void mo28808a(Context context, AwemeSplashInfo.SkipInfo skipInfo) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(skipInfo, "");
        this.f43019p = skipInfo;
        String text = skipInfo.getText();
        if (!(text == null || text.length() == 0)) {
            String text2 = skipInfo.getText();
            C89219l.m154716b(text2, "");
            this.f43016m = text2;
        }
        TextView buttonUi = getButtonUi();
        C89219l.m154716b(buttonUi, "");
        String str = this.f43016m;
        if (str == null) {
            C89219l.m154710a("buttonText");
        }
        buttonUi.setText(str);
        int buttonExtraStyle = skipInfo.getButtonExtraStyle();
        if (buttonExtraStyle == 1 || buttonExtraStyle == 3) {
            m33617c();
            m33615a(skipInfo);
        }
        m33616b(buttonExtraStyle);
    }

    private /* synthetic */ TopViewSkipButton(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TopViewSkipButton(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f43013j = C89250i.m154774a(EnumC89331m.NONE, new C18072d(this));
        this.f43014k = C89250i.m154774a(EnumC89331m.NONE, new C18071c(this));
        this.f43015l = C89250i.m154774a(EnumC89331m.NONE, new C18073e(this));
        this.f43011g = new HandlerC29663q(this);
    }
}
