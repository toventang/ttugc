package com.bytedance.android.live.broadcast.p188b;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.C3274q;
import com.bytedance.android.live.broadcast.p197f.C3229a;
import com.bytedance.android.live.broadcast.p197f.C3233d;
import com.bytedance.android.live.broadcast.p197f.C3234e;
import com.bytedance.android.live.broadcast.utils.C3719d;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.livesdk.AbstractC11293v;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.b.f */
public final class View$OnClickListenerC3087f extends AbstractC11293v implements View.OnClickListener {

    /* renamed from: a */
    public Context f8959a;

    /* renamed from: b */
    public RelativeLayout f8960b;

    /* renamed from: c */
    public TextView f8961c;

    /* renamed from: d */
    public TextView f8962d;

    /* renamed from: e */
    public LinearLayout f8963e;

    /* renamed from: f */
    public LoadingStatusView f8964f;

    /* renamed from: g */
    public List<C3274q> f8965g;

    /* renamed from: h */
    private View f8966h;

    /* renamed from: i */
    private LiveLoadingView f8967i;

    /* renamed from: j */
    private TextView f8968j;

    /* renamed from: k */
    private TextView f8969k;

    /* renamed from: l */
    private TextView f8970l;

    /* renamed from: m */
    private C3229a f8971m;

    static {
        Covode.recordClassIndex(3567);
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v
    /* renamed from: b */
    public final AbstractC11293v.C11295b mo8355b() {
        AbstractC11293v.C11295b bVar = new AbstractC11293v.C11295b(R.layout.b66);
        bVar.f27014a = 0;
        bVar.f27020g = 80;
        bVar.f27022i = -2;
        bVar.mo18055a(new ColorDrawable(0));
        return bVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, com.bytedance.android.livesdk.AbstractC11293v
    public final void onDismiss(DialogInterface dialogInterface) {
        C3229a aVar = this.f8971m;
        if (!(aVar == null || aVar.f9275d == 1)) {
            aVar.f9276e = true;
        }
        super.onDismiss(dialogInterface);
    }

    public final void onClick(View view) {
        int i;
        C3274q qVar;
        if (view instanceof HSImageView) {
            if (view.getTag() != null) {
                i = ((Integer) view.getTag()).intValue();
            } else {
                i = -1;
            }
            List<C3274q> list = this.f8965g;
            if (list != null && !list.isEmpty() && i >= 0 && i < this.f8965g.size() && (qVar = this.f8965g.get(i)) != null && !TextUtils.isEmpty(qVar.f9386a)) {
                ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13248a(getContext(), AbstractC6963e.m14872b(qVar.f9386a));
                if (qVar.f9386a.contains("health_score")) {
                    C6501b.C6502a.m13948a("livesdk_know_health_score_page_show").mo12639a().mo12651a("enter_from", "shield").mo12655b();
                }
            }
        }
    }

    /* renamed from: a */
    public static View$OnClickListenerC3087f m8424a(Context context, C3229a aVar) {
        View$OnClickListenerC3087f fVar = new View$OnClickListenerC3087f();
        fVar.f8959a = context;
        fVar.f8971m = aVar;
        return fVar;
    }

    /* renamed from: a */
    public final void mo8365a(boolean z, CharSequence charSequence) {
        if (z) {
            this.f8970l.setVisibility(0);
            this.f8970l.setText(charSequence);
            return;
        }
        this.f8970l.setVisibility(8);
    }

    /* renamed from: a */
    private static Spannable m8423a(String str, int i) {
        SpannableString spannableString = new SpannableString(str);
        AbsoluteSizeSpan absoluteSizeSpan = new AbsoluteSizeSpan((int) C3966y.m9661b(25.0f));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C3966y.m9663b((int) R.color.k2));
        spannableString.setSpan(absoluteSizeSpan, 4, i, 18);
        spannableString.setSpan(foregroundColorSpan, 4, i, 18);
        return spannableString;
    }

    @Override // com.bytedance.android.livesdk.AbstractC11293v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View view2 = getView();
        this.f8966h = view2;
        this.f8960b = (RelativeLayout) view2.findViewById(R.id.ade);
        this.f8961c = (TextView) this.f8966h.findViewById(R.id.bem);
        this.f8962d = (TextView) this.f8966h.findViewById(R.id.bej);
        this.f8967i = (LiveLoadingView) this.f8966h.findViewById(R.id.bei);
        this.f8968j = (TextView) this.f8966h.findViewById(R.id.fi1);
        this.f8969k = (TextView) this.f8966h.findViewById(R.id.fi2);
        this.f8970l = (TextView) this.f8966h.findViewById(R.id.a33);
        this.f8963e = (LinearLayout) this.f8966h.findViewById(R.id.ut);
        LoadingStatusView loadingStatusView = (LoadingStatusView) this.f8966h.findViewById(R.id.cf_);
        this.f8964f = loadingStatusView;
        loadingStatusView.setBuilder(LoadingStatusView.C6234a.m13528a(getContext()).mo12209a(getResources().getDimensionPixelSize(R.dimen.va)));
        this.f8964f.setVisibility(0);
        this.f8964f.setStatus(0);
        this.f8964f.setVisibility(0);
        this.f8964f.setStatus(0);
        C3229a aVar = this.f8971m;
        if (aVar != null) {
            aVar.f9274c.removeMessages(2);
            aVar.f9275d = 3;
            C3719d.C3720a.m9229a().mo9038a().getReviewInfo(aVar.f9273b).mo143271a(new C11191f()).mo143254a(new C3233d(aVar), new C3234e(aVar));
        }
    }

    /* renamed from: a */
    public final void mo8364a(boolean z, int i, int i2) {
        if (z) {
            this.f8968j.setVisibility(0);
            this.f8968j.setText(m8423a(C3966y.m9660a((int) R.string.gr9, Integer.valueOf(i)), String.valueOf(i).length() + 4));
            this.f8969k.setVisibility(0);
            this.f8969k.setText(m8423a(C3966y.m9660a((int) R.string.gr_, Integer.valueOf(i2)), String.valueOf(i2).length() + 4));
            return;
        }
        this.f8968j.setVisibility(4);
        this.f8969k.setVisibility(4);
    }
}
