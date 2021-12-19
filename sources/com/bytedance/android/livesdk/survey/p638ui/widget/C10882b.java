package com.bytedance.android.livesdk.survey.p638ui.widget;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.livesdk.survey.p636a.C10789b;
import com.bytedance.android.livesdk.survey.p636a.C10790c;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.survey.ui.widget.b */
public final class C10882b {

    /* renamed from: a */
    public static final C10882b f26133a = new C10882b();

    private C10882b() {
    }

    static {
        Covode.recordClassIndex(12487);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.survey.ui.widget.b$a */
    public static final class View$OnClickListenerC10883a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C10789b f26134a;

        /* renamed from: b */
        final /* synthetic */ LayoutInflater f26135b;

        /* renamed from: c */
        final /* synthetic */ int f26136c;

        /* renamed from: d */
        final /* synthetic */ int f26137d;

        /* renamed from: e */
        final /* synthetic */ float f26138e;

        /* renamed from: f */
        final /* synthetic */ AbstractC89183m f26139f;

        /* renamed from: g */
        final /* synthetic */ C10790c f26140g;

        /* renamed from: h */
        final /* synthetic */ LinearLayoutCompat f26141h;

        static {
            Covode.recordClassIndex(12488);
        }

        View$OnClickListenerC10883a(C10789b bVar, LayoutInflater layoutInflater, int i, int i2, float f, AbstractC89183m mVar, C10790c cVar, LinearLayoutCompat linearLayoutCompat) {
            this.f26134a = bVar;
            this.f26135b = layoutInflater;
            this.f26136c = i;
            this.f26137d = i2;
            this.f26138e = f;
            this.f26139f = mVar;
            this.f26140g = cVar;
            this.f26141h = linearLayoutCompat;
        }

        public final void onClick(View view) {
            AbstractC89183m mVar = this.f26139f;
            String str = this.f26140g.f25983a;
            C89219l.m154716b(str, "");
            mVar.invoke(str, Long.valueOf(this.f26134a.f25981a));
        }
    }

    /* renamed from: a */
    public static void m19488a(LinearLayoutCompat linearLayoutCompat, C10790c cVar, int i, int i2, float f, AbstractC89183m<? super String, ? super Long, C89391z> mVar) {
        int a;
        C89219l.m154721d(linearLayoutCompat, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(mVar, "");
        linearLayoutCompat.removeAllViews();
        LayoutInflater from = LayoutInflater.from(linearLayoutCompat.getContext());
        List<C10789b> list = cVar.f25986d;
        C89219l.m154716b(list, "");
        boolean z = false;
        int i3 = 0;
        for (T t : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            View a2 = C1764a.m5927a(from, i, null, z);
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.bytedance.android.live.design.widget.LiveButton");
            LiveButton liveButton = (LiveButton) a2;
            if (i2 == 0) {
                a = -2;
            } else {
                a = C3966y.m9653a((float) i2);
            }
            LinearLayoutCompat.C0352a aVar = new LinearLayoutCompat.C0352a(-1, a);
            if (i3 != 0) {
                aVar.topMargin = C3966y.m9653a(f);
            }
            liveButton.setOnClickListener(new View$OnClickListenerC10883a(t2, from, i, i2, f, mVar, cVar, linearLayoutCompat));
            liveButton.setText(t2.f25982b);
            linearLayoutCompat.addView(liveButton, aVar);
            i3 = i4;
            z = false;
        }
    }
}
