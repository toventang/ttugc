package com.bytedance.android.live.publicscreen.impl.widget.p402b;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.p035f.C0680f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.publicscreen.impl.model.AbstractC6017f;
import com.bytedance.android.live.publicscreen.impl.model.chat.AbstractC5988a;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5996b;
import com.bytedance.android.live.publicscreen.impl.model.chat.badge.BadgeView;
import com.bytedance.android.live.publicscreen.impl.p400f.C5967b;
import com.bytedance.android.live.publicscreen.impl.view.DrawableVerifiableTextView;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5873h;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5888b;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7885cz;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p430ab.p432b.AbstractC6571a;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.widget.C11424f;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.b */
public final class C6058b extends AbstractC5888b<AbstractC5988a<? extends AbstractC6571a>> {

    /* renamed from: a */
    private final TextView f15174a;

    /* renamed from: d */
    private final DrawableVerifiableTextView f15175d;

    /* renamed from: e */
    private final BadgeView f15176e;

    /* renamed from: f */
    private final HSImageView f15177f;

    /* renamed from: g */
    private final SpannableStringBuilder f15178g = new SpannableStringBuilder();

    /* renamed from: h */
    private Drawable f15179h;

    /* renamed from: i */
    private Drawable f15180i;

    /* renamed from: j */
    private ImageSpan f15181j;

    /* renamed from: k */
    private ImageSpan f15182k;

