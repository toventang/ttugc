package com.p2082ss.android.ugc.aweme.tools.draft.ftc.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.pages.C78271b;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78326c;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78332d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar */
public final class VideoDownloadStatusBar extends RelativeLayout {

    /* renamed from: i */
    public static final ArrayList<AbstractC78367c> f176080i = new ArrayList<>();

    /* renamed from: j */
    public static final Handler f176081j = new HandlerC78366b(Looper.getMainLooper());

    /* renamed from: k */
    public static int f176082k;

    /* renamed from: l */
    public static final C78365a f176083l = new C78365a((byte) 0);

    /* renamed from: a */
    public RelativeLayout f176084a;

    /* renamed from: b */
    public ImageView f176085b;

    /* renamed from: c */
    public TextView f176086c;

    /* renamed from: d */
    public TextView f176087d;

    /* renamed from: e */
    public TextView f176088e;

    /* renamed from: f */
    public TextView f176089f;

    /* renamed from: g */
    public TextView f176090g;

    /* renamed from: h */
    public final C78332d f176091h = new C78332d();

    /* renamed from: m */
    private AbstractC78367c f176092m;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$c */
    public interface AbstractC78367c {
        static {
            Covode.recordClassIndex(91491);
        }

        /* renamed from: c */
        void mo122194c();

        /* renamed from: d */
        void mo122195d();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$d */
    static final class View$OnClickListenerC78368d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC78368d f176093a = new View$OnClickListenerC78368d();

        static {
            Covode.recordClassIndex(91492);
        }

        View$OnClickListenerC78368d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$a */
    public static final class C78365a {
        static {
            Covode.recordClassIndex(91489);
        }

        private C78365a() {
        }

        /* renamed from: a */
        public static void m136865a() {
            Iterator<T> it = VideoDownloadStatusBar.f176080i.iterator();
            while (it.hasNext()) {
                it.next().mo122195d();
            }
        }

        public /* synthetic */ C78365a(byte b) {
            this();
        }
    }

    public final AbstractC78367c getVideoDownloadClickListener() {
        return this.f176092m;
    }

    /* renamed from: e */
    private static boolean m136860e() {
        return TextUtils.equals(C15401f.f37600a, C63244g.m114602a().mo73270P());
    }

    public final TextView getMDownloadFailedTextView() {
        TextView textView = this.f176089f;
        if (textView == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        return textView;
    }

    public final RelativeLayout getMDownloadProgressViewRoot() {
        RelativeLayout relativeLayout = this.f176084a;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        return relativeLayout;
    }

    /* renamed from: d */
    public static void m136859d() {
        Handler handler = f176081j;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        if (handler.hasMessages(2)) {
            handler.removeMessages(2);
        }
    }

    static {
        Covode.recordClassIndex(91488);
    }

    /* renamed from: a */
    public final void mo122303a() {
        if (m136860e()) {
            TextView textView = this.f176087d;
            if (textView == null) {
                C89219l.m154710a("mDownloadProgressView");
            }
            textView.setText("%0");
            return;
        }
        TextView textView2 = this.f176087d;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadProgressView");
        }
        textView2.setText("0%");
    }

