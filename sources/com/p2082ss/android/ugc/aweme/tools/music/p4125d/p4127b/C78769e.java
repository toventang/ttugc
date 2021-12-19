package com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.p3562a.AbstractC63153f;
import com.p2082ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.e */
public final class C78769e extends RecyclerView.ViewHolder {

    /* renamed from: h */
    public static final C78773a f177026h = new C78773a((byte) 0);

    /* renamed from: a */
    public AVDmtImageTextView f177027a;

    /* renamed from: b */
    public TextView f177028b;

    /* renamed from: c */
    public TextView f177029c;

    /* renamed from: d */
    public TextView f177030d;

    /* renamed from: e */
    public ImageView f177031e;

    /* renamed from: f */
    public ImageView f177032f;

    /* renamed from: g */
    public final AbstractC63153f f177033g;

    static {
        Covode.recordClassIndex(91912);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.d.b.e$a */
    public static final class C78773a {
        static {
            Covode.recordClassIndex(91916);
        }

        private C78773a() {
        }

        public /* synthetic */ C78773a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78769e(final View view, AbstractC63153f fVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(fVar, "");
        this.f177033g = fVar;
        this.f177027a = (AVDmtImageTextView) view.findViewById(R.id.br2);
        this.f177028b = (TextView) view.findViewById(R.id.ezr);
        this.f177029c = (TextView) view.findViewById(R.id.title);
        this.f177030d = (TextView) view.findViewById(R.id.esj);
        this.f177032f = (ImageView) view.findViewById(R.id.a7p);
        this.f177031e = (ImageView) view.findViewById(R.id.ah9);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b.C78769e.View$OnClickListenerC787701 */

            /* renamed from: a */
            final /* synthetic */ C78769e f177034a;

            static {
                Covode.recordClassIndex(91913);
            }

            {
                this.f177034a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f177034a.f177033g.mo101525a(view, this.f177034a.getAdapterPosition());
            }
        });
        ImageView imageView = this.f177031e;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b.C78769e.View$OnClickListenerC787712 */

                /* renamed from: a */
                final /* synthetic */ C78769e f177036a;

                static {
                    Covode.recordClassIndex(91914);
                }

                {
                    this.f177036a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f177036a.f177033g.mo101528b(view, this.f177036a.getAdapterPosition());
                }
            });
        }
        ImageView imageView2 = this.f177032f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.music.p4125d.p4127b.C78769e.View$OnClickListenerC787723 */

                /* renamed from: a */
                final /* synthetic */ C78769e f177038a;

                static {
                    Covode.recordClassIndex(91915);
                }

                {
                    this.f177038a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f177038a.f177033g.mo101529c(view, this.f177038a.getAdapterPosition());
                }
            });
        }
    }
}
