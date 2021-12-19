package com.p2082ss.android.ugc.aweme.duet.p2816ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.duet.p2814a.C43256c;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.NoSuchElementException;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.duet.ui.f */
public final class C43286f implements AbstractC43284e {

    /* renamed from: b */
    public final Context f101047b;

    /* renamed from: c */
    public final AbstractC89171a<String> f101048c;

    /* renamed from: d */
    private RemoteImageView f101049d;

    /* renamed from: e */
    private TextView f101050e;

    /* renamed from: f */
    private TextView f101051f;

    /* renamed from: g */
    private ViewGroup f101052g;

    /* renamed from: h */
    private TextView f101053h;

    /* renamed from: i */
    private View f101054i;

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.f$a */
    public enum EnumC43287a {
        UNKNOWN_REMIND_TYPE(-1),
        REMIND_SELF_SEE(R.string.bdc),
        REMIND_FRIEND_SEE(R.string.bdb),
        REMIND_ANYONE_SEE(R.string.bda),
        REMIND_DUET_NOT_ALLOWED(R.string.bdm),
        REMIND_SOUND_NOT_READY(R.string.a9a);
        
        public static final C43288a Companion = new C43288a((byte) 0);

        /* renamed from: b */
        private final int f101056b;

        /* renamed from: com.ss.android.ugc.aweme.duet.ui.f$a$a */
        public static final class C43288a {
            static {
                Covode.recordClassIndex(51493);
            }

            private C43288a() {
            }

            public /* synthetic */ C43288a(byte b) {
                this();
            }

            /* renamed from: a */
            public static EnumC43287a m86397a(Integer num) {
                if (num == null) {
                    return null;
                }
                num.intValue();
                EnumC43287a[] values = EnumC43287a.values();
                for (EnumC43287a aVar : values) {
                    if (aVar.ordinal() == num.intValue()) {
                        return aVar;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }

        public final int getTextId() {
            return this.f101056b;
        }

        static {
            Covode.recordClassIndex(51492);
        }

        private EnumC43287a(int i) {
            this.f101056b = i;
        }
    }

    static {
        Covode.recordClassIndex(51491);
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.f$c */
    public static final class C43290c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ C43286f f101058a;

        static {
            Covode.recordClassIndex(51495);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43290c(C43286f fVar) {
            super(500);
            this.f101058a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            new DialogC43291g(this.f101058a.f101047b).show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.f$b */
    static final class View$OnClickListenerC43289b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43286f f101057a;

        static {
            Covode.recordClassIndex(51494);
        }

        View$OnClickListenerC43289b(C43286f fVar) {
            this.f101057a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f101057a.f101047b, "//aweme/detail").withParam("id", this.f101057a.f101048c.invoke()).withParam("isChain", false).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.duet.p2816ui.AbstractC43284e
    /* renamed from: a */
    public final void mo73795a(View view) {
        C89219l.m154721d(view, "");
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.be4);
        if (viewGroup != null) {
            View a = C1764a.m5927a(LayoutInflater.from(this.f101047b), R.layout.b36, viewGroup, true);
            this.f101049d = (RemoteImageView) a.findViewById(R.id.apg);
            this.f101050e = (TextView) a.findViewById(R.id.aq6);
            this.f101051f = (TextView) a.findViewById(R.id.aq7);
            this.f101052g = (ViewGroup) a.findViewById(R.id.cd3);
            this.f101053h = (TextView) a.findViewById(R.id.evg);
            this.f101054i = a.findViewById(R.id.apb);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.duet.p2816ui.AbstractC43284e
    /* renamed from: a */
    public final void mo73796a(C43256c cVar) {
        C89219l.m154721d(cVar, "");
        C34577e.m70592a(this.f101049d, cVar.f100987c);
        TextView textView = this.f101050e;
        if (textView != null) {
            textView.setText(cVar.f100985a);
        }
        TextView textView2 = this.f101051f;
        if (textView2 != null) {
            textView2.setText(cVar.f100986b + " ");
        }
        EnumC43287a a = EnumC43287a.C43288a.m86397a(cVar.f100989e);
        if (a != null) {
            int i = 8;
            if (a == EnumC43287a.UNKNOWN_REMIND_TYPE) {
                ViewGroup viewGroup = this.f101052g;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                }
            } else {
                ViewGroup viewGroup2 = this.f101052g;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                TextView textView3 = this.f101053h;
                if (textView3 != null) {
                    textView3.setText(this.f101047b.getString(a.getTextId()));
                }
                View view = this.f101054i;
                if (view != null) {
                    if (a == EnumC43287a.REMIND_SELF_SEE || a == EnumC43287a.REMIND_FRIEND_SEE || a == EnumC43287a.REMIND_ANYONE_SEE) {
                        i = 0;
                    }
                    view.setVisibility(i);
                }
            }
        }
        RemoteImageView remoteImageView = this.f101049d;
        if (remoteImageView != null) {
            remoteImageView.setOnClickListener(new View$OnClickListenerC43289b(this));
        }
        View view2 = this.f101054i;
        if (view2 != null) {
            view2.setOnClickListener(new C43290c(this));
        }
    }

    public C43286f(Context context, AbstractC89171a<String> aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f101047b = context;
        this.f101048c = aVar;
    }
}
