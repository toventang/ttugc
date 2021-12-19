package com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3631a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.ss.android.ugc.aweme.q.a.a.c */
public final class C65737c extends AbstractC65728a<String, C65739b> {

    /* renamed from: d */
    public AbstractC65738a f148125d;

    /* renamed from: com.ss.android.ugc.aweme.q.a.a.c$a */
    public interface AbstractC65738a {
        static {
            Covode.recordClassIndex(77237);
        }

        /* renamed from: a */
        void mo59528a(String str);
    }

    static {
        Covode.recordClassIndex(77236);
    }

    public C65737c(AbstractC34884bl blVar) {
        super(blVar);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ RecyclerView.ViewHolder mo10368a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.a9a, viewGroup, false);
        C89219l.m154716b(a, "");
        return new C65739b(this, a);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.a.c$b */
    public final class C65739b extends AbstractC65728a<String, C65739b>.C65729a {

        /* renamed from: b */
        public final TextView f148126b;

        /* renamed from: c */
        public final ImageView f148127c;

        /* renamed from: d */
        final /* synthetic */ C65737c f148128d;

        static {
            Covode.recordClassIndex(77238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65739b(C65737c cVar, View view) {
            super(cVar, view);
            C89219l.m154721d(view, "");
            this.f148128d = cVar;
            this.f148126b = (TextView) view.findViewById(R.id.bf_);
            ImageView imageView = (ImageView) view.findViewById(R.id.bf9);
            this.f148127c = imageView;
            imageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3629q.p3630a.p3631a.C65737c.C65739b.View$OnClickListenerC657401 */

                /* renamed from: a */
                final /* synthetic */ C65739b f148129a;

                static {
                    Covode.recordClassIndex(77239);
                }

                {
                    this.f148129a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C89399f fVar = this.f148129a.f148128d.f203059e;
                    C89219l.m154716b(fVar, "");
                    Object obj = fVar.f203060b.get(this.f148129a.getAdapterPosition());
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj;
                    AbstractC65738a aVar = this.f148129a.f148128d.f148125d;
                    if (aVar != null) {
                        aVar.mo59528a(str);
                    }
                }
            });
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89396c
    /* renamed from: a */
    public final /* synthetic */ void mo10140a(RecyclerView.ViewHolder viewHolder, Object obj) {
        C65739b bVar = (C65739b) viewHolder;
        String str = (String) obj;
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        TextView textView = bVar.f148126b;
        C89219l.m154716b(textView, "");
        textView.setText(str);
    }
}
