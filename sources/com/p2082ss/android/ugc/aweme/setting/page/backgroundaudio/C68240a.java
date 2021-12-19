package com.p2082ss.android.ugc.aweme.setting.page.backgroundaudio;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.experiment.C49510c;
import com.p2082ss.android.ugc.aweme.p2386be.C34800h;
import com.p2082ss.android.ugc.aweme.p2727db.C40945h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.a */
public final class C68240a extends C40945h {

    /* renamed from: a */
    public final Fragment f152774a;

    /* renamed from: b */
    private final AbstractC89244h f152775b = C89250i.m154773a((AbstractC89171a) new C68244c(this));

    static {
        Covode.recordClassIndex(80444);
    }

    /* renamed from: c */
    public final BGAudioViewModel mo108746c() {
        return (BGAudioViewModel) this.f152775b.getValue();
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h, com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: b */
    public final /* synthetic */ C34800h mo70128b() {
        return mo70128b();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.a$c */
    static final class C68244c extends AbstractC89220m implements AbstractC89171a<BGAudioViewModel> {

        /* renamed from: a */
        final /* synthetic */ C68240a f152779a;

        static {
            Covode.recordClassIndex(80448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68244c(C68240a aVar) {
            super(0);
            this.f152779a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BGAudioViewModel invoke() {
            AbstractC1174ac a = C1181ae.m3879a(this.f152779a.f152774a, (C1175ad.AbstractC1177b) null).mo3983a(BGAudioViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.be.a' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.p2727db.AbstractC40931a
    /* renamed from: d */
    public final /* synthetic */ C34800h mo70131d() {
        mo108746c().f152767a.observe(this.f152774a.getViewLifecycleOwner(), new C68241a(this));
        return (C34800h) super.mo70131d();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2727db.C40945h
    /* renamed from: a */
    public final C34800h mo70133a() {
        Boolean value = mo108746c().f152767a.getValue();
        if (value == null) {
            value = false;
        }
        C89219l.m154716b(value, "");
        boolean booleanValue = value.booleanValue();
        String string = this.f152774a.getString(R.string.vn);
        C89219l.m154716b(string, "");
        return new C34800h(booleanValue, string, new View$OnClickListenerC68243b(this), false, null, null, null, null, null, false, 16376);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.a$a */
    static final class C68241a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C68240a f152776a;

        static {
            Covode.recordClassIndex(80445);
        }

        C68241a(C68240a aVar) {
            this.f152776a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            final boolean booleanValue = ((Boolean) obj).booleanValue();
            this.f152776a.mo70126a(new AbstractC89172b<C34800h, C34800h>() {
                /* class com.p2082ss.android.ugc.aweme.setting.page.backgroundaudio.C68240a.C68241a.C682421 */

                static {
                    Covode.recordClassIndex(80446);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C34800h invoke(C34800h hVar) {
                    C34800h hVar2 = hVar;
                    C89219l.m154721d(hVar2, "");
                    return C34800h.m71083a(hVar2, booleanValue, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            });
        }
    }

    public C68240a(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f152774a = fragment;
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.backgroundaudio.a$b */
    static final class View$OnClickListenerC68243b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68240a f152778a;

        static {
            Covode.recordClassIndex(80447);
        }

        View$OnClickListenerC68243b(C68240a aVar) {
            this.f152778a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            BGAudioViewModel c = this.f152778a.mo108746c();
            boolean z = !((C34800h) this.f152778a.mo70132l()).f82200c;
            C49510c.m92747a().storeBoolean("IsBackgroundAudioEnabled", z);
            c.f152767a.setValue(Boolean.valueOf(z));
        }
    }
}
