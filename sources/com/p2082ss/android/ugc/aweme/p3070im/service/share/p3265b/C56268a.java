package com.p2082ss.android.ugc.aweme.p3070im.service.share.p3265b;

import android.app.Activity;
import android.app.Dialog;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56253f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69683d;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.share.b.a */
public final class C56268a extends C56270c {

    /* renamed from: a */
    public final Dialog f128343a;

    /* renamed from: b */
    public final ViewGroup f128344b = null;

    /* renamed from: c */
    public final FrameLayout f128345c;

    /* renamed from: d */
    public final RecyclerView f128346d;

    /* renamed from: e */
    public final LinearLayout f128347e;

    /* renamed from: f */
    public final TextView f128348f;

    /* renamed from: g */
    public final AbstractC69683d f128349g;

    /* renamed from: h */
    public final List<C56253f> f128350h;

    /* renamed from: i */
    public final NestedScrollView.AbstractC0813b f128351i;

    static {
        Covode.recordClassIndex(66082);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56268a(Activity activity, Dialog dialog, SharePackage sharePackage, FrameLayout frameLayout, RecyclerView recyclerView, LinearLayout linearLayout, TextView textView, AbstractC69683d dVar, List<C56253f> list, NestedScrollView.AbstractC0813b bVar) {
        super(activity, sharePackage);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(sharePackage, "");
        C89219l.m154721d(list, "");
        this.f128343a = dialog;
        this.f128345c = frameLayout;
        this.f128346d = recyclerView;
        this.f128347e = linearLayout;
        this.f128348f = textView;
        this.f128349g = dVar;
        this.f128350h = list;
        this.f128351i = bVar;
    }
}
