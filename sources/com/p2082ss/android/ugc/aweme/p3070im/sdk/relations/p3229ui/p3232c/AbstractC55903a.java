package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.sharer.p3779a.C69576b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.c.a */
public abstract class AbstractC55903a<ITEM> extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public AbstractC89187q<? super Integer, ? super Integer, ? super View, C89391z> f127451a;

    /* renamed from: b */
    public final View f127452b;

    /* renamed from: c */
    public final AvatarImageView f127453c;

    /* renamed from: d */
    public final TuxIconView f127454d = ((TuxIconView) this.itemView.findViewById(R.id.fbe));

    /* renamed from: e */
    public final TextView f127455e = ((TextView) this.itemView.findViewById(R.id.cpq));

    /* renamed from: f */
    public final TextView f127456f = ((TextView) this.itemView.findViewById(R.id.akb));

    /* renamed from: g */
    public final TextView f127457g = ((TextView) this.itemView.findViewById(R.id.bmr));

    /* renamed from: h */
    public final TuxCheckBox f127458h;

    /* renamed from: i */
    public boolean f127459i;

    /* renamed from: j */
    private final int f127460j;

    /* renamed from: k */
    private final int f127461k;

    static {
        Covode.recordClassIndex(65694);
    }

    /* renamed from: a */
    public abstract void mo92761a(ITEM item, ITEM item2, int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo92763b() {
        float f;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        if (this.f127459i) {
            f = 0.34f;
        } else {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    /* renamed from: a */
    public final void mo92760a() {
        TuxCheckBox tuxCheckBox = this.f127458h;
        if (tuxCheckBox != null) {
            ViewGroup.LayoutParams layoutParams = tuxCheckBox.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = Build.VERSION.SDK_INT;
            marginLayoutParams.setMarginStart(this.f127460j);
            marginLayoutParams.leftMargin = this.f127460j;
            this.f127458h.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public final void mo92762a(boolean z) {
        this.f127459i = z;
        mo92763b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC55903a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = this.itemView.findViewById(R.id.acq);
        this.f127452b = findViewById;
        AvatarImageView avatarImageView = (AvatarImageView) this.itemView.findViewById(R.id.on);
        this.f127453c = avatarImageView;
        TuxCheckBox tuxCheckBox = (TuxCheckBox) this.itemView.findViewById(R.id.a4l);
        this.f127458h = tuxCheckBox;
        View view2 = this.itemView;
        C89219l.m154716b(view2, "");
        this.f127460j = (int) C13628n.m24520b(view2.getContext(), 16.0f);
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        this.f127461k = (int) C13628n.m24520b(view3.getContext(), -24.0f);
        if (findViewById != null) {
            View view4 = this.itemView;
            C89219l.m154716b(view4, "");
            findViewById.setBackground(C17177c.m31711c(view4.getContext()));
            findViewById.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.AbstractC55903a.View$OnClickListenerC559041 */

                /* renamed from: a */
                final /* synthetic */ AbstractC55903a f127462a;

                static {
                    Covode.recordClassIndex(65695);
                }

                {
                    this.f127462a = r1;
                }

                public final void onClick(View view) {
                    AbstractC89187q<? super Integer, ? super Integer, ? super View, C89391z> qVar;
                    ClickAgent.onClick(view);
                    if (!C69576b.m122788a(view, 500) && (qVar = this.f127462a.f127451a) != null) {
                        Integer valueOf = Integer.valueOf(this.f127462a.getAdapterPosition());
                        C89219l.m154716b(view, "");
                        qVar.invoke(2, valueOf, view);
                    }
                }
            });
        }
        if (avatarImageView != null) {
            avatarImageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.AbstractC55903a.View$OnClickListenerC559052 */

                /* renamed from: a */
                final /* synthetic */ AbstractC55903a f127463a;

                static {
                    Covode.recordClassIndex(65696);
                }

                {
                    this.f127463a = r1;
                }

                public final void onClick(View view) {
                    AbstractC89187q<? super Integer, ? super Integer, ? super View, C89391z> qVar;
                    ClickAgent.onClick(view);
                    if (!C69576b.m122788a(view, 500) && (qVar = this.f127463a.f127451a) != null) {
                        Integer valueOf = Integer.valueOf(this.f127463a.getAdapterPosition());
                        C89219l.m154716b(view, "");
                        qVar.invoke(1, valueOf, view);
                    }
                }
            });
        }
        if (tuxCheckBox != null) {
            tuxCheckBox.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3232c.AbstractC55903a.View$OnClickListenerC559063 */

                /* renamed from: a */
                final /* synthetic */ AbstractC55903a f127464a;

                static {
                    Covode.recordClassIndex(65697);
                }

                {
                    this.f127464a = r1;
                }

                public final void onClick(View view) {
                    AbstractC89187q<? super Integer, ? super Integer, ? super View, C89391z> qVar;
                    ClickAgent.onClick(view);
                    if (!C69576b.m122788a(view, 500) && (qVar = this.f127464a.f127451a) != null) {
                        Integer valueOf = Integer.valueOf(this.f127464a.getAdapterPosition());
                        C89219l.m154716b(view, "");
                        qVar.invoke(0, valueOf, view);
                    }
                }
            });
        }
    }
}
