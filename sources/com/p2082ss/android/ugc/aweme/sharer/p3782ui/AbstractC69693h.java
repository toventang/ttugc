package com.p2082ss.android.ugc.aweme.sharer.p3782ui;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sharer.ui.h */
public interface AbstractC69693h {
    static {
        Covode.recordClassIndex(82069);
    }

    /* renamed from: a */
    void mo61914a(Context context);

    /* renamed from: a */
    void mo61915a(Context context, SharePackage sharePackage);

    /* renamed from: a */
    void mo61916a(ImageView imageView);

    /* renamed from: a */
    void mo61917a(TextView textView);

    /* renamed from: b */
    int mo61918b();

    /* renamed from: c */
    String mo61919c();

    int co_();

    /* renamed from: d */
    boolean mo61921d();

    /* renamed from: e */
    boolean mo61922e();

    /* renamed from: f */
    boolean mo61923f();

    /* renamed from: g */
    int mo61924g();

    /* renamed from: com.ss.android.ugc.aweme.sharer.ui.h$a */
    public static final class C69694a {
        static {
            Covode.recordClassIndex(82070);
        }

        /* renamed from: a */
        public static void m123110a(AbstractC69693h hVar, TextView textView) {
            C89219l.m154721d(textView, "");
            textView.setText(textView.getResources().getString(hVar.mo61918b()));
        }
    }
}