    static {
        Covode.recordClassIndex(6675);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a
    /* renamed from: a */
    public final void mo11738a() {
        super.mo11738a();
        Drawable drawable = this.f15179h;
        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.Animatable");
        ((Animatable) drawable).stop();
    }

    /* renamed from: b */
    public final void mo11936b() {
        User b;
        AbstractC5988a aVar = (AbstractC5988a) this.f14743c;
        if (aVar != null && (b = aVar.mo10375b()) != null) {
            C6779a a = C6779a.m14563a();
            UserProfileEvent userProfileEvent = new UserProfileEvent(b.getId(), "head");
            userProfileEvent.mSource = "live_comment";
            a.mo13053a(userProfileEvent);
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.b$d */
    static final class View$OnClickListenerC6062d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6058b f15186a;

        static {
            Covode.recordClassIndex(6679);
        }

        View$OnClickListenerC6062d(C6058b bVar) {
            this.f15186a = bVar;
        }

        public final void onClick(View view) {
            this.f15186a.mo11936b();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.b$a */
    static final class View$OnLongClickListenerC6059a implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C6058b f15183a;

        static {
            Covode.recordClassIndex(6676);
        }

        View$OnLongClickListenerC6059a(C6058b bVar) {
            this.f15183a = bVar;
        }

        public final boolean onLongClick(View view) {
            C5889g gVar = this.f15183a.f14742b;
            if (gVar == null) {
                return true;
            }
            gVar.mo11743a((AbstractC5877k) this.f15183a.f14743c);
            return true;
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.b$b */
    static final class View$OnClickListenerC6060b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6058b f15184a;

        static {
            Covode.recordClassIndex(6677);
        }

        View$OnClickListenerC6060b(C6058b bVar) {
            this.f15184a = bVar;
        }

        public final void onClick(View view) {
            MESSAGE message;
            this.f15184a.mo11936b();
            AbstractC5877k kVar = (AbstractC5877k) this.f15184a.f14743c;
            if (kVar != null) {
                message = kVar.f14737d;
            } else {
                message = null;
            }
            C5967b.m13083a(message);
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.b$c */
    static final class View$OnLongClickListenerC6061c implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ C6058b f15185a;

        static {
            Covode.recordClassIndex(6678);
        }

        View$OnLongClickListenerC6061c(C6058b bVar) {
            this.f15185a = bVar;
        }

        public final boolean onLongClick(View view) {
            C5889g gVar = this.f15185a.f14742b;
            if (gVar == null) {
                return true;
            }
            gVar.mo11743a((AbstractC5877k) this.f15185a.f14743c);
            return true;
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.widget.b.b$e */
    public static final class C6063e extends AbstractC7885cz {

        /* renamed from: a */
        final /* synthetic */ SpannableStringBuilder f15187a;

        /* renamed from: b */
        final /* synthetic */ C6058b f15188b;

        /* renamed from: c */
        final /* synthetic */ AbstractC5988a f15189c;

        /* renamed from: d */
        final /* synthetic */ C5889g f15190d;

        static {
            Covode.recordClassIndex(6680);
        }

        @Override // com.bytedance.android.livesdk.chatroom.p499ui.AbstractC7885cz
        /* renamed from: a */
        public final void mo11881a(View view) {
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
        }

        public final void onClick(View view) {
            String str;
            C89219l.m154721d(view, "");
            ((AbstractC6017f) this.f15189c).mo11875a(false);
            this.f15190d.mo11742a((AbstractC5873h) this.f15189c);
            C6501b a = C6501b.C6502a.m13948a("livesdk_undo_translate_comment").mo12643a(this.f15190d.f14755l);
            if (this.f15190d.f14752i) {
                str = "anchor";
            } else {
                str = "user";
            }
            a.mo12651a("user_type", str).mo12651a("click_icon", "revert_icon").mo12646a("to_user_id", this.f15189c.mo11704E()).mo12655b();
        }

        C6063e(SpannableStringBuilder spannableStringBuilder, C6058b bVar, AbstractC5988a aVar, C5889g gVar) {
            this.f15187a = spannableStringBuilder;
            this.f15188b = bVar;
            this.f15189c = aVar;
            this.f15190d = gVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6058b(View view) {
        super(view);
        Drawable drawable;
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cpj);
        C89219l.m154716b(findViewById, "");
        TextView textView = (TextView) findViewById;
        this.f15174a = textView;
        View findViewById2 = view.findViewById(R.id.acq);
        C89219l.m154716b(findViewById2, "");
        DrawableVerifiableTextView drawableVerifiableTextView = (DrawableVerifiableTextView) findViewById2;
        this.f15175d = drawableVerifiableTextView;
        this.f15176e = (BadgeView) view.findViewById(R.id.q_);
        View findViewById3 = view.findViewById(R.id.cj_);
        C89219l.m154716b(findViewById3, "");
        HSImageView hSImageView = (HSImageView) findViewById3;
        this.f15177f = hSImageView;
        ((C24246a) hSImageView.getHierarchy()).mo39961b(0);
        hSImageView.setOnClickListener(new View$OnClickListenerC6062d(this));
        textView.setOnLongClickListener(new View$OnLongClickListenerC6059a(this));
        textView.setOnClickListener(new View$OnClickListenerC6060b(this));
        if (C6069e.f15199b == null) {
            C6069e.f15199b = new C6069e();
        }
        drawableVerifiableTextView.setMovementMethod(C6069e.f15199b);
        drawableVerifiableTextView.setOnLongClickListener(new View$OnLongClickListenerC6061c(this));
        Drawable b = C0196a.m619b(view.getContext(), R.drawable.bo6);
        C11424f fVar = null;
        if (b != null) {
            b.setBounds(0, 0, C3966y.m9653a(14.0f), C3966y.m9653a(10.0f));
            b.setCallback(drawableVerifiableTextView);
            drawable = b;
        } else {
            drawable = null;
        }
        this.f15179h = drawable;
        drawableVerifiableTextView.setVerifiedDrawable(drawable);
        this.f15181j = new C11424f(this.f15179h);
        Drawable b2 = C0196a.m619b(view.getContext(), 2131234731);
        this.f15180i = b2;
        if (b2 != null) {
            b2.setBounds(0, 0, C3966y.m9653a(16.0f), C3966y.m9653a(16.0f));
        }
        Drawable drawable2 = this.f15180i;
        this.f15182k = drawable2 != null ? new C11424f(drawable2) : fVar;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p392f.AbstractC5887a
    /* renamed from: a */
    public final /* synthetic */ void mo10370a(C5889g gVar, AbstractC5873h hVar) {
        AbstractC5988a aVar = (AbstractC5988a) hVar;
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(aVar, "");
        List<AbstractC5996b> list = aVar.f15034f;
        if (list.isEmpty()) {
            BadgeView badgeView = this.f15176e;
            C89219l.m154716b(badgeView, "");
            badgeView.setVisibility(8);
        } else {
            this.f15176e.setBadges(list);
            BadgeView badgeView2 = this.f15176e;
            C89219l.m154716b(badgeView2, "");
            badgeView2.setVisibility(0);
        }
        gVar.mo11741a(this.f15174a);
        gVar.mo11741a(this.f15175d);
        this.f15174a.setText(aVar.mo11871v());
        this.f15178g.clear();
        Animatable animatable = null;
        if (aVar instanceof AbstractC6017f) {
            SpannableStringBuilder spannableStringBuilder = this.f15178g;
            CharSequence z = aVar.mo11710z();
            if (z != null) {
                AbstractC6017f fVar = (AbstractC6017f) aVar;
                if (fVar.mo11877c()) {
                    m13288a(this.f15178g, z, this.f15181j);
                    Drawable drawable = this.f15179h;
                    if (drawable instanceof Animatable) {
                        animatable = drawable;
                    }
                    Animatable animatable2 = (Animatable) animatable;
                    if (animatable2 != null) {
                        animatable2.start();
                    }
                } else {
                    Drawable drawable2 = this.f15179h;
                    if (drawable2 instanceof Animatable) {
                        animatable = drawable2;
                    }
                    Animatable animatable3 = (Animatable) animatable;
                    if (animatable3 != null) {
                        animatable3.stop();
                    }
                    if (fVar.mo11878s()) {
                        if (!TextUtils.isEmpty(fVar.mo11879t()) && (z = fVar.mo11879t()) == null) {
                            z = "";
                        }
                        int a = m13288a(this.f15178g, z, this.f15182k);
                        spannableStringBuilder.setSpan(new C6063e(spannableStringBuilder, this, aVar, gVar), a, a + 1, 33);
                    } else {
                        spannableStringBuilder.append(z);
                    }
                }
            }
        } else {
            Drawable drawable3 = this.f15179h;
            if (drawable3 instanceof Animatable) {
                animatable = drawable3;
            }
            Animatable animatable4 = animatable;
            if (animatable4 != null) {
                animatable4.stop();
            }
            this.f15178g.append(aVar.mo11710z());
        }
        this.f15175d.setText(this.f15178g);
        ImageModel J = aVar.mo11709J();
        if (J != null) {
            C3941k.m9601a(this.f15177f, J);
        } else {
            this.f15177f.setImageResource(aVar.mo10712h_());
        }
    }

    /* renamed from: a */
    private final int m13288a(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, ImageSpan imageSpan) {
        int length;
        View view = this.itemView;
        C89219l.m154716b(view, "");
        int i = 1;
        if (C6229a.m13521a(view.getContext())) {
            if (C0680f.f2738d.mo2717a(charSequence, charSequence.length())) {
                spannableStringBuilder.append(charSequence).append("  ‌");
                length = charSequence.length();
            } else {
                spannableStringBuilder.append("  ‌").append(charSequence);
                spannableStringBuilder.setSpan(imageSpan, i, i + 1, 33);
                return i;
            }
        } else if (C0680f.f2737c.mo2717a(charSequence, charSequence.length())) {
            spannableStringBuilder.append("  ‌").append(charSequence);
            spannableStringBuilder.setSpan(imageSpan, i, i + 1, 33);
            return i;
        } else {
            spannableStringBuilder.append(charSequence).append("  ‌");
            length = charSequence.length();
        }
        i = 1 + length;
        spannableStringBuilder.setSpan(imageSpan, i, i + 1, 33);
        return i;
    }
}
