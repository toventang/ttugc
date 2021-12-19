package com.p2082ss.android.ugc.aweme.sticker.view.internal.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.C76211b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76337f;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76368m;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.l */
public final class C76364l extends AbstractC76255a<C76211b> {

    /* renamed from: q */
    public static final C76365a f171545q = new C76365a((byte) 0);

    /* renamed from: l */
    SearchStickerViewContainer f171546l;

    /* renamed from: m */
    AbstractC76329a f171547m;

    /* renamed from: n */
    LiveData<C89391z> f171548n;

    /* renamed from: o */
    public AbstractC89171a<C89391z> f171549o;

    /* renamed from: p */
    public boolean f171550p;

    /* renamed from: r */
    private AbstractC88412b f171551r;

    static {
        Covode.recordClassIndex(89319);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: k */
    public final void mo119983k() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.l$a */
    public static final class C76365a {
        static {
            Covode.recordClassIndex(89320);
        }

        private C76365a() {
        }

        public /* synthetic */ C76365a(byte b) {
            this();
        }
    }

    /* renamed from: o */
    private final boolean m133847o() {
        if (this.f171546l == null || this.f171547m == null || this.f171548n == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        AbstractC88412b bVar = this.f171551r;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: n */
    public final SearchStickerViewContainer mo120081n() {
        SearchStickerViewContainer searchStickerViewContainer = this.f171546l;
        if (searchStickerViewContainer != null) {
            return searchStickerViewContainer;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (!m133847o()) {
            mo120081n().mo120019n();
            AbstractC88979t<C89378p<Integer, Integer>> tVar = mo119980g().f171023g;
            if (tVar != null) {
                this.f171551r = tVar.mo143289d(new C76366b(this));
            }
            LiveData<C89391z> liveData = this.f171548n;
            if (liveData != null) {
                liveData.observe(this, new C76367c(this));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.l$c */
    static final class C76367c<T> implements AbstractC1214u<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C76364l f171553a;

        static {
            Covode.recordClassIndex(89322);
        }

        C76367c(C76364l lVar) {
            this.f171553a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C89391z zVar) {
            this.f171553a.f171550p = true;
            this.f171553a.mo119977d().mo119279a(this.f171553a.f171305e);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    /* renamed from: a */
    public final LinearLayoutManager mo119970a(View view) {
        C89219l.m154721d(view, "");
        LinearLayoutManager linearLayoutManager = mo120081n().f171414s;
        if (linearLayoutManager == null) {
            return new LinearLayoutManager();
        }
        return linearLayoutManager;
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.search.l$b */
    static final class C76366b<T> implements AbstractC88433f<C89378p<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ C76364l f171552a;

        static {
            Covode.recordClassIndex(89321);
        }

        C76366b(C76364l lVar) {
            this.f171552a = lVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(C89378p<? extends Integer, ? extends Integer> pVar) {
            String str;
            C89378p<? extends Integer, ? extends Integer> pVar2 = pVar;
            if (((Number) pVar2.getSecond()).intValue() == this.f171552a.f171305e) {
                AbstractC76329a aVar = this.f171552a.f171547m;
                if (aVar == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (C89219l.m154714a(aVar.mo120035c(), AbstractC76368m.C76369a.f171554a)) {
                    SearchStickerViewContainer n = this.f171552a.mo120081n();
                    if (this.f171552a.f171550p) {
                        str = "click_icon";
                    } else {
                        str = "slide";
                    }
                    n.mo120001a(new AbstractC76337f.C76339b(str));
                    AbstractC89171a<C89391z> aVar2 = this.f171552a.f171549o;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    this.f171552a.f171550p = false;
                }
            }
            if (((Number) pVar2.getSecond()).intValue() == this.f171552a.f171305e) {
                this.f171552a.mo120081n();
            }
            if (((Number) pVar2.getFirst()).intValue() == this.f171552a.f171305e) {
                this.f171552a.mo120081n();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(6904);
        C89219l.m154721d(layoutInflater, "");
        if (m133847o()) {
            MethodCollector.m26664o(6904);
            return null;
        }
        if (mo120081n().f171417v.getParent() != null) {
            ViewParent parent = mo120081n().f171417v.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(mo120081n().f171417v);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.m26664o(6904);
                throw nullPointerException;
            }
        }
        View view = mo120081n().f171417v;
        MethodCollector.m26664o(6904);
        return view;
    }
}
