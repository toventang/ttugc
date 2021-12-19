package com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.ui_component.AbstractC23520b;
import com.bytedance.ui_component.UiState;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77128g;
import com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77129h;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.clip.a.f */
public abstract class AbstractC77125f<T extends JediViewModel<? extends UiState> & AbstractC1204m & AbstractC2547b, Clip extends AbstractC77128g<?>, ClipCluster extends AbstractC77129h<Clip>> extends AbstractC23520b<T> implements AbstractC77117a<ClipCluster, Clip> {

    /* renamed from: a */
    private final AbstractC89244h f172972a = C89250i.m154773a((AbstractC89171a) new C77126a(this));

    static {
        Covode.recordClassIndex(90128);
    }

    /* renamed from: a */
    public void mo120490a(Clip clip) {
        C89219l.m154721d(clip, "");
    }

    /* renamed from: b */
    public void mo120633b(Clip clip) {
        C89219l.m154721d(clip, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.clip.a.f$a */
    static final class C77126a extends AbstractC89220m implements AbstractC89171a<AbstractC2565m<C89378p<? extends Clip, ? extends Boolean>>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC77125f f172973a;

        static {
            Covode.recordClassIndex(90129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77126a(AbstractC77125f fVar) {
            super(0);
            this.f172973a = fVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return new AbstractC2565m(this) {
                /* class com.p2082ss.android.ugc.aweme.story.edit.clip.p4042a.AbstractC77125f.C77126a.C771271 */

                /* renamed from: a */
                final /* synthetic */ C77126a f172974a;

                static {
                    Covode.recordClassIndex(90130);
                }

                {
                    this.f172974a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.story.edit.clip.a.f */
                /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.ss.android.ugc.aweme.story.edit.clip.a.f */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
                public final /* synthetic */ void onChanged(Object obj) {
                    C89378p pVar = (C89378p) obj;
                    if (((Boolean) pVar.getSecond()).booleanValue()) {
                        this.f172974a.f172973a.mo120490a((AbstractC77128g) pVar.getFirst());
                    } else {
                        this.f172974a.f172973a.mo120633b((AbstractC77128g) pVar.getFirst());
                    }
                }
            };
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public void onCreate() {
        super.onCreate();
        cF_().mo120642c().observe(this, (AbstractC2565m) this.f172972a.getValue());
    }
}
