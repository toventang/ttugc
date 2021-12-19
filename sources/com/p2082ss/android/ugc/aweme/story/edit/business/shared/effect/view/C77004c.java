package com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effect.EffectModel;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.StickerImageView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageView;
import com.p2082ss.android.ugc.aweme.views.CircleDraweeView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.c */
public final class C77004c extends RecyclerView.ViewHolder {

    /* renamed from: b */
    public static final int f172766b = C71812ep.m126783a(16.0d, C63247i.f143610a);

    /* renamed from: c */
    public static final C77006a f172767c = new C77006a((byte) 0);

    /* renamed from: a */
    public final AbstractC89172b<Integer, C89391z> f172768a;

    /* renamed from: d */
    private final AbstractC89244h f172769d;

    /* renamed from: e */
    private final AbstractC89244h f172770e;

    /* renamed from: f */
    private ObjectAnimator f172771f;

    /* renamed from: g */
    private int f172772g = 1;

    /* renamed from: a */
    private final AVDmtImageTextView m134625a() {
        return (AVDmtImageTextView) this.f172769d.getValue();
    }

    /* renamed from: b */
    private final AVDmtImageView m134628b() {
        return (AVDmtImageView) this.f172770e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.c$a */
    public static final class C77006a {
        static {
            Covode.recordClassIndex(90005);
        }

        private C77006a() {
        }

        public /* synthetic */ C77006a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.c$b */
    static final class C77007b extends AbstractC89220m implements AbstractC89171a<AVDmtImageView> {

        /* renamed from: a */
        final /* synthetic */ View f172774a;

        static {
            Covode.recordClassIndex(90006);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77007b(View view) {
            super(0);
            this.f172774a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AVDmtImageView invoke() {
            return this.f172774a.findViewById(R.id.bv8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.effect.view.c$c */
    static final class C77008c extends AbstractC89220m implements AbstractC89171a<AVDmtImageTextView> {

        /* renamed from: a */
        final /* synthetic */ View f172775a;

        static {
            Covode.recordClassIndex(90007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77008c(View view) {
            super(0);
            this.f172775a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AVDmtImageTextView invoke() {
            return this.f172775a.findViewById(R.id.at0);
        }
    }

    static {
        Covode.recordClassIndex(90003);
    }

    /* renamed from: d */
    private final void m134630d() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.f172771f;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f172771f) == null)) {
            objectAnimator.cancel();
        }
        m134628b().setRotation(0.0f);
        m134628b().setImageResource(2131230945);
    }

    /* renamed from: c */
    private final void m134629c() {
        m134628b().setVisibility(0);
        m134628b().setImageResource(2131230947);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m134628b(), "rotation", 0.0f, 360.0f);
        this.f172771f = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(800L);
        }
        ObjectAnimator objectAnimator = this.f172771f;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(1);
        }
        ObjectAnimator objectAnimator2 = this.f172771f;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator3 = this.f172771f;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }

    /* renamed from: a */
    public final void mo120548a(boolean z) {
        m134625a().mo121340a(z);
    }

    /* renamed from: a */
    private void m134626a(int i) {
        if (this.f172772g != i) {
            this.f172772g = i;
            if (i == 2) {
                m134630d();
                m134628b().setVisibility(0);
            } else if (i == 4) {
                m134628b().setVisibility(8);
            } else if (i == 8) {
                m134629c();
            } else if (i == 16) {
                m134630d();
                m134628b().setVisibility(8);
            } else if (i == 32) {
                m134628b().setVisibility(0);
                m134630d();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: h.f.a.b<? super java.lang.Integer, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77004c(View view, AbstractC89172b<? super Integer, C89391z> bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f172768a = bVar;
        this.f172769d = C89250i.m154773a((AbstractC89171a) new C77008c(view));
        this.f172770e = C89250i.m154773a((AbstractC89171a) new C77007b(view));
        m134625a().setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.story.edit.business.shared.effect.view.C77004c.View$OnClickListenerC770051 */

            /* renamed from: a */
            final /* synthetic */ C77004c f172773a;

            static {
                Covode.recordClassIndex(90004);
            }

            {
                this.f172773a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                int adapterPosition = this.f172773a.getAdapterPosition();
                if (adapterPosition != -1) {
                    this.f172773a.f172768a.invoke(Integer.valueOf(adapterPosition));
                }
            }
        });
        StickerImageView stickerImageView = m134625a().f174453a;
        if (stickerImageView == null) {
            C89219l.m154710a("imageView");
        }
        if (!stickerImageView.f163437e) {
            CircleDraweeView circleDraweeView = stickerImageView.f163433a;
            if (circleDraweeView == null) {
                C89219l.m154710a("iconImageView");
            }
            circleDraweeView.f181796d = true;
        }
        AVDmtImageTextView a = m134625a();
        int i = CircleDraweeView.f181793a;
        float a2 = (float) C71812ep.m126783a(10.0d, C63247i.f143610a);
        StickerImageView stickerImageView2 = a.f174453a;
        if (stickerImageView2 == null) {
            C89219l.m154710a("imageView");
        }
        if (!stickerImageView2.f163437e) {
            CircleDraweeView circleDraweeView2 = stickerImageView2.f163433a;
            if (circleDraweeView2 == null) {
                C89219l.m154710a("iconImageView");
            }
            circleDraweeView2.setClipStyle(i);
            if (i == CircleDraweeView.f181793a) {
                CircleDraweeView circleDraweeView3 = stickerImageView2.f163433a;
                if (circleDraweeView3 == null) {
                    C89219l.m154710a("iconImageView");
                }
                circleDraweeView3.setRectFRadius(a2);
            }
        }
    }

    /* renamed from: a */
    private final void m134627a(EffectModel effectModel, int i) {
        String str;
        String str2;
        if (i == 0) {
            str = "tag_none";
        } else if (effectModel != null) {
            str = effectModel.iconUrl;
        } else {
            str = null;
        }
        if (!C89219l.m154714a((Object) str, m134625a().getTag())) {
            String str3 = "";
            if (i == 0) {
                AVDmtImageTextView a = m134625a();
                View view = this.itemView;
                C89219l.m154716b(view, str3);
                Context context = view.getContext();
                C89219l.m154716b(context, str3);
                a.mo121337a(context.getResources().getDrawable(2131232504), f172766b);
            } else {
                AVDmtImageTextView a2 = m134625a();
                if (!(effectModel == null || (str2 = effectModel.iconUrl) == null)) {
                    str3 = str2;
                }
                a2.mo121339a(str3, Bitmap.Config.RGB_565);
            }
            m134625a().setTag(str);
        }
    }

    /* renamed from: a */
    public final void mo120547a(int i, EffectModel effectModel, int i2, int i3) {
        boolean z = false;
        if (i == 0) {
            AVDmtImageTextView a = m134625a();
            View view = this.itemView;
            C89219l.m154716b(view, "");
            a.setText(view.getResources().getString(R.string.dgz));
            m134628b().setVisibility(8);
        } else if (effectModel != null) {
            m134625a().setImageViewPadding(0);
            m134625a().setText(effectModel.name);
        }
        m134627a(effectModel, i);
        m134626a(i2);
        if (i == i3) {
            z = true;
        }
        mo120548a(z);
    }
}
