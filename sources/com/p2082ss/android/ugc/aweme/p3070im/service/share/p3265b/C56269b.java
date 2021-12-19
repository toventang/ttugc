package com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.share.b.b */
public final class C56269b extends C56270c {

    /* renamed from: a */
    public final ViewGroup f128352a;

    /* renamed from: b */
    public final ViewGroup f128353b;

    /* renamed from: c */
    public final FrameLayout f128354c;

    /* renamed from: d */
    public final boolean f128355d;

    /* renamed from: e */
    public final MeasureLinearLayout f128356e;

    /* renamed from: f */
    public final TextView f128357f;

    static {
        Covode.recordClassIndex(66083);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56269b(Activity activity, SharePackage sharePackage, ViewGroup viewGroup, ViewGroup viewGroup2, FrameLayout frameLayout, boolean z, MeasureLinearLayout measureLinearLayout, TextView textView) {
        super(activity, sharePackage);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(viewGroup2, "");
        C89219l.m154721d(frameLayout, "");
        C89219l.m154721d(measureLinearLayout, "");
        C89219l.m154721d(textView, "");
        this.f128352a = viewGroup;
        this.f128353b = viewGroup2;
        this.f128354c = frameLayout;
        this.f128355d = z;
        this.f128356e = measureLinearLayout;
        this.f128357f = textView;
    }
}
