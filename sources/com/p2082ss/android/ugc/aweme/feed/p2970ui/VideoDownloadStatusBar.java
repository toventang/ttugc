package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.p1097d.C15401f;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p084a.p088b.C1862a;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53453b;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.ShareService;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar */
public final class VideoDownloadStatusBar extends RelativeLayout {

    /* renamed from: h */
    public static final ArrayList<AbstractC50021c> f115447h = new ArrayList<>();

    /* renamed from: i */
    public static final Handler f115448i = new HandlerC50020b(Looper.getMainLooper());

    /* renamed from: j */
    public static int f115449j;

    /* renamed from: k */
    public static final C50019a f115450k = new C50019a((byte) 0);

    /* renamed from: a */
    public RelativeLayout f115451a;

    /* renamed from: b */
    public ImageView f115452b;

    /* renamed from: c */
    public TextView f115453c;

    /* renamed from: d */
    public TextView f115454d;

    /* renamed from: e */
    public TextView f115455e;

    /* renamed from: f */
    public TextView f115456f;

    /* renamed from: g */
    public TextView f115457g;

    /* renamed from: l */
    private AbstractC50021c f115458l;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$c */
    public interface AbstractC50021c {
        static {
            Covode.recordClassIndex(59145);
        }

        /* renamed from: aM */
        void mo84705aM();

        /* renamed from: aN */
        void mo84706aN();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$d */
    static final class View$OnClickListenerC50022d implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC50022d f115459a = new View$OnClickListenerC50022d();

        static {
            Covode.recordClassIndex(59146);
        }

        View$OnClickListenerC50022d() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$a */
    public static final class C50019a {
        static {
            Covode.recordClassIndex(59143);
        }

        private C50019a() {
        }

        /* renamed from: a */
        public static void m93915a() {
            Iterator<T> it = VideoDownloadStatusBar.f115447h.iterator();
            while (it.hasNext()) {
                it.next().mo84706aN();
            }
        }

        public /* synthetic */ C50019a(byte b) {
            this();
        }
    }

    public final AbstractC50021c getVideoDownloadClickListener() {
        return this.f115458l;
    }

    public final TextView getMDownloadFailedTextView() {
        TextView textView = this.f115456f;
        if (textView == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        return textView;
    }

    public final RelativeLayout getMDownloadProgressViewRoot() {
        RelativeLayout relativeLayout = this.f115451a;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        return relativeLayout;
    }

    /* renamed from: d */
    public static void m93909d() {
        Handler handler = f115448i;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
        }
        if (handler.hasMessages(2)) {
            handler.removeMessages(2);
        }
    }

    /* renamed from: e */
    private static boolean m93910e() {
        C89219l.m154716b(C53453b.C53456a.f122693a, "");
        return C89219l.m154714a((Object) C15401f.f37600a, (Object) C53453b.m98647a(C53438a.m98619a((String) null, (String) null, C17867d.m33078a())));
    }

    static {
        Covode.recordClassIndex(59142);
    }

    /* renamed from: a */
    public final void mo85117a() {
        if (m93910e()) {
            TextView textView = this.f115454d;
            if (textView == null) {
                C89219l.m154710a("mDownloadProgressView");
            }
            textView.setText("%0");
            return;
        }
        TextView textView2 = this.f115454d;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadProgressView");
        }
        textView2.setText("0%");
    }

