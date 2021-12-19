package com.p2082ss.android.ugc.aweme.share;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.share.p3744b.C68877a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.C69684e;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.MicroShareChannelBar;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.p3783a.C69659a;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.m */
public class C69295m extends AbstractC68904d {

    /* renamed from: n */
    public RecyclerView f154857n;

    /* renamed from: o */
    public final Activity f154858o;

    /* renamed from: p */
    private final AbstractC89244h f154859p;

    /* renamed from: q */
    private final Aweme f154860q;

    static {
        Covode.recordClassIndex(81625);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final DialogC81438i mo109597h() {
        return (DialogC81438i) this.f154859p.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.share.m$a */
    static final class C69296a extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ C69295m f154861a;

        static {
            Covode.recordClassIndex(81626);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69296a(C69295m mVar) {
            super(0);
            this.f154861a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            return new DialogC81438i(this.f154861a.f154858o);
        }
    }

    /* renamed from: i */
    public final void mo109598i() {
        try {
            mo109597h().dismiss();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.m$c */
    public static final class C69298c implements AbstractC69681f {

        /* renamed from: a */
        final /* synthetic */ C69295m f154863a;

        static {
            Covode.recordClassIndex(81628);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C69298c(C69295m mVar) {
            this.f154863a = mVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.share.m$c$a */
        static final class C69299a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69298c f154864a;

            /* renamed from: b */
            final /* synthetic */ AbstractC69581b f154865b;

            static {
                Covode.recordClassIndex(81629);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69299a(C69298c cVar, AbstractC69581b bVar) {
                super(1);
                this.f154864a = cVar;
                this.f154865b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                AbstractC69690f fVar = this.f154864a.f154863a.f154129j.f155560l;
                if (fVar != null) {
                    fVar.mo60844a(this.f154865b, booleanValue, this.f154864a.f154863a.f154129j.f155557i, this.f154864a.f154863a.f154858o);
                }
                if (C69659a.m123052a()) {
                    this.f154864a.f154863a.mo109598i();
                }
                if (!this.f154865b.mo109555c()) {
                    this.f154864a.f154863a.dismiss();
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.share.m$c$b */
        static final class C69300b extends AbstractC89220m implements AbstractC89172b<AbstractC69645h, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C69298c f154866a;

            /* renamed from: b */
            final /* synthetic */ AbstractC69581b f154867b;

            static {
                Covode.recordClassIndex(81630);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C69300b(C69298c cVar, AbstractC69581b bVar) {
                super(1);
                this.f154866a = cVar;
                this.f154867b = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC69645h hVar) {
                AbstractC69645h hVar2 = hVar;
                C89219l.m154721d(hVar2, "");
                boolean a = this.f154867b.mo61913a(hVar2, this.f154866a.f154863a.f154858o);
                AbstractC69690f fVar = this.f154866a.f154863a.f154129j.f155560l;
                if (fVar != null) {
                    fVar.mo60844a(this.f154867b, a, this.f154866a.f154863a.f154129j.f155557i, this.f154866a.f154863a.f154858o);
                }
                if (C69659a.m123052a()) {
                    this.f154866a.f154863a.mo109598i();
                }
                if (!this.f154867b.mo109555c()) {
                    this.f154866a.f154863a.dismiss();
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.bar.AbstractC69681f
        /* renamed from: a_ */
        public final void mo87413a_(AbstractC69581b bVar) {
            C89219l.m154721d(bVar, "");
            if (C69659a.m123052a()) {
                try {
                    this.f154863a.mo109597h().show();
                } catch (NullPointerException e) {
                    e.printStackTrace();
                }
            }
            this.f154863a.f154129j.f155557i.f155492i.putString("enter_from", "publish_share_panel");
            this.f154863a.f154129j.f155557i.f155492i.putString("enter_method", "publish_then_share");
            if (!this.f154863a.f154129j.f155557i.mo109573a(bVar, this.f154863a.f154858o, new C69299a(this, bVar))) {
                this.f154863a.f154129j.f155557i.mo109572a(bVar, new C69300b(this, bVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.m$b */
    static final class C69297b extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C69295m f154862a;

        static {
            Covode.recordClassIndex(81627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C69297b(C69295m mVar) {
            super(1);
            this.f154862a = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
            AbstractC69581b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            return Boolean.valueOf(!bVar2.mo109557b(this.f154862a.f154858o));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69295m(Activity activity, C69684e eVar, Aweme aweme) {
        super(activity, eVar);
        C89219l.m154721d(activity, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aweme, "");
        this.f154858o = activity;
        this.f154860q = aweme;
        if (this.f154129j.f155552d) {
            C89070n.m154537a((List) this.f154129j.f155549a, (AbstractC89172b) new C69297b(this));
        }
        RecyclerView recyclerView = (RecyclerView) this.f154120a.findViewById(R.id.bpk);
        this.f154857n = recyclerView;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        MicroShareChannelBar microShareChannelBar = this.f154131l;
        List<AbstractC69581b> list = this.f154129j.f155549a;
        C89219l.m154721d(list, "");
        microShareChannelBar.f155508a = list;
        microShareChannelBar.f155510c.mo109821a(list);
        MicroShareChannelBar microShareChannelBar2 = this.f154131l;
        C69298c cVar = new C69298c(this);
        C89219l.m154721d(cVar, "");
        microShareChannelBar2.f155509b = cVar;
        C68877a.C68878a.m121551a("ug_publish_popup_share_show", aweme, null);
        this.f154859p = C89250i.m154773a((AbstractC89171a) new C69296a(this));
    }
}
