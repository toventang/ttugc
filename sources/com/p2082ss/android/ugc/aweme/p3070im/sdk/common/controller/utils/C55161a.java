package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p037h.C0726a;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMContact;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a */
public final class C55161a {

    /* renamed from: a */
    public static final C55161a f126212a = new C55161a();

    private C55161a() {
    }

    static {
        Covode.recordClassIndex(64906);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a$a */
    public static final class C55162a extends C0726a {

        /* renamed from: b */
        final /* synthetic */ String f126213b;

        static {
            Covode.recordClassIndex(64907);
        }

        C55162a(String str) {
            this.f126213b = str;
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(dVar, "");
            super.mo2808a(view, dVar);
            if (!TextUtils.isEmpty(this.f126213b)) {
                view.setContentDescription(this.f126213b);
            }
            dVar.mo2834a((CharSequence) TextView.class.getName());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.a$b */
    public static final class C55163b extends C0726a {

        /* renamed from: b */
        final /* synthetic */ IMContact f126214b;

        static {
            Covode.recordClassIndex(64908);
        }

        C55163b(IMContact iMContact) {
            this.f126214b = iMContact;
        }

        @Override // androidx.core.p037h.C0726a
        /* renamed from: a */
        public final void mo2808a(View view, C0733d dVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(dVar, "");
            super.mo2808a(view, dVar);
            view.setContentDescription(this.f126214b.getDisplayName());
            dVar.mo2834a((CharSequence) TextView.class.getName());
        }
    }

    /* renamed from: a */
    public static final void m100871a(View view, String str) {
        if (view != null && str != null) {
            C0792v.m2747a(view, new C55162a(str));
        }
    }

    /* renamed from: a */
    public static final void m100872a(ImageView imageView, IMContact iMContact) {
        if (imageView != null && iMContact != null) {
            C0792v.m2747a(imageView, new C55163b(iMContact));
        }
    }
}