    /* renamed from: b */
    public final void mo85119b() {
        TextView textView = this.f115454d;
        if (textView == null) {
            C89219l.m154710a("mDownloadProgressView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f115455e;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadingStatusTextView");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f115457g;
        if (textView3 == null) {
            C89219l.m154710a("mDownloadVideoCancelView");
        }
        textView3.setVisibility(8);
        TextView textView4 = this.f115456f;
        if (textView4 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView4.setVisibility(8);
        RelativeLayout relativeLayout = this.f115451a;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(C0643b.m2378c(getContext(), R.color.bn));
        RelativeLayout relativeLayout2 = this.f115451a;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        ImageView imageView = this.f115452b;
        if (imageView == null) {
            C89219l.m154710a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(0);
        TextView textView5 = this.f115453c;
        if (textView5 == null) {
            C89219l.m154710a("mDownloadSuccessTextView");
        }
        textView5.setVisibility(0);
        RelativeLayout relativeLayout3 = this.f115451a;
        if (relativeLayout3 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout3.requestLayout();
        mo85117a();
        m93907a(1, 3000);
    }

    /* renamed from: c */
    public final void mo85120c() {
        TextView textView = this.f115454d;
        if (textView == null) {
            C89219l.m154710a("mDownloadProgressView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f115455e;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadingStatusTextView");
        }
        textView2.setVisibility(8);
        ImageView imageView = this.f115452b;
        if (imageView == null) {
            C89219l.m154710a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(8);
        TextView textView3 = this.f115453c;
        if (textView3 == null) {
            C89219l.m154710a("mDownloadSuccessTextView");
        }
        textView3.setVisibility(8);
        RelativeLayout relativeLayout = this.f115451a;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        RelativeLayout relativeLayout2 = this.f115451a;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        TextView textView4 = this.f115456f;
        if (textView4 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView4.setWidth(C13628n.m24504a(getContext()) - ((int) C13628n.m24520b(getContext(), 77.0f)));
        TextView textView5 = this.f115456f;
        if (textView5 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView5.setVisibility(0);
        TextView textView6 = this.f115457g;
        if (textView6 == null) {
            C89219l.m154710a("mDownloadVideoCancelView");
        }
        textView6.setVisibility(0);
        TextView textView7 = this.f115456f;
        if (textView7 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView7.requestLayout();
        RelativeLayout relativeLayout3 = this.f115451a;
        if (relativeLayout3 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout3.requestLayout();
        mo85117a();
        m93907a(2, 20000);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$b */
    public static final class HandlerC50020b extends Handler {
        static {
            Covode.recordClassIndex(59144);
        }

        HandlerC50020b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            C50019a.m93915a();
        }
    }

    public final void setVideoDownloadClickListener(AbstractC50021c cVar) {
        this.f115458l = cVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$e */
    public static final class C50023e extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ VideoDownloadStatusBar f115460a;

        static {
            Covode.recordClassIndex(59147);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C50023e(VideoDownloadStatusBar videoDownloadStatusBar) {
            this.f115460a = videoDownloadStatusBar;
        }

        public final void onClick(View view) {
            AbstractC50021c videoDownloadClickListener;
            C89219l.m154721d(view, "");
            if (this.f115460a.getMDownloadFailedTextView().getVisibility() == 0 && (videoDownloadClickListener = this.f115460a.getVideoDownloadClickListener()) != null) {
                videoDownloadClickListener.mo84705aM();
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f115460a.getContext(), R.color.l));
            textPaint.setUnderlineText(true);
        }
    }

    public final void setMDownloadFailedTextView(TextView textView) {
        C89219l.m154721d(textView, "");
        this.f115456f = textView;
    }

    public final void setMDownloadProgressViewRoot(RelativeLayout relativeLayout) {
        C89219l.m154721d(relativeLayout, "");
        this.f115451a = relativeLayout;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public VideoDownloadStatusBar(Context context) {
        this(context, null);
        C89219l.m154721d(context, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.VideoDownloadStatusBar$f */
    static final class View$OnClickListenerC50024f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VideoDownloadStatusBar f115461a;

        static {
            Covode.recordClassIndex(59148);
        }

        View$OnClickListenerC50024f(VideoDownloadStatusBar videoDownloadStatusBar) {
            this.f115461a = videoDownloadStatusBar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f115461a.getMDownloadProgressViewRoot().setVisibility(8);
            C50019a.m93915a();
            AbstractC50021c videoDownloadClickListener = this.f115461a.getVideoDownloadClickListener();
            if (videoDownloadClickListener != null) {
                videoDownloadClickListener.mo84706aN();
            }
            ShareService shareService = C68863ah.f154027a;
            Context context = this.f115461a.getContext();
            C89219l.m154716b(context, "");
            shareService.mo109406a(context);
            VideoDownloadStatusBar.m93909d();
        }
    }

    /* renamed from: a */
    public final void mo85118a(int i) {
        ImageView imageView = this.f115452b;
        if (imageView == null) {
            C89219l.m154710a("mDownloadSuccessImageView");
        }
        imageView.setVisibility(8);
        TextView textView = this.f115453c;
        if (textView == null) {
            C89219l.m154710a("mDownloadSuccessTextView");
        }
        textView.setVisibility(8);
        TextView textView2 = this.f115456f;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView2.setVisibility(8);
        RelativeLayout relativeLayout = this.f115451a;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout.setBackgroundColor(Color.parseColor("#383838"));
        RelativeLayout relativeLayout2 = this.f115451a;
        if (relativeLayout2 == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout2.setVisibility(0);
        TextView textView3 = this.f115454d;
        if (textView3 == null) {
            C89219l.m154710a("mDownloadProgressView");
        }
        textView3.setVisibility(0);
        TextView textView4 = this.f115455e;
        if (textView4 == null) {
            C89219l.m154710a("mDownloadingStatusTextView");
        }
        textView4.setVisibility(0);
        TextView textView5 = this.f115457g;
        if (textView5 == null) {
            C89219l.m154710a("mDownloadVideoCancelView");
        }
        textView5.setVisibility(0);
        if (m93910e()) {
            TextView textView6 = this.f115454d;
            if (textView6 == null) {
                C89219l.m154710a("mDownloadProgressView");
            }
            textView6.setText("%".concat(String.valueOf(i)));
        } else {
            TextView textView7 = this.f115454d;
            if (textView7 == null) {
                C89219l.m154710a("mDownloadProgressView");
            }
            textView7.setText(new StringBuilder().append(i).append('%').toString());
        }
        f115449j = i;
    }

    /* renamed from: a */
    public static void m93907a(int i, long j) {
        Handler handler = f115448i;
        if (!handler.hasMessages(i)) {
            handler.sendEmptyMessageDelayed(i, j);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VideoDownloadStatusBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5745);
        C1862a.m6032a(getContext(), R.layout.sj, this, true);
        View findViewById = findViewById(R.id.dnf);
        C89219l.m154716b(findViewById, "");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById;
        this.f115451a = relativeLayout;
        if (relativeLayout == null) {
            C89219l.m154710a("mDownloadProgressViewRoot");
        }
        relativeLayout.setOnClickListener(View$OnClickListenerC50022d.f115459a);
        View findViewById2 = findViewById(R.id.aob);
        C89219l.m154716b(findViewById2, "");
        this.f115452b = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.aoc);
        C89219l.m154716b(findViewById3, "");
        this.f115453c = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.ao9);
        C89219l.m154716b(findViewById4, "");
        this.f115454d = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.aoh);
        C89219l.m154716b(findViewById5, "");
        this.f115455e = (TextView) findViewById5;
        View findViewById6 = findViewById(R.id.ao4);
        C89219l.m154716b(findViewById6, "");
        this.f115456f = (TextView) findViewById6;
        String string = getContext().getString(R.string.buh);
        C89219l.m154716b(string, "");
        String str = getContext().getString(R.string.buf) + ' ';
        SpannableString spannableString = new SpannableString(string + str);
        spannableString.setSpan(new C50023e(this), C89361p.m154888a((CharSequence) spannableString, str, 0, false, 6), (C89361p.m154888a((CharSequence) spannableString, str, 0, false, 6) + str.length()) - 1, 17);
        TextView textView = this.f115456f;
        if (textView == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.f115456f;
        if (textView2 == null) {
            C89219l.m154710a("mDownloadFailedTextView");
        }
        textView2.setText(spannableString);
        View findViewById7 = findViewById(R.id.ao3);
        C89219l.m154716b(findViewById7, "");
        TextView textView3 = (TextView) findViewById7;
        this.f115457g = textView3;
        if (textView3 == null) {
            C89219l.m154710a("mDownloadVideoCancelView");
        }
        textView3.setOnClickListener(new View$OnClickListenerC50024f(this));
        mo85117a();
        MethodCollector.m26664o(5745);
    }
}
