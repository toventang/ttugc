package com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2558b;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.p2560d.C37820a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2552a.AbstractC37781a;
import com.p2082ss.android.ugc.aweme.commercialize.egg.p2555d.C37787a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.a */
public abstract class AbstractC37801a {

    /* renamed from: a */
    public final Context f89265a;

    /* renamed from: b */
    public C37787a f89266b;

    /* renamed from: c */
    public AbstractC37781a f89267c;

    /* renamed from: d */
    final AbstractC89244h f89268d = C89250i.m154773a((AbstractC89171a) new C37802a(this));

    /* renamed from: e */
    public final FrameLayout f89269e;

    /* renamed from: f */
    private final AbstractC89244h f89270f = C89250i.m154773a((AbstractC89171a) new C37803b(this));

    static {
        Covode.recordClassIndex(45248);
    }

    /* renamed from: a */
    public final boolean mo65816a() {
        return ((Boolean) this.f89270f.getValue()).booleanValue();
    }

    /* renamed from: b */
    public abstract void mo65817b();

    /* renamed from: c */
    public abstract void mo65818c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo65819d() {
        mo65815a(true, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.a$a */
    static final class C37802a extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ AbstractC37801a f89271a;

        static {
            Covode.recordClassIndex(45249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37802a(AbstractC37801a aVar) {
            super(0);
            this.f89271a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            C37787a aVar = this.f89271a.f89266b;
            if (aVar != null) {
                i = aVar.f89218h;
            } else {
                i = 1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.a$b */
    static final class C37803b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ AbstractC37801a f89272a;

        static {
            Covode.recordClassIndex(45250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37803b(AbstractC37801a aVar) {
            super(0);
            this.f89272a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            C37787a aVar = this.f89272a.f89266b;
            if (aVar != null) {
                z = aVar.f89219i;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65814a(String str) {
        mo65815a(false, str);
    }

    public AbstractC37801a(FrameLayout frameLayout) {
        C89219l.m154721d(frameLayout, "");
        this.f89269e = frameLayout;
        Context context = frameLayout.getContext();
        C89219l.m154716b(context, "");
        this.f89265a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo65815a(boolean z, String str) {
        C37820a.m76474a(this.f89266b, z, str);
    }
}
