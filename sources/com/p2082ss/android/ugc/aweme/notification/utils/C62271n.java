package com.p2082ss.android.ugc.aweme.notification.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.NoticeView;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.pushGuideInfo;
import com.p2082ss.android.ugc.aweme.p2482cn.C36145b;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.n */
public final class C62271n {

    /* renamed from: a */
    public static Bundle f141326a;

    /* renamed from: b */
    public static int f141327b;

    /* renamed from: c */
    public static int f141328c;

    /* renamed from: d */
    static WeakReference<NoticeView> f141329d;

    /* renamed from: e */
    public static boolean f141330e;

    /* renamed from: f */
    public static final C62271n f141331f = new C62271n();

    /* renamed from: g */
    private static int f141332g;

    /* renamed from: h */
    private static int f141333h;

    /* renamed from: a */
    public static String m112655a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "comments" : "mentions" : "likes" : "followers";
    }

    private C62271n() {
    }

    static {
        Covode.recordClassIndex(73045);
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            pushGuideInfo pushGuideInfo = iESSettingsProxy.getPushGuideInfo();
            C89219l.m154716b(pushGuideInfo, "");
            Integer closeCountLimit = pushGuideInfo.getCloseCountLimit();
            if (closeCountLimit == null) {
                C89219l.m154715b();
            }
            f141327b = closeCountLimit.intValue();
            IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy2, "");
            pushGuideInfo pushGuideInfo2 = iESSettingsProxy2.getPushGuideInfo();
            C89219l.m154716b(pushGuideInfo2, "");
            Integer showupInterval = pushGuideInfo2.getShowupInterval();
            if (showupInterval == null) {
                C89219l.m154715b();
            }
            f141328c = showupInterval.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            f141327b = 3;
            f141328c = 15;
        }
    }

    /* renamed from: a */
    public static long m112653a(Context context) {
        return C36145b.m73641b().mo63273e(context, "key_times_push_notification_guide");
    }

    /* renamed from: a */
    public static void m112657a(NoticeView noticeView) {
        C89219l.m154721d(noticeView, "");
        f141329d = new WeakReference<>(noticeView);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.n$a */
    public static final class DialogInterface$OnClickListenerC62272a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f141334a;

        /* renamed from: b */
        final /* synthetic */ Context f141335b;

        static {
            Covode.recordClassIndex(73046);
        }

        public DialogInterface$OnClickListenerC62272a(int i, Context context) {
            this.f141334a = i;
            this.f141335b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            try {
                C80428fg.m139435c(this.f141335b);
            } catch (Exception unused) {
                Context context = this.f141335b;
                Intent intent = new Intent("android.settings.SETTINGS");
                C84349a.m145093a(intent, context);
                context.startActivity(intent);
            }
            C39162r.m79460a("push_pre_permission_auth", new C33744d().mo59983a("scene_id", "1001").mo59983a("trigger_method", C62271n.m112655a(this.f141334a)).f79943a);
        }
    }

    /* renamed from: a */
    public static void m112656a(Bundle bundle, int i) {
        if (bundle == null) {
            f141326a = null;
        }
        if (f141330e && i <= f141332g + f141333h && !C62274o.m112660a(C17867d.m33078a())) {
            f141326a = bundle;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.utils.n$b */
    public static final class DialogInterface$OnClickListenerC62273b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f141336a;

        /* renamed from: b */
        final /* synthetic */ Context f141337b;

        static {
            Covode.recordClassIndex(73047);
        }

        public DialogInterface$OnClickListenerC62273b(int i, Context context) {
            this.f141336a = i;
            this.f141337b = context;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            NoticeView noticeView;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            C36145b.m73641b().mo63263a(this.f141337b, "key_cross_push_notification_guide", System.currentTimeMillis());
            C36145b.m73641b().mo63263a(this.f141337b, "key_times_push_notification_guide", C62271n.m112653a(this.f141337b) + 1);
            WeakReference<NoticeView> weakReference = C62271n.f141329d;
            if (!(weakReference == null || (noticeView = weakReference.get()) == null || noticeView.getVisibility() != 0)) {
                noticeView.setVisibility(8);
            }
            C39162r.m79460a("push_pre_permission_deny", new C33744d().mo59983a("scene_id", "1001").mo59983a("trigger_method", C62271n.m112655a(this.f141336a)).f79943a);
        }
    }

    /* renamed from: a */
    public static View m112654a(Context context, Bundle bundle) {
        View inflate;
        MethodCollector.m26663i(3438);
        if (C80471gb.m139483a(context)) {
            inflate = LayoutInflater.from(context).inflate(R.layout.lg, (ViewGroup) null);
        } else {
            inflate = LayoutInflater.from(context).inflate(R.layout.lf, (ViewGroup) null);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) C13628n.m24520b(context, 162.0f));
        C89219l.m154716b(inflate, "");
        inflate.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.f1s);
        TextView textView2 = (TextView) inflate.findViewById(R.id.f1r);
        RemoteImageView remoteImageView = (RemoteImageView) inflate.findViewById(R.id.bym);
        C89219l.m154716b(textView, "");
        textView.setText(bundle.getString("username"));
        C89219l.m154716b(textView2, "");
        textView2.setText(bundle.getString("content"));
        try {
            Serializable serializable = bundle.getSerializable("avatar_thumb");
            if (serializable != null) {
                C34577e.m70592a(remoteImageView, (UrlModel) serializable);
                MethodCollector.m26664o(3438);
                return inflate;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
            MethodCollector.m26664o(3438);
            throw nullPointerException;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m112658a(boolean z, int i, int i2) {
        f141330e = z;
        f141332g = i;
        f141333h = i2;
    }
}
