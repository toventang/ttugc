package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.story.base.AbstractC76618d;
import com.p2082ss.android.ugc.aweme.story.base.distribution.dispatcher.AbstractC76621c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4567d.AbstractC88438k;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bc */
public final class C64013bc implements AbstractC76618d {

    /* renamed from: a */
    public AbstractC64018bd f145172a;

    /* renamed from: b */
    public final AbstractC1204m f145173b;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bc$d */
    public static final class C64017d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64017d f145178a = new C64017d();

        static {
            Covode.recordClassIndex(75461);
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75457);
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f145173b.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bc$b */
    public static final class C64015b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89290k[] f145176a;

        static {
            Covode.recordClassIndex(75459);
        }

        public C64015b(AbstractC89290k[] kVarArr) {
            this.f145176a = kVarArr;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            return AbstractC76621c.C76622a.m134212a(aVar.f171957a, aVar.f171958b, aVar.f171959c, this.f145176a);
        }
    }

    public C64013bc(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f145173b = mVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bc$c */
    public static final class C64016c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C64013bc f145177a;

        static {
            Covode.recordClassIndex(75460);
        }

        public C64016c(C64013bc bcVar) {
            this.f145177a = bcVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Aweme clone = ((AbstractC76621c.C76622a) obj).f171959c.clone();
            C89219l.m154716b(clone, "");
            AbstractC64018bd bdVar = this.f145177a.f145172a;
            if (bdVar != null) {
                bdVar.mo103589a(clone);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.bc$a */
    public static final class C64014a<T> implements AbstractC88438k {

        /* renamed from: a */
        final /* synthetic */ Object f145174a;

        /* renamed from: b */
        final /* synthetic */ AbstractC76621c f145175b;

        static {
            Covode.recordClassIndex(75458);
        }

        public C64014a(Object obj, AbstractC76621c cVar) {
            this.f145174a = obj;
            this.f145175b = cVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88438k
        /* renamed from: a */
        public final /* synthetic */ boolean mo7718a(Object obj) {
            AbstractC76621c.C76622a aVar = (AbstractC76621c.C76622a) obj;
            C89219l.m154721d(aVar, "");
            if (!C89219l.m154714a(this.f145175b.mo120327a((Object) aVar.f171958b, (Object) aVar.f171959c), this.f145174a) || !(!aVar.f171957a.isEmpty())) {
                return false;
            }
            return true;
        }
    }
}
