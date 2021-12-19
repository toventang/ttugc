package com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.p2456a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AnimatedImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a.b */
public final class C35566b extends RecyclerView.ViewHolder {

    /* renamed from: d */
    public static final C35568a f83881d = new C35568a((byte) 0);

    /* renamed from: a */
    final AnimatedImageView f83882a;

    /* renamed from: b */
    public Aweme f83883b;

    /* renamed from: c */
    public final AbstractC35569b f83884c;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a.b$b */
    public interface AbstractC35569b {
        static {
            Covode.recordClassIndex(42793);
        }

        /* renamed from: a */
        void mo62579a(Aweme aweme);
    }

    static {
        Covode.recordClassIndex(42790);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.a.a.b$a */
    public static final class C35568a {
        static {
            Covode.recordClassIndex(42792);
        }

        private C35568a() {
        }

        public /* synthetic */ C35568a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35566b(View view, AbstractC35569b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        this.f83884c = bVar;
        View findViewById = view.findViewById(R.id.e2n);
        C89219l.m154716b(findViewById, "");
        AnimatedImageView animatedImageView = (AnimatedImageView) findViewById;
        this.f83882a = animatedImageView;
        animatedImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.challenge.p2454ui.p2455a.p2456a.C35566b.View$OnClickListenerC355671 */

            /* renamed from: a */
            final /* synthetic */ C35566b f83885a;

            static {
                Covode.recordClassIndex(42791);
            }

            {
                this.f83885a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f83885a.f83883b != null && !C58001a.m104815a(view, 1200)) {
                    AbstractC35569b bVar = this.f83885a.f83884c;
                    Aweme aweme = this.f83885a.f83883b;
                    if (aweme == null) {
                        C89219l.m154715b();
                    }
                    this.f83885a.getAdapterPosition();
                    bVar.mo62579a(aweme);
                }
            }
        });
    }
}
