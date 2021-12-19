package com.bytedance.android.live.publicscreen.impl.widget.p402b;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5876j;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5888b;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.model.message.tracking.IdMessage;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.utils.C11214ag;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.a */
public final class C6056a extends AbstractC5888b<AbstractC5876j<? extends AbstractC6571a>> {

    /* renamed from: a */
    private final ImageView f15168a;

    /* renamed from: d */
    private final ImageView f15169d;

    /* renamed from: e */
    private final TextView f15170e;

    /* renamed from: f */
    private final View f15171f;

    /* renamed from: g */
    private final View.OnClickListener f15172g = new View.OnClickListener(this) {
        /* class com.bytedance.android.live.publicscreen.impl.widget.p402b.C6056a.View$OnClickListenerC60571 */

        /* renamed from: a */
        final /* synthetic */ C6056a f15173a;

        static {
            Covode.recordClassIndex(6674);
        }

        {
            this.f15173a = r1;
        }

        public final void onClick(View view) {
            C89219l.m154716b(view, "");
            if (view.getTag() instanceof AbstractC5876j) {
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.api.model.PublicScreenActionMessageModel<out com.bytedance.android.livesdk.message.model.BaseLiveMessage>");
                AbstractC5876j jVar = (AbstractC5876j) tag;
                view.getContext();
                jVar.mo11697w();
                MESSAGE message = jVar.f14737d;
                if (message != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("clickedMessage", C4139e.C4140a.f11575b.mo46674b(IdMessage.from(message)));
                    C6555i.m14021b().mo9217b("ttlive_action_message_clicked", hashMap);
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(6673);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6056a(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.bh1);
        C89219l.m154716b(findViewById, "");
        this.f15168a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.dka);
        C89219l.m154716b(findViewById2, "");
        this.f15169d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.acq);
        C89219l.m154716b(findViewById3, "");
        this.f15170e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cvi);
        C89219l.m154716b(findViewById4, "");
        this.f15171f = findViewById4;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a
    /* renamed from: a */
    public final /* synthetic */ void mo10370a(C5889g gVar, AbstractC5873h hVar) {
        AbstractC5876j jVar = (AbstractC5876j) hVar;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(jVar, "");
        if (jVar.mo11693s() != null) {
            C3951p.m9623a(this.f15168a, jVar.mo11693s(), this.f15168a.getWidth(), this.f15168a.getHeight());
        } else if (jVar.mo11694t() > 0) {
            this.f15168a.setImageResource(jVar.mo11694t());
        } else {
            this.f15168a.setBackgroundResource(2131234546);
        }
        if (jVar.mo11695u() != null) {
            this.f15169d.setBackground(null);
            C3951p.m9622a(this.f15169d, jVar.mo11695u(), 0);
        }
        if (!jVar.mo11696v()) {
            this.f15169d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(jVar.mo11710z())) {
            this.f15170e.setText(jVar.mo11710z());
        } else {
            this.f15170e.setText("");
        }
        ImageModel y = jVar.mo11699y();
        if (y != null) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            C11214ag.m19870a(y, view, C6229a.m13521a(C3966y.m9669e()), null);
        } else if (!TextUtils.isEmpty(jVar.mo11698x())) {
            try {
                Drawable background = this.f15171f.getBackground();
                if (background != null) {
                    ((GradientDrawable) background).setColor(Color.parseColor(jVar.mo11698x()));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (jVar.mo11696v()) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            view2.setTag(jVar);
            this.itemView.setOnClickListener(this.f15172g);
            return;
        }
        this.itemView.setOnClickListener(null);
    }
}
