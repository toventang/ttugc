package com.bytedance.android.live.effect.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

public final class BeautyIconWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    private TextView f11863a;

    /* renamed from: b */
    private ImageView f11864b;

    /* renamed from: c */
    private View f11865c;

    /* renamed from: d */
    private int f11866d;

    /* renamed from: e */
    private int f11867e;

    /* renamed from: f */
    private boolean f11868f;

    /* renamed from: g */
    private final AbstractC89172b<View, C89391z> f11869g;

    /* renamed from: com.bytedance.android.live.effect.widget.BeautyIconWidget$a */
    final /* synthetic */ class View$OnClickListenerC4316a implements View.OnClickListener {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f11870a;

        static {
            Covode.recordClassIndex(4889);
        }

        View$OnClickListenerC4316a(AbstractC89172b bVar) {
            this.f11870a = bVar;
        }

        public final /* synthetic */ void onClick(View view) {
            C89219l.m154716b(this.f11870a.invoke(view), "");
        }
    }

    static {
        Covode.recordClassIndex(4888);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.b4l;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: a */
    public final void mo9997a() {
        View view = this.f11865c;
        if (view == null) {
            C89219l.m154710a("mBackground");
        }
        view.setBackgroundResource(R.drawable.bpl);
        TextView textView = this.f11863a;
        if (textView == null) {
            C89219l.m154710a("mIconName");
        }
        textView.setTextColor(C3966y.m9663b((int) R.color.uz));
    }

    /* renamed from: b */
    public final void mo9999b() {
        View view = this.f11865c;
        if (view == null) {
            C89219l.m154710a("mBackground");
        }
        view.setBackgroundResource(R.drawable.bpm);
        TextView textView = this.f11863a;
        if (textView == null) {
            C89219l.m154710a("mIconName");
        }
        textView.setTextColor(C3966y.m9663b((int) R.color.x9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.android.live.effect.widget.BeautyIconWidget$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.widget.BeautyIconWidget.onCreate():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super android.view.View, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public BeautyIconWidget(AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f11869g = bVar;
    }

    /* renamed from: a */
    public final void mo9998a(int i, int i2, boolean z) {
        this.f11866d = i;
        this.f11867e = i2;
        this.f11868f = z;
    }
}
