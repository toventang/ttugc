package com.bytedance.android.livesdk.feed.drawerfeed;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.live.core.p215e.C3884b;
import com.bytedance.android.live.core.p223g.AbstractC3968a;
import com.bytedance.android.live.core.paging.p224a.AbstractC3971b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.p523a.AbstractC8472a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p643ui.AbstractC10937b;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4560f.p4561a.p4565b.C88411a;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a */
public final class C8529a extends AbstractC8472a {

    /* renamed from: z */
    private final C8555l f21084z;

    static {
        Covode.recordClassIndex(9384);
    }

    /* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a$a */
    public class C8530a extends AbstractC10937b {
        static {
            Covode.recordClassIndex(9385);
        }

        @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
        /* renamed from: e */
        public final void mo14840e() {
            super.mo14840e();
        }

        /* renamed from: d */
        public static void m16734d() {
            C6501b.C6502a.m13948a("livesdk_explore_no_more_show").mo12645a("has_banner", C2695a.f8059g.mo7220c()).mo12639a().mo12655b();
        }

        public C8530a(View view) {
            super(view);
        }

        @Override // com.bytedance.android.livesdk.p643ui.AbstractC10937b
        /* renamed from: a */
        public final void mo9329a(Object obj, int i) {
            m16734d();
            if (C8529a.this.f20952s != null) {
                mo17797a(C8529a.this.f20952s.mo143289d(new C8544b(this)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a$b */
    public class C8531b extends AbstractC3971b.AbstractC3973a {

        /* renamed from: a */
        PagingViewModel f21086a;

        /* renamed from: c */
        private View f21088c;

        /* renamed from: d */
        private TextView f21089d;

        /* renamed from: e */
        private TextView f21090e;

        /* renamed from: f */
        private final C88411a f21091f = new C88411a();

        static {
            Covode.recordClassIndex(9386);
        }

        @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b.AbstractC3973a
        /* renamed from: a */
        public final void mo9344a() {
            this.f21091f.mo142944a();
        }

        /* renamed from: b */
        static void m16737b() {
            C6501b.C6502a.m13948a("livesdk_explore_page_show").mo12651a("show_type", "network_error").mo12639a().mo12655b();
        }

        @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b.AbstractC3973a
        /* renamed from: a */
        public final void mo9345a(boolean z) {
            TextView textView = this.f21089d;
            textView.setTextColor(textView.getResources().getColor(R.color.wd));
            this.f21089d.setText(R.string.dy3);
            this.f21090e.setText(R.string.dy4);
            TextView textView2 = this.f21090e;
            textView2.setTextColor(textView2.getResources().getColor(R.color.x3));
            if (!z) {
                int k = this.f21086a.f10978h.mo9328k();
                for (int i = 0; i < k; i++) {
                    this.f21086a.f10978h.mo9327j();
                }
            }
            this.f21090e.setOnClickListener(new View$OnClickListenerC8545c(this));
            if (C8529a.this.f20952s != null) {
                this.f21091f.mo142945a(C8529a.this.f20952s.mo143289d(new C8546d(this)));
            }
            m16737b();
        }

        C8531b(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f21086a = pagingViewModel;
            this.f21088c = view.findViewById(R.id.awo);
            this.f21089d = (TextView) view.findViewById(R.id.awu);
            this.f21090e = (TextView) view.findViewById(R.id.awq);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a$c */
    static class C8532c extends AbstractC3971b.C3978f {

        /* renamed from: a */
        public View f21092a;

        /* renamed from: b */
        private ViewGroup f21093b;

        /* renamed from: c */
        private PagingViewModel f21094c;

        static {
            Covode.recordClassIndex(9387);
        }

        @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b.C3978f
        /* renamed from: a */
        public final void mo9351a() {
            this.f21094c.f10972b.observeForever(new AbstractC1214u<C3884b>() {
                /* class com.bytedance.android.livesdk.feed.drawerfeed.C8529a.C8532c.C85331 */

                static {
                    Covode.recordClassIndex(9388);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.AbstractC1214u
                public final /* synthetic */ void onChanged(C3884b bVar) {
                    C3884b bVar2 = bVar;
                    if (bVar2 == null) {
                        return;
                    }
                    if (bVar2.mo9243a()) {
                        C8532c.this.f21092a.setVisibility(0);
                    } else {
                        C8532c.this.f21092a.setVisibility(8);
                    }
                }
            });
        }

        C8532c(View view, PagingViewModel pagingViewModel) {
            super(view);
            MethodCollector.m26663i(1711);
            this.f21094c = pagingViewModel;
            this.f21093b = (ViewGroup) view.findViewById(R.id.cfj);
            LiveLoadingView liveLoadingView = new LiveLoadingView(view.getContext());
            this.f21092a = liveLoadingView;
            this.f21093b.addView(liveLoadingView);
            MethodCollector.m26664o(1711);
        }
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo9339b(ViewGroup viewGroup) {
        return new C8530a(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b53, viewGroup, false));
    }

    @Override // com.bytedance.android.livesdk.feed.p523a.AbstractC8472a
    /* renamed from: c */
    public final int mo14807c(int i) {
        if (i != 1) {
            if (i == 3) {
                return R.layout.b9t;
            }
            if (i == 6) {
                return R.layout.bdr;
            }
            if (i == 1004) {
                return R.layout.b9w;
            }
            if (i == 1001) {
                return R.layout.bdr;
            }
            if (i != 1002) {
                return super.mo14807c(i);
            }
            return R.layout.bdw;
        } else if (C8555l.m16761f()) {
            return R.layout.b9p;
        } else {
            return R.layout.b9u;
        }
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: c */
    public final void mo9343c(RecyclerView.ViewHolder viewHolder, int i) {
        super.mo9343c(viewHolder, i);
        if (viewHolder instanceof C8530a) {
            ((AbstractC10937b) viewHolder).mo9329a(null, i);
        }
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo9332a(ViewGroup viewGroup, int i) {
        if (i == -1091576148) {
            return new C8532c(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b7r, viewGroup, false), ((AbstractC3971b) this).f10882a);
        }
        if (i == -1091576149) {
            return new C8531b(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.b4x, viewGroup, false), ((AbstractC3971b) this).f10882a);
        }
        return super.mo9332a(viewGroup, i);
    }

    public C8529a(Map<Integer, AbstractC3968a> map, AbstractC8593h hVar, C8555l lVar) {
        super(map, hVar);
        this.f21084z = lVar;
    }
}