    /* renamed from: b */
    public final void mo122305b() {
        TextView textView = this.f176087d;
        if (textView == null) {
            C89219l.m154710a("mDownloadProgressView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f176088e;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadingStatusTextView");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f176090g;
        if (textView3 == null) {
            C89219l.m154710a("mDownloadVideoCancelView");
        }
        textView3.setVisibility(8);
        TextView textView4 = this.f176089f;
        if (textView4 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView4.setVisibility(8);
        RelativeLayout relativeLayout = this.f176084a;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(getResources().getColor(R.color.bn));
        RelativeLayout relativeLayout2 = this.f176084a;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        ImageView imageView = this.f176085b;
        if (imageView == null) {
            C89219l.m154710a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(0);
        TextView textView5 = this.f176086c;
        if (textView5 == null) {
            C89219l.m154710a("mDownloadSuccessTextView");
        }
        textView5.setVisibility(0);
        RelativeLayout relativeLayout3 = this.f176084a;
        if (relativeLayout3 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout3.requestLayout();
        mo122303a();
        m136858a(1, 1000);
    }

    /* renamed from: c */
    public final void mo122306c() {
        TextView textView = this.f176087d;
        if (textView == null) {
            C89219l.m154710a("mDownloadProgressView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f176088e;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadingStatusTextView");
        }
        textView2.setVisibility(8);
        ImageView imageView = this.f176085b;
        if (imageView == null) {
            C89219l.m154710a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(8);
        TextView textView3 = this.f176086c;
        if (textView3 == null) {
            C89219l.m154710a("mDownloadSuccessTextView");
        }
        textView3.setVisibility(8);
        RelativeLayout relativeLayout = this.f176084a;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        RelativeLayout relativeLayout2 = this.f176084a;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        TextView textView4 = this.f176089f;
        if (textView4 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView4.setWidth(C13628n.m24504a(getContext()) - ((int) C13628n.m24520b(getContext(), 77.0f)));
        TextView textView5 = this.f176089f;
        if (textView5 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView5.setVisibility(0);
        TextView textView6 = this.f176090g;
        if (textView6 == null) {
            C89219l.m154710a("mDownloadVideoCancelView");
        }
        textView6.setVisibility(0);
        TextView textView7 = this.f176089f;
        if (textView7 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView7.requestLayout();
        RelativeLayout relativeLayout3 = this.f176084a;
        if (relativeLayout3 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout3.requestLayout();
        mo122303a();
        m136858a(2, 3000);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$b */
    public static final class HandlerC78366b extends Handler {
        static {
            Covode.recordClassIndex(91490);
        }

        HandlerC78366b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            C78365a.m136865a();
        }
    }

    public final void setVideoDownloadClickListener(AbstractC78367c cVar) {
        this.f176092m = cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$e */
    public static final class C78369e extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ VideoDownloadStatusBar f176094a;

        static {
            Covode.recordClassIndex(91493);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78369e(VideoDownloadStatusBar videoDownloadStatusBar) {
            this.f176094a = videoDownloadStatusBar;
        }

        public final void onClick(View view) {
            AbstractC78367c videoDownloadClickListener;
            C89219l.m154721d(view, "");
            if (this.f176094a.getMDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = this.f176094a.getVideoDownloadClickListener()) != null) {
                videoDownloadClickListener.mo122194c();
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f176094a.getContext(), R.color.l));
            textPaint.setUnderlineText(true);
        }
    }

    public final void setMDownloadFailedTextView(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f176089f = textView;
    }

    public final void setMDownloadProgressViewRoot(RelativeLayout relativeLayout) {
        C89219l.m154721d(relativeLayout, "");
        this.f176084a = relativeLayout;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.view.VideoDownloadStatusBar$f */
    static final class View$OnClickListenerC78370f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoDownloadStatusBar f176095a;

        static {
            Covode.recordClassIndex(91494);
        }

        View$OnClickListenerC78370f(VideoDownloadStatusBar videoDownloadStatusBar) {
            this.f176095a = videoDownloadStatusBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f176095a.getMDownloadProgressViewRoot().setVisibility(8);
            C78326c.f175914c = false;
            C78332d.m136801a(C78271b.m136757a(3, null, 0));
            C78365a.m136865a();
            AbstractC78367c videoDownloadClickListener = this.f176095a.getVideoDownloadClickListener();
            if (videoDownloadClickListener != null) {
                videoDownloadClickListener.mo122195d();
            }
            VideoDownloadStatusBar.m136859d();
        }
    }

    /* renamed from: a */
    public final void mo122304a(int i) {
        ImageView imageView = this.f176085b;
        if (imageView == null) {
            C89219l.m154710a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(8);
        TextView textView = this.f176086c;
        if (textView == null) {
            C89219l.m154710a("mDownloadSuccessTextView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f176089f;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView2.setVisibility(8);
        RelativeLayout relativeLayout = this.f176084a;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        RelativeLayout relativeLayout2 = this.f176084a;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        TextView textView3 = this.f176087d;
        if (textView3 == null) {
            C89219l.m154710a("mDownloadProgressView");
        }
        textView3.setVisibility(0);
        TextView textView4 = this.f176088e;
        if (textView4 == null) {
            C89219l.m154710a("mDownloadingStatusTextView");
        }
        textView4.setVisibility(0);
        TextView textView5 = this.f176090g;
        if (textView5 == null) {
            C89219l.m154710a("mDownloadVideoCancelView");
        }
        textView5.setVisibility(0);
        if (m136860e()) {
            TextView textView6 = this.f176087d;
            if (textView6 == null) {
                C89219l.m154710a("mDownloadProgressView");
            }
            textView6.setText("%".concat(String.valueOf(i)));
        } else {
            TextView textView7 = this.f176087d;
            if (textView7 == null) {
                C89219l.m154710a("mDownloadProgressView");
            }
            textView7.setText(new StringBuilder().append(i).append('%').toString());
        }
        f176082k = i;
    }

    /* renamed from: a */
    private static void m136858a(int i, long j) {
        Handler handler = f176081j;
        if (!handler.hasMessages(i)) {
            handler.sendEmptyMessageDelayed(i, j);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoDownloadStatusBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7782);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.b3_, this, true);
        View findViewById = findViewById(R.id.dnf);
        C89219l.m154716b(findViewById, "");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        this.f176084a = relativeLayout;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout.setOnClickListener(View$OnClickListenerC78368d.f176093a);
        View findViewById2 = findViewById(R.id.aob);
        C89219l.m154716b(findViewById2, "");
        this.f176085b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.aoc);
        C89219l.m154716b(findViewById3, "");
        this.f176086c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.ao9);
        C89219l.m154716b(findViewById4, "");
        this.f176087d = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.aoh);
        C89219l.m154716b(findViewById5, "");
        this.f176088e = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.ao4);
        C89219l.m154716b(findViewById6, "");
        this.f176089f = (TextView) findViewById6;
        String string = getContext().getString(R.string.buh);
        C89219l.m154716b(string, "");
        String str = getContext().getString(R.string.buf) + ' ';
        SpannableString spannableString = new SpannableString(string + str);
        spannableString.setSpan(new C78369e(this), C89361p.m154888a((CharSequence) spannableString, str, 0, false, 6), (C89361p.m154888a((CharSequence) spannableString, str, 0, false, 6) + str.length()) - 1, 17);
        TextView textView = this.f176089f;
        if (textView == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.f176089f;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView2.setText(spannableString);
        View findViewById7 = findViewById(R.id.ao3);
        C89219l.m154716b(findViewById7, "");
        TextView textView3 = (TextView) findViewById7;
        this.f176090g = textView3;
        if (textView3 == null) {
            C89219l.m154710a("mDownloadVideoCancelView");
        }
        textView3.setOnClickListener(new View$OnClickListenerC78370f(this));
        mo122303a();
        MethodCollector.m26664o(7782);
    }
}
