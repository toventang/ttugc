package com.p2082ss.android.ugc.aweme.p3629q.p3630a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34884bl;
import com.p2082ss.android.ugc.aweme.p3629q.AbstractC65727a;
import p4600h.p4611f.p4613b.C89219l;
import p4628j.p4629a.p4630a.AbstractC89396c;
import p4628j.p4629a.p4630a.C89399f;

/* renamed from: com.ss.android.ugc.aweme.q.a.a */
public abstract class AbstractC65728a<T, VH extends RecyclerView.ViewHolder> extends AbstractC89396c<T, VH> {

    /* renamed from: c */
    public static final C65731b f148115c = new C65731b((byte) 0);

    /* renamed from: a */
    public AbstractC65727a<T> f148116a;

    /* renamed from: b */
    public final AbstractC34884bl f148117b;

    static {
        Covode.recordClassIndex(77227);
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.a$b */
    public static final class C65731b {
        static {
            Covode.recordClassIndex(77230);
        }

        private C65731b() {
        }

        public /* synthetic */ C65731b(byte b) {
            this();
        }
    }

    public AbstractC65728a(AbstractC34884bl blVar) {
        this.f148117b = blVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.a$a */
    public class C65729a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AbstractC65728a f148118a;

        static {
            Covode.recordClassIndex(77228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65729a(AbstractC65728a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f148118a = aVar;
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.p3629q.p3630a.AbstractC65728a.C65729a.View$OnClickListenerC657301 */

                /* renamed from: a */
                final /* synthetic */ C65729a f148119a;

                static {
                    Covode.recordClassIndex(77229);
                }

                {
                    this.f148119a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: com.ss.android.ugc.aweme.q.a<T> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    if (this.f148119a.getAdapterPosition() >= 0) {
                        C89399f fVar = this.f148119a.f148118a.f203059e;
                        C89219l.m154716b(fVar, "");
                        Object obj = fVar.f203060b.get(this.f148119a.getAdapterPosition());
                        AbstractC65727a<T> aVar = this.f148119a.f148118a.f148116a;
                        if (aVar != 0) {
                            C89219l.m154716b(view, "");
                            aVar.mo59527a(view, obj);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.q.a.a$c */
    public class C65732c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ AbstractC65728a f148120a;

        /* renamed from: b */
        private final String f148121b;

        static {
            Covode.recordClassIndex(77231);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65732c(AbstractC65728a aVar, View view, String str) {
            super(view);
            C89219l.m154721d(view, "");
            C89219l.m154721d(str, "");
            this.f148120a = aVar;
            this.f148121b = str;
        }
    }
}
