package com.p2082ss.android.ugc.aweme.setting.page.backgroundaudio;

import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.table.cell.EnumC23292b;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.aweme.p2386be.C34799g;
import com.p2082ss.android.ugc.aweme.p2727db.C40944g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.c */
public final class C68246c extends C40944g {

    /* renamed from: a */
    public final Fragment f152784a;

    /* renamed from: b */
    public final EnumC68245b f152785b;

    /* renamed from: c */
    private final AbstractC89244h f152786c = C89250i.m154773a((AbstractC89171a) new C68251d(this));

    static {
        Covode.recordClassIndex(80450);
    }

    /* renamed from: a */
    public final BGAudioViewModel mo70133a() {
        return (BGAudioViewModel) this.f152786c.getValue();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40944g, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34799g mo70128b() {
        return mo70128b();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.c$d */
    static final class C68251d extends AbstractC89220m implements AbstractC89171a<BGAudioViewModel> {

        /* renamed from: a */
        final /* synthetic */ C68246c f152792a;

        static {
            Covode.recordClassIndex(80455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68251d(C68246c cVar) {
            super(0);
            this.f152792a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BGAudioViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f152792a.f152784a, (C1175ad.AbstractC1177b) null).mo3983a(BGAudioViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: d */
    public final /* synthetic */ C34799g mo70131d() {
        mo70133a().f152768b.observe(this.f152784a.getViewLifecycleOwner(), new C68247a(this));
        return (C34799g) super.mo70131d();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40944g
    /* renamed from: c */
    public final C34799g mo70137c() {
        boolean z;
        String string = this.f152784a.getString(this.f152785b.getTitle());
        C89219l.m154716b(string, "");
        if (mo70133a().f152768b.getValue() == this.f152785b.getPlayOrder()) {
            z = true;
        } else {
            z = false;
        }
        return new C34799g(z, string, C23005c.m43393a(new C68249b(this)), new View$OnClickListenerC68250c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.c$a */
    static final class C68247a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C68246c f152787a;

        static {
            Covode.recordClassIndex(80451);
        }

        C68247a(C68246c cVar) {
            this.f152787a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            final C49510c.EnumC49511a aVar = (C49510c.EnumC49511a) obj;
            this.f152787a.mo70126a(new AbstractC89172b<C34799g, C34799g>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.page.backgroundaudio.C68246c.C68247a.C682481 */

                /* renamed from: a */
                final /* synthetic */ C68247a f152788a;

                static {
                    Covode.recordClassIndex(80452);
                }

                {
                    this.f152788a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C34799g invoke(C34799g gVar) {
                    boolean z;
                    C34799g gVar2 = gVar;
                    C89219l.m154721d(gVar2, "");
                    if (aVar == this.f152788a.f152787a.f152785b.getPlayOrder()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener = gVar2.f82190d;
                    String str = gVar2.f82191e;
                    EnumC23292b bVar = gVar2.f82192f;
                    C22999a aVar = gVar2.f82193g;
                    boolean z2 = gVar2.f82194h;
                    boolean z3 = gVar2.f82195i;
                    String str2 = gVar2.f82196j;
                    boolean z4 = gVar2.f82197k;
                    boolean z5 = gVar2.f82198l;
                    View.OnClickListener onClickListener = gVar2.f82199m;
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(bVar, "");
                    return new C34799g(z, onCheckedChangeListener, str, bVar, aVar, z2, z3, str2, z4, z5, onClickListener);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.c$b */
    static final class C68249b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C68246c f152790a;

        static {
            Covode.recordClassIndex(80453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68249b(C68246c cVar) {
            super(1);
            this.f152790a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = this.f152790a.f152785b.getIcon();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.c$c */
    static final class View$OnClickListenerC68250c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68246c f152791a;

        static {
            Covode.recordClassIndex(80454);
        }

        View$OnClickListenerC68250c(C68246c cVar) {
            this.f152791a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!((C34799g) this.f152791a.mo70132l()).f82189c) {
                BGAudioViewModel a = this.f152791a.mo70133a();
                C49510c.EnumC49511a playOrder = this.f152791a.f152785b.getPlayOrder();
                C89219l.m154721d(playOrder, "");
                C89219l.m154721d(playOrder, "");
                C49510c.m92747a().storeInt("BackgroundAudioPlayOrder", playOrder.ordinal());
                a.f152768b.setValue(playOrder);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68246c(Fragment fragment, EnumC68245b bVar) {
        super((byte) 0);
        C89219l.m154721d(fragment, "");
        C89219l.m154721d(bVar, "");
        this.f152784a = fragment;
        this.f152785b = bVar;
    }
}
