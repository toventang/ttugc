package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67504aw;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ag */
public final class C41611ag extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: d */
    public static final C41613a f97045d = new C41613a((byte) 0);

    /* renamed from: a */
    final TextView f97046a;

    /* renamed from: b */
    public C41720f f97047b;

    /* renamed from: c */
    String f97048c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ag$b */
    public interface AbstractC41614b {
        static {
            Covode.recordClassIndex(49527);
        }

        /* renamed from: a */
        void mo70826a(C41720f fVar);
    }

    static {
        Covode.recordClassIndex(49524);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ag$a */
    public static final class C41613a {
        static {
            Covode.recordClassIndex(49526);
        }

        private C41613a() {
        }

        public /* synthetic */ C41613a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static String m83562a(C41720f fVar) {
        String a = C48027ac.C48028a.f111257a.mo80055a(fVar.getClusterList().get(0).getRequestId());
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: a */
    private static String m83563a(List<Music> list) {
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getMid()).append(",");
        }
        return C89361p.m154894a((CharSequence) sb, (CharSequence) ",").toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41611ag(View view, final AbstractC41614b bVar) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(bVar, "");
        View findViewById = view.findViewById(R.id.ezb);
        C89219l.m154716b(findViewById, "");
        this.f97046a = (TextView) findViewById;
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41611ag.View$OnClickListenerC416121 */

            /* renamed from: a */
            final /* synthetic */ C41611ag f97049a;

            static {
                Covode.recordClassIndex(49525);
            }

            {
                this.f97049a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (!C58001a.m104815a(view, 1200) && this.f97049a.f97047b != null) {
                    C41611ag agVar = this.f97049a;
                    C41720f fVar = agVar.f97047b;
                    if (fVar == null) {
                        C89219l.m154715b();
                    }
                    agVar.mo70831a("matched_sounds_click", fVar);
                    AbstractC41614b bVar = bVar;
                    C41720f fVar2 = this.f97049a.f97047b;
                    if (fVar2 == null) {
                        C89219l.m154715b();
                    }
                    bVar.mo70826a(fVar2);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo70831a(String str, C41720f fVar) {
        ((C67540c) ((C67540c) new C67504aw(str).mo106459o("search_result")).mo106482b(this.f97048c).mo106452c("music_list", m83563a(fVar.getClusterList()))).mo106483c(m83562a(fVar)).mo96792f();
    }
}
