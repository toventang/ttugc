package com.p2082ss.android.ugc.aweme.share.silent;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.frameworkui.PullUpLayout;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.silent.d */
public final class C69450d extends PopupWindow {

    /* renamed from: c */
    public static final C69451a f155150c = new C69451a((byte) 0);

    /* renamed from: a */
    public PullUpLayout f155151a;

    /* renamed from: b */
    public final Activity f155152b;

    /* renamed from: d */
    private final String f155153d;

    /* renamed from: e */
    private final UrlModel f155154e;

    static {
        Covode.recordClassIndex(81788);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.d$a */
    public static final class C69451a {
        static {
            Covode.recordClassIndex(81789);
        }

        private C69451a() {
        }

        public /* synthetic */ C69451a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.silent.d$b */
    public static final class RunnableC69452b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C69450d f155155a;

        static {
            Covode.recordClassIndex(81790);
        }

        public RunnableC69452b(C69450d dVar) {
            this.f155155a = dVar;
        }

        public final void run() {
            C69450d dVar = this.f155155a;
            if (dVar.isShowing()) {
                try {
                    if (!dVar.f155152b.isFinishing()) {
                        PullUpLayout pullUpLayout = dVar.f155151a;
                        if (pullUpLayout == null) {
                            C89219l.m154710a("pullUpLayout");
                        }
                        pullUpLayout.mo27262a(0.0f, true);
                        dVar.dismiss();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69450d(Activity activity, String str, UrlModel urlModel) {
        super(activity);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(urlModel, "");
        MethodCollector.m26663i(6495);
        this.f155152b = activity;
        this.f155153d = str;
        this.f155154e = urlModel;
        setContentView(LayoutInflater.from(activity).inflate(R.layout.ayz, (ViewGroup) null));
        setBackgroundDrawable(new ColorDrawable(0));
        setWidth(C13628n.m24504a(activity));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a16);
        TextView textView = (TextView) getContentView().findViewById(R.id.dxb);
        C89219l.m154716b(textView, "");
        textView.setText(activity.getResources().getString(R.string.fpk, str));
        C34577e.m70592a((RemoteImageView) getContentView().findViewById(R.id.dxd), urlModel);
        View findViewById = getContentView().findViewById(R.id.dat);
        C89219l.m154716b(findViewById, "");
        PullUpLayout pullUpLayout = (PullUpLayout) findViewById;
        this.f155151a = pullUpLayout;
        if (pullUpLayout == null) {
            C89219l.m154710a("pullUpLayout");
        }
        pullUpLayout.mo27263a(getContentView().findViewById(R.id.aot));
        MethodCollector.m26664o(6495);
    }
}
