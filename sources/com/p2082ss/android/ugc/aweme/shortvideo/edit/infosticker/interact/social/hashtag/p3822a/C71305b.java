package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.p3822a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40895j;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.b */
public final class C71305b extends RecyclerView.ViewHolder {

    /* renamed from: c */
    public static final C71307a f159807c = new C71307a((byte) 0);

    /* renamed from: a */
    TuxTextView f159808a;

    /* renamed from: b */
    public final AbstractC40895j f159809b;

    static {
        Covode.recordClassIndex(83826);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.a.b$a */
    public static final class C71307a {
        static {
            Covode.recordClassIndex(83828);
        }

        private C71307a() {
        }

        public /* synthetic */ C71307a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71305b(final View view, AbstractC40895j jVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(jVar, "");
        this.f159809b = jVar;
        this.f159808a = (TuxTextView) view.findViewById(R.id.exu);
        view.setOnClickListener(new AbstractView$OnClickListenerC81432d(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.social.hashtag.p3822a.C71305b.C713061 */

            /* renamed from: a */
            final /* synthetic */ C71305b f159810a;

            static {
                Covode.recordClassIndex(83827);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                AbstractC40895j jVar = this.f159810a.f159809b;
                if (jVar != null) {
                    jVar.mo70092a(view, this.f159810a.getAdapterPosition());
                }
            }

            {
                this.f159810a = r1;
            }
        });
    }
}
